package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3249d;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.C56271c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.d.a */
public final class DialogC56104a extends DialogC26609a {

    /* renamed from: a */
    public final Activity f127946a;

    /* renamed from: b */
    private final C56271c f127947b;

    static {
        Covode.recordClassIndex(65903);
    }

    public /* synthetic */ DialogC56104a(Activity activity) {
        this(activity, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.d.a$b */
    static final class View$OnClickListenerC56106b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56104a f127949a;

        static {
            Covode.recordClassIndex(65905);
        }

        View$OnClickListenerC56106b(DialogC56104a aVar) {
            this.f127949a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127949a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.d.a$a */
    static final class View$OnClickListenerC56105a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC56104a f127948a;

        static {
            Covode.recordClassIndex(65904);
        }

        View$OnClickListenerC56105a(DialogC56104a aVar) {
            this.f127948a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C58957c.m108318a(this.f127948a.f127946a, "share_page", "share_page");
            this.f127948a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        C56271c cVar;
        MethodCollector.m26663i(1754);
        super.onCreate(bundle);
        setContentView(R.layout.a6v);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.ym;
            }
        }
        TuxButton tuxButton = (TuxButton) findViewById(R.id.yy);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new View$OnClickListenerC56105a(this));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.clr);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC56106b(this));
        }
        C56271c cVar2 = this.f127947b;
        if (!(cVar2 == null || cVar2.f128361a == null)) {
            ((FrameLayout) findViewById(R.id.biz)).addView(this.f127947b.f128361a);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.biz);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            View findViewById = findViewById(R.id.bj0);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
        }
        if (!C56216k.m102132b() || (cVar = this.f127947b) == null || cVar.f128364d == null) {
            MethodCollector.m26664o(1754);
            return;
        }
        ((FrameLayout) findViewById(R.id.biu)).addView(this.f127947b.f128364d);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.biu);
        C89219l.m154716b(frameLayout2, "");
        frameLayout2.setVisibility(0);
        View findViewById2 = findViewById(R.id.biv);
        C89219l.m154716b(findViewById2, "");
        findViewById2.setVisibility(0);
        MethodCollector.m26664o(1754);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC56104a(Activity activity, C56271c cVar) {
        super(activity, R.style.yt);
        C89219l.m154721d(activity, "");
        this.f127946a = activity;
        this.f127947b = cVar;
    }
}
