package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20735l;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d */
public final class C45096d {

    /* renamed from: a */
    static final LinkedList<C45099c> f105153a = new LinkedList<>();

    /* renamed from: b */
    public static final C45096d f105154b = new C45096d();

    /* renamed from: c */
    private static long f105155c;

    /* renamed from: d */
    private static int f105156d = 4;

    /* renamed from: e */
    private static final C45101d f105157e = new C45101d();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$b */
    public interface AbstractC45098b {
        static {
            Covode.recordClassIndex(53529);
        }

        /* renamed from: a */
        void mo76192a(Collection<? extends Object> collection, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$d */
    public static final class C45101d implements AbstractC20735l {
        static {
            Covode.recordClassIndex(53532);
        }

        C45101d() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20735l
        /* renamed from: a */
        public final void mo34160a() {
            C45096d.m87749c();
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20735l
        /* renamed from: b */
        public final void mo34161b() {
            C45096d.m87749c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$e */
    public static final class C45102e implements AbstractC45098b {
        static {
            Covode.recordClassIndex(53533);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45096d.AbstractC45098b
        /* renamed from: a */
        public final void mo76192a(Collection<? extends Object> collection, int i) {
            C89219l.m154721d(collection, "");
        }

        C45102e() {
        }
    }

    private C45096d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$c */
    public static final class C45099c extends PriorityQueue<C45097a> implements AbstractC45098b {

        /* renamed from: a */
        boolean f105160a;

        /* renamed from: b */
        final WeakReference<AbstractC1196i> f105161b;

        static {
            Covode.recordClassIndex(53530);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof C45097a)) {
                return super.contains(obj);
            }
            return false;
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null || (obj instanceof C45097a)) {
                return super.remove(obj);
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45099c(AbstractC1196i iVar) {
            super(16, C451001.f105162a);
            C89219l.m154721d(iVar, "");
            this.f105161b = new WeakReference<>(iVar);
            iVar.mo4012a(new ImagePreloader$Queue$2(this));
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45096d.AbstractC45098b
        /* renamed from: a */
        public final void mo76192a(Collection<? extends Object> collection, int i) {
            C89219l.m154721d(collection, "");
            if (C45096d.m87747a()) {
                int i2 = 0;
                for (T t : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    add(new C45097a(i2 + i, t));
                    i2 = i3;
                }
                C45096d.m87748b();
            }
        }
    }

    static {
        Covode.recordClassIndex(53527);
    }

    /* renamed from: c */
    public static void m87749c() {
        if (m87747a()) {
            f105156d++;
            m87748b();
        }
    }

    /* renamed from: a */
    public static boolean m87747a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - f105155c < 15000) {
            return false;
        }
        C22708a.m42802a(new Throwable("Called not in main thread!"));
        f105155c = uptimeMillis;
        return false;
    }

    /* renamed from: b */
    public static void m87748b() {
        if (m87747a() && f105156d > 0) {
            ArrayList<Object> arrayList = new ArrayList();
            LinkedList<C45099c> linkedList = f105153a;
            ArrayList arrayList2 = new ArrayList();
            for (T t : linkedList) {
                if (t.f105160a) {
                    arrayList2.add(t);
                }
            }
            ArrayList<C45099c> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (true ^ ((C45099c) obj).isEmpty()) {
                    arrayList3.add(obj);
                }
            }
            for (C45099c cVar : arrayList3) {
                while (arrayList.size() < f105156d && (!cVar.isEmpty())) {
                    arrayList.add(((C45097a) cVar.remove()).f105159b);
                }
                if (arrayList.size() >= f105156d) {
                    break;
                }
            }
            f105156d -= arrayList.size();
            for (Object obj2 : arrayList) {
                C20766v a = C45562g.m88109a(obj2);
                a.f49088A = EnumC20760q.LOW;
                a.f49095H = f105157e;
                C20761r.m39066c(a.mo34183b());
            }
        }
    }

    /* renamed from: a */
    public static AbstractC45098b m87746a(AbstractC1196i iVar) {
        T t;
        C89219l.m154721d(iVar, "");
        if (!m87747a()) {
            return new C45102e();
        }
        Iterator<T> it = f105153a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C89219l.m154721d(iVar, "");
            if (t.f105161b.get() == iVar) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2;
        }
        C45099c cVar = new C45099c(iVar);
        f105153a.addFirst(cVar);
        return cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.d$a */
    public static final class C45097a {

        /* renamed from: a */
        public final int f105158a;

        /* renamed from: b */
        public final Object f105159b;

        static {
            Covode.recordClassIndex(53528);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C45097a)) {
                return false;
            }
            C45097a aVar = (C45097a) obj;
            return this.f105158a == aVar.f105158a && C89219l.m154714a(this.f105159b, aVar.f105159b);
        }

        public final int hashCode() {
            int i = this.f105158a * 31;
            Object obj = this.f105159b;
            return i + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "Holder(priority=" + this.f105158a + ", item=" + this.f105159b + ")";
        }

        public C45097a(int i, Object obj) {
            C89219l.m154721d(obj, "");
            this.f105158a = i;
            this.f105159b = obj;
        }
    }
}
