package com.p2082ss.android.ugc.aweme.compliance.business.p2641a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c;
import com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a.C39531a;
import com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a.C39533b;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b */
public final class DialogC39292b extends Dialog {

    /* renamed from: b */
    public static final C39293a f92769b = new C39293a((byte) 0);

    /* renamed from: a */
    public boolean f92770a;

    /* renamed from: c */
    private final int f92771c = ((int) C13628n.m24520b(C31291a.m65462a(), 20.0f));

    static {
        Covode.recordClassIndex(46971);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$a */
    public static final class C39293a {
        static {
            Covode.recordClassIndex(46972);
        }

        private C39293a() {
        }

        public /* synthetic */ C39293a(byte b) {
            this();
        }
    }

    public final void show() {
        super.show();
        C17197a.m31761a(true, findViewById(R.id.dnb));
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (getWindow() != null) {
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setLayout(C13628n.m24504a(getContext()) - (this.f92771c * 2), -2);
            }
        }
    }

    /* renamed from: a */
    public final void mo68733a() {
        int i;
        if (!this.f92770a) {
            Context context = getContext();
            TextView textView = (TextView) findViewById(R.id.ezl);
            View$OnClickListenerC39294b bVar = new View$OnClickListenerC39294b(this);
            View$OnClickListenerC39295c cVar = new View$OnClickListenerC39295c(this);
            String string = context.getString(R.string.asz);
            String string2 = context.getString(R.string.asy);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.at2, string, string2));
            int c = C0643b.m2378c(context, R.color.a2);
            C39531a.C39532a aVar = new C39531a.C39532a(c, bVar);
            C39531a.C39532a aVar2 = new C39531a.C39532a(c, cVar);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf = spannableStringBuilder2.indexOf(string);
            int indexOf2 = spannableStringBuilder2.indexOf(string2);
            spannableStringBuilder.setSpan(aVar, indexOf, string.length() + indexOf, 34);
            spannableStringBuilder.setSpan(aVar2, indexOf2, string2.length() + indexOf2, 34);
            textView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            Context context2 = getContext();
            TextView textView2 = (TextView) findViewById(R.id.ezl);
            View$OnClickListenerC39296d dVar = new View$OnClickListenerC39296d(this);
            View$OnClickListenerC39297e eVar = new View$OnClickListenerC39297e(this);
            View$OnClickListenerC39298f fVar = new View$OnClickListenerC39298f(this);
            String string3 = context2.getString(R.string.asz);
            String string4 = context2.getString(R.string.asy);
            String string5 = context2.getString(R.string.asx);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(context2.getString(R.string.at1, string3, string4, string5));
            int c2 = C0643b.m2378c(context2, R.color.a2);
            C39531a.C39532a aVar3 = new C39531a.C39532a(c2, dVar);
            C39531a.C39532a aVar4 = new C39531a.C39532a(c2, eVar);
            C39531a.C39532a aVar5 = new C39531a.C39532a(c2, fVar);
            String spannableStringBuilder4 = spannableStringBuilder3.toString();
            int indexOf3 = spannableStringBuilder4.indexOf(string3);
            int indexOf4 = spannableStringBuilder4.indexOf(string4);
            int indexOf5 = spannableStringBuilder4.indexOf(string5);
            if (indexOf3 >= 0) {
                i = 34;
                spannableStringBuilder3.setSpan(aVar3, indexOf3, string3.length() + indexOf3, 34);
            } else {
                i = 34;
            }
            if (indexOf4 >= 0) {
                spannableStringBuilder3.setSpan(aVar4, indexOf4, string4.length() + indexOf4, i);
            }
            if (indexOf5 >= 0) {
                spannableStringBuilder3.setSpan(aVar5, indexOf5, string5.length() + indexOf5, i);
            }
            textView2.setHighlightColor(C0643b.m2378c(context2, R.color.c9));
            textView2.setText(spannableStringBuilder3);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.wy);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(getContext().getString(R.string.at0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$b */
    public static final class View$OnClickListenerC39294b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92772a;

        static {
            Covode.recordClassIndex(46973);
        }

        View$OnClickListenerC39294b(DialogC39292b bVar) {
            this.f92772a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92772a.mo68734a("terms-of-use");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$c */
    public static final class View$OnClickListenerC39295c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92773a;

        static {
            Covode.recordClassIndex(46974);
        }

        View$OnClickListenerC39295c(DialogC39292b bVar) {
            this.f92773a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92773a.mo68734a("privacy-policy");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$d */
    public static final class View$OnClickListenerC39296d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92774a;

        static {
            Covode.recordClassIndex(46975);
        }

        View$OnClickListenerC39296d(DialogC39292b bVar) {
            this.f92774a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92774a.mo68734a("terms-of-use");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$e */
    public static final class View$OnClickListenerC39297e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92775a;

        static {
            Covode.recordClassIndex(46976);
        }

        View$OnClickListenerC39297e(DialogC39292b bVar) {
            this.f92775a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92775a.mo68734a("privacy-policy");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$f */
    public static final class View$OnClickListenerC39298f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92776a;

        static {
            Covode.recordClassIndex(46977);
        }

        View$OnClickListenerC39298f(DialogC39292b bVar) {
            this.f92776a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92776a.mo68734a("cookie-policy-eu");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$g */
    static final class View$OnClickListenerC39299g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39292b f92777a;

        static {
            Covode.recordClassIndex(46978);
        }

        View$OnClickListenerC39299g(DialogC39292b bVar) {
            this.f92777a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92777a.dismiss();
            C39300c.C39301a.m79951a().mo68744a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC39292b(Context context) {
        super(context, R.style.zn);
        C89219l.m154721d(context, "");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = C17197a.f40977h;
            }
            if (window != null) {
                window.addFlags(2);
                window.setAttributes(attributes);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xk);
        setCancelable(false);
        mo68733a();
        ((TuxTextView) findViewById(R.id.wy)).setOnClickListener(new View$OnClickListenerC39299g(this));
    }

    /* renamed from: a */
    public final void mo68734a(String str) {
        int i;
        C29844g gVar = new C29844g(C39533b.m80327a(str));
        gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(getContext()));
        int hashCode = str.hashCode();
        if (hashCode != -1694110974) {
            if (hashCode != -565301353) {
                if (hashCode == -498638057 && str.equals("privacy-policy")) {
                    i = R.string.asy;
                    SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getContext().getString(i)).open();
                }
            } else if (str.equals("terms-of-use")) {
                i = R.string.asz;
                SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getContext().getString(i)).open();
            }
        } else if (str.equals("cookie-policy-eu")) {
            i = R.string.asx;
            SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getContext().getString(i)).open();
        }
        i = 0;
        SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.mo52126a()).withParam("title", getContext().getString(i)).open();
    }
}
