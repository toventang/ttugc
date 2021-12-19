package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.ac */
public final class C41492ac {

    /* renamed from: a */
    public static final AbstractC89244h f96802a = C89250i.m154773a((AbstractC89171a) C41493a.f96804a);

    /* renamed from: b */
    public static final C41492ac f96803b = new C41492ac();

    private C41492ac() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.ac$a */
    static final class C41493a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41493a f96804a = new C41493a();

        static {
            Covode.recordClassIndex(49400);
        }

        C41493a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83442a() {
            try {
                return C16048b.m29633a().mo25412a(true, "search_sug_source", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83442a());
        }
    }

    static {
        Covode.recordClassIndex(49399);
    }
}
