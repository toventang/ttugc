package com.p2082ss.android.ugc.aweme.comment.gift;

import android.app.Dialog;
import android.graphics.Point;
import android.os.Bundle;
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
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.d */
public final class DialogC36450d extends Dialog {

    /* renamed from: b */
    public static final C36451a f86165b = new C36451a((byte) 0);

    /* renamed from: a */
    public final IVideoGiftService f86166a;

    /* renamed from: c */
    private final ActivityC0945e f86167c;

    static {
        Covode.recordClassIndex(43748);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.d$a */
    public static final class C36451a {
        static {
            Covode.recordClassIndex(43749);
        }

        private C36451a() {
        }

        public /* synthetic */ C36451a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.d$b */
    static final class View$OnClickListenerC36452b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC36450d f86168a;

        static {
            Covode.recordClassIndex(43750);
        }

        View$OnClickListenerC36452b(DialogC36450d dVar) {
            this.f86168a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86168a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.d$c */
    static final class View$OnClickListenerC36453c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC36450d f86169a;

        static {
            Covode.recordClassIndex(43751);
        }

        View$OnClickListenerC36453c(DialogC36450d dVar) {
            this.f86169a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86169a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC36450d(ActivityC0945e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        this.f86167c = eVar;
        IVideoGiftService l = VideoGiftService.m120814l();
        C89219l.m154716b(l, "");
        this.f86166a = l;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(9727);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.ik, (ViewGroup) null);
        if (inflate != null) {
            inflate.findViewById(R.id.a70).setOnClickListener(new View$OnClickListenerC36452b(this));
            inflate.findViewById(R.id.cw0).setOnClickListener(new View$OnClickListenerC36453c(this));
            TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.d_s);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(this.f86167c.getString(R.string.h91));
            tuxTextView.setGravity(1);
            View findViewById = inflate.findViewById(R.id.d_n);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(this.f86167c.getString(R.string.h90));
            String b = this.f86166a.mo108904b();
            if (b != null) {
                C20766v a = C20761r.m39061a(b);
                a.f49092E = (SmartImageView) inflate.findViewById(R.id.d_p);
                a.f49125v = EnumC20767w.CENTER_INSIDE;
                a.mo34186c();
            }
        }
        Point point = new Point();
        WindowManager windowManager = this.f86167c.getWindowManager();
        C89219l.m154716b(windowManager, "");
        windowManager.getDefaultDisplay().getSize(point);
        setContentView(inflate, new LinearLayout.LayoutParams(C89271h.m154772c((int) C13628n.m24520b(this.f86167c, 310.0f), (int) (((float) point.x) * 0.8f)), -2));
        MethodCollector.m26664o(9727);
    }
}
