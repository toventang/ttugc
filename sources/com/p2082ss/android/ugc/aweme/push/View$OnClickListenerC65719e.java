package com.p2082ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61553e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.push.C65693c;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.push.e */
public final class View$OnClickListenerC65719e extends PopupWindow implements View.OnClickListener, AbstractC17242a, AbstractC68903b {

    /* renamed from: A */
    private String f148076A;

    /* renamed from: B */
    private Long f148077B;

    /* renamed from: C */
    private String f148078C;

    /* renamed from: a */
    public int f148079a = 5000;

    /* renamed from: b */
    public boolean f148080b = false;

    /* renamed from: c */
    public RunnableC65721a f148081c;

    /* renamed from: d */
    public long f148082d = 0;

    /* renamed from: e */
    public Activity f148083e;

    /* renamed from: f */
    public View f148084f;

    /* renamed from: g */
    public String f148085g;

    /* renamed from: h */
    public String f148086h;

    /* renamed from: i */
    public String f148087i;

    /* renamed from: j */
    public String f148088j;

    /* renamed from: k */
    public String f148089k;

    /* renamed from: l */
    public String f148090l;

    /* renamed from: m */
    public Boolean f148091m = false;

    /* renamed from: n */
    public String f148092n;

    /* renamed from: o */
    public String f148093o;

    /* renamed from: p */
    public Map<String, String> f148094p = new HashMap();

    /* renamed from: q */
    private PullUpLayout f148095q;

    /* renamed from: r */
    private View f148096r;

    /* renamed from: s */
    private View f148097s;

    /* renamed from: t */
    private SmartAvatarImageView f148098t;

    /* renamed from: u */
    private SmartAvatarImageView f148099u;

    /* renamed from: v */
    private LiveCircleView f148100v;

    /* renamed from: w */
    private C50196d f148101w;

    /* renamed from: x */
    private TextView f148102x;

    /* renamed from: y */
    private TextView f148103y;

    /* renamed from: z */
    private String f148104z;

