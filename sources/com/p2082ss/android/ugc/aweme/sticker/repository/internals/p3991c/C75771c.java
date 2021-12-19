package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.c */
public final class C75771c extends AbstractC20179a<C89391z, C75774d, C75774d, List<? extends String>> {

    /* renamed from: a */
    public final String f170210a;

    /* renamed from: b */
    public final AbstractC84398d f170211b;

    static {
        Covode.recordClassIndex(88705);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return C89391z.f203057a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<List<? extends String>> mo33481a(C75774d dVar) {
        C75774d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C75772a(this, dVar2));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.c$a */
    static final class C75772a<T> implements AbstractC88983w<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C75771c f170212a;

        /* renamed from: b */
        final /* synthetic */ C75774d f170213b;

        static {
            Covode.recordClassIndex(88706);
        }

        C75772a(C75771c cVar, C75774d dVar) {
            this.f170212a = cVar;
            this.f170213b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.v<java.util.List<java.lang.String>>] */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<List<? extends String>> vVar) {
            C89219l.m154721d(vVar, "");
            this.f170212a.f170211b.mo78905a(this.f170212a.f170210a, C89070n.m154516a(this.f170213b.f170215a.getEffectId()), this.f170213b.f170216b, new IModFavoriteList() {
                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c.C75771c.C75772a.C757731 */

                static {
                    Covode.recordClassIndex(88707);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
                public final void onFail(ExceptionResult exceptionResult) {
                    C89219l.m154721d(exceptionResult, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143024a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(List<String> list) {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (list != null) {
                        vVar.mo143031a(list);
                        vVar.mo143023a();
                        return;
                    }
                    vVar.mo143024a((Throwable) new IllegalArgumentException("modify favorite sticker failed"));
                }
            });
        }
    }

    public C75771c(String str, AbstractC84398d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f170210a = str;
        this.f170211b = dVar;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj;
    }
}
