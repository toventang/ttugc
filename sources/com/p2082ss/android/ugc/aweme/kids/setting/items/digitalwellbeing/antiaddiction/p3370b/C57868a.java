package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3370b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34507d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.AbstractC57874d;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.C57862a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.C57872c;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a.AbstractC57863a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.C57887b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b.a */
public final class C57868a implements AbstractC57874d {

    /* renamed from: a */
    public AbstractC57886a f131936a = ((AbstractC57886a) C34507d.m70492a(C17867d.m33078a(), AbstractC57886a.class));

    /* renamed from: b */
    private AbstractC57863a f131937b = new AbstractC57863a() {
        /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3370b.C57868a.C578691 */

        static {
            Covode.recordClassIndex(67879);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a.AbstractC57863a
        /* renamed from: a */
        public final Long mo95168a() {
            return Long.valueOf(C57868a.this.f131936a.mo60952b());
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a.AbstractC57863a
        /* renamed from: c */
        public final void mo95171c(long j) {
            C57868a.this.f131936a.mo60953b(j);
        }
    };

    /* renamed from: c */
    private AbstractC57863a f131938c = new AbstractC57863a() {
        /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3370b.C57868a.C578702 */

        static {
            Covode.recordClassIndex(67880);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a.AbstractC57863a
        /* renamed from: a */
        public final Long mo95168a() {
            return Long.valueOf(C57868a.this.f131936a.mo60950a());
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a.AbstractC57863a
        /* renamed from: c */
        public final void mo95171c(long j) {
            C57868a.this.f131936a.mo60951a(j);
        }
    };

    static {
        Covode.recordClassIndex(67878);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.AbstractC57874d
    /* renamed from: a */
    public final boolean mo95173a() {
        if (!TimeLockRuler.isRuleValid() || !TimeLockRuler.isTimeLockOn()) {
            return false;
        }
        long c = (long) C57872c.m104624c();
        if (c < 0 || !this.f131938c.mo95170b(System.currentTimeMillis())) {
            return false;
        }
        if (this.f131937b.mo95170b(System.currentTimeMillis())) {
            this.f131936a.mo60955c(0);
            this.f131937b.mo95169a(System.currentTimeMillis());
        }
        long c2 = this.f131936a.mo60954c() + c;
        this.f131936a.mo60955c(c2);
        C57862a.m104609a();
        int lockTimeInMin = TimeLockRuler.getLockTimeInMin() * 60 * 1000;
        if (C57862a.m104610b()) {
            lockTimeInMin /= 10;
        }
        if (c2 <= ((long) lockTimeInMin)) {
            return false;
        }
        AbstractC88979t.m154310b("").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new AbstractC88986z<String>() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3370b.C57868a.C578713 */

            static {
                Covode.recordClassIndex(67881);
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
                C57887b.m104657a((AbstractC34709b<Boolean>) null, str);
            }
        });
        return false;
    }
}
