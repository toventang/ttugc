package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.model.b */
public final class C61422b {

    /* renamed from: a */
    public String f139462a;

    /* renamed from: b */
    public String f139463b;

    /* renamed from: c */
    public JSONObject f139464c;

    static {
        Covode.recordClassIndex(72076);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61422b)) {
            return false;
        }
        C61422b bVar = (C61422b) obj;
        return C89219l.m154714a(this.f139462a, bVar.f139462a) && C89219l.m154714a(this.f139463b, bVar.f139463b) && C89219l.m154714a(this.f139464c, bVar.f139464c);
    }

    public final int hashCode() {
        String str = this.f139462a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139463b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f139464c;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CommonLogItem(type='" + this.f139462a + "', subType='" + this.f139463b + "', log=" + this.f139464c + ')';
    }

    public C61422b(String str, String str2, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(jSONObject, "");
        this.f139462a = str;
        this.f139463b = str2;
        this.f139464c = jSONObject;
    }
}
