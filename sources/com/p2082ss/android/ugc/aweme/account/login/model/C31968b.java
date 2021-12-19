package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.b */
public final class C31968b {

    /* renamed from: a */
    public static C27910f f76337a = new C27910f();

    /* renamed from: b */
    public static final C31968b f76338b = new C31968b();

    /* renamed from: c */
    private static HashMap<String, List<PhoneCountryData>> f76339c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.b$a */
    public static final class C31969a extends C27895a<List<? extends PhoneCountryData>> {
        static {
            Covode.recordClassIndex(38723);
        }

        C31969a() {
        }
    }

    private C31968b() {
    }

    static {
        Covode.recordClassIndex(38722);
    }

    /* renamed from: b */
    public static final boolean m66339b() {
        try {
            if (((HashMap) SettingsManager.m29616a().mo25396a("choose_phone_country_list", HashMap.class)) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final PhoneCountryCodeResponse m66338a() {
        HashMap hashMap;
        try {
            if (f76339c.isEmpty() && (hashMap = (HashMap) SettingsManager.m29616a().mo25396a("choose_phone_country_list", HashMap.class)) != null) {
                for (String str : hashMap.keySet()) {
                    List list = (List) hashMap.get(str);
                    if (list != null) {
                        C89219l.m154716b(list, "");
                        List<PhoneCountryData> list2 = (List) f76337a.mo46671a(f76337a.mo46674b(list), new C31969a().type);
                        HashMap<String, List<PhoneCountryData>> hashMap2 = f76339c;
                        C89219l.m154716b(str, "");
                        C89219l.m154716b(list2, "");
                        hashMap2.put(str, list2);
                    }
                }
            }
            return new PhoneCountryCodeResponse(f76339c);
        } catch (Throwable unused) {
            return new PhoneCountryCodeResponse(f76339c);
        }
    }
}
