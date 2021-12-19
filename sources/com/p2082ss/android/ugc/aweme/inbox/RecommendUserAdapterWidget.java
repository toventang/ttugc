package com.p2082ss.android.ugc.aweme.inbox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.inbox.C56306ab;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61548d;
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
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget */
public final class RecommendUserAdapterWidget extends InboxAdapterWidget implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C1175ad.AbstractC1177b f128396a;

    /* renamed from: b */
    private final AbstractC89244h f128397b;

    /* renamed from: c */
    private final AbstractC89244h f128398c;

    static {
        Covode.recordClassIndex(66101);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final int mo87485a(int i) {
        return -1;
    }

    /* renamed from: b */
    public final RecommendUserVM mo93314b() {
        return (RecommendUserVM) this.f128397b.getValue();
    }

    /* renamed from: c */
    public final C56306ab mo93315c() {
        return (C56306ab) this.f128398c.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(143, new RunnableC90250g(RecommendUserAdapterWidget.class, "onSwitchInbox", C61548d.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget$a */
    static final class C56285a extends AbstractC89220m implements AbstractC89171a<C56306ab> {

        /* renamed from: a */
        final /* synthetic */ Fragment f128399a;

        static {
            Covode.recordClassIndex(66102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56285a(Fragment fragment) {
            super(0);
            this.f128399a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56306ab invoke() {
            return new C56306ab(this.f128399a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final C1213t<Boolean> bw_() {
        return mo93314b().f128410f;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: e */
    public final LiveData<Boolean> mo87491e() {
        return mo93314b().f128406b;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> mo87492f() {
        return mo93314b().f128407c;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: g */
    public final RecyclerView.AbstractC1350a<?> mo87493g() {
        return mo93315c();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: h */
    public final void mo87494h() {
        C56364g.m102350b();
        mo93314b().mo93325e();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget$d */
    static final class C56288d extends AbstractC89220m implements AbstractC89171a<RecommendUserVM> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserAdapterWidget f128402a;

        /* renamed from: b */
        final /* synthetic */ Fragment f128403b;

        static {
            Covode.recordClassIndex(66105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56288d(RecommendUserAdapterWidget recommendUserAdapterWidget, Fragment fragment) {
            super(0);
            this.f128402a = recommendUserAdapterWidget;
            this.f128403b = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecommendUserVM invoke() {
            C1175ad.AbstractC1177b bVar = this.f128402a.f128396a;
            if (bVar != null) {
                Fragment fragment = this.f128403b;
                C89219l.m154721d(fragment, "");
                C89219l.m154721d(bVar, "");
                AbstractC1174ac a = C1181ae.m3879a(fragment, bVar).mo3983a(RecommendUserVM.class);
                C89219l.m154716b(a, "");
                if (a != null) {
                    return a;
                }
            }
            return RecommendUserVM.C56289a.m102295a(this.f128403b);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        mo93314b().f128409e.observe(this, new C56286b(this));
        mo93314b().f128410f.observe(this, new C56287c(this));
        mo87494h();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final void mo93313a(C1175ad.AbstractC1177b bVar) {
        C89219l.m154721d(bVar, "");
        this.f128396a = bVar;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchInbox(C61548d dVar) {
        C89219l.m154721d(dVar, "");
        RecommendUserVM b = mo93314b();
        b.mo93323b().clear();
        b.f128413i = false;
        mo87494h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget$b */
    public static final class C56286b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ RecommendUserAdapterWidget f128400a;

        static {
            Covode.recordClassIndex(66103);
        }

        C56286b(RecommendUserAdapterWidget recommendUserAdapterWidget) {
            this.f128400a = recommendUserAdapterWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List<? extends AbstractC56310ad> list = (List) obj;
            if (list != null) {
                Map<String, String> map = this.f128400a.f128855d;
                if (map != null && !map.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f128463d.putAll(this.f128400a.f128855d);
                    }
                }
                C56306ab c = this.f128400a.mo93315c();
                C89219l.m154721d(list, "");
                RecyclerView recyclerView = c.f128452a;
                if (recyclerView == null) {
                    return;
                }
                if (recyclerView.mo4484l()) {
                    StringBuilder sb = new StringBuilder("setData, rv isComputing: ");
                    RecyclerView recyclerView2 = c.f128452a;
                    if (recyclerView2 != null) {
                        bool = Boolean.valueOf(recyclerView2.mo4484l());
                    } else {
                        bool = null;
                    }
                    C39109f.m79403b("RecommendUserVM", sb.append(bool).append(", data size: ").append(list.size()).toString());
                    recyclerView.post(new C56306ab.RunnableC56308b(c, list));
                    return;
                }
                c.mo93337a(list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserAdapterWidget$c */
    public static final class C56287c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ RecommendUserAdapterWidget f128401a;

        static {
            Covode.recordClassIndex(66104);
        }

        C56287c(RecommendUserAdapterWidget recommendUserAdapterWidget) {
            this.f128401a = recommendUserAdapterWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<AbstractC56310ad> value;
            Boolean bool = (Boolean) obj;
            RecommendUserAdapterWidget recommendUserAdapterWidget = this.f128401a;
            if (recommendUserAdapterWidget.mo93314b().f128407c.getValue() == InboxAdapterWidget.EnumC56518b.SUCCESS && (value = recommendUserAdapterWidget.mo93314b().f128409e.getValue()) != null && !value.isEmpty()) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    this.f128401a.mo93314b().mo93327g();
                } else {
                    this.f128401a.mo93314b().mo93326f();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final void mo87487a(int i, C56520b bVar) {
        C89219l.m154721d(bVar, "");
        C56306ab c = mo93315c();
        C89219l.m154721d(bVar, "");
        c.f128453b.put(i, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendUserAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        super(fragment, liveData);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        this.f128397b = C89250i.m154773a((AbstractC89171a) new C56288d(this, fragment));
        this.f128398c = C89250i.m154773a((AbstractC89171a) new C56285a(fragment));
    }
}
