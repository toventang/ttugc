package com.bytedance.lottie.p1499c.p1501b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.C20976a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.b.l */
public final class C21006l {

    /* renamed from: a */
    public final List<C20976a> f49792a;

    /* renamed from: b */
    public PointF f49793b;

    /* renamed from: c */
    public boolean f49794c;

    static {
        Covode.recordClassIndex(24622);
    }

    public C21006l() {
        this.f49792a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f49792a.size() + "closed=" + this.f49794c + '}';
    }

    public C21006l(PointF pointF, boolean z, List<C20976a> list) {
        ArrayList arrayList = new ArrayList();
        this.f49792a = arrayList;
        this.f49793b = pointF;
        this.f49794c = z;
        arrayList.addAll(list);
    }
}
