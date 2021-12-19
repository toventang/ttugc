package com.p2082ss.android.ugc.gamora.recorder.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.permission.PermissionState */
public final class PermissionState implements AbstractC20368af {
    private final C20526p onOpenOtherPage;
    private final C20526p tryStartPreviewFromBusiness;

    static {
        Covode.recordClassIndex(97831);
    }

    public PermissionState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PermissionState copy$default(PermissionState permissionState, C20526p pVar, C20526p pVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = permissionState.onOpenOtherPage;
        }
        if ((i & 2) != 0) {
            pVar2 = permissionState.tryStartPreviewFromBusiness;
        }
        return permissionState.copy(pVar, pVar2);
    }

    public final C20526p component1() {
        return this.onOpenOtherPage;
    }

    public final C20526p component2() {
        return this.tryStartPreviewFromBusiness;
    }

    public final PermissionState copy(C20526p pVar, C20526p pVar2) {
        return new PermissionState(pVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        return C89219l.m154714a(this.onOpenOtherPage, permissionState.onOpenOtherPage) && C89219l.m154714a(this.tryStartPreviewFromBusiness, permissionState.tryStartPreviewFromBusiness);
    }

    public final int hashCode() {
        C20526p pVar = this.onOpenOtherPage;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.tryStartPreviewFromBusiness;
        if (pVar2 != null) {
            i = pVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PermissionState(onOpenOtherPage=" + this.onOpenOtherPage + ", tryStartPreviewFromBusiness=" + this.tryStartPreviewFromBusiness + ")";
    }

    public final C20526p getOnOpenOtherPage() {
        return this.onOpenOtherPage;
    }

    public final C20526p getTryStartPreviewFromBusiness() {
        return this.tryStartPreviewFromBusiness;
    }

    public PermissionState(C20526p pVar, C20526p pVar2) {
        this.onOpenOtherPage = pVar;
        this.tryStartPreviewFromBusiness = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionState(C20526p pVar, C20526p pVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2);
    }
}
