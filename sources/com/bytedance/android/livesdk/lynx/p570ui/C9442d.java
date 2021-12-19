package com.bytedance.android.livesdk.lynx.p570ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7173g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7181l;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h;
import com.bytedance.android.livesdk.browser.p469j.C7032a;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxDelayDestroyJSB;
import com.bytedance.android.livesdk.lynx.AbstractC9341b;
import com.bytedance.android.livesdk.lynx.AbstractC9352c;
import com.bytedance.android.livesdk.lynx.AbstractC9353d;
import com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a;
import com.bytedance.android.livesdk.utils.C11218ah;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p674b.AbstractC11612b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.d */
public final class C9442d extends AbstractC9376a implements AbstractC9353d {

    /* renamed from: p */
    public static final C9443a f22920p = new C9443a((byte) 0);

    /* renamed from: a */
    public boolean f22921a;

    /* renamed from: b */
    public boolean f22922b;

    /* renamed from: c */
    public boolean f22923c = true;

    /* renamed from: d */
    public AbstractC9341b f22924d;

    /* renamed from: e */
    public View f22925e;

    /* renamed from: f */
    public AbstractC9352c f22926f;

    /* renamed from: g */
    public String f22927g = "";

    /* renamed from: h */
    public int f22928h;

    /* renamed from: i */
    public Integer f22929i;

    /* renamed from: j */
    public String f22930j;

    /* renamed from: k */
    public boolean f22931k;

    /* renamed from: l */
    public String f22932l = "";

    /* renamed from: m */
    public boolean f22933m;

    /* renamed from: n */
    public boolean f22934n;

    /* renamed from: o */
    public C7181l f22935o;

    /* renamed from: q */
    private HashMap f22936q;

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$e */
    public final /* synthetic */ class View$OnClickListenerC9447e implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f22940a;

        static {
            Covode.recordClassIndex(10955);
        }

