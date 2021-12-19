package com.facebook.drawee.p1855f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1854e.AbstractC24213c;
import com.facebook.drawee.p1854e.AbstractC24220j;
import com.facebook.drawee.p1854e.C24217g;
import com.facebook.drawee.p1854e.C24221k;
import com.facebook.drawee.p1854e.C24222l;
import com.facebook.drawee.p1854e.C24223m;
import com.facebook.drawee.p1854e.C24227o;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.drawee.f.f */
public class C24252f {

    /* renamed from: a */
    static final Drawable f57508a = new ColorDrawable(0);

    static {
        Covode.recordClassIndex(28383);
    }

    /* renamed from: a */
    private static AbstractC24213c m46069a(AbstractC24213c cVar) {
        while (true) {
            Drawable drawable = cVar.getDrawable();
            if (drawable == cVar || !(drawable instanceof AbstractC24213c)) {
                return cVar;
            }
            cVar = (AbstractC24213c) drawable;
        }
        return cVar;
    }

    /* renamed from: a */
    private static void m46072a(AbstractC24220j jVar) {
        jVar.mo39910a(false);
        jVar.mo39907a();
        jVar.mo39909a(0, 0.0f);
        jVar.mo39908a(0.0f);
        jVar.mo39912b(false);
    }

    /* renamed from: a */
    static Drawable m46067a(Drawable drawable, C24250e eVar) {
        try {
            if (!(drawable == null || eVar == null)) {
                if (eVar.f57499a == C24250e.EnumC24251a.OVERLAY_COLOR) {
                    C24223m mVar = new C24223m(drawable);
                    m46073a((AbstractC24220j) mVar, eVar);
                    mVar.mo39925a(eVar.f57502d);
                    C24644b.m47156a();
                    return mVar;
                }
            }
            C24644b.m47156a();
            return drawable;
        } finally {
            C24644b.m47156a();
        }
    }

    /* renamed from: a */
    static void m46070a(AbstractC24213c cVar, C24250e eVar) {
        Drawable drawable = cVar.getDrawable();
        if (eVar == null || eVar.f57499a != C24250e.EnumC24251a.OVERLAY_COLOR) {
            if (drawable instanceof C24223m) {
                Drawable drawable2 = f57508a;
                cVar.setDrawable(((C24217g) drawable).setCurrent(drawable2));
                drawable2.setCallback(null);
            }
        } else if (drawable instanceof C24223m) {
            C24223m mVar = (C24223m) drawable;
            m46073a((AbstractC24220j) mVar, eVar);
            mVar.mo39925a(eVar.f57502d);
        } else {
            cVar.setDrawable(m46067a(cVar.setDrawable(f57508a), eVar));
        }
    }

    /* renamed from: a */
    private static void m46073a(AbstractC24220j jVar, C24250e eVar) {
        jVar.mo39910a(eVar.f57500b);
        jVar.mo39911a(eVar.f57501c);
        jVar.mo39909a(eVar.f57504f, eVar.f57503e);
        jVar.mo39908a(eVar.f57505g);
        jVar.mo39912b(eVar.f57506h);
    }

    /* renamed from: a */
    static Drawable m46066a(Drawable drawable, C24229q.AbstractC24231b bVar, PointF pointF) {
        C24644b.m47156a();
        if (drawable == null || bVar == null) {
            C24644b.m47156a();
            return drawable;
        }
        C24228p pVar = new C24228p(drawable, bVar);
        if (pointF != null) {
            pVar.mo39934a(pointF);
        }
        C24644b.m47156a();
        return pVar;
    }

    /* renamed from: a */
    static Drawable m46068a(Drawable drawable, C24250e eVar, Resources resources) {
        try {
            if (!(drawable == null || eVar == null)) {
                if (eVar.f57499a == C24250e.EnumC24251a.BITMAP_ONLY) {
                    if (drawable instanceof C24217g) {
                        AbstractC24213c a = m46069a((C24217g) drawable);
                        a.setDrawable(m46074b(a.setDrawable(f57508a), eVar, resources));
                        C24644b.m47156a();
                        return drawable;
                    }
                    Drawable b = m46074b(drawable, eVar, resources);
                    C24644b.m47156a();
                    return b;
                }
            }
            C24644b.m47156a();
            return drawable;
        } finally {
            C24644b.m47156a();
        }
    }

    /* renamed from: b */
    private static Drawable m46074b(Drawable drawable, C24250e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C24221k kVar = new C24221k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m46073a((AbstractC24220j) kVar, eVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C24227o oVar = new C24227o((NinePatchDrawable) drawable);
            m46073a((AbstractC24220j) oVar, eVar);
            return oVar;
        } else if (drawable instanceof ColorDrawable) {
            int i = Build.VERSION.SDK_INT;
            C24222l a = C24222l.m45965a((ColorDrawable) drawable);
            m46073a((AbstractC24220j) a, eVar);
            return a;
        } else {
            C24099a.m45653b("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    /* renamed from: a */
    static void m46071a(AbstractC24213c cVar, C24250e eVar, Resources resources) {
        AbstractC24213c a = m46069a(cVar);
        Drawable drawable = a.getDrawable();
        if (eVar == null || eVar.f57499a != C24250e.EnumC24251a.BITMAP_ONLY) {
            if (drawable instanceof AbstractC24220j) {
                m46072a((AbstractC24220j) drawable);
            }
        } else if (drawable instanceof AbstractC24220j) {
            m46073a((AbstractC24220j) drawable, eVar);
        } else if (drawable != null) {
            a.setDrawable(f57508a);
            a.setDrawable(m46074b(drawable, eVar, resources));
        }
    }
}
