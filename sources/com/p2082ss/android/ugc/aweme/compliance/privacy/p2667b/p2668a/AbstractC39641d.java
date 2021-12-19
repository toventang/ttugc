package com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a;

import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d */
interface AbstractC39641d {

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$d */
    public interface AbstractC39648d {
        static {
            Covode.recordClassIndex(47367);
        }

        /* renamed from: a */
        long mo69056a(long j);
    }

    static {
        Covode.recordClassIndex(47360);
    }

    /* renamed from: a */
    AbstractC39648d mo69055a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$b */
    public static class C39644b implements AbstractC39641d {

        /* renamed from: a */
        private final AbstractC39648d f93440a = new AbstractC39648d() {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d.C39644b.C396451 */

            static {
                Covode.recordClassIndex(47364);
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d.AbstractC39648d
            /* renamed from: a */
            public final long mo69056a(long j) {
                return -1;
            }
        };

        static {
            Covode.recordClassIndex(47363);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d
        /* renamed from: a */
        public final AbstractC39648d mo69055a() {
            return this.f93440a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$c */
    public static class C39646c implements AbstractC39641d {

        /* renamed from: a */
        private final AbstractC39648d f93442a = new AbstractC39648d() {
            /* class com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d.C39646c.C396471 */

            static {
                Covode.recordClassIndex(47366);
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d.AbstractC39648d
            /* renamed from: a */
            public final long mo69056a(long j) {
                return j;
            }
        };

        static {
            Covode.recordClassIndex(47365);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d
        /* renamed from: a */
        public final AbstractC39648d mo69055a() {
            return this.f93442a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$a */
    public static class C39642a implements AbstractC39641d {

        /* renamed from: a */
        long f93437a;

        static {
            Covode.recordClassIndex(47361);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d
        /* renamed from: a */
        public final AbstractC39648d mo69055a() {
            return new C39643a();
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.d$a$a */
        class C39643a implements AbstractC39648d {

            /* renamed from: b */
            private final C0489d<Long> f93439b = new C0489d<>();

            static {
                Covode.recordClassIndex(47362);
            }

            C39643a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39641d.AbstractC39648d
            /* renamed from: a */
            public final long mo69056a(long j) {
                Long a = this.f93439b.mo2078a(j, null);
                if (a == null) {
                    C39642a aVar = C39642a.this;
                    long j2 = aVar.f93437a;
                    aVar.f93437a = 1 + j2;
                    a = Long.valueOf(j2);
                    this.f93439b.mo2083b(j, a);
                }
                return a.longValue();
            }
        }
    }
}
