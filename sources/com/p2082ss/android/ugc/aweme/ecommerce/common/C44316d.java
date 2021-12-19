package com.p2082ss.android.ugc.aweme.ecommerce.common;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d */
public final class C44316d {

    /* renamed from: a */
    public static final C44316d f103340a = new C44316d();

    private C44316d() {
    }

    static {
        Covode.recordClassIndex(52630);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d$c */
    public static final class C44319c extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f103350a;

        /* renamed from: b */
        final /* synthetic */ C23023b f103351b;

        /* renamed from: c */
        final /* synthetic */ int f103352c;

        /* renamed from: d */
        final /* synthetic */ DialogContent f103353d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f103354e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f103355f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f103356g;

        static {
            Covode.recordClassIndex(52633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44319c(List list, C23023b bVar, int i, DialogContent dialogContent, AbstractC89171a aVar, AbstractC89172b bVar2, AbstractC89172b bVar3) {
            super(1);
            this.f103350a = list;
            this.f103351b = bVar;
            this.f103352c = i;
            this.f103353d = dialogContent;
            this.f103354e = aVar;
            this.f103355f = bVar2;
            this.f103356g = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            String str = "";
            C89219l.m154721d(dVar2, str);
            if (C89070n.m154583g(this.f103350a) != null) {
                String text = ((DialogButton) C89070n.m154579f(this.f103350a)).getText();
                if (text == null) {
                    text = str;
                }
                dVar2.mo37424a(text, new C44293a(this.f103351b.f54592n, ((DialogButton) C89070n.m154579f(this.f103350a)).getButtonAction(), this.f103354e, this.f103355f, this.f103356g));
            }
            if (C89070n.m154561b(this.f103350a, 1) != null) {
                String text2 = ((DialogButton) this.f103350a.get(1)).getText();
                if (text2 != null) {
                    str = text2;
                }
                dVar2.mo37426b(str, new C44293a(this.f103351b.f54592n, ((DialogButton) this.f103350a.get(1)).getButtonAction(), this.f103354e, this.f103355f, this.f103356g));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d$d */
    public static final class C44320d extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f103357a;

        /* renamed from: b */
        final /* synthetic */ C23023b f103358b;

        /* renamed from: c */
        final /* synthetic */ int f103359c;

        /* renamed from: d */
        final /* synthetic */ DialogContent f103360d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f103361e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f103362f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89172b f103363g;

        static {
            Covode.recordClassIndex(52634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44320d(List list, C23023b bVar, int i, DialogContent dialogContent, AbstractC89171a aVar, AbstractC89172b bVar2, AbstractC89172b bVar3) {
            super(1);
            this.f103357a = list;
            this.f103358b = bVar;
            this.f103359c = i;
            this.f103360d = dialogContent;
            this.f103361e = aVar;
            this.f103362f = bVar2;
            this.f103363g = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            String str = "";
            C89219l.m154721d(bVar2, str);
            if (C89070n.m154583g(this.f103357a) != null) {
                String text = ((DialogButton) C89070n.m154579f(this.f103357a)).getText();
                if (text == null) {
                    text = str;
                }
                bVar2.mo37417a(text, new C44293a(this.f103358b.f54592n, ((DialogButton) C89070n.m154579f(this.f103357a)).getButtonAction(), this.f103361e, this.f103362f, this.f103363g));
            }
            if (C89070n.m154561b(this.f103357a, 1) != null) {
                String text2 = ((DialogButton) this.f103357a.get(1)).getText();
                if (text2 == null) {
                    text2 = str;
                }
                bVar2.mo37419b(text2, new C44293a(this.f103358b.f54592n, ((DialogButton) this.f103357a.get(1)).getButtonAction(), this.f103361e, this.f103362f, this.f103363g));
            }
            if (C89070n.m154561b(this.f103357a, 2) != null) {
                String text3 = ((DialogButton) this.f103357a.get(2)).getText();
                if (text3 != null) {
                    str = text3;
                }
                bVar2.mo37421c(str, new C44293a(this.f103358b.f54592n, ((DialogButton) this.f103357a.get(2)).getButtonAction(), this.f103361e, this.f103362f, this.f103363g));
            }
            if (this.f103359c == 1) {
                bVar2.f54513b = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d$b */
    public static final class C44318b extends C67837a {

        /* renamed from: a */
        final /* synthetic */ ExceptionUX f103344a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f103345b;

        /* renamed from: c */
        final /* synthetic */ boolean f103346c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f103347d;

        /* renamed from: e */
        final /* synthetic */ View f103348e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89171a f103349f;

        static {
            Covode.recordClassIndex(52632);
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
        /* renamed from: a */
        public final void mo61882a(boolean z, int i) {
            if (z) {
                AbstractC89171a aVar = this.f103345b;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f103346c) {
                this.f103347d.invoke();
            }
        }

        C44318b(ExceptionUX exceptionUX, AbstractC89171a aVar, boolean z, AbstractC89171a aVar2, View view, AbstractC89171a aVar3) {
            this.f103344a = exceptionUX;
            this.f103345b = aVar;
            this.f103346c = z;
            this.f103347d = aVar2;
            this.f103348e = view;
            this.f103349f = aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.d$a */
    public static final class C44317a implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f103341a;

        /* renamed from: b */
        final /* synthetic */ boolean f103342b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f103343c;

        static {
            Covode.recordClassIndex(52631);
        }

        C44317a(AbstractC89171a aVar, boolean z, AbstractC89171a aVar2) {
            this.f103341a = aVar;
            this.f103342b = z;
            this.f103343c = aVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                AbstractC89171a aVar = this.f103341a;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!this.f103342b) {
                this.f103343c.invoke();
            }
        }
    }

    /* renamed from: a */
    private static void m87045a(View view, boolean z, AbstractC89171a<C89391z> aVar) {
        if (!z) {
            aVar.invoke();
        } else if (view != null) {
            new C23144b(view).mo37640e(R.string.ftv).mo37637b();
        }
    }

    /* renamed from: a */
    private static void m87040a(Context context, boolean z, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            AbstractC34892bo g = AccountService.m65215a().mo57071g();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = activity;
            dVar.f74964e = new C44317a(null, true, aVar);
            g.showLoginAndRegisterView(dVar.mo57084a());
        }
    }

    /* renamed from: a */
    private static void m87042a(View view, ExceptionUX exceptionUX, boolean z, AbstractC89171a<C89391z> aVar) {
        if (exceptionUX.getToastContent() != null) {
            Integer duration = exceptionUX.getToastContent().getDuration();
            if (duration == null || duration.intValue() <= 0) {
                if (view != null) {
                    new C23144b(view).mo37635a(exceptionUX.getToastContent().getMessage()).mo37637b();
                }
            } else if (view != null) {
                new C23144b(view).mo37635a(exceptionUX.getToastContent().getMessage()).mo37637b();
            }
        } else {
            m87045a(view, true, aVar);
        }
    }

    /* renamed from: a */
    public static void m87041a(View view, ExceptionUX exceptionUX, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super ButtonAction, Boolean> bVar) {
        Context context;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        if (exceptionUX == null) {
            m87045a(view, true, aVar);
            return;
        }
        Integer exceptionUXType = exceptionUX.getExceptionUXType();
        if (exceptionUXType != null) {
            if (exceptionUXType.intValue() == 0) {
                m87042a(view, exceptionUX, true, aVar);
            } else if (exceptionUXType.intValue() == 1) {
                m87044a(view, exceptionUX, true, aVar, aVar2, null, bVar);
            } else if (exceptionUXType.intValue() != 2) {
                if (exceptionUXType.intValue() == 3) {
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    m87040a(context, true, aVar2, (AbstractC89171a<C89391z>) null);
                } else if (exceptionUXType.intValue() == 4) {
                    m87043a(view, exceptionUX, true, aVar, aVar2, null);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m87043a(View view, ExceptionUX exceptionUX, boolean z, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        Context context;
        int parseInt;
        Activity activity = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            String verificationContent = exceptionUX.getVerificationContent();
            if (verificationContent == null || (parseInt = Integer.parseInt(verificationContent)) == -1) {
                m87045a(view, true, aVar);
            } else {
                SecApiImpl.m119993a().popCaptcha(activity2, parseInt, new C44318b(exceptionUX, null, true, aVar2, view, aVar));
            }
        }
    }

    /* renamed from: a */
    private static void m87044a(View view, ExceptionUX exceptionUX, boolean z, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super FetchInfo, C89391z> bVar, AbstractC89172b<? super ButtonAction, Boolean> bVar2) {
        int i;
        boolean booleanValue;
        if (exceptionUX.getDialogContent() == null || view == null || view.getContext() == null) {
            m87045a(view, true, aVar);
            return;
        }
        DialogContent dialogContent = exceptionUX.getDialogContent();
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C23023b a = C23013a.C23015a.m43405a(context);
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
            Integer dialogType = dialogContent.getDialogType();
            if (dialogType != null && dialogType.intValue() == 1) {
                C23032e.m43444a(a, new C44319c(dialogButtons, a, i, dialogContent, aVar2, null, bVar2));
            } else {
                C23028c.m43435a(a, new C44320d(dialogButtons, a, i, dialogContent, aVar2, null, bVar2));
            }
        }
        a.mo37482a(false);
        a.mo37405a().mo37396b().show();
    }
}
