package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.AbstractC76209a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76254d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76120g;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.view.widget.C85067q;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a */
public abstract class AbstractC76170a<TabView> implements AbstractC76120g {

    /* renamed from: a */
    public final C88960c<C89378p<EffectCategoryModel, Integer>> f171118a;

    /* renamed from: b */
    public final C88958b<C89378p<EffectCategoryModel, Integer>> f171119b;

    /* renamed from: c */
    public final List<EffectCategoryModel> f171120c = new ArrayList();

    /* renamed from: d */
    public final TabLayout f171121d;

    /* renamed from: e */
    public final ActivityC0945e f171122e;

    /* renamed from: f */
    public final AbstractC1204m f171123f;

    /* renamed from: g */
    public final C75574j f171124g;

    /* renamed from: h */
    public final AbstractC76117d f171125h;

    /* renamed from: i */
    public final AbstractC76125l.C76127b f171126i;

    /* renamed from: j */
    public final AbstractC76396a f171127j;

    /* renamed from: k */
    public final AbstractC76115b<TabView, ?> f171128k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$d */
    static final class C76175d implements TabLayout.AbstractC73098b {

        /* renamed from: a */
        public static final C76175d f171132a = new C76175d();

        static {
            Covode.recordClassIndex(89125);
        }

        C76175d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73098b
        /* renamed from: a */
        public final void mo86256a(TabLayout.C73104f fVar) {
        }
    }

    static {
        Covode.recordClassIndex(89120);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo119929a(ActivityC0945e eVar, EffectCategoryModel effectCategoryModel, int i, AbstractC89183m<? super EffectCategoryModel, ? super Integer, C89391z> mVar);

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: h */
    public final AbstractC88979t<Integer> mo119144h() {
        return this.f171125h.mo119144h();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76120g
    /* renamed from: a */
    public final AbstractC88979t<C89378p<EffectCategoryModel, Integer>> mo119859a() {
        AbstractC88979t<C89378p<EffectCategoryModel, Integer>> c = this.f171118a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76120g
    /* renamed from: b */
    public final AbstractC88979t<C89378p<EffectCategoryModel, Integer>> mo119860b() {
        AbstractC88979t<C89378p<EffectCategoryModel, Integer>> c = this.f171119b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$b */
    public static final class C76172b implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ AbstractC76170a f171129a;

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$b$a */
        static final class C76173a implements IUpdateTagListener {

            /* renamed from: a */
            public static final C76173a f171130a = new C76173a();

            static {
                Covode.recordClassIndex(89123);
            }

            C76173a() {
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
            public final void onFinally() {
            }
        }

        static {
            Covode.recordClassIndex(89122);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(TabLayout.C73104f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76172b(AbstractC76170a aVar) {
            this.f171129a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            C89219l.m154721d(fVar, "");
            C76254d.m133682a(fVar, false);
            int i = fVar.f164124e;
            EffectCategoryModel effectCategoryModel = this.f171129a.f171120c.get(i);
            if (effectCategoryModel.getKey() != null && C89219l.m154714a((Object) this.f171129a.f171127j.mo120107b().getValue(), (Object) true)) {
                this.f171129a.f171126i.f171028e.mo119912a(effectCategoryModel, C76173a.f171130a);
                this.f171129a.f171126i.f171026c.mo118955a(effectCategoryModel.getName());
                this.f171129a.f171119b.onNext(C89387v.m154943a(effectCategoryModel, Integer.valueOf(i)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$c */
    static final class C76174c<T> implements AbstractC1214u<List<? extends EffectCategoryModel>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76170a f171131a;

        static {
            Covode.recordClassIndex(89124);
        }

        C76174c(AbstractC76170a aVar) {
            this.f171131a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.main.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends EffectCategoryModel> list) {
            List<? extends EffectCategoryModel> list2 = list;
            if (list2 != null) {
                this.f171131a.mo119135a(list2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76116c
    /* renamed from: a */
    public final void mo119135a(List<EffectCategoryModel> list) {
        TabLayout.C73104f a;
        C89219l.m154721d(list, "");
        this.f171125h.mo119135a(list);
        this.f171120c.clear();
        this.f171120c.addAll(list);
        C89219l.m154721d(list, "");
        if (this.f171124g.f169849k) {
            C85067q.m146266a(this.f171121d, list.size());
        }
        C89219l.m154721d(list, "");
        boolean z = !C89219l.m154714a((Object) this.f171127j.mo120107b().getValue(), (Object) true);
        this.f171121d.mo115533b();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            View a2 = mo119929a(this.f171122e, t, i, new C76171a(this));
            TabLayout tabLayout = this.f171121d;
            tabLayout.mo115526a(tabLayout.mo115519a().mo115588c().mo115584a(a2), false);
            i = i2;
        }
        if (!z && (a = this.f171121d.mo115520a(this.f171127j.mo120105a())) != null) {
            a.mo115586a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d
    /* renamed from: a */
    public final void mo119131a(int i, boolean z) {
        this.f171125h.mo119131a(i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: b */
    public final void mo119137b(int i, boolean z) {
        this.f171125h.mo119137b(i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$a */
    public static final /* synthetic */ class C76171a extends C89217j implements AbstractC89183m<EffectCategoryModel, Integer, C89391z> {
        static {
            Covode.recordClassIndex(89121);
        }

        C76171a(AbstractC76170a aVar) {
            super(2, aVar, AbstractC76170a.class, "onTabClicked", "onTabClicked(Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(EffectCategoryModel effectCategoryModel, Integer num) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            int intValue = num.intValue();
            C89219l.m154721d(effectCategoryModel2, "");
            ((AbstractC76170a) this.receiver).mo119930a(effectCategoryModel2, intValue);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119930a(EffectCategoryModel effectCategoryModel, int i) {
        C89219l.m154721d(effectCategoryModel, "");
        this.f171118a.onNext(C89387v.m154943a(effectCategoryModel, Integer.valueOf(i)));
        mo119131a(i, true);
    }

    public AbstractC76170a(TabLayout tabLayout, ActivityC0945e eVar, AbstractC1204m mVar, C75574j jVar, AbstractC76117d dVar, AbstractC76125l.C76127b bVar, AbstractC76396a aVar, AbstractC76115b<TabView, ?> bVar2) {
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar2, "");
        this.f171121d = tabLayout;
        this.f171122e = eVar;
        this.f171123f = mVar;
        this.f171124g = jVar;
        this.f171125h = dVar;
        this.f171126i = bVar;
        this.f171127j = aVar;
        this.f171128k = bVar2;
        C88960c<C89378p<EffectCategoryModel, Integer>> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f171118a = cVar;
        C88958b<C89378p<EffectCategoryModel, Integer>> bVar3 = new C88958b<>();
        C89219l.m154716b(bVar3, "");
        this.f171119b = bVar3;
        tabLayout.mo115524a(new C76172b(this));
        C89219l.m154721d(dVar, "");
        if (dVar instanceof AbstractC76209a) {
            ((AbstractC76209a) dVar).mo119945a(new TabLayout.C73105g(tabLayout));
        }
        aVar.mo120108c().observe(mVar, new C76174c(this));
        tabLayout.setOnTabClickListener(C76175d.f171132a);
        aVar.mo120110e();
    }
}
