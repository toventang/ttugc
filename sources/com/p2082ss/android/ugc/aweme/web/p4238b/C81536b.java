package com.p2082ss.android.ugc.aweme.web.p4238b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.b.b */
public final class C81536b extends AbstractC81535a {
    static {
        Covode.recordClassIndex(94914);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: a */
    public final String mo66293a() {
        return "(.*)/ies_fonts/(.+).ttf$";
    }

    public C81536b() {
        super(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: b */
    public final InputStream mo66294b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m141400d(str.substring(str.lastIndexOf("/") + 1));
    }

    /* renamed from: d */
    private static InputStream m141400d(String str) {
        MethodCollector.m26663i(6159);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6159);
            return null;
        }
        Context context = C81537c.m141403a().f182334b;
        Map<String, String> map = C81537c.m141403a().f182333a;
        if (map == null || map.size() == 0) {
            MethodCollector.m26664o(6159);
            return null;
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            MethodCollector.m26664o(6159);
            return null;
        }
        try {
            InputStream open = context.getAssets().open(str2);
            MethodCollector.m26664o(6159);
            return open;
        } catch (IOException e) {
            e.printStackTrace();
            MethodCollector.m26664o(6159);
            return null;
        }
    }
}
