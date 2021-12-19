package com.p2082ss.android.ugc.aweme.ftc.countdown;

import android.animation.Animator;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.d */
public final class C52461d implements Animator.AnimatorListener, AbstractC52496l {

    /* renamed from: a */
    private AbstractC52496l.AbstractC52497a f120816a;

    /* renamed from: b */
    private AbstractC52495k f120817b;

    /* renamed from: c */
    private FrameLayout f120818c;

    /* renamed from: d */
    private LottieAnimationView f120819d;

    /* renamed from: e */
    private int f120820e;

    /* renamed from: f */
    private boolean f120821f;

    static {
        Covode.recordClassIndex(61857);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l
    /* renamed from: b */
    public final boolean mo88244b() {
        return this.f120821f;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l
    /* renamed from: a */
    public final void mo88242a() {
        LottieAnimationView lottieAnimationView = this.f120819d;
        if (lottieAnimationView != null && this.f120818c != null && lottieAnimationView.f5900b.mo6025g()) {
            this.f120819d.mo5836d();
            this.f120819d.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f120817b.mo88239a(this.f120820e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f120821f = false;
        C40970e.m82485a("record cound down onAnimationCancel() called");
        this.f120816a.mo88271b();
        this.f120817b.mo88240b();
    }

    public final void onAnimationEnd(Animator animator) {
        C40970e.m82485a("record cound down onAnimationEnd() called");
        this.f120821f = false;
        LottieAnimationView lottieAnimationView = this.f120819d;
        if (!(lottieAnimationView == null || this.f120818c == null || !lottieAnimationView.f5900b.mo6025g())) {
            this.f120819d.setVisibility(8);
        }
        this.f120816a.mo88272c();
        this.f120817b.mo88240b();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52496l
    /* renamed from: a */
    public final void mo88243a(int i) {
        String str;
        MethodCollector.m26663i(11378);
        this.f120820e = i;
        this.f120821f = true;
        this.f120816a.mo88270a();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C1764a.m5927a(LayoutInflater.from(this.f120818c.getContext()), R.layout.b3v, this.f120818c, false);
        this.f120819d = lottieAnimationView;
        this.f120818c.addView(lottieAnimationView);
        this.f120819d.mo5835c();
        this.f120819d.mo5828a(this);
        LottieAnimationView lottieAnimationView2 = this.f120819d;
        if (i == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView2.setAnimation(str);
        this.f120819d.mo5826a();
        this.f120819d.setVisibility(0);
        ContentResolver contentResolver = this.f120818c.getContext().getContentResolver();
        if (contentResolver != null) {
            int i2 = Build.VERSION.SDK_INT;
            float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            float f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
            float f3 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            C40970e.m82485a("anim_duration_scale =".concat(String.valueOf(f)));
            C40970e.m82485a("transition_anim_scale =".concat(String.valueOf(f2)));
            C40970e.m82485a("window_anim_scale =".concat(String.valueOf(f3)));
        }
        MethodCollector.m26664o(11378);
    }

    public C52461d(FrameLayout frameLayout, AbstractC52496l.AbstractC52497a aVar, AbstractC52495k kVar) {
        this.f120818c = frameLayout;
        this.f120816a = aVar;
        this.f120817b = kVar;
    }
}
