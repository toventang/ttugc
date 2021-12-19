package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3248c;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.AbstractC55147b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.MTSearchHead;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55882d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.C55959a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.C55962c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a.C56085a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.C56147d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.C56163e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.ShareTextBoxViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.C56036b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a */
public final class DialogC56091a extends DialogC26609a implements AbstractC55948b {

    /* renamed from: o */
    public static final C56092a f127919o = new C56092a((byte) 0);

    /* renamed from: a */
    public final boolean f127920a;

    /* renamed from: b */
    final AbstractC1204m f127921b;

    /* renamed from: c */
    public final ShareDialogViewModel f127922c;

    /* renamed from: d */
    final AbstractC89244h f127923d;

    /* renamed from: e */
    public final C55882d f127924e;

    /* renamed from: f */
    final Activity f127925f;

    /* renamed from: j */
    final Set<IMContact> f127926j;

    /* renamed from: k */
    final boolean f127927k;

    /* renamed from: l */
    final AbstractC56263a f127928l;

    /* renamed from: m */
    final boolean f127929m;

    /* renamed from: n */
    final SharePackage f127930n;

    /* renamed from: p */
    private final AbstractC55960b f127931p;

    /* renamed from: q */
    private final C55968c f127932q;

    /* renamed from: r */
    private final C56253f f127933r;

