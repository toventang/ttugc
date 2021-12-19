package com.airbnb.lottie.p099e.p101b;

import android.graphics.PointF;
import com.airbnb.lottie.p099e.C2047a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.b.l */
public final class C2077l {

    /* renamed from: a */
    public final List<C2047a> f6235a;

    /* renamed from: b */
    public PointF f6236b;

    /* renamed from: c */
    public boolean f6237c;

    static {
        Covode.recordClassIndex(2272);
    }

    public C2077l() {
        this.f6235a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f6235a.size() + "closed=" + this.f6237c + '}';
    }

    public C2077l(PointF pointF, boolean z, List<C2047a> list) {
        ArrayList arrayList = new ArrayList();
        this.f6235a = arrayList;
        this.f6236b = pointF;
        this.f6237c = z;
        arrayList.addAll(list);
    }
}
