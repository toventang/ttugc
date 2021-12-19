package com.p2082ss.android.ugc.aweme.sticker.p3958f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.f.c */
public final class C75344c {
    static {
        Covode.recordClassIndex(88262);
    }

    /* renamed from: a */
    public static final int m132145a(AbstractC75655o oVar) {
        C89219l.m154721d(oVar, "");
        return m132148b(oVar);
    }

    /* renamed from: b */
    public static final int m132148b(AbstractC75655o oVar) {
        C89219l.m154721d(oVar, "");
        Map<String, AbstractC75698f> a = oVar.mo119291c().mo119463i().mo119430a();
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry<String, AbstractC75698f> entry : a.entrySet()) {
            arrayList.add(entry.getKey());
        }
        ArrayList arrayList2 = arrayList;
        int i = 0;
        for (T t : C75723b.m132877a(oVar.mo119291c().mo119464j())) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (!arrayList2.contains(t.getKey())) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    /* renamed from: a */
    public static final boolean m132147a(AbstractC75655o oVar, Effect effect) {
        C89219l.m154721d(oVar, "");
        return oVar.mo119302n().mo119326c(effect);
    }

    /* renamed from: d */
    public static final boolean m132151d(AbstractC75655o oVar, Effect effect) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(effect, "");
        if (!C75466g.m132353e(effect) || oVar.mo119291c().mo119457c().mo119434a(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m132150c(AbstractC75655o oVar, Effect effect) {
        String str;
        C89219l.m154721d(oVar, "");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect g = oVar.mo119295g();
        String str2 = null;
        if (g != null) {
            str = g.getEffectId();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) effectId, (Object) str)) {
            return true;
        }
        if (C89219l.m154714a((Object) oVar.mo119305p().f170069a, (Object) "livestreaming")) {
            String resourceId = effect.getResourceId();
            Effect g2 = oVar.mo119295g();
            if (g2 != null) {
                str2 = g2.getResourceId();
            }
            if (C89219l.m154714a((Object) resourceId, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m132149b(AbstractC75655o oVar, Effect effect) {
        String str;
        C89219l.m154721d(oVar, "");
        if (effect == null) {
            return false;
        }
        String effectId = effect.getEffectId();
        Effect f = oVar.mo119294f();
        String str2 = null;
        if (f != null) {
            str = f.getEffectId();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) effectId, (Object) str)) {
            return true;
        }
        if (C89219l.m154714a((Object) oVar.mo119305p().f170069a, (Object) "livestreaming")) {
            String resourceId = effect.getResourceId();
            Effect f2 = oVar.mo119294f();
            if (f2 != null) {
                str2 = f2.getResourceId();
            }
            if (C89219l.m154714a((Object) resourceId, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final Effect m132146a(AbstractC75655o oVar, List<? extends Effect> list, int i) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(list, "");
        if (list.size() - 2 < i) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        int size = list.size();
        while (i < size) {
            if (m132151d(oVar, (Effect) list.get(i))) {
                return (Effect) list.get(i);
            }
            i++;
        }
        return null;
    }
}
