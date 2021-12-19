package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.metrics.C59221ap;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl */
public final class LogHelperImpl implements LogHelper {
    static {
        Covode.recordClassIndex(45619);
    }

    /* renamed from: a */
    public static LogHelper m77303a() {
        MethodCollector.m26663i(2645);
        Object a = C81908b.m141854a(LogHelper.class, false);
        if (a != null) {
            LogHelper logHelper = (LogHelper) a;
            MethodCollector.m26664o(2645);
            return logHelper;
        }
        if (C81908b.f183186ap == null) {
            synchronized (LogHelper.class) {
                try {
                    if (C81908b.f183186ap == null) {
                        C81908b.f183186ap = new LogHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2645);
                    throw th;
                }
            }
        }
        LogHelperImpl logHelperImpl = (LogHelperImpl) C81908b.f183186ap;
        MethodCollector.m26664o(2645);
        return logHelperImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66430a(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", "normal_type");
        C39162r.m79460a("live_merge_show", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66431a(String str, RecyclerView recyclerView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(recyclerView, "");
        C80330da.C80331a.m139266a(str).mo123698a(recyclerView);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: b */
    public final void mo66436b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", str2);
        C39162r.m79460a("enter_live_merge", hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: c */
    public final void mo66437c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C59206ab.m108755a("follow_approve").mo96746b("enter_from", str).mo96746b("to_user_id", str2).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: d */
    public final void mo66438d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C59206ab.m108755a("follow_refuse").mo96746b("enter_from", str).mo96746b("to_user_id", str2).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66432a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C59221ap apVar = new C59221ap(str);
        apVar.f134950aa = str2;
        apVar.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66433a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C59252q qVar = (C59252q) new C59252q().mo96825o(str).mo96741a(str3);
        qVar.f135314q = str2;
        qVar.f135288ab = -2;
        qVar.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66429a(Context context, String str, String str2, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        C77354d.m135256a(1, str2, j, C77354d.m135255a("message", "head", str));
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66434a(String str, String str2, String str3, String str4, String str5, String str6) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C59260v a = new C59260v(str).mo96847a(str2);
        a.f135405e = str3;
        a.f135402b = str4;
        a.f135403c = str5;
        a.f135411u = str6;
        a.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper
    /* renamed from: a */
    public final void mo66435a(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C59260v a = new C59260v().mo96847a(str);
        a.f135402b = str2;
        a.f135403c = str3;
        a.f135409s = str4;
        a.f135405e = str5;
        a.f135412v = str6;
        a.f135376aa = i;
        a.mo96792f();
    }
}
