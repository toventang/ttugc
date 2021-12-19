package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.page.privacy.p3727a.C68313a;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.C79547e;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage */
public final class FindCtxSettingPage extends AbstractC68195a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C68637a f153590i = new C68637a((byte) 0);

    /* renamed from: e */
    public View$OnClickListenerC68675f f153591e;

    /* renamed from: f */
    public View$OnClickListenerC68681g f153592f;

    /* renamed from: g */
    public View$OnClickListenerC68647d f153593g;

    /* renamed from: h */
    public View$OnClickListenerC68661e f153594h;

    /* renamed from: j */
    private final AbstractC89244h f153595j = C89250i.m154773a((AbstractC89171a) new C68643e(this));

    /* renamed from: k */
    private boolean f153596k;

    /* renamed from: l */
    private final AbstractC89244h f153597l = C89250i.m154773a((AbstractC89171a) new C68642d(this));

    /* renamed from: m */
    private SparseArray f153598m;

    static {
        Covode.recordClassIndex(80893);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f153598m == null) {
            this.f153598m = new SparseArray();
        }
        View view = (View) this.f153598m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f153598m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f153598m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.axa;
    }

    /* renamed from: d */
    public final FindCtxViewModel mo109136d() {
        return (FindCtxViewModel) this.f153595j.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(233, new RunnableC90250g(FindCtxSettingPage.class, "onBackFromPermissionSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage$a */
    public static final class C68637a {
        static {
            Covode.recordClassIndex(80894);
        }

        private C68637a() {
        }

        public /* synthetic */ C68637a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage$d */
    static final class C68642d extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ FindCtxSettingPage f153605a;

        static {
            Covode.recordClassIndex(80899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68642d(FindCtxSettingPage findCtxSettingPage) {
            super(0);
            this.f153605a = findCtxSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f153605a.mo27715a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage$e */
    static final class C68643e extends AbstractC89220m implements AbstractC89171a<FindCtxViewModel> {

        /* renamed from: a */
        final /* synthetic */ FindCtxSettingPage f153606a;

        static {
            Covode.recordClassIndex(80900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68643e(FindCtxSettingPage findCtxSettingPage) {
            super(0);
            this.f153606a = findCtxSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FindCtxViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f153606a, (C1175ad.AbstractC1177b) null).mo3983a(FindCtxViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C68313a.m120607b(false);
        C68313a.m120609c(false);
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: h */
    public final void mo108725h() {
        Intent intent;
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            intent.putExtra("currentSettingsValue", mo109136d().f153607a);
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                activity2.setResult(-1, intent);
            }
        }
        super.mo108725h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f153596k) {
            if (C51648a.f118980a.mo87333m()) {
                ((AbstractC51435a) C34505b.m70490a(getContext(), AbstractC51435a.class)).mo60945a(false);
                C68313a.m120605a(true);
                FindCtxViewModel d = mo109136d();
                if (d != null) {
                    d.mo109138a(new C68646c(new C79546d(EnumC79549g.SYNC_STATUS, new C79547e(true, 0, 0, null, 14)), "contact"));
                }
            }
            this.f153596k = false;
        }
        if (!C51648a.f118980a.mo87333m() && mo109136d().f153607a) {
            C68313a.m120605a(false);
        }
        AbstractC51485d g = C51648a.f118980a.mo87327g();
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        if (g.mo86987a(b.getUid()).length() == 0 && mo109136d().f153608b) {
            C51648a.f118980a.mo87324d(false);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onBackFromPermissionSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        C89219l.m154721d(backFromSettingEvent, "");
        if (C89219l.m154714a((Object) "privacy_setting", (Object) backFromSettingEvent.enterFrom)) {
            this.f153596k = true;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.m156966a(EventBus.m156962a(), this);
        C39162r.m79460a("enter_sync_auth", new C33744d().mo59983a("enter_from", "privacy_setting").f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage$b */
    static final class C68638b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FindCtxSettingPage f153599a;

        static {
            Covode.recordClassIndex(80895);
        }

        C68638b(FindCtxSettingPage findCtxSettingPage) {
            this.f153599a = findCtxSettingPage;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final C68646c cVar = (C68646c) obj;
            View$OnClickListenerC68675f fVar = this.f153599a.f153591e;
            if (fVar == null) {
                C89219l.m154710a("syncContactUnit");
            }
            fVar.mo70126a(new AbstractC89172b<C34800h, C34800h>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.C68638b.C686391 */

                /* renamed from: a */
                final /* synthetic */ C68638b f153600a;

                static {
                    Covode.recordClassIndex(80896);
                }

                {
                    this.f153600a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34800h invoke(C34800h hVar) {
                    C34800h hVar2 = hVar;
                    C89219l.m154721d(hVar2, "");
                    boolean z = cVar.f153613a.f178517b.f178518a;
                    this.f153600a.f153599a.mo109136d().f153607a = z;
                    return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
            View$OnClickListenerC68647d dVar = this.f153599a.f153593g;
            if (dVar == null) {
                C89219l.m154710a("removeContactsUnit");
            }
            dVar.f153617b = true;
            if (dVar.f153617b) {
                dVar.mo109145g();
                dVar.f153617b = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage$c */
    static final class C68640c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FindCtxSettingPage f153602a;

        static {
            Covode.recordClassIndex(80897);
        }

        C68640c(FindCtxSettingPage findCtxSettingPage) {
            this.f153602a = findCtxSettingPage;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final C68646c cVar = (C68646c) obj;
            View$OnClickListenerC68681g gVar = this.f153602a.f153592f;
            if (gVar == null) {
                C89219l.m154710a("syncFBFriendsUnit");
            }
            gVar.mo70126a(new AbstractC89172b<C34800h, C34800h>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.C68640c.C686411 */

                /* renamed from: a */
                final /* synthetic */ C68640c f153603a;

                static {
                    Covode.recordClassIndex(80898);
                }

                {
                    this.f153603a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34800h invoke(C34800h hVar) {
                    C34800h hVar2 = hVar;
                    C89219l.m154721d(hVar2, "");
                    boolean z = cVar.f153613a.f178517b.f178518a;
                    this.f153603a.f153602a.mo109136d().f153608b = z;
                    return C34800h.m71083a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
            View$OnClickListenerC68661e eVar = this.f153602a.f153594h;
            if (eVar == null) {
                C89219l.m154710a("removeFBFriendsUnit");
            }
            eVar.f153643b = true;
            if (eVar.f153643b) {
                eVar.mo109157h();
                eVar.f153643b = false;
            }
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
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
