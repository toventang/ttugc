package com.p2082ss.android.ugc.aweme.statistic;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.statisticlogger.config.AbstractC18225d;
import com.bytedance.ies.ugc.statisticlogger.config.C18220b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46783ca;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.statistic.b */
public final class C75236b {

    /* renamed from: com.ss.android.ugc.aweme.statistic.b$b */
    public static final class C75238b extends AbstractC18225d {

        /* renamed from: b */
        final /* synthetic */ Application f169150b;

        static {
            Covode.recordClassIndex(88131);
        }

        /* renamed from: com.ss.android.ugc.aweme.statistic.b$b$a */
        public static final class C75239a implements AbstractC18225d.AbstractC18226a {
            static {
                Covode.recordClassIndex(88132);
            }

            C75239a() {
            }

            @Override // com.bytedance.ies.ugc.statisticlogger.config.AbstractC18225d.AbstractC18226a
            /* renamed from: a */
            public final AbstractC13621j mo29088a() {
                return new AppLogNetworkClient();
            }
        }

        @Override // com.bytedance.ies.ugc.statisticlogger.config.AbstractC18225d
        /* renamed from: a */
        public final AbstractC18225d.AbstractC18226a mo29086a() {
            return new C75239a();
        }

        @Override // com.bytedance.ies.ugc.statisticlogger.config.AbstractC18225d
        /* renamed from: b */
        public final boolean mo29087b() {
            if (C46796cm.f109016a) {
                return ((Boolean) C46783ca.f109002a.getValue()).booleanValue();
            }
            if (!C16048b.m29633a().mo25421a(false, "disable_mt_log_frequency_control", false)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75238b(Application application, Application application2) {
            super(application2);
            this.f169150b = application;
        }
    }

    static {
        Covode.recordClassIndex(88129);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.statistic.b$a */
    public static final class CallableC75237a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Application f169149a;

        static {
            Covode.recordClassIndex(88130);
        }

        CallableC75237a(Application application) {
            this.f169149a = application;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bundle bundle = new Bundle();
            if (C29843f.m60129a(this.f169149a)) {
                bundle.putString("web_ua", RawURLGetter.m77316a("other"));
            }
            if (C29843f.m60129a(this.f169149a)) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                bundle.putInt("user_mode", curUser.getUserMode());
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                User curUser2 = g2.getCurUser();
                C89219l.m154716b(curUser2, "");
                bundle.putInt("user_period", curUser2.getUserPeriod());
                bundle.putInt("is_kids_mode", C80580in.m139687c() ? 1 : 0);
                bundle.putInt("filter_warn", C39223a.m79601o().mo68705b());
            }
            AppLog.setCustomerHeader(bundle);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m132016a(Application application) {
        C89219l.m154721d(application, "");
        try {
            C1731i.m5640b(new CallableC75237a(application), C1731i.f5562a);
            C18220b.m33919a(new C75238b(application, application));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
