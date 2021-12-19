package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.C54893a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55097i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55168aa;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.C55276a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56195b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88939d;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget */
public final class FocusedSessionListWidget extends InboxAdapterWidget implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final C1213t<InboxAdapterWidget.EnumC56518b> f125663a;

    /* renamed from: b */
    public final AbstractC54913a f125664b;

    /* renamed from: c */
    public final C54893a f125665c;

    /* renamed from: i */
    private final C88411a f125666i;

    /* renamed from: j */
    private final RecyclerView.AbstractC1350a<?> f125667j;

    /* renamed from: k */
    private final C1213t<Boolean> f125668k;

    /* renamed from: l */
    private final LiveData<InboxAdapterWidget.EnumC56518b> f125669l;

    /* renamed from: m */
    private final AbstractC88398aa f125670m;

    /* renamed from: n */
    private final AbstractC88398aa f125671n;

    static {
        Covode.recordClassIndex(64608);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(189, new RunnableC90250g(FocusedSessionListWidget.class, "onEvent", C55276a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final C1213t<Boolean> bw_() {
        return this.f125668k;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> mo87492f() {
        return this.f125669l;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: g */
    public final RecyclerView.AbstractC1350a<?> mo87493g() {
        return this.f125667j;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        mo87494h();
    }

    /* renamed from: b */
    private static boolean m100509b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        this.f125666i.mo142944a();
        C55097i.m100774c();
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: h */
    public final void mo87494h() {
        this.f128856e.requireContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m100509b();
        }
        if (C58029j.f132253e) {
            C55231t.m100998a();
            AbstractC81915c.m141874a(new C56195b());
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        EventBus.m156966a(EventBus.m156962a(), this);
        C55097i.m100769a();
        this.f125664b.mo91908a().observe(this.f128856e, new C54888a(this));
        this.f128857f.observe(this.f128856e, new C54889b(this));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        C55097i.m100773b();
        C54314c.m99607a();
        C54893a aVar = this.f125665c;
        Iterator<T> it = aVar.f125679c.iterator();
        while (it.hasNext()) {
            it.next().mo91969c();
        }
        C89070n.m154537a((List) aVar.f125679c, (AbstractC89172b) C54893a.C54895b.f125682a);
        EventBus.m156962a().mo145395b(this);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC88979t<List<AbstractC56237a>> a = this.f125664b.mo91913c().mo143278b(this.f125670m).mo143285c(new C54890c(this)).mo143261a(this.f125671n);
        C89219l.m154716b(a, "");
        this.f125666i.mo142945a(C88939d.m154203a(a, new C54892e(this), null, new C54891d(this), 2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget$a */
    public static final class C54888a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FocusedSessionListWidget f125672a;

        static {
            Covode.recordClassIndex(64609);
        }

        C54888a(FocusedSessionListWidget focusedSessionListWidget) {
            this.f125672a = focusedSessionListWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f125672a.f125664b.mo91912b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final int mo87485a(int i) {
        return this.f125664b.mo91911b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget$c */
    public static final class C54890c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FocusedSessionListWidget f125674a;

        static {
            Covode.recordClassIndex(64611);
        }

        C54890c(FocusedSessionListWidget focusedSessionListWidget) {
            this.f125674a = focusedSessionListWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f125674a.f125663a.postValue(InboxAdapterWidget.EnumC56518b.LOADING);
        }
    }

    @AbstractC90264r
    public final void onEvent(C55276a aVar) {
        C89219l.m154721d(aVar, "");
        C55168aa.m100877a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget$b */
    public static final class C54889b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FocusedSessionListWidget f125673a;

        static {
            Covode.recordClassIndex(64610);
        }

        C54889b(FocusedSessionListWidget focusedSessionListWidget) {
            this.f125673a = focusedSessionListWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            InboxAdapterWidget.EnumC56518b bVar = (InboxAdapterWidget.EnumC56518b) obj;
            if (bVar != null && C54908d.f125700a[bVar.ordinal()] == 1) {
                this.f125673a.f125664b.mo91914d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget$e */
    public static final class C54892e extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FocusedSessionListWidget f125676a;

        static {
            Covode.recordClassIndex(64613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54892e(FocusedSessionListWidget focusedSessionListWidget) {
            super(1);
            this.f125676a = focusedSessionListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C56244a.m102187a("FocusedSessionList", th2);
            this.f125676a.f125663a.postValue(InboxAdapterWidget.EnumC56518b.FAIL);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget$d */
    public static final class C54891d extends AbstractC89220m implements AbstractC89172b<List<? extends AbstractC56237a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FocusedSessionListWidget f125675a;

        static {
            Covode.recordClassIndex(64612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54891d(FocusedSessionListWidget focusedSessionListWidget) {
            super(1);
            this.f125675a = focusedSessionListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends AbstractC56237a> list) {
            List<? extends AbstractC56237a> list2 = list;
            this.f125675a.f125665c.mo5018a(list2);
            if (list2.isEmpty()) {
                this.f125675a.f125663a.postValue(InboxAdapterWidget.EnumC56518b.EMPTY);
            } else {
                this.f125675a.f125663a.postValue(InboxAdapterWidget.EnumC56518b.SUCCESS);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final void mo87487a(int i, C56520b bVar) {
        C89219l.m154721d(bVar, "");
        C54893a aVar = this.f125665c;
        C89219l.m154721d(bVar, "");
        aVar.f125678b.put(i, bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FocusedSessionListWidget(androidx.fragment.app.Fragment r12, androidx.lifecycle.LiveData r13) {
        /*
            r11 = this;
            r0 = 0
            r5 = r12
            androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r5, r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl> r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl.class
            androidx.lifecycle.ac r7 = r1.mo3983a(r0)
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r7, r4)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a r7 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a) r7
            androidx.fragment.app.e r3 = r5.requireActivity()
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r4)
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r4)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a r8 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.b
            java.lang.String r1 = "notification_page"
            java.lang.String r0 = "cell"
            r2.<init>(r3, r1, r0)
            r8.<init>(r7, r2)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r9 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r9, r4)
            f.a.aa r0 = p4560f.p4561a.p4562a.p4564b.C88392a.f200660a
            f.a.aa r10 = p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r10, r4)
            r4 = r11
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.FocusedSessionListWidget.<init>(androidx.fragment.app.Fragment, androidx.lifecycle.LiveData):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FocusedSessionListWidget(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData, AbstractC54913a aVar, C54893a aVar2, AbstractC88398aa aaVar, AbstractC88398aa aaVar2) {
        super(fragment, liveData);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(aaVar2, "");
        this.f125664b = aVar;
        this.f125665c = aVar2;
        this.f125670m = aaVar;
        this.f125671n = aaVar2;
        this.f125666i = new C88411a();
        this.f125667j = aVar2;
        this.f125668k = aVar.mo91908a();
        C1213t<InboxAdapterWidget.EnumC56518b> tVar = new C1213t<>();
        this.f125663a = tVar;
        this.f125669l = tVar;
    }
}
