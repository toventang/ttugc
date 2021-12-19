package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.C53869a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a.C53858a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api.UserSettingService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity */
public final class BaMessageSettingActivity extends AbstractActivityC53959a {

    /* renamed from: h */
    public static final C53914a f123620h = new C53914a((byte) 0);

    /* renamed from: a */
    public AbstractC89531av<? extends C68348f> f123621a;

    /* renamed from: b */
    public boolean f123622b;

    /* renamed from: c */
    public final IBaAutoMessageService f123623c = BaAutoMessageServiceImpl.m99180d();

    /* renamed from: d */
    public C40945h f123624d;

    /* renamed from: e */
    public C40941f f123625e;

    /* renamed from: f */
    public C40945h f123626f;

    /* renamed from: g */
    public C40941f f123627g;

    /* renamed from: i */
    private final AbstractC89244h f123628i = C89250i.m154773a((AbstractC89171a) new C53941s(this));

    /* renamed from: j */
    private HashMap f123629j;

    static {
        Covode.recordClassIndex(63579);
    }

    /* renamed from: b */
    private final C43047dm m99159b() {
        return (C43047dm) this.f123628i.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f123629j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f123629j == null) {
            this.f123629j = new HashMap();
        }
        View view = (View) this.f123629j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f123629j.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$a */
    public static final class C53914a {
        static {
            Covode.recordClassIndex(63580);
        }

        private C53914a() {
        }

        public /* synthetic */ C53914a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$s */
    static final class C53941s extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123678a;

