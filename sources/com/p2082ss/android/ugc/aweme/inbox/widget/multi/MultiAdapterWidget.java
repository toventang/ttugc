package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g;
import com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import java.util.HashMap;
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
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget */
public final class MultiAdapterWidget extends InboxAdapterWidget implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final AbstractC89244h f128872a;

    /* renamed from: b */
    private final AbstractC89244h f128873b;

    /* renamed from: c */
    private final AbstractC89244h f128874c = C89250i.m154773a((AbstractC89171a) C56522b.f128876a);

    static {
        Covode.recordClassIndex(66342);
    }

    /* renamed from: b */
    public final MultiViewModel mo93463b() {
        return (MultiViewModel) this.f128872a.getValue();
    }

    /* renamed from: c */
    public final C56583j mo93464c() {
        return (C56583j) this.f128873b.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(377, new RunnableC90250g(MultiAdapterWidget.class, "onRedPointUpdate", C61561m.class, ThreadMode.MAIN, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        mo87494h();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget$a */
    static final class C56521a extends AbstractC89220m implements AbstractC89171a<C56583j> {

        /* renamed from: a */
        final /* synthetic */ Fragment f128875a;

        static {
            Covode.recordClassIndex(66343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56521a(Fragment fragment) {
            super(0);
            this.f128875a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56583j invoke() {
            return new C56583j(this.f128875a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget$c */
    static final class C56523c extends AbstractC89220m implements AbstractC89171a<MultiViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f128877a;

        static {
            Covode.recordClassIndex(66345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56523c(Fragment fragment) {
            super(0);
            this.f128877a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiViewModel invoke() {
            return MultiViewModel.C56526a.m102502a(this.f128877a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: e */
    public final LiveData<Boolean> mo87491e() {
        return mo93463b().f128887f;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> mo87492f() {
        return mo93463b().f128885d;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: g */
    public final RecyclerView.AbstractC1350a<?> mo87493g() {
        return mo93464c();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget$b */
    static final class C56522b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C56522b f128876a = new C56522b();

        static {
            Covode.recordClassIndex(66344);
        }

        C56522b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: h */
    public final void mo87494h() {
        C56364g.m102348a();
        mo93463b().mo93472b();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        mo93463b().f128883b.observe(this, new C56524d(this));
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget$e */
    static final class RunnableC56525e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MultiAdapterWidget f128879a;

        static {
            Covode.recordClassIndex(66347);
        }

        RunnableC56525e(MultiAdapterWidget multiAdapterWidget) {
            this.f128879a = multiAdapterWidget;
        }

        public final void run() {
            MultiViewModel b = this.f128879a.mo93463b();
            C56408a.C56413e.m102391a();
            C89378p<Integer, Boolean> d = MultiViewModel.m102493d();
            if (b.f128894m.getFirst().intValue() != d.getFirst().intValue() || b.f128894m.getSecond().booleanValue() != d.getSecond().booleanValue()) {
                b.mo93472b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget$d */
    public static final class C56524d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MultiAdapterWidget f128878a;

        static {
            Covode.recordClassIndex(66346);
        }

        C56524d(MultiAdapterWidget multiAdapterWidget) {
            this.f128878a = multiAdapterWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128878a.mo93464c().mo5018a((List) obj);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onRedPointUpdate(C61561m mVar) {
        C89219l.m154721d(mVar, "");
        ((Handler) this.f128874c.getValue()).post(new RunnableC56525e(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final int mo87485a(int i) {
        List<AbstractC56585k> value = mo93463b().f128883b.getValue();
        if (value == null) {
            return -1;
        }
        C89219l.m154716b(value, "");
        if (i < 0) {
            return -1;
        }
        int size = value.size();
        while (i < size) {
            if (value.get(i).mo93492a()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final void mo87487a(int i, C56520b bVar) {
        C89219l.m154721d(bVar, "");
        C56583j c = mo93464c();
        C89219l.m154721d(bVar, "");
        c.f129014b.put(i, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        super(fragment, liveData);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        this.f128872a = C89250i.m154773a((AbstractC89171a) new C56523c(fragment));
        this.f128873b = C89250i.m154773a((AbstractC89171a) new C56521a(fragment));
    }
}
