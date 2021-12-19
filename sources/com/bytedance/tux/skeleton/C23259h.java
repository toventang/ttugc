package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.content.p032a.C0641g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.tux.skeleton.h */
public final class C23259h {

    /* renamed from: f */
    public static final C23260a f55105f = new C23260a((byte) 0);

    /* renamed from: a */
    public final int f55106a;

    /* renamed from: b */
    public final int f55107b;

    /* renamed from: c */
    public final int f55108c;

    /* renamed from: d */
    public final boolean f55109d;

    /* renamed from: e */
    public final Context f55110e;

    static {
        Covode.recordClassIndex(27202);
    }

    /* renamed from: com.bytedance.tux.skeleton.h$a */
    public static final class C23260a {
        static {
            Covode.recordClassIndex(27203);
        }

        private C23260a() {
        }

        public /* synthetic */ C23260a(byte b) {
            this();
        }
    }

    private C23259h(Context context) {
        this.f55110e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.aqr, R.attr.aqt, R.attr.aqv, R.attr.aqw}, R.attr.c4, 0);
        this.f55106a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int b = C0641g.m2357b(obtainStyledAttributes, 1);
        this.f55107b = b;
        this.f55108c = obtainStyledAttributes.getColor(2, b);
        this.f55109d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ C23259h(Context context, byte b) {
        this(context);
    }
}
