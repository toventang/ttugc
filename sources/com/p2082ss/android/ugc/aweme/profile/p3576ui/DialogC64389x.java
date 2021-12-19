package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.x */
public final class DialogC64389x extends Dialog {

    /* renamed from: c */
    public static final C64390a f145993c = new C64390a((byte) 0);

    /* renamed from: a */
    final Activity f145994a;

    /* renamed from: b */
    public final String f145995b;

    static {
        Covode.recordClassIndex(75843);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.x$a */
    public static final class C64390a {
        static {
            Covode.recordClassIndex(75844);
        }

        private C64390a() {
        }

        public /* synthetic */ C64390a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.x$c */
    static final class View$OnClickListenerC64392c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64389x f145997a;

        static {
            Covode.recordClassIndex(75846);
        }

        View$OnClickListenerC64392c(DialogC64389x xVar) {
            this.f145997a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145997a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.x$d */
    static final class View$OnClickListenerC64393d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64389x f145998a;

        static {
            Covode.recordClassIndex(75847);
        }

        View$OnClickListenerC64393d(DialogC64389x xVar) {
            this.f145998a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145998a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.x$b */
    static final class View$OnClickListenerC64391b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64389x f145996a;

        static {
            Covode.recordClassIndex(75845);
        }

        View$OnClickListenerC64391b(DialogC64389x xVar) {
            this.f145996a = xVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC64389x xVar = this.f145996a;
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(xVar.f145995b))));
            Activity activity = xVar.f145994a;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
            this.f145996a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aml);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, C13628n.m24521b(window.getContext()) - C13628n.m24525e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.f12);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f145995b);
        ((RoundedFrameLayout) findViewById(R.id.b55)).setOnClickListener(new View$OnClickListenerC64391b(this));
        ((RoundedFrameLayout) findViewById(R.id.b3p)).setOnClickListener(new View$OnClickListenerC64392c(this));
        ((RelativeLayout) findViewById(R.id.b3k)).setOnClickListener(new View$OnClickListenerC64393d(this));
    }

    private DialogC64389x(Activity activity, String str) {
        super(activity, R.style.a04);
        this.f145994a = activity;
        this.f145995b = str;
    }

    public /* synthetic */ DialogC64389x(Activity activity, String str, byte b) {
        this(activity, str);
    }
}
