package com.p2082ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.ttvideoengine.p4417j.C86533n;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.ttvideoengine.av */
public final class C86356av {

    /* renamed from: d */
    static String f193449d = "VideoCacheManager";

    /* renamed from: e */
    static volatile File f193450e;

    /* renamed from: a */
    final LinkedHashMap<String, File> f193451a;

    /* renamed from: b */
    final LinkedHashMap<String, C86533n> f193452b;

    /* renamed from: c */
    final ReentrantReadWriteLock.WriteLock f193453c;

    /* renamed from: f */
    public volatile long f193454f;

    /* renamed from: g */
    volatile boolean f193455g;

    /* renamed from: h */
    private final ReentrantReadWriteLock f193456h;

    /* renamed from: i */
    private final ReentrantReadWriteLock.ReadLock f193457i;

    /* renamed from: j */
    private volatile float f193458j;

    /* renamed from: k */
    private final C86360b f193459k;

    /* renamed from: l */
    private C86358a f193460l;

    /* renamed from: a */
    public static C86356av m148901a() {
        return C86361c.f193467a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.av$b */
    public static final class C86360b {

        /* renamed from: a */
        private final Map<String, Integer> f193466a;

        static {
            Covode.recordClassIndex(101588);
        }

        private C86360b() {
            this.f193466a = new HashMap();
        }

        /* synthetic */ C86360b(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean mo137332a(String str) {
            MethodCollector.m26663i(5705);
            if (!TextUtils.isEmpty(str)) {
                boolean containsKey = this.f193466a.containsKey(str);
                MethodCollector.m26664o(5705);
                return containsKey;
            }
            MethodCollector.m26664o(5705);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.av$c */
    public static class C86361c {

        /* renamed from: a */
        public static final C86356av f193467a = new C86356av((byte) 0);

        static {
            Covode.recordClassIndex(101589);
        }
    }

    static {
        Covode.recordClassIndex(101584);
    }

    /* renamed from: com.ss.ttvideoengine.av$a */
    static class C86358a {

        /* renamed from: a */
        private HandlerThread f193463a;

        /* renamed from: b */
        private Handler f193464b;

        static {
            Covode.recordClassIndex(101586);
        }

        public C86358a() {
            try {
                HandlerThread handlerThread = new HandlerThread("clearCacheThread");
                this.f193463a = handlerThread;
                handlerThread.start();
                this.f193464b = new Handler(this.f193463a.getLooper()) {
                    /* class com.p2082ss.ttvideoengine.C86356av.C86358a.HandlerC863591 */

                    static {
                        Covode.recordClassIndex(101587);
                    }

                    public final void handleMessage(Message message) {
                        File file;
                        String b;
                        MethodCollector.m26663i(5720);
                        if (message == null) {
                            MethodCollector.m26664o(5720);
                            return;
                        }
                        try {
                            C86356av avVar = (C86356av) message.obj;
                            int i = message.what;
                            if (i == 0) {
                                C86641i.m150110a(C86356av.f193449d, C1764a.m5928a("start init videocachemanager", new Object[0]));
                                avVar.f193453c.lock();
                                try {
                                    if (!avVar.f193455g && (file = C86356av.f193450e) != null && file.exists() && file.isDirectory() && file.canRead()) {
                                        if (file.canWrite()) {
                                            File[] listFiles = C86356av.f193450e.listFiles();
                                            if (listFiles != null && listFiles.length > 0) {
                                                HashMap hashMap = new HashMap(listFiles.length);
                                                ArrayList arrayList = new ArrayList(listFiles.length);
                                                for (File file2 : listFiles) {
                                                    if (file2.isFile()) {
                                                        arrayList.add(file2);
                                                        hashMap.put(file2, Long.valueOf(file2.lastModified()));
                                                    }
                                                }
                                                Collections.sort(arrayList, new Comparator<File>(hashMap) {
                                                    /* class com.p2082ss.ttvideoengine.C86356av.C863571 */

                                                    /* renamed from: a */
                                                    final /* synthetic */ HashMap f193461a;

                                                    static {
                                                        Covode.recordClassIndex(101585);
                                                    }

                                                    {
                                                        this.f193461a = r2;
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                    @Override // java.util.Comparator
                                                    public final /* synthetic */ int compare(File file, File file2) {
                                                        long longValue = ((Long) this.f193461a.get(file)).longValue() - ((Long) this.f193461a.get(file2)).longValue();
                                                        if (longValue < 0) {
                                                            return -1;
                                                        }
                                                        if (longValue > 0) {
                                                            return 1;
                                                        }
                                                        return 0;
                                                    }
                                                });
                                                Iterator it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    File file3 = (File) it.next();
                                                    C86641i.m150110a(C86356av.f193449d, C1764a.m5928a("add file:%s", new Object[]{file3.getName()}));
                                                    avVar.f193451a.put(file3.getName(), file3);
                                                    String[] a = C86356av.m148904a(file3);
                                                    if (C86356av.m148903a(a)) {
                                                        String a2 = C1764a.m5928a("%s_%s", new Object[]{a[0], a[1]});
                                                        String a3 = C1764a.m5928a("%s_%s_%s_%s", new Object[]{a[0], a[1], a[2], a[3]});
                                                        String str = null;
                                                        if (a.length == 5) {
                                                            str = a[4];
                                                        }
                                                        String canonicalPath = file3.getCanonicalPath();
                                                        if (str != null && str.length() > 0 && (b = C86640h.m150090b(str)) != null && !b.equals(str)) {
                                                            canonicalPath = canonicalPath.replace(str, b);
                                                            file3.renameTo(new File(canonicalPath));
                                                            str = b;
                                                        }
                                                        avVar.f193452b.put(a2, new C86533n(canonicalPath, a3, a3, str));
                                                    }
                                                }
                                            }
                                            avVar.f193455g = true;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                avVar.f193453c.unlock();
                                C86641i.m150113b(C86356av.f193449d, C1764a.m5928a("end init videocachemanager", new Object[0]));
                                MethodCollector.m26664o(5720);
                            } else if (i != 1) {
                                if (i == 2) {
                                    avVar.mo137329c();
                                }
                                MethodCollector.m26664o(5720);
                            } else {
                                avVar.mo137328b();
                                MethodCollector.m26664o(5720);
                            }
                        } catch (Throwable unused2) {
                            MethodCollector.m26664o(5720);
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f193463a = null;
                this.f193464b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137328b() {
        C86641i.m150113b(f193449d, C1764a.m5928a("start clear all cache", new Object[0]));
        m148902a(0);
        C86641i.m150113b(f193449d, C1764a.m5928a("end clear all cache", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo137329c() {
        C86641i.m150113b(f193449d, C1764a.m5928a("start clean file maxSize:%d", new Object[]{Long.valueOf(this.f193454f)}));
        m148902a(this.f193454f);
        C86641i.m150113b(f193449d, C1764a.m5928a("end clean file maxSize:%d", new Object[]{Long.valueOf(this.f193454f)}));
    }

    private C86356av() {
        this.f193451a = new LinkedHashMap<>(0, 0.75f, true);
        this.f193452b = new LinkedHashMap<>(0, 0.75f, true);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f193456h = reentrantReadWriteLock;
        this.f193457i = reentrantReadWriteLock.readLock();
        this.f193453c = reentrantReadWriteLock.writeLock();
        this.f193454f = 209715200;
        this.f193458j = 0.3f;
        this.f193455g = false;
        this.f193459k = new C86360b((byte) 0);
        this.f193460l = new C86358a();
    }

    /* synthetic */ C86356av(byte b) {
        this();
    }

    /* renamed from: a */
    static String[] m148904a(File file) {
        String name = file.getName();
        if (name == null) {
            return null;
        }
        return m148905a(name);
    }

    /* renamed from: a */
    static boolean m148903a(String[] strArr) {
        if (strArr == null || !(strArr.length == 4 || strArr.length == 5)) {
            return false;
        }
        for (String str : strArr) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static String[] m148905a(String str) {
        String[] split;
        if (str == null || (split = str.split("\\.")) == null || split.length <= 0) {
            return null;
        }
        return split[0].split("_");
    }

    /* renamed from: b */
    private static boolean m148906b(File file) {
        MethodCollector.m26663i(4817);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4817);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4817);
        return delete;
    }

    /* renamed from: a */
    private void m148902a(long j) {
        MethodCollector.m26663i(4811);
        HashSet hashSet = new HashSet();
        C86641i.m150113b(f193449d, C1764a.m5928a("start trim", new Object[0]));
        this.f193453c.lock();
        long j2 = 0;
        try {
            for (Map.Entry<String, File> entry : this.f193451a.entrySet()) {
                j2 += entry.getValue().length();
            }
            C86641i.m150113b(f193449d, C1764a.m5928a("current file size:%d,maxsize:%d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
            if (j2 <= j) {
                this.f193453c.unlock();
                MethodCollector.m26664o(4811);
                return;
            }
            long j3 = (long) (((float) j) * this.f193458j);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (Map.Entry<String, File> entry2 : this.f193451a.entrySet()) {
                File value = entry2.getValue();
                if (value == null || !value.exists()) {
                    hashSet2.add(entry2.getKey());
                } else if (!this.f193459k.mo137332a(value.getName())) {
                    long length = value.length();
                    File file = new File(value.getAbsolutePath() + "-tmp");
                    if (value.renameTo(file)) {
                        hashSet.add(file);
                        j2 -= length;
                        hashSet2.add(entry2.getKey());
                        String[] a = m148904a(value);
                        if (m148903a(a)) {
                            hashSet3.add(C1764a.m5928a("%s_%s", new Object[]{a[0], a[1]}));
                        }
                    }
                }
                if (j2 <= j3) {
                    break;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                this.f193451a.remove((String) it.next());
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                this.f193452b.remove((String) it2.next());
            }
            this.f193453c.unlock();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                File file2 = (File) it3.next();
                try {
                    String str = f193449d;
                    try {
                        C86641i.m150113b(str, C1764a.m5928a("delete file name:%s", new Object[]{file2.getName()}));
                        m148906b(file2);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
            C86641i.m150113b(f193449d, C1764a.m5928a("end trim", new Object[0]));
            MethodCollector.m26664o(4811);
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public final void mo137327a(String str, String str2) {
        if (this.f193453c.tryLock()) {
            try {
                String[] a = m148905a(str);
                if (m148903a(a)) {
                    String a2 = C1764a.m5928a("%s_%s", new Object[]{a[0], a[1]});
                    String a3 = C1764a.m5928a("%s_%s_%s_%s", new Object[]{a[0], a[1], a[2], a[3]});
                    String str3 = null;
                    if (a.length == 5) {
                        str3 = a[4];
                    }
                    C86533n nVar = new C86533n(str2, a3, a3, str3);
                    if (!this.f193452b.containsKey(a2)) {
                        this.f193452b.put(a2, nVar);
                    }
                }
            } catch (Throwable unused) {
            }
            this.f193453c.unlock();
        }
    }
}
