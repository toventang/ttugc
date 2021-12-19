package com.p2082ss.android.ugc.aweme.mix.createmix;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.createmix.C59434d;
import com.p2082ss.android.ugc.aweme.mix.createmix.C59467g;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.EnumC59529b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.editname.C59605h;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59405e;
import com.p2082ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity */
public final class CreatePlaylistActivity extends AbstractActivityC59327a implements AbstractC12846h, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C59426m f135712c = new C59426m((byte) 0);

    /* renamed from: a */
    public int f135713a = 1;

    /* renamed from: b */
    public Aweme f135714b;

    /* renamed from: d */
    private final C12814b f135715d;

    /* renamed from: e */
    private final C12814b f135716e;

    /* renamed from: f */
    private String f135717f = "";

    /* renamed from: g */
    private String f135718g = "";

    /* renamed from: h */
    private String f135719h = "";

    /* renamed from: i */
    private SparseArray f135720i;

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$e */
    public static final class C59418e extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59418e INSTANCE = new C59418e();

        static {
            Covode.recordClassIndex(69811);
        }

        public C59418e() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$k */
    public static final class C59424k extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59424k INSTANCE = new C59424k();

        static {
            Covode.recordClassIndex(69817);
        }

        public C59424k() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69806);
    }

    /* renamed from: c */
    private final MixVideosManageViewModel m109115c() {
        return (MixVideosManageViewModel) this.f135716e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f135720i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f135720i == null) {
            this.f135720i = new SparseArray();
        }
        View view = (View) this.f135720i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f135720i.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final MixCreateViewModel mo97085b() {
        return (MixCreateViewModel) this.f135715d.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(338, new RunnableC90250g(CreatePlaylistActivity.class, "onCreateMixListSuccess", C59405e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$b */
    public static final class C59415b extends AbstractC89220m implements AbstractC89171a<CreatePlaylistActivity> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f135722a;

        static {
            Covode.recordClassIndex(69808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59415b(ActivityC0945e eVar) {
            super(0);
            this.f135722a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.e, com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity invoke() {
            /*
                r1 = this;
                androidx.fragment.app.e r0 = r1.f135722a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity.C59415b.invoke():androidx.fragment.app.e");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$g */
    public static final class C59420g extends AbstractC89220m implements AbstractC89171a<CreatePlaylistActivity> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f135724a;

        static {
            Covode.recordClassIndex(69813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59420g(ActivityC0945e eVar) {
            super(0);
            this.f135724a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.e, com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity invoke() {
            /*
                r1 = this;
                androidx.fragment.app.e r0 = r1.f135724a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity.C59420g.invoke():androidx.fragment.app.e");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$m */
    public static final class C59426m {
        static {
            Covode.recordClassIndex(69819);
        }

        private C59426m() {
        }

        public /* synthetic */ C59426m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$q */
    static final class C59430q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59430q f135732a = new C59430q();

        static {
            Covode.recordClassIndex(69823);
        }

        C59430q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$d */
    public static final class C59417d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59417d INSTANCE = new C59417d();

        static {
            Covode.recordClassIndex(69810);
        }

        public C59417d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$f */
    public static final class C59419f extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59419f INSTANCE = new C59419f();

        static {
            Covode.recordClassIndex(69812);
        }

        public C59419f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$i */
    public static final class C59422i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59422i INSTANCE = new C59422i();

        static {
            Covode.recordClassIndex(69815);
        }

        public C59422i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$l */
    public static final class C59425l extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59425l INSTANCE = new C59425l();

        static {
            Covode.recordClassIndex(69818);
        }

        public C59425l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$c */
    public static final class C59416c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f135723a;

        static {
            Covode.recordClassIndex(69809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59416c(ActivityC0945e eVar) {
            super(0);
            this.f135723a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f135723a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$h */
    public static final class C59421h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f135725a;

        static {
            Covode.recordClassIndex(69814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59421h(ActivityC0945e eVar) {
            super(0);
            this.f135725a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f135725a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$a */
    public static final class C59414a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135721a;

        static {
            Covode.recordClassIndex(69807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59414a(AbstractC89277c cVar) {
            super(0);
            this.f135721a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135721a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$j */
    public static final class C59423j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135726a;

        static {
            Covode.recordClassIndex(69816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59423j(AbstractC89277c cVar) {
            super(0);
            this.f135726a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135726a).getName();
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

    public CreatePlaylistActivity() {
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        this.f135715d = new C12814b(a, new C59414a(a), C59419f.INSTANCE, new C59420g(this), new C59421h(this), C59422i.INSTANCE, C59418e.INSTANCE);
        AbstractC89277c a2 = C89204ab.m154669a(MixVideosManageViewModel.class);
        this.f135716e = new C12814b(a2, new C59423j(a2), C59425l.INSTANCE, new C59415b(this), new C59416c(this), C59417d.INSTANCE, C59424k.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a
    /* renamed from: a */
    public final Fragment mo96994a() {
        Fragment a;
        Fragment a2;
        int i = this.f135713a;
        if (i == 1) {
            mo97085b().mo97104a(true);
            C59330a.m109038b(mo97085b().f135807k, mo97085b().f135808l);
            if (MixFeedService.m109435k().mo97325b()) {
                C59330a.m109039c(this.f135717f, this.f135718g);
                a = C59434d.C59441g.m109132a(this.f135717f, mo97085b().f135808l);
            } else {
                C59330a.m109040d(mo97085b().f135807k, mo97085b().f135808l);
                a = C59605h.C59612g.m109204a(1, null, null, null, null, null, 62);
            }
            return a;
        } else if (i == 2) {
            mo97085b().mo97104a(true);
            C59330a.m109038b(mo97085b().f135807k, mo97085b().f135808l);
            m109115c().mo97229a(this.f135719h, "", this.f135717f);
            mo97085b().mo97103a(this.f135719h);
            if (MixFeedService.m109435k().mo97325b()) {
                C59330a.m109039c(this.f135717f, this.f135718g);
                a2 = C59434d.C59441g.m109132a(this.f135717f, mo97085b().f135808l);
            } else {
                C59330a.m109041e(mo97085b().f135807k, mo97085b().f135808l);
                a2 = AddMultiVideoFragment.C59881m.m109337a();
            }
            return a2;
        } else if (i != 4) {
            mo97085b().mo97104a(true);
            C59330a.m109038b(mo97085b().f135807k, mo97085b().f135808l);
            C59330a.m109040d(mo97085b().f135807k, mo97085b().f135808l);
            return C59605h.C59612g.m109204a(3, null, null, this.f135714b, null, null, 54);
        } else {
            m109115c().mo97229a(this.f135719h, "", this.f135717f);
            mo97085b().mo97103a(this.f135719h);
            mo97085b().mo97104a(false);
            C59330a.m109041e(m109115c().f136169j, "manage_video");
            return AddMultiVideoFragment.C59881m.m109337a();
        }
    }

    /* renamed from: a */
    private static Bundle m109113a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @AbstractC90264r
    public final void onCreateMixListSuccess(C59405e eVar) {
        C89219l.m154721d(eVar, "");
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$p */
    static final class C59429p extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CreatePlaylistActivity f135731a;

        static {
            Covode.recordClassIndex(69822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59429p(CreatePlaylistActivity createPlaylistActivity) {
            super(1);
            this.f135731a = createPlaylistActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            String message = th2.getMessage();
            if (message == null || !message.equals("dark_post_failed")) {
                new C23144b(this.f135731a).mo37640e(R.string.fz3).mo37637b();
            } else {
                new C23144b(this.f135731a).mo37640e(R.string.b3x).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$o */
    static final class C59428o extends AbstractC89220m implements AbstractC89172b<C59396b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CreatePlaylistActivity f135728a;

        /* renamed from: b */
        final /* synthetic */ String f135729b;

        /* renamed from: c */
        final /* synthetic */ String f135730c;

        static {
            Covode.recordClassIndex(69821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59428o(CreatePlaylistActivity createPlaylistActivity, String str, String str2) {
            super(1);
            this.f135728a = createPlaylistActivity;
            this.f135729b = str;
            this.f135730c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
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
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.mix.api.response.C59396b r9) {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.mix.api.response.b r9 = (com.p2082ss.android.ugc.aweme.mix.api.response.C59396b) r9
                if (r9 == 0) goto L_0x0048
                int r0 = r9.status_code
                if (r0 != 0) goto L_0x0048
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.f135728a
                r1.<init>(r0)
                com.bytedance.tux.g.b r1 = r1.mo37632a()
                r0 = 2131830453(0x7f1126b5, float:1.9293904E38)
                com.bytedance.tux.g.b r0 = r1.mo37640e(r0)
                r0.mo37637b()
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.f135728a
                int r1 = r0.f135713a
                r0 = 1
                if (r1 == r0) goto L_0x002b
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.f135728a
                int r1 = r0.f135713a
                r0 = 2
                if (r1 != r0) goto L_0x0040
            L_0x002b:
                com.ss.android.ugc.aweme.mix.services.IMixFeedService r0 = com.p2082ss.android.ugc.aweme.mix.services.MixFeedService.m109435k()
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r1 = r8.f135728a
                java.lang.String r4 = r9.f135679a
                java.lang.String r5 = r8.f135729b
                java.lang.String r6 = r8.f135730c
                java.lang.String r2 = ""
                java.lang.String r3 = "from_profile_mix_list"
                java.lang.String r7 = ""
                com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService.C59922a.m109401a(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x0040:
                com.ss.android.ugc.aweme.mix.b.e r0 = new com.ss.android.ugc.aweme.mix.b.e
                r0.<init>()
                com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r0)
            L_0x0048:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity.C59428o.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("enter_from")) {
            String a = m109114a(intent, "enter_from");
            if (a == null) {
                a = "";
            }
            this.f135717f = a;
            String a2 = m109114a(intent, "enter_method");
            if (a2 == null) {
                a2 = "";
            }
            this.f135718g = a2;
            MixCreateViewModel b = mo97085b();
            String str = this.f135717f;
            String str2 = this.f135718g;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            b.f135807k = str;
            b.f135808l = str2;
            this.f135713a = intent.getIntExtra("open_fragment_type", 1);
            String a3 = m109114a(intent, "key_manage_mix_id");
            if (a3 == null) {
                a3 = "";
            }
            this.f135719h = a3;
            Bundle a4 = m109113a(intent);
            if (!(a4 == null || a4.getSerializable("key_mix_add_aweme_info") == null)) {
                Serializable serializableExtra = intent.getSerializableExtra("key_mix_add_aweme_info");
                if (serializableExtra != null) {
                    this.f135714b = (Aweme) serializableExtra;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
                    throw nullPointerException;
                }
            }
        }
        super.onCreate(bundle);
        AbstractC12818f.C12819a.m23063a(this, mo97085b(), C59432b.f135734a, (C12854k) null, new C59427n(this), 6);
        EventBus.m156966a(EventBus.m156962a(), this);
        C31575b.m65859a();
        IAccountUserService e = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e, "");
        String curUserId = e.getCurUserId();
        C31575b.m65859a();
        IAccountUserService e2 = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e2, "");
        String curSecUserId = e2.getCurSecUserId();
        AssemViewModel.m23030a(mo97085b(), C59433c.f135735a, null, new C59429p(this), C59430q.f135732a, new C59428o(this, curUserId, curSecUserId), 2);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m109114a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity$n */
    static final class C59427n extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends EnumC59529b>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CreatePlaylistActivity f135727a;

        static {
            Covode.recordClassIndex(69820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59427n(CreatePlaylistActivity createPlaylistActivity) {
            super(2);
            this.f135727a = createPlaylistActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends EnumC59529b> aVar) {
            int i;
            C12776a<? extends EnumC59529b> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (aVar2 != null) {
                int i2 = C59431a.f135733a[aVar2.f31085a.ordinal()];
                if (i2 == 1) {
                    C59330a.m109041e(this.f135727a.mo97085b().f135807k, this.f135727a.mo97085b().f135808l);
                    this.f135727a.getSupportFragmentManager().mo3552a().mo3452a(R.anim.dq, R.anim.dx, 0, R.anim.dx).mo3454a(R.id.b82, AddMultiVideoFragment.C59881m.m109337a(), "TAG_CONTAINER").mo3457a((String) null).mo3467b();
                } else if (i2 == 2) {
                    this.f135727a.getSupportFragmentManager().mo3552a().mo3452a(R.anim.dq, R.anim.dx, 0, R.anim.dx).mo3454a(R.id.b82, C59467g.C59474g.m109144a(), "TAG_CONTAINER").mo3457a((String) null).mo3467b();
                    C59330a.m109042f(this.f135727a.mo97085b().f135807k, this.f135727a.mo97085b().f135808l);
                } else if (i2 == 3) {
                    C59330a.m109040d(this.f135727a.mo97085b().f135807k, this.f135727a.mo97085b().f135808l);
                    if (this.f135727a.f135713a == 1 || this.f135727a.f135713a == 2) {
                        i = 1;
                    } else {
                        i = 3;
                    }
                    this.f135727a.getSupportFragmentManager().mo3552a().mo3452a(R.anim.dq, R.anim.dx, 0, R.anim.dx).mo3454a(R.id.b82, C59605h.C59612g.m109204a(i, null, null, this.f135727a.f135714b, null, null, 54), "TAG_CONTAINER").mo3457a((String) null).mo3467b();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
