package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.webkit.DownloadListener;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.e */
public final /* synthetic */ class C37984e implements DownloadListener {

    /* renamed from: a */
    private final DownloadBusiness f89767a;

    /* renamed from: b */
    private final AbstractC40746j f89768b;

    /* renamed from: c */
    private final Activity f89769c;

    static {
        Covode.recordClassIndex(45444);
    }

    C37984e(DownloadBusiness downloadBusiness, AbstractC40746j jVar, Activity activity) {
        this.f89767a = downloadBusiness;
        this.f89768b = jVar;
        this.f89769c = activity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f89767a.mo66193a(this.f89768b, this.f89769c, str, str2, str3, str4, j);
    }
}
