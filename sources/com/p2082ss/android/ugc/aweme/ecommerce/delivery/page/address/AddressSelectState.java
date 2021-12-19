package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectState */
public final class AddressSelectState implements AbstractC20368af {
    private final C44457d selectedAddress;

    static {
        Covode.recordClassIndex(52730);
    }

    public AddressSelectState() {
        this(null, 1, null);
    }

    public static /* synthetic */ AddressSelectState copy$default(AddressSelectState addressSelectState, C44457d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = addressSelectState.selectedAddress;
        }
        return addressSelectState.copy(dVar);
    }

    public final C44457d component1() {
        return this.selectedAddress;
    }

    public final AddressSelectState copy(C44457d dVar) {
        return new AddressSelectState(dVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AddressSelectState) && C89219l.m154714a(this.selectedAddress, ((AddressSelectState) obj).selectedAddress);
        }
        return true;
    }

    public final int hashCode() {
        C44457d dVar = this.selectedAddress;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AddressSelectState(selectedAddress=" + this.selectedAddress + ")";
    }

    public final C44457d getSelectedAddress() {
        return this.selectedAddress;
    }

    public AddressSelectState(C44457d dVar) {
        this.selectedAddress = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSelectState(C44457d dVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : dVar);
    }
}
