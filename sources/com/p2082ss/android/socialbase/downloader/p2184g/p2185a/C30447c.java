package com.p2082ss.android.socialbase.downloader.p2184g.p2185a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.g.a.c */
public final class C30447c implements AbstractC30460g {

    /* renamed from: f */
    private static final ArrayList<String> f72567f;

    /* renamed from: a */
    public List<HttpHeader> f72568a;

    /* renamed from: b */
    public Map<String, String> f72569b;

    /* renamed from: c */
    long f72570c;

    /* renamed from: d */
    protected final Object f72571d;

    /* renamed from: e */
    boolean f72572e;

    /* renamed from: g */
    private int f72573g;

    /* renamed from: h */
    private boolean f72574h;

    /* renamed from: i */
    private AbstractC30460g f72575i;

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: a */
    public final int mo54233a() {
        return this.f72573g;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: b */
    public final void mo54235b() {
        AbstractC30460g gVar = this.f72575i;
        if (gVar != null) {
            gVar.mo54235b();
        }
    }

    /* renamed from: c */
    public final void mo54236c() {
        MethodCollector.m26663i(11694);
        synchronized (this.f72571d) {
            try {
                if (this.f72574h && this.f72569b == null) {
                    this.f72571d.wait();
                }
            } finally {
                MethodCollector.m26664o(11694);
            }
        }
    }

    static {
        Covode.recordClassIndex(36974);
        ArrayList<String> arrayList = new ArrayList<>(6);
        f72567f = arrayList;
        arrayList.add("Content-Length");
        arrayList.add("Content-Range");
        arrayList.add("Transfer-Encoding");
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
    /* renamed from: a */
    public final String mo54234a(String str) {
        Map<String, String> map = this.f72569b;
        if (map != null) {
            return map.get(str);
        }
        AbstractC30460g gVar = this.f72575i;
        if (gVar != null) {
            return gVar.mo54234a(str);
        }
        return null;
    }
}
