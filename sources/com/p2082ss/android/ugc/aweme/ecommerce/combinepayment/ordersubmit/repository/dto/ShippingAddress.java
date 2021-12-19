package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress */
public final class ShippingAddress {
    @AbstractC27891c(mo46611a = "address_reachable")
    private final Boolean addressReachable;
    @AbstractC27891c(mo46611a = "address_valid")
    private final Boolean addressValid;
    @AbstractC27891c(mo46611a = "invalid_hint_message")
    private final String invalidHintMessage;
    @AbstractC27891c(mo46611a = "shipping_address")
    private final Address shippingAddress;
    @AbstractC27891c(mo46611a = "sku_reachables")
    private final List<SkuReachable> skuReachables;

    static {
        Covode.recordClassIndex(52122);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress2, Address address, Boolean bool, List list, String str, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            address = shippingAddress2.shippingAddress;
        }
        if ((i & 2) != 0) {
            bool = shippingAddress2.addressReachable;
        }
        if ((i & 4) != 0) {
            list = shippingAddress2.skuReachables;
        }
        if ((i & 8) != 0) {
            str = shippingAddress2.invalidHintMessage;
        }
        if ((i & 16) != 0) {
            bool2 = shippingAddress2.addressValid;
        }
        return shippingAddress2.copy(address, bool, list, str, bool2);
    }

    public final Address component1() {
        return this.shippingAddress;
    }

    public final Boolean component2() {
        return this.addressReachable;
    }

    public final List<SkuReachable> component3() {
        return this.skuReachables;
    }

    public final String component4() {
        return this.invalidHintMessage;
    }

    public final Boolean component5() {
        return this.addressValid;
    }

    public final ShippingAddress copy(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2) {
        return new ShippingAddress(address, bool, list, str, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress2 = (ShippingAddress) obj;
        return C89219l.m154714a(this.shippingAddress, shippingAddress2.shippingAddress) && C89219l.m154714a(this.addressReachable, shippingAddress2.addressReachable) && C89219l.m154714a(this.skuReachables, shippingAddress2.skuReachables) && C89219l.m154714a(this.invalidHintMessage, shippingAddress2.invalidHintMessage) && C89219l.m154714a(this.addressValid, shippingAddress2.addressValid);
    }

    public final int hashCode() {
        Address address = this.shippingAddress;
        int i = 0;
        int hashCode = (address != null ? address.hashCode() : 0) * 31;
        Boolean bool = this.addressReachable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List<SkuReachable> list = this.skuReachables;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.invalidHintMessage;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool2 = this.addressValid;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ShippingAddress(shippingAddress=" + this.shippingAddress + ", addressReachable=" + this.addressReachable + ", skuReachables=" + this.skuReachables + ", invalidHintMessage=" + this.invalidHintMessage + ", addressValid=" + this.addressValid + ")";
    }

    public final Boolean getAddressReachable() {
        return this.addressReachable;
    }

    public final Boolean getAddressValid() {
        return this.addressValid;
    }

    public final String getInvalidHintMessage() {
        return this.invalidHintMessage;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<SkuReachable> getSkuReachables() {
        return this.skuReachables;
    }

    public final ShippingAddress merge(ShippingAddress shippingAddress2) {
        if (shippingAddress2 == null) {
            return this;
        }
        Address address = shippingAddress2.shippingAddress;
        if (address == null) {
            address = this.shippingAddress;
        }
        Boolean bool = shippingAddress2.addressReachable;
        if (bool == null) {
            bool = this.addressReachable;
        }
        List<SkuReachable> list = shippingAddress2.skuReachables;
        if (list == null) {
            list = this.skuReachables;
        }
        String str = shippingAddress2.invalidHintMessage;
        if (str == null) {
            str = this.invalidHintMessage;
        }
        Boolean bool2 = shippingAddress2.addressValid;
        if (bool2 == null) {
            bool2 = this.addressValid;
        }
        return new ShippingAddress(address, bool, list, str, bool2);
    }

    public ShippingAddress(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2) {
        this.shippingAddress = address;
        this.addressReachable = bool;
        this.skuReachables = list;
        this.invalidHintMessage = str;
        this.addressValid = bool2;
    }
}
