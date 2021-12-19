package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.C17299b;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.DialogC44308d;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.AbstractC44600c;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.C44596a;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.C44598b;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.C44602d;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.Logger;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.p2847vm.OrderTabViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.EntranceData;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.Icon;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.view.C44621a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45263i;
import com.p2082ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity */
public final class OrderCenterActivity extends AbstractActivityC44311b {

    /* renamed from: f */
    public static final C44559a f103975f = new C44559a((byte) 0);

    /* renamed from: a */
    public long f103976a = SystemClock.uptimeMillis();

    /* renamed from: b */
    public long f103977b;

    /* renamed from: c */
    public long f103978c;

    /* renamed from: d */
    public long f103979d;

    /* renamed from: e */
    public AbstractC44576e f103980e;

    /* renamed from: h */
    private SparseArray f103981h;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d */
    static final class C44566d extends AbstractC44576e {

        /* renamed from: e */
        public static final C44567a f103996e = new C44567a((byte) 0);

        /* renamed from: a */
        public final Logger f103997a;

        /* renamed from: b */
        public OrderCenterAdapter f103998b;

        /* renamed from: c */
        public RtlViewPager f103999c;

        /* renamed from: d */
        public TuxNavBar f104000d;

        /* renamed from: o */
        private final AbstractC89244h f104001o;

        /* renamed from: p */
        private final AbstractC89244h f104002p;

        /* renamed from: q */
        private final AbstractC89244h f104003q;

        /* renamed from: r */
        private IEventCenter.AbstractC45375b f104004r;

