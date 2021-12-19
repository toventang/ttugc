package com.bytedance.ies.bullet.service.p1172f.p1173a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16737m;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16739o;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.ies.bullet.service.f.a.g */
public class C16855g extends C16721b {

    /* renamed from: Q */
    public final AbstractC16725d<Boolean> f40064Q = new C16722a("immersive_mode");

    /* renamed from: R */
    public final AbstractC16725d<Boolean> f40065R = new C16722a("use_webview_title", true);

    /* renamed from: S */
    public final AbstractC16725d<Boolean> f40066S = new C16722a("auto_play_bgm");

    /* renamed from: T */
    public final AbstractC16725d<Boolean> f40067T = new C16722a("enable_video_landscape", false);

    /* renamed from: U */
    public final AbstractC16725d<Boolean> f40068U = new C16722a("disable_save_image");

    /* renamed from: V */
    public final AbstractC16725d<Boolean> f40069V = new C16722a("hide_system_video_poster");

    /* renamed from: W */
    public final C16729h f40070W = new C16729h("ignore_cache_policy");

    /* renamed from: X */
    public final AbstractC16725d<String> f40071X = new C16737m("__status_bar", C16739o.f39979f);

    static {
        Covode.recordClassIndex(19295);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q, com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b, com.bytedance.ies.bullet.service.p1172f.p1173a.C16778c
    /* renamed from: a */
    public List<AbstractC16725d<?>> mo26542a() {
        return C89070n.m154572d((Collection) super.mo26542a(), (Iterable) C89070n.m154522b(this.f40064Q, this.f40065R, this.f40066S, this.f40068U, this.f40069V, this.f40070W, this.f40067T, this.f40071X));
    }
}
