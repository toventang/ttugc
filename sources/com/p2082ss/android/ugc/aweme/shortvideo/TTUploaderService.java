package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService */
public final class TTUploaderService {

    /* renamed from: a */
    private int f155848a = 0;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$RetrofitService */
    public interface RetrofitService {
        static {
            Covode.recordClassIndex(82141);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/pre/post/check/")
        AbstractFutureC27655q<C70010ct> getServerPrePostResult(@AbstractC89736t(mo144292a = "check_type") int i, @AbstractC89736t(mo144292a = "freq_limit") int i2);

        @AbstractC89731o(mo144285a = "/aweme/v1/post/prompts/")
        AbstractC88979t<C69789ac> getTitleSensitivityResult(@AbstractC89736t(mo144292a = "text") String str, @AbstractC89736t(mo144292a = "text_type") int i);

        @AbstractC89731o(mo144285a = "/aweme/v1/upload/authkey/")
        @AbstractC89721e
        AbstractFutureC27655q<C65611c> getUploadAuthKeyConfig(@AbstractC89720d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(82140);
    }

    /* renamed from: b */
    static RetrofitService m123219b() {
        return (RetrofitService) C63244g.m114602a().mo73257C().createRetrofit(AVApiImpl.m123134b().mo109850a(), true, RetrofitService.class);
    }

    /* renamed from: c */
    public static void m123220c() {
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            C1731i.m5640b(CallableC71803ei.f160909a, C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public final AbstractFutureC27655q<C65616g> mo110066a() {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return C27646l.m55296a(new Throwable());
        }
        AbstractFutureC27655q<C65611c> uploadAuthKeyConfig = m123219b().getUploadAuthKeyConfig(new HashMap(0));
        C27646l.m55298a(uploadAuthKeyConfig, new C69739a(this.f155848a), C27659u.EnumC27662a.INSTANCE);
        return C27646l.m55294a(uploadAuthKeyConfig, IOException.class, C71802eh.f160908a, C27659u.EnumC27662a.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$a */
    static class C69739a implements AbstractC27645k<C65616g> {

        /* renamed from: a */
        private int f155849a;

        static {
            Covode.recordClassIndex(82142);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
        }

        public C69739a(int i) {
            this.f155849a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C65616g gVar) {
            boolean z;
            C65616g gVar2 = gVar;
            if (gVar2 instanceof C65611c) {
                C63244g.m114602a().mo73277e().setSdkV4AuthKey(C63244g.m114602a().mo73261G().mo46674b(gVar2));
                C65611c cVar = (C65611c) gVar2;
                if (cVar.f147852b != null) {
                    AVPreferences e = C63244g.m114602a().mo73277e();
                    boolean z2 = false;
                    if (cVar.f147852b.f147867b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e.setEnablePreUpload(z);
                    C63244g.m114602a().mo73277e().setPreUploadEncryptionMode(cVar.f147852b.f147868c);
                    AVPreferences e2 = C63244g.m114602a().mo73277e();
                    if (cVar.f147852b.f147866a == 0) {
                        z2 = true;
                    }
                    e2.setWatermarkHardcode(z2);
                }
            }
        }
    }
}
