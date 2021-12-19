package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class PrivacyCert extends AbstractC13342c {

    /* renamed from: a */
    private final C13349j f32603a;

    /* renamed from: b */
    private final String f32604b;

    /* renamed from: c */
    private final C13350k[] f32605c;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public String privacyCertId;
        private C13350k[] privacyPolicies;
        private String tag;
        private String usage;

        static {
            Covode.recordClassIndex(15334);
        }

        public static final Builder with(String str) {
            return Companion.with(str);
        }

        public static final class Companion {
            static {
                Covode.recordClassIndex(15335);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(C89214g gVar) {
                this();
            }

            public final Builder with(String str) {
                C89219l.m154719c(str, "");
                Builder builder = new Builder();
                builder.privacyCertId = str;
                return builder;
            }
        }

        public final String getPrivacyCertId() {
            return this.privacyCertId;
        }

        public final C13350k[] getPrivacyPolicies() {
            return this.privacyPolicies;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getUsage() {
            return this.usage;
        }

        public final PrivacyCert build() {
            C13349j jVar = new C13349j(this.privacyCertId);
            jVar.setTag(this.tag);
            return new PrivacyCert(jVar, this.usage, this.privacyPolicies);
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder usage(String str) {
            C89219l.m154719c(str, "");
            this.usage = str;
            return this;
        }

        public final Builder policies(C13350k... kVarArr) {
            C89219l.m154719c(kVarArr, "");
            int length = kVarArr.length;
            C13350k[] kVarArr2 = new C13350k[length];
            for (int i = 0; i < length; i++) {
                kVarArr2[i] = kVarArr[i];
            }
            this.privacyPolicies = kVarArr2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(15333);
    }

    public static /* synthetic */ PrivacyCert copy$default(PrivacyCert privacyCert, C13349j jVar, String str, C13350k[] kVarArr, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = privacyCert.f32603a;
        }
        if ((i & 2) != 0) {
            str = privacyCert.f32604b;
        }
        if ((i & 4) != 0) {
            kVarArr = privacyCert.f32605c;
        }
        return privacyCert.copy(jVar, str, kVarArr);
    }

    public final C13349j component1() {
        return this.f32603a;
    }

    public final String component2() {
        return this.f32604b;
    }

    public final C13350k[] component3() {
        return this.f32605c;
    }

    public final PrivacyCert copy(C13349j jVar, String str, C13350k[] kVarArr) {
        return new PrivacyCert(jVar, str, kVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyCert)) {
            return false;
        }
        PrivacyCert privacyCert = (PrivacyCert) obj;
        return C89219l.m154714a(this.f32603a, privacyCert.f32603a) && C89219l.m154714a(this.f32604b, privacyCert.f32604b) && C89219l.m154714a(this.f32605c, privacyCert.f32605c);
    }

    public final int hashCode() {
        C13349j jVar = this.f32603a;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        String str = this.f32604b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C13350k[] kVarArr = this.f32605c;
        if (kVarArr != null) {
            i = Arrays.hashCode(kVarArr);
        }
        return hashCode2 + i;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13342c
    public final String toString() {
        return "PrivacyCert(privacyPoint=" + this.f32603a + ", usage=" + this.f32604b + ", privacyPolicies=" + Arrays.toString(this.f32605c) + ")";
    }

    public final C13349j getPrivacyPoint() {
        return this.f32603a;
    }

    public final C13350k[] getPrivacyPolicies() {
        return this.f32605c;
    }

    public final String getUsage() {
        return this.f32604b;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13342c, com.bytedance.bpea.basics.AbstractC13343d
    public final JSONObject toJSON() {
        String str;
        JSONObject json = super.toJSON();
        try {
            json.put("usage", this.f32604b);
            C13349j jVar = this.f32603a;
            if (jVar != null) {
                str = jVar.getTag();
            } else {
                str = null;
            }
            json.put("tag", str);
            JSONArray jSONArray = new JSONArray();
            C13350k[] kVarArr = this.f32605c;
            if (kVarArr != null) {
                for (C13350k kVar : kVarArr) {
                    jSONArray.put(kVar.getDataType());
                }
            }
            json.put("dataType", jSONArray.toString());
        } catch (Throwable unused) {
        }
        return json;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13342c, com.bytedance.bpea.basics.AbstractC13343d
    public final void validate(C13345f fVar) {
        String id;
        C89219l.m154719c(fVar, "");
        super.validate(fVar);
        C13349j jVar = this.f32603a;
        if (jVar == null || (id = jVar.getId()) == null || C89361p.m154870a((CharSequence) id)) {
            throw new C13340a(-1, "certId is empty");
        }
        C13350k[] kVarArr = this.f32605c;
        if (kVarArr == null || kVarArr.length == 0) {
            throw new C13340a(-1, "policy is empty");
        }
        String[] strArr = fVar.f32612b;
        if (strArr == null || strArr.length == 0) {
            throw new C13340a(-1, "check dataType is empty");
        }
        String[] strArr2 = fVar.f32612b;
        if (strArr2 != null) {
            for (String str : strArr2) {
                boolean z = false;
                for (C13350k kVar : this.f32605c) {
                    String dataType = kVar.getDataType();
                    if (dataType != null && dataType.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    throw new C13340a(-1, "dataType do not match");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PrivacyCert(com.bytedance.bpea.basics.C13349j r3, java.lang.String r4, com.bytedance.bpea.basics.C13350k[] r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0016
            java.lang.String r1 = r3.getId()
        L_0x0006:
            com.bytedance.bpea.basics.g r0 = com.bytedance.bpea.basics.EnumC13346g.PRIVACY_CERT
            int r0 = r0.getType()
            r2.<init>(r1, r0)
            r2.f32603a = r3
            r2.f32604b = r4
            r2.f32605c = r5
            return
        L_0x0016:
            r1 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.basics.PrivacyCert.<init>(com.bytedance.bpea.basics.j, java.lang.String, com.bytedance.bpea.basics.k[]):void");
    }
}
