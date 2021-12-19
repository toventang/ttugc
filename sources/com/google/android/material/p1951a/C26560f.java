package com.google.android.material.p1951a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.a.f */
public final class C26560f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f62664a = new Matrix();

    static {
        Covode.recordClassIndex(31991);
    }

    public C26560f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ Matrix get(ImageView imageView) {
        this.f62664a.set(imageView.getImageMatrix());
        return this.f62664a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
