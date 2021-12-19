package com.toutiao.proxyserver;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.toutiao.proxyserver.p4492d.C87308a;
import com.toutiao.proxyserver.p4495g.C87327a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.toutiao.proxyserver.h */
public final class C87331h extends AbstractC87294b {

    /* renamed from: a */
    final File f197943a;

    /* renamed from: b */
    public final LinkedHashMap<String, File> f197944b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    public final ReentrantReadWriteLock.WriteLock f197945c;

    /* renamed from: d */
    public final Set<AbstractC87341a> f197946d;

    /* renamed from: e */
    public volatile long f197947e;

    /* renamed from: f */
    public final C87342b f197948f;

    /* renamed from: g */
    public final Executor f197949g;

    /* renamed from: h */
    public final Runnable f197950h;

    /* renamed from: i */
    public final Handler f197951i;

    /* renamed from: j */
    private final ReentrantReadWriteLock f197952j;

    /* renamed from: k */
    private final ReentrantReadWriteLock.ReadLock f197953k;

    /* renamed from: l */
    private volatile float f197954l;

    /* renamed from: com.toutiao.proxyserver.h$a */
    public interface AbstractC87341a {
        static {
            Covode.recordClassIndex(103237);
        }

        /* renamed from: a */
        void mo141371a(String str);

        /* renamed from: a */
        void mo141372a(Set<String> set);
    }

    static {
        Covode.recordClassIndex(103227);
    }

    /* renamed from: a */
    public final void mo141358a() {
        this.f197951i.removeCallbacks(this.f197950h);
        this.f197951i.postDelayed(this.f197950h, 10000);
    }

