package com.p2082ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean */
public class FaceStickerCommerceBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerCommerceBean> CREATOR = new Parcelable.Creator<FaceStickerCommerceBean>() {
        /* class com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean.C754381 */

        static {
            Covode.recordClassIndex(88359);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceStickerCommerceBean[] newArray(int i) {
            return new FaceStickerCommerceBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceStickerCommerceBean createFromParcel(Parcel parcel) {
            return new FaceStickerCommerceBean(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "commerce_sticker_web_url")

    /* renamed from: a */
    public String f169518a;
    @AbstractC27891c(mo46611a = "commerce_sticker_open_url")

    /* renamed from: b */
    public String f169519b;
    @AbstractC27891c(mo46611a = "commerce_sticker_buy_text")

    /* renamed from: c */
    public String f169520c;
    @AbstractC27891c(mo46611a = "commerce_sticker_type")

    /* renamed from: d */
    public int f169521d;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(88358);
    }

    protected FaceStickerCommerceBean(Parcel parcel) {
        this.f169518a = parcel.readString();
        this.f169519b = parcel.readString();
        this.f169520c = parcel.readString();
        this.f169521d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f169518a);
        parcel.writeString(this.f169519b);
        parcel.writeString(this.f169520c);
        parcel.writeInt(this.f169521d);
    }
}
