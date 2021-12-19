package com.facebook.drawee.p1854e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.e.q */
public final class C24229q {

    /* renamed from: com.facebook.drawee.e.q$l */
    public interface AbstractC24241l {
        static {
            Covode.recordClassIndex(28372);
        }

        /* renamed from: a */
        Object mo39946a();
    }

    static {
        Covode.recordClassIndex(28360);
    }

    /* renamed from: com.facebook.drawee.e.q$c */
    static class C24232c extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57461a = new C24232c();

        public final String toString() {
            return "center";
        }

        private C24232c() {
        }

        static {
            Covode.recordClassIndex(28363);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$d */
    static class C24233d extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57462a = new C24233d();

        public final String toString() {
            return "center_crop";
        }

        private C24233d() {
        }

        static {
            Covode.recordClassIndex(28364);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float height;
            if (f4 > f3) {
                f5 = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                height = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                height = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$e */
    static class C24234e extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57463a = new C24234e();

        public final String toString() {
            return "center_inside";
        }

        private C24234e() {
        }

        static {
            Covode.recordClassIndex(28365);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$f */
    static class C24235f extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57464a = new C24235f();

        public final String toString() {
            return "fit_bottom_start";
        }

        private C24235f() {
        }

        static {
            Covode.recordClassIndex(28366);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$g */
    static class C24236g extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57465a = new C24236g();

        public final String toString() {
            return "fit_center";
        }

        private C24236g() {
        }

        static {
            Covode.recordClassIndex(28367);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$h */
    static class C24237h extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57466a = new C24237h();

        public final String toString() {
            return "fit_end";
        }

        private C24237h() {
        }

        static {
            Covode.recordClassIndex(28368);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$i */
    static class C24238i extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57467a = new C24238i();

        public final String toString() {
            return "fit_start";
        }

        private C24238i() {
        }

        static {
            Covode.recordClassIndex(28369);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$j */
    static class C24239j extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57468a = new C24239j();

        public final String toString() {
            return "fit_xy";
        }

        private C24239j() {
        }

        static {
            Covode.recordClassIndex(28370);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$k */
    static class C24240k extends AbstractC24230a {

        /* renamed from: a */
        public static final AbstractC24231b f57469a = new C24240k();

        public final String toString() {
            return "focus_crop";
        }

        private C24240k() {
        }

        static {
            Covode.recordClassIndex(28371);
        }

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24230a
        /* renamed from: a */
        public final void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                float f6 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f6), 0.0f), ((float) rect.width()) - f6);
                max = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f7 = ((float) i2) * f3;
                max = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f7), 0.0f), ((float) rect.height()) - f7) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (max + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$b */
    public interface AbstractC24231b {

        /* renamed from: b */
        public static final AbstractC24231b f57452b = C24239j.f57468a;

        /* renamed from: c */
        public static final AbstractC24231b f57453c = C24238i.f57467a;

        /* renamed from: d */
        public static final AbstractC24231b f57454d = C24236g.f57465a;

        /* renamed from: e */
        public static final AbstractC24231b f57455e = C24237h.f57466a;

        /* renamed from: f */
        public static final AbstractC24231b f57456f = C24232c.f57461a;

        /* renamed from: g */
        public static final AbstractC24231b f57457g = C24234e.f57463a;

        /* renamed from: h */
        public static final AbstractC24231b f57458h = C24233d.f57462a;

        /* renamed from: i */
        public static final AbstractC24231b f57459i = C24240k.f57469a;

        /* renamed from: j */
        public static final AbstractC24231b f57460j = C24235f.f57464a;

        /* renamed from: a */
        Matrix mo39936a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);

        static {
            Covode.recordClassIndex(28362);
        }
    }

    /* renamed from: a */
    public static C24228p m45994a(Drawable drawable) {
        while (drawable != null) {
            if (drawable instanceof C24228p) {
                return (C24228p) drawable;
            }
            if (drawable instanceof AbstractC24213c) {
                drawable = ((AbstractC24213c) drawable).getDrawable();
            } else {
                if (drawable instanceof C24210a) {
                    C24210a aVar = (C24210a) drawable;
                    int length = aVar.f57344a.length;
                    for (int i = 0; i < length; i++) {
                        C24228p a = m45994a(aVar.mo39842a(i));
                        if (a != null) {
                            return a;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: com.facebook.drawee.e.q$a */
    public static abstract class AbstractC24230a implements AbstractC24231b {
        static {
            Covode.recordClassIndex(28361);
        }

        /* renamed from: a */
        public abstract void mo9312a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        @Override // com.facebook.drawee.p1854e.C24229q.AbstractC24231b
        /* renamed from: a */
        public final Matrix mo39936a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            mo9312a(matrix, rect, i, i2, f, f2, ((float) rect.width()) / ((float) i), ((float) rect.height()) / ((float) i2));
            return matrix;
        }
    }
}
