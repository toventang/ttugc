package com.p2082ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p2082ss.android.ugc.aweme.account.login.p2257b.C31893a;
import com.p2082ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.util.u */
public final class C33052u {
    static {
        Covode.recordClassIndex(39859);
    }

    /* renamed from: a */
    public static CachedUserAgeInfo m67703a() {
        try {
            HashMap hashMap = (HashMap) new C27910f().mo46671a(C33048q.m67689b(), new C27895a<HashMap<String, CachedUserAgeInfo>>() {
                /* class com.p2082ss.android.ugc.aweme.account.util.C33052u.C330531 */

                static {
                    Covode.recordClassIndex(39860);
                }
            }.type);
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), C36085cj.m73548b())) {
                        return (CachedUserAgeInfo) entry.getValue();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    private static int m67699a(AgeGateResponse ageGateResponse) {
        if (ageGateResponse.getAgeGatePostAction() != 0) {
            return ageGateResponse.getAgeGatePostAction();
        }
        return ageGateResponse.getRegisterAgeGatePostAction();
    }

    /* renamed from: a */
    public static String m67704a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: c */
    public static C1731i<Bundle> m67707c(Bundle bundle) {
        return C1731i.m5640b(new CallableC33057w(bundle), C1731i.f5562a).mo5534a(new C33058x(bundle), C1731i.f5564c, null);
    }

    /* renamed from: b */
    public static C1731i<C31893a> m67706b(Bundle bundle) {
        boolean z = bundle.getBoolean("age_gate_block", false);
        CachedUserAgeInfo a = m67703a();
        if (a != null) {
            return m67702a(a.getBirthday(), true, z);
        }
        if (C31566h.f75504c) {
            return m67702a("", false, z);
        }
        return C1731i.m5640b(CallableC33056v.f78607a, C1731i.f5562a);
    }

    /* renamed from: a */
    public static C1731i<C31893a> m67700a(Bundle bundle) {
        AgeGateResponse ageGateResponse;
        if (bundle.getSerializable("age_gate_response") != null) {
            ageGateResponse = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        } else {
            ageGateResponse = null;
        }
        boolean z = bundle.getBoolean("age_gate_block", false);
        int i = 1;
        if (ageGateResponse != null) {
            if (!(ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0)) {
                i = 2;
            }
            bundle.putInt("user_mode", i);
            bundle.putInt("age_gate_post_action", m67699a(ageGateResponse));
        } else if (C31575b.m65865g().isNewUser() && z) {
            bundle.putInt("age_gate_post_action", 1);
            bundle.putInt("user_mode", 2);
        }
        return m67702a(C31566h.f75502a, false, z);
    }

    /* renamed from: d */
    static final /* synthetic */ User m67708d(Bundle bundle) {
        try {
            User queryUser = C36085cj.f85262b.mo57069e().queryUser(null, true);
            C32840d.m67409a(true, 0, "", bundle);
            if (queryUser.getAgeGatePostAction() == 0) {
                int i = bundle.getInt("age_gate_post_action", -1);
                if (i != -1) {
                    queryUser.setAgeGatePostAction(i);
                    queryUser.setAgeGateAction(0);
                    C33048q.m67687a(queryUser.getUid(), i);
                    C31566h.m65849a(queryUser.getUid(), i);
                } else {
                    int a = C31566h.m65847a(queryUser.getUid());
                    if (a != -1) {
                        queryUser.setAgeGatePostAction(a);
                        queryUser.setAgeGateAction(0);
                    }
                }
            }
            if (queryUser.getUserMode() == 0) {
                SharedPreferences a2 = C34822d.m71158a(C31291a.f74991a, "aweme_user", 0);
                int i2 = bundle.getInt("user_mode", -1);
                if (i2 == 2 || i2 == 1) {
                    queryUser.setUserMode(i2);
                    a2.edit().putInt("ftc_user_mode_prefix_" + queryUser.getUid(), i2).commit();
                } else {
                    int i3 = a2.getInt("ftc_user_mode_prefix_" + queryUser.getUid(), 0);
                    if (i3 == 2 || i3 == 1) {
                        queryUser.setUserMode(i3);
                    }
                }
            }
            C31975q.m66344a(queryUser);
            return queryUser;
        } catch (C34485a e) {
            C32840d.m67409a(false, e.getErrorCode(), e.getErrorMsg(), bundle);
            throw e;
        }
    }

    /* renamed from: a */
    private static void m67705a(String str) {
        try {
            HashMap hashMap = (HashMap) new C27910f().mo46671a(C33048q.m67689b(), new C27895a<HashMap<String, CachedUserAgeInfo>>() {
                /* class com.p2082ss.android.ugc.aweme.account.util.C33052u.C330553 */

                static {
                    Covode.recordClassIndex(39862);
                }
            }.type);
            if (hashMap != null) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null && TextUtils.equals((CharSequence) entry.getKey(), str)) {
                            hashMap.remove(entry.getKey());
                            break;
                        }
                    } else {
                        break;
                    }
                }
                C33048q.m67690b(new C27910f().mo46674b(hashMap));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C1731i<C31893a> m67702a(String str, boolean z, boolean z2) {
        MusLoginManager musLoginManager = new MusLoginManager();
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("birthday", str);
        }
        if (hashMap.containsKey("birthday")) {
            return musLoginManager.mo57744a(hashMap).mo5538b(new C33059y(str, z), C1731i.f5562a);
        }
        if (!C31575b.m65865g().isNewUser() || !z2 || C30223b.f72086a.mo53668a("facebook") || C30223b.f72086a.mo53668a("google")) {
            return C1731i.m5640b(CallableC33029aa.f78575a, C1731i.f5562a);
        }
        hashMap.put("in_device_restrict", String.valueOf(z2));
        return musLoginManager.mo57744a(hashMap).mo5538b(new C33060z(z), C1731i.f5562a);
    }

    /* renamed from: a */
    static final /* synthetic */ C1731i m67701a(String str, boolean z, C1731i iVar) {
        int i;
        String str2;
        if (iVar.mo5544c() || iVar.mo5539b() || !(((C31893a) iVar.mo5545d()).f76202a == 0 || ((C31893a) iVar.mo5545d()).f76202a == 5)) {
            String b = C36085cj.m73548b();
            CachedUserAgeInfo cachedUserAgeInfo = new CachedUserAgeInfo(str);
            String b2 = C33048q.m67689b();
            HashMap hashMap = null;
            if (TextUtils.isEmpty(b2)) {
                hashMap = new HashMap();
                hashMap.put(b, cachedUserAgeInfo);
            } else {
                try {
                    hashMap = (HashMap) new C27910f().mo46671a(b2, new C27895a<HashMap<String, CachedUserAgeInfo>>() {
                        /* class com.p2082ss.android.ugc.aweme.account.util.C33052u.C330542 */

                        static {
                            Covode.recordClassIndex(39861);
                        }
                    }.type);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (hashMap != null) {
                    hashMap.put(b, cachedUserAgeInfo);
                }
            }
            C33048q.m67690b(new C27910f().mo46674b(hashMap));
            C33743c a = new C33743c().mo59976a(StringSet.type, "/aweme/v3/user/info/sync/").mo59974a("error_message", Integer.valueOf(((C31893a) iVar.mo5545d()).f76202a));
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            C33743c a2 = a.mo59974a("status", Integer.valueOf(i));
            if (((C31893a) iVar.mo5545d()).f76204c != null) {
                str2 = ((C31893a) iVar.mo5545d()).f76204c.getImprId();
            } else {
                str2 = "";
            }
            C32837b.m67404a("compliance_api_status", "", a2.mo59976a("tns_logId", str2).mo59977a());
            C31566h.m65848a();
        } else if (iVar.mo5535a() && (((C31893a) iVar.mo5545d()).f76202a == 0 || ((C31893a) iVar.mo5545d()).f76202a == 5)) {
            if (z) {
                m67705a(C36085cj.m73548b());
            } else {
                C31566h.m65848a();
            }
            C32837b.m67404a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, "/aweme/v3/user/info/sync/").mo59974a("status", (Integer) 0).mo59977a());
        }
        return C1731i.m5640b(CallableC33031ac.f78577a, C1731i.f5562a);
    }
}
