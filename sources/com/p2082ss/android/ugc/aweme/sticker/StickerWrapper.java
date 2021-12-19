package com.p2082ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.StickerWrapper */
public class StickerWrapper implements Parcelable {
    public static final Parcelable.Creator<StickerWrapper> CREATOR = new Parcelable.Creator<StickerWrapper>() {
        /* class com.p2082ss.android.ugc.aweme.sticker.StickerWrapper.C752461 */

        static {
            Covode.recordClassIndex(88148);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerWrapper[] newArray(int i) {
            return new StickerWrapper[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerWrapper createFromParcel(Parcel parcel) {
            return new StickerWrapper(parcel);
        }
    };

    /* renamed from: a */
    public Effect f169181a;

    /* renamed from: b */
    public String f169182b;

    /* renamed from: c */
    public int f169183c;

    /* renamed from: d */
    public boolean f169184d;

    /* renamed from: e */
    public int f169185e;

    /* renamed from: f */
    public boolean f169186f;

    /* renamed from: g */
    public boolean f169187g;

    public int describeContents() {
        return 0;
    }

    public StickerWrapper() {
    }

    public int hashCode() {
        return super.hashCode();
    }

    static {
        Covode.recordClassIndex(88147);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f169181a.equals(((StickerWrapper) obj).f169181a);
    }

    protected StickerWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f169181a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f169182b = parcel.readString();
        this.f169183c = parcel.readInt();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f169184d = z;
        this.f169185e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f169186f = z2;
        this.f169187g = parcel.readByte() == 0 ? false : z3;
    }

    public StickerWrapper(Effect effect, String str) {
        this.f169181a = effect;
        this.f169182b = str;
        this.f169183c = 3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f169181a, i);
        parcel.writeString(this.f169182b);
        parcel.writeInt(this.f169183c);
        parcel.writeByte(this.f169184d ? (byte) 1 : 0);
        parcel.writeInt(this.f169185e);
        parcel.writeByte(this.f169186f ? (byte) 1 : 0);
        parcel.writeByte(this.f169187g ? (byte) 1 : 0);
    }
}
