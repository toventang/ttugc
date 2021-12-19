package com.p2082ss.android.ugc.aweme.question;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.QuestionInfo */
public final class QuestionInfo implements Parcelable {
    public static final Parcelable.Creator<QuestionInfo> CREATOR = new C66495a();
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public Long f149476a;
    @AbstractC27891c(mo46611a = "item_id")

    /* renamed from: b */
    public Long f149477b;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: c */
    public Long f149478c;
    @AbstractC27891c(mo46611a = "username")

    /* renamed from: d */
    public String f149479d;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: e */
    public String f149480e;
    @AbstractC27891c(mo46611a = "user_avatar")

    /* renamed from: f */
    public UrlModel f149481f;
    @AbstractC27891c(mo46611a = "sec_uid")

    /* renamed from: g */
    public String f149482g;

    static {
        Covode.recordClassIndex(78035);
    }

    public QuestionInfo() {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return C89219l.m154714a(this.f149476a, questionInfo.f149476a) && C89219l.m154714a(this.f149477b, questionInfo.f149477b) && C89219l.m154714a(this.f149478c, questionInfo.f149478c) && C89219l.m154714a(this.f149479d, questionInfo.f149479d) && C89219l.m154714a(this.f149480e, questionInfo.f149480e) && C89219l.m154714a(this.f149481f, questionInfo.f149481f) && C89219l.m154714a(this.f149482g, questionInfo.f149482g);
    }

    public final int hashCode() {
        Long l = this.f149476a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f149477b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f149478c;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str = this.f149479d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f149480e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f149481f;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f149482g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "QuestionInfo(id=" + this.f149476a + ", item_id=" + this.f149477b + ", user_id=" + this.f149478c + ", userName=" + this.f149479d + ", content=" + this.f149480e + ", userAvatar=" + this.f149481f + ", secId=" + this.f149482g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Long l = this.f149476a;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l2 = this.f149477b;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l3 = this.f149478c;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f149479d);
        parcel.writeString(this.f149480e);
        parcel.writeSerializable(this.f149481f);
        parcel.writeString(this.f149482g);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionInfo$a */
    public static class C66495a implements Parcelable.Creator<QuestionInfo> {
        static {
            Covode.recordClassIndex(78036);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ QuestionInfo[] newArray(int i) {
            return new QuestionInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ QuestionInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            Long l = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new QuestionInfo(valueOf, valueOf2, l, parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString());
        }
    }

    public QuestionInfo(Long l, Long l2, Long l3, String str, String str2, UrlModel urlModel, String str3) {
        this.f149476a = l;
        this.f149477b = l2;
        this.f149478c = l3;
        this.f149479d = str;
        this.f149480e = str2;
        this.f149481f = urlModel;
        this.f149482g = str3;
    }
}
