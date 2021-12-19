package com.p2082ss.android.ugc.aweme.discover;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.b */
public final class C41856b implements IDiscoveryService {

    /* renamed from: a */
    public static final C41856b f97654a = new C41856b();

    /* renamed from: b */
    private final /* synthetic */ IDiscoveryService f97655b;

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final Fragment mo70759a() {
        return this.f97655b.mo70759a();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final C27917g mo70760a(C27917g gVar) {
        C89219l.m154721d(gVar, "");
        return this.f97655b.mo70760a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final boolean mo70761a(Aweme aweme, int i) {
        return this.f97655b.mo70761a(aweme, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: a */
    public final boolean mo70762a(User user, int i) {
        return this.f97655b.mo70762a(user, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: b */
    public final AbstractC41892c mo70763b() {
        return this.f97655b.mo70763b();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: c */
    public final List<Type> mo70764c() {
        return this.f97655b.mo70764c();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: d */
    public final String mo70765d() {
        return this.f97655b.mo70765d();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: e */
    public final boolean mo70766e() {
        return this.f97655b.mo70766e();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.IDiscoveryService
    /* renamed from: f */
    public final boolean mo70767f() {
        return this.f97655b.mo70767f();
    }

    static {
        Covode.recordClassIndex(49782);
    }

    private C41856b() {
        IDiscoveryService g = DiscoveryServiceImpl.m83414g();
        C89219l.m154716b(g, "");
        this.f97655b = g;
    }
}
