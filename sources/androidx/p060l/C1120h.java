package androidx.p060l;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.h */
final class C1120h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f3816a;

    /* renamed from: b */
    private final PathMeasure f3817b;

    /* renamed from: c */
    private final float f3818c;

    /* renamed from: d */
    private final float[] f3819d = new float[2];

    /* renamed from: e */
    private final PointF f3820e = new PointF();

    /* renamed from: f */
    private float f3821f;

    static {
        Covode.recordClassIndex(1213);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f3821f);
    }

    C1120h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f3816a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f3817b = pathMeasure;
        this.f3818c = pathMeasure.getLength();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f) {
        Float f2 = f;
        this.f3821f = f2.floatValue();
        this.f3817b.getPosTan(this.f3818c * f2.floatValue(), this.f3819d, null);
        this.f3820e.x = this.f3819d[0];
        this.f3820e.y = this.f3819d[1];
        this.f3816a.set(obj, this.f3820e);
    }
}
