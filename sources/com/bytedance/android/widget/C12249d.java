package com.bytedance.android.widget;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.widget.d */
public final class C12249d<T> extends C1213t<T> {

    /* renamed from: a */
    public int f29519a = -1;

    /* renamed from: b */
    private Map<AbstractC1214u, C12250a> f29520b = new HashMap();

    static {
        Covode.recordClassIndex(13984);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        this.f29519a++;
        super.setValue(t);
    }

    /* renamed from: com.bytedance.android.widget.d$a */
    class C12250a<T> implements AbstractC1214u<T> {

        /* renamed from: b */
        private int f29522b;

        /* renamed from: c */
        private AbstractC1214u<T> f29523c;

        /* renamed from: d */
        private boolean f29524d = false;

        static {
            Covode.recordClassIndex(13985);
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(T t) {
            if (this.f29524d || this.f29522b < C12249d.this.f29519a) {
                this.f29523c.onChanged(t);
            }
        }

        C12250a(int i, AbstractC1214u<T> uVar, boolean z) {
            this.f29522b = i;
            this.f29523c = uVar;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(AbstractC1214u<? super T> uVar) {
        C12250a remove = this.f29520b.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(uVar);
        if (uVar instanceof C12250a) {
            for (Map.Entry<AbstractC1214u, C12250a> entry : this.f29520b.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    AbstractC1214u key = entry.getKey();
                    if (key != null) {
                        this.f29520b.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19748a(AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        if (!this.f29520b.containsKey(uVar)) {
            C12250a aVar = new C12250a(this.f29519a, uVar, false);
            this.f29520b.put(uVar, aVar);
            super.observe(mVar, aVar);
        }
    }
}
