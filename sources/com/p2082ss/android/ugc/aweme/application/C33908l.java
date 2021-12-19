package com.p2082ss.android.ugc.aweme.application;

import android.app.Instrumentation;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.legoapi.abtest.C29953a;
import com.p2082ss.android.ugc.aweme.childhook.ChildActivityInstrumentation;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadDmtSecSoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import com.p2082ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.application.l */
public final class C33908l {
    static {
        Covode.recordClassIndex(40826);
    }

    public static void attachBaseContextAfterMultiDex(C33905j jVar) {
        C65713d.f148064a = new OptimizePushProcessImpl();
        C58221f.m105153e().mo95704a(new FrescoSoLoadSetter()).mo95706a();
        C80720e.m139919a(jVar.f80200a);
        C58221f.m105153e().mo95704a(C29953a.f71445a.mo52301d()).mo95704a(new PreloadDmtSecSoTask()).mo95706a();
        C58221f.m105153e().mo95704a(new SharePreferencePreloadForAllProcessTask()).mo95704a(C58420ae.m106846n()).mo95706a();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            C89219l.m154716b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            if (obj != null) {
                declaredField.set(invoke, new ChildActivityInstrumentation((Instrumentation) obj));
                if (C67214a.m119159i()) {
                    C58221f.m105147a(C58420ae.m106846n());
                }
                if (jVar.f80201b) {
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_application_attach_duration", true);
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_application_attach_to_create", true);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Instrumentation");
        } catch (Exception e) {
            e.printStackTrace();
            C13468b.m24211a(e, "ChildActivityHook.startHook");
        }
    }
}
