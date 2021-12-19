package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50383g;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50385i;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50380d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50386j;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50387k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50389a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50395d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50349d;
import com.p2082ss.android.ugc.aweme.feed.share.C49914a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56268a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.s */
public final class DialogC69418s extends DialogC26609a implements AbstractC50382f {

    /* renamed from: e */
    public static final C69419a f155055e = new C69419a((byte) 0);

    /* renamed from: a */
    public NestedScrollView f155056a;

    /* renamed from: b */
    public ViewGroup f155057b;

    /* renamed from: c */
    public BottomSheetBehavior<View> f155058c;

    /* renamed from: d */
    public boolean f155059d;

    /* renamed from: f */
    private View f155060f;

    /* renamed from: j */
    private LinearLayout f155061j;

    /* renamed from: k */
    private LinearLayout f155062k;

    /* renamed from: l */
    private ViewGroup f155063l;

    /* renamed from: m */
    private LinearLayout f155064m;

    /* renamed from: n */
    private String f155065n;

    /* renamed from: o */
    private final NestedScrollView.AbstractC0813b f155066o;

    /* renamed from: p */
    private final C69419a.C69420a f155067p;

    /* renamed from: q */
    private final AbstractC50385i f155068q;

    /* renamed from: r */
    private final float f155069r;

