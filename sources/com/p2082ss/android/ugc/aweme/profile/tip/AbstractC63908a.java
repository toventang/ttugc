package com.p2082ss.android.ugc.aweme.profile.tip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.tip.a */
public abstract class AbstractC63908a extends FrameLayout {

    /* renamed from: a */
    public final AnimatorSet f144890a;

    /* renamed from: b */
    public final AnimatorSet f144891b;

    /* renamed from: c */
    public boolean f144892c;

    /* renamed from: d */
    private final View f144893d;

    /* renamed from: e */
    private SparseArray f144894e;

    static {
        Covode.recordClassIndex(75339);
    }

    public AbstractC63908a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public abstract View mo103457a();

    /* renamed from: a */
    public View mo103458a(int i) {
        if (this.f144894e == null) {
            this.f144894e = new SparseArray();
        }
        View view = (View) this.f144894e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f144894e.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet getDismissAnimatorSet() {
        return this.f144891b;
    }

    /* access modifiers changed from: protected */
    public final AnimatorSet getShowAnimatorSet() {
        return this.f144890a;
    }

    public final View getView() {
        return this.f144893d;
    }

    /* renamed from: b */
    public final void mo103463b() {
        if (this.f144892c) {
            this.f144892c = false;
            if (this.f144890a.isRunning()) {
                this.f144890a.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), (float) getHeight());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
            this.f144891b.setDuration(200L);
            this.f144891b.setInterpolator(new C17168c());
            this.f144891b.play(ofFloat).with(ofFloat2);
            this.f144891b.start();
            this.f144891b.addListener(new C63909a(this));
        }
    }

    public final void setShow(boolean z) {
        this.f144892c = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.tip.a$a */
    public static final class C63909a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC63908a f144895a;

        static {
            Covode.recordClassIndex(75340);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63909a(AbstractC63908a aVar) {
            this.f144895a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f144895a.setVisibility(8);
        }
    }

    private /* synthetic */ AbstractC63908a(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC63908a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f144893d = mo103457a();
        this.f144890a = new AnimatorSet();
        this.f144891b = new AnimatorSet();
    }
}
