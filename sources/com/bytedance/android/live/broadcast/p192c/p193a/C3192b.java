package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.c.a.b */
public final class C3192b {

    /* renamed from: a */
    public static final C3192b f9217a = new C3192b();

    /* renamed from: com.bytedance.android.live.broadcast.c.a.b$a */
    public static final class C3193a extends C27895a<List<? extends C11672a.C11674b>> {
        static {
            Covode.recordClassIndex(3674);
        }

        C3193a() {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c.a.b$b */
    public static final class C3194b extends C27895a<List<? extends C11672a.C11674b>> {
        static {
            Covode.recordClassIndex(3675);
        }

        C3194b() {
        }
    }

    private C3192b() {
    }

    static {
        Covode.recordClassIndex(3673);
    }

    /* renamed from: a */
    public static List<C11672a.C11674b> m8668a(String str) {
        C28022o oVar;
        String str2;
        C28022o oVar2;
        C27919i iVar;
        AbstractC28019l c;
        AbstractC28019l c2;
        List<C11672a.C11674b> list = null;
        if (str != null) {
            try {
                AbstractC28019l a = C28024q.m56139a(str);
                if (a != null) {
                    oVar = a.mo46789j();
                } else {
                    oVar = null;
                }
                if (!(oVar == null || (c2 = oVar.mo46803c("video_tag")) == null)) {
                    c2.mo46689c();
                }
                if (oVar == null || (c = oVar.mo46803c("beautyConfig")) == null) {
                    str2 = null;
                } else {
                    str2 = c.mo46689c();
                }
                AbstractC28019l a2 = C28024q.m56139a(str2);
                if (a2 != null) {
                    oVar2 = a2.mo46789j();
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    iVar = oVar2.mo46805e("items");
                } else {
                    iVar = null;
                }
                list = (List) C4139e.C4140a.f11575b.mo46668a((AbstractC28019l) iVar, new C3193a().type);
            } catch (Throwable unused) {
            }
        }
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: a */
    public static C11672a m8667a(Effect effect, C11672a aVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(aVar, "");
        try {
            AbstractC28019l a = C28024q.m56139a(effect.getExtra());
            C89219l.m154716b(a, "");
            C28022o j = a.mo46789j();
            if (j.mo46802b("ab_group")) {
                int value = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
                AbstractC28019l c = j.mo46803c("ab_group");
                C89219l.m154716b(c, "");
                if (value != c.mo46694g()) {
                    return aVar;
                }
            }
            if (j.mo46802b("MakeupType")) {
                AbstractC28019l c2 = j.mo46803c("MakeupType");
                C89219l.m154716b(c2, "");
                aVar.f27900h = c2.mo46694g();
            }
            if (j.mo46802b("beautyConfig")) {
                AbstractC28019l c3 = j.mo46803c("beautyConfig");
                C89219l.m154716b(c3, "");
                AbstractC28019l a2 = C28024q.m56139a(c3.mo46689c());
                C89219l.m154716b(a2, "");
                List<C11672a.C11674b> list = (List) C4139e.C4140a.f11575b.mo46668a((AbstractC28019l) a2.mo46789j().mo46805e("items"), new C3194b().type);
                C89219l.m154716b(list, "");
                aVar.mo18441a(list);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    aVar.f27908p.add(it.next().f27921c);
                }
            }
        } catch (Throwable unused) {
        }
        return aVar;
    }
}
