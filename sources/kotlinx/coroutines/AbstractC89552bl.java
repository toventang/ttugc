package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89625a;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;

/* renamed from: kotlinx.coroutines.bl */
public abstract class AbstractC89552bl extends AbstractC89507ah {
    private boolean shared;
    private C89625a<AbstractC89543bc<?>> unconfinedQueue;
    private long useCount;

    static {
        Covode.recordClassIndex(105643);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    /* access modifiers changed from: protected */
    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isActive() {
        if (this.useCount > 0) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedLoopActive() {
        if (this.useCount >= delta(true)) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedQueueEmpty() {
        C89625a<AbstractC89543bc<?>> aVar = this.unconfinedQueue;
        if (aVar != null) {
            return aVar.mo144165a();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public long getNextTime() {
        C89625a<AbstractC89543bc<?>> aVar = this.unconfinedQueue;
        if (aVar != null && !aVar.mo144165a()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public long processNextEvent() {
        if (!processUnconfinedEvent()) {
            return Long.MAX_VALUE;
        }
        return getNextTime();
    }

    public final boolean processUnconfinedEvent() {
        C89625a<AbstractC89543bc<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            return false;
        }
        AbstractC89543bc bcVar = null;
        if (aVar.f203359b != aVar.f203360c) {
            Object obj = aVar.f203358a[aVar.f203359b];
            aVar.f203358a[aVar.f203359b] = null;
            aVar.f203359b = (aVar.f203359b + 1) & (aVar.f203358a.length - 1);
            if (obj != null) {
                bcVar = obj;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        AbstractC89543bc bcVar2 = bcVar;
        if (bcVar2 == null) {
            return false;
        }
        bcVar2.run();
        return true;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (!z) {
            this.shared = true;
        }
    }

    public final void decrementUseCount(boolean z) {
        long delta = this.useCount - delta(z);
        this.useCount = delta;
        if (delta <= 0) {
            if (C89527ar.f203243a && this.useCount != 0) {
                throw new AssertionError();
            } else if (this.shared) {
                shutdown();
            }
        }
    }

    public final void dispatchUnconfined(AbstractC89543bc<?> bcVar) {
        C89625a<AbstractC89543bc<?>> aVar = this.unconfinedQueue;
        if (aVar == null) {
            aVar = new C89625a<>();
            this.unconfinedQueue = aVar;
        }
        aVar.f203358a[aVar.f203360c] = bcVar;
        aVar.f203360c = (aVar.f203360c + 1) & (aVar.f203358a.length - 1);
        if (aVar.f203360c == aVar.f203359b) {
            int length = aVar.f203358a.length;
            Object[] objArr = new Object[(length << 1)];
            C89064i.m154471a(aVar.f203358a, objArr, 0, aVar.f203359b, 0, 10);
            C89064i.m154471a(aVar.f203358a, objArr, aVar.f203358a.length - aVar.f203359b, 0, aVar.f203359b, 4);
            aVar.f203358a = objArr;
            aVar.f203359b = 0;
            aVar.f203360c = length;
        }
    }

    public static /* synthetic */ void decrementUseCount$default(AbstractC89552bl blVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            blVar.decrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void incrementUseCount$default(AbstractC89552bl blVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            blVar.incrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }
}
