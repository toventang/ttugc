package com.p2082ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.C23435d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40360b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40362c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40364d;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40366e;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40367f;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40369g;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40370h;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40371i;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40372j;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40373k;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40374l;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40375m;
import com.p2082ss.android.ugc.aweme.p2690cr.p2702e.C40377n;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.AVCleanStorageTask */
public final class AVCleanStorageTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(55652);
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
        C89219l.m154721d(context, "");
        List<AbstractC40358a> b = C89070n.m154522b(new C40360b(), new C40364d(), new C40362c(), new C40367f(), new C40370h(), new C40371i(), new C40373k(), new C40374l(), new C40377n(), new C40369g(), new C40372j(), new C40366e(), C40375m.f94558c);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
        for (AbstractC40358a aVar : b) {
            C23435d.m44113a(aVar);
            if (aVar.mo69499f().length() > 0) {
                aVar.mo69499f();
            }
            arrayList.add(C89391z.f203057a);
        }
    }
}
