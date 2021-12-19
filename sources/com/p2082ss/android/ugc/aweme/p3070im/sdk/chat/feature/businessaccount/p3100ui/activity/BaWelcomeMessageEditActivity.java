package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a.C53858a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity */
public final class BaWelcomeMessageEditActivity extends AbstractActivityC53959a implements TextWatcher {

    /* renamed from: c */
    public static final C53942a f123679c = new C53942a((byte) 0);

    /* renamed from: a */
    public C53869a f123680a = new C53869a(0L, 0, "");

    /* renamed from: b */
    public final IBaAutoMessageService f123681b = BaAutoMessageServiceImpl.m99180d();

    /* renamed from: d */
    private final View$OnTouchListenerC17271b f123682d = new View$OnTouchListenerC17271b();

    /* renamed from: e */
    private KeyListener f123683e;

    /* renamed from: f */
    private HashMap f123684f;

    static {
        Covode.recordClassIndex(63608);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f123684f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f123684f == null) {
            this.f123684f = new HashMap();
        }
        View view = (View) this.f123684f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123684f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$a */
    public static final class C53942a {
        static {
            Covode.recordClassIndex(63609);
        }

        private C53942a() {
        }

        public /* synthetic */ C53942a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        mo91073c();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onResume", true);
        super.onResume();
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C53945d(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo91073c() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.asr);
        C89219l.m154716b(dmtEditText, "");
        if (C89219l.m154714a((Object) String.valueOf(dmtEditText.getText()), (Object) this.f123680a.f123516c)) {
            finish();
            return;
        }
        C17197a.C17200a aVar = new C17197a.C17200a(this);
        aVar.mo27189a(R.string.b7a);
        aVar.mo27194b(R.string.b7b);
        aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53957j.f123712a, false);
        aVar.mo27190a(R.string.b7i, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53956i(this, false), false);
        aVar.mo27193a().mo27185c();
    }

    /* renamed from: d */
    private final void m99170d() {
        int i;
        int length = ((DmtEditText) _$_findCachedViewById(R.id.asr)).length();
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f4t);
        Resources resources = getResources();
        if (length <= 250) {
            i = R.color.c5;
        } else {
            i = R.color.ly;
        }
        tuxTextView.setTextColor(resources.getColor(i));
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.f4t);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(String.valueOf(length));
        if (length > 0 && 250 >= length) {
            String str = this.f123680a.f123516c;
            DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.asr);
            C89219l.m154716b(dmtEditText, "");
            if (!C89219l.m154714a((Object) str, (Object) String.valueOf(dmtEditText.getText()))) {
                m99169b(true);
                TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setEnabled(true);
                TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setActivated(true);
                return;
            }
            int i2 = this.f123680a.f123515b;
            if (i2 == 0 || i2 == 2 || i2 == 3) {
                m99169b(false);
                TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton3, "");
                tuxButton3.setEnabled(false);
                TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton4, "");
                tuxButton4.setActivated(false);
            } else if (i2 == 4) {
                m99169b(false);
                TuxButton tuxButton5 = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton5, "");
                tuxButton5.setEnabled(true);
                TuxButton tuxButton6 = (TuxButton) _$_findCachedViewById(R.id.a0h);
                C89219l.m154716b(tuxButton6, "");
                tuxButton6.setActivated(true);
            }
        } else {
            m99169b(false);
            TuxButton tuxButton7 = (TuxButton) _$_findCachedViewById(R.id.a0h);
            C89219l.m154716b(tuxButton7, "");
            tuxButton7.setEnabled(false);
            TuxButton tuxButton8 = (TuxButton) _$_findCachedViewById(R.id.a0h);
            C89219l.m154716b(tuxButton8, "");
            tuxButton8.setActivated(false);
        }
    }

    /* renamed from: b */
    public final void mo91071b() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.asr);
        C89219l.m154716b(dmtEditText, "");
        KeyListener keyListener = this.f123683e;
        if (keyListener == null) {
            C89219l.m154710a("keyListener");
        }
        dmtEditText.setKeyListener(keyListener);
        int i = this.f123680a.f123515b;
        if (i == 0) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
        } else if (i == 1) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.h0y);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c3y);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(4);
            DmtEditText dmtEditText2 = (DmtEditText) _$_findCachedViewById(R.id.asr);
            C89219l.m154716b(dmtEditText2, "");
            dmtEditText2.setKeyListener(null);
            ((DmtEditText) _$_findCachedViewById(R.id.asr)).setOnTouchListener(new View$OnTouchListenerC53958k(this));
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a0h);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setVisibility(4);
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
            C89219l.m154716b(buttonTitleBar, "");
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setVisibility(4);
        } else if (i == 2) {
            FrameLayout frameLayout3 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.fci));
            sb.append('\n');
            String string = getResources().getString(R.string.fcj);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f123680a.f123517d}, 1));
            C89219l.m154716b(a, "");
            sb.append(a);
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f4c);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(sb);
        } else if (i == 3) {
            FrameLayout frameLayout4 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.d2l);
        } else if (i == 4) {
            FrameLayout frameLayout5 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout5, "");
            frameLayout5.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.fbc);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.asr)).setText(this.f123680a.f123516c);
        m99170d();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$b */
    public static final class C53943b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ BaWelcomeMessageEditActivity f123685a;

        static {
            Covode.recordClassIndex(63610);
        }

        C53943b(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
            this.f123685a = baWelcomeMessageEditActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f123685a.mo91073c();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
            DmtEditText dmtEditText = (DmtEditText) this.f123685a._$_findCachedViewById(R.id.asr);
            C89219l.m154716b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            if (text != null && text.length() > 250) {
                new C23144b(this.f123685a).mo37640e(R.string.abd).mo37637b();
            } else if (view.getAlpha() == 1.0f) {
                BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.f123685a;
                C17197a.C17200a aVar = new C17197a.C17200a(baWelcomeMessageEditActivity);
                aVar.mo27189a(R.string.fdj);
                aVar.mo27194b(R.string.fdh);
                aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53951f.f123701a, false);
                aVar.mo27190a(R.string.fdr, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53947e(baWelcomeMessageEditActivity), false);
                aVar.mo27193a().mo27185c();
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            m99170d();
        }
    }

    /* renamed from: a */
    public final void mo91069a(boolean z) {
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a0h);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setEnabled(z);
        m99169b(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$c */
    static final class View$OnClickListenerC53944c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaWelcomeMessageEditActivity f123686a;

        static {
            Covode.recordClassIndex(63611);
        }

        View$OnClickListenerC53944c(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
            this.f123686a = baWelcomeMessageEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.f123686a;
            C17197a.C17200a aVar = new C17197a.C17200a(baWelcomeMessageEditActivity);
            aVar.mo27189a(R.string.g7x);
            aVar.mo27194b(R.string.g7y);
            aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53955h.f123709a, false);
            aVar.mo27190a(R.string.g81, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53952g(baWelcomeMessageEditActivity), false);
            aVar.mo27193a().mo27185c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$d */
    public static final class C53945d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123687a;

        /* renamed from: b */
        final /* synthetic */ BaWelcomeMessageEditActivity f123688b;

        /* renamed from: c */
        private /* synthetic */ Object f123689c;

        static {
            Covode.recordClassIndex(63612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53945d(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123688b = baWelcomeMessageEditActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C53945d dVar2 = new C53945d(this.f123688b, dVar);
            dVar2.f123689c = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53945d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89516am amVar;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123687a;
            if (i == 0) {
                C89382r.m154942a(obj);
                amVar = (AbstractC89516am) this.f123689c;
                IBaAutoMessageService iBaAutoMessageService = this.f123688b.f123681b;
                this.f123689c = amVar;
                this.f123687a = 1;
                obj = iBaAutoMessageService.mo91022c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                amVar = (AbstractC89516am) this.f123689c;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53869a aVar2 = (C53869a) obj;
            if (aVar2 == null) {
                this.f123688b.finish();
                return C89391z.f203057a;
            }
            this.f123688b.f123680a = aVar2;
            AbstractC89568bz unused = C89624i.m155555a(amVar, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaWelcomeMessageEditActivity.C53945d.C539461 */

                /* renamed from: a */
                int f123690a;

                /* renamed from: b */
                final /* synthetic */ C53945d f123691b;

                static {
                    Covode.recordClassIndex(63613);
                }

                {
                    this.f123691b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* renamed from: b */
                    private final void m99169b(boolean z) {
                        if (z) {
                            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                            C89219l.m154716b(buttonTitleBar, "");
                            DmtTextView endBtn = buttonTitleBar.getEndBtn();
                            ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                            C89219l.m154716b(buttonTitleBar2, "");
                            endBtn.setTextColor(C0643b.m2378c(buttonTitleBar2.getContext(), R.color.bh));
                            ButtonTitleBar buttonTitleBar3 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                            C89219l.m154716b(buttonTitleBar3, "");
                            buttonTitleBar3.getEndBtn().setOnTouchListener(this.f123682d);
                            return;
                        }
                        ButtonTitleBar buttonTitleBar4 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                        C89219l.m154716b(buttonTitleBar4, "");
                        DmtTextView endBtn2 = buttonTitleBar4.getEndBtn();
                        ButtonTitleBar buttonTitleBar5 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                        C89219l.m154716b(buttonTitleBar5, "");
                        endBtn2.setTextColor(C0643b.m2378c(buttonTitleBar5.getContext(), R.color.bz));
                        ButtonTitleBar buttonTitleBar6 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                        C89219l.m154716b(buttonTitleBar6, "");
                        buttonTitleBar6.getEndBtn().setOnTouchListener(null);
                    }

                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
                        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                        */
                    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
                    public final void onCreate(android.os.Bundle r8) {
                        /*
                        // Method dump skipped, instructions count: 143
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaWelcomeMessageEditActivity.onCreate(android.os.Bundle):void");
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$f */
                    static final class DialogInterface$OnClickListenerC53951f implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        public static final DialogInterface$OnClickListenerC53951f f123701a = new DialogInterface$OnClickListenerC53951f();

                        static {
                            Covode.recordClassIndex(63618);
                        }

                        DialogInterface$OnClickListenerC53951f() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C53858a.m99114a(2);
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$h */
                    static final class DialogInterface$OnClickListenerC53955h implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        public static final DialogInterface$OnClickListenerC53955h f123709a = new DialogInterface$OnClickListenerC53955h();

                        static {
                            Covode.recordClassIndex(63622);
                        }

                        DialogInterface$OnClickListenerC53955h() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C53858a.m99114a(6);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$j */
                    public static final class DialogInterface$OnClickListenerC53957j implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        public static final DialogInterface$OnClickListenerC53957j f123712a = new DialogInterface$OnClickListenerC53957j();

                        static {
                            Covode.recordClassIndex(63624);
                        }

                        DialogInterface$OnClickListenerC53957j() {
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C53858a.m99114a(4);
                        }
                    }

                    /* renamed from: a */
                    private static String m99167a(Intent intent, String str) {
                        try {
                            return intent.getStringExtra(str);
                        } catch (Exception unused) {
                            return null;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$i */
                    public static final class DialogInterface$OnClickListenerC53956i implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        final /* synthetic */ BaWelcomeMessageEditActivity f123710a;

                        /* renamed from: b */
                        final /* synthetic */ boolean f123711b = false;

                        static {
                            Covode.recordClassIndex(63623);
                        }

                        DialogInterface$OnClickListenerC53956i(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, boolean z) {
                            this.f123710a = baWelcomeMessageEditActivity;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C53858a.m99114a(3);
                            if (this.f123711b) {
                                BaWelcomeMessageEditActivity.super.onBackPressed();
                            }
                            this.f123710a.finish();
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$k */
                    public static final class View$OnTouchListenerC53958k implements View.OnTouchListener {

                        /* renamed from: a */
                        final /* synthetic */ BaWelcomeMessageEditActivity f123713a;

                        static {
                            Covode.recordClassIndex(63625);
                        }

                        View$OnTouchListenerC53958k(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                            this.f123713a = baWelcomeMessageEditActivity;
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            new C23144b(this.f123713a).mo37640e(R.string.h0z).mo37637b();
                            return true;
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$e */
                    public static final class DialogInterface$OnClickListenerC53947e implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        final /* synthetic */ BaWelcomeMessageEditActivity f123692a;

                        static {
                            Covode.recordClassIndex(63614);
                        }

                        DialogInterface$OnClickListenerC53947e(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                            this.f123692a = baWelcomeMessageEditActivity;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            this.f123692a.mo91069a(false);
                            DmtEditText dmtEditText = (DmtEditText) this.f123692a._$_findCachedViewById(R.id.asr);
                            C89219l.m154716b(dmtEditText, "");
                            final String valueOf = String.valueOf(dmtEditText.getText());
                            AbstractC89568bz unused = C89624i.m155555a(this.f123692a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaWelcomeMessageEditActivity.DialogInterface$OnClickListenerC53947e.C539481 */

                                /* renamed from: a */
                                int f123693a;

                                /* renamed from: b */
                                final /* synthetic */ DialogInterface$OnClickListenerC53947e f123694b;

                                /* renamed from: d */
                                private /* synthetic */ Object f123696d;

                                static {
                                    Covode.recordClassIndex(63615);
                                }

                                {
                                    this.f123694b = r2;
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                    C89219l.m154721d(dVar, "");
                                    C539481 r2 = 

                                    /* access modifiers changed from: package-private */
                                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaWelcomeMessageEditActivity$g */
                                    public static final class DialogInterface$OnClickListenerC53952g implements DialogInterface.OnClickListener {

                                        /* renamed from: a */
                                        final /* synthetic */ BaWelcomeMessageEditActivity f123702a;

                                        static {
                                            Covode.recordClassIndex(63619);
                                        }

                                        DialogInterface$OnClickListenerC53952g(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
                                            this.f123702a = baWelcomeMessageEditActivity;
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            this.f123702a.mo91069a(false);
                                            DmtEditText dmtEditText = (DmtEditText) this.f123702a._$_findCachedViewById(R.id.asr);
                                            C89219l.m154716b(dmtEditText, "");
                                            final String valueOf = String.valueOf(dmtEditText.getText());
                                            AbstractC89568bz unused = C89624i.m155555a(this.f123702a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaWelcomeMessageEditActivity.DialogInterface$OnClickListenerC53952g.C539531 */

                                                /* renamed from: a */
                                                int f123703a;

                                                /* renamed from: b */
                                                final /* synthetic */ DialogInterface$OnClickListenerC53952g f123704b;

                                                /* renamed from: d */
                                                private /* synthetic */ Object f123706d;

                                                static {
                                                    Covode.recordClassIndex(63620);
                                                }

                                                {
                                                    this.f123704b = r2;
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                    C89219l.m154721d(dVar, "");
                                                    C539531 r2 = 
                                                }
