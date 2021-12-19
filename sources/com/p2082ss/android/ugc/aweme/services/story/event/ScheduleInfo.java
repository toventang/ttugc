package com.p2082ss.android.ugc.aweme.services.story.event;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.story.event.ScheduleInfo */
public final class ScheduleInfo implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Creator();
    private final String scheduleId;
    private final Bundle scheduleParam;

    /* renamed from: com.ss.android.ugc.aweme.services.story.event.ScheduleInfo$Creator */
    public static class Creator implements Parcelable.Creator<ScheduleInfo> {
        static {
            Covode.recordClassIndex(79993);
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ScheduleInfo(parcel.readString(), parcel.readBundle());
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo[] newArray(int i) {
            return new ScheduleInfo[i];
        }
    }

    static {
        Covode.recordClassIndex(79992);
    }

    public static /* synthetic */ ScheduleInfo copy$default(ScheduleInfo scheduleInfo, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheduleInfo.scheduleId;
        }
        if ((i & 2) != 0) {
            bundle = scheduleInfo.scheduleParam;
        }
        return scheduleInfo.copy(str, bundle);
    }

    public final String component1() {
        return this.scheduleId;
    }

    public final Bundle component2() {
        return this.scheduleParam;
    }

    public final ScheduleInfo copy(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        return new ScheduleInfo(str, bundle);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleInfo)) {
            return false;
        }
        ScheduleInfo scheduleInfo = (ScheduleInfo) obj;
        return C89219l.m154714a(this.scheduleId, scheduleInfo.scheduleId) && C89219l.m154714a(this.scheduleParam, scheduleInfo.scheduleParam);
    }

    public final int hashCode() {
        String str = this.scheduleId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bundle bundle = this.scheduleParam;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ScheduleInfo(scheduleId=" + this.scheduleId + ", scheduleParam=" + this.scheduleParam + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.scheduleId);
        parcel.writeBundle(this.scheduleParam);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final Bundle getScheduleParam() {
        return this.scheduleParam;
    }

    public ScheduleInfo(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        this.scheduleId = str;
        this.scheduleParam = bundle;
    }
}
