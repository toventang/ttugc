package androidx.lifecycle;

import androidx.p012a.p013a.p015b.C0182b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
public class C1210r<T> extends C1213t<T> {

    /* renamed from: a */
    private C0182b<LiveData<?>, C1211a<?>> f4001a = new C0182b<>();

    static {
        Covode.recordClassIndex(1317);
    }

    /* renamed from: androidx.lifecycle.r$a */
    static class C1211a<V> implements AbstractC1214u<V> {

        /* renamed from: a */
        final LiveData<V> f4002a;

        /* renamed from: b */
        final AbstractC1214u<? super V> f4003b;

        /* renamed from: c */
        int f4004c = -1;

        static {
            Covode.recordClassIndex(1318);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4027a() {
            this.f4002a.observeForever(this);
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(V v) {
            if (this.f4004c != this.f4002a.mVersion) {
                this.f4004c = this.f4002a.mVersion;
                this.f4003b.onChanged(v);
            }
        }

        C1211a(LiveData<V> liveData, AbstractC1214u<? super V> uVar) {
            this.f4002a = liveData;
            this.f4003b = uVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, C1211a<?>>> it = this.f4001a.iterator();
        while (it.hasNext()) {
            it.next().getValue().mo4027a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, C1211a<?>>> it = this.f4001a.iterator();
        while (it.hasNext()) {
            C1211a<?> value = it.next().getValue();
            value.f4002a.removeObserver(value);
        }
    }

    /* renamed from: a */
    public final <S> void mo4026a(LiveData<S> liveData, AbstractC1214u<? super S> uVar) {
        C1211a<?> aVar = new C1211a<>(liveData, uVar);
        C1211a<?> a = this.f4001a.mo343a(liveData, aVar);
        if (a != null) {
            if (a.f4003b != uVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
        } else if (hasActiveObservers()) {
            aVar.mo4027a();
        }
    }
}
