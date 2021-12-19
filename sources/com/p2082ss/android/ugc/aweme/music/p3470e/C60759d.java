package com.p2082ss.android.ugc.aweme.music.p3470e;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.toutiao.proxyserver.C87369r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.e.d */
public final class C60759d extends C87369r {

    /* renamed from: j */
    public static final C60761a f138065j = new C60761a((byte) 0);

    /* renamed from: a */
    public final ThreadPoolExecutor f138066a;

    /* renamed from: b */
    public final LinkedHashMap<String, File> f138067b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    public final ReentrantReadWriteLock.WriteLock f138068c;

    /* renamed from: d */
    volatile float f138069d;

    /* renamed from: e */
    final Runnable f138070e;

    /* renamed from: f */
    final Handler f138071f;

    /* renamed from: g */
    final File f138072g;

    /* renamed from: h */
    public final long f138073h;

    /* renamed from: i */
    final List<String> f138074i;

    /* renamed from: l */
    private final ReentrantReadWriteLock f138075l;

    /* renamed from: m */
    private final ReentrantReadWriteLock.ReadLock f138076m;

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$d */
    static final class RejectedExecutionHandlerC60765d implements RejectedExecutionHandler {

        /* renamed from: a */
        public static final RejectedExecutionHandlerC60765d f138081a = new RejectedExecutionHandlerC60765d();

        static {
            Covode.recordClassIndex(71322);
        }

