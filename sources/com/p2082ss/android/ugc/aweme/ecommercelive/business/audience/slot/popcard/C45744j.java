package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45785f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.j */
public final class C45744j extends AbstractC45748n {

    /* renamed from: a */
    private C45806a f106544a;

    /* renamed from: b */
    private AbstractC89172b<? super String, C89391z> f106545b;

    /* renamed from: c */
    private AbstractC89171a<C89391z> f106546c;

    static {
        Covode.recordClassIndex(54262);
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: a */
    public final Animation mo12052a() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: b */
    public final Animation mo12053b() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: c */
    public final void mo77068c() {
        View view = this.f106553f;
        if (!(view instanceof C45771r)) {
            view = null;
        }
        C45771r rVar = (C45771r) view;
        if (rVar != null) {
            m88311a(rVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77062a(C45806a aVar) {
        this.f106544a = aVar;
    }

    /* renamed from: a */
    private final void m88311a(C45771r rVar) {
        PopupCardVO popupCardVO = this.f106552e;
        if (popupCardVO != null) {
            rVar.mo77093a(popupCardVO, this.f106544a, this.f106545b, this.f106546c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77063a(AbstractC89171a<C89391z> aVar) {
        this.f106546c = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77064a(AbstractC89172b<? super String, C89391z> bVar) {
        this.f106545b = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: b */
    public final View mo77066b(Context context) {
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
        C45771r rVar = new C45771r(context, (byte) 0);
        m88311a(rVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        rVar.setLayoutParams(layoutParams);
        PopupCardVO popupCardVO2 = this.f106552e;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage() && ((popupCardVO = this.f106552e) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (fVar2 = sourceMessage2.f106660l) == null || fVar2.f106681a != 0)) {
            PopupCardVO popupCardVO3 = this.f106552e;
            String str3 = null;
            if (popupCardVO3 != null) {
                str = String.valueOf(popupCardVO3.getProductId());
            } else {
                str = null;
            }
            C45806a aVar = this.f106544a;
            if (aVar != null) {
                str2 = aVar.mo77118b("room_id");
            } else {
                str2 = null;
            }
            PopupCardVO popupCardVO4 = this.f106552e;
            if (popupCardVO4 != null) {
                str3 = popupCardVO4.getFromMessageId();
            }
            PopupCardVO popupCardVO5 = this.f106552e;
            if (!(popupCardVO5 == null || (sourceMessage = popupCardVO5.getSourceMessage()) == null || (fVar = sourceMessage.f106660l) == null)) {
                long currentTimeMillis = System.currentTimeMillis() - fVar.f106681a;
                long j3 = fVar.f106682f - fVar.f106681a;
                long j4 = fVar.f106683g - fVar.f106682f;
                C45806a aVar2 = this.f106544a;
                if (aVar2 != null) {
                    j = aVar2.mo77119c("client_received_time");
                } else {
                    j = 0;
                }
                long j5 = j - fVar.f106683g;
                long currentTimeMillis2 = System.currentTimeMillis();
                C45806a aVar3 = this.f106544a;
                if (aVar3 != null) {
                    j2 = aVar3.mo77119c("client_received_time");
                } else {
                    j2 = 0;
                }
                C45792d.m88397a(str, str2, str3, currentTimeMillis, j3, j4, j5, currentTimeMillis2 - j2);
            }
        }
        return rVar;
    }
}
