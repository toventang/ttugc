package com.p2082ss.android.ugc.aweme.filter;

import androidx.core.p030b.C0622a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.filter.c */
public final class C50648c {

    /* renamed from: a */
    private static final Map<Integer, Float> f116983a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(59810);
    }

    /* renamed from: b */
    public static final String m94911b(FilterBean filterBean) {
        C89219l.m154721d(filterBean, "");
        return filterBean.getFilterFolder();
    }

    /* renamed from: a */
    public static final float m94906a(FilterBean filterBean) {
        C89219l.m154721d(filterBean, "");
        Float f = f116983a.get(Integer.valueOf(filterBean.getId()));
        if (f == null) {
            f = Float.valueOf(-1.0f);
        }
        return f.floatValue();
    }

    /* renamed from: a */
    public static final float m94908a(FilterBean filterBean, AbstractC50703k kVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(kVar, "");
        if (filterBean.getFilterFolder() == null) {
            return 0.8f;
        }
        Map<Integer, Float> map = f116983a;
        Integer valueOf = Integer.valueOf(filterBean.getId());
        Float f = map.get(valueOf);
        if (f == null) {
            f = Float.valueOf(kVar.mo23007a(filterBean));
            map.put(valueOf, f);
        }
        float floatValue = f.floatValue();
        if (floatValue < 0.0f) {
            return 0.0f;
        }
        return floatValue;
    }

    /* renamed from: a */
    public static final float m94909a(FilterBean filterBean, AbstractC50706n nVar, AbstractC50703k kVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(kVar, "");
        return m94907a(filterBean, nVar.mo86059a(filterBean, kVar), kVar);
    }

    /* renamed from: a */
    public static final float m94907a(FilterBean filterBean, int i, AbstractC50703k kVar) {
        double d;
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(kVar, "");
        float a = m94908a(filterBean, kVar);
        if (a == 1.0f) {
            double d2 = (double) i;
            Double.isNaN(d2);
            d = d2 / 100.0d;
        } else if (a <= 0.8f) {
            double d3 = (double) a;
            Double.isNaN(d3);
            double d4 = (double) i;
            Double.isNaN(d4);
            d = d4 * (d3 / 80.0d);
        } else {
            double d5 = (double) a;
            Double.isNaN(d5);
            double d6 = d5 / 80.0d;
            Double.isNaN(d5);
            double d7 = (1.0d - d5) / 20.0d;
            if (i <= 80) {
                double d8 = (double) i;
                Double.isNaN(d8);
                d = d8 * d6;
            } else {
                double d9 = (double) (i - 80);
                Double.isNaN(d9);
                Double.isNaN(d5);
                d = d5 + (d7 * d9);
            }
        }
        return (float) d;
    }

    /* renamed from: a */
    public static final int m94910a(FilterBean filterBean, float f, AbstractC50703k kVar) {
        int a;
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(kVar, "");
        float a2 = m94908a(filterBean, kVar);
        if (a2 == 1.0f) {
            return C0622a.m2312a(C89241a.m154730a(f * 100.0f), 0, 100);
        }
        if (a2 <= 0.8f) {
            float f2 = f / (a2 / 80.0f);
            if (Float.isNaN(f2)) {
                a = 0;
            } else {
                a = C89241a.m154730a(f2);
            }
            return C0622a.m2312a(a, 0, 100);
        }
        float f3 = a2 / 80.0f;
        float f4 = (1.0f - a2) / 20.0f;
        if (f <= a2) {
            return C0622a.m2312a(C89241a.m154730a(f / f3), 0, 100);
        }
        return C0622a.m2312a(C89241a.m154730a(((f - a2) / f4) + 80.0f), 0, 100);
    }
}
