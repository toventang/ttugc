package com.p2082ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.VideoMedia;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper */
public final class ShareFromWebHelper {

    /* renamed from: a */
    public static final VideoInfoApi f141284a;

    /* renamed from: b */
    public static final ShareFromWebHelper f141285b = new ShareFromWebHelper();

    /* renamed from: c */
    private static final String f141286c;

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$VideoInfoApi */
    public interface VideoInfoApi {
        static {
            Covode.recordClassIndex(73019);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/tt4d/share/video/info/")
        C1731i<C62247b> getVideoInfo(@AbstractC89736t(mo144292a = "video_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$a */
    public static final class C62246a {
        @AbstractC27891c(mo46611a = "cdn_url")

        /* renamed from: a */
        public final String f141287a;

        static {
            Covode.recordClassIndex(73020);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C62246a) && C89219l.m154714a(this.f141287a, ((C62246a) obj).f141287a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f141287a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ShareVideoInfo(cdnUrl=" + this.f141287a + ")";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$b */
    public static final class C62247b {
        @AbstractC27891c(mo46611a = "status_code")

        /* renamed from: a */
        public final int f141288a;
        @AbstractC27891c(mo46611a = "video_info")

        /* renamed from: b */
        public final C62246a f141289b;

        static {
            Covode.recordClassIndex(73021);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62247b)) {
                return false;
            }
            C62247b bVar = (C62247b) obj;
            return this.f141288a == bVar.f141288a && C89219l.m154714a(this.f141289b, bVar.f141289b);
        }

        public final int hashCode() {
            int i = this.f141288a * 31;
            C62246a aVar = this.f141289b;
            return i + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "ShareVideoInfoResponse(statusCode=" + this.f141288a + ", videoInfo=" + this.f141289b + ")";
        }
    }

    private ShareFromWebHelper() {
    }

    static {
        Covode.recordClassIndex(73018);
        String str = "https://" + C17867d.f42587k.f42569a;
        f141286c = str;
        f141284a = (VideoInfoApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(VideoInfoApi.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$c */
    public static final class C62248c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ String f141290a;

        /* renamed from: b */
        final /* synthetic */ ProgressDialogC74145d f141291b;

        /* renamed from: c */
        final /* synthetic */ String f141292c;

        /* renamed from: d */
        final /* synthetic */ String f141293d;

        /* renamed from: e */
        final /* synthetic */ String f141294e;

        /* renamed from: f */
        final /* synthetic */ String f141295f;

        /* renamed from: g */
        final /* synthetic */ Context f141296g;

        static {
            Covode.recordClassIndex(73022);
        }

        public C62248c(String str, ProgressDialogC74145d dVar, String str2, String str3, String str4, String str5, Context context) {
            this.f141290a = str;
            this.f141291b = dVar;
            this.f141292c = str2;
            this.f141293d = str3;
            this.f141294e = str4;
            this.f141295f = str5;
            this.f141296g = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$c$a */
        public static final class C62249a extends AbstractC62280r {

            /* renamed from: a */
            final /* synthetic */ C62248c f141297a;

            static {
                Covode.recordClassIndex(73023);
            }

            C62249a(C62248c cVar) {
                this.f141297a = cVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.notification.utils.AbstractC62280r
            /* renamed from: a */
            public final void mo100255a(String str, String str2) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                super.mo100255a(str, str2);
                this.f141297a.f141291b.dismiss();
                final EditConfig.Builder mediaInfo = new EditConfig.Builder().mediaInfo(new VideoMedia(str2));
                mediaInfo.shootWay(this.f141297a.f141292c);
                mediaInfo.shareID(this.f141297a.f141293d);
                mediaInfo.channel(this.f141297a.f141294e);
                mediaInfo.hashtag(this.f141297a.f141295f);
                AVExternalServiceImpl.m113114a().asyncService(this.f141297a.f141296g, "upload", new SimpleServiceLoadCallback(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.utils.ShareFromWebHelper.C62248c.C62249a.C622501 */

                    /* renamed from: a */
                    final /* synthetic */ C62249a f141298a;

                    static {
                        Covode.recordClassIndex(73024);
                    }

                    {
                        this.f141298a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        C89219l.m154721d(asyncAVService, "");
                        asyncAVService.uiService().editService().startEdit(this.f141298a.f141297a.f141296g, mediaInfo.build());
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.notification.utils.AbstractC62280r
            /* renamed from: a */
            public final void mo100253a(int i, long j, long j2) {
                super.mo100253a(i, j, j2);
                ProgressDialogC74145d dVar = this.f141297a.f141291b;
                C89219l.m154716b(dVar, "");
                if (i >= 100) {
                    i = 100;
                }
                dVar.setProgress(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.notification.utils.AbstractC62280r
            /* renamed from: a */
            public final void mo100254a(Exception exc, String str, Integer num) {
                super.mo100254a(exc, str, num);
                this.f141297a.f141291b.dismiss();
                ShareFromWebHelper.m112601a(this.f141297a.f141296g);
            }
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            C62247b bVar = (C62247b) iVar.mo5545d();
            if (bVar == null) {
                this.f141291b.dismiss();
                ShareFromWebHelper.m112601a(this.f141296g);
                return null;
            } else if (bVar.f141288a == 0) {
                String str = bVar.f141289b.f141287a;
                String cacheDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir();
                String a = C89219l.m154704a(this.f141290a, (Object) ".mp4");
                C62251d dVar = new C62251d(new C62249a(this));
                AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                with.f100626c = a;
                with.f100629f = cacheDir;
                AbstractC43167a a2 = with.mo73399a(3).mo73402a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
                a2.f100601D = dVar;
                a2.mo73409f();
                return null;
            } else {
                this.f141291b.dismiss();
                ShareFromWebHelper.m112601a(this.f141296g);
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper$d */
    public static final class C62251d extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC62280r f141300a;

        static {
            Covode.recordClassIndex(73025);
        }

        C62251d(AbstractC62280r rVar) {
            this.f141300a = rVar;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            int i;
            long j;
            long j2;
            super.onProgress(downloadInfo);
            AbstractC62280r rVar = this.f141300a;
            if (rVar != null) {
                if (downloadInfo != null) {
                    i = downloadInfo.getDownloadProcess();
                    j = downloadInfo.getCurBytes();
                    j2 = downloadInfo.getTotalBytes();
                } else {
                    i = 0;
                    j = 0;
                    j2 = 100;
                }
                rVar.mo100253a(i, j, j2);
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
                com.ss.android.ugc.aweme.notification.utils.r r3 = r5.f141300a
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0011
                java.lang.String r2 = r6.getUrl()
                if (r2 != 0) goto L_0x0018
            L_0x0011:
                r2 = r0
                if (r6 != 0) goto L_0x0018
            L_0x0014:
                r3.mo100255a(r2, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.utils.ShareFromWebHelper.C62251d.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            AbstractC62280r rVar = this.f141300a;
            if (rVar != null) {
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    str = null;
                }
                rVar.mo100254a(baseException, str, num);
            }
        }
    }

    /* renamed from: a */
    public static void m112601a(Context context) {
        C89219l.m154721d(context, "");
        new C23144b((Activity) context).mo37635a(context.getResources().getString(R.string.fqk)).mo37637b();
    }
}
