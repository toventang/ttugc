package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.AbstractC75749b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75717v;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75727b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.c */
public final class C75795c implements AbstractC75717v {

    /* renamed from: a */
    public AbstractC75749b f170252a;

    /* renamed from: b */
    private final C88960c<C75727b> f170253b;

    static {
        Covode.recordClassIndex(88729);
    }

    public C75795c() {
        C88960c<C75727b> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f170253b = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75717v
    /* renamed from: a */
    public final AbstractC88979t<C75727b> mo119449a() {
        AbstractC88979t<C75727b> c = this.f170253b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75717v
    /* renamed from: a */
    public final void mo119450a(AbstractC75749b bVar) {
        C89219l.m154721d(bVar, "");
        this.f170252a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.c$a */
    public static final class C75796a implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ int f170254a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75749b f170255b;

        /* renamed from: c */
        final /* synthetic */ List f170256c;

        /* renamed from: d */
        final /* synthetic */ C75795c f170257d;

        /* renamed from: e */
        final /* synthetic */ C75727b f170258e;

        static {
            Covode.recordClassIndex(88730);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            AbstractC75749b bVar;
            AbstractC75720y j;
            AbstractC75749b bVar2;
            AbstractC75720y j2;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null) {
                List<Effect> collection = effectListResponse2.getCollection();
                if (!(collection == null || collection.isEmpty() || (bVar2 = this.f170257d.f170252a) == null || (j2 = bVar2.mo119464j()) == null)) {
                    j2.mo119468a(collection);
                }
                List<Effect> bindEffects = effectListResponse2.getBindEffects();
                if (!(bindEffects == null || bindEffects.isEmpty() || (bVar = this.f170257d.f170252a) == null || (j = bVar.mo119464j()) == null)) {
                    j.mo119470b(bindEffects);
                }
                List<Effect> data = effectListResponse2.getData();
                if (data != null && !data.isEmpty()) {
                    this.f170256c.set(this.f170254a, data.get(0));
                }
            }
        }

        C75796a(int i, AbstractC75749b bVar, List list, C75795c cVar, C75727b bVar2) {
            this.f170254a = i;
            this.f170255b = bVar;
            this.f170256c = list;
            this.f170257d = cVar;
            this.f170258e = bVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75716u
    /* renamed from: a */
    public final void mo119448a(C75727b bVar) {
        String str;
        C89219l.m154721d(bVar, "");
        AbstractC75749b bVar2 = this.f170252a;
        if (bVar2 != null) {
            List<Effect> list = bVar.f170137a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                String parentId = t2.getParentId();
                if (parentId == null || parentId.length() == 0) {
                    str = t2.getId();
                } else {
                    str = t2.getParentId();
                }
                if (hashSet.add(str)) {
                    arrayList.add(t);
                }
            }
            List g = C89070n.m154585g((Collection) arrayList);
            int i = bVar.f170138b;
            int i2 = bVar.f170139c;
            Map<String, String> map = bVar.f170140d;
            C89219l.m154721d(g, "");
            C75727b bVar3 = new C75727b(g, i, i2, map);
            int i3 = 0;
            for (Object obj : g) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C89070n.m154520a();
                }
                EffectTemplate effectTemplate = (EffectTemplate) obj;
                String parentId2 = effectTemplate.getParentId();
                if (!(parentId2 == null || parentId2.length() == 0)) {
                    AbstractC75709o d = bVar2.mo119458d();
                    String parentId3 = effectTemplate.getParentId();
                    if (parentId3 == null) {
                        C89219l.m154715b();
                    }
                    d.mo119437a(C89070n.m154516a(parentId3), bVar.f170140d, new C75796a(i3, bVar2, g, this, bVar));
                }
                i3 = i4;
            }
            this.f170253b.onNext(bVar3);
            return;
        }
        this.f170253b.onNext(bVar);
    }
}
