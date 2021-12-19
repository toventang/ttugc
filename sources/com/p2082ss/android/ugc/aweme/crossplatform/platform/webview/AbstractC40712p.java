package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.p */
public interface AbstractC40712p {
    static {
        Covode.recordClassIndex(48558);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.p$a */
    public static class C40713a {
        static {
            Covode.recordClassIndex(48559);
        }

        /* renamed from: a */
        public static List<String> m82128a() {
            try {
                String[] strArr = (String[]) C16048b.m29633a().mo25414a(true, "webview_cache_urls");
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
