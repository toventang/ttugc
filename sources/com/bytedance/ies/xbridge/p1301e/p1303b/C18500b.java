package com.bytedance.ies.xbridge.p1301e.p1303b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1290b.AbstractC18405a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18512e;
import com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18488b;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18506c;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.b.b */
public final class C18500b extends AbstractC18488b {
    static {
        Covode.recordClassIndex(21194);
    }

    /* renamed from: a */
    private final String m34426a() {
        String a;
        AbstractC18405a aVar = (AbstractC18405a) mo29616a(AbstractC18405a.class);
        if (aVar == null || (a = aVar.mo13407a()) == null) {
            return "";
        }
        return a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: f */
    public final void mo29431f() {
        super.mo29431f();
        String a = m34426a();
        C89219l.m154719c(a, "");
        for (Map.Entry<String, CopyOnWriteArrayList<C18512e>> entry : C18494b.m34414a().entrySet()) {
            for (T t : entry.getValue()) {
                if (C89219l.m154714a((Object) t.f44166a, (Object) a)) {
                    entry.getValue().remove(t);
                }
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18488b
    /* renamed from: a */
    public final void mo29631a(C18506c cVar, AbstractC18488b.AbstractC18489a aVar, EnumC18483e eVar) {
        WebView webView;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        String a = m34426a();
        String str = cVar.f44161a;
        if (str == null) {
            C89219l.m154710a("eventName");
        }
        long j = cVar.f44162b;
        AbstractC18400b.AbstractC18404d dVar = (AbstractC18400b.AbstractC18404d) mo29616a(AbstractC18400b.AbstractC18404d.class);
        C18288a aVar2 = (C18288a) mo29616a(C18288a.class);
        if (aVar2 != null) {
            webView = aVar2.f43654d;
        } else {
            webView = null;
        }
        C18494b.m34416a(new C18512e(a, j, dVar, webView), str);
        aVar.mo29632a(new C18745b(), "");
    }
}
