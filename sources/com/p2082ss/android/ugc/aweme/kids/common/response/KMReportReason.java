package com.p2082ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.response.KMReportReason */
public final class KMReportReason {
    @AbstractC27891c(mo46611a = "video")
    private final List<C57356a> video;

    static {
        Covode.recordClassIndex(67267);
    }

    public KMReportReason() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.kids.common.response.KMReportReason */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KMReportReason copy$default(KMReportReason kMReportReason, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kMReportReason.video;
        }
        return kMReportReason.copy(list);
    }

    public final List<C57356a> component1() {
        return this.video;
    }

    public final KMReportReason copy(List<C57356a> list) {
        C89219l.m154721d(list, "");
        return new KMReportReason(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof KMReportReason) && C89219l.m154714a(this.video, ((KMReportReason) obj).video);
        }
        return true;
    }

    public final int hashCode() {
        List<C57356a> list = this.video;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "KMReportReason(video=" + this.video + ")";
    }

    public final List<C57356a> getVideo() {
        return this.video;
    }

    public KMReportReason(List<C57356a> list) {
        C89219l.m154721d(list, "");
        this.video = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KMReportReason(List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list);
    }
}
