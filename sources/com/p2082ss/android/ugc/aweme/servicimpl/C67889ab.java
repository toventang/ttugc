package com.p2082ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w;
import com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService;
import com.p2082ss.android.ugc.aweme.setting.services.PrivacySettingService;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.ab */
public final class C67889ab {

    /* renamed from: a */
    public static final C67889ab f152066a = new C67889ab();

    private C67889ab() {
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ab$a */
    public static final class C67890a implements AbstractC63266w {

        /* renamed from: a */
        private final IPrivacySettingService f152067a = PrivacySettingService.m120774a();

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.ab$a$a */
        final /* synthetic */ class C67891a implements IPrivacySettingService.AbstractC68424a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f152068a;

            static {
                Covode.recordClassIndex(80060);
            }

            C67891a(AbstractC89171a aVar) {
                this.f152068a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.setting.services.IPrivacySettingService.AbstractC68424a
            /* renamed from: a */
            public final /* synthetic */ void mo108499a() {
                C89219l.m154716b(this.f152068a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(80059);
        }

        C67890a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
        /* renamed from: b */
        public final void mo101761b(Activity activity) {
            this.f152067a.mo108852b(activity);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
        /* renamed from: a */
        public final boolean mo101760a(Activity activity) {
            C89219l.m154721d(activity, "");
            return this.f152067a.mo108851a(activity);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
        /* renamed from: a */
        public final void mo101759a(Activity activity, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(aVar, "");
            this.f152067a.mo108850a(activity, new C67891a(aVar));
        }
    }

    static {
        Covode.recordClassIndex(80058);
    }
}
