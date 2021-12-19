package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.basics.k */
public final class C13350k implements Serializable {

    /* renamed from: a */
    private final String f32625a;

    /* renamed from: b */
    private final String f32626b;

    /* renamed from: c */
    private final String f32627c;

    /* renamed from: d */
    private final String f32628d;

    static {
        Covode.recordClassIndex(15346);
    }

    public static /* synthetic */ C13350k copy$default(C13350k kVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.f32625a;
        }
        if ((i & 2) != 0) {
            str2 = kVar.f32626b;
        }
        if ((i & 4) != 0) {
            str3 = kVar.f32627c;
        }
        if ((i & 8) != 0) {
            str4 = kVar.f32628d;
        }
        return kVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f32625a;
    }

    public final String component2() {
        return this.f32626b;
    }

    public final String component3() {
        return this.f32627c;
    }

    public final String component4() {
        return this.f32628d;
    }

    public final C13350k copy(String str, String str2, String str3, String str4) {
        return new C13350k(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13350k)) {
            return false;
        }
        C13350k kVar = (C13350k) obj;
        return C89219l.m154714a(this.f32625a, kVar.f32625a) && C89219l.m154714a(this.f32626b, kVar.f32626b) && C89219l.m154714a(this.f32627c, kVar.f32627c) && C89219l.m154714a(this.f32628d, kVar.f32628d);
    }

    public final int hashCode() {
        String str = this.f32625a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32626b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32627c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32628d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "PrivacyPolicy(id=" + this.f32625a + ", content=" + this.f32626b + ", dataType=" + this.f32627c + ", version=" + this.f32628d + ")";
    }

    public final String getContent() {
        return this.f32626b;
    }

    public final String getDataType() {
        return this.f32627c;
    }

    public final String getId() {
        return this.f32625a;
    }

    public final String getVersion() {
        return this.f32628d;
    }

    public C13350k(String str, String str2, String str3, String str4) {
        this.f32625a = str;
        this.f32626b = str2;
        this.f32627c = str3;
        this.f32628d = str4;
    }
}
