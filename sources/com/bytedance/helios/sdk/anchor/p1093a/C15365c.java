package com.bytedance.helios.sdk.anchor.p1093a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.p1087a.AbstractC15300c;
import com.bytedance.helios.api.p1087a.C15297a;
import com.bytedance.helios.api.p1087a.C15298b;
import com.bytedance.helios.api.p1088b.C15302a;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.anchor.AbstractC15369b;
import com.bytedance.helios.sdk.anchor.C15360a;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.anchor.a.c */
public final class C15365c implements AbstractC15369b {

    /* renamed from: b */
    public static final C15367b f37471b = new C15367b((byte) 0);

    /* renamed from: a */
    public final C0484a<String, RunnableC15366a> f37472a = new C0484a<>();

    /* renamed from: c */
    private final C0484a<String, Map<String, String>> f37473c = new C0484a<>();

    /* renamed from: d */
    private final Map<String, ResourceCheckModel> f37474d = new C0484a();

    /* renamed from: e */
    private final C15298b f37475e;

    static {
        Covode.recordClassIndex(17617);
    }

    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    public final String mo25107a() {
        return "AnchorTaskPlanB";
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.a.c$b */
    public static final class C15367b {
        static {
            Covode.recordClassIndex(17619);
        }

        private C15367b() {
        }

        public /* synthetic */ C15367b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m28266b() {
        for (T t : HeliosEnvImpl.INSTANCE.getResourceCheckSettings()) {
            C15484f.m28491a("AnchorTaskPlanB", "init: ".concat(String.valueOf(t)), (String) null, 12);
            this.f37474d.put(t.getCheckPage(), t);
            String checkPage = t.getCheckPage();
            for (T t2 : t.getResources()) {
                Map<String, String> map = this.f37473c.get(t2);
                if (map == null) {
                    map = new C0484a<>();
                }
                for (String str : t.getStopCheckLifeCycle()) {
                    map.put(checkPage, str);
                }
                this.f37473c.put(t2, map);
            }
        }
    }

    /* renamed from: com.bytedance.helios.sdk.anchor.a.c$a */
    public final class RunnableC15366a implements Runnable {

        /* renamed from: a */
        public final long f37476a;

        /* renamed from: b */
        public AbstractC15300c f37477b;

        /* renamed from: c */
        public String f37478c;

        /* renamed from: d */
        public int f37479d;

        /* renamed from: e */
        final /* synthetic */ C15365c f37480e;

        /* renamed from: f */
        private final int f37481f;

        /* renamed from: g */
        private final String f37482g;

        /* renamed from: h */
        private final int f37483h;

        /* renamed from: i */
        private final String f37484i;

        static {
            Covode.recordClassIndex(17618);
        }

        public final void run() {
            int i;
            MethodCollector.m26663i(6758);
            List<C15318n> holdingResources = this.f37477b.getHoldingResources();
            ArrayList arrayList = new ArrayList();
            for (T t : holdingResources) {
                T t2 = t;
                C15302a aVar = t2.f37349A;
                if (aVar != null) {
                    i = aVar.f37318a;
                } else {
                    i = 0;
                }
                if (i < this.f37481f && ((this.f37483h == 1 && C89219l.m154714a((Object) t2.f37364j, (Object) this.f37482g) && t2.f37365k == this.f37479d) || this.f37483h == 0)) {
                    arrayList.add(t);
                }
            }
            ArrayList<C15318n> arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                C15484f.m28491a("AnchorTaskPlanB", "run: no resource leak found: " + this.f37478c + " in " + this.f37484i, "w", 8);
                synchronized (this) {
                    try {
                        this.f37480e.f37472a.remove(this.f37478c);
                    } finally {
                        MethodCollector.m26664o(6758);
                    }
                }
                return;
            }
            for (C15318n nVar : arrayList2) {
                C15302a aVar2 = nVar.f37349A;
                if (aVar2 != null) {
                    aVar2.f37318a++;
                    int i2 = aVar2.f37318a;
                    C15484f.m28491a("AnchorTaskPlanB", "run: resource " + this.f37478c + " leak checked " + i2 + " times in " + this.f37484i, (String) null, 12);
                    if (i2 < this.f37481f) {
                        aVar2.f37319b = System.currentTimeMillis();
                        HandlerThreadC15486g.m28499b().postDelayed(this, this.f37476a);
                    } else {
                        nVar.f37374t = 4;
                        nVar.f37377w = true;
                        C15320o.m28228a(nVar, false);
                    }
                }
            }
            MethodCollector.m26664o(6758);
        }

        public RunnableC15366a(C15365c cVar, AbstractC15300c cVar2, String str, int i, ResourceCheckModel resourceCheckModel, int i2) {
            C89219l.m154719c(cVar2, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(resourceCheckModel, "");
            this.f37480e = cVar;
            this.f37477b = cVar2;
            this.f37478c = str;
            this.f37479d = i;
            this.f37476a = resourceCheckModel.getCheckTimeDelay();
            this.f37481f = resourceCheckModel.getMaxCheckTimes();
            this.f37482g = resourceCheckModel.getCheckPage();
            this.f37483h = resourceCheckModel.getCheckType();
            this.f37484i = C15297a.m28206a(i2);
        }
    }

    /* renamed from: a */
    private static String m28263a(C15360a aVar) {
        String str = aVar.f37462a;
        if (str == null) {
            return "null";
        }
        return str;
    }

    public C15365c(C15298b bVar) {
        C89219l.m154719c(bVar, "");
        this.f37475e = bVar;
    }

    /* renamed from: a */
    private final ResourceCheckModel m28262a(String str) {
        if (this.f37474d.isEmpty()) {
            m28266b();
        }
        return this.f37474d.get(str);
    }

    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    public final void mo25108a(C15360a aVar, int i) {
        String next;
        Map<String, String> map;
        C89219l.m154719c(aVar, "");
        ResourceCheckModel a = m28262a(m28263a(aVar));
        if (a == null) {
            C15297a.m28206a(i);
            return;
        }
        Iterator<String> it = a.getResources().iterator();
        while (it.hasNext() && (map = this.f37473c.get((next = it.next()))) != null && !map.isEmpty()) {
            String a2 = C15297a.m28206a(i);
            Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry<String, String> next2 = it2.next();
                    String key = next2.getKey();
                    String value = next2.getValue();
                    if (C89219l.m154714a((Object) key, (Object) m28263a(aVar)) && C89219l.m154714a((Object) value, (Object) a2)) {
                        C15484f.m28491a("AnchorTaskPlanB", "unScheduleIfNeeded: " + aVar + " in " + a2 + " for " + next, (String) null, 12);
                        RunnableC15366a aVar2 = this.f37472a.get(next);
                        if (aVar2 != null) {
                            HandlerThreadC15486g.m28499b().removeCallbacks(aVar2);
                        }
                        this.f37472a.remove(next);
                        return;
                    }
                }
            }
        }
        m28264a(a, aVar, i);
    }

