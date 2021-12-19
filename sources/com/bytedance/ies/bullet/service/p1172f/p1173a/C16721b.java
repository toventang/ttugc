package com.bytedance.ies.bullet.service.p1172f.p1173a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16747u;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16733k;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16735l;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16742r;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b */
public class C16721b extends C16778c {

    /* renamed from: A */
    public final AbstractC16725d<Boolean> f39910A = new C16722a("hide_loading");

    /* renamed from: B */
    public final C16722a f39911B = new C16722a("show_load_dialog", true);

    /* renamed from: C */
    public final AbstractC16725d<Boolean> f39912C = new C16722a("should_full_screen");

    /* renamed from: D */
    public final AbstractC16725d<C16746t> f39913D = new C16737m("bg_color", C16747u.f39990a, new C16746t(-2));

    /* renamed from: E */
    public final AbstractC16725d<C16746t> f39914E = new C16737m("top_bar_color", C16747u.f39990a, new C16746t(-2));

    /* renamed from: F */
    public final AbstractC16725d<Boolean> f39915F = new C16722a("need_bottom_out");

    /* renamed from: G */
    public final AbstractC16725d<Boolean> f39916G = new C16722a("status_bar_padding");

    /* renamed from: H */
    public final AbstractC16725d<Boolean> f39917H = new C16722a("enable_xschema_interceptor", false);

    /* renamed from: I */
    public final AbstractC16725d<Long> f39918I = new C16732j("load_url_delay_time");

    /* renamed from: J */
    public final C16722a f39919J = new C16722a("use_ordinary_web", true);

    /* renamed from: K */
    public final AbstractC16725d<String> f39920K = new C16737m("topbar_type", C16739o.f39979f);

    /* renamed from: L */
    public final AbstractC16725d<String> f39921L = new C16737m("disable_pop_gesture", C16739o.f39979f);

    /* renamed from: M */
    public final C16722a f39922M = new C16722a("hide_more", true);

    /* renamed from: N */
    public final AbstractC16725d<Boolean> f39923N = new C16722a("show_debug_title");

    /* renamed from: O */
    public final AbstractC16725d<Boolean> f39924O = new C16722a("copy_link_action");

    /* renamed from: a */
    public final AbstractC16725d<Boolean> f39925a = new C16722a("hide_status_bar");

    /* renamed from: b */
    public final AbstractC16725d<Boolean> f39926b = new C16722a("hide_nav_bar");

    /* renamed from: c */
    public final AbstractC16725d<Boolean> f39927c = new C16722a("trans_status_bar");

    /* renamed from: d */
    public final AbstractC16725d<C16746t> f39928d = new C16737m("nav_bar_color", C16747u.f39990a, new C16746t(-2));

    /* renamed from: e */
    public final AbstractC16725d<C16746t> f39929e = new C16737m("status_bar_color", C16747u.f39990a, new C16746t(-2));

    /* renamed from: f */
    public final AbstractC16725d<EnumC16742r> f39930f = new C16737m("status_font_mode", C16747u.f39992c, EnumC16742r.AUTO);

    /* renamed from: g */
    public final AbstractC16725d<String> f39931g = new C16737m("title", C16739o.f39979f);

    /* renamed from: h */
    public final AbstractC16725d<C16746t> f39932h = new C16737m("title_color", C16747u.f39990a, new C16746t(-2));

    /* renamed from: i */
    public final AbstractC16725d<EnumC16733k> f39933i = new C16737m("nav_btn_type", C16747u.f39991b, EnumC16733k.NONE);

    /* renamed from: j */
    public final C16722a f39934j = new C16722a("show_more_button");

    /* renamed from: k */
    public final AbstractC16725d<C16746t> f39935k = new C16737m("container_bgcolor", C16747u.f39990a, new C16746t(-2));

    /* renamed from: l */
    public final AbstractC16725d<C16746t> f39936l = new C16737m("loading_bgcolor", C16747u.f39990a, new C16746t(-2));

    /* renamed from: m */
    public final AbstractC16725d<EnumC16735l> f39937m = new C16737m("need_out_animation", C16747u.f39993d, EnumC16735l.AUTO);

    /* renamed from: n */
    public final AbstractC16725d<Boolean> f39938n = new C16722a("show_loading", true);

    /* renamed from: o */
    public final AbstractC16725d<Boolean> f39939o = new C16722a("show_error", true);

    /* renamed from: p */
    public final C16722a f39940p = new C16722a("show_keyboard");

    /* renamed from: q */
    public final AbstractC16725d<String> f39941q = new C16737m("report_bid", C16739o.f39979f);

    /* renamed from: r */
    public final AbstractC16725d<String> f39942r = new C16737m("report_pid", C16739o.f39979f);

    /* renamed from: s */
    public final AbstractC16725d<Boolean> f39943s = new C16722a("show_closeall");

    /* renamed from: t */
    public final AbstractC16725d<Boolean> f39944t = new C16722a("is_adjust_pan");

    /* renamed from: u */
    public final AbstractC16725d<Boolean> f39945u = new C16722a("enable_immersion_keyboard_control", true);

    /* renamed from: v */
    public final C16729h f39946v = new C16729h("title_bar_style");

    /* renamed from: w */
    public final AbstractC16725d<Boolean> f39947w = new C16722a("no_hw");

    /* renamed from: x */
    public final AbstractC16725d<Boolean> f39948x = new C16722a("_need_container_id");

    /* renamed from: y */
    public final AbstractC16725d<Boolean> f39949y = new C16722a("block_back_press");

    /* renamed from: z */
    public final AbstractC16725d<Boolean> f39950z = new C16722a("status_font_dark", true);

    static {
        Covode.recordClassIndex(19161);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c
    /* renamed from: a */
    public List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f39947w, this.f39936l, this.f39925a, this.f39927c, this.f39929e, this.f39926b, this.f39923N, this.f39935k, this.f39931g, this.f39946v, this.f39928d, this.f39932h, this.f39943s, this.f39944t, this.f39945u, this.f39921L, this.f39922M, this.f39933i, this.f39934j, this.f39919J, this.f39920K, this.f39948x, this.f39941q, this.f39942r, this.f39938n, this.f39939o, this.f39940p, this.f39930f, this.f39937m, this.f39949y, this.f39916G, this.f39924O, this.f39950z, this.f39915F, this.f39912C, this.f39910A, this.f39913D, this.f39911B, this.f39914E, this.f39917H, this.f39918I));
    }
}
