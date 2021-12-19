package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CaptionModel */
public final class CaptionModel implements Serializable {
    @AbstractC27891c(mo46611a = "caption_infos")
    public List<CaptionItemModel> captionList;
    @AbstractC27891c(mo46611a = "enable_auto_caption")
    public int enableAutoCaption;
    @AbstractC27891c(mo46611a = "has_original_audio")
    public int hasOriginalAudio;
    @AbstractC27891c(mo46611a = "original_language_info")
    public CaptionLanguage originalCaptionLanguage;

    static {
        Covode.recordClassIndex(58663);
    }

    public CaptionModel() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93174x2a72ffdb(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.CaptionModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionModel copy$default(CaptionModel captionModel, int i, int i2, CaptionLanguage captionLanguage, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = captionModel.hasOriginalAudio;
        }
        if ((i3 & 2) != 0) {
            i2 = captionModel.enableAutoCaption;
        }
        if ((i3 & 4) != 0) {
            captionLanguage = captionModel.originalCaptionLanguage;
        }
        if ((i3 & 8) != 0) {
            list = captionModel.captionList;
        }
        return captionModel.copy(i, i2, captionLanguage, list);
    }

    public final int component1() {
        return this.hasOriginalAudio;
    }

    public final int component2() {
        return this.enableAutoCaption;
    }

    public final CaptionLanguage component3() {
        return this.originalCaptionLanguage;
    }

    public final List<CaptionItemModel> component4() {
        return this.captionList;
    }

    public final CaptionModel copy(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list) {
        return new CaptionModel(i, i2, captionLanguage, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionModel)) {
            return false;
        }
        CaptionModel captionModel = (CaptionModel) obj;
        return this.hasOriginalAudio == captionModel.hasOriginalAudio && this.enableAutoCaption == captionModel.enableAutoCaption && C89219l.m154714a(this.originalCaptionLanguage, captionModel.originalCaptionLanguage) && C89219l.m154714a(this.captionList, captionModel.captionList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m93174x2a72ffdb(this.hasOriginalAudio) * 31) + m93174x2a72ffdb(this.enableAutoCaption)) * 31;
        CaptionLanguage captionLanguage = this.originalCaptionLanguage;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_CaptionModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (captionLanguage != null ? captionLanguage.hashCode() : 0)) * 31;
        List<CaptionItemModel> list = this.captionList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CaptionModel(hasOriginalAudio=" + this.hasOriginalAudio + ", enableAutoCaption=" + this.enableAutoCaption + ", originalCaptionLanguage=" + this.originalCaptionLanguage + ", captionList=" + this.captionList + ")";
    }

    public final List<CaptionItemModel> getCaptionList() {
        return this.captionList;
    }

    public final int getEnableAutoCaption() {
        return this.enableAutoCaption;
    }

    public final int getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    public final CaptionLanguage getOriginalCaptionLanguage() {
        return this.originalCaptionLanguage;
    }

    public CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list) {
        this.hasOriginalAudio = i;
        this.enableAutoCaption = i2;
        this.originalCaptionLanguage = captionLanguage;
        this.captionList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List list, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : captionLanguage, (i3 & 8) != 0 ? null : list);
    }
}
