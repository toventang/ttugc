package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.h */
public final class C55095h {

    /* renamed from: a */
    public static final C55095h f126088a = new C55095h();

    private C55095h() {
    }

    static {
        Covode.recordClassIndex(64823);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.h$a */
    public static final /* synthetic */ class C55096a extends C89217j implements AbstractC89183m<String, Throwable, C89391z> {
        static {
            Covode.recordClassIndex(64824);
        }

        C55096a(C56244a aVar) {
            super(2, aVar, C56244a.class, "e", "e(Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Throwable th) {
            String str2 = str;
            Throwable th2 = th;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(th2, "");
            C56244a.m102187a(str2, th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m100768a(String str, String str2, AbstractC89183m<? super String, ? super Exception, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        if (str2 != null && str2.length() != 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            mVar.invoke("SecUidHelper", new IllegalArgumentException("Null or empty uid and SecUid"));
        }
    }
}
