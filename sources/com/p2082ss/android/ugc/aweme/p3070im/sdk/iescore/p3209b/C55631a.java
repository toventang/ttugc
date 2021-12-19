package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.token.C30630f;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3210c.C55641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.a */
public final class C55631a extends AbstractC17448a implements IAccountService.AbstractC31272b {

    /* renamed from: a */
    public static final C55631a f126890a;

    /* renamed from: b */
    private static final AbstractC89244h f126891b = C89250i.m154773a((AbstractC89171a) C55632a.f126892a);

    /* renamed from: f */
    private static CopyOnWriteArraySet<AbstractC17417b> m101340f() {
        return (CopyOnWriteArraySet) f126891b.getValue();
    }

    private C55631a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.b.a$a */
    static final class C55632a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17417b>> {

        /* renamed from: a */
        public static final C55632a f126892a = new C55632a();

        static {
            Covode.recordClassIndex(65414);
        }

        C55632a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17417b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: a */
    public final boolean mo27822a() {
        return C55197c.m100917a();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: e */
    public final boolean mo27826e() {
        return C80580in.m139689d();
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: b */
    public final C17418c mo27823b() {
        User d = C55197c.m100922d();
        if (d != null) {
            return C55641a.m101385a(d);
        }
        return null;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: c */
    public final String mo27824c() {
        if (C30628d.f73193a) {
            return C30630f.f73196a.mo54899a();
        }
        return null;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: d */
    public final String mo27825d() {
        CharSequence b = C55197c.m100919b();
        C89219l.m154716b(b, "");
        return b.toString();
    }

    static {
        Covode.recordClassIndex(65413);
        C55631a aVar = new C55631a();
        f126890a = aVar;
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a
    /* renamed from: a */
    public final void mo27821a(AbstractC17417b bVar) {
        C89219l.m154721d(bVar, "");
        m101340f().add(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        EnumC17416a aVar;
        C55633b.f126893a.mo27836b("AccountDependService", new StringBuilder("onAccountResult: ").append(i).append(", ").append(z).append(", ").append(i2).append(", ").append(user != null ? user.getUid() : null).append(", ").append(user != null ? user.getSecUid() : null).toString());
        if (z) {
            if (i == 1) {
                aVar = EnumC17416a.LOGIN;
            } else if (i == 2) {
                aVar = EnumC17416a.SWITCH;
            } else if (i != 3) {
                aVar = EnumC17416a.UNKNOWN;
            } else {
                aVar = EnumC17416a.LOGOUT;
            }
            if (user == null) {
                user = C55197c.m100922d();
            }
            for (T t : m101340f()) {
                t.mo27788a(aVar, user != null ? C55641a.m101385a(user) : null);
            }
        }
    }
}
