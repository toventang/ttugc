package com.p2082ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33741b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.gif.p3751ui.VideoShare2GifEditActivity;
import com.p2082ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import java.io.File;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.gif.b */
public final class C68935b implements AbstractC68942h {

    /* renamed from: a */
    FeedPanelStateViewModel f154219a;

    /* renamed from: b */
    ProgressDialogC74145d f154220b;

    static {
        Covode.recordClassIndex(81245);
    }

    /* renamed from: a */
    static void m121633a(Runnable runnable) {
        C1731i.m5640b(new CallableC68941g(runnable), C1731i.f5564c);
    }

    /* renamed from: a */
    static boolean m121634a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeACLShareInfo() == null || aweme.getAwemeACLShareInfo().getDownloadGeneral() == null || aweme.getAwemeACLShareInfo().getDownloadGeneral().getTranscode() == 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.gif.AbstractC68942h
    /* renamed from: a */
    public final void mo109492a(final Activity activity, final Aweme aweme, final String str, final String str2) {
        if (!activity.isFinishing()) {
            final String str3 = "";
            C89219l.m154721d(aweme, str3);
            String path = new File(C68932a.m121630a(), C68932a.m121631a(aweme)).getPath();
            C89219l.m154716b(path, str3);
            File file = new File(path);
            if (!file.exists() || file.length() <= 0) {
                if (activity instanceof ActivityC0945e) {
                    this.f154219a = (FeedPanelStateViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
                }
                if (!(aweme.getVideo() == null || aweme.getVideo().getPlayAddrH264() == null || aweme.getVideo().getPlayAddrH264().getUrlList() == null)) {
                    str3 = aweme.getVideo().getPlayAddrH264().getUrlList().get(0);
                }
                if (!TextUtils.isEmpty(str3)) {
                    File file2 = new File(path);
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdir();
                    }
                    Downloader.with(C17867d.m33078a()).url(str3).savePath(C68932a.m121630a()).name(C68932a.m121631a(aweme)).subThreadListener(new AbsDownloadListener() {
                        /* class com.p2082ss.android.ugc.aweme.share.gif.C68935b.C689361 */

                        static {
                            Covode.recordClassIndex(81246);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onStart(DownloadInfo downloadInfo) {
                            super.onStart(downloadInfo);
                            C68935b.m121633a(new RunnableC68940f(C68935b.this, activity));
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            super.onProgress(downloadInfo);
                            C68935b.m121633a(new RunnableC68939e(C68935b.this, (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes())));
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            String str;
                            super.onSuccessed(downloadInfo);
                            if (downloadInfo.getSavePath().endsWith("/")) {
                                str = downloadInfo.getSavePath() + downloadInfo.getName();
                            } else {
                                str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
                            }
                            C68935b.m121633a(new RunnableC68938d(C68935b.this, activity, aweme, str, str, str2));
                            C12290b.m22060a("aweme_download_error_rate", 0, new C33743c().mo59971a("tools_use_downloader", (Boolean) true).mo59976a("url", str3).mo59976a("from", "gifshare").mo59977a());
                            C33741b.m69070a(aweme, "gif", str3);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            String str;
                            super.onFailed(downloadInfo, baseException);
                            C68935b.m121633a(new RunnableC68937c(C68935b.this, activity));
                            if (baseException != null) {
                                str = C24098m.m45633c(baseException);
                            } else {
                                str = "null exception";
                            }
                            C12290b.m22060a("aweme_download_error_rate", 1, new C33743c().mo59971a("tools_use_downloader", (Boolean) true).mo59976a("url", str3).mo59976a("from", "gifshare").mo59976a("exception", str).mo59977a());
                        }
                    }).download();
                }
            } else if (!activity.isFinishing()) {
                VideoShare2GifEditActivity.m121638a(activity, aweme.getAid(), aweme.getAuthorUid(), m121634a(aweme), path, str, str2);
            }
        }
    }
}
