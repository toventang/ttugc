package com.p2082ss.android.ugc.aweme.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.task.ColdLoggerAttachBaseTask */
public final class ColdLoggerAttachBaseTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(90773);
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
        long currentTimeMillis = System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("app_start_v2_to_v1", true);
        C58945a.C58947b.f134185a.mo96425a("feed_boot_to_feed_request", true);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_application_attach_duration", true);
        C58945a.C58947b.f134185a.mo96425a("feed_cover_total", false);
        C58945a.C58947b.f134185a.mo96425a("feed_total", true);
        C58945a.C58947b.f134185a.mo96425a("app_start_to_main_focus", true);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_start_to_feed_ui", false);
        C58945a.C58947b.f134185a.mo96425a("feed_boot_to_network", false);
        C58945a.C58947b.f134185a.mo96425a("feed_boot_to_init_ttnet", false);
        C58945a.C58947b.f134185a.mo96425a("feed_boot_to_init_ttnet_end", false);
        C58945a.C58947b.f134185a.mo96425a("app_start_to_preload_first_request", false);
        C58945a.C58947b.f134185a.mo96425a("app_start_to_get_did", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_start_to_feed_player", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_start_to_precreate", false);
        C58945a.C58947b.f134185a.f134181h = currentTimeMillis;
        C58945a.C58947b.f134185a.mo96423a("cold_boot_begin_time", currentTimeMillis);
    }
}
