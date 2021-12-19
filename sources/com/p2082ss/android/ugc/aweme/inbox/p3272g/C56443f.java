package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.inbox.C56305aa;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.f */
public final class C56443f extends AbstractC56447g<C56305aa> {

    /* renamed from: g */
    private final AbstractC89244h f128713g;

    /* renamed from: h */
    private final AbstractC89244h f128714h;

    /* renamed from: i */
    private final int f128715i;

    static {
        Covode.recordClassIndex(66263);
    }

    /* renamed from: f */
    private final TuxTextView m102409f() {
        return (TuxTextView) this.f128713g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.f$a */
    static final class C56444a extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ View f128716a;

        static {
            Covode.recordClassIndex(66264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56444a(View view) {
            super(0);
            this.f128716a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f128716a.findViewById(R.id.bn5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.f$c */
    static final class C56446c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f128718a;

        static {
            Covode.recordClassIndex(66266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56446c(View view) {
            super(0);
            this.f128718a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f128718a.findViewById(R.id.dfp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.f$b */
    static final class View$OnClickListenerC56445b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56443f f128717a;

        static {
            Covode.recordClassIndex(66265);
        }

        View$OnClickListenerC56445b(C56443f fVar) {
            this.f128717a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                IRecommendUsersService j = IRecommendUsersServiceImpl.m118438j();
                ActivityC0945e requireActivity = this.f128717a.mo93414d().requireActivity();
                C89219l.m154716b(requireActivity, "");
                j.mo105654a(requireActivity);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56443f(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f128713g = C89250i.m154773a((AbstractC89171a) new C56446c(view));
        this.f128714h = C89250i.m154773a((AbstractC89171a) new C56444a(view));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f128715i = C89241a.m154730a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: b */
    public final void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.f128859a != -1) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f128859a - this.f128715i;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(C56305aa aaVar) {
        C56305aa aaVar2 = aaVar;
        C89219l.m154721d(aaVar2, "");
        if (aaVar2.f128451a == 0) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(8);
        } else {
            TuxTextView f = m102409f();
            C89219l.m154716b(f, "");
            TuxTextView f2 = m102409f();
            C89219l.m154716b(f2, "");
            f.setText(f2.getContext().getString(aaVar2.f128451a));
        }
        ((TuxIconView) this.f128714h.getValue()).setOnClickListener(new View$OnClickListenerC56445b(this));
    }
}
