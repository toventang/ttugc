package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeState */
public final class EditProfileBadgeState implements AbstractC20368af {
    private final C34451k result;

    static {
        Covode.recordClassIndex(41362);
    }

    public EditProfileBadgeState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditProfileBadgeState copy$default(EditProfileBadgeState editProfileBadgeState, C34451k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = editProfileBadgeState.result;
        }
        return editProfileBadgeState.copy(kVar);
    }

    public final C34451k component1() {
        return this.result;
    }

    public final EditProfileBadgeState copy(C34451k kVar) {
        return new EditProfileBadgeState(kVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EditProfileBadgeState) && C89219l.m154714a(this.result, ((EditProfileBadgeState) obj).result);
        }
        return true;
    }

    public final int hashCode() {
        C34451k kVar = this.result;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EditProfileBadgeState(result=" + this.result + ")";
    }

    public final C34451k getResult() {
        return this.result;
    }

    public EditProfileBadgeState(C34451k kVar) {
        this.result = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfileBadgeState(C34451k kVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar);
    }
}
