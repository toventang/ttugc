package com.bytedance.hox;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15494a;
import com.bytedance.hox.p1106a.AbstractC15495b;
import com.bytedance.hox.p1106a.AbstractC15496c;
import com.bytedance.hox.p1106a.AbstractC15497d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

public final class Hox extends AbstractC1174ac {

    /* renamed from: c */
    public static final C15490a f37750c = new C15490a((byte) 0);

    /* renamed from: a */
    public final HashMap<Class<?>, AbstractC15501d> f37751a = new HashMap<>();

    /* renamed from: b */
    public boolean f37752b;

    /* renamed from: d */
    private ActivityC0945e f37753d;

    /* renamed from: e */
    private AbstractC15498b f37754e;

    /* renamed from: f */
    private final HashMap<String, AbstractC15501d> f37755f = new HashMap<>();

    /* renamed from: g */
    private final HashMap<String, AbstractC15501d> f37756g = new HashMap<>();

    /* renamed from: h */
    private final Hox$activityLifeObserver$1 f37757h;

    /* renamed from: i */
    private final C15492b f37758i;

    static {
        Covode.recordClassIndex(17745);
    }

    /* renamed from: com.bytedance.hox.Hox$a */
    public static final class C15490a {
        static {
            Covode.recordClassIndex(17746);
        }

        private C15490a() {
        }

        /* renamed from: com.bytedance.hox.Hox$a$a */
        public static final class C15491a implements C1175ad.AbstractC1177b {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f37759a;

            static {
                Covode.recordClassIndex(17747);
            }

            C15491a(ActivityC0945e eVar) {
                this.f37759a = eVar;
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154719c(cls, "");
                return new Hox(this.f37759a);
            }
        }

        public /* synthetic */ C15490a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Hox m28529a(ActivityC0945e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC1174ac a = new C1175ad(eVar, new C15491a(eVar)).mo3983a(Hox.class);
            C89219l.m154709a((Object) a, "");
            return (Hox) a;
        }
    }

