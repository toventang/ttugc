package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77812c;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77813d;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77815f;
import com.p2082ss.android.ugc.aweme.tools.p4082b.p4083a.C77810b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAVModule */
public class InitAVModule implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68465);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 17;
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
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: c */
    public static void m105770c() {
        AVInitializerImpl.m85882a().initMonitor(C17879g.m33104a());
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C67214a.m119155e()) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C58945a.C58947b.f134185a.mo96425a("method_av_module_init_duration", false);
        AVInitializerImpl.m85882a().initialize(C17879g.m33104a());
        if (!C67214a.m119155e()) {
            m105770c();
        }
        C77816g.f174566b = false;
        EnumC77815f fVar = EnumC77815f.MAIN_BUSINESS;
        AbstractC77812c bVar = new C77810b();
        if (C77816g.f174566b) {
            bVar = new C77813d(bVar);
        }
        C77816g.f174565a.put(fVar, bVar);
        C58945a.C58947b.f134185a.mo96429b("method_av_module_init_duration", false);
    }
}
