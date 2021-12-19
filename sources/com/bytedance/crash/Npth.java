package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.C13934n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.gwpasan.GwpAsan;
import com.bytedance.crash.nativecrash.C13962f;
import com.bytedance.crash.nativecrash.NativeCrashCollector;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p923a.AbstractC13817c;
import com.bytedance.crash.p923a.AbstractC13818d;
import com.bytedance.crash.p923a.C13815a;
import com.bytedance.crash.p924b.C13820a;
import com.bytedance.crash.p924b.C13823b;
import com.bytedance.crash.p924b.C13826c;
import com.bytedance.crash.p924b.C13839h;
import com.bytedance.crash.p924b.C13840i;
import com.bytedance.crash.p925c.C13847a;
import com.bytedance.crash.p927e.C13853a;
import com.bytedance.crash.p927e.C13859d;
import com.bytedance.crash.p931i.AbstractC13883a;
import com.bytedance.crash.p932j.AbstractC13921j;
import com.bytedance.crash.p932j.C13905e;
import com.bytedance.crash.p932j.C13907f;
import com.bytedance.crash.runtime.AbstractC14012i;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.runtime.C14000c;
import com.bytedance.crash.runtime.C14013j;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.runtime.p933a.C13978a;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import com.bytedance.crash.util.C14076w;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

public final class Npth {
    private static boolean sInit;

    static {
        Covode.recordClassIndex(15864);
    }

    public static void setAlogFlushAddr(long j) {
    }

