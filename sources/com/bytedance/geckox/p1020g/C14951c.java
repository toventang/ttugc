package com.bytedance.geckox.p1020g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.g.c */
public final class C14951c {

    /* renamed from: a */
    public AtomicBoolean f36527a = new AtomicBoolean(false);

    /* renamed from: b */
    public String f36528b;

    /* renamed from: c */
    private final Map<String, C14949a> f36529c = new HashMap();

    /* renamed from: d */
    private String f36530d;

    static {
        Covode.recordClassIndex(17064);
    }

    /* renamed from: a */
    public final Map<String, Long> mo24074a() {
        MethodCollector.m26663i(2330);
        HashMap hashMap = new HashMap();
        synchronized (this.f36529c) {
            try {
                Collection<C14949a> values = this.f36529c.values();
                if (values == null) {
                    return hashMap;
                }
                for (C14949a aVar : values) {
                    hashMap.put(aVar.f36519a, aVar.f36520b);
                }
                MethodCollector.m26664o(2330);
                return hashMap;
            } finally {
                MethodCollector.m26664o(2330);
            }
        }
    }

    /* renamed from: a */
    public final C14949a mo24073a(String str) {
        C14949a aVar;
        MethodCollector.m26663i(2323);
        int indexOf = str.indexOf("/");
        if (indexOf == -1) {
            new RuntimeException("channel is needed：".concat(String.valueOf(str)));
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.f36529c) {
            try {
                aVar = this.f36529c.get(substring);
                if (aVar == null) {
                    aVar = new C14949a(this.f36530d, this.f36528b, substring);
                    this.f36529c.put(substring, aVar);
                }
            } finally {
                MethodCollector.m26664o(2323);
            }
        }
        return aVar;
    }

    public C14951c(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f36530d = str;
            if (file == null) {
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = context.getFilesDir();
                }
                this.f36528b = new File(C58016d.f132222c, "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
                return;
            }
            this.f36528b = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key empty");
    }
}
