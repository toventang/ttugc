package com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80183a;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80184b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.HackActivityThreadH */
public class HackActivityThreadH implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68667);
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        try {
            Reflect call = Reflect.m24528on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            if (call != null) {
                Handler handler = (Handler) call.field("mH", Class.forName("android.app.ActivityThread$H")).get();
                if (handler != null) {
                    Reflect on = Reflect.m24529on(handler);
                    C80184b.C80185a aVar = new C80184b.C80185a(handler, (Handler.Callback) on.field("mCallback", Handler.Callback.class).get());
                    aVar.f179637c.add(new C80183a());
                    on.set("mCallback", aVar);
                }
            }
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }
}
