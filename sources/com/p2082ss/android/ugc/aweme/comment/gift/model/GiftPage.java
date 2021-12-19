package com.p2082ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.model.GiftPage */
public final class GiftPage {
    @AbstractC27891c(mo46611a = "gifts")
    private final List<GiftStruct> giftList;
    @AbstractC27891c(mo46611a = "page_name")
    private final int pageName;

    static {
        Covode.recordClassIndex(43771);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74248x32f4a425(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.gift.model.GiftPage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftPage copy$default(GiftPage giftPage, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = giftPage.pageName;
        }
        if ((i2 & 2) != 0) {
            list = giftPage.giftList;
        }
        return giftPage.copy(i, list);
    }

    public final int component1() {
        return this.pageName;
    }

    public final List<GiftStruct> component2() {
        return this.giftList;
    }

    public final GiftPage copy(int i, List<GiftStruct> list) {
        return new GiftPage(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPage)) {
            return false;
        }
        GiftPage giftPage = (GiftPage) obj;
        return this.pageName == giftPage.pageName && C89219l.m154714a(this.giftList, giftPage.giftList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m74248x32f4a425(this.pageName) * 31;
        List<GiftStruct> list = this.giftList;
        return com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GiftPage(pageName=" + this.pageName + ", giftList=" + this.giftList + ")";
    }

    public final List<GiftStruct> getGiftList() {
        return this.giftList;
    }

    public final int getPageName() {
        return this.pageName;
    }

    public GiftPage(int i, List<GiftStruct> list) {
        this.pageName = i;
        this.giftList = list;
    }
}
