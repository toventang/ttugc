package com.bytedance.android.live.effect.p244e;

import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.e.f */
public final class C4265f implements AbstractC4157j.AbstractC4158a<C11672a> {

    /* renamed from: a */
    public static final C4266a f11788a = new C4266a((byte) 0);

    static {
        Covode.recordClassIndex(4835);
    }

    /* renamed from: com.bytedance.android.live.effect.e.f$a */
    public static final class C4266a {
        static {
            Covode.recordClassIndex(4836);
        }

        private C4266a() {
        }

        public /* synthetic */ C4266a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.e.f$b */
    public static final class C4267b extends C27895a<List<? extends C11672a.C11674b>> {
        static {
            Covode.recordClassIndex(4837);
        }

        C4267b() {
        }
    }

    /* renamed from: a */
    private static boolean m10367a(String str) {
        AbstractC28019l c;
        try {
            AbstractC28019l a = C28024q.m56139a(str);
            if (a == null || (c = a.mo46789j().mo46803c("exclusive")) == null) {
                return false;
            }
            return c.mo46695h();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4158a
    /* renamed from: a */
    public final List<C4315e<C11672a>> mo9866a(EffectChannelResponse effectChannelResponse) {
        List<EffectCategoryResponse> categoryResponseList;
        List list;
        List<Effect> totalEffects;
        ArrayList arrayList = new ArrayList();
        if (!(effectChannelResponse == null || (categoryResponseList = effectChannelResponse.getCategoryResponseList()) == null)) {
            ArrayList<EffectCategoryResponseTemplate> arrayList2 = new ArrayList();
            for (T t : categoryResponseList) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (C4278b.m10380a(t2.getExtra())) {
                    arrayList2.add(t);
                }
            }
            int i = 0;
            for (EffectCategoryResponseTemplate effectCategoryResponseTemplate : arrayList2) {
                if (!(effectCategoryResponseTemplate == null || (totalEffects = effectCategoryResponseTemplate.getTotalEffects()) == null)) {
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) totalEffects, 10));
                    for (T t3 : totalEffects) {
                        C89219l.m154716b(t3, "");
                        arrayList3.add(m10365a(t3, null, null, Integer.valueOf(i)));
                        i++;
                    }
                    ArrayList<C11672a> arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
                    for (C11672a aVar : arrayList4) {
                        aVar.f27886B = effectCategoryResponseTemplate.getName();
                        String extra = effectCategoryResponseTemplate.getExtra();
                        C89219l.m154716b(extra, "");
                        aVar.f27888D = m10367a(extra);
                        String name = effectCategoryResponseTemplate.getName();
                        C89219l.m154716b(name, "");
                        m10366a(aVar, name);
                        arrayList5.add(aVar);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj : arrayList5) {
                        C11672a aVar2 = (C11672a) obj;
                        if (aVar2.mo18439a() != null || !C13603b.m24435a((Collection) aVar2.f27907o) || aVar2.f27887C) {
                            arrayList6.add(obj);
                        }
                    }
                    list = C89070n.m154590j(arrayList6);
                    if (list != null) {
                        C89219l.m154716b(effectCategoryResponseTemplate, "");
                        String name2 = effectCategoryResponseTemplate.getName();
                        C89219l.m154716b(name2, "");
                        arrayList.add(new C4315e(name2, list));
                    }
                }
                list = C89086z.INSTANCE;
                C89219l.m154716b(effectCategoryResponseTemplate, "");
                String name22 = effectCategoryResponseTemplate.getName();
                C89219l.m154716b(name22, "");
                arrayList.add(new C4315e(name22, list));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m10366a(C11672a aVar, String str) {
        List<Effect> childEffects;
        Effect effect = aVar.f27909q;
        if (effect != null && effect.getEffectType() == 1) {
            Effect effect2 = aVar.f27909q;
            List<C11672a> list = null;
            if (!C13603b.m24435a((Collection) (effect2 != null ? effect2.getChildEffects() : null))) {
                Effect effect3 = aVar.f27909q;
                if (!(effect3 == null || (childEffects = effect3.getChildEffects()) == null)) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : childEffects) {
                        T t2 = t;
                        C89219l.m154716b(t2, "");
                        C89219l.m154721d(t2, "");
                        if (C4278b.m10380a(t2.getExtra()) || C4278b.m10379a((Effect) t2)) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<Effect> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                    for (Effect effect4 : arrayList2) {
                        C89219l.m154716b(effect4, "");
                        arrayList3.add(m10365a(effect4, aVar.f27895c, aVar.f27897e, aVar.f27918z));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        C11672a aVar2 = (C11672a) obj;
                        aVar2.f27888D = true;
                        aVar2.f27886B = str;
                        if (aVar2.mo18439a() != null || aVar2.f27887C) {
                            arrayList4.add(obj);
                        }
                    }
                    list = C89070n.m154590j(arrayList4);
                }
                aVar.f27907o = list;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[Catch:{ all -> 0x0091 }, LOOP:0: B:17:0x0076->B:19:0x007c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.android.livesdkapi.depend.model.C11672a m10365a(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p244e.C4265f.m10365a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.lang.String, java.lang.Integer):com.bytedance.android.livesdkapi.depend.model.a");
    }
}
