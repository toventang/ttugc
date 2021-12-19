package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.n */
public abstract class AbstractC45748n implements IFrameSlot {

    /* renamed from: e */
    public PopupCardVO f106552e;

    /* renamed from: f */
    public View f106553f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f106554g;

    /* renamed from: h */
    public AbstractC89172b<? super String, C89391z> f106555h;

    static {
        Covode.recordClassIndex(54266);
    }

    /* renamed from: a */
    public void mo77061a(Context context, boolean z, String str, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
    }

    /* renamed from: a */
    public abstract void mo77062a(C45806a aVar);

    /* renamed from: a */
    public abstract void mo77063a(AbstractC89171a<C89391z> aVar);

    /* renamed from: a */
    public abstract void mo77064a(AbstractC89172b<? super String, C89391z> bVar);

    /* renamed from: a */
    public void mo77065a(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: b */
    public abstract View mo77066b(Context context);

    /* renamed from: b */
    public void mo77067b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: c */
    public abstract void mo77068c();

    /* renamed from: d */
    public void mo77069d() {
    }

    /* renamed from: e */
    public void mo77070e() {
    }

    /* renamed from: f */
    public void mo77071f() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    /* renamed from: a */
    public final View mo12051a(Context context) {
        C89219l.m154721d(context, "");
        View b = mo77066b(context);
        this.f106553f = b;
        AbstractC89171a<C89391z> aVar = this.f106554g;
        if (aVar != null) {
            aVar.invoke();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo77084a(PopupCardVO popupCardVO) {
        this.f106552e = popupCardVO;
        mo77068c();
    }
}
