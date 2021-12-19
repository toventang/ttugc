package com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68190n;
import com.p2082ss.android.ugc.aweme.setting.C68340s;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80872d;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.io.File;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.d */
public final class C72733d {

    /* renamed from: a */
    public static final C72733d f163063a = new C72733d();

    private C72733d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.d$b */
    public static final class C72735b implements LocalVideoPlayerManager.AbstractC80753a {

        /* renamed from: a */
        final /* synthetic */ AbstractC72729a f163071a;

        /* renamed from: b */
        final /* synthetic */ String f163072b;

        /* renamed from: c */
        final /* synthetic */ List f163073c;

        /* renamed from: d */
        final /* synthetic */ String f163074d;

        /* renamed from: e */
        final /* synthetic */ String f163075e;

        static {
            Covode.recordClassIndex(85420);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96628a() {
            C72733d.m128231a(this.f163073c, this.f163074d, this.f163075e, this.f163071a);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AbstractC80753a
        /* renamed from: a */
        public final void mo96629a(String str) {
            File file = new File(str);
            RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_success");
            AbstractC72729a aVar = this.f163071a;
            if (aVar != null) {
                aVar.f163059c = System.currentTimeMillis();
            }
            AbstractC72729a aVar2 = this.f163071a;
            if (aVar2 != null) {
                aVar2.mo113578a(100, file.length(), file.length());
            }
            AbstractC72729a aVar3 = this.f163071a;
            if (aVar3 != null) {
                aVar3.mo113580a("local", this.f163072b);
            }
        }

        C72735b(AbstractC72729a aVar, String str, List list, String str2, String str3) {
            this.f163071a = aVar;
            this.f163072b = str;
            this.f163073c = list;
            this.f163074d = str2;
            this.f163075e = str3;
        }
    }

    static {
        Covode.recordClassIndex(85418);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.d$a */
    public static final class C72734a implements AbstractC80872d {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f163064a;

        /* renamed from: b */
        final /* synthetic */ String f163065b;

        /* renamed from: c */
        final /* synthetic */ AbstractC72729a f163066c;

        /* renamed from: d */
        final /* synthetic */ String f163067d;

        /* renamed from: e */
        final /* synthetic */ List f163068e;

        /* renamed from: f */
        final /* synthetic */ String f163069f;

        /* renamed from: g */
        final /* synthetic */ String f163070g;

        static {
            Covode.recordClassIndex(85419);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80872d
        /* renamed from: a */
        public final void mo115013a() {
            C73991bj.m130128a("DuetVideoDownloader - copy video cache: error");
            C72733d.m128231a(this.f163068e, this.f163069f, this.f163070g, this.f163066c);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80872d
        /* renamed from: a */
        public final void mo115014a(boolean z) {
            if (z) {
                C73991bj.m130128a("DuetVideoDownloader - copy video cache: success, isDuplicateCall: " + this.f163064a.element);
                if (!this.f163064a.element) {
                    File file = new File(this.f163065b);
                    AbstractC72729a aVar = this.f163066c;
                    if (aVar != null) {
                        aVar.mo113578a(100, file.length(), file.length());
                    }
                    AbstractC72729a aVar2 = this.f163066c;
                    if (aVar2 != null) {
                        aVar2.mo113580a(this.f163067d, this.f163065b);
                    }
                }
                this.f163064a.element = true;
                return;
            }
            C73991bj.m130128a("DuetVideoDownloader - copy video cache: fail");
            C72733d.m128231a(this.f163068e, this.f163069f, this.f163070g, this.f163066c);
        }

        C72734a(C89233z.C89234a aVar, String str, AbstractC72729a aVar2, String str2, List list, String str3, String str4) {
            this.f163064a = aVar;
            this.f163065b = str;
            this.f163066c = aVar2;
            this.f163067d = str2;
            this.f163068e = list;
            this.f163069f = str3;
            this.f163070g = str4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.d$c */
    public static final class C72736c extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC72729a f163076a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f163077b;

        static {
            Covode.recordClassIndex(85421);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            AbstractC72729a aVar = this.f163076a;
            if (aVar != null) {
                aVar.f163059c = System.currentTimeMillis();
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            AbstractC72729a aVar;
            int i;
            long j;
            long j2;
            super.onProgress(downloadInfo);
            AbstractC72729a aVar2 = this.f163076a;
            if (aVar2 != null) {
                if (downloadInfo != null) {
                    i = downloadInfo.getDownloadProcess();
                    j = downloadInfo.getCurBytes();
                    j2 = downloadInfo.getTotalBytes();
                } else {
                    i = 0;
                    j = 0;
                    j2 = 100;
                }
                aVar2.mo113578a(i, j, j2);
            }
            if (C68190n.m120442a() && C68340s.m120620a() && (aVar = this.f163076a) != null && aVar.mo113581a()) {
                DownloadServiceManager.INSTANCE.getDownloadService().cancel(this.f163077b.element);
                this.f163076a.mo113579a((Exception) null, "download canceled by user", (Integer) null);
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
                com.ss.android.ugc.aweme.shortvideo.reaction.a.a r3 = r5.f163076a
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0011
                java.lang.String r2 = r6.getUrl()
                if (r2 != 0) goto L_0x0018
            L_0x0011:
                r2 = r0
                if (r6 != 0) goto L_0x0018
            L_0x0014:
                r3.mo113580a(r2, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.C72733d.C72736c.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        C72736c(AbstractC72729a aVar, C89233z.C89236c cVar) {
            this.f163076a = aVar;
            this.f163077b = cVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC72729a aVar = this.f163076a;
            if (aVar != null) {
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    str = null;
                }
                aVar.mo113579a(baseException, str, num);
            }
        }
    }

    /* renamed from: a */
    public static final void m128231a(List<String> list, String str, String str2, AbstractC72729a aVar) {
        List<String> list2;
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = C89086z.INSTANCE;
            }
            C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = -1;
            C72736c cVar2 = new C72736c(aVar, cVar);
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.f100637n = list2;
            with.f100626c = str2;
            with.f100629f = str;
            AbstractC43167a a = with.mo73399a(3).mo73406c().mo73400a("duet_react_video").mo73402a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
            a.f100601D = cVar2;
            cVar.element = a.mo73409f();
        }
    }

    /* renamed from: a */
    public static final void m128230a(Aweme aweme, List<String> list, String str, String str2, AbstractC72729a aVar) {
        String str3;
        String str4 = "";
        C89219l.m154721d(aweme, str4);
        C89219l.m154721d(list, str4);
        if (str == null || !C89361p.m154876c(str, "/", false)) {
            str3 = str + File.separator + str2;
        } else {
            str3 = str + str2;
        }
        if (LocalVideoPlayerManager.m140055a().mo123961a(aweme.getAid(), str3, new C72735b(aVar, str3, list, str, str2))) {
            return;
        }
        if (!C68190n.m120442a() || (!C87007u.m150698a(aVar.f163060d, "duet") && !C87007u.m150698a(aVar.f163060d, "duet_page"))) {
            C73991bj.m130128a("DuetVideoDownloader - video cache not used");
            m128231a(list, str, str2, aVar);
            return;
        }
        C73991bj.m130128a("DuetVideoDownloader - try use video cache");
        if (!list.isEmpty()) {
            str4 = list.get(0);
        }
        C89233z.C89234a aVar2 = new C89233z.C89234a();
        aVar2.element = false;
        C80662ac.m139884a(aweme, str3, new C72734a(aVar2, str3, aVar, str4, list, str, str2));
    }
}
