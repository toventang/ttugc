package com.facebook.drawee.p1851c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.c.c */
public class C24202c<INFO> implements AbstractC24203d<INFO> {
    private static final AbstractC24203d<Object> NO_OP_LISTENER = new C24202c();

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onSubmit(String str, Object obj) {
    }

    public static <INFO> AbstractC24203d<INFO> getNoOpListener() {
        return (AbstractC24203d<INFO>) NO_OP_LISTENER;
    }

    static {
        Covode.recordClassIndex(28333);
    }
}
