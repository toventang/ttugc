package com.bytedance.lottie.p1495a.p1496a;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21002i;
import com.bytedance.lottie.p1499c.p1501b.C21014q;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1505f.C21084f;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.a.m */
public final class C20947m implements AbstractC20943j, AbstractC20946l, AbstractC20954a.AbstractC20955a {

    /* renamed from: a */
    private final Path f49608a = new Path();

    /* renamed from: b */
    private final String f49609b;

    /* renamed from: c */
    private final C21106i f49610c;

    /* renamed from: d */
    private final C21002i.EnumC21003a f49611d;

    /* renamed from: e */
    private final AbstractC20954a<?, Float> f49612e;

    /* renamed from: f */
    private final AbstractC20954a<?, PointF> f49613f;

    /* renamed from: g */
    private final AbstractC20954a<?, Float> f49614g;

    /* renamed from: h */
    private final AbstractC20954a<?, Float> f49615h;

    /* renamed from: i */
    private final AbstractC20954a<?, Float> f49616i;

    /* renamed from: j */
    private final AbstractC20954a<?, Float> f49617j;

    /* renamed from: k */
    private final AbstractC20954a<?, Float> f49618k;

    /* renamed from: l */
    private C20953r f49619l;

    /* renamed from: m */
    private boolean f49620m;

