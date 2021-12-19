package com.bytedance.android.livesdk.manage.p572a;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87014a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87025e;
import com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.livesdk.manage.a.b */
public final class C9479b implements AbstractC87031d<String> {

    /* renamed from: a */
    public AbstractC87010a<String> f23020a;

    /* renamed from: b */
    private AbstractC87012b f23021b;

    static {
        Covode.recordClassIndex(10987);
    }

    public C9479b(AbstractC87012b bVar) {
        this.f23021b = bVar;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d
    /* renamed from: a */
    public final void mo16296a(final C87020c cVar, AbstractC87010a<String> aVar) {
        String str;
        this.f23020a = aVar;
        try {
            String a = C87037b.m150745a(this.f23021b.mo16301a(cVar));
            File file = new File(a);
            if (file.exists() || file.mkdirs()) {
                final String str2 = a + C87036a.m150742a(cVar.f196191c[0]);
                DownloadTask url = Downloader.with(C3966y.m9669e()).url(cVar.mo140630a());
                int lastIndexOf = str2.lastIndexOf("/");
                String str3 = null;
                if (lastIndexOf != -1) {
                    str = str2.substring(lastIndexOf);
                } else {
                    str = null;
                }
                DownloadTask name = url.name(str);
                int lastIndexOf2 = str2.lastIndexOf("/");
                if (lastIndexOf2 != -1) {
                    str3 = str2.substring(0, lastIndexOf2);
                }
                name.savePath(str3).subThreadListener(new AbsDownloadListener() {
                    /* class com.bytedance.android.livesdk.manage.p572a.C9479b.C94801 */

                    static {
                        Covode.recordClassIndex(10988);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo) {
                        super.onProgress(downloadInfo);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        super.onSuccessed(downloadInfo);
                        C9479b.this.f23020a.mo63850a(cVar, str2);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        super.onFailed(downloadInfo, baseException);
                        C9479b.this.f23020a.mo63848a(cVar, new C9478a(baseException.getErrorMessage(), baseException, cVar, baseException.getErrorCode(), new C87014a(downloadInfo.getUrl())));
                    }
                }).download();
                return;
            }
            throw new IOException("mkdirs return false, dir=".concat(String.valueOf(file)));
        } catch (Exception e) {
            this.f23020a.mo63848a(cVar, new C87025e("write storage failed.", e, cVar));
        }
    }
}
