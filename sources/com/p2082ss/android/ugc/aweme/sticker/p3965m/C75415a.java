package com.p2082ss.android.ugc.aweme.sticker.p3965m;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.a */
public final class C75415a implements AbstractC75429h {

    /* renamed from: a */
    public int f169495a;

    /* renamed from: c */
    private final ShortVideoContext f169496c;

    static {
        Covode.recordClassIndex(88334);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118951a(long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118953a(Effect effect, boolean z, String str) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118955a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118956a(String str, long j) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final AbstractC75432j mo118950a() {
        return C75433k.f169514a;
    }

    public C75415a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f169496c = shortVideoContext;
    }

    /* renamed from: a */
    private final HashMap<String, String> m132244a(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.f169496c;
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
    public final void mo118952a(Effect effect, String str, String str2, int i) {
        String str3;
        String r;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        HashMap<String, String> a = m132244a(effect, str2);
        if (str == null) {
            str = "";
        }
        a.put("tab_name", str);
        a.put("prop_selected_from", "other");
        a.put("impr_position", String.valueOf(i));
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a.put("prop_rec_id", recId);
        if (this.f169496c.f155780aN) {
            str3 = "story_shoot_page";
        } else {
            str3 = "video_shoot_page";
        }
        a.put("shoot_page", str3);
        if (this.f169496c.f155780aN) {
            r = "story";
        } else {
            r = this.f169496c.mo110042r();
        }
        C89219l.m154716b(r, "");
        a.put("shoot_tab_name", r);
        a.put("enter_method", "click_personal_board");
        a.put("is_original_prop", "1");
        a.put("prop_author_id", effect.getDesignerId());
        C75434l.m132305a("prop_show", a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h
    /* renamed from: a */
    public final void mo118954a(Effect effect, boolean z, String str, String str2, int i, boolean z2, Bundle bundle) {
        String str3;
        String str4;
        String r;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str2, "");
        this.f169495a = i;
        HashMap<String, String> a = m132244a(effect, str2);
        if (str == null) {
            str = "";
        }
        a.put("tab_name", str);
        if (!z) {
            a.remove("parent_pop_id");
        }
        if (C75466g.m132368t(effect)) {
            a.put("order", String.valueOf(i - 1));
        }
        if (z2) {
            a.put("prop_selected_from", "outer_rec");
        } else {
            a.put("prop_selected_from", "other");
        }
        String str5 = "1";
        a.put("is_original_prop", str5);
        a.put("prop_author_id", View$OnClickListenerC75500b.f169657P);
        String recId = effect.getRecId();
        if (recId == null) {
            recId = "0";
        }
        a.put("prop_rec_id", recId);
        a.put("impr_position", String.valueOf(i));
        String str6 = this.f169496c.f155761V;
        if (str6 == null) {
            str6 = "";
        }
        a.put("from_prop_id", str6);
        if (C89219l.m154714a((Object) this.f169496c.f155761V, (Object) effect.getEffectId())) {
            str3 = str5;
        } else {
            str3 = "0";
        }
        a.put("is_default_prop", str3);
        if (!effect.isBusiness()) {
            str5 = "0";
        }
        a.put("is_commercial_prop", str5);
        if (this.f169496c.f155780aN) {
            str4 = "story_shoot_page";
        } else {
            str4 = "video_shoot_page";
        }
        a.put("shoot_page", str4);
        if (this.f169496c.f155780aN) {
            r = "story";
        } else {
            r = this.f169496c.mo110042r();
        }
        C89219l.m154716b(r, "");
        a.put("shoot_tab_name", r);
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
        }
        C75434l.m132305a("prop_click", a);
    }
}
