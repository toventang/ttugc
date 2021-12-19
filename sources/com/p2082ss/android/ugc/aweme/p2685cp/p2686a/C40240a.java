package com.p2082ss.android.ugc.aweme.p2685cp.p2686a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1519e.AbstractC21181a;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium;
import com.p2082ss.android.agilelogger.ALog;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cp.a.a */
public final class C40240a extends AbstractC21181a {
    static {
        Covode.recordClassIndex(48041);
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.a.a$a */
    static final class C40241a implements LynxHelium.ErrorHandler {

        /* renamed from: a */
        public static final C40241a f94450a = new C40241a();

        static {
            Covode.recordClassIndex(48042);
        }

        C40241a() {
        }

        @Override // com.lynx.tasm.behavior.p2052ui.canvas.LynxHelium.ErrorHandler
        public final void onReceivedError(C28816j jVar) {
            ALog.m59866e("LynxCanvas", jVar.toString());
        }
    }

    @Override // com.bytedance.lynx.hybrid.p1519e.AbstractC21181a
    /* renamed from: a */
    public final void mo34741a(Application application, AbstractC28773f fVar) {
        C89219l.m154721d(application, "");
        LynxHelium.getInstance().setSmashUrlFallback("https://sf16-muse-va.ibytedtos.com/obj/developer-alisg/misc/", true);
        LynxHelium.getInstance().init(application, fVar, C40241a.f94450a, null);
        LynxEnv b = LynxEnv.m56706b();
        C89219l.m154716b(b, "");
        b.f66650q = LynxHelium.getInstance();
    }
}
