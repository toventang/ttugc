package com.p2082ss.android.ugc.aweme.ecommerce.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a */
public final class C44293a implements AbstractC89172b<C23024a, C89391z> {

    /* renamed from: a */
    public final Context f103296a;

    /* renamed from: b */
    public final ButtonAction f103297b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f103298c;

    /* renamed from: d */
    public final AbstractC89172b<FetchInfo, C89391z> f103299d;

    /* renamed from: e */
    public final AbstractC89172b<ButtonAction, Boolean> f103300e;

    static {
        Covode.recordClassIndex(52607);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: h.f.a.b<com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(C23024a aVar) {
        AbstractC89172b<ButtonAction, Boolean> bVar;
        Integer buttonActionType;
        C89219l.m154721d(aVar, "");
        ButtonAction buttonAction = this.f103297b;
        if (buttonAction != null && (((bVar = this.f103300e) == null || !bVar.invoke(buttonAction).booleanValue()) && ((buttonActionType = buttonAction.getButtonActionType()) == null || buttonActionType.intValue() != 0))) {
            if (buttonActionType != null && buttonActionType.intValue() == 1) {
                this.f103298c.invoke();
            } else {
                Object obj = null;
                if (buttonActionType != null && buttonActionType.intValue() == 2) {
                    AbstractC89172b<FetchInfo, C89391z> bVar2 = this.f103299d;
                    if (bVar2 != 0) {
                        ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
                        if (buttonActionInfo != null) {
                            obj = buttonActionInfo.getFetchInfo();
                        }
                        bVar2.invoke(obj);
                    }
                } else if (buttonActionType != null) {
                    if (buttonActionType.intValue() == 3) {
                        ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo2 == null || buttonActionInfo2.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo3 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo3 != null) {
                                obj = buttonActionInfo3.getSchema();
                            }
                            if (!C89219l.m154714a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f103296a, C45264j.m87846c(buttonAction.getButtonActionInfo().getSchema(), C89041ag.m154428c(new C89378p("trackParams", C33039i.m67673a().mo46674b(C89041ag.m154428c(new C89378p("previous_page", "order_submit"))))))).open();
                            }
                        }
                    } else if (buttonActionType.intValue() == 4) {
                        ButtonActionInfo buttonActionInfo4 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo4 == null || buttonActionInfo4.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo5 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo5 != null) {
                                obj = buttonActionInfo5.getSchema();
                            }
                            if (!C89219l.m154714a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f103296a, C45264j.m87846c(buttonAction.getButtonActionInfo().getSchema(), C89041ag.m154428c(new C89378p("trackParams", C33039i.m67673a().mo46674b(C89041ag.m154428c(new C89378p("previous_page", "order_submit"))))))).open();
                                AbstractC89171a<C89391z> aVar2 = this.f103298c;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                            }
                        }
                        new C79459a(this.f103296a).mo123050a(R.string.fv9).mo123053a();
                    }
                }
            }
        }
        return C89391z.f203057a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C44293a(Context context, ButtonAction buttonAction, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super FetchInfo, C89391z> bVar, AbstractC89172b<? super ButtonAction, Boolean> bVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f103296a = context;
        this.f103297b = buttonAction;
        this.f103298c = aVar;
        this.f103299d = bVar;
        this.f103300e = bVar2;
    }
}
