package androidx.work;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;

public abstract class ListenableWorker {

    /* renamed from: a */
    public Context f5171a;

    /* renamed from: b */
    public WorkerParameters f5172b;

    /* renamed from: c */
    public volatile boolean f5173c;

    /* renamed from: d */
    public boolean f5174d;

    static {
        Covode.recordClassIndex(1733);
    }

    /* renamed from: a */
    public abstract AbstractFutureC27655q<AbstractC1584a> mo5335a();

    /* renamed from: c */
    public void mo5337c() {
    }

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class AbstractC1584a {
        static {
            Covode.recordClassIndex(1734);
        }

        AbstractC1584a() {
        }

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1585a extends AbstractC1584a {

            /* renamed from: a */
            public final C1597e f5175a;

            static {
                Covode.recordClassIndex(1735);
            }

            public C1585a() {
                this(C1597e.f5223a);
            }

            public final int hashCode() {
                return 28070863 + this.f5175a.hashCode();
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f5175a + '}';
            }

            private C1585a(C1597e eVar) {
                this.f5175a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f5175a.equals(((C1585a) obj).f5175a);
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1587c extends AbstractC1584a {

            /* renamed from: a */
            public final C1597e f5176a;

            static {
                Covode.recordClassIndex(1737);
            }

            public C1587c() {
                this(C1597e.f5223a);
            }

            public final int hashCode() {
                return 28070925 + this.f5176a.hashCode();
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f5176a + '}';
            }

            public C1587c(C1597e eVar) {
                this.f5176a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return this.f5176a.equals(((C1587c) obj).f5176a);
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1586b extends AbstractC1584a {
            static {
                Covode.recordClassIndex(1736);
            }

            public final int hashCode() {
                return 1386378834;
            }

            public final String toString() {
                return "Retry";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: b */
    public final void mo5336b() {
        this.f5173c = true;
        mo5337c();
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f5171a = context;
            this.f5172b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }
}
