package com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a.C84386a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a */
public final class C50687a {

    /* renamed from: a */
    public static final C50695c f117027a = new C50695c(C89086z.INSTANCE, C89086z.INSTANCE);

    /* renamed from: b */
    public static final EffectCategoryResponse f117028b = C84386a.f188662b;

    /* renamed from: c */
    private static final AbstractC89244h f117029c = C89250i.m154773a((AbstractC89171a) C50688a.f117030a);

    /* renamed from: a */
    public static final FilterBean m94974a() {
        return (FilterBean) f117029c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a$a */
    static final class C50688a extends AbstractC89220m implements AbstractC89171a<FilterBean> {

        /* renamed from: a */
        public static final C50688a f117030a = new C50688a();

        static {
            Covode.recordClassIndex(59850);
        }

        C50688a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FilterBean invoke() {
            return C50687a.m94980b();
        }
    }

    static {
        Covode.recordClassIndex(59849);
    }

    /* renamed from: b */
    public static final FilterBean m94980b() {
        FilterBean filterBean = new FilterBean();
        filterBean.setFilterFolder("");
        filterBean.setEnName("normal");
        filterBean.setName("");
        return filterBean;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a$b */
    static final class C50689b extends AbstractC89220m implements AbstractC89172b<K, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f117031a;

        static {
            Covode.recordClassIndex(59851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50689b(Object obj) {
            super(1);
            this.f117031a = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(C89219l.m154714a(obj, this.f117031a));
        }
    }

    /* renamed from: b */
    public static final String m94981b(FilterBean filterBean) {
        String filterFolder;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null) {
            return "";
        }
        return filterFolder;
    }

    /* renamed from: a */
    public static final String m94976a(FilterBean filterBean) {
        String enName;
        if (filterBean == null || (enName = filterBean.getEnName()) == null) {
            return "";
        }
        return enName;
    }

    /* renamed from: a */
    public static final <K, V> List<K> m94977a(List<? extends C89378p<? extends K, ? extends List<? extends V>>> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <K, V> Map<K, List<V>> m94982b(List<? extends C89378p<? extends K, ? extends List<? extends V>>> list) {
        if (list == null) {
            return C89041ag.m154415a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t.getFirst(), t.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final <K, V> K m94975a(List<? extends C89378p<? extends K, ? extends List<? extends V>>> list, AbstractC89172b<? super V, Boolean> bVar) {
        T t;
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Iterator it2 = ((Iterable) t.getSecond()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object obj = (Object) it2.next();
                if (bVar.invoke(obj).booleanValue()) {
                    if (obj != 0) {
                        break;
                    }
                }
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (K) t2.getFirst();
        }
        return null;
    }

    /* renamed from: a */
    public static final <K, V> List<V> m94978a(List<? extends C89378p<? extends K, ? extends List<? extends V>>> list, K k) {
        T t;
        C89219l.m154721d(list, "");
        C50689b bVar = new C50689b(k);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Boolean) bVar.invoke(t.getFirst())).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (List) t2.getSecond();
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m94979a(FilterBean filterBean, FilterBean filterBean2) {
        if (filterBean == null) {
            if (filterBean2 != null) {
                return false;
            }
            return true;
        } else if (filterBean2 == null || filterBean.getId() != filterBean2.getId()) {
            return false;
        } else {
            return true;
        }
    }
}
