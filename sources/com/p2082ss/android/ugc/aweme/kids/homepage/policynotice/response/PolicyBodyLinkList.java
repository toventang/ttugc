package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList */
public final class PolicyBodyLinkList {
    @AbstractC27891c(mo46611a = "approve")
    private final Boolean approve;
    @AbstractC27891c(mo46611a = "dismiss")
    private final Boolean dismiss;
    @AbstractC27891c(mo46611a = "link")
    private final String link;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "operation")
    private final Integer operation;

    static {
        Covode.recordClassIndex(67629);
    }

    public PolicyBodyLinkList() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PolicyBodyLinkList copy$default(PolicyBodyLinkList policyBodyLinkList, String str, String str2, Boolean bool, Integer num, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = policyBodyLinkList.name;
        }
        if ((i & 2) != 0) {
            str2 = policyBodyLinkList.link;
        }
        if ((i & 4) != 0) {
            bool = policyBodyLinkList.approve;
        }
        if ((i & 8) != 0) {
            num = policyBodyLinkList.operation;
        }
        if ((i & 16) != 0) {
            bool2 = policyBodyLinkList.dismiss;
        }
        return policyBodyLinkList.copy(str, str2, bool, num, bool2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.link;
    }

    public final Boolean component3() {
        return this.approve;
    }

    public final Integer component4() {
        return this.operation;
    }

    public final Boolean component5() {
        return this.dismiss;
    }

    public final PolicyBodyLinkList copy(String str, String str2, Boolean bool, Integer num, Boolean bool2) {
        return new PolicyBodyLinkList(str, str2, bool, num, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyBodyLinkList)) {
            return false;
        }
        PolicyBodyLinkList policyBodyLinkList = (PolicyBodyLinkList) obj;
        return C89219l.m154714a(this.name, policyBodyLinkList.name) && C89219l.m154714a(this.link, policyBodyLinkList.link) && C89219l.m154714a(this.approve, policyBodyLinkList.approve) && C89219l.m154714a(this.operation, policyBodyLinkList.operation) && C89219l.m154714a(this.dismiss, policyBodyLinkList.dismiss);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.approve;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.operation;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.dismiss;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "PolicyBodyLinkList(name=" + this.name + ", link=" + this.link + ", approve=" + this.approve + ", operation=" + this.operation + ", dismiss=" + this.dismiss + ")";
    }

    public final Boolean getApprove() {
        return this.approve;
    }

    public final Boolean getDismiss() {
        return this.dismiss;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOperation() {
        return this.operation;
    }

    public PolicyBodyLinkList(String str, String str2, Boolean bool, Integer num, Boolean bool2) {
        this.name = str;
        this.link = str2;
        this.approve = bool;
        this.operation = num;
        this.dismiss = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PolicyBodyLinkList(java.lang.String r8, java.lang.String r9, java.lang.Boolean r10, java.lang.Integer r11, java.lang.Boolean r12, int r13, p4600h.p4611f.p4613b.C89214g r14) {
        /*
            r7 = this;
            r5 = r11
            r4 = r10
            r6 = r12
            r2 = r8
            r0 = r13 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x000b
            r2 = r3
        L_0x000b:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x002a
        L_0x000f:
            r0 = r13 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L_0x0018:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x001d
            r5 = 0
        L_0x001d:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0025
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x0025:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L_0x002a:
            r3 = r9
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, int, h.f.b.g):void");
    }
}
