package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a */
public final class C57663a implements Serializable {
    @AbstractC27891c(mo46611a = "business")

    /* renamed from: a */
    private final String f131598a;
    @AbstractC27891c(mo46611a = "policy_version")

    /* renamed from: b */
    private final String f131599b;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: c */
    private final String f131600c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    private final String f131601d;
    @AbstractC27891c(mo46611a = "body")

    /* renamed from: e */
    private final String f131602e;
    @AbstractC27891c(mo46611a = "actions")

    /* renamed from: f */
    private final List<C57664b> f131603f;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: g */
    private final String f131604g;
    @AbstractC27891c(mo46611a = "body_link_list")

    /* renamed from: h */
    private final List<PolicyBodyLinkList> f131605h;
    @AbstractC27891c(mo46611a = "sub_pop_up")

    /* renamed from: i */
    private final Boolean f131606i;
    @AbstractC27891c(mo46611a = "first_button_highlight")

    /* renamed from: j */
    private final Boolean f131607j;

    static {
        Covode.recordClassIndex(67630);
    }

    public C57663a() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57663a copy$default(C57663a aVar, String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f131598a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f131599b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f131600c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f131601d;
        }
        if ((i & 16) != 0) {
            str5 = aVar.f131602e;
        }
        if ((i & 32) != 0) {
            list = aVar.f131603f;
        }
        if ((i & 64) != 0) {
            str6 = aVar.f131604g;
        }
        if ((i & 128) != 0) {
            list2 = aVar.f131605h;
        }
        if ((i & 256) != 0) {
            bool = aVar.f131606i;
        }
        if ((i & 512) != 0) {
            bool2 = aVar.f131607j;
        }
        return aVar.copy(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final String component1() {
        return this.f131598a;
    }

    public final Boolean component10() {
        return this.f131607j;
    }

    public final String component2() {
        return this.f131599b;
    }

    public final String component3() {
        return this.f131600c;
    }

    public final String component4() {
        return this.f131601d;
    }

    public final String component5() {
        return this.f131602e;
    }

    public final List<C57664b> component6() {
        return this.f131603f;
    }

    public final String component7() {
        return this.f131604g;
    }

    public final List<PolicyBodyLinkList> component8() {
        return this.f131605h;
    }

    public final Boolean component9() {
        return this.f131606i;
    }

    public final C57663a copy(String str, String str2, String str3, String str4, String str5, List<C57664b> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str6, "");
        return new C57663a(str, str2, str3, str4, str5, list, str6, list2, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57663a)) {
            return false;
        }
        C57663a aVar = (C57663a) obj;
        return C89219l.m154714a(this.f131598a, aVar.f131598a) && C89219l.m154714a(this.f131599b, aVar.f131599b) && C89219l.m154714a(this.f131600c, aVar.f131600c) && C89219l.m154714a(this.f131601d, aVar.f131601d) && C89219l.m154714a(this.f131602e, aVar.f131602e) && C89219l.m154714a(this.f131603f, aVar.f131603f) && C89219l.m154714a(this.f131604g, aVar.f131604g) && C89219l.m154714a(this.f131605h, aVar.f131605h) && C89219l.m154714a(this.f131606i, aVar.f131606i) && C89219l.m154714a(this.f131607j, aVar.f131607j);
    }

    public final int hashCode() {
        String str = this.f131598a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f131599b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131600c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f131601d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f131602e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<C57664b> list = this.f131603f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.f131604g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<PolicyBodyLinkList> list2 = this.f131605h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.f131606i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f131607j;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "PolicyNotice(business=" + this.f131598a + ", policyVersion=" + this.f131599b + ", style=" + this.f131600c + ", title=" + this.f131601d + ", body=" + this.f131602e + ", actions=" + this.f131603f + ", icon_url=" + this.f131604g + ", policyLinkList=" + this.f131605h + ", isSubPopUp=" + this.f131606i + ", firstButtonHighlight=" + this.f131607j + ")";
    }

    public final List<C57664b> getActions() {
        return this.f131603f;
    }

    public final String getBody() {
        return this.f131602e;
    }

    public final String getBusiness() {
        return this.f131598a;
    }

    public final Boolean getFirstButtonHighlight() {
        return this.f131607j;
    }

    public final String getIcon_url() {
        return this.f131604g;
    }

    public final List<PolicyBodyLinkList> getPolicyLinkList() {
        return this.f131605h;
    }

    public final String getPolicyVersion() {
        return this.f131599b;
    }

    public final String getStyle() {
        return this.f131600c;
    }

    public final String getTitle() {
        return this.f131601d;
    }

    public final Boolean isSubPopUp() {
        return this.f131606i;
    }

    public C57663a(String str, String str2, String str3, String str4, String str5, List<C57664b> list, String str6, List<PolicyBodyLinkList> list2, Boolean bool, Boolean bool2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str6, "");
        this.f131598a = str;
        this.f131599b = str2;
        this.f131600c = str3;
        this.f131601d = str4;
        this.f131602e = str5;
        this.f131603f = list;
        this.f131604g = str6;
        this.f131605h = list2;
        this.f131606i = bool;
        this.f131607j = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C57663a(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.lang.String r20, java.util.List r21, java.lang.Boolean r22, java.lang.Boolean r23, int r24, p4600h.p4611f.p4613b.C89214g r25) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, int, h.f.b.g):void");
    }
}
