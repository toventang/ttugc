package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20375am;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50748i;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i */
public final class C50785i implements AbstractC50748i {

    /* renamed from: a */
    final C1213t<List<FilterBean>> f117210a = new C1213t<>();

    /* renamed from: b */
    final C1213t<List<EffectCategoryResponse>> f117211b = new C1213t<>();

    /* renamed from: c */
    final C1213t<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> f117212c = new C1213t<>();

    /* renamed from: d */
    final C1213t<Map<String, Effect>> f117213d = new C1213t<>();

    /* renamed from: e */
    final C1213t<List<FilterBean>> f117214e = new C1213t<>();

    /* renamed from: f */
    public final Map<Integer, C50696d> f117215f = new LinkedHashMap();

    /* renamed from: g */
    public final List<C20375am<C50698f, C50696d, FilterBean>> f117216g = new ArrayList();

    /* renamed from: h */
    private C88411a f117217h = new C88411a();

    static {
        Covode.recordClassIndex(59953);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: a */
    public final LiveData<List<FilterBean>> mo86074a() {
        return this.f117210a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: b */
    public final LiveData<List<FilterBean>> mo86075b() {
        return this.f117214e;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: c */
    public final LiveData<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> mo86076c() {
        return this.f117212c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q
    /* renamed from: d */
    public final LiveData<Map<String, Effect>> mo86077d() {
        return this.f117213d;
    }

    /* renamed from: e */
    private final C88411a m95115e() {
        MethodCollector.m26663i(14);
        C88411a aVar = new C88411a();
        synchronized (this) {
            try {
                this.f117217h.dispose();
                this.f117217h.mo142944a();
                this.f117217h = aVar;
            } finally {
                MethodCollector.m26664o(14);
            }
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$c */
    static final class CallableC50788c<V> implements Callable<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117225a;

        /* renamed from: b */
        final /* synthetic */ Map f117226b;

        static {
            Covode.recordClassIndex(59956);
        }

        CallableC50788c(C50785i iVar, Map map) {
            this.f117225a = iVar;
            this.f117226b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<FilterBean> call() {
            ArrayList arrayList;
            boolean z;
            MethodCollector.m26663i(1504);
            synchronized (this.f117225a) {
                try {
                    List<C20375am<C50698f, C50696d, FilterBean>> list = this.f117225a.f117216g;
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        C50696d dVar = (C50696d) this.f117226b.get(Integer.valueOf(t.f48260a.f117047a));
                        if (dVar == null) {
                            dVar = C50812b.m95163a(t.f48260a.f117047a);
                        }
                        A a = t.f48260a;
                        C c = t.f48262c;
                        C50812b.m95167a(dVar, c);
                        arrayList2.add(new C20375am(a, dVar, c));
                    }
                    arrayList = arrayList2;
                    this.f117225a.f117216g.clear();
                    this.f117225a.f117216g.addAll(arrayList);
                    this.f117225a.f117215f.clear();
                    this.f117225a.f117215f.putAll(this.f117226b);
                } catch (Throwable th) {
                    MethodCollector.m26664o(1504);
                    throw th;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C20375am) obj).f48261b.f117042b == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList4.add(obj);
                }
            }
            ArrayList<C20375am> arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) arrayList5, 10));
            for (C20375am amVar : arrayList5) {
                arrayList6.add(amVar.f48262c);
            }
            arrayList3.addAll(arrayList6);
            MethodCollector.m26664o(1504);
            return arrayList3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$b */
    static final class CallableC50787b<V> implements Callable<C50786a> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117223a;

        /* renamed from: b */
        final /* synthetic */ C50695c f117224b;

        static {
            Covode.recordClassIndex(59955);
        }

        CallableC50787b(C50785i iVar, C50695c cVar) {
            this.f117223a = iVar;
            this.f117224b = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C50786a call() {
            T t;
            C c;
            MethodCollector.m26663i(36);
            ArrayList<C20375am> arrayList = new ArrayList();
            synchronized (this.f117223a) {
                try {
                    List<C20375am<C50698f, C50696d, FilterBean>> list = this.f117223a.f117216g;
                    for (T t2 : this.f117224b.f117039a) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (t.f48260a.f117047a == t2.f117047a) {
                                break;
                            }
                        }
                        T t3 = t;
                        C50696d dVar = this.f117223a.f117215f.get(Integer.valueOf(t2.f117047a));
                        if (dVar == null) {
                            dVar = C50812b.m95163a(t2.f117047a);
                        }
                        if (t3 == null || (c = t3.f48262c) == null) {
                            c = new FilterBean();
                        }
                        C89219l.m154721d(t2, "");
                        C89219l.m154721d(c, "");
                        c.setId(t2.f117047a);
                        c.setResId(t2.f117048b);
                        c.setExtra(t2.f117055i);
                        c.setName(t2.f117049c);
                        c.setEnName(t2.f117050d);
                        c.setResource(t2.f117051e);
                        c.setTags(t2.f117052f);
                        c.setTagUpdateAt(t2.f117053g);
                        c.setThumbnailFileUri(t2.f117054h);
                        C50812b.m95167a(dVar, c);
                        arrayList.add(new C20375am(t2, dVar, c));
                    }
                    this.f117223a.f117216g.clear();
                    this.f117223a.f117216g.addAll(arrayList);
                } catch (Throwable th) {
                    MethodCollector.m26664o(36);
                    throw th;
                }
            }
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (C20375am amVar : arrayList) {
                arrayList2.add(amVar.f48262c);
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C20375am) obj).f48261b.f117042b == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    arrayList4.add(obj);
                }
            }
            ArrayList<C20375am> arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) arrayList5, 10));
            for (C20375am amVar2 : arrayList5) {
                arrayList6.add(amVar2.f48262c);
            }
            ArrayList arrayList7 = arrayList6;
            List<C89378p<EffectCategoryResponse, List<FilterBean>>> a = C50785i.m95113a(this.f117224b.f117040b, arrayList3);
            List<C89378p<EffectCategoryResponse, List<C50698f>>> list2 = this.f117224b.f117040b;
            ArrayList arrayList8 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList8.add(it2.next().getFirst());
            }
            ArrayList arrayList9 = arrayList8;
            C50786a aVar = new C50786a(arrayList3, arrayList9, a, C50785i.m95114a(arrayList9), arrayList7);
            MethodCollector.m26664o(36);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$g */
    static final class C50792g<T> implements AbstractC88433f<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117230a;

        static {
            Covode.recordClassIndex(59960);
        }

        C50792g(C50785i iVar) {
            this.f117230a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends FilterBean> list) {
            C50785i iVar = this.f117230a;
            C89219l.m154716b(list, "");
            iVar.f117214e.setValue(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$d */
    static final class C50789d<T, R> implements AbstractC88434g<C50695c, AbstractC88984x<? extends C50786a>> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117227a;

        static {
            Covode.recordClassIndex(59957);
        }

        C50789d(C50785i iVar) {
            this.f117227a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC88984x<? extends C50786a> apply(C50695c cVar) {
            C50695c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C50785i iVar = this.f117227a;
            C89219l.m154721d(cVar2, "");
            AbstractC88979t c = AbstractC88979t.m154314c(new CallableC50787b(iVar, cVar2));
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$f */
    static final class C50791f<T, R> implements AbstractC88434g<Map<Integer, ? extends C50696d>, AbstractC88984x<? extends List<? extends FilterBean>>> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117229a;

        static {
            Covode.recordClassIndex(59959);
        }

        C50791f(C50785i iVar) {
            this.f117229a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC88984x<? extends List<? extends FilterBean>> apply(Map<Integer, ? extends C50696d> map) {
            Map<Integer, ? extends C50696d> map2 = map;
            C89219l.m154721d(map2, "");
            AbstractC88979t c = AbstractC88979t.m154314c(new CallableC50788c(this.f117229a, map2));
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$e */
    static final class C50790e<T> implements AbstractC88433f<C50786a> {

        /* renamed from: a */
        final /* synthetic */ C50785i f117228a;

        static {
            Covode.recordClassIndex(59958);
        }

        C50790e(C50785i iVar) {
            this.f117228a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50786a aVar) {
            C50786a aVar2 = aVar;
            C50785i iVar = this.f117228a;
            C89219l.m154716b(aVar2, "");
            iVar.f117210a.setValue(aVar2.f117218a);
            iVar.f117212c.setValue(aVar2.f117220c);
            iVar.f117214e.setValue(aVar2.f117222e);
            iVar.f117211b.setValue(aVar2.f117219b);
            iVar.f117213d.setValue(aVar2.f117221d);
        }
    }

    /* renamed from: a */
    protected static Map<String, Effect> m95114a(List<EffectCategoryResponse> list) {
        C89219l.m154721d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Effect> totalEffects = it.next().getTotalEffects();
            if (totalEffects != null) {
                for (T t : totalEffects) {
                    if (!(t == null || t.getName() == null)) {
                        linkedHashMap.put(t.getName(), t);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50748i
    /* renamed from: a */
    public final void mo86107a(AbstractC50707o oVar) {
        C89219l.m154721d(oVar, "");
        C88411a e = m95115e();
        e.mo142945a(oVar.mo86068c().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143267a((AbstractC88434g<? super C50695c, ? extends AbstractC88984x<? extends R>>) new C50789d(this), false).mo143261a(C88392a.m153583a()).mo143254a(new C50790e(this), C84909p.f189747a));
        e.mo142945a(oVar.mo86069d().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143267a((AbstractC88434g<? super Map<Integer, C50696d>, ? extends AbstractC88984x<? extends R>>) new C50791f(this), false).mo143261a(C88392a.m153583a()).mo143254a(new C50792g(this), C84909p.f189747a));
    }

    /* renamed from: a */
    protected static List<C89378p<EffectCategoryResponse, List<FilterBean>>> m95113a(List<? extends C89378p<EffectCategoryResponse, ? extends List<C50698f>>> list, List<? extends FilterBean> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (T t : list) {
                ArrayList arrayList2 = new ArrayList();
                for (C50698f fVar : (Iterable) t.getSecond()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.getId() == fVar.f117047a) {
                            if (next != null) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(C89387v.m154943a(t.getFirst(), arrayList2));
                }
            }
        } else {
            arrayList.add(C89387v.m154943a(C50687a.f117028b, list2));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.i$a */
    public static final class C50786a {

        /* renamed from: a */
        public final List<FilterBean> f117218a;

        /* renamed from: b */
        public final List<EffectCategoryResponse> f117219b;

        /* renamed from: c */
        public final List<C89378p<EffectCategoryResponse, List<FilterBean>>> f117220c;

        /* renamed from: d */
        public final Map<String, Effect> f117221d;

        /* renamed from: e */
        public final List<FilterBean> f117222e;

        static {
            Covode.recordClassIndex(59954);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C50786a)) {
                return false;
            }
            C50786a aVar = (C50786a) obj;
            return C89219l.m154714a(this.f117218a, aVar.f117218a) && C89219l.m154714a(this.f117219b, aVar.f117219b) && C89219l.m154714a(this.f117220c, aVar.f117220c) && C89219l.m154714a(this.f117221d, aVar.f117221d) && C89219l.m154714a(this.f117222e, aVar.f117222e);
        }

        public final int hashCode() {
            List<FilterBean> list = this.f117218a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<EffectCategoryResponse> list2 = this.f117219b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<C89378p<EffectCategoryResponse, List<FilterBean>>> list3 = this.f117220c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            Map<String, Effect> map = this.f117221d;
            int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
            List<FilterBean> list4 = this.f117222e;
            if (list4 != null) {
                i = list4.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "FilterDataObserveBundle(filters=" + this.f117218a + ", categories=" + this.f117219b + ", categoryMap=" + this.f117220c + ", effectMap=" + this.f117221d + ", availableFilters=" + this.f117222e + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>>> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX WARN: Multi-variable type inference failed */
        public C50786a(List<? extends FilterBean> list, List<EffectCategoryResponse> list2, List<? extends C89378p<EffectCategoryResponse, ? extends List<? extends FilterBean>>> list3, Map<String, ? extends Effect> map, List<? extends FilterBean> list4) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(list3, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(list4, "");
            this.f117218a = list;
            this.f117219b = list2;
            this.f117220c = list3;
            this.f117221d = map;
            this.f117222e = list4;
        }
    }
}
