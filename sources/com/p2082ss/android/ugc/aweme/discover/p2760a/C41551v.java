package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.v */
public final class C41551v {

    /* renamed from: a */
    public static final C41551v f96906a = new C41551v();

    /* renamed from: b */
    private static final AbstractC89244h f96907b = C89250i.m154773a((AbstractC89171a) C41552a.f96908a);

    /* renamed from: a */
    public static int m83486a() {
        return ((Number) f96907b.getValue()).intValue();
    }

    private C41551v() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.v$a */
    static final class C41552a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41552a f96908a = new C41552a();

        static {
            Covode.recordClassIndex(49459);
        }

        C41552a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83487a() {
            try {
                return C16048b.m29633a().mo25412a(true, "video_detail_search_entrance_style", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83487a());
        }
    }

    static {
        Covode.recordClassIndex(49458);
    }
}
