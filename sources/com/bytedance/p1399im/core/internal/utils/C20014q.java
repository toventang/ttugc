package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.C19738a;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19901n;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.AbstractC19668q;
import com.bytedance.p1399im.core.p1408d.AbstractC19669r;
import com.bytedance.p1399im.core.p1408d.AbstractC19670s;
import com.bytedance.p1399im.core.p1408d.AbstractC19674v;
import com.bytedance.p1399im.core.p1408d.AbstractC19675w;
import com.bytedance.p1399im.core.p1408d.AbstractC19676x;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.bytedance.p1399im.core.p1408d.C19610bf;
import com.bytedance.p1399im.core.p1408d.C19618bg;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1413f.C19682a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.internal.utils.q */
public class C20014q {

    /* renamed from: i */
    public static boolean f47553i;

    /* renamed from: j */
    private static C20014q f47554j;

    /* renamed from: a */
    public AbstractC19674v f47555a;

    /* renamed from: b */
    public AbstractC19669r f47556b;

    /* renamed from: c */
    public AbstractC19670s f47557c;

    /* renamed from: d */
    public Map<String, List<AbstractC19669r>> f47558d = new ConcurrentHashMap();

    /* renamed from: e */
    public Map<String, List<AbstractC19668q>> f47559e = new ConcurrentHashMap();

    /* renamed from: f */
    public Set<AbstractC19675w> f47560f = new CopyOnWriteArraySet();

    /* renamed from: g */
    public Set<AbstractC19676x> f47561g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public Set<Object> f47562h = new CopyOnWriteArraySet();

    /* renamed from: k */
    private Map<String, List<AbstractC19674v>> f47563k = new ConcurrentHashMap();

    /* renamed from: l */
    private Set<Object> f47564l = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.internal.utils.q$a */
    public interface AbstractC20039a<T> {
        static {
            Covode.recordClassIndex(22884);
        }

        /* renamed from: a */
        void mo31914a(T t);
    }

    static {
        Covode.recordClassIndex(22859);
    }

