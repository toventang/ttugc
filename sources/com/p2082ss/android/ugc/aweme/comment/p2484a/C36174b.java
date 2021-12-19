package com.p2082ss.android.ugc.aweme.comment.p2484a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.comment.a.b */
public final class C36174b {

    /* renamed from: a */
    public static final int[] f85451a = {100, 100, 100};

    /* renamed from: b */
    public static final C36174b f85452b = new C36174b();

    /* renamed from: c */
    private static final AbstractC89244h f85453c = C89250i.m154773a((AbstractC89171a) C36175a.f85454a);

    /* renamed from: a */
    public static int[] m73727a() {
        return (int[]) f85453c.getValue();
    }

    private C36174b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a.b$a */
    static final class C36175a extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C36175a f85454a = new C36175a();

        static {
            Covode.recordClassIndex(43435);
        }

        C36175a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ int[] invoke() {
            return m73728a();
        }

        /* renamed from: a */
        private static int[] m73728a() {
            try {
                int[] iArr = (int[]) SettingsManager.m29616a().mo25396a("comment_batch_max_limit", int[].class);
                if (iArr == null) {
                    return C36174b.f85451a;
                }
                return iArr;
            } catch (Throwable unused) {
                return C36174b.f85451a;
            }
        }
    }

    static {
        Covode.recordClassIndex(43434);
    }
}
