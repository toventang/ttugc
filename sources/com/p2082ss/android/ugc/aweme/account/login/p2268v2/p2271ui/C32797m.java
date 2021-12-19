package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.m */
public final class C32797m {

    /* renamed from: a */
    public static final C32797m f78147a = new C32797m();

    private C32797m() {
    }

    static {
        Covode.recordClassIndex(39576);
    }

    /* renamed from: a */
    public static String m67389a() {
        String str;
        try {
            str = SettingsManager.m29616a().mo25398a("minor_default_private_hint_intro_url", "");
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "aweme://webview/?url=https%3A%2F%2Fsupport.tiktok.com%2F" + ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a() + "%2Faccount-and-privacy%2Faccount-privacy-settings%2Fmaking-your-account-public-or-private";
        }
        if (str == null) {
            C89219l.m154715b();
        }
        return str;
    }
}
