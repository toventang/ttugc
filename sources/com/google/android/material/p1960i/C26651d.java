package com.google.android.material.p1960i;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.google.android.material.i.d */
public final class C26651d {

    /* renamed from: a */
    public float f63078a;

    /* renamed from: b */
    public float f63079b;

    /* renamed from: c */
    public float f63080c;

    /* renamed from: d */
    public float f63081d;

    /* renamed from: e */
    final List<AbstractC26654c> f63082e;

    /* renamed from: com.google.android.material.i.d$c */
    public static abstract class AbstractC26654c {

        /* renamed from: g */
        protected final Matrix f63092g = new Matrix();

        static {
            Covode.recordClassIndex(32105);
        }

        /* renamed from: a */
        public abstract void mo44117a(Matrix matrix, Path path);
    }

    static {
        Covode.recordClassIndex(32102);
    }

    /* renamed from: com.google.android.material.i.d$a */
    public static class C26652a extends AbstractC26654c {

        /* renamed from: h */
        private static final RectF f63083h = new RectF();

        /* renamed from: a */
        public float f63084a;

        /* renamed from: b */
        public float f63085b;

        /* renamed from: c */
        public float f63086c;

        /* renamed from: d */
        public float f63087d;

        /* renamed from: e */
        public float f63088e;

        /* renamed from: f */
        public float f63089f;

        static {
            Covode.recordClassIndex(32103);
        }

        @Override // com.google.android.material.p1960i.C26651d.AbstractC26654c
        /* renamed from: a */
        public final void mo44117a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f63092g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f63083h;
            rectF.set(this.f63084a, this.f63085b, this.f63086c, this.f63087d);
            path.arcTo(rectF, this.f63088e, this.f63089f, false);
            path.transform(matrix);
        }

        public C26652a(float f, float f2, float f3, float f4) {
            this.f63084a = f;
            this.f63085b = f2;
            this.f63086c = f3;
            this.f63087d = f4;
        }
    }

    /* renamed from: a */
    public final void mo44114a(float f) {
        C26653b bVar = new C26653b();
        bVar.f63090a = f;
        bVar.f63091b = 0.0f;
        this.f63082e.add(bVar);
        this.f63080c = f;
        this.f63081d = 0.0f;
    }

    /* renamed from: com.google.android.material.i.d$b */
    public static class C26653b extends AbstractC26654c {

        /* renamed from: a */
        public float f63090a;

        /* renamed from: b */
        public float f63091b;

        static {
            Covode.recordClassIndex(32104);
        }

        @Override // com.google.android.material.p1960i.C26651d.AbstractC26654c
        /* renamed from: a */
        public final void mo44117a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f63092g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f63090a, this.f63091b);
            path.transform(matrix);
        }
    }

    /* renamed from: a */
    public final void mo44116a(Matrix matrix, Path path) {
        int size = this.f63082e.size();
        for (int i = 0; i < size; i++) {
            this.f63082e.get(i).mo44117a(matrix, path);
        }
    }

    /* renamed from: a */
    public final void mo44115a(float f, float f2, float f3, float f4, float f5, float f6) {
        C26652a aVar = new C26652a(f, f2, f3, f4);
        aVar.f63088e = f5;
        aVar.f63089f = f6;
        this.f63082e.add(aVar);
        double d = (double) (f5 + f6);
        this.f63080c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f63081d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }
}
