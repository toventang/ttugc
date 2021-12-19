package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.AbstractC40957dd;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.IMainPageFragment;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
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
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b */
public final class C53318b extends AbstractC40957dd implements AbstractC53317a, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public View.OnClickListener f122397a;

    /* renamed from: b */
    public AbstractC53316a f122398b;

    /* renamed from: c */
    public C53324d f122399c;

    /* renamed from: d */
    AbstractC17256a f122400d;

    /* renamed from: j */
    public final Context f122401j;

    /* renamed from: k */
    private final AbstractC89244h f122402k = C89250i.m154773a((AbstractC89171a) new C53320b(this));

    static {
        Covode.recordClassIndex(62879);
    }

    /* renamed from: b */
    public final C33931ar mo89774b() {
        return (C33931ar) this.f122402k.getValue();
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        return null;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new RunnableC90250g(C53318b.class, "onScrollToProfileEvent", C49669ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(346, new RunnableC90250g(C53318b.class, "onSuperEntranceEvent", SuperEntranceEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return mo89774b().f100355i;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return mo89774b().f100354h;
    }

    /* renamed from: j */
    public final void mo89775j() {
        AbstractC17256a aVar = this.f122400d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b$b */
    static final class C53320b extends AbstractC89220m implements AbstractC89171a<C33931ar> {

        /* renamed from: a */
        final /* synthetic */ C53318b f122404a;

        static {
            Covode.recordClassIndex(62881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53320b(C53318b bVar) {
            super(0);
            this.f122404a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33931ar invoke() {
            return C53323c.m98355a(this.f122404a.f122401j);
        }
    }

    /* renamed from: k */
    public final boolean mo89776k() {
        C53324d dVar = this.f122399c;
        if (dVar == null || !dVar.mo89789d()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.AbstractC40957dd
    /* renamed from: h */
    public final void mo57292h() {
        if (this.f122397a == null) {
            this.f122397a = HomePageUIFrameServiceImpl.m108627e().mo89378a(this.f122401j, mo89774b().f100354h);
        }
        View.OnClickListener onClickListener = this.f122397a;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b$c */
    static final class RunnableC53321c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53318b f122405a;

        static {
            Covode.recordClassIndex(62882);
        }

        RunnableC53321c(C53318b bVar) {
            this.f122405a = bVar;
        }

        public final void run() {
            ((C23329a) new C23329a(this.f122405a.f122401j).mo38041b(C53318b.m98344a(this.f122405a)).mo38034a(EnumC23352h.TOP).mo38039b((int) C13628n.m24520b(this.f122405a.f122401j, 10.0f))).mo38023e(R.string.eq4).mo38012d().mo38001a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b$d */
    static final class RunnableC53322d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53318b f122406a;

        /* renamed from: b */
        final /* synthetic */ String f122407b;

        /* renamed from: c */
        final /* synthetic */ Long f122408c;

        static {
            Covode.recordClassIndex(62883);
        }

        RunnableC53322d(C53318b bVar, String str, Long l) {
            this.f122406a = bVar;
            this.f122407b = str;
            this.f122408c = l;
        }

        public final void run() {
            C53318b bVar = this.f122406a;
            AbstractC53316a a = C53318b.m98344a(bVar);
            String str = this.f122407b;
            if (!TextUtils.isEmpty(str)) {
                Context context = a.getContext();
                C89219l.m154716b(context, "");
                C17257b bVar2 = new C17257b(context);
                if (str == null) {
                    str = "";
                }
                bVar.f122400d = bVar2.mo27356a(str).mo27354a(a).mo27358b(48).mo27352a(5000L).mo27357a(false).mo27350a();
                AbstractC17256a aVar = bVar.f122400d;
                if (aVar != null) {
                    aVar.mo27341a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b$a */
    public static final class View$OnAttachStateChangeListenerC53319a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C53318b f122403a;

        static {
            Covode.recordClassIndex(62880);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC53319a(C53318b bVar) {
            this.f122403a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            C89219l.m154721d(view, "");
            EventBus.m156966a(EventBus.m156962a(), this.f122403a);
        }

        public final void onViewDetachedFromWindow(View view) {
            C89219l.m154721d(view, "");
            EventBus.m156962a().mo145395b(this.f122403a);
            C53324d dVar = this.f122403a.f122399c;
            if (dVar != null) {
                dVar.mo89785b();
                dVar.mo89783a();
            }
        }
    }

    @AbstractC90264r
    public final void onScrollToProfileEvent(C49669ad adVar) {
        if (adVar != null) {
            mo89775j();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC53316a m98344a(C53318b bVar) {
        AbstractC53316a aVar = bVar.f122398b;
        if (aVar == null) {
            C89219l.m154710a("tabView");
        }
        return aVar;
    }

    public C53318b(Context context) {
        C89219l.m154721d(context, "");
        this.f122401j = context;
    }

    /* renamed from: a */
    private void m98345a(boolean z) {
        C53324d dVar = this.f122399c;
        if (dVar != null) {
            dVar.mo89786b(z);
        }
        C53324d dVar2 = this.f122399c;
        if (dVar2 != null) {
            dVar2.mo89787c(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        if (r4 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0148, code lost:
        if (r3 == null) goto L_0x001b;
     */
    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo62208a(com.p2082ss.android.ugc.aweme.AbstractC35331bz r10) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b.mo62208a(com.ss.android.ugc.aweme.bz):android.view.View");
    }

    @AbstractC90264r
    public final void onSuperEntranceEvent(SuperEntranceEvent superEntranceEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        if (superEntranceEvent != null) {
            ISpecialPlusService specialPlusService = AVExternalServiceImpl.m113114a().specialPlusService();
            boolean z4 = true;
            if (!superEntranceEvent.getShow()) {
                C53324d dVar = this.f122399c;
                if (dVar == null || !dVar.mo89789d()) {
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                    if (superEntranceEvent.getType() == 1) {
                        z2 = true;
                    }
                    z2 = false;
                }
                C53324d dVar2 = this.f122399c;
                if (dVar2 != null && dVar2.mo89788c() && superEntranceEvent.getType() == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || superEntranceEvent.getType() != 0) {
                    z4 = false;
                }
                if (!z2 && !z3 && !z4) {
                    C53324d dVar3 = this.f122399c;
                    if (dVar3 != null) {
                        dVar3.mo89783a();
                    }
                    specialPlusService.setSpecialPlusState(false);
                    C53324d dVar4 = this.f122399c;
                    if (dVar4 != null) {
                        dVar4.mo89784a(false);
                    }
                    C53324d dVar5 = this.f122399c;
                    if (dVar5 != null) {
                        dVar5.mo89787c(false);
                    }
                }
            } else if (superEntranceEvent.getType() == 3) {
                C53324d dVar6 = this.f122399c;
                if (dVar6 != null && !dVar6.mo89788c()) {
                    if (!specialPlusService.isQuickPromoPlusEnabled()) {
                        String specialPlusTips = specialPlusService.getSpecialPlusTips();
                        if (!TextUtils.isEmpty(specialPlusTips)) {
                            C53324d dVar7 = this.f122399c;
                            if (dVar7 == null) {
                                C89219l.m154715b();
                            }
                            if (!dVar7.mo89789d()) {
                                C53324d dVar8 = this.f122399c;
                                if (dVar8 == null || !dVar8.mo89789d()) {
                                    AbstractC53316a aVar = this.f122398b;
                                    if (aVar == null) {
                                        C89219l.m154710a("tabView");
                                    }
                                    aVar.post(new RunnableC53322d(this, specialPlusTips, 5000L));
                                }
                                IMainPageFragment j = MainPageFragmentImpl.m43110j();
                                if (j != null) {
                                    j.mo37201a();
                                }
                            }
                        }
                    }
                    C53324d dVar9 = this.f122399c;
                    if (dVar9 == null) {
                        C89219l.m154715b();
                    }
                    if (!dVar9.mo89789d()) {
                        if (MSAdaptionService.m97895c().mo89377c(this.f122401j)) {
                            str = "homepage_hot";
                        } else {
                            AbstractC59103j jVar = (AbstractC59103j) this.f122401j;
                            if (jVar != null) {
                                str = jVar.getEnterFrom();
                            } else {
                                str = null;
                            }
                        }
                        if (specialPlusService.isQuickPromoPlusEnabled() && specialPlusService.getQuickPromoPlusDebutTime() == 0) {
                            specialPlusService.setQuickPromoPlusDebutTime(System.currentTimeMillis() / 1000);
                        }
                        C39162r.m79460a("special_icon_show", new C33744d().mo59983a("enter_from", str).mo59983a("prop_id", specialPlusService.getEffectId()).f79943a);
                    }
                    m98345a(true);
                    specialPlusService.setSpecialPlusState(true);
                    specialPlusService.setSpecialPlusShowed();
                }
            } else if (superEntranceEvent.getType() == 4) {
                C53324d dVar10 = this.f122399c;
                if (dVar10 == null || !dVar10.mo89789d()) {
                    C53324d dVar11 = this.f122399c;
                    if (dVar11 == null || !dVar11.mo89788c()) {
                        AbstractC53316a aVar2 = this.f122398b;
                        if (aVar2 == null) {
                            C89219l.m154710a("tabView");
                        }
                        aVar2.post(new RunnableC53321c(this));
                    }
                }
            }
        }
    }
}
