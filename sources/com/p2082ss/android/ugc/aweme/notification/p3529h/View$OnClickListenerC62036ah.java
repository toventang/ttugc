package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity;
import com.p2082ss.android.ugc.aweme.notification.bean.C61869d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ah */
public final class View$OnClickListenerC62036ah extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    public static final C62037a f140802a = new C62037a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f140803b;

    /* renamed from: c */
    private final AbstractC89244h f140804c;

    /* renamed from: d */
    private C61869d f140805d;

    /* renamed from: e */
    private final Fragment f140806e;

    static {
        Covode.recordClassIndex(72790);
    }

    /* renamed from: c */
    private final RelativeLayout m112217c() {
        return (RelativeLayout) this.f140803b.getValue();
    }

    /* renamed from: h */
    private final TuxTextView m112218h() {
        return (TuxTextView) this.f140804c.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ah$a */
    public static final class C62037a {
        static {
            Covode.recordClassIndex(72791);
        }

        private C62037a() {
        }

        public /* synthetic */ C62037a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ah$b */
    static final class C62038b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f140807a;

        static {
            Covode.recordClassIndex(72792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62038b(View view) {
            super(0);
            this.f140807a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140807a.findViewById(R.id.eue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.ah$c */
    static final class C62039c extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ View f140808a;

        static {
            Covode.recordClassIndex(72793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62039c(View view) {
            super(0);
            this.f140808a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f140808a.findViewById(R.id.cv7);
        }
    }

    /* renamed from: i */
    private static boolean m112219i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        int i;
        super.cf_();
        C33744d a = new C33744d().mo59983a("enter_from", "notification_page");
        C61869d dVar = this.f140805d;
        if (dVar != null) {
            i = dVar.f140454a;
        } else {
            i = 0;
        }
        C39162r.m79460a("show_follow_request", a.mo59980a("message_number", i).f79943a);
    }

    /* renamed from: a */
    public final void mo100106a(C61869d dVar) {
        C89219l.m154721d(dVar, "");
        this.f140805d = dVar;
        TuxTextView h = m112218h();
        C89219l.m154716b(h, "");
        h.setText(C53437b.m98615a((long) dVar.f140454a));
        if (C56297a.m102302d()) {
            m112218h().setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        int i;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m112219i();
        }
        if (!C58029j.f132253e) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        Fragment fragment = this.f140806e;
        C61869d dVar = this.f140805d;
        if (dVar != null) {
            i = dVar.f140454a;
        } else {
            i = 0;
        }
        MusFollowRequestDetailActivity.C61661a.m111678a(fragment, Integer.valueOf(i));
        C39162r.m79460a("enter_follow_request", new C33744d().mo59983a("enter_from", "notification_page").f79943a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62036ah(View view, Fragment fragment) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        this.f140806e = fragment;
        this.f140803b = C89250i.m154773a((AbstractC89171a) new C62039c(view));
        this.f140804c = C89250i.m154773a((AbstractC89171a) new C62038b(view));
        C62262g.m112634a(m112217c());
        m112217c().setOnClickListener(this);
    }
}
