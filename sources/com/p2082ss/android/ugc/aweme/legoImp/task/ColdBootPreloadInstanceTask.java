package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1007g.C14853c;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask */
public class ColdBootPreloadInstanceTask implements AbstractC58264w {

    /* renamed from: a */
    public static final ColdBootPreloadInstanceTask f132827a = new ColdBootPreloadInstanceTask();

    /* renamed from: b */
    public Fragment f132828b;

    /* renamed from: c */
    public Fragment f132829c;

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(68433);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C67214a.m119167q();
        if (((Boolean) C67214a.f150653g.getValue()).booleanValue() && C14853c.f36267d) {
            try {
                AbstractC56869p.C56870a.m103133a().mo94055h();
            } catch (Throwable unused) {
            }
        }
        if (C67248d.m119176d()) {
            AVExternalServiceImpl.m113114a().specialPlusService();
        }
        if (C67248d.m119175c()) {
            MainPageFragmentImpl.m43110j();
        }
        if (C67248d.m119178f()) {
            this.f132828b = new C50041af();
        }
        if (C67248d.m119179g()) {
            this.f132829c = FollowFeedServiceImpl.m95503c().mo86504b();
        }
    }
}
