package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo */
public final class CustomStickerInfo implements Parcelable {
    public static final Parcelable.Creator<CustomStickerInfo> CREATOR = new C56716a();

    /* renamed from: a */
    public final String f129264a;

    /* renamed from: b */
    public final String f129265b;

    /* renamed from: c */
    public final int f129266c;

    /* renamed from: d */
    public final int f129267d;

    /* renamed from: e */
    public final boolean f129268e;

    /* renamed from: f */
    private final AbstractC89244h f129269f = C89250i.m154773a((AbstractC89171a) new C56717b(this));

    static {
        Covode.recordClassIndex(66575);
    }

    /* renamed from: a */
    public final HashMap<String, String> mo93663a() {
        return (HashMap) this.f129269f.getValue();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerInfo)) {
            return false;
        }
        CustomStickerInfo customStickerInfo = (CustomStickerInfo) obj;
        return C89219l.m154714a(this.f129264a, customStickerInfo.f129264a) && C89219l.m154714a(this.f129265b, customStickerInfo.f129265b) && this.f129266c == customStickerInfo.f129266c && this.f129267d == customStickerInfo.f129267d && this.f129268e == customStickerInfo.f129268e;
    }

    public final int hashCode() {
        String str = this.f129264a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129265b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (((((hashCode + i) * 31) + this.f129266c) * 31) + this.f129267d) * 31;
        boolean z = this.f129268e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "CustomStickerInfo(stickerId=" + this.f129264a + ", path=" + this.f129265b + ", width=" + this.f129266c + ", height=" + this.f129267d + ", cutout=" + this.f129268e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f129264a);
        parcel.writeString(this.f129265b);
        parcel.writeInt(this.f129266c);
        parcel.writeInt(this.f129267d);
        parcel.writeInt(this.f129268e ? 1 : 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo$a */
    public static class C56716a implements Parcelable.Creator<CustomStickerInfo> {
        static {
            Covode.recordClassIndex(66576);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustomStickerInfo[] newArray(int i) {
            return new CustomStickerInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomStickerInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CustomStickerInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo$b */
    static final class C56717b extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ CustomStickerInfo f129270a;

        static {
            Covode.recordClassIndex(66577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56717b(CustomStickerInfo customStickerInfo) {
            super(0);
            this.f129270a = customStickerInfo;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            String str = this.f129270a.f129264a;
            if (str == null) {
                str = "";
            }
            hashMap.put("stickerId", str);
            hashMap.put("path", this.f129270a.f129265b);
            hashMap.put("width", String.valueOf(this.f129270a.f129266c));
            hashMap.put("height", String.valueOf(this.f129270a.f129267d));
            hashMap.put("cutout", String.valueOf(this.f129270a.f129268e));
            return hashMap;
        }
    }

    public CustomStickerInfo(String str, String str2, int i, int i2, boolean z) {
        C89219l.m154721d(str2, "");
        this.f129264a = str;
        this.f129265b = str2;
        this.f129266c = i;
        this.f129267d = i2;
        this.f129268e = z;
    }
}
