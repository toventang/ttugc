package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel */
public final class FlashSaleViewModel extends AndroidViewModel {

    /* renamed from: e */
    public static final C45699a f106418e = new C45699a((byte) 0);

    /* renamed from: b */
    public boolean f106419b;

    /* renamed from: c */
    public final C1213t<List<AbstractC45709b>> f106420c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<List<AbstractC45709b>> f106421d = new C1213t<>();

    /* renamed from: f */
    private List<? extends AbstractC45709b> f106422f;

    /* renamed from: g */
    private final Handler f106423g = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(54214);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel$a */
    public static final class C45699a {
        static {
            Covode.recordClassIndex(54215);
        }

        private C45699a() {
        }

        public /* synthetic */ C45699a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel$b */
    public static final class C45700b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f106424a;

        /* renamed from: b */
        final /* synthetic */ AbstractC45709b f106425b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f106426c;

        static {
            Covode.recordClassIndex(54216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45700b(List list, AbstractC45709b bVar, C89233z.C89234a aVar) {
            super(0);
            this.f106424a = list;
            this.f106425b = bVar;
            this.f106426c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f106424a.add(this.f106425b);
            this.f106426c.element = true;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.FlashSaleViewModel$c */
    public static final class RunnableC45701c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FlashSaleViewModel f106427a;

        /* renamed from: b */
        final /* synthetic */ List f106428b;

        static {
            Covode.recordClassIndex(54217);
        }

        RunnableC45701c(FlashSaleViewModel flashSaleViewModel, List list) {
            this.f106427a = flashSaleViewModel;
            this.f106428b = list;
        }

        public final void run() {
            if (this.f106427a.f106419b) {
                this.f106427a.mo76992b(this.f106428b);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        mo76990a();
        this.f106422f = null;
    }

    /* renamed from: a */
    public final void mo76990a() {
        if (this.f106419b) {
            this.f106423g.removeCallbacksAndMessages(null);
            this.f106419b = false;
            this.f106420c.setValue(new ArrayList());
            this.f106421d.setValue(new ArrayList());
        }
    }

    /* renamed from: a */
    public final void mo76991a(List<? extends AbstractC45709b> list) {
        C89219l.m154721d(list, "");
        if (!this.f106419b) {
            this.f106419b = true;
            this.f106422f = list;
            mo76992b(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashSaleViewModel(Application application) {
        super(application);
        C89219l.m154721d(application, "");
    }

    /* renamed from: a */
    public final AbstractC45709b mo76989a(AbstractC89172b<? super AbstractC45709b, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        List<? extends AbstractC45709b> list = this.f106422f;
        if (list == null) {
            return null;
        }
        for (AbstractC45709b bVar2 : list) {
            if (bVar.invoke(bVar2).booleanValue()) {
                return bVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo76992b(List<? extends AbstractC45709b> list) {
        C45706a b;
        if (!(list == null || list.isEmpty())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (AbstractC45709b bVar : list) {
                if (bVar.mo76999a() && (b = bVar.mo77000b()) != null) {
                    C89233z.C89234a aVar = new C89233z.C89234a();
                    aVar.element = false;
                    b.mo76995a(new C45700b(arrayList, bVar, aVar));
                    if (b.mo76996a() || b.mo76997b()) {
                        aVar.element = true;
                        z = true;
                    }
                    if (aVar.element) {
                        arrayList2.add(bVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                this.f106421d.setValue(arrayList2);
            }
            if (!arrayList.isEmpty()) {
                this.f106420c.setValue(arrayList);
            }
            if (z) {
                this.f106423g.postDelayed(new RunnableC45701c(this, list), Math.max(0L, 1000 - (SystemClock.elapsedRealtime() - elapsedRealtime)));
            }
        }
    }
}
