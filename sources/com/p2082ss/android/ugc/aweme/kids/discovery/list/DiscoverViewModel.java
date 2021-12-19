package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57559a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57560b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel */
public final class DiscoverViewModel extends AbstractC1174ac {

    /* renamed from: g */
    public static final C57585a f131447g = new C57585a((byte) 0);

    /* renamed from: a */
    final DiscoverApiKid f131448a = DiscoverApiKid.C57555a.f131391a;

    /* renamed from: b */
    public final C1213t<Boolean> f131449b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<Boolean> f131450c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Boolean> f131451d = new C1213t<>();

    /* renamed from: e */
    public final C1213t<List<C57559a>> f131452e = new C1213t<>();

    /* renamed from: f */
    public int f131453f;

    /* renamed from: h */
    private final IReportAwemeManager f131454h = ReportAwemeManager.m104144a();

    static {
        Covode.recordClassIndex(67541);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel$a */
    public static final class C57585a {
        static {
            Covode.recordClassIndex(67542);
        }

        private C57585a() {
        }

        public /* synthetic */ C57585a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo94907a() {
        this.f131453f = -1;
        long currentTimeMillis = System.currentTimeMillis();
        this.f131448a.getCategoryV2List(-1, 10, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C57588d(this, currentTimeMillis), new C57589e(this, currentTimeMillis));
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel$c */
    static final class C57587c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f131457a;

        /* renamed from: b */
        final /* synthetic */ long f131458b;

        static {
            Covode.recordClassIndex(67544);
        }

        C57587c(DiscoverViewModel discoverViewModel, long j) {
            this.f131457a = discoverViewModel;
            this.f131458b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131457a.f131451d.postValue(false);
            C57354e.m103957a("kids_api_category_list", 2, -1, this.f131458b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel$e */
    public static final class C57589e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f131461a;

        /* renamed from: b */
        final /* synthetic */ long f131462b;

        static {
            Covode.recordClassIndex(67546);
        }

        C57589e(DiscoverViewModel discoverViewModel, long j) {
            this.f131461a = discoverViewModel;
            this.f131462b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f131461a.f131450c.postValue(false);
            C57354e.m103957a("kids_api_category_list", 1, -1, this.f131462b);
        }
    }

    /* renamed from: a */
    public final boolean mo94908a(C57559a aVar) {
        IReportAwemeManager iReportAwemeManager = this.f131454h;
        List<? extends Aweme> list = aVar.f131395a;
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        return iReportAwemeManager.mo94624a(list).isEmpty();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel$b */
    static final class C57586b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f131455a;

        /* renamed from: b */
        final /* synthetic */ long f131456b;

        static {
            Covode.recordClassIndex(67543);
        }

        C57586b(DiscoverViewModel discoverViewModel, long j) {
            this.f131455a = discoverViewModel;
            this.f131456b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57560b bVar = (C57560b) obj;
            ArrayList arrayList = new ArrayList();
            List<C57559a> value = this.f131455a.f131452e.getValue();
            if (value != null) {
                C89219l.m154716b(value, "");
                arrayList.addAll(value);
            }
            Iterable iterable = bVar.f131398a;
            if (iterable == null) {
                iterable = C89086z.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t : iterable) {
                if (true ^ this.f131455a.mo94908a(t)) {
                    arrayList2.add(t);
                }
            }
            arrayList.addAll(arrayList2);
            this.f131455a.f131452e.postValue(arrayList);
            this.f131455a.f131451d.postValue(true);
            this.f131455a.f131449b.postValue(Boolean.valueOf(bVar.mo94902a()));
            this.f131455a.f131453f = bVar.f131400c;
            C57354e.m103957a("kids_api_category_list", 2, 0, this.f131456b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel$d */
    public static final class C57588d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModel f131459a;

        /* renamed from: b */
        final /* synthetic */ long f131460b;

        static {
            Covode.recordClassIndex(67545);
        }

        C57588d(DiscoverViewModel discoverViewModel, long j) {
            this.f131459a = discoverViewModel;
            this.f131460b = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57560b bVar = (C57560b) obj;
            C1213t<List<C57559a>> tVar = this.f131459a.f131452e;
            Iterable iterable = bVar.f131398a;
            if (iterable == null) {
                iterable = C89086z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : iterable) {
                if (true ^ this.f131459a.mo94908a(t)) {
                    arrayList.add(t);
                }
            }
            tVar.postValue(C89070n.m154585g((Collection) arrayList));
            this.f131459a.f131450c.postValue(true);
            this.f131459a.f131449b.postValue(Boolean.valueOf(bVar.mo94902a()));
            this.f131459a.f131453f = bVar.f131400c;
            C57354e.m103957a("kids_api_category_list", 1, 0, this.f131460b);
        }
    }
}
