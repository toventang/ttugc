package com.p2082ss.android.ugc.aweme.sticker.original;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75513d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel */
public final class OriginalStickerViewModel extends StickerListViewModel implements AbstractC33974au {

    /* renamed from: a */
    public List<Effect> f169554a = new ArrayList();

    /* renamed from: b */
    public final AbstractC75514e f169555b;

    /* renamed from: c */
    public final Effect f169556c;

    static {
        Covode.recordClassIndex(88374);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel$b */
    public static final class C75455b implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ OriginalStickerViewModel f169560a;

        static {
            Covode.recordClassIndex(88377);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C75455b(OriginalStickerViewModel originalStickerViewModel) {
            this.f169560a = originalStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 == null) {
                C89219l.m154715b();
            }
            List<Effect> data = effectListResponse2.getData();
            if (data.size() > 10) {
                data = data.subList(0, 10);
            }
            this.f169560a.f171591m.setValue(EnumC85026a.NONE);
            this.f169560a.f169554a.addAll(this.f169560a.mo119125a((List<? extends Effect>) data, false));
            OriginalStickerViewModel originalStickerViewModel = this.f169560a;
            originalStickerViewModel.mo120112a((List<? extends Effect>) originalStickerViewModel.f169554a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    /* renamed from: a */
    public final void mo119126a(String str) {
        C89219l.m154721d(str, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        this.f169555b.mo119198a(View$OnClickListenerC75500b.f169657P, 0, new C75453a(this, eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel$a */
    static final class C75453a extends AbstractC89220m implements AbstractC89172b<AbstractC75513d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OriginalStickerViewModel f169557a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f169558b;

        static {
            Covode.recordClassIndex(88375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75453a(OriginalStickerViewModel originalStickerViewModel, C89233z.C89238e eVar) {
            super(1);
            this.f169557a = originalStickerViewModel;
            this.f169558b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC75513d dVar) {
            AbstractC75513d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            View$OnClickListenerC75500b.f169656O = dVar2.mo119196b();
            this.f169558b.element = (T) dVar2.mo119195a();
            if (this.f169558b.element != null) {
                T t = this.f169558b.element;
                if (t == null) {
                    C89219l.m154715b();
                }
                if (t.size() > 10) {
                    C89233z.C89238e eVar = this.f169558b;
                    T t2 = eVar.element;
                    if (t2 == null) {
                        C89219l.m154715b();
                    }
                    eVar.element = (T) t2.subList(0, 10);
                }
                AbstractC75655o oVar = this.f169557a.f171593o;
                T t3 = this.f169558b.element;
                if (t3 == null) {
                    C89219l.m154715b();
                }
                oVar.mo119285a(t3, (Map<String, String>) null, new IFetchEffectListByIdsListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel.C75453a.C754541 */

                    /* renamed from: a */
                    final /* synthetic */ C75453a f169559a;

                    static {
                        Covode.recordClassIndex(88376);
                    }

                    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                    public final void onFail(ExceptionResult exceptionResult) {
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f169559a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
                        EffectListResponse effectListResponse2 = effectListResponse;
                        if (effectListResponse2 == null) {
                            C89219l.m154715b();
                        }
                        List<Effect> data = effectListResponse2.getData();
                        this.f169559a.f169557a.f171591m.setValue(EnumC85026a.NONE);
                        this.f169559a.f169557a.f169554a.clear();
                        this.f169559a.f169557a.f169554a.addAll(this.f169559a.f169557a.mo119125a((List<? extends Effect>) data, true));
                        this.f169559a.f169557a.mo120112a((List<? extends Effect>) this.f169559a.f169557a.mo119125a((List<? extends Effect>) data, true));
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final List<Effect> mo119125a(List<? extends Effect> list, boolean z) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(this.f169556c);
        }
        for (T t : list) {
            if (!C89219l.m154714a((Object) t.getEffect_id(), (Object) this.f169556c.getEffect_id())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OriginalStickerViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar, AbstractC75514e eVar, Effect effect) {
        super(mVar, oVar, dVar, gVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(effect, "");
        this.f169555b = eVar;
        this.f169556c = effect;
    }
}
