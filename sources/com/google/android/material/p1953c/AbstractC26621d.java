package com.google.android.material.p1953c;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1953c.C26619c;
import com.google.android.material.p1956e.C26629a;

/* renamed from: com.google.android.material.c.d */
public interface AbstractC26621d extends C26619c.AbstractC26620a {
    static {
        Covode.recordClassIndex(32069);
    }

    /* renamed from: a */
    void mo43993a();

    /* renamed from: b */
    void mo43995b();

    int getCircularRevealScrimColor();

    C26625d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C26625d dVar);

    /* renamed from: com.google.android.material.c.d$d */
    public static class C26625d {

        /* renamed from: a */
        public float f62947a;

        /* renamed from: b */
        public float f62948b;

        /* renamed from: c */
        public float f62949c;

        static {
            Covode.recordClassIndex(32073);
        }

        private C26625d() {
        }

        /* renamed from: a */
        public final boolean mo44023a() {
            if (this.f62949c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* synthetic */ C26625d(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo44022a(C26625d dVar) {
            mo44021a(dVar.f62947a, dVar.f62948b, dVar.f62949c);
        }

        public C26625d(C26625d dVar) {
            this(dVar.f62947a, dVar.f62948b, dVar.f62949c);
        }

        /* renamed from: a */
        public final void mo44021a(float f, float f2, float f3) {
            this.f62947a = f;
            this.f62948b = f2;
            this.f62949c = f3;
        }

        public C26625d(float f, float f2, float f3) {
            this.f62947a = f;
            this.f62948b = f2;
            this.f62949c = f3;
        }
    }

    /* renamed from: com.google.android.material.c.d$a */
    public static class C26622a implements TypeEvaluator<C26625d> {

        /* renamed from: a */
        public static final TypeEvaluator<C26625d> f62943a = new C26622a();

        /* renamed from: b */
        private final C26625d f62944b = new C26625d((byte) 0);

        static {
            Covode.recordClassIndex(32070);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ C26625d evaluate(float f, C26625d dVar, C26625d dVar2) {
            C26625d dVar3 = dVar;
            C26625d dVar4 = dVar2;
            this.f62944b.mo44021a(C26629a.m52822a(dVar3.f62947a, dVar4.f62947a, f), C26629a.m52822a(dVar3.f62948b, dVar4.f62948b, f), C26629a.m52822a(dVar3.f62949c, dVar4.f62949c, f));
            return this.f62944b;
        }
    }

    /* renamed from: com.google.android.material.c.d$b */
    public static class C26623b extends Property<AbstractC26621d, C26625d> {

        /* renamed from: a */
        public static final Property<AbstractC26621d, C26625d> f62945a = new C26623b("circularReveal");

        static {
            Covode.recordClassIndex(32071);
        }

        private C26623b(String str) {
            super(C26625d.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ C26625d get(AbstractC26621d dVar) {
            return dVar.getRevealInfo();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(AbstractC26621d dVar, C26625d dVar2) {
            dVar.setRevealInfo(dVar2);
        }
    }

    /* renamed from: com.google.android.material.c.d$c */
    public static class C26624c extends Property<AbstractC26621d, Integer> {

        /* renamed from: a */
        public static final Property<AbstractC26621d, Integer> f62946a = new C26624c("circularRevealScrimColor");

        static {
            Covode.recordClassIndex(32072);
        }

        private C26624c(String str) {
            super(Integer.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(AbstractC26621d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(AbstractC26621d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }
}
