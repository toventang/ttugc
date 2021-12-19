package com.bytedance.lynx.hybrid.resource.p1528d;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.service.C21367h;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.d.e */
public class C21294e {

    /* renamed from: x */
    public static final C21295a f50541x = new C21295a((byte) 0);

    /* renamed from: i */
    public String f50542i;

    /* renamed from: j */
    public WebResourceResponse f50543j;

    /* renamed from: k */
    public C21367h f50544k;

    /* renamed from: l */
    public JSONArray f50545l;

    /* renamed from: m */
    public final Uri f50546m;

    /* renamed from: n */
    public String f50547n = null;

    /* renamed from: o */
    public EnumC21298h f50548o = null;

    /* renamed from: p */
    public EnumC21293d f50549p = null;

    /* renamed from: q */
    public boolean f50550q = false;

    /* renamed from: r */
    public long f50551r = 0;

    /* renamed from: s */
    public boolean f50552s;

    /* renamed from: t */
    public InputStream f50553t;

    /* renamed from: u */
    public C21290a f50554u;

    /* renamed from: v */
    public String f50555v;

    /* renamed from: w */
    public long f50556w;

    static {
        Covode.recordClassIndex(24912);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.d.e$a */
    public static final class C21295a {
        static {
            Covode.recordClassIndex(24913);
        }

        private C21295a() {
        }

        public /* synthetic */ C21295a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public InputStream mo34899a() {
        MethodCollector.m26663i(4847);
        String str = this.f50547n;
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        InputStream inputStream = this.f50553t;
        if (inputStream != null) {
            MethodCollector.m26664o(4847);
            return inputStream;
        } else if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            MethodCollector.m26664o(4847);
            return fileInputStream;
        } else {
            MethodCollector.m26664o(4847);
            return null;
        }
    }

    /* renamed from: b */
    public final File mo34902b() {
        String str = this.f50547n;
        if (str == null) {
            str = "";
        }
        EnumC21298h hVar = this.f50548o;
        if (hVar != null && C21296f.f50557a[hVar.ordinal()] == 1) {
            return new File(str);
        }
        return new File(str);
    }

    public String toString() {
        return "[srcUri=" + this.f50546m + ", filePath=" + this.f50547n + ", type=" + this.f50548o + ',' + "from=" + this.f50549p + ", fileStream=" + this.f50553t + ", model=" + this.f50554u + ']';
    }

    /* renamed from: a */
    public final void mo34900a(C21367h hVar) {
        C89219l.m154719c(hVar, "");
        this.f50544k = hVar;
    }

    /* renamed from: e */
    public final void mo34903e(String str) {
        C89219l.m154719c(str, "");
        this.f50542i = str;
    }

    /* renamed from: f */
    public final void mo34904f(String str) {
        C89219l.m154719c(str, "");
        this.f50555v = str;
    }

    /* renamed from: a */
    public final void mo34901a(JSONArray jSONArray) {
        C89219l.m154719c(jSONArray, "");
        this.f50545l = jSONArray;
    }

    public C21294e(Uri uri, String str, EnumC21298h hVar, EnumC21293d dVar, boolean z, long j, boolean z2, InputStream inputStream, C21290a aVar, String str2, long j2) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str2, "");
        this.f50546m = uri;
        this.f50552s = z2;
        this.f50553t = null;
        this.f50554u = null;
        this.f50555v = str2;
        this.f50556w = j2;
        this.f50542i = "";
        this.f50544k = new C21367h("hybrid_resource_fetch", (byte) 0);
        this.f50545l = new JSONArray();
    }
}
