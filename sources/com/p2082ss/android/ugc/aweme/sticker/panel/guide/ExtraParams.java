package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams */
public class ExtraParams implements Parcelable {
    public static final Parcelable.Creator<ExtraParams> CREATOR = new Parcelable.Creator<ExtraParams>() {
        /* class com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams.C755231 */

        static {
            Covode.recordClassIndex(88447);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExtraParams[] newArray(int i) {
            return new ExtraParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExtraParams createFromParcel(Parcel parcel) {
            return new ExtraParams(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "clickable_open_url")
    private String clickableOpenUrl;
    @AbstractC27891c(mo46611a = "clickable_web_url")
    private String clickableWebUrl;
    @AbstractC27891c(mo46611a = "gif_type")
    int gifType;
    @AbstractC27891c(mo46611a = "interaction_icon")
    String interactionIcon;
    @AbstractC27891c(mo46611a = "interaction_text")
    String interactionText;
    @AbstractC27891c(mo46611a = "interaction_type")
    int interactionType;
    @AbstractC27891c(mo46611a = "interaction_url")
    String interactionUrl;
    @AbstractC27891c(mo46611a = "lottie_type")
    int lottieType;
    @AbstractC27891c(mo46611a = "manual_close")
    int manualClose;

    public int describeContents() {
        return 0;
    }

    public ExtraParams() {
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    static {
        Covode.recordClassIndex(88446);
    }

    public boolean isGifValid() {
        int i = this.gifType;
        if (1 == i || 2 == i) {
            return true;
        }
        return false;
    }

    public boolean isLottieValid() {
        int i = this.lottieType;
        if (1 == i || 2 == i) {
            return true;
        }
        return false;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType != 1 || TextUtils.isEmpty(this.interactionText)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.interactionUrl) || !TextUtils.isEmpty(this.clickableOpenUrl) || !TextUtils.isEmpty(this.clickableWebUrl)) {
            return true;
        }
        return false;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    protected ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
    }
}