        static {
            Covode.recordClassIndex(63607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53941s(BaMessageSettingActivity baMessageSettingActivity) {
            super(0);
            this.f123678a = baMessageSettingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f123678a._$_findCachedViewById(R.id.d54);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onResume", true);
        super.onResume();
        this.f123621a = C89624i.m155556b(this, C89546bf.f203267b, null, new C53920g(null), 2);
        C40945h hVar = this.f123624d;
        if (hVar == null) {
            C89219l.m154710a("welcomeSwitch");
        }
        hVar.mo70126a(C53921h.f123636a);
        C40941f fVar = this.f123625e;
        if (fVar == null) {
            C89219l.m154710a("welcomeSetting");
        }
        fVar.mo70126a(C53922i.f123637a);
        C40945h hVar2 = this.f123626f;
        if (hVar2 == null) {
            C89219l.m154710a("autoReplySwitch");
        }
        hVar2.mo70126a(C53923j.f123638a);
        C40941f fVar2 = this.f123627g;
        if (fVar2 == null) {
            C89219l.m154710a("autoReplySetting");
        }
        fVar2.mo70126a(C53924k.f123639a);
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C53925l(this, null), 3);
        AbstractC89568bz unused2 = C89624i.m155555a(this, null, null, new C53926m(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$b */
    public static final class C53915b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123630a;

        static {
            Covode.recordClassIndex(63581);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        C53915b(BaMessageSettingActivity baMessageSettingActivity) {
            this.f123630a = baMessageSettingActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f123630a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$c */
    static final class View$OnClickListenerC53916c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123631a;

        static {
            Covode.recordClassIndex(63582);
        }

        View$OnClickListenerC53916c(BaMessageSettingActivity baMessageSettingActivity) {
            this.f123631a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f123631a;
            baMessageSettingActivity.mo91061a(BaMessageSettingActivity.m99156a(baMessageSettingActivity));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$d */
    static final class View$OnClickListenerC53917d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123632a;

        static {
            Covode.recordClassIndex(63583);
        }

        View$OnClickListenerC53917d(BaMessageSettingActivity baMessageSettingActivity) {
            this.f123632a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f123632a;
            baMessageSettingActivity.mo91061a(BaMessageSettingActivity.m99158b(baMessageSettingActivity));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C40945h m99156a(BaMessageSettingActivity baMessageSettingActivity) {
        C40945h hVar = baMessageSettingActivity.f123624d;
        if (hVar == null) {
            C89219l.m154710a("welcomeSwitch");
        }
        return hVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C40945h m99158b(BaMessageSettingActivity baMessageSettingActivity) {
        C40945h hVar = baMessageSettingActivity.f123626f;
        if (hVar == null) {
            C89219l.m154710a("autoReplySwitch");
        }
        return hVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ C40941f m99160c(BaMessageSettingActivity baMessageSettingActivity) {
        C40941f fVar = baMessageSettingActivity.f123625e;
        if (fVar == null) {
            C89219l.m154710a("welcomeSetting");
        }
        return fVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ C40941f m99161d(BaMessageSettingActivity baMessageSettingActivity) {
        C40941f fVar = baMessageSettingActivity.f123627g;
        if (fVar == null) {
            C89219l.m154710a("autoReplySetting");
        }
        return fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$h */
    static final class C53921h extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        public static final C53921h f123636a = new C53921h();

        static {
            Covode.recordClassIndex(63587);
        }

        C53921h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, false, null, null, false, null, null, null, null, null, false, null, false, false, null, 14335);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$i */
    static final class C53922i extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C53922i f123637a = new C53922i();

        static {
            Covode.recordClassIndex(63588);
        }

        C53922i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 7679);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$j */
    static final class C53923j extends AbstractC89220m implements AbstractC89172b<C34800h, C34800h> {

        /* renamed from: a */
        public static final C53923j f123638a = new C53923j();

        static {
            Covode.recordClassIndex(63589);
        }

        C53923j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34800h invoke(C34800h hVar) {
            C34800h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return C34800h.m71083a(hVar2, false, null, null, false, null, null, null, null, null, false, null, false, false, null, 14335);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$k */
    static final class C53924k extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C53924k f123639a = new C53924k();

        static {
            Covode.recordClassIndex(63590);
        }

        C53924k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 7679);
        }
    }

    /* renamed from: a */
    public final void mo91061a(C40945h hVar) {
        AbstractC89568bz unused = C89624i.m155555a(this, C89652o.f203399a, null, new C53927n(this, hVar, null), 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$e */
    static final class View$OnClickListenerC53918e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123633a;

        static {
            Covode.recordClassIndex(63584);
        }

        View$OnClickListenerC53918e(BaMessageSettingActivity baMessageSettingActivity) {
            this.f123633a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f123633a;
            C89219l.m154721d(baMessageSettingActivity, "");
            C89219l.m154721d("business_message_setting_page", "");
            Intent intent = new Intent(baMessageSettingActivity, BaWelcomeMessageEditActivity.class);
            intent.putExtra("enterFrom", "business_message_setting_page");
            C84349a.m145093a(intent, baMessageSettingActivity);
            baMessageSettingActivity.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$f */
    static final class View$OnClickListenerC53919f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaMessageSettingActivity f123634a;

        static {
            Covode.recordClassIndex(63585);
        }

        View$OnClickListenerC53919f(BaMessageSettingActivity baMessageSettingActivity) {
            this.f123634a = baMessageSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BaMessageSettingActivity baMessageSettingActivity = this.f123634a;
            C89219l.m154721d(baMessageSettingActivity, "");
            C89219l.m154721d("business_message_setting_page", "");
            Intent intent = new Intent(baMessageSettingActivity, BaAutoReplyListActivity.class);
            intent.putExtra("enterFrom", "business_message_setting_page");
            C84349a.m145093a(intent, baMessageSettingActivity);
            baMessageSettingActivity.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$g */
    static final class C53920g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C68348f>, Object> {

        /* renamed from: a */
        int f123635a;

        static {
            Covode.recordClassIndex(63586);
        }

        C53920g(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53920g(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C68348f> dVar) {
            return ((C53920g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f123635a == 0) {
                C89382r.m154942a(obj);
                try {
                    String b = C36145b.m73641b().mo63268b(C17867d.m33078a(), "last_user_setting_version", "");
                    UserSettingService a = UserSettingService.C55705a.m101447a();
                    C89219l.m154716b(b, "");
                    return a.getUserSettingsFuture(b).get();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$l */
    static final class C53925l extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f123640a;

        /* renamed from: b */
        int f123641b;

        /* renamed from: c */
        final /* synthetic */ BaMessageSettingActivity f123642c;

        static {
            Covode.recordClassIndex(63591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53925l(BaMessageSettingActivity baMessageSettingActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123642c = baMessageSettingActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53925l(this.f123642c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53925l) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            BaMessageSettingActivity baMessageSettingActivity;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123641b;
            if (i == 0) {
                C89382r.m154942a(obj);
                baMessageSettingActivity = this.f123642c;
                IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.f123623c;
                this.f123640a = baMessageSettingActivity;
                this.f123641b = 1;
                obj = iBaAutoMessageService.mo91012a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                baMessageSettingActivity = (BaMessageSettingActivity) this.f123640a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baMessageSettingActivity.mo91062a(((Boolean) obj).booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$m */
    static final class C53926m extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f123643a;

        /* renamed from: b */
        int f123644b;

        /* renamed from: c */
        final /* synthetic */ BaMessageSettingActivity f123645c;

        static {
            Covode.recordClassIndex(63592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53926m(BaMessageSettingActivity baMessageSettingActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123645c = baMessageSettingActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53926m(this.f123645c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53926m) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            BaMessageSettingActivity baMessageSettingActivity;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123644b;
            if (i == 0) {
                C89382r.m154942a(obj);
                baMessageSettingActivity = this.f123645c;
                IBaAutoMessageService iBaAutoMessageService = baMessageSettingActivity.f123623c;
                this.f123643a = baMessageSettingActivity;
                this.f123644b = 1;
                obj = iBaAutoMessageService.mo91018b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                baMessageSettingActivity = (BaMessageSettingActivity) this.f123643a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baMessageSettingActivity.mo91063b(((Boolean) obj).booleanValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$p */
    public static final class C53932p extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123661a;

        /* renamed from: b */
        final /* synthetic */ BaMessageSettingActivity f123662b;

        /* renamed from: c */
        final /* synthetic */ boolean f123663c;

        static {
            Covode.recordClassIndex(63598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53932p(BaMessageSettingActivity baMessageSettingActivity, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123662b = baMessageSettingActivity;
            this.f123663c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53932p(this.f123662b, this.f123663c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53932p) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f123661a == 0) {
                C89382r.m154942a(obj);
                BaMessageSettingActivity.m99158b(this.f123662b).mo70126a(new AbstractC89172b<C34800h, C34800h>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53932p.C539331 */

                    /* renamed from: a */
                    final /* synthetic */ C53932p f123664a;

                    static {
                        Covode.recordClassIndex(63599);
                    }

                    {
                        this.f123664a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34800h invoke(C34800h hVar) {
                        C34800h hVar2 = hVar;
                        C89219l.m154721d(hVar2, "");
                        return C34800h.m71083a(hVar2, this.f123664a.f123663c, null, null, false, null, null, null, null, null, false, null, true, false, null, 14334);
                    }
                });
                BaMessageSettingActivity.m99161d(this.f123662b).mo70126a(new AbstractC89172b<C34798f, C34798f>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53932p.C539342 */

                    /* renamed from: a */
                    final /* synthetic */ C53932p f123665a;

                    static {
                        Covode.recordClassIndex(63600);
                    }

                    {
                        this.f123665a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34798f invoke(C34798f fVar) {
                        C34798f fVar2 = fVar;
                        C89219l.m154721d(fVar2, "");
                        return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, this.f123665a.f123663c, null, false, false, null, null, 8063);
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$r */
    public static final class C53938r extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123673a;

        /* renamed from: b */
        final /* synthetic */ BaMessageSettingActivity f123674b;

        /* renamed from: c */
        final /* synthetic */ boolean f123675c;

        static {
            Covode.recordClassIndex(63604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53938r(BaMessageSettingActivity baMessageSettingActivity, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123674b = baMessageSettingActivity;
            this.f123675c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C53938r(this.f123674b, this.f123675c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53938r) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f123673a == 0) {
                C89382r.m154942a(obj);
                BaMessageSettingActivity.m99156a(this.f123674b).mo70126a(new AbstractC89172b<C34800h, C34800h>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53938r.C539391 */

                    /* renamed from: a */
                    final /* synthetic */ C53938r f123676a;

                    static {
                        Covode.recordClassIndex(63605);
                    }

                    {
                        this.f123676a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34800h invoke(C34800h hVar) {
                        C34800h hVar2 = hVar;
                        C89219l.m154721d(hVar2, "");
                        return C34800h.m71083a(hVar2, this.f123676a.f123675c, null, null, false, null, null, null, null, null, false, null, true, false, null, 14334);
                    }
                });
                BaMessageSettingActivity.m99160c(this.f123674b).mo70126a(new AbstractC89172b<C34798f, C34798f>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53938r.C539402 */

                    /* renamed from: a */
                    final /* synthetic */ C53938r f123677a;

                    static {
                        Covode.recordClassIndex(63606);
                    }

                    {
                        this.f123677a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C34798f invoke(C34798f fVar) {
                        C34798f fVar2 = fVar;
                        C89219l.m154721d(fVar2, "");
                        return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, this.f123677a.f123675c, null, false, false, null, null, 8063);
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final void mo91062a(boolean z) {
        if (z) {
            AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C53935q(this, null), 3);
        }
        AbstractC89568bz unused2 = C89624i.m155555a(this, C89652o.f203399a, null, new C53938r(this, z, null), 2);
    }

    /* renamed from: b */
    public final void mo91063b(boolean z) {
        if (z) {
            AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C53929o(this, null), 3);
        }
        AbstractC89568bz unused2 = C89624i.m155555a(this, C89652o.f203399a, null, new C53932p(this, z, null), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$o */
    public static final class C53929o extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f123654a;

        /* renamed from: b */
        final /* synthetic */ BaMessageSettingActivity f123655b;

        /* renamed from: c */
        private /* synthetic */ Object f123656c;

        static {
            Covode.recordClassIndex(63595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53929o(BaMessageSettingActivity baMessageSettingActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f123655b = baMessageSettingActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C53929o oVar = new C53929o(this.f123655b, dVar);
            oVar.f123656c = obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C53929o) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89516am amVar;
            final String quantityString;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f123654a;
            if (i == 0) {
                C89382r.m154942a(obj);
                amVar = (AbstractC89516am) this.f123656c;
                IBaAutoMessageService iBaAutoMessageService = this.f123655b.f123623c;
                this.f123656c = amVar;
                this.f123654a = 1;
                obj = iBaAutoMessageService.mo91024d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                amVar = (AbstractC89516am) this.f123656c;
                try {
                    C89382r.m154942a(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj == null) {
                C89219l.m154715b();
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                quantityString = this.f123655b.getResources().getString(R.string.dh4);
            } else {
                quantityString = this.f123655b.getResources().getQuantityString(R.plurals.d_, list.size(), C89108b.m154610a(list.size()));
            }
            C89219l.m154716b(quantityString, "");
            AbstractC89568bz unused2 = C89624i.m155555a(amVar, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53929o.C539301 */

                /* renamed from: a */
                int f123657a;

                /* renamed from: b */
                final /* synthetic */ C53929o f123658b;

                static {
                    Covode.recordClassIndex(63596);
                }

                {
                    this.f123658b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$q */
                    public static final class C53935q extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f123666a;

                        /* renamed from: b */
                        final /* synthetic */ BaMessageSettingActivity f123667b;

                        /* renamed from: c */
                        private /* synthetic */ Object f123668c;

                        static {
                            Covode.recordClassIndex(63601);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C53935q(BaMessageSettingActivity baMessageSettingActivity, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f123667b = baMessageSettingActivity;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            C53935q qVar = new C53935q(this.f123667b, dVar);
                            qVar.f123668c = obj;
                            return qVar;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C53935q) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            AbstractC89516am amVar;
                            int i;
                            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                            int i2 = this.f123666a;
                            if (i2 == 0) {
                                C89382r.m154942a(obj);
                                amVar = (AbstractC89516am) this.f123668c;
                                IBaAutoMessageService iBaAutoMessageService = this.f123667b.f123623c;
                                this.f123668c = amVar;
                                this.f123666a = 1;
                                obj = iBaAutoMessageService.mo91022c(this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            } else if (i2 == 1) {
                                amVar = (AbstractC89516am) this.f123668c;
                                try {
                                    C89382r.m154942a(obj);
                                } catch (Exception unused) {
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            if (obj == null) {
                                C89219l.m154715b();
                            }
                            Resources resources = this.f123667b.getResources();
                            if (((C53869a) obj).f123515b == 0) {
                                i = R.string.dh4;
                            } else {
                                i = R.string.bis;
                            }
                            final String string = resources.getString(i);
                            C89219l.m154716b(string, "");
                            AbstractC89568bz unused2 = C89624i.m155555a(amVar, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53935q.C539361 */

                                /* renamed from: a */
                                int f123669a;

                                /* renamed from: b */
                                final /* synthetic */ C53935q f123670b;

                                static {
                                    Covode.recordClassIndex(63602);
                                }

                                {
                                    this.f123670b = r2;
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                    C89219l.m154721d(dVar, "");
                                    return 

                                    /* access modifiers changed from: package-private */
                                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$n */
                                    public static final class C53927n extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                        /* renamed from: a */
                                        int f123646a;

                                        /* renamed from: b */
                                        int f123647b;

                                        /* renamed from: c */
                                        final /* synthetic */ BaMessageSettingActivity f123648c;

                                        /* renamed from: d */
                                        final /* synthetic */ C40945h f123649d;

                                        static {
                                            Covode.recordClassIndex(63593);
                                        }

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        C53927n(BaMessageSettingActivity baMessageSettingActivity, C40945h hVar, AbstractC89124d dVar) {
                                            super(2, dVar);
                                            this.f123648c = baMessageSettingActivity;
                                            this.f123649d = hVar;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return new C53927n(this.f123648c, this.f123649d, dVar);
                                        }

                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                            return ((C53927n) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                        }

                                        /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService */
                                        /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
                                        /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
                                        /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
                                        /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
                                        /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
                                        /* JADX WARNING: Unknown variable types count: 2 */
                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                                            /*
                                            // Method dump skipped, instructions count: 346
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity.C53927n.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }

                                        /* access modifiers changed from: package-private */
                                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity$n$a */
                                        public static final class DialogInterface$OnClickListenerC53928a implements DialogInterface.OnClickListener {

                                            /* renamed from: a */
                                            final /* synthetic */ C53927n f123650a;

                                            /* renamed from: b */
                                            final /* synthetic */ Spanned f123651b;

                                            /* renamed from: c */
                                            final /* synthetic */ int f123652c;

                                            /* renamed from: d */
                                            final /* synthetic */ C68348f f123653d;

                                            static {
                                                Covode.recordClassIndex(63594);
                                            }

                                            DialogInterface$OnClickListenerC53928a(C53927n nVar, Spanned spanned, int i, C68348f fVar) {
                                                this.f123650a = nVar;
                                                this.f123651b = spanned;
                                                this.f123652c = i;
                                                this.f123653d = fVar;
                                            }

                                            public final void onClick(DialogInterface dialogInterface, int i) {
                                                SmartRouter.buildRoute(this.f123650a.f123648c, "aweme://chatcontrol/setting").withParam("currentSettingsValue", this.f123652c).withParam("group_chat_set", this.f123653d.f152943F).open(1);
                                            }
                                        }
                                    }

                                    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.p3102b.AbstractActivityC53959a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
                                    public final void onCreate(Bundle bundle) {
                                        C15477a.m28474a(this, bundle);
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onCreate", true);
                                        super.onCreate(bundle);
                                        this.f123623c.mo91014a();
                                        setContentView(R.layout.a8_);
                                        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.ejf);
                                        buttonTitleBar.setTitle(R.string.d2s);
                                        buttonTitleBar.setOnTitleBarClickListener(new C53915b(this));
                                        String string = getString(R.string.hbb);
                                        C89219l.m154716b(string, "");
                                        this.f123624d = new C40945h(new C34800h(false, string, new View$OnClickListenerC53916c(this), false, null, null, null, null, getString(R.string.hbc), false, 15353));
                                        String string2 = getString(R.string.cql);
                                        C89219l.m154716b(string2, "");
                                        this.f123626f = new C40945h(new C34800h(false, string2, new View$OnClickListenerC53917d(this), false, null, null, null, null, getString(R.string.cqm), false, 15353));
                                        String string3 = getString(R.string.d2k);
                                        C89219l.m154716b(string3, "");
                                        this.f123625e = new C40941f(new C34798f("", false, null, string3, null, null, false, false, new View$OnClickListenerC53918e(this), null, 6006));
                                        String string4 = getString(R.string.d2k);
                                        C89219l.m154716b(string4, "");
                                        this.f123627g = new C40941f(new C34798f("", false, null, string4, null, null, false, false, new View$OnClickListenerC53919f(this), null, 6006));
                                        String a = m99157a(getIntent(), "enter_from");
                                        if (a == null) {
                                            a = "";
                                        }
                                        C89219l.m154716b(a, "");
                                        C53858a.C53863e eVar = C53858a.C53863e.f123508a;
                                        C89219l.m154721d(a, "");
                                        C89219l.m154721d(eVar, "");
                                        Map<String, String> map = new C33744d().mo59983a("enter_from", a).f79943a;
                                        C89219l.m154716b(map, "");
                                        eVar.invoke("enter_business_message_setting", map);
                                        C43047dm b = m99159b();
                                        String string5 = getString(R.string.hbb);
                                        C89219l.m154716b(string5, "");
                                        b.mo73247a(new C40937d(new C34797e(string5, false, false, 14)));
                                        C43047dm b2 = m99159b();
                                        C40945h hVar = this.f123624d;
                                        if (hVar == null) {
                                            C89219l.m154710a("welcomeSwitch");
                                        }
                                        b2.mo73247a(hVar);
                                        C43047dm b3 = m99159b();
                                        C40941f fVar = this.f123625e;
                                        if (fVar == null) {
                                            C89219l.m154710a("welcomeSetting");
                                        }
                                        b3.mo73247a(fVar);
                                        C43047dm b4 = m99159b();
                                        String string6 = getString(R.string.cql);
                                        C89219l.m154716b(string6, "");
                                        b4.mo73247a(new C40937d(new C34797e(string6, true, false, 12)));
                                        C43047dm b5 = m99159b();
                                        C40945h hVar2 = this.f123626f;
                                        if (hVar2 == null) {
                                            C89219l.m154710a("autoReplySwitch");
                                        }
                                        b5.mo73247a(hVar2);
                                        C43047dm b6 = m99159b();
                                        C40941f fVar2 = this.f123627g;
                                        if (fVar2 == null) {
                                            C89219l.m154710a("autoReplySetting");
                                        }
                                        b6.mo73247a(fVar2);
                                        this.f123623c.mo91020b();
                                        this.f123623c.mo91023c();
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.activity.BaMessageSettingActivity", "onCreate", false);
                                    }

                                    /* renamed from: a */
                                    private static String m99157a(Intent intent, String str) {
                                        try {
                                            return intent.getStringExtra(str);
                                        } catch (Exception unused) {
                                            return null;
                                        }
                                    }
                                }
