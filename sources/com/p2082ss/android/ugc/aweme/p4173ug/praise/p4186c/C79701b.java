package com.p2082ss.android.ugc.aweme.p4173ug.praise.p4186c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.c.b */
public final class C79701b {

    /* renamed from: a */
    public static final C79701b f178828a = new C79701b();

    private C79701b() {
    }

    static {
        Covode.recordClassIndex(92918);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.c.b$b */
    public static final class C79703b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C79703b f178830a = new C79703b();

        static {
            Covode.recordClassIndex(92920);
        }

        C79703b() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Activity j = C17873f.m33102j();
            if (j != null) {
                C89219l.m154716b(iVar, "");
                Boolean bool = (Boolean) iVar.mo5545d();
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    new C79684b(new C79700a(j)).mo123228a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.c.b$a */
    public static final class C79702a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C79702a f178829a = new C79702a();

        static {
            Covode.recordClassIndex(92919);
        }

        C79702a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
            if (com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b.C79685a.m138506a() != false) goto L_0x0028;
         */
        @Override // p077b.AbstractC1729g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p077b.C1731i r12) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p4173ug.praise.p4186c.C79701b.C79702a.then(b.i):java.lang.Object");
        }
    }
}
