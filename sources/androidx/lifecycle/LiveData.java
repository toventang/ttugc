package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p012a.p013a.p015b.C0182b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    int mActiveCount = 0;
    private volatile Object mData;
    final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C0182b<AbstractC1214u<? super T>, LiveData<T>.AbstractC1164b> mObservers = new C0182b<>();
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    public int mVersion;

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    class LifecycleBoundObserver extends LiveData<T>.AbstractC1164b implements AbstractC1192f {

        /* renamed from: a */
        final AbstractC1204m f3930a;

        static {
            Covode.recordClassIndex(1262);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1164b
        /* renamed from: b */
        public final void mo3973b() {
            this.f3930a.getLifecycle().mo4013b(this);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1164b
        /* renamed from: a */
        public final boolean mo3971a() {
            return this.f3930a.getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1164b
        /* renamed from: a */
        public final boolean mo3972a(AbstractC1204m mVar) {
            if (this.f3930a == mVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (this.f3930a.getLifecycle().mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
                LiveData.this.removeObserver(this.f3933c);
            } else {
                mo3974a(mo3971a());
            }
        }

        LifecycleBoundObserver(AbstractC1204m mVar, AbstractC1214u<? super T> uVar) {
            super(uVar);
            this.f3930a = mVar;
        }
    }

    static {
        Covode.recordClassIndex(1260);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasObservers() {
        if (this.mObservers.f480e > 0) {
            return true;
        }
        return false;
    }

    public LiveData() {
        Object obj = NOT_SET;
        this.mData = obj;
        this.mPendingData = obj;
        this.mVersion = -1;
        this.mPostValueRunnable = new Runnable() {
            /* class androidx.lifecycle.LiveData.RunnableC11621 */

            static {
                Covode.recordClassIndex(1261);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: androidx.lifecycle.LiveData */
            /* JADX WARN: Multi-variable type inference failed */
            public final void run() {
                Object obj;
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            C0175a.m581a().mo337b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(AbstractC1214u<? super T> uVar) {
        assertMainThread("removeObserver");
        LiveData<T>.AbstractC1164b b = this.mObservers.mo344b(uVar);
        if (b != null) {
            b.mo3973b();
            b.mo3974a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    private static void assertMainThread(String str) {
        if (!C0175a.m581a().f469a.mo338b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.AbstractC1164b bVar) {
        if (bVar.f3934d) {
            if (!bVar.mo3971a()) {
                bVar.mo3974a(false);
                return;
            }
            int i = bVar.f3935e;
            int i2 = this.mVersion;
            if (i < i2) {
                bVar.f3935e = i2;
                bVar.f3933c.onChanged((Object) this.mData);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchingValue(LiveData<T>.AbstractC1164b bVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (bVar == null) {
                C0182b<K, V>.C0186d a = this.mObservers.mo346a();
                while (a.hasNext()) {
                    considerNotify((AbstractC1164b) ((Map.Entry) a.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(bVar);
                bVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(AbstractC1214u<? super T> uVar) {
        assertMainThread("observeForever");
        C1163a aVar = new C1163a(uVar);
        LiveData<T>.AbstractC1164b a = this.mObservers.mo343a(uVar, aVar);
        if (a == null) {
            aVar.mo3974a(true);
        } else if (a instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    public void removeObservers(AbstractC1204m mVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<AbstractC1214u<? super T>, LiveData<T>.AbstractC1164b>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<AbstractC1214u<? super T>, LiveData<T>.AbstractC1164b> next = it.next();
            if (next.getValue().mo3972a(mVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC1164b {

        /* renamed from: c */
        final AbstractC1214u<? super T> f3933c;

        /* renamed from: d */
        boolean f3934d;

        /* renamed from: e */
        int f3935e = -1;

        static {
            Covode.recordClassIndex(1264);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo3971a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3972a(AbstractC1204m mVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3973b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3974a(boolean z) {
            boolean z2;
            if (z != this.f3934d) {
                this.f3934d = z;
                int i = 1;
                if (LiveData.this.mActiveCount == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LiveData liveData = LiveData.this;
                int i2 = liveData.mActiveCount;
                if (!this.f3934d) {
                    i = -1;
                }
                liveData.mActiveCount = i2 + i;
                if (z2 && this.f3934d) {
                    LiveData.this.onActive();
                }
                if (LiveData.this.mActiveCount == 0 && !this.f3934d) {
                    LiveData.this.onInactive();
                }
                if (this.f3934d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        AbstractC1164b(AbstractC1214u<? super T> uVar) {
            this.f3933c = uVar;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1163a extends LiveData<T>.AbstractC1164b {
        static {
            Covode.recordClassIndex(1263);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.AbstractC1164b
        /* renamed from: a */
        public final boolean mo3971a() {
            return true;
        }

        C1163a(AbstractC1214u<? super T> uVar) {
            super(uVar);
        }
    }

    public void observe(AbstractC1204m mVar, AbstractC1214u<? super T> uVar) {
        assertMainThread("observe");
        if (mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, uVar);
            LiveData<T>.AbstractC1164b a = this.mObservers.mo343a(uVar, lifecycleBoundObserver);
            if (a == null) {
                mVar.getLifecycle().mo4012a(lifecycleBoundObserver);
            } else if (!a.mo3972a(mVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }
    }
}
