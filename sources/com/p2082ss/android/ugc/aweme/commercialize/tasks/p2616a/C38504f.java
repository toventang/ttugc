package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1270b.C18141a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.f */
public final class C38504f extends AbstractC38498a {

    /* renamed from: O */
    private final long f90983O;

    /* renamed from: P */
    private final String f90984P;

    /* renamed from: Q */
    private final String f90985Q;

    /* renamed from: R */
    private final int f90986R;

    /* renamed from: S */
    private final String f90987S;

    /* renamed from: T */
    private final String f90988T;

    /* renamed from: U */
    private final String f90989U;

    /* renamed from: V */
    private final List<String> f90990V;

    /* renamed from: W */
    private final String f90991W;

    /* renamed from: X */
    private final String f90992X;

    static {
        Covode.recordClassIndex(46030);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        if (!TextUtils.equals(this.f90984P, "lynx") || TextUtils.isEmpty(this.f90985Q)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        String str;
        Bundle a = m78077a(mo67052c());
        if (a == null) {
            a = new Bundle();
        }
        C89219l.m154716b(a, "");
        String str2 = this.f90985Q;
        a.putBoolean("is_lynx_landing_page", true);
        a.putBoolean("hide_nav_bar", true);
        a.putBoolean("hide_status_bar", false);
        a.putBoolean("bundle_nav_bar_status_padding", true);
        a.putBoolean("need_bottom_out", true);
        if (this.f90986R == 1) {
            if (!TextUtils.isEmpty(this.f90987S)) {
                a.putString("bundle_full_screen_bg_image", this.f90987S);
            }
            a.putInt("bundle_webview_background", 0);
        }
        a.putString("lynx_channel_name", this.f90988T);
        a.putString("bundle_native_site_custom_data", this.f90989U);
        List<String> list = this.f90990V;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f == null || (str = f.mo59382b(Long.valueOf(this.f90983O))) == null) {
                str = "";
            }
            a.putString("second_page_preload_channel_prefix", str);
            f.mo59376a().mo59416b(this.f90990V);
        }
        a.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(this.f43206b), 1073741824));
        a.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(this.f43206b) - C80534hh.m139609b(), 1073741824));
        Uri parse = Uri.parse(str2);
        C89219l.m154716b(parse, "");
        if (parse.isHierarchical()) {
            a.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
            if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                a.putBoolean("preset_safe_point", true);
                a.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        C28022o oVar = new C28022o();
        oVar.mo46801a("siteId", this.f90945H);
        oVar.mo46801a("adId", String.valueOf(this.f90983O));
        oVar.mo46801a("creativeId", String.valueOf(this.f90958j));
        oVar.mo46801a("logExtra", this.f90959k);
        oVar.mo46801a("groupId", String.valueOf(this.f90960l));
        oVar.mo46801a("webUrl", this.f90970v);
        oVar.mo46801a("pageData", this.f90991W);
        oVar.mo46801a("appData", this.f90992X);
        oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(this.f43206b) ? 1 : 0));
        oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        buildUpon.appendQueryParameter("lynx_landing_page_data", oVar2);
        buildUpon.appendQueryParameter("lynx_landing_page_title", this.f90971w);
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        C38497a.f90936a.mo65614a(this.f43206b, builder, this.f90953e, a);
        return new C18148g(true);
    }

    /* renamed from: a */
    private static Bundle m78077a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: a */
    public final void mo28926a(boolean z) {
        C18141a b = this.f43207c.mo28929b();
        if (b instanceof AwemeRawAd) {
            C18129a.m33746a(this.f90961m, "open_url_h5", (AwemeRawAd) b).mo28897a("render_type", "lynx").mo28901b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38504f(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        this.f90983O = bundle.getLong("ad_id");
        String string = bundle.getString("render_type", "");
        C89219l.m154716b(string, "");
        this.f90984P = string;
        String string2 = bundle.getString("lynx_scheme", "");
        C89219l.m154716b(string2, "");
        this.f90985Q = string2;
        this.f90986R = bundle.getInt("lynx_landing_style");
        this.f90987S = bundle.getString("video_cover");
        this.f90988T = bundle.getString("lynx_channel_name");
        this.f90989U = bundle.getString("native_site_custom_data");
        this.f90990V = bundle.getStringArrayList("second_page_preload_channels");
        String string3 = bundle.getString("key_native_site_ad_info", "");
        C89219l.m154716b(string3, "");
        this.f90991W = string3;
        String string4 = bundle.getString("native_site_app_data", "");
        C89219l.m154716b(string4, "");
        this.f90992X = string4;
    }
}
