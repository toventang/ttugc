package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import android.view.Window;
import android.webkit.WebView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf */
public final class C7121bf extends AbstractC18337f<C7122a, Object> {

    /* renamed from: a */
    private C6972a f17738a;

    static {
        Covode.recordClassIndex(7867);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf$a */
    static final class C7122a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        String f17739a;
        @AbstractC27891c(mo46611a = "args")

        /* renamed from: b */
        C7123a f17740b;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf$a$a */
        static final class C7123a {
            @AbstractC27891c(mo46611a = "url")

            /* renamed from: a */
            String f17741a;
            @AbstractC27891c(mo46611a = "width")

            /* renamed from: b */
            int f17742b;
            @AbstractC27891c(mo46611a = "height")

            /* renamed from: c */
            int f17743c;
            @AbstractC27891c(mo46611a = "radius")

            /* renamed from: d */
            int f17744d;
            @AbstractC27891c(mo46611a = "close_by_mask")

            /* renamed from: e */
            int f17745e;

            static {
                Covode.recordClassIndex(7869);
            }
        }

        static {
            Covode.recordClassIndex(7868);
        }

        C7122a() {
        }
    }

    public C7121bf(C6972a aVar) {
        this.f17738a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(C7122a aVar, C18338g gVar) {
        String str;
        C7122a aVar2 = aVar;
        if (TextUtils.equals("webview_popup", aVar2.f17739a)) {
            C7122a.C7123a aVar3 = aVar2.f17740b;
            C6972a aVar4 = this.f17738a;
            String str2 = aVar3.f17741a;
            int i = aVar3.f17742b;
            int i2 = aVar3.f17743c;
            int i3 = aVar3.f17744d;
            int i4 = aVar3.f17745e;
            if (aVar4.getDialog() == null || aVar4.getDialog().getWindow() == null) {
                return null;
            }
            aVar4.getDialog().show();
            Window window = aVar4.getDialog().getWindow();
            if (window != null) {
                window.clearFlags(32);
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (aVar4.f17490p == null || !(aVar4.f17490p.mo13302f() instanceof WebView)) {
                str = "";
            } else {
                str = ((WebView) aVar4.f17490p.mo13302f()).getUrl();
            }
            if (!TextUtils.equals(str2, str)) {
                return null;
            }
            aVar4.mo13272a(i3);
            ActivityC0945e activity = aVar4.getActivity();
            boolean z = true;
            if (activity != null && activity.getRequestedOrientation() == 1) {
                if (aVar4.f17491q) {
                    i2 += 48;
                }
                aVar4.getDialog();
                aVar4.mo13273a(i, i2);
            }
            if (i4 != 1) {
                z = false;
            }
            aVar4.mo13276a(z);
            return null;
        }
        terminate();
        return null;
    }
}
