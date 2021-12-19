package com.bytedance.android.live.design.view;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.bytedance.android.live.design.view.e */
public final class C4087e {

    /* renamed from: a */
    final Queue<C4090b> f11293a;

    /* renamed from: b */
    final Map<View, C4089a> f11294b;

    /* renamed from: c */
    private C4090b f11295c;

    /* renamed from: d */
    private boolean f11296d;

    static {
        Covode.recordClassIndex(4632);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.e$b */
    public static class C4090b {

        /* renamed from: a */
        long f11300a;

        /* renamed from: b */
        AbstractC4084b f11301b;

        /* renamed from: c */
        View.OnLayoutChangeListener f11302c;

        /* renamed from: d */
        C4094h f11303d;

        /* renamed from: e */
        C4086d f11304e;

        static {
            Covode.recordClassIndex(4635);
        }

        C4090b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.e$a */
    public static class C4089a {

        /* renamed from: a */
        List<C4090b> f11298a;

        /* renamed from: b */
        View.OnAttachStateChangeListener f11299b;

        static {
            Covode.recordClassIndex(4634);
        }

        private C4089a() {
            this.f11298a = new LinkedList();
        }

        /* synthetic */ C4089a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.design.view.e$c */
    public static class C4091c {

        /* renamed from: a */
        public static final C4087e f11305a = new C4087e((byte) 0);

        static {
            Covode.recordClassIndex(4636);
        }
    }

    private C4087e() {
        this.f11293a = new LinkedList();
        this.f11294b = new HashMap();
        this.f11296d = true;
    }

    /* renamed from: a */
    private void m9902a() {
        C4090b poll;
        if (this.f11296d && this.f11295c == null && (poll = this.f11293a.poll()) != null) {
            m9903a(poll);
            this.f11295c = poll;
            C4097j.m9930a(poll);
        }
    }

    /* synthetic */ C4087e(byte b) {
        this();
    }

    /* renamed from: a */
    private void m9903a(C4090b bVar) {
        this.f11293a.remove(bVar);
        C4089a aVar = this.f11294b.get(bVar.f11303d.f11337b);
        if (aVar != null && !aVar.f11298a.isEmpty()) {
            aVar.f11298a.remove(bVar);
            if (aVar.f11298a.isEmpty()) {
                bVar.f11303d.f11337b.removeOnAttachStateChangeListener(aVar.f11299b);
                this.f11294b.remove(bVar.f11303d.f11337b);
            }
        }
    }

    /* renamed from: a */
    public final long mo9541a(C4094h hVar) {
        C4090b bVar = new C4090b();
        bVar.f11300a = SystemClock.uptimeMillis();
        bVar.f11303d = hVar;
        bVar.f11301b = new C4092f(this, hVar);
        C4089a aVar = this.f11294b.get(bVar.f11303d.f11337b);
        if (aVar == null) {
            aVar = new C4089a((byte) 0);
            this.f11294b.put(bVar.f11303d.f11337b, aVar);
            aVar.f11299b = new View.OnAttachStateChangeListener() {
                /* class com.bytedance.android.live.design.view.C4087e.View$OnAttachStateChangeListenerC40881 */

                static {
                    Covode.recordClassIndex(4633);
                }

                public final void onViewAttachedToWindow(View view) {
                }

                public final void onViewDetachedFromWindow(View view) {
                    C4087e eVar = C4087e.this;
                    C4089a aVar = eVar.f11294b.get(view);
                    if (aVar != null && !aVar.f11298a.isEmpty()) {
                        for (C4090b bVar : aVar.f11298a) {
                            eVar.f11293a.remove(bVar);
                        }
                    }
                    eVar.f11294b.remove(view);
                }
            };
            bVar.f11303d.f11337b.addOnAttachStateChangeListener(aVar.f11299b);
        }
        aVar.f11298a.add(bVar);
        this.f11293a.offer(bVar);
        m9902a();
        return bVar.f11300a;
    }

    /* renamed from: a */
    public final void mo9544a(boolean z) {
        this.f11296d = z;
        if (z) {
            m9902a();
            return;
        }
        C4090b bVar = this.f11295c;
        if (bVar != null) {
            mo9542a(bVar.f11300a, 5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9543a(C4094h hVar, int i) {
        if (hVar.f11346k != null) {
            hVar.f11346k.mo9538a(i);
        }
        this.f11295c = null;
        m9902a();
    }

    /* renamed from: a */
    public final void mo9542a(long j, int i) {
        C4090b next;
        C4090b bVar = this.f11295c;
        if (bVar == null || bVar.f11300a != j) {
            Iterator<C4090b> it = this.f11293a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.f11300a == j) {
                    m9903a(next);
                }
            }
            return;
        }
        next = this.f11295c;
        this.f11295c = null;
        if (next == null) {
            return;
        }
        if (next.f11304e != null) {
            next.f11304e.f11292a = i;
            next.f11304e.dismiss();
        } else if (next.f11302c != null) {
            next.f11303d.f11337b.removeOnLayoutChangeListener(next.f11302c);
            m9902a();
        }
    }
}
