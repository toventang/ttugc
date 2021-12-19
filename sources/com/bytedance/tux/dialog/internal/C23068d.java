package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.d */
public final class C23068d {

    /* renamed from: v */
    public static final C23069a f54598v = new C23069a((byte) 0);

    /* renamed from: a */
    public final TypedArray f54599a;

    /* renamed from: b */
    public final int f54600b;

    /* renamed from: c */
    public final int f54601c;

    /* renamed from: d */
    public final int f54602d;

    /* renamed from: e */
    public final int f54603e;

    /* renamed from: f */
    public final int f54604f;

    /* renamed from: g */
    public final float f54605g;

    /* renamed from: h */
    public final int f54606h;

    /* renamed from: i */
    public final int f54607i;

    /* renamed from: j */
    public final int f54608j;

    /* renamed from: k */
    public final int f54609k;

    /* renamed from: l */
    public final int f54610l;

    /* renamed from: m */
    public final int f54611m;

    /* renamed from: n */
    public final int f54612n;

    /* renamed from: o */
    public final int f54613o;

    /* renamed from: p */
    public final int f54614p;

    /* renamed from: q */
    public final int f54615q;

    /* renamed from: r */
    public final int f54616r;

    /* renamed from: s */
    public final int f54617s;

    /* renamed from: t */
    public final int f54618t;

    /* renamed from: u */
    public final Context f54619u;

    static {
        Covode.recordClassIndex(26992);
    }

    /* renamed from: com.bytedance.tux.dialog.internal.d$a */
    public static final class C23069a {
        static {
            Covode.recordClassIndex(26993);
        }

        private C23069a() {
        }

        public /* synthetic */ C23069a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C23068d m43492a(Context context) {
            C89219l.m154719c(context, "");
            return new C23068d(context, (byte) 0);
        }
    }

    private C23068d(Context context) {
        this.f54619u = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.cw, R.attr.cx, R.attr.cy, R.attr.cz, R.attr.d0, R.attr.d1, R.attr.d2, R.attr.d3, R.attr.d4, R.attr.d5, R.attr.d6, R.attr.d7, R.attr.d8, R.attr.d9, R.attr.d_, R.attr.da, R.attr.db, R.attr.dc, R.attr.dd, R.attr.de}, R.attr.br, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f54599a = obtainStyledAttributes;
        this.f54600b = obtainStyledAttributes.getInt(16, 0);
        this.f54601c = obtainStyledAttributes.getInt(14, 0);
        this.f54602d = obtainStyledAttributes.getInt(15, 0);
        this.f54603e = obtainStyledAttributes.getInt(13, 0);
        this.f54604f = obtainStyledAttributes.getInt(12, 0);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f54605g = obtainStyledAttributes.getDimension(11, TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
        this.f54606h = obtainStyledAttributes.getColor(6, 0);
        this.f54607i = obtainStyledAttributes.getColor(9, 0);
        this.f54608j = obtainStyledAttributes.getColor(10, 0);
        this.f54609k = obtainStyledAttributes.getColor(4, 0);
        this.f54610l = obtainStyledAttributes.getColor(5, 0);
        this.f54611m = obtainStyledAttributes.getColor(8, 0);
        this.f54612n = obtainStyledAttributes.getColor(7, 0);
        this.f54613o = obtainStyledAttributes.getColor(3, 0);
        this.f54614p = obtainStyledAttributes.getResourceId(0, 0);
        this.f54615q = obtainStyledAttributes.getResourceId(17, 0);
        this.f54616r = obtainStyledAttributes.getInt(1, 0);
        this.f54617s = obtainStyledAttributes.getInt(2, 0);
        this.f54618t = obtainStyledAttributes.getInt(18, 0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ C23068d(Context context, byte b) {
        this(context);
    }
}
