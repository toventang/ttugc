package com.p2082ss.android.socialbase.downloader.p2181d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.ss.android.socialbase.downloader.d.f */
public final class C30331f implements AbstractC30330e {

    /* renamed from: a */
    private Uri f72354a;

    /* renamed from: b */
    private int f72355b;

    /* renamed from: c */
    private boolean f72356c;

    static {
        Covode.recordClassIndex(36843);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53838a(long j) {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final boolean mo53839a(C30325a aVar) {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: c */
    public final boolean mo53841c() {
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: e */
    public final String mo53843e() {
        return "";
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: f */
    public final boolean mo53844f() {
        return true;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: g */
    public final File mo53845g() {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: h */
    public final long mo53846h() {
        return 0;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: k */
    public final File mo53849k() {
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: l */
    public final String mo53850l() {
        return "";
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: o */
    public final String mo53853o() {
        return "";
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: m */
    public final int mo53851m() {
        return this.f72355b;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: a */
    public final long mo53837a() {
        return C30326b.m61484a(this.f72354a);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: b */
    public final boolean mo53840b() {
        if (C30326b.m61484a(this.f72354a) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: d */
    public final boolean mo53842d() {
        MethodCollector.m26663i(8555);
        try {
            if (this.f72356c) {
                boolean a = C30326b.m61487a(mo53848j());
                MethodCollector.m26664o(8555);
                return a;
            }
            C30399c.m61674B().getContentResolver().delete(this.f72354a, null, null);
            MethodCollector.m26664o(8555);
            return false;
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: i */
    public final FileInputStream mo53847i() {
        MethodCollector.m26663i(8404);
        if (this.f72354a != null) {
            FileInputStream fileInputStream = new FileInputStream(C30326b.m61485a(this.f72354a, "r"));
            MethodCollector.m26664o(8404);
            return fileInputStream;
        }
        IOException iOException = new IOException("Fail to obtain InputStream, uri is null");
        MethodCollector.m26664o(8404);
        throw iOException;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2181d.AbstractC30330e
    /* renamed from: j */
    public final FileOutputStream mo53848j() {
        MethodCollector.m26663i(8553);
        if (this.f72354a != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(C30326b.m61485a(this.f72354a, "w"));
            MethodCollector.m26664o(8553);
            return fileOutputStream;
        }
        IOException iOException = new IOException("Fail to obtain OutputStream, uri is null");
        MethodCollector.m26664o(8553);
        throw iOException;
    }

    public C30331f(Uri uri, int i, boolean z) {
        this.f72354a = uri;
        this.f72355b = i;
        this.f72356c = z;
    }
}
