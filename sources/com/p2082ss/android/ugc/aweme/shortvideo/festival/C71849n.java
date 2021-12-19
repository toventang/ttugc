package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p4243y.C81776a;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.n */
public class C71849n extends AbsDownloadListener {

    /* renamed from: a */
    private static volatile C71849n f161019a;

    /* renamed from: b */
    private static final String f161020b;

    /* renamed from: c */
    private static final String f161021c;

    /* renamed from: d */
    private String f161022d = "";

    /* renamed from: e */
    private boolean f161023e;

    /* renamed from: f */
    private static C81776a.C81777a m126872f() {
        C81779c cVar = C71841f.f161004a.f161002b;
        if (cVar == null) {
            return null;
        }
        return cVar.f182872f;
    }

    /* renamed from: c */
    public final String mo113497c() {
        if (C71842g.m126860a()) {
            return this.f161022d;
        }
        return "";
    }

    static {
        Covode.recordClassIndex(84398);
        String shareDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().shareDir();
        f161020b = shareDir;
        f161021c = shareDir + "water" + File.separator;
    }

    /* renamed from: a */
    public static C71849n m126865a() {
        MethodCollector.m26663i(6929);
        if (f161019a == null) {
            synchronized (C71849n.class) {
                try {
                    if (f161019a == null) {
                        f161019a = new C71849n();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6929);
                    throw th;
                }
            }
        }
        C71849n nVar = f161019a;
        MethodCollector.m26664o(6929);
        return nVar;
    }

    /* renamed from: d */
    private boolean m126870d() {
        String e = m126871e();
        if (TextUtils.isEmpty(e)) {
            return false;
        }
        File file = new File(m126866a(e));
        if (!file.exists() || !file.isDirectory() || file.listFiles().length <= 0) {
            return false;
        }
        this.f161022d = file.getPath();
        return true;
    }

    /* renamed from: e */
    private static String m126871e() {
        UrlModel urlModel;
        C81776a.C81777a f = m126872f();
        if (f == null || f.f182859a == null || (urlModel = f.f182859a) == null || C13617h.m24465a(urlModel.getUrlList())) {
            return null;
        }
        return urlModel.getUrlList().get(0);
    }

    /* renamed from: b */
    public final void mo113496b() {
        if (!C71842g.m126860a()) {
            C80313cs.m139234c(f161021c);
        } else if (!m126870d() && !this.f161023e) {
            this.f161023e = true;
            this.f161022d = "";
            String str = f161021c;
            C80313cs.m139234c(str);
            C80313cs.m139225a(str, false);
            m126869b(m126871e());
        }
    }

    /* renamed from: a */
    private static String m126866a(String str) {
        return f161021c + m126867a(str, false);
    }

    /* renamed from: b */
    private void m126869b(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f100626c = m126867a(str, true);
            with.f100629f = f161021c;
            AbstractC43167a a = with.mo73399a(DownloadServiceManager.INSTANCE.getRetryExpCount());
            a.f100601D = this;
            a.mo73409f();
        }
    }

    /* renamed from: a */
    private static boolean m126868a(File file) {
        MethodCollector.m26663i(7081);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7081);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7081);
        return delete;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        String url = downloadInfo.getUrl();
        StringBuilder sb = new StringBuilder();
        String str = f161021c;
        File file = new File(sb.append(str).append(m126867a(url, true)).toString());
        if (m126872f() != null) {
            String str2 = m126872f().f182860b;
            if (file.exists() && TextUtils.equals(C13607d.m24438a(file), str2)) {
                String a = m126866a(downloadInfo.getUrl());
                C80313cs.m139225a(a, false);
                File file2 = new File(a);
                if (!file2.exists() || !file2.isDirectory() || file2.listFiles().length <= 0) {
                    try {
                        C84915u.m145938a(file, file2);
                        if (file.exists()) {
                            m126868a(file);
                        }
                        this.f161022d = file2.getPath();
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    this.f161022d = file2.getPath();
                    return;
                }
            }
        }
        C80313cs.m139234c(str);
    }

    /* renamed from: a */
    private static String m126867a(String str, boolean z) {
        String b = C13607d.m24442b(str);
        if (z) {
            return b + ".zip";
        }
        return b;
    }
}
