package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

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
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d */
public final class C69945d implements Animator.AnimatorListener, AbstractC69974j {

    /* renamed from: a */
    private AbstractC69974j.AbstractC69975a f156325a;

    /* renamed from: b */
    private AbstractC69973i f156326b;

    /* renamed from: c */
    private FrameLayout f156327c;

    /* renamed from: d */
    private LottieAnimationView f156328d;

    /* renamed from: e */
    private int f156329e;

    /* renamed from: f */
    private boolean f156330f;

    static {
        Covode.recordClassIndex(82356);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j
    /* renamed from: b */
    public final boolean mo110390b() {
        return this.f156330f;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j
    /* renamed from: a */
    public final void mo110388a() {
        LottieAnimationView lottieAnimationView = this.f156328d;
        if (lottieAnimationView != null && this.f156327c != null && lottieAnimationView.f5900b.mo6025g()) {
            this.f156328d.mo5836d();
            this.f156328d.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f156326b.mo110385a(this.f156329e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f156330f = false;
        C40970e.m82485a("record cound down onAnimationCancel() called");
        this.f156325a.mo110415c();
        this.f156326b.mo110386b();
    }

    public final void onAnimationEnd(Animator animator) {
        C40970e.m82485a("record cound down onAnimationEnd() called");
        this.f156330f = false;
        LottieAnimationView lottieAnimationView = this.f156328d;
        if (!(lottieAnimationView == null || this.f156327c == null || !lottieAnimationView.f5900b.mo6025g())) {
            this.f156328d.setVisibility(8);
        }
        this.f156325a.mo110414b();
        this.f156326b.mo110386b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69974j
    /* renamed from: a */
    public final void mo110389a(int i) {
        String str;
        MethodCollector.m26663i(9557);
        this.f156329e = i;
        this.f156330f = true;
        this.f156325a.mo110413a();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C1764a.m5927a(LayoutInflater.from(this.f156327c.getContext()), R.layout.b3v, this.f156327c, false);
        this.f156328d = lottieAnimationView;
        this.f156327c.addView(lottieAnimationView);
        this.f156328d.mo5835c();
        this.f156328d.mo5828a(this);
        LottieAnimationView lottieAnimationView2 = this.f156328d;
        if (i == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView2.setAnimation(str);
        this.f156328d.mo5826a();
        this.f156328d.setVisibility(0);
        ContentResolver contentResolver = this.f156327c.getContext().getContentResolver();
        if (contentResolver != null) {
            int i2 = Build.VERSION.SDK_INT;
            float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            float f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
            float f3 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            C40970e.m82485a("anim_duration_scale =".concat(String.valueOf(f)));
            C40970e.m82485a("transition_anim_scale =".concat(String.valueOf(f2)));
            C40970e.m82485a("window_anim_scale =".concat(String.valueOf(f3)));
        }
        MethodCollector.m26664o(9557);
    }

    public C69945d(FrameLayout frameLayout, AbstractC69974j.AbstractC69975a aVar, AbstractC69973i iVar) {
        this.f156327c = frameLayout;
        this.f156325a = aVar;
        this.f156326b = iVar;
    }
}
