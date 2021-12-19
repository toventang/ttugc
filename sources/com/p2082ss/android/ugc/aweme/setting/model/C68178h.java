package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.model.h */
public final class C68178h extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "edibility_birthdate_type")

    /* renamed from: a */
    private final Integer f152649a;
    @AbstractC27891c(mo46611a = "default_birthdate")

    /* renamed from: b */
    private final String f152650b;
    @AbstractC27891c(mo46611a = "notification_msg")

    /* renamed from: c */
    private final String f152651c;
    @AbstractC27891c(mo46611a = "appeal_url")

    /* renamed from: d */
    private final String f152652d;
    @AbstractC27891c(mo46611a = "upper_bound_date")

    /* renamed from: e */
    private final String f152653e;
    @AbstractC27891c(mo46611a = "desc_type")

    /* renamed from: f */
    private final Integer f152654f;

    static {
        Covode.recordClassIndex(80377);
    }

    public C68178h() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ C68178h copy$default(C68178h hVar, Integer num, String str, String str2, String str3, String str4, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = hVar.f152649a;
        }
        if ((i & 2) != 0) {
            str = hVar.f152650b;
        }
        if ((i & 4) != 0) {
            str2 = hVar.f152651c;
        }
        if ((i & 8) != 0) {
            str3 = hVar.f152652d;
        }
        if ((i & 16) != 0) {
            str4 = hVar.f152653e;
        }
        if ((i & 32) != 0) {
            num2 = hVar.f152654f;
        }
        return hVar.copy(num, str, str2, str3, str4, num2);
    }

    public final Integer component1() {
        return this.f152649a;
    }

    public final String component2() {
        return this.f152650b;
    }

    public final String component3() {
        return this.f152651c;
    }

    public final String component4() {
        return this.f152652d;
    }

    public final String component5() {
        return this.f152653e;
    }

    public final Integer component6() {
        return this.f152654f;
    }

    public final C68178h copy(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        return new C68178h(num, str, str2, str3, str4, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68178h)) {
            return false;
        }
        C68178h hVar = (C68178h) obj;
        return C89219l.m154714a(this.f152649a, hVar.f152649a) && C89219l.m154714a(this.f152650b, hVar.f152650b) && C89219l.m154714a(this.f152651c, hVar.f152651c) && C89219l.m154714a(this.f152652d, hVar.f152652d) && C89219l.m154714a(this.f152653e, hVar.f152653e) && C89219l.m154714a(this.f152654f, hVar.f152654f);
    }

    public final int hashCode() {
        Integer num = this.f152649a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f152650b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f152651c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152652d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f152653e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num2 = this.f152654f;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DoBStatus(type=" + this.f152649a + ", defaultDoB=" + this.f152650b + ", msg=" + this.f152651c + ", appealUrl=" + this.f152652d + ", upperBoundDate=" + this.f152653e + ", descType=" + this.f152654f + ")";
    }

    public final String getAppealUrl() {
        return this.f152652d;
    }

    public final String getDefaultDoB() {
        return this.f152650b;
    }

    public final Integer getDescType() {
        return this.f152654f;
    }

    public final String getMsg() {
        return this.f152651c;
    }

    public final Integer getType() {
        return this.f152649a;
    }

    public final String getUpperBoundDate() {
        return this.f152653e;
    }

    public C68178h(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.f152649a = num;
        this.f152650b = str;
        this.f152651c = str2;
        this.f152652d = str3;
        this.f152653e = str4;
        this.f152654f = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C68178h(java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14, int r15, p4600h.p4611f.p4613b.C89214g r16) {
        /*
            r8 = this;
            r5 = r12
            r3 = r10
            r4 = r11
            r2 = r9
            r1 = r15 & 1
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x000e
            r2 = r7
        L_0x000e:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0015
            r3 = r6
        L_0x0015:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x001a
            r4 = r6
        L_0x001a:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001f
            r5 = r6
        L_0x001f:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x002e
        L_0x0023:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x002c
        L_0x0027:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x002c:
            r7 = r14
            goto L_0x0027
        L_0x002e:
            r6 = r13
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.model.C68178h.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, h.f.b.g):void");
    }
}
