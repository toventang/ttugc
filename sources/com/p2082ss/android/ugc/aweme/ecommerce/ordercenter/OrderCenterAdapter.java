package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event.Logger;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.p2847vm.OrderTabViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.EnumC44620a;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderListTabInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.view.TEIgnoreAbleFrameLayout;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter */
public final class OrderCenterAdapter extends AbstractC0975m implements AbstractC33974au {

    /* renamed from: c */
    public static final C44585a f104023c = new C44585a((byte) 0);

    /* renamed from: a */
    final DmtTabLayout f104024a;

    /* renamed from: b */
    public final ArrayList<C44590c> f104025b;

    /* renamed from: d */
    private boolean f104026d = true;

    /* renamed from: e */
    private String f104027e;

    /* renamed from: f */
    private final ActivityC0945e f104028f;

    /* renamed from: g */
    private final Logger f104029g;

    static {
        Covode.recordClassIndex(52947);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        return -2;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$a */
    static final class C44585a {
        static {
            Covode.recordClassIndex(52950);
        }

        private C44585a() {
        }

        public /* synthetic */ C44585a(byte b) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f104025b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$b */
    public static final class C44586b extends AbstractC34586a {

        /* renamed from: a */
        int f104032a = -1;

        /* renamed from: b */
        public TEIgnoreAbleFrameLayout f104033b;

        /* renamed from: c */
        ViewGroup f104034c;

        /* renamed from: d */
        AppCompatImageView f104035d;

        /* renamed from: e */
        TuxTextView f104036e;

        /* renamed from: j */
        TuxTextView f104037j;

        /* renamed from: k */
        public BulletContainerView f104038k;

        /* renamed from: l */
        public boolean f104039l;

        /* renamed from: m */
        private BulletActivityWrapper f104040m;

        /* renamed from: n */
        private boolean f104041n;

        /* renamed from: o */
        private boolean f104042o;

        /* renamed from: p */
        private SparseArray f104043p;

        static {
            Covode.recordClassIndex(52951);
        }

        /* renamed from: a */
        public final void mo75646a() {
            C16248b providerFactory;
            BulletContainerView bulletContainerView = this.f104038k;
            if (bulletContainerView != null) {
                bulletContainerView.mo25721a();
            }
            BulletContainerView bulletContainerView2 = this.f104038k;
            if (!(bulletContainerView2 == null || (providerFactory = bulletContainerView2.getProviderFactory()) == null)) {
                providerFactory.mo25824a();
            }
            this.f104038k = null;
        }

        @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
        public final void onDestroyView() {
            super.onDestroyView();
            mo75646a();
            this.f104041n = false;
            this.f104042o = false;
            SparseArray sparseArray = this.f104043p;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }

        /* renamed from: b */
        private final void m87339b() {
            String str;
            if (this.f104041n && !this.f104042o && getUserVisibleHint()) {
                this.f104042o = true;
                BulletContainerView bulletContainerView = this.f104038k;
                if (bulletContainerView != null) {
                    Uri.Builder encodedAuthority = new Uri.Builder().scheme("bullet").encodedAuthority("bullet");
                    Bundle arguments = getArguments();
                    if (arguments == null || (str = arguments.getString("order_list_url")) == null) {
                        str = "https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_list/index.html";
                    }
                    Uri build = encodedAuthority.appendQueryParameter("url", str).build();
                    ActivityC0945e activity = getActivity();
                    if (activity instanceof OrderCenterActivity) {
                        OrderCenterActivity orderCenterActivity = (OrderCenterActivity) activity;
                        if (orderCenterActivity.f103977b == 0) {
                            orderCenterActivity.f103977b = SystemClock.uptimeMillis();
                        }
                    }
                    C89219l.m154716b(build, "");
                    AbstractC17046h.C17047a.m31518a(bulletContainerView, build, null, new C44587a(this), 2);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$b$a */
        public static final class C44587a implements AbstractC17046h.AbstractC17048b {

            /* renamed from: a */
            final /* synthetic */ C44586b f104044a;

            static {
                Covode.recordClassIndex(52952);
            }

            @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
            /* renamed from: a */
            public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
                C89219l.m154721d(iVar, "");
                C89219l.m154721d(uri, "");
                C89219l.m154721d(qVar, "");
            }

            @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
            /* renamed from: a */
            public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(uri, "");
                C89219l.m154721d(iVar, "");
            }

            C44587a(C44586b bVar) {
                this.f104044a = bVar;
            }

            @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
            /* renamed from: a */
            public final void mo25851a(Uri uri) {
                C89219l.m154721d(uri, "");
                this.f104044a.f104039l = true;
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
            @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo25852a(android.net.Uri r6, java.lang.Throwable r7) {
                /*
                // Method dump skipped, instructions count: 163
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.C44586b.C44587a.mo25852a(android.net.Uri, java.lang.Throwable):void");
            }

            @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
            /* renamed from: a */
            public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
                C89219l.m154721d(view, "");
                C89219l.m154721d(uri, "");
                C89219l.m154721d(iVar, "");
                this.f104044a.f104039l = false;
                ViewGroup viewGroup = this.f104044a.f104034c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                TEIgnoreAbleFrameLayout tEIgnoreAbleFrameLayout = this.f104044a.f104033b;
                if (tEIgnoreAbleFrameLayout != null) {
                    tEIgnoreAbleFrameLayout.setTouchEventDisable(false);
                }
                ActivityC0945e activity = this.f104044a.getActivity();
                if (activity instanceof OrderCenterActivity) {
                    OrderCenterActivity orderCenterActivity = (OrderCenterActivity) activity;
                    if (orderCenterActivity.f103978c == 0) {
                        orderCenterActivity.f103978c = SystemClock.uptimeMillis();
                    }
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void setUserVisibleHint(boolean z) {
            super.setUserVisibleHint(z);
            if (z) {
                m87339b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$b$c */
        static final class View$OnClickListenerC44589c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44586b f104046a;

            static {
                Covode.recordClassIndex(52954);
            }

            View$OnClickListenerC44589c(C44586b bVar) {
                this.f104046a = bVar;
            }

            public final void onClick(View view) {
                BulletContainerView bulletContainerView;
                ClickAgent.onClick(view);
                if (!this.f104046a.f104039l && (bulletContainerView = this.f104046a.f104038k) != null) {
                    bulletContainerView.mo26842b();
                }
            }
        }

        @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
        public final void onActivityCreated(Bundle bundle) {
            ActivityC0945e activity;
            super.onActivityCreated(bundle);
            BulletActivityWrapper bulletActivityWrapper = this.f104040m;
            if (bulletActivityWrapper != null && (activity = getActivity()) != null && (activity instanceof ActivityC0945e)) {
                bulletActivityWrapper.mo26828c(activity, bundle);
            }
        }

        @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            ActivityC0945e activity;
            C89219l.m154721d(bundle, "");
            super.onSaveInstanceState(bundle);
            BulletActivityWrapper bulletActivityWrapper = this.f104040m;
            if (bulletActivityWrapper != null && (activity = getActivity()) != null && (activity instanceof ActivityC0945e)) {
                bulletActivityWrapper.mo26826b(activity, bundle);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$b$b */
        public static final class C44588b extends BulletActivityWrapper {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f104045a;

            static {
                Covode.recordClassIndex(52953);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44588b(ActivityC0945e eVar, Activity activity) {
                super(activity);
                this.f104045a = eVar;
            }
        }

        @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i;
            C89219l.m154721d(layoutInflater, "");
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("tab_position");
            } else {
                i = -1;
            }
            this.f104032a = i;
            View a = C1764a.m5927a(layoutInflater, R.layout.ox, viewGroup, false);
            this.f104033b = (TEIgnoreAbleFrameLayout) a.findViewById(R.id.emm);
            BulletContainerView bulletContainerView = (BulletContainerView) a.findViewById(R.id.zu);
            this.f104038k = bulletContainerView;
            if (bulletContainerView != null) {
                ActivityC0945e activity = getActivity();
                if (activity instanceof ActivityC0945e) {
                    C44588b bVar = new C44588b(activity, activity);
                    bVar.mo26823a((AbstractC1204m) activity);
                    this.f104040m = bVar;
                }
                bulletContainerView.mo25820a(BulletService.m71938f().mo61850a());
                BulletActivityWrapper bulletActivityWrapper = this.f104040m;
                if (bulletActivityWrapper != null) {
                    bulletContainerView.setActivityWrapper(bulletActivityWrapper);
                }
                IBulletService f = BulletService.m71938f();
                Context context = bulletContainerView.getContext();
                C89219l.m154716b(context, "");
                bulletContainerView.mo26839a(f.mo61849a(context), 17, 0, 0, 0, 0);
            }
            this.f104034c = (ViewGroup) a.findViewById(R.id.cf8);
            this.f104035d = (AppCompatImageView) a.findViewById(R.id.bky);
            this.f104036e = (TuxTextView) a.findViewById(R.id.text);
            this.f104037j = (TuxTextView) a.findViewById(R.id.efr);
            a.findViewById(R.id.djd).setOnClickListener(new View$OnClickListenerC44589c(this));
            this.f104041n = true;
            m87339b();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    public final C44590c mo75641a() {
        ArrayList<C44590c> arrayList = this.f104025b;
        DmtTabLayout dmtTabLayout = this.f104024a;
        C89219l.m154716b(dmtTabLayout, "");
        C44590c cVar = arrayList.get(dmtTabLayout.getSelectedTabPosition());
        C89219l.m154716b(cVar, "");
        return cVar;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f104026d) {
            this.f104026d = false;
            return;
        }
        DmtTabLayout dmtTabLayout = this.f104024a;
        C89219l.m154716b(dmtTabLayout, "");
        mo75643a(dmtTabLayout.mo27529b(dmtTabLayout.getSelectedTabPosition()));
    }

    /* renamed from: c */
    private final void m87329c() {
        AbstractC1174ac a = C1181ae.m3881a(this.f104028f, (C1175ad.AbstractC1177b) null).mo3983a(OrderTabViewModel.class);
        C89219l.m154716b(a, "");
        OrderTabViewModel orderTabViewModel = (OrderTabViewModel) a;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) orderTabViewModel.f104097c.getValue();
        this.f104025b.addAll(mo75642a((List<OrderListTabInfo>) eVar.element));
        orderTabViewModel.f104097c.observe(this.f104028f, new C44591d(this, eVar));
    }

    /* renamed from: d */
    private final List<C44590c> m87330d() {
        int ordinal = EnumC44620a.ALL.ordinal();
        String string = this.f104028f.getString(R.string.fu6);
        C89219l.m154716b(string, "");
        int ordinal2 = EnumC44620a.TO_PAY.ordinal();
        String string2 = this.f104028f.getString(R.string.fuy);
        C89219l.m154716b(string2, "");
        int ordinal3 = EnumC44620a.TO_SHIP.ordinal();
        String string3 = this.f104028f.getString(R.string.fux);
        C89219l.m154716b(string3, "");
        int ordinal4 = EnumC44620a.SHIPPED.ordinal();
        String string4 = this.f104028f.getString(R.string.fuu);
        C89219l.m154716b(string4, "");
        int ordinal5 = EnumC44620a.COMPLETED.ordinal();
        String string5 = this.f104028f.getString(R.string.fu8);
        C89219l.m154716b(string5, "");
        return C89070n.m154522b(new C44590c(ordinal, string, m87328b(EnumC44620a.ALL.ordinal()), "all", (byte) 0), new C44590c(ordinal2, string2, m87328b(EnumC44620a.TO_PAY.ordinal()), "to_pay", (byte) 0), new C44590c(ordinal3, string3, m87328b(EnumC44620a.TO_SHIP.ordinal()), "to_ship", (byte) 0), new C44590c(ordinal4, string4, m87328b(EnumC44620a.SHIPPED.ordinal()), "shipped", (byte) 0), new C44590c(ordinal5, string5, m87328b(EnumC44620a.COMPLETED.ordinal()), "completed", (byte) 0));
    }

    /* renamed from: b */
    public final int mo75644b() {
        String queryParameter;
        Integer e;
        Intent intent = this.f104028f.getIntent();
        C89219l.m154716b(intent, "");
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter("tab_type")) == null || (e = C89361p.m154863e(queryParameter)) == null) {
            return 0;
        }
        for (T t : this.f104025b) {
            if (t.f104047a == e.intValue()) {
                return this.f104025b.indexOf(t);
            }
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f104025b.get(i).f104048b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$d */
    public static final class C44591d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ OrderCenterAdapter f104052a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f104053b;

        static {
            Covode.recordClassIndex(52956);
        }

        C44591d(OrderCenterAdapter orderCenterAdapter, C89233z.C89238e eVar) {
            this.f104052a = orderCenterAdapter;
            this.f104053b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((List) obj);
            if (t != this.f104053b.element) {
                this.f104052a.f104025b.clear();
                this.f104052a.f104025b.addAll(this.f104052a.mo75642a((List<OrderListTabInfo>) t));
                this.f104053b.element = t;
                this.f104052a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final void mo75643a(DmtTabLayout.C17294f fVar) {
        if (fVar != null) {
            IEventCenter a = EventCenter.m87158a();
            String jSONObject = new JSONObject().put("tab_type", this.f104025b.get(fVar.f41524e).f104047a).toString();
            C89219l.m154716b(jSONObject, "");
            a.mo75479a("ec_order_center_tab_clicked", jSONObject);
            Logger logger = this.f104029g;
            C44590c cVar = this.f104025b.get(fVar.f41524e);
            C89219l.m154716b(cVar, "");
            logger.mo75657a(cVar);
        }
    }

    /* renamed from: b */
    private static String m87328b(int i) {
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_list/index.html");
        C89219l.m154716b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        encodedPath.appendQueryParameter("tab_type", String.valueOf(i));
        String uri = builder.build().toString();
        C89219l.m154716b(uri, "");
        return uri;
    }

    /* renamed from: a */
    public final List<C44590c> mo75642a(List<OrderListTabInfo> list) {
        String str;
        if (list == null || list.isEmpty()) {
            return m87330d();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            int tab = t.getTab();
            String text = t.getText();
            String schema = t.getSchema();
            if (schema == null || schema.length() == 0) {
                str = m87328b(t.getTab());
            } else {
                str = t.getSchema();
            }
            arrayList.add(new C44590c(tab, text, str, t.getTabName(), (byte) 0));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        C44586b bVar = new C44586b();
        Bundle bundle = new Bundle();
        C44590c cVar = this.f104025b.get(i);
        C89219l.m154716b(cVar, "");
        C44590c cVar2 = cVar;
        Uri.Builder builder = new Uri.Builder();
        C28022o oVar = new C28022o();
        oVar.mo46801a("previous_page", this.f104027e);
        oVar.mo46801a("tab_name", cVar2.f104048b);
        oVar.mo46801a("tab_id", cVar2.f104050d);
        Uri parse = Uri.parse(cVar2.f104049c);
        C89219l.m154716b(parse, "");
        builder.scheme(parse.getScheme());
        builder.encodedAuthority(parse.getAuthority());
        builder.encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            builder.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        builder.appendQueryParameter("trackParams", oVar.toString());
        String uri = builder.build().toString();
        C89219l.m154716b(uri, "");
        bundle.putString("order_list_url", uri);
        bundle.putInt("tab_position", i);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof C44586b) {
            ((C44586b) obj).mo75646a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderCenterAdapter(ActivityC0945e eVar, Logger logger, AbstractC0952i iVar) {
        super(iVar);
        Uri data;
        String str = "";
        C89219l.m154721d(eVar, str);
        C89219l.m154721d(logger, str);
        C89219l.m154721d(iVar, str);
        this.f104028f = eVar;
        this.f104029g = logger;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) eVar.findViewById(R.id.ee7);
        this.f104024a = dmtTabLayout;
        this.f104027e = str;
        this.f104025b = new ArrayList<>();
        Intent intent = eVar.getIntent();
        if (!(intent == null || (data = intent.getData()) == null)) {
            String queryParameter = data.getQueryParameter("previous_page");
            this.f104027e = queryParameter != null ? queryParameter : str;
        }
        m87329c();
        eVar.getLifecycle().mo4012a(this);
        dmtTabLayout.setOnTabClickListener(new DmtTabLayout.AbstractC17288b(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.C445831 */

            /* renamed from: a */
            final /* synthetic */ OrderCenterAdapter f104030a;

            static {
                Covode.recordClassIndex(52948);
            }

            {
                this.f104030a = r1;
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
            /* renamed from: a */
            public final void mo27573a(DmtTabLayout.C17294f fVar) {
                OrderCenterAdapter orderCenterAdapter = this.f104030a;
                C89219l.m154716b(fVar, "");
                if (fVar.f41524e >= 0 && fVar.f41524e < orderCenterAdapter.f104025b.size()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (uptimeMillis - orderCenterAdapter.f104025b.get(fVar.f41524e).f104051e < 250) {
                        orderCenterAdapter.f104025b.get(fVar.f41524e).f104051e = 0;
                        IEventCenter a = EventCenter.m87158a();
                        String jSONObject = new JSONObject().put("tab_type", orderCenterAdapter.f104025b.get(fVar.f41524e).f104047a).toString();
                        C89219l.m154716b(jSONObject, "");
                        a.mo75479a("ec_order_center_tab_double_clicked", jSONObject);
                    } else {
                        orderCenterAdapter.f104025b.get(fVar.f41524e).f104051e = uptimeMillis;
                    }
                    fVar.mo27592a();
                }
            }
        });
        dmtTabLayout.mo27521a(new DmtTabLayout.AbstractC17289c(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter.C445842 */

            /* renamed from: a */
            final /* synthetic */ OrderCenterAdapter f104031a;

            static {
                Covode.recordClassIndex(52949);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: b */
            public final void mo27575b(DmtTabLayout.C17294f fVar) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f104031a = r1;
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: a */
            public final void mo27574a(DmtTabLayout.C17294f fVar) {
                this.f104031a.mo75643a(fVar);
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter$c */
    public static final class C44590c {

        /* renamed from: a */
        public final int f104047a;

        /* renamed from: b */
        public final String f104048b;

        /* renamed from: c */
        public final String f104049c;

        /* renamed from: d */
        public final String f104050d;

        /* renamed from: e */
        public long f104051e;

        static {
            Covode.recordClassIndex(52955);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C44590c)) {
                return false;
            }
            C44590c cVar = (C44590c) obj;
            return this.f104047a == cVar.f104047a && C89219l.m154714a(this.f104048b, cVar.f104048b) && C89219l.m154714a(this.f104049c, cVar.f104049c) && C89219l.m154714a(this.f104050d, cVar.f104050d) && this.f104051e == cVar.f104051e;
        }

        public final int hashCode() {
            int i = this.f104047a * 31;
            String str = this.f104048b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f104049c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f104050d;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            long j = this.f104051e;
            return ((hashCode2 + i2) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "TabConfig(tabType=" + this.f104047a + ", str=" + this.f104048b + ", url=" + this.f104049c + ", key=" + this.f104050d + ", lastClickedMillis=" + this.f104051e + ")";
        }

        private C44590c(int i, String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f104047a = i;
            this.f104048b = str;
            this.f104049c = str2;
            this.f104050d = str3;
            this.f104051e = 0;
        }

        public /* synthetic */ C44590c(int i, String str, String str2, String str3, byte b) {
            this(i, str, str2, str3);
        }
    }
}
