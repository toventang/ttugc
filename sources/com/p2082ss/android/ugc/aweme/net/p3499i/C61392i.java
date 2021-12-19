package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.i.i */
public final class C61392i implements AttachUserData, AbstractC18185b.AbstractC18187b {

    /* renamed from: a */
    public CopyOnWriteArrayList<String> f139386a;

    /* renamed from: b */
    private final int f139387b = 10;

    /* renamed from: c */
    private volatile int f139388c;

    static {
        Covode.recordClassIndex(72025);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    public C61392i() {
        Npth.setAttachUserData(this, CrashType.ALL);
        this.f139386a = new CopyOnWriteArrayList<>(Collections.nCopies(10, ""));
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18187b
    /* renamed from: a */
    public final void mo29037a(Request request) {
        C89219l.m154721d(request, "");
        C89219l.m154721d(request, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18187b
    /* renamed from: c */
    public final void mo29041c(Request request) {
        C89219l.m154721d(request, "");
        C89219l.m154721d(request, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18187b
    /* renamed from: a */
    public final void mo29038a(C22099u<?> uVar) {
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(uVar, "");
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18187b
    /* renamed from: b */
    public final void mo29040b(Request request) {
        C89219l.m154721d(request, "");
        String path = request.getPath();
        this.f139388c %= this.f139387b;
        this.f139386a.set(this.f139388c, path);
        this.f139388c++;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C89041ag.m154427b(C89387v.m154943a("paths_in_crash", this.f139386a.toString()));
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18187b
    /* renamed from: a */
    public final void mo29039a(Throwable th) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th, "");
    }
}
