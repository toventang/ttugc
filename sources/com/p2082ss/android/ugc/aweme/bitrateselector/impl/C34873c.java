package com.p2082ss.android.ugc.aweme.bitrateselector.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35466a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.bitrateselector.impl.c */
public final class C34873c extends C81978f {

    /* renamed from: f */
    private final AbstractC81981g f82323f;

    /* renamed from: g */
    private final Map<Integer, AbstractC81981g> f82324g;

    static {
        Covode.recordClassIndex(41882);
    }

    /* renamed from: com.ss.android.ugc.aweme.bitrateselector.impl.c$a */
    public static class C34874a extends C81978f.C81979a {
        static {
            Covode.recordClassIndex(41883);
        }

        @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f.C81979a, com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81969a.AbstractC81970a
        /* renamed from: a */
        public final AbstractC81981g mo61745a() {
            C34873c cVar = new C34873c(this.f183444a, new C81978f.C81979a(this.f183444a).mo127143a(this.f183445b).mo127144b(this.f183446c).mo127142a(this.f183447d).mo61745a());
            cVar.mo117465a(this.f183445b);
            cVar.mo117466b(this.f183446c);
            cVar.mo117464a(this.f183447d);
            return cVar;
        }

        public C34874a(AbstractC81965d dVar) {
            super(dVar);
        }
    }

    /* renamed from: b */
    private static int m71236b(AbstractC81962a aVar) {
        if (aVar == null) {
            return -1;
        }
        return C35466a.m72527a(Double.valueOf(aVar.mo61720a()), Double.valueOf(aVar.mo61721b()), Double.valueOf(aVar.mo61722c()), Double.valueOf(aVar.mo61723d()), Double.valueOf(aVar.mo61724e()));
    }

    protected C34873c(AbstractC81965d dVar, AbstractC81981g gVar) {
        super(dVar);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f82324g = concurrentHashMap;
        this.f82323f = gVar;
        concurrentHashMap.put(Integer.valueOf(m71236b(this.f183443d)), gVar);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f, com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final C81967f mo61744a(List<? extends AbstractC81964c> list, Map<String, Object> map) {
        Object obj = map.get("KEY_AUTO_BITRATE_SET");
        if (!(obj instanceof AbstractC81962a)) {
            return this.f82323f.mo61744a(list, map);
        }
        AbstractC81962a aVar = (AbstractC81962a) obj;
        AbstractC81981g gVar = this.f82324g.get(Integer.valueOf(m71236b(aVar)));
        if (gVar == null) {
            gVar = new C81978f.C81979a(this.f183440a).mo127142a(aVar).mo127144b(this.f183442c).mo127143a(this.f183441b).mo61745a();
            this.f82324g.put(Integer.valueOf(m71236b(aVar)), gVar);
        }
        return gVar.mo61744a(list, map);
    }
}
