package com.p2082ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.CutSameEditData */
public final class CutSameEditData implements Parcelable {
    public static final Parcelable.Creator<CutSameEditData> CREATOR = new C43216a();
    @AbstractC27891c(mo46611a = "conactFilePath")

    /* renamed from: a */
    public final String f100707a;
    @AbstractC27891c(mo46611a = "conactWorksapceId")

    /* renamed from: b */
    public final String f100708b;
    @AbstractC27891c(mo46611a = "originTextList")

    /* renamed from: c */
    public final List<String> f100709c;
    @AbstractC27891c(mo46611a = "lastTextList")

    /* renamed from: d */
    public final List<String> f100710d;
    @AbstractC27891c(mo46611a = "cutsame_id")

    /* renamed from: e */
    public final String f100711e;
    @AbstractC27891c(mo46611a = "music_id")

    /* renamed from: f */
    public final String f100712f;
    @AbstractC27891c(mo46611a = "src_video_data_list")

    /* renamed from: g */
    public final List<EditVideoSegment> f100713g;
    @AbstractC27891c(mo46611a = "is_h5")

    /* renamed from: h */
    public final boolean f100714h;
    @AbstractC27891c(mo46611a = "open_sdk_share_id")

    /* renamed from: i */
    public final String f100715i;
    @AbstractC27891c(mo46611a = "open_client_key")

    /* renamed from: j */
    public final String f100716j;

    static {
        Covode.recordClassIndex(51403);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameEditData)) {
            return false;
        }
        CutSameEditData cutSameEditData = (CutSameEditData) obj;
        return C89219l.m154714a(this.f100707a, cutSameEditData.f100707a) && C89219l.m154714a(this.f100708b, cutSameEditData.f100708b) && C89219l.m154714a(this.f100709c, cutSameEditData.f100709c) && C89219l.m154714a(this.f100710d, cutSameEditData.f100710d) && C89219l.m154714a(this.f100711e, cutSameEditData.f100711e) && C89219l.m154714a(this.f100712f, cutSameEditData.f100712f) && C89219l.m154714a(this.f100713g, cutSameEditData.f100713g) && this.f100714h == cutSameEditData.f100714h && C89219l.m154714a(this.f100715i, cutSameEditData.f100715i) && C89219l.m154714a(this.f100716j, cutSameEditData.f100716j);
    }

    public final int hashCode() {
        String str = this.f100707a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100708b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f100709c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f100710d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f100711e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f100712f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<EditVideoSegment> list3 = this.f100713g;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z = this.f100714h;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode7 + i2) * 31;
        String str5 = this.f100715i;
        int hashCode8 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f100716j;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "CutSameEditData(conactFilePath=" + this.f100707a + ", conactWorksapceId=" + this.f100708b + ", originTextList=" + this.f100709c + ", lastTextList=" + this.f100710d + ", cutSameMvId=" + this.f100711e + ", musicId=" + this.f100712f + ", videoSegmentDataList=" + this.f100713g + ", isH5From=" + this.f100714h + ", openSdkShareId=" + this.f100715i + ", openClientKey=" + this.f100716j + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f100707a);
        parcel.writeString(this.f100708b);
        parcel.writeStringList(this.f100709c);
        parcel.writeStringList(this.f100710d);
        parcel.writeString(this.f100711e);
        parcel.writeString(this.f100712f);
        List<EditVideoSegment> list = this.f100713g;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EditVideoSegment editVideoSegment : list) {
                parcel.writeParcelable(editVideoSegment, i);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f100714h ? 1 : 0);
        parcel.writeString(this.f100715i);
        parcel.writeString(this.f100716j);
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.CutSameEditData$a */
    public static class C43216a implements Parcelable.Creator<CutSameEditData> {
        static {
            Covode.recordClassIndex(51404);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutSameEditData[] newArray(int i) {
            return new CutSameEditData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutSameEditData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readParcelable(CutSameEditData.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new CutSameEditData(readString, readString2, createStringArrayList, createStringArrayList2, readString3, readString4, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: a */
    public final List<String> mo73447a() {
        List<String> list = this.f100710d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.f100709c;
        if (list2 == null || list2.isEmpty()) {
            return this.f100710d;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.f100710d) {
            if (!this.f100709c.contains(t) && !TextUtils.isEmpty(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public CutSameEditData(String str, String str2, List<String> list, List<String> list2, String str3, String str4, List<EditVideoSegment> list3, boolean z, String str5, String str6) {
        this.f100707a = str;
        this.f100708b = str2;
        this.f100709c = list;
        this.f100710d = list2;
        this.f100711e = str3;
        this.f100712f = str4;
        this.f100713g = list3;
        this.f100714h = z;
        this.f100715i = str5;
        this.f100716j = str6;
    }
}
