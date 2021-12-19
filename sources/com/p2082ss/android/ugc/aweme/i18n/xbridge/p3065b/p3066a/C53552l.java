package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.l */
public final class C53552l implements IHostUserDepend {

    /* renamed from: a */
    private IHostUserDepend.AbstractC18461a f122914a;

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.l$a */
    public enum EnumC53553a {
        LOGGEDIN,
        CANCELLED;

        static {
            Covode.recordClassIndex(63129);
        }
    }

    static {
        Covode.recordClassIndex(63128);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.l$c */
    static final class C53555c implements AbstractC34892bo.AbstractC34893a {

        /* renamed from: a */
        final /* synthetic */ IHostUserDepend.AbstractC18462b f122917a;

        static {
            Covode.recordClassIndex(63131);
        }

        C53555c(IHostUserDepend.AbstractC18462b bVar) {
            this.f122917a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo.AbstractC34893a
        /* renamed from: a */
        public final void mo61796a() {
            this.f122917a.mo29427a();
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getSecUid() {
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            return g.getCurSecUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUserId() {
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            return g.getCurUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean hasLogin() {
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            return g.isLogin();
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundPhone() {
        User curUser;
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null) {
            return null;
        }
        return curUser.getBindPhone();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getNickname() {
        User curUser;
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null) {
            return null;
        }
        return curUser.getNickname();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getAvatarURL() {
        User curUser;
        UrlModel avatarMedium;
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null || (avatarMedium = curUser.getAvatarMedium()) == null || avatarMedium.getUrlList() == null) {
            return null;
        }
        List<String> urlList = avatarMedium.getUrlList();
        C89219l.m154716b(urlList, "");
        if (!urlList.isEmpty()) {
            return avatarMedium.getUrlList().get(0);
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUniqueID() {
        User curUser;
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null) {
            return "";
        }
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            return curUser.getShortId();
        }
        return curUser.getUniqueId();
    }

    /* renamed from: a */
    public final void mo90118a(EnumC53553a aVar) {
        if (aVar == EnumC53553a.CANCELLED) {
            IHostUserDepend.AbstractC18461a aVar2 = this.f122914a;
            if (aVar2 != null) {
                aVar2.mo29426b();
            }
        } else {
            IHostUserDepend.AbstractC18461a aVar3 = this.f122914a;
            if (aVar3 != null) {
                aVar3.mo29425a();
            }
        }
        this.f122914a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.l$b */
    static final class C53554b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C53552l f122916a;

        static {
            Covode.recordClassIndex(63130);
        }

        C53554b(C53552l lVar) {
            this.f122916a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 != 1) {
                this.f122916a.mo90118a(EnumC53553a.CANCELLED);
            } else {
                this.f122916a.mo90118a(EnumC53553a.LOGGEDIN);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void logout(Activity activity, IHostUserDepend.AbstractC18462b bVar, Map<String, String> map) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C31575b.m65860b().logout("", "user_logout", new C53555c(bVar));
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity activity, IHostUserDepend.AbstractC18461a aVar, Map<String, String> map) {
        Set<Map.Entry<String, String>> entrySet;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        this.f122914a = aVar;
        Bundle bundle = new Bundle();
        if (!(map == null || (entrySet = map.entrySet()) == null)) {
            for (T t : entrySet) {
                bundle.putString((String) t.getKey(), (String) t.getValue());
            }
        }
        AbstractC34892bo b = C31575b.m65860b();
        IAccountService.C31274d dVar = new IAccountService.C31274d();
        dVar.f74963d = bundle;
        dVar.f74960a = activity;
        dVar.f74966g = true;
        dVar.f74964e = new C53554b(this);
        b.showLoginAndRegisterView(dVar.mo57084a());
    }
}
