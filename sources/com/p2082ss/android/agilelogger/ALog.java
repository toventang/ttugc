package com.p2082ss.android.agilelogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.alog.C2685a;
import com.bytedance.android.alog.C2688c;
import com.bytedance.android.alog.C2689d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.agilelogger.C29699a;
import com.p2082ss.android.agilelogger.p2119c.C29720a;
import com.p2082ss.android.agilelogger.p2119c.C29721b;
import com.p2082ss.android.agilelogger.p2119c.C29724d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.agilelogger.ALog */
public class ALog {
    private static volatile Set<String> mBlockTagSet;
    private static Alog mainThreadRef = null;
    private static int prio = 3;
    private static Handler sAsyncHandler;
    private static HandlerThread sAsyncLogThread;
    public static C29699a sConfig;
    public static volatile boolean sDebug;
    public static volatile AbstractC29717b sILogCacheCallback;
    private static volatile List<AbstractC29719c> sINativeFuncAddrCallbackList = new ArrayList();
    private static Object sInitLock = new Object();
    private static volatile boolean sInitSuccess;
    private static boolean sInitialized = false;
    private static long sMainThreadId = -1;
    private static ScheduledExecutorService sOuterExecutorService = null;
    private static ArrayList<WeakReference<Alog>> sStandaloneInstances = new ArrayList<>();

    public static void forceLogSharding() {
    }

    private static int level2AlogCoreLevel(int i) {
        return i - 2;
    }

    public static void setPrintStackTrace(boolean z) {
    }

