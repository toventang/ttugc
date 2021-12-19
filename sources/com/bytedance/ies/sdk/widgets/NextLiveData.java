package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class NextLiveData<T> extends C1213t<T> {
    public int mLatestVersion = -1;
    private Map<AbstractC1214u, NextObserver> nextObserverMap = new HashMap();

    static {
        Covode.recordClassIndex(20442);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(AbstractC1214u<T> uVar) {
        observeForever(uVar, false);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    /* access modifiers changed from: package-private */
    public class NextObserver<T> implements AbstractC1214u<T> {
        private int initVersion;
        private boolean notifyWhenObserve;
        private AbstractC1214u<T> observer;

        static {
            Covode.recordClassIndex(20443);
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public void onChanged(T t) {
            if (this.notifyWhenObserve || this.initVersion < NextLiveData.this.mLatestVersion) {
                this.observer.onChanged(t);
            }
        }

        NextObserver(int i, AbstractC1214u<T> uVar, boolean z) {
            this.initVersion = i;
            this.observer = uVar;
            this.notifyWhenObserve = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(AbstractC1214u<T> uVar) {
        NextObserver remove = this.nextObserverMap.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(uVar);
        if (uVar instanceof NextObserver) {
            for (Map.Entry<AbstractC1214u, NextObserver> entry : this.nextObserverMap.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    AbstractC1214u key = entry.getKey();
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(AbstractC1204m mVar, AbstractC1214u<T> uVar) {
        observe(mVar, uVar, false);
    }

    public void observeForever(AbstractC1214u<T> uVar, boolean z) {
        if (!this.nextObserverMap.containsKey(uVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, uVar, z);
            this.nextObserverMap.put(uVar, nextObserver);
            super.observeForever(nextObserver);
        }
    }

    public void observe(AbstractC1204m mVar, AbstractC1214u<T> uVar, boolean z) {
        if (!this.nextObserverMap.containsKey(uVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, uVar, z);
            this.nextObserverMap.put(uVar, nextObserver);
            super.observe(mVar, nextObserver);
        }
    }
}
