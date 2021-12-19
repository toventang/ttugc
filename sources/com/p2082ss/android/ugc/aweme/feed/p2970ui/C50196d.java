package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34668a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34670c;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58620d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.d */
public class C50196d {

    /* renamed from: a */
    public static final String f115907a = C50196d.class.getSimpleName();

    /* renamed from: b */
    public boolean f115908b;

    /* renamed from: c */
    public boolean f115909c;

    /* renamed from: d */
    public boolean f115910d;

    /* renamed from: e */
    public User f115911e;

    /* renamed from: f */
    public View f115912f;

    /* renamed from: g */
    public LiveCircleView f115913g;

    /* renamed from: h */
    public ValueAnimator f115914h;

    /* renamed from: i */
    public ValueAnimator f115915i;

    /* renamed from: j */
    public AbstractC88433f<C58620d> f115916j;

    /* renamed from: k */
    Aweme f115917k;

    /* renamed from: l */
    public boolean f115918l;

    /* renamed from: m */
    private View f115919m;

    /* renamed from: n */
    private AnimatorSet f115920n;

    /* renamed from: o */
    private Class f115921o;

    /* renamed from: p */
    private View.OnAttachStateChangeListener f115922p = new View.OnAttachStateChangeListener() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d.View$OnAttachStateChangeListenerC501971 */

        static {
            Covode.recordClassIndex(59323);
        }

        public final void onViewDetachedFromWindow(View view) {
            C50196d.this.mo85361b();
        }

