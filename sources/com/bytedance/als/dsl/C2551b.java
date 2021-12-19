package com.bytedance.als.dsl;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2558f;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.als.dsl.b */
public final class C2551b {

    /* renamed from: a */
    public final AlsLogicContainer f7720a;

    static {
        Covode.recordClassIndex(2936);
    }

    /* renamed from: a */
    public final void mo7031a() {
        AbstractC2562j<?> jVar;
        AlsLogicContainer alsLogicContainer = this.f7720a;
        alsLogicContainer.f7697e = alsLogicContainer.f7696d.mo35258a();
        for (T t : alsLogicContainer.f7698f) {
            C21582f fVar = alsLogicContainer.f7697e;
            if (!(fVar == null || (jVar = (AbstractC2562j) fVar.mo35247a((Class) t)) == null)) {
                C89219l.m154721d(jVar, "");
                if (alsLogicContainer.f7693a.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
                    continue;
                } else if (alsLogicContainer.f7694b.add(jVar)) {
                    if ((!C89219l.m154714a(jVar.getApiComponent(), AbstractC2547b.class)) && !(jVar.getApiComponent() instanceof AbstractC2558f)) {
                        alsLogicContainer.f7699g.mo7014a(jVar.getApiComponent());
                    }
                    if (alsLogicContainer.f7693a.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.CREATED)) {
                        jVar.onCreate();
                        if (alsLogicContainer.f7693a.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                            jVar.onStart();
                            if (alsLogicContainer.f7693a.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                                jVar.onResume();
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("LogicComponent already exists");
                }
            }
        }
    }

    public C2551b(AlsLogicContainer alsLogicContainer) {
        C89219l.m154721d(alsLogicContainer, "");
        this.f7720a = alsLogicContainer;
    }
}
