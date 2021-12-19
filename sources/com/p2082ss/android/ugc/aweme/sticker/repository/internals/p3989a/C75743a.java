package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3989a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75695d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.a.a */
public final class C75743a extends AbstractC20179a<C89391z, CategoryEffectModel, C75726a, CategoryEffectModel> {

    /* renamed from: a */
    public final String f170157a;

    /* renamed from: b */
    public final AbstractC84398d f170158b;

    /* renamed from: f */
    private final AbstractC89244h<AbstractC75704j> f170159f;

    static {
        Covode.recordClassIndex(88677);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return C89391z.f203057a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.a.a$a */
    static final class C75744a<T> implements AbstractC88983w<CategoryEffectModel> {

        /* renamed from: a */
        final /* synthetic */ C75743a f170160a;

        /* renamed from: b */
        final /* synthetic */ C75726a f170161b;

        static {
            Covode.recordClassIndex(88678);
        }

        C75744a(C75743a aVar, C75726a aVar2) {
            this.f170160a = aVar;
            this.f170161b = aVar2;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<CategoryEffectModel> vVar) {
            C89219l.m154721d(vVar, "");
            AbstractC84398d dVar = this.f170160a.f170158b;
            String str = this.f170160a.f170157a;
            String str2 = this.f170161b.f170131a;
            int i = this.f170161b.f170132b;
            int i2 = this.f170161b.f170133c;
            int i3 = this.f170161b.f170134d;
            String str3 = this.f170161b.f170135e;
            C757451 r9 = new IFetchCategoryEffectListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3989a.C75743a.C75744a.C757451 */

                static {
                    Covode.recordClassIndex(88679);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C89219l.m154721d(exceptionResult, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143024a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    C89219l.m154721d(categoryPageModel2, "");
                    if (!vVar.isDisposed() && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
                        vVar.mo143031a(categoryEffects);
                        vVar.mo143023a();
                    }
                }
            };
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(r9, "");
            dVar.mo78896a(str, str2, AbstractC84398d.C84399a.f188714b, new C84386a.C84389c(dVar, str, str2, i, i2, i3, str3, r9), null);
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<CategoryEffectModel> mo33481a(C75726a aVar) {
        AbstractC75695d d;
        AbstractC88979t<CategoryEffectModel> a;
        C75726a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC75698f fVar = this.f170159f.getValue().mo119430a().get(aVar2.f170131a);
        if (fVar != null && (d = fVar.mo119421d()) != null && (a = d.mo119415a(aVar2)) != null) {
            return a;
        }
        AbstractC88979t a2 = AbstractC88979t.m154294a(new C75744a(this, aVar2));
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75743a(String str, AbstractC84398d dVar, AbstractC89244h<? extends AbstractC75704j> hVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        this.f170157a = str;
        this.f170158b = dVar;
        this.f170159f = hVar;
    }
}
