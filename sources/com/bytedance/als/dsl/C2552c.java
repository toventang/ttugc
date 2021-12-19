package com.bytedance.als.dsl;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2557e;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2548c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.C22267s;
import com.bytedance.scene.group.AbstractC22186b;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.als.dsl.c */
public final class C2552c {
    static {
        Covode.recordClassIndex(2937);
    }

    /* renamed from: b */
    public static final C21582f m7463b(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return m7460a(eVar).f7697e;
    }

    /* renamed from: b */
    public static final C21582f m7464b(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        return m7462a(bVar).f7697e;
    }

    /* renamed from: a */
    public static final AlsLogicContainer m7460a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3880a(eVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        alsVMContainer.mo7020a(eVar);
        if (alsVMContainer.f7713b == null) {
            ApiCenter a2 = ApiCenter.C2545a.m7450a(eVar);
            C21582f b = C2556g.m7468a(eVar).mo7023b();
            FragmentManager fragmentManager = eVar.getFragmentManager();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("ALS.ActivityLifecycleFragment");
            if (!(findFragmentByTag instanceof FragmentC2550a)) {
                findFragmentByTag = null;
            }
            FragmentC2550a aVar = (FragmentC2550a) findFragmentByTag;
            if (aVar == null) {
                aVar = new FragmentC2550a();
                fragmentManager.beginTransaction().add(aVar, "ALS.ActivityLifecycleFragment").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            alsVMContainer.f7713b = new AlsLogicContainer(aVar.getLifecycle(), a2, b, alsVMContainer.f7712a);
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f7713b;
        if (alsLogicContainer == null) {
            C89219l.m154715b();
        }
        return alsLogicContainer;
    }

    /* renamed from: a */
    public static final AlsLogicContainer m7461a(AbstractC2557e<?> eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C2548c.m7451a(eVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f7713b == null) {
            ActivityC0945e eVar2 = null;
            Object a2 = eVar.f7723b.mo35248a(Activity.class, (String) null);
            if (a2 instanceof ActivityC0945e) {
                eVar2 = a2;
            }
            ActivityC0945e eVar3 = eVar2;
            if (eVar3 != null) {
                alsVMContainer.f7713b = new AlsLogicContainer(eVar.getLifecycle(), ApiCenter.C2545a.m7450a(eVar3), C2556g.m7469a(eVar).mo7023b(), alsVMContainer.f7712a);
            } else {
                throw new IllegalStateException("a fragmentActivity instance is required in component.");
            }
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f7713b;
        if (alsLogicContainer == null) {
            C89219l.m154715b();
        }
        return alsLogicContainer;
    }

    /* renamed from: a */
    public static final AlsLogicContainer m7462a(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC1174ac a = C22267s.m41933a(bVar).mo3983a(AlsVMContainer.class);
        C89219l.m154716b(a, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        if (alsVMContainer.f7713b == null) {
            Activity t = bVar.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ApiCenter a2 = ApiCenter.C2545a.m7450a((ActivityC0945e) t);
            C21582f b = C2556g.m7470a(bVar).mo7023b();
            AbstractC1196i lifecycle = bVar.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            alsVMContainer.f7713b = new AlsLogicContainer(lifecycle, a2, b, alsVMContainer.f7712a);
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f7713b;
        if (alsLogicContainer == null) {
            C89219l.m154715b();
        }
        return alsLogicContainer;
    }
}
