package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.j */
public final class C35196j extends C35226e {

    /* renamed from: Y */
    public final C16732j f83076Y = new C16732j("ad_id", (byte) 0);

    /* renamed from: Z */
    public final C16729h f83077Z = new C16729h("ad_system_origin");

    /* renamed from: aA */
    public final C16722a f83078aA = new C16722a("disable_js_calculate");

    /* renamed from: aB */
    public final AbstractC16725d<String> f83079aB = new C16737m("landing_page_info", C16739o.f39979f);

    /* renamed from: aC */
    public final AbstractC16725d<String> f83080aC = new C16737m("bundle_extra_param", C16739o.f39979f);

    /* renamed from: aD */
    final C16729h f83081aD = new C16729h("bundle_webview_background", -2);

    /* renamed from: aE */
    public boolean f83082aE;

    /* renamed from: aM */
    private final AbstractC16725d<String> f83083aM = new C16737m("ad_type", C16739o.f39979f);

    /* renamed from: aN */
    private final C16722a f83084aN = new C16722a("show_report");

    /* renamed from: aO */
    private final AbstractC16725d<String> f83085aO = new C16737m("gd_ext_json", C16739o.f39979f);

    /* renamed from: aa */
    public final C16729h f83086aa = new C16729h("web_type");

    /* renamed from: ab */
    public final C16722a f83087ab = new C16722a("bundle_is_from_app_ad");

    /* renamed from: ac */
    public final C16722a f83088ac = new C16722a("bundle_enable_card_preload", true);

    /* renamed from: ad */
    public final C16722a f83089ad = new C16722a("bundle_forbidden_jump");

    /* renamed from: ae */
    public final C16722a f83090ae = new C16722a("bundle_is_from_comment_app_ad");

    /* renamed from: af */
    public final C16722a f83091af = new C16722a("enable_web_report");

    /* renamed from: ag */
    public final C16722a f83092ag = new C16722a("bundle_show_download_status_bar", true);

    /* renamed from: ah */
    public final AbstractC16725d<String> f83093ah = new C16737m("bundle_download_url", C16739o.f39979f);

    /* renamed from: ai */
    public final AbstractC16725d<String> f83094ai = new C16737m("bundle_download_app_name", C16739o.f39979f);

    /* renamed from: aj */
    public final AbstractC16725d<String> f83095aj = new C16737m("aweme_package_name", C16739o.f39979f);

    /* renamed from: ak */
    public final AbstractC16725d<String> f83096ak = new C16737m("bundle_download_app_extra", C16739o.f39979f);

    /* renamed from: al */
    public final AbstractC16725d<String> f83097al = new C16737m("bundle_download_app_log_extra", C16739o.f39979f);

    /* renamed from: am */
    final AbstractC16725d<String> f83098am = new C16737m("gd_label", C16739o.f39979f);

    /* renamed from: an */
    public final C16722a f83099an = new C16722a("bundle_disable_download_dialog", true);

    /* renamed from: ao */
    public final AbstractC16725d<String> f83100ao = new C16737m("aweme_creative_id", C16739o.f39979f);

    /* renamed from: ap */
    public final AbstractC16725d<String> f83101ap = new C16737m("ad_js_url", C16739o.f39979f);

    /* renamed from: aq */
    public final AbstractC16725d<String> f83102aq = new C16737m("bundle_ad_quick_app_url", C16739o.f39979f);

    /* renamed from: ar */
    public final C16729h f83103ar = new C16729h("bundle_app_ad_from");

    /* renamed from: at */
    public final C16729h f83104at = new C16729h("bundle_download_mode");

    /* renamed from: au */
    public final C16729h f83105au = new C16729h("bundle_link_mode");

    /* renamed from: av */
    public final C16722a f83106av = new C16722a("bundle_support_multiple_download");

    /* renamed from: aw */
    public final AbstractC16725d<String> f83107aw = new C16737m("aweme_json_extra", C16739o.f39979f);

    /* renamed from: ax */
    public final AbstractC16725d<String> f83108ax = new C16737m("bundle_open_url", C16739o.f39979f);

    /* renamed from: ay */
    public final AbstractC16725d<String> f83109ay = new C16737m("bundle_web_url", C16739o.f39979f);

    /* renamed from: az */
    public final C16732j f83110az = new C16732j("user_click_time", (byte) 0);

    static {
        Covode.recordClassIndex(42354);
    }

    /* renamed from: b */
    public final String mo62044b() {
        String b = this.f83085aO.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: c */
    public final String mo62045c() {
        String b = this.f83097al.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: e */
    public final void mo62047e() {
        if (!mo26542a().isEmpty()) {
            for (AbstractC16725d<?> dVar : mo26542a()) {
                dVar.mo26546a();
                dVar.mo26550b();
            }
        }
    }

    /* renamed from: d */
    public final JSONObject mo62046d() {
        long j;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f83076Y.mo26550b());
            jSONObject.put("ad_type", this.f83077Z.mo26550b());
            jSONObject.put("log_extra", this.f83097al.mo26550b());
            jSONObject.put("download_url", this.f83093ah.mo26550b());
            jSONObject.put("package_name", this.f83095aj.mo26550b());
            jSONObject.put("app_name", this.f83094ai.mo26550b());
            Long l = (Long) this.f83076Y.mo26550b();
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (j == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("code", i);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.p2082ss.android.ugc.aweme.bullet.module.base.C35226e, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c, com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g
    /* renamed from: a */
    public final List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f83076Y, this.f83077Z, this.f83086aa, this.f83083aM, this.f83087ab, this.f83088ac, this.f83091af, this.f83089ad, this.f83092ag, this.f83093ah, this.f83094ai, this.f83095aj, this.f83096ak, this.f83097al, this.f83098am, this.f83078aA, this.f83085aO, this.f83099an, this.f83100ao, this.f83101ap, this.f83102aq, this.f83090ae, this.f83103ar, this.f83104at, this.f83105au, this.f83106av, this.f83107aw, this.f83108ax, this.f83109ay, this.f83110az, this.f83084aN, this.f83081aD, this.f83079aB, this.f83080aC));
    }
}
