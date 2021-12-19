package com.p2082ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30091m;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b */
public final class C65517b {

    /* renamed from: a */
    public static final AbstractC89244h f147749a = C89250i.m154773a((AbstractC89171a) C65520c.f147754a);

    /* renamed from: b */
    public static final AbstractC89244h f147750b = C89250i.m154773a((AbstractC89171a) C65519b.f147753a);

    /* renamed from: c */
    public static final C65518a f147751c = new C65518a((byte) 0);

    /* renamed from: d */
    private final AbstractC89244h f147752d;

    /* renamed from: a */
    public final C30091m mo104655a() {
        return (C30091m) this.f147752d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b$a */
    public static final class C65518a {
        static {
            Covode.recordClassIndex(77008);
        }

        /* renamed from: a */
        public static C65517b m117248a() {
            return (C65517b) C65517b.f147749a.getValue();
        }

        private C65518a() {
        }

        public /* synthetic */ C65518a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b$c */
    static final class C65520c extends AbstractC89220m implements AbstractC89171a<C65517b> {

        /* renamed from: a */
        public static final C65520c f147754a = new C65520c();

        static {
            Covode.recordClassIndex(77010);
        }

        C65520c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65517b invoke() {
            return new C65517b((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b$b */
    static final class C65519b extends AbstractC89220m implements AbstractC89171a<C30091m> {

        /* renamed from: a */
        public static final C65519b f147753a = new C65519b();

        static {
            Covode.recordClassIndex(77009);
        }

        C65519b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C30091m invoke() {
            return C65518a.m117248a().mo104655a();
        }
    }

    private C65517b() {
        this.f147752d = C89250i.m154773a((AbstractC89171a) C65521d.f147755a);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b$d */
    static final class C65521d extends AbstractC89220m implements AbstractC89171a<C30091m> {

        /* renamed from: a */
        public static final C65521d f147755a = new C65521d();

        static {
            Covode.recordClassIndex(77011);
        }

        C65521d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C30091m invoke() {
            SmartSliceModel a = C65516a.m117246a();
            if (a != null) {
                return new C30091m(new C65522c(a));
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(77007);
    }

    public /* synthetic */ C65517b(byte b) {
        this();
    }
}
