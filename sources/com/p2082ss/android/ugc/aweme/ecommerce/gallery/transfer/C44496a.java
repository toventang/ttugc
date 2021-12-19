package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a */
public final class C44496a {

    /* renamed from: a */
    float f103730a;

    /* renamed from: b */
    float f103731b;

    /* renamed from: c */
    int f103732c;

    /* renamed from: d */
    private C44507e f103733d;

    /* renamed from: e */
    private float f103734e;

    /* renamed from: f */
    private AbstractC44497a f103735f = null;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a$a */
    public interface AbstractC44497a {
        static {
            Covode.recordClassIndex(52847);
        }
    }

    static {
        Covode.recordClassIndex(52846);
    }

    public C44496a(C44507e eVar) {
        this.f103733d = eVar;
        this.f103732c = ViewConfiguration.get(eVar.getContext()).getScaledEdgeSlop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75508a(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f103730a = motionEvent.getRawX();
            this.f103731b = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.f103733d.f103786b.getTranslationY() > 150.0f) {
                C44507e eVar = this.f103733d;
                eVar.mo75524a(eVar.getCurrentPosition());
            } else {
                BounceBackViewPager bounceBackViewPager = this.f103733d.f103786b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bounceBackViewPager, "scaleX", bounceBackViewPager.getScaleX(), 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bounceBackViewPager, "scaleY", bounceBackViewPager.getScaleX(), 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bounceBackViewPager, "translationX", bounceBackViewPager.getTranslationX(), 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bounceBackViewPager, "translationY", bounceBackViewPager.getTranslationY(), 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet.start();
            }
            this.f103730a = 0.0f;
            this.f103731b = 0.0f;
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f103730a;
            float rawY = motionEvent.getRawY() - this.f103731b;
            float abs = Math.abs(rawY);
            float max = Math.max(1.0f - ((abs / ((float) this.f103733d.getHeight())) * 1.2f), 0.6f);
            this.f103734e = max;
            float height = (1.0f - max) * (1.0f - max) * ((float) this.f103733d.getHeight()) * 0.5f;
            C44507e eVar2 = this.f103733d;
            eVar2.f103791g = 255.0f - (Math.min((abs / ((float) eVar2.getHeight())) * 2.4f, 0.8f) * 255.0f);
            C44507e eVar3 = this.f103733d;
            if (eVar3.f103791g < 0.0f) {
                f = 0.0f;
            } else {
                f = this.f103733d.f103791g;
            }
            eVar3.f103791g = f;
            BounceBackViewPager bounceBackViewPager2 = this.f103733d.f103786b;
            if (bounceBackViewPager2.getTranslationY() >= 0.0f) {
                C44507e eVar4 = this.f103733d;
                eVar4.setBackgroundColor(eVar4.mo75520a(eVar4.f103791g));
                this.f103733d.getTransferConfig().f103757m.mo75489a(Math.round(this.f103733d.f103791g));
                bounceBackViewPager2.setTranslationX(rawX);
                bounceBackViewPager2.setTranslationY(rawY - height);
                bounceBackViewPager2.setScaleX(this.f103734e);
                bounceBackViewPager2.setScaleY(this.f103734e);
                return;
            }
            C44507e eVar5 = this.f103733d;
            eVar5.setBackgroundColor(eVar5.getTransConfig().f103747c);
            this.f103733d.getTransferConfig().f103757m.mo75489a(255);
            bounceBackViewPager2.setTranslationX(rawX);
            bounceBackViewPager2.setTranslationY(rawY);
        }
    }
}
