package com.p2082ss.android.ugc.aweme.setting.verification;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.verification.VerificationApi;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.verification.c */
public final class C68707c {

    /* renamed from: b */
    public static final C68708a f153711b = new C68708a((byte) 0);

    /* renamed from: a */
    public final C88411a f153712a = new C88411a();

    static {
        Covode.recordClassIndex(80972);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.c$a */
    public static final class C68708a {
        static {
            Covode.recordClassIndex(80973);
        }

        private C68708a() {
        }

        /* renamed from: d */
        public static boolean m121147d() {
            if (m121148e() || m121149f()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m121145b() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                C89219l.m154716b(mtcertSettings, "");
                Boolean enablePrivateAccountNotice = mtcertSettings.getEnablePrivateAccountNotice();
                C89219l.m154716b(enablePrivateAccountNotice, "");
                return enablePrivateAccountNotice.booleanValue();
            } catch (C16041a unused) {
                return false;
            }
        }

        /* renamed from: c */
        public static boolean m121146c() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                C89219l.m154716b(mtcertSettings, "");
                Boolean enableChangeMobileNotice = mtcertSettings.getEnableChangeMobileNotice();
                C89219l.m154716b(enableChangeMobileNotice, "");
                return enableChangeMobileNotice.booleanValue();
            } catch (C16041a unused) {
                return false;
            }
        }

        /* renamed from: e */
        public static boolean m121148e() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                C89219l.m154716b(mtcertSettings, "");
                Boolean enableChangeHandleNotice = mtcertSettings.getEnableChangeHandleNotice();
                C89219l.m154716b(enableChangeHandleNotice, "");
                return enableChangeHandleNotice.booleanValue();
            } catch (C16041a unused) {
                return false;
            }
        }

        /* renamed from: f */
        public static boolean m121149f() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                C89219l.m154716b(mtcertSettings, "");
                Boolean enableChangeNicknameNotice = mtcertSettings.getEnableChangeNicknameNotice();
                C89219l.m154716b(enableChangeNicknameNotice, "");
                return enableChangeNicknameNotice.booleanValue();
            } catch (C16041a unused) {
                return false;
            }
        }

        /* renamed from: a */
        public static boolean m121144a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
                C89219l.m154716b(mtcertSettings, "");
                Boolean showCertEntry = mtcertSettings.getShowCertEntry();
                C89219l.m154716b(showCertEntry, "");
                return showCertEntry.booleanValue();
            } catch (C16041a e) {
                e.printStackTrace();
                return false;
            }
        }

        public /* synthetic */ C68708a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.verification.c$b */
    public static final class C68709b implements AbstractC88986z<VerificationResponse> {

        /* renamed from: a */
        final /* synthetic */ C68707c f153713a;

        /* renamed from: b */
        final /* synthetic */ C68706b f153714b;

        static {
            Covode.recordClassIndex(80974);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            this.f153714b.mo108573a();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f153714b.mo108573a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(VerificationResponse verificationResponse) {
            VerificationResponse verificationResponse2 = verificationResponse;
            C89219l.m154721d(verificationResponse2, "");
            this.f153714b.mo69127a(verificationResponse2);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f153713a.f153712a.mo142945a(bVar);
        }

        C68709b(C68707c cVar, C68706b bVar) {
            this.f153713a = cVar;
            this.f153714b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo109185a(User user, C68706b bVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(bVar, "");
        mo109186a(C68708a.m121147d(), user, bVar);
    }

    /* renamed from: a */
    public final void mo109186a(boolean z, User user, C68706b bVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(bVar, "");
        if (z) {
            VerificationApi.C68704a.m121139a().requestVerification(user.getSecUid()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C68709b(this, bVar));
            return;
        }
        VerificationResponse verificationResponse = new VerificationResponse();
        verificationResponse.setMtCertStatusEnum(MtCertStatusEnum.CS_EMPTY);
        verificationResponse.setMtCertingActionEnum(MtCertingActionEnum.CA_EMPTY);
        bVar.mo69127a(verificationResponse);
        bVar.mo108573a();
    }
}
