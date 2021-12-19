package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b */
public final class C43739b implements AbstractC89172b<C23024a, C89391z> {

    /* renamed from: a */
    public final Context f101949a;

    /* renamed from: b */
    public final ButtonAction f101950b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f101951c;

    /* renamed from: d */
    public final AbstractC89172b<FetchInfo, C89391z> f101952d;

    /* renamed from: e */
    public final AbstractC89171a<C89391z> f101953e;

    /* renamed from: f */
    public final String f101954f;

    static {
        Covode.recordClassIndex(52004);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: h.f.a.b<com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(C23024a aVar) {
        ButtonActionInfo buttonActionInfo;
        String schema;
        C89219l.m154721d(aVar, "");
        ButtonAction buttonAction = this.f101950b;
        if (buttonAction != null) {
            Integer buttonActionType = buttonAction.getButtonActionType();
            if (buttonActionType != null && buttonActionType.intValue() == 0) {
                String str = this.f101954f;
                if (str != null) {
                    C43732h.m86722a("server", "stay", str, 8);
                }
            } else if (buttonActionType != null && buttonActionType.intValue() == 1) {
                String str2 = this.f101954f;
                if (str2 != null) {
                    C43732h.m86722a("server", "quit", str2, 8);
                }
                this.f101951c.invoke();
            } else {
                Object obj = null;
                if (buttonActionType != null && buttonActionType.intValue() == 2) {
                    String str3 = this.f101954f;
                    if (str3 != null) {
                        C43732h.m86722a("server", "retry", str3, 8);
                    }
                    AbstractC89172b<FetchInfo, C89391z> bVar = this.f101952d;
                    if (bVar != 0) {
                        ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                        if (buttonActionInfo2 != null) {
                            obj = buttonActionInfo2.getFetchInfo();
                        }
                        bVar.invoke(obj);
                    }
                } else if (buttonActionType != null) {
                    if (buttonActionType.intValue() == 3) {
                        String str4 = this.f101954f;
                        if (str4 != null) {
                            C43732h.m86722a("server", "enter", str4, 8);
                        }
                        ButtonActionInfo buttonActionInfo3 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo3 == null || buttonActionInfo3.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo4 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo4 != null) {
                                obj = buttonActionInfo4.getSchema();
                            }
                            if (!(!(!C89219l.m154714a(obj, (Object) "")) || (buttonActionInfo = buttonAction.getButtonActionInfo()) == null || (schema = buttonActionInfo.getSchema()) == null)) {
                                SmartRouter.buildRoute(this.f101949a, C45264j.m87846c(schema, C89041ag.m154428c(new C89378p("trackParams", C33039i.m67673a().mo46674b(C89041ag.m154428c(new C89378p("previous_page", "order_submit"))))))).open();
                            }
                        }
                    } else if (buttonActionType.intValue() == 4) {
                        String str5 = this.f101954f;
                        if (str5 != null) {
                            C43732h.m86722a("server", "enter", str5, 8);
                        }
                        ButtonActionInfo buttonActionInfo5 = buttonAction.getButtonActionInfo();
                        if (!(buttonActionInfo5 == null || buttonActionInfo5.getSchema() == null)) {
                            ButtonActionInfo buttonActionInfo6 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo6 != null) {
                                obj = buttonActionInfo6.getSchema();
                            }
                            if (!C89219l.m154714a(obj, (Object) "")) {
                                SmartRouter.buildRoute(this.f101949a, C45264j.m87846c(buttonAction.getButtonActionInfo().getSchema(), C89041ag.m154428c(new C89378p("trackParams", C33039i.m67673a().mo46674b(C89041ag.m154428c(new C89378p("previous_page", "order_submit"))))))).open();
                                AbstractC89171a<C89391z> aVar2 = this.f101951c;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                            }
                        }
                        new C79459a(this.f101949a).mo123050a(R.string.fv9).mo123053a();
                    } else if (buttonActionType.intValue() == 5) {
                        String str6 = this.f101954f;
                        if (str6 != null) {
                            C43732h.m86722a("server", "enter", str6, 8);
                        }
                        AbstractC89171a<C89391z> aVar3 = this.f101953e;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                    }
                }
            }
        }
        return C89391z.f203057a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43739b(Context context, ButtonAction buttonAction, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super FetchInfo, C89391z> bVar, AbstractC89171a<C89391z> aVar2, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f101949a = context;
        this.f101950b = buttonAction;
        this.f101951c = aVar;
        this.f101952d = bVar;
        this.f101953e = aVar2;
        this.f101954f = str;
    }
}
