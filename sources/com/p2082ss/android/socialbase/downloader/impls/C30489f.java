package com.p2082ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30461h;
import com.p2082ss.android.socialbase.downloader.p2189k.C30528a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.IOException;
import java.util.List;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90049e;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.Request;

/* renamed from: com.ss.android.socialbase.downloader.impls.f */
public final class C30489f implements AbstractC30461h {
    static {
        Covode.recordClassIndex(37017);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30461h
    /* renamed from: a */
    public final AbstractC30460g mo54249a(String str, List<HttpHeader> list) {
        C90208y m = C30399c.m61729m();
        if (m != null) {
            Request.C90016a a = new Request.C90016a().mo144691a(str).mo144693a("HEAD", (AbstractC90025ab) null);
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    a.mo144700b(httpHeader.f72990a, C30535g.m62598d(httpHeader.f72991b));
                }
            }
            final C90022aa a2 = C90022aa.m156235a(m, a.mo144698a(), false);
            final C90029ac b = a2.mo144709b();
            if (b != null) {
                if (C30528a.m62524a(2097152)) {
                    b.close();
                }
                return new AbstractC30460g() {
                    /* class com.p2082ss.android.socialbase.downloader.impls.C30489f.C304901 */

                    static {
                        Covode.recordClassIndex(37018);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: a */
                    public final int mo54233a() {
                        return b.f204107c;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: b */
                    public final void mo54235b() {
                        AbstractC90049e eVar = a2;
                        if (eVar != null && !eVar.mo144712d()) {
                            a2.mo144710c();
                        }
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: a */
                    public final String mo54234a(String str) {
                        return b.mo144718a(str, null);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
