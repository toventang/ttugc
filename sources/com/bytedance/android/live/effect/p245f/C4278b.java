package com.bytedance.android.live.effect.p245f;

import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.android.live.effect.f.b */
public final class C4278b {
    static {
        Covode.recordClassIndex(4848);
    }

    /* renamed from: a */
    public static final boolean m10378a(C11672a aVar) {
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f27909q;
        if (effect == null || effect.getEffectType() != 1 || C13603b.m24435a((Collection) aVar.f27907o)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m10379a(Effect effect) {
        C89219l.m154721d(effect, "");
        try {
            AbstractC28019l a = C28024q.m56139a(effect.getExtra());
            C89219l.m154716b(a, "");
            C28022o j = a.mo46789j();
            if (!j.mo46802b("is_none")) {
                return false;
            }
            AbstractC28019l c = j.mo46803c("is_none");
            C89219l.m154716b(c, "");
            if (c.mo46695h()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m10381b(C11672a aVar) {
        Boolean bool;
        C89219l.m154721d(aVar, "");
        boolean z = true;
        if (m10378a(aVar)) {
            List<C11672a> list = aVar.f27907o;
            if (list != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (!next.f27887C && !m10381b(next)) {
                            z = false;
                            break;
                        }
                    }
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return C11279p.m20012a(bool);
        }
        List<C11672a.C11674b> list2 = aVar.f27906n;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                C4180c a = C4180c.C4181a.m10258a();
                String str = aVar.f27899g;
                String str2 = it2.next().f27921c;
                if (str2 == null) {
                    str2 = "";
                }
                if (a.mo9863b(str, str2) == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m10380a(String str) {
        try {
            AbstractC28019l a = C28024q.m56139a(str);
            C89219l.m154716b(a, "");
            C28022o j = a.mo46789j();
            boolean b = j.mo46802b("ab_group");
            if (b) {
                try {
                    int value = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
                    AbstractC28019l c = j.mo46803c("ab_group");
                    C89219l.m154716b(c, "");
                    if (value == c.mo46694g()) {
                    }
                } catch (Throwable unused) {
                    if (!b || 0 != 0) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    /* renamed from: a */
    public static final int m10377a(String str, List<C11672a> list) {
        T t;
        String str2;
        List<C11672a> b;
        T t2;
        C4180c a = C4180c.C4181a.m10258a();
        if (a == null || (b = a.mo9847b(C4147a.f11586d)) == null) {
            t = null;
        } else {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (C89219l.m154714a((Object) t2.f27886B, (Object) str)) {
                    break;
                }
            }
            t = t2;
        }
        if (list == null) {
            return 0;
        }
        Iterator<C11672a> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            String str3 = it2.next().f27895c;
            if (t != null) {
                str2 = t.f27895c;
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str3, (Object) str2) && C11279p.m20012a(Boolean.valueOf(t.f27888D))) {
                break;
            }
            i++;
        }
        return C89271h.m154769b(i, 0);
    }
}
