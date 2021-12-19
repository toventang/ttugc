package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ak */
public final class C7090ak extends AbstractC18334e<C7091a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ak$a */
    public static final class C7091a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        public final String f17702a;

        static {
            Covode.recordClassIndex(7837);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C7091a) && C89219l.m154714a(this.f17702a, ((C7091a) obj).f17702a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f17702a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Params(type=" + this.f17702a + ")";
        }
    }

    static {
        Covode.recordClassIndex(7836);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7091a aVar, C18338g gVar) {
        C7091a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(gVar, "");
        String str = aVar2.f17702a;
        if (str.hashCode() == -990193242 && str.equals("anchor_submit_success")) {
            finishWithSuccess();
        } else {
            finishWithFailure();
        }
    }
}
