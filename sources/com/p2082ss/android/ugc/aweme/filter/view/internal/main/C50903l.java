package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50825a;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50826b;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50827c;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50817d;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50818e;
import com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84940c;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.tools.view.base.EnumC84942e;
import com.p2082ss.android.ugc.tools.view.widget.C85067q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l */
public final class C50903l implements AbstractC50824j {

    /* renamed from: a */
    protected AbstractC50823i f117446a;

    /* renamed from: b */
    FilterBean f117447b;

    /* renamed from: c */
    int f117448c;

    /* renamed from: d */
    final AbstractC88969g<C20375am<EnumC50818e, Integer, FilterBean>> f117449d;

    /* renamed from: e */
    final AbstractC88969g<C50816c> f117450e;

    /* renamed from: f */
    public final C50906c f117451f;

    /* renamed from: g */
    public final ViewGroup f117452g;

    /* renamed from: h */
    public final AbstractC1204m f117453h;

    /* renamed from: i */
    public final AbstractC50707o f117454i;

    /* renamed from: j */
    public final AbstractC50705m f117455j;

    /* renamed from: k */
    public final AbstractC50828d f117456k;

    /* renamed from: l */
    private ViewGroup f117457l;

    /* renamed from: m */
    private AbstractC50827c f117458m;

    /* renamed from: n */
    private AbstractC50826b f117459n;

    /* renamed from: o */
    private AbstractC50825a f117460o;

    /* renamed from: p */
    private AbstractC84940c f117461p;

    /* renamed from: q */
    private AbstractC84941d f117462q;

    /* renamed from: r */
    private boolean f117463r;

    /* renamed from: s */
    private final AbstractC88969g<C89378p<Boolean, FilterBean>> f117464s;

    /* renamed from: t */
    private final AbstractC88969g<Boolean> f117465t;

    /* renamed from: u */
    private final C88411a f117466u;

    /* renamed from: v */
    private final C50915l f117467v;

