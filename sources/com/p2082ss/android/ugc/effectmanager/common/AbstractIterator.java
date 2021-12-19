package com.p2082ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.utils.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ss.android.ugc.effectmanager.common.AbstractIterator */
public abstract class AbstractIterator<T> implements Iterator<T> {
    private T next;
    private State state = State.NOT_READY;

    static {
        Covode.recordClassIndex(95411);
    }

    /* access modifiers changed from: protected */
    public abstract T computeNext();

    protected AbstractIterator() {
    }

    /* access modifiers changed from: protected */
    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    public final T peek() {
        if (hasNext()) {
            return this.next;
        }
        throw new NoSuchElementException();
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.common.AbstractIterator$1 */
    public static /* synthetic */ class C819351 {

        /* renamed from: $SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State */
        static final /* synthetic */ int[] f183426x79d8c425;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 95412(0x174b4, float:1.337E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State[] r0 = com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.C819351.f183426x79d8c425 = r2
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State r0 = com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.C819351.f183426x79d8c425     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.effectmanager.common.AbstractIterator$State r0 = com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.AbstractIterator.C819351.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.common.AbstractIterator$State */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            Covode.recordClassIndex(95413);
        }
    }

    public final boolean hasNext() {
        boolean z;
        if (this.state != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = C819351.f183426x79d8c425[this.state.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }
}
