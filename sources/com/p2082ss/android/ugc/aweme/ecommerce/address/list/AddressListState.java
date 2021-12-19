package com.p2082ss.android.ugc.aweme.ecommerce.address.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListState */
public final class AddressListState implements AbstractC20368af {
    private final C43548b addAddressClick;
    private final C43548b addressClick;
    private final List<C44457d> addressList;
    private final C43571c deleteEvent;
    private final C43548b editAddressClick;
    private final int status;

    static {
        Covode.recordClassIndex(51774);
    }

    public AddressListState() {
        this(0, null, null, null, null, null, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86586x646ab217(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressListState copy$default(AddressListState addressListState, int i, List list, C43548b bVar, C43548b bVar2, C43548b bVar3, C43571c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressListState.status;
        }
        if ((i2 & 2) != 0) {
            list = addressListState.addressList;
        }
        if ((i2 & 4) != 0) {
            bVar = addressListState.addAddressClick;
        }
        if ((i2 & 8) != 0) {
            bVar2 = addressListState.editAddressClick;
        }
        if ((i2 & 16) != 0) {
            bVar3 = addressListState.addressClick;
        }
        if ((i2 & 32) != 0) {
            cVar = addressListState.deleteEvent;
        }
        return addressListState.copy(i, list, bVar, bVar2, bVar3, cVar);
    }

    public final int component1() {
        return this.status;
    }

    public final List<C44457d> component2() {
        return this.addressList;
    }

    public final C43548b component3() {
        return this.addAddressClick;
    }

    public final C43548b component4() {
        return this.editAddressClick;
    }

    public final C43548b component5() {
        return this.addressClick;
    }

    public final C43571c component6() {
        return this.deleteEvent;
    }

    public final AddressListState copy(int i, List<C44457d> list, C43548b bVar, C43548b bVar2, C43548b bVar3, C43571c cVar) {
        C89219l.m154721d(list, "");
        return new AddressListState(i, list, bVar, bVar2, bVar3, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListState)) {
            return false;
        }
        AddressListState addressListState = (AddressListState) obj;
        return this.status == addressListState.status && C89219l.m154714a(this.addressList, addressListState.addressList) && C89219l.m154714a(this.addAddressClick, addressListState.addAddressClick) && C89219l.m154714a(this.editAddressClick, addressListState.editAddressClick) && C89219l.m154714a(this.addressClick, addressListState.addressClick) && C89219l.m154714a(this.deleteEvent, addressListState.deleteEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86586x646ab217(this.status) * 31;
        List<C44457d> list = this.addressList;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_address_list_AddressListState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C43548b bVar = this.addAddressClick;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C43548b bVar2 = this.editAddressClick;
        int hashCode3 = (hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        C43548b bVar3 = this.addressClick;
        int hashCode4 = (hashCode3 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        C43571c cVar = this.deleteEvent;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AddressListState(status=" + this.status + ", addressList=" + this.addressList + ", addAddressClick=" + this.addAddressClick + ", editAddressClick=" + this.editAddressClick + ", addressClick=" + this.addressClick + ", deleteEvent=" + this.deleteEvent + ")";
    }

    public final C43548b getAddAddressClick() {
        return this.addAddressClick;
    }

    public final C43548b getAddressClick() {
        return this.addressClick;
    }

    public final List<C44457d> getAddressList() {
        return this.addressList;
    }

    public final C43571c getDeleteEvent() {
        return this.deleteEvent;
    }

    public final C43548b getEditAddressClick() {
        return this.editAddressClick;
    }

    public final int getStatus() {
        return this.status;
    }

    public AddressListState(int i, List<C44457d> list, C43548b bVar, C43548b bVar2, C43548b bVar3, C43571c cVar) {
        C89219l.m154721d(list, "");
        this.status = i;
        this.addressList = list;
        this.addAddressClick = bVar;
        this.editAddressClick = bVar2;
        this.addressClick = bVar3;
        this.deleteEvent = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressListState(int i, List list, C43548b bVar, C43548b bVar2, C43548b bVar3, C43571c cVar, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? C89086z.INSTANCE : list, (i2 & 4) != 0 ? null : bVar, (i2 & 8) != 0 ? null : bVar2, (i2 & 16) != 0 ? null : bVar3, (i2 & 32) == 0 ? cVar : null);
    }
}
