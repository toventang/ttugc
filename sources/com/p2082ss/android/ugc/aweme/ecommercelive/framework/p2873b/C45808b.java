package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.b.b */
public final class C45808b {

    /* renamed from: a */
    public static final C45808b f106721a = new C45808b();

    /* renamed from: b */
    private static final long f106722b = (((long) Process.myPid()) << 16);

    /* renamed from: c */
    private static final HandlerThread f106723c;

    /* renamed from: d */
    private static final Handler f106724d;

    /* renamed from: e */
    private static final AtomicInteger f106725e = new AtomicInteger(1);

    /* renamed from: f */
    private static final WeakHashMap<C45809a, Map<String, Object>> f106726f = new WeakHashMap<>();

    /* renamed from: g */
    private static final C0489d<C45809a> f106727g = new C0489d<>();

    private C45808b() {
    }

    static {
        Covode.recordClassIndex(54327);
        HandlerThread handlerThread = new HandlerThread("keys_keep");
        f106723c = handlerThread;
        handlerThread.start();
        f106724d = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final synchronized C45809a mo77120a(String str) {
        C45809a aVar;
        MethodCollector.m26663i(2157);
        C89219l.m154721d(str, "");
        aVar = new C45809a(f106722b | ((long) f106725e.getAndAdd(1)), str);
        f106726f.put(aVar, new LinkedHashMap());
        MethodCollector.m26664o(2157);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized Map<String, Object> mo77121a(C45809a aVar) {
        Map<String, Object> map;
        MethodCollector.m26663i(2189);
        C89219l.m154721d(aVar, "");
        WeakHashMap<C45809a, Map<String, Object>> weakHashMap = f106726f;
        map = weakHashMap.get(aVar);
        if (map == null) {
            map = new LinkedHashMap<>();
            weakHashMap.put(aVar, map);
        }
        MethodCollector.m26664o(2189);
        return map;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.b.b$a */
    public static final class C45809a {

        /* renamed from: a */
        public C45809a f106728a;

        /* renamed from: b */
        public final long f106729b;

        /* renamed from: c */
        public final String f106730c;

        static {
            Covode.recordClassIndex(54328);
        }

        public C45809a(long j, String str) {
            C89219l.m154721d(str, "");
            this.f106729b = j;
            this.f106730c = str;
        }
    }
}
