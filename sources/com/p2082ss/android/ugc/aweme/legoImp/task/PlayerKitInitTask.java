package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2397bm.C34887a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.video.C80938q;
import com.p2082ss.android.ugc.aweme.video.C80941s;
import com.p2082ss.android.ugc.aweme.video.C81073t;
import com.p2082ss.android.ugc.aweme.video.C81074u;
import com.p2082ss.android.ugc.aweme.video.RunnableC80940r;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.p2082ss.android.ugc.playerkit.p4323c.C84184b;
import com.p2082ss.android.ugc.playerkit.videoview.EnumC84263d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask */
public class PlayerKitInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68562);
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
        return EnumC58151ae.BACKGROUND;
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
        C58945a.C58947b.f134185a.mo96425a("method_init_player_kit_duration", false);
        boolean h = C67214a.m119158h();
        AbstractC58264w t = C58420ae.m106852t();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_start_to_feed_player", false);
        C58945a.C58947b.f134185a.mo96425a("player_init_to_precreate", false);
        C80938q.f180974b = h;
        if (h) {
            AbstractC74616d.m131036a().mo117288a();
        } else {
            C80938q.f180973a = new SimKitConfigImpl();
            AbstractC74616d.m131036a().mo117289a(C17867d.m33078a(), C80938q.f180973a);
        }
        C40780g.m82241a().execute(new RunnableC80940r(t));
        EnumC84263d.INSTANCE.setBitrateManager(AbstractC74616d.m131036a().mo117291c()).setHttpsHelper(C80941s.f180976a).setPlayUrlBuilder(C81073t.f181198a).setCacheChecker(C81074u.f181199a).setPlayInfoCallback(ISimPlayerService$$CC.get$$STATIC$$().mo124401b());
        C84184b.f187862a = false;
        C84184b.f187865d = new C34887a();
        C62960a.f142908b = new C62960a.AbstractC62961a() {
            /* class com.p2082ss.android.ugc.aweme.video.C80938q.C809391 */

            static {
                Covode.recordClassIndex(94241);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.C62960a.AbstractC62961a
            /* renamed from: a */
            public final void mo100942a(Throwable th, String str) {
                C22708a.m42803a(th, str);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.C62960a.AbstractC62961a
            /* renamed from: a */
            public final void mo100941a(String str, String str2) {
                if (C80695q.m139908a()) {
                    C51423a.m95784a(6, str, str2);
                }
            }
        };
        C58945a.C58947b.f134185a.mo96429b("method_init_player_kit_duration", false);
    }
}
