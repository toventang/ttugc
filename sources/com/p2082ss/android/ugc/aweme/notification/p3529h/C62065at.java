package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.at */
public final class C62065at extends C62129p {

    /* renamed from: a */
    private final AbstractC66620d f140893a;

    static {
        Covode.recordClassIndex(72819);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.at$a */
    static final class View$OnClickListenerC62066a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC62066a f140894a = new View$OnClickListenerC62066a();

        static {
            Covode.recordClassIndex(72820);
        }

        View$OnClickListenerC62066a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C56407f.m102374b(C620671.f140895a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62065at(AbstractC66620d dVar) {
        super((View) dVar);
        C89219l.m154721d(dVar, "");
        this.f140893a = dVar;
        dVar.setEnterFrom("notification_page");
    }

    /* renamed from: a */
    public final void mo100119a(List<? extends User> list, int i) {
        this.f140893a.mo61470a(list, i);
        this.f140893a.setOutClickListener(View$OnClickListenerC62066a.f140894a);
    }
}
