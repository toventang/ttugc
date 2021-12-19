package com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.a */
public final class C33328a extends FrameLayout {

    /* renamed from: a */
    final String f79175a;

    /* renamed from: b */
    public final String f79176b;

    /* renamed from: c */
    int f79177c;

    /* renamed from: d */
    final String f79178d;

    /* renamed from: e */
    final String f79179e;

    /* renamed from: f */
    private final String f79180f;

    /* renamed from: g */
    private final String f79181g;

    /* renamed from: h */
    private final String f79182h;

    /* renamed from: i */
    private HashMap f79183i;

    static {
        Covode.recordClassIndex(40164);
    }

    /* renamed from: a */
    private View m68331a(int i) {
        if (this.f79183i == null) {
            this.f79183i = new HashMap();
        }
        View view = (View) this.f79183i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79183i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getAccountName() {
        return this.f79180f;
    }

    public final String getCId() {
        return this.f79175a;
    }

    public final String getEnterFrom() {
        return this.f79179e;
    }

    public final String getLogExtra() {
        return this.f79178d;
    }

    public final String getLogId() {
        return this.f79182h;
    }

    public final String getReminderTime() {
        return this.f79181g;
    }

    public final int getSubscriptionStatus() {
        return this.f79177c;
    }

    /* renamed from: a */
    public final boolean mo59324a() {
        if (Long.parseLong(this.f79181g) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo59325b() {
        if (this.f79177c == 0) {
            ((TuxButton) m68331a(R.id.button)).setButtonVariant(0);
            TuxTextView tuxTextView = (TuxTextView) m68331a(R.id.cj9);
            C89219l.m154716b(tuxTextView, "");
            Context context = getContext();
            C89219l.m154716b(context, "");
            tuxTextView.setText(context.getResources().getString(R.string.ny, this.f79180f));
            TuxButton tuxButton = (TuxButton) m68331a(R.id.button);
            C89219l.m154716b(tuxButton, "");
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            tuxButton.setText(context2.getResources().getString(R.string.nw));
            return;
        }
        ((TuxButton) m68331a(R.id.button)).setButtonVariant(1);
        TuxTextView tuxTextView2 = (TuxTextView) m68331a(R.id.cj9);
        C89219l.m154716b(tuxTextView2, "");
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        tuxTextView2.setText(context3.getResources().getString(R.string.nx));
        TuxButton tuxButton2 = (TuxButton) m68331a(R.id.button);
        C89219l.m154716b(tuxButton2, "");
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        tuxButton2.setText(context4.getResources().getString(R.string.nv));
    }

    /* renamed from: c */
    private final void m68332c() {
        String str;
        String str2;
        ((TuxIconView) m68331a(R.id.bh4)).setOnClickListener(new View$OnClickListenerC33330b(this));
        C18129a.C18130a a = C18129a.m33747a("draw_ad", "othershow", this.f79175a, this.f79178d, null);
        if (mo59324a()) {
            str = "expired_reminder_window";
        } else {
            str = "reminder_window";
        }
        C18129a.C18130a b = a.mo28900b("refer", str);
        if (TextUtils.equals(this.f79179e, "draw_ad")) {
            str2 = "1";
        } else {
            str2 = "2";
        }
        b.mo28897a("window_type", str2).mo28901b();
        TuxTextView tuxTextView = (TuxTextView) m68331a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(context.getResources().getString(R.string.o0, this.f79180f));
        TuxTextView tuxTextView2 = (TuxTextView) m68331a(R.id.eb3);
        C89219l.m154716b(tuxTextView2, "");
        BDDateFormat bDDateFormat = new BDDateFormat("dddd, MMMM D, YYYY hh:mm A");
        long parseLong = Long.parseLong(this.f79181g);
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        tuxTextView2.setText(bDDateFormat.mo21223a(parseLong, locale));
        if (mo59324a()) {
            TuxTextView tuxTextView3 = (TuxTextView) m68331a(R.id.cj9);
            C89219l.m154716b(tuxTextView3, "");
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            tuxTextView3.setText(context2.getResources().getString(R.string.nz));
            TuxButton tuxButton = (TuxButton) m68331a(R.id.button);
            C89219l.m154716b(tuxButton, "");
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            tuxButton.setText(context3.getResources().getString(R.string.nu));
            ((TuxButton) m68331a(R.id.button)).setOnClickListener(new View$OnClickListenerC33329a(this));
        } else {
            mo59325b();
        }
        ((TuxButton) m68331a(R.id.button)).setOnClickListener(new View$OnClickListenerC33331c(this));
    }

    public final void setSubscriptionStatus(int i) {
        this.f79177c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.a$b */
    public static final class View$OnClickListenerC33330b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33328a f79185a;

        static {
            Covode.recordClassIndex(40166);
        }

        View$OnClickListenerC33330b(C33328a aVar) {
            this.f79185a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f79185a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.a$a */
    public static final class View$OnClickListenerC33329a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33328a f79184a;

        static {
            Covode.recordClassIndex(40165);
        }

        View$OnClickListenerC33329a(C33328a aVar) {
            this.f79184a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43787a(this.f79184a);
            SmartRouter.buildRoute(this.f79184a.getContext(), this.f79184a.f79176b).open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.a$c */
    public static final class View$OnClickListenerC33331c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33328a f79186a;

        static {
            Covode.recordClassIndex(40167);
        }

        View$OnClickListenerC33331c(C33328a aVar) {
            this.f79186a = aVar;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            ClickAgent.onClick(view);
            C33328a aVar = this.f79186a;
            String str2 = "2";
            if (aVar.mo59324a()) {
                C18129a.C18130a b = C18129a.m33747a("draw_ad", "otherclick", aVar.f79175a, aVar.f79178d, null).mo28900b("refer", "expired_reminder_window");
                if (TextUtils.equals(aVar.f79179e, "draw_ad")) {
                    str2 = "1";
                }
                b.mo28897a("window_type", str2).mo28901b();
            } else {
                if (aVar.f79177c == 0) {
                    str = "set_success";
                } else {
                    str = "cancel_reminder";
                }
                C18129a.C18130a b2 = C18129a.m33747a("draw_ad", "otherclick", aVar.f79175a, aVar.f79178d, null).mo28900b("refer", "reminder_window");
                if (TextUtils.equals(aVar.f79179e, "draw_ad")) {
                    str2 = "1";
                }
                b2.mo28897a("window_type", str2).mo28897a(str, "1").mo28901b();
            }
            if (this.f79186a.mo59324a()) {
                SmartRouter.buildRoute(this.f79186a.getContext(), this.f79186a.f79176b).open();
                return;
            }
            NoticeUpdateApi noticeUpdateApi = (NoticeUpdateApi) C38582a.m78286a(NoticeUpdateApi.class);
            String cId = this.f79186a.getCId();
            if (this.f79186a.getSubscriptionStatus() == 0) {
                z = true;
            } else {
                z = false;
            }
            noticeUpdateApi.postAdNotice(cId, Boolean.valueOf(z), this.f79186a.getLogId()).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder.C33328a.View$OnClickListenerC33331c.C333321 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC33331c f79187a;

                static {
                    Covode.recordClassIndex(40168);
                }

                {
                    this.f79187a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    int i;
                    C33328a aVar = this.f79187a.f79186a;
                    if (this.f79187a.f79186a.getSubscriptionStatus() == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    aVar.setSubscriptionStatus(i);
                    this.f79187a.f79186a.mo59325b();
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder.C33328a.View$OnClickListenerC33331c.C333332 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC33331c f79188a;

                static {
                    Covode.recordClassIndex(40169);
                }

                {
                    this.f79188a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    ActivityC0945e a = C33334b.m68335a(this.f79188a.f79186a.getContext());
                    if (a != null) {
                        new C23144b(a).mo37640e(R.string.dck).mo37637b();
                    }
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33328a(Context context, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        MethodCollector.m26663i(9038);
        this.f79180f = str;
        this.f79181g = str2;
        this.f79175a = str3;
        this.f79176b = str4;
        this.f79182h = str5;
        this.f79177c = i;
        this.f79178d = str6;
        this.f79179e = str7;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.b12, this, true);
        m68332c();
        MethodCollector.m26664o(9038);
    }
}
