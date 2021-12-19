package com.p2082ss.android.ugc.aweme.sticker.p3954d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.b */
public final class C75294b implements AbstractC75299c {

    /* renamed from: a */
    public static final C75294b f169278a = new C75294b();

    private C75294b() {
    }

    static {
        Covode.recordClassIndex(88196);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75299c
    /* renamed from: a */
    public final boolean mo118629a(Effect effect, AbstractC75655o oVar) {
        String str;
        String str2;
        List<String> children;
        String str3;
        C89219l.m154721d(oVar, "");
        if (effect == null || effect.getEffectId() == null) {
            return true;
        }
        AbstractC75650j n = oVar.mo119302n();
        String effectId = effect.getEffectId();
        Effect value = n.mo119331h().getValue();
        String str4 = null;
        if (value != null) {
            str = value.getEffectId();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) effectId, (Object) str)) {
            return true;
        }
        String effectId2 = effect.getEffectId();
        Effect value2 = n.mo119332i().getValue();
        if (value2 != null) {
            str2 = value2.getEffectId();
        } else {
            str2 = null;
        }
        if (C89219l.m154714a((Object) effectId2, (Object) str2)) {
            return true;
        }
        if (!TextUtils.isEmpty(effect.getParentId())) {
            String parentId = effect.getParentId();
            Effect value3 = n.mo119332i().getValue();
            if (value3 != null) {
                str3 = value3.getEffectId();
            } else {
                str3 = null;
            }
            if (C89361p.m154872a(parentId, str3, false)) {
                return true;
            }
        }
        if (C75466g.m132345a(effect) && (children = effect.getChildren()) != null && !children.isEmpty()) {
            Effect value4 = n.mo119331h().getValue();
            if (value4 != null) {
                str4 = value4.getEffectId();
            }
            if (C89070n.m154556a((Iterable) children, (Object) str4)) {
                return true;
            }
        }
        return false;
    }
}
