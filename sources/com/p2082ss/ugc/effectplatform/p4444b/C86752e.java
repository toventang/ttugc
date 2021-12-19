package com.p2082ss.ugc.effectplatform.p4444b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.AbstractC86744d;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a;
import com.p2082ss.ugc.effectplatform.p4449f.C86781a;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.p4454k.AbstractC86823c;
import com.p2082ss.ugc.effectplatform.p4454k.C86822b;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import com.p2082ss.ugc.effectplatform.util.C86999m;
import com.p2082ss.ugc.effectplatform.util.C87005s;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.b.e */
public final class C86752e extends C86749c {

    /* renamed from: c */
    public static final C87991a<AbstractC86823c> f195643c = new C87991a<>(null);

    /* renamed from: d */
    public static C87991a<String> f195644d = new C87991a<>(null);

    /* renamed from: e */
    public static C87991a<List<String>> f195645e = new C87991a<>(null);

    /* renamed from: f */
    public static final C86753a f195646f = new C86753a((byte) 0);

    /* renamed from: i */
    private static final AbstractC86744d f195647i = new C86754b();

    /* renamed from: g */
    private final C86695b f195648g;

    /* renamed from: h */
    private final C86687a f195649h;

    /* renamed from: com.ss.ugc.effectplatform.b.e$a */
    public static final class C86753a {
        static {
            Covode.recordClassIndex(102452);
        }

        private C86753a() {
        }

        public /* synthetic */ C86753a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(102451);
    }

    /* renamed from: com.ss.ugc.effectplatform.b.e$b */
    public static final class C86754b implements AbstractC86744d {

        /* renamed from: a */
        private final List<String> f195650a = C89070n.m154522b("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");

