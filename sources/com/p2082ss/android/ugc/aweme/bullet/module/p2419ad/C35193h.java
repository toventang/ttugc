package com.p2082ss.android.ugc.aweme.bullet.module.p2419ad;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16852d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.h */
public final class C35193h extends C16852d {

    /* renamed from: at */
    public final C16722a f83064at = new C16722a("is_lynx_landing_page", false);

    /* renamed from: au */
    public final AbstractC16725d<String> f83065au = new C16737m("lynx_channel_name", C16739o.f39979f);

    /* renamed from: av */
    public final AbstractC16725d<String> f83066av = new C16737m("bundle_render_type", C16739o.f39979f);

    /* renamed from: aw */
    public final AbstractC16725d<Integer> f83067aw = new C16737m("bundle_lynx_landing_style", C16739o.f39975b);

    /* renamed from: ax */
    public final AbstractC16725d<String> f83068ax = new C16737m("bundle_native_site_ad_info", C16739o.f39979f);

    /* renamed from: ay */
    public final AbstractC16725d<String> f83069ay = new C16737m("bundle_native_site_app_data", C16739o.f39979f);

    static {
        Covode.recordClassIndex(42351);
    }

    /* renamed from: b */
    public final String mo62035b() {
        String b = this.f83065au.mo26550b();
        if (b == null) {
            return "";
        }
        return b;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16852d, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c
    /* renamed from: a */
    public final List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f83064at, this.f83065au, this.f83066av, this.f83067aw, this.f83068ax, this.f83069ay));
    }
}
