package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.inbox.C56590x;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.c */
public final class C56438c extends AbstractC56447g<C56590x> {

    /* renamed from: g */
    private int f128708g;

    static {
        Covode.recordClassIndex(66258);
    }

    /* renamed from: f */
    private final TuxStatusView m102403f() {
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return (TuxStatusView) view;
    }

    /* renamed from: g */
    private final void m102404g() {
        TuxStatusView f = m102403f();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        f.setLayoutParams(layoutParams);
        m102403f().setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final void mo93405a() {
        if (((C56590x) mo93413c()).f129023a == C56590x.EnumC56591a.SHOW) {
            RecommendUserVM e = mo93415e();
            if (!e.mo93324d()) {
                return;
            }
            if (!e.f128411g) {
                e.f128408d.setValue(e.mo93321a(C56590x.EnumC56591a.HIDE));
            } else {
                C1731i.m5640b(new RecommendUserVM.CallableC56291c(e), C1731i.f5562a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56438c(TuxStatusView tuxStatusView) {
        super(tuxStatusView);
        C89219l.m154721d(tuxStatusView, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f128708g = C89241a.m154730a(TypedValue.applyDimension(1, 46.0f, system.getDisplayMetrics()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g
    /* renamed from: a */
    public final /* synthetic */ void mo93406a(C56590x xVar) {
        C56590x xVar2 = xVar;
        C89219l.m154721d(xVar2, "");
        int i = C56439d.f128709a[xVar2.f129023a.ordinal()];
        if (i == 1) {
            m102404g();
        } else if (i == 2) {
            TuxStatusView f = m102403f();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f128708g;
            f.setLayoutParams(layoutParams);
            m102403f().setVisibility(0);
            m102403f().mo37867a();
        } else if (i == 3) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.cxg).mo37637b();
            m102404g();
        }
    }
}
