package com.bytedance.helios.api.p1088b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.p1088b.AbstractC15310h;
import com.bytedance.helios.api.p1088b.p1089a.C15303a;
import com.bytedance.helios.api.p1090c.C15325a;
import com.bytedance.helios.api.p1090c.C15326b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.o */
public final class C15320o {

    /* renamed from: a */
    static final List<AbstractC15305c> f37381a = new ArrayList();

    /* renamed from: b */
    public static AbstractC15305c f37382b;

    /* renamed from: c */
    public static final List<AbstractC15309g> f37383c = new ArrayList();

    /* renamed from: d */
    public static AbstractC15305c f37384d;

    /* renamed from: e */
    static final Object f37385e = new Object();

    /* renamed from: f */
    public static final Handler f37386f;

    /* renamed from: g */
    public static AbstractC15315l f37387g;

    /* renamed from: h */
    public static final C15320o f37388h = new C15320o();

    private C15320o() {
    }

    static {
        Covode.recordClassIndex(17550);
        HandlerThread handlerThread = new HandlerThread("helios.consumer", 0);
        handlerThread.start();
        handlerThread.setUncaughtExceptionHandler(C15325a.f37401a);
        Looper looper = handlerThread.getLooper();
        C89219l.m154709a((Object) looper, "");
        f37386f = new HandlerC15321a(looper);
    }

    /* renamed from: com.bytedance.helios.api.b.o$a */
    public static final class HandlerC15321a extends Handler {
        static {
            Covode.recordClassIndex(17551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC15321a(Looper looper) {
            super(looper);
            C89219l.m154719c(looper, "");
        }

        public final void handleMessage(Message message) {
            AbstractC15315l lVar;
            List<C15314k> jsbEvents;
            MethodCollector.m26663i(3359);
            C89219l.m154719c(message, "");
            super.handleMessage(message);
            int i = message.what;
            if (i == 1000) {
                Object obj = message.obj;
                if (obj != null) {
                    C15318n nVar = (C15318n) obj;
                    Iterator<T> it = C15320o.f37383c.iterator();
                    while (it.hasNext()) {
                        it.next().mo24832a(nVar);
                    }
                    if (nVar.f37351C == null && (lVar = C15320o.f37387g) != null && (jsbEvents = lVar.getJsbEvents()) != null && (!jsbEvents.isEmpty())) {
                        nVar.f37352D = jsbEvents;
                        nVar.f37351C = "jsb";
                    }
                    synchronized (C15320o.f37385e) {
                        try {
                            Iterator<T> it2 = C15320o.f37381a.iterator();
                            while (it2.hasNext()) {
                                it2.next().mo24824a(nVar);
                            }
                        } finally {
                            MethodCollector.m26664o(3359);
                        }
                    }
                    return;
                }
                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(3359);
                throw wVar;
            } else if (i == 1001) {
                AbstractC15305c cVar = C15320o.f37382b;
                if (cVar != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        cVar.mo24824a((C15317m) obj2);
                        MethodCollector.m26664o(3359);
                        return;
                    }
                    C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(3359);
                    throw wVar2;
                }
                MethodCollector.m26664o(3359);
            } else if (i == 1002) {
                Object obj3 = message.obj;
                if (obj3 != null) {
                    C15323q qVar = (C15323q) obj3;
                    AbstractC15305c cVar2 = C15320o.f37382b;
                    if (cVar2 != null) {
                        cVar2.mo24824a(qVar);
                        MethodCollector.m26664o(3359);
                        return;
                    }
                    MethodCollector.m26664o(3359);
                    return;
                }
                C89388w wVar3 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(3359);
                throw wVar3;
            } else if (i == 1003) {
                Object obj4 = message.obj;
                if (obj4 != null) {
                    C15324r rVar = (C15324r) obj4;
                    AbstractC15305c cVar3 = C15320o.f37382b;
                    if (cVar3 != null) {
                        cVar3.mo24824a(rVar);
                        MethodCollector.m26664o(3359);
                        return;
                    }
                    MethodCollector.m26664o(3359);
                    return;
                }
                C89388w wVar4 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(3359);
                throw wVar4;
            } else if (i == 1006) {
                Object obj5 = message.obj;
                if (obj5 != null) {
                    C15303a aVar = (C15303a) obj5;
                    AbstractC15305c cVar4 = C15320o.f37382b;
                    if (cVar4 != null) {
                        cVar4.mo24824a(aVar);
                        MethodCollector.m26664o(3359);
                        return;
                    }
                    MethodCollector.m26664o(3359);
                    return;
                }
                C89388w wVar5 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(3359);
                throw wVar5;
            } else if (i == 1004) {
                Object obj6 = message.obj;
                if (obj6 != null) {
                    C15326b bVar = (C15326b) obj6;
                    AbstractC15305c cVar5 = C15320o.f37384d;
                    if (cVar5 != null) {
                        cVar5.mo24824a(bVar);
                        MethodCollector.m26664o(3359);
                        return;
                    }
                    MethodCollector.m26664o(3359);
                    return;
                }
                C89388w wVar6 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(3359);
                throw wVar6;
            } else {
                if (i == 1005) {
                    Object obj7 = message.obj;
                    if (obj7 != null) {
                        C15318n nVar2 = (C15318n) obj7;
                        Iterator<T> it3 = C15320o.f37383c.iterator();
                        while (it3.hasNext()) {
                            it3.next().mo24832a(nVar2);
                        }
                        if (AbstractC15310h.C15311a.m28212a() != null) {
                            C89219l.m154719c(nVar2, "");
                            MethodCollector.m26664o(3359);
                            return;
                        }
                    } else {
                        C89388w wVar7 = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(3359);
                        throw wVar7;
                    }
                }
                MethodCollector.m26664o(3359);
            }
        }
    }

    /* renamed from: a */
    public static void m28226a(AbstractC15305c cVar) {
        MethodCollector.m26663i(4006);
        if (cVar != null) {
            synchronized (f37385e) {
                try {
                    f37381a.add(cVar);
                } finally {
                    MethodCollector.m26664o(4006);
                }
            }
            return;
        }
        MethodCollector.m26664o(4006);
    }

    /* renamed from: a */
    public static final void m28227a(C15317m mVar) {
        C89219l.m154719c(mVar, "");
        f37386f.obtainMessage(1001, mVar).sendToTarget();
    }

    /* renamed from: a */
    public static final void m28229a(C15324r rVar) {
        C89219l.m154719c(rVar, "");
        f37386f.obtainMessage(1003, rVar).sendToTarget();
    }

    /* renamed from: a */
    public static final void m28230a(C15326b bVar) {
        C89219l.m154719c(bVar, "");
        f37386f.obtainMessage(1004, bVar).sendToTarget();
    }

    /* renamed from: a */
    public static final void m28228a(C15318n nVar, boolean z) {
        C89219l.m154719c(nVar, "");
        if (z) {
            f37386f.obtainMessage(1005, nVar).sendToTarget();
        } else {
            f37386f.obtainMessage(1000, nVar).sendToTarget();
        }
    }
}
