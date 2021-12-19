package com.google.android.material.p1952b;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1958g.C26645a;

/* renamed from: com.google.android.material.b.c */
final class C26584c {

    /* renamed from: a */
    static final boolean f62765a;

    /* renamed from: b */
    final C26582a f62766b;

    /* renamed from: c */
    int f62767c;

    /* renamed from: d */
    int f62768d;

    /* renamed from: e */
    int f62769e;

    /* renamed from: f */
    int f62770f;

    /* renamed from: g */
    public int f62771g;

    /* renamed from: h */
    public int f62772h;

    /* renamed from: i */
    public PorterDuff.Mode f62773i;

    /* renamed from: j */
    public ColorStateList f62774j;

    /* renamed from: k */
    public ColorStateList f62775k;

    /* renamed from: l */
    public ColorStateList f62776l;

    /* renamed from: m */
    final Paint f62777m = new Paint(1);

    /* renamed from: n */
    final Rect f62778n = new Rect();

    /* renamed from: o */
    final RectF f62779o = new RectF();

    /* renamed from: p */
    GradientDrawable f62780p;

    /* renamed from: q */
    Drawable f62781q;

    /* renamed from: r */
    GradientDrawable f62782r;

    /* renamed from: s */
    Drawable f62783s;

    /* renamed from: t */
    GradientDrawable f62784t;

    /* renamed from: u */
    GradientDrawable f62785u;

    /* renamed from: v */
    GradientDrawable f62786v;

    /* renamed from: w */
    public boolean f62787w = false;

    static {
        boolean z;
        Covode.recordClassIndex(32021);
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f62765a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43861a() {
        GradientDrawable gradientDrawable = this.f62784t;
        if (gradientDrawable != null) {
            C0705a.m2496a(gradientDrawable, this.f62774j);
            PorterDuff.Mode mode = this.f62773i;
            if (mode != null) {
                C0705a.m2499a(this.f62784t, mode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43863c() {
        if (!f62765a) {
            this.f62766b.invalidate();
        } else if (this.f62785u != null) {
            this.f62766b.setInternalBackground(mo43862b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Drawable mo43862b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f62784t = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f62771g) + 1.0E-5f);
        this.f62784t.setColor(-1);
        mo43861a();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f62785u = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f62771g) + 1.0E-5f);
        this.f62785u.setColor(0);
        this.f62785u.setStroke(this.f62772h, this.f62775k);
        InsetDrawable a = mo43860a(new LayerDrawable(new Drawable[]{this.f62784t, this.f62785u}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f62786v = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f62771g) + 1.0E-5f);
        this.f62786v.setColor(-1);
        return new C26583b(C26645a.m52890a(this.f62776l), a, this.f62786v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InsetDrawable mo43860a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f62767c, this.f62769e, this.f62768d, this.f62770f);
    }

    public C26584c(C26582a aVar) {
        this.f62766b = aVar;
    }
}
