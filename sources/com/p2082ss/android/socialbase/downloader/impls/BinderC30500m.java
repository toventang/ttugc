package com.p2082ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30334ab;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30342af;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30353e;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30359g;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30390x;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.C30405d;
import com.p2082ss.android.socialbase.downloader.model.AbstractC30589a;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30536h;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.m */
public class BinderC30500m extends AbstractC30417k.AbstractBinderC30418a {

    /* renamed from: a */
    private static final String f72714a = BinderC30500m.class.getSimpleName();

    /* renamed from: b */
    private final AbstractC30423o f72715b = new C30504p(true);

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54100a(AbstractC30589a aVar) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54171b(C30536h.m62623a(aVar));
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54096a(int i, boolean z) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54157a(i, z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54101a(List<String> list) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54162a(list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54097a(int i, boolean z, boolean z2) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54158a(i, z, z2);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54090a(int i, int i2, AbstractC30359g gVar, int i3, boolean z) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54167b(i, i2, C30536h.m62615a(gVar), C30535g.m62587c(i3), z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54091a(int i, int i2, AbstractC30359g gVar, int i3, boolean z, boolean z2) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54152a(i, i2, C30536h.m62615a(gVar), C30535g.m62587c(i3), z, z2);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final boolean mo54103a(DownloadInfo downloadInfo) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54164a(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54093a(int i, Notification notification) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54154a(i, notification);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54102a(boolean z) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54163a(z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54092a(int i, long j) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54153a(i, j);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54099a(DownloadChunk downloadChunk) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54160a(downloadChunk);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54095a(int i, List<DownloadChunk> list) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54168b(i, list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54098a(AbstractC30342af afVar) {
        C30536h.C3055818 r0;
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            if (afVar == null) {
                r0 = null;
            } else {
                r0 = new AbstractC30345ag(afVar) {
                    /* class com.p2082ss.android.socialbase.downloader.p2189k.C30536h.C3055818 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC30342af f72888a;

                    static {
                        Covode.recordClassIndex(37086);
                    }

                    {
                        this.f72888a = r1;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag
                    /* renamed from: a */
                    public final void mo53877a(int i, int i2) {
                        try {
                            this.f72888a.mo53873a(i, i2);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                };
            }
            oVar.mo54159a(r0);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54094a(int i, AbstractC30390x xVar) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54155a(i, C30536h.m62622a(xVar));
        }
    }

    static {
        Covode.recordClassIndex(37028);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final List<DownloadInfo> mo54105b() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54179d();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: f */
    public final boolean mo54124f() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54173b();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54084a() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54145a();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: c */
    public final boolean mo54116c() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54177c();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: d */
    public final boolean mo54119d() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54186f();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: e */
    public final void mo54122e() {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54187g();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final void mo54110b(List<String> list) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54172b(list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: c */
    public final List<DownloadInfo> mo54113c(String str) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54175c(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: d */
    public final List<DownloadInfo> mo54117d(String str) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54183e(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: e */
    public final long mo54120e(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return 0;
        }
        return oVar.mo54182e(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: f */
    public final int mo54123f(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return 0;
        }
        return oVar.mo54185f(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: g */
    public final boolean mo54125g(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54188g(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: h */
    public final DownloadInfo mo54126h(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54189h(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: i */
    public final List<DownloadChunk> mo54127i(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54191i(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: j */
    public final void mo54128j(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54192j(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: k */
    public final boolean mo54129k(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54194l(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: l */
    public final void mo54130l(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54193k(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: m */
    public final int mo54131m(int i) {
        return C30405d.m61749a().mo54053b(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: n */
    public final boolean mo54132n(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54196n(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: o */
    public final void mo54133o(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54197o(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: p */
    public final boolean mo54134p(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54198p(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: q */
    public final AbstractC30390x mo54135q(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return C30536h.m62621a(oVar.mo54199q(i));
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: r */
    public final AbstractC30334ab mo54136r(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return C30536h.m62616a(oVar.mo54200r(i));
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: s */
    public final AbstractC30353e mo54137s(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return C30536h.m62618a(oVar.mo54201s(i));
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final List<DownloadInfo> mo54083a(String str) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54144a(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: c */
    public final void mo54114c(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54176c(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: d */
    public final void mo54118d(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54181d(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: e */
    public final List<DownloadInfo> mo54121e(String str) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54180d(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final List<DownloadInfo> mo54106b(String str) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54166b(str);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54085a(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54146a(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final boolean mo54111b(int i) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54174b(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final boolean mo54112b(DownloadInfo downloadInfo) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return false;
        }
        return oVar.mo54178c(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: c */
    public final void mo54115c(int i, boolean z) {
        C30405d.m61749a().mo54056b(i, z);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final int mo54082a(String str, String str2) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return 0;
        }
        return oVar.mo54143a(str, str2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final DownloadInfo mo54104b(String str, String str2) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar == null) {
            return null;
        }
        return oVar.mo54165b(str, str2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54086a(int i, int i2) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54147a(i, i2);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final void mo54108b(int i, List<DownloadChunk> list) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54156a(i, list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final void mo54109b(int i, boolean z) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54158a(i, z, false);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54089a(int i, int i2, long j) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54150a(i, i2, j);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54087a(int i, int i2, int i3, int i4) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54148a(i, i2, i3, i4);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: a */
    public final void mo54088a(int i, int i2, int i3, long j) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54149a(i, i2, i3, j);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k
    /* renamed from: b */
    public final void mo54107b(int i, int i2, AbstractC30359g gVar, int i3, boolean z) {
        AbstractC30423o oVar = this.f72715b;
        if (oVar != null) {
            oVar.mo54151a(i, i2, C30536h.m62615a(gVar), C30535g.m62587c(i3), z);
        }
    }
}
