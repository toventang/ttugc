package com.bytedance.lynx.hybrid.webkit;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.a */
public final class C21368a {

    /* renamed from: a */
    public static final C21369a f50718a = new C21369a((byte) 0);

    static {
        Covode.recordClassIndex(24988);
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a$a */
    public static final class C21369a {
        static {
            Covode.recordClassIndex(24989);
        }

        private C21369a() {
        }

        public /* synthetic */ C21369a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m40122a(WebView webView, Map<String, ? extends Object> map) {
            String jSONObject;
            C89219l.m154719c(webView, "");
            if (map != null && !map.isEmpty() && (jSONObject = new JSONObject(map).toString()) != null) {
                Object tag = webView.getTag(R.id.bg9);
                if (tag == null) {
                    int i = Build.VERSION.SDK_INT;
                    GlobalProps globalProps = new GlobalProps();
                    globalProps.f50717a = jSONObject;
                    WebSettings settings = webView.getSettings();
                    C89219l.m154709a((Object) settings, "");
                    settings.setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(globalProps, "__globalprops");
                    webView.setTag(R.id.bg9, globalProps);
                    C21210c.m39924a("injectGlobalProps:successfully set", EnumC21209b.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    C21210c.m39924a("injectGlobalProps:type mismatch, current type is " + tag.getClass(), EnumC21209b.E, "webkit");
                } else {
                    C21210c.m39924a("injectGlobalProps:already set", EnumC21209b.D, "webkit");
                    ((GlobalProps) tag).f50717a = jSONObject;
                }
            }
        }
    }
}
