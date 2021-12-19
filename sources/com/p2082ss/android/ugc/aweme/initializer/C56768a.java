package com.p2082ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.initializer.a */
public final class C56768a implements AbstractC63269z {

    /* renamed from: a */
    private Map<Integer, IAccountService.AbstractC31272b> f129324a = new HashMap();

    static {
        Covode.recordClassIndex(66633);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final boolean mo93901a() {
        return C80580in.m139689d();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: b */
    public final boolean mo93903b() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: c */
    public final String mo93904c() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: g */
    public final boolean mo93908g() {
        return C31575b.m65865g().isUidContactPermisioned();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: i */
    public final void mo93910i() {
        BaseUserService.createIUserServicebyMonsterPlugin(false).setIsOldUser(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: d */
    public final String mo93905d() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return currentUser.getSecUid();
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: e */
    public final AbstractC32846a mo93906e() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return new C56784n(currentUser);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: f */
    public final boolean mo93907f() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isCanSetGeoFencing()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: h */
    public final boolean mo93909h() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || !currentUser.isPrivateAccount()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: b */
    public final void mo93902b(AbstractC63269z.AbstractC63271b bVar) {
        IAccountService a = AccountService.m65215a();
        IAccountService.AbstractC31272b remove = this.f129324a.remove(Integer.valueOf(bVar.hashCode()));
        if (remove != null) {
            a.mo57066b(remove);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final void mo93899a(AbstractC63269z.AbstractC63271b bVar) {
        IAccountService a = AccountService.m65215a();
        C56772b bVar2 = new C56772b(bVar);
        this.f129324a.put(Integer.valueOf(bVar.hashCode()), bVar2);
        a.mo57064a(bVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final AbstractC32846a mo93896a(String str, String str2) {
        return new C56784n(C63429c.m115016a(C63429c.m115022b(str2, str), false, null));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final void mo93898a(Fragment fragment, String str, String str2, final AbstractC63269z.AbstractC63270a aVar) {
        C58957c.m108324a(fragment, str, str2, (Bundle) null, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.initializer.C56768a.C567691 */

            static {
                Covode.recordClassIndex(66634);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                AbstractC63269z.AbstractC63270a aVar = aVar;
                if (aVar != null) {
                    aVar.mo59543a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                AbstractC63269z.AbstractC63270a aVar = aVar;
                if (aVar != null) {
                    aVar.mo59544b();
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final void mo93900a(String str, String str2, int i, final AbstractC89172b<? super Integer, C89391z> bVar) {
        UserService.m138861d().mo123563a(str, str2, i, -1, -1, "", -1).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<FollowStatus>() {
            /* class com.p2082ss.android.ugc.aweme.initializer.C56768a.C567713 */

            static {
                Covode.recordClassIndex(66636);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(FollowStatus followStatus) {
                bVar.invoke(Integer.valueOf(followStatus.followStatus));
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z
    /* renamed from: a */
    public final void mo93897a(Activity activity, String str, String str2, Bundle bundle, final AbstractC63269z.AbstractC63270a aVar) {
        C58957c.m108320a(activity, str, str2, bundle, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.initializer.C56768a.C567702 */

            static {
                Covode.recordClassIndex(66635);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                AbstractC63269z.AbstractC63270a aVar = aVar;
                if (aVar != null) {
                    aVar.mo59543a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                AbstractC63269z.AbstractC63270a aVar = aVar;
                if (aVar != null) {
                    aVar.mo59544b();
                }
            }
        });
    }
}
