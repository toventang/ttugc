package com.bytedance.android.live.base.model.emoji;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class EmoteModel extends C2972a implements Parcelable {
    public static final Parcelable.Creator<EmoteModel> CREATOR = new Parcelable.Creator<EmoteModel>() {
        /* class com.bytedance.android.live.base.model.emoji.EmoteModel.C29711 */

        static {
            Covode.recordClassIndex(3417);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EmoteModel[] newArray(int i) {
            return new EmoteModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EmoteModel createFromParcel(Parcel parcel) {
            return new EmoteModel(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "emote_id")

    /* renamed from: g */
    public String f8727g;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: h */
    public ImageModel f8728h;
    @AbstractC27891c(mo46611a = "audit_status")

    /* renamed from: i */
    public int f8729i;
    @AbstractC27891c(mo46611a = "uuid")

    /* renamed from: j */
    public String f8730j;

    /* renamed from: k */
    public boolean f8731k = true;

    /* renamed from: l */
    public boolean f8732l;

    /* renamed from: m */
    public Drawable f8733m;

    public int describeContents() {
        return 0;
    }

    public EmoteModel() {
    }

    static {
        Covode.recordClassIndex(3416);
    }

    protected EmoteModel(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f8727g = parcel.readString();
        this.f8728h = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.f8729i = parcel.readInt();
        this.f8730j = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8731k = z;
        this.f8732l = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8727g);
        parcel.writeParcelable(this.f8728h, i);
        parcel.writeInt(this.f8729i);
        parcel.writeString(this.f8730j);
        parcel.writeByte(this.f8731k ? (byte) 1 : 0);
        parcel.writeByte(this.f8732l ? (byte) 1 : 0);
    }
}
