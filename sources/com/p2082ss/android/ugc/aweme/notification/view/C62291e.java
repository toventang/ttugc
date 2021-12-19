package com.p2082ss.android.ugc.aweme.notification.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.view.e */
public final class C62291e {

    /* renamed from: a */
    public LiveCircleView f141389a;

    /* renamed from: b */
    public AvatarImageView f141390b;

    /* renamed from: c */
    public boolean f141391c;

    /* renamed from: d */
    public int f141392d;

    /* renamed from: e */
    public int f141393e;

    /* renamed from: f */
    public ValueAnimator f141394f;

    /* renamed from: g */
    public ValueAnimator f141395g;

    /* renamed from: h */
    public List<UrlModel> f141396h = new ArrayList();

    static {
        Covode.recordClassIndex(73071);
    }

    /* renamed from: a */
    public final void mo100282a() {
        if (this.f141390b != null && this.f141389a != null && !this.f141391c) {
            ValueAnimator valueAnimator = this.f141394f;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            this.f141392d = 1;
            this.f141394f = ValueAnimator.ofInt(0, 800);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 800);
            this.f141395g = ofInt;
            ofInt.setRepeatCount(-1);
            this.f141395g.setRepeatMode(1);
            this.f141395g.setDuration(800L);
            this.f141394f.setRepeatCount(-1);
            this.f141394f.setRepeatMode(1);
            this.f141394f.setDuration(800L);
            this.f141394f.start();
            this.f141395g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.notification.view.C62291e.C622921 */

                static {
                    Covode.recordClassIndex(73072);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        C62291e.this.f141389a.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f141394f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.notification.view.C62291e.C622932 */

                static {
                    Covode.recordClassIndex(73073);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float f2;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (C62291e.this.f141392d % 5 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.08f;
                    }
                    if (C62291e.this.f141392d % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && C62291e.this.f141396h.size() != 0) {
                        C34577e.m70592a(C62291e.this.f141390b, C62291e.this.f141396h.get(C62291e.this.f141393e));
                        C62291e eVar = C62291e.this;
                        eVar.f141393e = (eVar.f141393e + 1) % C62291e.this.f141396h.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - (f * (animatedFraction / 0.5f));
                    } else {
                        f2 = (1.0f - f) + (f * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    C62291e.this.f141390b.setScaleX(f2);
                    C62291e.this.f141390b.setScaleY(f2);
                    if (intValue >= 730 && intValue < 740 && !C62291e.this.f141391c) {
                        C62291e.this.f141391c = true;
                        C62291e.this.f141395g.start();
                    }
                }
            });
            this.f141394f.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.notification.view.C62291e.C622943 */

                static {
                    Covode.recordClassIndex(73074);
                }

                public final void onAnimationCancel(Animator animator) {
                    C62291e.this.f141395g.cancel();
                    C62291e.this.f141391c = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C62291e eVar = C62291e.this;
                    eVar.f141392d = (eVar.f141392d + 1) % 5;
                    LiveOuterService.m107269s().mo95830d().mo12985a(3);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo100283a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f141396h.addAll(list);
            C34577e.m70592a(this.f141390b, this.f141396h.get(0));
        }
    }
}
