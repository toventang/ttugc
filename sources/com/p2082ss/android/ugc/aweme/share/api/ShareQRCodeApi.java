package com.p2082ss.android.ugc.aweme.share.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.api.ShareQRCodeApi */
public final class ShareQRCodeApi {

    /* renamed from: a */
    public static final C68873b f154047a = new C68873b((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.share.api.ShareQRCodeApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(81176);
        }

        @AbstractC22012t(mo35799a = "/tiktok/share/qrcode/create/v1/")
        @AbstractC21999g
        C1731i<C66390a> getUserQRCodeInfo(@AbstractC21997e(mo35786a = "schema_type") int i, @AbstractC21997e(mo35786a = "object_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.api.ShareQRCodeApi$a */
    public interface AbstractC68872a {
        static {
            Covode.recordClassIndex(81177);
        }

        /* renamed from: a */
        void mo109445a(C66390a aVar);

        /* renamed from: a */
        void mo109446a(Exception exc);
    }

    static {
        Covode.recordClassIndex(81175);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.api.ShareQRCodeApi$b */
    public static final class C68873b {
        static {
            Covode.recordClassIndex(81178);
        }

        private C68873b() {
        }

        public /* synthetic */ C68873b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.api.ShareQRCodeApi$c */
    static final class C68874c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC68872a f154048a;

        static {
            Covode.recordClassIndex(81179);
        }

        C68874c(AbstractC68872a aVar) {
            this.f154048a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Exception exc = null;
            C66390a aVar = null;
            if (C80214ai.m139043a(iVar)) {
                AbstractC68872a aVar2 = this.f154048a;
                if (iVar != null) {
                    aVar = (C66390a) iVar.mo5545d();
                }
                aVar2.mo109445a(aVar);
            } else {
                AbstractC68872a aVar3 = this.f154048a;
                if (iVar != null) {
                    exc = iVar.mo5546e();
                }
                aVar3.mo109446a(exc);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m121544a(int i, String str, AbstractC68872a aVar) {
        C89219l.m154721d(aVar, "");
        ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class)).getUserQRCodeInfo(i, str).mo5532a(new C68874c(aVar));
    }
}
