package com.bytedance.ies.powerpreload.task;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17776a;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.C17815g;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.powerpreload.task.f */
public abstract class AbstractRunnableC17828f<T extends AbstractC17789d> implements AbstractC17789d, Runnable {

    /* renamed from: d */
    static final /* synthetic */ AbstractC89286i[] f42533d = {new C89225r(C89204ab.m154669a(AbstractRunnableC17828f.class), "owner", "getOwner()Landroid/app/Activity;"), new C89225r(C89204ab.m154669a(AbstractRunnableC17828f.class), "stubOwner", "getStubOwner()Landroidx/fragment/app/Fragment;"), new C89225r(C89204ab.m154669a(AbstractRunnableC17828f.class), "callback", "getCallback()Lcom/bytedance/ies/powerpreload/task/Task$Callback;")};

    /* renamed from: a */
    private final C17815g f42534a = new C17815g(C17832d.f42542a);

    /* renamed from: b */
    private final C17815g f42535b = new C17815g(C17833e.f42543a);

    /* renamed from: c */
    private final C17815g f42536c = new C17815g(C17831c.f42541a);

    /* renamed from: e */
    public boolean f42537e;

    /* renamed from: f */
    public final T f42538f;

    /* renamed from: g */
    public final C17807d f42539g;

    /* renamed from: h */
    public final Bundle f42540h;

    /* renamed from: com.bytedance.ies.powerpreload.task.f$a */
    public interface AbstractC17829a {
        static {
            Covode.recordClassIndex(20394);
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.f$c */
    static final class C17831c extends AbstractC89220m implements AbstractC89171a {

        /* renamed from: a */
        public static final C17831c f42541a = new C17831c();

        static {
            Covode.recordClassIndex(20396);
        }

        C17831c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.f$d */
    static final class C17832d extends AbstractC89220m implements AbstractC89171a {

        /* renamed from: a */
        public static final C17832d f42542a = new C17832d();

        static {
            Covode.recordClassIndex(20397);
        }

        C17832d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.f$e */
    static final class C17833e extends AbstractC89220m implements AbstractC89171a {

        /* renamed from: a */
        public static final C17833e f42543a = new C17833e();

        static {
            Covode.recordClassIndex(20398);
        }

        C17833e() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: c */
    private AbstractC17829a m33013c() {
        return (AbstractC17829a) this.f42536c.mo28278a(f42533d[2]);
    }

    /* renamed from: a */
    public abstract Object mo28272a();

    /* renamed from: a */
    public final void mo28290a(Activity activity) {
        this.f42534a.mo28279a(f42533d[0], activity);
    }

    /* renamed from: a */
    public final void mo28291a(Fragment fragment) {
        this.f42535b.mo28279a(f42533d[1], fragment);
    }

    /* renamed from: a */
    public final void mo28292a(AbstractC17829a aVar) {
        this.f42536c.mo28279a(f42533d[2], null);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    public boolean enable(Bundle bundle) {
        return true;
    }

    /* renamed from: b */
    public void mo28286b() {
        C17815g gVar = this.f42534a;
        AbstractC89286i<?>[] iVarArr = f42533d;
        if (gVar.mo28278a(iVarArr[0]) != null) {
            mo28290a((Activity) null);
        }
        if (this.f42535b.mo28278a(iVarArr[1]) != null) {
            mo28291a((Fragment) null);
        }
    }

    static {
        Covode.recordClassIndex(20393);
    }

    public String toString() {
        return "Task(preload=" + this.f42538f + ", relationData=" + this.f42539g + ')';
    }

    public final void run() {
        TaskTraceMetric a;
        Set<Class<?>> keySet;
        AbstractC17826d<?> dVar;
        TaskTraceMetric a2;
        TaskTraceMetric a3;
        TaskTraceMetric a4;
        TaskTraceMetric a5;
        TaskTraceMetric a6;
        try {
            Bundle bundle = this.f42540h;
            if (!(bundle == null || (a6 = C17776a.m32980a(bundle)) == null)) {
                a6.f42512b = SystemClock.elapsedRealtime();
            }
            Object a7 = mo28272a();
            Bundle bundle2 = this.f42540h;
            if (!(bundle2 == null || (a5 = C17776a.m32980a(bundle2)) == null)) {
                a5.f42513c = SystemClock.elapsedRealtime();
            }
            if (a7 != null) {
                HashMap<Class<?>, AbstractC17826d<?>> hashMap = C17778a.m32983a().f42455e;
                if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                    Iterator<T> it = keySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.isAssignableFrom(a7.getClass())) {
                            if (next != null) {
                                HashMap<Class<?>, AbstractC17826d<?>> hashMap2 = C17778a.m32983a().f42455e;
                                if (!(hashMap2 == null || (dVar = hashMap2.get(next)) == null)) {
                                    try {
                                        Bundle bundle3 = this.f42540h;
                                        if (!(bundle3 == null || (a4 = C17776a.m32980a(bundle3)) == null)) {
                                            a4.f42514d = SystemClock.elapsedRealtime();
                                        }
                                        dVar.mo28289a(a7, m33013c());
                                        Bundle bundle4 = this.f42540h;
                                        if (!(bundle4 == null || (a3 = C17776a.m32980a(bundle4)) == null)) {
                                            a3.f42515e = SystemClock.elapsedRealtime();
                                        }
                                    } catch (Exception e) {
                                        Bundle bundle5 = this.f42540h;
                                        if (!(bundle5 == null || (a2 = C17776a.m32980a(bundle5)) == null)) {
                                            a2.mo28280a();
                                        }
                                        T t = this.f42538f;
                                        if (t instanceof AbstractC17788c) {
                                            Boolean.valueOf(((AbstractC17788c) t).handleException(e));
                                        } else if (m33013c() != null) {
                                            m33013c();
                                        } else {
                                            throw e;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m33013c();
                return;
            }
        } catch (Exception e2) {
            Bundle bundle6 = this.f42540h;
            if (!(bundle6 == null || (a = C17776a.m32980a(bundle6)) == null)) {
                a.mo28280a();
            }
            T t2 = this.f42538f;
            if (t2 instanceof AbstractC17788c) {
                ((AbstractC17788c) t2).handleException(e2);
            } else if (m33013c() != null) {
                m33013c();
            } else {
                throw e2;
            }
        }
        this.f42537e = true;
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.f$b */
    public static final class C17830b extends AbstractRunnableC17828f<AbstractC17789d> {
        static {
            Covode.recordClassIndex(20395);
        }

        @Override // com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f
        /* renamed from: a */
        public final Object mo28272a() {
            return null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17830b(AbstractC17789d dVar, C17807d dVar2, Bundle bundle) {
            super(dVar, dVar2, bundle);
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(dVar2, "");
        }
    }

    public AbstractRunnableC17828f(T t, C17807d dVar, Bundle bundle) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(dVar, "");
        this.f42538f = t;
        this.f42539g = dVar;
        this.f42540h = bundle;
    }
}
