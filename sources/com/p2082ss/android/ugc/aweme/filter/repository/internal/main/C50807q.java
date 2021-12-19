package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50697e;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.q */
public final class C50807q implements AbstractC50707o {

    /* renamed from: a */
    public List<? extends FilterBean> f117250a;

    /* renamed from: b */
    private final C88958b<C50695c> f117251b;

    /* renamed from: c */
    private final C88958b<Map<Integer, C50696d>> f117252c;

    /* renamed from: d */
    private C50806p f117253d;

    static {
        Covode.recordClassIndex(59975);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final void mo86064a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: b */
    public final void mo86067b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: f */
    public final AbstractC50709q mo86071f() {
        return this.f117253d;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: g */
    public final AbstractC50704l mo86072g() {
        throw new UnsupportedOperationException("option not supported.");
    }

    public /* synthetic */ C50807q() {
        this(C89086z.INSTANCE, new C50806p());
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: c */
    public final AbstractC88979t<C50695c> mo86068c() {
        AbstractC88979t<C50695c> c = this.f117251b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: d */
    public final AbstractC88979t<Map<Integer, C50696d>> mo86069d() {
        AbstractC88979t<Map<Integer, C50696d>> c = this.f117252c.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: e */
    public final AbstractC88979t<C50697e> mo86070e() {
        AbstractC88979t<C50697e> a = C88925a.m154171a(C88790v.f201616a);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final void mo86065a(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final C50698f mo86061a(int i) {
        T t;
        Iterator<T> it = this.f117250a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getId() == i) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return C50812b.m95169b((FilterBean) t2);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: b */
    public final EnumC50699g mo86066b(int i) {
        EnumC50699g gVar;
        Iterator<T> it = this.f117250a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getId() == i) {
                if (next != null && (gVar = EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) != null) {
                    return gVar;
                }
            }
        }
        return EnumC50699g.FILTER_STATE_UNKNOWN;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final AbstractC88979t<C50696d> mo86062a(FilterBean filterBean) {
        T t;
        AbstractC88979t<C50696d> b;
        C89219l.m154721d(filterBean, "");
        Iterator<T> it = this.f117250a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getId() == filterBean.getId()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (b = AbstractC88979t.m154310b(C50812b.m95164a(t2, EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS))) != null) {
            return b;
        }
        AbstractC88979t<C50696d> b2 = AbstractC88979t.m154310b(new C50696d(filterBean.getId(), EnumC50699g.FILTER_STATE_DOWNLOAD_FAILED, "", ""));
        C89219l.m154716b(b2, "");
        return b2;
    }

    /* renamed from: a */
    public final void mo86130a(List<? extends FilterBean> list) {
        C88958b<C50695c> bVar = this.f117251b;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C50812b.m95169b((FilterBean) it.next()));
        }
        bVar.onNext(new C50695c(arrayList, C89086z.INSTANCE));
        C88958b<Map<Integer, C50696d>> bVar2 = this.f117252c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list, 10)), 16));
        for (T t : list) {
            C89378p a = C89387v.m154943a(Integer.valueOf(t.getId()), C50812b.m95164a(t, EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS));
            linkedHashMap.put(a.getFirst(), a.getSecond());
        }
        bVar2.onNext(linkedHashMap);
        C50806p pVar = this.f117253d;
        C89219l.m154721d(list, "");
        pVar.f117246a.setValue(list);
        pVar.f117247b.setValue(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final AbstractC88979t<C50696d> mo86063a(C50698f fVar, List<? extends C89378p<EffectCategoryResponse, ? extends List<C50698f>>> list) {
        C89219l.m154721d(fVar, "");
        throw new UnsupportedOperationException("option not supported.");
    }

    private C50807q(List<? extends FilterBean> list, C50806p pVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(pVar, "");
        this.f117250a = list;
        this.f117253d = pVar;
        C88958b<C50695c> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f117251b = bVar;
        C88958b<Map<Integer, C50696d>> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f117252c = bVar2;
        mo86130a(this.f117250a);
    }
}
