package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55373c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse */
public final class AcceptInviteCardResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "error")
    private final C55373c inviteError;
    @AbstractC27891c(mo46611a = "invitee_group_status")
    private final Integer inviteeGroupStatus;

    static {
        Covode.recordClassIndex(63675);
    }

    public AcceptInviteCardResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AcceptInviteCardResponse copy$default(AcceptInviteCardResponse acceptInviteCardResponse, C55373c cVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = acceptInviteCardResponse.inviteError;
        }
        if ((i & 2) != 0) {
            num = acceptInviteCardResponse.inviteeGroupStatus;
        }
        return acceptInviteCardResponse.copy(cVar, num);
    }

    public final C55373c component1() {
        return this.inviteError;
    }

    public final Integer component2() {
        return this.inviteeGroupStatus;
    }

    public final AcceptInviteCardResponse copy(C55373c cVar, Integer num) {
        return new AcceptInviteCardResponse(cVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptInviteCardResponse)) {
            return false;
        }
        AcceptInviteCardResponse acceptInviteCardResponse = (AcceptInviteCardResponse) obj;
        return C89219l.m154714a(this.inviteError, acceptInviteCardResponse.inviteError) && C89219l.m154714a(this.inviteeGroupStatus, acceptInviteCardResponse.inviteeGroupStatus);
    }

    public final int hashCode() {
        C55373c cVar = this.inviteError;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Integer num = this.inviteeGroupStatus;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "AcceptInviteCardResponse(inviteError=" + this.inviteError + ", inviteeGroupStatus=" + this.inviteeGroupStatus + ")";
    }

    public final C55373c getInviteError() {
        return this.inviteError;
    }

    public final Integer getInviteeGroupStatus() {
        return this.inviteeGroupStatus;
    }

    public AcceptInviteCardResponse(C55373c cVar, Integer num) {
        this.inviteError = cVar;
        this.inviteeGroupStatus = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AcceptInviteCardResponse(C55373c cVar, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : num);
    }
}
