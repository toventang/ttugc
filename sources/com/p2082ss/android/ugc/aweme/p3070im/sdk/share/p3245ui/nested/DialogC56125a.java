package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.AbstractC55147b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.C55329b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55882d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.C55962c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.ShareNestedLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a.C56085a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3247b.C56090a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.C56145c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.C56147d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox.ShareTextBoxViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.C56271c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a */
public final class DialogC56125a extends Dialog implements AbstractC55948b {

    /* renamed from: h */
    public static final C56126a f128009h = new C56126a((byte) 0);

    /* renamed from: a */
    final SharePackage f128010a;

    /* renamed from: b */
    final AbstractC1204m f128011b;

    /* renamed from: c */
    public final ShareDialogViewModel f128012c;

    /* renamed from: d */
    public final C55882d f128013d;

    /* renamed from: e */
    final AbstractC89244h f128014e;

    /* renamed from: f */
    final Activity f128015f;

    /* renamed from: g */
    final AbstractC56264b f128016g;

    /* renamed from: i */
    private boolean f128017i;

    /* renamed from: j */
    private final AbstractC55960b f128018j;

    /* renamed from: k */
    private final AbstractC89244h f128019k = C89250i.m154773a((AbstractC89171a) new C56127b(this));

    /* renamed from: l */
    private final C56271c f128020l;

    /* renamed from: m */
    private final C69684e f128021m;

