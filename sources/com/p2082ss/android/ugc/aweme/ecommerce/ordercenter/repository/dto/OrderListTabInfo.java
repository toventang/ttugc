package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderListTabInfo */
public final class OrderListTabInfo {
    @AbstractC27891c(mo46611a = "schema")
    private final String schema;
    @AbstractC27891c(mo46611a = "tab")
    private final int tab;
    @AbstractC27891c(mo46611a = "tab_name")
    private final String tabName;
    @AbstractC27891c(mo46611a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(52995);
    }

    public OrderListTabInfo() {
        this(0, null, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87361xc92aeb72(int i) {
        return i;
    }

    public static /* synthetic */ OrderListTabInfo copy$default(OrderListTabInfo orderListTabInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = orderListTabInfo.tab;
        }
        if ((i2 & 2) != 0) {
            str = orderListTabInfo.tabName;
        }
        if ((i2 & 4) != 0) {
            str2 = orderListTabInfo.text;
        }
        if ((i2 & 8) != 0) {
            str3 = orderListTabInfo.schema;
        }
        return orderListTabInfo.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.tab;
    }

    public final String component2() {
        return this.tabName;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.schema;
    }

    public final OrderListTabInfo copy(int i, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new OrderListTabInfo(i, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderListTabInfo)) {
            return false;
        }
        OrderListTabInfo orderListTabInfo = (OrderListTabInfo) obj;
        return this.tab == orderListTabInfo.tab && C89219l.m154714a(this.tabName, orderListTabInfo.tabName) && C89219l.m154714a(this.text, orderListTabInfo.text) && C89219l.m154714a(this.schema, orderListTabInfo.schema);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m87361xc92aeb72(this.tab) * 31;
        String str = this.tabName;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_OrderListTabInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.schema;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "OrderListTabInfo(tab=" + this.tab + ", tabName=" + this.tabName + ", text=" + this.text + ", schema=" + this.schema + ")";
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getTab() {
        return this.tab;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getText() {
        return this.text;
    }

    public OrderListTabInfo(int i, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.tab = i;
        this.tabName = str;
        this.text = str2;
        this.schema = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderListTabInfo(int i, String str, String str2, String str3, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? EnumC44620a.ALL.ordinal() : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
