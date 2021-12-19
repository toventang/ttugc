package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.AbstractC14443b;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.p961e.C14441a;
import com.bytedance.disk.p961e.p963b.C14446c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.storagemanager.C76422a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MigrationTask */
public class MigrationTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68535);
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
        return EnumC58151ae.BACKGROUND;
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
        MethodCollector.m26663i(1745);
        if (!C76422a.f171670a.get()) {
            synchronized (C76422a.class) {
                try {
                    if (!C76422a.f171670a.get()) {
                        C14441a.m26371a(context);
                        C14441a a = C14441a.m26370a();
                        int h = (int) C17867d.m33087h();
                        AbstractC14448c cVar = C76422a.f171671b;
                        C14446c.C14447a<Void> aVar = C14441a.f34940c;
                        AbstractC14443b bVar = a.f34946a;
                        Object[] objArr = new Object[3];
                        objArr[0] = Integer.valueOf(h);
                        objArr[1] = 1180;
                        if (C14441a.f34939b != null) {
                            cVar = C14441a.f34939b;
                        }
                        objArr[2] = cVar;
                        aVar.mo23274a(bVar, objArr);
                        C14441a.f34941d.mo23274a(a.f34946a, new Object[0]);
                        C76422a.f171670a.set(true);
                        MethodCollector.m26664o(1745);
                    }
                } finally {
                    MethodCollector.m26664o(1745);
                }
            }
        } else {
            MethodCollector.m26664o(1745);
        }
    }
}
