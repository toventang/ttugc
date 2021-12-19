package com.p2082ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30342af;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30424p;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30405d;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30536h;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.o */
public class C30502o implements AbstractC30423o, AbstractC30424p {

    /* renamed from: a */
    private static final String f72720a = C30502o.class.getSimpleName();

    /* renamed from: b */
    private volatile AbstractC30417k f72721b;

    /* renamed from: c */
    private AbstractC30425q<IndependentProcessDownloadService> f72722c;

    /* renamed from: d */
    private AbstractC30423o f72723d = new C30504p();

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54170b(DownloadInfo downloadInfo) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30424p
    /* renamed from: i */
    public final void mo54203i() {
        this.f72721b = null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54157a(int i, boolean z) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54096a(i, z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final boolean mo54174b(int i) {
        if (this.f72721b == null) {
            return false;
        }
        try {
            return this.f72721b.mo54111b(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54162a(List<String> list) {
        if (this.f72721b == null) {
            this.f72723d.mo54162a(list);
            return;
        }
        try {
            this.f72721b.mo54101a(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54158a(int i, boolean z, boolean z2) {
        if (this.f72721b == null) {
            this.f72723d.mo54158a(i, z, z2);
            return;
        }
        try {
            this.f72721b.mo54097a(i, z, z2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54152a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z, boolean z2) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54091a(i, i2, C30536h.m62619a(iDownloadListener, hVar != EnumC30294h.SUB), hVar.ordinal(), z, z2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final boolean mo54164a(DownloadInfo downloadInfo) {
        if (this.f72721b == null) {
            return this.f72723d.mo54164a(downloadInfo);
        }
        try {
            this.f72721b.mo54103a(downloadInfo);
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54154a(int i, Notification notification) {
        if (this.f72721b == null) {
            C30434a.m62029d(f72720a, "startForeground, aidlService is null");
            return;
        }
        C30434a.m62028c(f72720a, "aidlService.startForeground, id = ".concat(String.valueOf(i)));
        try {
            this.f72721b.mo54093a(i, notification);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54163a(boolean z) {
        if (this.f72721b == null) {
            C30434a.m62029d(f72720a, "stopForeground, aidlService is null");
            return;
        }
        C30434a.m62028c(f72720a, "aidlService.stopForeground");
        try {
            this.f72721b.mo54102a(z);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54161a(DownloadTask downloadTask) {
        AbstractC30425q<IndependentProcessDownloadService> qVar;
        if (downloadTask != null && (qVar = this.f72722c) != null) {
            qVar.mo54034b(downloadTask);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54156a(int i, List<DownloadChunk> list) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54108b(i, list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54160a(DownloadChunk downloadChunk) {
        if (this.f72721b == null) {
            this.f72723d.mo54160a(downloadChunk);
            return;
        }
        try {
            this.f72721b.mo54099a(downloadChunk);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54159a(AbstractC30345ag agVar) {
        C30536h.BinderC3055717 r0;
        if (this.f72721b != null) {
            try {
                AbstractC30417k kVar = this.f72721b;
                if (agVar == null) {
                    r0 = null;
                } else {
                    r0 = new AbstractC30342af.AbstractBinderC30343a(agVar) {
                        /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.BinderC3055717 */

                        /* renamed from: a */
                        final /* synthetic */ AbstractC30345ag f72887a;

                        static {
                            Covode.recordClassIndex(37085);
                        }

                        {
                            this.f72887a = r1;
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30342af
                        /* renamed from: a */
                        public final void mo53873a(int i, int i2) {
                            this.f72887a.mo53877a(i, i2);
                        }
                    };
                }
                kVar.mo54098a(r0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54155a(int i, AbstractC30393y yVar) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54094a(i, C30536h.m62621a(yVar));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30424p
    /* renamed from: a */
    public final void mo54202a(IBinder iBinder) {
        this.f72721b = AbstractC30417k.AbstractBinderC30418a.m61845a(iBinder);
        if (C30535g.m62557a()) {
            mo54159a(new AbstractC30345ag() {
                /* class com.p2082ss.android.socialbase.downloader.impls.C30502o.C305031 */

                static {
                    Covode.recordClassIndex(37031);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag
                /* renamed from: a */
                public final void mo53877a(int i, int i2) {
                    if (i2 == 1) {
                        Downloader.getInstance(C30399c.m61674B()).pause(i);
                        List<DownloadChunk> i3 = C30499l.m62246a(false).mo54191i(i);
                        if (i3 != null) {
                            C30499l.m62246a(true).mo54156a(i, C30535g.m62546a(i3));
                        }
                    } else if (i2 == 2) {
                        Downloader.getInstance(C30399c.m61674B()).cancel(i);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54153a(int i, long j) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54092a(i, j);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final boolean mo54177c() {
        return C30399c.m61675C();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final void mo54184e() {
        AbstractC30425q<IndependentProcessDownloadService> qVar = this.f72722c;
        if (qVar != null) {
            qVar.mo54041g();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: h */
    public final boolean mo54190h() {
        if (this.f72721b != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(37030);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54145a() {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54084a();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public C30502o() {
        AbstractC30425q<IndependentProcessDownloadService> s = C30399c.m61735s();
        this.f72722c = s;
        s.mo54029a(this);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final List<DownloadInfo> mo54179d() {
        if (this.f72721b == null) {
            return this.f72723d.mo54179d();
        }
        try {
            return this.f72721b.mo54105b();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: g */
    public final void mo54187g() {
        if (this.f72721b == null) {
            this.f72723d.mo54187g();
            return;
        }
        try {
            this.f72721b.mo54122e();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: f */
    public final boolean mo54186f() {
        if (this.f72721b == null) {
            return this.f72723d.mo54186f();
        }
        try {
            return this.f72721b.mo54119d();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final boolean mo54173b() {
        if (this.f72721b == null) {
            C30434a.m62029d(f72720a, "isServiceForeground, aidlService is null");
            return false;
        }
        C30434a.m62028c(f72720a, "aidlService.isServiceForeground");
        try {
            return this.f72721b.mo54124f();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: k */
    public final void mo54193k(int i) {
        AbstractC30425q<IndependentProcessDownloadService> qVar = this.f72722c;
        if (qVar != null) {
            qVar.mo54026a(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final void mo54176c(int i) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54114c(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final void mo54181d(int i) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54118d(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final List<DownloadInfo> mo54144a(String str) {
        if (this.f72721b == null) {
            return this.f72723d.mo54144a(str);
        }
        try {
            return this.f72721b.mo54083a(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final List<DownloadInfo> mo54166b(String str) {
        if (this.f72721b == null) {
            return this.f72723d.mo54166b(str);
        }
        try {
            return this.f72721b.mo54106b(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final List<DownloadInfo> mo54175c(String str) {
        if (this.f72721b == null) {
            return this.f72723d.mo54175c(str);
        }
        try {
            return this.f72721b.mo54113c(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final long mo54182e(int i) {
        if (this.f72721b == null) {
            return 0;
        }
        try {
            return this.f72721b.mo54120e(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: f */
    public final int mo54185f(int i) {
        if (this.f72721b == null) {
            return 0;
        }
        try {
            return this.f72721b.mo54123f(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: h */
    public final DownloadInfo mo54189h(int i) {
        if (this.f72721b == null) {
            return this.f72723d.mo54189h(i);
        }
        try {
            return this.f72721b.mo54126h(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: i */
    public final List<DownloadChunk> mo54191i(int i) {
        if (this.f72721b == null) {
            return this.f72723d.mo54191i(i);
        }
        try {
            return this.f72721b.mo54127i(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: j */
    public final void mo54192j(int i) {
        if (this.f72721b == null) {
            this.f72723d.mo54192j(i);
            return;
        }
        try {
            this.f72721b.mo54128j(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: l */
    public final boolean mo54194l(int i) {
        if (this.f72721b == null) {
            return false;
        }
        try {
            return this.f72721b.mo54129k(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: m */
    public final int mo54195m(int i) {
        if (this.f72721b == null) {
            return C30405d.m61749a().mo54053b(i);
        }
        try {
            return this.f72721b.mo54131m(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: n */
    public final boolean mo54196n(int i) {
        if (this.f72721b == null) {
            return this.f72723d.mo54196n(i);
        }
        try {
            return this.f72721b.mo54132n(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: o */
    public final void mo54197o(int i) {
        if (this.f72721b == null) {
            this.f72723d.mo54197o(i);
            return;
        }
        try {
            this.f72721b.mo54133o(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: p */
    public final boolean mo54198p(int i) {
        if (this.f72721b == null) {
            return this.f72723d.mo54198p(i);
        }
        try {
            return this.f72721b.mo54134p(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: q */
    public final AbstractC30393y mo54199q(int i) {
        if (this.f72721b == null) {
            return null;
        }
        try {
            return C30536h.m62622a(this.f72721b.mo54135q(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: r */
    public final AbstractC30337ac mo54200r(int i) {
        if (this.f72721b == null) {
            return null;
        }
        try {
            return C30536h.m62617a(this.f72721b.mo54136r(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: s */
    public final AbstractC30379q mo54201s(int i) {
        if (this.f72721b == null) {
            return null;
        }
        try {
            return C30536h.m62620a(this.f72721b.mo54137s(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54146a(int i) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54085a(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final boolean mo54178c(DownloadInfo downloadInfo) {
        if (this.f72721b == null) {
            return this.f72723d.mo54178c(downloadInfo);
        }
        try {
            return this.f72721b.mo54112b(downloadInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final List<DownloadInfo> mo54180d(String str) {
        if (this.f72721b == null) {
            return this.f72723d.mo54180d(str);
        }
        try {
            return this.f72721b.mo54121e(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final List<DownloadInfo> mo54183e(String str) {
        if (this.f72721b == null) {
            return null;
        }
        try {
            return this.f72721b.mo54117d(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: g */
    public final boolean mo54188g(int i) {
        if (this.f72721b == null) {
            return false;
        }
        try {
            return this.f72721b.mo54125g(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54171b(DownloadTask downloadTask) {
        AbstractC30425q<IndependentProcessDownloadService> qVar;
        if (downloadTask != null && (qVar = this.f72722c) != null) {
            qVar.mo54037c(downloadTask);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54172b(List<String> list) {
        if (this.f72721b == null) {
            this.f72723d.mo54172b(list);
            return;
        }
        try {
            this.f72721b.mo54110b(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final int mo54143a(String str, String str2) {
        return C30399c.m61681a(str, str2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final DownloadInfo mo54165b(String str, String str2) {
        return mo54189h(C30399c.m61681a(str, str2));
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54147a(int i, int i2) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54086a(i, i2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54168b(int i, List<DownloadChunk> list) {
        if (this.f72721b == null) {
            this.f72723d.mo54168b(i, list);
            return;
        }
        try {
            this.f72721b.mo54095a(i, list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54169b(int i, boolean z) {
        if (this.f72721b != null) {
            try {
                this.f72721b.mo54115c(i, z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54150a(int i, int i2, long j) {
        if (this.f72721b == null) {
            this.f72723d.mo54150a(i, i2, j);
            return;
        }
        try {
            this.f72721b.mo54089a(i, i2, j);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54148a(int i, int i2, int i3, int i4) {
        if (this.f72721b == null) {
            this.f72723d.mo54148a(i, i2, i3, i4);
            return;
        }
        try {
            this.f72721b.mo54087a(i, i2, i3, i4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54149a(int i, int i2, int i3, long j) {
        if (this.f72721b == null) {
            this.f72723d.mo54149a(i, i2, i3, j);
            return;
        }
        try {
            this.f72721b.mo54088a(i, i2, i3, j);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54167b(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        boolean z2;
        if (this.f72721b != null) {
            try {
                AbstractC30417k kVar = this.f72721b;
                if (hVar == EnumC30294h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                kVar.mo54090a(i, i2, C30536h.m62619a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54151a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        boolean z2;
        if (this.f72721b != null) {
            try {
                AbstractC30417k kVar = this.f72721b;
                if (hVar == EnumC30294h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                kVar.mo54107b(i, i2, C30536h.m62619a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
