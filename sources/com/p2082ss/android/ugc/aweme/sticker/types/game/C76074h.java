package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76066b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.h */
public class C76074h implements AbstractC76081n {

    /* renamed from: a */
    AbstractC76066b f170925a;

    /* renamed from: b */
    protected View f170926b;

    /* renamed from: c */
    private FrameLayout f170927c;

    /* renamed from: d */
    private LottieAnimationView f170928d;

    /* renamed from: e */
    private ImageView f170929e;

    static {
        Covode.recordClassIndex(89019);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n
    /* renamed from: c */
    public void mo119814c() {
        LottieAnimationView lottieAnimationView = this.f170928d;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo5836d();
            this.f170928d.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n
    /* renamed from: d */
    public final void mo119815d() {
        MethodCollector.m26663i(6424);
        LottieAnimationView lottieAnimationView = this.f170928d;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo5836d();
        }
        this.f170926b.setVisibility(8);
        this.f170927c.removeView(this.f170926b);
        MethodCollector.m26664o(6424);
    }

    /* renamed from: e */
    private void m133381e() {
        View a = mo119810a(this.f170927c);
        this.f170926b = a;
        this.f170928d = (LottieAnimationView) a.findViewById(R.id.np);
        ImageView imageView = (ImageView) this.f170926b.findViewById(R.id.bm4);
        this.f170929e = imageView;
        imageView.setOnClickListener(new View$OnClickListenerC76075i(this));
        this.f170928d.setOnClickListener(new View$OnClickListenerC76076j(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n
    /* renamed from: a */
    public final void mo119811a() {
        MethodCollector.m26663i(6416);
        if (this.f170928d == null) {
            m133381e();
        }
        this.f170927c.removeAllViews();
        this.f170927c.addView(this.f170926b);
        this.f170926b.setVisibility(0);
        this.f170928d.setVisibility(8);
        MethodCollector.m26664o(6416);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n
    /* renamed from: b */
    public final void mo119813b() {
        if (this.f170928d == null) {
            m133381e();
        }
        this.f170928d.setVisibility(0);
        this.f170928d.setImageAssetsFolder("start_anim/");
        this.f170928d.setAnimation("game_btn.json");
        this.f170928d.mo5826a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76081n
    /* renamed from: a */
    public final void mo119812a(AbstractC76066b bVar) {
        this.f170925a = bVar;
    }

    public C76074h(FrameLayout frameLayout) {
        this.f170927c = frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo119810a(ViewGroup viewGroup) {
        return C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ae0, viewGroup, false);
    }
}
