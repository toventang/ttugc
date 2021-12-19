package com.p2082ss.android.ugc.aweme.livewallpaper.p3414b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f */
public final class C58844f {

    /* renamed from: a */
    public ProgressDialogC74145d f133946a;

    /* renamed from: b */
    public String f133947b = "";

    /* renamed from: c */
    public Handler f133948c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public AbstractC58850g f133949d;

    /* renamed from: e */
    public final Activity f133950e;

    static {
        Covode.recordClassIndex(69158);
    }

    /* renamed from: c */
    private final void m108070c() {
        C80720e.m139931c(this.f133947b);
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$a */
    public static final class C58845a extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C58844f f133951a;

        /* renamed from: b */
        final /* synthetic */ String f133952b;

        static {
            Covode.recordClassIndex(69159);
        }

        /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$a$a */
        static final class RunnableC58846a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C58845a f133953a;

            /* renamed from: b */
            final /* synthetic */ int f133954b;

            static {
                Covode.recordClassIndex(69160);
            }

            RunnableC58846a(C58845a aVar, int i) {
                this.f133953a = aVar;
                this.f133954b = i;
            }

            public final void run() {
                ProgressDialogC74145d dVar = this.f133953a.f133951a.f133946a;
                if (dVar != null) {
                    dVar.setProgress(this.f133954b);
                }
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                long totalBytes = downloadInfo.getTotalBytes();
                if (totalBytes > 0) {
                    C29339a.m58754b(new RunnableC58846a(this, (int) ((((float) downloadInfo.getCurBytes()) / ((float) totalBytes)) * 100.0f)));
                }
            }
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String targetFilePath;
            if (downloadInfo == null || (targetFilePath = downloadInfo.getTargetFilePath()) == null || targetFilePath.length() == 0) {
                this.f133951a.mo96247a();
                return;
            }
            C80720e.m139932c(targetFilePath, this.f133952b);
            this.f133951a.mo96248a(this.f133952b);
        }

        public C58845a(C58844f fVar, String str) {
            this.f133951a = fVar;
            this.f133952b = str;
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f133951a.mo96247a();
        }
    }

    /* renamed from: a */
    public final void mo96247a() {
        m108070c();
        C29339a.m58754b(new RunnableC58847b(this));
    }

    /* renamed from: b */
    public final void mo96249b() {
        ProgressDialogC74145d dVar = this.f133946a;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f133946a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$c */
    public static final class RunnableC58848c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58844f f133956a;

        /* renamed from: b */
        final /* synthetic */ String f133957b;

        static {
            Covode.recordClassIndex(69162);
        }

        RunnableC58848c(C58844f fVar, String str) {
            this.f133956a = fVar;
            this.f133957b = str;
        }

        public final void run() {
            if (!this.f133956a.f133950e.isFinishing()) {
                this.f133956a.mo96249b();
                AbstractC58850g gVar = this.f133956a.f133949d;
                if (gVar != null) {
                    gVar.mo96255a(this.f133957b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$d */
    public static final class RunnableC58849d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58844f f133958a;

        static {
            Covode.recordClassIndex(69163);
        }

        public RunnableC58849d(C58844f fVar) {
            this.f133958a = fVar;
        }

        public final void run() {
            ProgressDialogC74145d dVar = this.f133958a.f133946a;
            if (dVar != null && dVar.getProgress() == 0) {
                this.f133958a.mo96247a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.f$b */
    public static final class RunnableC58847b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58844f f133955a;

        static {
            Covode.recordClassIndex(69161);
        }

        RunnableC58847b(C58844f fVar) {
            this.f133955a = fVar;
        }

        public final void run() {
            if (!this.f133955a.f133950e.isFinishing()) {
                this.f133955a.mo96249b();
                new C79459a(this.f133955a.f133950e).mo123050a(R.string.bba).mo123053a();
                AbstractC58850g gVar = this.f133955a.f133949d;
                if (gVar != null) {
                    gVar.mo96254a();
                }
            }
        }
    }

    public C58844f(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f133950e = activity;
    }

    /* renamed from: a */
    public final void mo96248a(String str) {
        m108070c();
        C29339a.m58754b(new RunnableC58848c(this, str));
    }
}
