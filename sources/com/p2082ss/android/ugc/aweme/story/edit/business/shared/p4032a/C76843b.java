package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a;

import android.content.Context;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.story.edit.clip.AbstractC77116a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b;
import com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b */
public final class C76843b extends AbstractC77116a<AbstractC76842a> implements AbstractC76842a {

    /* renamed from: a */
    final AbstractC89244h f172458a = C89250i.m154774a(EnumC89331m.NONE, new C76845b(this));

    /* renamed from: b */
    public final AbstractC76842a f172459b = this;

    /* renamed from: c */
    final AbstractC14552j f172460c;

    /* renamed from: d */
    final AbstractC50707o f172461d;

    /* renamed from: f */
    private final AbstractC89244h f172462f = C89250i.m154773a((AbstractC89171a) new C76846c(this));

    /* renamed from: g */
    private final AbstractC89244h f172463g = C89250i.m154774a(EnumC89331m.NONE, new C76844a(this));

    /* renamed from: h */
    private final AbstractC82208b f172464h;

    static {
        Covode.recordClassIndex(89839);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C82201a mo114795a() {
        return (C82201a) this.f172462f.getValue();
    }

    /* renamed from: b */
    public final AbstractC76760e mo120465b() {
        return (AbstractC76760e) this.f172463g.getValue();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.f172459b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$a */
    public static final class C76844a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172465a;

        static {
            Covode.recordClassIndex(89840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76844a(AbstractC21566a aVar) {
            super(0);
            this.f172465a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172465a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a.C76843b.C76844a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$b */
    public static final class C76845b extends AbstractC89220m implements AbstractC89171a<AbstractC82237a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172466a;

        static {
            Covode.recordClassIndex(89841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76845b(AbstractC21566a aVar) {
            super(0);
            this.f172466a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172466a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a.C76843b.C76845b.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f172461d.mo86064a();
        mo114795a();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        mo114795a().f183899b = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$c */
    static final class C76846c extends AbstractC89220m implements AbstractC89171a<C82201a> {

        /* renamed from: a */
        final /* synthetic */ C76843b f172467a;

        static {
            Covode.recordClassIndex(89842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76846c(C76843b bVar) {
            super(0);
            this.f172467a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82201a invoke() {
            C76843b bVar = this.f172467a;
            C76848e eVar = new C76848e(bVar);
            C82201a aVar = new C82201a(bVar, bVar.f172460c, (AbstractC82237a) bVar.f172458a.getValue(), bVar.f172461d, bVar.mo120465b().mo114821j(), new C76847d(bVar));
            aVar.f183899b = eVar;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$e */
    public static final class C76848e implements C82201a.AbstractC82203b {

        /* renamed from: a */
        final /* synthetic */ C76843b f172469a;

        static {
            Covode.recordClassIndex(89844);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76848e(C76843b bVar) {
            this.f172469a = bVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a.AbstractC82203b
        /* renamed from: a */
        public final void mo120466a(FilterBean filterBean) {
            C76843b bVar = this.f172469a;
            bVar.mo120464a(filterBean, true, C2556g.m7473b(bVar));
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.p4280a.C82201a.AbstractC82203b
        /* renamed from: a */
        public final void mo120467a(FilterBean filterBean, FilterBean filterBean2, float f) {
            this.f172469a.mo120465b().mo114798a(filterBean, filterBean2, f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.a.b$d */
    static final class C76847d extends AbstractC89220m implements AbstractC89172b<FilterBean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76843b f172468a;

        static {
            Covode.recordClassIndex(89843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76847d(C76843b bVar) {
            super(1);
            this.f172468a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterBean filterBean) {
            this.f172468a.mo120464a(filterBean, false, null);
            this.f172468a.mo114795a().f183902e = true;
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.story.edit.clip.a.g] */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77121d
    /* renamed from: a */
    public final /* synthetic */ void mo120452a(VEEditClip vEEditClip) {
        FilterBean a;
        VEEditClip vEEditClip2 = vEEditClip;
        C89219l.m154721d(vEEditClip2, "");
        super.mo120452a(vEEditClip2);
        StoryEditClipModel d = C77134a.m134739d(this);
        if (d != null && (a = C77148a.m134749a(d, this.f172461d)) != null) {
            mo114795a().mo127394a(a);
        }
    }

    /* renamed from: a */
    public final void mo120464a(FilterBean filterBean, boolean z, Context context) {
        if (filterBean != null) {
            mo120465b().mo114799a(new C50649a(false, filterBean, false, this.f172461d.mo86072g().mo86054c(filterBean.getId())));
            this.f172464h.mo88316a(filterBean, z, context);
            return;
        }
        this.f172464h.mo88316a(null, z, context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76843b(C21582f fVar, AbstractC14552j jVar, AbstractC50707o oVar, AbstractC82208b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(bVar, "");
        this.f172460c = jVar;
        this.f172461d = oVar;
        this.f172464h = bVar;
    }
}
