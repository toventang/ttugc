package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.InfoStickerListModel */
public final class InfoStickerListModel {
    private Integer cursor;
    private String extra;
    private Boolean has_more;
    private List<InfoStickerEffect> sticker_list;
    private String subtitle;

    static {
        Covode.recordClassIndex(102587);
    }

    public InfoStickerListModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.InfoStickerListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfoStickerListModel copy$default(InfoStickerListModel infoStickerListModel, String str, Integer num, Boolean bool, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoStickerListModel.subtitle;
        }
        if ((i & 2) != 0) {
            num = infoStickerListModel.cursor;
        }
        if ((i & 4) != 0) {
            bool = infoStickerListModel.has_more;
        }
        if ((i & 8) != 0) {
            list = infoStickerListModel.sticker_list;
        }
        if ((i & 16) != 0) {
            str2 = infoStickerListModel.extra;
        }
        return infoStickerListModel.copy(str, num, bool, list, str2);
    }

    public final String component1() {
        return this.subtitle;
    }

    public final Integer component2() {
        return this.cursor;
    }

    public final Boolean component3() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> component4() {
        return this.sticker_list;
    }

    public final String component5() {
        return this.extra;
    }

    public final InfoStickerListModel copy(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        return new InfoStickerListModel(str, num, bool, list, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListModel)) {
            return false;
        }
        InfoStickerListModel infoStickerListModel = (InfoStickerListModel) obj;
        return C89219l.m154714a(this.subtitle, infoStickerListModel.subtitle) && C89219l.m154714a(this.cursor, infoStickerListModel.cursor) && C89219l.m154714a(this.has_more, infoStickerListModel.has_more) && C89219l.m154714a(this.sticker_list, infoStickerListModel.sticker_list) && C89219l.m154714a(this.extra, infoStickerListModel.extra);
    }

    public final int hashCode() {
        String str = this.subtitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.cursor;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.has_more;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list = this.sticker_list;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.extra;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "InfoStickerListModel(subtitle=" + this.subtitle + ", cursor=" + this.cursor + ", has_more=" + this.has_more + ", sticker_list=" + this.sticker_list + ", extra=" + this.extra + ")";
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getHas_more() {
        return this.has_more;
    }

    public final List<InfoStickerEffect> getSticker_list() {
        return this.sticker_list;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setSticker_list(List<InfoStickerEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public InfoStickerListModel(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        this.subtitle = str;
        this.cursor = num;
        this.has_more = bool;
        this.sticker_list = list;
        this.extra = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoStickerListModel(String str, Integer num, Boolean bool, List list, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list, (i & 16) == 0 ? str2 : null);
    }
}
