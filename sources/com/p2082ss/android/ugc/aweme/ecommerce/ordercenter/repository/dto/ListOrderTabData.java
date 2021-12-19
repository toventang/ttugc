package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabData */
public final class ListOrderTabData {
    @AbstractC27891c(mo46611a = "entrances")
    private final List<EntranceData> entrances;
    @AbstractC27891c(mo46611a = "tabs")
    private final List<OrderListTabInfo> tabs;

    static {
        Covode.recordClassIndex(52992);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListOrderTabData copy$default(ListOrderTabData listOrderTabData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listOrderTabData.tabs;
        }
        if ((i & 2) != 0) {
            list2 = listOrderTabData.entrances;
        }
        return listOrderTabData.copy(list, list2);
    }

    public final List<OrderListTabInfo> component1() {
        return this.tabs;
    }

    public final List<EntranceData> component2() {
        return this.entrances;
    }

    public final ListOrderTabData copy(List<OrderListTabInfo> list, List<EntranceData> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        return new ListOrderTabData(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOrderTabData)) {
            return false;
        }
        ListOrderTabData listOrderTabData = (ListOrderTabData) obj;
        return C89219l.m154714a(this.tabs, listOrderTabData.tabs) && C89219l.m154714a(this.entrances, listOrderTabData.entrances);
    }

    public final int hashCode() {
        List<OrderListTabInfo> list = this.tabs;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<EntranceData> list2 = this.entrances;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ListOrderTabData(tabs=" + this.tabs + ", entrances=" + this.entrances + ")";
    }

    public final List<EntranceData> getEntrances() {
        return this.entrances;
    }

    public final List<OrderListTabInfo> getTabs() {
        return this.tabs;
    }

    public ListOrderTabData(List<OrderListTabInfo> list, List<EntranceData> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.tabs = list;
        this.entrances = list2;
    }
}
