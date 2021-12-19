package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AdInteractionData */
public final class AdInteractionData implements Serializable {
    @AbstractC27891c(mo46611a = "gesture_guidance")
    private AdGestureGuidance gestureGuidance;
    @AbstractC27891c(mo46611a = "interaction_type")
    private int interactionType;
    @AbstractC27891c(mo46611a = "music")
    private UrlModel music;
    @AbstractC27891c(mo46611a = "popup_image")
    private UrlModel popupImage;

    static {
        Covode.recordClassIndex(58595);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93156x2529b3f1(int i) {
        return i;
    }

    public static /* synthetic */ AdInteractionData copy$default(AdInteractionData adInteractionData, int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adInteractionData.interactionType;
        }
        if ((i2 & 2) != 0) {
            adGestureGuidance = adInteractionData.gestureGuidance;
        }
        if ((i2 & 4) != 0) {
            urlModel = adInteractionData.popupImage;
        }
        if ((i2 & 8) != 0) {
            urlModel2 = adInteractionData.music;
        }
        return adInteractionData.copy(i, adGestureGuidance, urlModel, urlModel2);
    }

    public final int component1() {
        return this.interactionType;
    }

    public final AdGestureGuidance component2() {
        return this.gestureGuidance;
    }

    public final UrlModel component3() {
        return this.popupImage;
    }

    public final UrlModel component4() {
        return this.music;
    }

    public final AdInteractionData copy(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        return new AdInteractionData(i, adGestureGuidance, urlModel, urlModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInteractionData)) {
            return false;
        }
        AdInteractionData adInteractionData = (AdInteractionData) obj;
        return this.interactionType == adInteractionData.interactionType && C89219l.m154714a(this.gestureGuidance, adInteractionData.gestureGuidance) && C89219l.m154714a(this.popupImage, adInteractionData.popupImage) && C89219l.m154714a(this.music, adInteractionData.music);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m93156x2529b3f1(this.interactionType) * 31;
        AdGestureGuidance adGestureGuidance = this.gestureGuidance;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AdInteractionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (adGestureGuidance != null ? adGestureGuidance.hashCode() : 0)) * 31;
        UrlModel urlModel = this.popupImage;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.music;
        if (urlModel2 != null) {
            i = urlModel2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AdInteractionData(interactionType=" + this.interactionType + ", gestureGuidance=" + this.gestureGuidance + ", popupImage=" + this.popupImage + ", music=" + this.music + ")";
    }

    public final AdGestureGuidance getGestureGuidance() {
        return this.gestureGuidance;
    }

    public final int getInteractionType() {
        return this.interactionType;
    }

    public final UrlModel getMusic() {
        return this.music;
    }

    public final UrlModel getPopupImage() {
        return this.popupImage;
    }

    public final void setGestureGuidance(AdGestureGuidance adGestureGuidance) {
        this.gestureGuidance = adGestureGuidance;
    }

    public final void setInteractionType(int i) {
        this.interactionType = i;
    }

    public final void setMusic(UrlModel urlModel) {
        this.music = urlModel;
    }

    public final void setPopupImage(UrlModel urlModel) {
        this.popupImage = urlModel;
    }

    public AdInteractionData(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2) {
        this.interactionType = i;
        this.gestureGuidance = adGestureGuidance;
        this.popupImage = urlModel;
        this.music = urlModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdInteractionData(int i, AdGestureGuidance adGestureGuidance, UrlModel urlModel, UrlModel urlModel2, int i2, C89214g gVar) {
        this(i, (i2 & 2) != 0 ? null : adGestureGuidance, (i2 & 4) != 0 ? null : urlModel, (i2 & 8) != 0 ? null : urlModel2);
    }
}
