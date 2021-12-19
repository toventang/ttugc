package com.bytedance.ies.xbridge.p1343n.p1345b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18772f;
import com.bytedance.ies.xbridge.p1343n.p1346c.p1347a.C18787a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18803f;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.f */
public final class C18786f extends AbstractC18772f {
    static {
        Covode.recordClassIndex(21482);
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18772f
    /* renamed from: a */
    public final void mo29813a(C18803f fVar, AbstractC18772f.AbstractC18773a aVar, EnumC18483e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        C18465b bVar;
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29815a("context not provided in host");
            return;
        }
        String str = fVar.f44590a;
        if (str == null) {
            C89219l.m154710a("message");
        }
        String str2 = fVar.f44591b;
        if (str2 == null) {
            C89219l.m154710a(StringSet.type);
        }
        ToastBuilder toastBuilder = new ToastBuilder(context, str, str2, fVar.f44592c);
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        Boolean bool = null;
        if (!((bVar2 == null || (iHostStyleUIDepend = bVar2.f44103f) == null) && ((bVar = C18465b.f44096l) == null || (iHostStyleUIDepend = bVar.f44103f) == null))) {
            bool = iHostStyleUIDepend.showToast(toastBuilder);
        }
        if (true ^ C89219l.m154714a((Object) bool, (Object) true)) {
            new C18787a().showToast(toastBuilder);
        }
        aVar.mo29814a(new C18745b(), "");
    }
}
