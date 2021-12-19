package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2640d.C39239a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.statistic.C75236b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppLogInitTask */
public final class AppLogInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68401);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppLogInitTask$a */
    public static final class C58309a implements AppLog.AbstractC29764j {
        static {
            Covode.recordClassIndex(68402);
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
        /* renamed from: a */
        public final void mo52027a(List<Long> list) {
            C89219l.m154721d(list, "");
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
        public final void onEventExpired(List<Long> list) {
            C89219l.m154721d(list, "");
        }

        C58309a() {
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29764j
        /* renamed from: a */
        public final void mo52026a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C89219l.m154714a((Object) "terminate", (Object) str)) {
                C33830n.m70668a("type_app_log_state_change", new C33743c().mo59976a("data_source", str).mo59976a("session_id", str2).mo59974a("is_success", (Integer) 1).mo59976a("eventIndex", (String) null).mo59976a("error_message", str3).mo59977a());
            }
        }
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
        boolean c;
        List<String> list;
        C89219l.m154721d(context, "");
        if (C58195d.m105114g()) {
            AppLog.registerLogRequestCallback(new C58309a());
            if (C39223a.m79603q().mo68633d()) {
                c = C39239a.m79629c();
            } else {
                c = C80580in.m139687c();
            }
            AppLog.setChildModeBeforeInit(c);
            if (c) {
                list = C39223a.m79603q().mo68631c();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            Application a = C17879g.m33104a();
            C89219l.m154716b(a, "");
            C75236b.m132016a(a);
        }
    }
}
