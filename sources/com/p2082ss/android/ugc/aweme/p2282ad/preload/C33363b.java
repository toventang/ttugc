package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.b */
public final class C33363b {

    /* renamed from: a */
    static volatile boolean f79303a;

    /* renamed from: b */
    public static final C33363b f79304b = new C33363b();

    private C33363b() {
    }

    static {
        Covode.recordClassIndex(40209);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.preload.b$a */
    public static final class CallableC33364a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f79305a;

        static {
            Covode.recordClassIndex(40210);
        }

        CallableC33364a(String str) {
            this.f79305a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            String str = "";
            MethodCollector.m26663i(7143);
            C33363b.f79303a = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.f79305a, "manifest.json"));
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                Charset defaultCharset = Charset.defaultCharset();
                C89219l.m154716b(defaultCharset, str);
                str = new String(bArr, defaultCharset);
            } catch (Exception e) {
                C33363b.f79303a = false;
                C51423a.m95791b(3, null, "parse preload manifest file failed");
                e.printStackTrace();
            }
            MethodCollector.m26664o(7143);
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.preload.b$b */
    public static final class C33365b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ String f79306a;

        static {
            Covode.recordClassIndex(40211);
        }

        C33365b(String str) {
            this.f79306a = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String str;
            C33363b.f79303a = false;
            String str2 = this.f79306a;
            if (iVar != null) {
                str = (String) iVar.mo5545d();
            } else {
                str = null;
            }
            JSONObject jSONObject = new JSONObject(str);
            C89219l.m154721d(jSONObject, "");
            if (!TextUtils.isEmpty(str2) && str2 != null) {
                C33366c.f79307a = new C89378p<>(str2, jSONObject);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m68416a(String str) {
        if (!TextUtils.isEmpty(str) && !f79303a && C33366c.m68418a(str) == null) {
            C1731i.m5640b(new CallableC33364a(str), C1731i.f5562a).mo5534a(new C33365b(str), C1731i.f5564c, null);
        }
    }
}
