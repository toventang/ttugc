package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.p025c.C0484a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputViewDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3109a.C54089a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.C54469c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55186ah;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b */
public final class C54111b {

    /* renamed from: g */
    public static final C54112a f123993g = new C54112a((byte) 0);

    /* renamed from: a */
    public final Activity f123994a;

    /* renamed from: b */
    public final InputViewDelegate f123995b;

    /* renamed from: c */
    public final ViewGroup f123996c;

    /* renamed from: d */
    public C54469c f123997d;

    /* renamed from: e */
    public final AbstractC54142b f123998e;

    /* renamed from: f */
    public final String f123999f;

    /* renamed from: h */
    private final AbstractC89244h f124000h;

    /* renamed from: i */
    private final AbstractC89244h f124001i;

    /* renamed from: j */
    private final AbstractC89244h f124002j;

    /* renamed from: k */
    private final AbstractC89244h f124003k;

    /* renamed from: l */
    private final AbstractC89244h f124004l;

    /* renamed from: m */
    private final AbstractC89244h f124005m;

    /* renamed from: n */
    private final AbstractC89244h f124006n;

    /* renamed from: o */
    private final AbstractC89244h f124007o;

    /* renamed from: p */
    private final Handler f124008p;

    /* renamed from: q */
    private final View f124009q;

    static {
        Covode.recordClassIndex(63788);
    }

    /* renamed from: a */
    private final LinearLayout m99314a() {
        return (LinearLayout) this.f124000h.getValue();
    }

    /* renamed from: b */
    private final int m99315b() {
        return ((Number) this.f124001i.getValue()).intValue();
    }

    /* renamed from: c */
    private final int m99316c() {
        return ((Number) this.f124002j.getValue()).intValue();
    }

    /* renamed from: d */
    private final int m99317d() {
        return ((Number) this.f124003k.getValue()).intValue();
    }

    /* renamed from: e */
    private final int m99318e() {
        return ((Number) this.f124004l.getValue()).intValue();
    }

    /* renamed from: f */
    private final int m99319f() {
        return ((Number) this.f124005m.getValue()).intValue();
    }

    /* renamed from: g */
    private final int m99320g() {
        return ((Number) this.f124006n.getValue()).intValue();
    }

