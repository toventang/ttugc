package com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.OldImpl */
public class OldImpl implements WorkspaceImpl, AbstractC69742a {
    public static final Parcelable.Creator<OldImpl> CREATOR = new Parcelable.Creator<OldImpl>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.OldImpl.C697401 */

        static {
            Covode.recordClassIndex(82144);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OldImpl[] newArray(int i) {
            return new OldImpl[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OldImpl createFromParcel(Parcel parcel) {
            return new OldImpl(parcel);
        }
    };

    /* renamed from: a */
    int f155850a;

    /* renamed from: b */
    String f155851b = C70638dj.f158102e;

    /* renamed from: c */
    String f155852c;

    /* renamed from: d */
    String f155853d;

    /* renamed from: e */
    String f155854e;

    /* renamed from: f */
    String f155855f;

    /* renamed from: g */
    String f155856g;

    /* renamed from: h */
    String f155857h;

    /* renamed from: i */
    String f155858i;

    /* renamed from: j */
    String f155859j;

    /* renamed from: k */
    String f155860k;

    /* renamed from: l */
    String f155861l;

    /* renamed from: m */
    String f155862m;

    /* renamed from: n */
    String f155863n;

    /* renamed from: o */
    String f155864o;

    /* renamed from: p */
    Workspace f155865p;

    /* renamed from: q */
    public Handler f155866q = new Handler(Looper.getMainLooper());

    public int describeContents() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: c */
    public final String mo110076c() {
        return this.f155856g;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: d */
    public final File mo110077d() {
        return new File(this.f155851b);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: e */
    public final void mo110080e() {
        this.f155856g = null;
        this.f155864o = null;
    }

    static {
        Covode.recordClassIndex(82143);
    }

    public OldImpl() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: a */
    public final File mo110070a() {
        if (this.f155853d == null) {
            this.f155853d = C70638dj.m124842a("-concat-v");
        }
        return new File(this.f155853d);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: b */
    public final File mo110073b() {
        if (TextUtils.isEmpty(this.f155854e)) {
            this.f155854e = C70638dj.m124842a("-concat-a");
        }
        return new File(this.f155854e);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: g */
    public final void mo110082g() {
        if (mo110077d().exists()) {
            C84902i.m145886a(mo110077d());
        }
        mo110081f();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: h */
    public final File mo110083h() {
        if (this.f155859j == null) {
            this.f155859j = C71521v.m126399a(mo110070a().getPath());
        }
        return new File(this.f155859j);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: i */
    public final File mo110084i() {
        if (this.f155860k == null) {
            this.f155860k = C71521v.m126400b(mo110073b().getPath());
        }
        return new File(this.f155860k);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: j */
    public final File mo110085j() {
        if (this.f155861l == null) {
            this.f155861l = C71521v.m126401c(mo110070a().getPath());
        }
        return new File(this.f155861l);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: f */
    public final void mo110081f() {
        if (this.f155858i == null) {
            this.f155858i = new File(this.f155856g + ".wav").getPath();
        }
        File file = new File(this.f155858i);
        if (file.exists()) {
            m123222a(file);
        }
        if (this.f155857h == null) {
            this.f155857h = new File(C70638dj.f158101d, "mix.wav").getPath();
        }
        File file2 = new File(this.f155857h);
        if (file2.exists()) {
            m123222a(file2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.AbstractC69742a
    /* renamed from: a */
    public final void mo110071a(Workspace workspace) {
        this.f155865p = workspace;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: a */
    public final void mo110072a(String str) {
        this.f155851b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: b */
    public final void mo110074b(String str) {
        mo110080e();
        this.f155856g = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: c */
    public final File mo110075c(String str) {
        String str2 = C70638dj.f158105h;
        if (!C84902i.m145892a(str2)) {
            C84902i.m145883a(str2, false);
        }
        this.f155862m = str2 + C70638dj.m124844b("-bgv-v");
        return new File(this.f155862m);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: d */
    public final File mo110078d(String str) {
        String str2 = C70638dj.f158105h;
        if (!C84902i.m145892a(str2)) {
            C84902i.m145883a(str2, false);
        }
        this.f155863n = str2 + C70638dj.m124844b("-bgv-a");
        return new File(this.f155863n);
    }

    protected OldImpl(Parcel parcel) {
        this.f155850a = parcel.readInt();
        this.f155851b = parcel.readString();
        this.f155852c = parcel.readString();
        this.f155853d = parcel.readString();
        this.f155854e = parcel.readString();
        this.f155855f = parcel.readString();
        this.f155856g = parcel.readString();
        this.f155858i = parcel.readString();
        this.f155857h = parcel.readString();
        this.f155859j = parcel.readString();
        this.f155864o = parcel.readString();
    }

    /* renamed from: a */
    private static boolean m123222a(File file) {
        MethodCollector.m26663i(1855);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(1855);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(1855);
        return delete;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f155850a);
        parcel.writeString(this.f155851b);
        parcel.writeString(this.f155852c);
        parcel.writeString(this.f155853d);
        parcel.writeString(this.f155854e);
        parcel.writeString(this.f155855f);
        parcel.writeString(this.f155856g);
        parcel.writeString(this.f155858i);
        parcel.writeString(this.f155857h);
        parcel.writeString(this.f155859j);
        parcel.writeString(this.f155864o);
    }
}
