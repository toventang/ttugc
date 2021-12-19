package com.bytedance.falconx.p975b;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1022i.C14957a;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.falconx.b.a */
public final class C14562a implements AbstractC14564c {

    /* renamed from: a */
    private final File f35206a;

    /* renamed from: b */
    private AssetManager f35207b;

    /* renamed from: c */
    private AtomicBoolean f35208c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(16649);
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: b */
    public final Map<String, Long> mo23440b() {
        return Collections.emptyMap();
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: a */
    public final String mo23439a() {
        return "asset:///" + this.f35206a;
    }

    @Override // com.bytedance.falconx.p975b.AbstractC14564c
    /* renamed from: a */
    public final InputStream mo23438a(String str) {
        MethodCollector.m26663i(4651);
        if (!this.f35208c.get()) {
            C14957a.m27543a("AssetResLoader ready to load, file:", str);
            InputStream open = this.f35207b.open(new File(this.f35206a, str).getPath());
            MethodCollector.m26664o(4651);
            return open;
        }
        RuntimeException runtimeException = new RuntimeException("released!");
        MethodCollector.m26664o(4651);
        throw runtimeException;
    }

    public C14562a(Context context, File file) {
        this.f35206a = file;
        this.f35207b = context.getAssets();
    }
}
