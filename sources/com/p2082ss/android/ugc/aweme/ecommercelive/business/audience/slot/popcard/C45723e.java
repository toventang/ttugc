package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45785f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.e */
public final class C45723e extends AbstractC45716a {
    static {
        Covode.recordClassIndex(54241);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: b */
    public final void mo77051b() {
        View view = this.f106475a.f106553f;
        if (!(view instanceof C45751p)) {
            view = null;
        }
        C45751p pVar = (C45751p) view;
        if (pVar != null) {
            m88260a(pVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45723e(C45718c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: a */
    public final void mo77050a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        super.mo77050a(aVar);
        aVar.invoke();
    }

    /* renamed from: a */
    private final void m88260a(C45751p pVar) {
        PopupCardVO popupCardVO = this.f106475a.f106552e;
        if (popupCardVO != null) {
            pVar.mo77087a(popupCardVO, this.f106475a.f106477a, this.f106475a.f106478b, this.f106475a.f106479c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: a */
    public final View mo77049a(Context context) {
        PopupCardVO popupCardVO;
        String str;
        String str2;
        C45781b sourceMessage;
        C45785f fVar;
        long j;
        long j2;
        C45781b sourceMessage2;
        C45785f fVar2;
        C89219l.m154721d(context, "");
        C45751p pVar = new C45751p(context, (byte) 0);
        m88260a(pVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(300.0d), -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = C34728n.m70946a(12.0d);
        layoutParams.bottomMargin = C34728n.m70946a(8.0d);
        pVar.setLayoutParams(layoutParams);
        PopupCardVO popupCardVO2 = this.f106475a.f106552e;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage() && ((popupCardVO = this.f106475a.f106552e) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (fVar2 = sourceMessage2.f106660l) == null || fVar2.f106681a != 0)) {
            PopupCardVO popupCardVO3 = this.f106475a.f106552e;
            String str3 = null;
            if (popupCardVO3 != null) {
                str = String.valueOf(popupCardVO3.getProductId());
            } else {
                str = null;
            }
            C45806a aVar = this.f106475a.f106477a;
            if (aVar != null) {
                str2 = aVar.mo77118b("room_id");
            } else {
                str2 = null;
            }
            PopupCardVO popupCardVO4 = this.f106475a.f106552e;
            if (popupCardVO4 != null) {
                str3 = popupCardVO4.getFromMessageId();
            }
            PopupCardVO popupCardVO5 = this.f106475a.f106552e;
            if (!(popupCardVO5 == null || (sourceMessage = popupCardVO5.getSourceMessage()) == null || (fVar = sourceMessage.f106660l) == null)) {
                long currentTimeMillis = System.currentTimeMillis() - fVar.f106681a;
                long j3 = fVar.f106682f - fVar.f106681a;
                long j4 = fVar.f106683g - fVar.f106682f;
                C45806a aVar2 = this.f106475a.f106477a;
                if (aVar2 != null) {
                    j = aVar2.mo77119c("client_received_time");
                } else {
                    j = 0;
                }
                long j5 = j - fVar.f106683g;
                long currentTimeMillis2 = System.currentTimeMillis();
                C45806a aVar3 = this.f106475a.f106477a;
                if (aVar3 != null) {
                    j2 = aVar3.mo77119c("client_received_time");
                } else {
                    j2 = 0;
                }
                C45792d.m88397a(str, str2, str3, currentTimeMillis, j3, j4, j5, currentTimeMillis2 - j2);
            }
        }
        return pVar;
    }
}
