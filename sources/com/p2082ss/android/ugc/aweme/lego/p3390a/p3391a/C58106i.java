package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.i */
public final class C58106i extends AbstractC58131s implements Handler.Callback {

    /* renamed from: a */
    public HandlerC58141c f132362a = new HandlerC58141c(this);

    /* renamed from: c */
    private boolean f132363c;

    static {
        Covode.recordClassIndex(68172);
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95597a() {
        this.f132363c = true;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: b */
    public final void mo95599b() {
        this.f132363c = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.i$b */
    static final class C58108b implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ C58106i f132366a;

        static {
            Covode.recordClassIndex(68174);
        }

        C58108b(C58106i iVar) {
            this.f132366a = iVar;
        }

        public final boolean queueIdle() {
            if (!C58140b.m105076b()) {
                return true;
            }
            this.f132366a.mo95619c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.i$a */
    public static final class RunnableC58107a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58106i f132364a;

        /* renamed from: b */
        final /* synthetic */ String f132365b;

        static {
            Covode.recordClassIndex(68173);
        }

        RunnableC58107a(C58106i iVar, String str) {
            this.f132364a = iVar;
            this.f132365b = str;
        }

        public final void run() {
            C58221f.f132580d.mo95684a(this.f132365b);
            this.f132364a.f132362a.mo95649a(1200, 0);
        }
    }

    public C58106i() {
        Looper.myQueue().addIdleHandler(new C58108b(this));
    }

    /* renamed from: c */
    public final void mo95619c() {
        String b = C58221f.f132580d.mo95687b(EnumC58151ae.IDLE);
        if (b != null) {
            C58254p.m105192a(false).execute(new RunnableC58107a(this, b));
        }
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154721d(message, "");
        mo95619c();
        return true;
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a, com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58131s
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        super.mo95598a(list);
        if (C58221f.f132580d.mo95686a(EnumC58151ae.IDLE)) {
            this.f132362a.mo95649a(1200, 0);
        }
    }
}
