package com.p2082ss.android.ugc.aweme.activity.processor;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.c */
public final class C33073c extends AbstractC17350d {
    static {
        Covode.recordClassIndex(39885);
    }

    /* renamed from: c */
    private final boolean m67772c() {
        T t;
        T t2;
        Iterator<T> it = mo27704b().mo27699b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2 instanceof C33099t) {
                break;
            }
        }
        if (t2 instanceof C33099t) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f78666a;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: d */
    public final void mo27662d(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27662d(aVar);
        EventBus a = EventBus.m156962a();
        if (m67772c() && a.mo145393a(aVar)) {
            a.mo145395b(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public final void mo27658b(ActivityC17312a aVar, Bundle bundle) {
        C89219l.m154721d(aVar, "");
        super.mo27658b(aVar, bundle);
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(aVar) && m67772c()) {
            EventBus.m156966a(a, aVar);
        }
    }
}
