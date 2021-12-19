package com.p2082ss.android.ugc.aweme;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.g */
public final class C52817g extends AbstractC33513ao {

    /* renamed from: a */
    public static final C52818a f121522a = new C52818a((byte) 0);

    static {
        Covode.recordClassIndex(62217);
    }

    /* renamed from: com.ss.android.ugc.aweme.g$a */
    public static final class C52818a {
        static {
            Covode.recordClassIndex(62218);
        }

        private C52818a() {
        }

        public /* synthetic */ C52818a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public final boolean isChildrenMode() {
        init();
        return C80061e.f179403k.mo123516d();
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public final boolean isUidContactPermisioned() {
        try {
            if (C0643b.m2367a(C17867d.m33078a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public final boolean isDeleteByAgeGate() {
        init();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
        if (currentUser == null || currentUser.getAgeGatePostAction() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public final void clear(String str) {
        C89219l.m154721d(str, "");
        init();
        C32835a.C32836a.m67401a(C32835a.f78203b + "|clear:" + str);
        Keva.getRepo("password_status").clear();
        C80061e eVar = C80061e.f179403k;
        eVar.f179405a = false;
        eVar.mo123514c(C80064f.f179418d.mo123521e());
        eVar.f179406b = false;
        eVar.f179407c = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService
    public final void queryVerifyStatus(AbstractC40795cw cwVar, boolean z) {
        C80064f.m138815a(C80061e.f179403k.mo123508a());
    }
}
