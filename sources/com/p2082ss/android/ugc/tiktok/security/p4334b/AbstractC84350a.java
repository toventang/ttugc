package com.p2082ss.android.ugc.tiktok.security.p4334b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16168h;
import com.bytedance.ies.web.jsbridge2.AbstractC18329b;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.lynx.tasm.LynxView;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.security.b.a */
public abstract class AbstractC84350a implements AbstractC84352c, AbstractC84353d, AbstractC84354e {
    static {
        Covode.recordClassIndex(98302);
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84353d
    /* renamed from: a */
    public String mo129370a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        if (mo129373a() == null) {
            return str;
        }
        AbstractC84355f a = mo129373a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.ILoadURLProcessor");
        String a2 = ((AbstractC84353d) a).mo129370a(webView, str);
        return a2 == null ? str : a2;
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84354e
    /* renamed from: a */
    public C89378p<String, Boolean> mo129369a(String str, LynxView lynxView) {
        if (mo129373a() == null) {
            return new C89378p<>(str, true);
        }
        AbstractC84355f a = mo129373a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.ILynxApiProcessor");
        return ((AbstractC84354e) a).mo129369a(str, lynxView);
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84352c
    /* renamed from: a */
    public void mo129372a(AbstractC18329b bVar, C18362v vVar) {
        if (mo129373a() != null) {
            AbstractC84355f a = mo129373a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.IBridgeProcessor");
            ((AbstractC84352c) a).mo129372a(bVar, vVar);
        }
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84352c
    /* renamed from: a */
    public void mo129371a(C16168h hVar, List<String> list, JSONObject jSONObject) {
        if (mo129373a() != null) {
            AbstractC84355f a = mo129373a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tiktok.security.processor.IBridgeProcessor");
            ((AbstractC84352c) a).mo129371a(hVar, list, jSONObject);
        }
    }
}
