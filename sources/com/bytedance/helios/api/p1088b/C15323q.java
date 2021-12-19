package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.q */
public final class C15323q implements AbstractC15308f {

    /* renamed from: a */
    public final String f37393a;

    /* renamed from: b */
    public final String f37394b;

    /* renamed from: c */
    public final long f37395c;

    /* renamed from: d */
    public final C15322p f37396d;

    /* renamed from: e */
    public final Map<String, C15307e> f37397e;

    /* renamed from: f */
    public final Map<Integer, C15307e> f37398f;

    static {
        Covode.recordClassIndex(17553);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15323q)) {
            return false;
        }
        C15323q qVar = (C15323q) obj;
        return C89219l.m154714a(this.f37393a, qVar.f37393a) && C89219l.m154714a(this.f37394b, qVar.f37394b) && this.f37395c == qVar.f37395c && C89219l.m154714a(this.f37396d, qVar.f37396d) && C89219l.m154714a(this.f37397e, qVar.f37397e) && C89219l.m154714a(this.f37398f, qVar.f37398f);
    }

    public final int hashCode() {
        String str = this.f37393a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37394b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.f37395c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C15322p pVar = this.f37396d;
        int hashCode3 = (i2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Map<String, C15307e> map = this.f37397e;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<Integer, C15307e> map2 = this.f37398f;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "SampleRateResultEvent(date=" + this.f37393a + ", deviceId=" + this.f37394b + ", hashCode=" + this.f37395c + ", sampleRateModel=" + this.f37396d + ", resourceSampleRateResults=" + this.f37397e + ", apiSampleRateResults=" + this.f37398f + ")";
    }

    public C15323q(String str, String str2, long j, C15322p pVar, Map<String, C15307e> map, Map<Integer, C15307e> map2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(map2, "");
        this.f37393a = str;
        this.f37394b = str2;
        this.f37395c = j;
        this.f37396d = pVar;
        this.f37397e = map;
        this.f37398f = map2;
    }
}
