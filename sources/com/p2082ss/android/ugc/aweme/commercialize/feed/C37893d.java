package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.room.AbstractC1533j;
import androidx.room.C1532i;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.p2141e.AbstractC29907c;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.dao.C37644a;
import com.p2082ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.experiment.C46870e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.IFeedItemList;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;
import com.p2082ss.android.ugc.aweme.utils.C80631v;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d */
public class C37893d implements AbstractC37877ba {

    /* renamed from: c */
    private static final String f89399c = C37893d.class.getSimpleName();

    /* renamed from: e */
    private static volatile C37893d f89400e;

    /* renamed from: f */
    private static AbstractC29907c<ShowAdDataBase> f89401f = new AbstractC29907c<ShowAdDataBase>() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37893d.C378941 */

        static {
            Covode.recordClassIndex(45346);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.p2082ss.android.p2141e.AbstractC29907c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ ShowAdDataBase mo52218a() {
            AbstractC1533j.C1534a a = C1532i.m5166a(C17867d.m33078a(), ShowAdDataBase.class, "showAd.db");
            a.f5046b = true;
            return a.mo5096a();
        }
    };

    /* renamed from: a */
    List<String> f89402a = new ArrayList();

    /* renamed from: b */
    private AbstractC53430a f89403b = new AbstractC53430a() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37893d.C378952 */

        static {
            Covode.recordClassIndex(45347);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a
        /* renamed from: a */
        public final C33594aj<Long> mo60117a() {
            return SharePrefCache.inst().getLastFilterTime();
        }
    };

    /* renamed from: d */
    private IFeedItemList f89404d;

    static {
        Covode.recordClassIndex(45345);
    }

    private C37893d() {
    }

