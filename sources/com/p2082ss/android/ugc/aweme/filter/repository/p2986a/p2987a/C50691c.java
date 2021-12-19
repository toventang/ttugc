package com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a;

import androidx.core.p030b.C0622a;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.c */
public final class C50691c {
    static {
        Covode.recordClassIndex(59853);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.c$a */
    public static final class C50692a extends AbstractC89220m implements AbstractC89172b<FilterBean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ FilterBean f117032a;

        static {
            Covode.recordClassIndex(59854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50692a(FilterBean filterBean) {
            super(1);
            this.f117032a = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FilterBean filterBean) {
            boolean z;
            FilterBean filterBean2 = filterBean;
            C89219l.m154721d(filterBean2, "");
            if (filterBean2.getId() == this.f117032a.getId()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final List<FilterBean> m94988a(AbstractC50709q qVar) {
        C89219l.m154721d(qVar, "");
        List<FilterBean> value = qVar.mo86075b().getValue();
        if (value == null) {
            return C89086z.INSTANCE;
        }
        return value;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.c$b */
    public static final class C50693b<T> implements AbstractC1214u<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f117033a;

        /* renamed from: b */
        final /* synthetic */ String f117034b;

        /* renamed from: c */
        final /* synthetic */ String f117035c;

        static {
            Covode.recordClassIndex(59855);
        }

        public C50693b(AbstractC89172b bVar, String str, String str2) {
            this.f117033a = bVar;
            this.f117034b = str;
            this.f117035c = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            T t;
            Integer e;
            List<? extends FilterBean> list2 = list;
            AbstractC89172b bVar = this.f117033a;
            C89219l.m154716b(list2, "");
            Iterator<T> it = list2.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                t = it.next();
                T t2 = t;
                if (C89219l.m154714a((Object) t2.getResId(), (Object) this.f117034b)) {
                    break;
                }
                int id = t2.getId();
                String str = this.f117035c;
                if (str != null && (e = C89361p.m154863e(str)) != null && id == e.intValue()) {
                    break;
                }
            }
            bVar.invoke(t);
        }
    }

    /* renamed from: a */
    public static final float m94984a(AbstractC50705m mVar, FilterBean filterBean) {
        int a;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(filterBean, "");
        if (mVar instanceof AbstractC50706n) {
            a = ((AbstractC50706n) mVar).mo86059a(filterBean, mVar.mo86056a());
        } else {
            a = C50648c.m94910a(filterBean, mVar.mo86055a(filterBean), mVar.mo86056a());
        }
        return ((float) a) / 100.0f;
    }

    /* renamed from: b */
    public static final FilterBean m94990b(AbstractC50709q qVar, int i) {
        C89219l.m154721d(qVar, "");
        List<FilterBean> value = qVar.mo86075b().getValue();
        T t = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getId() == i) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public static final int m94985a(AbstractC50709q qVar, FilterBean filterBean) {
        List<FilterBean> value;
        C89219l.m154721d(qVar, "");
        if (!(filterBean == null || (value = qVar.mo86075b().getValue()) == null)) {
            Iterator<FilterBean> it = value.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C89219l.m154714a(it.next(), filterBean)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final EffectCategoryResponse m94991b(AbstractC50709q qVar, FilterBean filterBean) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(filterBean, "");
        List<C89378p<EffectCategoryResponse, List<FilterBean>>> value = qVar.mo86076c().getValue();
        if (value == null) {
            return null;
        }
        C89219l.m154716b(value, "");
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) C50687a.m94975a((List) value, (AbstractC89172b) new C50692a(filterBean));
        if (effectCategoryResponse != null) {
            return effectCategoryResponse;
        }
        C89378p pVar = (C89378p) C89070n.m154561b((List) value, 0);
        if (pVar != null) {
            return (EffectCategoryResponse) pVar.getFirst();
        }
        return null;
    }

    /* renamed from: a */
    public static final FilterBean m94986a(AbstractC50709q qVar, int i) {
        int i2;
        FilterBean filterBean;
        C89219l.m154721d(qVar, "");
        List<FilterBean> value = qVar.mo86075b().getValue();
        if (value != null) {
            i2 = value.size();
        } else {
            i2 = 0;
        }
        int a = C0622a.m2312a(i, 0, Math.max(i2 - 1, 0));
        if (value == null || (filterBean = (FilterBean) C89070n.m154561b((List) value, a)) == null) {
            return C50687a.m94974a();
        }
        return filterBean;
    }

    /* renamed from: a */
    public static final FilterBean m94987a(AbstractC50709q qVar, String str) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(str, "");
        List<FilterBean> value = qVar.mo86075b().getValue();
        T t = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.getResId(), (Object) str)) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public static final boolean m94989a(AbstractC50707o oVar, FilterBean filterBean) {
        EnumC50699g gVar;
        C89219l.m154721d(oVar, "");
        if (filterBean != null) {
            gVar = oVar.mo86066b(filterBean.getId());
        } else {
            gVar = null;
        }
        if (gVar == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return true;
        }
        return false;
    }
}