    static {
        Covode.recordClassIndex(65925);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C56145c mo92989a() {
        return (C56145c) this.f128019k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$a */
    public static final class C56126a {
        static {
            Covode.recordClassIndex(65926);
        }

        private C56126a() {
        }

        public /* synthetic */ C56126a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$c */
    static final class C56128c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128022a;

        static {
            Covode.recordClassIndex(65928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56128c(DialogC56125a aVar) {
            super(0);
            this.f128022a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C1764a.m5927a(LayoutInflater.from(this.f128022a.getContext()), R.layout.a7k, (ViewGroup) this.f128022a.findViewById(R.id.dyj), false);
        }
    }

    /* renamed from: b */
    private static boolean m102002b() {
        if (C55076b.m100723b().getUnder16Proxy().mo93022d() || C55076b.m100723b().getUnder16Proxy().mo93021c()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$b */
    static final /* synthetic */ class C56127b extends C89217j implements AbstractC89171a<C56145c> {
        static {
            Covode.recordClassIndex(65927);
        }

        C56127b(DialogC56125a aVar) {
            super(0, aVar, DialogC56125a.class, "createShareTextBubbleComponent", "createShareTextBubbleComponent()Lcom/ss/android/ugc/aweme/im/sdk/share/ui/textbox/ShareTextBoxBubbleComponent;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56145c invoke() {
            DialogC56125a aVar = (DialogC56125a) this.receiver;
            Activity activity = aVar.f128015f;
            ShareDialogViewModel shareDialogViewModel = aVar.f128012c;
            ShareNestedLayout shareNestedLayout = (ShareNestedLayout) aVar.findViewById(R.id.dyj);
            C89219l.m154716b(shareNestedLayout, "");
            SharePackage sharePackage = aVar.f128010a;
            AbstractC56264b bVar = aVar.f128016g;
            AbstractC1204m mVar = aVar.f128011b;
            View view = (View) aVar.f128014e.getValue();
            C89219l.m154721d(activity, "");
            C89219l.m154721d(shareDialogViewModel, "");
            C89219l.m154721d(shareNestedLayout, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(view, "");
            C1213t<Boolean> tVar = shareDialogViewModel.f128117g;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bc6);
            C89219l.m154716b(linearLayout, "");
            TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.a4l);
            C89219l.m154716b(tuxCheckBox, "");
            ShareTextBoxViewModel shareTextBoxViewModel = new ShareTextBoxViewModel(sharePackage, bVar, aVar, tVar, new C55967b(linearLayout, tuxCheckBox));
            return new C56145c(shareNestedLayout, view, shareTextBoxViewModel, new C56147d(activity, view, sharePackage, shareTextBoxViewModel, mVar));
        }
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
        C55329b bVar = mo92989a().f128070a;
        if (bVar != null) {
            bVar.mo92396a(0);
        }
        C55232u.f126318a.clear();
        if (this.f128015f.isDestroyed() || this.f128015f.isFinishing()) {
            C56244a.m102193e("nested_share_dialog", "Dialog is dismissed after activity terminated, isDestroyed: " + this.f128015f.isDestroyed() + ", isFinishing: " + this.f128015f.isFinishing() + ", host activity: " + this.f128015f.getLocalClassName());
        } else {
            super.dismiss();
        }
        AbstractC69690f fVar = this.f128021m.f155560l;
        if (fVar != null) {
            fVar.mo60845a(this.f128010a, this.f128015f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: b */
    public final void mo92817b(boolean z) {
        this.f128017i = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$j */
    static final class C56135j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128031a;

        static {
            Covode.recordClassIndex(65935);
        }

        C56135j(DialogC56125a aVar) {
            this.f128031a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128031a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: a */
    public final void mo92816a(boolean z) {
        this.f128013d.mo92746a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: c */
    public final void mo92818c(boolean z) {
        this.f128013d.mo92749e(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$d */
    static final class View$OnClickListenerC56129d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128023a;

        static {
            Covode.recordClassIndex(65929);
        }

        View$OnClickListenerC56129d(DialogC56125a aVar) {
            this.f128023a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128023a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$g */
    static final class C56132g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128027a;

        static {
            Covode.recordClassIndex(65932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56132g(DialogC56125a aVar) {
            super(1);
            this.f128027a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f128027a.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$f */
    static final class View$OnClickListenerC56131f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128026a;

        static {
            Covode.recordClassIndex(65931);
        }

        View$OnClickListenerC56131f(DialogC56125a aVar) {
            this.f128026a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128026a.f128012c.f128116f.postValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$l */
    static final class C56137l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128033a;

        static {
            Covode.recordClassIndex(65937);
        }

        C56137l(DialogC56125a aVar) {
            this.f128033a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128033a.dismiss();
            SmartRouter.buildRoute(this.f128033a.getContext(), "//friends/find").withParam("previous_page", "share_page").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$m */
    static final class C56138m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128034a;

        static {
            Covode.recordClassIndex(65938);
        }

        C56138m(DialogC56125a aVar) {
            this.f128034a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View findViewById;
            int i;
            Boolean bool = (Boolean) obj;
            View view = ((AbstractC55875b) this.f128034a.f128013d).f127372b;
            if (view != null && (findViewById = view.findViewById(R.id.chk)) != null) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$h */
    static final class C56133h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ShareDialogViewModel f128028a;

        /* renamed from: b */
        final /* synthetic */ DialogC56125a f128029b;

        static {
            Covode.recordClassIndex(65933);
        }

        C56133h(ShareDialogViewModel shareDialogViewModel, DialogC56125a aVar) {
            this.f128028a = shareDialogViewModel;
            this.f128029b = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            if (r0 < r3) goto L_0x0040;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a r5 = r6.f128029b
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r7, r0)
                p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
                boolean r0 = com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c.m102111a()
                if (r0 == 0) goto L_0x0053
                java.util.List r0 = p4600h.p4611f.p4613b.C89206ad.m154682d(r7)
                java.util.List r4 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i.m100954a(r0)
            L_0x001a:
                r3 = 0
                if (r4 == 0) goto L_0x0023
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x0024
            L_0x0023:
                return
            L_0x0024:
                r2 = 15
                java.util.List r0 = p4600h.p4601a.C89070n.m154571d(r4, r2)
                java.util.List r1 = p4600h.p4601a.C89070n.m154585g(r0)
                int r0 = r4.size()
                if (r0 > r2) goto L_0x0040
                int r0 = r4.size()
                if (r7 == 0) goto L_0x003e
                int r3 = r7.size()
            L_0x003e:
                if (r0 >= r3) goto L_0x0048
            L_0x0040:
                com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a r0 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a
                r0.<init>()
                r1.add(r0)
            L_0x0048:
                com.ss.android.ugc.aweme.im.sdk.relations.ui.a.d r0 = r5.f128013d
                r0.mo92314e(r1)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r5.f128010a
                com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a.m101782a(r0)
                goto L_0x0023
            L_0x0053:
                r4 = r7
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.DialogC56125a.C56133h.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$k */
    static final class C56136k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128032a;

        static {
            Covode.recordClassIndex(65936);
        }

        C56136k(DialogC56125a aVar) {
            this.f128032a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            HashSet hashSet;
            this.f128032a.dismiss();
            DialogC56125a aVar = this.f128032a;
            aVar.f128010a.f155492i.putString("enter_method", "more");
            Activity activity = aVar.f128015f;
            List<IMContact> value = aVar.f128012c.f128114d.getValue();
            if (value != null) {
                hashSet = C89070n.m154589i((Iterable) value);
            } else {
                hashSet = null;
            }
            C56090a.m101988a(activity, aVar.f128010a, (Set) hashSet, false, (AbstractC56263a) null, false, (C55968c) null, 244).show();
            AbstractC56264b bVar = aVar.f128016g;
            if (bVar != null) {
                bVar.mo90147a("chat_merge", aVar.f128010a);
            }
            C55059b.m100687a(aVar.f128010a, "button");
            C55708a.m101453a(C55708a.f127082a, aVar.f128010a, null, true, null, 0, null, null, 120);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo92990d(boolean z) {
        int i;
        if (!z) {
            i = 0;
        } else if (this.f128017i) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 180.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            i = a + C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
        } else {
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            i = C89241a.m154730a(TypedValue.applyDimension(1, 180.0f, system3.getDisplayMetrics()));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.acd);
        C89219l.m154716b(recyclerView, "");
        int paddingLeft = recyclerView.getPaddingLeft();
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.acd);
        C89219l.m154716b(recyclerView2, "");
        int paddingTop = recyclerView2.getPaddingTop();
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.acd);
        C89219l.m154716b(recyclerView3, "");
        int paddingRight = recyclerView3.getPaddingRight();
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        ((RecyclerView) findViewById(R.id.acd)).setPadding(paddingLeft, paddingTop, paddingRight, i + C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics())));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$i */
    static final class C56134i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DialogC56125a f128030a;

        static {
            Covode.recordClassIndex(65934);
        }

        C56134i(DialogC56125a aVar) {
            this.f128030a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            int i;
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            MethodCollector.m26663i(5777);
            List<? extends IMContact> list = (List) obj;
            DialogC56125a aVar = this.f128030a;
            C89219l.m154716b(list, "");
            C56145c a = aVar.mo92989a();
            C89219l.m154721d(list, "");
            a.f128073d.mo92996a(list);
            if (!list.isEmpty()) {
                if (a.f128070a == null) {
                    a.f128072c.setVisibility(0);
                    C55329b.C55334a aVar2 = new C55329b.C55334a();
                    aVar2.f126543f = a.f128071b;
                    aVar2.f126542e = a.f128072c;
                    aVar2.f126538a = 2;
                    aVar2.f126539b = 0;
                    aVar2.f126540c = 0;
                    aVar2.f126541d = 0;
                    if (aVar2.f126542e == null) {
                        RuntimeException runtimeException = new RuntimeException("BubbleView cannot be null!!!");
                        MethodCollector.m26664o(5777);
                        throw runtimeException;
                    } else if (aVar2.f126543f != null) {
                        C55329b bVar = new C55329b(aVar2.f126542e, aVar2.f126543f, aVar2.f126544g, aVar2.f126545h, aVar2.f126538a, aVar2.f126539b, aVar2.f126540c, aVar2.f126541d, (byte) 0);
                        bVar.f126525k = aVar2.f126546i;
                        bVar.f126526l = aVar2.f126547j;
                        if (bVar.f126526l && bVar.f126527m == null) {
                            bVar.f126527m = new FrameLayout(bVar.f126523i.getContext());
                            bVar.f126527m.setOnClickListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008b: INVOKE  
                                  (wrap: android.view.View : 0x0084: IGET  (r6v3 android.view.View) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.m android.view.View)
                                  (wrap: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4 : 0x0088: CONSTRUCTOR  (r5v13 com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) call: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.4.<init>(com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.i.onChanged(java.lang.Object):void, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0088: CONSTRUCTOR  (r5v13 com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b$4) = (r8v0 'bVar' com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b) call: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b.4.<init>(com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a.i.onChanged(java.lang.Object):void, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 36 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 42 more
                                */
                            /*
                            // Method dump skipped, instructions count: 288
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.DialogC56125a.C56134i.onChanged(java.lang.Object):void");
                        }
                    }

                    /* access modifiers changed from: protected */
                    public final void onCreate(Bundle bundle) {
                        MethodCollector.m26663i(2113);
                        super.onCreate(bundle);
                        setContentView(R.layout.a7h);
                        AbstractC55147b.C55148a aVar = AbstractC55147b.f126186a;
                        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.acd);
                        C89219l.m154716b(recyclerView, "");
                        aVar.mo92070a(recyclerView, "nested_share_dialog");
                        Window window = getWindow();
                        if (window != null) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                window.setStatusBarColor(0);
                            }
                            window.setLayout(-1, -1);
                            window.setSoftInputMode(16);
                        }
                        ((TuxIconView) findViewById(R.id.clr)).setOnClickListener(new View$OnClickListenerC56129d(this));
                        if (m102002b()) {
                            ((ShareNestedLayout) findViewById(R.id.dyj)).mo92956a(false, 0.0f);
                            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.adj);
                            C89219l.m154716b(linearLayout, "");
                            linearLayout.getLayoutParams().height = -2;
                        } else {
                            float a = ((float) C34723i.m70924a(getContext())) * 0.7f;
                            ((ShareNestedLayout) findViewById(R.id.dyj)).mo92956a(true, a);
                            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.adj);
                            C89219l.m154716b(linearLayout2, "");
                            linearLayout2.getLayoutParams().height = C89241a.m154730a(a);
                        }
                        ((LinearLayout) findViewById(R.id.adj)).requestLayout();
                        ((ShareNestedLayout) findViewById(R.id.dyj)).setVisibleChangedListener(new C56132g(this));
                        ShareNestedLayout shareNestedLayout = (ShareNestedLayout) findViewById(R.id.dyj);
                        shareNestedLayout.getAppBar().mo43717a(new ShareNestedLayout.C56124p(shareNestedLayout));
                        shareNestedLayout.mo92957a(true, true);
                        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.acd);
                        recyclerView2.getContext();
                        recyclerView2.setLayoutManager(new LinearLayoutManager());
                        recyclerView2.setAdapter(this.f128013d);
                        recyclerView2.mo4405a(new C56130e(recyclerView2, recyclerView2.getContext(), this));
                        if (C56216k.m102132b() && this.f128020l.f128364d != null) {
                            ((FrameLayout) findViewById(R.id.biu)).addView(this.f128020l.f128364d);
                            LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.bit);
                            C89219l.m154716b(linearLayout3, "");
                            linearLayout3.setVisibility(0);
                        }
                        if (this.f128020l.f128361a != null) {
                            LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.biz);
                            C89219l.m154716b(linearLayout4, "");
                            linearLayout4.setVisibility(0);
                            View findViewById = findViewById(R.id.biy);
                            C89219l.m154716b(findViewById, "");
                            findViewById.setVisibility(0);
                            ((FrameLayout) findViewById(R.id.bj1)).addView(this.f128020l.f128361a);
                        }
                        View a2 = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a4c, (ViewGroup) findViewById(R.id.acd), false);
                        a2.findViewById(R.id.chk).setOnClickListener(new View$OnClickListenerC56131f(this));
                        C55882d dVar = this.f128013d;
                        C89219l.m154716b(a2, "");
                        dVar.mo92737c(a2);
                        if (m102002b()) {
                            RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.acd);
                            C89219l.m154716b(recyclerView3, "");
                            recyclerView3.setVisibility(8);
                            TuxStatusView tuxStatusView = (TuxStatusView) findViewById(R.id.e7i);
                            C89219l.m154716b(tuxStatusView, "");
                            tuxStatusView.setVisibility(8);
                            MethodCollector.m26664o(2113);
                            return;
                        }
                        this.f128018j.mo92833e();
                        ShareDialogViewModel shareDialogViewModel = this.f128012c;
                        shareDialogViewModel.f128113c.observe(this.f128011b, new C56133h(shareDialogViewModel, this));
                        shareDialogViewModel.f128114d.observe(this.f128011b, new C56134i(this));
                        shareDialogViewModel.f128117g.observe(this.f128011b, new C56135j(this));
                        shareDialogViewModel.f128115e.observe(this.f128011b, new C56136k(this));
                        shareDialogViewModel.f128116f.observe(this.f128011b, new C56137l(this));
                        shareDialogViewModel.f128118h.observe(this.f128011b, new C56138m(this));
                        shareDialogViewModel.mo93014a(0);
                        shareDialogViewModel.mo93018d();
                        TuxStatusView tuxStatusView2 = (TuxStatusView) findViewById(R.id.e7i);
                        C89219l.m154716b(tuxStatusView2, "");
                        new C56085a(tuxStatusView2, this.f128015f, this.f128012c, this.f128011b);
                        MethodCollector.m26664o(2113);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a$e */
                    public static final class C56130e extends C51425a {

                        /* renamed from: a */
                        final /* synthetic */ RecyclerView f128024a;

                        /* renamed from: b */
                        final /* synthetic */ DialogC56125a f128025b;

                        static {
                            Covode.recordClassIndex(65930);
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
                        /* renamed from: a */
                        public final void mo4753a(RecyclerView recyclerView, int i) {
                            View view;
                            C89219l.m154721d(recyclerView, "");
                            super.mo4753a(recyclerView, i);
                            if (i == 1) {
                                Window window = this.f128025b.getWindow();
                                if (window != null) {
                                    view = window.getCurrentFocus();
                                } else {
                                    view = null;
                                }
                                KeyboardUtils.m70897c(view);
                            }
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C56130e(RecyclerView recyclerView, Context context, DialogC56125a aVar) {
                            super(context);
                            this.f128024a = recyclerView;
                            this.f128025b = aVar;
                        }
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public DialogC56125a(Activity activity, C56271c cVar, AbstractC56264b bVar, C69684e eVar, int i) {
                        super(activity, i);
                        C89219l.m154721d(activity, "");
                        C89219l.m154721d(cVar, "");
                        C89219l.m154721d(eVar, "");
                        this.f128015f = activity;
                        this.f128020l = cVar;
                        this.f128016g = bVar;
                        this.f128021m = eVar;
                        SharePackage sharePackage = eVar.f155557i;
                        this.f128010a = sharePackage;
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        this.f128011b = (ActivityC0218d) activity;
                        C55962c a = C55962c.C55963a.m101844a(eVar.f155557i.f155487d, true, C55732c.EnumC55734b.NORMAL);
                        this.f128018j = a;
                        ShareDialogViewModel shareDialogViewModel = new ShareDialogViewModel(sharePackage, a, bVar);
                        this.f128012c = shareDialogViewModel;
                        this.f128013d = new C55882d(sharePackage, shareDialogViewModel);
                        this.f128014e = C89250i.m154773a((AbstractC89171a) new C56128c(this));
                        AbstractC55147b.f126186a.mo92071a("nested_share_dialog");
                    }
                }
