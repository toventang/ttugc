package com.p2082ss.android.ugc.aweme.base.p2364a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.a.c */
public final class C34468c {

    /* renamed from: a */
    public static final int f81445a = R.anim.f205073do;

    /* renamed from: b */
    public static final int f81446b = R.anim.dx;

    /* renamed from: c */
    public static final int f81447c = R.anim.dq;

    /* renamed from: d */
    public static final int f81448d = R.anim.dv;

    /* renamed from: e */
    public static final int f81449e = R.anim.dp;

    /* renamed from: f */
    public static final int f81450f = R.anim.dy;

    /* renamed from: g */
    public static final int f81451g = R.anim.dr;

    /* renamed from: h */
    public static final int f81452h = R.anim.dw;

    /* renamed from: i */
    public static final int f81453i = R.anim.af;

    /* renamed from: j */
    public static final int f81454j = R.anim.ah;

    static {
        Covode.recordClassIndex(41421);
    }

    /* renamed from: a */
    public static void m70449a(Activity activity, int i) {
        int i2;
        int i3 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    i3 = f81451g;
                    i2 = f81452h;
                } else if (i == 3) {
                    i3 = f81453i;
                } else if (i != 4) {
                    i3 = f81447c;
                    i2 = f81448d;
                } else {
                    i3 = f81445a;
                    i2 = f81446b;
                }
            }
            i2 = 0;
        } else {
            i3 = f81447c;
            i2 = f81448d;
        }
        activity.overridePendingTransition(i3, i2);
    }
}