    /* renamed from: b */
    static final /* synthetic */ Object m76715b() {
        try {
            ShowAdDataBase b = f89401f.mo52219b();
            if (b == null) {
                return null;
            }
            b.mo65594i().mo65598a();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C37893d m76713a() {
        MethodCollector.m26663i(8071);
        if (f89400e == null) {
            synchronized (C68765a.class) {
                try {
                    if (f89400e == null) {
                        f89400e = new C37893d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8071);
                    throw th;
                }
            }
        }
        C37893d dVar = f89400e;
        MethodCollector.m26664o(8071);
        return dVar;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m76714a(String str) {
        ShowAdDataBase b = f89401f.mo52219b();
        if (b == null) {
            return null;
        }
        try {
            b.mo65594i().mo65599a(new C37644a(str));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m76716b(String str) {
        try {
            ShowAdDataBase b = f89401f.mo52219b();
            if (b != null) {
                List<C37644a> a = b.mo65594i().mo65597a(str);
                if (C13603b.m24435a((Collection) a)) {
                    return false;
                }
                return a.contains(new C37644a(str));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37877ba
    /* renamed from: a */
    public final void mo65925a(IFeedItemList iFeedItemList) {
        int i;
        String str;
        if (iFeedItemList != null && !C13603b.m24435a((Collection) iFeedItemList.getItems())) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f89403b.mo90000b(currentTimeMillis)) {
                    this.f89402a.clear();
                    C1731i.m5640b(CallableC37898f.f89408a, C1731i.f5562a);
                }
                this.f89403b.mo89999a(currentTimeMillis);
                Iterator<Aweme> it = iFeedItemList.getItems().iterator();
                Context a = C17867d.m33078a();
                while (it.hasNext()) {
                    Aweme next = it.next();
                    if (next != null) {
                        if (C46870e.f109214b && C80631v.m139799b(next) && !C80631v.m139798a(next) && !C37699a.m76208K(next)) {
                            C58254p.f132679a.post(new Runnable() {
                                /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37893d.RunnableC378963 */

                                static {
                                    Covode.recordClassIndex(45348);
                                }

                                public final void run() {
                                    X2CAdWebPage x2CAdWebPage = (X2CAdWebPage) C58221f.m105149b(X2CAdWebPage.class);
                                    if (x2CAdWebPage.f91788a != null) {
                                        C40556v a = C40556v.m81851a();
                                        Activity activity = x2CAdWebPage.f91789b;
                                        X2CAdWebPage.C388611 r2 = new C40556v.AbstractC40558a() {
                                            /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.C388611 */

                                            static {
                                                Covode.recordClassIndex(46448);
                                            }

                                            @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v.AbstractC40558a
                                            /* renamed from: a */
                                            public final void mo67526a() {
                                                C58254p.f132679a.post(new Runnable() {
                                                    /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.C388611.RunnableC388621 */

                                                    static {
                                                        Covode.recordClassIndex(46449);
                                                    }

                                                    public final void run() {
                                                        MethodCollector.m26663i(6871);
                                                        if (X2CAdWebPage.this.f91789b == null) {
                                                            MethodCollector.m26664o(6871);
                                                            return;
                                                        }
                                                        final ViewGroup viewGroup = (ViewGroup) C1862a.m6032a(X2CAdWebPage.this.f91789b, R.layout.a0j, new FrameLayout(X2CAdWebPage.this.f91789b), false);
                                                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                                                            /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.C388611.RunnableC388621.RunnableC388631 */

                                                            static {
                                                                Covode.recordClassIndex(46450);
                                                            }

                                                            public final void run() {
                                                                if (X2CAdWebPage.this.f91789b != null) {
                                                                    ((CrossPlatformWebView) viewGroup.findViewById(R.id.fii)).mo69914a((Context) X2CAdWebPage.this.f91789b, true);
                                                                    X2CAdWebPage.this.f91791d.offer(viewGroup);
                                                                }
                                                            }
                                                        });
                                                        MethodCollector.m26664o(6871);
                                                    }
                                                });
                                            }
                                        };
                                        if (activity != null && a.f94896b.size() <= a.f94898d) {
                                            new Handler(Looper.getMainLooper()).post(new Runnable(activity, r2) {
                                                /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v.RunnableC405571 */

                                                /* renamed from: a */
                                                final /* synthetic */ Activity f94901a;

                                                /* renamed from: b */
                                                final /* synthetic */ AbstractC40558a f94902b;

                                                static {
                                                    Covode.recordClassIndex(48378);
                                                }

                                                public final void run() {
                                                    Looper.myQueue().addIdleHandler(new C40561y(this, this.f94901a, this.f94902b));
                                                }

                                                {
                                                    this.f94901a = r2;
                                                    this.f94902b = r3;
                                                }
                                            });
                                        }
                                        if (!x2CAdWebPage.f91790c) {
                                            x2CAdWebPage.f91790c = true;
                                        }
                                    }
                                }
                            });
                        }
                        if (next.isAd()) {
                            boolean z = false;
                            if (next.isAd()) {
                                String aid = next.getAid();
                                if (!TextUtils.isEmpty(aid)) {
                                    if (!next.getAwemeRawAd().isDiableAdShowFilter()) {
                                        z = this.f89402a.contains(aid) ? true : m76716b(aid);
                                    }
                                }
                            }
                            String str2 = "1";
                            if (z) {
                                it.remove();
                                if (C37699a.m76268an(next)) {
                                    C38189j.m77485a(a, next, C17975i.m33464b("8"));
                                    C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "show_failed", next.getAwemeRawAd()).mo28897a("ad_show_fail_type", "8");
                                    if (!C17975i.f42802b) {
                                        str2 = "2";
                                    }
                                    a2.mo28897a("awemelaunch", str2).mo28902c();
                                }
                                if (next.isAd()) {
                                    C38189j.m77477a(a, next, 1);
                                    C18129a.m33746a("draw_ad", "item_repeat", next.getAwemeRawAd()).mo28897a("filter_reason", 1).mo28902c();
                                }
                            } else if (this.f89404d != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                                String aid2 = next.getAid();
                                for (Aweme aweme : this.f89404d.getItems()) {
                                    if (aweme != null && TextUtils.equals(aid2, aweme.getAid())) {
                                        it.remove();
                                        if (C37699a.m76268an(next)) {
                                            C38189j.m77485a(a, next, C17975i.m33464b("8"));
                                            C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "show_failed", next.getAwemeRawAd()).mo28897a("ad_show_fail_type", "8");
                                            if (C17975i.f42802b) {
                                                str = str2;
                                            } else {
                                                str = "2";
                                            }
                                            a3.mo28897a("awemelaunch", str).mo28902c();
                                        }
                                        int i2 = 2;
                                        if (aweme.isAd()) {
                                            i = 1;
                                        } else {
                                            i = 2;
                                        }
                                        C38189j.m77477a(a, next, i);
                                        C18129a.C18130a a4 = C18129a.m33746a("draw_ad", "item_repeat", next.getAwemeRawAd());
                                        if (aweme.isAd()) {
                                            i2 = 1;
                                        }
                                        a4.mo28897a("filter_reason", Integer.valueOf(i2)).mo28902c();
                                    }
                                }
                            }
                        }
                    }
                }
                this.f89404d = iFeedItemList;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