        /* renamed from: b */
        private final List<String> f195651b = C89070n.m154522b("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

        static {
            Covode.recordClassIndex(102453);
        }

        C86754b() {
        }

        /* renamed from: b */
        private static boolean m150303b(String str) {
            C89219l.m154719c(str, "");
            C88060b.m153135a("EffectDiskLruCache", "cleaneffect: isCountry:" + str + " now:" + C86752e.f195644d);
            if (C87007u.m150697a(str) || !C89219l.m154714a((Object) str, (Object) C86752e.f195644d.f199870a)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.ugc.effectplatform.p4444b.p4445a.AbstractC86744d
        /* renamed from: a */
        public final boolean mo140000a(String str) {
            C89219l.m154719c(str, "");
            if (C87007u.m150697a(str)) {
                return false;
            }
            C88060b.m153135a("EffectDiskLruCache", "cleaneffect: allowlist：".concat(String.valueOf(str)));
            V v = C86752e.f195643c.f199870a;
            if (v != null) {
                String b = v.mo140057b(str, "");
                if (m150303b("BR") && this.f195650a.contains(b)) {
                    C88060b.m153135a("EffectDiskLruCache", "cleaneffect: allowlist：BR, key: ".concat(String.valueOf(str)));
                    return true;
                } else if (!m150303b("RU") || !this.f195651b.contains(b)) {
                    V v2 = C86752e.f195645e.f199870a;
                    if (v2 != null && v2.contains(str)) {
                        C88060b.m153135a("EffectDiskLruCache", "cleaneffect: allowlist：draft, key: ".concat(String.valueOf(str)));
                        return true;
                    }
                } else {
                    C88060b.m153135a("EffectDiskLruCache", "cleaneffect: allowlist：RU, key: ".concat(String.valueOf(str)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.p4444b.C86749c, com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f
    /* renamed from: e */
    public final void mo140012e() {
        super.mo140012e();
        C87991a<AbstractC86823c> aVar = f195643c;
        V v = aVar.f199870a;
        if (v != null) {
            v.mo140055a();
        }
        String str = "effectid_map";
        if (!C87007u.m150697a(C86999m.m150683a(this.f195649h))) {
            str = C86999m.m150683a(this.f195649h) + C88045d.f199951a + str;
        }
        aVar.f199870a = (V) C86822b.m150392a(str, this.f195649h.f195435C);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86752e(C86687a aVar) {
        super(aVar.f195453i, 0, 0, aVar.f195441I, f195647i, 6);
        C89219l.m154719c(aVar, "");
        this.f195649h = aVar;
        String str = "effectid_map";
        f195643c.f199870a = (V) C86822b.m150392a(!C87007u.m150697a(C86999m.m150683a(aVar)) ? C86999m.m150683a(aVar) + C88045d.f199951a + str : str, aVar.f195435C);
        f195644d.f199870a = (V) aVar.f195454j;
        f195645e.f199870a = (V) aVar.f195434B;
        this.f195648g = aVar.f195461q;
    }

    /* renamed from: a */
    public final boolean mo140017a(String str, Effect effect) {
        String a;
        boolean z;
        ArrayList arrayList;
        Integer num;
        C89219l.m154719c(str, "");
        C89219l.m154719c(effect, "");
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null || (a = C86994k.m150670a(effect.getUnzipPath(), "_tmp")) == null) {
            return false;
        }
        try {
            C88045d.m153119g(a);
            V v = this.f195649h.f195464t.f199870a;
            if (v == null) {
                z = C88045d.m153112b(str, a);
            } else if (v.mo139931a() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                V v2 = this.f195649h.f195463s.f199870a;
                if (v2 != null) {
                    C86802b.m150350a((AbstractC86801a) v2, false, this.f195649h, effect, "unzip failed!");
                }
                C86994k.m150676c(a);
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = C87005s.m150695a(a) + "effect_platform_children.tag";
            try {
                List<String> b = C88045d.m153109b(a);
                if (b != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) b, 10));
                    Iterator<T> it = b.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C89361p.m154899a((String) it.next(), (CharSequence) a));
                    }
                    arrayList = arrayList2;
                    if (arrayList != null) {
                        String a2 = C89070n.m154551a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63);
                        EnumC88043b bVar = EnumC88043b.Utf8;
                        C89219l.m154719c(str2, "");
                        C89219l.m154719c(a2, "");
                        C89219l.m154719c(bVar, "");
                        C88045d.m153098a(str2, a2, bVar);
                    }
                } else {
                    arrayList = null;
                }
                StringBuilder append = new StringBuilder("write effect: ").append(effect.getEffect_id()).append(" children count: ");
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                C88060b.m153135a("writeEffect", append.append(num).append(" time cost: ").append(System.currentTimeMillis() - currentTimeMillis).append(" ms").toString());
            } catch (Exception e) {
                C88060b.m153136a("writeEffect", "write effect: " + effect.getEffect_id() + " children tag file failed!", e);
                C88045d.m153119g(str2);
            }
            boolean a3 = C86994k.m150672a(a, unzipPath, true);
            if (!a3) {
                V v3 = this.f195649h.f195463s.f199870a;
                if (v3 != null) {
                    C86802b.m150350a((AbstractC86801a) v3, false, this.f195649h, effect, "unzip failed!");
                }
                C86994k.m150676c(a);
                return a3;
            }
            String d = C88045d.m153116d(unzipPath);
            if (d != null) {
                C86735a c = mo140008c();
                if (c != null) {
                    c.mo139978a(C86735a.C86736a.m150258a(d));
                }
                mo140011d(effect.getId() + ".zip");
                V v4 = f195643c.f199870a;
                if (v4 != null) {
                    v4.mo140056a(effect.getId(), effect.getEffect_id());
                }
            }
            V v5 = this.f195649h.f195463s.f199870a;
            if (v5 != null) {
                C86802b.m150346a(v5, this.f195649h, effect);
            }
            return a3;
        } catch (Exception e2) {
            C88060b.m153136a("EffectDiskLruCache", "fetch effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " unzip failed!", e2);
            C86994k.m150676c(a);
            String d2 = C88045d.m153116d(unzipPath);
            if (d2 != null) {
                mo140011d(d2);
            }
            C86994k.m150676c(unzipPath);
            V v6 = this.f195649h.f195463s.f199870a;
            if (v6 != null) {
                C86802b.m150350a((AbstractC86801a) v6, false, this.f195649h, effect, e2.getMessage());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public final String mo140016a(Effect effect, C88044c cVar, String str, long j, AbstractC89183m<? super Integer, ? super Long, C89391z> mVar) {
        V v;
        C89219l.m154719c(effect, "");
        C89219l.m154719c(cVar, "");
        String a = C86735a.C86736a.m150258a(effect.getId() + ".zip");
        try {
            C89378p<String, Boolean> a2 = mo140006a(a, cVar, str, j, mVar);
            if (a2.getSecond().booleanValue() && (v = f195643c.f199870a) != null) {
                v.mo140056a(effect.getId(), effect.getEffect_id());
            }
            C88060b.m153135a("EffectDiskLruCache", "effect " + effect.getEffect_id() + ", name: " + effect.getName() + ", key: " + a + " end in disklrucache, result: " + a2.getSecond().booleanValue());
            return a2.getFirst();
        } catch (Exception e) {
            C88060b.m153136a("EffectDiskLruCache", "fetch effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " key: " + a + " write to disk failed!", e);
            if (!(e instanceof C86781a)) {
                mo140011d(a);
            }
            throw e;
        }
    }
}
