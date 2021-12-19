package com.p2082ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct */
public final class DuetStickerUserStruct implements Parcelable {
    public static final Parcelable.Creator<DuetStickerUserStruct> CREATOR = new C75304a();
    @AbstractC27891c(mo46611a = "nick_name")

    /* renamed from: a */
    public final String f169294a;
    @AbstractC27891c(mo46611a = "user_name")

    /* renamed from: b */
    public final String f169295b;
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: c */
    public final UrlModel f169296c;
    @AbstractC27891c(mo46611a = "sec_uid")

    /* renamed from: d */
    public final String f169297d;
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: e */
    public final String f169298e;

    static {
        Covode.recordClassIndex(88211);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetStickerUserStruct)) {
            return false;
        }
        DuetStickerUserStruct duetStickerUserStruct = (DuetStickerUserStruct) obj;
        return C89219l.m154714a(this.f169294a, duetStickerUserStruct.f169294a) && C89219l.m154714a(this.f169295b, duetStickerUserStruct.f169295b) && C89219l.m154714a(this.f169296c, duetStickerUserStruct.f169296c) && C89219l.m154714a(this.f169297d, duetStickerUserStruct.f169297d) && C89219l.m154714a(this.f169298e, duetStickerUserStruct.f169298e);
    }

    public final int hashCode() {
        String str = this.f169294a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f169295b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f169296c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f169297d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f169298e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "DuetStickerUserStruct(nickName=" + this.f169294a + ", userName=" + this.f169295b + ", avatarUrl=" + this.f169296c + ", secUid=" + this.f169297d + ", uid=" + this.f169298e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f169294a);
        parcel.writeString(this.f169295b);
        parcel.writeSerializable(this.f169296c);
        parcel.writeString(this.f169297d);
        parcel.writeString(this.f169298e);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct$a */
    public static class C75304a implements Parcelable.Creator<DuetStickerUserStruct> {
        static {
            Covode.recordClassIndex(88212);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetStickerUserStruct[] newArray(int i) {
            return new DuetStickerUserStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetStickerUserStruct createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new DuetStickerUserStruct(parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: a */
    public final User mo118710a() {
        User user = new User();
        user.setNickname(this.f169294a);
        user.setUniqueId(this.f169295b);
        user.setAvatarThumb(this.f169296c);
        user.setSecUid(this.f169297d);
        user.setUid(this.f169298e);
        return user;
    }

    public DuetStickerUserStruct(String str, String str2, UrlModel urlModel, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f169294a = str;
        this.f169295b = str2;
        this.f169296c = urlModel;
        this.f169297d = str3;
        this.f169298e = str4;
    }
}
