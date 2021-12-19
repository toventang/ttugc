package com.p2082ss.android.ugc.aweme.friends.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.friends.service.IFollowService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63849o;

/* renamed from: com.ss.android.ugc.aweme.friends.services.FollowService */
public class FollowService implements IFollowService {
    static {
        Covode.recordClassIndex(61002);
    }

    public static IFollowService createIFollowServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(11629);
        Object a = C81908b.m141854a(IFollowService.class, z);
        if (a != null) {
            IFollowService iFollowService = (IFollowService) a;
            MethodCollector.m26664o(11629);
            return iFollowService;
        }
        if (C81908b.f183241br == null) {
            synchronized (IFollowService.class) {
                try {
                    if (C81908b.f183241br == null) {
                        C81908b.f183241br = new FollowService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11629);
                    throw th;
                }
            }
        }
        FollowService followService = (FollowService) C81908b.f183241br;
        MethodCollector.m26664o(11629);
        return followService;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService
    public void sendRequest(String str, String str2, int i, IFollowService.AbstractC51636a aVar) {
        sendRequest(str, str2, i, 0, aVar);
    }

    public void sendRequest(String str, String str2, int i, int i2, final IFollowService.AbstractC51636a aVar) {
        C63849o oVar = new C63849o();
        oVar.mo67839a_(new AbstractC63854r() {
            /* class com.p2082ss.android.ugc.aweme.friends.services.FollowService.C516511 */

            static {
                Covode.recordClassIndex(61003);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: c */
            public final void mo71321c(FollowStatus followStatus) {
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: b */
            public final void mo71320b(FollowStatus followStatus) {
                IFollowService.AbstractC51636a aVar = aVar;
                if (aVar != null) {
                    aVar.mo87342a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
            /* renamed from: d_ */
            public final void mo71322d_(Exception exc) {
                IFollowService.AbstractC51636a aVar = aVar;
                if (aVar != null) {
                    aVar.mo87343a(exc);
                }
            }
        });
        oVar.mo87469a(new C63847n.C63848a().mo103320a(str).mo103325b(str2).mo103318a(i).mo103324b(i2).mo103323a());
    }
}
