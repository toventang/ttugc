package com.p2082ss.android.ugc.aweme.profile.settings;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.settings.b */
public final class C63875b {

    /* renamed from: a */
    public static final String f144801a = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";

    /* renamed from: b */
    public static final C63875b f144802b = new C63875b();

    private C63875b() {
    }

    static {
        Covode.recordClassIndex(75301);
    }

    /* renamed from: a */
    public static String m115571a() {
        String str;
        try {
            str = SettingsManager.m29616a().mo25398a("download_app_link_schema", "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_baca_fe%2Fdownload_app_link%3Fhide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dbaca_fe%26bundle%3Dindex.js%26module_name%3Dpage_download_app_link%26hide_nav_bar%3D1%26enter_from%3D((enter_from))%26locale%3D((locale))";
        }
        if (str == null) {
            C89219l.m154715b();
        }
        return str;
    }
}
