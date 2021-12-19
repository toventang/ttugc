package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.p1208im.core.api.C17445c;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54868b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity */
public final class StrangerListActivity extends ActivityC17312a implements AbstractC34585f, AbstractC39063h.AbstractC39067a {

    /* renamed from: a */
    public static final C54939a f125765a = new C54939a((byte) 0);

    /* renamed from: b */
    private C54949d f125766b;

    /* renamed from: c */
    private AbstractC17443i f125767c;

    /* renamed from: d */
    private HashMap f125768d;

    static {
        Covode.recordClassIndex(64662);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f125768d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f125768d == null) {
            this.f125768d = new HashMap();
        }
        View view = (View) this.f125768d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f125768d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "message_box";
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity$a */
    public static final class C54939a {
        static {
            Covode.recordClassIndex(64663);
        }

        private C54939a() {
        }

        public /* synthetic */ C54939a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity$c */
    static final class C54941c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StrangerListActivity f125769a;

        static {
            Covode.recordClassIndex(64665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54941c(StrangerListActivity strangerListActivity) {
            super(0);
            this.f125769a = strangerListActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f125769a.onBackPressed();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity$b */
    static final /* synthetic */ class C54940b extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(64664);
        }

        C54940b(StrangerListActivity strangerListActivity) {
            super(0, strangerListActivity, StrangerListActivity.class, "refreshData", "refreshData()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((StrangerListActivity) this.receiver).mo91931a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static boolean m100559b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m100560d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean b = m100559b();
        C58029j.f132253e = b;
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        AbstractC17443i iVar = this.f125767c;
        if (iVar == null) {
            C89219l.m154710a("strangerModel");
        }
        if (!iVar.mo27783a()) {
            C54949d dVar = this.f125766b;
            if (dVar == null) {
                C89219l.m154710a("adapter");
            }
            dVar.ao_();
            AbstractC17443i iVar2 = this.f125767c;
            if (iVar2 == null) {
                C89219l.m154710a("strangerModel");
            }
            iVar2.mo27786d();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC17443i iVar = this.f125767c;
        if (iVar == null) {
            C89219l.m154710a("strangerModel");
        }
        iVar.mo27784b();
        C54949d dVar = this.f125766b;
        if (dVar == null) {
            C89219l.m154710a("adapter");
        }
        C89517an.m155450b(dVar.f125780a);
        if (_$_findCachedViewById(R.id.e_f) != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.e_f);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setAdapter(null);
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

    /* renamed from: a */
    public final void mo91931a() {
        AbstractC17443i iVar = this.f125767c;
        if (iVar == null) {
            C89219l.m154710a("strangerModel");
        }
        if (!iVar.mo27783a()) {
            if (m100560d()) {
                C54949d dVar = this.f125766b;
                if (dVar == null) {
                    C89219l.m154710a("adapter");
                }
                if (dVar.getItemCount() == 0) {
                    ((TuxStatusView) _$_findCachedViewById(R.id.e7i)).mo37867a();
                }
                AbstractC17443i iVar2 = this.f125767c;
                if (iVar2 == null) {
                    C89219l.m154710a("strangerModel");
                }
                iVar2.mo27785c();
                return;
            }
            C54949d dVar2 = this.f125766b;
            if (dVar2 == null) {
                C89219l.m154710a("adapter");
            }
            if (dVar2.getItemCount() == 0) {
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C33429a.f79465a), null, null, new C54944e(this, null), 3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity$d */
    static final class C54942d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C54942d f125770a = new C54942d();

        static {
            Covode.recordClassIndex(64666);
        }

        C54942d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C549431.f125771a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity$e */
    public static final class C54944e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125772a;

        /* renamed from: b */
        final /* synthetic */ StrangerListActivity f125773b;

        static {
            Covode.recordClassIndex(64668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54944e(StrangerListActivity strangerListActivity, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125773b = strangerListActivity;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54944e(this.f125773b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54944e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f125772a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f125772a = 1;
                if (C89536ay.m155464a(100, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f125773b.isDestroyed()) {
                return C89391z.f203057a;
            }
            ((TuxStatusView) this.f125773b._$_findCachedViewById(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui.StrangerListActivity.C54944e.C549451 */

                /* renamed from: a */
                final /* synthetic */ C54944e f125774a;

                static {
                    Covode.recordClassIndex(64669);
                }

                {
                    this.f125774a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f125774a.f125773b.mo91931a();
                    return C89391z.f203057a;
                }
            }));
            new C23144b(this.f125773b).mo37640e(R.string.dcq).mo37637b();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onCreate", true);
        activityConfiguration(C54942d.f125770a);
        super.onCreate(bundle);
        setContentView(R.layout.a49);
        C55076b.m100725d().setupStatusBar(this);
        C55076b.m100727f();
        TuxNavBar.C23179a a = new TuxNavBar.C23179a().mo37732a(new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C54941c(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.d2r);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a2 = a.mo37731a(gVar.mo37753a(string));
        a2.f54919d = true;
        ((TuxNavBar) _$_findCachedViewById(R.id.cpv)).setNavActions(a2);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.e_f);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager());
        TuxStatusView tuxStatusView = (TuxStatusView) _$_findCachedViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView, "");
        this.f125766b = new C54949d(tuxStatusView, this, new C54868b(this, "message_box", "cell"), new C54940b(this));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.e_f);
        C89219l.m154716b(recyclerView2, "");
        C54949d dVar = this.f125766b;
        if (dVar == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView2.setAdapter(dVar);
        ((RecyclerView) _$_findCachedViewById(R.id.e_f)).mo4405a(new C51425a(this));
        C54949d dVar2 = this.f125766b;
        if (dVar2 == null) {
            C89219l.m154710a("adapter");
        }
        dVar2.mo67813a((AbstractC39063h.AbstractC39067a) this);
        C54949d dVar3 = this.f125766b;
        if (dVar3 == null) {
            C89219l.m154710a("adapter");
        }
        dVar3.mo67829d(C55076b.m100725d().needSessionListShowMore());
        AbstractC17443i c = C17445c.f41787a.mo27882c();
        this.f125767c = c;
        if (c == null) {
            C89219l.m154710a("strangerModel");
        }
        C54949d dVar4 = this.f125766b;
        if (dVar4 == null) {
            C89219l.m154710a("adapter");
        }
        c.mo27782a(dVar4);
        mo91931a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.StrangerListActivity", "onCreate", false);
    }
}
