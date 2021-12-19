package com.p2082ss.android.ugc.aweme.themechange.base;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.c */
public final class C77795c {

    /* renamed from: a */
    static final int f174518a = Color.parseColor("#FFFFFFFF");

    /* renamed from: b */
    static final int f174519b = Color.parseColor("#26FFFFFF");

    /* renamed from: c */
    static final int f174520c = Color.parseColor("#26000000");

    /* renamed from: d */
    public static final C77795c f174521d = new C77795c();

    /* renamed from: e */
    private static final Context f174522e;

    /* renamed from: f */
    private static final int f174523f = Color.parseColor("#D8000000");

    /* renamed from: g */
    private static final int f174524g = Color.parseColor("#80000000");

    /* renamed from: h */
    private static final int f174525h = Color.parseColor("#99000000");

    private C77795c() {
    }

    /* renamed from: a */
    public static int m135909a() {
        return (f174518a & 16777215) | Integer.MIN_VALUE;
    }

    /* renamed from: b */
    private static int m135913b() {
        return C0643b.m2378c(f174522e, R.color.c);
    }

    /* renamed from: c */
    private static int m135914c() {
        return C0643b.m2378c(f174522e, R.color.d);
    }

    static {
        Covode.recordClassIndex(90873);
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        f174522e = application;
    }

    /* renamed from: a */
    public static Drawable m135911a(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C89219l.m154716b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(f174518a, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public static Drawable m135912a(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C89219l.m154716b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public final Drawable mo121373a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
        C89219l.m154716b(obtainStyledAttributes, "");
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        boolean z2 = obtainStyledAttributes.getBoolean(43, false);
        int dimension = (int) obtainStyledAttributes.getDimension(31, 0.0f);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(32, false);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        boolean z6 = obtainStyledAttributes.getBoolean(36, false);
        boolean z7 = obtainStyledAttributes.getBoolean(46, false);
        int a = m135910a(z3, z4, z5, z6);
        if (z7) {
            a = f174518a;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            a = obtainStyledAttributes.getColor(0, a);
        }
        obtainStyledAttributes.recycle();
        C84966b a2 = C84966b.C84967a.m146038a().mo129755b(a).mo129753a(a, 0);
        if (z) {
            a2.mo129752a(1);
        } else {
            a2.mo129752a(0);
            if (z2) {
                float f = (float) dimension;
                a2.mo129754a(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a2.mo129751a((float) dimension);
            }
        }
        return a2.mo129750a();
    }

    /* renamed from: a */
    public static int m135910a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f174519b;
        }
        if (z) {
            if (z2) {
                return m135914c();
            }
            return m135913b();
        } else if (z2) {
            if (z3) {
                return f174520c;
            }
            return f174524g;
        } else if (z3) {
            return f174525h;
        } else {
            return f174523f;
        }
    }
}