        RejectedExecutionHandlerC60765d() {
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        Covode.recordClassIndex(71316);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$a */
    public static final class C60761a {
        static {
            Covode.recordClassIndex(71318);
        }

        private C60761a() {
        }

        public /* synthetic */ C60761a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$b */
    static final class RunnableC60762b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C60759d f138078a;

        static {
            Covode.recordClassIndex(71319);
        }

        RunnableC60762b(C60759d dVar) {
            this.f138078a = dVar;
        }

        public final void run() {
            MethodCollector.m26663i(4056);
            this.f138078a.f138066a.execute(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3470e.C60759d.RunnableC60762b.RunnableC607631 */

                /* renamed from: a */
                final /* synthetic */ RunnableC60762b f138079a;

                static {
                    Covode.recordClassIndex(71320);
                }

                {
                    this.f138079a = r1;
                }

                public final void run() {
                    MethodCollector.m26663i(4303);
                    C60759d dVar = this.f138079a.f138078a;
                    long j = this.f138079a.f138078a.f138073h;
                    HashSet hashSet = new HashSet();
                    dVar.f138068c.lock();
                    long j2 = 0;
                    try {
                        for (Map.Entry<String, File> entry : dVar.f138067b.entrySet()) {
                            j2 += entry.getValue().length();
                        }
                        if (j2 <= j) {
                            dVar.f138068c.unlock();
                            MethodCollector.m26664o(4303);
                            return;
                        }
                        long j3 = (long) (((float) j) * dVar.f138069d);
                        HashSet hashSet2 = new HashSet();
                        for (Map.Entry<String, File> entry2 : dVar.f138067b.entrySet()) {
                            String key = entry2.getKey();
                            File value = entry2.getValue();
                            if (value != null && value.exists()) {
                                if (!dVar.f138074i.contains(value.getPath())) {
                                    value.getName();
                                    long length = value.length();
                                    File file = new File(value.getAbsolutePath() + "-tmp");
                                    if (value.renameTo(file)) {
                                        hashSet.add(file);
                                        j2 -= length;
                                        hashSet2.add(key);
                                    }
                                } else {
                                    value.getName();
                                }
                            }
                            if (j2 <= j3) {
                                break;
                            }
                        }
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            dVar.f138067b.remove((String) it.next());
                        }
                        dVar.f138068c.unlock();
                        dVar.f138066a.execute(new RunnableC60767f(hashSet));
                        MethodCollector.m26664o(4303);
                    } catch (Throwable unused) {
                    }
                }
            });
            MethodCollector.m26664o(4056);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$f */
    static final class RunnableC60767f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HashSet f138083a;

        static {
            Covode.recordClassIndex(71324);
        }

        RunnableC60767f(HashSet hashSet) {
            this.f138083a = hashSet;
        }

        public final void run() {
            Iterator it = this.f138083a.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    StringBuilder sb = new StringBuilder("MusicDiskLruCache: music cache file: ");
                    C89219l.m154716b(file, "");
                    C73991bj.m130133d(sb.append(file.getName()).append(" really delete").toString());
                    m110298a(file);
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: a */
        private static boolean m110298a(File file) {
            MethodCollector.m26663i(4814);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(4814);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(4814);
            return delete;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$e */
    public static final class C60766e implements Comparator<File> {

        /* renamed from: a */
        final /* synthetic */ HashMap f138082a;

        static {
            Covode.recordClassIndex(71323);
        }

        C60766e(HashMap hashMap) {
            this.f138082a = hashMap;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            C89219l.m154721d(file, "");
            C89219l.m154721d(file2, "");
            Long l = (Long) this.f138082a.get(file);
            Long l2 = -1L;
            if (l == null) {
                l = l2;
            }
            C89219l.m154716b(l, "");
            long longValue = l.longValue();
            Long l3 = (Long) this.f138082a.get(file2);
            if (l3 != null) {
                l2 = l3;
            }
            C89219l.m154716b(l2, "");
            long longValue2 = longValue - l2.longValue();
            if (longValue2 < 0) {
                return -1;
            }
            if (longValue2 > 0) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.d$c */
    static final class ThreadFactoryC60764c implements ThreadFactory {

        /* renamed from: a */
        public static final ThreadFactoryC60764c f138080a = new ThreadFactoryC60764c();

        static {
            Covode.recordClassIndex(71321);
        }

        ThreadFactoryC60764c() {
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("MusicDiskLruCache-cleanup-" + thread.getId());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Override // com.toutiao.proxyserver.C87369r, com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: a */
    public final File mo98175a(String str) {
        C89219l.m154721d(str, "");
        this.f138076m.lock();
        File file = this.f138067b.get(str);
        if (file != null) {
            List<String> list = this.f138074i;
            String path = file.getPath();
            C89219l.m154716b(path, "");
            list.add(path);
        }
        this.f138076m.unlock();
        if (file != null) {
            return file;
        }
        File f = mo141410f(str);
        this.f138068c.lock();
        LinkedHashMap<String, File> linkedHashMap = this.f138067b;
        C89219l.m154716b(f, "");
        linkedHashMap.put(str, f);
        List<String> list2 = this.f138074i;
        String path2 = f.getPath();
        C89219l.m154716b(path2, "");
        list2.add(path2);
        this.f138068c.unlock();
        return f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60759d(File file, long j, List<String> list) {
        super(file);
        C89219l.m154721d(file, "");
        C89219l.m154721d(list, "");
        MethodCollector.m26663i(4276);
        this.f138072g = file;
        this.f138073h = j;
        this.f138074i = list;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), ThreadFactoryC60764c.f138080a, RejectedExecutionHandlerC60765d.f138081a);
        this.f138066a = threadPoolExecutor;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f138075l = reentrantReadWriteLock;
        this.f138076m = reentrantReadWriteLock.readLock();
        this.f138068c = reentrantReadWriteLock.writeLock();
        this.f138069d = 0.5f;
        this.f138070e = new RunnableC60762b(this);
        this.f138071f = new Handler(Looper.getMainLooper());
        if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            IOException iOException = new IOException("dir error!  ".concat(String.valueOf("exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite())));
            MethodCollector.m26664o(4276);
            throw iOException;
        }
        threadPoolExecutor.execute(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.music.p3470e.C60759d.RunnableC607601 */

            /* renamed from: a */
            final /* synthetic */ C60759d f138077a;

            static {
                Covode.recordClassIndex(71317);
            }

            {
                this.f138077a = r1;
            }

            /* JADX INFO: finally extract failed */
            public final void run() {
                C60759d dVar = this.f138077a;
                dVar.f138068c.lock();
                long j = 0;
                try {
                    File[] listFiles = dVar.f138072g.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length != 0) {
                            HashMap hashMap = new HashMap(listFiles.length);
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file : listFiles) {
                                C89219l.m154716b(file, "");
                                if (file.isFile()) {
                                    arrayList.add(file);
                                    j += file.length();
                                    hashMap.put(file, Long.valueOf(file.lastModified()));
                                }
                            }
                            C39162r.m79460a("tool_performance_effect_storage_space", new C33744d().mo59981a("music_size", j).f79943a);
                            Collections.sort(arrayList, new C60766e(hashMap));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                LinkedHashMap<String, File> linkedHashMap = dVar.f138067b;
                                C89219l.m154716b(file2, "");
                                String name = file2.getName();
                                C89219l.m154716b(name, "");
                                linkedHashMap.put(name, file2);
                            }
                        }
                    }
                    dVar.f138068c.unlock();
                    dVar.f138071f.removeCallbacks(dVar.f138070e);
                    dVar.f138071f.postDelayed(dVar.f138070e, 10000);
                } catch (Throwable th) {
                    dVar.f138068c.unlock();
                    throw th;
                }
            }
        });
        MethodCollector.m26664o(4276);
    }
}