        static {
            Covode.recordClassIndex(52930);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$a */
        public static final class C44567a {
            static {
                Covode.recordClassIndex(52931);
            }

            private C44567a() {
            }

            public /* synthetic */ C44567a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: c */
        public final Logger mo75634c() {
            return this.f103997a;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$e */
        static final class RunnableC44573e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DmtTabLayout f104012a;

            static {
                Covode.recordClassIndex(52937);
            }

            RunnableC44573e(DmtTabLayout dmtTabLayout) {
                this.f104012a = dmtTabLayout;
            }

            public final void run() {
                DmtTabLayout dmtTabLayout = this.f104012a;
                C89219l.m154716b(dmtTabLayout, "");
                C17299b.m32026a(dmtTabLayout);
            }
        }

        /* renamed from: b */
        public final OrderCenterAdapter mo75633b() {
            OrderCenterAdapter orderCenterAdapter = this.f103998b;
            if (orderCenterAdapter == null) {
                C89219l.m154710a("adapter");
            }
            return orderCenterAdapter;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: e */
        public final void mo75636e() {
            super.mo75636e();
            this.f104016f.f103976a = 0;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: f */
        public final C33103x mo75637f() {
            C33103x xVar = new C33103x(0, false, false, 7);
            xVar.f78673g = R.color.nc;
            xVar.f78667a = true;
            return xVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$b */
        static final class C44568b extends AbstractC89220m implements AbstractC89171a<C23187b> {

            /* renamed from: a */
            final /* synthetic */ C44566d f104005a;

            /* renamed from: b */
            final /* synthetic */ OrderCenterActivity f104006b;

            static {
                Covode.recordClassIndex(52932);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44568b(C44566d dVar, OrderCenterActivity orderCenterActivity) {
                super(0);
                this.f104005a = dVar;
                this.f104006b = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C23187b invoke() {
                C23187b a = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
                a.f54930b = true;
                return a.mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.C44566d.C44568b.C445691 */

                    /* renamed from: a */
                    final /* synthetic */ C44568b f104007a;

                    static {
                        Covode.recordClassIndex(52933);
                    }

                    {
                        this.f104007a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f104007a.f104006b.onBackPressed();
                        Logger logger = this.f104007a.f104005a.f103997a;
                        OrderCenterAdapter.C44590c a = this.f104007a.f104005a.mo75633b().mo75641a();
                        C89219l.m154721d(a, "");
                        new C44602d().mo75661a(logger.f104065a).mo75663b(a.f104048b).mo75665c(a.f104050d).mo75666d("back").mo76747d();
                        return C89391z.f203057a;
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$c */
        static final class C44570c extends AbstractC89220m implements AbstractC89171a<C23187b> {

            /* renamed from: a */
            final /* synthetic */ C44566d f104008a;

            /* renamed from: b */
            final /* synthetic */ OrderCenterActivity f104009b;

            static {
                Covode.recordClassIndex(52934);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44570c(C44566d dVar, OrderCenterActivity orderCenterActivity) {
                super(0);
                this.f104008a = dVar;
                this.f104009b = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C23187b invoke() {
                C23187b a = new C23187b().mo37738a(R.raw.icon_3_lines_horizontal_2);
                a.f54930b = true;
                return a.mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.C44566d.C44570c.C445711 */

                    /* renamed from: a */
                    final /* synthetic */ C44570c f104010a;

                    static {
                        Covode.recordClassIndex(52935);
                    }

                    {
                        this.f104010a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        Logger logger = this.f104010a.f104008a.f103997a;
                        OrderCenterAdapter.C44590c a = this.f104010a.f104008a.mo75633b().mo75641a();
                        C89219l.m154721d(a, "");
                        new C44602d().mo75661a(logger.f104065a).mo75663b(a.f104048b).mo75665c(a.f104050d).mo75666d("more").mo76747d();
                        AbstractC0952i supportFragmentManager = this.f104010a.f104009b.getSupportFragmentManager();
                        C89219l.m154716b(supportFragmentManager, "");
                        if (!supportFragmentManager.mo3566g() && !supportFragmentManager.mo3567h()) {
                            new C44560b().show(supportFragmentManager, "");
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$g */
        static final class C44575g extends AbstractC89220m implements AbstractC89171a<C23194g> {

            /* renamed from: a */
            final /* synthetic */ OrderCenterActivity f104015a;

            static {
                Covode.recordClassIndex(52939);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44575g(OrderCenterActivity orderCenterActivity) {
                super(0);
                this.f104015a = orderCenterActivity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C23194g invoke() {
                C23194g gVar = new C23194g();
                String string = this.f104015a.getString(R.string.fu5);
                C89219l.m154716b(string, "");
                return gVar.mo37753a(string);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: d */
        public final int mo75635d() {
            OrderCenterAdapter orderCenterAdapter = this.f103998b;
            if (orderCenterAdapter == null) {
                C89219l.m154710a("adapter");
            }
            DmtTabLayout dmtTabLayout = orderCenterAdapter.f104024a;
            C89219l.m154716b(dmtTabLayout, "");
            return dmtTabLayout.getSelectedTabPosition();
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: g */
        public final void mo75638g() {
            super.mo75638g();
            RtlViewPager rtlViewPager = this.f103999c;
            if (rtlViewPager == null) {
                C89219l.m154710a("viewPager");
            }
            rtlViewPager.setOffscreenPageLimit(2);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: h */
        public final void mo75639h() {
            super.mo75639h();
            IEventCenter.AbstractC45375b bVar = this.f104004r;
            if (bVar != null) {
                IEventCenter a = EventCenter.m87158a();
                a.mo75481b("ec_order_list_api_duration", bVar);
                a.mo75481b("ec_order_center_tab_change", bVar);
                this.f104004r = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r0 == null) goto L_0x002b;
         */
        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo75631a() {
            /*
            // Method dump skipped, instructions count: 332
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.C44566d.mo75631a():void");
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$d */
        static final class C44572d<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C44566d f104011a;

            static {
                Covode.recordClassIndex(52936);
            }

            C44572d(C44566d dVar) {
                this.f104011a = dVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                boolean z;
                List list = (List) obj;
                C44566d dVar = this.f104011a;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo75632a(!z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44566d(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity);
            C89219l.m154721d(orderCenterActivity, "");
            AbstractC1196i lifecycle = orderCenterActivity.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            this.f103997a = new Logger(lifecycle);
            this.f104001o = C89250i.m154773a((AbstractC89171a) new C44568b(this, orderCenterActivity));
            this.f104002p = C89250i.m154773a((AbstractC89171a) new C44575g(orderCenterActivity));
            this.f104003q = C89250i.m154773a((AbstractC89171a) new C44570c(this, orderCenterActivity));
            this.f104004r = new C44574f(this, orderCenterActivity);
        }

        /* renamed from: a */
        public final void mo75632a(boolean z) {
            TuxNavBar tuxNavBar = this.f104000d;
            if (tuxNavBar == null) {
                C89219l.m154710a("titlebar");
            }
            TuxNavBar.C23179a a = new TuxNavBar.C23179a().mo37732a((C23187b) this.f104001o.getValue()).mo37731a((C23194g) this.f104002p.getValue());
            if (z) {
                a.mo37733b((C23187b) this.f104003q.getValue());
            }
            tuxNavBar.setNavActions(a);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$d$f */
        public static final class C44574f implements IEventCenter.AbstractC45375b {

            /* renamed from: a */
            final /* synthetic */ C44566d f104013a;

            /* renamed from: b */
            final /* synthetic */ OrderCenterActivity f104014b;

            static {
                Covode.recordClassIndex(52938);
            }

            C44574f(C44566d dVar, OrderCenterActivity orderCenterActivity) {
                this.f104013a = dVar;
                this.f104014b = orderCenterActivity;
            }

            @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
            /* renamed from: a */
            public final void mo74032a(String str, String str2) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                int hashCode = str.hashCode();
                if (hashCode != -604111672) {
                    if (hashCode == 671715954 && str.equals("ec_order_center_tab_change")) {
                        try {
                            Integer valueOf = Integer.valueOf(new JSONObject(str2).getInt("tab"));
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                RtlViewPager rtlViewPager = this.f104013a.f103999c;
                                if (rtlViewPager == null) {
                                    C89219l.m154710a("viewPager");
                                }
                                rtlViewPager.setCurrentItem(intValue);
                            }
                        } catch (Throwable th) {
                            C22708a.m42802a(th);
                        }
                    }
                } else if (str.equals("ec_order_list_api_duration")) {
                    if (this.f104014b.f103976a > 0) {
                        this.f104014b.f103979d = SystemClock.uptimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", this.f104014b.f103979d - this.f104014b.f103976a);
                        jSONObject.put("native_load_duration", this.f104014b.f103977b - this.f104014b.f103976a);
                        jSONObject.put("h5_load_duration", this.f104014b.f103978c - this.f104014b.f103977b);
                        try {
                            Long valueOf2 = Long.valueOf(new JSONObject(str2).getLong("duration"));
                            if (valueOf2 != null) {
                                jSONObject.put("h5_api_duration", valueOf2.longValue());
                            }
                        } catch (Throwable th2) {
                            C22708a.m42802a(th2);
                        }
                        C39162r.m79461a("rd_tiktokec_anchor_order_center_duration", jSONObject);
                    }
                    EventCenter.m87158a().mo75481b("ec_order_list_api_duration", this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$i */
    static final class C44580i extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderCenterActivity f104020a;

        static {
            Covode.recordClassIndex(52944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44580i(OrderCenterActivity orderCenterActivity) {
            super(1);
            this.f104020a = orderCenterActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$i$a */
        static final class C44582a extends AbstractC89220m implements AbstractC89171a<AbstractC17362a> {

            /* renamed from: a */
            final /* synthetic */ C33103x f104022a;

            static {
                Covode.recordClassIndex(52946);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44582a(C33103x xVar) {
                super(0);
                this.f104022a = xVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ AbstractC17362a invoke() {
                return this.f104022a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            C33103x f;
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C445811.f104021a);
            AbstractC44576e eVar = this.f104020a.f103980e;
            if (!(eVar == null || (f = eVar.mo75637f()) == null)) {
                baseActivityViewModel2.config(new C44582a(f));
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(52922);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f103981h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f103981h == null) {
            this.f103981h = new SparseArray();
        }
        View view = (View) this.f103981h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103981h.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$a */
    public static final class C44559a {
        static {
            Covode.recordClassIndex(52923);
        }

        private C44559a() {
        }

        public /* synthetic */ C44559a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b */
    public static final class C44560b extends C26614b {

        /* renamed from: a */
        private Logger f103982a;

        /* renamed from: b */
        private SparseArray f103983b;

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b */
        public static final class C44562b extends RecyclerView.ViewHolder {

            /* renamed from: e */
            public static final C44563a f103987e = new C44563a((byte) 0);

            /* renamed from: a */
            final View f103988a;

            /* renamed from: b */
            final SmartImageView f103989b;

            /* renamed from: c */
            final TuxTextView f103990c;

            /* renamed from: d */
            public final C44561a f103991d;

            static {
                Covode.recordClassIndex(52926);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b$a */
            public static final class C44563a {
                static {
                    Covode.recordClassIndex(52927);
                }

                private C44563a() {
                }

                public /* synthetic */ C44563a(byte b) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$b$b */
            static final class View$OnClickListenerC44564b implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ C44562b f103992a;

                /* renamed from: b */
                final /* synthetic */ String f103993b;

                /* renamed from: c */
                final /* synthetic */ String f103994c;

                /* renamed from: d */
                final /* synthetic */ String f103995d;

                static {
                    Covode.recordClassIndex(52928);
                }

                View$OnClickListenerC44564b(C44562b bVar, String str, String str2, String str3) {
                    this.f103992a = bVar;
                    this.f103993b = str;
                    this.f103994c = str2;
                    this.f103995d = str3;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof Activity)) {
                        context = view.getContext();
                    }
                    SmartRouter.buildRoute(context, this.f103993b).withParam("trackParams", C80342dg.m139300a().mo46674b(C89041ag.m154428c(new C89378p("previous_page", "ecommerce_centre_page")))).open();
                    this.f103992a.f103991d.f103984a.dismiss();
                    Logger logger = this.f103992a.f103991d.f103985b;
                    if (logger != null) {
                        String str = this.f103994c;
                        String str2 = this.f103995d;
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(str2, "");
                        AbstractC44600c a = new C44596a().mo75661a(logger.f104065a);
                        C89219l.m154721d(str, "");
                        a.f106050k.put("action_sheet_for", str);
                        C89219l.m154721d(str2, "");
                        a.f106050k.put("action_sheet_for_key", str2);
                        a.mo76747d();
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44562b(C44561a aVar, View view) {
                super(view);
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(view, "");
                this.f103991d = aVar;
                View findViewById = view.findViewById(R.id.aw9);
                C89219l.m154716b(findViewById, "");
                this.f103988a = findViewById;
                View findViewById2 = view.findViewById(R.id.aw7);
                C89219l.m154716b(findViewById2, "");
                this.f103989b = (SmartImageView) findViewById2;
                View findViewById3 = view.findViewById(R.id.awa);
                C89219l.m154716b(findViewById3, "");
                this.f103990c = (TuxTextView) findViewById3;
            }
        }

        static {
            Covode.recordClassIndex(52924);
        }

        /* renamed from: a */
        private View m87308a() {
            if (this.f103983b == null) {
                this.f103983b = new SparseArray();
            }
            View view = (View) this.f103983b.get(R.id.dgw);
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(R.id.dgw);
            this.f103983b.put(R.id.dgw, findViewById);
            return findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$b$a */
        public static final class C44561a extends RecyclerView.AbstractC1350a<C44562b> {

            /* renamed from: a */
            final C26614b f103984a;

            /* renamed from: b */
            public final Logger f103985b;

            /* renamed from: c */
            private final List<EntranceData> f103986c;

            static {
                Covode.recordClassIndex(52925);
            }

            /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ C44562b onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m87309a(this, viewGroup, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final int getItemCount() {
                return this.f103986c.size();
            }

            public C44561a(C26614b bVar, Logger logger) {
                C89219l.m154721d(bVar, "");
                this.f103984a = bVar;
                this.f103985b = logger;
                List<EntranceData> value = ((OrderTabViewModel) C1181ae.m3879a(bVar, (C1175ad.AbstractC1177b) null).mo3983a(OrderTabViewModel.class)).f104096b.getValue();
                this.f103986c = value == null ? C89086z.INSTANCE : value;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final /* synthetic */ void onBindViewHolder(C44562b bVar, int i) {
                Image icon;
                C20714a imageUrlModel;
                C44562b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                EntranceData entranceData = this.f103986c.get(i);
                C89219l.m154721d(entranceData, "");
                Icon icon2 = entranceData.getIcon();
                if (!(icon2 == null || (icon = icon2.getIcon()) == null || (imageUrlModel = icon.toImageUrlModel()) == null)) {
                    C20766v a = C20761r.m39058a(imageUrlModel);
                    a.f49115l = R.drawable.z0;
                    a.f49125v = EnumC20767w.CENTER_CROP;
                    a.f49093F = bVar2.f103989b;
                    a.mo34186c();
                }
                bVar2.f103990c.setText(entranceData.getText());
                View view = bVar2.f103988a;
                String schema = entranceData.getSchema();
                String text = entranceData.getText();
                String key = entranceData.getKey();
                if (view != null) {
                    view.setOnClickListener(new C44562b.View$OnClickListenerC44564b(bVar2, schema, text, key));
                }
            }

            /* renamed from: a */
            private static RecyclerView.ViewHolder m87309a(C44561a aVar, ViewGroup viewGroup, int i) {
                boolean a;
                MethodCollector.m26663i(8252);
                C89219l.m154721d(viewGroup, "");
                if (aVar.f103986c.isEmpty()) {
                    aVar.f103984a.dismiss();
                }
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ow, viewGroup, false);
                C89219l.m154716b(a2, "");
                C44562b bVar = new C44562b(aVar, a2);
                try {
                    if (bVar.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(bVar.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = bVar.getClass().getName();
                MethodCollector.m26664o(8252);
                return bVar;
            }
        }

        @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            SparseArray sparseArray = this.f103983b;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }

        @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.google.android.material.bottomsheet.C26614b, androidx.appcompat.app.C0242i
        public final Dialog onCreateDialog(Bundle bundle) {
            Logger logger;
            ActivityC0945e activity = getActivity();
            if (activity != null && (activity instanceof OrderCenterActivity)) {
                AbstractC44576e eVar = ((OrderCenterActivity) activity).f103980e;
                if (eVar != null) {
                    logger = eVar.mo75634c();
                } else {
                    logger = null;
                }
                this.f103982a = logger;
            }
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            return new DialogC44308d(activity2);
        }

        @Override // androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            Drawable drawable;
            Resources.Theme theme;
            C89219l.m154721d(view, "");
            super.onViewCreated(view, bundle);
            RecyclerView recyclerView = (RecyclerView) m87308a();
            C89219l.m154716b(recyclerView, "");
            recyclerView.setAdapter(new C44561a(this, this.f103982a));
            RecyclerView recyclerView2 = (RecyclerView) m87308a();
            C89219l.m154716b(recyclerView2, "");
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            if (Build.VERSION.SDK_INT >= 24) {
                Resources resources = view.getResources();
                Context context = getContext();
                if (context != null) {
                    theme = context.getTheme();
                } else {
                    theme = null;
                }
                drawable = resources.getDrawable(R.drawable.yh, theme);
            } else {
                drawable = view.getResources().getDrawable(R.drawable.yh);
            }
            if (drawable != null) {
                ((RecyclerView) m87308a()).mo4402a(new C44621a(drawable));
            }
            Logger logger = this.f103982a;
            if (logger != null) {
                new C44598b().mo75661a(logger.f104065a).mo76747d();
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            C89219l.m154721d(layoutInflater, "");
            return C1764a.m5927a(layoutInflater, R.layout.ov, viewGroup, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$f */
    public static final class C44577f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ OrderCenterActivity f104017a;

        static {
            Covode.recordClassIndex(52941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44577f(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.f104017a = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            OrderCenterActivity.super.onBackPressed();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$g */
    static final class C44578g extends AbstractC89220m implements AbstractC89171a<AbstractC45271m> {

        /* renamed from: a */
        final /* synthetic */ OrderCenterActivity f104018a;

        static {
            Covode.recordClassIndex(52942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44578g(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.f104018a = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC45271m invoke() {
            return new C44566d(this.f104018a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$h */
    static final class C44579h extends AbstractC89220m implements AbstractC89171a<AbstractC45271m> {

        /* renamed from: a */
        final /* synthetic */ OrderCenterActivity f104019a;

        static {
            Covode.recordClassIndex(52943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44579h(OrderCenterActivity orderCenterActivity) {
            super(0);
            this.f104019a = orderCenterActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC45271m invoke() {
            return new C44565c(this.f104019a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo75639h();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onLowMemory() {
        super.onLowMemory();
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo75638g();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo75636e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$c */
    static final class C44565c extends AbstractC44576e {
        static {
            Covode.recordClassIndex(52929);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity.AbstractC44576e
        /* renamed from: a */
        public final void mo75631a() {
            Window window;
            ActivityC0945e eVar = this.f105517l;
            if (!(eVar == null || (window = eVar.getWindow()) == null)) {
                window.addFlags(67108864);
            }
            ActivityC0945e eVar2 = this.f105517l;
            if (eVar2 != null) {
                eVar2.setContentView(mo76360i());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44565c(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity);
            C89219l.m154721d(orderCenterActivity, "");
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo73991a(new C44577f(this));
        } else {
            super.onBackPressed();
        }
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity$e */
    public static abstract class AbstractC44576e extends AbstractC45271m {

        /* renamed from: f */
        public final OrderCenterActivity f104016f;

        static {
            Covode.recordClassIndex(52940);
        }

        /* renamed from: a */
        public abstract void mo75631a();

        /* renamed from: c */
        public Logger mo75634c() {
            return null;
        }

        /* renamed from: d */
        public int mo75635d() {
            return 0;
        }

        /* renamed from: e */
        public void mo75636e() {
        }

        /* renamed from: f */
        public C33103x mo75637f() {
            return null;
        }

        /* renamed from: g */
        public void mo75638g() {
        }

        /* renamed from: h */
        public void mo75639h() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC44576e(OrderCenterActivity orderCenterActivity) {
            super(orderCenterActivity, null, 2);
            C89219l.m154721d(orderCenterActivity, "");
            this.f104016f = orderCenterActivity;
            this.f105515j = false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo76357a(this, bundle);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo76359b(this, bundle);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onCreate", true);
        this.f103980e = (AbstractC44576e) C45263i.m87840a(StrategyService.m87825b().mo76330a().mo76349a(new C44578g(this)).mo76351b(new C44579h(this)), getIntent().getData());
        activityConfiguration(new C44580i(this));
        super.onCreate(bundle);
        AbstractC44576e eVar = this.f103980e;
        if (eVar != null) {
            eVar.mo75631a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterActivity", "onCreate", false);
    }
}
