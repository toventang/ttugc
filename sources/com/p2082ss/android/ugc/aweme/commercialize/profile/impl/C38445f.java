package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.p2614a.C38432b;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.f */
public final class C38445f extends View$OnClickListenerC38428a {

    /* renamed from: e */
    public final LinearLayout f90812e;

    /* renamed from: f */
    private final AbstractC89244h f90813f = C89250i.m154773a((AbstractC89171a) new C38446a(this));

    static {
        Covode.recordClassIndex(45953);
    }

    /* renamed from: c */
    private final TextView m77874c() {
        return (TextView) this.f90813f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.f$a */
    static final class C38446a extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C38445f f90814a;

        static {
            Covode.recordClassIndex(45954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38446a(C38445f fVar) {
            super(0);
            this.f90814a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90814a.f90812e.findViewById(R.id.f7y);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38445f(LinearLayout linearLayout) {
        super(linearLayout);
        C89219l.m154721d(linearLayout, "");
        this.f90812e = linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66984a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f90812e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.f90812e;
            ValueAnimator a = C38545a.m78160a(linearLayout, i2, (linearLayout.getMeasuredHeight() + 1) * -1, i);
            C89219l.m154716b(a, "");
            a.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    public final void onClick(View view) {
        Integer valueOf;
        C38395d dVar;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.dh) {
                C38395d dVar2 = this.f90787c;
                if (dVar2 != null) {
                    dVar2.mo66987a();
                }
                mo66984a(300);
            } else if ((valueOf.intValue() == R.id.di || valueOf.intValue() == R.id.dj) && (dVar = this.f90787c) != null) {
                dVar.mo66988b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66985a(C38396e eVar) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(eVar, "");
        super.mo66985a(eVar);
        Aweme aweme = this.f90786b;
        AwemeRawAd awemeRawAd2 = null;
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            Aweme aweme2 = this.f90786b;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (!TextUtils.isEmpty(C37699a.m76226a(awemeRawAd))) {
                TextView c = m77874c();
                C89219l.m154716b(c, "");
                Aweme aweme3 = this.f90786b;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                }
                c.setText(C37699a.m76226a(awemeRawAd2));
            }
        }
        if (C80471gb.m139482a()) {
            TextView c2 = m77874c();
            C89219l.m154716b(c2, "");
            c2.setGravity(21);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a, com.p2082ss.android.ugc.aweme.commercialize.profile.impl.View$OnClickListenerC38428a
    /* renamed from: a */
    public final void mo66986a(boolean z) {
        AwemeRawAd awemeRawAd;
        ViewGroup.LayoutParams layoutParams = this.f90812e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i < 0) {
            ValueAnimator a = C38545a.m78160a(this.f90812e, i, 0, 300);
            C89219l.m154716b(a, "");
            a.start();
        }
        if (z) {
            Aweme aweme = this.f90786b;
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C38432b.m77861a(awemeRawAd);
            Aweme aweme2 = this.f90786b;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            C18129a.m33746a("homepage_ad", "button_show", awemeRawAd2).mo28902c();
        }
    }
}
