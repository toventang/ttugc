package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40046b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40059f;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAweme;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAwemeApi;
import com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.c */
public final class C40052c extends AbstractC40044a {

    /* renamed from: a */
    private final AbstractC53430a f94089a = new AbstractC53430a() {
        /* class com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40052c.C400531 */

        static {
            Covode.recordClassIndex(47824);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a
        /* renamed from: a */
        public final C33594aj<Long> mo60117a() {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Long> lastGetRelieveAwemeTime = inst.getLastGetRelieveAwemeTime();
            C89219l.m154716b(lastGetRelieveAwemeTime, "");
            return lastGetRelieveAwemeTime;
        }
    };

    static {
        Covode.recordClassIndex(47823);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.c$a */
    public static final class C40054a implements AbstractC88986z<TiktokRelieveAweme> {
        static {
            Covode.recordClassIndex(47825);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C40054a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(TiktokRelieveAweme tiktokRelieveAweme) {
            TiktokRelieveAweme tiktokRelieveAweme2 = tiktokRelieveAweme;
            C89219l.m154721d(tiktokRelieveAweme2, "");
            if (!TextUtils.isEmpty(tiktokRelieveAweme2.getAwemeId())) {
                C40046b.m81004a().f94080e = true;
                C40059f.f94099a = tiktokRelieveAweme2.getAwemeId();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a, com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40057d
    /* renamed from: a */
    public final boolean mo69199a(long j, long j2) {
        int i;
        if (!C40059f.m81018a()) {
            return false;
        }
        C40046b a = C40046b.m81004a();
        if (a.mo69206a(j)) {
            i = a.f94078c;
        } else {
            i = a.f94077b;
        }
        long j3 = (long) (i * 1000);
        if (j3 <= 0 || j2 <= j3 || !this.f94089a.mo90000b(j)) {
            return false;
        }
        this.f94089a.mo89999a(j);
        try {
            TiktokRelieveAwemeApi.f94073a.getTiktokRelieveAweme(!C40046b.m81004a().mo69206a(System.currentTimeMillis())).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40054a());
        } catch (Exception unused) {
        }
        return true;
    }
}
