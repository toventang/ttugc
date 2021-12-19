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

/* renamed from: com.ss.android.ugc.aweme.profile.ui.w */
public final class DialogC64322w extends Dialog {

    /* renamed from: c */
    public static final C64323a f145792c = new C64323a((byte) 0);

    /* renamed from: a */
    final Activity f145793a;

    /* renamed from: b */
    public final String f145794b;

    static {
        Covode.recordClassIndex(75769);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.w$a */
    public static final class C64323a {
        static {
            Covode.recordClassIndex(75770);
        }

        private C64323a() {
        }

        public /* synthetic */ C64323a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.w$c */
    static final class View$OnClickListenerC64325c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64322w f145796a;

        static {
            Covode.recordClassIndex(75772);
        }

        View$OnClickListenerC64325c(DialogC64322w wVar) {
            this.f145796a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145796a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.w$d */
    static final class View$OnClickListenerC64326d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64322w f145797a;

        static {
            Covode.recordClassIndex(75773);
        }

        View$OnClickListenerC64326d(DialogC64322w wVar) {
            this.f145797a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145797a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.w$e */
    static final class View$OnClickListenerC64327e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64322w f145798a;

        static {
            Covode.recordClassIndex(75774);
        }

        View$OnClickListenerC64327e(DialogC64322w wVar) {
            this.f145798a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145798a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.w$b */
    static final class View$OnClickListenerC64324b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC64322w f145795a;

        static {
            Covode.recordClassIndex(75771);
        }

        View$OnClickListenerC64324b(DialogC64322w wVar) {
            this.f145795a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DialogC64322w wVar = this.f145795a;
            String str = wVar.f145794b;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("geo:0,0?q=".concat(String.valueOf(str))));
            if (intent.resolveActivity(wVar.f145793a.getPackageManager()) != null) {
                Activity activity = wVar.f145793a;
                C84349a.m145093a(intent, activity);
                activity.startActivity(intent);
            }
            this.f145795a.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amk);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, C13628n.m24521b(window.getContext()) - C13628n.m24525e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        ((TuxTextView) findViewById(R.id.es4)).setOnClickListener(new View$OnClickListenerC64324b(this));
        ((TuxTextView) findViewById(R.id.eu9)).setOnClickListener(new View$OnClickListenerC64325c(this));
        ((RoundedFrameLayout) findViewById(R.id.b3p)).setOnClickListener(new View$OnClickListenerC64326d(this));
        ((RelativeLayout) findViewById(R.id.b3k)).setOnClickListener(new View$OnClickListenerC64327e(this));
    }

    private DialogC64322w(Activity activity, String str) {
        super(activity, R.style.a04);
        this.f145793a = activity;
        this.f145794b = str;
    }

    public /* synthetic */ DialogC64322w(Activity activity, String str, byte b) {
        this(activity, str);
    }
}
