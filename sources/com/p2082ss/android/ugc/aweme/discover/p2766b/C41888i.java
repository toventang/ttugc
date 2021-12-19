package com.p2082ss.android.ugc.aweme.discover.p2766b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.b.i */
public final class C41888i {

    /* renamed from: a */
    static final AbstractC89244h f97730a = C89250i.m154773a((AbstractC89171a) C41889a.f97732a);

    /* renamed from: b */
    public static final C41888i f97731b = new C41888i();

    private C41888i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.i$a */
    static final class C41889a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41889a f97732a = new C41889a();

        static {
            Covode.recordClassIndex(49815);
        }

        C41889a() {
            super(0);
        }

        /* renamed from: a */
        private static int m83912a() {
            try {
                return C16048b.m29633a().mo25412a(true, "search_video_auto_play_sound_control", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m83912a());
        }
    }

    static {
        Covode.recordClassIndex(49814);
    }
}
