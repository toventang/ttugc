package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.k */
public final class C60100k {

    /* renamed from: a */
    public String f136965a;

    /* renamed from: b */
    public Map<String, Float> f136966b;

    /* renamed from: c */
    public Float f136967c;

    static {
        Covode.recordClassIndex(70608);
    }

    /* renamed from: a */
    public final Float mo97635a() {
        Map<String, Float> map;
        String str = this.f136965a;
        if (str == null || (map = this.f136966b) == null) {
            return null;
        }
        return map.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f136965a != null) {
            sb.append("strResult=" + this.f136965a + ", ");
        }
        if (this.f136966b != null) {
            sb.append("probabilityMap=" + this.f136966b + ", ");
        }
        if (this.f136967c != null) {
            sb.append("floatResult=" + this.f136967c + ", ");
        }
        sb.append("}");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
