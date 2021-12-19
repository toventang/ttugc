package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 */
final class TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 extends AbstractC89220m implements AbstractC89171a<Boolean> {
    public static final TwoStepVerificationService$Companion$isNewTo2svEnhancements$2 INSTANCE = new TwoStepVerificationService$Companion$isNewTo2svEnhancements$2();

    static {
        Covode.recordClassIndex(79735);
    }

    TwoStepVerificationService$Companion$isNewTo2svEnhancements$2() {
        super(0);
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Boolean invoke() {
        if (TwoStepVerificationService.keva.contains("is_new_to_2sv_enhancements")) {
            return TwoStepVerificationService.keva.getBoolean("is_new_to_2sv_enhancements", false);
        }
        return true;
    }
}
