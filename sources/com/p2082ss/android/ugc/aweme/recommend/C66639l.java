package com.p2082ss.android.ugc.aweme.recommend;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUsersDialogViewModel;
import com.p2082ss.android.ugc.aweme.recommend.View$OnClickListenerC66629k;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.l */
public final class C66639l {

    /* renamed from: a */
    static C66640m f149799a;

    /* renamed from: b */
    public static volatile boolean f149800b;

    /* renamed from: c */
    public static final C66639l f149801c = new C66639l();

    private C66639l() {
    }

    static {
        Covode.recordClassIndex(78197);
    }

    /* renamed from: a */
    private static boolean m118408a() {
        if (m118409a(1) || m118409a(2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m118409a(int i) {
        AbstractC51649b s = C51648a.f118980a.mo87339s();
        if (s != null) {
            C89378p<Boolean, Long> b = s.mo87358b(i);
            if (!b.getFirst().booleanValue() || System.currentTimeMillis() >= b.getSecond().longValue() + 259200000) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m118407a(C66640m mVar) {
        List<User> recommendUsers;
        C89219l.m154721d(mVar, "");
        Object obj = mVar.f149802a.get();
        if (!(obj instanceof ActivityC0945e)) {
            obj = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) obj;
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                if (!C66642o.m118411a()) {
                    m118406a(eVar, false);
                    return;
                } else if (!RecommendUserDialogTask.f149735b.get()) {
                    f149799a = mVar;
                    return;
                } else {
                    RecommendUserDialogList recommendUserDialogList = RecommendUserDialogTask.f149736c;
                    if (recommendUserDialogList == null || (recommendUsers = recommendUserDialogList.getRecommendUsers()) == null || recommendUsers.isEmpty()) {
                        m118406a(eVar, false);
                        return;
                    } else if (!C66643p.m118416a()) {
                        m118406a(eVar, false);
                        return;
                    } else if (m118408a()) {
                        m118406a(eVar, false);
                        return;
                    } else if (eVar != null) {
                        m118406a(eVar, true);
                        AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                        C89219l.m154716b(supportFragmentManager, "");
                        View$OnClickListenerC66629k.C66630a.m118402a(supportFragmentManager, recommendUserDialogList, mVar.f149803b, mVar.f149804c);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        m118406a(eVar, false);
    }

    /* renamed from: a */
    static void m118406a(ActivityC0945e eVar, boolean z) {
        if (eVar != null) {
            RecommendUsersDialogViewModel.C66613a.m118371a(eVar).f149745a.postValue(Boolean.valueOf(z));
        }
    }
}
