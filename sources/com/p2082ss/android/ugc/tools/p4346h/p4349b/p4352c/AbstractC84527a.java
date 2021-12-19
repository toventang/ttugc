package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84435a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84437b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84438c;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84441e;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84442f;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.c.a */
public abstract class AbstractC84527a<CATEGORY, DOWNLOAD_EVENT> implements AbstractC84439d<CATEGORY, DOWNLOAD_EVENT> {

    /* renamed from: a */
    private final AbstractC84438c f188925a;

    /* renamed from: b */
    private final AbstractC84442f<CATEGORY> f188926b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, CATEGORY> f188927c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final AbstractC84437b<Effect> f188928d;

    /* renamed from: e */
    private final AbstractC84441e f188929e;

    static {
        Covode.recordClassIndex(98492);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public final AbstractC88979t<List<AbstractC84456m>> mo129421a() {
        return this.f188925a.mo33639a();
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public final AbstractC84451j<Effect, CategoryEffectModel> mo129420a(C84443b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f188928d.mo129419a(bVar);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public final AbstractC88979t<C84435a<CATEGORY, Effect>> mo129423a(C84457n nVar) {
        C89219l.m154721d(nVar, "");
        AbstractC88979t<C84435a<CATEGORY, Effect>> b = this.f188926b.mo129426a(nVar).mo143280b(new C84528a(this));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public CATEGORY mo129424a(Effect effect) {
        C89219l.m154721d(effect, "");
        return (CATEGORY) AbstractC84439d.C84440a.m145262a(this, effect);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.c.a$a */
    static final class C84528a<T> implements AbstractC88433f<C84435a<CATEGORY, Effect>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84527a f188930a;

        static {
            Covode.recordClassIndex(98493);
        }

        C84528a(AbstractC84527a aVar) {
            this.f188930a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : ((C84435a) obj).f188774b) {
                Object component1 = t.component1();
                for (T t2 : (List) t.component2()) {
                    String effectId = t2.getEffectId();
                    if (effectId != null && !this.f188930a.f188927c.containsKey(effectId)) {
                        ((ConcurrentHashMap<String, CATEGORY>) this.f188930a.f188927c).put(effectId, component1);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84439d
    /* renamed from: a */
    public CATEGORY mo129425a(String str) {
        C89219l.m154721d(str, "");
        return this.f188927c.get(str);
    }

    public AbstractC84527a(AbstractC84438c cVar, AbstractC84442f<CATEGORY> fVar, AbstractC84437b<Effect> bVar, AbstractC84441e eVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(eVar, "");
        this.f188925a = cVar;
        this.f188926b = fVar;
        this.f188928d = bVar;
        this.f188929e = eVar;
    }
}