    static {
        Covode.recordClassIndex(60078);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: d */
    public final void mo86197d() {
        m95318b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: a */
    public final FilterBean mo86193a() {
        AbstractC50823i iVar = this.f117446a;
        if (iVar == null) {
            C89219l.m154710a("tabListView");
        }
        return iVar.mo86179a();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: e */
    public final AbstractC88979t<C20375am<EnumC50818e, Integer, FilterBean>> mo86198e() {
        AbstractC88979t<C20375am<EnumC50818e, Integer, FilterBean>> c = this.f117449d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: f */
    public final AbstractC88979t<C20169f<FilterBean>> mo86199f() {
        AbstractC50823i iVar = this.f117446a;
        if (iVar == null) {
            C89219l.m154710a("tabListView");
        }
        return iVar.mo86184c();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: g */
    public final AbstractC88979t<Boolean> mo86200g() {
        AbstractC88979t<Boolean> c = this.f117465t.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: h */
    public final AbstractC88979t<C50816c> mo86201h() {
        AbstractC88979t<C50816c> c = this.f117450e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: b */
    public final void mo86195b() {
        if (this.f117451f.f117474e) {
            AbstractC84941d dVar = this.f117462q;
            if (dVar == null) {
                C89219l.m154710a("transitionView");
            }
            dVar.mo86258a();
            return;
        }
        AbstractC84941d dVar2 = this.f117462q;
        if (dVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        dVar2.mo86259b();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: c */
    public final void mo86196c() {
        if (this.f117451f.f117474e) {
            AbstractC84941d dVar = this.f117462q;
            if (dVar == null) {
                C89219l.m154710a("transitionView");
            }
            dVar.mo86260c();
            return;
        }
        AbstractC84941d dVar2 = this.f117462q;
        if (dVar2 == null) {
            C89219l.m154710a("transitionView");
        }
        dVar2.mo86263f();
    }

    /* renamed from: i */
    public final void mo86269i() {
        AbstractC50826b bVar = this.f117459n;
        if (bVar == null) {
            C89219l.m154710a("cleanView");
        }
        if (!bVar.mo86206a()) {
            m95318b(true);
        }
        this.f117450e.onNext(new C50816c(EnumC50817d.CLEAR_MODE_CLICK, null, null, 6));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$c */
    public class C50906c {

        /* renamed from: a */
        public boolean f117470a;

        /* renamed from: b */
        public boolean f117471b;

        /* renamed from: c */
        public boolean f117472c;

        /* renamed from: d */
        public boolean f117473d;

        /* renamed from: e */
        public boolean f117474e;

        /* renamed from: f */
        public C50870e f117475f;

        /* renamed from: g */
        public C50857a f117476g;

        /* renamed from: h */
        final /* synthetic */ C50903l f117477h;

        static {
            Covode.recordClassIndex(60081);
        }

        /* renamed from: a */
        public final void mo86270a(C50870e eVar) {
            C89219l.m154721d(eVar, "");
            this.f117475f = eVar;
        }

        public /* synthetic */ C50906c(C50903l lVar) {
            this(lVar, new C50870e(false, null, null, 63), new C50857a());
        }

        private C50906c(C50903l lVar, C50870e eVar, C50857a aVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(aVar, "");
            this.f117477h = lVar;
            this.f117470a = true;
            this.f117471b = true;
            this.f117472c = true;
            this.f117473d = true;
            this.f117474e = true;
            this.f117475f = eVar;
            this.f117476g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$l */
    public static final class C50915l implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C50903l f117487a;

        static {
            Covode.recordClassIndex(60090);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50915l(C50903l lVar) {
            this.f117487a = lVar;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C50903l lVar = this.f117487a;
            FilterBean filterBean = lVar.f117447b;
            if (filterBean != null) {
                lVar.f117449d.onNext(new C20375am<>(EnumC50818e.CHANGE_END, Integer.valueOf(lVar.f117448c), filterBean));
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C50903l lVar = this.f117487a;
            lVar.f117448c = i;
            FilterBean filterBean = lVar.f117447b;
            if (filterBean != null) {
                lVar.f117449d.onNext(new C20375am<>(EnumC50818e.CHANGING, Integer.valueOf(i), filterBean));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$d */
    static final class View$OnClickListenerC50907d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50903l f117478a;

        static {
            Covode.recordClassIndex(60082);
        }

        View$OnClickListenerC50907d(C50903l lVar) {
            this.f117478a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117478a.mo86269i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$f */
    static final class C50909f<T> implements AbstractC88433f<C20169f<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C50903l f117480a;

        static {
            Covode.recordClassIndex(60084);
        }

        C50909f(C50903l lVar) {
            this.f117480a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20169f<? extends FilterBean> fVar) {
            this.f117480a.mo86268c((FilterBean) fVar.mo33486a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$g */
    static final class C50910g<T> implements AbstractC88433f<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ C50903l f117481a;

        static {
            Covode.recordClassIndex(60085);
        }

        C50910g(C50903l lVar) {
            this.f117481a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            C50903l lVar = this.f117481a;
            C89219l.m154716b(filterBean2, "");
            lVar.mo86267b(filterBean2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$h */
    static final class C50911h<T> implements AbstractC88433f<EffectCategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ C50903l f117482a;

        static {
            Covode.recordClassIndex(60086);
        }

        C50911h(C50903l lVar) {
            this.f117482a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            C50903l lVar = this.f117482a;
            C89219l.m154716b(effectCategoryResponse2, "");
            lVar.mo86265a(effectCategoryResponse2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$e */
    static final class View$OnClickListenerC50908e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50903l f117479a;

        static {
            Covode.recordClassIndex(60083);
        }

        View$OnClickListenerC50908e(C50903l lVar) {
            this.f117479a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117479a.f117450e.onNext(new C50816c(EnumC50817d.FILTER_BOX_ENTRANCE_CLICK, null, null, 6));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$i */
    static final class View$OnClickListenerC50912i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50903l f117483a;

        static {
            Covode.recordClassIndex(60087);
        }

        View$OnClickListenerC50912i(C50903l lVar) {
            this.f117483a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117483a.f117450e.onNext(new C50816c(EnumC50817d.OUTSIDE_TOUCH, null, null, 6));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$j */
    static final class C50913j<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50903l f117484a;

        static {
            Covode.recordClassIndex(60088);
        }

        C50913j(C50903l lVar) {
            this.f117484a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            C50903l lVar = this.f117484a;
            C89219l.m154716b(bool2, "");
            lVar.mo86266a(bool2.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$k */
    static final class C50914k<T> implements AbstractC88433f<EnumC84942e> {

        /* renamed from: a */
        final /* synthetic */ C50903l f117485a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f117486b;

        static {
            Covode.recordClassIndex(60089);
        }

        C50914k(C50903l lVar, RecyclerView recyclerView) {
            this.f117485a = lVar;
            this.f117486b = recyclerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EnumC84942e eVar) {
            if (eVar == EnumC84942e.PRE_HIDE) {
                this.f117486b.setItemAnimator(null);
            } else if (eVar == EnumC84942e.SHOWN) {
                this.f117486b.setItemAnimator(this.f117485a.f117451f.f117475f.f117366c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50824j
    /* renamed from: a */
    public final void mo86194a(FilterBean filterBean) {
        AbstractC50823i iVar = this.f117446a;
        if (iVar == null) {
            C89219l.m154710a("tabListView");
        }
        iVar.mo86180a(filterBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$b */
    public final class C50905b extends C50887i {

        /* renamed from: h */
        final /* synthetic */ C50903l f117469h;

        static {
            Covode.recordClassIndex(60080);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50887i
        /* renamed from: a */
        public final void mo86251a(List<EffectCategoryResponse> list) {
            C89219l.m154721d(list, "");
            TabLayout tabLayout = this.f117411f;
            int size = list.size() + this.f117407b.size();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
            C85067q.m146267a(tabLayout, size, arrayList);
            super.mo86251a(list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C50905b(C50903l lVar, AbstractC50822h hVar, TabLayout tabLayout, AbstractC50828d dVar) {
            super(hVar, tabLayout, dVar);
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(tabLayout, "");
            this.f117469h = lVar;
        }
    }

    /* renamed from: a */
    public final void mo86265a(EffectCategoryResponse effectCategoryResponse) {
        this.f117450e.onNext(new C50816c(EnumC50817d.TAB_CLICK, effectCategoryResponse, null, 4));
        m95318b(false);
    }

    /* renamed from: b */
    public final void mo86267b(FilterBean filterBean) {
        m95318b(false);
        this.f117450e.onNext(new C50816c(EnumC50817d.FILTER_CLICK, null, filterBean, 2));
    }

    /* renamed from: b */
    private final void m95318b(boolean z) {
        if (this.f117451f.f117471b && this.f117463r != z) {
            this.f117463r = z;
            AbstractC50826b bVar = this.f117459n;
            if (bVar == null) {
                C89219l.m154710a("cleanView");
            }
            bVar.mo86205a(this.f117463r);
            if (this.f117463r) {
                mo86194a((FilterBean) null);
                AbstractC50823i iVar = this.f117446a;
                if (iVar == null) {
                    C89219l.m154710a("tabListView");
                }
                iVar.mo86187a((EffectCategoryResponse) null, false);
            }
            AbstractC50823i iVar2 = this.f117446a;
            if (iVar2 == null) {
                C89219l.m154710a("tabListView");
            }
            iVar2.mo86188a(!this.f117463r);
            this.f117465t.onNext(Boolean.valueOf(this.f117463r));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50821g
    /* renamed from: a */
    public final void mo86178a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        C89219l.m154721d(map, "");
        AbstractC50823i iVar = this.f117446a;
        if (iVar == null) {
            C89219l.m154710a("tabListView");
        }
        iVar.mo86178a(map);
    }

    /* renamed from: a */
    public final void mo86266a(boolean z) {
        FilterBean filterBean;
        if (z && (filterBean = this.f117447b) != null) {
            AbstractC50823i iVar = this.f117446a;
            if (iVar == null) {
                C89219l.m154710a("tabListView");
            }
            iVar.mo86183b(filterBean);
            AbstractC50823i iVar2 = this.f117446a;
            if (iVar2 == null) {
                C89219l.m154710a("tabListView");
            }
            iVar2.mo86189c(filterBean);
        }
        this.f117464s.onNext(C89387v.m154943a(Boolean.valueOf(z), this.f117447b));
    }

    /* renamed from: c */
    public final void mo86268c(FilterBean filterBean) {
        this.f117447b = filterBean;
        boolean z = false;
        if (filterBean != null) {
            m95318b(false);
        }
        FilterBean filterBean2 = this.f117447b;
        if (!this.f117451f.f117470a) {
            return;
        }
        if (filterBean2 != null) {
            AbstractC50827c cVar = this.f117458m;
            if (cVar == null) {
                C89219l.m154710a("seekBarView");
            }
            if (this.f117455j.mo86058b(filterBean2) != 0.0f) {
                z = true;
            }
            cVar.mo86209a(z);
            AbstractC50827c cVar2 = this.f117458m;
            if (cVar2 == null) {
                C89219l.m154710a("seekBarView");
            }
            if (cVar2.mo86210b()) {
                AbstractC50827c cVar3 = this.f117458m;
                if (cVar3 == null) {
                    C89219l.m154710a("seekBarView");
                }
                SeekBar a = cVar3.mo86208a();
                AbstractC50705m mVar = this.f117455j;
                C89219l.m154721d(mVar, "");
                C89219l.m154721d(filterBean2, "");
                a.setProgress(C50648c.m94910a(filterBean2, mVar.mo86055a(filterBean2), mVar.mo86056a()));
                if (a instanceof FilterBeautySeekBar) {
                    AbstractC50705m mVar2 = this.f117455j;
                    C89219l.m154721d(mVar2, "");
                    C89219l.m154721d(filterBean2, "");
                    int a2 = C50648c.m94910a(filterBean2, mVar2.mo86058b(filterBean2), mVar2.mo86056a());
                    FilterBeautySeekBar filterBeautySeekBar = (FilterBeautySeekBar) a;
                    if (a2 == 0 || a2 == 100) {
                        a2 = -1;
                    }
                    filterBeautySeekBar.setDefaultDotProgress(a2);
                    return;
                }
                return;
            }
            return;
        }
        AbstractC50827c cVar4 = this.f117458m;
        if (cVar4 == null) {
            C89219l.m154710a("seekBarView");
        }
        cVar4.mo86209a(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$a */
    public final class C50904a extends C50871f {

        /* renamed from: m */
        final /* synthetic */ C50903l f117468m;

        static {
            Covode.recordClassIndex(60079);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50871f
        /* renamed from: b */
        public final void mo86246b(int i, int i2) {
            RecyclerView.AbstractC1362i layoutManager = this.f117379h.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                C50937t tVar = new C50937t(this.f117379h.getContext());
                tVar.f4515g = i;
                layoutManager.mo4695a(tVar);
            }
        }

        public /* synthetic */ C50904a(C50903l lVar, RecyclerView recyclerView, AbstractC1204m mVar, AbstractC50935r rVar, AbstractC50936s sVar, C50885g gVar) {
            this(lVar, recyclerView, mVar, rVar, sVar, C50871f.f117370k, gVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C50904a(C50903l lVar, RecyclerView recyclerView, AbstractC1204m mVar, AbstractC50935r rVar, AbstractC50936s sVar, AbstractC89187q<? super AbstractC50822h, ? super FilterBean, ? super EnumC50699g, C89391z> qVar, C50885g gVar) {
            super(recyclerView, mVar, rVar, sVar, qVar, gVar);
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(gVar, "");
            this.f117468m = lVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C50903l(android.view.ViewGroup r26, androidx.lifecycle.AbstractC1204m r27, com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o r28, com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m r29, com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d r30, p4600h.p4611f.p4612a.AbstractC89172b<? super com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50903l.C50906c, p4600h.C89391z> r31) {
        /*
        // Method dump skipped, instructions count: 767
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50903l.<init>(android.view.ViewGroup, androidx.lifecycle.m, com.ss.android.ugc.aweme.filter.repository.a.o, com.ss.android.ugc.aweme.filter.repository.a.m, com.ss.android.ugc.aweme.filter.view.internal.d, h.f.a.b):void");
    }
}
