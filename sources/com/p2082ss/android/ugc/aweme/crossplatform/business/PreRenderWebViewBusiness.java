package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40745i;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetWebViewInfo;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness */
public final class PreRenderWebViewBusiness extends BusinessService.Business {

    /* renamed from: b */
    public static final Map<Integer, String> f94967b = C89041ag.m154421a(C89387v.m154943a(2, "video_bottom_button"), C89387v.m154943a(3, "video_mask_button"), C89387v.m154943a(6, "comment_end_button"), C89387v.m154943a(8, "profile_bottom_button"), C89387v.m154943a(33, "ad_card"), C89387v.m154943a(46, "ads_explain_clic"), C89387v.m154943a(47, "ad_desc_label"));

    /* renamed from: c */
    public static final C40581a f94968c = new C40581a((byte) 0);

    /* renamed from: a */
    public C18288a f94969a;

    /* renamed from: d */
    private int f94970d;

    /* renamed from: e */
    private String f94971e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness$a */
    public static final class C40581a {
        static {
            Covode.recordClassIndex(48417);
        }

        private C40581a() {
        }

        public /* synthetic */ C40581a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m81922a(int i) {
            String str = PreRenderWebViewBusiness.f94967b.get(Integer.valueOf(i));
            if (str == null) {
                return "others";
            }
            return str;
        }

        /* renamed from: a */
        public static PreRenderWebViewBusiness m81921a(AbstractC40521c cVar) {
            Context context;
            C40618a crossPlatformParams;
            C40628b bVar;
            AbstractC40591g crossPlatformBusiness;
            if (cVar != null) {
                context = cVar.getContext();
            } else {
                context = null;
            }
            if ((context instanceof CrossPlatformActivity) || cVar == null || (crossPlatformParams = cVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f95069b) == null || bVar.f95128w != 7 || (crossPlatformBusiness = cVar.getCrossPlatformBusiness()) == null) {
                return null;
            }
            return (PreRenderWebViewBusiness) crossPlatformBusiness.mo69748a(PreRenderWebViewBusiness.class);
        }
    }

    /* renamed from: a */
    public final void mo69736a() {
        this.f94970d = 0;
        C18288a aVar = this.f94969a;
        if (aVar != null) {
            aVar.mo29252b("webViewDidHide", null);
        }
    }

    static {
        Covode.recordClassIndex(48416);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(C40589e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }

    /* renamed from: a */
    public final void mo69738a(String str) {
        this.f94970d = 2;
        C18288a aVar = this.f94969a;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            aVar.mo29252b("webViewDidShow", jSONObject);
        }
        this.f94971e = str;
    }

    /* renamed from: a */
    public final void mo69737a(AbstractC40735a aVar, GetWebViewInfo.C47833b bVar) {
        C89219l.m154721d(aVar, "");
        if (bVar != null && bVar.f110803b != null) {
            int i = bVar.f110802a;
            AbstractC40745i a = aVar.mo69911a(AbstractC40746j.class);
            C89219l.m154716b(a, "");
            SingleWebView a2 = ((AbstractC40746j) a).mo69969a();
            if (a2 != null && i == a2.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f94970d);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f94971e);
                String str = this.f94935k.f95069b.f95094H;
                if (C89219l.m154714a((Object) "splash", (Object) str)) {
                    jSONObject.put("scene", 2);
                } else if (C89219l.m154714a((Object) "feedad", (Object) str)) {
                    jSONObject.put("scene", 1);
                }
                bVar.f110803b.mo79888a(jSONObject);
            }
        }
    }
}
