package com.bytedance.ies.xbridge.platform.p1350a.p1351a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1290b.AbstractC18405a;
import com.bytedance.ies.xbridge.p1290b.AbstractC18408d;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.a.a.b */
public final class C18812b {

    /* renamed from: a */
    public static final C18812b f44604a = new C18812b();

    /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a */
    public static final class C18813a extends AbstractC16164e {

        /* renamed from: b */
        final /* synthetic */ C18742c f44605b;

        /* renamed from: c */
        final /* synthetic */ boolean f44606c = false;

        /* renamed from: d */
        final /* synthetic */ List f44607d;

        /* renamed from: e */
        final /* synthetic */ AbstractC18400b f44608e;

        /* renamed from: f */
        final /* synthetic */ C16248b f44609f;

        /* renamed from: g */
        private final AbstractC18400b f44610g;

        /* renamed from: h */
        private boolean f44611h;

        /* renamed from: i */
        private AbstractC16183k.EnumC16184a f44612i;

        static {
            Covode.recordClassIndex(21509);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
        /* renamed from: b */
        public final AbstractC16183k.EnumC16184a mo25723b() {
            return this.f44612i;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
        public final boolean bh_() {
            return this.f44611h;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
        /* renamed from: d */
        public final String mo25752d() {
            return this.f44610g.mo7341b();
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
        /* renamed from: a */
        public final void mo25721a() {
            super.mo25721a();
            this.f44610g.mo29431f();
        }

        /* renamed from: e */
        public final AbstractC16208i mo29823e() {
            return (AbstractC16208i) this.f38923a.mo25832c(AbstractC16208i.class);
        }

        /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a$b */
        public static final class C18816b implements AbstractC18405a {

            /* renamed from: a */
            final /* synthetic */ C18813a f44618a;

            static {
                Covode.recordClassIndex(21512);
            }

            @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18405a
            /* renamed from: a */
            public final String mo13407a() {
                C16238z a;
                String str;
                AbstractC16208i e = this.f44618a.mo29823e();
                if (e == null || (a = e.mo25762a()) == null || (str = a.f39033a) == null) {
                    return "";
                }
                return str;
            }

            C18816b(C18813a aVar) {
                this.f44618a = aVar;
            }
        }

        /* renamed from: f */
        public final EnumC18483e mo29824f() {
            EnumC16723b bVar;
            AbstractC16208i e = mo29823e();
            if (e == null || (bVar = e.mo25769b()) == null) {
                bVar = EnumC16723b.RN;
            }
            int i = C18818c.f44622b[bVar.ordinal()];
            if (i == 1) {
                return EnumC18483e.LYNX;
            }
            if (i == 2) {
                return EnumC18483e.RN;
            }
            if (i != 3) {
                return EnumC18483e.RN;
            }
            return EnumC18483e.WEB;
        }

        /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a$a */
        public static final class C18814a implements AbstractC18400b.AbstractC18404d {

            /* renamed from: a */
            final /* synthetic */ C18813a f44613a;

            static {
                Covode.recordClassIndex(21510);
            }

            C18814a(C18813a aVar) {
                this.f44613a = aVar;
            }

            @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18404d
            /* renamed from: a */
            public final void mo13406a(String str, AbstractC18754n nVar) {
                C89219l.m154719c(str, "");
                AbstractC16208i e = this.f44613a.mo29823e();
                if (e != null) {
                    e.onEvent(new AbstractC16191p(str, nVar) {
                        /* class com.bytedance.ies.xbridge.platform.p1350a.p1351a.C18812b.C18813a.C18814a.C188151 */

                        /* renamed from: a */
                        public final JSONObject f44614a;

                        /* renamed from: b */
                        final /* synthetic */ String f44615b;

                        /* renamed from: c */
                        final /* synthetic */ AbstractC18754n f44616c;

                        /* renamed from: d */
                        private final String f44617d;

                        static {
                            Covode.recordClassIndex(21511);
                        }

                        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                        /* renamed from: a */
                        public final String mo25699a() {
                            return this.f44617d;
                        }

                        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                        /* renamed from: b */
                        public final /* bridge */ /* synthetic */ Object mo25700b() {
                            return this.f44614a;
                        }

                        {
                            JSONObject jSONObject;
                            this.f44615b = r2;
                            this.f44616c = r3;
                            this.f44617d = r2;
                            if (r3 != null) {
                                jSONObject = C18809c.m34905a(r3);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            this.f44614a = jSONObject;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
        /* renamed from: a */
        public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
            C89219l.m154719c(aVar, "");
            this.f44612i = aVar;
        }

        /* renamed from: com.bytedance.ies.xbridge.platform.a.a.b$a$c */
        public static final class C18817c implements AbstractC18400b.AbstractC18402b {

            /* renamed from: a */
            final /* synthetic */ C18813a f44619a;

            /* renamed from: b */
            final /* synthetic */ AbstractC16183k.AbstractC16185b f44620b;

            static {
                Covode.recordClassIndex(21513);
            }

            @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18402b
            /* renamed from: a */
            public final void mo13405a(Map<String, Object> map) {
                int i;
                LinkedHashMap linkedHashMap;
                IHostLogDepend iHostLogDepend;
                C18465b bVar;
                String str = "";
                C89219l.m154719c(map, str);
                Object obj = map.get("code");
                C89391z zVar = null;
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                Object obj2 = map.get("msg");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str2 = (String) obj2;
                if (str2 != null) {
                    str = str2;
                }
                try {
                    Object obj3 = map.get("data");
                    if (!C89206ad.m154685g(obj3)) {
                        obj3 = null;
                    }
                    Object obj4 = (Map) obj3;
                    if (obj4 == null) {
                        obj4 = new LinkedHashMap();
                    }
                    linkedHashMap = C89379q.m157068constructorimpl(obj4);
                } catch (Throwable th) {
                    linkedHashMap = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (C89379q.m157073isFailureimpl(linkedHashMap)) {
                    linkedHashMap = linkedHashMap2;
                }
                if (i != 1) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("code", Integer.valueOf(i));
                    linkedHashMap3.put("error_message", str);
                    linkedHashMap3.put("method_name", this.f44619a.mo25752d());
                    linkedHashMap3.put("bridge_data", linkedHashMap);
                    linkedHashMap3.put("platform", this.f44619a.mo29824f().name());
                    AbstractC16183k.AbstractC16185b bVar2 = this.f44620b;
                    Object obj5 = map.get("data");
                    if (obj5 == null && (obj5 = C89041ag.m154415a()) == null) {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    bVar2.mo25703a(i, str, new JSONObject((Map) obj5));
                    try {
                        C18465b bVar3 = (C18465b) this.f44619a.f44605b.mo29769a(C18465b.class);
                        if (!((bVar3 == null || (iHostLogDepend = bVar3.f44099b) == null) && ((bVar = C18465b.f44096l) == null || (iHostLogDepend = bVar.f44099b) == null))) {
                            zVar = iHostLogDepend.reportJSBError(this.f44619a.f44605b, linkedHashMap3);
                        }
                        C89379q.m157068constructorimpl(zVar);
                    } catch (Throwable th2) {
                        C89379q.m157068constructorimpl(C89382r.m154941a(th2));
                    }
                } else {
                    this.f44620b.mo25704a(new JSONObject(map));
                }
            }

            C18817c(C18813a aVar, AbstractC16183k.AbstractC16185b bVar) {
                this.f44619a = aVar;
                this.f44620b = bVar;
            }
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
        /* renamed from: a */
        public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
            AbstractC18754n a;
            C89219l.m154719c(jSONObject, "");
            C89219l.m154719c(bVar, "");
            EnumC18483e f = mo29824f();
            if (this.f44606c) {
                C89219l.m154719c(f, "");
                AbstractC18408d dVar = C18819d.f44623a.get(f);
                if (dVar != null && dVar.mo29438a(f)) {
                    a = dVar.mo29437a(jSONObject);
                    if (a != null) {
                        this.f44610g.mo7340a(a, new C18817c(this, bVar), f);
                        return;
                    }
                    bVar.mo25702a(-3, "Unsupported platform type");
                }
            }
            Iterator it = this.f44607d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC18408d dVar2 = (AbstractC18408d) it.next();
                if (dVar2.mo29438a(f)) {
                    a = dVar2.mo29437a(jSONObject);
                    break;
                }
            }
            bVar.mo25702a(-3, "Unsupported platform type");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18813a(C18742c cVar, List list, AbstractC18400b bVar, C16248b bVar2, C16248b bVar3) {
            super(bVar3);
            AbstractC16183k.EnumC16184a aVar;
            this.f44605b = cVar;
            this.f44607d = list;
            this.f44608e = bVar;
            this.f44609f = bVar2;
            cVar.mo29770a(C18288a.class, bVar2.mo25832c(C18288a.class));
            cVar.mo29771b(AbstractC18400b.AbstractC18404d.class, new C18814a(this));
            cVar.mo29771b(AbstractC18405a.class, new C18816b(this));
            bVar.mo29430a(cVar);
            this.f44610g = bVar;
            int i = C18818c.f44621a[bVar.mo7346c().ordinal()];
            if (i == 1) {
                aVar = AbstractC16183k.EnumC16184a.PRIVATE;
            } else if (i == 2) {
                aVar = AbstractC16183k.EnumC16184a.PROTECT;
            } else if (i != 3) {
                aVar = AbstractC16183k.EnumC16184a.PRIVATE;
            } else {
                aVar = AbstractC16183k.EnumC16184a.PUBLIC;
            }
            this.f44612i = aVar;
        }
    }

    private C18812b() {
    }

    static {
        Covode.recordClassIndex(21508);
    }
}
