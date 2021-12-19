package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.chatroom.p488c.C7372ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p */
public final class C7188p extends AbstractC18334e<C7189a, Object> {

    /* renamed from: a */
    private final C88411a f17894a = new C88411a();

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$a */
    public static final class C7189a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        public final String f17895a;
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: b */
        public final String f17896b;
        @AbstractC27891c(mo46611a = "sender")

        /* renamed from: c */
        public final String f17897c;
        @AbstractC27891c(mo46611a = "args")

        /* renamed from: d */
        public final JSONObject f17898d;

        static {
            Covode.recordClassIndex(7935);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7189a)) {
                return false;
            }
            C7189a aVar = (C7189a) obj;
            return C89219l.m154714a(this.f17895a, aVar.f17895a) && C89219l.m154714a(this.f17896b, aVar.f17896b) && C89219l.m154714a(this.f17897c, aVar.f17897c) && C89219l.m154714a(this.f17898d, aVar.f17898d);
        }

        public final int hashCode() {
            String str = this.f17895a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f17896b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f17897c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            JSONObject jSONObject = this.f17898d;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "Params(type=" + this.f17895a + ", content=" + this.f17896b + ", sender=" + this.f17897c + ", args=" + this.f17898d + ")";
        }
    }

    static {
        Covode.recordClassIndex(7934);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        this.f17894a.dispose();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$b */
    static final class C7190b extends AbstractC89220m implements AbstractC89172b<String, C89378p<? extends String, ? extends Object>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f17899a;

        static {
            Covode.recordClassIndex(7936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7190b(JSONObject jSONObject) {
            super(1);
            this.f17899a = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89378p<? extends String, ? extends Object> invoke(String str) {
            String str2 = str;
            return C89387v.m154943a(str2, this.f17899a.get(str2));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$c */
    static final class C7191c<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ C7188p f17900a;

        /* renamed from: b */
        final /* synthetic */ AbstractC7394l f17901b;

        static {
            Covode.recordClassIndex(7937);
        }

        C7191c(C7188p pVar, AbstractC7394l lVar) {
            this.f17900a = pVar;
            this.f17901b = lVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C7372ae aeVar = (C7372ae) obj;
            C89219l.m154721d(aeVar, "");
            if (aeVar.f18273a == this.f17901b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.p$d */
    static final class C7192d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7188p f17902a;

        /* renamed from: b */
        final /* synthetic */ AbstractC7394l f17903b;

        static {
            Covode.recordClassIndex(7938);
        }

        C7192d(C7188p pVar, AbstractC7394l lVar) {
            this.f17902a = pVar;
            this.f17903b = lVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C7372ae) obj).f18274b) {
                this.f17902a.finishWithSuccess();
            } else {
                this.f17902a.finishWithFailure();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        if (r8 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008f  */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void invoke(com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7188p.C7189a r10, com.bytedance.ies.web.jsbridge2.C18338g r11) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7188p.invoke(java.lang.Object, com.bytedance.ies.web.jsbridge2.g):void");
    }
}
