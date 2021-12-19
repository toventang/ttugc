package leakcanary;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

public final class KeyedWeakReference extends WeakReference<Object> {
    public static final C89791a Companion = new C89791a((byte) 0);
    public static volatile long heapDumpUptimeMillis;
    private final String key;
    private final String name;
    private volatile long retainedUptimeMillis = -1;
    private final long watchUptimeMillis;

    static {
        Covode.recordClassIndex(105885);
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j) {
        heapDumpUptimeMillis = j;
    }

    /* renamed from: leakcanary.KeyedWeakReference$a */
    public static final class C89791a {
        static {
            Covode.recordClassIndex(105886);
        }

        private C89791a() {
        }

        public /* synthetic */ C89791a(byte b) {
            this();
        }
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j) {
        this.retainedUptimeMillis = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyedWeakReference(Object obj, String str, String str2, long j, ReferenceQueue<Object> referenceQueue) {
        super(obj, referenceQueue);
        C89219l.m154719c(obj, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(referenceQueue, "");
        this.key = str;
        this.name = str2;
        this.watchUptimeMillis = j;
    }
}
