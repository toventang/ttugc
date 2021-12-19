package com.p2082ss.android.ugc.aweme.story.record.recordcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.AbstractC69742a;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71521v;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl */
public final class StoryWorkspaceImpl implements WorkspaceImpl, AbstractC69742a {
    public static final C77619a CREATOR = new C77619a((byte) 0);

    /* renamed from: p */
    private static int f174095p;

    /* renamed from: q */
    private static int f174096q;

    /* renamed from: a */
    private String f174097a;

    /* renamed from: b */
    private String f174098b;

    /* renamed from: c */
    private String f174099c;

    /* renamed from: d */
    private String f174100d;

    /* renamed from: e */
    private String f174101e;

    /* renamed from: f */
    private String f174102f;

    /* renamed from: g */
    private String f174103g;

    /* renamed from: h */
    private String f174104h;

    /* renamed from: i */
    private String f174105i;

    /* renamed from: j */
    private String f174106j;

    /* renamed from: k */
    private String f174107k;

    /* renamed from: l */
    private String f174108l;

    /* renamed from: m */
    private String f174109m;

    /* renamed from: n */
    private Workspace f174110n;

    /* renamed from: o */
    private String f174111o;

    static {
        Covode.recordClassIndex(90657);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl$a */
    public static final class C77619a implements Parcelable.Creator<StoryWorkspaceImpl> {
        static {
            Covode.recordClassIndex(90658);
        }

        private C77619a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryWorkspaceImpl[] newArray(int i) {
            return new StoryWorkspaceImpl[i];
        }

        public /* synthetic */ C77619a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryWorkspaceImpl createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StoryWorkspaceImpl(parcel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: c */
    public final String mo110076c() {
        return this.f174101e;
    }

    /* renamed from: k */
    private final String m135616k() {
        return C76615b.m134199a(this.f174111o, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: e */
    public final void mo110080e() {
        this.f174101e = null;
        this.f174109m = null;
    }

    /* renamed from: l */
    private final String m135617l() {
        if (this.f174097a == null) {
            this.f174097a = C76615b.m134199a(this.f174111o, "record");
        }
        return this.f174097a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: d */
    public final File mo110077d() {
        String l = m135617l();
        if (l == null || l.length() == 0) {
            return null;
        }
        return new File(m135617l());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: g */
    public final void mo110082g() {
        File d = mo110077d();
        if (d != null && d.exists()) {
            C84902i.m145886a(mo110077d());
        }
        mo110081f();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: h */
    public final File mo110083h() {
        if (this.f174104h == null) {
            String path = mo110070a().getPath();
            C89219l.m154716b(path, "");
            this.f174104h = C71521v.m126399a(path);
        }
        String str = this.f174104h;
        if (str == null) {
            C89219l.m154715b();
        }
        return new File(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: i */
    public final File mo110084i() {
        if (this.f174105i == null) {
            String path = mo110073b().getPath();
            C89219l.m154716b(path, "");
            this.f174105i = C71521v.m126400b(path);
        }
        String str = this.f174105i;
        if (str == null) {
            C89219l.m154715b();
        }
        return new File(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: j */
    public final File mo110085j() {
        if (this.f174106j == null) {
            String path = mo110070a().getPath();
            C89219l.m154716b(path, "");
            this.f174106j = C71521v.m126401c(path);
        }
        String str = this.f174106j;
        if (str == null) {
            C89219l.m154715b();
        }
        return new File(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: b */
    public final File mo110073b() {
        if (this.f174099c == null) {
            StringBuilder append = new StringBuilder().append(m135616k());
            StringBuilder sb = new StringBuilder("-");
            int i = f174096q;
            f174096q = i + 1;
            this.f174099c = append.append(C70638dj.m124844b(sb.append(i).append("-concat-a").toString())).toString();
        }
        String str = this.f174099c;
        if (str == null) {
            C89219l.m154715b();
        }
        return new File(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: f */
    public final void mo110081f() {
        if (this.f174103g == null) {
            this.f174103g = new File(this.f174101e + ".wav").getPath();
        }
        String str = this.f174103g;
        if (str == null) {
            C89219l.m154715b();
        }
        File file = new File(str);
        if (file.exists()) {
            m135615a(file);
        }
        if (this.f174102f == null) {
            this.f174102f = new File(m135616k(), "mix.wav").getPath();
        }
        String str2 = this.f174102f;
        if (str2 == null) {
            C89219l.m154715b();
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            m135615a(file2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: a */
    public final File mo110070a() {
        if (this.f174098b == null) {
            StringBuilder append = new StringBuilder().append(m135616k());
            StringBuilder sb = new StringBuilder("-");
            int i = f174095p;
            f174095p = i + 1;
            this.f174098b = append.append(C70638dj.m124844b(sb.append(i).append("-concat-v").toString())).toString();
        }
        String str = this.f174098b;
        if (str == null) {
            C89219l.m154715b();
        }
        return new File(str);
    }

    public StoryWorkspaceImpl(String str) {
        this.f174111o = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.AbstractC69742a
    /* renamed from: a */
    public final void mo110071a(Workspace workspace) {
        C89219l.m154721d(workspace, "");
        this.f174110n = workspace;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: b */
    public final void mo110074b(String str) {
        mo110080e();
        this.f174101e = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: a */
    public final void mo110072a(String str) {
        if (str == null) {
            str = m135617l();
        }
        this.f174097a = str;
    }

    /* renamed from: e */
    public final void mo121154e(String str) {
        this.f174111o = str;
        this.f174097a = C76615b.m134199a(str, "record");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryWorkspaceImpl(Parcel parcel) {
        this(parcel.readString());
        C89219l.m154721d(parcel, "");
        this.f174098b = parcel.readString();
        this.f174099c = parcel.readString();
        this.f174100d = parcel.readString();
        this.f174101e = parcel.readString();
        this.f174103g = parcel.readString();
        this.f174102f = parcel.readString();
        this.f174104h = parcel.readString();
        this.f174109m = parcel.readString();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: c */
    public final File mo110075c(String str) {
        C89219l.m154721d(str, "");
        String a = C76615b.m134199a(this.f174111o, "background_video");
        if (!C84902i.m145892a(a)) {
            C84902i.m145883a(a, false);
        }
        this.f174107k = a + C70638dj.m124844b("-bgv-v");
        String str2 = this.f174107k;
        if (str2 == null) {
            C89219l.m154715b();
        }
        return new File(str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    /* renamed from: d */
    public final File mo110078d(String str) {
        C89219l.m154721d(str, "");
        String a = C76615b.m134199a(this.f174111o, "background_video");
        if (!C84902i.m145892a(a)) {
            C84902i.m145883a(a, false);
        }
        this.f174108l = a + C70638dj.m124844b("-bgv-a");
        String str2 = this.f174108l;
        if (str2 == null) {
            C89219l.m154715b();
        }
        return new File(str2);
    }

    /* renamed from: a */
    private static boolean m135615a(File file) {
        MethodCollector.m26663i(5425);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5425);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5425);
        return delete;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f174111o);
        parcel.writeString(this.f174098b);
        parcel.writeString(this.f174099c);
        parcel.writeString(this.f174100d);
        parcel.writeString(this.f174101e);
        parcel.writeString(this.f174103g);
        parcel.writeString(this.f174102f);
        parcel.writeString(this.f174104h);
        parcel.writeString(this.f174109m);
    }
}
