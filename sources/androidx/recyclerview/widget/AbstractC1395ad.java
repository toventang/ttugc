package androidx.recyclerview.widget;

import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.ad */
interface AbstractC1395ad {

    /* renamed from: androidx.recyclerview.widget.ad$d */
    public interface AbstractC1402d {
        static {
            Covode.recordClassIndex(1540);
        }

        /* renamed from: a */
        long mo4864a(long j);
    }

    static {
        Covode.recordClassIndex(1533);
    }

    /* renamed from: a */
    AbstractC1402d mo4863a();

    /* renamed from: androidx.recyclerview.widget.ad$b */
    public static class C1398b implements AbstractC1395ad {

        /* renamed from: a */
        private final AbstractC1402d f4631a = new AbstractC1402d() {
            /* class androidx.recyclerview.widget.AbstractC1395ad.C1398b.C13991 */

            static {
                Covode.recordClassIndex(1537);
            }

            @Override // androidx.recyclerview.widget.AbstractC1395ad.AbstractC1402d
            /* renamed from: a */
            public final long mo4864a(long j) {
                return -1;
            }
        };

        static {
            Covode.recordClassIndex(1536);
        }

        @Override // androidx.recyclerview.widget.AbstractC1395ad
        /* renamed from: a */
        public final AbstractC1402d mo4863a() {
            return this.f4631a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ad$c */
    public static class C1400c implements AbstractC1395ad {

        /* renamed from: a */
        private final AbstractC1402d f4633a = new AbstractC1402d() {
            /* class androidx.recyclerview.widget.AbstractC1395ad.C1400c.C14011 */

            static {
                Covode.recordClassIndex(1539);
            }

            @Override // androidx.recyclerview.widget.AbstractC1395ad.AbstractC1402d
            /* renamed from: a */
            public final long mo4864a(long j) {
                return j;
            }
        };

        static {
            Covode.recordClassIndex(1538);
        }

        @Override // androidx.recyclerview.widget.AbstractC1395ad
        /* renamed from: a */
        public final AbstractC1402d mo4863a() {
            return this.f4633a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ad$a */
    public static class C1396a implements AbstractC1395ad {

        /* renamed from: a */
        long f4628a;

        static {
            Covode.recordClassIndex(1534);
        }

        @Override // androidx.recyclerview.widget.AbstractC1395ad
        /* renamed from: a */
        public final AbstractC1402d mo4863a() {
            return new C1397a();
        }

        /* renamed from: androidx.recyclerview.widget.ad$a$a */
        class C1397a implements AbstractC1402d {

            /* renamed from: b */
            private final C0489d<Long> f4630b = new C0489d<>();

            static {
                Covode.recordClassIndex(1535);
            }

            C1397a() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1395ad.AbstractC1402d
            /* renamed from: a */
            public final long mo4864a(long j) {
                Long a = this.f4630b.mo2078a(j, null);
                if (a == null) {
                    C1396a aVar = C1396a.this;
                    long j2 = aVar.f4628a;
                    aVar.f4628a = 1 + j2;
                    a = Long.valueOf(j2);
                    this.f4630b.mo2083b(j, a);
                }
                return a.longValue();
            }
        }
    }
}
