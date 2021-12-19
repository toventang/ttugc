package com.p2082ss.android.ugc.aweme.setting.page.security;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.AbstractC34889bn;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.page.base.C68253a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPage */
public final class SecurityPage extends AbstractC68195a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C68316a f152901e = new C68316a((byte) 0);

    /* renamed from: f */
    private final AbstractC89244h f152902f = C89250i.m154773a((AbstractC89171a) new C68325d(this));

    /* renamed from: g */
    private SparseArray f152903g;

    static {
        Covode.recordClassIndex(80536);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152903g == null) {
            this.f152903g = new SparseArray();
        }
        View view = (View) this.f152903g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152903g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152903g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ay_;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(SecurityPage.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPage$a */
    public static final class C68316a {
        static {
            Covode.recordClassIndex(80537);
        }

        private C68316a() {
        }

        public /* synthetic */ C68316a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPage$d */
    static final class C68325d extends AbstractC89220m implements AbstractC89171a<SecurityViewModel> {

        /* renamed from: a */
        final /* synthetic */ SecurityPage f152912a;

        static {
            Covode.recordClassIndex(80546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68325d(SecurityPage securityPage) {
            super(0);
            this.f152912a = securityPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SecurityViewModel invoke() {
            return C1181ae.m3879a(this.f152912a, (C1175ad.AbstractC1177b) null).mo3983a(SecurityViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1213t<Boolean> tVar;
        super.onResume();
        SecurityViewModel securityViewModel = (SecurityViewModel) this.f152902f.getValue();
        if (securityViewModel != null && (tVar = securityViewModel.f152921a) != null) {
            tVar.setValue(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPage$b */
    static final class C68317b extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C68317b f152904a = new C68317b();

        static {
            Covode.recordClassIndex(80538);
        }

        C68317b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C683181.f152905a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C68317b.f152904a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        try {
            if (TextUtils.equals("incomePlusVerificationSuccess", jVar.f111077b.getString("eventName"))) {
                new C79459a(getContext()).mo123050a(R.string.fh8).mo123053a();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.security.SecurityPage$c */
    static final class C68319c extends AbstractC89220m implements AbstractC89172b<C68253a, C89391z> {

        /* renamed from: a */
        public static final C68319c f152906a = new C68319c();

        static {
            Covode.recordClassIndex(80540);
        }

        C68319c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C68253a aVar) {
            C68253a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (!C63770ai.m139687c()) {
                C68253a.m120514a(aVar2, new C68332a(), SecurityAlertsCell.class, C683201.f152907a, null, 8);
                aVar2.mo108757a(new C68333b(), C683212.f152908a);
                C68335d dVar = new C68335d();
                C89219l.m154721d(dVar, "");
                aVar2.f152798a.add(dVar);
                C68253a.m120514a(aVar2, new C68337f(), SecurityVerificationCell.class, null, null, 12);
            }
            C31575b.m65859a();
            final AbstractC34889bn k = C31575b.f75524a.mo57075k();
            C68336e eVar = new C68336e();
            C683223 r0 = new AbstractC89172b<C68336e, Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.setting.page.security.SecurityPage.C68319c.C683223 */

                static {
                    Covode.recordClassIndex(80543);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(C68336e eVar) {
                    boolean z;
                    C89219l.m154721d(eVar, "");
                    if (!k.isOneKeyLoginExprimentEnable() || k.isCurrentMethodAvaliable()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            };
            C683234 r1 = new AbstractC89172b<C68336e, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.setting.page.security.SecurityPage.C68319c.C683234 */

                static {
                    Covode.recordClassIndex(80544);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C68336e eVar) {
                    C68336e eVar2 = eVar;
                    C89219l.m154721d(eVar2, "");
                    eVar2.f152812c = k.getSaveLoginStatus();
                    return C89391z.f203057a;
                }
            };
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(r0, "");
            C89219l.m154721d(r1, "");
            if (((Boolean) r0.invoke(eVar)).booleanValue()) {
                r1.invoke(eVar);
                aVar2.f152798a.add(eVar);
            }
            aVar2.mo108757a(new C68334c(), C683245.f152911a);
            return C89391z.f203057a;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r2 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r2)
            super.onViewCreated(r7, r8)
            r0 = 2131829419(0x7f1122ab, float:1.9291807E38)
            com.p2082ss.android.ugc.aweme.setting.page.base.C68256b.m120517a(r6, r0)
            r5 = 2131365893(0x7f0a1005, float:1.8351664E38)
            android.view.View r4 = r6.mo27715a(r5)
            com.bytedance.ies.powerlist.PowerList r4 = (com.bytedance.ies.powerlist.PowerList) r4
            r0 = 6
            java.lang.Class[] r3 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell.class
            r3[r1] = r0
            r1 = 1
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityDeviceCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityDeviceCell.class
            r3[r1] = r0
            r1 = 2
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell.class
            r3[r1] = r0
            r1 = 3
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell.class
            r3[r1] = r0
            r1 = 4
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell.class
            r3[r1] = r0
            r1 = 5
            java.lang.Class<com.ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell> r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityPermissionsCell.class
            r3[r1] = r0
            r4.mo28083a(r3)
            android.view.View r3 = r6.mo27715a(r5)
            com.bytedance.ies.powerlist.PowerList r3 = (com.bytedance.ies.powerlist.PowerList) r3
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r2)
            com.ss.android.ugc.aweme.setting.page.security.SecurityPage$c r0 = com.p2082ss.android.ugc.aweme.setting.page.security.SecurityPage.C68319c.f152906a
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r2)
            p4600h.p4611f.p4613b.C89219l.m154721d(r0, r2)
            com.ss.android.ugc.aweme.setting.page.base.a r2 = new com.ss.android.ugc.aweme.setting.page.base.a
            r2.<init>()
            r0.invoke(r2)
            com.bytedance.ies.powerlist.f r1 = r3.getState()
            java.util.List<com.bytedance.ies.powerlist.b.a> r0 = r2.f152798a
            r1.mo28133a(r0)
            java.util.HashMap<java.lang.Class<? extends com.bytedance.ies.powerlist.PowerCell<?>>, java.lang.Object> r0 = r2.f152799b
            r3.setViewTypeMap(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.security.SecurityPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
