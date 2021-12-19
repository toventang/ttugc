package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct */
public class ShopOrderShareStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStruct> CREATOR = new Parcelable.Creator<ShopOrderShareStruct>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct.C707761 */

        static {
            Covode.recordClassIndex(83257);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShopOrderShareStruct[] newArray(int i) {
            return new ShopOrderShareStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShopOrderShareStruct createFromParcel(Parcel parcel) {
            return new ShopOrderShareStruct(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "origin_item_id")
    private String originItemId;
    @AbstractC27891c(mo46611a = "origin_user_id")
    private String originUserId;
    @AbstractC27891c(mo46611a = "promotion_id")
    private String promotionId;

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStruct() {
    }

    public String getOriginItemId() {
        return this.originItemId;
    }

    public String getOriginUserId() {
        return this.originUserId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    static {
        Covode.recordClassIndex(83256);
    }

    public void setOriginItemId(String str) {
        this.originItemId = str;
    }

    public void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    protected ShopOrderShareStruct(Parcel parcel) {
        this.originUserId = parcel.readString();
        this.originItemId = parcel.readString();
        this.promotionId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originUserId);
        parcel.writeString(this.originItemId);
        parcel.writeString(this.promotionId);
    }
}
