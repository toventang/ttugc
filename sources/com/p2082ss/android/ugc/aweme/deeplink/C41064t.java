package com.p2082ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.C41023a;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.C41026c;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.C41029e;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.C41031f;
import com.p2082ss.android.ugc.aweme.deeplink.p2734c.C41033g;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.t */
public final class C41064t {

    /* renamed from: a */
    public HashMap<String, Integer> f95989a = new HashMap<>();

    /* renamed from: b */
    public final C41063s f95990b;

    static {
        Covode.recordClassIndex(48934);
    }

    public C41064t(C41022c cVar) {
        C89219l.m154721d(cVar, "");
        C41063s sVar = new C41063s();
        this.f95990b = sVar;
        sVar.mo70274a(new C41026c());
        this.f95989a.put("EntryNode", 1);
        sVar.mo70274a(new C41031f());
        int i = 2;
        this.f95989a.put("NewUserJourneyNode", 2);
        if (cVar.f95906a) {
            sVar.mo70274a(new C41023a());
            this.f95989a.put("AppLinkNode", 3);
            i = 3;
        }
        sVar.mo70274a(new C41029e());
        int i2 = i + 1;
        this.f95989a.put("LoginNode", Integer.valueOf(i2));
        sVar.mo70274a(new C41033g());
        this.f95989a.put("TerminalNode", Integer.valueOf(i2 + 1));
    }
}
