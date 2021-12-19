package com.p2082ss.android.ugc.aweme.p2483co;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.co.h */
public final class C36154h {

    /* renamed from: a */
    static int f85413a;

    /* renamed from: b */
    static final AbstractC89244h f85414b = C89250i.m154773a((AbstractC89171a) C36155a.f85417a);

    /* renamed from: c */
    static final AbstractC89244h f85415c = C89250i.m154773a((AbstractC89171a) C36156b.f85418a);

    /* renamed from: d */
    public static final C36154h f85416d = new C36154h();

    private C36154h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.co.h$a */
    static final class C36155a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C36155a f85417a = new C36155a();

        static {
            Covode.recordClassIndex(43408);
        }

        C36155a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "resize_feed_in_small_screen", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(43407);
    }

    /* renamed from: com.ss.android.ugc.aweme.co.h$b */
    static final class C36156b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C36156b f85418a = new C36156b();

        static {
            Covode.recordClassIndex(43409);
        }

        C36156b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Context a = C17867d.m33078a();
            if (C36154h.f85413a == 0) {
                Resources resources = a.getResources();
                C89219l.m154716b(resources, "");
                C36154h.f85413a = (int) (((float) resources.getDisplayMetrics().heightPixels) / a.getResources().getDisplayMetrics().density);
            }
            if (C36154h.f85413a <= 640) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }
}
