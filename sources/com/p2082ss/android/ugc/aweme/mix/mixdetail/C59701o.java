package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.p1615s.p1616a.C22112a;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59857d;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.p2082ss.android.ugc.aweme.mix.model.C59865b;
import com.p2082ss.android.ugc.aweme.mix.model.C59866c;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59403c;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59406f;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59407g;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59410j;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
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
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o */
public final class C59701o extends Fragment implements AbstractC12846h, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C59708g f136085i = new C59708g((byte) 0);

    /* renamed from: a */
    public Aweme f136086a;

    /* renamed from: b */
    public String f136087b = "";

    /* renamed from: c */
    public String f136088c = "";

    /* renamed from: d */
    public String f136089d = "";

    /* renamed from: e */
    public boolean f136090e = true;

    /* renamed from: f */
    public int f136091f;

    /* renamed from: g */
    public String f136092g = "";

    /* renamed from: h */
    public Long f136093h;

    /* renamed from: j */
    private final C12814b f136094j;

    /* renamed from: k */
    private String f136095k = "";

    /* renamed from: l */
    private String f136096l = "";

    /* renamed from: m */
    private String f136097m = "";

    /* renamed from: n */
    private TuxNavBar.C23179a f136098n;

    /* renamed from: o */
    private SparseArray f136099o;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$b */
    public static final class C59703b extends AbstractC89220m implements AbstractC89172b<C59857d, C59857d> {
        public static final C59703b INSTANCE = new C59703b();

        static {
            Covode.recordClassIndex(70104);
        }

        public C59703b() {
            super(1);
        }

        public final C59857d invoke(C59857d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(70102);
    }

    /* renamed from: a */
    public final View mo97206a(int i) {
        if (this.f136099o == null) {
            this.f136099o = new SparseArray();
        }
        View view = (View) this.f136099o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f136099o.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MixVideosViewModel mo97207a() {
        return (MixVideosViewModel) this.f136094j.getValue();
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
        hashMap.put(321, new RunnableC90250g(C59701o.class, "onMixNameChangeEvent", C59403c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(322, new RunnableC90250g(C59701o.class, "onMixDeleteEvent", C59406f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(323, new RunnableC90250g(C59701o.class, "onMixManageEvent", C59407g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$g */
    public static final class C59708g {
        static {
            Covode.recordClassIndex(70109);
        }

        private C59708g() {
        }

        public /* synthetic */ C59708g(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$c */
    public static final class C59704c extends AbstractC89220m implements AbstractC89171a<C12874b<C59857d>> {
        public static final C59704c INSTANCE = new C59704c();

        static {
            Covode.recordClassIndex(70105);
        }

        public C59704c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59857d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$f */
    public static final class C59707f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59707f INSTANCE = new C59707f();

        static {
            Covode.recordClassIndex(70108);
        }

        public C59707f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$d */
    public static final class C59705d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136101a;

        static {
            Covode.recordClassIndex(70106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59705d(Fragment fragment) {
            super(0);
            this.f136101a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f136101a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$a */
    public static final class C59702a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136100a;

        static {
            Covode.recordClassIndex(70103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59702a(AbstractC89277c cVar) {
            super(0);
            this.f136100a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136100a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$e */
    public static final class C59706e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136102a;

        static {
            Covode.recordClassIndex(70107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59706e(Fragment fragment) {
            super(0);
            this.f136102a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f136102a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$i */
    static final class C59710i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136104a;

        static {
            Covode.recordClassIndex(70111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59710i(C59701o oVar) {
            super(0);
            this.f136104a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.f136104a
                androidx.fragment.app.e r0 = r0.getActivity()
                boolean r0 = r0 instanceof com.p2082ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity
                if (r0 != 0) goto L_0x0013
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.f136104a
                com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r0 = r0.mo97207a()
                r0.mo97242m()
            L_0x0013:
                com.ss.android.ugc.aweme.mix.mixdetail.o r1 = r2.f136104a
                r0 = 0
                r1.f136090e = r0
                com.ss.android.ugc.aweme.mix.mixdetail.o r0 = r2.f136104a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.C59710i.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!(getActivity() instanceof MixVideoDetailActivity)) {
            mo97207a().mo97242m();
        }
        this.f136090e = false;
        SparseArray sparseArray = this.f136099o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$o */
    static final class C59716o extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136110a;

        static {
            Covode.recordClassIndex(70117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59716o(C59701o oVar) {
            super(2);
            this.f136110a = oVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$o$a */
        static final class RunnableC59717a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ RecyclerView.AbstractC1362i f136111a;

            /* renamed from: b */
            final /* synthetic */ C59716o f136112b;

            /* renamed from: c */
            final /* synthetic */ AbstractC22876d f136113c;

            static {
                Covode.recordClassIndex(70118);
            }

            RunnableC59717a(RecyclerView.AbstractC1362i iVar, C59716o oVar, AbstractC22876d dVar) {
                this.f136111a = iVar;
                this.f136112b = oVar;
                this.f136113c = dVar;
            }

            public final void run() {
                int i = this.f136112b.f136110a.f136091f;
                double b = (double) C13628n.m24520b(this.f136112b.f136110a.getContext(), 101.0f);
                Double.isNaN(b);
                ((LinearLayoutManager) this.f136111a).mo4347a(i, (int) (b * 1.5d));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.tiktok.proxy.AbstractC22876d r22, com.bytedance.assem.arch.extensions.C12776a<? extends com.p2082ss.android.ugc.aweme.feed.model.Aweme> r23) {
            /*
            // Method dump skipped, instructions count: 425
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.C59716o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C59701o() {
        AbstractC89277c a = C89204ab.m154669a(MixVideosViewModel.class);
        this.f136094j = new C12814b(a, new C59702a(a), C59704c.INSTANCE, new C59705d(this), new C59706e(this), C59707f.INSTANCE, C59703b.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$k */
    static final class C59712k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136106a;

        static {
            Covode.recordClassIndex(70113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59712k(C59701o oVar) {
            super(0);
            this.f136106a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Aweme aweme;
            int i;
            C59701o oVar = this.f136106a;
            Context context = oVar.getContext();
            if ((context instanceof ActivityC0945e) && (aweme = oVar.f136086a) != null) {
                C89219l.m154721d(aweme, "");
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_current_aweme", aweme);
                C59697n nVar = new C59697n();
                nVar.setArguments(bundle);
                C23226a.C23227a a = new C23226a.C23227a().mo37812a(1);
                Resources resources = context.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                a.mo37821b((int) (((float) i) * 0.2f)).mo37817a(nVar).f55057a.show(((ActivityC0945e) context).getSupportFragmentManager(), "MixOptionsDialog");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$j */
    static final class C59711j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136105a;

        static {
            Covode.recordClassIndex(70112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59711j(C59701o oVar) {
            super(0);
            this.f136105a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0099, code lost:
            if (r1 == null) goto L_0x009b;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.C59711j.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$n */
    public static final class C59715n extends C22112a {

        /* renamed from: a */
        final /* synthetic */ C59701o f136109a;

        static {
            Covode.recordClassIndex(70116);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59715n(C59701o oVar) {
            this.f136109a = oVar;
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36298a(Exception exc) {
            super.mo36298a(exc);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f136109a.mo97206a(R.id.e7i);
            if (dmtStatusView != null) {
                dmtStatusView.mo27387h();
            }
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36299a(boolean z) {
            super.mo36299a(z);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f136109a.mo97206a(R.id.e7i);
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$r */
    public static final class DialogInterface$OnDismissListenerC59720r implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C59701o f136116a;

        static {
            Covode.recordClassIndex(70121);
        }

        public DialogInterface$OnDismissListenerC59720r(C59701o oVar) {
            this.f136116a = oVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C59330a.m109029a(this.f136116a.f136086a, this.f136116a.f136087b, this.f136116a.f136089d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$h */
    static final class View$OnClickListenerC59709h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59701o f136103a;

        static {
            Covode.recordClassIndex(70110);
        }

        View$OnClickListenerC59709h(C59701o oVar) {
            this.f136103a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C59701o oVar = this.f136103a;
            if (oVar.f136087b != null) {
                MixVideosViewModel a = oVar.mo97207a();
                Aweme aweme = oVar.f136086a;
                String str = oVar.f136087b;
                if (str == null) {
                    C89219l.m154715b();
                }
                a.mo97232a(aweme, str);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
    @org.greenrobot.eventbus.AbstractC90264r(mo145422a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMixManageEvent(com.p2082ss.android.ugc.aweme.mix.p3447b.C59407g r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            androidx.fragment.app.e r0 = r1.getActivity()
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
            if (r0 == 0) goto L_0x0017
            androidx.fragment.app.e r0 = r1.getActivity()
            if (r0 == 0) goto L_0x0016
            r0.finish()
        L_0x0016:
            return
        L_0x0017:
            r0 = r1
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.onMixManageEvent(com.ss.android.ugc.aweme.mix.b.g):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$v */
    static final class C59724v extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136120a;

        static {
            Covode.recordClassIndex(70125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59724v(C59701o oVar) {
            super(1);
            this.f136120a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            CharSequence text = this.f136120a.getText(R.string.b51);
            C89219l.m154716b(text, "");
            bVar2.mo37421c(text, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.C59724v.C597251 */

                /* renamed from: a */
                final /* synthetic */ C59724v f136121a;

                static {
                    Covode.recordClassIndex(70126);
                }

                {
                    this.f136121a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C59330a.m109033a(this.f136121a.f136120a.f136087b, this.f136121a.f136120a.f136089d);
                    this.f136121a.f136120a.mo97207a().mo23343h();
                    return C89391z.f203057a;
                }
            });
            CharSequence text2 = this.f136120a.getText(R.string.a8y);
            C89219l.m154716b(text2, "");
            bVar2.mo37419b(text2, C597262.f136122a);
            return C89391z.f203057a;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
    @org.greenrobot.eventbus.AbstractC90264r(mo145422a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMixDeleteEvent(com.p2082ss.android.ugc.aweme.mix.p3447b.C59406f r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            java.lang.String r0 = r4.f135704b
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r1 = r3.f136087b
            java.lang.String r0 = r4.f135704b
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f135703a
            if (r0 == 0) goto L_0x0024
            r2 = 0
            r0.playlist_info = r2
            com.ss.android.ugc.aweme.mix.b.j r1 = new com.ss.android.ugc.aweme.mix.b.j
            r0 = 0
            r1.<init>(r0, r2)
            com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r1)
        L_0x0024:
            r0 = r3
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.C59701o.onMixDeleteEvent(com.ss.android.ugc.aweme.mix.b.f):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$s */
    static final class View$OnClickListenerC59721s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59701o f136117a;

        static {
            Covode.recordClassIndex(70122);
        }

        View$OnClickListenerC59721s(C59701o oVar) {
            this.f136117a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("edit_playlist", new C33744d().mo59983a("enter_from", this.f136117a.f136089d).mo59983a("playlist_id", this.f136117a.f136087b).f79943a);
            Bundle bundle = new Bundle();
            bundle.putString("key_mix_id", this.f136117a.f136087b);
            bundle.putString("key_mix_name", this.f136117a.f136088c);
            bundle.putString("enter_from", this.f136117a.f136089d);
            IMixFeedService k = MixFeedService.m109435k();
            ActivityC0945e activity = this.f136117a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            k.mo97311a(activity, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$t */
    static final class View$OnClickListenerC59722t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59701o f136118a;

        static {
            Covode.recordClassIndex(70123);
        }

        View$OnClickListenerC59722t(C59701o oVar) {
            this.f136118a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f136118a.getContext();
            if (context != null) {
                IMixFeedService k = MixFeedService.m109435k();
                C89219l.m154716b(context, "");
                k.mo97313a(context, new Bundle(), this.f136118a.f136088c, this.f136118a.f136087b, this.f136118a.f136093h, this.f136118a.f136089d);
                C59330a.m109040d(this.f136118a.f136089d, "manage_video");
                C39162r.m79460a("rename_playlist", new C33744d().mo59983a("enter_from", this.f136118a.f136089d).mo59983a("enter_method", "manage_video").mo59983a("playlist_id", this.f136118a.f136087b).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$u */
    static final class View$OnClickListenerC59723u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59701o f136119a;

        static {
            Covode.recordClassIndex(70124);
        }

        View$OnClickListenerC59723u(C59701o oVar) {
            this.f136119a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C59701o oVar = this.f136119a;
            Context context = oVar.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C23023b bVar = new C23023b(context);
            Context context2 = oVar.getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            C23028c.m43435a((C23023b) bVar.mo37411b(context2.getString(R.string.b5h, oVar.f136088c)).mo37483b(R.string.b5i), new C59724v(oVar)).mo37405a().mo37396b().show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String string;
        MixStruct mixInfo;
        super.onCreate(bundle);
        this.f136091f = 0;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_positioned_aweme");
        } else {
            serializable = null;
        }
        Aweme aweme = (Aweme) serializable;
        this.f136086a = aweme;
        String str7 = "";
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = str7;
        }
        this.f136092g = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("key_mix_id", str7)) == null) {
            str2 = str7;
        }
        this.f136087b = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("key_mix_name", str7)) == null) {
            str3 = str7;
        }
        this.f136088c = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str4 = arguments4.getString("key_video_from", str7)) == null) {
            str4 = str7;
        }
        this.f136097m = str4;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str5 = arguments5.getString("key_mix_uid", str7)) == null) {
            str5 = str7;
        }
        this.f136095k = str5;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str6 = arguments6.getString("key_mix_secuid", str7)) == null) {
            str6 = str7;
        }
        this.f136096l = str6;
        Aweme aweme2 = this.f136086a;
        if (aweme2 != null) {
            String authorUid = aweme2.getAuthorUid();
            if (authorUid == null) {
                authorUid = str7;
            }
            this.f136095k = authorUid;
            String secAuthorUid = aweme2.getSecAuthorUid();
            if (secAuthorUid == null) {
                secAuthorUid = str7;
            }
            this.f136096l = secAuthorUid;
        }
        MixVideosViewModel a = mo97207a();
        String str8 = this.f136095k;
        if (str8 == null) {
            str8 = str7;
        }
        a.f136239u = str8;
        MixVideosViewModel a2 = mo97207a();
        String str9 = this.f136096l;
        if (str9 == null) {
            str9 = str7;
        }
        a2.f136240v = str9;
        Aweme aweme3 = this.f136086a;
        if (!(aweme3 == null || (mixInfo = aweme3.getMixInfo()) == null)) {
            String str10 = mixInfo.mixName;
            C89219l.m154716b(str10, str7);
            this.f136088c = str10;
        }
        Bundle arguments7 = getArguments();
        if (!(arguments7 == null || (string = arguments7.getString("key_mix_dialog_enter_from", str7)) == null)) {
            str7 = string;
        }
        this.f136089d = str7;
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onMixNameChangeEvent(C59403c cVar) {
        String str;
        PlayListInfo playListInfo;
        String str2;
        UrlModel urlModel;
        String str3;
        C59865b bVar;
        C89219l.m154721d(cVar, "");
        if (C89219l.m154714a((Object) this.f136087b, (Object) cVar.f135696b)) {
            MixVideosViewModel a = mo97207a();
            String str4 = cVar.f135695a;
            String str5 = cVar.f135696b;
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C59867d dVar = ((C59857d) a.mo20671d().mo20680a()).f136339g;
            C59866c cVar2 = null;
            if (dVar != null) {
                str = dVar.mixId;
            } else {
                str = null;
            }
            int i = 0;
            if (C89361p.m154872a(str, str5, false)) {
                C59867d dVar2 = new C59867d();
                C59857d dVar3 = (C59857d) a.mo20671d().mo20680a();
                C59867d dVar4 = dVar3.f136339g;
                if (dVar4 != null) {
                    str2 = dVar4.mixId;
                } else {
                    str2 = null;
                }
                dVar2.mixId = str2;
                dVar2.setMixName(str4);
                C59867d dVar5 = dVar3.f136339g;
                if (dVar5 != null) {
                    urlModel = dVar5.icon;
                } else {
                    urlModel = null;
                }
                dVar2.icon = urlModel;
                C59867d dVar6 = dVar3.f136339g;
                if (dVar6 != null) {
                    str3 = dVar6.extra;
                } else {
                    str3 = null;
                }
                dVar2.extra = str3;
                C59867d dVar7 = dVar3.f136339g;
                if (dVar7 != null) {
                    bVar = dVar7.statis;
                } else {
                    bVar = null;
                }
                dVar2.statis = bVar;
                C59867d dVar8 = dVar3.f136339g;
                if (dVar8 != null) {
                    i = dVar8.mixType;
                }
                dVar2.mixType = i;
                C59867d dVar9 = dVar3.f136339g;
                if (dVar9 != null) {
                    cVar2 = dVar9.status;
                }
                dVar2.status = cVar2;
                a.mo20662a(new MixVideosViewModel.C59802aa(dVar2));
                a.mo20667b(new MixVideosViewModel.C59803ab(str5, str4));
            }
            Aweme aweme = this.f136086a;
            if (!(aweme == null || (playListInfo = aweme.playlist_info) == null)) {
                playListInfo.setMixName(cVar.f135695a);
            }
            new C23144b(this).mo37640e(R.string.gft).mo37637b();
            AbstractC81915c.m141874a(new C59410j(true, this.f136086a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$q */
    static final class C59719q extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136115a;

        static {
            Covode.recordClassIndex(70120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59719q(C59701o oVar) {
            super(2);
            this.f136115a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(dVar, "");
            if (intValue == 1) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f136115a.mo97206a(R.id.e7i);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
            } else if (intValue == 3) {
                ((DmtStatusView) this.f136115a.mo97206a(R.id.e7i)).mo27385g();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$l */
    static final class C59713l extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C59867d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136107a;

        static {
            Covode.recordClassIndex(70114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59713l(C59701o oVar) {
            super(2);
            this.f136107a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C59867d dVar2) {
            C59867d dVar3 = dVar2;
            C89219l.m154721d(dVar, "");
            if (dVar3 != null) {
                C59701o oVar = this.f136107a;
                String mixName = dVar3.getMixName();
                C89219l.m154716b(mixName, "");
                oVar.f136088c = mixName;
                ((TuxNavBar) this.f136107a.mo97206a(R.id.cpv)).mo37725a(new C23194g().mo37753a(dVar3.getMixName() + " (" + dVar3.statis.total + ')'));
                this.f136107a.f136093h = Long.valueOf(dVar3.moderatedRenameTimestamp);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$m */
    static final class C59714m extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136108a;

        static {
            Covode.recordClassIndex(70115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59714m(C59701o oVar) {
            super(2);
            this.f136108a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (aVar2 != null) {
                if (!aVar2.f31085a.booleanValue()) {
                    new C23144b(this.f136108a).mo37640e(R.string.fz3).mo37637b();
                } else if (!(this.f136108a.getActivity() instanceof MixVideoDetailActivity)) {
                    ActivityC0945e activity = this.f136108a.getActivity();
                    if (activity != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37632a().mo37640e(R.string.gfv).mo37637b();
                    }
                    AbstractC81915c.m141874a(new C59406f(this.f136108a.f136086a, this.f136108a.f136087b));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.o$p */
    static final class C59718p extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59701o f136114a;

        static {
            Covode.recordClassIndex(70119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59718p(C59701o oVar) {
            super(2);
            this.f136114a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(dVar, "");
            if (list2 != null) {
                PowerList powerList = (PowerList) this.f136114a.mo97206a(R.id.d54);
                C89219l.m154716b(powerList, "");
                C17656f<AbstractC17641a> state = powerList.getState();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C59774b(it.next()));
                }
                state.mo28138b(arrayList);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext()).mo27401a(R.string.fz3, new View$OnClickListenerC59709h(this));
        a.f41304g = 0;
        ((DmtStatusView) mo97206a(R.id.e7i)).setBuilder(a);
        this.f136090e = true;
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        this.f136098n = aVar;
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark);
        a2.f54930b = true;
        aVar.mo37732a(a2.mo37741a((AbstractC89171a<C89391z>) new C59710i(this)));
        String str = this.f136095k;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        if (C89361p.m154872a(str, curUser.getUid(), false)) {
            C23187b a3 = new C23187b().mo37738a(R.raw.icon_ellipsis_horizontal);
            a3.f54930b = true;
            aVar.mo37733b(a3.mo37741a((AbstractC89171a<C89391z>) new C59711j(this)));
        } else {
            C23187b a4 = new C23187b().mo37738a(R.raw.icon_ellipsis_horizontal);
            a4.f54930b = true;
            aVar.mo37733b(a4.mo37741a((AbstractC89171a<C89391z>) new C59712k(this)));
        }
        aVar.mo37731a(new C23194g().mo37753a(this.f136088c));
        AbstractC12818f.C12819a.m23063a(this, mo97207a(), C59727p.f136123a, (C12854k) null, new C59713l(this), 6);
        TuxNavBar tuxNavBar = (TuxNavBar) mo97206a(R.id.cpv);
        TuxNavBar.C23179a aVar2 = this.f136098n;
        if (aVar2 == null) {
            C89219l.m154710a("navActions");
        }
        tuxNavBar.setNavActions(aVar2);
        ((TuxNavBar) mo97206a(R.id.cpv)).mo37727a(true);
        if (!C59632b.m109217a()) {
            C80330da.C80331a.m139266a("mix_video_dialog").mo123698a((RecyclerView) mo97206a(R.id.d54));
        }
        ((PowerList) mo97206a(R.id.d54)).mo28083a(MixFeedCell.class);
        ((PowerList) mo97206a(R.id.d54)).mo28082a(mo97207a().mo23342g());
        ((RecyclerView) mo97206a(R.id.d54)).mo4402a(new C59631a());
        ((PowerList) mo97206a(R.id.d54)).mo28081a(new C59715n(this));
        AbstractC12818f.C12819a.m23063a(this, mo97207a(), C59728q.f136124a, C12856l.m23100a(), new C59716o(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo97207a(), C59729r.f136125a, C12856l.m23100a(), new C59718p(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo97207a(), C59730s.f136126a, (C12854k) null, new C59719q(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo97207a(), C59731t.f136127a, C12856l.m23100a(), new C59714m(this), 4);
        mo97207a().mo97232a(this.f136086a, this.f136087b);
        DmtStatusView dmtStatusView = (DmtStatusView) mo97206a(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
        ((DmtStatusView) mo97206a(R.id.e7i)).mo27384f();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.akn, viewGroup, false);
        if (a == null) {
            C89219l.m154715b();
        }
        return a;
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
