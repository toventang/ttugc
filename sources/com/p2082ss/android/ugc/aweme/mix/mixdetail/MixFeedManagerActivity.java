package com.p2082ss.android.ugc.aweme.mix.mixdetail;

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
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
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
import com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
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

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity */
public final class MixFeedManagerActivity extends AbstractActivityC59327a implements AbstractC12846h {

    /* renamed from: b */
    public static final C59629g f135992b = new C59629g((byte) 0);

    /* renamed from: a */
    public C59663g f135993a;

    /* renamed from: c */
    private final C12814b f135994c;

    /* renamed from: d */
    private String f135995d = "";

    /* renamed from: e */
    private String f135996e = "";

    /* renamed from: f */
    private String f135997f = "";

    /* renamed from: g */
    private SparseArray f135998g;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$b */
    public static final class C59624b extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59624b INSTANCE = new C59624b();

        static {
            Covode.recordClassIndex(70024);
        }

        public C59624b() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70022);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f135998g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f135998g == null) {
            this.f135998g = new SparseArray();
        }
        View view = (View) this.f135998g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f135998g.put(i, findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$d */
    public static final class C59626d extends AbstractC89220m implements AbstractC89171a<MixFeedManagerActivity> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f136000a;

        static {
            Covode.recordClassIndex(70026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59626d(ActivityC0945e eVar) {
            super(0);
            this.f136000a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.e, com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity invoke() {
            /*
                r1 = this;
                androidx.fragment.app.e r0 = r1.f136000a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity.C59626d.invoke():androidx.fragment.app.e");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$g */
    public static final class C59629g {
        static {
            Covode.recordClassIndex(70029);
        }

        private C59629g() {
        }

        public /* synthetic */ C59629g(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$c */
    public static final class C59625c extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59625c INSTANCE = new C59625c();

        static {
            Covode.recordClassIndex(70025);
        }

        public C59625c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$f */
    public static final class C59628f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59628f INSTANCE = new C59628f();

        static {
            Covode.recordClassIndex(70028);
        }

        public C59628f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$e */
    public static final class C59627e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f136001a;

        static {
            Covode.recordClassIndex(70027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59627e(ActivityC0945e eVar) {
            super(0);
            this.f136001a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f136001a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity$a */
    public static final class C59623a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135999a;

        static {
            Covode.recordClassIndex(70023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59623a(AbstractC89277c cVar) {
            super(0);
            this.f135999a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135999a).getName();
        }
    }

    public MixFeedManagerActivity() {
        AbstractC89277c a = C89204ab.m154669a(MixVideosManageViewModel.class);
        this.f135994c = new C12814b(a, new C59623a(a), C59625c.INSTANCE, new C59626d(this), new C59627e(this), C59628f.INSTANCE, C59624b.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a
    /* renamed from: a */
    public final Fragment mo96994a() {
        C59330a.m109042f(this.f135997f, "manage_video");
        String str = this.f135995d;
        C89219l.m154721d(str, "");
        Bundle bundle = new Bundle();
        bundle.putString("key_mix_id", str);
        C59663g gVar = new C59663g();
        gVar.setArguments(bundle);
        this.f135993a = gVar;
        return gVar;
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.mix.AbstractActivityC59327a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null) {
            String str = "";
            if (intent.hasExtra("key_mix_id")) {
                String a = m109208a(intent, "key_mix_id");
                if (a == null) {
                    a = str;
                }
                this.f135995d = a;
            }
            if (intent.hasExtra("key_mix_name")) {
                String a2 = m109208a(intent, "key_mix_name");
                if (a2 == null) {
                    a2 = str;
                }
                this.f135996e = a2;
            }
            if (intent.hasExtra("enter_from")) {
                String a3 = m109208a(intent, "enter_from");
                if (a3 != null) {
                    str = a3;
                }
                this.f135997f = str;
            }
        }
        ((MixVideosManageViewModel) this.f135994c.getValue()).mo97229a(this.f135995d, this.f135996e, this.f135997f);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m109208a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
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
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
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
