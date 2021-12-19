package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.BeautifyInfo */
public final class BeautifyInfo {
    @AbstractC27891c(mo46611a = "id")
    private final String effectId;
    @AbstractC27891c(mo46611a = "tags")
    private final List<BeautifyTag> tags;

    static {
        Covode.recordClassIndex(41798);
    }

    public BeautifyInfo() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.beauty.BeautifyInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeautifyInfo copy$default(BeautifyInfo beautifyInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifyInfo.effectId;
        }
        if ((i & 2) != 0) {
            list = beautifyInfo.tags;
        }
        return beautifyInfo.copy(str, list);
    }

    public final String component1() {
        return this.effectId;
    }

    public final List<BeautifyTag> component2() {
        return this.tags;
    }

    public final BeautifyInfo copy(String str, List<BeautifyTag> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return new BeautifyInfo(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyInfo)) {
            return false;
        }
        BeautifyInfo beautifyInfo = (BeautifyInfo) obj;
        return C89219l.m154714a(this.effectId, beautifyInfo.effectId) && C89219l.m154714a(this.tags, beautifyInfo.tags);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<BeautifyTag> list = this.tags;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BeautifyInfo(effectId=" + this.effectId + ", tags=" + this.tags + ")";
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final List<BeautifyTag> getTags() {
        return this.tags;
    }

    public BeautifyInfo(String str, List<BeautifyTag> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.effectId = str;
        this.tags = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautifyInfo(String str, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? "-1" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
