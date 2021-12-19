package com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56564d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d */
public final class View$OnClickListenerC56548d extends AbstractC56557f<C56564d> implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC89244h f128942a;

    /* renamed from: b */
    private final AbstractC89244h f128943b;

    /* renamed from: c */
    private final AbstractC89244h f128944c;

    /* renamed from: d */
    private final AbstractC89244h f128945d;

    static {
        Covode.recordClassIndex(66371);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d$a */
    static final class C56549a extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128946a;

        static {
            Covode.recordClassIndex(66372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56549a(View view) {
            super(0);
            this.f128946a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128946a.findViewById(R.id.eue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d$b */
    static final class C56550b extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ View f128947a;

        static {
            Covode.recordClassIndex(66373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56550b(View view) {
            super(0);
            this.f128947a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f128947a.findViewById(R.id.cv7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d$c */
    static final class C56551c extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ View f128948a;

        static {
            Covode.recordClassIndex(66374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56551c(View view) {
            super(0);
            this.f128948a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f128948a.findViewById(R.id.dk4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.d$d */
    static final class C56552d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128949a;

        static {
            Covode.recordClassIndex(66375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56552d(View view) {
            super(0);
            this.f128949a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128949a.findViewById(R.id.f63);
        }
    }

    /* renamed from: f */
    private static boolean m102522f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    public final void bP_() {
        C39162r.m79460a("show_follow_request", new C33744d().mo59983a("enter_from", "notification_page").mo59980a("message_number", ((C56564d) mo93488c()).f128974a).f79943a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.widget.multi.k] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: a */
    public final /* synthetic */ void mo93479a(C56564d dVar) {
        C56564d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        TuxTextView tuxTextView = (TuxTextView) this.f128944c.getValue();
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(C53437b.m98615a((long) dVar2.f128974a));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f
    /* renamed from: b */
    public final void mo93480b(C56520b bVar) {
        boolean z;
        C89219l.m154721d(bVar, "");
        super.mo93480b(bVar);
        if (bVar.f128859a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = bVar.f128859a;
            view.setLayoutParams(layoutParams);
        }
        if (bVar.f128863e != -1) {
            ((TuxTextView) this.f128945d.getValue()).setTuxFont(bVar.f128863e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC56548d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C56550b(view));
        this.f128942a = a;
        AbstractC89244h a2 = C89250i.m154773a((AbstractC89171a) new C56551c(view));
        this.f128943b = a2;
        this.f128944c = C89250i.m154773a((AbstractC89171a) new C56549a(view));
        this.f128945d = C89250i.m154773a((AbstractC89171a) new C56552d(view));
        C62262g.m112634a((RelativeLayout) a.getValue());
        view.setOnClickListener(this);
        if (C56323c.m102315b()) {
            ((TuxIconView) a2.getValue()).setTintColorRes(R.attr.bc);
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m102522f();
        }
        if (!C58029j.f132253e) {
            new C23144b(mo93490e()).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        MusFollowRequestDetailActivity.C61661a.m111678a(mo93490e(), Integer.valueOf(((C56564d) mo93488c()).f128974a));
        C39162r.m79460a("enter_follow_request", new C33744d().mo59983a("enter_from", "notification_page").f79943a);
    }
}
