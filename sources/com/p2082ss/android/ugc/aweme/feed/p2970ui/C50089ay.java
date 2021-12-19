package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ay */
public final class C50089ay implements AbstractC24203d<AbstractC24457f> {

    /* renamed from: a */
    private View f115618a;

    /* renamed from: b */
    private Context f115619b;

    static {
        Covode.recordClassIndex(59215);
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

    public C50089ay(View view, Context context) {
        this.f115618a = view;
        this.f115619b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
        AbstractC24457f fVar2 = fVar;
        if (fVar2 != null) {
            ViewGroup.LayoutParams layoutParams = this.f115618a.getLayoutParams();
            int width = (int) (((float) fVar2.getWidth()) * (((float) layoutParams.height) / ((float) fVar2.getHeight())));
            if (width != layoutParams.width) {
                layoutParams.width = width;
                this.f115618a.setLayoutParams(layoutParams);
            }
        }
    }
}
