package com.p2082ss.android.ugc.aweme.request_combine.request.p3678a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46639a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.f */
public final class C67144f implements AbstractC58259r {

    /* renamed from: a */
    private int f150558a = 1;

    static {
        Covode.recordClassIndex(78747);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.IDLE;
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
    public static void m118840c() {
        String str;
        if (C39223a.m79590d().mo68623h() == 1) {
            str = "on";
        } else {
            str = "off";
        }
        C39162r.m79460a("tns_remove_photosensitive_status", new C33744d().mo59983a("status", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.f$a */
    public static final class C67145a implements AbstractC68342a {

        /* renamed from: a */
        final /* synthetic */ C67144f f150559a;

        static {
            Covode.recordClassIndex(78748);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67145a(C67144f fVar) {
            this.f150559a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60119a(Exception exc) {
            C89219l.m154721d(exc, "");
            C67144f.m118840c();
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60118a(C68348f fVar) {
            C89219l.m154721d(fVar, "");
            C53603g.C53604a.m98850a();
            C53603g.m98846c(Integer.valueOf(fVar.f152992n));
            boolean z = false;
            SharedPreferences.Editor edit = C34822d.m71158a(C17867d.m33078a(), "imbase_" + C46639a.m90022c(), 0).edit();
            if (fVar.f152992n == 1) {
                z = true;
            }
            edit.putBoolean("key_mt_inner_push_switch_on", z).commit();
            C53603g.C53604a.m98850a();
            C53603g.m98843a(Integer.valueOf(fVar.f152995q));
            C53603g.C53604a.m98850a();
            C53603g.m98847d(Integer.valueOf(fVar.f152983e));
            C53603g.C53604a.m98850a();
            C53603g.m98844b(Integer.valueOf(fVar.f152959V));
            C67144f.m118840c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            SettingsRequestServiceImpl.m65417i().mo57280a(new C67145a(this));
        }
    }
}
