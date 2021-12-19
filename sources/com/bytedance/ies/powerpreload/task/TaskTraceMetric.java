package com.bytedance.ies.powerpreload.task;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class TaskTraceMetric implements Parcelable {
    public static final C17817a CREATOR = new C17817a((byte) 0);

    /* renamed from: a */
    public long f42511a;

    /* renamed from: b */
    public long f42512b;

    /* renamed from: c */
    public long f42513c;

    /* renamed from: d */
    public long f42514d;

    /* renamed from: e */
    public long f42515e;

    static {
        Covode.recordClassIndex(20381);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.TaskTraceMetric$a */
    public static final class C17817a implements Parcelable.Creator<TaskTraceMetric> {
        static {
            Covode.recordClassIndex(20382);
        }

        private C17817a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TaskTraceMetric[] newArray(int i) {
            return new TaskTraceMetric[i];
        }

        public /* synthetic */ C17817a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TaskTraceMetric createFromParcel(Parcel parcel) {
            C89219l.m154719c(parcel, "");
            return new TaskTraceMetric(parcel);
        }
    }

    public TaskTraceMetric() {
        this.f42511a = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo28280a() {
        this.f42512b = 0;
        this.f42513c = 0;
        this.f42514d = 0;
        this.f42515e = 0;
    }

    public final String toString() {
        return "initTime=" + this.f42511a + "&taskExecuteStartTime=" + this.f42512b + '&' + "taskExecuteEndTime=" + this.f42513c + "&shootStartTime=" + this.f42514d + "&shootEndTime=" + this.f42515e;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TaskTraceMetric(Parcel parcel) {
        this();
        C89219l.m154719c(parcel, "");
        this.f42511a = parcel.readLong();
        this.f42512b = parcel.readLong();
        this.f42513c = parcel.readLong();
        this.f42514d = parcel.readLong();
        this.f42515e = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        parcel.writeLong(this.f42511a);
        parcel.writeLong(this.f42512b);
        parcel.writeLong(this.f42513c);
        parcel.writeLong(this.f42514d);
        parcel.writeLong(this.f42515e);
    }
}
