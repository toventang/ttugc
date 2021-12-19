package com.p2082ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.application.AwemeApplicationImpl;
import com.p2082ss.android.ugc.aweme.experiment.C47029j;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.AppAttachUserStoreOptTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.application.e */
public final class C33900e {
    static {
        Covode.recordClassIndex(40818);
    }

    public static List<AbstractC58252n> attachBaseContextAfterMultiDex(AwemeApplicationImpl awemeApplicationImpl) {
        if (C58221f.m105150b()) {
            awemeApplicationImpl.f80187f = new AwemeApplicationImpl.BeforeSuperOnCreateLegoTasks();
            awemeApplicationImpl.f80186e = new AwemeApplicationImpl.OnCreateLegoTasks();
            C58221f.m105153e().mo95704a(C58420ae.m106849q()).mo95704a(awemeApplicationImpl.f80187f).mo95704a(awemeApplicationImpl.f80186e).mo95706a();
        }
        C58221f.C58225d e = C58221f.m105153e();
        if (C47029j.m90292b()) {
            e.mo95704a(C58420ae.m106848p());
        }
        if (((Boolean) C67214a.f150647a.getValue()).booleanValue()) {
            e.mo95704a(C58420ae.m106849q()).mo95704a(new AppAttachUserStoreOptTask());
        }
        awemeApplicationImpl.mo60135a(e);
        if (C67214a.m119153c()) {
            e.mo95704a(C58420ae.m106849q()).mo95704a(C58420ae.m106842j());
        }
        if (C67214a.m119155e()) {
            e.mo95704a(C58420ae.m106849q()).mo95704a(C58420ae.m106845m());
        }
        if (C67214a.m119156f()) {
            e.mo95704a(C58420ae.m106849q()).mo95704a(new AppFlyerLoadPropertiesTask());
        }
        e.mo95706a();
        AwemeApplicationImpl.m69370a(awemeApplicationImpl.f80183b.mo60123b());
        return null;
    }
}
