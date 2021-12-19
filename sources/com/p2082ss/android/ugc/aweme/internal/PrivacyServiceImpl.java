package com.p2082ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.internal.PrivacyServiceImpl */
public final class PrivacyServiceImpl implements IPrivacyService {
    static {
        Covode.recordClassIndex(66683);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IPrivacyService
    /* renamed from: b */
    public final boolean mo93976b() {
        return C80580in.m139687c();
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IPrivacyService
    /* renamed from: a */
    public final boolean mo93975a() {
        return C31575b.m65865g().getCurUser().isSecret();
    }

    /* renamed from: c */
    public static IPrivacyService m103033c() {
        MethodCollector.m26663i(6550);
        Object a = C81908b.m141854a(IPrivacyService.class, false);
        if (a != null) {
            IPrivacyService iPrivacyService = (IPrivacyService) a;
            MethodCollector.m26664o(6550);
            return iPrivacyService;
        }
        if (C81908b.f183207bJ == null) {
            synchronized (IPrivacyService.class) {
                try {
                    if (C81908b.f183207bJ == null) {
                        C81908b.f183207bJ = new PrivacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6550);
                    throw th;
                }
            }
        }
        PrivacyServiceImpl privacyServiceImpl = (PrivacyServiceImpl) C81908b.f183207bJ;
        MethodCollector.m26664o(6550);
        return privacyServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.internal.PrivacyServiceImpl$a */
    public static final class C56806a implements AbstractC68351c {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f129374a;

        static {
            Covode.recordClassIndex(66684);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
        /* renamed from: a */
        public final void mo68832a(Exception exc) {
        }

        C56806a(AbstractC89172b bVar) {
            this.f129374a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
        /* renamed from: a */
        public final void mo68831a(C68348f fVar) {
            if (fVar != null) {
                this.f129374a.invoke(fVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IPrivacyService
    /* renamed from: a */
    public final void mo93974a(AbstractC89172b<? super C68348f, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
        providePushSettingFetchPresenter.mo67839a_(new C56806a(bVar));
        providePushSettingFetchPresenter.mo57616a(new Object[0]);
    }
}
