package com.bytedance.ies.xbridge.p1317i.p1319b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostMediaDepend;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18587a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18610a;
import com.bytedance.ies.xbridge.p1317i.p1320c.C18612b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.i.b.a */
public final class C18596a extends AbstractC18587a {
    static {
        Covode.recordClassIndex(21290);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.a$a */
    public static final class C18597a implements IChooseMediaResultCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC18587a.AbstractC18588a f44292a;

        static {
            Covode.recordClassIndex(21291);
        }

        C18597a(AbstractC18587a.AbstractC18588a aVar) {
            this.f44292a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
        public final void onFailure(int i, String str) {
            C89219l.m154719c(str, "");
            this.f44292a.mo29670a(i, str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback
        public final void onSuccess(C18424e eVar, String str) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(str, "");
            ArrayList arrayList = new ArrayList();
            List<C18424e.C18425a> list = eVar.f44026a;
            if (list != null) {
                for (T t : list) {
                    C18612b.C18614b bVar = new C18612b.C18614b(t.f44028b, t.f44029c, t.f44030d, t.f44031e);
                    String str2 = t.f44027a;
                    if (str2 != null) {
                        bVar.f44335a = str2;
                    }
                    arrayList.add(bVar);
                }
            }
            AbstractC18587a.AbstractC18588a aVar = this.f44292a;
            C18612b bVar2 = new C18612b();
            bVar2.f44334a = arrayList;
            aVar.mo29671a(bVar2, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.p1317i.p1318a.AbstractC18587a
    /* renamed from: a */
    public final void mo29669a(C18610a aVar, AbstractC18587a.AbstractC18588a aVar2, EnumC18483e eVar) {
        IHostMediaDepend iHostMediaDepend;
        C18465b bVar;
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        String a = aVar.mo29686a();
        String str = aVar.f44325f;
        Locale locale = Locale.ROOT;
        C89219l.m154709a((Object) locale, "");
        if (a != null) {
            String lowerCase = a.toLowerCase(locale);
            C89219l.m154709a((Object) lowerCase, "");
            if (!C89219l.m154714a((Object) lowerCase, (Object) "camera") || str.length() != 0) {
                Context context = (Context) mo29616a(Context.class);
                if (context == null) {
                    aVar2.mo29670a(0, "Context not provided in host");
                    return;
                }
                List<String> list = aVar.f44320a;
                if (list == null) {
                    C89219l.m154710a("mediaTypes");
                }
                C18423d dVar = new C18423d(list, aVar.mo29686a(), aVar.f44322c, aVar.f44323d, aVar.f44324e, aVar.f44325f, aVar.f44326g, aVar.f44327h, aVar.f44328i);
                dVar.f44013a = aVar.f44329j;
                dVar.f44015c = aVar.f44331l;
                dVar.f44014b = aVar.f44330k;
                dVar.f44016d = aVar.f44332m;
                C18597a aVar3 = new C18597a(aVar2);
                C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
                if ((bVar2 == null || (iHostMediaDepend = bVar2.f44100c) == null) && ((bVar = C18465b.f44096l) == null || (iHostMediaDepend = bVar.f44100c) == null)) {
                    aVar2.mo29670a(0, "hostMediaDepend is null");
                } else {
                    iHostMediaDepend.handleJsInvoke(context, dVar, aVar3);
                }
            } else {
                aVar2.mo29670a(-3, "CameraType not provided with sourceType specified as camera in params");
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
