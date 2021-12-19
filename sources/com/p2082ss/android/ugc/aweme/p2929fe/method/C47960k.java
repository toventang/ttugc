package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66393c;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66394d;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.AbstractC66420a;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66436i;
import java.net.URLEncoder;

/* renamed from: com.ss.android.ugc.aweme.fe.method.k */
public final class C47960k {
    static {
        Covode.recordClassIndex(56670);
    }

    /* renamed from: a */
    public static void m90947a(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            new C66436i(new C66394d(), new AbstractC66420a() {
                /* class com.p2082ss.android.ugc.aweme.p2929fe.method.C47960k.C479611 */

                static {
                    Covode.recordClassIndex(56671);
                }

                @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.AbstractC66420a
                /* renamed from: a */
                public final void mo79960a(Exception exc) {
                    exc.printStackTrace();
                    C47960k.m90948b(str, str2);
                }

                @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.AbstractC66420a
                /* renamed from: a */
                public final void mo79959a(C66393c cVar) {
                    if (cVar.f149296a != 0) {
                        String str = str;
                        String str2 = cVar.f149297b;
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "https://www.tiktok.com/link/";
                        }
                        Uri.Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(C17867d.f42590n)).appendQueryParameter("target", str);
                        C53453b bVar = C53453b.C53456a.f122693a;
                        C17867d.m33078a();
                        C47960k.m90948b(appendQueryParameter.appendQueryParameter("lang", C53453b.m98647a(bVar.mo90024b().mo90019c())).appendQueryParameter("scene", "qrcode").build().toString(), str2);
                        return;
                    }
                    C47960k.m90948b(str, str2);
                }
            }).mo105359a(str);
        }
    }

    /* renamed from: b */
    public static void m90948b(String str, String str2) {
        C47962l.m90955b("sslocal://webcast_webview?url=" + URLEncoder.encode(str) + str2);
    }
}
