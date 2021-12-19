package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.p2866a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2874c.C45810a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.a.a */
public final class C45683a {

    /* renamed from: a */
    public static final String f106365a = "aweme://lynxview_popup?show_loading=1&popup_enter_type=bottom&height_percent=73&radius=8&close_by_mask=1&close_by_gesture=0&drag_by_gesture=0&channel=fe_teu_lynx_webcast_product_bag&bundle=app%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&use_bdx=1&container_bgcolor=app_theme&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Ffe_teu_lynx_webcast_product_bag%2Fapp%2Ftemplate.js";

    /* renamed from: b */
    public static final C45683a f106366b = new C45683a();

    private C45683a() {
    }

    static {
        Covode.recordClassIndex(54197);
    }

    /* renamed from: a */
    public static final String m88192a() {
        String str;
        C45810a.m88427a();
        try {
            str = SettingsManager.m29616a().mo25398a("audience_product_list_lynx_schema", "aweme://lynxview_popup?show_loading=1&popup_enter_type=bottom&height_percent=73&radius=8&close_by_mask=1&close_by_gesture=0&drag_by_gesture=0&channel=fe_teu_lynx_webcast_product_bag&bundle=app%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&use_bdx=1&container_bgcolor=app_theme&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Ffe_teu_lynx_webcast_product_bag%2Fapp%2Ftemplate.js");
        } catch (Throwable unused) {
            str = f106365a;
        }
        C89219l.m154716b(str, "");
        return str;
    }
}
