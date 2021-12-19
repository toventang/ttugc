package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.AbstractC24120c;

/* renamed from: com.facebook.imagepipeline.c.g */
public final class C24359g implements AbstractC24120c<Bitmap> {

    /* renamed from: a */
    private static C24359g f57751a;

    static {
        Covode.recordClassIndex(28501);
    }

    private C24359g() {
    }

    /* renamed from: a */
    public static C24359g m46366a() {
        if (f57751a == null) {
            f57751a = new C24359g();
        }
        return f57751a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.common.p1836h.AbstractC24120c
    /* renamed from: a */
    public final /* synthetic */ void mo39665a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
