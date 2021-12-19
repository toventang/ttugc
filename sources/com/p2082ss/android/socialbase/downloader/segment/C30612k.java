package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.C30593c;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.IOException;

/* renamed from: com.ss.android.socialbase.downloader.segment.k */
final class C30612k implements AbstractC30603e {

    /* renamed from: a */
    public final C30607i f73109a;

    /* renamed from: b */
    final C30593c f73110b;

    /* renamed from: c */
    public final AbstractC30603e f73111c;

    static {
        Covode.recordClassIndex(37147);
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30603e
    /* renamed from: b */
    public final void mo54824b(C30599a aVar) {
        this.f73110b.mo54806a(aVar.f73032a, aVar.f73034c);
        C30607i iVar = this.f73109a;
        iVar.f73069b.addAndGet((long) aVar.f73034c);
    }

    /* renamed from: a */
    private static C30593c m62849a(DownloadInfo downloadInfo, C30607i iVar) {
        C30593c a = C30535g.m62538a(downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName(), C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null).mo54258a("flush_buffer_size_byte", -1));
        try {
            a.mo54805a(iVar.mo54843d());
            return a;
        } catch (IOException e) {
            throw new BaseException(1054, e);
        }
    }

    public C30612k(DownloadInfo downloadInfo, C30600b bVar, C30607i iVar) {
        this.f73109a = iVar;
        this.f73110b = m62849a(downloadInfo, iVar);
        this.f73111c = new C30606h(bVar, this);
    }
}