    /* renamed from: a */
    public final void mo31897a(String str, AbstractC19674v vVar) {
        List<AbstractC19674v> list = this.f47563k.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(vVar)) {
            list.add(vVar);
        }
        this.f47563k.put(str, list);
    }

    /* renamed from: a */
    public final void mo31895a(final C19638h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            mo31907b(hVar.getConversationId(), new AbstractC20039a<AbstractC19669r>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200151 */

                static {
                    Covode.recordClassIndex(22860);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                    rVar.mo28010b(hVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31896a(final C19638h hVar, final int i) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            mo31907b(hVar.getConversationId(), new AbstractC20039a<AbstractC19669r>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2001812 */

                static {
                    Covode.recordClassIndex(22863);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                    rVar.mo28002a(hVar, i);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31899a(final String str, final List<C19537ah> list) {
        if (!TextUtils.isEmpty(str)) {
            mo31907b(str, new AbstractC20039a<AbstractC19669r>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002821 */

                static {
                    Covode.recordClassIndex(22873);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                    rVar.mo28005a(str, list);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31901a(List<C19538ai> list, final int i, final C19593ar arVar) {
        if (!(list == null || list.isEmpty())) {
            final ArrayList arrayList = new ArrayList();
            for (C19538ai aiVar : list) {
                if (aiVar != null && aiVar.getSvrStatus() == 0) {
                    arrayList.add(aiVar);
                }
            }
            if (!arrayList.isEmpty()) {
                mo31898a(list.get(0).getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                    /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200367 */

                    static {
                        Covode.recordClassIndex(22881);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                        vVar.mo27795a(arrayList, i, arVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo31900a(List<C19538ai> list) {
        mo31902a(list, new HashMap());
    }

    /* renamed from: a */
    public final void mo31902a(final List<C19538ai> list, final Map<String, Map<String, String>> map) {
        if (list != null && !list.isEmpty()) {
            mo31898a(list.get(0).getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2001711 */

                static {
                    Covode.recordClassIndex(22862);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27797a(list, map);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31898a(String str, AbstractC20039a<AbstractC19674v> aVar) {
        List<AbstractC19674v> list = this.f47563k.get(str);
        if (list != null) {
            for (AbstractC19674v vVar : list) {
                aVar.mo31914a(vVar);
            }
        }
        AbstractC19674v vVar2 = this.f47555a;
        if (vVar2 != null) {
            aVar.mo31914a(vVar2);
        }
    }

    /* renamed from: b */
    public final void mo31903b() {
        Iterator<Object> it = this.f47564l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    public final void mo31910c() {
        Iterator<Object> it = this.f47564l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private C20014q() {
    }

    /* renamed from: a */
    public static C20014q m37816a() {
        MethodCollector.m26663i(10957);
        if (f47554j == null) {
            synchronized (C20014q.class) {
                try {
                    if (f47554j == null) {
                        f47554j = new C20014q();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10957);
                    throw th;
                }
            }
        }
        C20014q qVar = f47554j;
        MethodCollector.m26664o(10957);
        return qVar;
    }

    /* renamed from: a */
    private void m37817a(AbstractC20039a<AbstractC19670s> aVar) {
        AbstractC19670s sVar = this.f47557c;
        if (sVar != null) {
            aVar.mo31914a(sVar);
        }
    }

    /* renamed from: a */
    public static void m37818a(boolean z) {
        if (z) {
            C19610bf.m36633b();
            C19618bg.m36649a();
        }
    }

    /* renamed from: b */
    public final void mo31905b(final C19638h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            mo31907b(hVar.getConversationId(), new AbstractC20039a<AbstractC19669r>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002418 */

                static {
                    Covode.recordClassIndex(22869);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                    rVar.mo28001a(hVar);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo31911c(final C19638h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            mo31907b(hVar.getConversationId(), new AbstractC20039a<AbstractC19669r>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002519 */

                static {
                    Covode.recordClassIndex(22870);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* synthetic */ void mo31914a(AbstractC19669r rVar) {
                    rVar.mo28017d(hVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31889a(int i) {
        C19512f.m36457b("imsdk", "handleInitMessageEnd:".concat(String.valueOf(i)), (Throwable) null);
        C19483d.m36365a();
        C19786a.f46975k.add(Integer.valueOf(i));
        if (C19996e.m37757b() == C19786a.f46975k.size()) {
            C19512f.m36457b("imsdk", "all inbox message init end", (Throwable) null);
            f47553i = true;
        }
        if (!C19786a.m37251k(i)) {
            mo31904b(i);
        }
        C19483d.m36365a().mo31145f();
    }

    /* renamed from: b */
    public final void mo31904b(int i) {
        C19512f.m36457b("imsdk", "onInitEnd:".concat(String.valueOf(i)), (Throwable) null);
        C19483d.m36365a();
        C19786a.f46976l.add(Integer.valueOf(i));
        if (C19996e.m37757b() == C19786a.f46976l.size() && !C19483d.m36365a().f46157b.mo27974o()) {
            C19512f.m36457b("imsdk", "all inbox init end", (Throwable) null);
            if (C19738a.m36947m()) {
                C19682a.m36781e();
            } else {
                new C19901n(new AbstractC19479b<Void>() {
                    /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002317 */

                    static {
                        Covode.recordClassIndex(22868);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        C19682a.m36781e();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(Void r1) {
                        C19682a.m36781e();
                    }
                }).mo31782c();
            }
        }
    }

    /* renamed from: a */
    public final void mo31893a(final C19538ai aiVar) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            mo31898a(aiVar.getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200378 */

                static {
                    Covode.recordClassIndex(22882);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27792a(aiVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo31909b(final List<C19537ah> list) {
        if (list != null && !list.isEmpty()) {
            m37817a(new AbstractC20039a<AbstractC19670s>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2002115 */

                static {
                    Covode.recordClassIndex(22866);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19670s sVar) {
                    sVar.mo31626a(list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo31908b(String str, final List<C19538ai> list) {
        if (!TextUtils.isEmpty(str)) {
            mo31898a(str, new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200389 */

                static {
                    Covode.recordClassIndex(22883);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27798a(list, true);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo31913c(String str, final List<C19538ai> list) {
        if (!TextUtils.isEmpty(str)) {
            mo31898a(str, new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2001610 */

                static {
                    Covode.recordClassIndex(22861);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27799b(list, true);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo31912c(String str, AbstractC20039a<AbstractC19668q> aVar) {
        List<AbstractC19668q> list = this.f47559e.get(str);
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                AbstractC19668q qVar = list.get(i);
                if (qVar != null) {
                    aVar.mo31914a(qVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo31906b(String str, AbstractC19674v vVar) {
        List<AbstractC19674v> list = this.f47563k.get(str);
        if (list != null) {
            list.remove(vVar);
            this.f47563k.put(str, list);
        }
    }

    /* renamed from: a */
    public final void mo31892a(final int i, final C19587an anVar) {
        if (anVar != null && !TextUtils.isEmpty(anVar.getConversationId())) {
            mo31898a(anVar.getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C2001913 */

                static {
                    Covode.recordClassIndex(22864);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27791a(i, anVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo31907b(String str, AbstractC20039a<AbstractC19669r> aVar) {
        List<AbstractC19669r> list = this.f47558d.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                aVar.mo31914a(list.get(i));
            }
        }
        AbstractC19669r rVar = this.f47556b;
        if (rVar != null) {
            aVar.mo31914a(rVar);
        }
    }

    /* renamed from: a */
    public final void mo31894a(final C19538ai aiVar, final boolean z) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            mo31898a(aiVar.getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200345 */

                static {
                    Covode.recordClassIndex(22879);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27794a(aiVar, z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo31890a(int i, int i2, C19538ai aiVar) {
        for (AbstractC19676x xVar : this.f47561g) {
            if (xVar != null) {
                xVar.mo31308a(i, i2, aiVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo31891a(final int i, final C19538ai aiVar, final C19600ay ayVar) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            mo31898a(aiVar.getConversationId(), new AbstractC20039a<AbstractC19674v>() {
                /* class com.bytedance.p1399im.core.internal.utils.C20014q.C200334 */

                static {
                    Covode.recordClassIndex(22878);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.utils.C20014q.AbstractC20039a
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31914a(AbstractC19674v vVar) {
                    vVar.mo27790a(i, aiVar, ayVar);
                }
            });
        }
    }
}
