package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.experiment.C46724b;
import com.p2082ss.android.ugc.aweme.experiment.C46899ep;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65717h;
import com.p2082ss.android.ugc.aweme.services.MainServiceForPush;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPushTask */
public class InitPushTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68491);
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static boolean m105898c() {
        if (C46899ep.m90197a() || C16048b.m29633a().mo25421a(true, "push_init_optimize_enable", false)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        Application a = C17879g.m33104a();
        if (a == null || C29843f.m60129a(a)) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (m105898c()) {
            m105897b(context);
        }
    }

    /* renamed from: b */
    public static void m105897b(Context context) {
        boolean c;
        if (C29843f.m60129a(context)) {
            if (C46724b.f108903d) {
                C80446fr.m139456a(5000);
            }
        } else if (!C65717h.m117632a(context, C29843f.m60132b(context))) {
            return;
        }
        if (C16048b.m29633a().mo25421a(true, "push_childer_mode_optimize_enable", true)) {
            c = C80580in.m139689d();
        } else {
            c = C80580in.m139687c();
        }
        if (!c) {
            C29902a.m60273a().init(context, new MainServiceForPush());
        } else {
            C29902a.m60273a().initMessageDepend();
        }
    }
}
