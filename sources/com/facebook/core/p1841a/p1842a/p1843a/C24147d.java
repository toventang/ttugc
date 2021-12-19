package com.facebook.core.p1841a.p1842a.p1843a;

import android.webkit.WebView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.core.a.a.a.d */
public final class C24147d {

    /* renamed from: a */
    final Set<C24149a> f57106a = new HashSet();

    /* renamed from: b */
    public final Map<String, String> f57107b = new HashMap();

    static {
        Covode.recordClassIndex(28278);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.core.a.a.a.d$a */
    public static final class C24149a {

        /* renamed from: f */
        private static final int[] f57110f = new int[2];

        /* renamed from: a */
        public final String f57111a;

        /* renamed from: b */
        public final int f57112b;

        /* renamed from: c */
        public final int f57113c;

        /* renamed from: d */
        public final int f57114d;

        /* renamed from: e */
        public final int f57115e;

        static {
            Covode.recordClassIndex(28280);
        }

        public C24149a(WebView webView) {
            this.f57111a = C1764a.m5928a("%s{%s}", new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())});
            int[] iArr = f57110f;
            webView.getLocationOnScreen(iArr);
            this.f57112b = iArr[0];
            this.f57113c = iArr[1];
            this.f57114d = webView.getWidth();
            this.f57115e = webView.getHeight();
        }
    }

    C24147d() {
    }

    /* renamed from: a */
    public final void mo39733a(PrintWriter printWriter) {
        try {
            for (C24149a aVar : this.f57106a) {
                String str = this.f57107b.get(aVar.f57111a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(aVar);
                    printWriter.println(":");
                    String replace = str.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
                    printWriter.println(C1764a.m5928a("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", new Object[]{aVar.f57111a, Integer.valueOf(aVar.f57112b), Integer.valueOf(aVar.f57113c), Integer.valueOf(aVar.f57114d), Integer.valueOf(aVar.f57115e), replace.substring(1, replace.length() - 1)}));
                }
            }
        } catch (Exception unused) {
        }
        this.f57106a.clear();
        this.f57107b.clear();
    }
}
