package com.p2082ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo */
public final class SavePhotoStickerInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SavePhotoStickerInfo> CREATOR = new C75244a();
    @AbstractC27891c(mo46611a = "capturedPhotoPaths", mo46612b = {"a"})

    /* renamed from: a */
    private List<String> f169178a;
    @AbstractC27891c(mo46611a = "stickerToast", mo46612b = {"b"})

    /* renamed from: b */
    private final String f169179b;
    @AbstractC27891c(mo46611a = "capturedPhotoDir", mo46612b = {"c"})

    /* renamed from: c */
    private String f169180c;

    static {
        Covode.recordClassIndex(88142);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePhotoStickerInfo copy$default(SavePhotoStickerInfo savePhotoStickerInfo, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savePhotoStickerInfo.f169178a;
        }
        if ((i & 2) != 0) {
            str = savePhotoStickerInfo.f169179b;
        }
        if ((i & 4) != 0) {
            str2 = savePhotoStickerInfo.f169180c;
        }
        return savePhotoStickerInfo.copy(list, str, str2);
    }

    public final List<String> component1() {
        return this.f169178a;
    }

    public final String component2() {
        return this.f169179b;
    }

    public final String component3() {
        return this.f169180c;
    }

    public final SavePhotoStickerInfo copy(List<String> list, String str, String str2) {
        return new SavePhotoStickerInfo(list, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePhotoStickerInfo)) {
            return false;
        }
        SavePhotoStickerInfo savePhotoStickerInfo = (SavePhotoStickerInfo) obj;
        return C89219l.m154714a(this.f169178a, savePhotoStickerInfo.f169178a) && C89219l.m154714a(this.f169179b, savePhotoStickerInfo.f169179b) && C89219l.m154714a(this.f169180c, savePhotoStickerInfo.f169180c);
    }

    public final int hashCode() {
        List<String> list = this.f169178a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f169179b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f169180c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SavePhotoStickerInfo(capturedPhotoPaths=" + this.f169178a + ", stickerToast=" + this.f169179b + ", capturedPhotoDir=" + this.f169180c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeStringList(this.f169178a);
        parcel.writeString(this.f169179b);
        parcel.writeString(this.f169180c);
    }

    public final String getCapturedPhotoDir() {
        return this.f169180c;
    }

    public final List<String> getCapturedPhotoPaths() {
        return this.f169178a;
    }

    public final String getStickerToast() {
        return this.f169179b;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo$a */
    public static class C75244a implements Parcelable.Creator<SavePhotoStickerInfo> {
        static {
            Covode.recordClassIndex(88143);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SavePhotoStickerInfo[] newArray(int i) {
            return new SavePhotoStickerInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SavePhotoStickerInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SavePhotoStickerInfo(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }
    }

    public final void setCapturedPhotoDir(String str) {
        this.f169180c = str;
    }

    public final void setCapturedPhotoPaths(List<String> list) {
        this.f169178a = list;
    }

    public SavePhotoStickerInfo(List<String> list, String str, String str2) {
        this.f169178a = list;
        this.f169179b = str;
        this.f169180c = str2;
    }
}
