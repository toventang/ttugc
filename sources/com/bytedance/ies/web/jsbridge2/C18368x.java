package com.bytedance.ies.web.jsbridge2;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.AbstractC18294e;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.x */
public class C18368x implements AbstractC18294e, AbstractC18360t {

    /* renamed from: a */
    public final C18288a f43940a;

    /* renamed from: b */
    private final AbstractC18329b f43941b;

    /* renamed from: c */
    private final C18364w f43942c;

    /* renamed from: d */
    private final C18370z f43943d;

    /* renamed from: e */
    private final Map<String, AbstractC18333d> f43944e = new LinkedHashMap();

    /* renamed from: f */
    private final Set<String> f43945f;

    static {
        Covode.recordClassIndex(21040);
    }

    /* renamed from: b */
    public final C18368x mo29412b(String str) {
        this.f43940a.f43655e = str;
        return this;
    }

    /* renamed from: a */
    public final C18368x mo29408a(WebChromeClient webChromeClient) {
        this.f43940a.mo29241a(webChromeClient);
        return this;
    }

    /* renamed from: b */
    public final C18368x mo29413b(List<String> list) {
        this.f43940a.f43656f = list;
        this.f43941b.f43850l.f43865b.mo29308a(list);
        return this;
    }

    /* renamed from: a */
    public final C18368x mo29409a(WebViewClient webViewClient) {
        this.f43940a.mo29242a(webViewClient);
        return this;
    }

    /* renamed from: a */
    public final C18368x mo29411a(List<String> list) {
        this.f43940a.f43657g = list;
        this.f43941b.f43850l.f43865b.mo29309b(list);
        for (String str : list) {
            AbstractC18333d dVar = this.f43944e.get(str);
            if (dVar != null) {
                dVar.f43858a = EnumC18323ah.PUBLIC;
            }
        }
        return this;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18360t
    /* renamed from: a */
    public final void mo29394a(AbstractC18360t tVar) {
        if (tVar instanceof C18368x) {
            C18368x xVar = (C18368x) tVar;
            this.f43944e.putAll(xVar.f43944e);
            this.f43945f.addAll(xVar.f43945f);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18360t
    /* renamed from: a */
    public final void mo29395a(String str) {
        this.f43945f.remove(str);
        C18370z zVar = this.f43943d;
        if (zVar != null) {
            this.f43940a.mo29245a(str, zVar);
        }
    }

    /* renamed from: a */
    public static C18368x m34194a(WebView webView, C18364w wVar) {
        return new C18368x(webView, wVar);
    }

    private C18368x(WebView webView, C18364w wVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f43945f = copyOnWriteArraySet;
        this.f43942c = wVar;
        AbstractC18329b bVar = wVar.f43932b;
        this.f43941b = bVar;
        C18288a a = C18288a.m34008a(webView);
        a.f43660j = true;
        this.f43940a = a;
        if (bVar instanceof C18327al) {
            this.f43943d = new C18370z((C18327al) bVar, copyOnWriteArraySet);
        } else {
            this.f43943d = null;
        }
    }

    /* renamed from: a */
    public final C18368x mo29410a(String str, AbstractC18293d dVar) {
        C18370z zVar = this.f43943d;
        if (zVar != null) {
            this.f43940a.mo29245a(str, zVar);
        }
        C18355o oVar = new C18355o(dVar);
        this.f43941b.f43850l.mo29359a(str, (AbstractC18333d) oVar);
        this.f43944e.put(str, oVar);
        return this;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18294e
    /* renamed from: a */
    public final void mo29250a(List<String> list, C18297h hVar, JSONObject jSONObject) {
        this.f43940a.mo29250a(list, hVar, jSONObject);
    }
}
