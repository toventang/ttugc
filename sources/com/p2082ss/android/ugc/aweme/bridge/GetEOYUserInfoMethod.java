package com.p2082ss.android.ugc.aweme.bridge;

import android.content.Context;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bridge.GetEOYUserInfoMethod */
public final class GetEOYUserInfoMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static boolean f82379b = true;

    /* renamed from: c */
    public static final C34920a f82380c = new C34920a((byte) 0);

    /* renamed from: d */
    private final String f82381d = "getEOYUserInfo";

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bridge.GetEOYUserInfoMethod$a */
    public static final class C34920a {
        static {
            Covode.recordClassIndex(41933);
        }

        private C34920a() {
        }

        public /* synthetic */ C34920a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82381d;
    }

    static {
        Covode.recordClassIndex(41932);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEOYUserInfoMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        boolean z;
        String str;
        List<String> urlList;
        String str2 = "";
        C89219l.m154721d(jSONObject, str2);
        C89219l.m154721d(bVar, str2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("firstToHub", f82379b);
            f82379b = false;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, str2);
            if (!g.isLogin()) {
                C34927a.m71314a(bVar, jSONObject2);
            }
            Context e = mo26893e();
            String str3 = null;
            if (e == null) {
                C34927a.m71313a(bVar, (Throwable) null);
                return;
            }
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, str2);
            jSONObject2.put("hasLoggedIn", g2.isLogin());
            if (C0643b.m2367a(e, "android.permission.READ_CONTACTS") == 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject2.put("hasContactPermission", z);
            JSONObject jSONObject3 = new JSONObject();
            IAccountUserService g3 = C31575b.m65865g();
            C89219l.m154716b(g3, str2);
            User curUser = g3.getCurUser();
            C89219l.m154716b(curUser, str2);
            jSONObject3.put("userID", curUser.getUid());
            jSONObject3.put("secUserID", curUser.getSecUid());
            jSONObject3.put("uniqueID", curUser.getUniqueId());
            jSONObject3.put("nickname", curUser.getNickname());
            UrlModel avatarThumb = curUser.getAvatarThumb();
            if (avatarThumb == null || (urlList = avatarThumb.getUrlList()) == null) {
                str = null;
            } else {
                if (C89070n.m154517a((List) urlList) >= 0) {
                    str2 = urlList.get(0);
                }
                str = str2;
            }
            jSONObject3.put("avatarURL", str);
            ProfileBadgeStruct profileBadge = curUser.getProfileBadge();
            if (profileBadge != null && profileBadge.getShouldShow()) {
                str3 = profileBadge.getUrl();
            }
            jSONObject3.put("frameURL", str3);
            jSONObject2.put("userInfo", jSONObject3);
            C34927a.m71314a(bVar, jSONObject2);
        } catch (Exception e2) {
            C34927a.m71313a(bVar, e2);
        }
    }
}
