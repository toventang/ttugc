package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84691c;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84752l;
import com.p2082ss.android.ugc.tools.infosticker.view.p4360a.AbstractC84631b;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.tools.view.widget.C85067q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.f */
public final class C84733f implements AbstractC84694f {

    /* renamed from: a */
    public final List<C89378p<AbstractC84694f.C84695a, AbstractC89171a<View>>> f189329a = new ArrayList();

    /* renamed from: b */
    public final C88960c<C89378p<AbstractC84694f.C84695a, Integer>> f189330b;

    /* renamed from: c */
    public final C84752l.C84785c f189331c;

    /* renamed from: d */
    private final PagerAdapter f189332d = new C84735a();

    /* renamed from: e */
    private final ViewPager f189333e;

    /* renamed from: f */
    private final TabLayout f189334f;

    /* renamed from: g */
    private final View f189335g;

    static {
        Covode.recordClassIndex(98709);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f
    /* renamed from: a */
    public final ViewPager mo129606a() {
        return this.f189333e;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f
    /* renamed from: b */
    public final void mo129609b() {
        mo129643a(0, false);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.f$a */
    final class C84735a extends PagerAdapter {
        static {
            Covode.recordClassIndex(98711);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(obj, "");
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return C84733f.this.f189329a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C84735a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            MethodCollector.m26663i(11385);
            C89219l.m154721d(viewGroup, "");
            View invoke = C84733f.this.f189329a.get(i).getSecond().invoke();
            viewGroup.addView(invoke);
            MethodCollector.m26664o(11385);
            return invoke;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m26663i(11548);
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(obj, "");
            AbstractC84631b bVar = null;
            if (!(obj instanceof View)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null) {
                viewGroup.removeView(view);
                Object tag = view.getTag(R.id.bni);
                if (tag instanceof AbstractC84631b) {
                    bVar = tag;
                }
                AbstractC84631b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo114479b();
                    MethodCollector.m26664o(11548);
                    return;
                }
                MethodCollector.m26664o(11548);
                return;
            }
            MethodCollector.m26664o(11548);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(obj, "");
            super.setPrimaryItem(viewGroup, i, obj);
            C84752l.C84785c cVar = C84733f.this.f189331c;
            if (cVar != null && cVar.f189467i) {
                AbstractC84691c cVar2 = null;
                if (!(obj instanceof View)) {
                    obj = null;
                }
                View view = (View) obj;
                if (view != null) {
                    Object tag = view.getTag(R.id.bni);
                    if (tag instanceof AbstractC84691c) {
                        cVar2 = tag;
                    }
                    AbstractC84691c cVar3 = cVar2;
                    if (cVar3 != null) {
                        cVar3.mo129602e();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f
    /* renamed from: c */
    public final AbstractC88979t<C89378p<AbstractC84694f.C84695a, Integer>> mo129610c() {
        AbstractC88979t<C89378p<AbstractC84694f.C84695a, Integer>> c = this.f189330b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.f$b */
    static final class View$OnClickListenerC84736b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C89037ac f189338a;

        /* renamed from: b */
        final /* synthetic */ C84733f f189339b;

        static {
            Covode.recordClassIndex(98712);
        }

        View$OnClickListenerC84736b(C89037ac acVar, C84733f fVar) {
            this.f189338a = acVar;
            this.f189339b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f189339b.mo129643a(this.f189338a.f202766a, true);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f
    /* renamed from: a */
    public final void mo129608a(boolean z) {
        int i;
        View view = this.f189335g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84694f
    /* renamed from: a */
    public final void mo129607a(List<? extends C89378p<AbstractC84694f.C84695a, ? extends AbstractC89171a<? extends View>>> list) {
        C89219l.m154721d(list, "");
        this.f189329a.clear();
        this.f189329a.addAll(list);
        if (this.f189333e.getAdapter() != null) {
            this.f189333e.setAdapter(null);
        }
        this.f189333e.setAdapter(this.f189332d);
        C85067q.m146266a(this.f189334f, this.f189329a.size());
        for (C89037ac acVar : C89070n.m154593m(this.f189329a)) {
            AbstractC84694f.C84695a aVar = (AbstractC84694f.C84695a) acVar.f202767b.getFirst();
            C89219l.m154721d(aVar, "");
            Context context = this.f189333e.getContext();
            C89219l.m154716b(context, "");
            C84984j a = C84383b.m145134a(context);
            a.setText(aVar.f189221b);
            TabLayout tabLayout = this.f189334f;
            tabLayout.mo115525a(tabLayout.mo115519a().mo115584a(a));
            a.setOnClickListener(new View$OnClickListenerC84736b(acVar, this));
        }
    }

    /* renamed from: a */
    public final void mo129643a(int i, boolean z) {
        if (i < this.f189332d.getCount()) {
            this.f189333e.setCurrentItem(i, z);
        }
    }

    public C84733f(ViewPager viewPager, TabLayout tabLayout, View view, C84752l.C84785c cVar) {
        C89219l.m154721d(viewPager, "");
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(view, "");
        this.f189333e = viewPager;
        this.f189334f = tabLayout;
        this.f189335g = view;
        this.f189331c = cVar;
        C88960c<C89378p<AbstractC84694f.C84695a, Integer>> cVar2 = new C88960c<>();
        C89219l.m154716b(cVar2, "");
        this.f189330b = cVar2;
        viewPager.addOnPageChangeListener(new TabLayout.C73105g(tabLayout));
        tabLayout.mo115524a(new TabLayout.AbstractC73099c(this) {
            /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.C84733f.C847341 */

            /* renamed from: a */
            final /* synthetic */ C84733f f189336a;

            static {
                Covode.recordClassIndex(98710);
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
            {
                this.f189336a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
            /* renamed from: a */
            public final void mo86253a(TabLayout.C73104f fVar) {
                Object first;
                if (fVar != null) {
                    int i = fVar.f164124e;
                    C89378p pVar = (C89378p) C89070n.m154561b((List) this.f189336a.f189329a, i);
                    if (pVar != null && (first = pVar.getFirst()) != null) {
                        this.f189336a.mo129643a(i, true);
                        this.f189336a.f189330b.onNext(C89387v.m154943a(first, Integer.valueOf(i)));
                    }
                }
            }
        });
    }
}
