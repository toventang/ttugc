package com.p2082ss.android.ugc.aweme.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.edit.TTStoryUploadModel */
public final class TTStoryUploadModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TTStoryUploadModel> CREATOR = new C45820a();

    /* renamed from: a */
    private final int f106758a;

    /* renamed from: b */
    private final int f106759b;

    /* renamed from: c */
    private final int f106760c;

    static {
        Covode.recordClassIndex(54342);
    }

    /* renamed from: com_ss_android_ugc_aweme_edit_TTStoryUploadModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88434xf6165fa9(int i) {
        return i;
    }

    public static /* synthetic */ TTStoryUploadModel copy$default(TTStoryUploadModel tTStoryUploadModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tTStoryUploadModel.f106758a;
        }
        if ((i4 & 2) != 0) {
            i2 = tTStoryUploadModel.f106759b;
        }
        if ((i4 & 4) != 0) {
            i3 = tTStoryUploadModel.f106760c;
        }
        return tTStoryUploadModel.copy(i, i2, i3);
    }

    public final int component1() {
        return this.f106758a;
    }

    public final int component2() {
        return this.f106759b;
    }

    public final int component3() {
        return this.f106760c;
    }

    public final TTStoryUploadModel copy(int i, int i2, int i3) {
        return new TTStoryUploadModel(i, i2, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTStoryUploadModel)) {
            return false;
        }
        TTStoryUploadModel tTStoryUploadModel = (TTStoryUploadModel) obj;
        return this.f106758a == tTStoryUploadModel.f106758a && this.f106759b == tTStoryUploadModel.f106759b && this.f106760c == tTStoryUploadModel.f106760c;
    }

    public final int hashCode() {
        return (((m88434xf6165fa9(this.f106758a) * 31) + m88434xf6165fa9(this.f106759b)) * 31) + m88434xf6165fa9(this.f106760c);
    }

    public final String toString() {
        return "TTStoryUploadModel(index=" + this.f106758a + ", totalCount=" + this.f106759b + ", contentType=" + this.f106760c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f106758a);
        parcel.writeInt(this.f106759b);
        parcel.writeInt(this.f106760c);
    }

    public final int getContentType() {
        return this.f106760c;
    }

    public final int getIndex() {
        return this.f106758a;
    }

    public final int getTotalCount() {
        return this.f106759b;
    }

    /* renamed from: com.ss.android.ugc.aweme.edit.TTStoryUploadModel$a */
    public static class C45820a implements Parcelable.Creator<TTStoryUploadModel> {
        static {
            Covode.recordClassIndex(54343);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TTStoryUploadModel[] newArray(int i) {
            return new TTStoryUploadModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TTStoryUploadModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new TTStoryUploadModel(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public TTStoryUploadModel(int i, int i2, int i3) {
        this.f106758a = i;
        this.f106759b = i2;
        this.f106760c = i3;
    }
}
