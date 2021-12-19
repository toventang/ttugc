package com.p2082ss.android.ugc.aweme.fragment.p3005a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.AbstractC17391d;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33099t;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fragment.a.a */
public final class C51417a extends AbstractC17391d {
    static {
        Covode.recordClassIndex(60640);
    }

    /* renamed from: c */
    private final boolean m95777c() {
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

    @Override // com.bytedance.ies.foundation.base.AbstractC17368c, com.bytedance.ies.foundation.fragment.AbstractC17390c
    /* renamed from: j */
    public final void mo27714j(AbstractC0952i iVar, C17372a aVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        super.mo27714j(iVar, aVar);
        EventBus a = EventBus.m156962a();
        if (m95777c() && a.mo145393a(this)) {
            a.mo145395b(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.base.AbstractC17368c, com.bytedance.ies.foundation.fragment.AbstractC17390c
    /* renamed from: a */
    public final void mo27703a(AbstractC0952i iVar, C17372a aVar, View view, Bundle bundle) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        super.mo27703a(iVar, aVar, view, bundle);
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this) && m95777c()) {
            EventBus.m156966a(a, aVar);
        }
    }
}
