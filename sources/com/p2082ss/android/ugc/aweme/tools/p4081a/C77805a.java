package com.p2082ss.android.ugc.aweme.tools.p4081a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84459p;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84460q;
import java.io.File;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.a.a */
public final class C77805a extends AbstractC84455l {

    /* renamed from: a */
    private final Context f174554a;

    static {
        Covode.recordClassIndex(90889);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.a.a$a */
    public static final class C77806a extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84459p f174555a;

        /* renamed from: b */
        final /* synthetic */ String f174556b;

        /* renamed from: c */
        final /* synthetic */ String f174557c;

        /* renamed from: d */
        private long f174558d;

        static {
            Covode.recordClassIndex(90890);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            this.f174558d = System.currentTimeMillis();
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && this.f174555a != null) {
                C84460q qVar = new C84460q(this.f174556b, this.f174557c);
                downloadInfo.getDownloadProcess();
                C89219l.m154721d(qVar, "");
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            AbstractC84459p pVar = this.f174555a;
            if (pVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                    str = this.f174556b;
                }
                pVar.mo86086a(str, System.currentTimeMillis() - this.f174558d);
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            long currentTimeMillis;
            Integer num;
            super.onFailed(downloadInfo, baseException);
            AbstractC84459p pVar = this.f174555a;
            if (pVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getUrl()) == null) {
                    str = this.f174556b;
                }
                if (this.f174558d == 0) {
                    currentTimeMillis = 0;
                } else {
                    currentTimeMillis = System.currentTimeMillis() - this.f174558d;
                }
                if (baseException != null) {
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    num = null;
                }
                pVar.mo86087a(str, currentTimeMillis, baseException, num);
            }
        }

        C77806a(AbstractC84459p pVar, String str, String str2) {
            this.f174555a = pVar;
            this.f174556b = str;
            this.f174557c = str2;
        }
    }

    public C77805a(Context context) {
        C89219l.m154721d(context, "");
        this.f174554a = context;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84455l
    /* renamed from: a */
    public final void mo121393a(String str, String str2, AbstractC84459p pVar) {
        C89378p a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String str3 = File.separator;
        C89219l.m154716b(str3, "");
        int a2 = C89361p.m154885a((CharSequence) str2, str3);
        if (a2 <= 0 || a2 >= str2.length()) {
            a = C89387v.m154943a(str2, "");
        } else {
            String substring = str2.substring(0, a2);
            C89219l.m154716b(substring, "");
            String substring2 = str2.substring(a2 + 1);
            C89219l.m154716b(substring2, "");
            a = C89387v.m154943a(substring, substring2);
        }
        Downloader.with(this.f174554a).url(str).savePath((String) a.getFirst()).name((String) a.getSecond()).subThreadListener(new C77806a(pVar, str, str2)).download();
    }
}
