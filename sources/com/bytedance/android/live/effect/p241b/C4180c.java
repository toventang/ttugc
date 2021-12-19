package com.bytedance.android.live.effect.p241b;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.effect.api.p240a.AbstractC4150c;
import com.bytedance.android.live.effect.api.p240a.AbstractC4151d;
import com.bytedance.android.live.effect.api.p240a.AbstractC4156i;
import com.bytedance.android.live.effect.api.p240a.C4148a;
import com.bytedance.android.live.effect.api.p240a.C4163l;
import com.bytedance.android.live.effect.model.p246a.C4310a;
import com.bytedance.android.live.effect.model.p246a.C4311b;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.b.c */
public final class C4180c implements AbstractC4156i {

    /* renamed from: a */
    public static final AbstractC89244h f11630a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C4182b.f11644a);

    /* renamed from: b */
    public static final C4181a f11631b = new C4181a((byte) 0);

    /* renamed from: c */
    private String f11632c;

    /* renamed from: d */
    private String f11633d;

    /* renamed from: e */
    private C4163l f11634e;

    /* renamed from: f */
    private final List<AbstractC4151d> f11635f;

    /* renamed from: g */
    private final List<AbstractC4150c> f11636g;

    /* renamed from: h */
    private final List<C4310a> f11637h;

    /* renamed from: i */
    private final List<C4310a> f11638i;

    /* renamed from: j */
    private final List<C4310a> f11639j;

    /* renamed from: k */
    private final List<C4310a> f11640k;

    /* renamed from: l */
    private final Map<String, List<C11672a>> f11641l;

    /* renamed from: m */
    private final AbstractC89244h f11642m;

    /* renamed from: n */
    private final ArrayList<C4310a> f11643n;

    /* renamed from: f */
    private final C4185d m10235f() {
        return (C4185d) this.f11642m.getValue();
    }

    /* renamed from: com.bytedance.android.live.effect.b.c$a */
    public static final class C4181a {
        static {
            Covode.recordClassIndex(4751);
        }

        /* renamed from: a */
        public static C4180c m10258a() {
            return (C4180c) C4180c.f11630a.getValue();
        }

        private C4181a() {
        }

        public /* synthetic */ C4181a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: d */
    public final String mo9853d() {
        return this.f11632c;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: e */
    public final String mo9855e() {
        return this.f11633d;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9843a(AbstractC4151d dVar) {
        C89219l.m154721d(dVar, "");
        if (!this.f11635f.contains(dVar)) {
            this.f11635f.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final Map<String, Map<String, C11672a>> mo9841a() {
        List<C11672a> list;
        T t;
        HashMap hashMap = new HashMap();
        List<C4310a> list2 = this.f11637h;
        ArrayList<C4310a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (this.f11641l.containsKey(t3.f11847a) && t3.f11854h) {
                arrayList.add(t2);
            }
        }
        for (C4310a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f11847a)) {
                hashMap.put(aVar.f11847a, new HashMap());
            }
            Object obj = hashMap.get(aVar.f11847a);
            if (obj == null) {
                C89219l.m154715b();
            }
            Map map = (Map) obj;
            if (!map.containsKey(aVar.f11848b) && (list = this.f11641l.get(aVar.f11847a)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f27895c, (Object) aVar.f11848b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    String str = t4.f27895c;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    map.put(str, t4);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9846a(String str, C11672a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (!C89219l.m154714a(currentThread, mainLooper.getThread())) {
            C88391a.m153580a(C88392a.f200660a).mo142900a(new RunnableC4183c(this, str, aVar));
        } else {
            m10225a(this, str, aVar, true, false, 24);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: a */
    public final void mo9861a(String str, List<C11672a> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C4163l lVar = this.f11634e;
        if (lVar != null) {
            List list2 = lVar.f11594b;
            if (list2 == null) {
                list2 = new ArrayList();
            }
            if (list2.contains(str) && !this.f11639j.isEmpty()) {
                ArrayList<C11672a> arrayList = new ArrayList();
                for (T t : this.f11639j) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) t.f11848b, (Object) next.f27895c)) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                for (C11672a aVar : arrayList) {
                    m10234d(str, aVar);
                }
                List<C4310a> list3 = this.f11639j;
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list3) {
                    if (C89219l.m154714a((Object) t2.f11847a, (Object) str)) {
                        arrayList2.add(t2);
                    }
                }
                this.f11639j.removeAll(arrayList2);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: a */
    public final void mo9860a(String str, C11672a aVar, String str2, float f) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str2, "");
        m10227a(str, aVar, f, (Long) null);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: a */
    public final Float mo9859a(String str, String str2) {
        T t;
        T t2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Iterator<T> it = this.f11637h.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.f11848b, (Object) str)) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null) {
            return null;
        }
        Iterator<T> it2 = t3.f11853g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (C89219l.m154714a((Object) t2.f11856b, (Object) str2)) {
                break;
            }
        }
        T t4 = t2;
        if (t4 == null) {
            return null;
        }
        return t4.f11855a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0158, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0193, code lost:
        r2.add(r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m10230a(boolean r16) {
        /*
        // Method dump skipped, instructions count: 614
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4180c.m10230a(boolean):void");
    }

    /* renamed from: a */
    private static boolean m10231a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer num : list) {
            if (list2.contains(Integer.valueOf(num.intValue()))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9845a(String str) {
        C89219l.m154721d(str, "");
        List<C4310a> list = this.f11637h;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.f11847a, (Object) str)) {
                arrayList.add(t);
            }
        }
        ArrayList<C4310a> arrayList2 = arrayList;
        ArrayList<C11672a> arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (C4310a aVar : arrayList2) {
            arrayList3.add(m10223a(aVar));
        }
        for (C11672a aVar2 : arrayList3) {
            if (aVar2 != null) {
                m10233c(str, aVar2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072 A[RETURN] */
    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9862a(com.bytedance.android.livesdkapi.depend.model.C11672a r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4180c.mo9862a(com.bytedance.android.livesdkapi.depend.model.a):boolean");
    }

    /* renamed from: com.bytedance.android.live.effect.b.c$b */
    static final class C4182b extends AbstractC89220m implements AbstractC89171a<C4180c> {

        /* renamed from: a */
        public static final C4182b f11644a = new C4182b();

        static {
            Covode.recordClassIndex(4752);
        }

        C4182b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4180c invoke() {
            return new C4180c((byte) 0);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.c$c */
    static final class RunnableC4183c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4180c f11645a;

        /* renamed from: b */
        final /* synthetic */ String f11646b;

        /* renamed from: c */
        final /* synthetic */ C11672a f11647c;

        static {
            Covode.recordClassIndex(4753);
        }

        RunnableC4183c(C4180c cVar, String str, C11672a aVar) {
            this.f11645a = cVar;
            this.f11646b = str;
            this.f11647c = aVar;
        }

        public final void run() {
            C4180c.m10225a(this.f11645a, this.f11646b, this.f11647c, true, false, 24);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.c$d */
    static final class C4184d extends AbstractC89220m implements AbstractC89171a<C4185d> {

        /* renamed from: a */
        public static final C4184d f11648a = new C4184d();

        static {
            Covode.recordClassIndex(4754);
        }

        C4184d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4185d invoke() {
            Context e = C3966y.m9669e();
            C89219l.m154716b(e, "");
            return new C4185d(e);
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: c */
    public final void mo9851c() {
        this.f11643n.clear();
        this.f11638i.clear();
        m10230a(true);
    }

    static {
        Covode.recordClassIndex(4750);
    }

    private C4180c() {
        this.f11635f = new CopyOnWriteArrayList();
        this.f11636g = new ArrayList();
        this.f11637h = new ArrayList();
        this.f11638i = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f11639j = arrayList;
        this.f11640k = new ArrayList();
        this.f11641l = new HashMap();
        this.f11642m = C89250i.m154773a((AbstractC89171a) C4184d.f11648a);
        arrayList.addAll(m10235f().mo9906a());
        this.f11643n = new ArrayList<>();
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9848b() {
        AbstractC4149b bVar;
        AbstractC4149b bVar2;
        List list;
        if (this.f11634e != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f11637h) {
                if (!arrayList.contains(t.f11847a)) {
                    arrayList.add(t.f11847a);
                }
            }
            for (T t2 : this.f11639j) {
                if (!arrayList.contains(t2.f11847a)) {
                    this.f11637h.add(t2);
                }
            }
            this.f11639j.clear();
            List<C4310a> list2 = this.f11639j;
            List<C4310a> list3 = this.f11637h;
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : list3) {
                T t4 = t3;
                C4163l lVar = this.f11634e;
                if (lVar == null || (list = lVar.f11594b) == null) {
                    list = new ArrayList();
                }
                if (list.contains(t4.f11847a)) {
                    arrayList2.add(t3);
                }
            }
            list2.addAll(arrayList2);
            C4163l lVar2 = this.f11634e;
            if (!(lVar2 == null || lVar2.f11595c == null)) {
                try {
                    C4163l lVar3 = this.f11634e;
                    if (!(lVar3 == null || (bVar2 = lVar3.f11595c) == null)) {
                        bVar2.mo9083a(new String[0]);
                    }
                    C4163l lVar4 = this.f11634e;
                    if (!(lVar4 == null || (bVar = lVar4.f11595c) == null)) {
                        bVar.mo9078a();
                    }
                } catch (Throwable th) {
                    C3854a.m9458a("LiveComposerManagerB", th);
                }
            }
            this.f11637h.clear();
            this.f11641l.clear();
            m10235f().mo9907a(this.f11639j);
            this.f11635f.clear();
            this.f11636g.clear();
            this.f11638i.clear();
            this.f11643n.clear();
            this.f11634e = null;
        }
    }

    public /* synthetic */ C4180c(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: c */
    public final void mo9852c(String str) {
        this.f11632c = str;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9844a(C4163l lVar) {
        C89219l.m154721d(lVar, "");
        this.f11634e = lVar;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: d */
    public final void mo9854d(String str) {
        this.f11633d = str;
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9849b(AbstractC4150c cVar) {
        C89219l.m154721d(cVar, "");
        this.f11636g.remove(cVar);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: a */
    public final void mo9842a(AbstractC4150c cVar) {
        C89219l.m154721d(cVar, "");
        if (!this.f11636g.contains(cVar)) {
            this.f11636g.add(cVar);
        }
    }

    /* renamed from: a */
    private final C11672a m10223a(C4310a aVar) {
        List<C11672a> list = this.f11641l.get(aVar.f11847a);
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.f27895c, (Object) aVar.f11848b)) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* renamed from: b */
    private final void m10232b(List<C4310a> list) {
        AbstractC4149b bVar;
        float f;
        for (T t : list) {
            for (T t2 : t.f11853g) {
                C4163l lVar = this.f11634e;
                if (!(lVar == null || (bVar = lVar.f11595c) == null)) {
                    String str = t.f11849c;
                    String str2 = t2.f11856b;
                    Float f2 = t2.f11855a;
                    if (f2 != null) {
                        f = f2.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    bVar.mo9079a(str, str2, f);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final void mo9850b(AbstractC4151d dVar) {
        C89219l.m154721d(dVar, "");
        this.f11635f.remove(dVar);
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4152e
    /* renamed from: b */
    public final List<C11672a> mo9847b(String str) {
        List<C11672a> list;
        T t;
        float f;
        Float f2;
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        if (!this.f11641l.containsKey(str)) {
            return C89070n.m154590j(hashMap.values());
        }
        List<C4310a> list2 = this.f11637h;
        ArrayList<C4310a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (C89219l.m154714a((Object) t3.f11847a, (Object) str) && this.f11641l.containsKey(t3.f11847a) && t3.f11854h) {
                arrayList.add(t2);
            }
        }
        for (C4310a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f11848b) && (list = this.f11641l.get(str)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f27895c, (Object) aVar.f11848b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    hashMap.put(t4.f27895c, t4);
                    for (T t5 : t4.f27906n) {
                        C4311b bVar = (C4311b) C89070n.m154583g((List) aVar.f11853g);
                        if (bVar == null || (f2 = bVar.f11855a) == null) {
                            f = 0.0f;
                        } else {
                            f = f2.floatValue();
                        }
                        t5.f27925g = C4187e.m10267a((C11672a) t4, f);
                    }
                }
            }
        }
        return C89070n.m154590j(hashMap.values());
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: e */
    public final List<C11672a> mo9865e(String str) {
        List<C11672a> list;
        T t;
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        if (!this.f11641l.containsKey(str)) {
            return C89070n.m154590j(hashMap.values());
        }
        List<C4310a> list2 = this.f11637h;
        ArrayList<C4310a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (C89219l.m154714a((Object) t3.f11847a, (Object) str) && this.f11641l.containsKey(t3.f11847a)) {
                arrayList.add(t2);
            }
        }
        for (C4310a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f11848b) && (list = this.f11641l.get(str)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.f27895c, (Object) aVar.f11848b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    hashMap.put(t4.f27895c, t4);
                }
            }
        }
        return C89070n.m154590j(hashMap.values());
    }

    /* renamed from: a */
    private final void m10229a(List<C4310a> list) {
        AbstractC4149b bVar;
        AbstractC4149b bVar2;
        if (LiveEnableEffectNewEngineSetting.INSTANCE.getValue()) {
            String[] a = C4187e.m10269a(list, false);
            String[] a2 = C4187e.m10270a(this.f11641l, a);
            C4163l lVar = this.f11634e;
            if (lVar != null && (bVar2 = lVar.f11595c) != null) {
                bVar2.mo9086b(a, a2);
                return;
            }
            return;
        }
        C4163l lVar2 = this.f11634e;
        if (lVar2 != null && (bVar = lVar2.f11595c) != null) {
            bVar.mo9085b(C4187e.m10269a(list, false));
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: b */
    public final int mo9863b(String str, String str2) {
        AbstractC4149b bVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int[] iArr = new int[1];
        C4163l lVar = this.f11634e;
        if (!(lVar == null || (bVar = lVar.f11595c) == null)) {
            bVar.mo9080a(str, str2, iArr);
        }
        return iArr[0];
    }

    /* renamed from: c */
    private final void m10233c(String str, C11672a aVar) {
        T t;
        List list;
        if (this.f11634e != null) {
            Iterator<T> it = this.f11637h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f11848b, (Object) aVar.f27895c)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                this.f11637h.remove(t2);
                C4163l lVar = this.f11634e;
                if (lVar == null || (list = lVar.f11597e) == null) {
                    list = new ArrayList();
                }
                if (list.contains(t2.f11847a)) {
                    t2.f11854h = false;
                    this.f11637h.add(t2);
                }
                m10230a(false);
                Iterator<T> it2 = this.f11635f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo8787a(false, str, aVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static ArrayList<C4311b> m10224a(C11672a aVar, List<C4311b> list) {
        ArrayList<C4311b> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        List<C11672a.C11674b> list2 = aVar.f27906n;
        ArrayList<C11672a.C11674b> arrayList2 = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t3 = next;
                if (C89219l.m154714a((Object) t3.f11856b, (Object) t2.f27921c) && t3.f11855a != null) {
                    if (next != null) {
                    }
                }
            }
            arrayList2.add(t);
        }
        for (C11672a.C11674b bVar : arrayList2) {
            Iterator<C4311b> it2 = arrayList.iterator();
            C89219l.m154716b(it2, "");
            while (it2.hasNext()) {
                if (C89219l.m154714a((Object) it2.next().f11856b, (Object) bVar.f27921c)) {
                    it2.remove();
                }
            }
            C4311b bVar2 = new C4311b(bVar.f27921c);
            bVar2.f11855a = Float.valueOf(C4187e.m10263a(bVar, bVar.f27920b));
            arrayList.add(bVar2);
        }
        ArrayList<String> arrayList3 = aVar.f27908p;
        ArrayList<String> arrayList4 = new ArrayList();
        for (T t4 : arrayList3) {
            Iterator<T> it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next2 = it3.next();
                if (C89219l.m154714a((Object) next2.f11856b, (Object) t4)) {
                    if (next2 != null) {
                    }
                }
            }
            arrayList4.add(t4);
        }
        for (String str : arrayList4) {
            arrayList.add(new C4311b(str));
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m10234d(String str, C11672a aVar) {
        T t;
        float f;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        if (C4278b.m10378a(aVar)) {
            List<C11672a> list = aVar.f27907o;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m10234d(str, it.next());
                }
                return;
            }
            return;
        }
        Iterator<T> it2 = this.f11639j.iterator();
        while (true) {
            t = null;
            if (!it2.hasNext()) {
                break;
            }
            t = it2.next();
            T t2 = t;
            if (!C4284g.m10392a(aVar)) {
                if (C89219l.m154714a((Object) t2.f11848b, (Object) aVar.f27895c)) {
                    this.f11640k.add(t2);
                }
            } else if (C89219l.m154714a((Object) t2.f11848b, (Object) aVar.f27895c)) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            Iterator<T> it3 = t3.f11853g.iterator();
            while (it3.hasNext()) {
                aVar.f27908p.add(it3.next().f11856b);
            }
            Iterator<T> it4 = t3.f11853g.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                if (next.f11855a != null) {
                    if (next != null) {
                        m10228a(str, aVar, false, t3.f11854h, Long.valueOf(t3.f11851e));
                        List<C4311b> list2 = t3.f11853g;
                        ArrayList<C4311b> arrayList = new ArrayList();
                        for (T t4 : list2) {
                            if (t4.f11855a != null) {
                                arrayList.add(t4);
                            }
                        }
                        for (C4311b bVar : arrayList) {
                            Float f2 = bVar.f11855a;
                            if (f2 != null) {
                                f = f2.floatValue();
                            } else {
                                f = 0.0f;
                            }
                            m10227a(str, aVar, f, Long.valueOf(t3.f11851e));
                        }
                        return;
                    }
                }
            }
            m10228a(str, aVar, t3.f11854h, t3.f11854h, Long.valueOf(t3.f11851e));
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4156i
    /* renamed from: b */
    public final void mo9864b(String str, C11672a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        m10233c(str, aVar);
    }

    /* renamed from: a */
    private final void m10226a(String str, C4310a aVar, C11672a aVar2) {
        float f;
        for (C4311b bVar : aVar.f11853g) {
            if (bVar.f11855a != null) {
                Iterator<T> it = aVar2.f27906n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next.f27921c, (Object) bVar.f11856b)) {
                        if (next != null) {
                            Float f2 = bVar.f11855a;
                            if (f2 != null) {
                                f = f2.floatValue();
                            } else {
                                f = 0.0f;
                            }
                            m10227a(str, aVar2, f, Long.valueOf(aVar.f11851e));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r5 = false;
        m10225a(r12, r13, r14, false, false, 16);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10227a(java.lang.String r13, com.bytedance.android.livesdkapi.depend.model.C11672a r14, float r15, java.lang.Long r16) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4180c.m10227a(java.lang.String, com.bytedance.android.livesdkapi.depend.model.a, float, java.lang.Long):void");
    }

    /* renamed from: a */
    private final void m10228a(String str, C11672a aVar, boolean z, boolean z2, Long l) {
        T t;
        T t2;
        long currentTimeMillis;
        long currentTimeMillis2;
        boolean z3;
        List<String> list;
        C4163l lVar;
        List<C4148a> list2;
        if (this.f11634e != null) {
            if (!(!aVar.f27910r.isEmpty() || (lVar = this.f11634e) == null || (list2 = lVar.f11593a) == null)) {
                ArrayList<C4148a> arrayList = new ArrayList();
                for (T t3 : list2) {
                    if (C89219l.m154714a((Object) t3.f11590b, (Object) str)) {
                        arrayList.add(t3);
                    }
                }
                for (C4148a aVar2 : arrayList) {
                    aVar.f27910r.addAll(aVar2.f11589a);
                }
            }
            if (aVar.f27911s == null) {
                C4163l lVar2 = this.f11634e;
                if (lVar2 == null || (list = lVar2.f11596d) == null) {
                    z3 = false;
                } else {
                    z3 = list.contains(str);
                }
                aVar.f27911s = Boolean.valueOf(z3);
            }
            if (!this.f11641l.containsKey(str)) {
                this.f11641l.put(str, new ArrayList());
            }
            List<C11672a> list3 = this.f11641l.get(str);
            if (list3 != null) {
                list3.remove(aVar);
                list3.add(aVar);
            }
            Iterator<T> it = this.f11637h.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (C89219l.m154714a((Object) t2.f11848b, (Object) aVar.f27895c)) {
                    break;
                }
            }
            T t4 = t2;
            if (t4 == null) {
                String str2 = aVar.f27895c;
                String str3 = aVar.f27899g;
                Boolean bool = aVar.f27911s;
                if (bool == null) {
                    C89219l.m154715b();
                }
                boolean booleanValue = bool.booleanValue();
                if (l != null) {
                    currentTimeMillis = l.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                C4310a aVar3 = new C4310a(str, str2, str3, booleanValue, currentTimeMillis);
                aVar3.f11854h = z2;
                aVar3.f11852f.addAll(aVar.f27910r);
                ArrayList<C4311b> a = m10224a(aVar, aVar3.f11853g);
                aVar3.f11853g.clear();
                aVar3.f11853g.addAll(a);
                this.f11637h.add(aVar3);
            } else if (t4.f11854h != z2 || l != null) {
                boolean z4 = t4.f11854h;
                this.f11637h.remove(t4);
                ArrayList<C4311b> a2 = m10224a(aVar, t4.f11853g);
                t4.f11853g.clear();
                t4.f11853g.addAll(a2);
                if (l != null) {
                    currentTimeMillis2 = l.longValue();
                } else {
                    currentTimeMillis2 = System.currentTimeMillis();
                }
                t4.f11851e = currentTimeMillis2;
                t4.f11854h = z2;
                this.f11637h.add(t4);
                if (z4 == z2) {
                    return;
                }
            } else {
                return;
            }
            Iterator<T> it2 = this.f11640k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (C89219l.m154714a((Object) next.f11848b, (Object) aVar.f27895c)) {
                    t = next;
                    break;
                }
            }
            T t5 = t;
            if (t5 != null) {
                m10226a(str, t5, aVar);
                this.f11640k.remove(t5);
            }
            if (z) {
                m10230a(false);
            }
            Iterator<T> it3 = this.f11635f.iterator();
            while (it3.hasNext()) {
                it3.next().mo8787a(true, str, aVar);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m10225a(C4180c cVar, String str, C11672a aVar, boolean z, boolean z2, int i) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        cVar.m10228a(str, aVar, z, z2, null);
    }
}
