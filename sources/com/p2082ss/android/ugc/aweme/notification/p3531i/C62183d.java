package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61634i;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61830e;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61874i;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.d */
public final class C62183d extends C62208i.C62209a {

    /* renamed from: a */
    public boolean f141184a = true;

    /* renamed from: b */
    private final AbstractC89244h f141185b = C61862a.m111996a(new C62189f(this));

    /* renamed from: d */
    private final AbstractC89244h f141186d = C61862a.m111996a(new C62187d(this));

    /* renamed from: e */
    private final AbstractC89244h f141187e = C61862a.m111996a(new C62184a(this));

    /* renamed from: f */
    private final AbstractC89244h f141188f = C61862a.m111996a(new C62185b(this));

    /* renamed from: g */
    private final AbstractC89244h f141189g = C89250i.m154773a((AbstractC89171a) C62188e.f141194a);

    static {
        Covode.recordClassIndex(72937);
    }

    /* renamed from: i */
    private final NotificationVM m112464i() {
        return (NotificationVM) this.f141185b.getValue();
    }

    /* renamed from: m */
    private final C61830e m112465m() {
        return (C61830e) this.f141187e.getValue();
    }

    /* renamed from: n */
    private final LinearLayoutManager m112466n() {
        return (LinearLayoutManager) this.f141188f.getValue();
    }

    /* renamed from: b */
    public final RecyclerView mo100189b() {
        return (RecyclerView) this.f141186d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$a */
    static final class C62184a extends AbstractC89220m implements AbstractC89171a<C61830e> {

        /* renamed from: a */
        final /* synthetic */ C62183d f141190a;

        static {
            Covode.recordClassIndex(72938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62184a(C62183d dVar) {
            super(0);
            this.f141190a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61830e invoke() {
            RecyclerView.AbstractC1350a adapter = this.f141190a.mo100189b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter");
            return adapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$b */
    static final class C62185b extends AbstractC89220m implements AbstractC89171a<LinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ C62183d f141191a;

        static {
            Covode.recordClassIndex(72939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62185b(C62183d dVar) {
            super(0);
            this.f141191a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayoutManager invoke() {
            RecyclerView.AbstractC1362i layoutManager = this.f141191a.mo100189b().getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            return layoutManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$d */
    static final class C62187d extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C62183d f141193a;

        static {
            Covode.recordClassIndex(72941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62187d(C62183d dVar) {
            super(0);
            this.f141193a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f141193a.mo100205c(R.id.dof);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$f */
    static final class C62189f extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C62183d f141195a;

        static {
            Covode.recordClassIndex(72943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62189f(C62183d dVar) {
            super(0);
            this.f141195a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f141195a.mo100206j());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100172a() {
        C62455c j = m112464i().mo100354j();
        if ((j instanceof C62474d) && ((Boolean) this.f141189g.getValue()).booleanValue()) {
            ((C62474d) j).mo100451l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$e */
    static final class C62188e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C62188e f141194a = new C62188e();

        static {
            Covode.recordClassIndex(72942);
        }

        C62188e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            boolean z = false;
            if (!(d == null || (bool = (Boolean) d.mo12981a("live_square_inbox_refresh", (Object) false)) == null)) {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: h */
    public final Object mo100191h() {
        try {
            if (this.f141184a && !m112465m().mo99913b().isEmpty()) {
                int k = m112466n().mo4371k();
                int m = m112466n().mo4373m();
                if (m > 0) {
                    if (k <= m) {
                        this.f141184a = false;
                        if (k <= m) {
                            while (true) {
                                mo100190b(k);
                                if (k == m) {
                                    break;
                                }
                                k++;
                            }
                        }
                    }
                }
            }
            return C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            return C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.d$c */
    static final class C62186c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C62183d f141192a;

        static {
            Covode.recordClassIndex(72940);
        }

        C62186c(C62183d dVar) {
            this.f141192a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC61874i.LOADING) {
                this.f141192a.f141184a = true;
            }
        }
    }

    /* renamed from: b */
    public final Object mo100190b(int i) {
        try {
            List<MusNotice> b = m112465m().mo99913b();
            int size = b.size();
            if (i >= 0) {
                if (size > i) {
                    MusNotice musNotice = b.get(i);
                    if (!(musNotice instanceof C61871f)) {
                        musNotice = null;
                    }
                    C61871f fVar = (C61871f) musNotice;
                    if (fVar != null) {
                        List<MusNotice> d = C89070n.m154571d((Iterable) b, i);
                        int i2 = 0;
                        if (!(d instanceof Collection) || !d.isEmpty()) {
                            for (MusNotice musNotice2 : d) {
                                if ((musNotice2 instanceof C61634i) && (i2 = i2 + 1) < 0) {
                                    C89070n.m154523b();
                                }
                            }
                        }
                        C62259e.m112615a(fVar, i - i2);
                    }
                }
            }
            return C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            return C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo100174a(view, bundle);
        C62455c b = m112464i().mo100373b(C61530a.C61532b.m111445a());
        Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationTLModel");
        b.mo100436b().observe(mo100206j(), new C62186c(this));
    }
}
