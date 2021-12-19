package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76396a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b */
public final class C76238b implements AbstractC76209a {

    /* renamed from: a */
    public final HashMap<Integer, AbstractC76268d<Fragment>> f171253a = new HashMap<>();

    /* renamed from: b */
    public final List<EffectCategoryModel> f171254b = new ArrayList();

    /* renamed from: c */
    public int f171255c;

    /* renamed from: d */
    final C88960c<Integer> f171256d;

    /* renamed from: e */
    public final C88960c<C89378p<Integer, Integer>> f171257e;

    /* renamed from: f */
    public final ViewPager f171258f;

    /* renamed from: g */
    public final AbstractC76396a f171259g;

    /* renamed from: h */
    public final AbstractC76125l.C76126a f171260h;

    /* renamed from: i */
    private final AbstractC89244h f171261i;

    static {
        Covode.recordClassIndex(89188);
    }

    /* renamed from: a */
    public final C76239a mo119961a() {
        return (C76239a) this.f171261i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$a */
    public final class C76239a extends AbstractC0975m {

        /* renamed from: a */
        public final AbstractC76125l.C76126a f171262a;

        /* renamed from: b */
        public final Map<Integer, AbstractC76268d<Fragment>> f171263b;

        /* renamed from: c */
        final /* synthetic */ C76238b f171264c;

        /* renamed from: d */
        private final RecyclerView.RecycledViewPool f171265d = new RecyclerView.RecycledViewPool();

        /* renamed from: e */
        private final Map<Integer, AbstractC88412b> f171266e = new LinkedHashMap();

        /* renamed from: f */
        private final AbstractC76125l.C76127b f171267f;

        /* renamed from: g */
        private final List<EffectCategoryModel> f171268g;

        /* renamed from: h */
        private final AbstractC76115b<?, Fragment> f171269h;

        static {
            Covode.recordClassIndex(89189);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            C89219l.m154721d(obj, "");
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f171268g.size();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$a$a */
        static final class C76240a<T> implements AbstractC88433f<Integer> {

            /* renamed from: a */
            final /* synthetic */ C76239a f171270a;

            /* renamed from: b */
            final /* synthetic */ int f171271b;

            static {
                Covode.recordClassIndex(89190);
            }

            C76240a(C76239a aVar, int i) {
                this.f171270a = aVar;
                this.f171271b = i;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Integer num) {
                Integer num2 = num;
                C76238b bVar = this.f171270a.f171264c;
                C89219l.m154716b(num2, "");
                bVar.f171256d.onNext(Integer.valueOf(num2.intValue()));
            }
        }

        @Override // androidx.fragment.app.AbstractC0975m
        /* renamed from: a */
        public final Fragment mo3649a(int i) {
            AbstractC76268d<Fragment> a = this.f171269h.mo119858a(this.f171268g.get(i).getKey()).mo119856a(i, this.f171267f, this.f171262a, this.f171265d);
            this.f171263b.put(Integer.valueOf(i), a);
            AbstractC88412b a2 = a.mo119144h().mo143254a(new C76240a(this, i), C84909p.f189747a);
            Map<Integer, AbstractC88412b> map = this.f171266e;
            Integer valueOf = Integer.valueOf(i);
            C89219l.m154716b(a2, "");
            map.put(valueOf, a2);
            return a.mo119984l();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(obj, "");
            super.destroyItem(viewGroup, i, obj);
            AbstractC88412b remove = this.f171266e.remove(Integer.valueOf(i));
            if (remove != null && !remove.isDisposed()) {
                remove.dispose();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76239a(C76238b bVar, AbstractC0952i iVar, AbstractC76125l.C76127b bVar2, AbstractC76125l.C76126a aVar, Map<Integer, AbstractC76268d<Fragment>> map, List<EffectCategoryModel> list, AbstractC76115b<?, Fragment> bVar3) {
            super(iVar);
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(bVar3, "");
            this.f171264c = bVar;
            this.f171267f = bVar2;
            this.f171262a = aVar;
            this.f171263b = map;
            this.f171268g = list;
            this.f171269h = bVar3;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: h */
    public final AbstractC88979t<Integer> mo119144h() {
        AbstractC88979t<Integer> c = this.f171256d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$b */
    static final class C76241b extends AbstractC89220m implements AbstractC89171a<C76239a> {

        /* renamed from: a */
        final /* synthetic */ C76238b f171272a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0952i f171273b;

        /* renamed from: c */
        final /* synthetic */ AbstractC76125l.C76127b f171274c;

        /* renamed from: d */
        final /* synthetic */ AbstractC76115b f171275d;

        static {
            Covode.recordClassIndex(89191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76241b(C76238b bVar, AbstractC0952i iVar, AbstractC76125l.C76127b bVar2, AbstractC76115b bVar3) {
            super(0);
            this.f171272a = bVar;
            this.f171273b = iVar;
            this.f171274c = bVar2;
            this.f171275d = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76239a invoke() {
            C76238b bVar = this.f171272a;
            AbstractC0952i iVar = this.f171273b;
            AbstractC76125l.C76127b bVar2 = this.f171274c;
            AbstractC76125l.C76126a aVar = bVar.f171260h;
            aVar.f171023g = this.f171272a.f171257e.mo143283c();
            AbstractC76115b bVar3 = this.f171275d;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar3, "");
            return new C76239a(bVar, iVar, bVar2, aVar, bVar.f171253a, bVar.f171254b, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$c */
    public static final class C76242c implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C76238b f171276a;

        /* renamed from: b */
        final /* synthetic */ ViewPager.AbstractC1579e f171277b;

        static {
            Covode.recordClassIndex(89192);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f171277b.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f171276a.f171257e.onNext(C89387v.m154943a(Integer.valueOf(this.f171276a.f171255c), Integer.valueOf(i)));
            this.f171276a.f171255c = i;
            this.f171276a.mo119961a().f171262a.f171022f = Integer.valueOf(this.f171276a.f171255c);
            this.f171277b.onPageSelected(i);
        }

        C76242c(C76238b bVar, ViewPager.AbstractC1579e eVar) {
            this.f171276a = bVar;
            this.f171277b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            this.f171277b.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.AbstractC76209a
    /* renamed from: a */
    public final void mo119945a(ViewPager.AbstractC1579e eVar) {
        C89219l.m154721d(eVar, "");
        this.f171258f.addOnPageChangeListener(new C76242c(this, eVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76116c
    /* renamed from: a */
    public final void mo119135a(List<EffectCategoryModel> list) {
        C89219l.m154721d(list, "");
        if (this.f171258f.getAdapter() != null) {
            this.f171258f.setAdapter(null);
        }
        this.f171254b.clear();
        this.f171254b.addAll(list);
        this.f171258f.setAdapter(mo119961a());
        this.f171258f.setCurrentItem(this.f171259g.mo120105a());
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76117d
    /* renamed from: a */
    public final void mo119131a(int i, boolean z) {
        this.f171258f.setCurrentItem(i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: b */
    public final void mo119137b(int i, boolean z) {
        AbstractC76268d<Fragment> dVar = this.f171253a.get(Integer.valueOf(this.f171255c));
        if (dVar != null) {
            dVar.mo119137b(i, z);
        }
    }

    public C76238b(ViewPager viewPager, AbstractC76396a aVar, AbstractC0952i iVar, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar2, AbstractC76115b<?, Fragment> bVar2) {
        C89219l.m154721d(viewPager, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
        this.f171258f = viewPager;
        this.f171259g = aVar;
        this.f171260h = aVar2;
        this.f171261i = C89250i.m154773a((AbstractC89171a) new C76241b(this, iVar, bVar, bVar2));
        this.f171255c = -1;
        C88960c<Integer> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f171256d = cVar;
        C88960c<C89378p<Integer, Integer>> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f171257e = cVar2;
        viewPager.setAdapter(mo119961a());
    }
}
