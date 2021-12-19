package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44085n;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState */
public final class PaymentState implements AbstractC20368af {
    private final boolean autoCloseFrag;
    private final C44086o checkedPaymentMethod;
    private final boolean emailHintVisible;
    private final C44085n paymentInfo;
    private final C44085n paymentInfoForNextStep;
    private final C44085n paymentInfoForThreeStepCache;
    private final List<Object> paymentList;
    private final Object resendPayAction;
    private final boolean showLoading;
    private final String systemError;

    static {
        Covode.recordClassIndex(52331);
    }

    public PaymentState() {
        this(null, null, null, null, false, null, null, false, false, null, 1023, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentState copy$default(PaymentState paymentState, C44086o oVar, List list, C44085n nVar, String str, boolean z, C44085n nVar2, C44085n nVar3, boolean z2, boolean z3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            oVar = paymentState.checkedPaymentMethod;
        }
        if ((i & 2) != 0) {
            list = paymentState.paymentList;
        }
        if ((i & 4) != 0) {
            nVar = paymentState.paymentInfo;
        }
        if ((i & 8) != 0) {
            str = paymentState.systemError;
        }
        if ((i & 16) != 0) {
            z = paymentState.emailHintVisible;
        }
        if ((i & 32) != 0) {
            nVar2 = paymentState.paymentInfoForThreeStepCache;
        }
        if ((i & 64) != 0) {
            nVar3 = paymentState.paymentInfoForNextStep;
        }
        if ((i & 128) != 0) {
            z2 = paymentState.autoCloseFrag;
        }
        if ((i & 256) != 0) {
            z3 = paymentState.showLoading;
        }
        if ((i & 512) != 0) {
            obj = paymentState.resendPayAction;
        }
        return paymentState.copy(oVar, list, nVar, str, z, nVar2, nVar3, z2, z3, obj);
    }

    public final C44086o component1() {
        return this.checkedPaymentMethod;
    }

    public final Object component10() {
        return this.resendPayAction;
    }

    public final List<Object> component2() {
        return this.paymentList;
    }

    public final C44085n component3() {
        return this.paymentInfo;
    }

    public final String component4() {
        return this.systemError;
    }

    public final boolean component5() {
        return this.emailHintVisible;
    }

    public final C44085n component6() {
        return this.paymentInfoForThreeStepCache;
    }

    public final C44085n component7() {
        return this.paymentInfoForNextStep;
    }

    public final boolean component8() {
        return this.autoCloseFrag;
    }

    public final boolean component9() {
        return this.showLoading;
    }

    public final PaymentState copy(C44086o oVar, List<? extends Object> list, C44085n nVar, String str, boolean z, C44085n nVar2, C44085n nVar3, boolean z2, boolean z3, Object obj) {
        C89219l.m154721d(list, "");
        return new PaymentState(oVar, list, nVar, str, z, nVar2, nVar3, z2, z3, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentState)) {
            return false;
        }
        PaymentState paymentState = (PaymentState) obj;
        return C89219l.m154714a(this.checkedPaymentMethod, paymentState.checkedPaymentMethod) && C89219l.m154714a(this.paymentList, paymentState.paymentList) && C89219l.m154714a(this.paymentInfo, paymentState.paymentInfo) && C89219l.m154714a(this.systemError, paymentState.systemError) && this.emailHintVisible == paymentState.emailHintVisible && C89219l.m154714a(this.paymentInfoForThreeStepCache, paymentState.paymentInfoForThreeStepCache) && C89219l.m154714a(this.paymentInfoForNextStep, paymentState.paymentInfoForNextStep) && this.autoCloseFrag == paymentState.autoCloseFrag && this.showLoading == paymentState.showLoading && C89219l.m154714a(this.resendPayAction, paymentState.resendPayAction);
    }

    public final int hashCode() {
        C44086o oVar = this.checkedPaymentMethod;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        List<Object> list = this.paymentList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C44085n nVar = this.paymentInfo;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str = this.systemError;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.emailHintVisible;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        C44085n nVar2 = this.paymentInfoForThreeStepCache;
        int hashCode5 = (i6 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        C44085n nVar3 = this.paymentInfoForNextStep;
        int hashCode6 = (hashCode5 + (nVar3 != null ? nVar3.hashCode() : 0)) * 31;
        boolean z2 = this.autoCloseFrag;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode6 + i7) * 31;
        if (!this.showLoading) {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        Object obj = this.resendPayAction;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        return "PaymentState(checkedPaymentMethod=" + this.checkedPaymentMethod + ", paymentList=" + this.paymentList + ", paymentInfo=" + this.paymentInfo + ", systemError=" + this.systemError + ", emailHintVisible=" + this.emailHintVisible + ", paymentInfoForThreeStepCache=" + this.paymentInfoForThreeStepCache + ", paymentInfoForNextStep=" + this.paymentInfoForNextStep + ", autoCloseFrag=" + this.autoCloseFrag + ", showLoading=" + this.showLoading + ", resendPayAction=" + this.resendPayAction + ")";
    }

    public final boolean getAutoCloseFrag() {
        return this.autoCloseFrag;
    }

    public final C44086o getCheckedPaymentMethod() {
        return this.checkedPaymentMethod;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final C44085n getPaymentInfo() {
        return this.paymentInfo;
    }

    public final C44085n getPaymentInfoForNextStep() {
        return this.paymentInfoForNextStep;
    }

    public final C44085n getPaymentInfoForThreeStepCache() {
        return this.paymentInfoForThreeStepCache;
    }

    public final List<Object> getPaymentList() {
        return this.paymentList;
    }

    public final Object getResendPayAction() {
        return this.resendPayAction;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final String getSystemError() {
        return this.systemError;
    }

    public PaymentState(C44086o oVar, List<? extends Object> list, C44085n nVar, String str, boolean z, C44085n nVar2, C44085n nVar3, boolean z2, boolean z3, Object obj) {
        C89219l.m154721d(list, "");
        this.checkedPaymentMethod = oVar;
        this.paymentList = list;
        this.paymentInfo = nVar;
        this.systemError = str;
        this.emailHintVisible = z;
        this.paymentInfoForThreeStepCache = nVar2;
        this.paymentInfoForNextStep = nVar3;
        this.autoCloseFrag = z2;
        this.showLoading = z3;
        this.resendPayAction = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentState(C44086o oVar, List list, C44085n nVar, String str, boolean z, C44085n nVar2, C44085n nVar3, boolean z2, boolean z3, Object obj, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : oVar, (i & 2) != 0 ? C89086z.INSTANCE : list, (i & 4) != 0 ? null : nVar, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : nVar2, (i & 64) != 0 ? null : nVar3, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? obj : null);
    }
}
