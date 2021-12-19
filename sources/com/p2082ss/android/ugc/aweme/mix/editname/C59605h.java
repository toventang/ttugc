package com.p2082ss.android.ugc.aweme.mix.editname;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.C12780d;
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
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59403c;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
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

/* renamed from: com.ss.android.ugc.aweme.mix.editname.h */
public final class C59605h extends Fragment implements AbstractC12846h, AbstractC59620k {

    /* renamed from: a */
    public static final C59612g f135968a = new C59612g((byte) 0);

    /* renamed from: g */
    private static Aweme f135969g;

    /* renamed from: b */
    private final C12814b f135970b;

    /* renamed from: c */
    private String f135971c = "";

    /* renamed from: d */
    private Long f135972d;

    /* renamed from: e */
    private final boolean f135973e = MixFeedService.m109435k().mo97325b();

    /* renamed from: f */
    private String f135974f = "";

    /* renamed from: h */
    private SparseArray f135975h;

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$b */
    public static final class C59607b extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59607b INSTANCE = new C59607b();

        static {
            Covode.recordClassIndex(70004);
        }

        public C59607b() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70002);
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

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$g */
    public static final class C59612g {
        static {
            Covode.recordClassIndex(70009);
        }

        private C59612g() {
        }

        public /* synthetic */ C59612g(byte b) {
            this();
        }

        /* renamed from: a */
        private static C59605h m109203a(int i, String str, String str2, Aweme aweme, Long l, String str3) {
            C89219l.m154721d(str3, "");
            C59605h hVar = new C59605h();
            Bundle bundle = new Bundle();
            bundle.putInt("open_edit_fragment_type", i);
            bundle.putString("user_last_name", str);
            bundle.putString("mix_id", str2);
            if (aweme != null) {
                bundle.putSerializable("key_mix_add_aweme_info", aweme);
            }
            if (l != null) {
                l.longValue();
                bundle.putLong("moderated_rename_timestamp", l.longValue());
            }
            bundle.putString("enter_from", str3);
            hVar.setArguments(bundle);
            return hVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C59605h m109204a(int i, String str, String str2, Aweme aweme, Long l, String str3, int i2) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            if ((i2 & 8) != 0) {
                aweme = null;
            }
            if ((i2 & 16) != 0) {
                l = null;
            }
            if ((i2 & 32) != 0) {
                str3 = "";
            }
            return m109203a(i, str, str2, aweme, l, str3);
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

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$c */
    public static final class C59608c extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59608c INSTANCE = new C59608c();

        static {
            Covode.recordClassIndex(70005);
        }

        public C59608c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$f */
    public static final class C59611f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59611f INSTANCE = new C59611f();

        static {
            Covode.recordClassIndex(70008);
        }

        public C59611f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C59619j mo20658e() {
        return new C59619j();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$d */
    public static final class C59609d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135977a;

        static {
            Covode.recordClassIndex(70006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59609d(Fragment fragment) {
            super(0);
            this.f135977a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f135977a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f135975h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$a */
    public static final class C59606a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135976a;

        static {
            Covode.recordClassIndex(70003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59606a(AbstractC89277c cVar) {
            super(0);
            this.f135976a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135976a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$e */
    public static final class C59610e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135978a;

        static {
            Covode.recordClassIndex(70007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59610e(Fragment fragment) {
            super(0);
            this.f135978a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f135978a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public C59605h() {
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        this.f135970b = new C12814b(a, new C59606a(a), C59608c.INSTANCE, new C59609d(this), new C59610e(this), C59611f.INSTANCE, C59607b.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$h */
    static final class C59613h extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59605h f135979a;

        /* renamed from: b */
        final /* synthetic */ View f135980b;

        static {
            Covode.recordClassIndex(70010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59613h(C59605h hVar, View view) {
            super(1);
            this.f135979a = hVar;
            this.f135980b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f135979a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.editname.C59605h.C59613h.C596141 */

                /* renamed from: a */
                final /* synthetic */ C59613h f135981a;

                static {
                    Covode.recordClassIndex(70011);
                }

                {
                    this.f135981a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C59558d.class));
                    qVar2.f31050b = new C59558d();
                    qVar2.f31053e = this.f135981a.f135980b;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$j */
    static final class C59616j extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59605h f135983a;

        /* renamed from: b */
        final /* synthetic */ Context f135984b;

        static {
            Covode.recordClassIndex(70013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59616j(C59605h hVar, Context context) {
            super(1);
            this.f135983a = hVar;
            this.f135984b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = this.f135984b.getString(R.string.bx);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.editname.C59605h.C59616j.C596171 */

                /* renamed from: a */
                final /* synthetic */ C59616j f135985a;

                static {
                    Covode.recordClassIndex(70014);
                }

                {
                    this.f135985a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    ActivityC0945e activity = this.f135985a.f135983a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.h$i */
    static final class C59615i extends AbstractC89220m implements AbstractC89172b<C59619j, C59619j> {

        /* renamed from: a */
        final /* synthetic */ Bundle f135982a;

        static {
            Covode.recordClassIndex(70012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59615i(Bundle bundle) {
            super(1);
            this.f135982a = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59619j invoke(C59619j jVar) {
            if (jVar != null) {
                return new C59619j(this.f135982a.getInt("open_edit_fragment_type"), this.f135982a.getString("user_last_name"), this.f135982a.getString("mix_id"));
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.editname.AbstractC59620k
    /* renamed from: a */
    public final void mo97175a(String str) {
        C89219l.m154721d(str, "");
        AbstractC81915c.m141874a(new C59403c(str, this.f135971c));
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0124;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.editname.C59605h.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C59613h(this, view));
        Long l = this.f135972d;
        if (l != null) {
            long longValue = l.longValue() + TimeUnit.DAYS.toSeconds(1);
            if (System.currentTimeMillis() / 1000 < longValue) {
                String format = new SimpleDateFormat("MMM dd, yyyy hh:mm a", Locale.getDefault()).format(new Date(longValue * 1000));
                C89219l.m154716b(format, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                C23023b bVar = new C23023b(context);
                String string = getString(R.string.gfa);
                C89219l.m154716b(string, "");
                String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{format}, 1));
                C89219l.m154716b(a, "");
                ((C23023b) C23028c.m43435a(bVar.mo37413d(a), new C59616j(this, context)).mo37482a(false)).mo37405a().mo37396b().show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aki, viewGroup, false);
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
