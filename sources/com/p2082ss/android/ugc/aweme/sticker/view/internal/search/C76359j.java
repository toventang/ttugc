package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.j */
public final class C76359j implements AbstractC76114a<C84984j, Fragment> {

    /* renamed from: a */
    final AbstractC89244h f171530a;

    /* renamed from: b */
    public final C1213t<C89391z> f171531b = new C1213t<>();

    /* renamed from: c */
    public final AbstractC76329a f171532c;

    /* renamed from: d */
    public final AbstractC89171a<C89391z> f171533d;

    /* renamed from: e */
    private final AbstractC89244h f171534e;

    static {
        Covode.recordClassIndex(89314);
    }

    /* renamed from: a */
    public final SearchStickerViewContainer mo120076a() {
        return (SearchStickerViewContainer) this.f171534e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.j$a */
    static final class C76360a extends AbstractC89220m implements AbstractC89171a<SearchStickerViewContainer> {

        /* renamed from: a */
        final /* synthetic */ C76359j f171535a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f171536b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76125l.C76127b f171537c;

        /* renamed from: d */
        final /* synthetic */ C75574j f171538d;

        static {
            Covode.recordClassIndex(89315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76360a(C76359j jVar, ActivityC0945e eVar, AbstractC76125l.C76127b bVar, C75574j jVar2) {
            super(0);
            this.f171535a = jVar;
            this.f171536b = eVar;
            this.f171537c = bVar;
            this.f171538d = jVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchStickerViewContainer invoke() {
            return new SearchStickerViewContainer(this.f171536b, (View) this.f171535a.f171530a.getValue(), this.f171537c, this.f171535a.f171532c, 1, 1, this.f171538d, this.f171535a.f171533d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.j$b */
    static final class C76361b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f171539a;

        static {
            Covode.recordClassIndex(89316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76361b(ActivityC0945e eVar) {
            super(0);
            this.f171539a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(6026);
            View inflate = LayoutInflater.from(this.f171539a).inflate(R.layout.ah4, (ViewGroup) null);
            MethodCollector.m26664o(6026);
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.j$c */
    static final class View$OnClickListenerC76362c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76359j f171540a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f171541b;

        static {
            Covode.recordClassIndex(89317);
        }

        View$OnClickListenerC76362c(C76359j jVar, AbstractC89171a aVar) {
            this.f171540a = jVar;
            this.f171541b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171540a.f171531b.setValue(C89391z.f203057a);
            this.f171541b.invoke();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    public final /* synthetic */ C84984j mo119857a(ActivityC0945e eVar, EffectCategoryModel effectCategoryModel, TabLayout tabLayout, AbstractC89171a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(effectCategoryModel, "");
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(aVar, "");
        C84984j a = C84383b.m145134a(eVar);
        a.setTextVisibility(false);
        a.setImage(2131232678);
        a.setOnClickListener(new View$OnClickListenerC76362c(this, aVar));
        C89219l.m154721d(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    public final AbstractC76268d<Fragment> mo119856a(int i, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(recycledViewPool, "");
        AbstractC76329a aVar2 = this.f171532c;
        AbstractC89171a<C89391z> aVar3 = this.f171533d;
        SearchStickerViewContainer a = mo120076a();
        C1213t<C89391z> tVar = this.f171531b;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(tVar, "");
        C76364l lVar = new C76364l();
        lVar.mo119972a(i, bVar, aVar, recycledViewPool);
        C89219l.m154721d(aVar3, "");
        lVar.f171549o = aVar3;
        C89219l.m154721d(aVar2, "");
        lVar.f171547m = aVar2;
        C89219l.m154721d(a, "");
        lVar.f171546l = a;
        C89219l.m154721d(tVar, "");
        lVar.f171548n = tVar;
        return lVar;
    }

    public C76359j(ActivityC0945e eVar, AbstractC76329a aVar, AbstractC76125l.C76127b bVar, C75574j jVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar2, "");
        this.f171532c = aVar;
        this.f171533d = aVar2;
        this.f171530a = C89250i.m154774a(EnumC89331m.NONE, new C76361b(eVar));
        this.f171534e = C89250i.m154774a(EnumC89331m.NONE, new C76360a(this, eVar, bVar, jVar));
    }
}
