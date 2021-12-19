package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p012a.p013a.p015b.C0181a;
import androidx.p012a.p013a.p015b.C0182b;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: androidx.lifecycle.n */
public class C1205n extends AbstractC1196i {

    /* renamed from: b */
    private C0181a<AbstractC1203l, C1206a> f3988b;

    /* renamed from: c */
    private AbstractC1196i.EnumC1199b f3989c;

    /* renamed from: d */
    private final WeakReference<AbstractC1204m> f3990d;

    /* renamed from: e */
    private int f3991e;

    /* renamed from: f */
    private boolean f3992f;

    /* renamed from: g */
    private boolean f3993g;

    /* renamed from: h */
    private ArrayList<AbstractC1196i.EnumC1199b> f3994h;

    /* renamed from: i */
    private final boolean f3995i;

    static {
        Covode.recordClassIndex(1312);
    }

    @Override // androidx.lifecycle.AbstractC1196i
    /* renamed from: a */
    public AbstractC1196i.EnumC1199b mo4011a() {
        return this.f3989c;
    }

    /* renamed from: c */
    private void m3901c() {
        ArrayList<AbstractC1196i.EnumC1199b> arrayList = this.f3994h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private boolean m3899b() {
        if (this.f3988b.f480e == 0) {
            return true;
        }
        AbstractC1196i.EnumC1199b bVar = this.f3988b.f477b.getValue().f3996a;
        AbstractC1196i.EnumC1199b bVar2 = this.f3988b.f478c.getValue().f3996a;
        if (bVar == bVar2 && this.f3989c == bVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m3903d() {
        AbstractC1204m mVar = this.f3990d.get();
        if (mVar != null) {
            while (!m3899b()) {
                this.f3993g = false;
                if (this.f3989c.compareTo((Enum) this.f3988b.f477b.getValue().f3996a) < 0) {
                    m3898b(mVar);
                }
                C0182b.C0185c<K, V> cVar = this.f3988b.f478c;
                if (!this.f3993g && cVar != null && this.f3989c.compareTo((Enum) cVar.getValue().f3996a) > 0) {
                    m3896a(mVar);
                }
            }
            this.f3993g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public C1205n(AbstractC1204m mVar) {
        this(mVar, true);
    }

    /* renamed from: d */
    private void m3904d(AbstractC1196i.EnumC1199b bVar) {
        this.f3994h.add(bVar);
    }

    /* renamed from: b */
    public final void mo4018b(AbstractC1196i.EnumC1199b bVar) {
        m3897a("setCurrentState");
        m3902c(bVar);
    }

    /* renamed from: c */
    private void m3902c(AbstractC1196i.EnumC1199b bVar) {
        if (this.f3989c != bVar) {
            this.f3989c = bVar;
            if (this.f3992f || this.f3991e != 0) {
                this.f3993g = true;
                return;
            }
            this.f3992f = true;
            m3903d();
            this.f3992f = false;
        }
    }

    /* renamed from: a */
    public final void mo4016a(AbstractC1196i.EnumC1198a aVar) {
        m3897a("handleLifecycleEvent");
        m3902c(aVar.getTargetState());
    }

    @Override // androidx.lifecycle.AbstractC1196i
    /* renamed from: b */
    public void mo4013b(AbstractC1203l lVar) {
        m3897a("removeObserver");
        this.f3988b.mo344b(lVar);
    }

    /* renamed from: a */
    private void m3897a(String str) {
        if (this.f3995i && !C0175a.m581a().f469a.mo338b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: c */
    private AbstractC1196i.EnumC1199b mo96565c(AbstractC1203l lVar) {
        AbstractC1196i.EnumC1199b bVar;
        C0182b.C0185c<K, V> cVar;
        C0181a<AbstractC1203l, C1206a> aVar = this.f3988b;
        AbstractC1196i.EnumC1199b bVar2 = null;
        if (!aVar.mo345c(lVar) || (cVar = aVar.f476a.get(lVar).f484d) == null) {
            bVar = null;
        } else {
            bVar = cVar.getValue().f3996a;
        }
        if (!this.f3994h.isEmpty()) {
            ArrayList<AbstractC1196i.EnumC1199b> arrayList = this.f3994h;
            bVar2 = arrayList.get(arrayList.size() - 1);
        }
        return m3895a(m3895a(this.f3989c, bVar), bVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.a.a.b.a<androidx.lifecycle.l, androidx.lifecycle.n$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m3896a(AbstractC1204m mVar) {
        C0182b<K, V>.C0186d a = this.f3988b.mo346a();
        while (a.hasNext() && !this.f3993g) {
            Map.Entry entry = (Map.Entry) a.next();
            C1206a aVar = (C1206a) entry.getValue();
            while (aVar.f3996a.compareTo((Enum) this.f3989c) < 0 && !this.f3993g && this.f3988b.mo345c(entry.getKey())) {
                m3904d(aVar.f3996a);
                AbstractC1196i.EnumC1198a upFrom = AbstractC1196i.EnumC1198a.upFrom(aVar.f3996a);
                if (upFrom != null) {
                    aVar.mo4019a(mVar, upFrom);
                    m3901c();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3996a);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: androidx.a.a.b.a<androidx.lifecycle.l, androidx.lifecycle.n$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m3898b(AbstractC1204m mVar) {
        C0181a<AbstractC1203l, C1206a> aVar = this.f3988b;
        C0182b.C0184b bVar = new C0182b.C0184b(aVar.f478c, aVar.f477b);
        aVar.f479d.put(bVar, false);
        while (bVar.hasNext() && !this.f3993g) {
            Map.Entry entry = (Map.Entry) bVar.next();
            C1206a aVar2 = (C1206a) entry.getValue();
            while (aVar2.f3996a.compareTo((Enum) this.f3989c) > 0 && !this.f3993g && this.f3988b.mo345c(entry.getKey())) {
                AbstractC1196i.EnumC1198a downFrom = AbstractC1196i.EnumC1198a.downFrom(aVar2.f3996a);
                if (downFrom != null) {
                    m3904d(downFrom.getTargetState());
                    aVar2.mo4019a(mVar, downFrom);
                    m3901c();
                } else {
                    throw new IllegalStateException("no event down from " + aVar2.f3996a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4017a(AbstractC1196i.EnumC1199b bVar) {
        m3897a("markState");
        mo4018b(bVar);
    }

    @Override // androidx.lifecycle.AbstractC1196i
    /* renamed from: a */
    public void mo4012a(AbstractC1203l lVar) {
        AbstractC1196i.EnumC1199b bVar;
        AbstractC1204m mVar;
        boolean z;
        m3897a("addObserver");
        if (this.f3989c == AbstractC1196i.EnumC1199b.DESTROYED) {
            bVar = AbstractC1196i.EnumC1199b.DESTROYED;
        } else {
            bVar = AbstractC1196i.EnumC1199b.INITIALIZED;
        }
        C1206a aVar = new C1206a(lVar, bVar);
        if (this.f3988b.mo343a(lVar, aVar) == null && (mVar = this.f3990d.get()) != null) {
            if (this.f3991e != 0 || this.f3992f) {
                z = true;
            } else {
                z = false;
            }
            AbstractC1196i.EnumC1199b c = mo96565c(lVar);
            this.f3991e++;
            while (aVar.f3996a.compareTo((Enum) c) < 0 && this.f3988b.mo345c(lVar)) {
                m3904d(aVar.f3996a);
                AbstractC1196i.EnumC1198a upFrom = AbstractC1196i.EnumC1198a.upFrom(aVar.f3996a);
                if (upFrom != null) {
                    aVar.mo4019a(mVar, upFrom);
                    m3901c();
                    c = mo96565c(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3996a);
                }
            }
            if (!z) {
                m3903d();
            }
            this.f3991e--;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.n$a */
    public static class C1206a {

        /* renamed from: a */
        AbstractC1196i.EnumC1199b f3996a;

        /* renamed from: b */
        AbstractC1202k f3997b;

        static {
            Covode.recordClassIndex(1313);
        }

        C1206a(AbstractC1203l lVar, AbstractC1196i.EnumC1199b bVar) {
            this.f3997b = C1209q.m3914a(lVar);
            this.f3996a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4019a(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            AbstractC1196i.EnumC1199b targetState = aVar.getTargetState();
            this.f3996a = C1205n.m3895a(this.f3996a, targetState);
            this.f3997b.onStateChanged(mVar, aVar);
            this.f3996a = targetState;
        }
    }

    /* renamed from: a */
    static AbstractC1196i.EnumC1199b m3895a(AbstractC1196i.EnumC1199b bVar, AbstractC1196i.EnumC1199b bVar2) {
        if (bVar2 == null || bVar2.compareTo((Enum) bVar) >= 0) {
            return bVar;
        }
        return bVar2;
    }

    public C1205n(AbstractC1204m mVar, boolean z) {
        this.f3988b = new C0181a<>();
        this.f3991e = 0;
        this.f3992f = false;
        this.f3993g = false;
        this.f3994h = new ArrayList<>();
        this.f3990d = new WeakReference<>(mVar);
        this.f3989c = AbstractC1196i.EnumC1199b.INITIALIZED;
        this.f3995i = z;
    }
}
