package com.p2082ss.android.ugc.aweme.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.preload.PreloadExtraInfo */
public class PreloadExtraInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.p2082ss.android.ugc.aweme.preload.PreloadExtraInfo.C633101 */

        static {
            Covode.recordClassIndex(74593);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PreloadExtraInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PreloadExtraInfo(parcel);
        }
    };

    /* renamed from: a */
    public final String f143696a;

    /* renamed from: b */
    public final String f143697b;

    /* renamed from: c */
    public final String f143698c;

    /* renamed from: d */
    public final int f143699d;

    /* renamed from: e */
    public List<String> f143700e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(74592);
    }

    public PreloadExtraInfo(Parcel parcel) {
        this.f143696a = parcel.readString();
        this.f143697b = parcel.readString();
        this.f143698c = parcel.readString();
        this.f143699d = parcel.readInt();
        parcel.readStringList(this.f143700e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f143696a);
        parcel.writeString(this.f143697b);
        parcel.writeString(this.f143698c);
        parcel.writeInt(this.f143699d);
        parcel.writeStringList(this.f143700e);
    }

    public PreloadExtraInfo(String str, String str2, String str3, int i, List<String> list) {
        this.f143696a = str;
        this.f143697b = str2;
        this.f143698c = str3;
        this.f143699d = i;
        this.f143700e = list;
    }
}
