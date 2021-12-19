package com.bytedance.android.livesdk.p458b.p459a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.b.a.a */
public abstract class AbstractC6891a<T> {

    /* renamed from: a */
    private boolean f17246a = true;

    /* renamed from: m */
    protected List<WeakReference<AbstractC6897f<T>>> f17247m = new ArrayList();

    /* renamed from: n */
    public T f17248n;

    static {
        Covode.recordClassIndex(7629);
    }

    /* renamed from: a */
    public final void mo13182a(AbstractC6897f<T> fVar) {
        if (fVar != null) {
            Iterator<WeakReference<AbstractC6897f<T>>> it = this.f17247m.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC6897f<T>> next = it.next();
                if (next.get() == null) {
                    it.remove();
                } else if (next.get() == fVar) {
                    return;
                }
            }
            this.f17247m.add(new WeakReference<>(fVar));
            if (this.f17246a) {
                fVar.mo10559a(this.f17248n);
            }
        }
    }

    /* renamed from: b */
    public final void mo13183b(AbstractC6897f<T> fVar) {
        Iterator<WeakReference<AbstractC6897f<T>>> it = this.f17247m.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC6897f<T>> next = it.next();
            if (next.get() == null) {
                it.remove();
            } else if (next.get() == fVar) {
                it.remove();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo10159a(T t) {
        if (t != this.f17248n) {
            this.f17248n = t;
            Iterator<WeakReference<AbstractC6897f<T>>> it = this.f17247m.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC6897f<T>> next = it.next();
                if (next.get() == null) {
                    it.remove();
                } else {
                    next.get().mo10559a(this.f17248n);
                }
            }
        }
    }
}
