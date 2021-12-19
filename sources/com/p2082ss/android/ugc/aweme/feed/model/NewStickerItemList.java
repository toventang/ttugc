package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewStickerItemList */
public final class NewStickerItemList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "effect")
    public List<NewFaceSticker> stickers;

    static {
        Covode.recordClassIndex(58738);
    }

    public NewStickerItemList() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93184x3a6ad2e6(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93185x3a6ad2e6(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.NewStickerItemList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewStickerItemList copy$default(NewStickerItemList newStickerItemList, long j, int i, List list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = newStickerItemList.cursor;
        }
        if ((i2 & 2) != 0) {
            i = newStickerItemList.hasMore;
        }
        if ((i2 & 4) != 0) {
            list = newStickerItemList.stickers;
        }
        if ((i2 & 8) != 0) {
            logPbBean = newStickerItemList.logPb;
        }
        return newStickerItemList.copy(j, i, list, logPbBean);
    }

    public final NewStickerItemList copy(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        return new NewStickerItemList(j, i, list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewStickerItemList)) {
            return false;
        }
        NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
        return this.cursor == newStickerItemList.cursor && this.hasMore == newStickerItemList.hasMore && C89219l.m154714a(this.stickers, newStickerItemList.stickers) && C89219l.m154714a(this.logPb, newStickerItemList.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93185x3a6ad2e6(this.cursor) * 31) + m93184x3a6ad2e6(this.hasMore)) * 31;
        List<NewFaceSticker> list = this.stickers;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_NewStickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NewStickerItemList(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", stickers=" + this.stickers + ", logPb=" + this.logPb + ")";
    }

    public NewStickerItemList(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        this.cursor = j;
        this.hasMore = i;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewStickerItemList(long j, int i, List list, LogPbBean logPbBean, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list, (i2 & 8) == 0 ? logPbBean : null);
    }
}
