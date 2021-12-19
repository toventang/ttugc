package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31962m;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32180b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32186e;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32258q;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity */
public final class AuthorizedDeviceActivity extends ActivityC17312a {

    /* renamed from: a */
    private final AbstractC89244h f76152a = C89250i.m154773a((AbstractC89171a) new C31860a(this));

    /* renamed from: b */
    private final AbstractC89244h f76153b = C89250i.m154773a((AbstractC89171a) new C31861b(this));

    /* renamed from: c */
    private HashMap f76154c;

    static {
        Covode.recordClassIndex(38603);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76154c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76154c == null) {
            this.f76154c = new HashMap();
        }
        View view = (View) this.f76154c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76154c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo57806a() {
        return (String) this.f76152a.getValue();
    }

    /* renamed from: b */
    public final DialogC31962m mo57808b() {
        return (DialogC31962m) this.f76153b.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$b */
    static final class C31861b extends AbstractC89220m implements AbstractC89171a<DialogC31962m> {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDeviceActivity f76156a;

        static {
            Covode.recordClassIndex(38605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31861b(AuthorizedDeviceActivity authorizedDeviceActivity) {
            super(0);
            this.f76156a = authorizedDeviceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC31962m invoke() {
            return new DialogC31962m(this.f76156a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$f */
    public static final class C31866f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDeviceActivity f76161a;

        static {
            Covode.recordClassIndex(38610);
        }

        C31866f(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f76161a = authorizedDeviceActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$f$a */
        public static final class C31867a implements AbstractC31889l {

            /* renamed from: a */
            final /* synthetic */ C31866f f76162a;

            /* renamed from: b */
            final /* synthetic */ List f76163b;

            static {
                Covode.recordClassIndex(38611);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.AbstractC31889l
            /* renamed from: a */
            public final String mo57811a() {
                String a = this.f76162a.f76161a.mo57806a();
                C89219l.m154716b(a, "");
                return a;
            }

            @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.AbstractC31889l
            /* renamed from: b */
            public final void mo57813b() {
                C80273bt.m139145a(this.f76162a.f76161a.mo57808b());
            }

            @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.AbstractC31889l
            /* renamed from: d */
            public final void mo57815d() {
                C80273bt.m139146b(this.f76162a.f76161a.mo57808b());
            }

            @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.AbstractC31889l
            /* renamed from: c */
            public final void mo57814c() {
                RecyclerView recyclerView = (RecyclerView) this.f76162a.f76161a._$_findCachedViewById(R.id.dnz);
                C89219l.m154716b(recyclerView, "");
                recyclerView.setVisibility(8);
                DmtStatusView dmtStatusView = (DmtStatusView) this.f76162a.f76161a._$_findCachedViewById(R.id.e77);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(0);
                ((DmtStatusView) this.f76162a.f76161a._$_findCachedViewById(R.id.e77)).mo27385g();
            }

            C31867a(C31866f fVar, List list) {
                this.f76162a = fVar;
                this.f76163b = list;
            }

            @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.AbstractC31889l
            /* renamed from: a */
            public final void mo57812a(Integer num, String str) {
                this.f76162a.f76161a.mo57807a(num, str);
            }
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32180b> iVar) {
            Integer num;
            String str;
            String str2;
            if (!C80214ai.m139043a(iVar)) {
                ((DmtStatusView) this.f76161a._$_findCachedViewById(R.id.e77)).mo27387h();
                this.f76161a.mo57807a(null, "");
                return null;
            }
            C89219l.m154716b(iVar, "");
            C32180b d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                C32180b.C32181a data = d.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                C32180b.C32181a data2 = d.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                ((DmtStatusView) this.f76161a._$_findCachedViewById(R.id.e77)).mo27387h();
                this.f76161a.mo57807a(num, str);
                return null;
            }
            List<C32186e> auth_device = d.getData().getAuth_device();
            if (auth_device == null || auth_device.size() <= 0) {
                ((DmtStatusView) this.f76161a._$_findCachedViewById(R.id.e77)).mo27385g();
                return null;
            }
            List<C32186e> auth_device2 = d.getData().getAuth_device();
            if (auth_device2 == null) {
                C89219l.m154715b();
            }
            List g = C89070n.m154585g((Collection) auth_device2);
            Iterator it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long device_id = ((C32186e) next).getDevice_id();
                if (device_id != null) {
                    str2 = String.valueOf(device_id.longValue());
                } else {
                    str2 = null;
                }
                if (C89219l.m154714a((Object) str2, (Object) DeviceRegisterManager.getDeviceId())) {
                    if (next != null) {
                        g.remove(next);
                        g.add(0, next);
                    }
                }
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f76161a._$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f76161a._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) this.f76161a._$_findCachedViewById(R.id.dnz);
            recyclerView2.setLayoutManager(new LinearLayoutManager());
            recyclerView2.setAdapter(new C31883j(g, new C31867a(this, g)));
            return recyclerView2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$a */
    static final class C31860a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDeviceActivity f76155a;

        static {
            Covode.recordClassIndex(38604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31860a(AuthorizedDeviceActivity authorizedDeviceActivity) {
            super(0);
            this.f76155a = authorizedDeviceActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66213a(this.f76155a.getIntent(), "enter_from");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66213a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public final void mo57809c() {
        DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e77);
        C89219l.m154716b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 0) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) _$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(0);
        }
        ((DmtStatusView) _$_findCachedViewById(R.id.e77)).mo27384f();
        TwoStepAuthApi.m66502b().mo5534a(new C31866f(this), C1731i.f5564c, null);
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$e */
    public static final class C31865e implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDeviceActivity f76160a;

        static {
            Covode.recordClassIndex(38609);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31865e(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f76160a = authorizedDeviceActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f76160a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$c */
    static final class C31862c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C31862c f76157a = new C31862c();

        static {
            Covode.recordClassIndex(38606);
        }

        C31862c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C318631.f76158a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity$d */
    static final class View$OnClickListenerC31864d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AuthorizedDeviceActivity f76159a;

        static {
            Covode.recordClassIndex(38608);
        }

        View$OnClickListenerC31864d(AuthorizedDeviceActivity authorizedDeviceActivity) {
            this.f76159a = authorizedDeviceActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76159a.mo57809c();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", true);
        activityConfiguration(C31862c.f76157a);
        super.onCreate(bundle);
        setContentView(R.layout.fp);
        TuxTextView tuxTextView = new TuxTextView(this, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Integer a = C23155d.m43641a(this, R.attr.bj);
        if (a != null) {
            i = a.intValue();
        } else {
            i = -16777216;
        }
        tuxTextView.setTextColor(i);
        tuxTextView.setText(getString(R.string.g3g));
        tuxTextView.setOnClickListener(new View$OnClickListenerC31864d(this));
        String string = getString(R.string.g3g);
        C89219l.m154716b(string, "");
        Context a2 = C17867d.m33078a();
        int c = C0643b.m2378c(a2, R.color.c5);
        TuxTextView tuxTextView2 = new TuxTextView(a2, null, 0, 6);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c);
        tuxTextView2.setText(string);
        DmtStatusView.C17269a c2 = DmtStatusView.C17269a.m31905a(this).mo27406b(tuxTextView2).mo27408c(tuxTextView);
        c2.f41304g = 0;
        ((DmtStatusView) _$_findCachedViewById(R.id.e77)).setBuilder(c2);
        ((ButtonTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C31865e(this));
        mo57809c();
        String a3 = mo57806a();
        C89219l.m154716b(a3, "");
        C89219l.m154721d(a3, "");
        C39162r.m79460a("authorized_logins_notify", C32258q.m66614a().mo59983a("enter_from", a3).f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo57807a(Integer num, String str) {
        C79459a aVar;
        if (num == null) {
            aVar = new C79459a(this);
            str = getString(R.string.bos);
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            aVar = new C79459a(this);
            str = getString(R.string.dcq);
        } else {
            aVar = new C79459a(this);
            if (str == null) {
                C89219l.m154715b();
            }
        }
        aVar.mo123052a(str).mo123053a();
    }
}