    static {
        Covode.recordClassIndex(24563);
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: b */
    public final String mo34457b() {
        return this.f49609b;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a.AbstractC20955a
    /* renamed from: a */
    public final void mo34451a() {
        this.f49620m = false;
        this.f49610c.invalidateSelf();
    }

    /* renamed from: com.bytedance.lottie.a.a.m$1 */
    static /* synthetic */ class C209481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49621a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24564(0x5ff4, float:3.4421E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.b.i$a[] r0 = com.bytedance.lottie.p1499c.p1501b.C21002i.EnumC21003a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.p1495a.p1496a.C20947m.C209481.f49621a = r2
                com.bytedance.lottie.c.b.i$a r0 = com.bytedance.lottie.p1499c.p1501b.C21002i.EnumC21003a.Star     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.p1495a.p1496a.C20947m.C209481.f49621a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.b.i$a r0 = com.bytedance.lottie.p1499c.p1501b.C21002i.EnumC21003a.Polygon     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1495a.p1496a.C20947m.C209481.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20946l
    /* renamed from: e */
    public final Path mo34460e() {
        float f;
        float f2;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (this.f49620m) {
            return this.f49608a;
        }
        this.f49608a.reset();
        int i = C209481.f49621a[this.f49611d.ordinal()];
        double d2 = 0.0d;
        if (i == 1) {
            float floatValue = this.f49612e.mo34470d().floatValue();
            AbstractC20954a<?, Float> aVar = this.f49614g;
            if (aVar != null) {
                d2 = (double) aVar.mo34470d().floatValue();
            }
            double radians = Math.toRadians(d2 - 90.0d);
            double d3 = (double) floatValue;
            Double.isNaN(d3);
            float f12 = (float) (6.283185307179586d / d3);
            float f13 = f12 / 2.0f;
            float f14 = floatValue - ((float) ((int) floatValue));
            if (f14 != 0.0f) {
                double d4 = (double) ((1.0f - f14) * f13);
                Double.isNaN(d4);
                radians += d4;
            }
            float floatValue2 = this.f49616i.mo34470d().floatValue();
            float floatValue3 = this.f49615h.mo34470d().floatValue();
            AbstractC20954a<?, Float> aVar2 = this.f49617j;
            if (aVar2 != null) {
                f = aVar2.mo34470d().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            AbstractC20954a<?, Float> aVar3 = this.f49618k;
            if (aVar3 != null) {
                f2 = aVar3.mo34470d().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            if (f14 != 0.0f) {
                f5 = ((floatValue2 - floatValue3) * f14) + floatValue3;
                double d5 = (double) f5;
                double cos = Math.cos(radians);
                Double.isNaN(d5);
                f3 = (float) (d5 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d5);
                f4 = (float) (d5 * sin);
                this.f49608a.moveTo(f3, f4);
                double d6 = (double) ((f12 * f14) / 2.0f);
                Double.isNaN(d6);
                d = radians + d6;
            } else {
                double d7 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d7);
                f3 = (float) (cos2 * d7);
                double sin2 = Math.sin(radians);
                Double.isNaN(d7);
                f4 = (float) (d7 * sin2);
                this.f49608a.moveTo(f3, f4);
                double d8 = (double) f13;
                Double.isNaN(d8);
                d = radians + d8;
                f5 = 0.0f;
            }
            double d9 = 2.0d;
            double ceil = Math.ceil(d3) * 2.0d;
            boolean z = false;
            int i2 = 0;
            while (true) {
                double d10 = (double) i2;
                if (d10 >= ceil) {
                    break;
                }
                if (z) {
                    f6 = floatValue2;
                } else {
                    f6 = floatValue3;
                }
                if (f5 == 0.0f || d10 != ceil - d9) {
                    f7 = f13;
                } else {
                    f7 = (f12 * f14) / 2.0f;
                }
                if (f5 != 0.0f && d10 == ceil - 1.0d) {
                    f6 = f5;
                    f5 = f6;
                }
                double d11 = (double) f6;
                double cos3 = Math.cos(d);
                Double.isNaN(d11);
                float f15 = (float) (d11 * cos3);
                double sin3 = Math.sin(d);
                Double.isNaN(d11);
                float f16 = (float) (d11 * sin3);
                if (f == 0.0f && f2 == 0.0f) {
                    this.f49608a.lineTo(f15, f16);
                } else {
                    double atan2 = (double) ((float) (Math.atan2((double) f4, (double) f3) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) f16, (double) f15) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    if (z) {
                        f8 = f;
                        f9 = f2;
                        f10 = floatValue3;
                        f11 = floatValue2;
                    } else {
                        f8 = f2;
                        f9 = f;
                        f10 = floatValue2;
                        f11 = floatValue3;
                    }
                    float f17 = f10 * f8 * 0.47829f;
                    float f18 = cos4 * f17;
                    float f19 = f17 * sin4;
                    float f20 = f11 * f9 * 0.47829f;
                    float f21 = cos5 * f20;
                    float f22 = f20 * sin5;
                    if (f14 != 0.0f) {
                        if (i2 == 0) {
                            f18 *= f14;
                            f19 *= f14;
                        } else if (d10 == ceil - 1.0d) {
                            f21 *= f14;
                            f22 *= f14;
                        }
                    }
                    this.f49608a.cubicTo(f3 - f18, f4 - f19, f15 + f21, f16 + f22, f15, f16);
                }
                double d12 = (double) f7;
                Double.isNaN(d12);
                d += d12;
                z = !z;
                i2++;
                f3 = f15;
                d9 = 2.0d;
                f4 = f16;
            }
            PointF d13 = this.f49613f.mo34470d();
            this.f49608a.offset(d13.x, d13.y);
            this.f49608a.close();
        } else if (i == 2) {
            int floor = (int) Math.floor((double) this.f49612e.mo34470d().floatValue());
            AbstractC20954a<?, Float> aVar4 = this.f49614g;
            if (aVar4 != null) {
                d2 = (double) aVar4.mo34470d().floatValue();
            }
            double radians2 = Math.toRadians(d2 - 90.0d);
            double d14 = (double) floor;
            Double.isNaN(d14);
            float floatValue4 = this.f49618k.mo34470d().floatValue() / 100.0f;
            float floatValue5 = this.f49616i.mo34470d().floatValue();
            double d15 = (double) floatValue5;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d15);
            float f23 = (float) (d15 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d15);
            float f24 = (float) (d15 * sin6);
            this.f49608a.moveTo(f23, f24);
            double d16 = (double) ((float) (6.283185307179586d / d14));
            Double.isNaN(d16);
            double d17 = radians2 + d16;
            double ceil2 = Math.ceil(d14);
            int i3 = 0;
            while (((double) i3) < ceil2) {
                double cos7 = Math.cos(d17);
                Double.isNaN(d15);
                float f25 = (float) (cos7 * d15);
                double sin7 = Math.sin(d17);
                Double.isNaN(d15);
                float f26 = (float) (d15 * sin7);
                if (floatValue4 != 0.0f) {
                    double atan23 = (double) ((float) (Math.atan2((double) f24, (double) f23) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (double) ((float) (Math.atan2((double) f26, (double) f25) - 1.5707963267948966d));
                    float f27 = floatValue5 * floatValue4 * 0.25f;
                    this.f49608a.cubicTo(f23 - (cos8 * f27), f24 - (sin8 * f27), f25 + (((float) Math.cos(atan24)) * f27), f26 + (f27 * ((float) Math.sin(atan24))), f25, f26);
                } else {
                    this.f49608a.lineTo(f25, f26);
                }
                Double.isNaN(d16);
                d17 += d16;
                i3++;
                f24 = f26;
                f23 = f25;
            }
            PointF d18 = this.f49613f.mo34470d();
            this.f49608a.offset(d18.x, d18.y);
            this.f49608a.close();
        }
        this.f49608a.close();
        C21087h.m39718a(this.f49608a, this.f49619l);
        this.f49620m = true;
        return this.f49608a;
    }

    @Override // com.bytedance.lottie.p1495a.p1496a.AbstractC20935b
    /* renamed from: a */
    public final void mo34456a(List<AbstractC20935b> list, List<AbstractC20935b> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC20935b bVar = list.get(i);
            if (bVar instanceof C20953r) {
                C20953r rVar = (C20953r) bVar;
                if (rVar.f49650a == C21014q.EnumC21015a.Simultaneously) {
                    this.f49619l = rVar;
                    rVar.mo34462a(this);
                }
            }
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        AbstractC20954a<?, Float> aVar;
        AbstractC20954a<?, Float> aVar2;
        if (t == AbstractC21121m.f50090o) {
            this.f49612e.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50091p) {
            this.f49614g.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50083h) {
            this.f49613f.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50092q && (aVar2 = this.f49615h) != null) {
            aVar2.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50093r) {
            this.f49616i.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50094s && (aVar = this.f49617j) != null) {
            aVar.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50095t) {
            this.f49618k.mo34467a(cVar);
        }
    }

    public C20947m(C21106i iVar, AbstractC21017a aVar, C21002i iVar2) {
        this.f49610c = iVar;
        this.f49609b = iVar2.f49773a;
        C21002i.EnumC21003a aVar2 = iVar2.f49774b;
        this.f49611d = aVar2;
        AbstractC20954a<Float, Float> a = iVar2.f49775c.mo34480a();
        this.f49612e = a;
        AbstractC20954a<PointF, PointF> a2 = iVar2.f49776d.mo34480a();
        this.f49613f = a2;
        AbstractC20954a<Float, Float> a3 = iVar2.f49777e.mo34480a();
        this.f49614g = a3;
        AbstractC20954a<Float, Float> a4 = iVar2.f49779g.mo34480a();
        this.f49616i = a4;
        AbstractC20954a<Float, Float> a5 = iVar2.f49781i.mo34480a();
        this.f49618k = a5;
        if (aVar2 == C21002i.EnumC21003a.Star) {
            this.f49615h = iVar2.f49778f.mo34480a();
            this.f49617j = iVar2.f49780h.mo34480a();
        } else {
            this.f49615h = null;
            this.f49617j = null;
        }
        aVar.mo34496a(a);
        aVar.mo34496a(a2);
        aVar.mo34496a(a3);
        aVar.mo34496a(a4);
        aVar.mo34496a(a5);
        if (aVar2 == C21002i.EnumC21003a.Star) {
            aVar.mo34496a(this.f49615h);
            aVar.mo34496a(this.f49617j);
        }
        a.mo34466a(this);
        a2.mo34466a(this);
        a3.mo34466a(this);
        a4.mo34466a(this);
        a5.mo34466a(this);
        if (aVar2 == C21002i.EnumC21003a.Star) {
            this.f49615h.mo34466a(this);
            this.f49617j.mo34466a(this);
        }
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f
    /* renamed from: a */
    public final void mo34454a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2) {
        C21084f.m39710a(eVar, i, list, eVar2, this);
    }
}