    @Override // com.bytedance.helios.sdk.anchor.AbstractC15369b
    /* renamed from: a */
    public final void mo25109a(C15360a aVar, Integer num) {
        C89219l.m154719c(aVar, "");
        ResourceCheckModel a = m28262a(m28263a(aVar));
        if (a != null) {
            for (String str : a.getResources()) {
                RunnableC15366a aVar2 = this.f37472a.get(str);
                if (aVar2 != null) {
                    C15484f.m28491a("AnchorTaskPlanB", "unSchedule: " + aVar + " for " + str, (String) null, 12);
                    HandlerThreadC15486g.m28499b().removeCallbacks(aVar2);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28264a(ResourceCheckModel resourceCheckModel, C15360a aVar, int i) {
        if (resourceCheckModel.getCheckLifeCycle().contains(C15297a.m28206a(i))) {
            int checkType = resourceCheckModel.getCheckType();
            for (String str : resourceCheckModel.getResources()) {
                C15484f.m28491a("AnchorTaskPlanB", "schedule: " + aVar + " in " + C15297a.m28206a(i) + " for " + str, (String) null, 12);
                if (checkType == 1) {
                    m28265a(str, aVar.f37463b, i, resourceCheckModel);
                } else if (checkType == 0) {
                    String a = m28263a(aVar);
                    C15434f a2 = C15434f.m28386a();
                    C89219l.m154709a((Object) a2, "");
                    if (C89219l.m154714a((Object) a, (Object) a2.f37676e)) {
                        m28265a(str, 0, i, resourceCheckModel);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28265a(String str, int i, int i2, ResourceCheckModel resourceCheckModel) {
        MethodCollector.m26663i(7516);
        AbstractC15300c cVar = this.f37475e.mCheckerMap.get(str);
        if (cVar != null) {
            RunnableC15366a aVar = new RunnableC15366a(this, cVar, str, i, resourceCheckModel, i2);
            synchronized (this) {
                try {
                    this.f37472a.put(str, aVar);
                } finally {
                    MethodCollector.m26664o(7516);
                }
            }
            HandlerThreadC15486g.m28499b().postDelayed(aVar, aVar.f37476a);
        }
    }
}
