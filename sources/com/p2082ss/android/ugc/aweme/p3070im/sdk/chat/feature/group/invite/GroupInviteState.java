package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20379aq;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteState */
public final class GroupInviteState implements AbstractC20368af {
    private final AbstractC20362a<InviteCardDetailInnerResponse> asyncDetail;
    private final AbstractC20362a<AcceptInviteCardResponse> asyncJoin;
    private final boolean close;
    private final C55371a group;

    static {
        Covode.recordClassIndex(63678);
    }

    public GroupInviteState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupInviteState copy$default(GroupInviteState groupInviteState, C55371a aVar, AbstractC20362a aVar2, AbstractC20362a aVar3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = groupInviteState.group;
        }
        if ((i & 2) != 0) {
            aVar2 = groupInviteState.asyncDetail;
        }
        if ((i & 4) != 0) {
            aVar3 = groupInviteState.asyncJoin;
        }
        if ((i & 8) != 0) {
            z = groupInviteState.close;
        }
        return groupInviteState.copy(aVar, aVar2, aVar3, z);
    }

    public final C55371a component1() {
        return this.group;
    }

    public final AbstractC20362a<InviteCardDetailInnerResponse> component2() {
        return this.asyncDetail;
    }

    public final AbstractC20362a<AcceptInviteCardResponse> component3() {
        return this.asyncJoin;
    }

    public final boolean component4() {
        return this.close;
    }

    public final GroupInviteState copy(C55371a aVar, AbstractC20362a<InviteCardDetailInnerResponse> aVar2, AbstractC20362a<AcceptInviteCardResponse> aVar3, boolean z) {
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        return new GroupInviteState(aVar, aVar2, aVar3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInviteState)) {
            return false;
        }
        GroupInviteState groupInviteState = (GroupInviteState) obj;
        return C89219l.m154714a(this.group, groupInviteState.group) && C89219l.m154714a(this.asyncDetail, groupInviteState.asyncDetail) && C89219l.m154714a(this.asyncJoin, groupInviteState.asyncJoin) && this.close == groupInviteState.close;
    }

    public final int hashCode() {
        C55371a aVar = this.group;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        AbstractC20362a<InviteCardDetailInnerResponse> aVar2 = this.asyncDetail;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        AbstractC20362a<AcceptInviteCardResponse> aVar3 = this.asyncJoin;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.close;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "GroupInviteState(group=" + this.group + ", asyncDetail=" + this.asyncDetail + ", asyncJoin=" + this.asyncJoin + ", close=" + this.close + ")";
    }

    public final AbstractC20362a<InviteCardDetailInnerResponse> getAsyncDetail() {
        return this.asyncDetail;
    }

    public final AbstractC20362a<AcceptInviteCardResponse> getAsyncJoin() {
        return this.asyncJoin;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final C55371a getGroup() {
        return this.group;
    }

    public GroupInviteState(C55371a aVar, AbstractC20362a<InviteCardDetailInnerResponse> aVar2, AbstractC20362a<AcceptInviteCardResponse> aVar3, boolean z) {
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.group = aVar;
        this.asyncDetail = aVar2;
        this.asyncJoin = aVar3;
        this.close = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupInviteState(C55371a aVar, AbstractC20362a aVar2, AbstractC20362a aVar3, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? C20379aq.f48273a : aVar2, (i & 4) != 0 ? C20379aq.f48273a : aVar3, (i & 8) != 0 ? false : z);
    }
}
