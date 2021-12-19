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
import com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18491c;
import com.bytedance.ies.xbridge.p1301e.p1304c.C18509e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.b.c */
public class C18501c extends AbstractC18491c {
    static {
        Covode.recordClassIndex(21195);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.p1302a.AbstractC18491c
    /* renamed from: a */
    public final void mo29633a(C18509e eVar, AbstractC18491c.AbstractC18492a aVar, EnumC18483e eVar2) {
        String str;
        WebView webView;
        C18288a aVar2;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar2, "");
        String str2 = eVar.f44165a;
        if (str2 == null) {
            C89219l.m154710a("eventName");
        }
        AbstractC18405a aVar3 = (AbstractC18405a) mo29616a(AbstractC18405a.class);
        if (aVar3 == null || (str = aVar3.mo13407a()) == null) {
            str = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC18400b.AbstractC18404d dVar = (AbstractC18400b.AbstractC18404d) mo29616a(AbstractC18400b.AbstractC18404d.class);
        if (str.length() != 0 || (aVar2 = (C18288a) mo29616a(C18288a.class)) == null) {
            webView = null;
        } else {
            webView = aVar2.f43654d;
        }
        C18494b.m34421b(new C18512e(str, currentTimeMillis, dVar, webView), str2);
        aVar.mo29634a(new C18745b(), "");
    }
}
