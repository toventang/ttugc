package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.c */
public final class C35186c extends C16721b {

    /* renamed from: Q */
    public final C16732j f83016Q = new C16732j("bundle_real_ad_id", (byte) 0);

    /* renamed from: R */
    public final C16729h f83017R = new C16729h("ad_system_origin");

    /* renamed from: S */
    public final AbstractC16725d<String> f83018S = new C16737m("bundle_open_url", C16739o.f39979f);

    /* renamed from: T */
    public final AbstractC16725d<String> f83019T = new C16737m("bundle_web_url", C16739o.f39979f);

    /* renamed from: U */
    public final AbstractC16725d<String> f83020U = new C16737m("bundle_ad_quick_app_url", C16739o.f39979f);

    /* renamed from: V */
    public final AbstractC16725d<String> f83021V = new C16737m("ad_type", C16739o.f39979f);

    /* renamed from: W */
    public final AbstractC16725d<String> f83022W = new C16737m("bundle_web_title", C16739o.f39979f);

    /* renamed from: X */
    public final C16722a f83023X = new C16722a("show_report");

    /* renamed from: Y */
    public final C16729h f83024Y = new C16729h("web_type");

    /* renamed from: Z */
    public final C16729h f83025Z = new C16729h("bundle_download_mode");

    /* renamed from: aA */
    private final AbstractC16725d<String> f83026aA = new C16737m("bundle_lynx_bottom_label_data", C16739o.f39979f);

    /* renamed from: aa */
    public final C16729h f83027aa = new C16729h("bundle_link_mode");

    /* renamed from: ab */
    public final C16722a f83028ab = new C16722a("bundle_support_multiple_download");

    /* renamed from: ac */
    public final C16722a f83029ac = new C16722a("bundle_disable_download_dialog", true);

    /* renamed from: ad */
    public final C16729h f83030ad = new C16729h("bundle_webview_background", -2);

    /* renamed from: ae */
    public final AbstractC16725d<String> f83031ae = new C16737m("track_url_list", C16739o.f39979f);

    /* renamed from: af */
    public final AbstractC16725d<String> f83032af = new C16737m("second_page_preload_channel_prefix", C16739o.f39979f);

    /* renamed from: ag */
    public final AbstractC16725d<String> f83033ag = new C16737m("bundle_full_screen_bg_image", C16739o.f39979f);

    /* renamed from: ah */
    public final AbstractC16725d<String> f83034ah = new C16737m("bundle_native_site_custom_data", C16739o.f39979f);

    /* renamed from: ai */
    public final AbstractC16725d<String> f83035ai = new C16737m("aweme_id", C16739o.f39979f);

    /* renamed from: aj */
    public final AbstractC16725d<String> f83036aj = new C16737m("owner_id", C16739o.f39979f);

    /* renamed from: ak */
    public final AbstractC16725d<String> f83037ak = new C16737m("landing_page_info", C16739o.f39979f);

    /* renamed from: al */
    public final C16729h f83038al = new C16729h("preload_web_status");

    /* renamed from: am */
    public final C16729h f83039am = new C16729h("preload_is_web_url");

    /* renamed from: an */
    public final AbstractC16725d<String> f83040an = new C16737m("preload_channel_name", C16739o.f39979f);

    /* renamed from: ao */
    public final AbstractC16725d<List<String>> f83041ao = new C16737m("bundle_second_page_gecko_channels", C16739o.f39980g);

    /* renamed from: ap */
    public final AbstractC16725d<String> f83042ap = new C16737m("bundle_extra_param", C16739o.f39979f);

    /* renamed from: aq */
    private final C16732j f83043aq = new C16732j("ad_id", (byte) 0);

    /* renamed from: ar */
    private final AbstractC16725d<String> f83044ar = new C16737m("aweme_group_id", C16739o.f39979f);

    /* renamed from: at */
    private final AbstractC16725d<String> f83045at = new C16737m("bundle_download_app_log_extra", C16739o.f39979f);

    /* renamed from: au */
    private final AbstractC16725d<String> f83046au = new C16737m("bundle_download_url", C16739o.f39979f);

    /* renamed from: av */
    private final AbstractC16725d<String> f83047av = new C16737m("aweme_package_name", C16739o.f39979f);

    /* renamed from: aw */
    private final AbstractC16725d<String> f83048aw = new C16737m("bundle_download_app_name", C16739o.f39979f);

    /* renamed from: ax */
    private final C16722a f83049ax = new C16722a("bundle_nav_bar_status_padding");

    /* renamed from: ay */
    private final C16722a f83050ay = new C16722a("bundle_show_lynx_bottom_label");

    /* renamed from: az */
    private final AbstractC16725d<String> f83051az = new C16737m("bundle_lynx_bottom_label_template_url", C16739o.f39979f);

    static {
        Covode.recordClassIndex(42344);
    }

    /* renamed from: c */
    public final String mo62016c() {
        String b = this.f83044ar.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: d */
    public final String mo62017d() {
        String b = this.f83045at.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: e */
    public final String mo62018e() {
        String b = this.f83046au.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: f */
    public final String mo62019f() {
        String b = this.f83047av.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: g */
    public final String mo62020g() {
        String b = this.f83048aw.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: b */
    public final long mo62015b() {
        Long l = (Long) this.f83043aq.mo26550b();
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo62021h() {
        Boolean bool = (Boolean) this.f83049ax.mo26550b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c
    /* renamed from: a */
    public final List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f83043aq, this.f83016Q, this.f83044ar, this.f83017R, this.f83045at, this.f83046au, this.f83047av, this.f83048aw, this.f83018S, this.f83019T, this.f83020U, this.f83021V, this.f83022W, this.f83023X, this.f83024Y, this.f83025Z, this.f83027aa, this.f83028ab, this.f83029ac, this.f83030ad, this.f83049ax, this.f83031ae, this.f83032af, this.f83050ay, this.f83051az, this.f83026aA, this.f83033ag, this.f83034ah, this.f83035ai, this.f83036aj, this.f83037ak, this.f83038al, this.f83039am, this.f83040an, this.f83041ao, this.f83042ap));
    }
}
