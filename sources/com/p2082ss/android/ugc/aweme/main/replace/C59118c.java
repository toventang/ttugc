package com.p2082ss.android.ugc.aweme.main.replace;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.replace.c */
public final class C59118c {

    /* renamed from: a */
    public static final C59118c f134523a = new C59118c();

    private C59118c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.c$a */
    public static final class C59119a implements LocalVideoPlayerManager.AbstractC80753a {

        /* renamed from: a */
        final /* synthetic */ AbstractC59115a f134524a;

        /* renamed from: b */
        final /* synthetic */ String f134525b;

        /* renamed from: c */
        final /* synthetic */ List f134526c;

        /* renamed from: d */
        final /* synthetic */ String f134527d;

        /* renamed from: e */
        final /* synthetic */ String f134528e;

        static {
            Covode.recordClassIndex(69473);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96628a() {
            C59118c.m108612a(this.f134526c, this.f134527d, this.f134528e, this.f134524a);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96629a(String str) {
            File file = new File(str);
            RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_success");
            AbstractC59115a aVar = this.f134524a;
            if (aVar != null) {
                aVar.f134520a = System.currentTimeMillis();
            }
            AbstractC59115a aVar2 = this.f134524a;
            if (aVar2 != null) {
                aVar2.mo96625a(100, file.length(), file.length());
            }
            AbstractC59115a aVar3 = this.f134524a;
            if (aVar3 != null) {
                aVar3.mo96627a("local", this.f134525b);
            }
        }

        C59119a(AbstractC59115a aVar, String str, List list, String str2, String str3) {
            this.f134524a = aVar;
            this.f134525b = str;
            this.f134526c = list;
            this.f134527d = str2;
            this.f134528e = str3;
        }
    }

    static {
        Covode.recordClassIndex(69472);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.c$b */
    public static final class C59120b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC59115a f134529a;

        static {
            Covode.recordClassIndex(69474);
        }

        C59120b(AbstractC59115a aVar) {
            this.f134529a = aVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            AbstractC59115a aVar = this.f134529a;
            if (aVar != null) {
                aVar.f134520a = System.currentTimeMillis();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            int i;
            long j;
            long j2;
            super.onProgress(downloadInfo);
            AbstractC59115a aVar = this.f134529a;
            if (aVar != null) {
                if (downloadInfo != null) {
                    i = downloadInfo.getDownloadProcess();
                    j = downloadInfo.getCurBytes();
                    j2 = downloadInfo.getTotalBytes();
                } else {
                    i = 0;
                    j = 0;
                    j2 = 100;
                }
                aVar.mo96625a(i, j, j2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r6 == null) goto L_0x0014;
         */
        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p2082ss.android.socialbase.downloader.model.DownloadInfo r6) {
            /*
                r5 = this;
                super.onSuccessed(r6)
                com.ss.android.ugc.aweme.main.replace.a r3 = r5.f134529a
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0011
                java.lang.String r2 = r6.getUrl()
                if (r2 != 0) goto L_0x0018
            L_0x0011:
                r2 = r0
                if (r6 != 0) goto L_0x0018
            L_0x0014:
                r3.mo96627a(r2, r0)
            L_0x0017:
                return
            L_0x0018:
                java.lang.String r4 = r6.getSavePath()
                if (r4 == 0) goto L_0x0042
                r1 = 0
                java.lang.String r0 = "/"
                boolean r1 = p4600h.p4622m.C89361p.m154876c(r4, r0, r1)
                r0 = 1
                if (r1 != r0) goto L_0x0042
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            L_0x0042:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = java.io.File.separator
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.replace.C59118c.C59120b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC59115a aVar = this.f134529a;
            if (aVar != null) {
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    str = null;
                }
                aVar.mo96626a(baseException, str, num);
            }
        }
    }

    /* renamed from: a */
    public static final void m108612a(List<String> list, String str, String str2, AbstractC59115a aVar) {
        List<String> list2;
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = C89086z.INSTANCE;
            }
            C59120b bVar = new C59120b(aVar);
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.f100637n = list2;
            with.f100626c = str2;
            with.f100629f = str;
            AbstractC43167a a = with.mo73399a(3).mo73406c().mo73400a("duet_react_video").mo73402a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
            a.f100601D = bVar;
            a.mo73409f();
        }
    }
}
