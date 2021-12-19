package com.p2082ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30379q;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30393y;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30405d;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadChunk;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30294h;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.p */
public final class C30504p implements AbstractC30423o {

    /* renamed from: a */
    private final AbstractC30474a f72725a;

    /* renamed from: b */
    private final AbstractC30420l f72726b;

    /* renamed from: c */
    private final AbstractC30425q f72727c;

    /* renamed from: d */
    private final boolean f72728d;

    static {
        Covode.recordClassIndex(37032);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final void mo54184e() {
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54157a(int i, boolean z) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54280a(i, z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final boolean mo54174b(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54300p(i);
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54162a(List<String> list) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54278a(list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54158a(int i, boolean z, boolean z2) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54274a(i, z, z2);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54152a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z, boolean z2) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54271a(i, i2, iDownloadListener, hVar, z, z2);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final boolean mo54164a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = C30535g.m62559a(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (a) {
            if (C30528a.m62524a(33554432)) {
                mo54158a(downloadInfo.getId(), true, false);
            } else {
                int id = downloadInfo.getId();
                AbstractC30474a aVar = this.f72725a;
                if (aVar != null) {
                    aVar.mo54298n(id);
                }
            }
        }
        return a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54154a(int i, Notification notification) {
        AbstractC30425q qVar = this.f72727c;
        if (qVar != null) {
            qVar.mo54027a(i, notification);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54163a(boolean z) {
        AbstractC30425q qVar = this.f72727c;
        if (qVar != null) {
            qVar.mo54032a(z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54161a(DownloadTask downloadTask) {
        AbstractC30425q qVar = this.f72727c;
        if (qVar != null) {
            qVar.mo54034b(downloadTask);
        } else if (downloadTask != null) {
            C30439a.m62034a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54156a(int i, List<DownloadChunk> list) {
        this.f72726b.mo53772a(i, list);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54160a(DownloadChunk downloadChunk) {
        this.f72726b.mo53774a(downloadChunk);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54155a(int i, AbstractC30393y yVar) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54272a(i, yVar);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54153a(int i, long j) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            DownloadInfo b = aVar.f72656d.mo53777b(i);
            if (b != null) {
                b.setThrottleNetSpeed(j);
            }
            aVar.mo54288d(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54159a(AbstractC30345ag agVar) {
        if (agVar != null) {
            C30399c.f72432d.add(agVar);
        }
    }

    public C30504p() {
        this(false);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: f */
    public final boolean mo54186f() {
        return this.f72726b.mo53791d();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: g */
    public final void mo54187g() {
        this.f72726b.mo53787c();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final List<DownloadInfo> mo54179d() {
        AbstractC30420l lVar = this.f72726b;
        if (lVar != null) {
            return lVar.mo53779b();
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54145a() {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54282b();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final boolean mo54177c() {
        return C30399c.m61675C();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: h */
    public final boolean mo54190h() {
        AbstractC30425q qVar;
        if (!this.f72728d || (qVar = this.f72727c) == null || !qVar.mo54033a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final boolean mo54173b() {
        AbstractC30425q qVar = this.f72727c;
        if (qVar != null) {
            return qVar.mo54035b();
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: k */
    public final void mo54193k(int i) {
        C30434a.f72547a = i;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final void mo54176c(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54291g(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final void mo54181d(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54292h(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: i */
    public final List<DownloadChunk> mo54191i(int i) {
        return this.f72726b.mo53785c(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: j */
    public final void mo54192j(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54299o(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: n */
    public final boolean mo54196n(int i) {
        return this.f72726b.mo53794e(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: o */
    public final void mo54197o(int i) {
        this.f72726b.mo53790d(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: p */
    public final boolean mo54198p(int i) {
        return this.f72726b.mo53795f(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final List<DownloadInfo> mo54144a(String str) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54268a(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final List<DownloadInfo> mo54175c(String str) {
        AbstractC30420l lVar = this.f72726b;
        if (lVar != null) {
            return lVar.mo53786c(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final List<DownloadInfo> mo54183e(String str) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54281b(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: g */
    public final boolean mo54188g(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54279a(i);
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: h */
    public final DownloadInfo mo54189h(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54289e(i);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: l */
    public final boolean mo54194l(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54296l(i);
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: m */
    public final int mo54195m(int i) {
        return C30405d.m61749a().mo54049a(i);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: q */
    public final AbstractC30393y mo54199q(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54294j(i);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: r */
    public final AbstractC30337ac mo54200r(int i) {
        AbstractC30337ac i2;
        AbstractC30474a aVar = this.f72725a;
        if (aVar == null || (i2 = aVar.mo54293i(i)) == null) {
            return C30399c.f72429a;
        }
        return i2;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: s */
    public final AbstractC30379q mo54201s(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            return aVar.mo54295k(i);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final List<DownloadInfo> mo54166b(String str) {
        AbstractC30420l lVar = this.f72726b;
        if (lVar != null) {
            return lVar.mo53780b(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: d */
    public final List<DownloadInfo> mo54180d(String str) {
        AbstractC30420l lVar = this.f72726b;
        if (lVar != null) {
            return lVar.mo53789d(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: f */
    public final int mo54185f(int i) {
        DownloadInfo e;
        AbstractC30474a aVar = this.f72725a;
        if (aVar == null || (e = aVar.mo54289e(i)) == null) {
            return 0;
        }
        return e.getStatus();
    }

    public C30504p(boolean z) {
        this.f72725a = C30399c.m61737u();
        this.f72726b = C30399c.m61733q();
        if (!z) {
            this.f72727c = C30399c.m61734r();
        } else {
            this.f72727c = C30399c.m61735s();
        }
        this.f72728d = C30472a.f72639a.mo54262a("service_alive", false);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54146a(int i) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54290f(i);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: c */
    public final boolean mo54178c(DownloadInfo downloadInfo) {
        return this.f72726b.mo53776a(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: e */
    public final long mo54182e(int i) {
        DownloadInfo b;
        AbstractC30420l lVar = this.f72726b;
        if (lVar == null || (b = lVar.mo53777b(i)) == null) {
            return 0;
        }
        int chunkCount = b.getChunkCount();
        if (chunkCount <= 1) {
            return b.getCurBytes();
        }
        List<DownloadChunk> c = this.f72726b.mo53785c(i);
        if (c == null || c.size() != chunkCount) {
            return 0;
        }
        return C30535g.m62572b(c);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54170b(DownloadInfo downloadInfo) {
        this.f72726b.mo53783b(downloadInfo);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54171b(DownloadTask downloadTask) {
        AbstractC30425q qVar = this.f72727c;
        if (qVar != null) {
            qVar.mo54037c(downloadTask);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54172b(List<String> list) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54286b(list);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final int mo54143a(String str, String str2) {
        return C30399c.m61681a(str, str2);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54168b(int i, List<DownloadChunk> list) {
        this.f72726b.mo53781b(i, list);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final DownloadInfo mo54165b(String str, String str2) {
        return mo54189h(C30399c.m61681a(str, str2));
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54147a(int i, int i2) {
        if (C30399c.f72432d != null) {
            for (AbstractC30345ag agVar : C30399c.f72432d) {
                if (agVar != null) {
                    agVar.mo53877a(i2, i);
                }
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54169b(int i, boolean z) {
        C30405d.m61749a().mo54052a(i, z);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54150a(int i, int i2, long j) {
        this.f72726b.mo53771a(i, i2, j);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54148a(int i, int i2, int i3, int i4) {
        this.f72726b.mo53769a(i, i2, i3, i4);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54149a(int i, int i2, int i3, long j) {
        this.f72726b.mo53770a(i, i2, i3, j);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: b */
    public final void mo54167b(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54270a(i, i2, iDownloadListener, hVar, z);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30423o
    /* renamed from: a */
    public final void mo54151a(int i, int i2, IDownloadListener iDownloadListener, EnumC30294h hVar, boolean z) {
        AbstractC30474a aVar = this.f72725a;
        if (aVar != null) {
            aVar.mo54284b(i, i2, iDownloadListener, hVar, z);
        }
    }
}
