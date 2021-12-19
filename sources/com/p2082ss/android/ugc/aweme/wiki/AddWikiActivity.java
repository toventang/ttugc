package com.p2082ss.android.ugc.aweme.wiki;

import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.p1195a.AbstractC17152b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37632e;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2537b.C37623a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.ISettingService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.wiki.CheckAnchorModerationService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity */
public final class AddWikiActivity extends ActivityC17312a implements AbstractC17152b {

    /* renamed from: A */
    public static final C81638a f182536A = new C81638a((byte) 0);

    /* renamed from: B */
    private C88411a f182537B = new C88411a();

    /* renamed from: C */
    private String f182538C = "";

    /* renamed from: D */
    private SparseArray f182539D;

    /* renamed from: a */
    public CrossPlatformWebView f182540a;

    /* renamed from: b */
    public FrameLayout f182541b;

    /* renamed from: c */
    public LinearLayout f182542c;

    /* renamed from: d */
    public View f182543d;

    /* renamed from: e */
    public TuxNavBar f182544e;

    /* renamed from: f */
    public SingleWebView f182545f;

    /* renamed from: g */
    public boolean f182546g;

    /* renamed from: h */
    public String f182547h;

    /* renamed from: i */
    public String f182548i;

    /* renamed from: j */
    public String f182549j;

    /* renamed from: k */
    public AbstractFutureC27655q<C81659a> f182550k;

    /* renamed from: l */
    AbstractC89171a<C89391z> f182551l;

    /* renamed from: m */
    public Runnable f182552m;

    /* renamed from: n */
    public boolean f182553n;

    /* renamed from: o */
    public long f182554o;

    /* renamed from: p */
    boolean f182555p;

    /* renamed from: q */
    public boolean f182556q;

    /* renamed from: r */
    public String f182557r = "";

    /* renamed from: s */
    public String f182558s = "";

    /* renamed from: t */
    String f182559t;

    /* renamed from: u */
    public boolean f182560u;

    /* renamed from: v */
    public boolean f182561v;

    /* renamed from: w */
    public boolean f182562w;

    /* renamed from: x */
    String f182563x = "";

    /* renamed from: y */
    int f182564y = -1;

    /* renamed from: z */
    String f182565z = "";

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$l */
    static final class C81653l implements DownloadListener {

        /* renamed from: a */
        public static final C81653l f182580a = new C81653l();

        static {
            Covode.recordClassIndex(95055);
        }

        C81653l() {
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$n */
    static final class C81655n<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C81655n f182582a = new C81655n();

        static {
            Covode.recordClassIndex(95057);
        }

        C81655n() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(95039);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f182539D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f182539D == null) {
            this.f182539D = new SparseArray();
        }
        View view = (View) this.f182539D.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f182539D.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$a */
    public static final class C81638a {
        static {
            Covode.recordClassIndex(95040);
        }

        private C81638a() {
        }

