package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.a */
public final class DialogC40466a extends Dialog {

    /* renamed from: a */
    public static final C40467a f94696a = new C40467a((byte) 0);

    /* renamed from: b */
    private final ActivityC0945e f94697b;

    /* renamed from: c */
    private final C40470c f94698c;

    /* renamed from: d */
    private final String f94699d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f94700e;

    static {
        Covode.recordClassIndex(48273);
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.a$a */
    public static final class C40467a {
        static {
            Covode.recordClassIndex(48274);
        }

        private C40467a() {
        }

        public /* synthetic */ C40467a(byte b) {
            this();
        }
    }

    public final void dismiss() {
        this.f94700e.invoke();
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.a$b */
    static final class View$OnClickListenerC40468b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC40466a f94701a;

        static {
            Covode.recordClassIndex(48275);
        }

        View$OnClickListenerC40468b(DialogC40466a aVar) {
            this.f94701a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94701a.dismiss();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        List<String> urlList;
        String str;
        MethodCollector.m26663i(3952);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.uy, (ViewGroup) null);
        String str2 = "";
        if (inflate != null) {
            inflate.findViewById(R.id.cw0).setOnClickListener(new View$OnClickListenerC40468b(this));
            C40488h hVar = this.f94698c.f94708d;
            if (hVar != null) {
                UrlModel urlModel = hVar.f94738a;
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C89070n.m154583g((List) urlList)) == null)) {
                    C20766v a = C20761r.m39061a(str);
                    a.f49092E = (SmartImageView) inflate.findViewById(R.id.d_p);
                    a.f49125v = EnumC20767w.CENTER_INSIDE;
                    a.mo34186c();
                }
                try {
                    TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.d_s);
                    C89219l.m154716b(tuxTextView, str2);
                    tuxTextView.setText(hVar.f94740c);
                    TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.d_n);
                    C89219l.m154716b(tuxTextView2, str2);
                    tuxTextView2.setText(hVar.f94739b);
                    TuxTextView tuxTextView3 = (TuxTextView) inflate.findViewById(R.id.d_o);
                    C89219l.m154716b(tuxTextView3, str2);
                    tuxTextView3.setText(C3966y.m9657a((int) R.string.b2v));
                } catch (Exception e) {
                    e.getMessage();
                    Integer.valueOf(0);
                }
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f94697b.getWindowManager();
        C89219l.m154716b(windowManager, str2);
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(C89271h.m154772c((int) C13628n.m24520b(this.f94697b, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        C33744d a2 = new C33744d().mo59983a("enter_from", "creator_tools").mo59983a("enter_method", "click_grey_area");
        String str3 = this.f94698c.f94709e;
        if (str3 != null) {
            str2 = str3;
        }
        C39162r.m79460a("show_creator_plus_popup", a2.mo59983a("feature", str2).f79943a);
        MethodCollector.m26664o(3952);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC40466a(ActivityC0945e eVar, C40470c cVar, String str, AbstractC89171a<C89391z> aVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f94697b = eVar;
        this.f94698c = cVar;
        this.f94699d = str;
        this.f94700e = aVar;
    }
}