        public View$OnClickListenerC9447e(AbstractC89172b bVar) {
            this.f22940a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f22940a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(10950);
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a
    /* renamed from: i */
    public final void mo16274i() {
        HashMap hashMap = this.f22936q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a, com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo16274i();
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$a */
    public static final class C9443a {
        static {
            Covode.recordClassIndex(10951);
        }

        private C9443a() {
        }

        public /* synthetic */ C9443a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$c */
    static final class RunnableC9445c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9442d f22938a;

        static {
            Covode.recordClassIndex(10953);
        }

        RunnableC9445c(C9442d dVar) {
            this.f22938a = dVar;
        }

        public final void run() {
            AbstractC9341b bVar = this.f22938a.f22924d;
            if (bVar != null) {
                bVar.mo16223c();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$d */
    static final class C9446d implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C9442d f22939a;

        static {
            Covode.recordClassIndex(10954);
        }

        C9446d(C9442d dVar) {
            this.f22939a = dVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            C7181l lVar = new C7181l(this.f22939a);
            this.f22939a.f22935o = lVar;
            return lVar;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a
    /* renamed from: f */
    public final View mo13302f() {
        AbstractC9341b bVar = this.f22924d;
        if (bVar != null) {
            return bVar.mo16225d();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C3854a.m9453a(4, "LiveLynx.LiveLynxFragment", "onDetach()");
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (LynxDelayDestroyJSB.INSTANCE.getValue()) {
            C3940j.m9595a(new RunnableC9445c(this));
            return;
        }
        AbstractC9341b bVar = this.f22924d;
        if (bVar != null) {
            bVar.mo16223c();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            mo13267a("container_disappear", new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C3854a.m9453a(4, "LiveLynx.LiveLynxFragment", "onResume()");
        try {
            mo13267a("container_appear", new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C9442d() {
        boolean z = true;
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        this.f22921a = (iHostContext == null || !iHostContext.isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) ? false : z;
        this.f22926f = (AbstractC9352c) C6193a.m13435a(AbstractC9352c.class);
        this.f22874K = C6952c.m14838b();
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9353d
    /* renamed from: a */
    public final void mo13229a() {
        String string;
        Object valueOf;
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("fallback_url")) == null)) {
            C89219l.m154716b(string, "");
            if (string.length() > 0) {
                Context context = null;
                if (1 != 0) {
                    AbstractC9376a.AbstractC9378b bVar = this.f22871H;
                    if (bVar != null) {
                        bVar.mo13280g();
                    }
                    if (this.f22934n) {
                        ActivityC0945e activity = getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        if (this.f22872I != null) {
                            AbstractC2928f.AbstractC2929a aVar = this.f22872I;
                            if (aVar != null) {
                                aVar.mo7664a(string);
                                valueOf = C89391z.f203057a;
                            }
                        } else {
                            IActionHandlerService iActionHandlerService = (IActionHandlerService) C6193a.m13435a(IActionHandlerService.class);
                            Context context2 = getContext();
                            if (context2 != null) {
                                context = context2.getApplicationContext();
                                if (C58003a.f132201c && context == null) {
                                    context = C58003a.f132199a;
                                }
                            }
                            valueOf = Boolean.valueOf(iActionHandlerService.handle(context, string));
                        }
                    } else if (this.f22872I != null) {
                        AbstractC2928f.AbstractC2929a aVar2 = this.f22872I;
                        if (aVar2 != null) {
                            aVar2.mo7664a(string);
                            valueOf = C89391z.f203057a;
                        }
                    } else {
                        valueOf = Boolean.valueOf(((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(getContext(), string));
                    }
                    if (valueOf != null) {
                        return;
                    }
                }
            }
        }
        if (this.f22921a) {
            C11226ao.m19883a(C3966y.m9669e(), "Lynx fallback with no fallback_url!!", 0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$b */
    static final class C9444b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C9442d f22937a;

        static {
            Covode.recordClassIndex(10952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9444b(C9442d dVar) {
            super(1);
            this.f22937a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9353d
    /* renamed from: a */
    public final void mo13230a(View view) {
        C89219l.m154721d(view, "");
        View view2 = this.f22925e;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C3854a.m9453a(4, "LiveLynx.LiveLynxFragment", "onAttach()");
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a, com.bytedance.android.livesdkapi.p674b.AbstractC11610a
    /* renamed from: a */
    public final boolean mo13295a(String str) {
        C89219l.m154721d(str, "");
        super.mo13295a(str);
        AbstractC11612b bVar = this.f22876M;
        if (bVar != null) {
            return bVar.mo13378a();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a, com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String queryParameter;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            C89219l.m154716b(string, "");
            this.f22927g = string;
            if (!TextUtils.isEmpty(string)) {
                Uri parse = Uri.parse(this.f22927g);
                this.f22933m = arguments.getBoolean("hide_status_bar", false);
                this.f22931k = arguments.getBoolean("is_fullscreen", false);
                this.f22932l = arguments.getString("title");
                this.f22929i = Integer.valueOf(arguments.getInt("bundle_preset_width"));
                this.f22930j = arguments.getString("original_scheme", "");
                this.f22934n = arguments.getBoolean("is_dummy_host", false);
                String string2 = arguments.getString("soft_input_mode", "");
                C89219l.m154716b(string2, "");
                this.f22875L = string2;
                String str2 = null;
                if (parse != null) {
                    try {
                        str = parse.getQueryParameter("web_bg_color");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && (queryParameter = parse.getQueryParameter("web_bg_color")) != null) {
                    this.f22928h = Color.parseColor(C7032a.m14989a(queryParameter));
                }
                if (parse != null) {
                    try {
                        boolean z2 = true;
                        if (parse.getQueryParameter("hide_loading") != null) {
                            if (C11218ah.m19873b(parse.getQueryParameter("hide_loading")) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f22922b = z;
                        } else if (parse != null) {
                        }
                        if (parse.getQueryParameter("hide_status_bar") != null) {
                            String queryParameter2 = parse.getQueryParameter("hide_status_bar");
                            if (queryParameter2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(queryParameter2, "");
                            if (Integer.parseInt(queryParameter2) != 1) {
                                z2 = false;
                            }
                            this.f22933m = z2;
                        } else if (parse != null) {
                        }
                        str2 = parse.getQueryParameter("title");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f22932l = parse.getQueryParameter("title");
                }
            }
        }
        if (this.f22933m && this.f22931k) {
            if (C3931d.m9571a(getActivity())) {
                ActivityC0945e activity = getActivity();
                if (activity == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.clearFlags(67108864);
                    window.getDecorView().setSystemUiVisibility(1280);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                activity.getWindow().setFlags(67108864, 67108864);
                return;
            }
            C3903ac.m9534a((Activity) getActivity());
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
    /* renamed from: a */
    public final <T> void mo13267a(String str, T t) {
        AbstractC9341b bVar = this.f22924d;
        if (bVar != null) {
            bVar.mo13267a(str, t);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C7181l lVar = this.f22935o;
        if (lVar != null) {
            lVar.mo13380a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(6101);
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bbn, viewGroup, false);
        if (a != null) {
            FrameLayout frameLayout = (FrameLayout) a;
            View findViewById = frameLayout.findViewById(R.id.cb7);
            this.f22925e = findViewById;
            if (this.f22922b) {
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            AbstractC9352c cVar = this.f22926f;
            if (cVar == null) {
                C89219l.m154715b();
            }
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            AbstractC9341b createAndLoad = cVar.createAndLoad(activity, this.f22927g, this.f22929i, this.f22930j, this.f22874K, this);
            if (createAndLoad != null) {
                View d = createAndLoad.mo16225d();
                d.setScrollBarStyle(0);
                d.setBackgroundColor(this.f22928h);
                frameLayout.addView(d, 0, new FrameLayout.LayoutParams(-1, -1));
                View$OnClickListenerC6986h.AbstractC6989a aVar = this.f22870G;
                if (aVar != null) {
                    aVar.mo13275a(createAndLoad.mo16222b());
                }
                AbstractC6953a b = createAndLoad.mo16222b();
                C7173g gVar = new C7173g();
                this.f22876M = gVar;
                C18364w a2 = b.mo13236a();
                if (a2 != null) {
                    a2.mo29405b("viewController", gVar);
                }
                C18364w a3 = b.mo13236a();
                if (a3 != null) {
                    a3.mo29400a("chooseImage", (AbstractC18334e.AbstractC18336b) new C9446d(this));
                }
                this.f22924d = createAndLoad;
                if (this.f22921a) {
                    C9444b bVar = new C9444b(this);
                    LiveTextView liveTextView = new LiveTextView(getContext());
                    liveTextView.setText("Lynx");
                    liveTextView.setTextSize(14.0f);
                    liveTextView.setTextColor(Color.parseColor("#FFFFFF"));
                    liveTextView.setBackgroundColor(Color.parseColor("#88008800"));
                    liveTextView.setOnClickListener(new View$OnClickListenerC9447e(bVar));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388661;
                    frameLayout.addView(liveTextView, layoutParams);
                }
                MethodCollector.m26664o(6101);
                return frameLayout;
            }
            mo13229a();
            MethodCollector.m26664o(6101);
            return frameLayout;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(6101);
        throw nullPointerException;
    }
}
