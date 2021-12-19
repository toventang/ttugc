package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData */
public final class ShootExtraData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShootExtraData> CREATOR = new Creator();
    @AbstractC27891c(mo46611a = "from_banner_id")
    private String fromBannerId;
    @AbstractC27891c(mo46611a = "is_bundled")
    private Integer isBundled;
    @AbstractC27891c(mo46611a = "shoot_enter_from")
    private String shootEnterFrom;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData$Creator */
    public static class Creator implements Parcelable.Creator<ShootExtraData> {
        static {
            Covode.recordClassIndex(84616);
        }

        @Override // android.os.Parcelable.Creator
        public final ShootExtraData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ShootExtraData(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShootExtraData[] newArray(int i) {
            return new ShootExtraData[i];
        }
    }

    static {
        Covode.recordClassIndex(84615);
    }

    public ShootExtraData() {
        this(null, null, null, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.fromBannerId);
        Integer num = this.isBundled;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final String getFromBannerId() {
        return this.fromBannerId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setFromBannerId(String str) {
        this.fromBannerId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public ShootExtraData(String str, String str2, Integer num) {
        this.shootEnterFrom = str;
        this.fromBannerId = str2;
        this.isBundled = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShootExtraData(String str, String str2, Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num);
    }
}
