package com.bytedance.ies.p1208im.core.p1225f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.p1222c.C17501f;
import com.bytedance.p1399im.core.p1404a.AbstractC19494h;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1408d.C19596au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.f.g */
public final class C17570g {

    /* renamed from: a */
    static volatile int f42024a;

    /* renamed from: b */
    static volatile long f42025b;

    /* renamed from: c */
    public static volatile Long f42026c;

    /* renamed from: d */
    public static final C17570g f42027d = new C17570g();

    private C17570g() {
    }

    static {
        Covode.recordClassIndex(20059);
    }

    /* renamed from: com.bytedance.ies.im.core.f.g$b */
    public static final class HandlerC17572b extends Handler {
        static {
            Covode.recordClassIndex(20061);
        }

        HandlerC17572b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.what == 19970116) {
                Object obj = message.obj;
                if (!(obj instanceof C19596au)) {
                    obj = null;
                }
                C19596au auVar = (C19596au) obj;
                if (auVar != null) {
                    long j = auVar.f46537c - auVar.f46536b;
                    long j2 = auVar.f46539e - auVar.f46538d;
                    long j3 = auVar.f46538d - (((j - j2) / 2) + auVar.f46536b);
                    C17570g.f42024a++;
                    long j4 = C17570g.f42025b + j3;
                    C17570g.f42025b = j4;
                    C17570g.f42026c = Long.valueOf(j4 / ((long) C17570g.f42024a));
                    C17415a.m32255b().mo27836b("TimeSyncService", "sync Client timestamp " + C17570g.f42024a + " cmd:" + auVar.f46535a + ",(" + j + ',' + j2 + "),singleDelta:" + j3 + ",avg:" + C17570g.f42026c);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.im.core.f.g$a */
    static final class C17571a implements AbstractC19494h {

        /* renamed from: a */
        final /* synthetic */ HandlerC17572b f42028a;

        static {
            Covode.recordClassIndex(20060);
        }

        C17571a(HandlerC17572b bVar) {
            this.f42028a = bVar;
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19494h
        /* renamed from: a */
        public final void mo27998a(C19596au auVar) {
            if (this.f42028a.hasMessages(19970116)) {
                C17415a.m32255b().mo27836b("TimeSyncService", "already has this message in process,we shouldn't do it again!cmd:" + auVar.f46535a);
                return;
            }
            HandlerC17572b bVar = this.f42028a;
            Message obtain = Message.obtain();
            obtain.what = 19970116;
            obtain.obj = auVar;
            bVar.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: a */
    public static void m32582a(C19483d dVar) {
        C89219l.m154721d(dVar, "");
        if (!C17501f.m32483a()) {
            C17415a.m32255b().mo27836b("TimeSyncService", "syncTimeInit fail!");
            return;
        }
        C17415a.m32255b().mo27836b("TimeSyncService", "syncTimeInit success!");
        dVar.f46164i = new C17571a(new HandlerC17572b(Looper.getMainLooper()));
    }
}
