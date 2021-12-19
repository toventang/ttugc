package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75513d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76222d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.EnumC76135n;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e */
public final class C76269e extends C76275g {

    /* renamed from: p */
    public static final C76270a f171326p = new C76270a((byte) 0);

    /* renamed from: l */
    public int f171327l;

    /* renamed from: m */
    public AbstractC75514e f171328m;

    /* renamed from: n */
    public Effect f171329n;

    /* renamed from: o */
    public OriginalStickerViewModel f171330o;

    /* renamed from: w */
    private final AbstractC89244h f171331w = C89250i.m154773a((AbstractC89171a) new C76273d(this));

    /* renamed from: x */
    private final AbstractC89244h f171332x = C89250i.m154773a((AbstractC89171a) new C76271b(this));

    static {
        Covode.recordClassIndex(89220);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e$a */
    public static final class C76270a {
        static {
            Covode.recordClassIndex(89221);
        }

        private C76270a() {
        }

        public /* synthetic */ C76270a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e$d */
    static final class C76273d extends AbstractC89220m implements AbstractC89171a<LiveData<EnumC76135n>> {

        /* renamed from: a */
        final /* synthetic */ C76269e f171335a;

        static {
            Covode.recordClassIndex(89224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76273d(C76269e eVar) {
            super(0);
            this.f171335a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveData<EnumC76135n> invoke() {
            return this.f171335a.mo119980g().f171021e;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: k */
    public final void mo119983k() {
        mo119994p().mo119126a("mCategoryKey");
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e$b */
    static final class C76271b extends AbstractC89220m implements AbstractC89171a<EffectCategoryModel> {

        /* renamed from: a */
        final /* synthetic */ C76269e f171333a;

        static {
            Covode.recordClassIndex(89222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76271b(C76269e eVar) {
            super(0);
            this.f171333a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EffectCategoryModel invoke() {
            return C89070n.m154561b((List) C75723b.m132877a(this.f171333a.mo119977d().mo119291c().mo119464j()), this.f171333a.f171305e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g
    /* renamed from: n */
    public final AbstractC76397b<Effect> mo119988n() {
        AbstractC75655o d = mo119977d();
        AbstractC75300d e = mo119978e();
        AbstractC76151g f = mo119979f();
        AbstractC75514e eVar = this.f171328m;
        if (eVar == null) {
            C89219l.m154710a("requestDesignerEffect");
        }
        Effect effect = this.f171329n;
        if (effect == null) {
            C89219l.m154710a("currentEffect");
        }
        OriginalStickerViewModel originalStickerViewModel = new OriginalStickerViewModel(this, d, e, f, eVar, effect);
        this.f171330o = originalStickerViewModel;
        return originalStickerViewModel;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g
    /* renamed from: o */
    public final C76211b mo119991o() {
        return new C76222d(mo119977d(), mo119979f(), mo119994p(), mo119981i().f171029f, mo119980g().f171020d, mo119980g().f171018b);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: b */
    public final AbstractC85027b<EnumC85026a> mo119975b(View view) {
        C89219l.m154721d(view, "");
        return super.mo119975b(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g
    /* renamed from: a */
    public final void mo119989a(int i) {
        if (i != this.f171327l) {
            this.f171327l = i;
            AbstractC75514e eVar = this.f171328m;
            if (eVar == null) {
                C89219l.m154710a("requestDesignerEffect");
            }
            eVar.mo119198a(View$OnClickListenerC75500b.f169657P, View$OnClickListenerC75500b.f169656O, new C76272c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.e$c */
    static final class C76272c extends AbstractC89220m implements AbstractC89172b<AbstractC75513d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76269e f171334a;

        static {
            Covode.recordClassIndex(89223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76272c(C76269e eVar) {
            super(1);
            this.f171334a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC75513d dVar) {
            AbstractC75513d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            View$OnClickListenerC75500b.f169656O = dVar2.mo119196b();
            List<String> a = dVar2.mo119195a();
            if (dVar2.mo119195a().size() > 10) {
                a = a.subList(0, 10);
            }
            this.f171334a.f171311k += a.size();
            OriginalStickerViewModel originalStickerViewModel = this.f171334a.f171330o;
            if (originalStickerViewModel != null) {
                List<String> a2 = dVar2.mo119195a();
                C89219l.m154721d(a2, "");
                originalStickerViewModel.f171593o.mo119285a(a2, (Map<String, String>) null, new OriginalStickerViewModel.C75455b(originalStickerViewModel));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo119990a(AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, RecyclerView.RecycledViewPool recycledViewPool, AbstractC75514e eVar, Effect effect) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(effect, "");
        super.mo119972a(0, bVar, aVar, recycledViewPool);
        this.f171328m = eVar;
        this.f171329n = effect;
        this.f171345t = true;
    }
}
