package com.p2082ss.android.ugc.aweme.sticker.p3965m;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.b */
public final class C75421b implements AbstractC75429h {

    /* renamed from: a */
    public final AbstractC89171a<AbstractC84089j> f169503a;

    /* renamed from: c */
    private final AbstractC89244h f169504c = C89250i.m154773a((AbstractC89171a) new C75422a(this));

    /* renamed from: d */
    private final AbstractC89244h f169505d = C89250i.m154773a((AbstractC89171a) C75423b.f169508a);

    /* renamed from: e */
    private final ShortVideoContext f169506e;

    static {
        Covode.recordClassIndex(88340);
    }

    /* renamed from: b */
    private final AbstractC84089j m132269b() {
        return (AbstractC84089j) this.f169504c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118956a(String str, long j) {
        C89219l.m154721d(str, "");
        C75434l.m132305a("tool_performance_effect_use_info", C75434l.m132304a(this.f169506e, C89387v.m154943a("duration", String.valueOf(j)), C89387v.m154943a("effect_id", str)));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.m.b$b */
    static final class C75423b extends AbstractC89220m implements AbstractC89171a<C75425d> {

        /* renamed from: a */
        public static final C75423b f169508a = new C75423b();

        static {
            Covode.recordClassIndex(88342);
        }

        C75423b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75425d invoke() {
            return new C75425d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.m.b$a */
    static final class C75422a extends AbstractC89220m implements AbstractC89171a<AbstractC84089j> {

        /* renamed from: a */
        final /* synthetic */ C75421b f169507a;

        static {
            Covode.recordClassIndex(88341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75422a(C75421b bVar) {
            super(0);
            this.f169507a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC84089j invoke() {
            return this.f169507a.f169503a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final AbstractC75432j mo118950a() {
        return (C75425d) this.f169505d.getValue();
    }

    /* renamed from: c */
    private final boolean m132270c() {
        Boolean bool;
        LiveData<Boolean> b;
        AbstractC75573i v = m132269b().mo23169v();
        if (v == null || (b = v.mo119136b()) == null) {
            bool = null;
        } else {
            bool = b.getValue();
        }
        return C89219l.m154714a((Object) bool, (Object) true);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118955a(String str) {
        String r;
        String str2;
        String str3 = "video_shoot_page";
        if (!C89219l.m154714a((Object) str, (Object) "none") || !C63244g.m114602a().mo73255A().mo93901a()) {
            ShortVideoContext shortVideoContext = this.f169506e;
            C89378p[] pVarArr = new C89378p[1];
            if (str == null) {
                str = "";
            }
            pVarArr[0] = C89387v.m154943a("tab_name", str);
            HashMap<String, String> a = C75434l.m132304a(shortVideoContext, pVarArr);
            if (this.f169506e.f155780aN) {
                str3 = "story_shoot_page";
            }
            a.put("shoot_page", str3);
            if (this.f169506e.f155780aN) {
                r = "story";
            } else {
                r = this.f169506e.mo110042r();
            }
            C89219l.m154716b(r, "");
            a.put("shoot_tab_name", r);
            C75434l.m132305a("click_prop_tab", a);
            return;
        }
        Effect a2 = C75346e.m132154a(m132269b());
        C84425b a3 = new C84425b().mo129406a("shoot_way", this.f169506e.f155831p).mo129406a("enter_from", str3).mo129406a("creation_id", this.f169506e.f155830o);
        String str4 = null;
        if (a2 != null) {
            str2 = a2.getEffectId();
        } else {
            str2 = null;
        }
        C84425b a4 = a3.mo129406a("effect_id", str2);
        if (a2 != null) {
            str4 = a2.getName();
        }
        C84425b a5 = a4.mo129406a("effect_name", str4);
        if (this.f169506e.f155740A != 0) {
            a5.mo129403a("draft_id", this.f169506e.f155740A);
        }
        Map<String, String> map = a5.f188764a;
        C89219l.m154716b(map, "");
        C75434l.m132305a("remove_effect", map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.gamora.recorder.sticker.c.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75421b(ShortVideoContext shortVideoContext, AbstractC89171a<? extends AbstractC84089j> aVar) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(aVar, "");
        this.f169506e = shortVideoContext;
        this.f169503a = aVar;
    }

    /* renamed from: a */
    private final HashMap<String, String> m132268a(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.f169506e;
        C89378p[] pVarArr = new C89378p[4];
        pVarArr[0] = C89387v.m154943a("enter_method", str);
        pVarArr[1] = C89387v.m154943a("prop_id", effect.getEffectId());
        String parentId = effect.getParentId();
        if (parentId == null) {
            parentId = "";
        }
        pVarArr[2] = C89387v.m154943a("parent_pop_id", parentId);
        pVarArr[3] = C89387v.m154943a("prop_index", effect.getGradeKey());
        return C75434l.m132304a(shortVideoContext, pVarArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118951a(long j, int i) {
        C75434l.m132305a("tool_performance_enter_prop_tab", C75434l.m132304a(this.f169506e, C89387v.m154943a("duration", String.valueOf(j)), C89387v.m154943a("status", String.valueOf(i))));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118953a(Effect effect, boolean z, String str) {
        String str2 = "";
        C89219l.m154721d(effect, str2);
        C89219l.m154721d(str, str2);
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            C84425b a = new C84425b().mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("group_id", C70747dv.m124972a()).mo129406a("effect_id", effect.getEffectId()).mo129406a("creation_id", this.f169506e.f155830o);
            if (this.f169506e.f155740A != 0) {
                a.mo129403a("draft_id", this.f169506e.f155740A);
            }
            Map<String, String> map = a.f188764a;
            C89219l.m154716b(map, str2);
            C75434l.m132305a("prop_save", map);
            return;
        }
        HashMap<String, String> a2 = m132268a(effect, str);
        if (z) {
            String parentId = effect.getParentId();
            if (parentId != null) {
                str2 = parentId;
            }
            a2.put("parent_pop_id", str2);
        }
        C75434l.m132305a("prop_save", a2);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118952a(Effect effect, String str, String str2, int i) {
        String str3;
        String r;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        HashMap<String, String> a = m132268a(effect, str2);
        if (str == null) {
            str = "";
        }
        a.put("tab_name", str);
        a.put("prop_selected_from", "other");
        if (m132270c()) {
            a.put("after_search", "1");
        }
        a.put("impr_position", String.valueOf(i));
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a.put("prop_rec_id", recId);
        if (this.f169506e.f155780aN) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        a.put("shoot_page", str3);
        if (this.f169506e.f155780aN) {
            r = "story";
        } else {
            r = this.f169506e.mo110042r();
        }
        C89219l.m154716b(r, "");
        a.put("shoot_tab_name", r);
        if (C75466g.m132351c(effect)) {
            a.put("is_original_prop", "1");
            a.put("prop_author_id", effect.getDesignerId());
        } else {
            a.put("is_original_prop", "0");
        }
        C75434l.m132305a("prop_show", a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118954a(Effect effect, boolean z, String str, String str2, int i, boolean z2, Bundle bundle) {
        String str3;
        String str4;
        String str5;
        String r;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        HashMap<String, String> a = m132268a(effect, str2);
        if (str == null) {
            str = "";
        }
        a.put("tab_name", str);
        if (!z) {
            a.remove("parent_pop_id");
        }
        if (m132270c()) {
            a.put("after_search", "1");
        }
        if (C75466g.m132368t(effect)) {
            a.put("order", String.valueOf(i - 1));
        }
        if (z2) {
            a.put("prop_selected_from", "outer_rec");
        } else {
            a.put("prop_selected_from", "other");
        }
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a.put("prop_rec_id", recId);
        a.put("impr_position", String.valueOf(i));
        String str6 = this.f169506e.f155761V;
        if (str6 == null) {
            str6 = "";
        }
        a.put("from_prop_id", str6);
        if (C89219l.m154714a((Object) this.f169506e.f155761V, (Object) effect.getEffectId())) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        a.put("is_default_prop", str3);
        if (effect.isBusiness()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        a.put("is_commercial_prop", str4);
        if (this.f169506e.f155780aN) {
            str5 = "story_shoot_page";
        } else {
            str5 = "video_shoot_page";
        }
        a.put("shoot_page", str5);
        if (this.f169506e.f155780aN) {
            r = "story";
        } else {
            r = this.f169506e.mo110042r();
        }
        C89219l.m154716b(r, "");
        a.put("shoot_tab_name", r);
        if (C75466g.m132351c(effect)) {
            a.put("is_original_prop", "1");
            a.put("prop_author_id", effect.getDesignerId());
        } else {
            a.put("is_original_prop", "0");
        }
        if (bundle != null) {
            String string = bundle.getString("prop_tab_name");
            if (!(string == null || string.length() == 0)) {
                a.put("prop_selected_from", "prop_panel_".concat(String.valueOf(string)));
            }
            String string2 = bundle.getString("prop_tab_order");
            if (!(string2 == null || string2.length() == 0)) {
                C89219l.m154716b(string2, "");
                a.put("prop_tab_order", string2);
            }
            String string3 = bundle.getString("enter_method");
            if (!(string3 == null || string3.length() == 0)) {
                C89219l.m154716b(string3, "");
                a.put("enter_method", string3);
            }
            String string4 = bundle.getString("search_id");
            if (!(string4 == null || string4.length() == 0)) {
                C89219l.m154716b(string4, "");
                a.put("search_id", string4);
            }
            String string5 = bundle.getString("search_method");
            if (!(string5 == null || string5.length() == 0)) {
                C89219l.m154716b(string5, "");
                a.put("search_method", string5);
            }
            String string6 = bundle.getString("is_panel_unfold");
            if (!(string6 == null || string6.length() == 0)) {
                C89219l.m154716b(string6, "");
                a.put("is_panel_unfold", string6);
            }
        }
        C75434l.m132305a("prop_click", a);
    }
}
