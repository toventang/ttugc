package com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.a.d */
public final class C75419d implements AbstractC84430d {

    /* renamed from: a */
    public static String f169500a;

    /* renamed from: b */
    public static final C75420a f169501b = new C75420a((byte) 0);

    /* renamed from: c */
    private final ShortVideoContext f169502c;

    static {
        Covode.recordClassIndex(88338);
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118964a(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.m.a.d$a */
    public static final class C75420a {
        static {
            Covode.recordClassIndex(88339);
        }

        private C75420a() {
        }

        public /* synthetic */ C75420a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final String mo118962a() {
        ShortVideoContext shortVideoContext = this.f169502c;
        if (shortVideoContext != null) {
            return shortVideoContext.f155831p;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: b */
    public final String mo118969b() {
        ShortVideoContext shortVideoContext = this.f169502c;
        if (shortVideoContext != null) {
            return shortVideoContext.f155830o;
        }
        return null;
    }

    public C75419d(ShortVideoContext shortVideoContext) {
        this.f169502c = shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118963a(AbstractC84430d.C84431a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        mo118967a(aVar.f188767a, aVar.f188768b, aVar.f188769c);
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: b */
    public final void mo118970b(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C84425b bVar = new C84425b();
        ShortVideoContext shortVideoContext = this.f169502c;
        if (shortVideoContext != null) {
            str3 = shortVideoContext.f155761V;
        } else {
            str3 = null;
        }
        C39162r.m79460a("search_gif", bVar.mo129406a("prop_id", str3).mo129406a("creation_id", mo118969b()).mo129406a("enter_from", str2).mo129406a("search_keyword", str).f188764a);
        f169500a = str;
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118966a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("click_gif_button", new C84425b().mo129406a("creation_id", mo118969b()).mo129406a("tab_name", str).mo129406a("enter_from", str2).f188764a);
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118968a(String str, boolean z) {
        C39162r.m79460a("show_media_tray", new C84425b().mo129406a("creation_id", mo118969b()).mo129406a("prop_id", str).mo129403a("giphy_show", z ? 1 : 0).f188764a);
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118965a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("load_gif_results", new C84425b().mo129406a("creation_id", mo118969b()).mo129403a("duration", i).mo129406a("load_type", str).mo129406a("search_keyword", str2).mo129403a("is_success", 1).f188764a);
    }

    @Override // com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d
    /* renamed from: a */
    public final void mo118967a(String str, String str2, String str3) {
        C89219l.m154721d(str3, "");
        C39162r.m79460a("choose_gif_content", new C84425b().mo129406a("creation_id", mo118969b()).mo129406a("giphy_id", str).mo129406a("prop_id", str2).mo129406a("tab_name", str3).mo129406a("search_keyword", f169500a).f188764a);
    }
}
