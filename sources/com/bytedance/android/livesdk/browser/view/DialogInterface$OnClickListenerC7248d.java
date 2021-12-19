package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.browser.view.d */
final /* synthetic */ class DialogInterface$OnClickListenerC7248d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7244b f18047a;

    /* renamed from: b */
    private final Context f18048b;

    /* renamed from: c */
    private final String f18049c;

    static {
        Covode.recordClassIndex(7996);
    }

    DialogInterface$OnClickListenerC7248d(C7244b bVar, Context context, String str) {
        this.f18047a = bVar;
        this.f18048b = context;
        this.f18049c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7244b bVar = this.f18047a;
        Context context = this.f18048b;
        String str = this.f18049c;
        if (context != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            String sb2 = sb.append(C58016d.f132221b.getAbsolutePath()).append("/webview/").toString();
            Downloader.with(context).url(str).name("long_click_img.tmp").savePath(sb2).mainThreadListener(new AbsDownloadListener(context, str, sb2, "long_click_img.tmp") {
                /* class com.bytedance.android.livesdk.browser.view.C7244b.C72451 */

                /* renamed from: a */
                final /* synthetic */ Context f18037a;

                /* renamed from: b */
                final /* synthetic */ String f18038b;

                /* renamed from: c */
                final /* synthetic */ String f18039c;

                /* renamed from: d */
                final /* synthetic */ String f18040d;

                static {
                    Covode.recordClassIndex(7993);
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    if (downloadInfo != null && downloadInfo.getTargetFilePath() != null) {
                        if (TextUtils.isEmpty(downloadInfo.getTargetFilePath())) {
                            C11226ao.m19883a(C3966y.m9669e(), "Failed to save image", 0);
                            return;
                        }
                        C7244b bVar = C7244b.this;
                        Context context = this.f18037a;
                        String str = this.f18038b;
                        String str2 = this.f18039c + this.f18040d;
                        ActivityC0945e a = C11279p.m20001a(context);
                        if (a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                            C11226ao.m19883a(C3966y.m9669e(), "Failed to save image", 0);
                        } else {
                            C6670f.m14183a(a).mo12816a(new AbstractC6656d(str2, str, context) {
                                /* class com.bytedance.android.livesdk.browser.view.C7244b.C72462 */

                                /* renamed from: a */
                                final /* synthetic */ String f18042a;

                                /* renamed from: b */
                                final /* synthetic */ String f18043b;

                                /* renamed from: c */
                                final /* synthetic */ Context f18044c;

                                static {
                                    Covode.recordClassIndex(7994);
                                }

                                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                                /* renamed from: b */
                                public final void mo11014b(String... strArr) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("refuse_permission", strArr);
                                    C3868c.m9491a("ttlive_replay_permission", 1, hashMap);
                                }

                                /* renamed from: a */
                                private static boolean m15162a(File file) {
                                    MethodCollector.m26663i(9312);
                                    try {
                                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                                        }
                                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                                            MethodCollector.m26664o(9312);
                                            return false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    boolean delete = file.delete();
                                    MethodCollector.m26664o(9312);
                                    return delete;
                                }

                                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0090, code lost:
                                    if (r4 != null) goto L_0x0092;
                                 */
                                /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
                                    r4.close();
                                 */
                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0089 */
                                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                                /* renamed from: a */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void mo11013a(java.lang.String... r10) {
                                    /*
                                    // Method dump skipped, instructions count: 185
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.view.C7244b.C72462.mo11013a(java.lang.String[]):void");
                                }

                                {
                                    this.f18042a = r2;
                                    this.f18043b = r3;
                                    this.f18044c = r4;
                                }
                            }, "android.permission.WRITE_EXTERNAL_STORAGE");
                        }
                    }
                }

                @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C11226ao.m19883a(C3966y.m9669e(), "Failed to save image", 0);
                }

                {
                    this.f18037a = r2;
                    this.f18038b = r3;
                    this.f18039c = r4;
                    this.f18040d = r5;
                }
            }).download();
        }
    }
}