    /* renamed from: h */
    private final int m99321h() {
        return ((Number) this.f124007o.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$a */
    public static final class C54112a {
        static {
            Covode.recordClassIndex(63789);
        }

        private C54112a() {
        }

        public /* synthetic */ C54112a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$e */
    static final class C54116e extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124013a;

        static {
            Covode.recordClassIndex(63793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54116e(C54111b bVar) {
            super(0);
            this.f124013a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f124013a.f123996c.findViewById(R.id.aub);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$b */
    static final class C54113b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124010a;

        static {
            Covode.recordClassIndex(63790);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54113b(C54111b bVar) {
            super(0);
            this.f124010a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124010a.f123996c.getContext(), 5.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$c */
    static final class C54114c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124011a;

        static {
            Covode.recordClassIndex(63791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54114c(C54111b bVar) {
            super(0);
            this.f124011a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124011a.f123996c.getContext(), 5.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$d */
    static final class C54115d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124012a;

        static {
            Covode.recordClassIndex(63792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54115d(C54111b bVar) {
            super(0);
            this.f124012a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124012a.f123996c.getContext(), 102.6f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$g */
    static final class C54118g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124016a;

        static {
            Covode.recordClassIndex(63795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54118g(C54111b bVar) {
            super(0);
            this.f124016a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124016a.f123996c.getContext(), 80.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$h */
    static final class C54119h extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124017a;

        static {
            Covode.recordClassIndex(63796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54119h(C54111b bVar) {
            super(0);
            this.f124017a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124017a.f123996c.getContext(), 218.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$i */
    static final class C54120i extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124018a;

        static {
            Covode.recordClassIndex(63797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54120i(C54111b bVar) {
            super(0);
            this.f124018a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124018a.f123996c.getContext(), 96.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$j */
    static final class C54121j extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C54111b f124019a;

        static {
            Covode.recordClassIndex(63798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54121j(C54111b bVar) {
            super(0);
            this.f124019a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) C13628n.m24520b(this.f124019a.f123996c.getContext(), 181.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$k */
    static final class RunnableC54122k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C54111b f124020a;

        static {
            Covode.recordClassIndex(63799);
        }

        RunnableC54122k(C54111b bVar) {
            this.f124020a = bVar;
        }

        public final void run() {
            C54469c cVar = this.f124020a.f123997d;
            if (cVar != null && cVar.isShowing() && this.f124020a.f123994a != null && !this.f124020a.f123994a.isFinishing()) {
                cVar.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b$f */
    public static final class View$OnClickListenerC54117f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54111b f124014a;

        /* renamed from: b */
        final /* synthetic */ C46534a f124015b;

        static {
            Covode.recordClassIndex(63794);
        }

        View$OnClickListenerC54117f(C54111b bVar, C46534a aVar) {
            this.f124014a = bVar;
            this.f124015b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C46447a aVar = new C46447a();
            aVar.f108223c = C46459a.m89690b(this.f124015b);
            aVar.f108224d = this.f124015b;
            this.f124014a.f123995b.mo91243a(aVar);
            this.f124014a.f123998e.mo91227m();
            String str = this.f124014a.f123999f;
            String.valueOf(this.f124015b.getId());
            C54089a.C54090a aVar2 = C54089a.C54090a.f123952a;
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar2, "");
            C0484a aVar3 = new C0484a();
            aVar3.put("to_user_id", str);
            aVar2.invoke("auto_emoji_click", aVar3);
        }
    }

    /* renamed from: a */
    public final void mo91196a(List<? extends C46534a> list) {
        int d;
        int a;
        int f;
        MethodCollector.m26663i(5344);
        this.f124008p.removeCallbacksAndMessages(null);
        if (list == null || list.isEmpty()) {
            C54469c cVar = this.f123997d;
            if (cVar != null) {
                if (cVar.isShowing()) {
                    cVar.dismiss();
                }
                MethodCollector.m26664o(5344);
                return;
            }
            MethodCollector.m26664o(5344);
            return;
        }
        C54089a.m99276a(this.f123999f);
        if (list.size() == 1) {
            d = m99315b();
            a = C13628n.m24504a(this.f123996c.getContext()) - m99315b();
            f = m99319f();
        } else if (list.size() == 2) {
            d = m99316c();
            a = C13628n.m24504a(this.f123996c.getContext()) - m99316c();
            f = m99319f();
        } else {
            d = m99317d();
            a = C13628n.m24504a(this.f123996c.getContext()) - m99317d();
            f = m99319f();
        }
        int i = a - f;
        m99314a().removeAllViews();
        for (C46534a aVar : list) {
            LinearLayout a2 = m99314a();
            LinearLayout a3 = m99314a();
            C89219l.m154716b(a3, "");
            a2.addView(m99313a(a3.getContext(), aVar));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = m99321h();
        layoutParams.width = d;
        this.f123996c.setLayoutParams(layoutParams);
        C54469c cVar2 = this.f123997d;
        if (cVar2 == null || !cVar2.isShowing()) {
            this.f123997d = new C54469c();
        } else {
            C54469c cVar3 = this.f123997d;
            if (cVar3 != null) {
                cVar3.dismiss();
            }
        }
        C54469c cVar4 = this.f123997d;
        if (cVar4 != null) {
            cVar4.mo91551a(this.f123996c, layoutParams.width, layoutParams.height);
        }
        C54469c cVar5 = this.f123997d;
        if (cVar5 != null) {
            cVar5.f124772a = 0;
        }
        C54469c cVar6 = this.f123997d;
        if (cVar6 != null) {
            cVar6.mo91552b(this.f124009q, i, -m99320g());
        }
        C54469c cVar7 = this.f123997d;
        if (cVar7 != null) {
            cVar7.update(layoutParams.width, layoutParams.height);
        }
        this.f124008p.postDelayed(new RunnableC54122k(this), 5000);
        MethodCollector.m26664o(5344);
    }

    /* renamed from: a */
    private final View m99313a(Context context, C46534a aVar) {
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(m99318e(), m99318e());
        marginLayoutParams.rightMargin = m99319f();
        remoteImageView.setLayoutParams(marginLayoutParams);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://" + C46641c.m90026b(aVar));
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://" + C46641c.m90026b(aVar));
        C55186ah.m100891a(remoteImageView, urlModel, null, true);
        remoteImageView.setOnClickListener(new View$OnClickListenerC54117f(this, aVar));
        return remoteImageView;
    }

    public C54111b(AbstractC54142b bVar, View view, String str) {
        Activity activity;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(5453);
        this.f123998e = bVar;
        this.f124009q = view;
        this.f123999f = str;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        activity = null;
        this.f123994a = activity;
        this.f123995b = new InputViewDelegate(this.f123998e);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a6y, (ViewGroup) null);
        if (inflate != null) {
            this.f123996c = (ViewGroup) inflate;
            this.f124000h = C89250i.m154773a((AbstractC89171a) new C54116e(this));
            this.f124001i = C89250i.m154773a((AbstractC89171a) new C54120i(this));
            this.f124002j = C89250i.m154773a((AbstractC89171a) new C54121j(this));
            this.f124003k = C89250i.m154773a((AbstractC89171a) new C54119h(this));
            this.f124004l = C89250i.m154773a((AbstractC89171a) new C54118g(this));
            this.f124005m = C89250i.m154773a((AbstractC89171a) new C54113b(this));
            this.f124006n = C89250i.m154773a((AbstractC89171a) new C54114c(this));
            this.f124007o = C89250i.m154773a((AbstractC89171a) new C54115d(this));
            this.f124008p = new Handler(Looper.getMainLooper());
            MethodCollector.m26664o(5453);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(5453);
        throw nullPointerException;
    }
}
