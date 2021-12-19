package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.dmt.p1194ui.widget.util.FontSpan;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.c */
public final class C4128c {

    /* renamed from: a */
    private static final SparseIntArray f11528a;

    /* renamed from: b */
    private static final SparseIntArray f11529b;

    /* renamed from: c */
    private static final SparseIntArray f11530c;

    static {
        Covode.recordClassIndex(4687);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11528a = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f11529b = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f11530c = sparseIntArray3;
        sparseIntArray.put(0, R.style.jy);
        sparseIntArray.put(1, R.style.k1);
        sparseIntArray.put(2, R.style.k4);
        sparseIntArray.put(3, R.style.k7);
        sparseIntArray.put(4, R.style.k_);
        sparseIntArray.put(5, R.style.kc);
        sparseIntArray.put(6, R.style.kf);
        sparseIntArray.put(7, R.style.ki);
        sparseIntArray.put(8, R.style.kl);
        sparseIntArray2.put(0, R.dimen.zs);
        sparseIntArray2.put(1, R.dimen.zt);
        sparseIntArray2.put(2, R.dimen.zu);
        sparseIntArray2.put(3, R.dimen.zv);
        sparseIntArray2.put(4, R.dimen.zw);
        sparseIntArray2.put(5, R.dimen.zx);
        sparseIntArray2.put(6, R.dimen.zy);
        sparseIntArray2.put(7, R.dimen.zz);
        sparseIntArray2.put(8, R.dimen.a00);
        sparseIntArray3.put(0, R.dimen.zj);
        sparseIntArray3.put(1, R.dimen.zk);
        sparseIntArray3.put(2, R.dimen.zl);
        sparseIntArray3.put(3, R.dimen.zm);
        sparseIntArray3.put(4, R.dimen.zn);
        sparseIntArray3.put(5, R.dimen.zo);
        sparseIntArray3.put(6, R.dimen.zp);
        sparseIntArray3.put(7, R.dimen.zq);
        sparseIntArray3.put(8, R.dimen.zr);
    }

    /* renamed from: b */
    private static Typeface m10034b(int i) {
        return C17300a.m32029a().mo27610a(m10029a(i));
    }

    /* renamed from: a */
    private static String m10029a(int i) {
        if (i == 700) {
            return C17303d.f41568b;
        }
        if (i == 600) {
            return C17303d.f41573g;
        }
        return C17303d.f41567a;
    }

    /* renamed from: a */
    public static void m10033a(TextView textView, int i) {
        if (textView != null) {
            textView.setTypeface(m10034b(i));
        }
    }

    /* renamed from: a */
    public static void m10030a(Context context, Paint paint, int i, int i2) {
        if (context != null && paint != null) {
            paint.setTextSize((float) context.getResources().getDimensionPixelSize(f11529b.get(i)));
            paint.setTypeface(m10034b(i2));
        }
    }

    /* renamed from: a */
    public static void m10032a(Spannable spannable, int i, int i2, int i3) {
        if (spannable != null) {
            spannable.setSpan(new FontSpan(m10029a(i3)), i, i2, 33);
        }
    }

    /* renamed from: a */
    public static void m10031a(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        if (context != null) {
            spannable.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(f11529b.get(i3))), i, i2, 33);
        }
        m10032a(spannable, i, i2, i4);
    }
}
