package com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58141c;
import com.p2082ss.android.ugc.aweme.lego.p3395e.C58218b;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.a.a.q */
public final class C58126q extends AbstractC58129r implements Handler.Callback {

    /* renamed from: a */
    public HandlerC58141c f132383a = new HandlerC58141c(this);

    /* renamed from: b */
    public boolean f132384b;

    static {
        Covode.recordClassIndex(68192);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.q$b */
    static final class RunnableC58128b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC58259r f132387a;

        static {
            Covode.recordClassIndex(68194);
        }

        RunnableC58128b(AbstractC58259r rVar) {
            this.f132387a = rVar;
        }

        public final void run() {
            C58221f.f132579c.mo95681a(this.f132387a, C58140b.m105075a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3390a.p3391a.AbstractC58129r, com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95597a() {
        this.f132383a.mo95649a(1203, 1000);
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a.a.q$a */
    static final class RunnableC58127a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58126q f132385a;

        /* renamed from: b */
        final /* synthetic */ List f132386b;

        static {
            Covode.recordClassIndex(68193);
        }

        RunnableC58127a(C58126q qVar, List list) {
            this.f132385a = qVar;
            this.f132386b = list;
        }

        public final void run() {
            for (AbstractC58252n nVar : this.f132386b) {
                Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoRequest");
                AbstractC58259r rVar = (AbstractC58259r) nVar;
                EnumC58147aa b = rVar.mo58051b();
                C58218b bVar = C58221f.f132579c;
                C89219l.m154716b(b, "");
                bVar.mo95680a(b, rVar);
            }
            if (this.f132385a.f132384b && !this.f132385a.f132383a.hasMessages(1203) && C58221f.f132579c.mo95682a(EnumC58147aa.SPARSE)) {
                this.f132385a.f132383a.mo95649a(1203, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4260e.AbstractC81916a
    /* renamed from: a */
    public final void mo95598a(List<? extends AbstractC58252n> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            C58254p.m105191a(EnumC58147aa.P0).execute(new RunnableC58127a(this, list));
        }
    }

    public final boolean handleMessage(Message message) {
        AbstractC58259r b;
        C89219l.m154721d(message, "");
        if (C58221f.f132579c.mo95682a(EnumC58147aa.SPARSE) && (b = C58221f.f132579c.mo95683b(EnumC58147aa.SPARSE)) != null) {
            C58254p.m105191a(EnumC58147aa.SPARSE).execute(new RunnableC58128b(b));
        }
        if (!C58221f.f132579c.mo95682a(EnumC58147aa.SPARSE)) {
            return true;
        }
        this.f132383a.mo95649a(1203, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        return true;
    }
}
