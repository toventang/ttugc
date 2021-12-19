package com.p2082ss.android.ugc.aweme.livewallpaper.p3414b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33741b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.a */
public abstract class AbstractC58829a {

    /* renamed from: a */
    protected Aweme f133917a;

    /* renamed from: b */
    protected Activity f133918b;

    /* renamed from: c */
    protected ProgressDialogC74145d f133919c;

    /* renamed from: d */
    protected String f133920d;

    /* renamed from: e */
    protected String f133921e;

    /* renamed from: f */
    protected String f133922f;

    /* renamed from: g */
    protected String f133923g;

    /* renamed from: h */
    protected String f133924h;

    /* renamed from: i */
    public int f133925i;

    /* renamed from: j */
    public Runnable f133926j = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a.RunnableC588301 */

        static {
            Covode.recordClassIndex(69144);
        }

        public final void run() {
            if (AbstractC58829a.this.f133919c != null) {
                ProgressDialogC74145d dVar = AbstractC58829a.this.f133919c;
                int i = 100;
                if (AbstractC58829a.this.f133925i < 100) {
                    i = AbstractC58829a.this.f133925i;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: k */
    private Handler f133927k = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(69143);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo96230b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo96231b(Aweme aweme);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo96232c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo96233d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo96234e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo96235f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96226a() {
        C80720e.m139931c(this.f133923g);
    }

    /* renamed from: g */
    private static boolean mo96241g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo96229b() {
        ProgressDialogC74145d dVar = this.f133919c;
        if (dVar != null) {
            try {
                dVar.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f133919c = null;
        }
    }

    protected AbstractC58829a(Activity activity) {
        this.f133918b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96228a(String str) {
        if (this.f133919c == null) {
            ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(this.f133918b, str);
            this.f133919c = a;
            a.setIndeterminate(false);
        }
        this.f133919c.setProgress(0);
    }

    /* renamed from: a */
    public final void mo96227a(Aweme aweme) {
        if (aweme != null) {
            if ((aweme.getAuthor() == null || !TextUtils.equals(C31575b.m65865g().getCurUserId(), aweme.getAuthorUid())) && aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 1) {
                new C79459a(this.f133918b).mo123050a(R.string.h6y).mo123053a();
            } else {
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = mo96241g();
                }
                if (!C58029j.f132256h) {
                    new C79459a(this.f133918b).mo123052a(this.f133918b.getString(R.string.fg_)).mo123053a();
                } else if (mo96231b(aweme)) {
                    this.f133917a = aweme;
                    mo96232c();
                    if (C80720e.m139927b(this.f133924h)) {
                        mo96234e();
                        mo96229b();
                        return;
                    }
                    mo96228a(mo96233d());
                    C588312 r2 = new AbsDownloadListener() {
                        /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a.C588312 */

                        static {
                            Covode.recordClassIndex(69145);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onProgress(DownloadInfo downloadInfo) {
                            if (AbstractC58829a.this.f133918b != null && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
                                AbstractC58829a.this.f133925i = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
                                C29339a.m58754b(AbstractC58829a.this.f133926j);
                            }
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            String groupId;
                            AbstractC58829a.this.mo96230b(downloadInfo.getTargetFilePath());
                            C33741b.m69070a(AbstractC58829a.this.f133917a, "live_photo", AbstractC58829a.this.f133920d);
                            if (AbstractC58829a.this.f133917a == null) {
                                groupId = "-1";
                            } else {
                                groupId = AbstractC58829a.this.f133917a.getGroupId();
                            }
                            C58901f.m108234b("share", groupId, true);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            String groupId;
                            String str;
                            if (AbstractC58829a.this.f133918b != null) {
                                AbstractC58829a.this.mo96235f();
                                if (baseException != null) {
                                    if (AbstractC58829a.this.f133917a == null || AbstractC58829a.this.f133917a.getVideo() == null || TextUtils.isEmpty(AbstractC58829a.this.f133917a.getAid()) || TextUtils.isEmpty(AbstractC58829a.this.f133917a.getVideo().getVideoId())) {
                                        str = "";
                                    } else {
                                        str = "aid " + AbstractC58829a.this.f133917a.getAid() + " vid " + AbstractC58829a.this.f133917a.getVideo().getVideoId();
                                    }
                                    C58901f.m108232b(1, "download video fail " + str + baseException.getErrorMessage() + " error code " + baseException.getErrorCode());
                                }
                                if (AbstractC58829a.this.f133917a == null) {
                                    groupId = "-1";
                                } else {
                                    groupId = AbstractC58829a.this.f133917a.getGroupId();
                                }
                                C58901f.m108234b("share", groupId, false);
                            }
                        }
                    };
                    AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f133920d);
                    with.f100626c = this.f133922f + ".mp4";
                    with.f100629f = this.f133921e + "temp";
                    AbstractC43167a a = with.mo73399a(3).mo73400a("live_wall_paper_share").mo73402a(true);
                    a.f100601D = r2;
                    a.mo73409f();
                    C58901f.m108223a("share");
                    this.f133927k.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3414b.AbstractC58829a.RunnableC588323 */

                        static {
                            Covode.recordClassIndex(69146);
                        }

                        public final void run() {
                            if (AbstractC58829a.this.f133925i == 0) {
                                AbstractC58829a.this.mo96235f();
                                C58901f.m108232b(1, "timeout download video");
                            }
                        }
                    }, 60000);
                    return;
                }
            }
        }
        mo96229b();
    }
}
