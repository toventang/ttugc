package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2073i;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.n */
public final class C2005n implements AbstractC2001k, AbstractC2004m, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Path f6013a = new Path();

    /* renamed from: b */
    private final String f6014b;

    /* renamed from: c */
    private final C2122g f6015c;

    /* renamed from: d */
    private final C2073i.EnumC2074a f6016d;

    /* renamed from: e */
    private final AbstractC2012a<?, Float> f6017e;

    /* renamed from: f */
    private final AbstractC2012a<?, PointF> f6018f;

    /* renamed from: g */
    private final AbstractC2012a<?, Float> f6019g;

    /* renamed from: h */
    private final AbstractC2012a<?, Float> f6020h;

    /* renamed from: i */
    private final AbstractC2012a<?, Float> f6021i;

    /* renamed from: j */
    private final AbstractC2012a<?, Float> f6022j;

    /* renamed from: k */
    private final AbstractC2012a<?, Float> f6023k;

    /* renamed from: l */
    private C2011s f6024l;

    /* renamed from: m */
    private C1992b f6025m;

    /* renamed from: n */
    private boolean f6026n;

    static {
        Covode.recordClassIndex(2200);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6014b;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f6026n = false;
        this.f6015c.invalidateSelf();
    }

    /* renamed from: com.airbnb.lottie.a.a.n$1 */
    static /* synthetic */ class C20061 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6027a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2201(0x899, float:3.084E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.b.i$a[] r0 = com.airbnb.lottie.p099e.p101b.C2073i.EnumC2074a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.p093a.p094a.C2005n.C20061.f6027a = r2
                com.airbnb.lottie.e.b.i$a r0 = com.airbnb.lottie.p099e.p101b.C2073i.EnumC2074a.Star     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.p093a.p094a.C2005n.C20061.f6027a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.b.i$a r0 = com.airbnb.lottie.p099e.p101b.C2073i.EnumC2074a.Polygon     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p093a.p094a.C2005n.C20061.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
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
        C1992b bVar;
        if (this.f6026n) {
            return this.f6013a;
        }
        this.f6013a.reset();
        int i = C20061.f6027a[this.f6016d.ordinal()];
        double d2 = 0.0d;
        if (i == 1) {
            float floatValue = this.f6017e.mo5918f().floatValue();
            AbstractC2012a<?, Float> aVar = this.f6019g;
            if (aVar != null) {
                d2 = (double) aVar.mo5918f().floatValue();
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
            float floatValue2 = this.f6021i.mo5918f().floatValue();
            float floatValue3 = this.f6020h.mo5918f().floatValue();
            AbstractC2012a<?, Float> aVar2 = this.f6022j;
            if (aVar2 != null) {
                f = aVar2.mo5918f().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            AbstractC2012a<?, Float> aVar3 = this.f6023k;
            if (aVar3 != null) {
                f2 = aVar3.mo5918f().floatValue() / 100.0f;
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
                this.f6013a.moveTo(f3, f4);
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
                this.f6013a.moveTo(f3, f4);
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
                    this.f6013a.lineTo(f15, f16);
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
                    this.f6013a.cubicTo(f3 - f18, f4 - f19, f15 + f21, f16 + f22, f15, f16);
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
            PointF f23 = this.f6018f.mo5918f();
            this.f6013a.offset(f23.x, f23.y);
            this.f6013a.close();
        } else if (i == 2) {
            int floor = (int) Math.floor((double) this.f6017e.mo5918f().floatValue());
            AbstractC2012a<?, Float> aVar4 = this.f6019g;
            if (aVar4 != null) {
                d2 = (double) aVar4.mo5918f().floatValue();
            }
            double radians2 = Math.toRadians(d2 - 90.0d);
            double d13 = (double) floor;
            Double.isNaN(d13);
            float floatValue4 = this.f6023k.mo5918f().floatValue() / 100.0f;
            float floatValue5 = this.f6021i.mo5918f().floatValue();
            double d14 = (double) floatValue5;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d14);
            float f24 = (float) (d14 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d14);
            float f25 = (float) (d14 * sin6);
            this.f6013a.moveTo(f24, f25);
            double d15 = (double) ((float) (6.283185307179586d / d13));
            Double.isNaN(d15);
            double d16 = radians2 + d15;
            double ceil2 = Math.ceil(d13);
            int i3 = 0;
            while (((double) i3) < ceil2) {
                double cos7 = Math.cos(d16);
                Double.isNaN(d14);
                float f26 = (float) (cos7 * d14);
                double sin7 = Math.sin(d16);
                Double.isNaN(d14);
                float f27 = (float) (d14 * sin7);
                if (floatValue4 != 0.0f) {
                    double atan23 = (double) ((float) (Math.atan2((double) f25, (double) f24) - 1.5707963267948966d));
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    double atan24 = (double) ((float) (Math.atan2((double) f27, (double) f26) - 1.5707963267948966d));
                    float f28 = floatValue5 * floatValue4 * 0.25f;
                    this.f6013a.cubicTo(f24 - (cos8 * f28), f25 - (sin8 * f28), f26 + (((float) Math.cos(atan24)) * f28), f27 + (f28 * ((float) Math.sin(atan24))), f26, f27);
                } else {
                    this.f6013a.lineTo(f26, f27);
                }
                Double.isNaN(d15);
                d16 += d15;
                i3++;
                f25 = f27;
                f24 = f26;
            }
            PointF f29 = this.f6018f.mo5918f();
            this.f6013a.offset(f29.x, f29.y);
            this.f6013a.close();
        }
        this.f6013a.close();
        if (!C2144d.C2145a.f6479a || (bVar = this.f6025m) == null) {
            C2194g.m6797a(this.f6013a, this.f6024l);
        } else {
            bVar.mo5901a(this.f6013a);
        }
        this.f6026n = true;
        return this.f6013a;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        C1992b bVar;
        for (int i = 0; i < list.size(); i++) {
            AbstractC1993c cVar = list.get(i);
            if (cVar instanceof C2011s) {
                C2011s sVar = (C2011s) cVar;
                if (sVar.f6058a == C2085q.EnumC2086a.Simultaneously) {
                    if (!C2144d.C2145a.f6479a || (bVar = this.f6025m) == null) {
                        this.f6024l = sVar;
                        sVar.mo5908a(this);
                    } else {
                        bVar.mo5902a(sVar);
                        sVar.mo5908a(this);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<?, Float> aVar;
        AbstractC2012a<?, Float> aVar2;
        if (t == AbstractC2206k.f6613s) {
            this.f6017e.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6614t) {
            this.f6019g.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6604j) {
            this.f6018f.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6615u && (aVar2 = this.f6020h) != null) {
            aVar2.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6616v) {
            this.f6021i.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6617w && (aVar = this.f6022j) != null) {
            aVar.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6618x) {
            this.f6023k.mo5913a(cVar);
        }
    }

    public C2005n(C2122g gVar, AbstractC2088a aVar, C2073i iVar) {
        if (C2144d.C2145a.f6479a) {
            this.f6025m = new C1992b();
        }
        this.f6015c = gVar;
        this.f6014b = iVar.f6216a;
        C2073i.EnumC2074a aVar2 = iVar.f6217b;
        this.f6016d = aVar2;
        AbstractC2012a<Float, Float> a = iVar.f6218c.mo5947a();
        this.f6017e = a;
        AbstractC2012a<PointF, PointF> a2 = iVar.f6219d.mo5947a();
        this.f6018f = a2;
        AbstractC2012a<Float, Float> a3 = iVar.f6220e.mo5947a();
        this.f6019g = a3;
        AbstractC2012a<Float, Float> a4 = iVar.f6222g.mo5947a();
        this.f6021i = a4;
        AbstractC2012a<Float, Float> a5 = iVar.f6224i.mo5947a();
        this.f6023k = a5;
        if (aVar2 == C2073i.EnumC2074a.Star) {
            this.f6020h = iVar.f6221f.mo5947a();
            this.f6022j = iVar.f6223h.mo5947a();
        } else {
            this.f6020h = null;
            this.f6022j = null;
        }
        aVar.mo5964a(a);
        aVar.mo5964a(a2);
        aVar.mo5964a(a3);
        aVar.mo5964a(a4);
        aVar.mo5964a(a5);
        if (aVar2 == C2073i.EnumC2074a.Star) {
            aVar.mo5964a(this.f6020h);
            aVar.mo5964a(this.f6022j);
        }
        a.mo5912a(this);
        a2.mo5912a(this);
        a3.mo5912a(this);
        a4.mo5912a(this);
        a5.mo5912a(this);
        if (aVar2 == C2073i.EnumC2074a.Star) {
            this.f6020h.mo5912a(this);
            this.f6022j.mo5912a(this);
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}
