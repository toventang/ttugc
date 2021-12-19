package com.p2082ss.android.ugc.aweme.utils;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.af */
public final class C80211af implements TypeEvaluator<PointF> {

    /* renamed from: a */
    PointF f179676a = new PointF();

    /* renamed from: b */
    private float f179677b;

    /* renamed from: c */
    private float f179678c;

    /* renamed from: d */
    private float f179679d;

    /* renamed from: e */
    private float f179680e;

    /* renamed from: f */
    private float f179681f;

    /* renamed from: g */
    private float f179682g;

    static {
        Covode.recordClassIndex(93479);
    }

    public C80211af(PointF pointF, PointF pointF2) {
        float f = pointF.x * 3.0f;
        float f2 = pointF2.x * 3.0f;
        this.f179677b = f - f2;
        this.f179678c = f2 - (f * 2.0f);
        this.f179679d = f;
        float f3 = pointF.y * 3.0f;
        float f4 = pointF2.y * 3.0f;
        this.f179680e = f3 - f4;
        this.f179681f = f4 - (2.0f * f3);
        this.f179682g = f3;
    }

    /* renamed from: a */
    public final PointF evaluate(float f, PointF pointF, PointF pointF2) {
        float f2 = pointF.x * 3.0f;
        float f3 = pointF.y * 3.0f;
        this.f179676a.x = (((((((((pointF2.x - pointF.x) + this.f179677b) * f) + f2) + this.f179678c) * f) - f2) + this.f179679d) * f) + pointF.x;
        this.f179676a.y = (f * ((((((((pointF2.y - pointF.y) + this.f179680e) * f) + f3) + this.f179681f) * f) - f3) + this.f179682g)) + pointF.y;
        return this.f179676a;
    }
}