    static {
        Covode.recordClassIndex(65890);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: b */
    public final void mo92817b(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$a */
    public static final class C56092a {
        static {
            Covode.recordClassIndex(65891);
        }

        private C56092a() {
        }

        public /* synthetic */ C56092a(byte b) {
            this();
        }
    }

    public final void show() {
        super.show();
        AbstractC81915c.m141874a(new C33489d(true));
    }

    public final void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.m70897c(view);
        if (!this.f127920a) {
            ((MTSearchHead) findViewById(R.id.drv)).mo92364a();
        }
        super.dismiss();
        AbstractC81915c.m141874a(new C33489d(false));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$b */
    static final /* synthetic */ class C56093b extends C89217j implements AbstractC89171a<C56163e> {
        static {
            Covode.recordClassIndex(65892);
        }

        C56093b(DialogC56091a aVar) {
            super(0, aVar, DialogC56091a.class, "createShareTextBoxComponent", "createShareTextBoxComponent()Lcom/ss/android/ugc/aweme/im/sdk/share/ui/textbox/ShareTextBoxLayoutComponent;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56163e invoke() {
            DialogC56091a aVar = (DialogC56091a) this.receiver;
            Activity activity = aVar.f127925f;
            ShareDialogViewModel shareDialogViewModel = aVar.f127922c;
            AbstractC56263a aVar2 = aVar.f127928l;
            SharePackage sharePackage = aVar.f127930n;
            Set<IMContact> set = aVar.f127926j;
            boolean z = aVar.f127929m;
            boolean z2 = aVar.f127927k;
            AbstractC1204m mVar = aVar.f127921b;
            View findViewById = aVar.findViewById(R.id.dz3);
            if (findViewById == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(activity, "");
            C89219l.m154721d(shareDialogViewModel, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(findViewById, "");
            C1213t<Boolean> tVar = shareDialogViewModel.f128117g;
            LinearLayout linearLayout = (LinearLayout) findViewById.findViewById(R.id.bc6);
            C89219l.m154716b(linearLayout, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) findViewById.findViewById(R.id.a4l);
            C89219l.m154716b(tuxCheckBox, "");
            ShareTextBoxViewModel shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, aVar2, null, aVar, tVar, new C55967b(linearLayout, tuxCheckBox), z);
            return new C56163e(findViewById, shareTextBoxViewModel, set, z2, new C56147d(activity, findViewById, sharePackage, shareTextBoxViewModel, mVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$j */
    static final class C56101j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127943a;

        static {
            Covode.recordClassIndex(65900);
        }

        C56101j(DialogC56091a aVar) {
            this.f127943a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f127943a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: a */
    public final void mo92816a(boolean z) {
        this.f127924e.mo92746a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: c */
    public final void mo92818c(boolean z) {
        this.f127924e.mo92749e(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$c */
    static final class View$OnClickListenerC56094c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127934a;

        static {
            Covode.recordClassIndex(65893);
        }

        View$OnClickListenerC56094c(DialogC56091a aVar) {
            this.f127934a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127934a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$e */
    static final class View$OnClickListenerC56096e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127937a;

        static {
            Covode.recordClassIndex(65895);
        }

        View$OnClickListenerC56096e(DialogC56091a aVar) {
            this.f127937a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127937a.f127922c.f128116f.postValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$h */
    static final class C56099h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127941a;

        static {
            Covode.recordClassIndex(65898);
        }

        C56099h(DialogC56091a aVar) {
            this.f127941a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C80537hk.m139613a((String) obj)) {
                this.f127941a.f127924e.mo92741r();
            } else {
                this.f127941a.f127924e.mo92740q();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$i */
    static final class C56100i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127942a;

        static {
            Covode.recordClassIndex(65899);
        }

        C56100i(DialogC56091a aVar) {
            this.f127942a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f127942a.f127924e.mo92741r();
            this.f127942a.f127924e.mo92314e((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$l */
    static final class C56103l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127945a;

        static {
            Covode.recordClassIndex(65902);
        }

        C56103l(DialogC56091a aVar) {
            this.f127945a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f127945a.dismiss();
            SmartRouter.buildRoute(this.f127945a.getContext(), "//friends/find").withParam("previous_page", "share_page").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$f */
    static final class C56097f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ShareDialogViewModel f127938a;

        /* renamed from: b */
        final /* synthetic */ DialogC56091a f127939b;

        static {
            Covode.recordClassIndex(65896);
        }

        C56097f(ShareDialogViewModel shareDialogViewModel, DialogC56091a aVar) {
            this.f127938a = shareDialogViewModel;
            this.f127939b = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            DialogC56091a aVar = this.f127939b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
            List<IMContact> a = ShareDialogViewModel.m102030a(C89206ad.m154682d(obj));
            aVar.f127924e.mo92740q();
            if (a == null || a.isEmpty()) {
                MTSearchHead mTSearchHead = (MTSearchHead) aVar.findViewById(R.id.drv);
                C89219l.m154716b(mTSearchHead, "");
                mTSearchHead.setVisibility(8);
                return;
            }
            aVar.f127924e.mo92314e(a);
            C55940a.m101782a(aVar.f127930n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$g */
    static final class C56098g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127940a;

        static {
            Covode.recordClassIndex(65897);
        }

        C56098g(DialogC56091a aVar) {
            this.f127940a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            List<? extends IMContact> list = (List) obj;
            Window window = this.f127940a.getWindow();
            if (window != null) {
                view = window.getCurrentFocus();
            } else {
                view = null;
            }
            KeyboardUtils.m70897c(view);
            C56163e eVar = (C56163e) this.f127940a.f127923d.getValue();
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            eVar.f128108a.mo92996a(list);
            if (list.isEmpty()) {
                eVar.mo93012b();
            } else {
                eVar.mo93011a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$k */
    static final class C56102k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56091a f127944a;

        static {
            Covode.recordClassIndex(65901);
        }

        C56102k(DialogC56091a aVar) {
            this.f127944a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View findViewById;
            int i;
            Boolean bool = (Boolean) obj;
            View view = ((AbstractC55875b) this.f127944a.f127924e).f127372b;
            if (view != null && (findViewById = view.findViewById(R.id.chk)) != null) {
                C89219l.m154716b(bool, "");
                if (!bool.booleanValue() || this.f127944a.f127920a) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        List<IMUser> list;
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.m26663i(420);
        super.onCreate(bundle);
        setContentView(R.layout.a6u);
        AbstractC55147b.C55148a aVar = AbstractC55147b.f126186a;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.acd);
        C89219l.m154716b(recyclerView, "");
        aVar.mo92070a(recyclerView, "more_share_dialog");
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            window.setSoftInputMode(16);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.ym;
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ajx);
        BottomSheetBehavior a = BottomSheetBehavior.m52754a(frameLayout);
        if (!(frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        C89219l.m154716b(a, "");
        a.mo43978c(3);
        a.mo43976b(0);
        a.f62894h = true;
        a.f62895i = true;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.clr);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC56094c(this));
        }
        if (C55076b.m100723b().getUnder16Proxy().mo93022d() || C55076b.m100723b().getUnder16Proxy().mo93021c()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.acd);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            TuxStatusView tuxStatusView = (TuxStatusView) findViewById(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            MethodCollector.m26664o(420);
            return;
        }
        if (!this.f127920a) {
            ((MTSearchHead) findViewById(R.id.drv)).setListViewModel(this.f127922c);
        } else {
            MTSearchHead mTSearchHead = (MTSearchHead) findViewById(R.id.drv);
            C89219l.m154716b(mTSearchHead, "");
            mTSearchHead.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            C56253f fVar = this.f127933r;
            if (fVar != null) {
                str = fVar.getPanelTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.acd);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        recyclerView3.setAdapter(this.f127924e);
        recyclerView3.mo4405a(new C56095d(recyclerView3, recyclerView3.getContext(), this));
        View a2 = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a4c, (ViewGroup) findViewById(R.id.acd), false);
        a2.findViewById(R.id.chk).setOnClickListener(new View$OnClickListenerC56096e(this));
        C55882d dVar = this.f127924e;
        C89219l.m154716b(a2, "");
        dVar.mo92737c(a2);
        C55968c cVar = this.f127932q;
        if (cVar != null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C56036b bVar = new C56036b(context, (byte) 0);
            bVar.mo92889a(cVar);
            ((FrameLayout) findViewById(R.id.eid)).addView(bVar);
        }
        this.f127931p.mo92833e();
        ShareDialogViewModel shareDialogViewModel = this.f127922c;
        shareDialogViewModel.f128113c.observe(this.f127921b, new C56097f(shareDialogViewModel, this));
        shareDialogViewModel.f128114d.observe(this.f127921b, new C56098g(this));
        shareDialogViewModel.f128111a.observe(this.f127921b, new C56099h(this));
        shareDialogViewModel.f128112b.observe(this.f127921b, new C56100i(this));
        shareDialogViewModel.f128117g.observe(this.f127921b, new C56101j(this));
        shareDialogViewModel.f128118h.observe(this.f127921b, new C56102k(this));
        shareDialogViewModel.f128116f.observe(this.f127921b, new C56103l(this));
        Set<IMContact> set = this.f127926j;
        if (set != null) {
            this.f127922c.mo93015b(C89070n.m154590j(set));
        }
        if (this.f127920a) {
            ShareDialogViewModel shareDialogViewModel2 = this.f127922c;
            C56253f fVar2 = this.f127933r;
            if (fVar2 == null || (list = fVar2.getBatchContacts()) == null) {
                list = C89086z.INSTANCE;
            }
            shareDialogViewModel2.mo93015b(list);
        }
        shareDialogViewModel.mo93014a(0);
        shareDialogViewModel.mo93018d();
        TuxStatusView tuxStatusView2 = (TuxStatusView) findViewById(R.id.e7i);
        C89219l.m154716b(tuxStatusView2, "");
        new C56085a(tuxStatusView2, this.f127925f, this.f127922c, this.f127921b);
        MethodCollector.m26664o(420);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.c.a$d */
    public static final class C56095d extends C51425a {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f127935a;

        /* renamed from: b */
        final /* synthetic */ DialogC56091a f127936b;

        static {
            Covode.recordClassIndex(65894);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            View view;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 1) {
                Window window = this.f127936b.getWindow();
                if (window != null) {
                    view = window.getCurrentFocus();
                } else {
                    view = null;
                }
                KeyboardUtils.m70897c(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56095d(RecyclerView recyclerView, Context context, DialogC56091a aVar) {
            super(context);
            this.f127935a = recyclerView;
            this.f127936b = aVar;
        }
    }

    public /* synthetic */ DialogC56091a(Activity activity, Set set, boolean z, AbstractC56263a aVar, boolean z2, SharePackage sharePackage, C55968c cVar) {
        this(activity, set, z, aVar, z2, sharePackage, cVar, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Set<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC56091a(Activity activity, Set<? extends IMContact> set, boolean z, AbstractC56263a aVar, boolean z2, SharePackage sharePackage, C55968c cVar, C56253f fVar) {
        super(activity, R.style.ys);
        boolean z3;
        AbstractC55960b aVar2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(sharePackage, "");
        this.f127925f = activity;
        this.f127926j = set;
        this.f127927k = z;
        this.f127928l = aVar;
        this.f127929m = z2;
        this.f127930n = sharePackage;
        this.f127932q = cVar;
        this.f127933r = fVar;
        if (fVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f127920a = z3;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.f127921b = (ActivityC0218d) activity;
        List<IMUser> list = (fVar == null || (list = fVar.getBatchContacts()) == null) ? C89086z.INSTANCE : list;
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            aVar2 = C55962c.C55963a.m101844a(null, false, null);
        } else {
            aVar2 = new C55959a(list);
        }
        this.f127931p = aVar2;
        ShareDialogViewModel shareDialogViewModel = new ShareDialogViewModel(sharePackage, aVar2);
        this.f127922c = shareDialogViewModel;
        this.f127923d = C89250i.m154773a((AbstractC89171a) new C56093b(this));
        this.f127924e = new C55882d(sharePackage, shareDialogViewModel, false, z3);
        AbstractC55147b.f126186a.mo92071a("more_share_dialog");
    }
}
