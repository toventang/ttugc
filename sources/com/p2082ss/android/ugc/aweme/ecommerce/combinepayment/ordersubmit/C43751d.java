package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d */
public final class C43751d {

    /* renamed from: a */
    public static final C43751d f102011a = new C43751d();

    private C43751d() {
    }

    static {
        Covode.recordClassIndex(52016);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d$c */
    public static final class C43754c extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f102021a;

        /* renamed from: b */
        final /* synthetic */ boolean f102022b;

        /* renamed from: c */
        final /* synthetic */ C23023b f102023c;

        /* renamed from: d */
        final /* synthetic */ int f102024d;

        /* renamed from: e */
        final /* synthetic */ String f102025e;

        /* renamed from: f */
        final /* synthetic */ DialogContent f102026f;

        /* renamed from: g */
        final /* synthetic */ Context f102027g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89171a f102028h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f102029i;

        /* renamed from: j */
        final /* synthetic */ AbstractC89171a f102030j;

        static {
            Covode.recordClassIndex(52019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43754c(List list, boolean z, C23023b bVar, int i, String str, DialogContent dialogContent, Context context, AbstractC89171a aVar, AbstractC89172b bVar2, AbstractC89171a aVar2) {
            super(1);
            this.f102021a = list;
            this.f102022b = z;
            this.f102023c = bVar;
            this.f102024d = i;
            this.f102025e = str;
            this.f102026f = dialogContent;
            this.f102027g = context;
            this.f102028h = aVar;
            this.f102029i = bVar2;
            this.f102030j = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            String str;
            C23029d dVar2 = dVar;
            String str2 = "";
            C89219l.m154721d(dVar2, str2);
            String str3 = null;
            if (C89070n.m154583g(this.f102021a) != null) {
                String text = ((DialogButton) C89070n.m154579f(this.f102021a)).getText();
                if (text == null) {
                    text = str2;
                }
                Context context = this.f102027g;
                ButtonAction buttonAction = ((DialogButton) C89070n.m154579f(this.f102021a)).getButtonAction();
                AbstractC89171a aVar = this.f102028h;
                AbstractC89172b bVar = this.f102029i;
                AbstractC89171a aVar2 = this.f102030j;
                if (this.f102022b) {
                    str = this.f102025e;
                } else {
                    str = null;
                }
                dVar2.mo37424a(text, new C43739b(context, buttonAction, aVar, bVar, aVar2, str));
            }
            if (C89070n.m154561b(this.f102021a, 1) != null) {
                String text2 = ((DialogButton) this.f102021a.get(1)).getText();
                if (text2 != null) {
                    str2 = text2;
                }
                Context context2 = this.f102027g;
                ButtonAction buttonAction2 = ((DialogButton) this.f102021a.get(1)).getButtonAction();
                AbstractC89171a aVar3 = this.f102028h;
                AbstractC89172b bVar2 = this.f102029i;
                AbstractC89171a aVar4 = this.f102030j;
                if (this.f102022b) {
                    str3 = this.f102025e;
                }
                dVar2.mo37426b(str2, new C43739b(context2, buttonAction2, aVar3, bVar2, aVar4, str3));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d$d */
    public static final class C43755d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f102031a;

        /* renamed from: b */
        final /* synthetic */ boolean f102032b;

        /* renamed from: c */
        final /* synthetic */ C23023b f102033c;

        /* renamed from: d */
        final /* synthetic */ int f102034d;

        /* renamed from: e */
        final /* synthetic */ String f102035e;

        /* renamed from: f */
        final /* synthetic */ DialogContent f102036f;

        /* renamed from: g */
        final /* synthetic */ Context f102037g;

        /* renamed from: h */
        final /* synthetic */ AbstractC89171a f102038h;

        /* renamed from: i */
        final /* synthetic */ AbstractC89172b f102039i;

        /* renamed from: j */
        final /* synthetic */ AbstractC89171a f102040j;

        static {
            Covode.recordClassIndex(52020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43755d(List list, boolean z, C23023b bVar, int i, String str, DialogContent dialogContent, Context context, AbstractC89171a aVar, AbstractC89172b bVar2, AbstractC89171a aVar2) {
            super(1);
            this.f102031a = list;
            this.f102032b = z;
            this.f102033c = bVar;
            this.f102034d = i;
            this.f102035e = str;
            this.f102036f = dialogContent;
            this.f102037g = context;
            this.f102038h = aVar;
            this.f102039i = bVar2;
            this.f102040j = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            String str;
            String str2;
            C23025b bVar2 = bVar;
            String str3 = "";
            C89219l.m154721d(bVar2, str3);
            String str4 = null;
            if (C89070n.m154583g(this.f102031a) != null) {
                String text = ((DialogButton) C89070n.m154579f(this.f102031a)).getText();
                if (text == null) {
                    text = str3;
                }
                Context context = this.f102037g;
                ButtonAction buttonAction = ((DialogButton) C89070n.m154579f(this.f102031a)).getButtonAction();
                AbstractC89171a aVar = this.f102038h;
                AbstractC89172b bVar3 = this.f102039i;
                AbstractC89171a aVar2 = this.f102040j;
                if (this.f102032b) {
                    str2 = this.f102035e;
                } else {
                    str2 = null;
                }
                bVar2.mo37417a(text, new C43739b(context, buttonAction, aVar, bVar3, aVar2, str2));
            }
            if (C89070n.m154561b(this.f102031a, 1) != null) {
                String text2 = ((DialogButton) this.f102031a.get(1)).getText();
                if (text2 == null) {
                    text2 = str3;
                }
                Context context2 = this.f102037g;
                ButtonAction buttonAction2 = ((DialogButton) this.f102031a.get(1)).getButtonAction();
                AbstractC89171a aVar3 = this.f102038h;
                AbstractC89172b bVar4 = this.f102039i;
                AbstractC89171a aVar4 = this.f102040j;
                if (this.f102032b) {
                    str = this.f102035e;
                } else {
                    str = null;
                }
                bVar2.mo37419b(text2, new C43739b(context2, buttonAction2, aVar3, bVar4, aVar4, str));
            }
            if (C89070n.m154561b(this.f102031a, 2) != null) {
                String text3 = ((DialogButton) this.f102031a.get(2)).getText();
                if (text3 != null) {
                    str3 = text3;
                }
                Context context3 = this.f102037g;
                ButtonAction buttonAction3 = ((DialogButton) this.f102031a.get(2)).getButtonAction();
                AbstractC89171a aVar5 = this.f102038h;
                AbstractC89172b bVar5 = this.f102039i;
                AbstractC89171a aVar6 = this.f102040j;
                if (this.f102032b) {
                    str4 = this.f102035e;
                }
                bVar2.mo37421c(str3, new C43739b(context3, buttonAction3, aVar5, bVar5, aVar6, str4));
            }
            if (this.f102034d == 1) {
                bVar2.f54513b = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d$b */
    public static final class C43753b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ ExceptionUX f102015a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f102016b;

        /* renamed from: c */
        final /* synthetic */ boolean f102017c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f102018d;

        /* renamed from: e */
        final /* synthetic */ Context f102019e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f102020f;

        static {
            Covode.recordClassIndex(52018);
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            if (z) {
                AbstractC89171a aVar = this.f102016b;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f102017c) {
                this.f102018d.invoke();
            }
        }

        C43753b(ExceptionUX exceptionUX, AbstractC89171a aVar, boolean z, AbstractC89171a aVar2, Context context, AbstractC89171a aVar3) {
            this.f102015a = exceptionUX;
            this.f102016b = aVar;
            this.f102017c = z;
            this.f102018d = aVar2;
            this.f102019e = context;
            this.f102020f = aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.d$a */
    public static final class C43752a implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f102012a;

        /* renamed from: b */
        final /* synthetic */ boolean f102013b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f102014c;

        static {
            Covode.recordClassIndex(52017);
        }

        C43752a(AbstractC89171a aVar, boolean z, AbstractC89171a aVar2) {
            this.f102012a = aVar;
            this.f102013b = z;
            this.f102014c = aVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                AbstractC89171a aVar = this.f102012a;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f102013b) {
                this.f102014c.invoke();
            }
        }
    }

    /* renamed from: a */
    private static void m86743a(Context context, boolean z, AbstractC89171a<C89391z> aVar) {
        if (!z) {
            aVar.invoke();
        } else {
            new C79459a(context).mo123050a(R.string.ftv).mo123053a();
        }
    }

    /* renamed from: a */
    public static void m86742a(Context context, String str, ExceptionUX exceptionUX, boolean z, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3, AbstractC89172b<? super FetchInfo, C89391z> bVar, AbstractC89171a<C89391z> aVar4, AbstractC89171a<C89391z> aVar5) {
        int parseInt;
        int i;
        boolean z2;
        boolean booleanValue;
        Context context2 = context;
        C89219l.m154721d(context2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        if (exceptionUX == null) {
            m86743a(context2, z, aVar);
            return;
        }
        Integer exceptionUXType = exceptionUX.getExceptionUXType();
        if (exceptionUXType != null) {
            if (exceptionUXType.intValue() == 0) {
                if (!z) {
                    aVar.invoke();
                } else if (exceptionUX.getToastContent() != null) {
                    Integer duration = exceptionUX.getToastContent().getDuration();
                    if (duration == null || duration.intValue() <= 0) {
                        new C79459a(context2).mo123052a(exceptionUX.getToastContent().getMessage()).mo123053a();
                    } else {
                        new C79459a(context2).mo123052a(exceptionUX.getToastContent().getMessage()).mo123053a();
                    }
                } else {
                    m86743a(context2, z, aVar);
                }
            } else if (exceptionUXType != null) {
                if (exceptionUXType.intValue() == 1) {
                    if (exceptionUX.getDialogContent() != null) {
                        DialogContent dialogContent = exceptionUX.getDialogContent();
                        C23023b a = C23013a.C23015a.m43405a(context2);
                        C43732h.m86720a("server", str, 4);
                        String title = dialogContent.getTitle();
                        if (title != null) {
                            a.mo37411b(title);
                        }
                        a.mo37413d(dialogContent.getMessage());
                        Boolean hasCloseButton = dialogContent.getHasCloseButton();
                        if (hasCloseButton != null && (booleanValue = hasCloseButton.booleanValue())) {
                            a.f54502a = booleanValue;
                        }
                        Integer buttonDirection = dialogContent.getButtonDirection();
                        if (buttonDirection != null) {
                            i = buttonDirection.intValue();
                        } else {
                            i = 0;
                        }
                        List<DialogButton> dialogButtons = dialogContent.getDialogButtons();
                        if (dialogButtons != null) {
                            if (dialogButtons.size() > 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            Integer dialogType = dialogContent.getDialogType();
                            if (dialogType != null && dialogType.intValue() == 1) {
                                C23032e.m43444a(a, new C43754c(dialogButtons, z2, a, i, str, dialogContent, context2, aVar2, bVar, aVar4));
                            } else {
                                C23028c.m43435a(a, new C43755d(dialogButtons, z2, a, i, str, dialogContent, context2, aVar2, bVar, aVar4));
                            }
                        }
                        a.mo37482a(false);
                        a.mo37405a().mo37396b().show();
                        return;
                    }
                    m86743a(context2, z, aVar);
                } else if (exceptionUXType.intValue() != 2) {
                    Activity activity = null;
                    if (exceptionUXType != null) {
                        if (exceptionUXType.intValue() == 3) {
                            if (!(context2 instanceof Activity)) {
                                context2 = null;
                            }
                            Activity activity2 = (Activity) context2;
                            if (activity2 != null) {
                                AbstractC34892bo g = AccountService.m65215a().mo57071g();
                                IAccountService.C31274d dVar = new IAccountService.C31274d();
                                dVar.f74960a = activity2;
                                dVar.f74964e = new C43752a(aVar3, z, aVar2);
                                g.showLoginAndRegisterView(dVar.mo57084a());
                            }
                        } else if (exceptionUXType.intValue() == 4) {
                            if (context2 instanceof Activity) {
                                activity = context2;
                            }
                            Activity activity3 = activity;
                            if (activity3 != null) {
                                String verificationContent = exceptionUX.getVerificationContent();
                                if (verificationContent == null || (parseInt = Integer.parseInt(verificationContent)) == -1) {
                                    m86743a(context2, z, aVar);
                                } else {
                                    SecApiImpl.m119993a().popCaptcha(activity3, parseInt, new C43753b(exceptionUX, aVar3, z, aVar2, context2, aVar));
                                }
                            }
                        } else if (exceptionUXType.intValue() == 5) {
                            aVar5.invoke();
                        }
                    }
                } else if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
        }
    }
}
