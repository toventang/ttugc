package com.p2082ss.android.ugc.aweme.profile.effect;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.StickerItemList */
public final class StickerItemList extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")
    private final int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    private final boolean hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;
    @AbstractC27891c(mo46611a = "effect")
    private final List<C75445g> stickers;

    static {
        Covode.recordClassIndex(75024);
    }

    public StickerItemList() {
        this(0, false, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_effect_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115230x8707ca85(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.profile.effect.StickerItemList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerItemList copy$default(StickerItemList stickerItemList, int i, boolean z, List list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stickerItemList.cursor;
        }
        if ((i2 & 2) != 0) {
            z = stickerItemList.hasMore;
        }
        if ((i2 & 4) != 0) {
            list = stickerItemList.stickers;
        }
        if ((i2 & 8) != 0) {
            logPbBean = stickerItemList.logPb;
        }
        return stickerItemList.copy(i, z, list, logPbBean);
    }

    public final int component1() {
        return this.cursor;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final List<C75445g> component3() {
        return this.stickers;
    }

    public final LogPbBean component4() {
        return this.logPb;
    }

    public final StickerItemList copy(int i, boolean z, List<? extends C75445g> list, LogPbBean logPbBean) {
        C89219l.m154721d(list, "");
        return new StickerItemList(i, z, list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemList)) {
            return false;
        }
        StickerItemList stickerItemList = (StickerItemList) obj;
        return this.cursor == stickerItemList.cursor && this.hasMore == stickerItemList.hasMore && C89219l.m154714a(this.stickers, stickerItemList.stickers) && C89219l.m154714a(this.logPb, stickerItemList.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_profile_effect_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m115230x8707ca85(this.cursor) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (com_ss_android_ugc_aweme_profile_effect_StickerItemList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31;
        List<C75445g> list = this.stickers;
        int i5 = 0;
        int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i5 = logPbBean.hashCode();
        }
        return hashCode + i5;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StickerItemList(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", stickers=" + this.stickers + ", logPb=" + this.logPb + ")";
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<C75445g> getStickers() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.model.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public StickerItemList(int i, boolean z, List<? extends C75445g> list, LogPbBean logPbBean) {
        C89219l.m154721d(list, "");
        this.cursor = i;
        this.hasMore = z;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerItemList(int i, boolean z, List list, LogPbBean logPbBean, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C89086z.INSTANCE : list, (i2 & 8) != 0 ? null : logPbBean);
    }
}
