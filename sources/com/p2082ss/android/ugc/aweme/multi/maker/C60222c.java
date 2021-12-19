package com.p2082ss.android.ugc.aweme.multi.maker;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.C60207h;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.c */
public final class C60222c extends AbstractC60267o {

    /* renamed from: d */
    public static final C60223a f137278d = new C60223a((byte) 0);

    /* renamed from: e */
    private boolean f137279e;

    /* renamed from: f */
    private final C60224b f137280f = new C60224b();

    static {
        Covode.recordClassIndex(70754);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$a */
    public static final class C60223a {
        static {
            Covode.recordClassIndex(70755);
        }

        private C60223a() {
        }

        public /* synthetic */ C60223a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$c */
    public static final class C60225c extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(70757);
        }

        C60225c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$d */
    public static final class C60226d extends C27895a<Boolean> {
        static {
            Covode.recordClassIndex(70758);
        }

        C60226d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$e */
    public static final class C60227e extends C27895a<String> {
        static {
            Covode.recordClassIndex(70759);
        }

        C60227e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$f */
    public static final class C60228f extends C27895a<String> {
        static {
            Covode.recordClassIndex(70760);
        }

        C60228f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$g */
    public static final class C60229g extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(70761);
        }

        C60229g() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60222c();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.TIKTOK_GAME.getTYPE();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: m */
    public final boolean mo97926m() {
        return m109789v();
    }

    /* renamed from: w */
    private final boolean m109790w() {
        List<AnchorCommonStruct> anchors = mo97949o().getAnchors();
        if (anchors == null) {
            anchors = C89086z.INSTANCE;
        }
        if (C60207h.m109760a(new ArrayList(anchors)).size() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private final String m109792y() {
        if (m109790w()) {
            return "0";
        }
        if (m109791x()) {
            return "1";
        }
        return "2";
    }

    /* renamed from: z */
    private final String m109793z() {
        String schema;
        String queryParameter;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || (queryParameter = Uri.parse(schema).getQueryParameter("global_game_id")) == null) {
            return "";
        }
        return queryParameter;
    }

    /* renamed from: x */
    private final boolean m109791x() {
        List<AnchorCommonStruct> anchors = mo97949o().getAnchors();
        if (anchors == null) {
            anchors = C89086z.INSTANCE;
        }
        ArrayList<AnchorCommonStruct> a = C60207h.m109760a(new ArrayList(anchors));
        if (a.size() > 0 && a.get(0).getType() == EnumC31359ab.TIKTOK_GAME.getTYPE()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private String m109787n() {
        String str;
        String str2;
        C28022o oVar = new C28022o();
        try {
            oVar.mo46801a("enter_from", mo97950p());
            oVar.mo46801a("from_source", "item_anchor");
            oVar.mo46801a("from_group_id", mo97949o().getAid());
            oVar.mo46801a("from_author_id", mo97949o().getAuthorUid());
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getId();
            } else {
                str = null;
            }
            oVar.mo46801a("scene_id", str);
            if (m109790w()) {
                str2 = "item_play";
            } else {
                str2 = "anchor_list";
            }
            oVar.mo46801a("position", str2);
            oVar.mo46801a("anchor_type", m109792y());
        } catch (Exception unused) {
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }

    /* renamed from: u */
    private final void m109788u() {
        String str;
        C28022o oVar;
        if (m109789v()) {
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            AbstractC28019l lVar = null;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getExtra();
            } else {
                str = null;
            }
            AbstractC28019l a = C28024q.m56139a(str);
            if (a != null) {
                oVar = a.mo46789j();
            } else {
                oVar = null;
            }
            C27910f fVar = new C27910f();
            if (oVar != null) {
                lVar = oVar.mo46803c("gecko_channel");
            }
            AdLandPagePreloadServiceImpl.m68380f().mo59376a().mo59418c((List) fVar.mo46668a(lVar, new C60229g().type));
        }
    }

    /* renamed from: v */
    private final boolean m109789v() {
        String str;
        String str2;
        C28022o oVar;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        AbstractC28019l lVar = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        AbstractC28019l a = C28024q.m56139a(str2);
        if (a != null) {
            oVar = a.mo46789j();
        } else {
            oVar = null;
        }
        C27910f fVar = new C27910f();
        if (oVar != null) {
            lVar = oVar.mo46803c("is_schema_lynx");
        }
        Boolean bool = (Boolean) fVar.mo46668a(lVar, new C60226d().type);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97870a(C60202d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo97870a(dVar);
        m109786a("mp_show", m109792y(), "anchor_list");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo97892c(dVar);
        if (!m109790w()) {
            m109786a("mp_click", m109792y(), "item_play");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        this.f137279e = true;
        m109788u();
        String y = m109792y();
        if (m109790w() || m109791x()) {
            str = "item_play";
        } else {
            str = "anchor_list";
        }
        m109786a("mp_show", y, str);
        super.mo97891b(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0104  */
    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97893d(com.p2082ss.android.ugc.aweme.app.p2328f.C33744d r19) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.maker.C60222c.mo97893d(com.ss.android.ugc.aweme.app.f.d):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.c$b */
    public static final class C60224b {

        /* renamed from: a */
        HashMap<String, Boolean> f137281a = new HashMap<>();

        /* renamed from: b */
        HashMap<String, Boolean> f137282b = new HashMap<>();

        static {
            Covode.recordClassIndex(70756);
        }

        /* renamed from: a */
        public final boolean mo97927a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            Boolean bool = true;
            if (C89219l.m154714a((Object) str, (Object) "mp_show")) {
                Boolean bool2 = this.f137281a.get(str2);
                if (bool2 != null) {
                    bool = bool2;
                }
                this.f137281a.put(str2, false);
                return bool.booleanValue();
            } else if (!C89219l.m154714a((Object) str, (Object) "mp_click")) {
                return true;
            } else {
                Boolean bool3 = this.f137282b.get(str2);
                if (bool3 != null) {
                    bool = bool3;
                }
                this.f137282b.put(str2, false);
                return bool.booleanValue();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97871a(C60202d dVar, AbstractC34673c cVar, AbstractC33504a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C60224b bVar = this.f137280f;
        bVar.f137281a = new HashMap<>();
        bVar.f137282b = new HashMap<>();
        if (!this.f137279e) {
            m109788u();
        }
    }

    /* renamed from: a */
    private final void m109786a(String str, String str2, String str3) {
        String extra;
        String str4;
        C28022o oVar;
        AbstractC28019l lVar;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        AbstractC28019l lVar2 = null;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0 && this.f137280f.mo97927a(str, str3)) {
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 != null) {
                str4 = anchorCommonStruct2.getExtra();
            } else {
                str4 = null;
            }
            AbstractC28019l a = C28024q.m56139a(str4);
            if (a != null) {
                oVar = a.mo46789j();
            } else {
                oVar = null;
            }
            C33744d dVar = new C33744d();
            C27910f fVar = new C27910f();
            if (oVar != null) {
                lVar = oVar.mo46803c("game_id");
            } else {
                lVar = null;
            }
            C33744d a2 = dVar.mo59983a("game_id", (String) fVar.mo46668a(lVar, new C60227e().type));
            C27910f fVar2 = new C27910f();
            if (oVar != null) {
                lVar2 = oVar.mo46803c("game_name");
            }
            C33744d a3 = a2.mo59983a("game_name", (String) fVar2.mo46668a(lVar2, new C60228f().type)).mo59983a("global_game_id", m109793z()).mo59983a("enter_from", mo97950p());
            String aid = mo97949o().getAid();
            String str5 = "";
            if (aid == null) {
                aid = str5;
            }
            C33744d a4 = a3.mo59983a("group_id", aid);
            String authorUid = mo97949o().getAuthorUid();
            if (authorUid != null) {
                str5 = authorUid;
            }
            C39162r.m79460a(str, a4.mo59983a("author_id", str5).mo59983a("anchor_id", mo97872b().mo97899a()).mo59983a("anchor_type", str2).mo59983a("position", str3).mo59983a("params_for_special", "game_platform").f79943a);
        }
    }
}
