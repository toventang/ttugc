package com.p2082ss.android.ugc.aweme.p2282ad.feed.card;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33198a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.card.c */
public final class C33238c implements AbstractC33241d {

    /* renamed from: a */
    public static final C33240a f78976a = new C33240a((byte) 0);

    /* renamed from: b */
    private final View f78977b;

    /* renamed from: c */
    private AwemeRawAd f78978c;

    static {
        Covode.recordClassIndex(40063);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59154a(int i, int i2, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59156a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59157a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: b */
    public final void mo59159b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: c */
    public final void mo59160c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: d */
    public final void mo59161d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: e */
    public final boolean mo59162e() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: f */
    public final boolean mo59163f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: g */
    public final void mo59164g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.c$a */
    public static final class C33240a {
        static {
            Covode.recordClassIndex(40065);
        }

        private C33240a() {
        }

        public /* synthetic */ C33240a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59152a() {
        C18129a.m33746a("draw_ad", "othershow", this.f78978c).mo28900b("refer", "default_card").mo28901b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59153a(int i) {
        this.f78977b.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.card.AbstractC33241d
    /* renamed from: a */
    public final void mo59155a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f78978c = awemeRawAd;
    }

    public C33238c(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(6738);
        View inflate = View.inflate(frameLayout.getContext(), R.layout.aez, null);
        C89219l.m154716b(inflate, "");
        this.f78977b = inflate;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C13628n.m24520b(frameLayout.getContext(), 2.0f));
        gradientDrawable.setColor(Color.parseColor("#E5252525"));
        inflate.setBackground(gradientDrawable);
        inflate.setOnClickListener(View$OnClickListenerC332391.f78979a);
        Context context = frameLayout.getContext();
        C89219l.m154716b(context, "");
        frameLayout.addView(inflate, new FrameLayout.LayoutParams(C33198a.m68051a(context), (int) C13628n.m24520b(frameLayout.getContext(), 88.0f)));
        MethodCollector.m26664o(6738);
    }
}
