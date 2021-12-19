package com.facebook.drawee.p1855f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.drawee.p1854e.C24229q;
import java.util.List;

/* renamed from: com.facebook.drawee.f.b */
public class C24247b {

    /* renamed from: a */
    public static final C24229q.AbstractC24231b f57476a = C24229q.AbstractC24231b.f57457g;

    /* renamed from: b */
    public static final C24229q.AbstractC24231b f57477b = C24229q.AbstractC24231b.f57458h;

    /* renamed from: c */
    public Resources f57478c;

    /* renamed from: d */
    public int f57479d = 300;

    /* renamed from: e */
    public float f57480e = 0.0f;

    /* renamed from: f */
    public Drawable f57481f = null;

    /* renamed from: g */
    public C24229q.AbstractC24231b f57482g;

    /* renamed from: h */
    public Drawable f57483h;

    /* renamed from: i */
    public C24229q.AbstractC24231b f57484i;

    /* renamed from: j */
    public Drawable f57485j;

    /* renamed from: k */
    public C24229q.AbstractC24231b f57486k;

    /* renamed from: l */
    public Drawable f57487l;

    /* renamed from: m */
    public C24229q.AbstractC24231b f57488m;

    /* renamed from: n */
    public C24229q.AbstractC24231b f57489n;

    /* renamed from: o */
    public PointF f57490o;

    /* renamed from: p */
    public ColorFilter f57491p;

    /* renamed from: q */
    public Drawable f57492q;

    /* renamed from: r */
    public List<Drawable> f57493r;

    /* renamed from: s */
    public Drawable f57494s;

    /* renamed from: t */
    public C24250e f57495t;

    /* renamed from: u */
    private Matrix f57496u;

    static {
        Covode.recordClassIndex(28378);
    }

    /* renamed from: a */
    public final C24246a mo39973a() {
        m46043b();
        return new C24246a(this);
    }

    /* renamed from: b */
    private void m46043b() {
        List<Drawable> list = this.f57493r;
        if (list != null) {
            for (Drawable drawable : list) {
                C24091i.m45617a(drawable);
            }
        }
    }

    /* renamed from: a */
    public static C24247b m46042a(Resources resources) {
        return new C24247b(resources);
    }

    /* renamed from: b */
    public final C24247b mo39977b(int i) {
        this.f57485j = this.f57478c.getDrawable(i);
        return this;
    }

    /* renamed from: a */
    public final C24247b mo39974a(int i) {
        this.f57481f = this.f57478c.getDrawable(i);
        return this;
    }

    public C24247b(Resources resources) {
        this.f57478c = resources;
        C24229q.AbstractC24231b bVar = f57476a;
        this.f57482g = bVar;
        this.f57483h = null;
        this.f57484i = bVar;
        this.f57485j = null;
        this.f57486k = bVar;
        this.f57487l = null;
        this.f57488m = bVar;
        this.f57489n = f57477b;
        this.f57496u = null;
        this.f57490o = null;
        this.f57491p = null;
        this.f57492q = null;
        this.f57493r = null;
        this.f57494s = null;
        this.f57495t = null;
    }

    /* renamed from: a */
    public final C24247b mo39975a(Drawable drawable) {
        if (drawable == null) {
            this.f57494s = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f57494s = stateListDrawable;
        }
        return this;
    }

    /* renamed from: a */
    public final C24247b mo39976a(C24229q.AbstractC24231b bVar) {
        this.f57489n = bVar;
        this.f57496u = null;
        return this;
    }
}
