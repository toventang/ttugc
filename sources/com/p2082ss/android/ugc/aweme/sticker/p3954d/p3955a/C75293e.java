package com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75435m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a.e */
public final class C75293e implements AbstractC75292d {

    /* renamed from: a */
    private final AbstractC75655o f169276a;

    /* renamed from: b */
    private final AbstractC75429h f169277b;

    static {
        Covode.recordClassIndex(88195);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d
    /* renamed from: a */
    public final <T> boolean mo118624a(AbstractC75296b<T> bVar) {
        Bundle bundle;
        String str;
        boolean z;
        String str2 = "";
        C89219l.m154721d(bVar, str2);
        if ((bVar instanceof C75297c) && (bVar.mo118631b() == EnumC75295a.UI_CLICK || bVar.mo118631b() == EnumC75295a.UI_GALLERY)) {
            C75297c cVar = (C75297c) bVar;
            Effect effect = cVar.f169280a;
            if (cVar.f169287h != Integer.MIN_VALUE) {
                int i = cVar.f169287h;
                AbstractC75655o oVar = this.f169276a;
                C89219l.m154721d(oVar, str2);
                C89219l.m154721d(str2, str2);
                AbstractC75720y j = oVar.mo119291c().mo119464j();
                int size = C75723b.m132877a(j).size();
                if (i >= 0 && size > i) {
                    str = C75435m.m132306a(C75723b.m132877a(j).get(i));
                } else {
                    str = str2;
                }
                bundle = cVar.f169284e;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                if (i >= 0) {
                    str2 = String.valueOf(i);
                }
                bundle.putString("prop_tab_order", str2);
                bundle.putString("prop_tab_name", str);
            } else {
                bundle = cVar.f169284e;
                str = str2;
            }
            AbstractC75429h hVar = this.f169277b;
            boolean a = C75344c.m132147a(this.f169276a, effect);
            int a2 = bVar.mo118630a();
            if (bVar.mo118631b() == EnumC75295a.UI_GALLERY) {
                z = true;
            } else {
                z = false;
            }
            hVar.mo118954a(effect, a, str, "click_main_panel", a2, z, bundle);
        }
        return false;
    }

    public C75293e(AbstractC75655o oVar, AbstractC75429h hVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        this.f169276a = oVar;
        this.f169277b = hVar;
    }
}
