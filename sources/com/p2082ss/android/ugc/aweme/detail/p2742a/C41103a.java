package com.p2082ss.android.ugc.aweme.detail.p2742a;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.detail.a.a */
public final class C41103a {

    /* renamed from: a */
    public static final C41103a f96086a = new C41103a();

    private C41103a() {
    }

    static {
        Covode.recordClassIndex(48978);
    }

    /* renamed from: a */
    public static /* synthetic */ AnimationSet m82796a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* renamed from: b */
    public static /* synthetic */ AnimationSet m82797b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }
}
