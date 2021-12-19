package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18304a;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ies.web.jsbridge2.k */
public final class C18345k {

    /* renamed from: a */
    public WebView f43885a;

    /* renamed from: b */
    AbstractC18304a f43886b;

    /* renamed from: c */
    public AbstractC18329b f43887c;

    /* renamed from: d */
    public String f43888d;

    /* renamed from: e */
    public C18343i f43889e;

    /* renamed from: f */
    public Context f43890f;

    /* renamed from: g */
    public boolean f43891g;

    /* renamed from: h */
    public boolean f43892h;

    /* renamed from: i */
    public boolean f43893i;

    /* renamed from: j */
    final Set<AbstractC18356p> f43894j;

    /* renamed from: k */
    public AbstractC18358r f43895k;

    /* renamed from: l */
    public String f43896l;

    /* renamed from: m */
    public final Set<String> f43897m;

    /* renamed from: n */
    public final Set<String> f43898n;

    /* renamed from: o */
    public boolean f43899o;

    /* renamed from: p */
    public boolean f43900p;

    /* renamed from: q */
    AbstractC18347m.AbstractC18351c f43901q;

    /* renamed from: r */
    AbstractC18347m.AbstractC18352d f43902r;

    /* renamed from: s */
    public List<TimeLineEvent> f43903s;

    /* renamed from: t */
    public boolean f43904t;

    /* renamed from: u */
    public boolean f43905u;

    static {
        Covode.recordClassIndex(21017);
    }

    /* renamed from: a */
    public final C18345k mo29365a() {
        this.f43893i = true;
        return this;
    }

    /* renamed from: b */
    public final C18345k mo29373b() {
        this.f43892h = true;
        return this;
    }

    /* renamed from: c */
    public final C18345k mo29376c() {
        this.f43900p = true;
        return this;
    }

    C18345k() {
        this.f43888d = "IESJSBridge";
        this.f43894j = new LinkedHashSet();
        this.f43896l = "host";
        this.f43897m = new LinkedHashSet();
        this.f43898n = new LinkedHashSet();
        this.f43903s = new CopyOnWriteArrayList();
        this.f43904t = true;
    }

    /* renamed from: e */
    private void m34127e() {
        if (!(this.f43885a == null && !this.f43899o && this.f43887c == null) && ((!TextUtils.isEmpty(this.f43888d) || this.f43885a == null) && this.f43889e != null)) {
            m34126a(this.f43891g, this.f43904t, this.f43885a);
            return;
        }
        throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
    }

    /* renamed from: d */
    public final C18364w mo29377d() {
        boolean z;
        m34127e();
        TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29301a("jsObjectName", this.f43888d).mo29301a("debug", Boolean.valueOf(this.f43891g)).mo29301a("shouldFlattenData", Boolean.valueOf(this.f43892h)).mo29301a("enablePermissionCheck", Boolean.valueOf(this.f43893i)).mo29301a("namespace", this.f43896l).mo29301a("safeHostSet", this.f43897m).mo29301a("publicMethodSet", this.f43898n).mo29301a("dummy", Boolean.valueOf(this.f43899o));
        if (this.f43901q != null) {
            z = true;
        } else {
            z = false;
        }
        TimeLineEvent.C18302a a2 = a.mo29301a("jsbPermissionValidator", Boolean.valueOf(z)).mo29301a("disableAllPermissionCheck", Boolean.valueOf(this.f43900p)).mo29301a("isShowDebugToast", Boolean.valueOf(this.f43904t));
        WebView webView = this.f43885a;
        if (webView != null) {
            a2.mo29301a("webView", webView.getClass().getSimpleName());
        }
        a2.mo29302a(TimeLineEvent.C18303b.f43736aj, this.f43903s);
        return new C18364w(this);
    }

    /* renamed from: a */
    public final C18345k mo29366a(AbstractC18347m.AbstractC18351c cVar) {
        this.f43901q = cVar;
        return this;
    }

    /* renamed from: b */
    public final C18345k mo29374b(AbstractC18356p pVar) {
        this.f43894j.add(pVar);
        return this;
    }

    /* renamed from: a */
    public final C18345k mo29367a(AbstractC18354n nVar) {
        C18343i a = C18343i.m34119a(nVar);
        this.f43889e = a;
        a.f43883b = this.f43905u;
        return this;
    }

    /* renamed from: b */
    public final C18345k mo29375b(Collection<String> collection) {
        this.f43898n.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final C18345k mo29368a(AbstractC18356p pVar) {
        return mo29374b(pVar);
    }

    C18345k(WebView webView) {
        this.f43888d = "IESJSBridge";
        this.f43894j = new LinkedHashSet();
        this.f43896l = "host";
        this.f43897m = new LinkedHashSet();
        this.f43898n = new LinkedHashSet();
        this.f43903s = new CopyOnWriteArrayList();
        this.f43904t = true;
        this.f43885a = webView;
        this.f43886b = new AbstractC18304a.C18305a(webView);
    }

    /* renamed from: a */
    public final C18345k mo29369a(AbstractC18358r rVar) {
        this.f43895k = rVar;
        return this;
    }

    public C18345k(AbstractC18304a aVar) {
        this.f43888d = "IESJSBridge";
        this.f43894j = new LinkedHashSet();
        this.f43896l = "host";
        this.f43897m = new LinkedHashSet();
        this.f43898n = new LinkedHashSet();
        this.f43903s = new CopyOnWriteArrayList();
        this.f43904t = true;
        this.f43886b = aVar;
    }

    /* renamed from: a */
    public final C18345k mo29370a(String str) {
        this.f43888d = str;
        return this;
    }

    C18345k(C18345k kVar) {
        this.f43888d = "IESJSBridge";
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f43894j = linkedHashSet;
        this.f43896l = "host";
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f43897m = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.f43898n = linkedHashSet3;
        this.f43903s = new CopyOnWriteArrayList();
        this.f43904t = true;
        this.f43885a = kVar.f43885a;
        this.f43886b = kVar.f43886b;
        this.f43888d = kVar.f43888d;
        this.f43889e = kVar.f43889e;
        this.f43890f = kVar.f43890f;
        this.f43891g = kVar.f43891g;
        this.f43892h = kVar.f43892h;
        this.f43893i = kVar.f43893i;
        linkedHashSet.addAll(kVar.f43894j);
        this.f43896l = kVar.f43896l;
        linkedHashSet2.addAll(kVar.f43897m);
        linkedHashSet3.addAll(kVar.f43898n);
        this.f43899o = kVar.f43899o;
        this.f43887c = kVar.f43887c;
        this.f43895k = kVar.f43895k;
        this.f43900p = kVar.f43900p;
        this.f43904t = kVar.f43904t;
        this.f43905u = kVar.f43905u;
    }

    /* renamed from: a */
    public final C18345k mo29371a(Collection<String> collection) {
        this.f43897m.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final C18345k mo29372a(boolean z) {
        this.f43891g = z;
        return this;
    }

    /* renamed from: a */
    public static void m34126a(boolean z, boolean z2, WebView webView) {
        if (z && z2 && webView != null && !(webView instanceof AbstractC18359s)) {
            webView.post(new RunnableC18346l(webView));
        }
    }
}