    static {
        Covode.recordClassIndex(77218);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: b */
    public final void mo27279b() {
    }

    /* renamed from: f */
    private void m117648f() {
        C50196d dVar = this.f148101w;
        if (dVar != null) {
            dVar.mo85362c();
        }
    }

    /* renamed from: g */
    private void m117649g() {
        C50196d dVar = this.f148101w;
        if (dVar != null) {
            dVar.mo85363d();
        }
    }

    /* renamed from: e */
    private Boolean m117645e() {
        return Boolean.valueOf(!TextUtils.equals("author", this.f148104z));
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: d */
    public final void mo85245d() {
        if (isShowing() && !this.f148080b) {
            try {
                Activity activity = this.f148083e;
                if (activity != null && !activity.isFinishing()) {
                    this.f148095q.mo27262a(0.0f, true);
                    m117649g();
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f148083e = null;
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.push.e$a */
    public class RunnableC65721a implements Runnable {

        /* renamed from: a */
        boolean f148106a;

        static {
            Covode.recordClassIndex(77220);
        }

        public final void run() {
            if (!this.f148106a && System.currentTimeMillis() >= View$OnClickListenerC65719e.this.f148082d && View$OnClickListenerC65719e.this.isShowing()) {
                C65722f.m117657a(View$OnClickListenerC65719e.this.f148091m.booleanValue(), View$OnClickListenerC65719e.this.f148086h, View$OnClickListenerC65719e.this.f148088j, "others", View$OnClickListenerC65719e.this.f148089k, View$OnClickListenerC65719e.this.f148090l, View$OnClickListenerC65719e.this.f148087i);
                C65722f.m117656a(View$OnClickListenerC65719e.this.f148086h, View$OnClickListenerC65719e.this.f148088j, View$OnClickListenerC65719e.this.f148090l, "Android", View$OnClickListenerC65719e.this.f148085g, View$OnClickListenerC65719e.this.f148092n, View$OnClickListenerC65719e.this.f148093o, new StringBuilder().append(View$OnClickListenerC65719e.this.f148079a).toString(), View$OnClickListenerC65719e.this.f148094p);
                View$OnClickListenerC65719e.this.mo85245d();
            }
        }

        private RunnableC65721a() {
        }

        /* synthetic */ RunnableC65721a(View$OnClickListenerC65719e eVar, byte b) {
            this();
        }
    }

    public View$OnClickListenerC65719e() {
        super(C17867d.m33078a());
        MethodCollector.m26663i(8832);
        View inflate = ((LayoutInflater) m117639a(C17867d.m33078a(), "layout_inflater")).inflate(R.layout.a09, (ViewGroup) null);
        this.f148096r = inflate;
        View findViewById = inflate.findViewById(R.id.dlx);
        this.f148084f = findViewById;
        findViewById.setOnClickListener(this);
        this.f148098t = (SmartAvatarImageView) inflate.findViewById(R.id.bsr);
        this.f148099u = (SmartAvatarImageView) inflate.findViewById(R.id.bsv);
        this.f148100v = (LiveCircleView) inflate.findViewById(R.id.ca7);
        this.f148097s = inflate.findViewById(R.id.vz);
        SmartAvatarImageView smartAvatarImageView = this.f148099u;
        this.f148101w = new C50196d(smartAvatarImageView, smartAvatarImageView, this.f148100v);
        this.f148102x = (TextView) inflate.findViewById(R.id.f63);
        this.f148103y = (TextView) inflate.findViewById(R.id.ezc);
        PullUpLayout pullUpLayout = (PullUpLayout) inflate.findViewById(R.id.dat);
        this.f148095q = pullUpLayout;
        pullUpLayout.mo27263a(this.f148084f);
        this.f148095q.setPullUpListener(this);
        this.f148095q.setInternalTouchEventListener(new PullUpLayout.AbstractC17241b() {
            /* class com.p2082ss.android.ugc.aweme.push.View$OnClickListenerC65719e.C657201 */

            static {
                Covode.recordClassIndex(77219);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout.AbstractC17241b
            /* renamed from: a */
            public final void mo27277a(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    View$OnClickListenerC65719e.this.f148080b = true;
                    if (View$OnClickListenerC65719e.this.f148081c != null) {
                        View$OnClickListenerC65719e.this.f148081c.f148106a = true;
                    }
                } else if (action == 1) {
                    View$OnClickListenerC65719e.this.f148080b = false;
                    View$OnClickListenerC65719e.this.f148082d = System.currentTimeMillis() + ((long) View$OnClickListenerC65719e.this.f148079a);
                    View$OnClickListenerC65719e.this.f148081c.f148106a = false;
                    View$OnClickListenerC65719e.this.f148084f.postDelayed(View$OnClickListenerC65719e.this.f148081c, (long) View$OnClickListenerC65719e.this.f148079a);
                } else if (action == 2) {
                    View$OnClickListenerC65719e.this.f148080b = true;
                }
            }
        });
        this.f148081c = new RunnableC65721a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f148096r);
        setWidth(C13628n.m24504a(C17867d.m33078a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a16);
        MethodCollector.m26664o(8832);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: a */
    public final void mo27278a() {
        this.f148080b = false;
        if (isShowing()) {
            C65722f.m117657a(this.f148091m.booleanValue(), this.f148086h, this.f148088j, "draw", this.f148089k, this.f148090l, this.f148087i);
            C65722f.m117656a(this.f148086h, this.f148088j, this.f148090l, "Android", this.f148085g, this.f148092n, this.f148093o, new StringBuilder().append(this.f148079a).toString(), this.f148094p);
            mo85245d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: c */
    public final void mo85244c() {
        MethodCollector.m26663i(8988);
        this.f148095q.mo27261a();
        Activity activity = this.f148083e;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = this.f148079a;
            this.f148082d = currentTimeMillis + ((long) i);
            this.f148095q.postDelayed(this.f148081c, (long) i);
            if (this.f148096r.getParent() != null) {
                ((ViewGroup) this.f148096r.getParent()).removeView(this.f148096r);
            }
            try {
                if (m117645e().booleanValue()) {
                    this.f148097s.setVisibility(0);
                    this.f148098t.setVisibility(4);
                    m117648f();
                } else {
                    this.f148097s.setVisibility(4);
                    this.f148098t.setVisibility(0);
                }
                IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, true);
                View decorView = this.f148083e.getWindow().getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -C13628n.m24525e(C17867d.m33078a()));
                boolean booleanValue = this.f148091m.booleanValue();
                String str = this.f148086h;
                String str2 = this.f148088j;
                String str3 = this.f148089k;
                String str4 = this.f148090l;
                String str5 = this.f148076A;
                String str6 = this.f148087i;
                String str7 = "livesdk_live_show";
                if (!booleanValue) {
                    str7 = "livesdk_anchor_push_show";
                }
                C33744d a = new C33744d().mo59983a("enter_method", "inner_push").mo59983a("enter_from_merge", "inner_push").mo59983a("room_id", str).mo59983a("inner_push_type", str3).mo59983a("anchor_id", str2).mo59983a("gd_label", str4).mo59983a("is_subscribe", str5).mo59983a("action_type", "click");
                C89219l.m154716b(a, "");
                C80411ew.m139395a(str6, a);
                C39162r.m79460a(str7, a.f79943a);
                String str8 = this.f148086h;
                String str9 = this.f148088j;
                String str10 = this.f148090l;
                String str11 = this.f148085g;
                String str12 = this.f148092n;
                String str13 = this.f148093o;
                C39162r.m79460a("inner_push_show", new C33744d().mo59983a("rule_id", str12).mo59983a("push_label", str10).mo59983a("push_channel", "Android").mo59983a("room_id", str8).mo59983a("anchor_id", str9).mo59983a("o_url", str11).mo59983a("user_id", str13).mo59986a(this.f148094p).f79943a);
                try {
                    C65693c a2 = C65693c.f148022c.mo104849a();
                    Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                    Long valueOf2 = Long.valueOf(Long.parseLong(this.f148092n));
                    Long l = this.f148077B;
                    String str14 = this.f148090l;
                    String str15 = this.f148085g;
                    C1731i<BaseResponse> reportLiveInnerPush = a2.f148023a.reportLiveInnerPush(valueOf, valueOf2, l, this.f148078C, str14, str15);
                    if (reportLiveInnerPush != null) {
                        reportLiveInnerPush.mo5542c(C65693c.C65696c.f148025a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                m117648f();
                MethodCollector.m26664o(8988);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.m26664o(8988);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    private static Boolean m117642b(String str) {
        return Boolean.valueOf(str.startsWith("sslocal://live"));
    }

    /* renamed from: a */
    private static String m117640a(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("room_id");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    /* renamed from: c */
    private static String m117643c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("user_id");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    /* renamed from: d */
    private static String m117644d(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("inner_push_type");
        if (TextUtils.isEmpty(queryParameter)) {
            return "official";
        }
        return queryParameter;
    }

    /* renamed from: e */
    private static String m117646e(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("gd_label");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    /* renamed from: f */
    private static String m117647f(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("is_subscribe");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    public final void onClick(View view) {
        Activity activity;
        String str;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.dlx && !C58001a.m104815a(view, 1200) && (activity = this.f148083e) != null) {
            String str2 = this.f148085g;
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            if (str2.contains("enter_from")) {
                str2 = m117641a(str2, "enter_from", "inner_push");
                buildUpon = Uri.parse(str2).buildUpon();
            } else {
                buildUpon.appendQueryParameter("enter_from", "inner_push");
            }
            if (str2.contains("enter_from_merge")) {
                str2 = m117641a(str2, "enter_from_merge", "inner_push");
                buildUpon = Uri.parse(str2).buildUpon();
            } else {
                buildUpon.appendQueryParameter("enter_from_merge", "inner_push");
            }
            if (!str2.contains("enter_method")) {
                buildUpon.appendQueryParameter("enter_method", "inner_push");
            }
            SmartRouter.buildRoute(activity, buildUpon.toString()).open();
            boolean booleanValue = this.f148091m.booleanValue();
            String str3 = this.f148086h;
            String str4 = this.f148088j;
            String str5 = this.f148089k;
            String str6 = this.f148090l;
            String str7 = this.f148087i;
            if (!booleanValue) {
                str = "livesdk_anchor_push_click";
            } else {
                str = "livesdk_click_push";
            }
            C33744d a = new C33744d().mo59983a("inner_push_type", str5).mo59983a("enter_method", "inner_push").mo59983a("enter_from_merge", "inner_push").mo59983a("room_id", str3).mo59983a("anchor_id", str4).mo59983a("gd_label", str6);
            C89219l.m154716b(a, "");
            C80411ew.m139395a(str7, a);
            C39162r.m79460a(str, a.f79943a);
            C65722f.m117657a(this.f148091m.booleanValue(), this.f148086h, this.f148088j, "others", this.f148089k, this.f148090l, this.f148087i);
            String str8 = this.f148086h;
            String str9 = this.f148088j;
            String str10 = this.f148090l;
            String str11 = this.f148085g;
            String str12 = this.f148092n;
            C39162r.m79460a("inner_push_click", new C33744d().mo59983a("rule_id", str12).mo59983a("push_label", str10).mo59983a("push_channel", "Android").mo59983a("room_id", str8).mo59983a("anchor_id", str9).mo59983a("o_url", str11).mo59983a("user_id", this.f148093o).mo59986a(this.f148094p).f79943a);
            C65722f.m117656a(this.f148086h, this.f148088j, this.f148090l, "Android", this.f148085g, this.f148092n, this.f148093o, new StringBuilder().append(this.f148079a).toString(), this.f148094p);
            mo85245d();
        }
    }

    /* renamed from: a */
    private static Object m117639a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8834);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(8834);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static String m117641a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replaceAll("(" + str2 + "=[^&]*)", str2 + "=" + str3);
    }

    /* renamed from: a */
    public final void mo104863a(String str, String str2, String str3, String str4, String str5, String str6, C61553e eVar) {
        if (m117645e().booleanValue()) {
            C20766v a = C20761r.m39061a(str3).mo34179a("LivePopupView");
            a.f49092E = this.f148099u;
            a.mo34186c();
        } else {
            C20766v a2 = C20761r.m39061a(str3).mo34179a("Avatar");
            a2.f49092E = this.f148098t;
            a2.mo34186c();
        }
        this.f148087i = str6;
        this.f148104z = str5;
        this.f148102x.setText(str);
        this.f148103y.setText(str2);
        this.f148085g = str4;
        this.f148086h = m117640a(str4);
        this.f148091m = m117642b(str4);
        this.f148088j = m117643c(str4);
        this.f148089k = m117644d(str4);
        this.f148090l = m117646e(str4);
        this.f148076A = m117647f(str4);
        this.f148093o = C31575b.m65865g().getCurUserId();
        if (eVar != null) {
            this.f148092n = String.valueOf(eVar.getRid());
            this.f148077B = Long.valueOf(eVar.getGid());
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(eVar.getExtraStr());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f148094p = hashMap;
            this.f148078C = "frontier";
            return;
        }
        this.f148092n = "";
        this.f148077B = 0L;
        this.f148094p = null;
        this.f148078C = "gcm";
    }
}