    /* renamed from: a */
    public final void mo141360a(AbstractC87341a aVar) {
        this.f197946d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: b */
    public final void mo141328b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f197948f.mo141373a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: c */
    public final void mo141329c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f197948f.mo141375b(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: d */
    public final void mo141330d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f197948f.mo141374a(C87327a.m151540a(str), str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.h$b */
    public final class C87342b {

        /* renamed from: b */
        private final Map<String, Integer> f197968b;

        /* renamed from: c */
        private final Map<String, String> f197969c;

        static {
            Covode.recordClassIndex(103238);
        }

        private C87342b() {
            this.f197968b = new HashMap();
            this.f197969c = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final synchronized void mo141376c(String str) {
            MethodCollector.m26663i(13633);
            if (!TextUtils.isEmpty(str)) {
                this.f197969c.remove(str);
            }
            MethodCollector.m26664o(13633);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final synchronized boolean mo141377d(String str) {
            MethodCollector.m26663i(13695);
            if (!TextUtils.isEmpty(str)) {
                boolean containsKey = this.f197968b.containsKey(str);
                MethodCollector.m26664o(13695);
                return containsKey;
            }
            MethodCollector.m26664o(13695);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo141373a(String str) {
            MethodCollector.m26663i(13577);
            if (!TextUtils.isEmpty(str)) {
                if (!this.f197969c.containsKey(str)) {
                    Integer num = this.f197968b.get(str);
                    if (num == null) {
                        this.f197968b.put(str, 1);
                        MethodCollector.m26664o(13577);
                        return;
                    }
                    this.f197968b.put(str, Integer.valueOf(num.intValue() + 1));
                } else {
                    C87308a aVar = new C87308a();
                    MethodCollector.m26664o(13577);
                    throw aVar;
                }
            }
            MethodCollector.m26664o(13577);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final synchronized void mo141375b(String str) {
            Integer num;
            MethodCollector.m26663i(13631);
            if (!TextUtils.isEmpty(str) && (num = this.f197968b.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f197968b.remove(str);
                    String str2 = this.f197969c.get(str);
                    if (str2 != null) {
                        C87331h.this.mo141361f(str2);
                    }
                    MethodCollector.m26664o(13631);
                    return;
                }
                this.f197968b.put(str, Integer.valueOf(num.intValue() - 1));
            }
            MethodCollector.m26664o(13631);
        }

        /* synthetic */ C87342b(C87331h hVar, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo141374a(String str, String str2) {
            MethodCollector.m26663i(13632);
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!this.f197968b.containsKey(str) || !file.exists()) {
                    C87331h.this.mo141361f(str2);
                } else {
                    this.f197969c.put(str, str2);
                    MethodCollector.m26664o(13632);
                    return;
                }
            }
            MethodCollector.m26664o(13632);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: e */
    public final File mo141331e(String str) {
        if (!this.f197953k.tryLock()) {
            return null;
        }
        File file = this.f197944b.get(str);
        this.f197953k.unlock();
        return file;
    }

    /* renamed from: f */
    public final void mo141361f(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C87371t.m151640a().mo141413a(str);
            this.f197951i.removeCallbacks(this.f197950h);
            this.f197949g.execute(new Runnable() {
                /* class com.toutiao.proxyserver.C87331h.RunnableC873397 */

                static {
                    Covode.recordClassIndex(103235);
                }

                public final void run() {
                    HashSet hashSet;
                    String a = C87327a.m151540a(str);
                    C87331h.this.f197945c.lock();
                    try {
                        File file = C87331h.this.f197944b.get(a);
                        if (file == null || C87331h.this.f197948f.mo141377d(file.getName()) || !m151577a(file)) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet(1);
                            hashSet.add(a);
                            C87331h.this.f197944b.remove(a);
                            C87331h.this.f197948f.mo141376c(a);
                            file.getName();
                        }
                        if (hashSet != null) {
                            for (AbstractC87341a aVar : C87331h.this.f197946d) {
                                aVar.mo141372a(hashSet);
                            }
                        }
                    } finally {
                        C87331h.this.f197945c.unlock();
                    }
                }

                /* renamed from: a */
                private static boolean m151577a(File file) {
                    MethodCollector.m26663i(11702);
                    try {
                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                        }
                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                            MethodCollector.m26664o(11702);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.m26664o(11702);
                    return delete;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: a */
    public final File mo98175a(String str) {
        this.f197953k.lock();
        File file = this.f197944b.get(str);
        this.f197953k.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f197943a, str);
        this.f197945c.lock();
        this.f197944b.put(str, file2);
        this.f197945c.unlock();
        for (AbstractC87341a aVar : this.f197946d) {
            aVar.mo141371a(str);
        }
        mo141358a();
        return file2;
    }

    public C87331h(File file) {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f197952j = reentrantReadWriteLock;
        this.f197953k = reentrantReadWriteLock.readLock();
        this.f197945c = reentrantReadWriteLock.writeLock();
        this.f197946d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f197947e = 104857600;
        this.f197954l = 0.5f;
        this.f197948f = new C87342b(this, (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactory() {
            /* class com.toutiao.proxyserver.C87331h.ThreadFactoryC873321 */

            static {
                Covode.recordClassIndex(103228);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("DiskLruCache-cleanup-" + thread.getId());
                thread.setDaemon(true);
                return thread;
            }
        }, new RejectedExecutionHandler() {
            /* class com.toutiao.proxyserver.C87331h.RejectedExecutionHandlerC873332 */

            static {
                Covode.recordClassIndex(103229);
            }

            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
        this.f197949g = threadPoolExecutor;
        this.f197950h = new Runnable() {
            /* class com.toutiao.proxyserver.C87331h.RunnableC873343 */

            static {
                Covode.recordClassIndex(103230);
            }

            public final void run() {
                C87331h.this.f197949g.execute(new Runnable() {
                    /* class com.toutiao.proxyserver.C87331h.RunnableC873343.RunnableC873351 */

                    static {
                        Covode.recordClassIndex(103231);
                    }

                    public final void run() {
                        C87331h.this.mo141359a(C87331h.this.f197947e);
                    }
                });
            }
        };
        this.f197951i = new Handler(Looper.getMainLooper());
        if (file == null) {
            str = " dir null";
        } else if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        } else {
            this.f197943a = file;
            threadPoolExecutor.execute(new Runnable() {
                /* class com.toutiao.proxyserver.C87331h.RunnableC873364 */

                static {
                    Covode.recordClassIndex(103232);
                }

                /* JADX INFO: finally extract failed */
                public final void run() {
                    C87331h hVar = C87331h.this;
                    hVar.f197945c.lock();
                    try {
                        File[] listFiles = hVar.f197943a.listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            HashMap hashMap = new HashMap(listFiles.length);
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file : listFiles) {
                                if (file.isFile()) {
                                    arrayList.add(file);
                                    hashMap.put(file, Long.valueOf(file.lastModified()));
                                }
                            }
                            Collections.sort(arrayList, new Comparator<File>(hashMap) {
                                /* class com.toutiao.proxyserver.C87331h.C873375 */

                                /* renamed from: a */
                                final /* synthetic */ HashMap f197960a;

                                static {
                                    Covode.recordClassIndex(103233);
                                }

                                {
                                    this.f197960a = r2;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(File file, File file2) {
                                    long longValue = ((Long) this.f197960a.get(file)).longValue() - ((Long) this.f197960a.get(file2)).longValue();
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
                                File file2 = (File) it.next();
                                hVar.f197944b.put(file2.getName(), file2);
                            }
                        }
                        hVar.f197945c.unlock();
                        hVar.mo141358a();
                    } catch (Throwable th) {
                        hVar.f197945c.unlock();
                        throw th;
                    }
                }
            });
            return;
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo141359a(long j) {
        HashSet hashSet;
        MethodCollector.m26663i(12017);
        final HashSet hashSet2 = new HashSet();
        this.f197945c.lock();
        long j2 = 0;
        try {
            for (Map.Entry<String, File> entry : this.f197944b.entrySet()) {
                j2 += entry.getValue().length();
            }
            if (j2 <= j) {
                this.f197945c.unlock();
                MethodCollector.m26664o(12017);
                return;
            }
            long j3 = (long) (((float) j) * this.f197954l);
            hashSet = new HashSet();
            try {
                for (Map.Entry<String, File> entry2 : this.f197944b.entrySet()) {
                    File value = entry2.getValue();
                    if (value == null || !value.exists()) {
                        hashSet.add(entry2.getKey());
                    } else if (!this.f197948f.mo141377d(value.getName())) {
                        long length = value.length();
                        File file = new File(value.getAbsolutePath() + "-tmp");
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j2 -= length;
                            hashSet.add(entry2.getKey());
                        }
                    }
                    if (j2 <= j3) {
                        break;
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    this.f197944b.remove((String) it.next());
                }
            } catch (Throwable unused) {
            }
            this.f197945c.unlock();
            for (AbstractC87341a aVar : this.f197946d) {
                aVar.mo141372a(hashSet);
            }
            this.f197949g.execute(new Runnable() {
                /* class com.toutiao.proxyserver.C87331h.RunnableC873408 */

                static {
                    Covode.recordClassIndex(103236);
                }

                public final void run() {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        try {
                            m151578a((File) it.next());
                        } catch (Throwable unused) {
                        }
                    }
                }

                /* renamed from: a */
                private static boolean m151578a(File file) {
                    MethodCollector.m26663i(11700);
                    try {
                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                        }
                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                            MethodCollector.m26664o(11700);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.m26664o(11700);
                    return delete;
                }
            });
            MethodCollector.m26664o(12017);
        } catch (Throwable unused2) {
            hashSet = null;
        }
    }
}
