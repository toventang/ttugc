package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ca */
public final class C7165ca extends AbstractC18337f<Object, C7166a> {

    /* renamed from: a */
    public static boolean f17852a;

    static {
        Covode.recordClassIndex(7911);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ca$a */
    static final class C7166a {
        @AbstractC27891c(mo46611a = "is_login")

        /* renamed from: a */
        boolean f17853a;
        @AbstractC27891c(mo46611a = "user_id")

        /* renamed from: b */
        String f17854b = "";
        @AbstractC27891c(mo46611a = "short_id")

        /* renamed from: c */
        long f17855c = -1;
        @AbstractC27891c(mo46611a = "sec_user_id")

        /* renamed from: d */
        String f17856d;
        @AbstractC27891c(mo46611a = "is_silent")

        /* renamed from: e */
        int f17857e;

        static {
            Covode.recordClassIndex(7912);
        }

        C7166a() {
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ C7166a invoke(Object obj, C18338g gVar) {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        AbstractC2994b a = b.mo13147a();
        C7166a aVar = new C7166a();
        aVar.f17853a = b.mo13165e();
        if (aVar.f17853a) {
            aVar.f17854b = String.valueOf(a.getId());
            aVar.f17856d = a.getSecUid();
        }
        aVar.f17857e = f17852a ? 1 : 0;
        return aVar;
    }
}
