package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity;

import android.content.Context;
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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53870b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a.C53858a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89623h;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity */
public final class BaAutoReplyEditActivity extends AbstractActivityC53959a implements TextWatcher {

    /* renamed from: d */
    public static final C53882a f123548d = new C53882a((byte) 0);

    /* renamed from: a */
    public final IBaAutoMessageService f123549a = BaAutoMessageServiceImpl.m99180d();

    /* renamed from: b */
    public C53870b f123550b = new C53870b(0, 0, "", "");

    /* renamed from: c */
    public boolean f123551c;

    /* renamed from: e */
    private final View$OnTouchListenerC17271b f123552e = new View$OnTouchListenerC17271b();

    /* renamed from: f */
    private KeyListener f123553f;

    /* renamed from: g */
    private KeyListener f123554g;

    /* renamed from: h */
    private HashMap f123555h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$e */
    public static final class C53888e extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f123565a;

        /* renamed from: b */
        int f123566b;

        /* renamed from: c */
        final /* synthetic */ BaAutoReplyEditActivity f123567c;

        /* renamed from: d */
        Object f123568d;

        static {
            Covode.recordClassIndex(63552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53888e(BaAutoReplyEditActivity baAutoReplyEditActivity, AbstractC89124d dVar) {
            super(dVar);
            this.f123567c = baAutoReplyEditActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f123565a = obj;
            this.f123566b |= Integer.MIN_VALUE;
            return this.f123567c.mo91041a(this);
        }
    }

    static {
        Covode.recordClassIndex(63545);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f123555h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f123555h == null) {
            this.f123555h = new HashMap();
        }
        View view = (View) this.f123555h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123555h.put(Integer.valueOf(i), findViewById);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onResume", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$a */
    public static final class C53882a {
        static {
            Covode.recordClassIndex(63546);
        }

        private C53882a() {
        }

        public /* synthetic */ C53882a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m99148a(Context context, String str, long j) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            Intent intent = new Intent(context, BaAutoReplyEditActivity.class);
            intent.putExtra("mid", j);
            intent.putExtra("enterFrom", str);
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
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

    /* renamed from: b */
    public final void mo91044b() {
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.art);
        C89219l.m154716b(dmtEditText, "");
        KeyListener keyListener = this.f123553f;
        if (keyListener == null) {
            C89219l.m154710a("keywordKeyListener");
        }
        dmtEditText.setKeyListener(keyListener);
        DmtEditText dmtEditText2 = (DmtEditText) _$_findCachedViewById(R.id.arx);
        C89219l.m154716b(dmtEditText2, "");
        KeyListener keyListener2 = this.f123554g;
        if (keyListener2 == null) {
            C89219l.m154710a("messageKeyListener");
        }
        dmtEditText2.setKeyListener(keyListener2);
        int i = this.f123550b.f123519b;
        if (i == 0) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a07);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setVisibility(8);
        } else if (i == 1) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.h0y);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c3y);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(4);
            DmtEditText dmtEditText3 = (DmtEditText) _$_findCachedViewById(R.id.art);
            C89219l.m154716b(dmtEditText3, "");
            dmtEditText3.setKeyListener(null);
            DmtEditText dmtEditText4 = (DmtEditText) _$_findCachedViewById(R.id.arx);
            C89219l.m154716b(dmtEditText4, "");
            dmtEditText4.setKeyListener(null);
            View$OnTouchListenerC53909r rVar = new View$OnTouchListenerC53909r(this);
            ((DmtEditText) _$_findCachedViewById(R.id.art)).setOnTouchListener(rVar);
            ((DmtEditText) _$_findCachedViewById(R.id.arx)).setOnTouchListener(rVar);
            TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a0h);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setVisibility(4);
            TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.a07);
            C89219l.m154716b(tuxButton3, "");
            tuxButton3.setVisibility(4);
            ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
            C89219l.m154716b(buttonTitleBar, "");
            DmtTextView endBtn = buttonTitleBar.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setVisibility(4);
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.exy);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(4);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.exz);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(4);
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.ey0);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(4);
            TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.eze);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.ezf);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(4);
            TuxTextView tuxTextView6 = (TuxTextView) _$_findCachedViewById(R.id.ezg);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setVisibility(4);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.amd);
            C89219l.m154716b(_$_findCachedViewById, "");
            _$_findCachedViewById.setVisibility(4);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.ame);
            C89219l.m154716b(_$_findCachedViewById2, "");
            _$_findCachedViewById2.setVisibility(4);
        } else if (i == 2) {
            FrameLayout frameLayout3 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.fci));
            sb.append('\n');
            String string = getResources().getString(R.string.fcj);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f123550b.f123522e}, 1));
            C89219l.m154716b(a, "");
            sb.append(a);
            TuxTextView tuxTextView7 = (TuxTextView) _$_findCachedViewById(R.id.f4c);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setText(sb);
        } else if (i == 3) {
            FrameLayout frameLayout4 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.d2l);
        } else if (i == 4) {
            FrameLayout frameLayout5 = (FrameLayout) _$_findCachedViewById(R.id.c6g);
            C89219l.m154716b(frameLayout5, "");
            frameLayout5.setVisibility(0);
            TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.a0h);
            C89219l.m154716b(tuxButton4, "");
            tuxButton4.setEnabled(true);
            ((TuxTextView) _$_findCachedViewById(R.id.f4c)).setText(R.string.fbb);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.art)).setText(this.f123550b.f123520c);
        ((DmtEditText) _$_findCachedViewById(R.id.arx)).setText(this.f123550b.f123521d);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$f */
    public static final class C53889f implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ BaAutoReplyEditActivity f123569a;

        static {
            Covode.recordClassIndex(63553);
        }

        C53889f(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f123569a = baAutoReplyEditActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123569a;
            DmtEditText dmtEditText = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.art);
            C89219l.m154716b(dmtEditText, "");
            if (C89219l.m154714a((Object) String.valueOf(dmtEditText.getText()), (Object) baAutoReplyEditActivity.f123550b.f123520c)) {
                DmtEditText dmtEditText2 = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.arx);
                C89219l.m154716b(dmtEditText2, "");
                if (C89219l.m154714a((Object) String.valueOf(dmtEditText2.getText()), (Object) baAutoReplyEditActivity.f123550b.f123521d)) {
                    baAutoReplyEditActivity.finish();
                    return;
                }
            }
            C17197a.C17200a aVar = new C17197a.C17200a(baAutoReplyEditActivity);
            aVar.mo27189a(R.string.b7a);
            aVar.mo27194b(R.string.b7b);
            aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53908q.f123606a, false);
            aVar.mo27190a(R.string.b7i, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53907p(baAutoReplyEditActivity), false);
            aVar.mo27193a().mo27185c();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
            if (this.f123569a.f123551c) {
                new C23144b(this.f123569a).mo37640e(R.string.abd).mo37637b();
            } else if (view.getAlpha() == 1.0f) {
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123569a;
                if (((Boolean) C89623h.m155552a(C89133g.INSTANCE, new C53899k(baAutoReplyEditActivity, null))).booleanValue()) {
                    new C23144b(baAutoReplyEditActivity).mo37640e(R.string.cqk).mo37637b();
                    return;
                }
                C17197a.C17200a aVar = new C17197a.C17200a(baAutoReplyEditActivity);
                aVar.mo27189a(R.string.fdj);
                aVar.mo27194b(R.string.fdh);
                aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53900l.f123591a, false);
                aVar.mo27190a(R.string.fdr, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53894j(baAutoReplyEditActivity), false);
                aVar.mo27193a().mo27185c();
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            AbstractC89568bz unused = C89624i.m155555a(this, C89652o.f203399a, null, new C53883b(this, null), 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$h */
    static final class View$OnClickListenerC53891h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaAutoReplyEditActivity f123571a;

        static {
            Covode.recordClassIndex(63555);
        }

        View$OnClickListenerC53891h(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f123571a = baAutoReplyEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123571a;
            C17197a.C17200a aVar = new C17197a.C17200a(baAutoReplyEditActivity);
            aVar.mo27189a(R.string.b5a);
            aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53887d.f123564a, false);
            aVar.mo27190a(R.string.b5n, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53884c(baAutoReplyEditActivity), false);
            aVar.mo27193a().mo27185c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$k */
    static final class C53899k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f123589a;

        /* renamed from: b */
        final /* synthetic */ BaAutoReplyEditActivity f123590b;

        static {
            Covode.recordClassIndex(63563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53899k(BaAutoReplyEditActivity baAutoReplyEditActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123590b = baAutoReplyEditActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53899k(this.f123590b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C53899k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123589a;
            if (i == 0) {
                C89382r.m154942a(obj);
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123590b;
                this.f123589a = 1;
                obj = baAutoReplyEditActivity.mo91041a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$n */
    static final class C53905n extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

        /* renamed from: a */
        int f123601a;

        /* renamed from: b */
        final /* synthetic */ BaAutoReplyEditActivity f123602b;

        static {
            Covode.recordClassIndex(63569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53905n(BaAutoReplyEditActivity baAutoReplyEditActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123602b = baAutoReplyEditActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53905n(this.f123602b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
            return ((C53905n) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123601a;
            if (i == 0) {
                C89382r.m154942a(obj);
                BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123602b;
                this.f123601a = 1;
                obj = baAutoReplyEditActivity.mo91041a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* renamed from: b */
    public final void mo91045b(boolean z) {
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a07);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setEnabled(z);
        TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.a0h);
        C89219l.m154716b(tuxButton2, "");
        tuxButton2.setEnabled(z);
        mo91042a(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$g */
    static final class View$OnClickListenerC53890g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaAutoReplyEditActivity f123570a;

        static {
            Covode.recordClassIndex(63554);
        }

        View$OnClickListenerC53890g(BaAutoReplyEditActivity baAutoReplyEditActivity) {
            this.f123570a = baAutoReplyEditActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123570a;
            if (((Boolean) C89623h.m155552a(C89133g.INSTANCE, new C53905n(baAutoReplyEditActivity, null))).booleanValue()) {
                new C23144b(baAutoReplyEditActivity).mo37640e(R.string.cqk).mo37637b();
                return;
            }
            C17197a.C17200a aVar = new C17197a.C17200a(baAutoReplyEditActivity);
            aVar.mo27189a(R.string.g7x);
            aVar.mo27194b(R.string.g7y);
            aVar.mo27195b(R.string.a98, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC53906o.f123603a, false);
            aVar.mo27190a(R.string.g81, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC53901m(baAutoReplyEditActivity), false);
            aVar.mo27193a().mo27185c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$i */
    public static final class C53892i extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123572a;

        /* renamed from: b */
        final /* synthetic */ BaAutoReplyEditActivity f123573b;

        /* renamed from: c */
        final /* synthetic */ long f123574c;

        /* renamed from: d */
        private /* synthetic */ Object f123575d;

        static {
            Covode.recordClassIndex(63556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53892i(BaAutoReplyEditActivity baAutoReplyEditActivity, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123573b = baAutoReplyEditActivity;
            this.f123574c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C53892i iVar = new C53892i(this.f123573b, this.f123574c, dVar);
            iVar.f123575d = obj;
            return iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53892i) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89516am amVar;
            Object obj2;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123572a;
            if (i == 0) {
                C89382r.m154942a(obj);
                amVar = (AbstractC89516am) this.f123575d;
                if (this.f123574c != 0) {
                    IBaAutoMessageService iBaAutoMessageService = this.f123573b.f123549a;
                    this.f123575d = amVar;
                    this.f123572a = 1;
                    obj = iBaAutoMessageService.mo91024d(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                AbstractC89568bz unused = C89624i.m155555a(amVar, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.C53892i.C538931 */

                    /* renamed from: a */
                    int f123576a;

                    /* renamed from: b */
                    final /* synthetic */ C53892i f123577b;

                    static {
                        Covode.recordClassIndex(63557);
                    }

                    {
                        this.f123577b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        /* renamed from: a */
                        public final void mo91042a(boolean z) {
                            if (z) {
                                ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                                C89219l.m154716b(buttonTitleBar, "");
                                DmtTextView endBtn = buttonTitleBar.getEndBtn();
                                ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                                C89219l.m154716b(buttonTitleBar2, "");
                                endBtn.setTextColor(C0643b.m2378c(buttonTitleBar2.getContext(), R.color.bh));
                                ButtonTitleBar buttonTitleBar3 = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                                C89219l.m154716b(buttonTitleBar3, "");
                                buttonTitleBar3.getEndBtn().setOnTouchListener(this.f123552e);
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

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
                        /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo91041a(p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r10) {
                            /*
                            // Method dump skipped, instructions count: 150
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.mo91041a(h.c.d):java.lang.Object");
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
                        public final void onCreate(android.os.Bundle r12) {
                            /*
                            // Method dump skipped, instructions count: 247
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.onCreate(android.os.Bundle):void");
                        }

                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$b */
                        static final class C53883b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f123556a;

                            /* renamed from: b */
                            final /* synthetic */ BaAutoReplyEditActivity f123557b;

                            static {
                                Covode.recordClassIndex(63547);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C53883b(BaAutoReplyEditActivity baAutoReplyEditActivity, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f123557b = baAutoReplyEditActivity;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C53883b(this.f123557b, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C53883b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                int i;
                                if (this.f123556a == 0) {
                                    C89382r.m154942a(obj);
                                    BaAutoReplyEditActivity baAutoReplyEditActivity = this.f123557b;
                                    int length = ((DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.art)).length();
                                    TuxTextView tuxTextView = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.exy);
                                    Resources resources = baAutoReplyEditActivity.getResources();
                                    int i2 = R.color.c5;
                                    if (length <= 40) {
                                        i = R.color.c5;
                                    } else {
                                        i = R.color.ly;
                                    }
                                    tuxTextView.setTextColor(resources.getColor(i));
                                    TuxTextView tuxTextView2 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.exy);
                                    C89219l.m154716b(tuxTextView2, "");
                                    tuxTextView2.setText(String.valueOf(length));
                                    int length2 = ((DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.arx)).length();
                                    TuxTextView tuxTextView3 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.eze);
                                    Resources resources2 = baAutoReplyEditActivity.getResources();
                                    if (length2 > 500) {
                                        i2 = R.color.ly;
                                    }
                                    tuxTextView3.setTextColor(resources2.getColor(i2));
                                    TuxTextView tuxTextView4 = (TuxTextView) baAutoReplyEditActivity._$_findCachedViewById(R.id.eze);
                                    C89219l.m154716b(tuxTextView4, "");
                                    tuxTextView4.setText(String.valueOf(length2));
                                    if (length > 0 && 40 >= length && length2 > 0 && 500 >= length2) {
                                        baAutoReplyEditActivity.f123551c = false;
                                        String str = baAutoReplyEditActivity.f123550b.f123520c;
                                        DmtEditText dmtEditText = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.art);
                                        C89219l.m154716b(dmtEditText, "");
                                        if (!(!C89219l.m154714a((Object) str, (Object) String.valueOf(dmtEditText.getText())))) {
                                            String str2 = baAutoReplyEditActivity.f123550b.f123521d;
                                            DmtEditText dmtEditText2 = (DmtEditText) baAutoReplyEditActivity._$_findCachedViewById(R.id.arx);
                                            C89219l.m154716b(dmtEditText2, "");
                                            if (!(!C89219l.m154714a((Object) str2, (Object) String.valueOf(dmtEditText2.getText())))) {
                                                int i3 = baAutoReplyEditActivity.f123550b.f123519b;
                                                if (i3 == 0 || i3 == 2 || i3 == 3) {
                                                    baAutoReplyEditActivity.mo91042a(false);
                                                    TuxButton tuxButton = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                                    C89219l.m154716b(tuxButton, "");
                                                    tuxButton.setEnabled(false);
                                                    TuxButton tuxButton2 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                                    C89219l.m154716b(tuxButton2, "");
                                                    tuxButton2.setActivated(false);
                                                } else if (i3 == 4) {
                                                    baAutoReplyEditActivity.mo91042a(false);
                                                    TuxButton tuxButton3 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                                    C89219l.m154716b(tuxButton3, "");
                                                    tuxButton3.setEnabled(true);
                                                    TuxButton tuxButton4 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                                    C89219l.m154716b(tuxButton4, "");
                                                    tuxButton4.setActivated(true);
                                                }
                                            }
                                        }
                                        baAutoReplyEditActivity.mo91042a(true);
                                        TuxButton tuxButton5 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                        C89219l.m154716b(tuxButton5, "");
                                        tuxButton5.setEnabled(true);
                                        TuxButton tuxButton6 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                        C89219l.m154716b(tuxButton6, "");
                                        tuxButton6.setActivated(true);
                                    } else {
                                        baAutoReplyEditActivity.f123551c = true;
                                        baAutoReplyEditActivity.mo91042a(false);
                                        TuxButton tuxButton7 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                        C89219l.m154716b(tuxButton7, "");
                                        tuxButton7.setEnabled(false);
                                        TuxButton tuxButton8 = (TuxButton) baAutoReplyEditActivity._$_findCachedViewById(R.id.a0h);
                                        C89219l.m154716b(tuxButton8, "");
                                        tuxButton8.setActivated(false);
                                    }
                                    return C89391z.f203057a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$d */
                        static final class DialogInterface$OnClickListenerC53887d implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC53887d f123564a = new DialogInterface$OnClickListenerC53887d();

                            static {
                                Covode.recordClassIndex(63551);
                            }

                            DialogInterface$OnClickListenerC53887d() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C53858a.m99119b(8);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$l */
                        static final class DialogInterface$OnClickListenerC53900l implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC53900l f123591a = new DialogInterface$OnClickListenerC53900l();

                            static {
                                Covode.recordClassIndex(63564);
                            }

                            DialogInterface$OnClickListenerC53900l() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C53858a.m99119b(2);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$o */
                        static final class DialogInterface$OnClickListenerC53906o implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC53906o f123603a = new DialogInterface$OnClickListenerC53906o();

                            static {
                                Covode.recordClassIndex(63570);
                            }

                            DialogInterface$OnClickListenerC53906o() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C53858a.m99119b(6);
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$q */
                        static final class DialogInterface$OnClickListenerC53908q implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            public static final DialogInterface$OnClickListenerC53908q f123606a = new DialogInterface$OnClickListenerC53908q();

                            static {
                                Covode.recordClassIndex(63572);
                            }

                            DialogInterface$OnClickListenerC53908q() {
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C53858a.m99119b(4);
                            }
                        }

                        /* renamed from: a */
                        private static String m99142a(Intent intent, String str) {
                            try {
                                return intent.getStringExtra(str);
                            } catch (Exception unused) {
                                return null;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$c */
                        public static final class DialogInterface$OnClickListenerC53884c implements DialogInterface.OnClickListener {

                            /* renamed from: a */
                            final /* synthetic */ BaAutoReplyEditActivity f123558a;

                            static {
                                Covode.recordClassIndex(63548);
                            }

                            DialogInterface$OnClickListenerC53884c(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                this.f123558a = baAutoReplyEditActivity;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                this.f123558a.mo91045b(false);
                                AbstractC89568bz unused = C89624i.m155555a(this.f123558a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.DialogInterface$OnClickListenerC53884c.C538851 */

                                    /* renamed from: a */
                                    int f123559a;

                                    /* renamed from: b */
                                    final /* synthetic */ DialogInterface$OnClickListenerC53884c f123560b;

                                    /* renamed from: c */
                                    private /* synthetic */ Object f123561c;

                                    static {
                                        Covode.recordClassIndex(63549);
                                    }

                                    {
                                        this.f123560b = r2;
                                    }

                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                        C89219l.m154721d(dVar, "");
                                        C538851 r1 = 

                                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$p */
                                        static final class DialogInterface$OnClickListenerC53907p implements DialogInterface.OnClickListener {

                                            /* renamed from: a */
                                            final /* synthetic */ BaAutoReplyEditActivity f123604a;

                                            /* renamed from: b */
                                            final /* synthetic */ boolean f123605b = false;

                                            static {
                                                Covode.recordClassIndex(63571);
                                            }

                                            DialogInterface$OnClickListenerC53907p(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f123604a = baAutoReplyEditActivity;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                C53858a.m99119b(3);
                                                if (this.f123605b) {
                                                    BaAutoReplyEditActivity.super.onBackPressed();
                                                }
                                                this.f123604a.finish();
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$r */
                                        public static final class View$OnTouchListenerC53909r implements View.OnTouchListener {

                                            /* renamed from: a */
                                            final /* synthetic */ BaAutoReplyEditActivity f123607a;

                                            static {
                                                Covode.recordClassIndex(63573);
                                            }

                                            View$OnTouchListenerC53909r(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f123607a = baAutoReplyEditActivity;
                                            }

                                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                C89219l.m154716b(motionEvent, "");
                                                if (motionEvent.getAction() == 1) {
                                                    new C23144b(this.f123607a).mo37640e(R.string.h0z).mo37637b();
                                                }
                                                return true;
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$j */
                                        public static final class DialogInterface$OnClickListenerC53894j implements DialogInterface.OnClickListener {

                                            /* renamed from: a */
                                            final /* synthetic */ BaAutoReplyEditActivity f123578a;

                                            static {
                                                Covode.recordClassIndex(63558);
                                            }

                                            DialogInterface$OnClickListenerC53894j(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                this.f123578a = baAutoReplyEditActivity;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                this.f123578a.mo91045b(false);
                                                DmtEditText dmtEditText = (DmtEditText) this.f123578a._$_findCachedViewById(R.id.art);
                                                C89219l.m154716b(dmtEditText, "");
                                                String valueOf = String.valueOf(dmtEditText.getText());
                                                DmtEditText dmtEditText2 = (DmtEditText) this.f123578a._$_findCachedViewById(R.id.arx);
                                                C89219l.m154716b(dmtEditText2, "");
                                                final C53870b bVar = new C53870b(this.f123578a.f123550b.f123518a, 4, valueOf, String.valueOf(dmtEditText2.getText()));
                                                AbstractC89568bz unused = C89624i.m155555a(this.f123578a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.DialogInterface$OnClickListenerC53894j.C538951 */

                                                    /* renamed from: a */
                                                    int f123579a;

                                                    /* renamed from: b */
                                                    final /* synthetic */ DialogInterface$OnClickListenerC53894j f123580b;

                                                    /* renamed from: d */
                                                    private /* synthetic */ Object f123582d;

                                                    static {
                                                        Covode.recordClassIndex(63559);
                                                    }

                                                    {
                                                        this.f123580b = r2;
                                                    }

                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                        C89219l.m154721d(dVar, "");
                                                        C538951 r2 = 

                                                        /* access modifiers changed from: package-private */
                                                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaAutoReplyEditActivity$m */
                                                        public static final class DialogInterface$OnClickListenerC53901m implements DialogInterface.OnClickListener {

                                                            /* renamed from: a */
                                                            final /* synthetic */ BaAutoReplyEditActivity f123592a;

                                                            static {
                                                                Covode.recordClassIndex(63565);
                                                            }

                                                            DialogInterface$OnClickListenerC53901m(BaAutoReplyEditActivity baAutoReplyEditActivity) {
                                                                this.f123592a = baAutoReplyEditActivity;
                                                            }

                                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                                this.f123592a.mo91045b(false);
                                                                DmtEditText dmtEditText = (DmtEditText) this.f123592a._$_findCachedViewById(R.id.art);
                                                                C89219l.m154716b(dmtEditText, "");
                                                                String valueOf = String.valueOf(dmtEditText.getText());
                                                                DmtEditText dmtEditText2 = (DmtEditText) this.f123592a._$_findCachedViewById(R.id.arx);
                                                                C89219l.m154716b(dmtEditText2, "");
                                                                final C53870b bVar = new C53870b(this.f123592a.f123550b.f123518a, 1, valueOf, String.valueOf(dmtEditText2.getText()));
                                                                AbstractC89568bz unused = C89624i.m155555a(this.f123592a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaAutoReplyEditActivity.DialogInterface$OnClickListenerC53901m.C539021 */

                                                                    /* renamed from: a */
                                                                    int f123593a;

                                                                    /* renamed from: b */
                                                                    final /* synthetic */ DialogInterface$OnClickListenerC53901m f123594b;

                                                                    /* renamed from: d */
                                                                    private /* synthetic */ Object f123596d;

                                                                    static {
                                                                        Covode.recordClassIndex(63566);
                                                                    }

                                                                    {
                                                                        this.f123594b = r2;
                                                                    }

                                                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                        C89219l.m154721d(dVar, "");
                                                                        C539021 r2 = 
                                                                    }
