package com.p2082ss.android.ugc.aweme.compliance.privacy.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.impl.LaunchTask */
public final class LaunchTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(47421);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C39659b.m80539a(true);
        if (C39631a.m80488d()) {
            C39659b.m80542b(true);
        }
        AccountService.m65215a().mo57064a(C39698a.f93533a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.impl.LaunchTask$a */
    static final class C39698a implements IAccountService.AbstractC31272b {

        /* renamed from: a */
        public static final C39698a f93533a = new C39698a();

        static {
            Covode.recordClassIndex(47422);
        }

        C39698a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            if (i == 1 || i == 2) {
                IAccountUserService e = C39631a.m80490f().mo57069e();
                C89219l.m154716b(e, "");
                if (!e.isChildrenMode()) {
                    C39659b.m80539a(true);
                    C39659b.m80543c();
                    C39659b.m80542b(true);
                }
            } else if (i == 3) {
                C39659b.m80543c();
            }
        }
    }
}
