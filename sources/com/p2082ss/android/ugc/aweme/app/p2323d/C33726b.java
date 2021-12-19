package com.p2082ss.android.ugc.aweme.app.p2323d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.librarian.LibrarianUnsatisfiedLinkError;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.services.C33850c;
import com.p2082ss.android.ugc.aweme.common.p2635g.C39120a;
import com.p2082ss.android.ugc.aweme.live.AbstractC58596d;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.d.b */
public final class C33726b implements AttachUserData {

    /* renamed from: a */
    Map<String, String> f79890a;

    /* renamed from: b */
    private AttachUserData f79891b;

    static {
        Covode.recordClassIndex(40621);
    }

    /* renamed from: a */
    private static Map<String, String> m69048a(Map<String, String> map) {
        if (map != null && !map.containsKey("curUserId") && C31575b.m65865g().isLogin()) {
            map.put("curUserId", C31575b.m65865g().getCurUserId());
            if (C31575b.m65865g().getCurUser() != null) {
                map.put("shortId", C31575b.m65865g().getCurUser().getShortId());
                map.put("nickname", C31575b.m65865g().getCurUser().getNickname());
            }
        }
        return map;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        C80261bq.C80270f d;
        if ((crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.NATIVE) && (d = C80261bq.m139128d()) != null) {
            this.f79890a.put("vmPeak", String.valueOf(d.f179761a));
            this.f79890a.put("vmSize", String.valueOf(d.f179762b));
            this.f79890a.put("fdCount", String.valueOf(d.f179764d));
            this.f79890a.put("maxFdCount", String.valueOf(d.f179763c));
            this.f79890a.put("threadCount", String.valueOf(d.f179765e));
        }
        this.f79890a.put("root", String.valueOf(C80261bq.m139131e()));
        this.f79890a.put("librarian", Arrays.toString(LibrarianUnsatisfiedLinkError.m38991a()));
        this.f79890a.put("class_loader", getClass().getClassLoader().toString());
        return m69048a(this.f79890a);
    }

    public C33726b(Context context, AttachUserData attachUserData) {
        String str;
        this.f79891b = attachUserData;
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
        HashMap hashMap = new HashMap();
        this.f79890a = hashMap;
        hashMap.put("git_sha", C17867d.f42592p);
        this.f79890a.put("git_branch", C17867d.f42591o);
        this.f79890a.put("abi", System.getProperty("os.arch"));
        this.f79890a.put("veSdk", avsettingsConfig.getVESDKVersion());
        this.f79890a.put("effectSdk", avsettingsConfig.getEffectVersion());
        this.f79890a.put("player_type", String.valueOf(C84199c.f187979a.getPlayerType()));
        this.f79890a.put("preloader_type", String.valueOf(C84199c.f187979a.getPreloadType()));
        this.f79890a.put("ttplayer_version", "210616190");
        this.f79890a.put("release_build", C29869d.f71252f);
        this.f79890a.put("real_machine", String.valueOf(C39120a.m79417a()));
        C33850c a = C33850c.m69286a(context);
        String str2 = "";
        if (TextUtils.isEmpty("JENKINS_BUILD_RESULT") || a.f80139a == null) {
            str = null;
        } else {
            str = a.f80139a.optString("JENKINS_BUILD_RESULT", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f79890a.put("jenkins_build_result", str);
        }
        AVExternalServiceImpl.m113114a().provideErrorReporter().addCrashEffectIdInfoListener(new C33727c(this));
        this.f79890a.put("device_info", Build.MANUFACTURER + "&&" + Build.BRAND + "&&" + Build.MODEL + "&&" + Build.FINGERPRINT);
        Map<? extends String, ? extends String> userData = this.f79891b.getUserData(CrashType.ALL);
        if (userData != null) {
            this.f79890a.putAll(userData);
        }
        if (C29843f.m60129a(context)) {
            AbstractC58596d o = LiveOuterService.m107269s().mo95841o();
            this.f79890a.put("liveCoreSdk", o != null ? o.mo96054a() : str2);
            m69048a(this.f79890a);
        }
    }
}
