package com.bytedance.geckox.p1024k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.p1014a.C14890b;
import com.bytedance.geckox.utils.C15050c;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90025ab;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90204w;
import okhttp3.C90208y;
import okhttp3.Request;

/* renamed from: com.bytedance.geckox.k.a */
public final class C14963a implements AbstractC14965c {

    /* renamed from: a */
    protected C90208y f36552a = new C90208y.C90210a().mo145088a(10, TimeUnit.SECONDS).mo145098b(10, TimeUnit.SECONDS).mo145102c(10, TimeUnit.SECONDS).mo145103d();

    /* renamed from: b */
    protected C90208y f36553b = new C90208y.C90210a().mo145088a(10, TimeUnit.SECONDS).mo145098b(30, TimeUnit.SECONDS).mo145102c(30, TimeUnit.SECONDS).mo145103d();

    static {
        Covode.recordClassIndex(17076);
    }

    /* renamed from: a */
    private static Map<String, String> m27555a(C90198s sVar) {
        if (sVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : sVar.mo145029a()) {
            hashMap.put(str, sVar.mo145028a(str));
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.p1024k.AbstractC14965c
    /* renamed from: a */
    public final C14966d mo24081a(String str, String str2) {
        String str3;
        C90029ac b = C90022aa.m156235a(this.f36552a, new Request.C90016a().mo144691a(str).mo144693a("POST", AbstractC90025ab.create(C90204w.m156843b("application/json; charset=utf-8"), str2)).mo144698a(), false).mo144709b();
        Map<String, String> a = m27555a(b.f204110f);
        if (b.f204107c == 200) {
            str3 = b.f204111g.string();
        } else {
            str3 = null;
        }
        return new C14966d(a, str3, b.f204107c, b.f204108d);
    }

    @Override // com.bytedance.geckox.p1024k.AbstractC14965c
    /* renamed from: a */
    public final void mo24082a(String str, C14890b bVar) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(5341);
        BufferedInputStream bufferedInputStream = null;
        int i = 0;
        try {
            C90029ac b = C90022aa.m156235a(this.f36553b, new Request.C90016a().mo144693a("GET", (AbstractC90025ab) null).mo144691a(str).mo144698a(), false).mo144709b();
            int i2 = b.f204107c;
            if (i2 == 200) {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(b.f204111g.byteStream());
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr, 0, 2048);
                            if (read != -1) {
                                bVar.write(bArr, 0, read);
                            } else {
                                C15050c.m27709a(bufferedInputStream2);
                                MethodCollector.m26664o(5341);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i = 200;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            RuntimeException runtimeException = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
                            MethodCollector.m26664o(5341);
                            throw runtimeException;
                        } catch (Throwable th2) {
                            th = th2;
                            C15050c.m27709a(bufferedInputStream);
                            MethodCollector.m26664o(5341);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = bufferedInputStream2;
                        C15050c.m27709a(bufferedInputStream);
                        MethodCollector.m26664o(5341);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    i = i2;
                    RuntimeException runtimeException2 = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
                    MethodCollector.m26664o(5341);
                    throw runtimeException2;
                }
            } else {
                RuntimeException runtimeException3 = new RuntimeException("response code error: ".concat(String.valueOf(i2)));
                MethodCollector.m26664o(5341);
                throw runtimeException3;
            }
        } catch (Exception e4) {
            e = e4;
            RuntimeException runtimeException22 = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
            MethodCollector.m26664o(5341);
            throw runtimeException22;
        }
    }
}
