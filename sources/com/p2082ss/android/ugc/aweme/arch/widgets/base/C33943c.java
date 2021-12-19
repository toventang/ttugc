package com.p2082ss.android.ugc.aweme.arch.widgets.base;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.c */
public class C33943c<T> extends C1213t<T> {

    /* renamed from: c */
    private static Handler f80279c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public int f80280a = -1;

    /* renamed from: b */
    private Map<AbstractC1214u, C33943c<T>.C33945a> f80281b = new HashMap();

    static {
        Covode.recordClassIndex(40868);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(AbstractC1214u<? super T> uVar) {
        mo60214a(uVar, false);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public void postValue(final T t) {
        f80279c.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c.RunnableC339441 */

            static {
                Covode.recordClassIndex(40869);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.arch.widgets.base.c */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                C33943c.this.setValue(t);
            }
        });
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public void setValue(T t) {
        this.f80280a++;
        super.setValue(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.c$a */
    public class C33945a<R> implements AbstractC1214u<R> {

        /* renamed from: b */
        private int f80285b;

        /* renamed from: c */
        private AbstractC1214u<R> f80286c;

        /* renamed from: d */
        private boolean f80287d;

        static {
            Covode.recordClassIndex(40870);
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(R r) {
            if (this.f80287d || this.f80285b < C33943c.this.f80280a) {
                this.f80286c.onChanged(r);
            }
        }

        C33945a(int i, AbstractC1214u<R> uVar, boolean z) {
            this.f80285b = i;
            this.f80286c = uVar;
            this.f80287d = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(AbstractC1214u<? super T> uVar) {
        C33943c<T>.C33945a remove = this.f80281b.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
        } else if (uVar instanceof C33945a) {
            for (Map.Entry<AbstractC1214u, C33943c<T>.C33945a> entry : this.f80281b.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    AbstractC1214u key = entry.getKey();
                    super.removeObserver(uVar);
                    if (key != null) {
                        this.f80281b.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(AbstractC1204m mVar, AbstractC1214u<? super T> uVar) {
        mo60213a(mVar, uVar, false);
    }

    /* renamed from: a */
    public final void mo60214a(AbstractC1214u<? super T> uVar, boolean z) {
        if (!this.f80281b.containsKey(uVar)) {
            C33943c<T>.C33945a aVar = new C33945a<>(this.f80280a, uVar, z);
            this.f80281b.put(uVar, aVar);
            super.observeForever(aVar);
        }
    }

    /* renamed from: a */
    public final void mo60213a(AbstractC1204m mVar, AbstractC1214u<? super T> uVar, boolean z) {
        if (!this.f80281b.containsKey(uVar)) {
            C33943c<T>.C33945a aVar = new C33945a<>(this.f80280a, uVar, z);
            this.f80281b.put(uVar, aVar);
            super.observe(mVar, aVar);
        }
    }
}
