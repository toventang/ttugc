package com.bytedance.scene.p1622d;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.scene.d.a */
public final class C22158a {
    static {
        Covode.recordClassIndex(25962);
    }

    /* renamed from: a */
    public static void m41634a(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    /* renamed from: c */
    public static void m41637c(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    /* renamed from: b */
    public static C22159a m41636b(View view) {
        return new C22159a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
    }

    /* renamed from: a */
    public static void m41635a(View view, C22159a aVar) {
        view.setTranslationX(aVar.f52389a);
        view.setTranslationY(aVar.f52390b);
        view.setScaleX(aVar.f52391c);
        view.setScaleY(aVar.f52392d);
        view.setRotation(aVar.f52393e);
        view.setRotationX(aVar.f52394f);
        view.setRotationY(aVar.f52395g);
        view.setAlpha(aVar.f52396h);
    }

    /* renamed from: com.bytedance.scene.d.a$a */
    public static class C22159a {

        /* renamed from: a */
        public final float f52389a;

        /* renamed from: b */
        public final float f52390b;

        /* renamed from: c */
        public final float f52391c;

        /* renamed from: d */
        public final float f52392d;

        /* renamed from: e */
        public final float f52393e;

        /* renamed from: f */
        public final float f52394f;

        /* renamed from: g */
        public final float f52395g;

        /* renamed from: h */
        public final float f52396h;

        static {
            Covode.recordClassIndex(25963);
        }

        public C22159a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f52389a = f;
            this.f52390b = f2;
            this.f52391c = f3;
            this.f52392d = f4;
            this.f52393e = f5;
            this.f52394f = f6;
            this.f52395g = f7;
            this.f52396h = f8;
        }
    }
}
