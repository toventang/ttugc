package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo */
public final class LegalEntityChangeInfo implements Serializable {
    @AbstractC27891c(mo46611a = "body")
    private final String body;
    @AbstractC27891c(mo46611a = "content_link_list")
    private final List<PolicyBodyLinkList> bodyLinkList;
    @AbstractC27891c(mo46611a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(46889);
    }

    public LegalEntityChangeInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalEntityChangeInfo copy$default(LegalEntityChangeInfo legalEntityChangeInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalEntityChangeInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = legalEntityChangeInfo.body;
        }
        if ((i & 4) != 0) {
            list = legalEntityChangeInfo.bodyLinkList;
        }
        return legalEntityChangeInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final List<PolicyBodyLinkList> component3() {
        return this.bodyLinkList;
    }

    public final LegalEntityChangeInfo copy(String str, String str2, List<PolicyBodyLinkList> list) {
        return new LegalEntityChangeInfo(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalEntityChangeInfo)) {
            return false;
        }
        LegalEntityChangeInfo legalEntityChangeInfo = (LegalEntityChangeInfo) obj;
        return C89219l.m154714a(this.title, legalEntityChangeInfo.title) && C89219l.m154714a(this.body, legalEntityChangeInfo.body) && C89219l.m154714a(this.bodyLinkList, legalEntityChangeInfo.bodyLinkList);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<PolicyBodyLinkList> list = this.bodyLinkList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LegalEntityChangeInfo(title=" + this.title + ", body=" + this.body + ", bodyLinkList=" + this.bodyLinkList + ")";
    }

    public final String getBody() {
        return this.body;
    }

    public final List<PolicyBodyLinkList> getBodyLinkList() {
        return this.bodyLinkList;
    }

    public final String getTitle() {
        return this.title;
    }

    public LegalEntityChangeInfo(String str, String str2, List<PolicyBodyLinkList> list) {
        this.title = str;
        this.body = str2;
        this.bodyLinkList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LegalEntityChangeInfo(String str, String str2, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C89086z.INSTANCE : list);
    }
}