    /* renamed from: a */
    public final AbstractC15501d mo25204a() {
        AbstractC15498b bVar = this.f37754e;
        if (bVar == null) {
            return null;
        }
        return m28508a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        ActivityC0945e eVar = this.f37753d;
        if (eVar != null) {
            AbstractC1196i lifecycle = eVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo4013b(this.f37757h);
            }
            AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.mo3554a(this.f37758i);
            }
        }
    }

    /* renamed from: com.bytedance.hox.Hox$b */
    public static final class C15492b extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ Hox f37760a;

        static {
            Covode.recordClassIndex(17749);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C15492b(Hox hox) {
            this.f37760a = hox;
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentDestroyed(AbstractC0952i iVar, Fragment fragment) {
            AbstractC15501d dVar;
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentDestroyed(iVar, fragment);
            if ((fragment instanceof AbstractC15496c) && (dVar = this.f37760a.f37751a.get(fragment.getClass())) != null) {
                this.f37760a.mo25212b(dVar.mo25232d(), (AbstractC15496c) fragment);
            }
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentCreated(AbstractC0952i iVar, Fragment fragment, Bundle bundle) {
            AbstractC15501d dVar;
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentCreated(iVar, fragment, bundle);
            if ((fragment instanceof AbstractC15496c) && (dVar = this.f37760a.f37751a.get(fragment.getClass())) != null) {
                if (dVar instanceof HoxFragmentNode) {
                    C89219l.m154719c(fragment, "");
                    ((HoxFragmentNode) dVar).f37764a = fragment;
                } else if (dVar instanceof HoxFragmentGroup) {
                    C89219l.m154719c(fragment, "");
                    ((HoxFragmentGroup) dVar).f37762a = fragment;
                }
                this.f37760a.mo25209a(dVar.mo25232d(), (AbstractC15496c) fragment);
            }
        }
    }

    /* renamed from: a */
    private static AbstractC15501d m28508a(AbstractC15498b bVar) {
        while (bVar.f37769c instanceof AbstractC15498b) {
            AbstractC15501d dVar = bVar.f37769c;
            if (dVar != null) {
                bVar = (AbstractC15498b) dVar;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return bVar.f37769c;
    }

    /* renamed from: d */
    public final String mo25216d(String str) {
        AbstractC15501d c;
        AbstractC15498b bVar;
        String d;
        if (str == null || (c = mo25214c(str)) == null || (bVar = c.f37771e) == null || (d = bVar.mo25232d()) == null) {
            return "";
        }
        return d;
    }

    /* renamed from: e */
    public final int mo25218e(String str) {
        C89219l.m154719c(str, "");
        AbstractC15501d c = mo25214c(str);
        if (c == null || c.f37771e == null) {
            return -1;
        }
        AbstractC15498b bVar = c.f37771e;
        if (bVar == null) {
            C89219l.m154707a();
        }
        return bVar.f37770d.indexOf(c);
    }

    /* renamed from: f */
    public final String mo25219f(String str) {
        AbstractC15501d dVar;
        String d;
        C89219l.m154719c(str, "");
        AbstractC15501d c = mo25214c(str);
        if (!(c instanceof AbstractC15498b) || (dVar = ((AbstractC15498b) c).f37769c) == null || (d = dVar.mo25232d()) == null) {
            return "";
        }
        return d;
    }

    /* renamed from: b */
    private final void m28511b(AbstractC15498b bVar) {
        for (T t : bVar.f37770d) {
            this.f37755f.put(t.mo25232d(), t);
            Class<? extends Fragment> f = t.mo25234f();
            if (f != null) {
                this.f37751a.put(f, t);
            }
            if (t instanceof AbstractC15498b) {
                m28511b((AbstractC15498b) t);
            }
        }
    }

    /* renamed from: a */
    public final Class<?> mo25205a(String str) {
        C89219l.m154719c(str, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null) {
            return c.mo25234f();
        }
        return null;
    }

    /* renamed from: c */
    public final AbstractC15501d mo25214c(String str) {
        if (this.f37755f.containsKey(str)) {
            return this.f37755f.get(str);
        }
        AbstractC15498b bVar = this.f37754e;
        if (bVar == null) {
            return null;
        }
        this.f37755f.put(bVar.mo25232d(), this.f37754e);
        AbstractC15498b bVar2 = this.f37754e;
        if (bVar2 == null) {
            C89219l.m154707a();
        }
        m28511b(bVar2);
        return this.f37755f.get(str);
    }

    /* renamed from: g */
    public final <T extends Fragment> T mo25220g(String str) {
        C89219l.m154719c(str, "");
        AbstractC15501d c = mo25214c(str);
        if (c instanceof HoxFragmentNode) {
            T t = (T) ((HoxFragmentNode) c).f37764a;
            if (!(t instanceof Fragment)) {
                return null;
            }
            return t;
        } else if (!(c instanceof HoxFragmentGroup)) {
            return null;
        } else {
            T t2 = (T) ((HoxFragmentGroup) c).f37762a;
            if (!(t2 instanceof Fragment)) {
                return null;
            }
            return t2;
        }
    }

    public Hox(ActivityC0945e eVar) {
        Hox$activityLifeObserver$1 hox$activityLifeObserver$1 = new Hox$activityLifeObserver$1(this);
        this.f37757h = hox$activityLifeObserver$1;
        C15492b bVar = new C15492b(this);
        this.f37758i = bVar;
        this.f37753d = eVar;
        if (eVar == null) {
            C89219l.m154707a();
        }
        eVar.getLifecycle().mo4012a(hox$activityLifeObserver$1);
        ActivityC0945e eVar2 = this.f37753d;
        if (eVar2 == null) {
            C89219l.m154707a();
        }
        eVar2.getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) bVar, true);
    }

    /* renamed from: b */
    public final boolean mo25213b(String str) {
        LinkedList<AbstractC15501d> linkedList;
        C89219l.m154719c(str, "");
        AbstractC15501d a = mo25204a();
        if (a == null || (linkedList = a.f37772f) == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().mo25232d(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo25217d(String str, Bundle bundle) {
        String d;
        String str2 = "";
        C89219l.m154719c(str, str2);
        C89219l.m154719c(bundle, str2);
        AbstractC15501d c = mo25214c(str);
        if (c != null) {
            AbstractC15498b bVar = c.f37771e;
            if (!(bVar == null || (d = bVar.mo25232d()) == null)) {
                str2 = d;
            }
            if (!bundle.containsKey(str2)) {
                bundle.putBoolean(str2, true);
            }
            Iterator<T> it = c.f37773g.iterator();
            while (it.hasNext()) {
                it.next().mo25224b(bundle);
            }
        }
    }

    /* renamed from: a */
    private final AbstractC15501d m28509a(String str, String str2) {
        LinkedList<AbstractC15501d> linkedList;
        LinkedList<AbstractC15501d> linkedList2;
        AbstractC15501d c = mo25214c(str);
        if (c == null || (linkedList = c.f37772f) == null) {
            linkedList = new LinkedList<>();
        }
        AbstractC15501d c2 = mo25214c(str2);
        if (c2 == null || (linkedList2 = c2.f37772f) == null) {
            linkedList2 = new LinkedList<>();
        }
        Iterator<AbstractC15501d> it = linkedList.iterator();
        C89219l.m154709a((Object) it, "");
        Iterator<AbstractC15501d> it2 = linkedList2.iterator();
        C89219l.m154709a((Object) it2, "");
        AbstractC15501d dVar = null;
        while (it.hasNext() && it2.hasNext()) {
            AbstractC15501d next = it.next();
            C89219l.m154709a((Object) next, "");
            AbstractC15501d dVar2 = next;
            AbstractC15501d next2 = it2.next();
            C89219l.m154709a((Object) next2, "");
            if (!C89219l.m154714a(dVar2, next2)) {
                break;
            }
            dVar = dVar2;
        }
        if (dVar == null) {
            C89219l.m154707a();
        }
        return dVar;
    }

    /* renamed from: c */
    public final void mo25215c(String str, Bundle bundle) {
        String d;
        String str2 = "";
        C89219l.m154719c(str, str2);
        C89219l.m154719c(bundle, str2);
        AbstractC15501d c = mo25214c(str);
        if (c != null) {
            AbstractC15498b bVar = c.f37771e;
            if (!(bVar == null || (d = bVar.mo25232d()) == null)) {
                str2 = d;
            }
            if (!bundle.containsKey(str2)) {
                bundle.putBoolean(str2, true);
            }
            Iterator<T> it = c.f37773g.iterator();
            while (it.hasNext()) {
                it.next().mo25223a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo25211b(String str, Bundle bundle) {
        AbstractC15498b bVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(bundle, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null && (bVar = c.f37771e) != null) {
            AbstractC15501d a = mo25204a();
            if (a == null) {
                if (bVar.f37769c != null) {
                    AbstractC15501d dVar = bVar.f37769c;
                    if (dVar == null) {
                        C89219l.m154707a();
                    }
                    if (C89219l.m154714a((Object) dVar.mo25232d(), (Object) str)) {
                        return;
                    }
                }
                bVar.mo25227b(str, bundle);
                if (bVar.mo25230c()) {
                    bVar.mo25229c(str, bundle);
                    return;
                }
                return;
            }
            m28510a(a.mo25232d(), str, bundle);
        }
    }

    /* renamed from: a */
    public final void mo25206a(ActivityC0945e eVar, AbstractC15498b bVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(bVar, "");
        this.f37753d = eVar;
        this.f37754e = bVar;
    }

    /* renamed from: b */
    public final void mo25212b(String str, AbstractC15496c cVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(cVar, "");
            List<AbstractC15497d> list = c.f37773g;
            if (list != null) {
                C89206ad.m154680b(list).remove(cVar);
                List<AbstractC15494a> list2 = c.f37774h;
                if (list2 != null) {
                    C89206ad.m154680b(list2).remove(cVar);
                    List<AbstractC15495b> list3 = c.f37775i;
                    if (list3 != null) {
                        C89206ad.m154680b(list3).remove(cVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public final void mo25208a(String str, Bundle bundle) {
        AbstractC15498b bVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(bundle, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null && (bVar = c.f37771e) != null && (bVar instanceof AbstractC15498b)) {
            if (!bundle.containsKey(bVar.mo25232d())) {
                bundle.putBoolean(bVar.mo25232d(), true);
            }
            bVar.mo25229c(str, bundle);
        }
    }

    /* renamed from: a */
    public final void mo25209a(String str, AbstractC15496c cVar) {
        List<AbstractC15497d> list;
        C89219l.m154719c(str, "");
        C89219l.m154719c(cVar, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null) {
            c.mo25231b(cVar);
            AbstractC15498b bVar = c.f37771e;
            if (bVar != null && bVar.f37768b && C89219l.m154714a(bVar.f37769c, c) && (list = c.f37773g) != null) {
                for (T t : list) {
                    Bundle bundle = new Bundle();
                    if (!bundle.containsKey(bVar.mo25232d())) {
                        bundle.putBoolean(bVar.mo25232d(), true);
                    }
                    t.mo25223a(bundle);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo25210b(String str, int i, Bundle bundle) {
        String str2 = "";
        C89219l.m154719c(str, str2);
        C89219l.m154719c(bundle, str2);
        C89219l.m154719c(str, str2);
        AbstractC15501d c = mo25214c(str);
        if ((c instanceof AbstractC15498b) && i >= 0) {
            AbstractC15498b bVar = (AbstractC15498b) c;
            if (i < bVar.f37770d.size()) {
                str2 = bVar.f37770d.get(i).mo25232d();
            }
        }
        mo25211b(str2, bundle);
    }

    /* renamed from: a */
    private final void m28510a(String str, String str2, Bundle bundle) {
        if (!C89219l.m154714a((Object) str, (Object) str2)) {
            String str3 = str + '_' + str2;
            if (!this.f37756g.containsKey(str3)) {
                this.f37756g.put(str3, m28509a(str, str2));
            }
            AbstractC15501d dVar = this.f37756g.get(str3);
            AbstractC15501d c = mo25214c(str2);
            if (c == null) {
                C89219l.m154707a();
            }
            Iterator<AbstractC15501d> it = c.f37772f.iterator();
            C89219l.m154709a((Object) it, "");
            if (!(dVar instanceof AbstractC15498b)) {
                dVar = null;
            }
            AbstractC15498b bVar = (AbstractC15498b) dVar;
            while (it.hasNext() && bVar != null) {
                AbstractC15501d next = it.next();
                C89219l.m154709a((Object) next, "");
                AbstractC15501d dVar2 = next;
                if (C89219l.m154714a(bVar, dVar2.f37771e)) {
                    if (!C89219l.m154714a(bVar.f37769c, dVar2)) {
                        if (!bundle.containsKey(bVar.mo25232d())) {
                            bundle.putBoolean(bVar.mo25232d(), true);
                        }
                        bVar.mo25227b(dVar2.mo25232d(), bundle);
                    }
                    if (!(dVar2 instanceof AbstractC15498b)) {
                        dVar2 = null;
                    }
                    bVar = (AbstractC15498b) dVar2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25207a(String str, int i, Bundle bundle) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bundle, "");
        AbstractC15501d c = mo25214c(str);
        if (c != null && (c instanceof AbstractC15498b)) {
            if (!bundle.containsKey(c.mo25232d())) {
                bundle.putBoolean(c.mo25232d(), true);
            }
            AbstractC15498b bVar = (AbstractC15498b) c;
            bVar.mo25229c(bVar.f37770d.get(i).mo25232d(), bundle);
        }
    }
}
