package com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace */
public final class Workspace implements Parcelable {
    public static final Parcelable.Creator<Workspace> CREATOR = new Parcelable.Creator<Workspace>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace.C697411 */

        static {
            Covode.recordClassIndex(82146);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Workspace[] newArray(int i) {
            return new Workspace[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Workspace createFromParcel(Parcel parcel) {
            return new Workspace(parcel);
        }
    };

    /* renamed from: a */
    public final WorkspaceImpl f155867a;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final File mo110089a() {
        return this.f155867a.mo110070a();
    }

    /* renamed from: b */
    public final File mo110091b() {
        return this.f155867a.mo110073b();
    }

    /* renamed from: c */
    public final String mo110093c() {
        return this.f155867a.mo110076c();
    }

    /* renamed from: d */
    public final void mo110094d() {
        this.f155867a.mo110080e();
    }

    /* renamed from: e */
    public final File mo110096e() {
        return this.f155867a.mo110077d();
    }

    /* renamed from: f */
    public final void mo110097f() {
        this.f155867a.mo110081f();
    }

    /* renamed from: g */
    public final void mo110098g() {
        this.f155867a.mo110082g();
    }

    /* renamed from: h */
    public final File mo110099h() {
        return this.f155867a.mo110083h();
    }

    /* renamed from: i */
    public final File mo110100i() {
        return this.f155867a.mo110084i();
    }

    /* renamed from: j */
    public final File mo110101j() {
        return this.f155867a.mo110085j();
    }

    static {
        Covode.recordClassIndex(82145);
    }

    public Workspace(WorkspaceImpl workspaceImpl) {
        this.f155867a = workspaceImpl;
    }

    /* renamed from: a */
    public final void mo110090a(String str) {
        this.f155867a.mo110074b(str);
    }

    /* renamed from: b */
    public final void mo110092b(String str) {
        this.f155867a.mo110072a(str);
    }

    protected Workspace(Parcel parcel) {
        WorkspaceImpl workspaceImpl = (WorkspaceImpl) parcel.readParcelable(WorkspaceImpl.class.getClassLoader());
        this.f155867a = workspaceImpl;
        if (workspaceImpl instanceof AbstractC69742a) {
            ((AbstractC69742a) workspaceImpl).mo110071a(this);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f155867a, i);
    }
}
