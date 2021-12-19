package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.l */
public final class C76193l extends AbstractC76170a<C84984j> {
    static {
        Covode.recordClassIndex(89143);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.l$b */
    public static final class C76195b implements IIsTagNeedUpdatedListener {

        /* renamed from: a */
        final /* synthetic */ C84984j f171167a;

        static {
            Covode.recordClassIndex(89145);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
            this.f171167a.mo129822a(true);
        }

        C76195b(C84984j jVar) {
            this.f171167a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.l$a */
    static final class C76194a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f171164a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryModel f171165b;

        /* renamed from: c */
        final /* synthetic */ int f171166c;

        static {
            Covode.recordClassIndex(89144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76194a(AbstractC89183m mVar, EffectCategoryModel effectCategoryModel, int i) {
            super(0);
            this.f171164a = mVar;
            this.f171165b = effectCategoryModel;
            this.f171166c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f171164a.invoke(this.f171165b, Integer.valueOf(this.f171166c));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.main.AbstractC76170a
    /* renamed from: a */
    public final View mo119929a(ActivityC0945e eVar, EffectCategoryModel effectCategoryModel, int i, AbstractC89183m<? super EffectCategoryModel, ? super Integer, C89391z> mVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(effectCategoryModel, "");
        C89219l.m154721d(mVar, "");
        TabView a = this.f171128k.mo119858a(effectCategoryModel.getKey()).mo119857a(eVar, effectCategoryModel, this.f171121d, new C76194a(mVar, effectCategoryModel, i));
        this.f171126i.f171028e.mo119911a(effectCategoryModel, new C76195b(a));
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76193l(TabLayout tabLayout, ActivityC0945e eVar, AbstractC1204m mVar, C75574j jVar, AbstractC76117d dVar, AbstractC76125l.C76127b bVar, AbstractC76396a aVar, AbstractC76115b<C84984j, ?> bVar2) {
        super(tabLayout, eVar, mVar, jVar, dVar, bVar, aVar, bVar2);
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar2, "");
    }
}
