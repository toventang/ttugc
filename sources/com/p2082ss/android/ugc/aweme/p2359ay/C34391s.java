package com.p2082ss.android.ugc.aweme.p2359ay;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.lighten.p1477a.C20750g;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20732i;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22056j;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.net.AbstractC24901d;
import com.facebook.net.C24892b;
import com.facebook.net.C24906g;
import com.facebook.net.C24907h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ay.s */
public final class C34391s extends AbstractC34362b {

    /* renamed from: e */
    public volatile AbstractC21983b<TypedInput> f81301e;

    /* renamed from: f */
    public C22944d f81302f;

    /* renamed from: g */
    private final int f81303g = 206;

    static {
        Covode.recordClassIndex(41335);
    }

    /* renamed from: a */
    public final void mo60820a(C22099u uVar, C20750g gVar, Throwable th, C22940b bVar, int i, long j, long j2) {
        if (gVar != null) {
            String str = null;
            try {
                if (C13627m.m24498a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f52261a.f52039a;
                    } else {
                        str = gVar.f48981h.toString();
                    }
                }
                Logger.debug();
                C24906g gVar2 = new C24906g();
                gVar2.f59125a = uVar;
                gVar2.f59127c = str;
                if (this.f81234c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", gVar.f48979f);
                    jSONObject.put("retryCount", i);
                    this.f81234c.mo39303a(gVar2, bVar, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo60819a(C22099u uVar, C20750g gVar, Throwable th, long j, long j2) {
        C22940b bVar;
        long j3 = j2;
        if (gVar != null) {
            try {
                String[] strArr = new String[1];
                if (uVar != null) {
                    m70374a(strArr, uVar.f52261a.f52042d);
                }
                if (C13627m.m24498a(strArr[0])) {
                    strArr[0] = AbstractC34362b.m70312a(th);
                }
                long j4 = gVar.f48974a;
                if (j > 0) {
                    j3 = j;
                }
                String str = null;
                if (C13627m.m24498a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f52261a.f52039a;
                    } else {
                        str = gVar.f48981h.toString();
                    }
                }
                Logger.debug();
                if (th instanceof C14652c) {
                    C14612a requestInfo = ((C14652c) th).getRequestInfo();
                    if (requestInfo instanceof C22940b) {
                        bVar = (C22940b) requestInfo;
                    } else {
                        bVar = new C22940b();
                        bVar.f35379v = 0;
                        bVar.f35382y = ((C14652c) th).getRequestLog();
                    }
                } else {
                    bVar = new C22940b();
                }
                bVar.f35358a = strArr[0];
                if (this.f81233b != null) {
                    this.f81233b.mo60808a(j3, j4, str, bVar, th);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34162a() {
        if (this.f81301e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f81301e.cancel();
        } else {
            this.f81232a.execute(new RunnableC34393t(this));
        }
    }

    /* renamed from: a */
    public static String m70372a(C22099u<TypedInput> uVar) {
        Exception e;
        String str;
        Pattern compile = Pattern.compile("max-age=\\d+");
        String str2 = null;
        try {
            List<C22027b> list = uVar.f52261a.f52042d;
            if (list != null && list.size() > 0) {
                Iterator<C22027b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C22027b next = it.next();
                    if ("Cache-Control".equals(next.f52037a)) {
                        str = next.f52038b;
                        break;
                    }
                }
            }
            str = null;
            if (str == null) {
                return null;
            }
            try {
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    return matcher.group();
                }
                return null;
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            return str2;
        }
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34163a(C20750g gVar) {
        INetworkApi iNetworkApi;
        gVar.f48974a = System.currentTimeMillis();
        if (gVar.f48984k instanceof AbstractC24901d) {
            this.f81234c = (AbstractC24901d) gVar.f48984k;
        }
        Uri uri = gVar.f48981h;
        if (uri != null) {
            String a = this.f81235d.mo60814a(uri.toString());
            if (!C13627m.m24498a(a)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair<String, String> a2 = C14759i.m27066a(a, linkedHashMap);
                    String str = (String) a2.first;
                    String str2 = (String) a2.second;
                    if (C24907h.m47742a().mo40785b()) {
                        iNetworkApi = (INetworkApi) C24907h.m47742a().mo40784a(str, INetworkApi.class);
                    } else {
                        iNetworkApi = (INetworkApi) RetrofitUtils.m43281a(str, INetworkApi.class);
                    }
                    this.f81302f = new C24892b(gVar.f48985l);
                    LinkedList linkedList = null;
                    if (gVar.f48978e > 0) {
                        linkedList = new LinkedList();
                        linkedList.add(new C22027b("Range", "bytes=" + gVar.f48978e + "-"));
                    }
                    Logger.debug();
                    if (iNetworkApi != null) {
                        this.f81301e = iNetworkApi.downloadFile(false, -1, str2, linkedHashMap, linkedList, this.f81302f);
                    }
                } catch (Exception e) {
                    mo60819a(null, gVar, e, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m70374a(String[] strArr, List<C22027b> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C22027b bVar : list) {
                        if ("x-net-info.remoteaddr".equals(bVar.f52037a)) {
                            strArr[0] = bVar.f52038b;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if ("request canceled".equals(r4.getMessage()) == false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60818a(com.bytedance.lighten.p1477a.p1480c.AbstractC20732i r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0010
            java.lang.String r1 = "request canceled"
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0023 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x001c
        L_0x0010:
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f81301e     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0020
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f81301e     // Catch:{ all -> 0x0023 }
            boolean r0 = r0.isCanceled()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            r3.mo34155a()     // Catch:{ all -> 0x0023 }
            return
        L_0x0020:
            r3.mo34157a(r4)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2359ay.C34391s.mo60818a(com.bytedance.lighten.a.c.i, java.lang.Throwable):void");
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34164a(final C20750g gVar, final AbstractC20732i iVar) {
        if (this.f81301e != null && gVar != null) {
            this.f81301e.enqueue(new AbstractC22056j<TypedInput>() {
                /* class com.p2082ss.android.ugc.aweme.p2359ay.C34391s.C343921 */

                /* renamed from: a */
                C22940b f81304a;

                /* renamed from: b */
                long f81305b = -1;

                static {
                    Covode.recordClassIndex(41336);
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6817a(AbstractC21983b<TypedInput> bVar, C22099u<TypedInput> uVar) {
                }

                @Override // com.bytedance.retrofit2.AbstractC22030d
                /* renamed from: a */
                public final void mo6818a(AbstractC21983b<TypedInput> bVar, Throwable th) {
                    Exception exc;
                    this.f81305b = System.currentTimeMillis();
                    long j = gVar.f48977d - gVar.f48974a;
                    long j2 = 0;
                    if (j <= 0) {
                        j2 = System.currentTimeMillis() - gVar.f48974a;
                    }
                    C34391s.this.mo60819a(null, gVar, th, j, j2);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th.getMessage(), th.getCause());
                    }
                    m70381a(null, exc, this.f81304a, j, j2);
                    C34391s.this.mo60818a(iVar, th);
                }

                /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5 A[Catch:{ all -> 0x00f0 }] */
                @Override // com.bytedance.retrofit2.AbstractC22056j
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo35850b(com.bytedance.retrofit2.AbstractC21983b<com.bytedance.retrofit2.mime.TypedInput> r19, com.bytedance.retrofit2.C22099u<com.bytedance.retrofit2.mime.TypedInput> r20) {
                    /*
                    // Method dump skipped, instructions count: 245
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2359ay.C34391s.C343921.mo35850b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
                    if (r9 != null) goto L_0x0076;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[Catch:{ all -> 0x00c3 }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void m70381a(com.bytedance.retrofit2.C22099u r16, java.lang.Exception r17, com.bytedance.ttnet.p1703d.C22940b r18, long r19, long r21) {
                    /*
                    // Method dump skipped, instructions count: 196
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2359ay.C34391s.C343921.m70381a(com.bytedance.retrofit2.u, java.lang.Exception, com.bytedance.ttnet.d.b, long, long):void");
                }
            });
        }
    }

    /* renamed from: a */
    public static void m70373a(C14612a aVar, List<C22027b> list, C22944d dVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C13627m.m24498a(aVar.f35358a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C22027b bVar : list) {
                            if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f52037a)) {
                                str = bVar.f52038b;
                            }
                        }
                    }
                    if (C13627m.m24498a(str) && dVar != null) {
                        str = dVar.f35398a;
                    }
                    if (C13627m.m24498a(str)) {
                        str = AbstractC34362b.m70312a(exc);
                    }
                    if (!C13627m.m24498a(str)) {
                        aVar.f35358a = str;
                        if (aVar.f35359b != null) {
                            aVar.f35359b.f35398a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
