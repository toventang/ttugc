package com.bytedance.ies.watcher;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.legoImp.WatcherImpl;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.watcher.c */
public final class C18285c {

    /* renamed from: a */
    public static final C18285c f43644a = new C18285c();

    /* renamed from: b */
    private static final Handler f43645b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final HashMap<String, Long> f43646c = new HashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<String, Object> f43647d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final AbstractC89244h f43648e = C89250i.m154773a((AbstractC89171a) C18286a.f43649a);

    /* renamed from: a */
    public static AbstractC18284b m34002a() {
        return (AbstractC18284b) f43648e.getValue();
    }

    /* renamed from: a */
    public static final void m34005a(String str, String str2, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(obj, "");
    }

    private C18285c() {
    }

    /* renamed from: com.bytedance.ies.watcher.c$b */
    static final class RunnableC18287b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f43650a;

        static {
            Covode.recordClassIndex(20958);
        }

        RunnableC18287b(String str) {
            this.f43650a = str;
        }

        public final void run() {
            C18285c.m34006b(this.f43650a);
        }
    }

    /* renamed from: com.bytedance.ies.watcher.c$a */
    static final class C18286a extends AbstractC89220m implements AbstractC89171a<AbstractC18284b> {

        /* renamed from: a */
        public static final C18286a f43649a = new C18286a();

        static {
            Covode.recordClassIndex(20957);
        }

        C18286a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC18284b invoke() {
            IWatcher b = WatcherImpl.m105269b();
            if (b != null) {
                return b.mo29237a();
            }
            return new C18283a();
        }
    }

    static {
        Covode.recordClassIndex(20956);
    }

    /* renamed from: c */
    public static final void m34007c(String str) {
        C89219l.m154719c(str, "");
        f43645b.post(new RunnableC18287b(str));
    }

    /* renamed from: b */
    public static final synchronized void m34006b(String str) {
        synchronized (C18285c.class) {
            MethodCollector.m26663i(14208);
            C89219l.m154719c(str, "");
            Long remove = f43646c.remove(str);
            if (remove != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - remove.longValue();
                if (elapsedRealtime < 30000) {
                    m34002a().mo29238a(str, elapsedRealtime);
                }
            }
            MethodCollector.m26664o(14208);
        }
    }

    /* renamed from: a */
    public static final synchronized void m34003a(String str) {
        synchronized (C18285c.class) {
            MethodCollector.m26663i(14193);
            C89219l.m154719c(str, "");
            HashMap<String, Long> hashMap = f43646c;
            Long l = hashMap.get(str);
            if (l == null) {
                hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            } else if (SystemClock.elapsedRealtime() - l.longValue() >= 30000) {
                hashMap.remove(str);
                MethodCollector.m26664o(14193);
                return;
            }
            MethodCollector.m26664o(14193);
        }
    }

    /* renamed from: a */
    public static final void m34004a(String str, long j) {
        C89219l.m154719c(str, "");
        m34002a().mo29238a(str, j);
    }
}
