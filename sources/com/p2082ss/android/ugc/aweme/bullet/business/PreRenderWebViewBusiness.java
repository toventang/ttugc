package com.p2082ss.android.ugc.aweme.bullet.business;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness */
public final class PreRenderWebViewBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public static final C35121a f82895a = new C35121a((byte) 0);

    /* renamed from: b */
    private int f82896b;

    /* renamed from: c */
    private String f82897c;

    static {
        Covode.recordClassIndex(42271);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness$a */
    public static final class C35121a {
        static {
            Covode.recordClassIndex(42272);
        }

        private C35121a() {
        }

        public /* synthetic */ C35121a(byte b) {
            this();
        }

        /* renamed from: a */
        public static PreRenderWebViewBusiness m71835a(AbstractC35125b bVar) {
            C16721b bVar2;
            if (bVar != null) {
                bVar2 = bVar.mo61979b();
            } else {
                bVar2 = null;
            }
            if (!(bVar2 instanceof C35196j)) {
                bVar2 = null;
            }
            C35226e eVar = (C35226e) bVar2;
            if (eVar == null || eVar.mo62120k() != 7) {
                return null;
            }
            return (PreRenderWebViewBusiness) bVar.mo61972a(PreRenderWebViewBusiness.class);
        }
    }

    /* renamed from: a */
    public final void mo61967a() {
        this.f82896b = 0;
        AbstractC16485a aVar = this.f82870k.f82902c;
        if (aVar != null) {
            aVar.mo26191a("webViewDidHide", null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public final void mo61969a(String str) {
        this.f82896b = 2;
        AbstractC16485a aVar = this.f82870k.f82902c;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            aVar.mo26191a("webViewDidShow", jSONObject);
        }
        this.f82897c = str;
    }

    /* renamed from: a */
    public final void mo61968a(GetWebViewInfo.C34974a aVar) {
        if (aVar != null && aVar.f82505b != null) {
            int i = aVar.f82504a;
            WebView webView = this.f82870k.f82903d;
            if (webView != null && i == webView.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f82896b);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f82897c);
                aVar.f82505b.mo61874a(jSONObject);
            }
        }
    }
}
