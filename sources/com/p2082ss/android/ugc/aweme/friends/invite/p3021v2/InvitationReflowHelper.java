package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.dialog.p1716e.C23053d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39117g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39227a;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63849o;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper */
public final class InvitationReflowHelper implements IAccountUserService.AbstractC31278a, AbstractC33974au, AbstractC51539b, AbstractC63854r, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static C51550c f118803c;

    /* renamed from: d */
    public static final C51548a f118804d = new C51548a((byte) 0);

    /* renamed from: a */
    public C51550c f118805a;

    /* renamed from: b */
    WeakReference<C23013a> f118806b;

    /* renamed from: e */
    private boolean f118807e = C51549b.f118813a;

    /* renamed from: f */
    private final AbstractC89244h f118808f = C89250i.m154773a((AbstractC89171a) new C51553e(this));

    /* renamed from: g */
    private final AbstractC89244h f118809g = C89250i.m154773a((AbstractC89171a) C51554f.f118821a);

    /* renamed from: h */
    private final AbstractC89244h f118810h = C89250i.m154773a((AbstractC89171a) C51552d.f118819a);

    /* renamed from: i */
    private final C51569r f118811i = new C51569r(this);

    /* renamed from: j */
    private final WeakReference<ActivityC0945e> f118812j;

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$c */
    public static final class C51550c {

        /* renamed from: d */
        public static final C51551a f118815d = new C51551a((byte) 0);

        /* renamed from: a */
        public final String f118816a;

        /* renamed from: b */
        public final String f118817b;

        /* renamed from: c */
        public final String f118818c;

        static {
            Covode.recordClassIndex(60820);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C51550c)) {
                return false;
            }
            C51550c cVar = (C51550c) obj;
            return C89219l.m154714a(this.f118816a, cVar.f118816a) && C89219l.m154714a(this.f118817b, cVar.f118817b) && C89219l.m154714a(this.f118818c, cVar.f118818c);
        }

        public final int hashCode() {
            String str = this.f118816a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f118817b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f118818c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Invitation(code=" + this.f118816a + ", uid=" + this.f118817b + ", secUid=" + this.f118818c + ")";
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$c$a */
        public static final class C51551a {
            static {
                Covode.recordClassIndex(60821);
            }

            private C51551a() {
            }

            public /* synthetic */ C51551a(byte b) {
                this();
            }

            /* renamed from: a */
            public static C51550c m96066a(Intent intent) {
                C89219l.m154721d(intent, "");
                return new C51550c(m96068a(intent, "invitation_code"), m96068a(intent, "inviter_uid"), m96068a(intent, "inviter_sec_uid"));
            }

            /* renamed from: a */
            public static C51550c m96067a(Uri uri) {
                C89219l.m154721d(uri, "");
                return new C51550c(uri.getQueryParameter("invitation_code"), uri.getQueryParameter("inviter_uid"), uri.getQueryParameter("inviter_sec_uid"));
            }

            /* renamed from: a */
            private static String m96068a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        /* renamed from: a */
        public final boolean mo87078a() {
            if (!C80538hl.m139614a(this.f118816a) || !C80538hl.m139614a(this.f118817b) || !C80538hl.m139614a(this.f118818c)) {
                return false;
            }
            return true;
        }

        public C51550c(String str, String str2, String str3) {
            this.f118816a = str;
            this.f118817b = str2;
            this.f118818c = str3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$m */
    public final /* synthetic */ class RunnableC51561m implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f118829a;

        static {
            Covode.recordClassIndex(60831);
        }

        RunnableC51561m(AbstractC89171a aVar) {
            this.f118829a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f118829a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(60817);
    }

    /* renamed from: e */
    private final C63849o m96046e() {
        return (C63849o) this.f118809g.getValue();
    }

    /* renamed from: f */
    private final Handler m96047f() {
        return (Handler) this.f118810h.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C69488a mo87073c() {
        return (C69488a) this.f118808f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(320, new RunnableC90250g(InvitationReflowHelper.class, "onComplianceDialogDone", C39227a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$a */
    public static final class C51548a {
        static {
            Covode.recordClassIndex(60818);
        }

        private C51548a() {
        }

        /* renamed from: a */
        public static boolean m96063a() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return g.isLogin();
        }

        public /* synthetic */ C51548a(byte b) {
            this();
        }

        /* renamed from: a */
        private static C51550c m96061a(Uri uri) {
            String queryParameter;
            String queryParameter2;
            String queryParameter3;
            C51550c a = C51550c.C51551a.m96067a(uri);
            if (!(a.mo87078a() || (queryParameter3 = uri.getQueryParameter("params_url")) == null || queryParameter3.length() == 0)) {
                Uri parse = Uri.parse(queryParameter3);
                C89219l.m154716b(parse, "");
                a = C51550c.C51551a.m96067a(parse);
            }
            if (!(a.mo87078a() || (queryParameter = uri.getQueryParameter("target_url")) == null || queryParameter.length() == 0 || (queryParameter2 = Uri.parse(queryParameter).getQueryParameter("af_dp")) == null || queryParameter2.length() == 0)) {
                Uri parse2 = Uri.parse(queryParameter2);
                C89219l.m154716b(parse2, "");
                a = C51550c.C51551a.m96067a(parse2);
            }
            C39109f.m79403b("InvitationReflowHelper", "interceptDeepLink: ".concat(String.valueOf(a)));
            return a;
        }

        /* renamed from: a */
        private static boolean m96064a(C51550c cVar) {
            boolean z;
            if (AbstractC56869p.C56870a.m103133a().mo63253d() != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean shouldShowForcedLogin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin();
            C39109f.m79403b("InvitationReflowHelper", "shouldJourney: " + z + ", shouldMandatoryLogin:" + shouldShowForcedLogin);
            if (!z && !shouldShowForcedLogin) {
                return false;
            }
            InvitationReflowHelper.f118803c = cVar;
            C39109f.m79403b("InvitationReflowHelper", "jumpUntilNextMainLaunch");
            return true;
        }

        /* renamed from: a */
        public static Intent m96060a(Uri uri, Intent intent) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(intent, "");
            try {
                C51550c a = m96061a(uri);
                if (a.mo87078a()) {
                    if (m96064a(a)) {
                        return null;
                    }
                    C89219l.m154721d(intent, "");
                    intent.putExtra("invitation_code", a.f118816a);
                    intent.putExtra("inviter_uid", a.f118817b);
                    intent.putExtra("inviter_sec_uid", a.f118818c);
                }
            } catch (Throwable th) {
                C39109f.m79401a("InvitationReflowHelper", "interceptDeepLink error", th);
            }
            return intent;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.p<java.lang.String, ? extends java.util.HashMap<java.lang.String, java.lang.Object>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static C89378p<String, HashMap<String, Object>> m96062a(String str, C89378p<String, ? extends HashMap<String, Object>> pVar) {
            String str2 = "";
            C89219l.m154721d(str, str2);
            C89219l.m154721d(pVar, str2);
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, str2);
                C51550c a = m96061a(parse);
                if (a.mo87078a()) {
                    if (m96064a(a)) {
                        return new C89378p<>(str2, pVar.getSecond());
                    }
                    HashMap hashMap = (HashMap) pVar.getSecond();
                    C89219l.m154721d(hashMap, str2);
                    String str3 = a.f118816a;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    hashMap.put("invitation_code", str3);
                    String str4 = a.f118817b;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    hashMap.put("inviter_uid", str4);
                    String str5 = a.f118818c;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    hashMap.put("inviter_sec_uid", str2);
                }
            } catch (Throwable th) {
                C39109f.m79401a("InvitationReflowHelper", "interceptDeepLink error", th);
            }
            return pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$b */
    public static final class C51549b implements AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        static boolean f118813a;

        /* renamed from: b */
        public static final C51549b f118814b;

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(320, new RunnableC90250g(C51549b.class, "onComplianceDialogDone", C39227a.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private C51549b() {
        }

        static {
            Covode.recordClassIndex(60819);
            C51549b bVar = new C51549b();
            f118814b = bVar;
            C80298cg.m139204a(bVar);
        }

        @AbstractC90264r
        public final void onComplianceDialogDone(C39227a aVar) {
            C39109f.m79403b("InvitationReflowHelper", "ComplianceSubscriber onComplianceDialogDone");
            f118813a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$r */
    public static final class C51569r implements C69488a.AbstractC69490b {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118846a;

        static {
            Covode.recordClassIndex(60839);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: a */
        public final void mo87085a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$r$a */
        static final class RunnableC51570a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C51569r f118847a;

            static {
                Covode.recordClassIndex(60840);
            }

            RunnableC51570a(C51569r rVar) {
                this.f118847a = rVar;
            }

            public final void run() {
                this.f118847a.f118846a.mo87074d();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: b */
        public final void mo87086b() {
            new Handler(Looper.getMainLooper()).post(new RunnableC51570a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51569r(InvitationReflowHelper invitationReflowHelper) {
            this.f118846a = invitationReflowHelper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$f */
    static final class C51554f extends AbstractC89220m implements AbstractC89171a<C63849o> {

        /* renamed from: a */
        public static final C51554f f118821a = new C51554f();

        static {
            Covode.recordClassIndex(60824);
        }

        C51554f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63849o invoke() {
            return new C63849o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$d */
    static final class C51552d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C51552d f118819a = new C51552d();

        static {
            Covode.recordClassIndex(60822);
        }

        C51552d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$e */
    static final class C51553e extends AbstractC89220m implements AbstractC89171a<C69488a> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118820a;

        static {
            Covode.recordClassIndex(60823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51553e(InvitationReflowHelper invitationReflowHelper) {
            super(0);
            this.f118820a = invitationReflowHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69488a invoke() {
            ActivityC0945e b = this.f118820a.mo87071b();
            if (b == null) {
                C89219l.m154715b();
            }
            return C69488a.C69489a.m122709a(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$i */
    public static final /* synthetic */ class C51557i extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(60827);
        }

        C51557i(InvitationReflowHelper invitationReflowHelper) {
            super(0, invitationReflowHelper, InvitationReflowHelper.class, "tryReflow", "tryReflow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((InvitationReflowHelper) this.receiver).mo87074d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$j */
    static final /* synthetic */ class C51558j extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(60828);
        }

        C51558j(InvitationReflowHelper invitationReflowHelper) {
            super(0, invitationReflowHelper, InvitationReflowHelper.class, "tryReflow", "tryReflow()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((InvitationReflowHelper) this.receiver).mo87074d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final ActivityC0945e mo87071b() {
        return this.f118812j.get();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f118805a = null;
        this.f118807e = false;
        m96046e().ck_();
        m96047f().removeCallbacksAndMessages(null);
        C80298cg.m139205b(this);
        C31575b.m65865g().removeUserChangeListener(this);
    }

    /* renamed from: d */
    public final void mo87074d() {
        C51550c cVar;
        C23013a aVar;
        boolean a = mo87073c().mo109737a("swipe_up_guide");
        if (!this.f118807e || a || (cVar = this.f118805a) == null || !cVar.mo87078a()) {
            C39109f.m79403b("InvitationReflowHelper", "tryReflow blocked by:" + this.f118807e + ", " + a + ", " + this.f118805a);
            return;
        }
        WeakReference<C23013a> weakReference = this.f118806b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            aVar.dismiss();
        }
        C51550c cVar2 = this.f118805a;
        if (cVar2 == null) {
            C89219l.m154715b();
        }
        m96044a(cVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b
    /* renamed from: a */
    public final void mo87044a() {
        C51550c cVar = f118803c;
        if (cVar != null) {
            this.f118805a = cVar;
            f118803c = null;
            if (!C34671a.f81927a.mo61329c()) {
                m96047f().postDelayed(new RunnableC51561m(new C51558j(this)), 3000);
            } else {
                mo87074d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$g */
    static final class View$OnClickListenerC51555g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118822a;

        /* renamed from: b */
        final /* synthetic */ User f118823b;

        static {
            Covode.recordClassIndex(60825);
        }

        View$OnClickListenerC51555g(InvitationReflowHelper invitationReflowHelper, User user) {
            this.f118822a = invitationReflowHelper;
            this.f118823b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f118822a.mo87072b(this.f118823b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$h */
    static final class View$OnClickListenerC51556h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118824a;

        /* renamed from: b */
        final /* synthetic */ User f118825b;

        static {
            Covode.recordClassIndex(60826);
        }

        View$OnClickListenerC51556h(InvitationReflowHelper invitationReflowHelper, User user) {
            this.f118824a = invitationReflowHelper;
            this.f118825b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f118824a.mo87072b(this.f118825b);
        }
    }

    /* renamed from: a */
    public static void m96043a(ActivityC0945e eVar) {
        new C23144b(eVar).mo37640e(R.string.clf).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        ActivityC0945e b = mo87071b();
        if (b != null) {
            m96043a(b);
        }
    }

    @AbstractC90264r
    public final void onComplianceDialogDone(C39227a aVar) {
        C39109f.m79403b("InvitationReflowHelper", "onComplianceDialogDone");
        this.f118807e = true;
        mo87074d();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$n */
    static final class C51562n extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118830a;

        /* renamed from: b */
        final /* synthetic */ User f118831b;

        static {
            Covode.recordClassIndex(60832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51562n(InvitationReflowHelper invitationReflowHelper, User user) {
            super(1);
            this.f118830a = invitationReflowHelper;
            this.f118831b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            InvitationReflowHelper.m96045a(this.f118831b, "enter_profile");
            this.f118830a.mo87072b(this.f118831b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$p */
    static final class C51564p extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118836a;

        /* renamed from: b */
        final /* synthetic */ int f118837b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f118838c;

        /* renamed from: d */
        final /* synthetic */ int f118839d = R.string.clg;

        /* renamed from: e */
        final /* synthetic */ User f118840e;

        static {
            Covode.recordClassIndex(60834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51564p(InvitationReflowHelper invitationReflowHelper, int i, AbstractC89172b bVar, User user) {
            super(1);
            this.f118836a = invitationReflowHelper;
            this.f118837b = i;
            this.f118838c = bVar;
            this.f118840e = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37423a(this.f118837b, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationReflowHelper.C51564p.C515651 */

                /* renamed from: a */
                final /* synthetic */ C51564p f118841a;

                static {
                    Covode.recordClassIndex(60835);
                }

                {
                    this.f118841a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f118841a.f118838c.invoke(aVar);
                    return C89391z.f203057a;
                }
            });
            dVar2.mo37425b(this.f118839d, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationReflowHelper.C51564p.C515662 */

                /* renamed from: a */
                final /* synthetic */ C51564p f118842a;

                static {
                    Covode.recordClassIndex(60836);
                }

                {
                    this.f118842a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    InvitationReflowHelper.m96045a(this.f118842a.f118840e, "cancel");
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$q */
    static final class C51567q extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118843a;

        /* renamed from: b */
        final /* synthetic */ User f118844b;

        static {
            Covode.recordClassIndex(60837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51567q(InvitationReflowHelper invitationReflowHelper, User user) {
            super(1);
            this.f118843a = invitationReflowHelper;
            this.f118844b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.hcf, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationReflowHelper.C51567q.C515681 */

                /* renamed from: a */
                final /* synthetic */ C51567q f118845a;

                static {
                    Covode.recordClassIndex(60838);
                }

                {
                    this.f118845a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f118845a.f118843a.mo87070a(this.f118845a.f118844b);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.dfo, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        ActivityC0945e b;
        if (followStatus != null && followStatus.followStatus == 4 && (b = mo87071b()) != null) {
            new C23144b(b).mo37640e(R.string.esv).mo37637b();
        }
    }

    public InvitationReflowHelper(WeakReference<ActivityC0945e> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f118812j = weakReference;
    }

    /* renamed from: a */
    private final void m96044a(C51550c cVar) {
        C39109f.m79403b("InvitationReflowHelper", "request, info:".concat(String.valueOf(cVar)));
        InvitationApi invitationApi = InvitationApi.f118801a;
        String str = cVar.f118816a;
        if (str == null) {
            C89219l.m154715b();
        }
        String str2 = cVar.f118817b;
        if (str2 == null) {
            C89219l.m154715b();
        }
        String str3 = cVar.f118818c;
        if (str3 == null) {
            C89219l.m154715b();
        }
        C39117g.m79416a(invitationApi.getInvitationInfo(str, str2, str3), new C51559k(this, cVar), new C51560l(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b
    /* renamed from: b */
    public final void mo87046b(Intent intent) {
        C89219l.m154721d(intent, "");
        C51550c cVar = f118803c;
        if (cVar == null) {
            cVar = C51550c.C51551a.m96066a(intent);
        }
        f118803c = null;
        if (cVar.mo87078a()) {
            this.f118805a = cVar;
            if (!C34671a.f81927a.mo61329c()) {
                m96047f().postDelayed(new RunnableC51561m(new C51557i(this)), 3000);
            } else {
                mo87074d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$l */
    public static final class C51560l extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118828a;

        static {
            Covode.recordClassIndex(60830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51560l(InvitationReflowHelper invitationReflowHelper) {
            super(1);
            this.f118828a = invitationReflowHelper;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            if (th2 instanceof C34485a) {
                C39109f.m79404c("InvitationReflowHelper", "request onError: " + ((C34485a) th2).getResponse());
            } else {
                ActivityC0945e b = this.f118828a.mo87071b();
                if (b != null) {
                    InvitationReflowHelper.m96043a(b);
                }
                C39109f.m79404c("InvitationReflowHelper", "request onError: " + th2.getMessage());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$o */
    static final class C51563o extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118832a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f118833b;

        /* renamed from: c */
        final /* synthetic */ User f118834c;

        /* renamed from: d */
        final /* synthetic */ C51550c f118835d;

        static {
            Covode.recordClassIndex(60833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51563o(InvitationReflowHelper invitationReflowHelper, ActivityC0945e eVar, User user, C51550c cVar) {
            super(1);
            this.f118832a = invitationReflowHelper;
            this.f118833b = eVar;
            this.f118834c = user;
            this.f118835d = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            InvitationReflowHelper.m96045a(this.f118834c, "follow");
            if (!C51548a.m96063a()) {
                this.f118832a.f118805a = this.f118835d;
                C58957c.m108318a(this.f118833b, "homepage_hot", "");
            } else if (this.f118834c.isBlock()) {
                InvitationReflowHelper invitationReflowHelper = this.f118832a;
                User user = this.f118834c;
                if (invitationReflowHelper.mo87071b() != null) {
                    ActivityC0945e b = invitationReflowHelper.mo87071b();
                    Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ((C23023b) C23028c.m43435a((C23023b) new C23023b(b).mo37483b(R.string.h0x), new C51567q(invitationReflowHelper, user)).mo37482a(false)).mo37405a().mo37396b().show();
                }
            } else {
                this.f118832a.mo87070a(this.f118834c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo87072b(User user) {
        int followStatus;
        SmartRouter.buildRoute(mo87071b(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "homepage_hot").withParam("enter_method", "follow_invite_popup").withParam("extra_from_pre_page", "homepage_hot").withParam("extra_previous_page_position", "follow_invite_popup").open();
        if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
            followStatus = 3;
        } else {
            followStatus = user.getFollowStatus();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("enter_method", "follow_invite_popup");
        String uid = user.getUid();
        C89219l.m154716b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("follow_status", String.valueOf(followStatus));
        C39162r.m79460a("enter_personal_detail", linkedHashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper$k */
    public static final class C51559k extends AbstractC89220m implements AbstractC89172b<C51597b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InvitationReflowHelper f118826a;

        /* renamed from: b */
        final /* synthetic */ C51550c f118827b;

        static {
            Covode.recordClassIndex(60829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51559k(InvitationReflowHelper invitationReflowHelper, C51550c cVar) {
            super(1);
            this.f118826a = invitationReflowHelper;
            this.f118827b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C51597b bVar) {
            String str;
            ActivityC0945e b;
            boolean z;
            View inflate;
            int i;
            AbstractC89172b bVar2;
            String str2;
            MethodCollector.m26663i(11454);
            C51597b bVar3 = bVar;
            C89219l.m154721d(bVar3, "");
            StringBuilder sb = new StringBuilder("request onResult, inviter:");
            User user = bVar3.f118903a;
            if (user != null) {
                str = user.getUid() + ", " + user.getFollowStatus() + ", " + user.isBlock + ", " + user.isBlocked();
            } else {
                str = null;
            }
            C39109f.m79403b("InvitationReflowHelper", sb.append(str).toString());
            if (!(bVar3.f118903a == null || (b = this.f118826a.mo87071b()) == null)) {
                InvitationReflowHelper invitationReflowHelper = this.f118826a;
                C51550c cVar = this.f118827b;
                User user2 = bVar3.f118903a;
                if (invitationReflowHelper.mo87073c().mo109737a("swipe_up_guide")) {
                    C39109f.m79404c("InvitationReflowHelper", "showReflowDialog blocked by swipe showing");
                } else {
                    invitationReflowHelper.f118805a = null;
                    if (user2.getFollowStatus() == 1 || user2.getFollowStatus() == 2 || user2.getFollowStatus() == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C51548a.m96063a()) {
                        inflate = LayoutInflater.from(b).inflate(R.layout.a24, (ViewGroup) null);
                        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.bsu);
                        C34577e.m70592a(remoteImageView, user2.getAvatarThumb());
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        User curUser = g.getCurUser();
                        C89219l.m154716b(curUser, "");
                        C34577e.m70592a((RemoteImageView) inflate.findViewById(R.id.bsw), curUser.getAvatarThumb());
                        remoteImageView.setOnClickListener(new View$OnClickListenerC51555g(invitationReflowHelper, user2));
                        C89219l.m154716b(inflate, "");
                    } else {
                        inflate = LayoutInflater.from(b).inflate(R.layout.a23, (ViewGroup) null);
                        RemoteImageView remoteImageView2 = (RemoteImageView) inflate.findViewById(R.id.bsr);
                        remoteImageView2.setOnClickListener(new View$OnClickListenerC51556h(invitationReflowHelper, user2));
                        C34577e.m70592a(remoteImageView2, user2.getAvatarThumb());
                        C89219l.m154716b(inflate, "");
                    }
                    if (user2.isBlocked() || z) {
                        str2 = b.getString(R.string.c0m);
                        C89219l.m154716b(str2, "");
                        i = R.string.clh;
                        bVar2 = new C51562n(invitationReflowHelper, user2);
                    } else {
                        str2 = b.getString(R.string.clj, new Object[]{user2.getNickname()});
                        C89219l.m154716b(str2, "");
                        i = R.string.ckn;
                        bVar2 = new C51563o(invitationReflowHelper, b, user2, cVar);
                    }
                    C23013a a = ((C23023b) C23032e.m43444a((C23023b) C23053d.m43471a(new C23023b(b), inflate, 0).mo37411b(str2).mo37483b(R.string.cli), new C51564p(invitationReflowHelper, i, bVar2, user2)).mo37482a(false)).mo37405a();
                    invitationReflowHelper.f118806b = new WeakReference<>(a);
                    a.mo37396b().show();
                    InvitationReflowHelper.m96045a(user2, "show");
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(11454);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b
    /* renamed from: a */
    public final void mo87045a(Intent intent) {
        C89219l.m154721d(intent, "");
        ActivityC0945e b = mo87071b();
        if (b == null) {
            C89219l.m154715b();
        }
        b.getLifecycle().mo4012a(this);
        C80298cg.m139204a(this);
        mo87073c().mo109734a(this.f118811i);
        C31575b.m65865g().addUserChangeListener(this);
        mo87046b(intent);
    }

    /* renamed from: a */
    public final void mo87070a(User user) {
        boolean z;
        String str;
        if (m96046e().mo67842j()) {
            C39109f.m79404c("InvitationReflowHelper", "doFollowInviter loading now, " + user.getUid());
            return;
        }
        m96046e().mo67839a_(this);
        C63849o e = m96046e();
        C63847n.C63848a b = new C63847n.C63848a().mo103320a(user.getUid()).mo103325b(user.getSecUid());
        if (user.isSecret() || user.isPrivateAccount()) {
            z = true;
        } else {
            z = false;
        }
        e.mo87469a(b.mo103322a(z).mo103318a(1).mo103324b(29).mo103328d(user.getFollowerStatus()).mo103323a());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = user.getUid();
        C89219l.m154716b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("enter_method", "follow_invite_popup");
        if (user.getFollowerStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        linkedHashMap.put("follow_type", str);
        C39162r.m79460a("follow", linkedHashMap);
    }

    /* renamed from: a */
    public static void m96045a(User user, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uid = user.getUid();
        C89219l.m154716b(uid, "");
        linkedHashMap.put("to_user_id", uid);
        linkedHashMap.put("enter_from", "homepage_hot");
        linkedHashMap.put("action_type", str);
        if (C51548a.m96063a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        linkedHashMap.put("is_login", str2);
        C39162r.m79460a("invitee_guide_follow_pop_up", linkedHashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService.AbstractC31278a
    /* renamed from: a */
    public final void mo57195a(int i, User user, User user2) {
        C23013a aVar;
        if (i == 1) {
            if (C51548a.m96063a()) {
                WeakReference<C23013a> weakReference = this.f118806b;
                if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                    aVar.dismiss();
                }
                mo87074d();
            }
        } else if (i == 3) {
            C51549b.f118813a = false;
        }
    }
}
