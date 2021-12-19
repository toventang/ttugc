package com.p2082ss.android.ugc.aweme.gecko;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.p1014a.C14890b;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14966d;
import com.bytedance.geckox.utils.C15050c;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl */
public final class GeckoXNetImpl implements AbstractC14965c {

    /* renamed from: a */
    private File f121592a;

    /* renamed from: b */
    private GeckoXNetApi f121593b;

    /* renamed from: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl$GeckoXNetApi */
    public interface GeckoXNetApi {
        static {
            Covode.recordClassIndex(62258);
        }

        @AbstractC22000h
        AbstractC21983b<String> doGet(@AbstractC21993ag String str);

        @AbstractC22012t
        @AbstractC21999g
        AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);

        @AbstractC22000h
        @AbstractC21991ae
        AbstractC21983b<TypedInput> downloadFile(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);

        @AbstractC22012t
        AbstractC21983b<String> postBody(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput);
    }

    static {
        Covode.recordClassIndex(62257);
    }

    /* renamed from: a */
    private GeckoXNetApi m97713a() {
        if (this.f121593b == null) {
            String str = C29736b.f70924e;
            C89219l.m154721d(GeckoXNetApi.class, "");
            C89219l.m154721d(str, "");
            this.f121593b = (GeckoXNetApi) C18097a.m33696a().mo28816a(str).mo28858a(GeckoXNetApi.class);
        }
        return this.f121593b;
    }

    public GeckoXNetImpl(Context context) {
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        File file = new File(C58016d.f132222c, "gecko-resume-net-work");
        this.f121592a = file;
        file.mkdirs();
    }

    /* renamed from: a */
    private static Map<String, String> m97714a(List<C22027b> list) {
        HashMap hashMap = new HashMap();
        if (!C34717d.m70908a(list)) {
            for (C22027b bVar : list) {
                hashMap.put(bVar.f52037a, bVar.f52038b);
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.p1024k.AbstractC14965c
    /* renamed from: a */
    public final C14966d mo24081a(String str, String str2) {
        C89219l.m154721d(str, "");
        if (!C89361p.m154908a((CharSequence) str, (CharSequence) ".snssdk.", false)) {
            C22099u<String> execute = m97713a().postBody(str, new TypedByteArray("application/json", str2.getBytes(Charset.forName("UTF-8")), new String[0])).execute();
            return new C14966d(m97714a(execute.f52261a.f52042d), execute.f52262b, execute.f52261a.f52040b, execute.f52261a.f52041c);
        }
        throw new Exception("Cannot access this host");
    }

    @Override // com.bytedance.geckox.p1024k.AbstractC14965c
    /* renamed from: a */
    public final void mo24082a(String str, C14890b bVar) {
        Throwable th;
        Exception e;
        BufferedInputStream bufferedInputStream;
        MethodCollector.m26663i(5420);
        BufferedInputStream bufferedInputStream2 = null;
        int i = 0;
        try {
            C22099u<TypedInput> execute = m97713a().downloadFile(str, null).execute();
            int i2 = execute.f52261a.f52040b;
            try {
                bufferedInputStream = new BufferedInputStream(execute.f52262b.mo11577in());
            } catch (Exception e2) {
                e = e2;
                i = i2;
                try {
                    RuntimeException runtimeException = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
                    MethodCollector.m26664o(5420);
                    throw runtimeException;
                } catch (Throwable th2) {
                    th = th2;
                    C15050c.m27709a(bufferedInputStream2);
                    MethodCollector.m26664o(5420);
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        bVar.write(bArr, 0, read);
                    } else {
                        C15050c.m27709a(bufferedInputStream);
                        MethodCollector.m26664o(5420);
                        return;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                i = i2;
                bufferedInputStream2 = bufferedInputStream;
                RuntimeException runtimeException2 = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
                MethodCollector.m26664o(5420);
                throw runtimeException2;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                C15050c.m27709a(bufferedInputStream2);
                MethodCollector.m26664o(5420);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            RuntimeException runtimeException22 = new RuntimeException("downloadFile failed, code: " + i + ", caused by:" + e.getMessage(), e);
            MethodCollector.m26664o(5420);
            throw runtimeException22;
        }
    }
}
