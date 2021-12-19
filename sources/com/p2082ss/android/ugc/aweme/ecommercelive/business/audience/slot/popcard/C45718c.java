package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.c */
public final class C45718c extends AbstractC45748n {

    /* renamed from: a */
    C45806a f106477a;

    /* renamed from: b */
    AbstractC89172b<? super String, C89391z> f106478b;

    /* renamed from: c */
    AbstractC89171a<C89391z> f106479c;

    /* renamed from: d */
    public AbstractC45716a f106480d = new C45723e(this);

    static {
        Covode.recordClassIndex(54236);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: c */
    public final void mo77068c() {
        this.f106480d.mo77051b();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: d */
    public final void mo77069d() {
        super.mo77069d();
        this.f106480d.mo77052c();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: e */
    public final void mo77070e() {
        super.mo77070e();
        this.f106480d.mo77053d();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: f */
    public final void mo77071f() {
        super.mo77071f();
        this.f106480d.mo77055e();
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
        this.f106477a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77063a(AbstractC89171a<C89391z> aVar) {
        this.f106479c = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77064a(AbstractC89172b<? super String, C89391z> bVar) {
        this.f106478b = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: b */
    public final View mo77066b(Context context) {
        C89219l.m154721d(context, "");
        return this.f106480d.mo77049a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77065a(String str) {
        C89219l.m154721d(str, "");
        super.mo77065a(str);
        this.f106480d.mo77054d(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: b */
    public final void mo77067b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        super.mo77067b(aVar);
        this.f106480d.mo77050a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45748n
    /* renamed from: a */
    public final void mo77061a(Context context, boolean z, String str, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        super.mo77061a(context, z, str, map);
        if (z) {
            AbstractC45716a aVar = this.f106480d;
            if (!(aVar instanceof C45719d)) {
                this.f106480d = new C45719d(context, this, str, map);
                return;
            }
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.ECExplanationCardSlotLynxImpl");
            C89219l.m154721d(str, "");
            ((C45719d) aVar).f106485e = str;
        } else if (!(this.f106480d instanceof C45723e)) {
            this.f106480d = new C45723e(this);
        }
    }
}
