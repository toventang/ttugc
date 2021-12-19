package com.p2082ss.android.ugc.aweme.comment.gift;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.util.C37216s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.e */
public final class DialogC36454e extends Dialog {

    /* renamed from: b */
    public static final C36455a f86170b = new C36455a((byte) 0);

    /* renamed from: a */
    public final IVideoGiftService f86171a;

    /* renamed from: c */
    private final ActivityC0945e f86172c;

    /* renamed from: d */
    private final Aweme f86173d;

    /* renamed from: e */
    private final String f86174e;

    /* renamed from: f */
    private final AbstractC89171a<C89391z> f86175f;

    static {
        Covode.recordClassIndex(43752);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.e$a */
    public static final class C36455a {
        static {
            Covode.recordClassIndex(43753);
        }

        private C36455a() {
        }

        public /* synthetic */ C36455a(byte b) {
            this();
        }
    }

    public final void dismiss() {
        this.f86175f.invoke();
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.e$b */
    static final class View$OnClickListenerC36456b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC36454e f86176a;

        static {
            Covode.recordClassIndex(43754);
        }

        View$OnClickListenerC36456b(DialogC36454e eVar) {
            this.f86176a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86176a.mo63780a("click_cancel");
            this.f86176a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.e$c */
    static final class View$OnClickListenerC36457c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC36454e f86177a;

        static {
            Covode.recordClassIndex(43755);
        }

        View$OnClickListenerC36457c(DialogC36454e eVar) {
            this.f86177a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86177a.mo63780a("click_ok");
            this.f86177a.dismiss();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        mo63780a("click_blank");
        dismiss();
        return true;
    }

    /* renamed from: a */
    public final void mo63780a(String str) {
        C33744d a = new C33744d().mo59983a("enter_from", this.f86174e).mo59983a("group_id", C59208ac.m108771e(this.f86173d)).mo59983a("author_id", C59208ac.m108758a(this.f86173d));
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C33744d a2 = a.mo59983a("user_id", g.getCurUserId()).mo59980a("is_follow", C37216s.m75210b(this.f86173d)).mo59980a("is_like", C37216s.m75209a(this.f86173d)).mo59983a("enter_method", str);
        C89219l.m154716b(a2, "");
        C39162r.m79460a("dismiss_gift_interstitial", a2.f79943a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(8606);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.ik, (ViewGroup) null);
        if (inflate != null) {
            inflate.findViewById(R.id.a70).setOnClickListener(new View$OnClickListenerC36456b(this));
            inflate.findViewById(R.id.cw0).setOnClickListener(new View$OnClickListenerC36457c(this));
            String a = this.f86171a.mo108900a();
            if (a != null) {
                C20766v a2 = C20761r.m39061a(a);
                a2.f49092E = (SmartImageView) inflate.findViewById(R.id.d_p);
                a2.f49125v = EnumC20767w.CENTER_INSIDE;
                a2.mo34186c();
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f86172c.getWindowManager();
        C89219l.m154716b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(C89271h.m154772c((int) C13628n.m24520b(this.f86172c, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        C33744d a3 = new C33744d().mo59983a("enter_from", this.f86174e).mo59983a("group_id", C59208ac.m108771e(this.f86173d)).mo59983a("author_id", C59208ac.m108758a(this.f86173d));
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C33744d a4 = a3.mo59983a("user_id", g.getCurUserId()).mo59980a("is_follow", C37216s.m75210b(this.f86173d)).mo59980a("is_like", C37216s.m75209a(this.f86173d));
        C89219l.m154716b(a4, "");
        C39162r.m79460a("show_gift_interstitial", a4.f79943a);
        MethodCollector.m26664o(8606);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC36454e(ActivityC0945e eVar, Aweme aweme, String str, AbstractC89171a<C89391z> aVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f86172c = eVar;
        this.f86173d = aweme;
        this.f86174e = str;
        this.f86175f = aVar;
        IVideoGiftService l = VideoGiftService.m120814l();
        C89219l.m154716b(l, "");
        this.f86171a = l;
    }
}
