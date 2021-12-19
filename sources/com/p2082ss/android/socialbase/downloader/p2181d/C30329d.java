package com.p2082ss.android.socialbase.downloader.p2181d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.ss.android.socialbase.downloader.d.d */
final class C30329d implements AbstractC30330e {

    /* renamed from: a */
    private File f72352a;

    /* renamed from: b */
    private boolean f72353b = true;

    static {
        Covode.recordClassIndex(36841);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: m */
    public final int mo53851m() {
        return 1;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: o */
    public final String mo53853o() {
        return "";
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: g */
    public final File mo53845g() {
        return this.f72352a;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final long mo53837a() {
        return this.f72352a.length();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: b */
    public final boolean mo53840b() {
        return this.f72352a.exists();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: c */
    public final boolean mo53841c() {
        return this.f72352a.isDirectory();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: e */
    public final String mo53843e() {
        return this.f72352a.getPath();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: f */
    public final boolean mo53844f() {
        return this.f72352a.canWrite();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: h */
    public final long mo53846h() {
        return this.f72352a.lastModified();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: k */
    public final File mo53849k() {
        return this.f72352a.getParentFile();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: l */
    public final String mo53850l() {
        return this.f72352a.getCanonicalPath();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: d */
    public final boolean mo53842d() {
        if (!this.f72353b) {
            return true;
        }
        return m61506a(this.f72352a);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: j */
    public final FileOutputStream mo53848j() {
        MethodCollector.m26663i(10387);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f72352a);
        MethodCollector.m26664o(10387);
        return fileOutputStream;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: i */
    public final FileInputStream mo53847i() {
        MethodCollector.m26663i(10385);
        if (this.f72352a.isFile()) {
            FileInputStream fileInputStream = new FileInputStream(this.f72352a);
            MethodCollector.m26664o(10385);
            return fileInputStream;
        }
        IOException iOException = new IOException("Fail to obtain InputStream, file type error");
        MethodCollector.m26664o(10385);
        throw iOException;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53838a(long j) {
        return this.f72352a.setLastModified(j);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53839a(C30325a aVar) {
        MethodCollector.m26663i(10532);
        if (aVar.mo53852n()) {
            boolean renameTo = this.f72352a.renameTo(aVar.mo53845g());
            MethodCollector.m26664o(10532);
            return renameTo;
        }
        MethodCollector.m26664o(10532);
        return false;
    }

    /* renamed from: a */
    private static boolean m61506a(File file) {
        MethodCollector.m26663i(9007);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(9007);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(9007);
        return delete;
    }

    public C30329d(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            this.f72352a = new File(str, str2);
        } else {
            this.f72352a = new File(str);
        }
        if (z) {
            this.f72353b = C30535g.m62605e(str);
        }
    }
}
