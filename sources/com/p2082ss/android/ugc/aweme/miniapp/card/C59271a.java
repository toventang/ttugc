package com.p2082ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2563a.AbstractC37844a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.a */
public final class C59271a implements AbstractC37844a {

    /* renamed from: a */
    MicroAppVideoCardView f135496a;

    /* renamed from: b */
    View f135497b;

    /* renamed from: c */
    private Context f135498c;

    /* renamed from: d */
    private String f135499d;

    static {
        Covode.recordClassIndex(69641);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.p2563a.AbstractC37844a
    /* renamed from: b */
    public final void mo65850b() {
        this.f135497b.setVisibility(0);
        MicroAppVideoCardView microAppVideoCardView = this.f135496a;
        microAppVideoCardView.setAlpha(0.0f);
        microAppVideoCardView.setVisibility(8);
        microAppVideoCardView.setTranslationX(0.0f);
        microAppVideoCardView.setTranslationY(0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.p2563a.AbstractC37844a
    /* renamed from: a */
    public final void mo65849a() {
        int i;
        MicroAppVideoCardView microAppVideoCardView = this.f135496a;
        if (microAppVideoCardView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) microAppVideoCardView.getLayoutParams();
            if (C33403c.C33406b.f79409a.f79388q) {
                i = C33403c.m68502a();
            } else {
                i = 0;
            }
            int a = C51428b.m95803a(this.f135498c, 58.0f) - i;
            if (C33403c.f79374d) {
                a += C33403c.f79375e;
            }
            marginLayoutParams.bottomMargin = a;
            this.f135496a.setLayoutParams(marginLayoutParams);
        }
    }

    public C59271a(View view, String str) {
        this.f135498c = view.getContext();
        this.f135497b = view.findViewById(R.id.p7);
        this.f135496a = (MicroAppVideoCardView) view.findViewById(R.id.ck1);
        this.f135499d = str;
    }
}
