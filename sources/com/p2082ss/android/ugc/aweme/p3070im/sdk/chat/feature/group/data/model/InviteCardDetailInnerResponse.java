package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55373c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse */
public final class InviteCardDetailInnerResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "group")
    private final C55371a group;
    @AbstractC27891c(mo46611a = "error")
    private final C55373c inviteError;
    @AbstractC27891c(mo46611a = "invitee_group_status")
    private final Integer inviteeGroupStatus;
    @AbstractC27891c(mo46611a = "inviter_id")
    private final Long inviterId;
    @AbstractC27891c(mo46611a = "inviter_name")
    private final String inviterName;

    static {
        Covode.recordClassIndex(63676);
    }

    public InviteCardDetailInnerResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InviteCardDetailInnerResponse copy$default(InviteCardDetailInnerResponse inviteCardDetailInnerResponse, C55371a aVar, Long l, String str, C55373c cVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = inviteCardDetailInnerResponse.group;
        }
        if ((i & 2) != 0) {
            l = inviteCardDetailInnerResponse.inviterId;
        }
        if ((i & 4) != 0) {
            str = inviteCardDetailInnerResponse.inviterName;
        }
        if ((i & 8) != 0) {
            cVar = inviteCardDetailInnerResponse.inviteError;
        }
        if ((i & 16) != 0) {
            num = inviteCardDetailInnerResponse.inviteeGroupStatus;
        }
        return inviteCardDetailInnerResponse.copy(aVar, l, str, cVar, num);
    }

    public final C55371a component1() {
        return this.group;
    }

    public final Long component2() {
        return this.inviterId;
    }

    public final String component3() {
        return this.inviterName;
    }

    public final C55373c component4() {
        return this.inviteError;
    }

    public final Integer component5() {
        return this.inviteeGroupStatus;
    }

    public final InviteCardDetailInnerResponse copy(C55371a aVar, Long l, String str, C55373c cVar, Integer num) {
        return new InviteCardDetailInnerResponse(aVar, l, str, cVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteCardDetailInnerResponse)) {
            return false;
        }
        InviteCardDetailInnerResponse inviteCardDetailInnerResponse = (InviteCardDetailInnerResponse) obj;
        return C89219l.m154714a(this.group, inviteCardDetailInnerResponse.group) && C89219l.m154714a(this.inviterId, inviteCardDetailInnerResponse.inviterId) && C89219l.m154714a(this.inviterName, inviteCardDetailInnerResponse.inviterName) && C89219l.m154714a(this.inviteError, inviteCardDetailInnerResponse.inviteError) && C89219l.m154714a(this.inviteeGroupStatus, inviteCardDetailInnerResponse.inviteeGroupStatus);
    }

    public final int hashCode() {
        C55371a aVar = this.group;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Long l = this.inviterId;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.inviterName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C55373c cVar = this.inviteError;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Integer num = this.inviteeGroupStatus;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteCardDetailInnerResponse(group=" + this.group + ", inviterId=" + this.inviterId + ", inviterName=" + this.inviterName + ", inviteError=" + this.inviteError + ", inviteeGroupStatus=" + this.inviteeGroupStatus + ")";
    }

    public final C55371a getGroup() {
        return this.group;
    }

    public final C55373c getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public final Long getInviterId() {
        return this.inviterId;
    }

    public final String getInviterName() {
        return this.inviterName;
    }

    public InviteCardDetailInnerResponse(C55371a aVar, Long l, String str, C55373c cVar, Integer num) {
        this.group = aVar;
        this.inviterId = l;
        this.inviterName = str;
        this.inviteError = cVar;
        this.inviteeGroupStatus = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InviteCardDetailInnerResponse(C55371a aVar, Long l, String str, C55373c cVar, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : cVar, (i & 16) == 0 ? num : null);
    }
}
