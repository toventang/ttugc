package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.i */
public final class C39248i implements Serializable {
    @AbstractC27891c(mo46611a = "business")

    /* renamed from: a */
    private final String f92706a;
    @AbstractC27891c(mo46611a = "policy_version")

    /* renamed from: b */
    private final String f92707b;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: c */
    private final String f92708c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    private final String f92709d;
    @AbstractC27891c(mo46611a = "body")

    /* renamed from: e */
    private final String f92710e;
    @AbstractC27891c(mo46611a = "actions")

    /* renamed from: f */
    private final List<C39249j> f92711f;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: g */
    private final String f92712g;
    @AbstractC27891c(mo46611a = "body_link_list")

    /* renamed from: h */
    private final List<PolicyBodyLinkList> f92713h;
    @AbstractC27891c(mo46611a = "sub_pop_up")

    /* renamed from: i */
    private final Boolean f92714i;
    @AbstractC27891c(mo46611a = "first_button_highlight")

    /* renamed from: j */
    private final Boolean f92715j;

    static {
        Covode.recordClassIndex(46906);
    }

    public C39248i() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.i */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39248i copy$default(C39248i iVar, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.f92706a;
        }
        if ((i & 2) != 0) {
            str2 = iVar.f92707b;
        }
        if ((i & 4) != 0) {
            str3 = iVar.f92708c;
        }
        if ((i & 8) != 0) {
            str4 = iVar.f92709d;
        }
        if ((i & 16) != 0) {
            str5 = iVar.f92710e;
        }
        if ((i & 32) != 0) {
            list = iVar.f92711f;
        }
        if ((i & 64) != 0) {
            str6 = iVar.f92712g;
        }
        if ((i & 128) != 0) {
            list2 = iVar.f92713h;
        }
        if ((i & 256) != 0) {
            bool = iVar.f92714i;
        }
        if ((i & 512) != 0) {
            bool2 = iVar.f92715j;
        }
        return iVar.copy(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final String component1() {
        return this.f92706a;
    }

    public final Boolean component10() {
        return this.f92715j;
    }

    public final String component2() {
        return this.f92707b;
    }

    public final String component3() {
        return this.f92708c;
    }

    public final String component4() {
        return this.f92709d;
    }

    public final String component5() {
        return this.f92710e;
    }

    public final List<C39249j> component6() {
        return this.f92711f;
    }

    public final String component7() {
        return this.f92712g;
    }

    public final List<PolicyBodyLinkList> component8() {
        return this.f92713h;
    }

    public final Boolean component9() {
        return this.f92714i;
    }

    public final C39248i copy(String str, String str2, String str3, String str4, String str5, List<C39249j> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str6, "");
        return new C39248i(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39248i)) {
            return false;
        }
        C39248i iVar = (C39248i) obj;
        return C89219l.m154714a(this.f92706a, iVar.f92706a) && C89219l.m154714a(this.f92707b, iVar.f92707b) && C89219l.m154714a(this.f92708c, iVar.f92708c) && C89219l.m154714a(this.f92709d, iVar.f92709d) && C89219l.m154714a(this.f92710e, iVar.f92710e) && C89219l.m154714a(this.f92711f, iVar.f92711f) && C89219l.m154714a(this.f92712g, iVar.f92712g) && C89219l.m154714a(this.f92713h, iVar.f92713h) && C89219l.m154714a(this.f92714i, iVar.f92714i) && C89219l.m154714a(this.f92715j, iVar.f92715j);
    }

    public final int hashCode() {
        String str = this.f92706a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92707b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92708c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f92709d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f92710e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<C39249j> list = this.f92711f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.f92712g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<PolicyBodyLinkList> list2 = this.f92713h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.f92714i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f92715j;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "PolicyNotice(business=" + this.f92706a + ", policyVersion=" + this.f92707b + ", style=" + this.f92708c + ", title=" + this.f92709d + ", body=" + this.f92710e + ", actions=" + this.f92711f + ", icon_url=" + this.f92712g + ", policyLinkList=" + this.f92713h + ", isSubPopUp=" + this.f92714i + ", firstButtonHighlight=" + this.f92715j + ")";
    }

    public final List<C39249j> getActions() {
        return this.f92711f;
    }

    public final String getBody() {
        return this.f92710e;
    }

    public final String getBusiness() {
        return this.f92706a;
    }

    public final Boolean getFirstButtonHighlight() {
        return this.f92715j;
    }

    public final String getIcon_url() {
        return this.f92712g;
    }

    public final List<PolicyBodyLinkList> getPolicyLinkList() {
        return this.f92713h;
    }

    public final String getPolicyVersion() {
        return this.f92707b;
    }

    public final String getStyle() {
        return this.f92708c;
    }

    public final String getTitle() {
        return this.f92709d;
    }

    public final Boolean isSubPopUp() {
        return this.f92714i;
    }

    public C39248i(String str, String str2, String str3, String str4, String str5, List<C39249j> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str6, "");
        this.f92706a = str;
        this.f92707b = str2;
        this.f92708c = str3;
        this.f92709d = str4;
        this.f92710e = str5;
        this.f92711f = list;
        this.f92712g = str6;
        this.f92713h = list2;
        this.f92714i = bool;
        this.f92715j = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C39248i(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.lang.String r20, java.util.List r21, java.lang.Boolean r22, java.lang.Boolean r23, int r24, p4600h.p4611f.p4613b.C89214g r25) {
        /*
            r13 = this;
            r12 = r23
            r11 = r22
            r8 = r19
            r7 = r18
            r3 = r14
            r10 = r21
            r4 = r15
            r5 = r16
            r2 = r24
            r6 = r17
            r0 = r2 & 1
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0019
            r3 = r9
        L_0x0019:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x001e
            r4 = r9
        L_0x001e:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0023
            r5 = r9
        L_0x0023:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0028
            r6 = r9
        L_0x0028:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x002d
            r7 = r9
        L_0x002d:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0033
            h.a.z r8 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0033:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x0053
        L_0x0037:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            h.a.z r10 = p4600h.p4601a.C89086z.INSTANCE
        L_0x003d:
            r0 = r2 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0046
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x0046:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
        L_0x004e:
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0053:
            r9 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, int, h.f.b.g):void");
    }
}
