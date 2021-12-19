package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40046b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40055c;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a */
public final class C40047a extends AbstractC40044a {

    /* renamed from: a */
    private final AbstractC53430a f94082a = new AbstractC53430a() {
        /* class com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40047a.C400481 */

        static {
            Covode.recordClassIndex(47819);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a
        /* renamed from: a */
        public final C33594aj<Long> mo60117a() {
            return SharePrefCache.inst().getLastLockedTime();
        }
    };

    /* renamed from: b */
    private final AbstractC53430a f94083b = new AbstractC53430a() {
        /* class com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40047a.C400492 */

        static {
            Covode.recordClassIndex(47820);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a
        /* renamed from: a */
        public final C33594aj<Long> mo60117a() {
            return SharePrefCache.inst().getLastUnlockTime();
        }
    };

    static {
        Covode.recordClassIndex(47818);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a, com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40057d
    /* renamed from: a */
    public final boolean mo69199a(long j, long j2) {
        if (!C40061a.m81021a()) {
            return false;
        }
        long c = (long) C40055c.m81014c();
        if (c < 0 || !this.f94083b.mo90000b(System.currentTimeMillis())) {
            return false;
        }
        if (this.f94082a.mo90000b(System.currentTimeMillis())) {
            SharePrefCache.inst().getTodayVideoPlayTime().mo59940b(0L);
            this.f94082a.mo89999a(System.currentTimeMillis());
        }
        long longValue = SharePrefCache.inst().getTodayVideoPlayTime().mo59941c().longValue() + c;
        SharePrefCache.inst().getTodayVideoPlayTime().mo59940b(Long.valueOf(longValue));
        C40046b.m81004a();
        if (longValue <= ((long) (C40061a.m81023c() * 60 * 1000))) {
            return false;
        }
        AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new AbstractC88986z<String>() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b.C40047a.C400503 */

            static {
                Covode.recordClassIndex(47821);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(String str) {
                C40106a.m81128a((AbstractC34709b<Boolean>) null, str);
            }
        });
        return false;
    }
}
