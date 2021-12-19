package com.p2082ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.PlDataBean */
public final class PlDataBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<PlDataBean> CREATOR = new C75243a();
    @AbstractC27891c(mo46611a = "alg")

    /* renamed from: a */
    private ArrayList<String> f169168a;
    @AbstractC27891c(mo46611a = "relation")

    /* renamed from: b */
    private String f169169b;
    @AbstractC27891c(mo46611a = "imgK")

    /* renamed from: c */
    private String f169170c;
    @AbstractC27891c(mo46611a = "loading")

    /* renamed from: d */
    private boolean f169171d;
    @AbstractC27891c(mo46611a = "guide")

    /* renamed from: e */
    private boolean f169172e;
    @AbstractC27891c(mo46611a = "albumFilter")

    /* renamed from: f */
    private int f169173f;
    @AbstractC27891c(mo46611a = "face_count_min")

    /* renamed from: g */
    private int f169174g;
    @AbstractC27891c(mo46611a = "face_count_max")

    /* renamed from: h */
    private int f169175h;
    @AbstractC27891c(mo46611a = "min_count")

    /* renamed from: i */
    private int f169176i;
    @AbstractC27891c(mo46611a = "max_count")

    /* renamed from: j */
    private int f169177j;

    static {
        Covode.recordClassIndex(88140);
    }

    public PlDataBean() {
        this(null, null, null, false, false, 0, 0, 0, 0, 0, 1023, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        ArrayList<String> arrayList = this.f169168a;
        parcel.writeInt(arrayList.size());
        for (String str : arrayList) {
            parcel.writeString(str);
        }
        parcel.writeString(this.f169169b);
        parcel.writeString(this.f169170c);
        parcel.writeInt(this.f169171d ? 1 : 0);
        parcel.writeInt(this.f169172e ? 1 : 0);
        parcel.writeInt(this.f169173f);
        parcel.writeInt(this.f169174g);
        parcel.writeInt(this.f169175h);
        parcel.writeInt(this.f169176i);
        parcel.writeInt(this.f169177j);
    }

    public final int getAlbumFilter() {
        return this.f169173f;
    }

    public final ArrayList<String> getAlg() {
        return this.f169168a;
    }

    public final int getFaceCountMax() {
        return this.f169175h;
    }

    public final int getFaceCountMin() {
        return this.f169174g;
    }

    public final boolean getGuide() {
        return this.f169172e;
    }

    public final String getImgK() {
        return this.f169170c;
    }

    public final boolean getLoading() {
        return this.f169171d;
    }

    public final int getMaxCount() {
        return this.f169177j;
    }

    public final int getMinCount() {
        return this.f169176i;
    }

    public final String getRelation() {
        return this.f169169b;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.PlDataBean$a */
    public static class C75243a implements Parcelable.Creator<PlDataBean> {
        static {
            Covode.recordClassIndex(88141);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlDataBean[] newArray(int i) {
            return new PlDataBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlDataBean createFromParcel(Parcel parcel) {
            String readString;
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (true) {
                readString = parcel.readString();
                if (readInt == 0) {
                    break;
                }
                arrayList.add(readString);
                readInt--;
            }
            String readString2 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new PlDataBean(arrayList, readString, readString2, z2, z, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public final void setAlbumFilter(int i) {
        this.f169173f = i;
    }

    public final void setFaceCountMax(int i) {
        this.f169175h = i;
    }

    public final void setFaceCountMin(int i) {
        this.f169174g = i;
    }

    public final void setGuide(boolean z) {
        this.f169172e = z;
    }

    public final void setImgK(String str) {
        this.f169170c = str;
    }

    public final void setLoading(boolean z) {
        this.f169171d = z;
    }

    public final void setMaxCount(int i) {
        this.f169177j = i;
    }

    public final void setMinCount(int i) {
        this.f169176i = i;
    }

    public final void setRelation(String str) {
        this.f169169b = str;
    }

    public final void setAlg(ArrayList<String> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.f169168a = arrayList;
    }

    public PlDataBean(ArrayList<String> arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(arrayList, "");
        this.f169168a = arrayList;
        this.f169169b = str;
        this.f169170c = str2;
        this.f169171d = z;
        this.f169172e = z2;
        this.f169173f = i;
        this.f169174g = i2;
        this.f169175h = i3;
        this.f169176i = i4;
        this.f169177j = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlDataBean(ArrayList arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? new ArrayList() : arrayList, (i6 & 2) != 0 ? null : str, (i6 & 4) == 0 ? str2 : null, (i6 & 8) != 0 ? true : z, (i6 & 16) == 0 ? z2 : true, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 2 : i2, (i6 & 128) != 0 ? 5 : i3, (i6 & 256) != 0 ? -1 : i4, (i6 & 512) == 0 ? i5 : -1);
    }
}
