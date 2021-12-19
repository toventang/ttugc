package com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.a.g */
public final class C60087g {

    /* renamed from: a */
    public Map<String, Object> f136917a;

    /* renamed from: b */
    public float[] f136918b;

    /* renamed from: c */
    public byte[] f136919c;

    static {
        Covode.recordClassIndex(70595);
    }

    /* renamed from: a */
    public final Map<String, Object> mo97622a() {
        if (this.f136917a == null) {
            this.f136917a = new HashMap();
        }
        Map<String, Object> map = this.f136917a;
        if (map == null) {
            C89219l.m154715b();
        }
        return map;
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f136917a != null) {
            sb.append("inputFeaturesMap=" + this.f136917a + ", ");
        }
        Integer num2 = null;
        if (this.f136918b != null) {
            StringBuilder sb2 = new StringBuilder("inputFloatArray.size:");
            float[] fArr = this.f136918b;
            if (fArr != null) {
                num = Integer.valueOf(fArr.length);
            } else {
                num = null;
            }
            sb.append(sb2.append(num).toString());
        }
        if (this.f136919c != null) {
            StringBuilder sb3 = new StringBuilder("inputByteArray.size:");
            byte[] bArr = this.f136919c;
            if (bArr != null) {
                num2 = Integer.valueOf(bArr.length);
            }
            sb.append(sb3.append(num2).toString());
        }
        sb.append("}");
        String sb4 = sb.toString();
        C89219l.m154716b(sb4, "");
        return sb4;
    }
}