    static {
        Covode.recordClassIndex(81755);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.s$a */
    public static final class C69419a {
        static {
            Covode.recordClassIndex(81756);
        }

        private C69419a() {
        }

        public /* synthetic */ C69419a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.s$a$a */
        public static final class C69420a {

            /* renamed from: a */
            public final boolean f155070a;

            /* renamed from: b */
            public final AbstractC69683d f155071b;

            /* renamed from: c */
            public final List<AbstractC69693h> f155072c;

            /* renamed from: d */
            public final List<C56253f> f155073d;

            static {
                Covode.recordClassIndex(81757);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C69420a)) {
                    return false;
                }
                C69420a aVar = (C69420a) obj;
                return this.f155070a == aVar.f155070a && C89219l.m154714a(this.f155071b, aVar.f155071b) && C89219l.m154714a(this.f155072c, aVar.f155072c) && C89219l.m154714a(this.f155073d, aVar.f155073d);
            }

            public final int hashCode() {
                boolean z = this.f155070a;
                if (z) {
                    z = true;
                }
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = i * 31;
                AbstractC69683d dVar = this.f155071b;
                int i5 = 0;
                int hashCode = (i4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
                List<AbstractC69693h> list = this.f155072c;
                int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                List<C56253f> list2 = this.f155073d;
                if (list2 != null) {
                    i5 = list2.hashCode();
                }
                return hashCode2 + i5;
            }

            public final String toString() {
                return "LongPressSharePanelConfig(supportIM=" + this.f155070a + ", imShareHook=" + this.f155071b + ", actions=" + this.f155072c + ", batchGroups=" + this.f155073d + ")";
            }

            public /* synthetic */ C69420a(boolean z) {
                this(z, null, C89086z.INSTANCE, C89086z.INSTANCE);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sharer.ui.h> */
            /* JADX WARN: Multi-variable type inference failed */
            public C69420a(boolean z, AbstractC69683d dVar, List<? extends AbstractC69693h> list, List<C56253f> list2) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                this.f155070a = z;
                this.f155071b = dVar;
                this.f155072c = list;
                this.f155073d = list2;
            }
        }

        /* renamed from: a */
        private static int m122622a(Aweme aweme) {
            if (C80636z.m139818c(aweme)) {
                return 2;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isSecret()) {
                return -1;
            }
            return 1;
        }

        /* renamed from: a */
        private static C50345a m122623a(Aweme aweme, String str) {
            boolean z;
            String str2;
            C50345a aVar = new C50345a(aweme, str);
            if (aweme != null) {
                aVar.f116263a.f155492i.putInt("share_im_limit_tip_type", m122622a(aweme));
                Bundle bundle = aVar.f116263a.f155492i;
                User author = aweme.getAuthor();
                if (author != null) {
                    str2 = author.getUniqueId();
                } else {
                    str2 = null;
                }
                bundle.putString("author_user_name", str2);
            }
            Bundle bundle2 = aVar.f116263a.f155492i;
            if (aweme != null) {
                z = aweme.isAd();
            } else {
                z = false;
            }
            bundle2.putBoolean("is_ad", z);
            return aVar;
        }

        /* renamed from: a */
        public static DialogC69418s m122624a(Context context, Aweme aweme, String str) {
            boolean z;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C50345a a = m122623a(aweme, str);
            if (!C49914a.m93725b(aweme)) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    z = true;
                    return new DialogC69418s(context, new C69420a(z), a, (byte) 0);
                }
            }
            z = false;
            return new DialogC69418s(context, new C69420a(z), a, (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f
    /* renamed from: a */
    public final ViewGroup mo85550a() {
        return this.f155064m;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f
    /* renamed from: b */
    public final ViewGroup mo9590b() {
        return this.f155063l;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f
    /* renamed from: c */
    public final Dialog mo85553c() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f
    /* renamed from: d */
    public final String mo85554d() {
        return this.f155065n;
    }

    public final void onBackPressed() {
        C50349d a;
        ViewGroup viewGroup = this.f155063l;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        View view = this.f155060f;
        if (view != null && (a = this.f155068q.mo85526a(this)) != null) {
            a.mo85531b(view);
        }
    }

    public final void show() {
        Object obj;
        Activity a = C34729o.m70950a(getContext());
        if (a != null) {
            obj = m122615a(a, "vibrator");
        } else {
            obj = null;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) obj;
        if (vibrator != null) {
            vibrator.vibrate(15);
        }
        super.show();
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a
    public final void onStart() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.onStart();
        int a = C89241a.m154730a(((float) C13628n.m24521b(getContext())) * this.f155069r);
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        if (C56204e.m102119c()) {
            aVar.element = true;
            i = C89241a.m154730a(((float) C13628n.m24521b(getContext())) * 0.7f);
        } else {
            i = a;
        }
        View findViewById = findViewById(R.id.ajx);
        if (findViewById != null) {
            findViewById.setBackground(null);
        }
        boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
        if (!this.f155067p.f155070a || d) {
            if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
                layoutParams.height = -2;
            }
        } else if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
            layoutParams2.height = i;
        }
        setOnShowListener(new DialogInterface$OnShowListenerC69422c(this, findViewById, aVar, a));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f
    /* renamed from: a */
    public final void mo85551a(String str) {
        C89219l.m154721d(str, "");
        this.f155065n = str;
    }

    /* renamed from: a */
    public final void mo109664a(boolean z) {
        int i;
        this.f155059d = z;
        BottomSheetBehavior<View> bottomSheetBehavior = this.f155058c;
        if (bottomSheetBehavior != null) {
            if (z) {
                i = 3;
            } else {
                i = 4;
            }
            bottomSheetBehavior.mo43978c(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.s$c */
    static final class DialogInterface$OnShowListenerC69422c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DialogC69418s f155076a;

        /* renamed from: b */
        final /* synthetic */ View f155077b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f155078c;

        /* renamed from: d */
        final /* synthetic */ int f155079d;

        static {
            Covode.recordClassIndex(81759);
        }

        DialogInterface$OnShowListenerC69422c(DialogC69418s sVar, View view, C89233z.C89234a aVar, int i) {
            this.f155076a = sVar;
            this.f155077b = view;
            this.f155078c = aVar;
            this.f155079d = i;
        }

        public final void onShow(DialogInterface dialogInterface) {
            int i;
            this.f155076a.f155058c = BottomSheetBehavior.m52754a(this.f155077b);
            BottomSheetBehavior<View> bottomSheetBehavior = this.f155076a.f155058c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo43973a(true);
                bottomSheetBehavior.f62895i = !this.f155078c.element;
                bottomSheetBehavior.f62894h = true;
                bottomSheetBehavior.mo43976b(this.f155079d);
                if (this.f155078c.element) {
                    i = 4;
                } else {
                    i = 3;
                }
                bottomSheetBehavior.mo43978c(i);
                if (this.f155078c.element) {
                    bottomSheetBehavior.f62901o = new C69423a(bottomSheetBehavior, this);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.s$c$a */
        public static final class C69423a extends BottomSheetBehavior.AbstractC26607a {

            /* renamed from: a */
            final /* synthetic */ BottomSheetBehavior f155080a;

            /* renamed from: b */
            final /* synthetic */ DialogInterface$OnShowListenerC69422c f155081b;

            static {
                Covode.recordClassIndex(81760);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37774a(View view, float f) {
                C89219l.m154721d(view, "");
            }

            C69423a(BottomSheetBehavior bottomSheetBehavior, DialogInterface$OnShowListenerC69422c cVar) {
                this.f155080a = bottomSheetBehavior;
                this.f155081b = cVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
            /* renamed from: a */
            public final void mo37775a(View view, int i) {
                C89219l.m154721d(view, "");
                if (this.f155081b.f155076a.f155059d && i == 4) {
                    this.f155080a.mo43978c(3);
                }
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        Window window;
        Window window2;
        MethodCollector.m26663i(3717);
        try {
            if (Build.VERSION.SDK_INT >= 21 && (window2 = getWindow()) != null) {
                window2.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            C51423a.m95787a(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.sq);
        Window window3 = getWindow();
        if (window3 != null) {
            C80420fc.m139414a(window3);
        }
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(0);
        }
        this.f155060f = findViewById(R.id.cyw);
        this.f155061j = (LinearLayout) findViewById(R.id.am4);
        this.f155062k = (LinearLayout) findViewById(R.id.dxs);
        this.f155063l = (ViewGroup) findViewById(R.id.am4);
        this.f155056a = (NestedScrollView) findViewById(R.id.dq4);
        this.f155064m = (LinearLayout) findViewById(R.id.dy3);
        this.f155057b = (ViewGroup) findViewById(R.id.dvo);
        List<AbstractC50383g> b = this.f155068q.mo85528b(this);
        LinearLayout linearLayout = this.f155062k;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (b.isEmpty()) {
            View findViewById = findViewById(R.id.vo);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        }
        int size = b.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            AbstractC50383g gVar = b.get(i);
            if (i != b.size() - 1) {
                z = false;
            }
            if (gVar instanceof C50386j) {
                Context context = getContext();
                C89219l.m154716b(context, "");
                C50395d dVar = new C50395d(context);
                dVar.mo85566a((C50387k) gVar, z);
                ImageView imageView = dVar.f116350a.f116333a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f155062k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(dVar);
                }
            } else if (gVar instanceof C50387k) {
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                C50395d dVar2 = new C50395d(context2);
                dVar2.mo85566a((C50387k) gVar, z);
                LinearLayout linearLayout3 = this.f155062k;
                if (linearLayout3 != null) {
                    linearLayout3.addView(dVar2);
                }
            } else if (gVar instanceof C50380d) {
                C50389a aVar = new C50389a(getContext());
                C50380d dVar3 = (C50380d) gVar;
                C89219l.m154721d(dVar3, "");
                aVar.f116337b = dVar3.f116324b;
                aVar.f116338c = dVar3.f116325c;
                aVar.f116336a.mo85557a(dVar3.f116323a);
                if (z) {
                    View a = aVar.mo85558a();
                    C89219l.m154716b(a, "");
                    a.setVisibility(4);
                } else {
                    View a2 = aVar.mo85558a();
                    C89219l.m154716b(a2, "");
                    a2.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f155062k;
                if (linearLayout4 != null) {
                    linearLayout4.addView(aVar);
                }
            }
            i++;
        }
        LinearLayout linearLayout5 = this.f155062k;
        if (linearLayout5 != null) {
            linearLayout5.requestLayout();
        }
        NestedScrollView nestedScrollView = this.f155056a;
        if (nestedScrollView != null) {
            nestedScrollView.setOnScrollChangeListener(this.f155066o);
        }
        boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
        ViewGroup.LayoutParams layoutParams = null;
        if (!this.f155067p.f155070a || d) {
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.dy2);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dgl);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(8);
            View findViewById2 = findViewById(R.id.vo);
            C89219l.m154716b(findViewById2, "");
            findViewById2.setVisibility(8);
            LinearLayout linearLayout6 = this.f155064m;
            if (linearLayout6 != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout6.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                } else {
                    layoutParams2 = null;
                }
                linearLayout6.setLayoutParams(layoutParams2);
            }
            LinearLayout linearLayout7 = this.f155061j;
            if (linearLayout7 != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout7.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                } else {
                    layoutParams3 = null;
                }
                linearLayout7.setLayoutParams(layoutParams3);
            }
            NestedScrollView nestedScrollView2 = this.f155056a;
            if (nestedScrollView2 != null) {
                ViewGroup.LayoutParams layoutParams4 = nestedScrollView2.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -2;
                } else {
                    layoutParams4 = null;
                }
                nestedScrollView2.setLayoutParams(layoutParams4);
            }
            View view = this.f155060f;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = -2;
                    layoutParams = layoutParams5;
                }
                view.setLayoutParams(layoutParams);
            }
            View view2 = this.f155060f;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, (int) C13628n.m24520b(getContext(), 16.0f));
            }
        } else {
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            Activity a3 = C69124b.m122223a(context3);
            if (a3 != null) {
                C56268a aVar2 = new C56268a(a3, this, this.f155068q.mo85527a(), (FrameLayout) findViewById(R.id.eif), (RecyclerView) findViewById(R.id.dgl), (LinearLayout) findViewById(R.id.dy5), (TextView) findViewById(R.id.dy2), this.f155067p.f155071b, this.f155067p.f155073d, this.f155066o);
                C69417r rVar = new C69417r(aVar2);
                AbstractC56234c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                if (shareService != null) {
                    shareService.mo92295a(aVar2, rVar);
                }
            }
        }
        C16048b.m29633a().mo25421a(true, "did_precise_exp_long_press_menu", false);
        C39162r.m79460a("verify_precise_exp", new C33744d().mo59983a("scene", "long_press_menu").f79943a);
        MethodCollector.m26664o(3717);
    }

    /* renamed from: a */
    private static Object m122615a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(3984);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3984);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC69418s(Context context, C69419a.C69420a aVar, AbstractC50385i iVar) {
        super(context, R.style.vw);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        this.f155067p = aVar;
        this.f155068q = iVar;
        this.f155069r = 0.5f;
        this.f155065n = "";
        this.f155066o = new C69421b(this, context);
    }

    public /* synthetic */ DialogC69418s(Context context, C69419a.C69420a aVar, AbstractC50385i iVar, byte b) {
        this(context, aVar, iVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.s$b */
    static final class C69421b implements NestedScrollView.AbstractC0813b {

        /* renamed from: a */
        final /* synthetic */ DialogC69418s f155074a;

        /* renamed from: b */
        final /* synthetic */ Context f155075b;

        static {
            Covode.recordClassIndex(81758);
        }

        C69421b(DialogC69418s sVar, Context context) {
            this.f155074a = sVar;
            this.f155075b = context;
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0813b
        /* renamed from: a */
        public final void mo381a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            int[] iArr = new int[2];
            ((TuxTextView) this.f155074a.findViewById(R.id.dy2)).getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            NestedScrollView nestedScrollView2 = this.f155074a.f155056a;
            if (nestedScrollView2 != null) {
                nestedScrollView2.getLocationOnScreen(iArr2);
            }
            int i5 = iArr[1] - iArr2[1];
            if (((float) i5) < 0.0f) {
                ViewGroup viewGroup = this.f155074a.f155057b;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                float b = ((float) (-i5)) / C13628n.m24520b(this.f155075b, 40.0f);
                ViewGroup viewGroup2 = this.f155074a.f155057b;
                if (viewGroup2 != null) {
                    if (b > 1.0f) {
                        b = 1.0f;
                    }
                    viewGroup2.setAlpha(b);
                    return;
                }
                return;
            }
            ViewGroup viewGroup3 = this.f155074a.f155057b;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
    }
}
