package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo */
public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStructInfo> CREATOR = new Parcelable.Creator<ShopOrderShareStructInfo>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo.C707771 */

        static {
            Covode.recordClassIndex(83259);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShopOrderShareStructInfo[] newArray(int i) {
            return new ShopOrderShareStructInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShopOrderShareStructInfo createFromParcel(Parcel parcel) {
            return new ShopOrderShareStructInfo(parcel);
        }
    };

    /* renamed from: a */
    ShopOrderShareStruct f158461a;

    /* renamed from: b */
    String f158462b;

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStructInfo() {
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.f158461a;
    }

    public String getTitle() {
        return this.f158462b;
    }

    static {
        Covode.recordClassIndex(83258);
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct) {
        this.f158461a = shopOrderShareStruct;
    }

    public void setTitle(String str) {
        this.f158462b = str;
    }

    protected ShopOrderShareStructInfo(Parcel parcel) {
        this.f158461a = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.f158462b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f158461a, i);
        parcel.writeString(this.f158462b);
    }
}
