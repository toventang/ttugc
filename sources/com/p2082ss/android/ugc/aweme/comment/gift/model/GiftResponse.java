package com.p2082ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftResponse */
public final class GiftResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    private final GiftResult giftPageList;

    static {
        Covode.recordClassIndex(43772);
    }

    public static /* synthetic */ GiftResponse copy$default(GiftResponse giftResponse, GiftResult giftResult, int i, Object obj) {
        if ((i & 1) != 0) {
            giftResult = giftResponse.giftPageList;
        }
        return giftResponse.copy(giftResult);
    }

    public final GiftResult component1() {
        return this.giftPageList;
    }

    public final GiftResponse copy(GiftResult giftResult) {
        return new GiftResponse(giftResult);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GiftResponse) && C89219l.m154714a(this.giftPageList, ((GiftResponse) obj).giftPageList);
        }
        return true;
    }

    public final int hashCode() {
        GiftResult giftResult = this.giftPageList;
        if (giftResult != null) {
            return giftResult.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GiftResponse(giftPageList=" + this.giftPageList + ")";
    }

    public final GiftResult getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResponse(GiftResult giftResult) {
        this.giftPageList = giftResult;
    }
}
