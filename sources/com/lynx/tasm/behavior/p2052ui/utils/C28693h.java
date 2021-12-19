package com.lynx.tasm.behavior.p2052ui.utils;

import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.utils.h */
public class C28693h {

    /* renamed from: f */
    static ThreadLocal<double[]> f67673f = new ThreadLocal<double[]>() {
        /* class com.lynx.tasm.behavior.p2052ui.utils.C28693h.C286941 */

        static {
            Covode.recordClassIndex(34770);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ double[] initialValue() {
            return new double[16];
        }
    };

    /* renamed from: a */
    public C28692g f67674a;

    /* renamed from: b */
    public float f67675b;

    /* renamed from: c */
    public float f67676c;

    /* renamed from: d */
    public Matrix f67677d = new Matrix();

    /* renamed from: e */
    public LinkedHashMap<String, Float> f67678e = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(34769);
    }

    public C28693h() {
        this.f67677d.reset();
        this.f67678e.clear();
    }

    /* renamed from: b */
    public final float mo49789b() {
        Float f = this.f67678e.get("translateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo49790c() {
        Float f = this.f67678e.get("translateZ");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo49791d() {
        Float f = this.f67678e.get("rotate");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final float mo49792e() {
        Float f = this.f67678e.get("rotateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final float mo49793f() {
        Float f = this.f67678e.get("rotateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final float mo49794g() {
        Float f = this.f67678e.get("scaleX");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final float mo49795h() {
        Float f = this.f67678e.get("scaleY");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: a */
    public final float mo49788a() {
        Float f = this.f67678e.get("translateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: b */
    private void m57451b(float f) {
        this.f67678e.put("translateX", Float.valueOf(f));
    }

    /* renamed from: c */
    private void m57452c(float f) {
        this.f67678e.put("translateY", Float.valueOf(f));
    }

    /* renamed from: d */
    private void m57453d(float f) {
        this.f67678e.put("translateZ", Float.valueOf(f));
    }

    /* renamed from: e */
    private void m57454e(float f) {
        this.f67678e.put("rotate", Float.valueOf(f));
    }

    /* renamed from: f */
    private void m57455f(float f) {
        this.f67678e.put("rotateX", Float.valueOf(f));
    }

    /* renamed from: g */
    private void m57456g(float f) {
        this.f67678e.put("rotateY", Float.valueOf(f));
    }

    /* renamed from: h */
    private void m57457h(float f) {
        this.f67678e.put("scaleX", Float.valueOf(f));
    }

    /* renamed from: i */
    private void m57458i(float f) {
        this.f67678e.put("scaleY", Float.valueOf(f));
    }

    /* renamed from: a */
    static double m57448a(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    public static C28693h m57449a(C28692g gVar, float f, float f2) {
        C28693h hVar = new C28693h();
        hVar.f67674a = gVar;
        hVar.f67675b = f * 0.5f;
        hVar.f67676c = 0.5f * f2;
        if (!(gVar == null || gVar == C28692g.f67668c)) {
            if (gVar.mo49783a()) {
                float f3 = gVar.f67669a;
                if (gVar.mo49785c()) {
                    f3 *= f;
                }
                hVar.f67675b = f3;
            }
            if (gVar.mo49784b()) {
                float f4 = gVar.f67670b;
                if (gVar.mo49786d()) {
                    f4 *= f2;
                }
                hVar.f67676c = f4;
            }
        }
        return hVar;
    }

    /* renamed from: a */
    public static C28693h m57450a(List<C28695i> list, float f, float f2, float f3) {
        float f4;
        float f5;
        C28693h hVar = new C28693h();
        if (list != null && !list.isEmpty()) {
            for (C28695i iVar : list) {
                int i = iVar.f67679a;
                if (i != 1) {
                    if (i == 2) {
                        boolean a = iVar.mo49797a();
                        float f6 = iVar.f67680b;
                        if (a) {
                            f6 *= f2;
                        }
                        hVar.m57451b(f6);
                    } else if (i == 4) {
                        boolean a2 = iVar.mo49797a();
                        float f7 = iVar.f67680b;
                        if (a2) {
                            f7 *= f3;
                        }
                        hVar.m57452c(f7);
                    } else if (i == 8) {
                        boolean a3 = iVar.mo49797a();
                        float f8 = iVar.f67680b;
                        if (a3) {
                            f8 *= f;
                        }
                        hVar.m57453d(f8);
                    } else if (i != 16) {
                        if (i != 32) {
                            if (i == 64) {
                                hVar.m57455f(iVar.f67680b);
                            } else if (i == 128) {
                                hVar.m57456g(iVar.f67680b);
                            } else if (i != 256) {
                                if (i == 512) {
                                    hVar.m57457h(iVar.f67680b);
                                    hVar.m57458i(iVar.f67681c);
                                } else if (i == 1024) {
                                    hVar.m57457h(iVar.f67680b);
                                } else if (i != 2048) {
                                    return null;
                                } else {
                                    hVar.m57458i(iVar.f67680b);
                                }
                            }
                        }
                        hVar.m57454e(iVar.f67680b);
                    }
                }
                if (iVar.mo49797a()) {
                    f4 = iVar.f67680b * f2;
                } else {
                    f4 = iVar.f67680b;
                }
                hVar.m57451b(f4);
                if (iVar.mo49798b()) {
                    f5 = iVar.f67681c * f3;
                } else {
                    f5 = iVar.f67681c;
                }
                hVar.m57452c(f5);
                hVar.m57453d(iVar.f67682d);
            }
        }
        return hVar;
    }
}
