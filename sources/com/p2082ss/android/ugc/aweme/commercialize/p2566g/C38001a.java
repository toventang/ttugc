package com.p2082ss.android.ugc.aweme.commercialize.p2566g;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.p1868a.C24293a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g.a */
public final class C38001a implements AbstractC24203d<AbstractC24457f> {

    /* renamed from: a */
    private boolean f89810a = false;

    /* renamed from: b */
    private SimpleDraweeView f89811b;

    static {
        Covode.recordClassIndex(45462);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onRelease(String str) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final void onSubmit(String str, Object obj) {
    }

    public C38001a(SimpleDraweeView simpleDraweeView) {
        this.f89811b = simpleDraweeView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
        AbstractC24457f fVar2 = fVar;
        if (animatable != null) {
            ValueAnimator a = C24293a.m46220a((C24290a) animatable);
            a.setRepeatCount(-1);
            a.start();
            if (this.f89810a && fVar2 != null) {
                this.f89811b.getLayoutParams().width = C13628n.m24504a(this.f89811b.getContext());
                this.f89811b.getLayoutParams().height = -2;
                this.f89811b.setAspectRatio(((float) fVar2.getWidth()) / ((float) fVar2.getHeight()));
            }
        }
    }
}
