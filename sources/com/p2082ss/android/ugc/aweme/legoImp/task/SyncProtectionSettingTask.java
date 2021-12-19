package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SyncProtectionSettingTask */
public final class SyncProtectionSettingTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68622);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.SyncProtectionSettingTask$a */
    public static final class C58402a implements AbstractC39286a {

        /* renamed from: a */
        final /* synthetic */ SyncProtectionSettingTask f132959a;

        static {
            Covode.recordClassIndex(68623);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68715a() {
            SyncProtectionSettingTask.m106627c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58402a(SyncProtectionSettingTask syncProtectionSettingTask) {
            this.f132959a = syncProtectionSettingTask;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68716a(Exception exc) {
            C89219l.m154721d(exc, "");
            SyncProtectionSettingTask.m106627c();
        }
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static void m106627c() {
        String str;
        String str2;
        String str3 = "on";
        if (C39223a.m79601o().mo68706c()) {
            str = str3;
        } else {
            str = "off";
        }
        if (C39223a.m79601o().mo68703a()) {
            str2 = str3;
        } else {
            str2 = "off";
        }
        if (!(C39223a.m79602p().mo68649a() == IFamilyPairingService.EnumC39276a.CHILD || C39223a.m79602p().mo68649a() == IFamilyPairingService.EnumC39276a.PARENT)) {
            str3 = "off";
        }
        int i = C58418ac.f133008a[C39223a.m79602p().mo68649a().ordinal()];
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = 0;
        }
        C39162r.m79460a("time_lock_status", new C33744d().mo59983a("status", str).f79943a);
        C39162r.m79460a("teen_mode_status", new C33744d().mo59983a("status", str2).f79943a);
        C39162r.m79460a("kid_platform_status", new C33744d().mo59983a("status", str3).mo59980a("role", i2).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            C39223a.m79601o().mo68702a(new C58402a(this));
        }
    }
}
