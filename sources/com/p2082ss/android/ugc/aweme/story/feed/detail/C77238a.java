package com.p2082ss.android.ugc.aweme.story.feed.detail;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.StoryApi;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a */
public class C77238a implements AbstractC41262aa {

    /* renamed from: e */
    public static final AbstractC89244h f173256e = C89250i.m154773a((AbstractC89171a) C77240b.f173262a);

    /* renamed from: f */
    public static final C77239a f173257f = new C77239a((byte) 0);

    /* renamed from: a */
    public final C88411a f173258a = new C88411a();

    /* renamed from: b */
    public AbstractC41267ad f173259b;

    /* renamed from: c */
    public List<Aweme> f173260c;

    /* renamed from: d */
    public boolean f173261d;

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public int getPageType(int i) {
        return 40;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public Object getViewModel() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a$a */
    public static final class C77239a {
        static {
            Covode.recordClassIndex(90253);
        }

        private C77239a() {
        }

        public /* synthetic */ C77239a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isLoading() {
        return this.f173261d;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a$b */
    static final class C77240b extends AbstractC89220m implements AbstractC89171a<HashMap<String, Aweme>> {

        /* renamed from: a */
        public static final C77240b f173262a = new C77240b();

        static {
            Covode.recordClassIndex(90254);
        }

        C77240b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Aweme> invoke() {
            return new HashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void unInit() {
        this.f173258a.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isDataEmpty() {
        List<Aweme> list = this.f173260c;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(90252);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f173259b = adVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a$d */
    public static final class C77242d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C77238a f173264a;

        static {
            Covode.recordClassIndex(90256);
        }

        C77242d(C77238a aVar) {
            this.f173264a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f173264a.f173261d = false;
            this.f173264a.mo120834a(R.string.h8o);
            C51423a.m95790a((Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.detail.a$c */
    public static final class C77241c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C77238a f173263a;

        static {
            Covode.recordClassIndex(90255);
        }

        C77241c(C77238a aVar) {
            this.f173263a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C41128a aVar = (C41128a) obj;
            this.f173263a.f173261d = false;
            C89219l.m154716b(aVar, "");
            List<Aweme> list = aVar.f96125a;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                C89219l.m154716b(t, "");
                arrayList.add(C76706a.m134286l(t));
            }
            this.f173263a.mo120836a(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo120834a(int i) {
        Fragment aH_;
        ActivityC0945e activity;
        AbstractC41267ad adVar = this.f173259b;
        if (adVar != null && (aH_ = adVar.aH_()) != null && (activity = aH_.getActivity()) != null) {
            String string = activity.getString(i);
            C89219l.m154716b(string, "");
            C89219l.m154716b(activity, "");
            new C23144b(activity).mo37635a(string).mo37637b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo120835a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC88412b a = StoryApi.f171712a.queryBatchAwemeRx("[" + bVar.getAid() + "]", bVar.getEventType(), bVar.getPushParams(), 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C77241c(this), new C77242d(this));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f173258a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120836a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f173260c = C89070n.m154585g((Collection) list);
        AbstractC41267ad adVar = this.f173259b;
        if (adVar != null) {
            adVar.mo59512a((List) list, false);
        }
        AbstractC41267ad adVar2 = this.f173259b;
        if (adVar2 != null) {
            adVar2.mo61907a((Aweme) list.get(0));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (!C77260g.f173332a.mo120146a()) {
            mo120834a(R.string.h8k);
            return;
        }
        this.f173261d = true;
        mo120835a(bVar);
    }
}
