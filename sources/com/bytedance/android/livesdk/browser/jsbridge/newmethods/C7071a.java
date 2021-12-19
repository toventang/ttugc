package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p488c.C7392j;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a */
public final class C7071a extends AbstractC18337f<C7072a, Object> {
    static {
        Covode.recordClassIndex(7817);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$a */
    static final class C7072a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        String f17683a;
        @AbstractC27891c(mo46611a = "item")

        /* renamed from: b */
        String f17684b;

        static {
            Covode.recordClassIndex(7818);
        }

        C7072a() {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ Object invoke(C7072a aVar, C18338g gVar) {
        C7072a aVar2 = aVar;
        if (TextUtils.equals(aVar2.f17683a, "toolbar")) {
            if (!TextUtils.equals(aVar2.f17684b, "gift")) {
                return null;
            }
            C6779a.m14563a().mo13053a(new C7392j(1));
            return null;
        } else if (!TextUtils.equals(aVar2.f17683a, "gift_panel") || !TextUtils.equals(aVar2.f17684b, "prop")) {
            return null;
        } else {
            C6779a.m14563a().mo13053a(new C7392j(2));
            return null;
        }
    }
}
