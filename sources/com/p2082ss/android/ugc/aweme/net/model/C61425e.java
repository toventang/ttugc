package com.p2082ss.android.ugc.aweme.net.model;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.model.e */
public final class C61425e<Q, R> {

    /* renamed from: a */
    public Q f139468a;

    /* renamed from: b */
    public R f139469b;

    /* renamed from: c */
    public WebView f139470c;

    /* renamed from: d */
    public JSONObject f139471d;

    /* renamed from: e */
    public RuntimeException f139472e;

    /* renamed from: f */
    public EnumC61424d f139473f;

    static {
        Covode.recordClassIndex(72079);
    }

    public C61425e() {
        this(null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61425e)) {
            return false;
        }
        C61425e eVar = (C61425e) obj;
        return C89219l.m154714a(this.f139468a, eVar.f139468a) && C89219l.m154714a(this.f139469b, eVar.f139469b) && C89219l.m154714a(this.f139470c, eVar.f139470c) && C89219l.m154714a(this.f139471d, eVar.f139471d) && C89219l.m154714a(this.f139472e, eVar.f139472e) && C89219l.m154714a(this.f139473f, eVar.f139473f);
    }

    public final int hashCode() {
        Q q = this.f139468a;
        int i = 0;
        int hashCode = (q != null ? q.hashCode() : 0) * 31;
        R r = this.f139469b;
        int hashCode2 = (hashCode + (r != null ? r.hashCode() : 0)) * 31;
        WebView webView = this.f139470c;
        int hashCode3 = (hashCode2 + (webView != null ? webView.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f139471d;
        int hashCode4 = (hashCode3 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        RuntimeException runtimeException = this.f139472e;
        int hashCode5 = (hashCode4 + (runtimeException != null ? runtimeException.hashCode() : 0)) * 31;
        EnumC61424d dVar = this.f139473f;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "InterceptContext(request=" + ((Object) this.f139468a) + ", response=" + ((Object) this.f139469b) + ", webView=" + this.f139470c + ", extra=" + this.f139471d + ", exception=" + this.f139472e + ", action=" + this.f139473f + ")";
    }

    /* renamed from: a */
    public final void mo99118a(EnumC61424d dVar) {
        C89219l.m154721d(dVar, "");
        this.f139473f = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61425e(Object obj, EnumC61424d dVar, int i) {
        this((i & 1) != 0 ? null : obj, null, null, (i & 32) != 0 ? EnumC61424d.CONTINUE : dVar);
    }

    public C61425e(Q q, WebView webView, JSONObject jSONObject, EnumC61424d dVar) {
        C89219l.m154721d(dVar, "");
        this.f139468a = q;
        this.f139469b = null;
        this.f139470c = webView;
        this.f139471d = jSONObject;
        this.f139472e = null;
        this.f139473f = dVar;
    }
}
