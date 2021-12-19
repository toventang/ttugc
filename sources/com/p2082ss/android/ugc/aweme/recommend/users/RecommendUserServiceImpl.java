package com.p2082ss.android.ugc.aweme.recommend.users;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.widget.C34746c;
import com.p2082ss.android.ugc.aweme.base.widget.C34752d;
import com.p2082ss.android.ugc.aweme.base.widget.C34758f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51704aw;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66617b;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66620d;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66742k;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl */
public final class RecommendUserServiceImpl implements RecommendUserService {
    static {
        Covode.recordClassIndex(78214);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: a */
    public final /* synthetic */ Fragment mo105665a() {
        return new C66742k();
    }

    /* renamed from: b */
    public static RecommendUserService m118456b() {
        MethodCollector.m26663i(7295);
        Object a = C81908b.m141854a(RecommendUserService.class, false);
        if (a != null) {
            RecommendUserService recommendUserService = (RecommendUserService) a;
            MethodCollector.m26664o(7295);
            return recommendUserService;
        }
        if (C81908b.f183333dd == null) {
            synchronized (RecommendUserService.class) {
                try {
                    if (C81908b.f183333dd == null) {
                        C81908b.f183333dd = new RecommendUserServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7295);
                    throw th;
                }
            }
        }
        RecommendUserServiceImpl recommendUserServiceImpl = (RecommendUserServiceImpl) C81908b.f183333dd;
        MethodCollector.m26664o(7295);
        return recommendUserServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: b */
    public final AbstractC66620d mo105669b(Context context) {
        C89219l.m154721d(context, "");
        return new C34758f(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: a */
    public final AbstractC66617b mo105668a(Context context) {
        C89219l.m154721d(context, "");
        return new C34752d(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: a */
    public final View mo105664a(Context context, HashMap<String, Boolean> hashMap) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        return new C51704aw(context, hashMap, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: a */
    public final InboxAdapterWidget mo105666a(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        return new RecommendUserAdapterWidget(fragment, liveData);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService
    /* renamed from: a */
    public final AbstractC66614a mo105667a(Context context, int i) {
        C89219l.m154721d(context, "");
        return new C34746c(context, i, (byte) 0);
    }
}
