package com.p2082ss.android.ugc.aweme.app.p2324e.p2325a;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30442a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;
import com.p2082ss.android.socialbase.ttnet.IDownloadApi;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2327c.C33738a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ss.android.ugc.aweme.app.e.a.c */
public final class C33733c implements AbstractC30463j {

    /* renamed from: a */
    IDownloadApi f79897a;

    static {
        Covode.recordClassIndex(40628);
    }

    /* renamed from: a */
    private static String m69053a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C1764a.m5928a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j
    /* renamed from: a */
    public final AbstractC30462i mo54250a(String str, List<HttpHeader> list) {
        final InputStream inputStream;
        String str2;
        MethodCollector.m26663i(5965);
        final long currentTimeMillis = System.currentTimeMillis();
        if (!C30128d.m60946a(str)) {
            MethodCollector.m26664o(5965);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        final String str3 = "";
        boolean z = false;
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (TextUtils.equals(httpHeader.f72990a, "downloader_scene")) {
                    str3 = httpHeader.f72991b;
                } else if ("extra_ttnet_common_param".equalsIgnoreCase(httpHeader.f72990a)) {
                    z = true;
                } else {
                    String str4 = httpHeader.f72990a;
                    if (TextUtils.equals(httpHeader.f72990a, "User-Agent")) {
                        str2 = m69053a(httpHeader.f72991b);
                    } else {
                        str2 = httpHeader.f72991b;
                    }
                    arrayList.add(new C22027b(str4, str2));
                }
            }
        }
        if (this.f79897a == null) {
            this.f79897a = (IDownloadApi) RetrofitFactory.m33635a().mo28817b(str).mo28832d().mo28858a(IDownloadApi.class);
        }
        final AbstractC21983b<TypedInput> bVar = this.f79897a.get(z, str, arrayList, null);
        try {
            final C22099u<TypedInput> execute = bVar.execute();
            if (execute.f52262b != null) {
                InputStream in = execute.f52262b.mo11577in();
                List<C22027b> list2 = execute.f52261a.f52042d;
                if (list2 != null) {
                    String str5 = null;
                    for (C22027b bVar2 : list2) {
                        if (bVar2.f52037a.equals("Content-Encoding")) {
                            str5 = bVar2.f52038b;
                        }
                    }
                    if (str5 != null && "gzip".equalsIgnoreCase(str5) && !(in instanceof GZIPInputStream)) {
                        inputStream = new GZIPInputStream(in);
                        C337341 r12 = new AbstractC30442a() {
                            /* class com.p2082ss.android.ugc.aweme.app.p2324e.p2325a.C33733c.C337341 */

                            static {
                                Covode.recordClassIndex(40629);
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                            /* renamed from: c */
                            public final InputStream mo54237c() {
                                return inputStream;
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                            /* renamed from: a */
                            public final int mo54233a() {
                                return execute.f52261a.f52040b;
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                            /* renamed from: b */
                            public final void mo54235b() {
                                C33738a.m69063a("ttnet", currentTimeMillis, 2, str3, bVar, execute);
                                try {
                                    AbstractC21983b bVar = bVar;
                                    if (bVar != null && !bVar.isCanceled()) {
                                        bVar.cancel();
                                    }
                                } catch (Throwable unused) {
                                }
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                            /* renamed from: d */
                            public final void mo54238d() {
                                try {
                                    AbstractC21983b bVar = bVar;
                                    if (bVar != null && !bVar.isCanceled()) {
                                        C33738a.m69063a("ttnet", currentTimeMillis, 0, str3, bVar, execute);
                                        bVar.cancel();
                                    }
                                } catch (Throwable unused) {
                                }
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                            /* renamed from: a */
                            public final String mo54234a(String str) {
                                List<C22027b> list = execute.f52261a.f52042d;
                                if (list == null) {
                                    return null;
                                }
                                for (C22027b bVar : list) {
                                    if (bVar.f52037a.equals(str)) {
                                        return bVar.f52038b;
                                    }
                                }
                                return null;
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30442a
                            /* renamed from: a */
                            public final void mo54228a(Throwable th) {
                                String str;
                                super.mo54228a(th);
                                if (execute != null || !(th instanceof C14652c)) {
                                    str = null;
                                } else {
                                    str = ((C14652c) th).getRequestLog();
                                }
                                if (TextUtils.isEmpty(str)) {
                                    C33738a.m69064a("ttnet", currentTimeMillis, 1, str3, bVar, execute, th.getMessage());
                                } else {
                                    C33738a.m69065a("ttnet", currentTimeMillis, 1, str3, str, th.getMessage());
                                }
                            }
                        };
                        MethodCollector.m26664o(5965);
                        return r12;
                    }
                }
                inputStream = in;
                C337341 r122 = new AbstractC30442a() {
                    /* class com.p2082ss.android.ugc.aweme.app.p2324e.p2325a.C33733c.C337341 */

                    static {
                        Covode.recordClassIndex(40629);
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                    /* renamed from: c */
                    public final InputStream mo54237c() {
                        return inputStream;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: a */
                    public final int mo54233a() {
                        return execute.f52261a.f52040b;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: b */
                    public final void mo54235b() {
                        C33738a.m69063a("ttnet", currentTimeMillis, 2, str3, bVar, execute);
                        try {
                            AbstractC21983b bVar = bVar;
                            if (bVar != null && !bVar.isCanceled()) {
                                bVar.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i
                    /* renamed from: d */
                    public final void mo54238d() {
                        try {
                            AbstractC21983b bVar = bVar;
                            if (bVar != null && !bVar.isCanceled()) {
                                C33738a.m69063a("ttnet", currentTimeMillis, 0, str3, bVar, execute);
                                bVar.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g
                    /* renamed from: a */
                    public final String mo54234a(String str) {
                        List<C22027b> list = execute.f52261a.f52042d;
                        if (list == null) {
                            return null;
                        }
                        for (C22027b bVar : list) {
                            if (bVar.f52037a.equals(str)) {
                                return bVar.f52038b;
                            }
                        }
                        return null;
                    }

                    @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30442a
                    /* renamed from: a */
                    public final void mo54228a(Throwable th) {
                        String str;
                        super.mo54228a(th);
                        if (execute != null || !(th instanceof C14652c)) {
                            str = null;
                        } else {
                            str = ((C14652c) th).getRequestLog();
                        }
                        if (TextUtils.isEmpty(str)) {
                            C33738a.m69064a("ttnet", currentTimeMillis, 1, str3, bVar, execute, th.getMessage());
                        } else {
                            C33738a.m69065a("ttnet", currentTimeMillis, 1, str3, str, th.getMessage());
                        }
                    }
                };
                MethodCollector.m26664o(5965);
                return r122;
            }
        } catch (Exception e) {
            C33738a.m69065a("ttnet", currentTimeMillis, 1, str3, e instanceof C14652c ? ((C14652c) e).getRequestLog() : null, e.getMessage());
        }
        MethodCollector.m26664o(5965);
        return null;
    }
}
