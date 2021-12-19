package com.p2082ss.android.ugc.aweme.bullet.module.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.e */
public class C35226e extends C16855g {

    /* renamed from: Y */
    private final AbstractC16725d<String> f83210Y = new C16737m("bundle_origin_url", C16739o.f39979f);

    /* renamed from: Z */
    private final AbstractC16725d<String> f83211Z = new C16737m("aweme_id", C16739o.f39979f);

    /* renamed from: aF */
    final C16722a f83212aF = new C16722a("show_not_official_content_warning");

    /* renamed from: aG */
    final C16722a f83213aG = new C16722a("from_notification");

    /* renamed from: aH */
    final C16722a f83214aH = new C16722a("bundle_auto_play_audio");

    /* renamed from: aI */
    final C16722a f83215aI = new C16722a("use_webview_title");

    /* renamed from: aJ */
    public final AbstractC16725d<String> f83216aJ = new C16737m("bundle_web_title", C16739o.f39979f);

    /* renamed from: aK */
    public final C16722a f83217aK = new C16722a("is_from_lynx_land_page", false);

    /* renamed from: aL */
    public final AbstractC16725d<String> f83218aL = new C16737m("second_page_preload_channel_name", C16739o.f39979f);

    /* renamed from: aa */
    private final AbstractC16725d<String> f83219aa = new C16737m("group_id", C16739o.f39979f);

    /* renamed from: ab */
    private final AbstractC16725d<String> f83220ab = new C16737m("enter_from", C16739o.f39979f);

    /* renamed from: ac */
    private final AbstractC16725d<String> f83221ac = new C16737m("preload_channel_name", C16739o.f39979f);

    /* renamed from: ad */
    private final AbstractC16725d<String> f83222ad = new C16737m("preload_scene", C16739o.f39979f);

    /* renamed from: ae */
    private final C16729h f83223ae = new C16729h("preload_web_status");

    /* renamed from: af */
    private final AbstractC16725d<String> f83224af = new C16737m("add_common", C16739o.f39979f);

    /* renamed from: ag */
    private final C16722a f83225ag = new C16722a("control_request_url");

    /* renamed from: ah */
    private final C16722a f83226ah = new C16722a("safeTemplate");

    /* renamed from: ai */
    private final C16722a f83227ai = new C16722a("bundle_nav_bar_status_padding");

    /* renamed from: aj */
    private final C16729h f83228aj = new C16729h("preload_is_web_url");

    static {
        Covode.recordClassIndex(42388);
    }

    /* renamed from: f */
    public final String mo62115f() {
        String b = this.f83211Z.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: g */
    public final String mo62116g() {
        String b = this.f83220ab.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: h */
    public final String mo62117h() {
        String b = this.f83219aa.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: i */
    public final String mo62118i() {
        String b = this.f83221ac.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: j */
    public final String mo62119j() {
        String b = this.f83222ad.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: m */
    public final String mo62122m() {
        String b = this.f83210Y.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: k */
    public final int mo62120k() {
        Integer num = (Integer) this.f83223ae.mo26550b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo62121l() {
        Integer num = (Integer) this.f83228aj.mo26550b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: n */
    public final boolean mo62123n() {
        Boolean bool = (Boolean) this.f83227ai.mo26550b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c, com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g
    /* renamed from: a */
    public List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f83210Y, this.f83211Z, this.f83219aa, this.f83221ac, this.f83222ad, this.f83223ae, this.f83220ab, this.f83225ag, this.f83213aG, this.f83214aH, this.f83226ah, this.f83224af, this.f83212aF, this.f39924O, this.f83227ai, this.f83228aj, this.f83215aI, this.f83216aJ, this.f40069V, this.f83217aK, this.f83218aL, this.f39946v));
    }
}
