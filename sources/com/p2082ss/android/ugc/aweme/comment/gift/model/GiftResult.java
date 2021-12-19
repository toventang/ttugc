package com.p2082ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftResult */
public final class GiftResult {
    @AbstractC27891c(mo46611a = "pages")
    private final List<GiftPage> giftPageList;

    static {
        Covode.recordClassIndex(43773);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.gift.model.GiftResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftResult copy$default(GiftResult giftResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftResult.giftPageList;
        }
        return giftResult.copy(list);
    }

    public final List<GiftPage> component1() {
        return this.giftPageList;
    }

    public final GiftResult copy(List<GiftPage> list) {
        return new GiftResult(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GiftResult) && C89219l.m154714a(this.giftPageList, ((GiftResult) obj).giftPageList);
        }
        return true;
    }

    public final int hashCode() {
        List<GiftPage> list = this.giftPageList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiftResult(giftPageList=" + this.giftPageList + ")";
    }

    public final List<GiftPage> getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResult(List<GiftPage> list) {
        this.giftPageList = list;
    }
}
