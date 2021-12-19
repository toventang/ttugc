package com.airbnb.lottie.p106i;

import android.os.Handler;
import android.os.HandlerThread;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.lottie.i.c */
public final class C2189c {

    /* renamed from: a */
    public static final C2189c f6533a = new C2189c();

    /* renamed from: b */
    private static final ConcurrentHashMap<Integer, Handler> f6534b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static long f6535c;

    /* renamed from: d */
    private static final ArrayList<Handler> f6536d = new ArrayList<>();

    private C2189c() {
    }

    static {
        Covode.recordClassIndex(2384);
    }

    /* renamed from: a */
    public static Handler m6768a(C2122g gVar) {
        Handler handler;
        MethodCollector.m26663i(13092);
        C89219l.m154719c(gVar, "");
        ConcurrentHashMap<Integer, Handler> concurrentHashMap = f6534b;
        synchronized (concurrentHashMap) {
            try {
                int hashCode = gVar.hashCode();
                if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                    int max = Math.max(C2144d.C2149e.f6505b, 1);
                    long j = f6535c;
                    f6535c = 1 + j;
                    int i = (int) (j % ((long) max));
                    ArrayList<Handler> arrayList = f6536d;
                    if (arrayList.size() > i) {
                        Integer valueOf = Integer.valueOf(hashCode);
                        Handler handler2 = arrayList.get(i);
                        C89219l.m154709a((Object) handler2, "");
                        concurrentHashMap.put(valueOf, handler2);
                        Handler handler3 = concurrentHashMap.get(Integer.valueOf(hashCode));
                        if (handler3 == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) handler3, "");
                        handler = handler3;
                    } else {
                        System.currentTimeMillis();
                        HandlerThread handlerThread = new HandlerThread("LottieWorkThread-".concat(String.valueOf(i)));
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                        arrayList.add(handler);
                        concurrentHashMap.put(Integer.valueOf(hashCode), handler);
                        if (C2144d.f6474a) {
                            System.currentTimeMillis();
                        }
                    }
                    return handler;
                }
                Handler handler4 = concurrentHashMap.get(Integer.valueOf(hashCode));
                if (handler4 == null) {
                    C89219l.m154707a();
                }
                Handler handler5 = handler4;
                MethodCollector.m26664o(13092);
                return handler5;
            } finally {
                MethodCollector.m26664o(13092);
            }
        }
    }
}