        public /* synthetic */ C81638a(byte b) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a1, code lost:
            if (r4 == null) goto L_0x01a3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m141514a(android.content.Context r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.util.Map<java.lang.String, java.lang.String> r24) {
            /*
            // Method dump skipped, instructions count: 788
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity.C81638a.m141514a(android.content.Context, java.lang.String, java.util.Map, java.util.Map):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$b */
    public static final class C81639b extends C27895a<Map<String, ? extends String>> {
        static {
            Covode.recordClassIndex(95041);
        }

        C81639b() {
        }
    }

    /* renamed from: a */
    public final void mo125305a(boolean z) {
        this.f182555p = z;
        if (C89361p.m154872a(this.f182548i, "Wiki", true)) {
            CrossPlatformWebView crossPlatformWebView = this.f182540a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("webView");
            }
            crossPlatformWebView.mo69921a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$i */
    static final class C81650i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182577a;

        static {
            Covode.recordClassIndex(95052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81650i(AddWikiActivity addWikiActivity) {
            super(0);
            this.f182577a = addWikiActivity;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f182577a.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final TuxNavBar mo125306b() {
        TuxNavBar tuxNavBar = this.f182544e;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        return tuxNavBar;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        AbstractC81915c.m141874a(new C37632e());
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        this.f182537B.mo142944a();
    }

    /* renamed from: f */
    private final String m141503f() {
        AnchorPublishStruct a = AnchorListManager.m70430a(this.f182564y, this.f182565z);
        if (a != null) {
            return AnchorListManager.m70431a(a);
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$h */
    static final class C81649h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182576a;

        static {
            Covode.recordClassIndex(95051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81649h(AddWikiActivity addWikiActivity) {
            super(0);
            this.f182576a = addWikiActivity;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AddWikiActivity addWikiActivity = this.f182576a;
            CrossPlatformWebView crossPlatformWebView = addWikiActivity.f182540a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("webView");
            }
            if (!crossPlatformWebView.mo69924b()) {
                addWikiActivity.finish();
            } else {
                AbstractC89171a<C89391z> aVar = addWikiActivity.f182551l;
                if (aVar != null) {
                    aVar.invoke();
                }
                CrossPlatformWebView crossPlatformWebView2 = addWikiActivity.f182540a;
                if (crossPlatformWebView2 == null) {
                    C89219l.m154710a("webView");
                }
                crossPlatformWebView2.mo69922a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$j */
    static final class C81651j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182578a;

        static {
            Covode.recordClassIndex(95053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81651j(AddWikiActivity addWikiActivity) {
            super(0);
            this.f182578a = addWikiActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AddWikiActivity addWikiActivity = this.f182578a;
            new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.fa_).mo37787a(new C81652k(addWikiActivity))).mo37800b().show(addWikiActivity.getSupportFragmentManager(), "more_panel");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final CrossPlatformWebView mo125302a() {
        CrossPlatformWebView crossPlatformWebView = this.f182540a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("webView");
        }
        return crossPlatformWebView;
    }

    /* renamed from: d */
    public final boolean mo125308d() {
        if (this.f182562w || C89361p.m154872a(this.f182548i, "Wiki", true) || C89361p.m154872a(this.f182548i, "Yelp", true) || C89361p.m154872a(this.f182548i, "TripAdvisor", true) || C89361p.m154872a(this.f182548i, "Quizlet", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final String mo125309e() {
        String str = "";
        if (TextUtils.isEmpty(str)) {
            SingleWebView singleWebView = this.f182545f;
            if (singleWebView == null) {
                C89219l.m154710a("singleWebView");
            }
            String title = singleWebView.getTitle();
            if (title != null) {
                str = title;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return this.f182558s;
        }
        return str;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        CrossPlatformWebView crossPlatformWebView = this.f182540a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("webView");
        }
        if (!crossPlatformWebView.mo69924b()) {
            super.onBackPressed();
            return;
        }
        AbstractC89171a<C89391z> aVar = this.f182551l;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f182540a;
        if (crossPlatformWebView2 == null) {
            C89219l.m154710a("webView");
        }
        crossPlatformWebView2.mo69922a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        SingleWebView singleWebView = this.f182545f;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.setDownloadListener(C81653l.f182580a);
        if (this.f182560u) {
            this.f182537B.mo142945a(AbstractC88979t.m154284a(500, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C81654m(this), C81655n.f182582a));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$o */
    public static final class C81656o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182583a;

        /* renamed from: b */
        final /* synthetic */ String f182584b;

        /* renamed from: c */
        final /* synthetic */ C33744d f182585c;

        static {
            Covode.recordClassIndex(95058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81656o(AddWikiActivity addWikiActivity, String str, C33744d dVar) {
            super(0);
            this.f182583a = addWikiActivity;
            this.f182584b = str;
            this.f182585c = dVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int type = EnumC31359ab.WIKIPEDIA.getTYPE();
            String b = new C27910f().mo46674b(new C37623a(this.f182584b, AddWikiActivity.m141501a(this.f182583a)));
            C89219l.m154716b(b, "");
            AbstractC81915c.m141874a(new C37609a(new C39053a(type, b, this.f182584b, null, 1, null, null, false, null, null, null, null, null, 8168, null)));
            this.f182583a.finish();
            C39162r.m79460a("add_wiki", this.f182585c.mo59983a("language", AddWikiActivity.m141501a(this.f182583a)).mo59983a("wiki_entry", this.f182584b).mo59983a("key_word", this.f182583a.f182547h).mo59980a("status", 1).mo59983a("content_source", m141527a(this.f182583a.getIntent(), "content_source")).mo59983a("content_type", m141527a(this.f182583a.getIntent(), "content_type")).f79943a);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private static String m141527a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public final void mo125307c() {
        String str;
        String str2;
        Boolean valueOf;
        String str3 = this.f182557r;
        if (C89361p.m154872a(this.f182548i, "Yelp", true) || C89361p.m154872a(this.f182548i, "TripAdvisor", true)) {
            str3 = C89361p.m154915b(str3, new String[]{" - "}).get(0);
        }
        C33744d dVar = new C33744d();
        String a = m141499a(getIntent(), "placeholder_enter_from");
        if (a == null || a.length() == 0) {
            str = "video_post_page";
        } else {
            str = m141499a(getIntent(), "placeholder_enter_from");
        }
        C33744d a2 = dVar.mo59983a("enter_from", str);
        String a3 = m141499a(getIntent(), "shoot_way");
        if (!(a3 == null || a3.length() == 0)) {
            a2.mo59983a("shoot_way", a3);
        }
        String a4 = m141499a(getIntent(), "creation_id");
        if (!(a4 == null || a4.length() == 0)) {
            a2.mo59983a("creation_id", a4);
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f182561v) {
            jSONObject.put("add_from", 2);
            CrossPlatformWebView crossPlatformWebView = this.f182540a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("webView");
            }
            String currentUrl = crossPlatformWebView.getCurrentUrl();
            if (currentUrl == null) {
                currentUrl = this.f182538C;
            }
            String e = mo125309e();
            int i = this.f182564y;
            String jSONObject2 = jSONObject.toString();
            C89219l.m154716b(jSONObject2, "");
            AbstractC81915c.m141874a(new C37609a(new C39053a(i, jSONObject2, e, null, 1, null, null, false, currentUrl, null, null, null, this.f182565z, 3816, null)));
            finish();
            C33744d a5 = a2.mo59983a("anchor_type", m141503f()).mo59983a("anchor_entry", e);
            AnchorPublishStruct a6 = AnchorListManager.m70430a(this.f182564y, this.f182565z);
            if (a6 == null || (valueOf = Boolean.valueOf(a6.hadNew)) == null || !valueOf.booleanValue()) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            C39162r.m79460a("choose_anchor", a5.mo59983a("new_tag", str2).mo59980a("status", 1).f79943a);
            return;
        }
        new C81656o(this, str3, a2).invoke();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        AbstractC81915c.m141874a(new C40565d(System.currentTimeMillis() - this.f182554o));
        if (this.f182540a != null) {
            CrossPlatformWebView crossPlatformWebView = this.f182540a;
            if (crossPlatformWebView == null) {
                C89219l.m154710a("webView");
            }
            crossPlatformWebView.mo69928d(this);
        }
        String a = m141499a(getIntent(), "enter_from");
        if (!(a == null || a.length() == 0) || this.f182562w) {
            String a2 = m141499a(getIntent(), "mob_extra");
            C33744d dVar = new C33744d();
            if (C89361p.m154872a(this.f182548i, "Yelp", true)) {
                C33744d a3 = dVar.mo59983a("enter_from", m141499a(getIntent(), "enter_from")).mo59983a("anchor_type", "Yelp").mo59983a("anchor_entry", m141499a(getIntent(), "anchor_entry")).mo59983a("author_id", m141499a(getIntent(), "author_id")).mo59983a("group_id", m141499a(getIntent(), "group_id")).mo59981a("duration", System.currentTimeMillis() - this.f182554o);
                C89219l.m154716b(a3, "");
                C39162r.m79460a("multi_anchor_stay_time", m141498a(a3, a2).f79943a);
            } else if (C89361p.m154872a(this.f182548i, "TripAdvisor", true)) {
                C33744d a4 = dVar.mo59983a("enter_from", m141499a(getIntent(), "enter_from")).mo59983a("anchor_type", "TripAdvisor").mo59983a("anchor_entry", m141499a(getIntent(), "anchor_entry")).mo59983a("author_id", m141499a(getIntent(), "author_id")).mo59983a("group_id", m141499a(getIntent(), "group_id")).mo59981a("duration", System.currentTimeMillis() - this.f182554o);
                C89219l.m154716b(a4, "");
                C39162r.m79460a("multi_anchor_stay_time", m141498a(a4, a2).f79943a);
            } else if (!this.f182560u) {
                C89219l.m154716b(dVar, "");
                C33744d a5 = mo125301a(dVar).mo59981a("duration", System.currentTimeMillis() - this.f182554o);
                C89219l.m154716b(a5, "");
                C39162r.m79460a("multi_anchor_stay_time", m141498a(a5, a2).f79943a);
            }
        }
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$e */
    public static final class C81644e implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182570a;

        /* renamed from: b */
        private boolean f182571b;

        static {
            Covode.recordClassIndex(95046);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
        }

        C81644e(AddWikiActivity addWikiActivity) {
            this.f182570a = addWikiActivity;
        }

        /* renamed from: a */
        private static String m141517a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        private static Object m141516a(AddWikiActivity addWikiActivity, String str) {
            Object obj;
            MethodCollector.m26663i(8966);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = addWikiActivity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = addWikiActivity.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = addWikiActivity.getSystemService(str);
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
                        MethodCollector.m26664o(8966);
                    }
                }
            } else {
                obj = addWikiActivity.getSystemService(str);
            }
            return obj;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            boolean z;
            String str2;
            boolean z2;
            String str3;
            this.f182570a.f182556q = false;
            FrameLayout frameLayout = this.f182570a.f182541b;
            if (frameLayout == null) {
                C89219l.m154710a("webViewMask");
            }
            frameLayout.setVisibility(8);
            if (this.f182571b) {
                this.f182570a.mo125304a((Object) "close", true);
                this.f182570a.mo125304a((Object) "back", true);
                this.f182570a.mo125304a((Object) "more", false);
                this.f182570a.mo125305a(false);
                String a = m141517a(this.f182570a.getIntent(), "enter_from");
                if (a != null && a.length() != 0) {
                    if (C89361p.m154872a(this.f182570a.f182548i, "Yelp", true)) {
                        C39162r.m79460a("request_anchor_detail", new C33744d().mo59983a("enter_from", m141517a(this.f182570a.getIntent(), "enter_from")).mo59983a("anchor_type", "Yelp").mo59983a("anchor_entry", m141517a(this.f182570a.getIntent(), "anchor_entry")).mo59983a("author_id", m141517a(this.f182570a.getIntent(), "author_id")).mo59983a("group_id", m141517a(this.f182570a.getIntent(), "group_id")).mo59980a("status", 0).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    } else if (C89361p.m154872a(this.f182570a.f182548i, "TripAdvisor", true)) {
                        C39162r.m79460a("request_anchor_detail", new C33744d().mo59983a("enter_from", m141517a(this.f182570a.getIntent(), "enter_from")).mo59983a("anchor_type", "TripAdvisor").mo59983a("anchor_entry", m141517a(this.f182570a.getIntent(), "anchor_entry")).mo59983a("author_id", m141517a(this.f182570a.getIntent(), "author_id")).mo59983a("group_id", m141517a(this.f182570a.getIntent(), "group_id")).mo59980a("status", 0).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    } else {
                        AddWikiActivity addWikiActivity = this.f182570a;
                        C33744d dVar = new C33744d();
                        C89219l.m154716b(dVar, "");
                        C39162r.m79460a("request_wiki_detail", addWikiActivity.mo125301a(dVar).mo59980a("status", 0).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    }
                }
            } else {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                String a2 = AddWikiActivity.m141500a(parse, "title");
                if (a2 == null || a2.length() == 0) {
                    a2 = this.f182570a.f182558s;
                }
                if ((a2 == null || a2.length() == 0) && (webView == null || (a2 = webView.getTitle()) == null)) {
                    a2 = "";
                }
                if (C89361p.m154872a(this.f182570a.f182548i, "Yelp", true) || C89361p.m154872a(this.f182570a.f182548i, "TripAdvisor", true) || C89361p.m154872a(this.f182570a.f182548i, "Quizlet", true)) {
                    z = true;
                } else {
                    z = C89361p.m154872a(AddWikiActivity.m141500a(parse, "addButton"), "true", true);
                }
                ISettingService v = SettingServiceImpl.m120782v();
                AddWikiActivity addWikiActivity2 = this.f182570a;
                String a3 = AddWikiActivity.m141500a(parse, "lang");
                if (a3 == null) {
                    a3 = v.mo108872h();
                }
                addWikiActivity2.f182549j = a3;
                if (C89361p.m154872a(this.f182570a.f182548i, "TripAdvisor", true)) {
                    str2 = C89361p.m154915b(a2, new String[]{" - "}).get(0);
                } else {
                    str2 = a2;
                }
                if (!C89361p.m154872a(this.f182570a.f182548i, "TripAdvisor", true)) {
                    C89361p.m154872a(this.f182570a.f182548i, "Yelp", true);
                }
                AbstractFutureC27655q<C81659a> qVar = null;
                if (C89219l.m154714a((Object) this.f182570a.f182548i, (Object) "Wiki")) {
                    AddWikiActivity addWikiActivity3 = this.f182570a;
                    if ((z || addWikiActivity3.f182561v) && str2.length() > 0) {
                        qVar = CheckAnchorModerationService.C81658a.m141528a(0, this.f182570a.mo125302a().getCurrentUrl(), str2, AddWikiActivity.m141501a(this.f182570a), null);
                    }
                    addWikiActivity3.f182550k = qVar;
                }
                String a4 = m141517a(this.f182570a.getIntent(), "enter_from");
                if (!(a2 == null || a2.length() == 0 || (a4 != null && a4.length() != 0 && (str3 = this.f182570a.f182557r) != null && str3.length() != 0))) {
                    this.f182570a.f182557r = a2;
                    TuxNavBar b = this.f182570a.mo125306b();
                    C23194g a5 = new C23194g().mo37753a(a2);
                    String string = this.f182570a.getString(R.string.to);
                    C89219l.m154716b(string, "");
                    b.mo37725a(a5.mo37754b(C89361p.m154869a(string, "%@", AddWikiActivity.m141502a(str), false)));
                }
                this.f182570a.f182547h = AddWikiActivity.m141500a(parse, "keyword");
                this.f182570a.f182546g = C89361p.m154872a(AddWikiActivity.m141500a(parse, "noRedirect"), "true", true);
                if (!this.f182570a.f182560u) {
                    this.f182570a.mo125303a(parse);
                }
                this.f182570a.f182552m = null;
                AddWikiActivity addWikiActivity4 = this.f182570a;
                if (C89361p.m154872a(addWikiActivity4.f182548i, "Yelp", true)) {
                    CrossPlatformWebView crossPlatformWebView = addWikiActivity4.f182540a;
                    if (crossPlatformWebView == null) {
                        C89219l.m154710a("webView");
                    }
                    String str4 = "javascript:(function extra(){" + "[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');" + "document.getElementById('smart-banner').style.display = 'none';" + "document.getElementById('fullscreen-pitch').style.display = 'none';" + "[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());" + "})();";
                    C89219l.m154716b(str4, "");
                    z2 = false;
                    CrossPlatformWebView.m82144a(crossPlatformWebView, str4, false, null, 6);
                } else if (C89361p.m154872a(addWikiActivity4.f182548i, "TripAdvisor", true)) {
                    CrossPlatformWebView crossPlatformWebView2 = addWikiActivity4.f182540a;
                    if (crossPlatformWebView2 == null) {
                        C89219l.m154710a("webView");
                    }
                    String str5 = "javascript:(function extra(){" + "[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');" + "})();";
                    C89219l.m154716b(str5, "");
                    z2 = false;
                    CrossPlatformWebView.m82144a(crossPlatformWebView2, str5, false, null, 6);
                } else {
                    z2 = false;
                }
                this.f182570a.mo125305a(z2);
                if (!(a4 == null || a4.length() == 0)) {
                    if (C89361p.m154872a(this.f182570a.f182548i, "Yelp", true)) {
                        C39162r.m79460a("request_anchor_detail", new C33744d().mo59983a("enter_from", m141517a(this.f182570a.getIntent(), "enter_from")).mo59983a("anchor_type", "Yelp").mo59983a("anchor_entry", m141517a(this.f182570a.getIntent(), "anchor_entry")).mo59983a("author_id", m141517a(this.f182570a.getIntent(), "author_id")).mo59983a("group_id", m141517a(this.f182570a.getIntent(), "group_id")).mo59980a("status", 1).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    } else if (C89361p.m154872a(this.f182570a.f182548i, "TripAdvisor", true)) {
                        C39162r.m79460a("request_anchor_detail", new C33744d().mo59983a("enter_from", m141517a(this.f182570a.getIntent(), "enter_from")).mo59983a("anchor_type", "TripAdvisor").mo59983a("anchor_entry", m141517a(this.f182570a.getIntent(), "anchor_entry")).mo59983a("author_id", m141517a(this.f182570a.getIntent(), "author_id")).mo59983a("group_id", m141517a(this.f182570a.getIntent(), "group_id")).mo59980a("status", 1).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    } else if (C89361p.m154872a(this.f182570a.f182548i, "Quizlet", true)) {
                        C39162r.m79460a("request_anchor_detail", new C33744d().mo59983a("enter_from", m141517a(this.f182570a.getIntent(), "enter_from")).mo59983a("anchor_type", "Quizlet").mo59983a("anchor_entry", m141517a(this.f182570a.getIntent(), "anchor_entry")).mo59983a("author_id", m141517a(this.f182570a.getIntent(), "author_id")).mo59983a("group_id", m141517a(this.f182570a.getIntent(), "group_id")).mo59980a("status", 1).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    } else {
                        AddWikiActivity addWikiActivity5 = this.f182570a;
                        C33744d dVar2 = new C33744d();
                        C89219l.m154716b(dVar2, "");
                        C39162r.m79460a("request_wiki_detail", addWikiActivity5.mo125301a(dVar2).mo59980a("status", 1).mo59981a("duration", System.currentTimeMillis() - this.f182570a.f182554o).f79943a);
                    }
                }
                if (this.f182570a.f182553n) {
                    this.f182570a.f182553n = false;
                    Object a6 = m141516a(this.f182570a, "input_method");
                    Objects.requireNonNull(a6, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) a6;
                    SingleWebView singleWebView = this.f182570a.f182545f;
                    if (singleWebView == null) {
                        C89219l.m154710a("singleWebView");
                    }
                    inputMethodManager.showSoftInput(singleWebView, 1);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f182571b = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            this.f182571b = false;
            if (C89219l.m154714a((Object) m141517a(this.f182570a.getIntent(), "anchor_type"), (Object) "News")) {
                String str2 = this.f182570a.f182558s;
                if (str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (webView == null || (str2 = webView.getTitle()) == null)) {
                    str2 = "";
                }
                this.f182570a.f182557r = str2;
                TuxNavBar b = this.f182570a.mo125306b();
                C23194g a = new C23194g().mo37753a(str2);
                String string = this.f182570a.getString(R.string.to);
                C89219l.m154716b(string, "");
                b.mo37725a(a.mo37754b(C89361p.m154869a(string, "%@", AddWikiActivity.m141502a(str), false)));
                AddWikiActivity addWikiActivity = this.f182570a;
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                addWikiActivity.mo125303a(parse);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                this.f182571b = true;
            }
        }
    }

    public final void setStatusBar(View view) {
        C89219l.m154721d(view, "");
        this.f182543d = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$p */
    public static final class C81657p extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f182586a;

        static {
            Covode.recordClassIndex(95059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81657p(boolean z) {
            super(1);
            this.f182586a = z;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            ((C23187b) cVar2).f54933e = this.f182586a;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$c */
    public static final class C81640c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182566a;

        static {
            Covode.recordClassIndex(95042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81640c(AddWikiActivity addWikiActivity) {
            super(1);
            this.f182566a = addWikiActivity;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.hbu, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity.C81640c.C816411 */

                /* renamed from: a */
                final /* synthetic */ C81640c f182567a;

                static {
                    Covode.recordClassIndex(95043);
                }

                {
                    this.f182567a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C39162r.m79460a("add_anyway_anchor", new C33744d().mo59983a("anchor_type", this.f182567a.f182566a.f182548i).mo59983a("anchor_entry", this.f182567a.f182566a.f182557r).f79943a);
                    this.f182567a.f182566a.mo125307c();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity.C81640c.C816422 */

                /* renamed from: a */
                final /* synthetic */ C81640c f182568a;

                static {
                    Covode.recordClassIndex(95044);
                }

                {
                    this.f182568a = r2;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C39162r.m79460a("cancel_anchor", new C33744d().mo59983a("anchor_type", this.f182568a.f182566a.f182548i).mo59983a("anchor_entry", this.f182568a.f182566a.f182557r).f79943a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$f */
    static final class C81645f extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C81645f f182572a = new C81645f();

        static {
            Covode.recordClassIndex(95047);
        }

        C81645f() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C816461.f182573a);
            baseActivityViewModel2.config(C816472.f182574a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m141501a(AddWikiActivity addWikiActivity) {
        String str = addWikiActivity.f182549j;
        if (str == null) {
            C89219l.m154710a("language");
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$k */
    static final class C81652k extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182579a;

        static {
            Covode.recordClassIndex(95054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81652k(AddWikiActivity addWikiActivity) {
            super(1);
            this.f182579a = addWikiActivity;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            C39162r.m79460a("tns_tiktok_3Pchanor_report_click", new C33744d().mo59983a("anchor_id", m141526a(this.f182579a.getIntent(), "anchor_id")).f79943a);
            Uri.Builder builder = new Uri.Builder();
            builder.appendQueryParameter("report_type", "third_party_anchor").appendQueryParameter("object_id", m141526a(this.f182579a.getIntent(), "group_id")).appendQueryParameter("owner_id", m141526a(this.f182579a.getIntent(), "author_id")).appendQueryParameter("anchor_id", m141526a(this.f182579a.getIntent(), "anchor_id")).appendQueryParameter("report_url", m141526a(this.f182579a.getIntent(), "url"));
            C39223a.m79587a().mo68688a(this.f182579a, builder);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        private static String m141526a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static String m141502a(String str) {
        String str2;
        AbstractC89345j find$default;
        String b;
        String a;
        List<String> b2;
        if (str == null || (find$default = C89350l.find$default(new C89350l("https://.+/"), str, 0, 2, null)) == null || (b = find$default.mo143720b()) == null || (a = C89361p.m154821a(b, 8)) == null || (b2 = C89361p.m154915b(a, new String[]{"/"})) == null || (str2 = b2.get(0)) == null) {
            str2 = "";
        }
        return C89070n.m154551a(C89070n.m154573d((List) C89361p.m154915b(str2, new String[]{"."}), 2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$g */
    static final class View$OnClickListenerC81648g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182575a;

        static {
            Covode.recordClassIndex(95050);
        }

        View$OnClickListenerC81648g(AddWikiActivity addWikiActivity) {
            this.f182575a = addWikiActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
            if (r6.getCode() == 0) goto L_0x011a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 446
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity.View$OnClickListenerC81648g.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$m */
    static final class C81654m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182581a;

        static {
            Covode.recordClassIndex(95056);
        }

        C81654m(AddWikiActivity addWikiActivity) {
            this.f182581a = addWikiActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 393
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity.C81654m.accept(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final C33744d mo125301a(C33744d dVar) {
        C33744d a = dVar.mo59983a("enter_from", m141499a(getIntent(), "enter_from")).mo59983a("wiki_entry", m141499a(getIntent(), "wiki_entry")).mo59983a("author_id", m141499a(getIntent(), "author_id")).mo59983a("group_id", m141499a(getIntent(), "group_id")).mo59983a("language", m141499a(getIntent(), "language"));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo125303a(Uri uri) {
        boolean z = true;
        int i = 8;
        if (C89361p.m154872a(this.f182548i, "Yelp", true) || C89361p.m154872a(this.f182548i, "TripAdvisor", true)) {
            if (m141499a(getIntent(), "enter_from") == null) {
                LinearLayout linearLayout = this.f182542c;
                if (linearLayout == null) {
                    C89219l.m154710a("addBtn");
                }
                linearLayout.setVisibility(0);
                mo125304a("close", true);
                CrossPlatformWebView crossPlatformWebView = this.f182540a;
                if (crossPlatformWebView == null) {
                    C89219l.m154710a("webView");
                }
                mo125304a("back", crossPlatformWebView.mo69924b());
                mo125304a("more", false);
                return;
            }
            LinearLayout linearLayout2 = this.f182542c;
            if (linearLayout2 == null) {
                C89219l.m154710a("addBtn");
            }
            linearLayout2.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView2 = this.f182540a;
            if (crossPlatformWebView2 == null) {
                C89219l.m154710a("webView");
            }
            mo125304a("close", crossPlatformWebView2.mo69924b());
            mo125304a("back", true);
            mo125304a("more", mo125308d());
        } else if (C89361p.m154872a(this.f182548i, "Quizlet", true)) {
            if (m141499a(getIntent(), "enter_from") == null) {
                C89350l lVar = new C89350l(".*/tt/[0-9]*");
                String uri2 = uri.toString();
                C89219l.m154716b(uri2, "");
                if (lVar.matches(uri2)) {
                    LinearLayout linearLayout3 = this.f182542c;
                    if (linearLayout3 == null) {
                        C89219l.m154710a("addBtn");
                    }
                    linearLayout3.setVisibility(0);
                    mo125304a("close", true);
                    CrossPlatformWebView crossPlatformWebView3 = this.f182540a;
                    if (crossPlatformWebView3 == null) {
                        C89219l.m154710a("webView");
                    }
                    mo125304a("back", crossPlatformWebView3.mo69924b());
                    mo125304a("more", false);
                    return;
                }
            }
            LinearLayout linearLayout4 = this.f182542c;
            if (linearLayout4 == null) {
                C89219l.m154710a("addBtn");
            }
            linearLayout4.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView4 = this.f182540a;
            if (crossPlatformWebView4 == null) {
                C89219l.m154710a("webView");
            }
            mo125304a("close", crossPlatformWebView4.mo69924b());
            mo125304a("back", true);
            mo125304a("more", mo125308d());
        } else if (C89361p.m154872a(m141500a(uri, "hide_nav_bar"), "1", true)) {
            LinearLayout linearLayout5 = this.f182542c;
            if (linearLayout5 == null) {
                C89219l.m154710a("addBtn");
            }
            linearLayout5.setVisibility(8);
            View view = this.f182543d;
            if (view == null) {
                C89219l.m154710a("statusBar");
            }
            view.setVisibility(8);
            TuxNavBar tuxNavBar = this.f182544e;
            if (tuxNavBar == null) {
                C89219l.m154710a("navBar");
            }
            tuxNavBar.setVisibility(8);
        } else {
            View view2 = this.f182543d;
            if (view2 == null) {
                C89219l.m154710a("statusBar");
            }
            view2.setVisibility(0);
            TuxNavBar tuxNavBar2 = this.f182544e;
            if (tuxNavBar2 == null) {
                C89219l.m154710a("navBar");
            }
            tuxNavBar2.setVisibility(0);
            boolean a = C89361p.m154872a(m141500a(uri, "addButton"), "true", true);
            LinearLayout linearLayout6 = this.f182542c;
            if (linearLayout6 == null) {
                C89219l.m154710a("addBtn");
            }
            if (a) {
                i = 0;
            }
            linearLayout6.setVisibility(i);
            boolean z2 = !C89361p.m154872a(m141500a(uri, "close"), "false", true);
            mo125304a("close", z2);
            if (!(!C89361p.m154872a(m141500a(uri, "back"), "false", true)) && z2) {
                z = false;
            }
            mo125304a("back", z);
            mo125304a("more", mo125308d());
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        String str2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        activityConfiguration(C81645f.f182572a);
        super.onCreate(bundle);
        setContentView(R.layout.cj);
        View findViewById = findViewById(R.id.agg);
        C89219l.m154716b(findViewById, "");
        this.f182540a = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.agh);
        C89219l.m154716b(findViewById2, "");
        this.f182541b = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.gm);
        C89219l.m154716b(findViewById3, "");
        this.f182542c = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.e7_);
        C89219l.m154716b(findViewById4, "");
        this.f182543d = findViewById4;
        View findViewById5 = findViewById(R.id.h4);
        C89219l.m154716b(findViewById5, "");
        this.f182544e = (TuxNavBar) findViewById5;
        View findViewById6 = findViewById(R.id.gm);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new View$OnClickListenerC81648g(this));
        }
        CrossPlatformWebView crossPlatformWebView = this.f182540a;
        if (crossPlatformWebView == null) {
            C89219l.m154710a("webView");
        }
        SingleWebView a = ((AbstractC40746j) crossPlatformWebView.mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, "");
        this.f182545f = a;
        Uri data = getIntent().getData();
        if (data != null) {
            str = data.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "third_party_common_webview")) {
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                str2 = data2.getPath();
            } else {
                str2 = null;
            }
            this.f182560u = true;
            if (TextUtils.equals(str2, "/create")) {
                this.f182561v = true;
                String a2 = m141499a(getIntent(), "add_button_url_regex");
                if (a2 == null) {
                    a2 = "";
                }
                this.f182563x = a2;
                this.f182564y = getIntent().getIntExtra(StringSet.type, -1);
                String a3 = m141499a(getIntent(), "subtype");
                if (a3 == null) {
                    a3 = "";
                }
                this.f182565z = a3;
                String a4 = m141499a(getIntent(), "url");
                if (a4 == null) {
                    a4 = "";
                }
                this.f182538C = a4;
            } else if (TextUtils.equals(str2, "/show")) {
                this.f182562w = true;
            }
        }
        String a5 = m141499a(getIntent(), "anchor_type");
        if (a5 == null) {
            a5 = "";
        }
        this.f182548i = a5;
        if (a5.length() == 0) {
            String f = m141503f();
            if (f == null) {
                f = "";
            }
            this.f182548i = f;
        }
        if ((m141499a(getIntent(), "enter_from") != null && (C89361p.m154872a(this.f182548i, "Wiki", true) || C89361p.m154872a(this.f182548i, "Yelp", true) || C89361p.m154872a(this.f182548i, "TripAdvisor", true) || C89361p.m154872a(this.f182548i, "Quizlet", true))) || this.f182562w) {
            C39162r.m79460a("tns_tiktok_3Panchor_report_page_view", new C33744d().mo59983a("anchor_id", m141499a(getIntent(), "anchor_id")).f79943a);
        }
        this.f182554o = System.currentTimeMillis();
        String a6 = m141499a(getIntent(), "title");
        if (a6 == null) {
            a6 = "";
        }
        this.f182558s = a6;
        String a7 = m141499a(getIntent(), "url");
        if (a7 == null) {
            a7 = "";
        }
        C89219l.m154716b(a7, "");
        Uri parse = Uri.parse(a7);
        C89219l.m154716b(parse, "");
        if (!TextUtils.equals(parse.getScheme(), "https")) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
            return;
        }
        Uri parse2 = Uri.parse(a7);
        C89219l.m154716b(parse2, "");
        mo125303a(parse2);
        Uri parse3 = Uri.parse(a7);
        C89219l.m154716b(parse3, "");
        boolean a8 = C89361p.m154872a(m141500a(parse3, "noRedirect"), "true", true);
        this.f182556q = a8;
        if (a8) {
            FrameLayout frameLayout = this.f182541b;
            if (frameLayout == null) {
                C89219l.m154710a("webViewMask");
            }
            frameLayout.setVisibility(0);
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f182540a;
        if (crossPlatformWebView2 == null) {
            C89219l.m154710a("webView");
        }
        crossPlatformWebView2.setCustomWebViewStatus(new C81644e(this));
        CrossPlatformWebView crossPlatformWebView3 = this.f182540a;
        if (crossPlatformWebView3 == null) {
            C89219l.m154710a("webView");
        }
        crossPlatformWebView3.setShouldOverrideInterceptor(new C81643d(this));
        mo125305a(true);
        getIntent().putExtra("sec_link_scene", "anchors");
        CrossPlatformWebView crossPlatformWebView4 = this.f182540a;
        if (crossPlatformWebView4 == null) {
            C89219l.m154710a("webView");
        }
        CrossPlatformWebView.m82144a(crossPlatformWebView4, a7, false, null, 6);
        CrossPlatformWebView crossPlatformWebView5 = this.f182540a;
        if (crossPlatformWebView5 == null) {
            C89219l.m154710a("webView");
        }
        crossPlatformWebView5.requestFocus();
        CrossPlatformWebView crossPlatformWebView6 = this.f182540a;
        if (crossPlatformWebView6 == null) {
            C89219l.m154710a("webView");
        }
        this.f182559t = crossPlatformWebView6.getCurrentUrl();
        SingleWebView singleWebView = this.f182545f;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.requestFocus();
        this.f182553n = getIntent().getBooleanExtra("show_keyboard", false);
        C17175b.m31707a(this);
        Window window = getWindow();
        C89219l.m154716b(window, "");
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        decorView.setBackground(new ColorDrawable(C0643b.m2378c(this, R.color.a9)));
        CrossPlatformWebView crossPlatformWebView7 = this.f182540a;
        if (crossPlatformWebView7 == null) {
            C89219l.m154710a("webView");
        }
        ((DmtStatusView) crossPlatformWebView7.findViewById(R.id.awv)).mo27128a(0);
        CrossPlatformWebView crossPlatformWebView8 = this.f182540a;
        if (crossPlatformWebView8 == null) {
            C89219l.m154710a("webView");
        }
        SingleWebView singleWebView2 = crossPlatformWebView8.f95344a;
        if (singleWebView2 == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView2.controlGeolocationPermissions(false);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
        View view = this.f182543d;
        if (view == null) {
            C89219l.m154710a("statusBar");
        }
        view.setLayoutParams(layoutParams);
        TuxNavBar tuxNavBar = this.f182544e;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.setNavActions(new TuxNavBar.C23179a().mo37732a(new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37743a("back").mo37741a((AbstractC89171a<C89391z>) new C81649h(this))).mo37732a(new C23187b().mo37738a(R.raw.icon_x_mark).mo37743a("close").mo37741a((AbstractC89171a<C89391z>) new C81650i(this))).mo37733b(new C23187b().mo37738a(R.raw.icon_ellipsis_vertical).mo37743a("more").mo37741a((AbstractC89171a<C89391z>) new C81651j(this))).mo37731a(new C23194g()));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static String m141499a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$d */
    static final class C81643d extends AbstractC89220m implements AbstractC89183m<WebView, String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f182569a;

        static {
            Covode.recordClassIndex(95045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81643d(AddWikiActivity addWikiActivity) {
            super(2);
            this.f182569a = addWikiActivity;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(WebView webView, String str) {
            return Boolean.valueOf(m141515a(webView, str));
        }

        /* renamed from: a */
        private boolean m141515a(WebView webView, String str) {
            String str2;
            C89219l.m154721d(webView, "");
            C89219l.m154721d(str, "");
            if (this.f182569a.f182546g) {
                new C23144b(this.f182569a).mo37640e(R.string.b1s).mo37637b();
                return true;
            }
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            String scheme = parse.getScheme();
            boolean booleanExtra = this.f182569a.getIntent().getBooleanExtra("disable_app_link", true);
            String path = parse.getPath();
            if (path != null && C89361p.m154876c(path, ".apk", false)) {
                new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                return true;
            } else if (C89361p.m154872a(scheme, "intent", true)) {
                if (booleanExtra || this.f182569a.f182562w) {
                    new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                } else {
                    try {
                        AddWikiActivity addWikiActivity = this.f182569a;
                        Intent parseUri = Intent.parseUri(str, 1);
                        C89219l.m154716b(parseUri, "");
                        addWikiActivity.setIntent(parseUri);
                        this.f182569a.getIntent().addFlags(268435456);
                        Context context = this.f182569a.mo125302a().getContext();
                        C89219l.m154716b(context, "");
                        String packageName = context.getPackageName();
                        ComponentName component = this.f182569a.getIntent().getComponent();
                        if (component != null) {
                            str2 = component.getPackageName();
                        } else {
                            str2 = null;
                        }
                        if (C89219l.m154714a((Object) packageName, (Object) str2)) {
                            return true;
                        }
                        AddWikiActivity addWikiActivity2 = this.f182569a;
                        Intent intent = addWikiActivity2.getIntent();
                        C84349a.m145093a(intent, addWikiActivity2);
                        addWikiActivity2.startActivity(intent);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
                return true;
            } else if (C89361p.m154872a(scheme, "yelp", true)) {
                if (booleanExtra) {
                    new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                } else {
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.f182569a, str);
                }
                return true;
            } else if (C89361p.m154872a(scheme, "tripadvisor", true)) {
                if (booleanExtra) {
                    new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                } else {
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.f182569a, str);
                }
                return true;
            } else if (C89361p.m154872a(scheme, "market", true)) {
                new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                return true;
            } else if (!C89361p.m154872a(this.f182569a.f182548i, "Yelp", true) || !C89361p.m154908a((CharSequence) str, (CharSequence) "&deeplink=", true)) {
                this.f182569a.mo125305a(true);
                return false;
            } else {
                if (booleanExtra) {
                    new C23144b(this.f182569a).mo37640e(R.string.tg).mo37637b();
                } else {
                    String substring = str.substring(C89361p.m154888a((CharSequence) str, "&deeplink=", 0, false, 6) + 10, str.length());
                    C89219l.m154716b(substring, "");
                    int a = C89361p.m154888a((CharSequence) substring, "&", 0, false, 6);
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = substring.substring(0, a);
                    C89219l.m154716b(substring2, "");
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.f182569a, URLDecoder.decode(substring2, "UTF-8"));
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static String m141500a(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static C33744d m141498a(C33744d dVar, String str) {
        try {
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            for (Map.Entry entry : ((Map) c.mo123620b().mo46671a(str, new C81639b().type)).entrySet()) {
                C33744d a = dVar.mo59983a((String) entry.getKey(), (String) entry.getValue());
                C89219l.m154716b(a, "");
                dVar = a;
            }
        } catch (Exception unused) {
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo125304a(Object obj, boolean z) {
        TuxNavBar tuxNavBar = this.f182544e;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.mo37726a(obj, new C81657p(z));
    }
}
