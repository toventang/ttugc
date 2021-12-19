package com.p2082ss.android.socialbase.downloader.impls;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30458e;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30580i;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90189o;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.Request;

/* renamed from: com.ss.android.socialbase.downloader.impls.g */
public final class C30491g implements AbstractC30463j {

    /* renamed from: a */
    private final C30580i<String, C90208y> f72698a = new C30580i<>(4, 8);

    static {
        Covode.recordClassIndex(37019);
    }

    /* renamed from: a */
    private C90208y m62195a(String str, final String str2) {
        MethodCollector.m26663i(9687);
        try {
            final String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                String str3 = host + "_" + str2;
                synchronized (this.f72698a) {
                    try {
                        C90208y yVar = (C90208y) this.f72698a.get(str3);
                        if (yVar != null) {
                            return yVar;
                        }
                        C90208y.C90210a n = C30399c.m61730n();
                        n.mo145094a(new AbstractC90189o() {
                            /* class com.p2082ss.android.socialbase.downloader.impls.C30491g.C304932 */

                            static {
                                Covode.recordClassIndex(37021);
                            }

                            @Override // okhttp3.AbstractC90189o
                            /* renamed from: a */
                            public final List<InetAddress> mo23717a(String str) {
                                if (TextUtils.equals(host, str)) {
                                    return Collections.singletonList(InetAddress.getByName(str2));
                                }
                                return AbstractC90189o.f204843d.mo23717a(str);
                            }
                        });
                        C90208y d = n.mo145103d();
                        synchronized (this.f72698a) {
                            try {
                                this.f72698a.put(str3, d);
                            } finally {
                                MethodCollector.m26664o(9687);
                            }
                        }
                        return d;
                    } finally {
                        MethodCollector.m26664o(9687);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C90208y m = C30399c.m61729m();
        MethodCollector.m26664o(9687);
        return m;
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j
    /* renamed from: a */
    public final AbstractC30462i mo54250a(String str, List<HttpHeader> list) {
        String str2;
        C90208y m;
        final InputStream inputStream;
        MethodCollector.m26663i(9685);
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (list == null || list.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (HttpHeader httpHeader : list) {
                String str3 = httpHeader.f72990a;
                if (str2 != null || !"ss_d_request_host_ip_114".equals(str3)) {
                    a.mo144700b(str3, C30535g.m62598d(httpHeader.f72991b));
                } else {
                    str2 = httpHeader.f72991b;
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            m = m62195a(str, str2);
        } else {
            m = C30399c.m61729m();
        }
        if (m != null) {
            final C90022aa a2 = C90022aa.m156235a(m, a.mo144698a(), false);
            final C90029ac b = a2.mo144709b();
            if (b != null) {
                final AbstractC90031ad adVar = b.f204111g;
                if (adVar != null) {
                    InputStream byteStream = adVar.byteStream();
                    String a3 = b.mo144718a("Content-Encoding", null);
                    if (a3 == null || !"gzip".equalsIgnoreCase(a3) || (byteStream instanceof GZIPInputStream)) {
                        inputStream = byteStream;
                    } else {
                        inputStream = new GZIPInputStream(byteStream);
                    }
                    C304921 r1 = new AbstractC30458e() {
                        /* class com.p2082ss.android.socialbase.downloader.impls.C30491g.C304921 */

                        static {
                            Covode.recordClassIndex(37020);
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30442a
                        /* renamed from: e */
                        public final String mo54229e() {
                            return "";
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                        /* renamed from: c */
                        public final InputStream mo54237c() {
                            return inputStream;
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

                        @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                        /* renamed from: d */
                        public final void mo54238d() {
                            try {
                                AbstractC90031ad adVar = adVar;
                                if (adVar != null) {
                                    adVar.close();
                                }
                                AbstractC90049e eVar = a2;
                                if (eVar != null && !eVar.mo144712d()) {
                                    a2.mo144710c();
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                        /* renamed from: a */
                        public final String mo54234a(String str) {
                            return b.mo144718a(str, null);
                        }
                    };
                    MethodCollector.m26664o(9685);
                    return r1;
                }
                MethodCollector.m26664o(9685);
                return null;
            }
            IOException iOException = new IOException("can't get response");
            MethodCollector.m26664o(9685);
            throw iOException;
        }
        IOException iOException2 = new IOException("can't get httpClient");
        MethodCollector.m26664o(9685);
        throw iOException2;
    }
}
