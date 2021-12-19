package com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState */
public final class OrganizationListState implements AbstractC20368af {
    private final C82809a result;

    static {
        Covode.recordClassIndex(96644);
    }

    public OrganizationListState() {
        this(null, 1, null);
    }

    public static /* synthetic */ OrganizationListState copy$default(OrganizationListState organizationListState, C82809a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = organizationListState.result;
        }
        return organizationListState.copy(aVar);
    }

    public final C82809a component1() {
        return this.result;
    }

    public final OrganizationListState copy(C82809a aVar) {
        return new OrganizationListState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OrganizationListState) && C89219l.m154714a(this.result, ((OrganizationListState) obj).result);
        }
        return true;
    }

    public final int hashCode() {
        C82809a aVar = this.result;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OrganizationListState(result=" + this.result + ")";
    }

    public final C82809a getResult() {
        return this.result;
    }

    public OrganizationListState(C82809a aVar) {
        this.result = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrganizationListState(C82809a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : aVar);
    }
}
