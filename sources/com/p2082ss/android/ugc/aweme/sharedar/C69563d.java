package com.p2082ss.android.ugc.aweme.sharedar;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.AbstractC69514a;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69517b;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69527c;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69531d;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69535e;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69536f;
import com.p2082ss.android.ugc.aweme.sharedar.p3777a.p3778a.C69544g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharedar.d */
public final class C69563d {

    /* renamed from: d */
    public static final C69564a f155384d = new C69564a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f155385a = C89250i.m154773a((AbstractC89171a) new C69565b(this));

    /* renamed from: b */
    public final C21582f f155386b;

    /* renamed from: c */
    final AbstractC89171a<Boolean> f155387c;

    /* renamed from: e */
    private final AbstractC14177d f155388e;

    static {
        Covode.recordClassIndex(81905);
    }

    /* renamed from: a */
    static boolean m122769a(long j, long j2) {
        return j == -1 || j == j2;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.d$a */
    public static final class C69564a {
        static {
            Covode.recordClassIndex(81906);
        }

        private C69564a() {
        }

        public /* synthetic */ C69564a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.d$b */
    static final class C69565b extends AbstractC89220m implements AbstractC89171a<List<? extends AbstractC69514a>> {

        /* renamed from: a */
        final /* synthetic */ C69563d f155389a;

        static {
            Covode.recordClassIndex(81907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69565b(C69563d dVar) {
            super(0);
            this.f155389a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends AbstractC69514a> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C69536f(this.f155389a.f155386b));
            arrayList.add(new C69544g(this.f155389a.f155386b));
            arrayList.add(new C69527c(this.f155389a.f155386b));
            arrayList.add(new C69535e(this.f155389a.f155386b));
            arrayList.add(new C69517b(this.f155389a.f155386b));
            arrayList.add(new C69531d(this.f155389a.f155386b));
            return C89070n.m154590j(arrayList);
        }
    }

    public C69563d(C21582f fVar, AbstractC14177d dVar, AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f155386b = fVar;
        this.f155388e = dVar;
        this.f155387c = aVar;
    }

    /* renamed from: a */
    public final void mo109791a(int i, long j, long j2, String str) {
        String str2 = str;
        C84911q.m145922a("SharedAR", "[Client --> Effect]: msgID(" + i + "), arg1(" + j + "), arg2(" + j2 + "), arg3(" + str2 + ')');
        ASCameraView A = this.f155388e.mo22747A();
        if (str2 == null) {
            str2 = "empty_message";
        }
        A.mo56903a(i, j, j2, str2);
    }
}
