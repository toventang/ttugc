package com.p2082ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2389bh.C34831a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.dr */
public final class C46849dr {

    /* renamed from: a */
    public static final C46849dr f109153a = new C46849dr();

    /* renamed from: b */
    private static boolean f109154b = true;

    /* renamed from: c */
    private static final AbstractC89244h f109155c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C46850a.f109156a);

    /* renamed from: a */
    public static final boolean m90163a() {
        return ((Boolean) f109155c.getValue()).booleanValue();
    }

    private C46849dr() {
    }

    static {
        Covode.recordClassIndex(55450);
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.dr$a */
    static final class C46850a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46850a f109156a = new C46850a();

        static {
            Covode.recordClassIndex(55451);
        }

        C46850a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            String[] stringArray;
            boolean z = true;
            if (Keva.getRepo("is_gms_async_bind", 1).getBoolean("async_bind_enable", false)) {
                if (!TextUtils.isEmpty(C34831a.f82285a) && (stringArray = Keva.getRepo("is_gms_async_bind", 1).getStringArray("ignore_activities", null)) != null) {
                    int length = stringArray.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (TextUtils.equals(stringArray[i], C34831a.f82285a)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public static void m90164b() {
        Keva repo = Keva.getRepo("is_gms_async_bind", 1);
        repo.storeBoolean("async_bind_enable", C16048b.m29633a().mo25421a(true, "gms_client_service_async_bind", false));
        repo.storeStringArray("ignore_activities", (String[]) SettingsManager.m29616a().mo25397a("async_binder_ignore_activity_settings", String[].class, C34831a.AbstractC34833a.f82286a));
    }
}
