package com.bytedance.ies.p1191d.p1192a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.c */
public final class C17108c implements AbstractC17113e {

    /* renamed from: a */
    public boolean f40714a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, C17135u> f40715b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public boolean f40716c;

    /* renamed from: d */
    public String f40717d = "";

    /* renamed from: e */
    final Executor f40718e;

    /* renamed from: f */
    public final AbstractC17114f f40719f;

    /* renamed from: g */
    public final AbstractC17116h f40720g;

    static {
        Covode.recordClassIndex(19565);
    }

    /* renamed from: com.bytedance.ies.d.a.c$a */
    static final class RunnableC17109a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17108c f40721a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40722b;

        static {
            Covode.recordClassIndex(19566);
        }

        RunnableC17109a(C17108c cVar, AbstractC89171a aVar) {
            this.f40721a = cVar;
            this.f40722b = aVar;
        }

        public final void run() {
            this.f40721a.f40715b.clear();
            C17108c cVar = this.f40721a;
            cVar.f40718e.execute(new RunnableC17110b(cVar, cVar.f40719f.mo27024a()));
            this.f40721a.f40714a = true;
            C17130q.m31653a("ConfigManager initialized successfully.");
            this.f40722b.invoke();
        }
    }

    /* renamed from: com.bytedance.ies.d.a.c$b */
    static final class RunnableC17110b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17108c f40723a;

        /* renamed from: b */
        final /* synthetic */ List f40724b;

        static {
            Covode.recordClassIndex(19567);
        }

        RunnableC17110b(C17108c cVar, List list) {
            this.f40723a = cVar;
            this.f40724b = list;
        }

        public final void run() {
            Object obj;
            for (String str : this.f40724b) {
                try {
                    C17135u uVar = new C17135u(new JSONObject(str));
                    this.f40723a.f40715b.put(uVar.f40741a, uVar);
                    TextUtils.isEmpty(uVar.f40741a);
                    if (this.f40723a.f40716c) {
                        String str2 = this.f40723a.f40717d;
                        String str3 = uVar.f40741a;
                        C89219l.m154719c(str2, "");
                        C89219l.m154719c(str3, "");
                        C89219l.m154719c(str, "");
                        if (!C17136v.m31660a().containsKey(str2)) {
                            C17136v.m31660a().put(str2, new ArrayList<>());
                        }
                        ArrayList<C17090ac> arrayList = C17136v.m31660a().get(str2);
                        if (arrayList != null) {
                            arrayList.add(new C17090ac(str3, str));
                        }
                    }
                    obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                Throwable r2 = C89379q.m157071exceptionOrNullimpl(obj);
                if (r2 != null) {
                    C17130q.m31656b("Failed to parse config json.", r2);
                    if (this.f40723a.f40720g != null) {
                        C89219l.m154719c(r2, "");
                        StringWriter stringWriter = new StringWriter();
                        r2.printStackTrace(new PrintWriter(stringWriter));
                        C89219l.m154709a((Object) stringWriter.toString(), "");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17113e
    /* renamed from: a */
    public final void mo27015a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        if (this.f40714a) {
            aVar.invoke();
        } else {
            this.f40718e.execute(new RunnableC17109a(this, aVar));
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17113e
    /* renamed from: a */
    public final C89378p<Collection<C17091ad>, SortedMap<String, String>> mo27014a(C17100aj ajVar) {
        C89378p<Collection<C17091ad>, SortedMap<String, String>> pVar;
        C89378p<Collection<C17091ad>, SortedMap<String, String>> pVar2;
        C17092ae aeVar;
        List<String> first;
        C89378p<List<String>, SortedMap<String, String>> a;
        List<String> first2;
        C89219l.m154719c(ajVar, "");
        Iterator<Map.Entry<String, C17135u>> it = this.f40715b.entrySet().iterator();
        while (true) {
            pVar = null;
            SortedMap<String, String> sortedMap = null;
            if (!it.hasNext()) {
                break;
            }
            C17135u value = it.next().getValue();
            C89219l.m154719c(ajVar, "");
            if (!value.f40745e.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                C17132r rVar = value.f40743c;
                if (!(rVar == null || (a = rVar.mo27042a(ajVar)) == null || (first2 = a.getFirst()) == null)) {
                    Iterator<T> it2 = first2.iterator();
                    while (it2.hasNext()) {
                        C17091ad adVar = value.f40745e.get(it2.next());
                        if (adVar != null) {
                            arrayList.add(adVar);
                        }
                    }
                }
                if (!arrayList.isEmpty() || (aeVar = value.f40744d) == null) {
                    pVar2 = new C89378p<>(arrayList, null);
                } else {
                    C89378p<List<String>, SortedMap<String, String>> a2 = aeVar.mo27000a(ajVar);
                    if (!(a2 == null || (first = a2.getFirst()) == null)) {
                        Iterator<T> it3 = first.iterator();
                        while (it3.hasNext()) {
                            C17091ad adVar2 = value.f40745e.get(it3.next());
                            if (adVar2 != null) {
                                arrayList.add(adVar2);
                            }
                        }
                    }
                    if (a2 != null) {
                        sortedMap = a2.getSecond();
                    }
                    pVar2 = new C89378p<>(arrayList, sortedMap);
                }
                pVar = pVar2;
                if (!pVar.getFirst().isEmpty()) {
                    break;
                }
            }
        }
        return pVar;
    }

    public C17108c(Executor executor, AbstractC17114f fVar, AbstractC17116h hVar) {
        C89219l.m154719c(executor, "");
        C89219l.m154719c(fVar, "");
        this.f40718e = executor;
        this.f40719f = fVar;
        this.f40720g = hVar;
    }
}
