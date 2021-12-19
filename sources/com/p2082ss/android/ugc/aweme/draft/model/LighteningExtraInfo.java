package com.p2082ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo */
public final class LighteningExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<LighteningExtraInfo> CREATOR = new C43220a();
    @AbstractC27891c(mo46611a = "scheduleId")

    /* renamed from: a */
    private final String f100734a;

    static {
        Covode.recordClassIndex(51421);
    }

    public LighteningExtraInfo() {
        this(null, 1, null);
    }

    public static /* synthetic */ LighteningExtraInfo copy$default(LighteningExtraInfo lighteningExtraInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lighteningExtraInfo.f100734a;
        }
        return lighteningExtraInfo.copy(str);
    }

    public final String component1() {
        return this.f100734a;
    }

    public final LighteningExtraInfo copy(String str) {
        C89219l.m154721d(str, "");
        return new LighteningExtraInfo(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LighteningExtraInfo) && C89219l.m154714a(this.f100734a, ((LighteningExtraInfo) obj).f100734a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f100734a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LighteningExtraInfo(scheduleId=" + this.f100734a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f100734a);
    }

    public final String getScheduleId() {
        return this.f100734a;
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo$a */
    public static class C43220a implements Parcelable.Creator<LighteningExtraInfo> {
        static {
            Covode.recordClassIndex(51422);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LighteningExtraInfo[] newArray(int i) {
            return new LighteningExtraInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LighteningExtraInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new LighteningExtraInfo(parcel.readString());
        }
    }

    public LighteningExtraInfo(String str) {
        C89219l.m154721d(str, "");
        this.f100734a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LighteningExtraInfo(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
