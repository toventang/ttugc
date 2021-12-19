package com.p2082ss.android.legoimpl;

import android.content.Context;
import com.bytedance.apm.C12255a;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.config.C12419c;
import com.bytedance.apm.core.AbstractC12436b;
import com.bytedance.apm.p775g.AbstractC12474b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.app.launch.C33804a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.legoimpl.ProcessMonitorTask */
public final class ProcessMonitorTask implements AbstractC58264w {

    /* renamed from: a */
    public final Map<Integer, String> f71456a = C89041ag.m154427b(new C89378p(0, "Cold_Boot_Begin"), new C89378p(1, "Cold_Boot_End"), new C89378p(2, "Cold_Boot_End_Short"), new C89378p(3, "Cold_Boot_End_Long"));

    static {
        Covode.recordClassIndex(36383);
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

    /* renamed from: com.ss.android.legoimpl.ProcessMonitorTask$a */
    public static final class C29958a implements AbstractC12436b {
        static {
            Covode.recordClassIndex(36384);
        }

        @Override // com.bytedance.apm.core.AbstractC12436b
        /* renamed from: b */
        public final String mo20251b() {
            return "";
        }

        @Override // com.bytedance.apm.core.AbstractC12436b
        /* renamed from: c */
        public final long mo20252c() {
            return 0;
        }

        C29958a() {
        }

        @Override // com.bytedance.apm.core.AbstractC12436b
        /* renamed from: a */
        public final Map<String, String> mo20250a() {
            HashMap hashMap = new HashMap();
            C29803q.m60037b(hashMap, true);
            return hashMap;
        }
    }

    /* renamed from: com.ss.android.legoimpl.ProcessMonitorTask$b */
    public static final class C29959b implements AbstractC12474b {
        static {
            Covode.recordClassIndex(36385);
        }

        @Override // com.bytedance.apm.p775g.AbstractC12474b
        /* renamed from: a */
        public final void mo20294a() {
        }

        C29959b() {
        }
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
        if (!C58227a.m105170a(context)) {
            if (context != null) {
                C12255a.C12259a.f29537a.mo19750a(context);
                C12419c.C12420a aVar = new C12419c.C12420a();
                C12419c.C12420a a = aVar.mo20212a("aid", C17867d.f42590n);
                a.f30121q = new C29958a();
                a.f30125u = new C29959b();
                C12255a.C12259a.f29537a.mo19751a(aVar.mo20215a());
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("process_name", C58227a.m105171b(context) + "_" + this.f71456a.get(Integer.valueOf(C33804a.m69167a().getInt("runstate", 0))));
            C12290b.m22066a("control_process_init_event", jSONObject2, jSONObject, (JSONObject) null);
        }
    }
}
