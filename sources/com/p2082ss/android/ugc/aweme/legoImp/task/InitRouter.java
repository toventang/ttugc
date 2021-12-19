package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.C17740d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.router.IRouterInjectInitializer;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2330h.C33758a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36124s;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitRouter */
public class InitRouter implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68493);
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C67214a.m119153c()) {
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
        C58945a.C58947b.f134185a.mo96425a("method_init_smart_router_duration", false);
        C36125t.f85341a.add(new C36124s());
        C36125t.m73592a(C17879g.m33104a());
        C36125t.m73591a();
        C36125t.f85342b = new C33758a();
        SmartRouter.init(C17867d.m33078a());
        SmartRouter.configRouter("snssdk1180").withOtherSchemes(new String[]{"aweme", "sslocal"});
        if (!C58152b.m105087e()) {
            RouterAnchorPoint.getPoint().run(new Object());
            if (C58195d.m105111d()) {
                C17740d.f42407a.mo28216a();
            }
            SmartRouter.canOpen(null);
        } else {
            SmartRouter.injectInitializer(new IRouterInjectInitializer() {
                /* class com.p2082ss.android.ugc.aweme.legoImp.task.InitRouter.C583521 */

                static {
                    Covode.recordClassIndex(68494);
                }

                @Override // com.bytedance.router.IRouterInjectInitializer
                public final void injectInitialize() {
                    RouterAnchorPoint.getPoint().run(new Object());
                    C17740d.f42407a.mo28216a();
                }
            });
        }
        C58945a.C58947b.f134185a.mo96429b("method_init_smart_router_duration", false);
    }
}
