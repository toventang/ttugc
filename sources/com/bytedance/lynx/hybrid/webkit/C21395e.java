package com.bytedance.lynx.hybrid.webkit;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1515a.C21160n;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.service.AbstractC21363d;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.bytedance.lynx.hybrid.service.p1537b.C21356d;
import com.bytedance.lynx.hybrid.webkit.C21368a;
import com.bytedance.webx.C23557c;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.e */
public final class C21395e extends C23586c implements AbstractC21154h {

    /* renamed from: a */
    public final C21394d f50760a;

    /* renamed from: b */
    private final C21356d f50761b;

    /* renamed from: c */
    private Uri f50762c;

    /* renamed from: d */
    private String f50763d;

    /* renamed from: e */
    private IResourceService f50764e;

    /* renamed from: f */
    private AbstractC21152f f50765f;

    /* renamed from: g */
    private C21160n f50766g;

    /* renamed from: h */
    private AbstractC21365f f50767h;

    /* renamed from: i */
    private C21196a f50768i;

    static {
        Covode.recordClassIndex(25015);
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo34724a() {
        return this;
    }

    public final AbstractC21365f getBridgeService$hybrid_web_release() {
        return this.f50767h;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    public final C21196a getHybridContext() {
        return this.f50768i;
    }

    public final C21394d getInitParams$hybrid_web_release() {
        return this.f50760a;
    }

    public final C21356d getService$hybrid_web_release() {
        return this.f50761b;
    }

    public final AbstractC21152f getWebKitLifeCycle$hybrid_web_release() {
        return this.f50765f;
    }

    public final String getWebUrl$hybrid_web_release() {
        return this.f50763d;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public final void onAttachedToWindow() {
        C12230n.m21942a().mo19589t(this);
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: b */
    public final void mo34727b() {
        if (!TextUtils.isEmpty(this.f50763d)) {
            String str = this.f50763d;
            if (str == null) {
                C89219l.m154707a();
            }
            mo34725a(str);
            return;
        }
        C21210c.m39925a("please set url at WebKitInitParam(url=\"\")", EnumC21209b.E, (String) null, 4);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public final boolean canGoBack() {
        if (!super.canGoBack() || !C84365i.m145120a(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h, com.bytedance.webx.p1756e.p1757a.C23586c
    public final void destroy() {
        AbstractC21152f fVar = this.f50765f;
        if (fVar != null) {
            fVar.mo25385c();
        }
        AbstractC21365f fVar2 = this.f50767h;
        if (fVar2 != null) {
            fVar2.mo34706a();
        }
        C12230n.m21942a().mo19586l(this);
        super.destroy();
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public final void goBack() {
        if (!C84365i.m145121b(this)) {
            C12230n.m21942a().mo19588p(this);
            super.goBack();
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public final void reload() {
        C21368a.C21369a.m40122a(this, this.f50760a.f50755f);
        AbstractC21152f fVar = this.f50765f;
        if (fVar != null) {
            String str = this.f50763d;
            if (str == null) {
                str = "";
            }
            fVar.mo25382a(this, str);
        }
        C12230n.m21942a().mo19587n(this);
        super.reload();
    }

    public final void setBridgeService$hybrid_web_release(AbstractC21365f fVar) {
        this.f50767h = fVar;
    }

    public final void setWebKitLifeCycle$hybrid_web_release(AbstractC21152f fVar) {
        this.f50765f = fVar;
    }

    public final void setWebUrl$hybrid_web_release(String str) {
        this.f50763d = str;
    }

    public final void setHybridContext(C21196a aVar) {
        C89219l.m154719c(aVar, "");
        this.f50768i = aVar;
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    public final void updateData(Map<String, ? extends Object> map) {
        C89219l.m154719c(map, "");
        C89219l.m154719c(map, "");
    }

    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final void mo34725a(String str) {
        C89219l.m154719c(str, "");
        AbstractC21152f fVar = this.f50765f;
        if (fVar != null) {
            fVar.mo25382a(this, str);
        }
        m40160e(str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.C23586c
    public final void loadUrl(String str) {
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        C21368a.C21369a.m40122a(this, this.f50760a.f50755f);
        C12230n.m21942a().mo19584g(this, str);
        super.loadUrl(str);
    }

    public final void setJsBridge(Context context) {
        AbstractC21365f fVar;
        AbstractC21363d dVar = (AbstractC21363d) C21353c.C21354a.m40102a().mo34954a(AbstractC21363d.class);
        if (dVar != null) {
            fVar = dVar.mo34734a();
        } else {
            fVar = null;
        }
        this.f50767h = fVar;
        if (fVar != null) {
            fVar.mo34707a(context, this, this.f50766g);
        }
    }

    /* renamed from: e */
    private final void m40160e(String str) {
        this.f50763d = str;
        C21368a.C21369a.m40122a(this, this.f50760a.f50755f);
        C21394d dVar = this.f50760a;
        if (dVar.f50757h != null) {
            AbstractC21388b bVar = dVar.f50757h;
            if (bVar != null) {
                new C21393c(str, dVar.f50756g);
                C21393c a = bVar.mo34982a();
                if (a != null) {
                    Map<String, String> map = a.f50749b;
                    if (map == null || map.isEmpty()) {
                        loadUrl(a.f50748a);
                    } else {
                        mo38815a(a.f50748a, a.f50749b, new C23557c[0]);
                    }
                }
            }
        } else {
            loadUrl(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21154h
    /* renamed from: a */
    public final void mo34726a(String str, List<? extends Object> list) {
        Object g;
        C89219l.m154719c(str, "");
        AbstractC21365f fVar = this.f50767h;
        if (fVar != null) {
            JSONObject jSONObject = null;
            if (!(list == null || (g = C89070n.m154583g((List) list)) == 0)) {
                if (g instanceof JSONObject) {
                    jSONObject = g;
                }
                jSONObject = jSONObject;
            }
            fVar.mo34710a(str, jSONObject);
        }
    }

    @Override // android.webkit.WebView, com.bytedance.webx.p1756e.p1757a.C23586c
    public final void loadUrl(String str, Map map) {
        String a = C84365i.f188614a.mo129370a(this, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        C21368a.C21369a.m40122a(this, this.f50760a.f50755f);
        C12230n.m21942a().mo19584g(this, str);
        super.loadUrl(str, map);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21395e(Context context, C21196a aVar, C21394d dVar, C21356d dVar2, AbstractC21152f fVar) {
        super(context);
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(dVar2, "");
        this.f50768i = aVar;
        this.f50761b = dVar2;
        this.f50765f = fVar;
        this.f50764e = (IResourceService) dVar2.mo34957a(IResourceService.class);
        this.f50760a = dVar;
        Uri uri = dVar.f50758i;
        if (uri != null) {
            this.f50762c = uri;
            this.f50763d = uri.getQueryParameter("url");
        }
        C21160n nVar = (C21160n) getHybridContext().mo34746a(C21160n.class);
        if (nVar != null) {
            this.f50766g = nVar;
        }
    }
}
