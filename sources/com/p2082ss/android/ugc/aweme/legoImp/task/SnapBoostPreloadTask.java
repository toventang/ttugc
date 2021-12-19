package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.common.p894a.p896b.C13483a;
import com.bytedance.common.p894a.p897c.C13492b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.AbstractC46931fh;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SnapBoostPreloadTask */
public class SnapBoostPreloadTask implements AbstractC58264w {

    /* renamed from: a */
    public static String f132950a = "snapboost";

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
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
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(68610);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        AbstractC46931fh.m90227a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            C13483a.m24248a(context, true);
            if (AbstractC46931fh.m90228b()) {
                C13492b.m24266a("snapboost_list.txt").mo21763b();
            }
            if (C67214a.m119164n() != 0) {
                C13492b.m24266a("snapboost_list_second_page.txt").mo21763b();
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin() && !C80580in.m139689d()) {
            C39162r.m79460a("tool_performance_profile_editor", new C33744d().mo59981a("commit_took", uptimeMillis2).mo59980a("commit_id", 1).mo59980a("commit_result", 0).f79943a);
        }
    }
}
