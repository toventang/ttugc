package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo */
public final class FlowDataMusicInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<FlowDataMusicInfo> CREATOR = new Creator();
    @AbstractC27891c(mo46611a = "is_selected_by_auto")
    private boolean isSelectedByAuto;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo$Creator */
    public static class Creator implements Parcelable.Creator<FlowDataMusicInfo> {
        static {
            Covode.recordClassIndex(84579);
        }

        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new FlowDataMusicInfo(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FlowDataMusicInfo[] newArray(int i) {
            return new FlowDataMusicInfo[i];
        }
    }

    static {
        Covode.recordClassIndex(84578);
    }

    public FlowDataMusicInfo() {
        this(false, 1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.isSelectedByAuto ? 1 : 0);
    }

    public final boolean isSelectedByAuto() {
        return this.isSelectedByAuto;
    }

    public final void setSelectedByAuto(boolean z) {
        this.isSelectedByAuto = z;
    }

    public FlowDataMusicInfo(boolean z) {
        this.isSelectedByAuto = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowDataMusicInfo(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
