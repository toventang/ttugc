package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.RecCoverTitleBean */
public final class RecCoverTitleBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecCoverTitleBean> CREATOR = new C45934a();
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private long f106992id;

    static {
        Covode.recordClassIndex(54465);
    }

    public RecCoverTitleBean() {
        this(0, null, 3, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f106992id);
        parcel.writeString(this.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.f106992id;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.model.RecCoverTitleBean$a */
    public static class C45934a implements Parcelable.Creator<RecCoverTitleBean> {
        static {
            Covode.recordClassIndex(54466);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecCoverTitleBean[] newArray(int i) {
            return new RecCoverTitleBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecCoverTitleBean createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new RecCoverTitleBean(parcel.readLong(), parcel.readString());
        }
    }

    public final void setId(long j) {
        this.f106992id = j;
    }

    public final void setContent(String str) {
        C89219l.m154721d(str, "");
        this.content = str;
    }

    public RecCoverTitleBean(long j, String str) {
        C89219l.m154721d(str, "");
        this.f106992id = j;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecCoverTitleBean(long j, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? "" : str);
    }
}
