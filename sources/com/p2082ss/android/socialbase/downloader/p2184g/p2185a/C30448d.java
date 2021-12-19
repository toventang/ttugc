package com.p2082ss.android.socialbase.downloader.p2184g.p2185a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.g.a.d */
public final class C30448d implements AbstractC30462i {

    /* renamed from: a */
    protected final Object f72576a;

    /* renamed from: b */
    public final List<HttpHeader> f72577b;

    /* renamed from: c */
    long f72578c;

    /* renamed from: d */
    private AbstractC30462i f72579d;

    /* renamed from: e */
    private boolean f72580e;

    /* renamed from: f */
    private InputStream f72581f;

    static {
        Covode.recordClassIndex(36975);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: b */
    public final void mo54235b() {
        AbstractC30462i iVar = this.f72579d;
        if (iVar != null) {
            iVar.mo54235b();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
    /* renamed from: c */
    public final InputStream mo54237c() {
        InputStream inputStream = this.f72581f;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
    /* renamed from: d */
    public final void mo54238d() {
        AbstractC30462i iVar = this.f72579d;
        if (iVar != null) {
            iVar.mo54238d();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: a */
    public final int mo54233a() {
        AbstractC30462i iVar = this.f72579d;
        if (iVar != null) {
            return iVar.mo54233a();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo54239e() {
        MethodCollector.m26663i(11269);
        synchronized (this.f72576a) {
            try {
                if (this.f72580e && this.f72579d == null) {
                    this.f72576a.wait();
                }
            } finally {
                MethodCollector.m26664o(11269);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo54240f() {
        int a;
        try {
            AbstractC30462i iVar = this.f72579d;
            if (iVar == null || (a = iVar.mo54233a()) < 200 || a >= 300) {
                return false;
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: a */
    public final String mo54234a(String str) {
        AbstractC30462i iVar = this.f72579d;
        if (iVar != null) {
            return iVar.mo54234a(str);
        }
        return null;
    }
}
