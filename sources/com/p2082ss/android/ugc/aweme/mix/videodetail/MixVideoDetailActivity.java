package com.p2082ss.android.ugc.aweme.mix.videodetail;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
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
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59391e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59857d;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59406f;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59407g;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59408h;
import com.p2082ss.android.ugc.aweme.mix.p3450e.C59537a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Map;
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

/* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity */
public final class MixVideoDetailActivity extends DetailActivity implements AbstractC12846h, AbstractC59391e, AbstractC90253j {

    /* renamed from: j */
    public static final C59933g f136508j = new C59933g((byte) 0);

    /* renamed from: k */
    private final C12814b f136509k;

    /* renamed from: l */
    private SparseArray f136510l;

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$b */
    public static final class C59928b extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {
        public static final C59928b INSTANCE = new C59928b();

        static {
            Covode.recordClassIndex(70347);
        }

        public C59928b() {
            super(1);
        }

        public final C59857d invoke(C59857d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(70345);
    }

    /* renamed from: b */
    private MixVideosViewModel m109466b() {
        return (MixVideosViewModel) this.f136509k.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f136510l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f136510l == null) {
            this.f136510l = new SparseArray();
        }
        View view = (View) this.f136510l.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f136510l.put(i, findViewById);
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

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(148, new RunnableC90250g(MixVideoDetailActivity.class, "manageVideoDoneClick", C59407g.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(149, new RunnableC90250g(MixVideoDetailActivity.class, "onDeleteMix", C59406f.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(150, new RunnableC90250g(MixVideoDetailActivity.class, "onReomveFeedFromMixDetailSuccess", C59408h.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$d */
    public static final class C59930d extends AbstractC89220m implements AbstractC89171a<MixVideoDetailActivity> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f136512a;

        static {
            Covode.recordClassIndex(70349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59930d(ActivityC0945e eVar) {
            super(0);
            this.f136512a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.e, com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity invoke() {
            /*
                r1 = this;
                androidx.fragment.app.e r0 = r1.f136512a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity.C59930d.invoke():androidx.fragment.app.e");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$g */
    public static final class C59933g {
        static {
            Covode.recordClassIndex(70352);
        }

        private C59933g() {
        }

        public /* synthetic */ C59933g(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$c */
    public static final class C59929c extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59929c INSTANCE = new C59929c();

        static {
            Covode.recordClassIndex(70348);
        }

        public C59929c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$f */
    public static final class C59932f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59932f INSTANCE = new C59932f();

        static {
            Covode.recordClassIndex(70351);
        }

        public C59932f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$e */
    public static final class C59931e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f136513a;

        static {
            Covode.recordClassIndex(70350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59931e(ActivityC0945e eVar) {
            super(0);
            this.f136513a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f136513a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onDestroy() {
        C15477a.m28479e(this);
        try {
            super.onDestroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity$a */
    public static final class C59927a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136511a;

        static {
            Covode.recordClassIndex(70346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59927a(AbstractC89277c cVar) {
            super(0);
            this.f136511a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136511a).getName();
        }
    }

    public MixVideoDetailActivity() {
        AbstractC89277c a = C89204ab.m154669a(MixVideosViewModel.class);
        this.f136509k = new C12814b(a, new C59927a(a), C59929c.INSTANCE, new C59930d(this), new C59931e(this), C59932f.INSTANCE, C59928b.INSTANCE);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
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

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void manageVideoDoneClick(C59407g gVar) {
        C89219l.m154721d(gVar, "");
        finish();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDeleteMix(C59406f fVar) {
        C89219l.m154721d(fVar, "");
        finish();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReomveFeedFromMixDetailSuccess(C59408h hVar) {
        C89219l.m154721d(hVar, "");
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractActivityC41359ak, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.bo, 0);
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    /* renamed from: a */
    public final C41401l mo70608a(C49812b bVar) {
        Serializable serializable;
        long j;
        String str;
        String str2;
        String str3;
        Intent intent = getIntent();
        String str4 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("mix_video_list_params");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C59537a)) {
            serializable = null;
        }
        C59537a aVar = (C59537a) serializable;
        if (bVar != null) {
            if (aVar != null) {
                str = aVar.getMVideoFrom();
            } else {
                str = null;
            }
            bVar.setFrom(str);
            if (aVar != null) {
                str2 = aVar.getMSecUid();
            } else {
                str2 = null;
            }
            bVar.setSecUid(str2);
            if (aVar != null) {
                str3 = aVar.getMUsrId();
            } else {
                str3 = null;
            }
            bVar.setUid(str3);
            if (aVar != null) {
                str4 = aVar.getEnterGroupId();
            }
            bVar.setPlaylistEnterGroupId(str4);
        }
        MixVideosViewModel b = m109466b();
        if (aVar != null) {
            j = aVar.getPageStartTime();
        } else {
            j = -1;
        }
        b.f136242x = j;
        Bundle bundle = new Bundle();
        bundle.putSerializable("mix_video_list_params", aVar);
        if (aVar != null) {
            bundle.putSerializable("feed_param", bVar);
        }
        C59966i iVar = new C59966i();
        iVar.setArguments(bundle);
        return iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59391e
    /* renamed from: a */
    public final void mo97057a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        m109466b().mo20662a(MixVideosViewModel.C59806ad.f136252a);
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
