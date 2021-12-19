package com.p2082ss.android.ugc.aweme.search.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.internal.C27925b;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory */
public final class SearchMixFeedCollectionTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    public static boolean f151106a;

    static {
        Covode.recordClassIndex(79080);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory$a */
    static final class C67444a<E> extends AbstractC28031v<Collection<E>> {

        /* renamed from: a */
        private final AbstractC28031v<E> f151107a;

        static {
            Covode.recordClassIndex(79081);
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Object read(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            aVar.mo46621a();
            int i = 3;
            boolean z = SearchMixFeedCollectionTypeAdapterFactory.f151106a;
            boolean z2 = false;
            int i2 = 0;
            while (aVar.mo46626e()) {
                if (!z || !z2 || arrayList.size() < i) {
                    E read = this.f151107a.read(aVar);
                    if (read instanceof C42411h) {
                        E e = read;
                        if (arrayList.isEmpty() && e.getFeedType() == 65280) {
                            i = 4;
                        }
                        if (z && arrayList.size() == i - 1 && aVar.mo46626e()) {
                            e.f98808r = true;
                        }
                        z2 = true;
                    }
                    arrayList.add(read);
                } else {
                    aVar.mo46635o();
                }
                i2++;
            }
            aVar.mo46622b();
            if (!arrayList.isEmpty()) {
                for (E e2 : arrayList) {
                    if (e2 instanceof C42411h) {
                        e2.f98810t = i2;
                    }
                }
            }
            return arrayList;
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo46654f();
                return;
            }
            cVar.mo46647b();
            for (E e : collection) {
                this.f151107a.write(cVar, e);
            }
            cVar.mo46649c();
        }

        C67444a(C27910f fVar, Type type, AbstractC28031v<E> vVar) {
            this.f151107a = new C67445a(fVar, vVar, type);
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C27925b.m55978a(type, (Class<?>) cls);
        if (!C42411h.class.equals(a)) {
            return null;
        }
        return new C67444a(fVar, a, fVar.mo46663a((C27895a) C27895a.get(a)));
    }
}
