package com.p2082ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.z */
public final class C42062z extends AbstractC41997b {

    /* renamed from: d */
    public int f98057d = C34728n.m70946a(-5.0d);

    /* renamed from: e */
    private View f98058e;

    static {
        Covode.recordClassIndex(49992);
    }

    /* renamed from: c */
    private void m84182c() {
        this.f97943b = 160;
        this.f98057d = C34728n.m70946a(0.0d);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: d */
    public final void mo71175d(Animator animator) {
        m84182c();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: a */
    public final void mo71168a(Animator animator) {
        this.f98058e.setTranslationY(0.0f);
        this.f98058e.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: b */
    public final void mo71172b(Animator animator) {
        this.f98058e.setVisibility(8);
        m84182c();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: a */
    public final void mo71169a(ValueAnimator valueAnimator) {
        this.f98058e.setTranslationY(((float) this.f98057d) * valueAnimator.getAnimatedFraction());
        this.f98058e.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: b */
    public final void mo71173b(ValueAnimator valueAnimator) {
        this.f98058e.setTranslationY(((float) this.f98057d) * (1.0f - valueAnimator.getAnimatedFraction()));
        this.f98058e.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: c */
    public final void mo71174c(Animator animator) {
        this.f98058e.setVisibility(0);
        this.f98058e.setTranslationY((float) this.f98057d);
        this.f98058e.setAlpha(0.0f);
    }

    public C42062z(Context context, View view) {
        super(context);
        this.f98058e = view;
        m84182c();
        this.f97944c = 1;
    }
}
