package com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.keva.Keva;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.C21680a;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.C21705b;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.InstrumentationC21699a;
import com.bytedance.platform.godzilla.p1575b.p1584c.C21715a;
import com.bytedance.platform.godzilla.p1575b.p1584c.C21716b;
import com.bytedance.platform.godzilla.p1585c.EnumC21720d;
import com.bytedance.platform.godzilla.sysopt.C21729a;
import com.bytedance.platform.godzilla.sysopt.C21730b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.utils.C80207ab;
import com.p2082ss.android.ugc.aweme.utils.C80341df;
import com.p2082ss.android.ugc.aweme.utils.C80402er;
import com.p2082ss.android.ugc.aweme.utils.C80438fm;
import com.p2082ss.android.ugc.aweme.utils.C80469g;
import com.p2082ss.android.ugc.aweme.utils.C80518gx;
import com.p2082ss.android.ugc.aweme.utils.C80521h;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla */
public final class InitGodzilla implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68671);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzilla$a */
    public static final class C58425a implements AbstractC21698a {
        static {
            Covode.recordClassIndex(68672);
        }

        C58425a() {
        }

        @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1579b.AbstractC21698a
        /* renamed from: a */
        public final boolean mo35356a(Object obj, Throwable th) {
            StackTraceElement[] stackTrace;
            String message;
            Thread currentThread = Thread.currentThread();
            if (!(obj == null || th == null || currentThread == null || (stackTrace = currentThread.getStackTrace()) == null || stackTrace.length == 0)) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null && C89219l.m154714a((Object) "android.app.ActivityThread", (Object) stackTraceElement.getClassName()) && (message = th.getMessage()) != null && C89361p.m154908a((CharSequence) message, (CharSequence) "android.os.DeadSystemException", false) && (C89219l.m154714a((Object) "handleCreateService", (Object) stackTraceElement.getMethodName()) || C89219l.m154714a((Object) "handleStopService", (Object) stackTraceElement.getMethodName()) || C89219l.m154714a((Object) "handleBindService", (Object) stackTraceElement.getMethodName()) || C89219l.m154714a((Object) "handleUnbindService", (Object) stackTraceElement.getMethodName()) || C89219l.m154714a((Object) "handleServiceArgs", (Object) stackTraceElement.getMethodName()))) {
                        C13468b.m24211a(th, "binderlog");
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C67214a.m119159i()) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (C67214a.m119159i()) {
            C21680a.C21681a aVar = new C21680a.C21681a(C17879g.m33104a());
            aVar.f51450a = C21689g.EnumC21691a.NONE;
            aVar.mo35337a(new C21715a());
            aVar.mo35337a(new C21716b());
            aVar.mo35337a(new C80207ab());
            aVar.mo35337a(new C80469g());
            aVar.mo35337a(new C80438fm());
            aVar.mo35337a(new C80518gx());
            aVar.mo35337a(new C80521h());
            aVar.mo35337a(new C80402er());
            aVar.mo35337a(new C21730b());
            aVar.mo35337a(new C21705b());
            if (Keva.getRepo("ab_repo_cold_boot").getBoolean("thread_stack_opt", true) && (Build.VERSION.SDK_INT < 23 || !Process.is64Bit())) {
                aVar.mo35337a(new C21729a());
            }
            C21680a.m40621a(aVar.mo35338a()).mo35336a(EnumC21720d.IMMEDIATE);
            C80341df.f179871a = true;
        } else if (C58152b.m105084b()) {
            Application a = C17879g.m33104a();
            C21705b bVar = new C21705b();
            bVar.mo35359a(a);
            bVar.mo35350a();
        } else {
            C80341df.m139299a(C17879g.m33104a());
        }
        InstrumentationC21699a.m40647a(new C58425a());
    }
}
