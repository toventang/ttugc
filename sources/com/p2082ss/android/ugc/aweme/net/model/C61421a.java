package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.model.a */
public final class C61421a {

    /* renamed from: a */
    public String f139458a;

    /* renamed from: b */
    public String f139459b;

    /* renamed from: c */
    public String f139460c;

    /* renamed from: d */
    public JSONObject f139461d;

    static {
        Covode.recordClassIndex(72075);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61421a)) {
            return false;
        }
        C61421a aVar = (C61421a) obj;
        return C89219l.m154714a(this.f139458a, aVar.f139458a) && C89219l.m154714a(this.f139459b, aVar.f139459b) && C89219l.m154714a(this.f139460c, aVar.f139460c) && C89219l.m154714a(this.f139461d, aVar.f139461d);
    }

    public final int hashCode() {
        String str = this.f139458a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139459b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139460c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f139461d;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "AppLogItem(category='" + this.f139458a + "', tag='" + this.f139459b + "', label='" + this.f139460c + "', extJson=" + this.f139461d + ')';
    }

    public C61421a(String str, String str2, String str3, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(jSONObject, "");
        this.f139458a = str;
        this.f139459b = str2;
        this.f139460c = str3;
        this.f139461d = jSONObject;
    }
}
