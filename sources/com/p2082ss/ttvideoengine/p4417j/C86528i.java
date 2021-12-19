package com.p2082ss.ttvideoengine.p4417j;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.i */
public final class C86528i {

    /* renamed from: a */
    public float[] f194759a;

    /* renamed from: b */
    public int f194760b;

    /* renamed from: c */
    public int f194761c;

    /* renamed from: d */
    public int f194762d;

    static {
        Covode.recordClassIndex(101756);
    }

    /* renamed from: c */
    private int m149708c(float f) {
        float[] fArr = this.f194759a;
        if (fArr.length != 3) {
            return 0;
        }
        double d = (double) fArr[0];
        double d2 = (double) fArr[1];
        double d3 = (double) f;
        double pow = Math.pow(d3, (double) fArr[2]);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (int) (((((d / pow) + d2) * d3) * 1024.0d) / 8.0d);
    }

    /* renamed from: b */
    private int m149707b(float f) {
        float[] fArr = this.f194759a;
        if (fArr.length > 50) {
            C86641i.m150117e("FitterInfo", "bitrateFitterParams num: " + fArr.length);
            return 0;
        }
        double d = 0.0d;
        for (int i = 0; i < fArr.length; i++) {
            double d2 = 1.0d;
            for (int i2 = 0; i2 < (fArr.length - i) - 1; i2++) {
                double d3 = (double) f;
                Double.isNaN(d3);
                d2 *= d3;
            }
            double d4 = (double) fArr[i];
            Double.isNaN(d4);
            d += d2 * d4;
        }
        double d5 = (double) f;
        Double.isNaN(d5);
        return (int) (((d * d5) * 1024.0d) / 8.0d);
    }

    /* renamed from: a */
    public final int mo137778a(float f) {
        if (this.f194759a == null) {
            C86641i.m150117e("FitterInfo", "fitter params empty");
            return 0;
        } else if (f > ((float) this.f194761c) || f <= 0.0f) {
            C86641i.m150117e("FitterInfo", C1764a.m5928a("preload second:%f, fitter duration:%d", new Object[]{Float.valueOf(f), Integer.valueOf(this.f194761c)}));
            return 0;
        } else {
            int i = this.f194762d;
            if (i == 0) {
                return m149707b(f);
            }
            if (i == 1) {
                return m149708c(f);
            }
            return m149707b(f);
        }
    }

    /* renamed from: a */
    public final void mo137779a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("func_params")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("func_params");
                    if (jSONArray.length() > 0) {
                        this.f194759a = new float[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            this.f194759a[i] = (float) jSONArray.optDouble(i);
                        }
                    } else {
                        return;
                    }
                }
                this.f194760b = jSONObject.optInt("header_size");
                this.f194761c = jSONObject.optInt("duration");
                this.f194762d = jSONObject.optInt("func_method");
            } catch (Exception unused) {
            }
        }
    }
}