    public static void setsPackageClassName(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.agilelogger.ALog$a */
    public static class C29697a {

        /* renamed from: a */
        static final Object f70839a = new Object();

        /* renamed from: b */
        static C29697a f70840b;

        /* renamed from: c */
        static int f70841c = 0;

        /* renamed from: d */
        public int f70842d;

        /* renamed from: e */
        public String f70843e;

        /* renamed from: f */
        public String f70844f;

        /* renamed from: g */
        public Throwable f70845g;

        /* renamed from: h */
        public C29721b.EnumC29722a f70846h;

        /* renamed from: i */
        public Object f70847i;

        /* renamed from: j */
        public long f70848j;

        /* renamed from: k */
        public long f70849k;

        /* renamed from: l */
        public C29697a f70850l;

        private C29697a() {
        }

        static {
            Covode.recordClassIndex(36094);
        }

        /* renamed from: a */
        public static C29697a m59874a() {
            MethodCollector.m26663i(3196);
            synchronized (f70839a) {
                try {
                    C29697a aVar = f70840b;
                    if (aVar != null) {
                        f70840b = aVar.f70850l;
                        aVar.f70850l = null;
                        f70841c--;
                        return aVar;
                    }
                    C29697a aVar2 = new C29697a();
                    MethodCollector.m26664o(3196);
                    return aVar2;
                } finally {
                    MethodCollector.m26664o(3196);
                }
            }
        }
    }

    public static Set<String> getBlockTagSet() {
        return mBlockTagSet;
    }

    public static List<AbstractC29719c> getNativeFuncAddrCallbackList() {
        return sINativeFuncAddrCallbackList;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static long getALogWriteFuncAddr() {
        return C2688c.m7781c();
    }

    private static void initMainThreadIdIfNeeded() {
        if (sMainThreadId == -1) {
            sMainThreadId = (long) Process.myTid();
        }
    }

    public static void destroy() {
        C2688c.m7777a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo7194a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    public static void flush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2688c.m7780b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo7198b();
        }
    }

    public static void release() {
        C2688c.m7777a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo7194a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    static {
        Covode.recordClassIndex(36086);
    }

    public static void asyncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2688c.m7780b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo7198b();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.mo7198b();
            }
        }
    }

    public static long getALogSimpleWriteFuncAddr() {
        MethodCollector.m26663i(3823);
        if (C2688c.f8044a == null) {
            MethodCollector.m26664o(3823);
            return 0;
        } else if (C2688c.f8044a.f8006p != 0) {
            long nativeGetNativeWriteFuncAddr = Alog.nativeGetNativeWriteFuncAddr();
            MethodCollector.m26664o(3823);
            return nativeGetNativeWriteFuncAddr;
        } else {
            MethodCollector.m26664o(3823);
            return 0;
        }
    }

    public static long getAlogNativeFlushV2FuncAddr() {
        MethodCollector.m26663i(3668);
        if (C2688c.f8044a == null) {
            MethodCollector.m26664o(3668);
            return 0;
        } else if (C2688c.f8044a.f8006p != 0) {
            long nativeGetLegacyFlushFuncAddr = Alog.nativeGetLegacyFlushFuncAddr();
            MethodCollector.m26664o(3668);
            return nativeGetLegacyFlushFuncAddr;
        } else {
            MethodCollector.m26664o(3668);
            return 0;
        }
    }

    public static long getAlogNativeLogStoreDirFuncAddr() {
        MethodCollector.m26663i(3787);
        if (C2688c.f8044a == null) {
            MethodCollector.m26664o(3787);
            return 0;
        } else if (C2688c.f8044a.f8006p != 0) {
            long nativeGetLegacyGetLogFileDirFuncAddr = Alog.nativeGetLegacyGetLogFileDirFuncAddr();
            MethodCollector.m26664o(3787);
            return nativeGetLegacyGetLogFileDirFuncAddr;
        } else {
            MethodCollector.m26664o(3787);
            return 0;
        }
    }

    public static void syncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        if (C2688c.f8044a != null) {
            C2688c.f8044a.mo7200c();
        }
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo7200c();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.mo7200c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.agilelogger.ALog$7 */
    public static /* synthetic */ class C296967 {

        /* renamed from: a */
        static final /* synthetic */ int[] f70838a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.agilelogger.ALog.C296967.<clinit>():void");
        }
    }

    public static HashMap<String, String> getLastFetchErrorInfo() {
        if (C2688c.f8044a == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("start", Long.toString(C2685a.f8036b));
        hashMap.put("end", Long.toString(C2685a.f8037c));
        hashMap.put("reason", C2685a.f8039e);
        if (C2685a.f8038d != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = C2685a.f8038d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.endsWith(".alog.hot")) {
                    next = next.substring(0, next.length() - C2685a.f8035a);
                }
                sb.append(next).append(";");
            }
            hashMap.put("file", sb.toString());
        }
        C2685a.f8039e = null;
        C2685a.f8038d = null;
        return hashMap;
    }

    public static String getStatus() {
        try {
            if (C2688c.f8044a == null) {
                return "default log instance is null";
            }
            Alog alog = C2688c.f8044a;
            if (!Alog.f7998h) {
                return "not inited";
            }
            if (alog.f8004n == null) {
                alog.f8004n = C2689d.m7782a();
            }
            if (alog.f8004n == null) {
                return "get process name failed";
            }
            String replace = alog.f8004n.replace(':', '-');
            File file = new File(alog.f8001k);
            if (!file.exists()) {
                return "cache dir not exists";
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return "cache dir is empty";
            }
            String str = replace + "__" + alog.f8005o + ".alog.cache.guard";
            Pattern compile = Pattern.compile("^" + Pattern.quote(replace) + "__" + Pattern.quote(alog.f8005o) + "__\\d{5}\\.alog\\.cache$");
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (File file2 : listFiles) {
                if (file2.getName().equals(str)) {
                    i++;
                    if (file2.length() >= 24576) {
                        i2++;
                    }
                } else if (file2.getName().startsWith(replace + "__" + alog.f8005o + "__") && compile.matcher(file2.getName()).find()) {
                    i3++;
                    if (file2.length() >= ((long) alog.f8002l)) {
                        i4++;
                    }
                }
            }
            if (i <= 0) {
                file.getAbsolutePath();
                return "cache guard not exists";
            } else if (i2 <= 0) {
                return "cache guard size insufficiently";
            } else {
                if (i3 < alog.f8003m) {
                    return "cache block count insufficiently";
                }
                if (i4 < alog.f8003m) {
                    return "cache block size insufficiently";
                }
                File file3 = new File(alog.f8000j);
                if (!file3.exists()) {
                    return "log dir not exists";
                }
                File[] listFiles2 = file3.listFiles(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0150: INVOKE  (r0v35 'listFiles2' java.io.File[]) = 
                      (r2v1 'file3' java.io.File)
                      (wrap: com.bytedance.android.alog.Alog$1 : 0x014d: CONSTRUCTOR  (r0v34 com.bytedance.android.alog.Alog$1) = 
                      (r3v0 'alog' com.bytedance.android.alog.Alog)
                      (wrap: java.util.regex.Pattern : 0x0147: INVOKE  (r1v9 java.util.regex.Pattern) = 
                      (wrap: java.lang.String : ?: STR_CONCAT  
                      ("^\d{4}_\d{2}_\d{2}_\d+__")
                      (wrap: java.lang.String : 0x0127: INVOKE  (r7v0 'replace' java.lang.String) type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("__")
                      (wrap: java.lang.String : 0x0135: INVOKE  
                      (wrap: java.lang.String : 0x0133: IGET  (r3v0 'alog' com.bytedance.android.alog.Alog) com.bytedance.android.alog.Alog.o java.lang.String)
                     type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("\.alog\.hot$")
                    )
                     type: STATIC call: java.util.regex.Pattern.compile(java.lang.String):java.util.regex.Pattern)
                     call: com.bytedance.android.alog.Alog.1.<init>(com.bytedance.android.alog.Alog, java.util.regex.Pattern):void type: CONSTRUCTOR)
                     type: VIRTUAL call: java.io.File.listFiles(java.io.FilenameFilter):java.io.File[] in method: com.ss.android.agilelogger.ALog.getStatus():java.lang.String, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014d: CONSTRUCTOR  (r0v34 com.bytedance.android.alog.Alog$1) = 
                      (r3v0 'alog' com.bytedance.android.alog.Alog)
                      (wrap: java.util.regex.Pattern : 0x0147: INVOKE  (r1v9 java.util.regex.Pattern) = 
                      (wrap: java.lang.String : ?: STR_CONCAT  
                      ("^\d{4}_\d{2}_\d{2}_\d+__")
                      (wrap: java.lang.String : 0x0127: INVOKE  (r7v0 'replace' java.lang.String) type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("__")
                      (wrap: java.lang.String : 0x0135: INVOKE  
                      (wrap: java.lang.String : 0x0133: IGET  (r3v0 'alog' com.bytedance.android.alog.Alog) com.bytedance.android.alog.Alog.o java.lang.String)
                     type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("\.alog\.hot$")
                    )
                     type: STATIC call: java.util.regex.Pattern.compile(java.lang.String):java.util.regex.Pattern)
                     call: com.bytedance.android.alog.Alog.1.<init>(com.bytedance.android.alog.Alog, java.util.regex.Pattern):void type: CONSTRUCTOR in method: com.ss.android.agilelogger.ALog.getStatus():java.lang.String, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 58 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.alog.Alog, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 64 more
                    */
                /*
                // Method dump skipped, instructions count: 357
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.agilelogger.ALog.getStatus():java.lang.String");
            }

            public static void setILogCacheCallback(AbstractC29717b bVar) {
                sILogCacheCallback = bVar;
            }

            public static void setOuterExecutorService(ScheduledExecutorService scheduledExecutorService) {
                sOuterExecutorService = scheduledExecutorService;
            }

            /* renamed from: com.ss.android.agilelogger.ALog$b */
            public static class C29698b {

                /* renamed from: a */
                private final Alog f70851a;

                static {
                    Covode.recordClassIndex(36095);
                }

                C29698b(Alog alog) {
                    this.f70851a = alog;
                }
            }

            public static void addNativeFuncAddrCallback(AbstractC29719c cVar) {
                sINativeFuncAddrCallbackList.add(cVar);
            }

            public static void setBlockTagSet(Set<String> set) {
                mBlockTagSet = Collections.unmodifiableSet(set);
            }

            public static void changeLevel(int i) {
                prio = i;
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                if (C2688c.f8044a != null) {
                    C2688c.f8044a.mo7199b(level2AlogCoreLevel);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.mo7199b(level2AlogCoreLevel(i));
                }
            }

            public static void setDebug(boolean z) {
                sDebug = z;
                if (C2688c.f8044a != null) {
                    C2688c.f8044a.mo7197a(z);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.mo7197a(sDebug);
                }
            }

            public static void timedSyncFlush(int i) {
                Handler handler = sAsyncHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(2);
                }
                if (C2688c.f8044a != null) {
                    C2688c.f8044a.mo7195a(i);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.mo7195a(i);
                }
                Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
                while (it.hasNext()) {
                    Alog alog2 = it.next().get();
                    if (alog2 != null) {
                        alog2.mo7195a(i);
                    }
                }
            }

            public static void writeCachedItems(Queue<C29726e> queue) {
                for (C29726e eVar : queue) {
                    if (checkPrioAndTag(eVar.f70881b, eVar.f70882c)) {
                        handleItemMsg(eVar);
                        C2688c.m7778a(level2AlogCoreLevel(eVar.f70881b), eVar.f70882c, eVar.f70883d);
                    }
                }
            }

            /* renamed from: com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete */
            public static boolean m59864xdfd7d212(File file) {
                MethodCollector.m26663i(3383);
                try {
                    C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                    if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                    }
                    if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                        MethodCollector.m26664o(3383);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.m26664o(3383);
                return delete;
            }

            private static void handleItemMsg(C29726e eVar) {
                String str;
                switch (C296967.f70838a[eVar.f70886g.ordinal()]) {
                    case 1:
                        str = (String) eVar.f70887h;
                        break;
                    case 2:
                        if (eVar.f70888i != null) {
                            str = eVar.f70888i + C29724d.m59905a((Throwable) eVar.f70887h);
                            break;
                        } else {
                            str = C29724d.m59905a((Throwable) eVar.f70887h);
                            break;
                        }
                    case 3:
                    case 4:
                        str = C29721b.m59895a(eVar.f70886g, (String) eVar.f70887h);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        str = C29721b.m59894a(eVar.f70886g, (Bundle) eVar.f70887h);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = C29721b.m59893a(eVar.f70886g, (Intent) eVar.f70887h);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        str = C29721b.m59897a(eVar.f70886g, (Throwable) eVar.f70887h);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        str = C29721b.m59896a(eVar.f70886g, (Thread) eVar.f70887h);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        str = C29721b.m59898a(eVar.f70886g, (StackTraceElement[]) eVar.f70887h);
                        break;
                    default:
                        str = "";
                        break;
                }
                eVar.f70883d = str;
            }

            public static void handleAsyncLog(C29697a aVar) {
                String str;
                MethodCollector.m26663i(3850);
                int level2AlogCoreLevel = level2AlogCoreLevel(aVar.f70842d);
                String str2 = "";
                if (aVar.f70846h == null) {
                    if (aVar.f70845g == null) {
                        str2 = aVar.f70844f;
                    } else {
                        if (aVar.f70844f == null) {
                            str = "";
                        } else {
                            str = aVar.f70844f + "\n";
                        }
                        str2 = str + C29724d.m59905a(aVar.f70845g);
                    }
                } else if (aVar.f70846h == C29721b.EnumC29722a.BORDER) {
                    str2 = C29721b.m59895a(C29721b.EnumC29722a.BORDER, aVar.f70844f);
                } else if (aVar.f70846h == C29721b.EnumC29722a.JSON) {
                    str2 = C29721b.m59895a(C29721b.EnumC29722a.JSON, aVar.f70844f);
                } else if (aVar.f70846h == C29721b.EnumC29722a.BUNDLE) {
                    str2 = C29721b.m59894a(C29721b.EnumC29722a.BUNDLE, (Bundle) aVar.f70847i);
                } else if (aVar.f70846h == C29721b.EnumC29722a.INTENT) {
                    str2 = C29721b.m59893a(C29721b.EnumC29722a.INTENT, (Intent) aVar.f70847i);
                } else if (aVar.f70846h == C29721b.EnumC29722a.THROWABLE) {
                    str2 = C29721b.m59897a(C29721b.EnumC29722a.THROWABLE, (Throwable) aVar.f70847i);
                } else if (aVar.f70846h == C29721b.EnumC29722a.THREAD) {
                    str2 = C29721b.m59896a(C29721b.EnumC29722a.THREAD, (Thread) aVar.f70847i);
                } else if (aVar.f70846h == C29721b.EnumC29722a.STACKTRACE) {
                    str2 = C29721b.m59898a(C29721b.EnumC29722a.STACKTRACE, (StackTraceElement[]) aVar.f70847i);
                }
                String str3 = aVar.f70843e;
                long j = aVar.f70848j;
                long j2 = aVar.f70849k;
                if (C2688c.f8044a != null) {
                    Alog alog = C2688c.f8044a;
                    if (!(alog.f8006p == 0 || level2AlogCoreLevel < alog.f7999i || str3 == null || str2 == null)) {
                        Alog.nativeWriteAsyncMsg(alog.f8006p, level2AlogCoreLevel, str3, str2, j, j2);
                    }
                }
                aVar.f70843e = null;
                aVar.f70844f = null;
                aVar.f70845g = null;
                aVar.f70846h = null;
                aVar.f70847i = null;
                aVar.f70848j = -1;
                aVar.f70849k = 0;
                aVar.f70850l = null;
                synchronized (C29697a.f70839a) {
                    try {
                        if (C29697a.f70841c < 50) {
                            aVar.f70850l = C29697a.f70840b;
                            C29697a.f70840b = aVar;
                            C29697a.f70841c++;
                        }
                    } finally {
                        MethodCollector.m26664o(3850);
                    }
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
                com.p2082ss.android.agilelogger.ALog.prio = r9.f70860i;
                r2 = r9.f70852a;
                r1 = com.p2082ss.android.agilelogger.C29727f.m59909b();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
                if (r1 == null) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
                if (r1.contains(":") != false) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
                if (r1.equals(r2.getPackageName()) == false) goto L_0x01f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
                r6 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
                r3 = r9.f70863l;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
                if (r3 != false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
                if (r9.f70862k == false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
                if (r6 == false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
                r5 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
                r4 = new com.bytedance.android.alog.Alog.C2679b(r9.f70852a).mo7209a("default");
                r4.f8011a = level2AlogCoreLevel(r9.f70860i);
                r4.f8012b = com.p2082ss.android.agilelogger.ALog.sDebug;
                r4.f8013c = r9.f70857f;
                r4.f8014d = r9.f70855d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
                if (r5 == false) goto L_0x01eb;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
                r0 = (r9.f70854c / 3) * 2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
                r4.f8015e = r0;
                r4.f8016f = r9.f70853b;
                r4.f8017g = r9.f70856e;
                r1 = 65536;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
                if (r6 == false) goto L_0x01e6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
                r0 = 65536;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
                r4.f8018h = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
                if (r6 == false) goto L_0x0092;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
                r1 = 196608;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
                r4.f8019i = r1;
                r1 = r4.mo7205a(com.bytedance.android.alog.Alog.EnumC2681d.SAFE).mo7208a(com.bytedance.android.alog.Alog.EnumC2684g.RAW).mo7206a(com.bytedance.android.alog.Alog.EnumC2682e.LEGACY);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
                if (r9.f70858g == false) goto L_0x01e2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2680c.ZSTD;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
                r1 = r1.mo7204a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
                if (r9.f70859h == false) goto L_0x01de;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2683f.TEA_16;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
                r1 = r1.mo7207a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
                if (r9.f70859h == false) goto L_0x01da;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2678a.EC_SECP256K1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
                r1 = r1.mo7203a(r0);
                r1.f8020j = r9.f70861j;
                r0 = r1.mo7210a();
                com.bytedance.android.alog.C2688c.f8044a = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
                if (r0 != null) goto L_0x01d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
                r0 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
                com.bytedance.android.alog.Alog.nativeSetDefaultInstance(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
                if (r3 == false) goto L_0x00f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
                if (r6 == false) goto L_0x00f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
                r1 = new android.os.HandlerThread("Alog_main_delegate");
                com.p2082ss.android.agilelogger.ALog.sAsyncLogThread = r1;
                r1.start();
                com.p2082ss.android.agilelogger.ALog.sAsyncHandler = new com.p2082ss.android.agilelogger.ALog.HandlerC296901(com.p2082ss.android.agilelogger.ALog.sAsyncLogThread.getLooper());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
                if (r5 == false) goto L_0x0166;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
                r1 = new com.bytedance.android.alog.Alog.C2679b(r9.f70852a).mo7209a("main");
                r1.f8011a = level2AlogCoreLevel(r9.f70860i);
                r1.f8012b = com.p2082ss.android.agilelogger.ALog.sDebug;
                r1.f8013c = r9.f70857f;
                r1.f8014d = r9.f70855d / 2;
                r1.f8015e = r9.f70854c / 3;
                r1.f8016f = r9.f70853b;
                r1.f8017g = r9.f70856e;
                r1.f8018h = 32768;
                r1.f8019i = 98304;
                r1 = r1.mo7205a(com.bytedance.android.alog.Alog.EnumC2681d.SAFE).mo7208a(com.bytedance.android.alog.Alog.EnumC2684g.RAW).mo7206a(com.bytedance.android.alog.Alog.EnumC2682e.LEGACY);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
                if (r9.f70858g == false) goto L_0x01d2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2680c.ZSTD;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
                r1 = r1.mo7204a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
                if (r9.f70859h == false) goto L_0x01ce;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2683f.TEA_16;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
                r1 = r1.mo7207a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
                if (r9.f70859h == false) goto L_0x01cb;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x0156, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2678a.EC_SECP256K1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x0158, code lost:
                r1 = r1.mo7203a(r0);
                r1.f8020j = r9.f70861j;
                com.p2082ss.android.agilelogger.ALog.mainThreadRef = r1.mo7210a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
                r6 = r9.f70856e;
                r5 = r9.f70857f;
                r3 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:67:0x016d, code lost:
                if (com.p2082ss.android.agilelogger.ALog.sILogCacheCallback == null) goto L_0x017d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x016f, code lost:
                r1 = com.p2082ss.android.agilelogger.ALog.sILogCacheCallback.mo51951a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x0175, code lost:
                if (r1 == null) goto L_0x01c7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x017b, code lost:
                if (r1.size() != 0) goto L_0x01c7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
                if (getNativeFuncAddrCallbackList().size() <= 0) goto L_0x01a4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
                r2 = new com.p2082ss.android.agilelogger.ALog.RunnableC296912();
                r0 = com.p2082ss.android.agilelogger.ALog.sOuterExecutorService;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:75:0x018e, code lost:
                if (r0 != null) goto L_0x01a0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
                new java.lang.Thread(r2, "_ALOG_OPT_").start();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:77:0x019a, code lost:
                com.p2082ss.android.agilelogger.ALog.sInitSuccess = true;
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3367);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:78:0x019f, code lost:
                return true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
                r0.execute(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a4, code lost:
                r4 = com.p2082ss.android.agilelogger.ALog.sOuterExecutorService;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a6, code lost:
                if (r4 != null) goto L_0x01ba;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a8, code lost:
                new java.util.Timer("_ALOG_OPT_").schedule(new com.p2082ss.android.agilelogger.ALog.C296923(), 15000);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
                r4.schedule(new com.p2082ss.android.agilelogger.ALog.RunnableC296934(), 15, java.util.concurrent.TimeUnit.SECONDS);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c7, code lost:
                r3 = r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c8, code lost:
                if (r3 != null) goto L_0x0187;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2678a.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2683f.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d2, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2680c.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d6, code lost:
                r0 = r0.f8006p;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2678a.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:91:0x01de, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2683f.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e2, code lost:
                r0 = com.bytedance.android.alog.Alog.EnumC2680c.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e6, code lost:
                r0 = 32768;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
                r0 = r9.f70854c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ef, code lost:
                r5 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
                if (r1.equals(r2.getApplicationInfo().processName) == false) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:98:0x0200, code lost:
                r6 = false;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static boolean init(com.p2082ss.android.agilelogger.C29699a r9) {
                /*
                // Method dump skipped, instructions count: 525
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.agilelogger.ALog.init(com.ss.android.agilelogger.a):boolean");
            }

            public static boolean checkPrioAndTag(int i, String str) {
                if (i < prio) {
                    return false;
                }
                if (mBlockTagSet == null || TextUtils.isEmpty(str) || !mBlockTagSet.contains(str)) {
                    return true;
                }
                return false;
            }

            public static C29698b createInstance(String str, Context context) {
                if (context == null) {
                    return null;
                }
                return createInstance(str, new C29699a.C29700a(context).mo51949a());
            }

            public static List<String> getALogFiles(long j, long j2) {
                ArrayList arrayList = new ArrayList();
                try {
                    for (File file : C2688c.m7779a(null, null, j * 1000, j2 * 1000)) {
                        arrayList.add(file.getAbsolutePath());
                    }
                } catch (Exception unused) {
                }
                return arrayList;
            }

            /* renamed from: d */
            public static void m59865d(String str, String str2) {
                if (checkPrioAndTag(3, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(1, str, str2);
                        } else {
                            alog.mo7196a(1, str, str2);
                        }
                    } else {
                        postAsyncLog(3, str, str2);
                    }
                }
            }

            /* renamed from: e */
            public static void m59866e(String str, String str2) {
                if (checkPrioAndTag(6, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(4, str, str2);
                        } else {
                            alog.mo7196a(4, str, str2);
                        }
                    } else {
                        postAsyncLog(6, str, str2);
                    }
                }
            }

            /* renamed from: i */
            public static void m59869i(String str, String str2) {
                if (checkPrioAndTag(4, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(2, str, str2);
                        } else {
                            alog.mo7196a(2, str, str2);
                        }
                    } else {
                        postAsyncLog(4, str, str2);
                    }
                }
            }

            /* renamed from: v */
            public static void m59870v(String str, String str2) {
                if (checkPrioAndTag(2, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(0, str, str2);
                        } else {
                            alog.mo7196a(0, str, str2);
                        }
                    } else {
                        postAsyncLog(2, str, str2);
                    }
                }
            }

            /* renamed from: w */
            public static void m59871w(String str, String str2) {
                if (checkPrioAndTag(5, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(3, str, str2);
                        } else {
                            alog.mo7196a(3, str, str2);
                        }
                    } else {
                        postAsyncLog(5, str, str2);
                    }
                }
            }

            public static void removeLegacyFiles(String str, String str2) {
                File[] listFiles;
                File[] listFiles2;
                File file = new File(str);
                if (file.exists() && (listFiles2 = file.listFiles(new FilenameFilter() {
                    /* class com.p2082ss.android.agilelogger.ALog.C296945 */

                    static {
                        Covode.recordClassIndex(36091);
                    }

                    public final boolean accept(File file, String str) {
                        return str.startsWith(".logCache_");
                    }
                })) != null) {
                    for (File file2 : listFiles2) {
                        m59864xdfd7d212(file2);
                    }
                }
                File file3 = new File(str2);
                if (file3.exists() && (listFiles = file3.listFiles(new FilenameFilter() {
                    /* class com.p2082ss.android.agilelogger.ALog.C296956 */

                    static {
                        Covode.recordClassIndex(36092);
                    }

                    public final boolean accept(File file, String str) {
                        if (str.endsWith(".hoting")) {
                            return true;
                        }
                        if (!str.endsWith(".hot") || str.endsWith(".alog.hot")) {
                            return false;
                        }
                        return true;
                    }
                })) != null) {
                    for (File file4 : listFiles) {
                        m59864xdfd7d212(file4);
                    }
                }
            }

            public static C29698b createInstance(String str, C29699a aVar) {
                String str2;
                String str3;
                Alog.EnumC2680c cVar;
                Alog.EnumC2683f fVar;
                Alog.EnumC2678a aVar2;
                if (aVar == null) {
                    return null;
                }
                if (!sInitSuccess) {
                    try {
                        Alog.m7759a(new C29725d());
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                Alog.C2679b a = new Alog.C2679b(aVar.f70852a).mo7209a(str);
                a.f8011a = level2AlogCoreLevel(aVar.f70860i);
                a.f8012b = sDebug;
                C29699a aVar3 = sConfig;
                if (aVar3 != null) {
                    str2 = aVar3.f70857f;
                } else {
                    str2 = aVar.f70857f;
                }
                a.f8013c = str2;
                a.f8014d = aVar.f70855d;
                a.f8015e = aVar.f70854c;
                a.f8016f = aVar.f70853b;
                C29699a aVar4 = sConfig;
                if (aVar4 != null) {
                    str3 = aVar4.f70856e;
                } else {
                    str3 = aVar.f70856e;
                }
                a.f8017g = str3;
                a.f8018h = 65536;
                a.f8019i = 196608;
                Alog.C2679b a2 = a.mo7205a(Alog.EnumC2681d.SAFE).mo7208a(Alog.EnumC2684g.RAW).mo7206a(Alog.EnumC2682e.LEGACY);
                if (aVar.f70858g) {
                    cVar = Alog.EnumC2680c.ZSTD;
                } else {
                    cVar = Alog.EnumC2680c.NONE;
                }
                Alog.C2679b a3 = a2.mo7204a(cVar);
                if (aVar.f70859h) {
                    fVar = Alog.EnumC2683f.TEA_16;
                } else {
                    fVar = Alog.EnumC2683f.NONE;
                }
                Alog.C2679b a4 = a3.mo7207a(fVar);
                if (aVar.f70859h) {
                    aVar2 = Alog.EnumC2678a.EC_SECP256K1;
                } else {
                    aVar2 = Alog.EnumC2678a.NONE;
                }
                Alog.C2679b a5 = a4.mo7203a(aVar2);
                a5.f8020j = aVar.f70861j;
                Alog a6 = a5.mo7210a();
                if (a6 == null) {
                    return null;
                }
                sStandaloneInstances.add(new WeakReference<>(a6));
                return new C29698b(a6);
            }

            /* renamed from: e */
            public static void m59868e(String str, Throwable th) {
                if (checkPrioAndTag(6, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        String a2 = C29724d.m59905a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(4, str, a2);
                        } else {
                            alog.mo7196a(4, str, a2);
                        }
                    } else {
                        postAsyncLog(6, str, null, th, null, null);
                    }
                }
            }

            /* renamed from: w */
            public static void m59873w(String str, Throwable th) {
                if (checkPrioAndTag(5, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        String a2 = C29724d.m59905a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(3, str, a2);
                        } else {
                            alog.mo7196a(3, str, a2);
                        }
                    } else {
                        postAsyncLog(5, str, null, th, null, null);
                    }
                }
            }

            public static void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
                stacktrace(i, str, stackTraceElementArr);
            }

            private static void postAsyncLog(int i, String str, String str2) {
                postAsyncLog(i, str, str2, null, null, null);
            }

            public static void bundle(int i, String str, Bundle bundle) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59894a(C29721b.EnumC29722a.BUNDLE, bundle);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, null, null, C29721b.EnumC29722a.BUNDLE, bundle);
                    }
                }
            }

            public static void header(int i, String str, String str2) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59895a(C29721b.EnumC29722a.BORDER, str2);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, str2, null, C29721b.EnumC29722a.BORDER, null);
                    }
                }
            }

            public static void intent(int i, String str, Intent intent) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59893a(C29721b.EnumC29722a.INTENT, intent);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, null, null, C29721b.EnumC29722a.INTENT, intent);
                    }
                }
            }

            public static void json(int i, String str, String str2) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59895a(C29721b.EnumC29722a.JSON, str2);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, str2, null, C29721b.EnumC29722a.JSON, null);
                    }
                }
            }

            public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59898a(C29721b.EnumC29722a.STACKTRACE, stackTraceElementArr);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, null, null, C29721b.EnumC29722a.STACKTRACE, stackTraceElementArr);
                    }
                }
            }

            public static void thread(int i, String str, Thread thread) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59896a(C29721b.EnumC29722a.THREAD, thread);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, null, null, C29721b.EnumC29722a.THREAD, thread);
                    }
                }
            }

            public static void throwable(int i, String str, Throwable th) {
                if (checkPrioAndTag(i, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i);
                        String a2 = C29721b.m59897a(C29721b.EnumC29722a.THROWABLE, th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, a2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, a2);
                        }
                    } else {
                        postAsyncLog(i, str, null, null, C29721b.EnumC29722a.THROWABLE, th);
                    }
                }
            }

            /* renamed from: e */
            public static void m59867e(String str, String str2, Throwable th) {
                if (checkPrioAndTag(6, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        String str3 = str2 + "\n" + C29724d.m59905a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(4, str, str3);
                        } else {
                            alog.mo7196a(4, str, str3);
                        }
                    } else {
                        postAsyncLog(6, str, str2, th, null, null);
                    }
                }
            }

            /* renamed from: w */
            public static void m59872w(String str, String str2, Throwable th) {
                if (checkPrioAndTag(5, str)) {
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        String str3 = str2 + "\n" + C29724d.m59905a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(3, str, str3);
                        } else {
                            alog.mo7196a(3, str, str3);
                        }
                    } else {
                        postAsyncLog(5, str, str2, th, null, null);
                    }
                }
            }

            public static void removeObsoleteInstance(String str, Context context, boolean z) {
                String absolutePath;
                String b;
                String b2 = C29727f.m59909b();
                if (b2 != null && !b2.contains(":")) {
                    if (!z) {
                        b2 = b2 + '-';
                    }
                    C29699a aVar = sConfig;
                    if (aVar != null) {
                        absolutePath = aVar.f70857f;
                        b = sConfig.f70856e;
                    } else {
                        absolutePath = C29720a.m59890a(context).getAbsolutePath();
                        b = C29720a.m59891b(context);
                    }
                    File file = new File(absolutePath);
                    if (file.exists() && file.isDirectory()) {
                        String str2 = "__" + str + ".alog.hot";
                        File[] listFiles = file.listFiles();
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (name != null && name.endsWith(str2) && name.contains(b2)) {
                                m59864xdfd7d212(file2);
                            }
                        }
                        File file3 = new File(b);
                        if (file3.exists() && file3.isDirectory()) {
                            String concat = "__".concat(String.valueOf(str));
                            File[] listFiles2 = file3.listFiles();
                            for (File file4 : listFiles2) {
                                String name2 = file4.getName();
                                if (name2 != null && name2.contains(concat) && name2.contains(b2)) {
                                    m59864xdfd7d212(file4);
                                }
                            }
                        }
                    }
                }
            }

            public static List<String> getALogFiles(String str, String str2, long j, long j2) {
                ArrayList arrayList = new ArrayList();
                try {
                    for (File file : C2688c.m7779a(str, str2, j * 1000, j2 * 1000)) {
                        arrayList.add(file.getAbsolutePath());
                    }
                } catch (Exception unused) {
                }
                return arrayList;
            }

            public static void println(int i, String str, Object obj, C29721b.EnumC29722a aVar) {
                String str2;
                if (checkPrioAndTag(i, str)) {
                    int level2AlogCoreLevel = level2AlogCoreLevel(i);
                    switch (C296967.f70838a[aVar.ordinal()]) {
                        case 1:
                            str2 = (String) obj;
                            break;
                        case 2:
                            str2 = C29724d.m59905a((Throwable) obj);
                            break;
                        case 3:
                            str2 = C29721b.m59895a(C29721b.EnumC29722a.BORDER, (String) obj);
                            break;
                        case 4:
                            str2 = C29721b.m59895a(C29721b.EnumC29722a.JSON, (String) obj);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            str2 = C29721b.m59894a(C29721b.EnumC29722a.BUNDLE, (Bundle) obj);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            str2 = C29721b.m59893a(C29721b.EnumC29722a.INTENT, (Intent) obj);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            str2 = C29721b.m59897a(C29721b.EnumC29722a.THROWABLE, (Throwable) obj);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            str2 = C29721b.m59896a(C29721b.EnumC29722a.THREAD, (Thread) obj);
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            str2 = C29721b.m59898a(C29721b.EnumC29722a.STACKTRACE, (StackTraceElement[]) obj);
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    boolean a = C29727f.m59908a();
                    if (!a || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a) {
                            C2688c.m7778a(level2AlogCoreLevel, str, str2);
                        } else {
                            alog.mo7196a(level2AlogCoreLevel, str, str2);
                        }
                    } else {
                        postAsyncLog(i, str, str2);
                    }
                }
            }

            private static void postAsyncLog(int i, String str, String str2, Throwable th, C29721b.EnumC29722a aVar, Object obj) {
                initMainThreadIdIfNeeded();
                C29697a a = C29697a.m59874a();
                a.f70842d = i;
                a.f70843e = str;
                a.f70844f = str2;
                a.f70845g = th;
                a.f70846h = aVar;
                a.f70847i = obj;
                a.f70848j = sMainThreadId;
                a.f70849k = System.currentTimeMillis();
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = a;
                sAsyncHandler.sendMessage(obtain);
            }
        }
