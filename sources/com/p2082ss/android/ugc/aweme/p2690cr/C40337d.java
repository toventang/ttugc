package com.p2082ss.android.ugc.aweme.p2690cr;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.draft.model.C43236j;
import com.p2082ss.android.ugc.aweme.p2690cr.p2691a.p2692a.AbstractC40323a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.C79023a;
import com.p2082ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.cr.d */
public final class C40337d implements AbstractC40390d {

    /* renamed from: a */
    private final ConcurrentHashMap<String, AbstractC40323a> f94512a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(48138);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: java.util.LinkedHashSet<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d
    /* renamed from: a */
    public final Set<String> mo69482a() {
        C43236j jVar = new C43236j(C40338a.f94513a);
        Collection<AbstractC40323a> values = this.f94512a.values();
        C89219l.m154716b(values, "");
        for (T t : values) {
            if (!t.f94494a.get()) {
                AbstractC40390d d = C63244g.m114602a().mo73279g().mo69471d();
                String name = t.getClass().getName();
                C89219l.m154716b(name, "");
                if (!d.mo69484a(name)) {
                    C40346b.m81527b();
                }
                t.f94496c.clear();
                String[] stringArray = ((Keva) t.f94495b.getValue()).getStringArray(String.valueOf(t.getClass().getName().hashCode()), new String[0]);
                C89219l.m154716b(stringArray, "");
                for (Object obj : C89064i.m154506g(stringArray)) {
                    t.f94496c.add(obj);
                }
                t.f94494a.set(true);
            }
            jVar.addAll(t.f94496c);
        }
        Application application = C63238c.f143574a;
        C89219l.m154716b(application, "");
        C89219l.m154721d(application, "");
        ArrayList<OriginalSoundUploadTask> a = C79023a.C79024a.m137854a(application).mo122848a();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f177620c);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        jVar.addAll(C89070n.m154522b(Arrays.copyOf(strArr, strArr.length)));
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d
    /* renamed from: a */
    public final boolean mo69484a(String str) {
        C89219l.m154721d(str, "");
        return this.f94512a.containsKey(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.d$a */
    static final class C40338a extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        public static final C40338a f94513a = new C40338a();

        static {
            Covode.recordClassIndex(48139);
        }

        C40338a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return Boolean.valueOf(!C89361p.m154870a((CharSequence) str2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d
    /* renamed from: a */
    public final void mo69483a(AbstractC40323a aVar) {
        C89219l.m154721d(aVar, "");
        ConcurrentHashMap<String, AbstractC40323a> concurrentHashMap = this.f94512a;
        String name = aVar.getClass().getName();
        C89219l.m154716b(name, "");
        concurrentHashMap.put(name, aVar);
    }
}
