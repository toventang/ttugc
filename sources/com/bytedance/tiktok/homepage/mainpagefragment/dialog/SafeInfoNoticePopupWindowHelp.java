package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.security.C32937a;
import com.p2082ss.android.ugc.aweme.account.security.C32939c;
import com.p2082ss.android.ugc.aweme.account.security.C32940d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39229c;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41925d;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.profile.C63424aj;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

public final class SafeInfoNoticePopupWindowHelp implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C32940d f53883a;

    /* renamed from: b */
    private final AbstractC56223a f53884b;

    /* renamed from: c */
    private final AbstractC39235f f53885c;

    /* renamed from: d */
    private final View f53886d;

    /* renamed from: e */
    private final AbstractC34586a f53887e;

    /* renamed from: f */
    private final TabChangeManager f53888f;

    /* renamed from: g */
    private boolean f53889g;

    static {
        Covode.recordClassIndex(26718);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(183, new RunnableC90250g(SafeInfoNoticePopupWindowHelp.class, "onDiscoverSearchEvent", C41925d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(184, new RunnableC90250g(SafeInfoNoticePopupWindowHelp.class, "onShowPolicyNoticeToastEvent", C39229c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(185, new RunnableC90250g(SafeInfoNoticePopupWindowHelp.class, "onSafeInfoNoticeEvent", C63424aj.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f53889g = false;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: a */
    public final void mo37134a() {
        C32940d dVar;
        C32940d dVar2 = this.f53883a;
        if (!(dVar2 == null || !dVar2.isShowing() || (dVar = this.f53883a) == null)) {
            try {
                dVar.dismiss();
            } catch (Exception unused) {
            }
        }
        this.f53884b.mo93048k();
    }

    /* renamed from: b */
    private final boolean m43040b() {
        AbstractC39235f fVar;
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sb = new StringBuilder("prior_to_safe_info_");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!repo.getBoolean(sb.append(g.getCurUserId()).toString(), false) && ((fVar = this.f53885c) == null || fVar.getToastVisibility() != 0)) {
            return C32940d.C32941a.m67579a();
        }
        mo37134a();
        return false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        TabChangeManager tabChangeManager;
        this.f53889g = true;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("prior_to_safe_info_");
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), false) || ((tabChangeManager = this.f53888f) != null && C89219l.m154714a((Object) "HOME", (Object) tabChangeManager.f134312d))) {
                mo37134a();
            }
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp$a */
    public static final class C22821a implements AbstractC88406ae<C32939c> {

        /* renamed from: a */
        final /* synthetic */ SafeInfoNoticePopupWindowHelp f53890a;

        static {
            Covode.recordClassIndex(26719);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C22821a(SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp) {
            this.f53890a = safeInfoNoticePopupWindowHelp;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C32939c cVar) {
            C32939c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("last_time_fetch_safe_info_");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            repo.storeLong(sb.append(g.getCurUserId()).toString(), System.currentTimeMillis() + (SettingsManager.m29616a().mo25395a("safe_info_notice_frequency", 86400L) * 1000));
            C32937a aVar = cVar2.f78376a;
            if (aVar != null && !TextUtils.isEmpty(aVar.f78368b)) {
                C27910f fVar = new C27910f();
                StringBuilder sb2 = new StringBuilder("safe_info_");
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                repo.storeString(sb2.append(g2.getCurUserId()).toString(), fVar.mo46674b(aVar));
                StringBuilder sb3 = new StringBuilder("safe_info_need_show_");
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                repo.storeBoolean(sb3.append(g3.getCurUserId()).toString(), true);
            }
            this.f53890a.mo37135a(true);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(C41925d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.f97796a) {
            mo37134a();
        } else {
            mo37135a(false);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSafeInfoNoticeEvent(C63424aj ajVar) {
        if (ajVar == null) {
            return;
        }
        if (ajVar.f143976a) {
            mo37134a();
        } else {
            mo37135a(false);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onShowPolicyNoticeToastEvent(C39229c cVar) {
        C89219l.m154721d(cVar, "");
        this.f53885c.setValues(cVar.f92671a);
        mo37134a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37135a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f53889g
            if (r0 == 0) goto L_0x000a
            boolean r0 = r3.m43040b()
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            com.ss.android.ugc.aweme.account.security.d r0 = r3.f53883a
            if (r0 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x0039
            r0.dismiss()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            r0 = 0
            r3.f53883a = r0
        L_0x0017:
            com.ss.android.ugc.aweme.account.security.d r2 = new com.ss.android.ugc.aweme.account.security.d
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f53887e
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            android.view.View r0 = r3.f53886d
            r2.<init>(r1, r0)
            r3.f53883a = r2
            r0 = 1
            r2.setTouchable(r0)
            com.ss.android.ugc.aweme.account.security.d r1 = r3.f53883a
            if (r1 == 0) goto L_0x0039
            r0 = 2130772080(0x7f010070, float:1.7147268E38)
            r1.setAnimationStyle(r0)
        L_0x0039:
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f53887e
            androidx.fragment.app.e r0 = r0.getActivity()
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f53887e
            androidx.fragment.app.e r0 = r0.getActivity()
            if (r0 != 0) goto L_0x004c
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x004c:
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x000a
            com.ss.android.ugc.aweme.base.f.a r0 = r3.f53887e
            boolean r0 = r0.af_()
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.account.security.d r0 = r3.f53883a
            if (r0 == 0) goto L_0x000a
            r0.mo58721a()
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp.mo37135a(boolean):void");
    }

    public SafeInfoNoticePopupWindowHelp(AbstractC34586a aVar, AbstractC56223a aVar2, AbstractC39235f fVar, View view, TabChangeManager tabChangeManager) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(tabChangeManager, "");
        this.f53884b = aVar2;
        this.f53885c = fVar;
        this.f53886d = view;
        this.f53887e = aVar;
        this.f53888f = tabChangeManager;
        AbstractC1196i lifecycle = aVar.getLifecycle();
        if (lifecycle != null) {
            lifecycle.mo4012a(this);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }
}
