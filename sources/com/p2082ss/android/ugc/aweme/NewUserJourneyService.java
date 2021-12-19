package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.interest.UpdateInterestActivity;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.ActivityC56847ag;
import com.p2082ss.android.ugc.aweme.journey.C56841ab;
import com.p2082ss.android.ugc.aweme.journey.C57056y;
import com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.p2082ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.NewUserJourneyService */
public final class NewUserJourneyService implements INewUserJourneyService {
    static {
        Covode.recordClassIndex(37970);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final boolean mo57267a(boolean z) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final AbstractC58259r mo57261a() {
        return new C57056y();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: b */
    public final void mo57268b() {
        if (!C40317cr.f94481b) {
            C40317cr.f94480a.storeLong("last_open_time", System.currentTimeMillis());
            C40317cr.f94481b = true;
        }
    }

    /* renamed from: c */
    public static INewUserJourneyService m65387c() {
        MethodCollector.m26663i(4196);
        Object a = C81908b.m141854a(INewUserJourneyService.class, false);
        if (a != null) {
            INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) a;
            MethodCollector.m26664o(4196);
            return iNewUserJourneyService;
        }
        if (C81908b.f183408q == null) {
            synchronized (INewUserJourneyService.class) {
                try {
                    if (C81908b.f183408q == null) {
                        C81908b.f183408q = new NewUserJourneyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4196);
                    throw th;
                }
            }
        }
        NewUserJourneyService newUserJourneyService = (NewUserJourneyService) C81908b.f183408q;
        MethodCollector.m26664o(4196);
        return newUserJourneyService;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final Class<? extends Activity> mo57262a(Intent intent) {
        C89219l.m154721d(intent, "");
        intent.putExtra("redirect_from_main", true);
        return ActivityC56847ag.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final AbstractC56869p mo57260a(int i) {
        if (i == 1) {
            return new C36135cl();
        }
        if (i == 2) {
            return new C40924da();
        }
        if (i == 3) {
            return new C56841ab();
        }
        throw new IllegalArgumentException("Can't getJourneyStrategyImpl !");
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: b */
    public final boolean mo57269b(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || AbstractC56869p.C56870a.m103133a().mo63252c() != 1 || NewUserJourneyActivity.f129388h) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57265a(Context context) {
        C89219l.m154721d(context, "");
        Intent intent = new Intent(context, UpdateInterestActivity.class);
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final boolean mo57266a(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || AbstractC56869p.C56870a.m103133a().mo63252c() != 1 || NewUserJourneyActivity.f129388h) {
            return false;
        }
        NewUserJourneyActivity.C56817a.m103084a(activity, false, false);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57263a(Activity activity, Intent intent) {
        if (intent != null && activity != null && intent.getBooleanExtra("reorder_new_journey_front", false) && !Keva.getRepo("new_user_journey").getBoolean("disable_reorder_new_journey", false)) {
            intent.setClassName(activity, NewUserJourneyActivity.class.getName());
            intent.setFlags(131072);
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }
        Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57264a(Activity activity, boolean z, boolean z2) {
        C89219l.m154721d(activity, "");
        NewUserJourneyActivity.C56817a.m103084a(activity, z, z2);
    }
}
