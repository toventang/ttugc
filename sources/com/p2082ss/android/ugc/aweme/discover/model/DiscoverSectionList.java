package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverSectionList */
public final class DiscoverSectionList implements Serializable {
    private final int cursor;
    private final boolean hasMore;
    private boolean isCache;
    private final List<DiscoverSectionItem> sections;

    static {
        Covode.recordClassIndex(50449);
    }

    public DiscoverSectionList() {
        this(null, 0, false, false, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_DiscoverSectionList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84889x3a7e923d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.DiscoverSectionList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverSectionList copy$default(DiscoverSectionList discoverSectionList, List list, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = discoverSectionList.sections;
        }
        if ((i2 & 2) != 0) {
            i = discoverSectionList.cursor;
        }
        if ((i2 & 4) != 0) {
            z = discoverSectionList.hasMore;
        }
        if ((i2 & 8) != 0) {
            z2 = discoverSectionList.isCache;
        }
        return discoverSectionList.copy(list, i, z, z2);
    }

    public final List<DiscoverSectionItem> component1() {
        return this.sections;
    }

    public final int component2() {
        return this.cursor;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final boolean component4() {
        return this.isCache;
    }

    public final DiscoverSectionList copy(List<? extends DiscoverSectionItem> list, int i, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
        return new DiscoverSectionList(list, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverSectionList)) {
            return false;
        }
        DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj;
        return C89219l.m154714a(this.sections, discoverSectionList.sections) && this.cursor == discoverSectionList.cursor && this.hasMore == discoverSectionList.hasMore && this.isCache == discoverSectionList.isCache;
    }

    public final int hashCode() {
        List<DiscoverSectionItem> list = this.sections;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + m84889x3a7e923d(this.cursor)) * 31;
        boolean z = this.hasMore;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.isCache) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "DiscoverSectionList(sections=" + this.sections + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", isCache=" + this.isCache + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<DiscoverSectionItem> getSections() {
        return this.sections;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverSectionList(List<? extends DiscoverSectionItem> list, int i, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
        this.sections = list;
        this.cursor = i;
        this.hasMore = z;
        this.isCache = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscoverSectionList(List list, int i, boolean z, boolean z2, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? C89086z.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }
}
