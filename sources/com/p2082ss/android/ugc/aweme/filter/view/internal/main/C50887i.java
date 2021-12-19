package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i */
public class C50887i implements AbstractC50823i {

    /* renamed from: a */
    public Map<EffectCategoryResponse, List<FilterBean>> f117406a = new LinkedHashMap();

    /* renamed from: b */
    public Map<Object, View> f117407b = new LinkedHashMap();

    /* renamed from: c */
    boolean f117408c = true;

    /* renamed from: d */
    final AbstractC88969g<EffectCategoryResponse> f117409d;

    /* renamed from: e */
    final AbstractC88969g<Object> f117410e;

    /* renamed from: f */
    public final TabLayout f117411f;

    /* renamed from: g */
    public final AbstractC50828d f117412g;

    /* renamed from: h */
    private final C88411a f117413h;

    /* renamed from: i */
    private final AbstractC50822h f117414i;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$g */
    static final class C50894g implements TabLayout.AbstractC73098b {

        /* renamed from: a */
        public static final C50894g f117423a = new C50894g();

        static {
            Covode.recordClassIndex(60069);
        }

        C50894g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73098b
        /* renamed from: a */
        public final void mo86256a(TabLayout.C73104f fVar) {
        }
    }

    static {
        Covode.recordClassIndex(60062);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: e */
    public final ViewGroup mo86190e() {
        return this.f117411f;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$b */
    public static final class C50889b implements IIsTagNeedUpdatedListener {

        /* renamed from: a */
        final /* synthetic */ C84984j f117418a;

        static {
            Covode.recordClassIndex(60064);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
            this.f117418a.mo129822a(false);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
            this.f117418a.mo129822a(true);
        }

        C50889b(C84984j jVar) {
            this.f117418a = jVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final FilterBean mo86179a() {
        return this.f117414i.mo86179a();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: b */
    public final AbstractC88979t<FilterBean> mo86182b() {
        return this.f117414i.mo86182b();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: c */
    public final AbstractC88979t<C20169f<FilterBean>> mo86184c() {
        return this.f117414i.mo86184c();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: d */
    public final AbstractC88979t<FilterBean> mo86185d() {
        return this.f117414i.mo86185d();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: f */
    public final AbstractC88979t<EffectCategoryResponse> mo86191f() {
        AbstractC88979t<EffectCategoryResponse> c = this.f117409d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: g */
    public final AbstractC88979t<Object> mo86192g() {
        AbstractC88979t<Object> c = this.f117410e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: a */
    public final void mo86188a(boolean z) {
        this.f117408c = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$f */
    public static final class C50893f implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ C50887i f117422a;

        static {
            Covode.recordClassIndex(60068);
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
        C50893f(C50887i iVar) {
            this.f117422a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            View view;
            Object obj = null;
            if (fVar != null && (view = fVar.f164125f) != null) {
                if (!(view instanceof C84984j)) {
                    view = null;
                }
                C84984j jVar = (C84984j) view;
                int i = 0;
                if (jVar != null) {
                    jVar.mo129822a(false);
                }
                AbstractC50828d dVar = this.f117422a.f117412g;
                if (dVar != null) {
                    Set<EffectCategoryResponse> keySet = this.f117422a.f117406a.keySet();
                    int i2 = fVar.f164124e;
                    C89219l.m154721d(keySet, "");
                    if (keySet instanceof List) {
                        obj = C89070n.m154561b((List) keySet, i2);
                    } else if (i2 >= 0) {
                        Iterator<T> it = keySet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            int i3 = i + 1;
                            if (i2 == i) {
                                obj = next;
                                break;
                            }
                            i = i3;
                        }
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
                    if (effectCategoryResponse != null) {
                        dVar.mo86212a(effectCategoryResponse);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$a */
    public static final class View$OnClickListenerC50888a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50887i f117415a;

        /* renamed from: b */
        final /* synthetic */ View f117416b;

        /* renamed from: c */
        final /* synthetic */ Object f117417c;

        static {
            Covode.recordClassIndex(60063);
        }

        View$OnClickListenerC50888a(C50887i iVar, View view, Object obj) {
            this.f117415a = iVar;
            this.f117416b = view;
            this.f117417c = obj;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C50887i iVar = this.f117415a;
            iVar.f117410e.onNext(this.f117417c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$d */
    static final class C50891d<T> implements AbstractC88433f<C20169f<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C50887i f117420a;

        static {
            Covode.recordClassIndex(60066);
        }

        C50891d(C50887i iVar) {
            this.f117420a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C20169f<? extends FilterBean> fVar) {
            C50887i iVar = this.f117420a;
            FilterBean filterBean = (FilterBean) fVar.mo33486a();
            if (filterBean != null) {
                iVar.mo86189c(filterBean);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final void mo86180a(FilterBean filterBean) {
        this.f117414i.mo86180a(filterBean);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: b */
    public final void mo86183b(FilterBean filterBean) {
        this.f117414i.mo86183b(filterBean);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$c */
    static final class C50890c<T> implements AbstractC88433f<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ C50887i f117419a;

        static {
            Covode.recordClassIndex(60065);
        }

        C50890c(C50887i iVar) {
            this.f117419a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            C50887i iVar = this.f117419a;
            C89219l.m154716b(filterBean2, "");
            C89219l.m154721d(filterBean2, "");
            if (iVar.f117408c) {
                iVar.mo86189c(filterBean2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$e */
    static final class C50892e<T> implements AbstractC88433f<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ C50887i f117421a;

        static {
            Covode.recordClassIndex(60067);
        }

        C50892e(C50887i iVar) {
            this.f117421a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            C50887i iVar = this.f117421a;
            C89219l.m154716b(filterBean2, "");
            C89219l.m154721d(filterBean2, "");
            if (iVar.f117408c) {
                iVar.mo86189c(filterBean2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.i$h */
    public static final class View$OnClickListenerC50895h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50887i f117424a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryResponse f117425b;

        static {
            Covode.recordClassIndex(60070);
        }

        View$OnClickListenerC50895h(C50887i iVar, EffectCategoryResponse effectCategoryResponse) {
            this.f117424a = iVar;
            this.f117425b = effectCategoryResponse;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C50887i iVar = this.f117424a;
            EffectCategoryResponse effectCategoryResponse = this.f117425b;
            iVar.f117409d.onNext(effectCategoryResponse);
            iVar.mo86187a(effectCategoryResponse, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50821g
    /* renamed from: a */
    public final void mo86178a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        C89219l.m154721d(map, "");
        this.f117406a.clear();
        this.f117406a.putAll(map);
        mo86251a(C89070n.m154590j(this.f117406a.keySet()));
        this.f117414i.mo86178a(this.f117406a);
        mo86187a((EffectCategoryResponse) C89070n.m154565c((Iterable) map.keySet()), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: c */
    public final void mo86189c(FilterBean filterBean) {
        EffectCategoryResponse effectCategoryResponse;
        T t;
        C89219l.m154721d(filterBean, "");
        Iterator<T> it = this.f117406a.entrySet().iterator();
        while (true) {
            effectCategoryResponse = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Iterator it2 = ((Iterable) t.getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((FilterBean) next).getId() == filterBean.getId()) {
                    if (next != null) {
                        break;
                    }
                }
            }
        }
        T t2 = t;
        if (t2 != null) {
            effectCategoryResponse = (EffectCategoryResponse) t2.getKey();
        }
        mo86187a(effectCategoryResponse, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86251a(List<EffectCategoryResponse> list) {
        C89219l.m154721d(list, "");
        this.f117411f.mo115533b();
        for (EffectCategoryResponse effectCategoryResponse : list) {
            Context context = this.f117411f.getContext();
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(effectCategoryResponse, "");
            C84984j a = C84383b.m145134a(context);
            int a2 = (int) C84912r.m145930a(context, 4.0f);
            a.setPadding(a2, 0, a2, 0);
            if (TextUtils.isEmpty(effectCategoryResponse.getIcon_normal_url())) {
                a.setText(effectCategoryResponse.getName());
            } else {
                String icon_normal_url = effectCategoryResponse.getIcon_normal_url();
                if (icon_normal_url == null) {
                    icon_normal_url = "";
                }
                a.setImage(icon_normal_url);
            }
            AbstractC50828d dVar = this.f117412g;
            if (dVar != null) {
                dVar.mo86213a(effectCategoryResponse, new C50889b(a));
            }
            TabLayout.C73104f a3 = this.f117411f.mo115519a().mo115584a(a);
            C89219l.m154716b(a3, "");
            this.f117411f.mo115525a(a3);
            a.setOnClickListener(new View$OnClickListenerC50895h(this, effectCategoryResponse));
        }
        for (Map.Entry<Object, View> entry : this.f117407b.entrySet()) {
            m95285b(entry.getValue(), entry.getKey());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: a */
    public final void mo86186a(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        this.f117407b.put(obj, view);
        m95285b(view, obj);
    }

    /* renamed from: b */
    private final void m95285b(View view, Object obj) {
        TabLayout.C73104f a = this.f117411f.mo115519a().mo115584a(view);
        C89219l.m154716b(a, "");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setOnClickListener(new View$OnClickListenerC50888a(this, view, obj));
        this.f117411f.mo115525a(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50822h
    /* renamed from: a */
    public final void mo86181a(FilterBean filterBean, int i) {
        this.f117414i.mo86181a(filterBean, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50823i
    /* renamed from: a */
    public final void mo86187a(EffectCategoryResponse effectCategoryResponse, boolean z) {
        TabLayout.C73104f a;
        List<FilterBean> list;
        FilterBean filterBean;
        int i = -1;
        if (effectCategoryResponse != null) {
            Iterator<T> it = this.f117406a.keySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                if (C89219l.m154714a((Object) next.getId(), (Object) effectCategoryResponse.getId())) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (!(!z || effectCategoryResponse == null || (list = this.f117406a.get(effectCategoryResponse)) == null || (filterBean = (FilterBean) C89070n.m154583g((List) list)) == null)) {
            this.f117414i.mo86181a(filterBean, 0);
        }
        if (i < 0) {
            if (this.f117411f.getCurSelectedTab() != null) {
                TabLayout.C73104f curSelectedTab = this.f117411f.getCurSelectedTab();
                C89219l.m154716b(curSelectedTab, "");
                View view = curSelectedTab.f164125f;
                if (view != null) {
                    view.setSelected(false);
                }
            }
            this.f117411f.mo115539d();
        } else if (this.f117411f.getSelectedTabPosition() != i && (a = this.f117411f.mo115520a(i)) != null) {
            a.mo115586a();
        }
    }

    public C50887i(AbstractC50822h hVar, TabLayout tabLayout, AbstractC50828d dVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(tabLayout, "");
        this.f117414i = hVar;
        this.f117411f = tabLayout;
        this.f117412g = dVar;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f117409d = cVar;
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f117410e = cVar2;
        C88411a aVar = new C88411a();
        this.f117413h = aVar;
        aVar.mo142945a(hVar.mo86182b().mo143254a(new C50890c(this), C88446a.f200699e));
        aVar.mo142945a(hVar.mo86184c().mo143254a(new C50891d(this), C88446a.f200699e));
        aVar.mo142945a(hVar.mo86185d().mo143254a(new C50892e(this), C88446a.f200699e));
        tabLayout.mo115524a(new C50893f(this));
        tabLayout.setOnTabClickListener(C50894g.f117423a);
    }
}
