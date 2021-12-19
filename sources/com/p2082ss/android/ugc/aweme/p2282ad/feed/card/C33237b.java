package com.p2082ss.android.ugc.aweme.p2282ad.feed.card;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.card.b */
public final class C33237b {

    /* renamed from: a */
    final FrameLayout f78971a;

    /* renamed from: b */
    final FrameLayout f78972b;

    /* renamed from: c */
    AbstractC33241d f78973c;

    /* renamed from: d */
    AbstractC33241d f78974d;

    /* renamed from: e */
    AbstractC33241d f78975e;

    static {
        Covode.recordClassIndex(40062);
    }

    /* renamed from: a */
    public final void mo59197a() {
        for (FrameLayout frameLayout : C89070n.m154522b(this.f78971a, this.f78972b)) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo59198a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (!C37699a.m76293e(awemeRawAd)) {
            C38748i.m78596a(this.f78971a.getContext(), aweme, this.f78971a);
        }
    }

    public C33237b(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.e4);
        C89219l.m154716b(findViewById, "");
        this.f78971a = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.e5);
        C89219l.m154716b(findViewById2, "");
        this.f78972b = (FrameLayout) findViewById2;
    }
}
