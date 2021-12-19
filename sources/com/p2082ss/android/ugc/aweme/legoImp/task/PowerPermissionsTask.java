package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpermissions.AbstractC17764e;
import com.bytedance.ies.powerpermissions.C17766g;
import com.bytedance.ies.powerpermissions.C17773l;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask */
public final class PowerPermissionsTask implements IGetInterceptor, AbstractC58264w {
    static {
        Covode.recordClassIndex(68567);
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

    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    /* renamed from: a */
    public final List<AbstractC17764e> mo28217a() {
        return C89070n.m154524c(new C17766g());
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    public static IGetInterceptor m106298c() {
        MethodCollector.m26663i(1509);
        Object a = C81908b.m141854a(IGetInterceptor.class, false);
        if (a != null) {
            IGetInterceptor iGetInterceptor = (IGetInterceptor) a;
            MethodCollector.m26664o(1509);
            return iGetInterceptor;
        }
        if (C81908b.f183290cn == null) {
            synchronized (IGetInterceptor.class) {
                try {
                    if (C81908b.f183290cn == null) {
                        C81908b.f183290cn = new PowerPermissionsTask();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1509);
                    throw th;
                }
            }
        }
        PowerPermissionsTask powerPermissionsTask = (PowerPermissionsTask) C81908b.f183290cn;
        MethodCollector.m26664o(1509);
        return powerPermissionsTask;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C17773l.f42440d.mo28244a();
    }
}
