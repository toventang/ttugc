package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45785f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.f */
public final class C45724f extends AbstractC45748n {

    /* renamed from: a */
    private C45806a f106493a;

    /* renamed from: b */
    private AbstractC89172b<? super String, C89391z> f106494b;

    /* renamed from: c */
    private AbstractC89171a<C89391z> f106495c;

    static {
        Covode.recordClassIndex(54242);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: c */
    public final void mo77068c() {
        View view = this.f106553f;
        if (!(view instanceof C45762q)) {
            view = null;
        }
        C45762q qVar = (C45762q) view;
        if (qVar != null) {
            m88264a(qVar);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: a */
    public final Animation mo12052a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: b */
    public final Animation mo12053b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77062a(C45806a aVar) {
        this.f106493a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77063a(AbstractC89171a<C89391z> aVar) {
        this.f106495c = aVar;
    }

    /* renamed from: a */
    private final void m88264a(C45762q qVar) {
        PopupCardVO popupCardVO = this.f106552e;
        if (popupCardVO != null) {
            qVar.mo77091a(popupCardVO, this.f106493a, this.f106494b, this.f106495c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77064a(AbstractC89172b<? super String, C89391z> bVar) {
        this.f106494b = bVar;
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
        C45762q qVar = new C45762q(context, (byte) 0);
        m88264a(qVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = C34728n.m70946a(12.0d);
        layoutParams.rightMargin = C34728n.m70946a(12.0d);
        layoutParams.bottomMargin = C34728n.m70946a(10.0d);
        qVar.setLayoutParams(layoutParams);
        PopupCardVO popupCardVO2 = this.f106552e;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage() && ((popupCardVO = this.f106552e) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (fVar2 = sourceMessage2.f106660l) == null || fVar2.f106681a != 0)) {
            PopupCardVO popupCardVO3 = this.f106552e;
            String str3 = null;
            if (popupCardVO3 != null) {
                str = String.valueOf(popupCardVO3.getProductId());
            } else {
                str = null;
            }
            C45806a aVar = this.f106493a;
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
                C45806a aVar2 = this.f106493a;
                if (aVar2 != null) {
                    j = aVar2.mo77119c("client_received_time");
                } else {
                    j = 0;
                }
                long j5 = j - fVar.f106683g;
                long currentTimeMillis2 = System.currentTimeMillis();
                C45806a aVar3 = this.f106493a;
                if (aVar3 != null) {
                    j2 = aVar3.mo77119c("client_received_time");
                } else {
                    j2 = 0;
                }
                C45792d.m88397a(str, str2, str3, currentTimeMillis, j3, j4, j5, currentTimeMillis2 - j2);
            }
        }
        return qVar;
    }
}
