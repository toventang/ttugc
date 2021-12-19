package com.p2082ss.android.ugc.aweme.notification.p3522d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.d.b */
public final class C61926b implements AbstractC58259r {

    /* renamed from: a */
    public static final C61927a f140578a = new C61927a((byte) 0);

    static {
        Covode.recordClassIndex(72675);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
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

    /* renamed from: com.ss.android.ugc.aweme.notification.d.b$a */
    public static final class C61927a {
        static {
            Covode.recordClassIndex(72676);
        }

        private C61927a() {
        }

        public /* synthetic */ C61927a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
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

    /* renamed from: c */
    public static void m112055c() {
        String e = C80061e.f179403k.mo123517e();
        if (!TextUtils.isEmpty(e) && !C89219l.m154714a((Object) "0", (Object) e)) {
            Keva repo = Keva.getRepo("cold_boot_repo");
            long j = 0;
            if (repo != null) {
                j = repo.getLong(e, 0);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (C61924a.m112053a(j, currentTimeMillis)) {
                Keva.getRepo("cold_boot_repo").storeLong(e, currentTimeMillis);
                MusNotificationApiManager.m111992a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C43200dr.m86153a(new C61928b(this));
        m112055c();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.d.b$b */
    static final class C61928b implements IAccountUserService.AbstractC31278a {

        /* renamed from: a */
        final /* synthetic */ C61926b f140579a;

        static {
            Covode.recordClassIndex(72677);
        }

        C61928b(C61926b bVar) {
            this.f140579a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountUserService.AbstractC31278a
        /* renamed from: a */
        public final void mo57195a(int i, User user, User user2) {
            C61926b.m112055c();
        }
    }
}
