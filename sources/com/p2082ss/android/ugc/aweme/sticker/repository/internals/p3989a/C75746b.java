package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3989a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75729d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.a.b */
public final class C75746b extends AbstractC20179a<C89391z, PanelInfoModel, C75729d, PanelInfoModel> {

    /* renamed from: a */
    public final String f170163a;

    /* renamed from: b */
    public final AbstractC84398d f170164b;

    static {
        Covode.recordClassIndex(88680);
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
    public final /* synthetic */ AbstractC88979t<PanelInfoModel> mo33481a(C75729d dVar) {
        C75729d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C75747a(this, dVar2));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.a.b$a */
    static final class C75747a<T> implements AbstractC88983w<PanelInfoModel> {

        /* renamed from: a */
        final /* synthetic */ C75746b f170165a;

        /* renamed from: b */
        final /* synthetic */ C75729d f170166b;

        static {
            Covode.recordClassIndex(88681);
        }

        C75747a(C75746b bVar, C75729d dVar) {
            this.f170165a = bVar;
            this.f170166b = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<PanelInfoModel> vVar) {
            C89219l.m154721d(vVar, "");
            C84386a.m145138a(this.f170165a.f170164b, this.f170165a.f170163a, this.f170166b.f170151d, this.f170166b.f170148a, this.f170166b.f170149b, this.f170166b.f170150c, new IFetchPanelInfoListener() {
                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3989a.C75746b.C75747a.C757481 */

                static {
                    Covode.recordClassIndex(88682);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
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
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (panelInfoModel != null) {
                        vVar.mo143031a(panelInfoModel);
                        vVar.mo143023a();
                        return;
                    }
                    vVar.mo143024a((Throwable) new IllegalArgumentException("sticker panel fetching failed"));
                }
            });
        }
    }

    public C75746b(String str, AbstractC84398d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f170163a = str;
        this.f170164b = dVar;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
