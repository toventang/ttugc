package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imageutils.C24656a;

/* renamed from: com.facebook.imagepipeline.memory.e */
public final class C24486e extends AbstractC24501q<Bitmap> {
    static {
        Covode.recordClassIndex(28630);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa
    /* renamed from: b */
    public final /* synthetic */ int mo40351b(Object obj) {
        return C24656a.m47171a((Bitmap) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa, com.facebook.imagepipeline.memory.AbstractC24501q
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo40350a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (m46767a(bitmap2)) {
            super.mo40350a((Object) bitmap2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa, com.facebook.imagepipeline.memory.AbstractC24501q
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo40349a(int i) {
        Bitmap bitmap = (Bitmap) super.mo40349a(i);
        if (bitmap == null || !m46767a(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: a */
    private static boolean m46767a(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C24099a.m45660d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C24099a.m45660d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }
}
