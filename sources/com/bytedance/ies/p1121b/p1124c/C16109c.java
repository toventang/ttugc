package com.bytedance.ies.p1121b.p1124c;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.common.p2130b.AbstractC29818c;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.common.util.AbstractC29840c;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90047d;
import okhttp3.C90195q;
import okhttp3.C90204w;
import okhttp3.C90205x;
import okhttp3.Request;

/* renamed from: com.bytedance.ies.b.c.c */
public final class C16109c implements AbstractC29811a {

    /* renamed from: a */
    private final String f38798a = " okhttp/3.5.0";

    /* renamed from: b */
    private AbstractC16107a f38799b;

    static {
        Covode.recordClassIndex(18402);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final byte[] mo25647a(int i, String str) {
        Throwable th;
        AbstractC90031ad adVar;
        AbstractC90031ad adVar2 = null;
        try {
            C90029ac b = C90022aa.m156235a(this.f38799b.mo25636b(), new Request.C90016a().mo144691a(str).mo144698a(), false).mo144709b();
            if (b.f204107c == 200) {
                adVar = b.f204111g;
                if (adVar != null) {
                    try {
                        InputStream byteStream = adVar.byteStream();
                        String a = b.mo144718a("Content-Length", null);
                        long j = -1;
                        if (a != null) {
                            j = Long.parseLong(a);
                        }
                        byte[] stream2ByteArray = NetworkUtils.stream2ByteArray(i, byteStream, j);
                        NetworkUtils.safeClose(adVar);
                        return stream2ByteArray;
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        adVar2 = adVar;
                        NetworkUtils.safeClose(adVar2);
                        throw th;
                    }
                }
                NetworkUtils.safeClose(adVar);
                return null;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
            NetworkUtils.safeClose(adVar2);
            throw th;
        }
        adVar = null;
        NetworkUtils.safeClose(adVar);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0114 A[SYNTHETIC, Splitter:B:64:0x0114] */
    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25645a(int r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.p2082ss.android.common.util.AbstractC29839b<java.lang.String> r34, java.lang.String r35, com.p2082ss.android.common.util.C29842e r36, java.util.List<com.p2082ss.android.http.p2146a.p2149b.C29934d> r37, java.lang.String[] r38, int[] r39) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1121b.p1124c.C16109c.mo25645a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e, java.util.List, java.lang.String[], int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0116 A[SYNTHETIC, Splitter:B:62:0x0116] */
    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25646a(int r29, java.lang.String r30, java.lang.StringBuffer r31, java.lang.StringBuffer r32, java.lang.StringBuffer r33, com.p2082ss.android.common.util.AbstractC29839b<java.lang.String> r34, java.lang.String r35, com.p2082ss.android.common.util.C29842e r36, java.util.List<com.p2082ss.android.http.p2146a.p2149b.C29934d> r37, java.lang.String[] r38, int[] r39, org.apache.http.client.RedirectHandler r40) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1121b.p1124c.C16109c.mo25646a(int, java.lang.String, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e, java.util.List, java.lang.String[], int[], org.apache.http.client.RedirectHandler):boolean");
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25644a(int i, String str, C29812a aVar, AbstractC29840c<Long> cVar, long j, AbstractC29818c[] cVarArr) {
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        C90205x.C90206a a2 = new C90205x.C90206a().mo145081a(C90205x.f204885e);
        for (C29812a.AbstractC29815c cVar2 : aVar.f71146a) {
            if (cVar2 instanceof C29812a.C29816d) {
                a2.mo145078a(cVar2.mo52093a(), (String) cVar2.mo52094b());
            } else if (cVar2 instanceof C29812a.C29813a) {
                C29812a.C29813a aVar2 = (C29812a.C29813a) cVar2;
                a2.mo145079a(aVar2.f71147a, aVar2.f71149c, AbstractC90025ab.create((C90204w) null, aVar2.f71148b));
            } else if (cVar2 instanceof C29812a.C29814b) {
                File file = (File) cVar2.mo52094b();
                a2.mo145079a(cVar2.mo52093a(), file.getName(), AbstractC90025ab.create((C90204w) null, file));
            }
        }
        return m29910a(0, i, str, a, a2.mo145083a(), cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25643a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        AbstractC90025ab create;
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (str2 != null) {
            a.mo144692a("Content-Encoding", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a.mo144692a("Content-Type", str3);
        }
        a.mo144700b("Accept-Encoding", "gzip");
        if (list != null) {
            for (AbstractC29926a aVar : list) {
                a.mo144700b(aVar.mo52240a(), aVar.mo52241b());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            create = AbstractC90025ab.create(C90204w.m156843b(str3), bArr);
        } else {
            create = AbstractC90025ab.create((C90204w) null, bArr);
        }
        return m29910a(i, i2, str, a, create, (AbstractC29818c[]) null);
    }

    /* renamed from: com.bytedance.ies.b.c.c$a */
    public static class C16112a implements AbstractC29818c {

        /* renamed from: a */
        AbstractC90049e f38806a;

        static {
            Covode.recordClassIndex(18405);
        }

        public C16112a(AbstractC90049e eVar) {
            this.f38806a = eVar;
        }
    }

    public C16109c(AbstractC16107a aVar) {
        this.f38799b = aVar;
    }

    /* renamed from: a */
    private static void m29913a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !C13627m.m24498a(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Request m29912a(int i, Request request) {
        if (i < 0) {
            return request;
        }
        return request.newBuilder().mo144695a(new C90047d.C90048a().mo144765a(i, TimeUnit.SECONDS).mo144766a()).mo144699b("Pragma").mo144698a();
    }

    /* renamed from: a */
    private static String m29911a(int i, AbstractC90031ad adVar, C90029ac acVar) {
        String str;
        if (adVar == null || acVar == null) {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
        InputStream byteStream = adVar.byteStream();
        boolean z = false;
        String str2 = null;
        String a = acVar.mo144718a("Content-Encoding", null);
        if (a == null || !"gzip".equalsIgnoreCase(a)) {
            Logger.debug();
        } else {
            z = true;
        }
        try {
            C90204w contentType = adVar.contentType();
            if (contentType != null) {
                str = contentType.toString();
            } else {
                str = acVar.mo144718a("Content-Type", null);
            }
            if (str == null) {
                str = "";
            }
            boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
            if (adVar.contentLength() > 2147483647L) {
                return null;
            }
            if (!(contentType == null || contentType.mo145074a((Charset) null) == null)) {
                str2 = contentType.mo145074a((Charset) null).name();
            }
            if (str2 == null) {
                str2 = "UTF-8";
            }
            String response2String = NetworkUtils.response2String(z, testIsSSBinary, i, byteStream, str2);
            NetworkUtils.safeClose(byteStream);
            return response2String;
        } finally {
            NetworkUtils.safeClose(byteStream);
        }
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25642a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        return mo25643a(i, i2, str, bArr, str2, str3, (List<AbstractC29926a>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r11 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        com.p2082ss.android.common.util.NetworkUtils.safeClose(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ec A[SYNTHETIC, Splitter:B:50:0x00ec] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m29910a(int r19, int r20, java.lang.String r21, okhttp3.Request.C90016a r22, okhttp3.AbstractC90025ab r23, com.p2082ss.android.common.p2130b.AbstractC29818c[] r24) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1121b.p1124c.C16109c.m29910a(int, int, java.lang.String, okhttp3.Request$a, okhttp3.ab, com.ss.android.common.b.c[]):java.lang.String");
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25639a(int i, int i2, String str, List<C29934d> list, C29812a aVar, AbstractC29818c[] cVarArr) {
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        C90205x.C90206a a2 = new C90205x.C90206a().mo145081a(C90205x.f204885e);
        for (C29934d dVar : list) {
            a2.mo145078a(dVar.f71419a, dVar.f71420b);
        }
        for (C29812a.AbstractC29815c cVar : aVar.f71146a) {
            if (cVar instanceof C29812a.C29816d) {
                a2.mo145078a(cVar.mo52093a(), (String) cVar.mo52094b());
            } else if (cVar instanceof C29812a.C29813a) {
                C29812a.C29813a aVar2 = (C29812a.C29813a) cVar;
                a2.mo145079a(aVar2.f71147a, aVar2.f71149c, AbstractC90025ab.create((C90204w) null, aVar2.f71148b));
            } else if (cVar instanceof C29812a.C29814b) {
                File file = (File) cVar.mo52094b();
                a2.mo145079a(cVar.mo52093a(), file.getName(), AbstractC90025ab.create((C90204w) null, file));
            }
        }
        a.mo144700b("Accept-Encoding", "gzip");
        return m29910a(i, i2, str, a, new C16113d(a2.mo145083a()), cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25641a(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        C90195q.C90196a aVar = new C90195q.C90196a();
        for (C29934d dVar : list) {
            aVar.mo145022a(dVar.f71419a, dVar.f71420b);
        }
        a.mo144700b("Accept-Encoding", "gzip");
        if (list2 != null) {
            for (AbstractC29926a aVar2 : list2) {
                a.mo144700b(aVar2.mo52240a(), aVar2.mo52241b());
            }
        }
        return m29910a(i, i2, str, a, aVar.mo145023a(), cVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0148, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014b, code lost:
        r19 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0168 A[SYNTHETIC, Splitter:B:80:0x0168] */
    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo25640a(int r28, int r29, java.lang.String r30, java.util.List<com.p2082ss.android.http.p2146a.AbstractC29926a> r31, boolean r32, boolean r33, com.p2082ss.android.http.p2146a.p2149b.C29935e r34, boolean r35) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1121b.p1124c.C16109c.mo25640a(int, int, java.lang.String, java.util.List, boolean, boolean, com.ss.android.http.a.b.e, boolean):java.lang.String");
    }
}