    public static void setAlogLogDirAddr(long j) {
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void stopEnsure() {
        C13934n.f33963i = true;
    }

    public static void stopUpload() {
        C13934n.f33962h = true;
    }

    public static ConfigManager getConfigManager() {
        return C13933m.f33942g;
    }

    public static boolean hasCrashWhenNativeCrash() {
        return C13853a.f33722d;
    }

    public static boolean isANREnable() {
        return C13934n.f33957c;
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return C13934n.f33956b;
    }

    public static boolean isNativeCrashEnable() {
        return C13934n.f33958d;
    }

    public static boolean isStopUpload() {
        return C13934n.f33962h;
    }

    public static boolean hasCrash() {
        return C13934n.m25236a();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return C13934n.m25237b();
    }

    public static boolean isRunning() {
        if (SystemClock.uptimeMillis() - C13823b.f33619b <= 15000) {
            return true;
        }
        return false;
    }

    public static void openANRMonitor() {
        if (C13934n.f33955a) {
            C13839h.m24996a(C13933m.f33936a).f33691a.mo22261a();
            C13934n.f33957c = true;
        }
    }

    public static void openJavaCrashMonitor() {
        if (C13934n.f33955a && !C13934n.f33956b) {
            Context context = C13933m.f33936a;
            C13853a a = C13853a.m25018a();
            a.f33726a = new C13859d(context, true);
            a.f33727b = new C13859d(context, false);
        }
    }

    public static boolean openNativeCrashMonitor() {
        if (C13934n.f33955a && !C13934n.f33958d) {
            boolean a = NativeImpl.m25246a(C13933m.f33936a);
            C13934n.f33958d = a;
            if (!a) {
                C13934n.f33959e = true;
            }
        }
        return C13934n.f33958d;
    }

    public static void stopAnr() {
        if (C13934n.f33955a) {
            C13820a aVar = C13839h.m24996a(C13933m.f33936a).f33691a;
            if (aVar.f33592b) {
                aVar.f33592b = false;
                if (aVar.f33591a != null) {
                    aVar.f33591a.f33622c = true;
                }
                if (C13840i.f33692a) {
                    C13840i.f33692a = false;
                }
                aVar.f33591a = null;
            }
            C13934n.f33957c = false;
        }
    }

    private static boolean isGwpAsanSupportApiLevel() {
        JSONArray a = C14062n.m25592a(C13994b.m25330a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_api_level");
        if (a != null && a.length() > 0) {
            if ("all".equals(a.optString(0))) {
                return true;
            }
            for (int i = 1; i < a.length(); i++) {
                try {
                    if (Build.VERSION.SDK_INT == Integer.parseInt(a.optString(i))) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    private static boolean isGwpAsanSupportDeviceBrand() {
        JSONArray a;
        if (!Build.BRAND.isEmpty() && (a = C14062n.m25592a(C13994b.m25330a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_device_brand")) != null && a.length() > 0) {
            if ("all".equals(a.optString(0))) {
                return true;
            }
            for (int i = 1; i < a.length(); i++) {
                try {
                    if (Build.BRAND.equals(a.optString(i))) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static void setCurProcessName(String str) {
        C14044b.f34213a = str;
    }

    public static void setLogcatImpl(AbstractC14012i iVar) {
        C14013j.f34154a = iVar;
    }

    public static void setNpthStartEventDelayTime(long j) {
        C13933m.f33948m = j;
    }

    public static void setRequestIntercept(AbstractC13921j jVar) {
        C13907f.f33883b = jVar;
    }

    public static void setScriptStackCallback(AbstractC13875g gVar) {
        NativeCrashCollector.f33973b = gVar;
    }

    public static void customActivityName(AbstractC13883a aVar) {
        C13978a.m25303a().f34089z = aVar;
    }

    public static void dumpHprof(String str) {
        NativeTools.m25458a().mo22565b(str);
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        C13934n.f33960f.f34134d.add(iOOMCallback);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        C13934n.f33960f.f34133c.add(iOOMCallback);
    }

    public static void removeTag(String str) {
        C13933m.f33943h.mo22252a(str, (String) null);
    }

    public static void setApplication(Application application) {
        if (application != null) {
            C13933m.f33937b = application;
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            C13933m.f33940e = str;
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        C13933m.f33943h.mFilter = iCrashFilter;
    }

    public static void setEncryptImpl(AbstractC13852e eVar) {
        C13933m.f33942g.setEncryptImpl(eVar);
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            C13933m.f33943h.f33580a.putAll(map);
        }
    }

    /* renamed from: com_bytedance_crash_Npth_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m24922xc16f082c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static void reportDartError(String str) {
        if (!TextUtils.isEmpty(str)) {
            C13847a.m25012a(str, null, null, null);
        }
    }

    public static long getFileSize(String str) {
        MethodCollector.m26663i(10960);
        NativeTools.m25458a();
        long nativeGetPathSize = NativeTools.nativeGetPathSize(str, 0);
        MethodCollector.m26664o(10960);
        return nativeGetPathSize;
    }

    public static long getFolderSize(String str) {
        MethodCollector.m26663i(10959);
        NativeTools.m25458a();
        long nativeGetPathSize = NativeTools.nativeGetPathSize(str, 1);
        MethodCollector.m26664o(10959);
        return nativeGetPathSize;
    }

    public static void reportError(String str) {
        if (C13933m.f33942g.isReportErrorEnable() && str != null) {
            C14019n.m25421b().mo22551a(new Runnable(str) {
                /* class com.bytedance.crash.p927e.C13853a.RunnableC138563 */

                /* renamed from: a */
                final /* synthetic */ String f33736a;

                static {
                    Covode.recordClassIndex(15913);
                }

                public final void run() {
                    C13864b bVar = new C13864b();
                    bVar.mo22346a("data", (Object) this.f33736a);
                    bVar.mo22346a("userdefine", (Object) 1);
                    C13864b a = C13989e.m25320a().mo22510a(CrashType.CUSTOM_JAVA, bVar);
                    if (a != null) {
                        C13905e.m25158a().mo22389b(a.f33757a);
                    }
                }

                {
                    this.f33736a = r1;
                }
            });
        }
    }

    public static void setAlogFlushV2Addr(long j) {
        MethodCollector.m26663i(10665);
        if (NativeImpl.f33976a) {
            try {
                NativeImpl.doSetAlogFlushAddr(j);
                MethodCollector.m26664o(10665);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(10665);
    }

    public static void reportError(Throwable th) {
        if (C13933m.f33942g.isReportErrorEnable() && th != null) {
            C14019n.m25421b().mo22551a(new Runnable(th) {
                /* class com.bytedance.crash.p927e.C13853a.RunnableC138552 */

                /* renamed from: a */
                final /* synthetic */ Throwable f33735a;

                static {
                    Covode.recordClassIndex(15912);
                }

                public final void run() {
                    Context context = C13933m.f33936a;
                    long currentTimeMillis = System.currentTimeMillis();
                    Throwable th = this.f33735a;
                    if (currentTimeMillis == 0) {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    C13864b bVar = new C13864b();
                    bVar.mo22346a("isJava", (Object) 1);
                    bVar.mo22346a("data", (Object) C14042ab.m25488a(th));
                    bVar.mo22346a("crash_time", Long.valueOf(currentTimeMillis));
                    bVar.mo22346a("process_name", (Object) C14044b.m25520c(context));
                    if (!C14044b.m25518b(context)) {
                        bVar.mo22346a("remote_process", (Object) 1);
                    }
                    bVar.mo22346a("userdefine", (Object) 1);
                    C13864b a = C13989e.m25320a().mo22510a(CrashType.CUSTOM_JAVA, bVar);
                    if (a != null) {
                        C13905e.m25158a().mo22389b(a.f33757a);
                    }
                }

                {
                    this.f33735a = r1;
                }
            });
        }
    }

    public static void enableGwpAsan(boolean z) {
        if (!NativeTools.m25458a().mo22570c()) {
            C14075v.m25651b("[XAsan]is 32 app.");
        } else if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 29) {
            if ((C13933m.m25227c() || C13868e.m25091b()) && !C13994b.m25343i()) {
                startGwpAsan(1, 8192, 0, 150, C13994b.m25342h(), 5);
            } else if (z && !C13994b.m25343i()) {
                if (!isGwpAsanSupportApiLevel()) {
                    C14075v.m25651b("[XAsan]android apilevel dont find.");
                } else if (!isGwpAsanSupportDeviceBrand()) {
                    C14075v.m25651b("[XAsan] android device dont find");
                } else {
                    startGwpAsan(C13994b.m25338d(), C13994b.m25339e(), C13994b.m25340f(), C13994b.m25341g(), C13994b.m25342h(), C13994b.m25327a(120));
                }
            }
        }
    }

    public static void registerSdk(String str, String str2) {
        C13933m.m25225a(str, str2);
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C13933m.f33943h.mo22250a(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C13933m.f33943h.mo22250a(attachUserData, crashType);
        }
    }

    public static void addTag(String str, String str2) {
        C13933m.f33943h.mo22252a(str, str2);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C13933m.f33943h.mo22251a(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C13933m.f33943h.mo22251a(crashType, attachUserData);
        }
    }

    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C13933m.f33943h.mo22250a(attachUserData, crashType);
        }
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C13934n.f33960f.f34134d.remove(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C13934n.f33960f.f34133c.remove(iOOMCallback);
    }

    public static void setAnrInfoFileObserver(String str, AbstractC13871f fVar) {
        C14019n.m25421b().mo22551a(new Runnable(str, fVar) {
            /* class com.bytedance.crash.C13934n.RunnableC139351 */

            /* renamed from: a */
            final /* synthetic */ String f33966a;

            /* renamed from: b */
            final /* synthetic */ AbstractC13871f f33967b;

            static {
                Covode.recordClassIndex(15995);
            }

            public final void run() {
                if (C14044b.m25518b(C13933m.f33936a)) {
                    C13826c.m24962a(this.f33966a, this.f33967b);
                }
            }

            {
                this.f33966a = r1;
                this.f33967b = r2;
            }
        });
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            MethodCollector.m26663i(10178);
            init(context, iCommonParams, true, false, false);
            MethodCollector.m26664o(10178);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            MethodCollector.m26663i(10176);
            C13933m.f33941f = true;
            init(context, iCommonParams, true, false, true, true);
            MethodCollector.m26664o(10176);
        }
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C14000c cVar = C13934n.f33960f;
        if (crashType == CrashType.ALL) {
            cVar.f34131a.removeAll(iCrashCallback);
        } else {
            cVar.f34131a.removeInList(crashType, iCrashCallback);
        }
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C14000c cVar = C13934n.f33960f;
        if (crashType == CrashType.ALL) {
            cVar.f34131a.addMulti(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        cVar.f34131a.add(crashType, iCrashCallback);
    }

    public static void registerCrashInfoCallback(C13819b bVar, CrashType crashType) {
        C14000c cVar = C13934n.f33960f;
        if (crashType == CrashType.ALL) {
            cVar.f34132b.addMulti(bVar, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        cVar.f34132b.add(crashType, bVar);
    }

    public static void registerSdk(int i, String str) {
        MethodCollector.m26663i(10664);
        if (C13933m.f33944i == null) {
            synchronized (C13933m.class) {
                try {
                    if (C13933m.f33944i == null) {
                        C13933m.f33944i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10664);
                    throw th;
                }
            }
        }
        C13933m.f33944i.put(Integer.valueOf(i), str);
        MethodCollector.m26664o(10664);
    }

    public static void reportGameException(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            C14019n.m25421b().mo22551a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
                  (wrap: com.bytedance.crash.runtime.s : 0x0012: INVOKE  (r1v0 com.bytedance.crash.runtime.s) =  type: STATIC call: com.bytedance.crash.runtime.n.b():com.bytedance.crash.runtime.s)
                  (wrap: com.bytedance.crash.d.a$1 : 0x0018: CONSTRUCTOR  (r0v1 com.bytedance.crash.d.a$1) = (r2v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r4v0 'str3' java.lang.String) call: com.bytedance.crash.d.a.1.<init>(java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.crash.runtime.s.a(java.lang.Runnable):boolean in method: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: CONSTRUCTOR  (r0v1 com.bytedance.crash.d.a$1) = (r2v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r4v0 'str3' java.lang.String) call: com.bytedance.crash.d.a.1.<init>(java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 == 0) goto L_0x0012
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L_0x0012
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x001e
            L_0x0012:
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.C14019n.m25421b()
                com.bytedance.crash.d.a$1 r0 = new com.bytedance.crash.d.a$1
                r0.<init>(r2, r3, r4)
                r1.mo22551a(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void");
        }

        public static void enableALogCollector(String str, AbstractC13817c cVar, AbstractC13818d dVar) {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                C13815a a = C13815a.m24932a();
                a.f33582a = str;
                a.f33583b = cVar;
                a.f33584c = dVar;
                if (!a.f33585d) {
                    a.f33585d = true;
                }
            }
        }

        public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, AbstractC13878h hVar) {
            if (!TextUtils.isEmpty(str)) {
                C13847a.m25012a(str, map, map2, hVar);
            }
        }

        public static void startNativeHeapTracker(int i, int i2, int i3, boolean z) {
            Context context = C13933m.f33936a;
            C14044b.m25520c(context);
            new File(C14069r.m25642j(context), "NativeHeapTracker");
        }

        public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
            synchronized (Npth.class) {
                MethodCollector.m26663i(10177);
                C13933m.f33941f = true;
                C13933m.f33946k = i;
                C13933m.f33947l = str;
                init(context, iCommonParams, true, true, true, true);
                MethodCollector.m26664o(10177);
            }
        }

        public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
            synchronized (Npth.class) {
                MethodCollector.m26663i(10179);
                init(context, iCommonParams, z, z, z2, z3);
                MethodCollector.m26664o(10179);
            }
        }

        public static void startGwpAsan(int i, int i2, int i3, int i4, int i5, int i6) {
            Context context = C13933m.f33936a;
            GwpAsan gwpAsan = new GwpAsan(context, C14069r.m25624b(context), i, i2, i3, i4, i5, i6);
            if (GwpAsan.f33792h) {
                C13933m.f33942g.isDebugMode();
            } else if (gwpAsan.f33803e != 1 || Build.BRAND.isEmpty() || !Build.BRAND.equals("Meizu")) {
                if (C13933m.m25227c() || C13868e.m25091b()) {
                    C13933m.f33942g.isDebugMode();
                } else if (!GwpAsan.m25105b()) {
                    C13933m.f33942g.isDebugMode();
                    return;
                }
                
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: INVOKE  
                      (wrap: com.bytedance.crash.gwpasan.GwpAsan$1 : 0x0047: CONSTRUCTOR  (r1v1 com.bytedance.crash.gwpasan.GwpAsan$1) = (r2v0 'gwpAsan' com.bytedance.crash.gwpasan.GwpAsan), ("XAsanTracker") call: com.bytedance.crash.gwpasan.GwpAsan.1.<init>(com.bytedance.crash.gwpasan.GwpAsan, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.crash.gwpasan.GwpAsan.1.start():void in method: com.bytedance.crash.Npth.startGwpAsan(int, int, int, int, int, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: CONSTRUCTOR  (r1v1 com.bytedance.crash.gwpasan.GwpAsan$1) = (r2v0 'gwpAsan' com.bytedance.crash.gwpasan.GwpAsan), ("XAsanTracker") call: com.bytedance.crash.gwpasan.GwpAsan.1.<init>(com.bytedance.crash.gwpasan.GwpAsan, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.crash.Npth.startGwpAsan(int, int, int, int, int, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 21 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.gwpasan.GwpAsan, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 27 more
                    */
                /*
                    android.content.Context r3 = com.bytedance.crash.C13933m.f33936a
                    com.bytedance.crash.gwpasan.GwpAsan r2 = new com.bytedance.crash.gwpasan.GwpAsan
                    java.io.File r4 = com.bytedance.crash.util.C14069r.m25624b(r3)
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    boolean r0 = com.bytedance.crash.gwpasan.GwpAsan.f33792h
                    if (r0 == 0) goto L_0x0015
                    com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g
                    r0.isDebugMode()
                    return
                L_0x0015:
                    int r1 = r2.f33803e
                    r0 = 1
                    if (r1 != r0) goto L_0x0032
                    java.lang.String r0 = android.os.Build.BRAND
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L_0x0032
                    java.lang.String r1 = android.os.Build.BRAND
                    java.lang.String r0 = "Meizu"
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x0032
                    com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g
                    r0.isDebugMode()
                    return
                L_0x0032:
                    boolean r0 = com.bytedance.crash.C13933m.m25227c()
                    if (r0 != 0) goto L_0x003e
                    boolean r0 = com.bytedance.crash.entity.C13868e.m25091b()
                    if (r0 == 0) goto L_0x004e
                L_0x003e:
                    com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g
                    r0.isDebugMode()
                L_0x0043:
                    com.bytedance.crash.gwpasan.GwpAsan$1 r1 = new com.bytedance.crash.gwpasan.GwpAsan$1
                    java.lang.String r0 = "XAsanTracker"
                    r1.<init>(r0)
                    r1.start()
                    return
                L_0x004e:
                    boolean r0 = com.bytedance.crash.gwpasan.GwpAsan.m25105b()
                    if (r0 != 0) goto L_0x0043
                    com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.C13933m.f33942g
                    r0.isDebugMode()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.startGwpAsan(int, int, int, int, int, int):void");
            }

            public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
                synchronized (Npth.class) {
                    MethodCollector.m26663i(10180);
                    init(context, iCommonParams, z, z2, z3, z4, 0);
                    MethodCollector.m26664o(10180);
                }
            }

            public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
                String str;
                Application application;
                synchronized (Npth.class) {
                    MethodCollector.m26663i(10342);
                    if (C13933m.f33937b != null) {
                        application = C13933m.f33937b;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        if (application.getBaseContext() == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Param 'application' have not called 'super.attachBaseContext()', please using 'baseContext' param and invoking 'Npth.setApplication(Application)' before init");
                            MethodCollector.m26664o(10342);
                            throw illegalArgumentException;
                        }
                    } else {
                        try {
                            application = (Application) m24922xc16f082c(context);
                            if (application == null) {
                                throw new IllegalArgumentException(str);
                            } else if (application.getBaseContext() != null) {
                                context = application.getBaseContext();
                            }
                        } finally {
                            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Couldn't obtain Application instance before 'super.attachBaseContext()', please invoking 'Npth.setApplication(Application)' before init.");
                            MethodCollector.m26664o(10342);
                        }
                    }
                    init(application, context, iCommonParams, z, z2, z3, z4, j);
                    MethodCollector.m26664o(10342);
                }
            }

            public static synchronized void init(Application application, final Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
                synchronized (Npth.class) {
                    MethodCollector.m26663i(10346);
                    SystemClock.uptimeMillis();
                    if (sInit) {
                        MethodCollector.m26664o(10346);
                        return;
                    }
                    sInit = true;
                    C13933m.m25224a(application, context, iCommonParams);
                    new C13931l() {
                        /* class com.bytedance.crash.Npth.C138101 */

                        static {
                            Covode.recordClassIndex(15865);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.bytedance.crash.C13931l
                        /* renamed from: a */
                        public final String mo22242a() {
                            return C13933m.m25231g();
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.bytedance.crash.C13931l
                        /* renamed from: a */
                        public final void mo22243a(String str, String str2) {
                            Npth.registerSdk(str, str2);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.bytedance.crash.C13931l
                        /* renamed from: b */
                        public final void mo22244b(String str, String str2) {
                            C13933m.m25225a(str + ".so", str2);
                            if (NativeImpl.f33978c) {
                                C13962f.m25280a(str, str2);
                            }
                        }
                    };
                    C13934n.m25234a(application, context, z, z2, z3, z4);
                    C14019n.m25421b().mo22551a(new Runnable() {
                        /* class com.bytedance.crash.Npth.RunnableC138112 */

                        static {
                            Covode.recordClassIndex(15866);
                        }

                        public final void run() {
                            Map<String, Object> a = C13933m.m25221a().mo22518a();
                            int a2 = C14076w.m25652a(a.get("update_version_code"), 0);
                            int a3 = C14076w.m25652a(a.get("aid"), 4444);
                            MonitorCrash init = MonitorCrash.init(context, String.valueOf(a3), (long) a2, String.valueOf(a.get("app_version")));
                            if (init != null) {
                                init.config().setDeviceId(C13933m.m25221a().mo22520c()).setChannel(String.valueOf(a.get("channel")));
                            }
                        }
                    });
                    C13934n.f33964j = new C13934n.C13944b() {
                        /* class com.bytedance.crash.Npth.C138123 */

                        static {
                            Covode.recordClassIndex(15867);
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.bytedance.crash.C13934n.C13944b
                        /* renamed from: a */
                        public final void mo22246a(int i, int i2, int i3, boolean z) {
                            Npth.startNativeHeapTracker(i, i2, i3, z);
                        }
                    };
                    C13934n.f33965k = new C13934n.C13943a() {
                        /* class com.bytedance.crash.Npth.C138134 */

                        static {
                            Covode.recordClassIndex(15868);
                        }

                        /* access modifiers changed from: package-private */
                        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ee, code lost:
                            r8 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f0, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f4, code lost:
                            r8 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f6, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0300, code lost:
                            r8 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0304, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0314, code lost:
                            r8 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0316, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:164:0x031b, code lost:
                            r8 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0334, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b4, code lost:
                            r8 = e;
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Removed duplicated region for block: B:141:0x02ee A[ExcHandler: all (th java.lang.Throwable), Splitter:B:104:0x01ed] */
                        /* JADX WARNING: Removed duplicated region for block: B:144:0x02f4 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:76:0x0199] */
                        /* JADX WARNING: Removed duplicated region for block: B:150:0x0300 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x0086] */
                        /* JADX WARNING: Removed duplicated region for block: B:160:0x0314 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:16:0x004b] */
                        /* JADX WARNING: Removed duplicated region for block: B:164:0x031b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x003c] */
                        @Override // com.bytedance.crash.C13934n.C13943a
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo22248a(java.lang.String r25) {
                            /*
                            // Method dump skipped, instructions count: 860
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.C138134.mo22248a(java.lang.String):void");
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.bytedance.crash.C13934n.C13943a
                        /* renamed from: a */
                        public final void mo22247a(int i, int i2, int i3, int i4, int i5, int i6) {
                            Npth.startGwpAsan(i, i2, i3, i4, i5, i6);
                        }
                    };
                    MethodCollector.m26664o(10346);
                }
            }
        }
