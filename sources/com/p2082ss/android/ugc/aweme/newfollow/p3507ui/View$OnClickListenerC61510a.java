package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.tooltip.C42536d;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.metrics.C59226b;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a */
public final class View$OnClickListenerC61510a implements View.OnClickListener {

    /* renamed from: a */
    public final ActivityC0945e f139626a;

    /* renamed from: b */
    public final String f139627b = "tooltip_is_new_user";

    /* renamed from: c */
    public final String f139628c = "first_visit_discover";

    /* renamed from: d */
    public final String f139629d = "tooltip_shown";

    /* renamed from: e */
    public final Context f139630e;

    static {
        Covode.recordClassIndex(72173);
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a$a */
    static final class CallableC61511a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC61511a f139631a = new CallableC61511a();

        static {
            Covode.recordClassIndex(72174);
        }

        CallableC61511a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29823c.m60080a(C17867d.m33078a(), "discovery", "click");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a$b */
    public static final class CallableC61512b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61510a f139632a;

        /* renamed from: b */
        final /* synthetic */ String f139633b;

        /* renamed from: c */
        final /* synthetic */ String f139634c;

        /* renamed from: d */
        final /* synthetic */ String f139635d;

        /* renamed from: e */
        final /* synthetic */ String f139636e;

        static {
            Covode.recordClassIndex(72175);
        }

        CallableC61512b(View$OnClickListenerC61510a aVar, String str, String str2, String str3, String str4) {
            this.f139632a = aVar;
            this.f139633b = str;
            this.f139634c = str2;
            this.f139635d = str3;
            this.f139636e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79460a(this.f139633b, new C33744d().mo59983a("previous_page", "homepage_hot").mo59983a("enter_method", this.f139634c).mo59983a("group_id", this.f139635d).mo59983a("author_id", this.f139636e).mo59980a(this.f139632a.f139627b, C42536d.C42537a.m85039d()).mo59980a(this.f139632a.f139628c, C42536d.C42537a.m85037c()).mo59980a(this.f139632a.f139629d, C42536d.C42537a.m85040e()).f79943a);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a$c */
    public static final class CallableC61513c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC61510a f139637a;

        /* renamed from: b */
        final /* synthetic */ String f139638b;

        /* renamed from: c */
        final /* synthetic */ String f139639c;

        /* renamed from: d */
        final /* synthetic */ String f139640d;

        /* renamed from: e */
        final /* synthetic */ String f139641e;

        static {
            Covode.recordClassIndex(72176);
        }

        CallableC61513c(View$OnClickListenerC61510a aVar, String str, String str2, String str3, String str4) {
            this.f139637a = aVar;
            this.f139638b = str;
            this.f139639c = str2;
            this.f139640d = str3;
            this.f139641e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = this.f139638b;
            int hashCode = str2.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode != 2223327) {
                    if (hashCode == 2614219 && str2.equals("USER")) {
                        str = "personal_homepage";
                        C42536d.C42537a.m85038c(str);
                        C39162r.m79460a(this.f139640d, new C33744d().mo59983a("previous_page", str).mo59983a("enter_method", this.f139641e).mo59980a(this.f139637a.f139627b, C42536d.C42537a.m85039d()).mo59980a(this.f139637a.f139628c, C42536d.C42537a.m85037c()).mo59980a(this.f139637a.f139629d, C42536d.C42537a.m85040e()).f79943a);
                        return null;
                    }
                } else if (str2.equals("HOME")) {
                    str = this.f139639c;
                    C42536d.C42537a.m85038c(str);
                    C39162r.m79460a(this.f139640d, new C33744d().mo59983a("previous_page", str).mo59983a("enter_method", this.f139641e).mo59980a(this.f139637a.f139627b, C42536d.C42537a.m85039d()).mo59980a(this.f139637a.f139628c, C42536d.C42537a.m85037c()).mo59980a(this.f139637a.f139629d, C42536d.C42537a.m85040e()).f79943a);
                    return null;
                }
            } else if (str2.equals("NOTIFICATION")) {
                str = "message";
                C42536d.C42537a.m85038c(str);
                C39162r.m79460a(this.f139640d, new C33744d().mo59983a("previous_page", str).mo59983a("enter_method", this.f139641e).mo59980a(this.f139637a.f139627b, C42536d.C42537a.m85039d()).mo59980a(this.f139637a.f139628c, C42536d.C42537a.m85037c()).mo59980a(this.f139637a.f139629d, C42536d.C42537a.m85040e()).f79943a);
                return null;
            }
            str = "";
            C42536d.C42537a.m85038c(str);
            C39162r.m79460a(this.f139640d, new C33744d().mo59983a("previous_page", str).mo59983a("enter_method", this.f139641e).mo59980a(this.f139637a.f139627b, C42536d.C42537a.m85039d()).mo59980a(this.f139637a.f139628c, C42536d.C42537a.m85037c()).mo59980a(this.f139637a.f139629d, C42536d.C42537a.m85040e()).f79943a);
            return null;
        }
    }

    public View$OnClickListenerC61510a(Context context) {
        C89219l.m154721d(context, "");
        this.f139630e = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f139626a = (ActivityC0945e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        TabChangeManager a = TabChangeManager.C59002a.m108439a(this.f139626a);
        ScrollSwitchStateManager a2 = ScrollSwitchStateManager.C52950a.m97811a(this.f139626a);
        AVExternalServiceImpl.m113114a().enterFromService().setEnterFrom("DISCOVER");
        C61542b.m111463a(false);
        C58949c.f134187a = false;
        C58945a.C58947b.f134185a.f134176c = false;
        C58945a.C58947b.f134185a.f134180g = false;
        C61515c cVar = null;
        C68909c.f154156d = null;
        String str = a.f134312d;
        MainPageFragmentImpl.m43110j().mo37211c();
        if (!C89219l.m154714a((Object) "DISCOVER", (Object) a.f134312d)) {
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82125d);
            Hox.C15490a.m28529a(this.f139626a).mo25211b("DISCOVER", bundle);
            C81079v.m140776O().mo123908B();
            C80749k.m140049a().mo123953b();
            C59101a.m108579b(this.f139626a);
            a2.mo89345a(false);
            MainPageFragmentImpl.m43110j().mo37212d();
            MainPageFragmentImpl.m43110j().mo37202a((Context) this.f139626a);
            C18285c.m34003a("discovery_trigger_net");
            C18285c.m34003a("discovery_cost_time");
            C35434c.m72461a("discover_page");
            Fragment b = a.mo96536b();
            if (b instanceof C61515c) {
                cVar = (C61515c) b;
            }
            if (DiscoveryServiceImpl.m83414g().mo70767f()) {
                C1870c.m6049a(this.f139630e, (int) R.layout.xx);
                C1870c.m6049a(this.f139630e, (int) R.layout.xm);
            }
            if (cVar != null) {
                if (cVar.mo99171e() != null) {
                    cVar.mo99171e();
                    if (str != null) {
                        m111388a(str, "enter_discovery_page");
                    }
                } else if (cVar.mo99172g() != null) {
                    if (str != null) {
                        m111388a(str, "enter_discovery_page");
                    }
                    C49907s.m93686a(EnumC48310af.DISCOVER);
                } else if (!C80580in.m139687c() && str != null) {
                    m111388a(str, "enter_discovery_page");
                }
            }
        }
        C1731i.m5640b(CallableC61511a.f139631a, C39162r.m79452a());
        AbstractC81915c.m141874a(new C49679g());
    }

    /* renamed from: a */
    private final void m111388a(String str, String str2) {
        String str3;
        if (TextUtils.equals("enter_discovery_page", str2)) {
            str3 = "click_discovery_tab";
        } else {
            str3 = "click_follow_tab";
        }
        String e = MainPageFragmentImpl.m43110j().mo37213e();
        if (!TextUtils.equals(str, "HOME") || !TextUtils.equals(e, "homepage_hot")) {
            C1731i.m5640b(new CallableC61513c(this, str, e, str2, str3), C39162r.m79452a());
            return;
        }
        C1731i.m5640b(new CallableC61512b(this, str2, str3, C59226b.f135142a, C59226b.f135143b), C39162r.m79452a());
        C42536d.C42537a.m85038c("homepage_hot");
    }
}