        public final void onViewAttachedToWindow(View view) {
            if (C50196d.this.f115910d) {
                C50196d.this.mo85356a();
            }
        }
    };

    /* renamed from: q */
    private Handler f115923q;

    /* renamed from: r */
    private Runnable f115924r;

    /* renamed from: a */
    public void mo85356a() {
        mo85357a(0);
        mo85362c();
    }

    static {
        Covode.recordClassIndex(59322);
    }

    public C50196d() {
    }

    /* renamed from: b */
    public final void mo85361b() {
        mo85363d();
        mo85357a(8);
    }

    /* renamed from: d */
    public final void mo85363d() {
        Runnable runnable;
        AnimatorSet animatorSet = this.f115920n;
        if (animatorSet != null) {
            animatorSet.cancel();
            Handler handler = this.f115923q;
            if (!(handler == null || (runnable = this.f115924r) == null)) {
                handler.removeCallbacks(runnable);
            }
            this.f115909c = false;
            this.f115908b = false;
        }
    }

    /* renamed from: c */
    public final void mo85362c() {
        boolean a = m94209a(this.f115911e);
        this.f115910d = a;
        if (!a) {
            mo85361b();
            AbstractC88433f<C58620d> fVar = this.f115916j;
            if (fVar != null && this.f115911e != null) {
                try {
                    fVar.accept(new C58620d(Long.parseLong(this.f115911e.getUid()), 0));
                } catch (Exception unused) {
                }
            }
        } else if (this.f115909c) {
            AbstractC88433f<C58620d> fVar2 = this.f115916j;
            if (fVar2 != null) {
                mo85358a(this.f115911e, fVar2, "tiktok_video_head");
            }
        } else if (!this.f115918l) {
            if (this.f115914h == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 800);
                this.f115914h = ofInt;
                ofInt.setRepeatCount(-1);
                this.f115914h.setRepeatMode(1);
                this.f115914h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d.C501982 */

                    static {
                        Covode.recordClassIndex(59324);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (animatedFraction <= 0.5f) {
                            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
                        } else {
                            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
                        }
                        if (C50196d.this.f115912f != null) {
                            C50196d.this.f115912f.setScaleX(f);
                            C50196d.this.f115912f.setScaleY(f);
                        }
                        if (intValue >= 730 && intValue < 740 && !C50196d.this.f115908b) {
                            C50196d.this.f115908b = true;
                            C34668a.m70812a(C50196d.this.f115915i, C34670c.f81925c);
                        }
                    }
                });
            }
            if (this.f115915i == null) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 800);
                this.f115915i = ofInt2;
                ofInt2.setRepeatCount(-1);
                this.f115915i.setRepeatMode(1);
                this.f115915i.setDuration(800L);
                this.f115915i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d.C501993 */

                    static {
                        Covode.recordClassIndex(59325);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (intValue >= 0 && intValue <= 640) {
                            float f = (((float) intValue) * 1.0f) / 640.0f;
                            if (C50196d.this.f115913g != null) {
                                C50196d.this.f115913g.setFraction(f);
                            }
                        }
                    }
                });
                this.f115915i.addListener(new AnimatorListenerAdapter("tiktok_video_head") {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d.C502004 */

                    /* renamed from: c */
                    private int f115930c;

                    static {
                        Covode.recordClassIndex(59326);
                    }

                    public final void onAnimationRepeat(Animator animator) {
                        this.f115930c++;
                        if (C50196d.this.f115916j != null && this.f115930c >= 10) {
                            this.f115930c = 0;
                            C50196d dVar = C50196d.this;
                            dVar.mo85358a(dVar.f115911e, C50196d.this.f115916j, "tiktok_video_head");
                        }
                    }
                });
            }
            if (this.f115920n == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f115920n = animatorSet;
                animatorSet.setDuration(800L);
                this.f115920n.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d.C502015 */

                    static {
                        Covode.recordClassIndex(59327);
                    }

                    public final void onAnimationCancel(Animator animator) {
                        if (C50196d.this.f115915i != null) {
                            C50196d.this.f115915i.cancel();
                        }
                        if (C50196d.this.f115914h != null) {
                            C50196d.this.f115914h.cancel();
                        }
                        C50196d.this.f115909c = false;
                        C50196d.this.f115908b = false;
                    }
                });
            }
            this.f115920n.play(this.f115914h);
            this.f115909c = true;
            C34668a.m70812a(this.f115920n, C34670c.f81925c);
            AbstractC88433f<C58620d> fVar3 = this.f115916j;
            if (fVar3 != null) {
                mo85358a(this.f115911e, fVar3, "tiktok_video_head");
            }
        }
    }

    /* renamed from: a */
    private boolean m94209a(User user) {
        LiveOuterService.m107269s();
        if (user == null) {
            return this.f115910d;
        }
        if (C37699a.m76320y(this.f115917k)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((!user.isSecret() || C80580in.m139693f(user)) && C76657c.m134240a() && !user.isBlock()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo85357a(int i) {
        if (i == 0) {
            LiveCircleView liveCircleView = this.f115913g;
            if (liveCircleView != null) {
                liveCircleView.setVisibility(0);
            }
            View view = this.f115912f;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.f115919m;
                if (view2 != null && this.f115912f != view2) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        LiveCircleView liveCircleView2 = this.f115913g;
        if (liveCircleView2 != null) {
            liveCircleView2.setVisibility(8);
        }
        View view3 = this.f115912f;
        if (!(view3 == null || view3 == this.f115919m)) {
            view3.setVisibility(8);
        }
        View view4 = this.f115919m;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo85359a(User user, Class cls) {
        mo85360a(user, cls, null, null);
    }

    public C50196d(View view, View view2, LiveCircleView liveCircleView) {
        this.f115912f = view;
        this.f115919m = view2;
        this.f115913g = liveCircleView;
        LiveOuterService.m107269s();
        this.f115910d = true;
        liveCircleView.setVisibility(0);
        view.addOnAttachStateChangeListener(this.f115922p);
    }

    /* renamed from: a */
    public final void mo85358a(User user, AbstractC88433f<C58620d> fVar, String str) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            LiveOuterService.m107269s().mo95828b().mo96084a(user, new C50257e(this, Long.parseLong(user.getUid()), user, fVar), str);
        }
    }

    public C50196d(boolean z, View view, View view2, LiveCircleView liveCircleView) {
        this.f115912f = view;
        this.f115919m = view2;
        this.f115913g = liveCircleView;
        LiveOuterService.m107269s();
        this.f115910d = z;
        view.addOnAttachStateChangeListener(this.f115922p);
    }

    /* renamed from: a */
    public final void mo85360a(User user, Class cls, AbstractC88433f<C58620d> fVar, Aweme aweme) {
        this.f115917k = aweme;
        this.f115911e = user;
        this.f115916j = fVar;
        this.f115921o = cls;
        this.f115910d = m94209a(user);
        this.f115912f.removeOnAttachStateChangeListener(this.f115922p);
        this.f115912f.addOnAttachStateChangeListener(this.f115922p);
        if (user != null) {
            user.getNickname();
        }
        if (this.f115910d) {
            mo85356a();
        } else {
            mo85361b();
        }
    }
}
