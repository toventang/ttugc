package com.bytedance.falconx.p975b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1020g.C14949a;
import com.bytedance.geckox.p1020g.C14950b;
import com.bytedance.geckox.p1020g.C14951c;
import com.bytedance.geckox.p1022i.C14957a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.falconx.b.b */
public final class C14563b implements AbstractC14564c {

    /* renamed from: a */
    private C14951c f35209a;

    /* renamed from: b */
    private AtomicBoolean f35210b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(16650);
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: a */
    public final String mo23439a() {
        return this.f35209a.f36528b;
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: b */
    public final Map<String, Long> mo23440b() {
        return this.f35209a.mo24074a();
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: a */
    public final InputStream mo23438a(String str) {
        MethodCollector.m26663i(4587);
        if (!this.f35210b.get()) {
            C14957a.m27543a("GeckoResLoader ready to load, file:", str);
            C14951c cVar = this.f35209a;
            if (cVar.f36527a.get()) {
                RuntimeException runtimeException = new RuntimeException("released");
                MethodCollector.m26664o(4587);
                throw runtimeException;
            } else if (!TextUtils.isEmpty(str)) {
                C14949a a = cVar.mo24073a(str.trim());
                C14950b a2 = a.mo24071a(a.f36519a);
                String substring = str.substring(a.f36519a.length() + 1);
                File file = a2.f36526a;
                File file2 = new File(file, "res" + File.separator + substring);
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    FileInputStream fileInputStream = new FileInputStream(file2.getCanonicalFile());
                    MethodCollector.m26664o(4587);
                    return fileInputStream;
                }
                IOException iOException = new IOException("file not found");
                MethodCollector.m26664o(4587);
                throw iOException;
            } else {
                RuntimeException runtimeException2 = new RuntimeException("relativePath empty");
                MethodCollector.m26664o(4587);
                throw runtimeException2;
            }
        } else {
            RuntimeException runtimeException3 = new RuntimeException("released!");
            MethodCollector.m26664o(4587);
            throw runtimeException3;
        }
    }

    public C14563b(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f35209a = new C14951c(context, str, file);
        } else {
            throw new RuntimeException("access key empty");
        }
    }
}
