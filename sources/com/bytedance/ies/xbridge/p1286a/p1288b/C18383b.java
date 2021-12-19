package com.bytedance.ies.xbridge.p1286a.p1288b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18375b;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18392b;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18394c;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.b.b */
public final class C18383b extends AbstractC18375b {
    static {
        Covode.recordClassIndex(21055);
    }

    /* renamed from: com.bytedance.ies.xbridge.a.b.b$a */
    public static final class C18384a implements IHostUserDepend.AbstractC18461a {

        /* renamed from: a */
        final /* synthetic */ IHostUserDepend f43964a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18375b.AbstractC18376a f43965b;

        /* renamed from: c */
        final /* synthetic */ C18392b f43966c;

        /* renamed from: d */
        final /* synthetic */ Activity f43967d;

        static {
            Covode.recordClassIndex(21056);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.AbstractC18461a
        /* renamed from: b */
        public final void mo29426b() {
            AbstractC18375b.AbstractC18376a aVar = this.f43965b;
            C18394c cVar = new C18394c();
            cVar.f43985a = "cancelled";
            aVar.mo29420a(cVar, "");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.AbstractC18461a
        /* renamed from: a */
        public final void mo29425a() {
            if (this.f43964a.hasLogin()) {
                AbstractC18375b.AbstractC18376a aVar = this.f43965b;
                C18394c cVar = new C18394c();
                cVar.f43985a = "loggedIn";
                aVar.mo29420a(cVar, "");
                return;
            }
            AbstractC18375b.AbstractC18376a aVar2 = this.f43965b;
            C18394c cVar2 = new C18394c();
            cVar2.f43985a = "cancelled";
            aVar2.mo29420a(cVar2, "");
        }

        C18384a(IHostUserDepend iHostUserDepend, AbstractC18375b.AbstractC18376a aVar, C18392b bVar, Activity activity) {
            this.f43964a = iHostUserDepend;
            this.f43965b = aVar;
            this.f43966c = bVar;
            this.f43967d = activity;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18375b
    /* renamed from: a */
    public final void mo29419a(C18392b bVar, AbstractC18375b.AbstractC18376a aVar, EnumC18483e eVar) {
        IHostUserDepend iHostUserDepend;
        C18465b bVar2;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29421a("context is null");
            return;
        }
        Activity a = C18806a.m34902a(context);
        if (a == null) {
            aVar.mo29421a("context can not convert to activity");
            return;
        }
        C18465b bVar3 = (C18465b) mo29616a(C18465b.class);
        if ((bVar3 == null || (iHostUserDepend = bVar3.f44105h) == null) && ((bVar2 = C18465b.f44096l) == null || (iHostUserDepend = bVar2.f44105h) == null)) {
            aVar.mo29421a("hostUserDepend is null");
        } else if (iHostUserDepend.hasLogin()) {
            C18394c cVar = new C18394c();
            cVar.f43985a = "loggedIn";
            aVar.mo29420a(cVar, "");
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC18754n nVar = bVar.f43983a;
            if (nVar != null) {
                AbstractC18687l a2 = nVar.mo29756a();
                while (a2.mo29723a()) {
                    String b = a2.mo29724b();
                    AbstractC18659k i = nVar.mo29766i(b);
                    int i2 = C18385c.f43968a[i.mo29707a().ordinal()];
                    if (i2 == 1) {
                        linkedHashMap.put(b, String.valueOf(i.mo29710d()));
                    } else if (i2 == 2) {
                        linkedHashMap.put(b, String.valueOf(i.mo29709c()));
                    } else if (i2 == 3) {
                        linkedHashMap.put(b, i.mo29711e());
                    } else if (i2 == 4) {
                        linkedHashMap.put(b, String.valueOf(i.mo29708b()));
                    }
                }
            }
            iHostUserDepend.login(a, new C18384a(iHostUserDepend, aVar, bVar, a), linkedHashMap);
        }
    }
}
