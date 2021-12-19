package com.p2082ss.android.ugc.aweme;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.experiment.C46893en;
import com.p2082ss.android.ugc.aweme.journey.C56878s;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.newuser.NewUserImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.cm */
public class ActivityC36140cm extends ActivityC17312a {

    /* renamed from: a */
    protected int f85368a;

    /* renamed from: b */
    protected boolean f85369b;

    /* renamed from: c */
    protected boolean f85370c;

    /* renamed from: d */
    AbstractC88412b f85371d;

    /* renamed from: e */
    protected boolean f85372e = true;

    /* renamed from: f */
    private boolean f85373f;

    static {
        Covode.recordClassIndex(43393);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo63258a() {
        if (this.f85368a > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_launch_focus_to_finish", false);
        Log.getStackTraceString(new RuntimeException("NewUserLaunchActivity finish:"));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        super.onPause();
        if (!mo63258a() || isFinishing()) {
            C58945a aVar = C58945a.C58947b.f134185a;
            long uptimeMillis = SystemClock.uptimeMillis();
            aVar.f134174a.put("feed_total", Long.valueOf(uptimeMillis));
            aVar.f134175b.put("feed_total", Long.valueOf(uptimeMillis));
        }
    }

    /* renamed from: a */
    private void m73620a(boolean z) {
        if (TextUtils.isEmpty(C18205a.m33878a())) {
            this.f85371d = C18205a.m33881d().mo143268a(C36143cn.f85378a).mo143276b(1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C36146co(this, z), C40239cp.f94449a);
        } else {
            new C58221f.C58223b().mo95701b(C40313cq.f94478a.mo60095d()).mo95706a();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_resume_to_focus_changed", false);
        super.onWindowFocusChanged(z);
        C58945a.C58947b.f134185a.f134176c = false;
        C58945a.C58947b.f134185a.f134180g = false;
        C58945a.C58947b.f134185a.f134178e = true;
        if (z && !C58945a.C58947b.f134185a.mo96430b("app_start_to_main_focus")) {
            C58945a.C58947b.f134185a.mo96429b("app_start_to_main_focus", true);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_launch_focus_to_finish", false);
        }
        if (!this.f85373f && z && C46893en.m90196a()) {
            NewUserImpl.m111404b().mo95586a();
            this.f85373f = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63257a(Boolean bool) {
        if (this.f85368a == 2) {
            Intent intent = getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(this, C40313cq.f94478a.mo60097f());
            intent.setFlags(335544320);
            intent.putExtra("from_new_user_journey", true);
            intent.putExtra("reorder_new_journey_front", false);
            Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
            m73619a(this, intent);
            C56878s.f129535a = true;
        } else if (bool.booleanValue()) {
            Intent intent2 = getIntent();
            if (intent2 == null) {
                intent2 = new Intent();
            }
            intent2.setClass(this, C40313cq.f94478a.mo60097f());
            intent2.setFlags(335544320);
            m73619a(this, intent2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ActivityC36140cm.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static void m73619a(ActivityC36140cm cmVar, Intent intent) {
        C84349a.m145093a(intent, cmVar);
        cmVar.startActivity(intent);
    }
}
