package com.p2082ss.android.ugc.aweme.ttlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttlive.a */
public final class C79335a extends BaseResponse {
    @AbstractC27891c(mo46611a = "edibility_birthdate_type")

    /* renamed from: a */
    public final Integer f178243a;
    @AbstractC27891c(mo46611a = "default_birthdate")

    /* renamed from: b */
    public final String f178244b;
    @AbstractC27891c(mo46611a = "notification_msg")

    /* renamed from: c */
    public final String f178245c;
    @AbstractC27891c(mo46611a = "appeal_url")

    /* renamed from: d */
    public final String f178246d;
    @AbstractC27891c(mo46611a = "upper_bound_date")

    /* renamed from: e */
    public final String f178247e;
    @AbstractC27891c(mo46611a = "desc_type")

    /* renamed from: f */
    public final Integer f178248f;

    static {
        Covode.recordClassIndex(92529);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79335a)) {
            return false;
        }
        C79335a aVar = (C79335a) obj;
        return C89219l.m154714a(this.f178243a, aVar.f178243a) && C89219l.m154714a(this.f178244b, aVar.f178244b) && C89219l.m154714a(this.f178245c, aVar.f178245c) && C89219l.m154714a(this.f178246d, aVar.f178246d) && C89219l.m154714a(this.f178247e, aVar.f178247e) && C89219l.m154714a(this.f178248f, aVar.f178248f);
    }

    public final int hashCode() {
        Integer num = this.f178243a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f178244b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f178245c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f178246d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f178247e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.f178248f;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBStatus(type=" + this.f178243a + ", defaultDoB=" + this.f178244b + ", msg=" + this.f178245c + ", appealUrl=" + this.f178246d + ", upperBoundDate=" + this.f178247e + ", descType=" + this.f178248f + ")";
    }

    private /* synthetic */ C79335a() {
        this(0, "", "", "", "", 0);
    }

    private C79335a(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.f178243a = num;
        this.f178244b = str;
        this.f178245c = str2;
        this.f178246d = str3;
        this.f178247e = str4;
        this.f178248f = num2;
    }
}
