package com.p2082ss.android.ugc.aweme.p2335aq.p2337b;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p4243y.C81783d;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import java.io.File;
import java.util.Collection;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.aq.b.b */
public class C33923b extends AbstractC33927e {

    /* renamed from: a */
    public static final String f80232a = (C80720e.m139929c() + File.separator + "festival");

    /* renamed from: d */
    private static volatile C33923b f80233d;

    /* renamed from: b */
    public String f80234b;

    /* renamed from: c */
    public AbstractC33924a f80235c;

    /* renamed from: e */
    private String f80236e;

    /* renamed from: com.ss.android.ugc.aweme.aq.b.b$a */
    public interface AbstractC33924a {
        static {
            Covode.recordClassIndex(40843);
        }

        /* renamed from: a */
        void mo37120a();
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.p2335aq.p2337b.AbstractC33927e, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    private C33923b() {
        if (!C33918a.m69450a()) {
            m69466b(f80232a);
        } else {
            C80313cs.m139225a(f80232a, false);
        }
    }

    static {
        Covode.recordClassIndex(40842);
    }

    /* renamed from: a */
    public static C33923b m69462a() {
        MethodCollector.m26663i(4897);
        if (f80233d == null) {
            synchronized (C33923b.class) {
                try {
                    if (f80233d == null) {
                        f80233d = new C33923b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4897);
                    throw th;
                }
            }
        }
        C33923b bVar = f80233d;
        MethodCollector.m26664o(4897);
        return bVar;
    }

    /* renamed from: b */
    public static String m69465b() {
        UrlModel urlModel;
        C81783d d = C33918a.m69456d();
        if (d == null || (urlModel = d.f182894b) == null || C13603b.m24435a((Collection) urlModel.getUrlList())) {
            return null;
        }
        return urlModel.getUrlList().get(0);
    }

    /* renamed from: c */
    private static boolean m69467c() {
        File[] listFiles;
        StringBuilder sb = new StringBuilder();
        String str = f80232a;
        File file = new File(sb.append(str).append(File.separator).append(C13607d.m24442b(m69465b())).append(".zip").toString());
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str + File.separator + C13607d.m24442b(m69465b()));
        if (!file2.exists() || !file2.isDirectory() || (listFiles = file2.listFiles()) == null || listFiles.length == 0 || C33918a.m69455c()) {
            return false;
        }
        return m69464a(file, C33918a.m69453b().f182871e.f182893a);
    }

    /* renamed from: a */
    private void m69463a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            String str2 = f80232a;
            this.f80236e = sb.append(str2).append(File.separator).append(C13607d.m24442b(str)).toString();
            C80313cs.m139225a(str2, false);
            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            with.f100626c = C13607d.m24442b(str) + ".zip";
            AbstractC43167a a = with.mo73400a("legacy_festival_res").mo73399a(DownloadServiceManager.INSTANCE.getRetryExpCount());
            a.f100629f = str2;
            a.f100601D = this;
            a.mo73409f();
        }
    }

    /* renamed from: b */
    private static void m69466b(String str) {
        try {
            C80313cs.m139234c(str);
        } catch (NoSuchMethodError e) {
            C51423a.m95791b(3, null, "NoSuchMethodError in FestivalResDownloader-deleteFiles, path is " + str + ", error is " + e.getMessage());
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.p2335aq.p2337b.AbstractC33927e, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (!TextUtils.isEmpty(targetFilePath)) {
                File file = new File(targetFilePath);
                if (!C33918a.m69455c()) {
                    if (!m69464a(file, C33918a.m69453b().f182871e.f182893a)) {
                        m69466b(file.getPath());
                        return;
                    }
                    File file2 = new File(this.f80236e);
                    if (file2.exists() && file2.listFiles().length > 0) {
                        m69466b(file2.getPath());
                    }
                    File a = C80313cs.m139225a(this.f80236e, false);
                    try {
                        C84915u.m145938a(new File(targetFilePath), a);
                        this.f80234b = a.getPath();
                        if (this.f80235c != null) {
                            C1731i.m5640b(new CallableC33925c(this), C1731i.f5564c);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60161a(AbstractC33924a aVar) {
        if (!C33918a.m69450a()) {
            m69466b(f80232a);
            return;
        }
        this.f80235c = aVar;
        if (m69467c()) {
            this.f80234b = f80232a + File.separator + C13607d.m24442b(m69465b());
            AbstractC33924a aVar2 = this.f80235c;
            if (aVar2 != null) {
                aVar2.mo37120a();
                return;
            }
        }
        m69466b(f80232a);
        m69463a(m69465b());
    }

    /* renamed from: a */
    private static boolean m69464a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(C13607d.m24438a(file), str);
    }
}
