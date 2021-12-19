package com.p2082ss.android.ugc.aweme.ecommerce.eventcenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter */
public final class EventCenter implements IEventCenter {

    /* renamed from: b */
    private final C18822b f103691b = new C18822b();

    /* renamed from: c */
    private final ConcurrentHashMap<String, ConcurrentHashMap<C44480a<IEventCenter.AbstractC45375b>, AbstractC18511d>> f103692c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ReferenceQueue<IEventCenter.AbstractC45375b> f103693d = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(52827);
    }

    /* renamed from: a */
    public static IEventCenter m87158a() {
        MethodCollector.m26663i(7933);
        Object a = C81908b.m141854a(IEventCenter.class, false);
        if (a != null) {
            IEventCenter iEventCenter = (IEventCenter) a;
            MethodCollector.m26664o(7933);
            return iEventCenter;
        }
        if (C81908b.f183229bf == null) {
            synchronized (IEventCenter.class) {
                try {
                    if (C81908b.f183229bf == null) {
                        C81908b.f183229bf = new EventCenter();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7933);
                    throw th;
                }
            }
        }
        EventCenter eventCenter = (EventCenter) C81908b.f183229bf;
        MethodCollector.m26664o(7933);
        return eventCenter;
    }

    /* renamed from: b */
    private final void m87162b() {
        Reference<? extends IEventCenter.AbstractC45375b> poll = this.f103693d.poll();
        while (poll instanceof C44480a) {
            String str = ((C44480a) poll).f103694a;
            ConcurrentHashMap<C44480a<IEventCenter.AbstractC45375b>, AbstractC18511d> a = m87161a(str);
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            AbstractC18511d dVar = (AbstractC18511d) C89206ad.m154686h(a).remove(poll);
            if (dVar != null) {
                C18494b.m34422b(str, dVar);
            }
            poll = this.f103693d.poll();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter$b */
    public static final class C44481b implements AbstractC18511d {

        /* renamed from: a */
        final /* synthetic */ C44480a f103695a;

        /* renamed from: b */
        final /* synthetic */ String f103696b;

        static {
            Covode.recordClassIndex(52829);
        }

        @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
        /* renamed from: a */
        public final void mo8791a(C18502c cVar) {
            JSONObject jSONObject;
            C89219l.m154721d(cVar, "");
            IEventCenter.AbstractC45375b bVar = (IEventCenter.AbstractC45375b) this.f103695a.get();
            if (bVar != null) {
                AbstractC18754n nVar = cVar.f44154b;
                if (nVar != null) {
                    jSONObject = C18809c.m34905a(nVar);
                } else {
                    jSONObject = new JSONObject();
                }
                String str = cVar.f44153a;
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                bVar.mo74032a(str, jSONObject2);
                return;
            }
            C18494b.m34422b(this.f103696b, this);
        }

        C44481b(C44480a aVar, String str) {
            this.f103695a = aVar;
            this.f103696b = str;
        }
    }

    /* renamed from: a */
    private final ConcurrentHashMap<C44480a<IEventCenter.AbstractC45375b>, AbstractC18511d> m87161a(String str) {
        MethodCollector.m26663i(7796);
        ConcurrentHashMap<C44480a<IEventCenter.AbstractC45375b>, AbstractC18511d> concurrentHashMap = this.f103692c.get(str);
        if (concurrentHashMap == null) {
            synchronized (this) {
                try {
                    concurrentHashMap = this.f103692c.get(str);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        this.f103692c.put(str, concurrentHashMap);
                    }
                } finally {
                    MethodCollector.m26664o(7796);
                }
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private final List<Object> m87159a(JSONArray jSONArray, List<Object> list) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                m87160a((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                m87159a((JSONArray) obj, arrayList);
            } else {
                Object obj2 = jSONArray.get(i);
                C89219l.m154716b(obj2, "");
                list.add(obj2);
            }
        }
        return C89070n.m154590j(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter
    /* renamed from: b */
    public final boolean mo75481b(String str, IEventCenter.AbstractC45375b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        ConcurrentHashMap<C44480a<IEventCenter.AbstractC45375b>, AbstractC18511d> a = m87161a(str);
        Enumeration<C44480a<IEventCenter.AbstractC45375b>> keys = a.keys();
        C89219l.m154716b(keys, "");
        ArrayList<C44480a> list = Collections.list(keys);
        C89219l.m154716b(list, "");
        for (C44480a aVar : list) {
            if (C89219l.m154714a(aVar.get(), bVar)) {
                AbstractC18511d dVar = a.get(aVar);
                if (dVar != null) {
                    C89219l.m154716b(dVar, "");
                    C18494b.m34422b(str, dVar);
                }
                a.remove(aVar);
            }
        }
        m87162b();
        return true;
    }

    /* renamed from: a */
    private final Map<String, Object> m87160a(JSONObject jSONObject, Map<String, Object> map) {
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C89219l.m154716b(next, "");
                map.put(next, linkedHashMap);
                m87160a((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                C89219l.m154716b(next, "");
                map.put(next, arrayList);
                m87159a((JSONArray) obj, arrayList);
            } else {
                C89219l.m154716b(next, "");
                C89219l.m154716b(obj, "");
                map.put(next, obj);
            }
        }
        return C89041ag.m154429c(map);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter
    /* renamed from: a */
    public final void mo75479a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        try {
            C18494b.m34415a(new C18484a(str, System.currentTimeMillis(), C18822b.m34925a(m87160a(new JSONObject(str2), (Map<String, Object>) null))));
        } catch (Throwable th) {
            C22708a.m42802a(th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter
    /* renamed from: a */
    public final boolean mo75480a(String str, IEventCenter.AbstractC45375b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C44480a<IEventCenter.AbstractC45375b> aVar = new C44480a<>(str, bVar, this.f103693d);
        C44481b bVar2 = new C44481b(aVar, str);
        m87161a(str).put(aVar, bVar2);
        C18494b.m34417a(str, bVar2);
        m87162b();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter$a */
    public static final class C44480a<T> extends WeakReference<T> {

        /* renamed from: a */
        public final String f103694a;

        static {
            Covode.recordClassIndex(52828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44480a(String str, T t, ReferenceQueue<T> referenceQueue) {
            super(t, referenceQueue);
            C89219l.m154721d(str, "");
            C89219l.m154721d(referenceQueue, "");
            this.f103694a = str;
        }
    }
}
