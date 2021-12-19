package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34712a;
import com.p2082ss.android.ugc.aweme.experiment.C46917ex;
import com.p2082ss.android.ugc.aweme.experiment.C46918ey;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2436cc.C35437e;
import com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35424a;
import com.p2082ss.android.ugc.aweme.p2436cc.p2437a.C35428d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPageMonitorTask */
public final class InitPageMonitorTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68482);
    }

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
        return EnumC58151ae.MAIN;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (C46918ey.f109338a && context != null) {
            C35437e eVar = new C35437e();
            Application application = (Application) context;
            C89219l.m154721d(application, "");
            C34712a.m70901a(new C35437e.C35438a(eVar));
            application.registerActivityLifecycleCallbacks(new C35437e.C35439b(eVar));
            if (C46917ex.f109335a) {
                AbstractC35424a aVar = C35428d.f83583b;
                if (aVar != null) {
                    aVar.mo62328a(null);
                }
                eVar.mo62328a(C35428d.f83582a);
                C35428d.f83583b = eVar;
            }
        }
    }
}
