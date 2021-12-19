package com.p2082ss.android.ugc.aweme.account.agegate.p2239d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.agegate.api.C31411b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.d.c */
public final class C31536c {
    static {
        Covode.recordClassIndex(38253);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.d.c$a */
    public static final class C31537a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f75425a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f75426b;

        static {
            Covode.recordClassIndex(38254);
        }

        public C31537a(AbstractC89172b bVar, AbstractC89183m mVar) {
            this.f75425a = bVar;
            this.f75426b = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            C31411b bVar = (C31411b) obj;
            if (bVar.status_code == 0) {
                AbstractC89172b bVar2 = this.f75425a;
                Integer num = bVar.f75218a;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                bVar2.invoke(Integer.valueOf(i));
                JSONObject a = new C33743c().mo59976a(StringSet.type, "/tiktok/v1/calculate/age/").mo59974a("status", (Integer) 0).mo59977a();
                C89219l.m154716b(a, "");
                C32837b.m67405a("compliance_api_status", a);
                return;
            }
            AbstractC89183m mVar = this.f75426b;
            Integer valueOf = Integer.valueOf(bVar.status_code);
            String str = bVar.message;
            C89219l.m154716b(str, "");
            mVar.invoke(valueOf, str);
            JSONObject a2 = new C33743c().mo59974a("error_message", Integer.valueOf(bVar.status_code)).mo59976a(StringSet.type, "/tiktok/v1/calculate/age/").mo59974a("status", (Integer) 1).mo59977a();
            C89219l.m154716b(a2, "");
            C32837b.m67405a("compliance_api_status", a2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.d.c$b */
    public static final class C31538b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f75427a;

        static {
            Covode.recordClassIndex(38255);
        }

        public C31538b(AbstractC89183m mVar) {
            this.f75427a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            Throwable th = (Throwable) obj;
            if (th instanceof C34485a) {
                AbstractC89183m mVar = this.f75427a;
                C34485a aVar = (C34485a) th;
                Integer valueOf = Integer.valueOf(aVar.getErrorCode());
                String errorMsg = aVar.getErrorMsg();
                C89219l.m154716b(errorMsg, "");
                mVar.invoke(valueOf, errorMsg);
            } else {
                this.f75427a.invoke(1, "");
            }
            C33743c cVar = new C33743c();
            if (th instanceof C34480a) {
                i = ((C34480a) th).getErrorCode();
            } else {
                i = 0;
            }
            JSONObject a = cVar.mo59974a("error_message", Integer.valueOf(i)).mo59976a(StringSet.type, "/tiktok/v1/calculate/age/").mo59974a("status", (Integer) 1).mo59977a();
            C89219l.m154716b(a, "");
            C32837b.m67405a("compliance_api_status", a);
        }
    }
}
