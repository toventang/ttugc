package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.h */
public final class C72311h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final PathMeasure f162109a;

    /* renamed from: b */
    private final float f162110b;

    /* renamed from: c */
    private final float[] f162111c;

    /* renamed from: d */
    private final PointF f162112d;

    /* renamed from: e */
    private float f162113e;

    /* renamed from: f */
    private final Property<T, PointF> f162114f;

    static {
        Covode.recordClassIndex(84978);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f162113e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72311h(android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
        /*
            r2 = this;
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = r3.getName()
        L_0x0008:
            r2.<init>(r1, r0)
            r2.f162114f = r3
            r0 = 2
            float[] r0 = new float[r0]
            r2.f162111c = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.f162112d = r0
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r0 = 0
            r1.<init>(r4, r0)
            r2.f162109a = r1
            float r0 = r1.getLength()
            r2.f162110b = r0
            return
        L_0x0028:
            r0 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72311h.<init>(android.util.Property, android.graphics.Path):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f) {
        float floatValue = f.floatValue();
        this.f162113e = floatValue;
        this.f162109a.getPosTan(this.f162110b * floatValue, this.f162111c, null);
        this.f162112d.x = this.f162111c[0];
        this.f162112d.y = this.f162111c[1];
        Property<T, PointF> property = this.f162114f;
        if (property != null) {
            property.set(obj, this.f162112d);
        }
    }
}
