package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.j */
public final class C58109j extends AbstractC58137v implements Handler.Callback {

    /* renamed from: a */
    public HandlerC58141c f132367a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132368c;

    static {
        Covode.recordClassIndex(68175);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
        this.f132368c = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: b */
    public final void mo95599b() {
        this.f132368c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v
    /* renamed from: c */
    public final EnumC58151ae mo95603c() {
        return EnumC58151ae.IDLE;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.j$b */
    static final class C58111b implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ C58109j f132371a;

        static {
            Covode.recordClassIndex(68177);
        }

        C58111b(C58109j jVar) {
            this.f132371a = jVar;
        }

        public final boolean queueIdle() {
            if (!C58140b.m105076b()) {
                return true;
            }
            this.f132371a.mo95623d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.j$a */
    public static final class RunnableC58110a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58109j f132369a;

        /* renamed from: b */
        final /* synthetic */ AbstractC58264w f132370b;

        static {
            Covode.recordClassIndex(68176);
        }

        RunnableC58110a(C58109j jVar, AbstractC58264w wVar) {
            this.f132369a = jVar;
            this.f132370b = wVar;
        }

        public final void run() {
            C58221f.f132578b.mo95695b(this.f132370b);
            this.f132369a.f132367a.mo95649a(1200, 0);
        }
    }

    public C58109j() {
        Looper.myQueue().addIdleHandler(new C58111b(this));
    }

    /* renamed from: d */
    public final void mo95623d() {
        AbstractC58264w b = C58221f.f132578b.mo95694b(EnumC58151ae.IDLE);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58110a(this, b));
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        mo95623d();
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58137v, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132578b.mo95693a(EnumC58151ae.IDLE)) {
            this.f132367a.mo95649a(1200, 0);
        }
    }
}
