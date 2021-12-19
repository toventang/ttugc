package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18306aa;
import com.bytedance.ies.web.jsbridge2.C18309ac;
import com.bytedance.ies.web.jsbridge2.C18315ad;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.h */
public final class C18339h implements C18315ad.AbstractC18319a {

    /* renamed from: a */
    public final C18343i f43864a;

    /* renamed from: b */
    public final C18308ab f43865b;

    /* renamed from: c */
    public final Set<AbstractC18334e> f43866c = new HashSet();

    /* renamed from: d */
    public final AbstractC18329b f43867d;

    /* renamed from: e */
    private final Map<String, AbstractC18332c> f43868e = new HashMap();

    /* renamed from: f */
    private final Map<String, AbstractC18334e.AbstractC18336b> f43869f = new HashMap();

    /* renamed from: g */
    private final List<C18362v> f43870g = new ArrayList();

    /* renamed from: h */
    private final Set<AbstractC18356p> f43871h;

    /* renamed from: i */
    private final boolean f43872i;

    /* renamed from: j */
    private final boolean f43873j;

    static {
        Covode.recordClassIndex(21011);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> void mo29362a(String str, T t) {
        this.f43867d.mo29337a(str, (Object) t);
    }

    @Override // com.bytedance.ies.web.jsbridge2.C18315ad.AbstractC18319a
    /* renamed from: b */
    public final void mo29327b() {
        ArrayList arrayList = new ArrayList();
        LinkedList<C18362v> linkedList = new LinkedList(this.f43870g);
        this.f43870g.clear();
        for (C18362v vVar : linkedList) {
            this.f43867d.mo29339b(vVar);
            arrayList.add(vVar.toString());
        }
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43766o, (Object) arrayList).mo29302a(TimeLineEvent.C18303b.f43743aq, C18364w.f43929f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29358a() {
        for (AbstractC18334e eVar : this.f43866c) {
            eVar.terminateActual();
        }
        this.f43866c.clear();
        this.f43868e.clear();
        this.f43869f.clear();
        this.f43865b.mo29307a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.h$a */
    public static final class C18342a {

        /* renamed from: a */
        boolean f43879a;

        /* renamed from: b */
        String f43880b;

        /* renamed from: c */
        JSONObject f43881c;

        static {
            Covode.recordClassIndex(21014);
        }

        private C18342a(JSONObject jSONObject) {
            this.f43879a = true;
            this.f43881c = jSONObject;
        }

        /* synthetic */ C18342a(JSONObject jSONObject, byte b) {
            this(jSONObject);
        }

        private C18342a(boolean z, String str) {
            this.f43879a = z;
            this.f43880b = str;
        }

        /* synthetic */ C18342a(boolean z, String str, byte b) {
            this(z, str);
        }
    }

    /* renamed from: a */
    private static Type[] m34107a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29359a(String str, AbstractC18333d dVar) {
        dVar.name = str;
        this.f43868e.put(str, dVar);
    }

    /* renamed from: a */
    private Object m34105a(String str, AbstractC18332c cVar) {
        return this.f43864a.mo29363a(str, m34107a(cVar)[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C18342a mo29357a(final C18362v vVar, C18338g gVar) {
        AbstractC18332c cVar = this.f43868e.get(vVar.f43915d);
        try {
            String str = gVar.f43860b;
            if (TextUtils.isEmpty(str) || TimeLineEvent.C18303b.f43708X.equals(str)) {
                String a = this.f43867d.mo16233a();
                if (!TextUtils.isEmpty(a)) {
                    gVar.f43860b = a;
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43711a, a).mo29302a(TimeLineEvent.C18303b.f43722aK, vVar.f43920i);
                }
            }
            if (cVar != null) {
                EnumC18323ah a2 = m34104a(gVar.f43860b, cVar, vVar.f43920i);
                gVar.f43863e = a2;
                if (a2 == null) {
                    String str2 = TimeLineEvent.C18303b.f43706V;
                    if (TextUtils.isEmpty(gVar.f43860b) || TimeLineEvent.C18303b.f43708X.equals(gVar.f43860b)) {
                        str2 = TimeLineEvent.C18303b.f43709Y;
                    }
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43706V).mo29302a(TimeLineEvent.C18303b.f43748av, vVar.f43920i);
                    m34106a(gVar.f43860b, vVar.f43915d, 1, str2, vVar.f43920i);
                    throw new C18369y(-1);
                }
                new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43726aO, vVar.f43920i);
                if (cVar instanceof AbstractC18337f) {
                    AbstractC18337f fVar = (AbstractC18337f) cVar;
                    Object invoke = fVar.invoke(m34105a(vVar.f43916e, (AbstractC18332c) fVar), gVar);
                    JSONObject a3 = C18324ai.m34072a(invoke);
                    if (a3 != null) {
                        return new C18342a(a3, (byte) 0);
                    }
                    return new C18342a(true, C18324ai.m34070a(this.f43864a, invoke), (byte) 0);
                } else if (cVar instanceof AbstractC18333d) {
                    ((AbstractC18333d) cVar).mo29345a(vVar, new C18306aa(vVar.f43915d, a2, new C18306aa.AbstractC18307a() {
                        /* class com.bytedance.ies.web.jsbridge2.C18339h.C183412 */

                        static {
                            Covode.recordClassIndex(21013);
                        }

                        @Override // com.bytedance.ies.web.jsbridge2.C18306aa.AbstractC18307a
                        /* renamed from: a */
                        public final void mo29305a(String str) {
                            if (str != null && C18339h.this.f43867d != null) {
                                C18339h.this.f43867d.mo29340b(str, vVar);
                            }
                        }
                    }));
                    return new C18342a(false, "", (byte) 0);
                }
            }
            AbstractC18334e.AbstractC18336b bVar = this.f43869f.get(vVar.f43915d);
            if (bVar != null) {
                final AbstractC18334e a4 = bVar.mo13316a();
                a4.name = vVar.f43915d;
                EnumC18323ah a5 = m34104a(gVar.f43860b, a4, vVar.f43920i);
                gVar.f43863e = a5;
                if (a5 == null) {
                    String str3 = TimeLineEvent.C18303b.f43707W;
                    if (TextUtils.isEmpty(gVar.f43860b) || TimeLineEvent.C18303b.f43708X.equals(gVar.f43860b)) {
                        str3 = TimeLineEvent.C18303b.f43710Z;
                    }
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43707W).mo29302a(TimeLineEvent.C18303b.f43748av, vVar.f43920i);
                    m34106a(gVar.f43860b, vVar.f43915d, 1, str3, vVar.f43920i);
                    a4.onDestroy();
                    throw new C18369y(-1);
                }
                new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43726aO, vVar.f43920i);
                this.f43866c.add(a4);
                a4.invokeActual(m34105a(vVar.f43916e, (AbstractC18332c) a4), gVar, new AbstractC18334e.AbstractC18335a() {
                    /* class com.bytedance.ies.web.jsbridge2.C18339h.C183401 */

                    static {
                        Covode.recordClassIndex(21012);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18335a
                    /* renamed from: a */
                    public final void mo29354a(Throwable th) {
                        if (C18339h.this.f43867d != null) {
                            C18339h.this.f43867d.mo29340b(C18324ai.m34071a(th), vVar);
                            C18339h.this.f43866c.remove(a4);
                        }
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18335a
                    /* renamed from: a */
                    public final void mo29353a(Object obj) {
                        if (C18339h.this.f43867d != null) {
                            JSONObject a = C18324ai.m34072a(obj);
                            if (a != null) {
                                C18339h.this.f43867d.mo29341b(a, vVar);
                            } else {
                                C18339h.this.f43867d.mo29340b(C18324ai.m34070a(C18339h.this.f43864a, obj), vVar);
                            }
                            C18339h.this.f43866c.remove(a4);
                        }
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18335a
                    /* renamed from: a */
                    public final void mo29355a(JSONObject jSONObject) {
                        if (C18339h.this.f43867d != null) {
                            C18339h.this.f43867d.mo29341b(jSONObject, vVar);
                            C18339h.this.f43866c.remove(a4);
                        }
                    }
                });
                return new C18342a(false, "", (byte) 0);
            }
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43701Q).mo29302a(TimeLineEvent.C18303b.f43748av, vVar.f43920i);
            m34106a(gVar.f43860b, vVar.f43915d, 2, TimeLineEvent.C18303b.f43701Q, vVar.f43920i);
            return null;
        } catch (C18309ac.C18312a e) {
            C18344j.m34124a((Throwable) e);
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage()).mo29302a(TimeLineEvent.C18303b.f43749aw, vVar.f43920i);
            this.f43870g.add(vVar);
            return new C18342a(false, "", (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29360a(String str, AbstractC18334e.AbstractC18336b bVar) {
        this.f43869f.put(str, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29361a(String str, AbstractC18337f<?, ?> fVar) {
        fVar.name = str;
        this.f43868e.put(str, fVar);
    }

    C18339h(C18345k kVar, AbstractC18329b bVar, C18309ac acVar) {
        boolean z;
        this.f43867d = bVar;
        this.f43864a = kVar.f43889e;
        C18308ab abVar = new C18308ab(acVar, kVar.f43897m, kVar.f43898n);
        this.f43865b = abVar;
        if (abVar.f43786b != null) {
            abVar.f43786b.f43810c.add(this);
        }
        abVar.f43787c = kVar.f43901q;
        abVar.f43788d = kVar.f43902r;
        this.f43871h = kVar.f43894j;
        this.f43872i = kVar.f43893i;
        this.f43873j = kVar.f43900p;
        TimeLineEvent.C18302a aVar = new TimeLineEvent.C18302a();
        String str = TimeLineEvent.C18303b.f43762k;
        if (acVar != null) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo29301a(str, Boolean.valueOf(z)).mo29302a(TimeLineEvent.C18303b.f43742ap, kVar.f43903s);
    }

    /* renamed from: a */
    private EnumC18323ah m34104a(String str, AbstractC18332c cVar, List<TimeLineEvent> list) {
        if (!this.f43873j) {
            return this.f43865b.mo29306a(this.f43872i, str, cVar, list);
        }
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43711a, str).mo29301a(TimeLineEvent.C18303b.f43774w, cVar.getName()).mo29301a(TimeLineEvent.C18303b.f43775x, cVar.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43776y, cVar.getPermissionGroup()).mo29301a(TimeLineEvent.C18303b.f43773v, (Object) true).mo29301a(TimeLineEvent.C18303b.f43777z, EnumC18323ah.PRIVATE.toString()).mo29302a(TimeLineEvent.C18303b.f43750ax, list);
        return EnumC18323ah.PRIVATE;
    }

    /* renamed from: a */
    private void m34106a(String str, String str2, int i, String str3, List<TimeLineEvent> list) {
        for (AbstractC18356p pVar : this.f43871h) {
            pVar.mo13320a(str, str2, i, str3, new C18326ak(C18364w.f43929f, this.f43867d.f43851m, list));
        }
    }
}
