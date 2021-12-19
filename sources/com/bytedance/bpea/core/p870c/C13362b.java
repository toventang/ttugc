package com.bytedance.bpea.core.p870c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.basics.C13341b;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.c.b */
public final class C13362b {

    /* renamed from: a */
    public static final List<AbstractC13367e> f32657a = new ArrayList();

    /* renamed from: b */
    static final HandlerThreadC13363a f32658b;

    /* renamed from: c */
    static Handler f32659c;

    /* renamed from: d */
    public static final C13362b f32660d = new C13362b();

    /* renamed from: e */
    private static final ConcurrentLinkedQueue<C13361a> f32661e = new ConcurrentLinkedQueue<>();

    private C13362b() {
    }

    /* renamed from: com.bytedance.bpea.core.c.b$a */
    public static final class HandlerThreadC13363a extends HandlerThread {
        static {
            Covode.recordClassIndex(15359);
        }

        public HandlerThreadC13363a() {
            super("BPEA_EVENT_CENTER");
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            C89219l.m154719c("EventHandlerThread onLooperPrepared.", "");
            C13362b.f32659c = new Handler(C13362b.f32658b.getLooper(), C13364a.f32662a);
            C13362b.m24044a();
        }

        /* renamed from: com.bytedance.bpea.core.c.b$a$a */
        static final class C13364a implements Handler.Callback {

            /* renamed from: a */
            public static final C13364a f32662a = new C13364a();

            static {
                Covode.recordClassIndex(15360);
            }

            C13364a() {
            }

            public final boolean handleMessage(Message message) {
                C89219l.m154719c(message, "");
                try {
                    if (message.what == 1 && (message.obj instanceof C13361a)) {
                        Object obj = message.obj;
                        if (obj != null) {
                            C13361a aVar = (C13361a) obj;
                            Iterator<T> it = C13362b.f32657a.iterator();
                            while (it.hasNext()) {
                                try {
                                    it.next().onEvent(aVar);
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                } catch (Throwable unused2) {
                }
                return true;
            }
        }
    }

    static {
        Covode.recordClassIndex(15358);
        HandlerThreadC13363a aVar = new HandlerThreadC13363a();
        f32658b = aVar;
        aVar.start();
    }

    /* renamed from: a */
    public static void m24044a() {
        try {
            StringBuilder sb = new StringBuilder("send cache event,cache size = ");
            ConcurrentLinkedQueue<C13361a> concurrentLinkedQueue = f32661e;
            C89219l.m154719c(sb.append(concurrentLinkedQueue.size()).toString(), "");
            if (f32659c != null) {
                for (T t : concurrentLinkedQueue) {
                    C89219l.m154709a((Object) t, "");
                    m24045a((C13361a) t);
                }
            }
            f32661e.clear();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m24046a(String str) {
        C89219l.m154719c(str, "");
        m24045a(new C13361a(null, null, EnumC13368f.ERROR, -1, str));
    }

    /* renamed from: a */
    public static void m24045a(C13361a aVar) {
        C89219l.m154719c(aVar, "");
        int i = C13365c.f32663a[aVar.f32651b.ordinal()];
        String str = null;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            C13345f fVar = aVar.f32653d;
            if (fVar != null) {
                str = fVar.f32611a;
            }
            C13341b.m24024c("EventCenter", sb.append(str).append(" >> ").append(aVar.f32654e).append(':').append(aVar.f32655f).append("  ").append(aVar.f32656g).toString());
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder();
            C13345f fVar2 = aVar.f32653d;
            if (fVar2 != null) {
                str = fVar2.f32611a;
            }
            C13341b.m24023b("EventCenter", sb2.append(str).append(" >> ").append(aVar.f32654e).append(':').append(aVar.f32655f).toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            C13345f fVar3 = aVar.f32653d;
            if (fVar3 != null) {
                str = fVar3.f32611a;
            }
            C13341b.m24025d("EventCenter", sb3.append(str).append(" >> ").append(aVar.f32654e).append(':').append(aVar.f32655f).append("  ").append(aVar.f32656g).toString());
        }
        Handler handler = f32659c;
        if (handler == null) {
            StringBuilder sb4 = new StringBuilder("event handler is not ready now ,save event in cacheQueue. current cache queue size is ");
            ConcurrentLinkedQueue<C13361a> concurrentLinkedQueue = f32661e;
            C89219l.m154719c(sb4.append(concurrentLinkedQueue.size()).toString(), "");
            if (concurrentLinkedQueue.size() >= 1024) {
                C89219l.m154719c("current cached event size is over limit,drop the new event.", "");
            } else {
                concurrentLinkedQueue.add(aVar);
            }
        } else {
            handler.sendMessage(handler.obtainMessage(1, aVar));
        }
    }
}
