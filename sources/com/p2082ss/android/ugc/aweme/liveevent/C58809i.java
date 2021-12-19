package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.liveevent.LiveEventApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.liveevent.i */
public final class C58809i extends AbstractC39100a<Object, C58813k> {

    /* renamed from: f */
    public static final C58810a f133845f = new C58810a((byte) 0);

    /* renamed from: a */
    List<C58812j> f133846a = new ArrayList();

    /* renamed from: b */
    public List<Object> f133847b = new ArrayList();

    /* renamed from: c */
    public boolean f133848c;

    /* renamed from: d */
    public String f133849d;

    /* renamed from: e */
    public final int f133850e;

    /* renamed from: g */
    private int f133851g = 1;

    /* renamed from: h */
    private final List<Object> f133852h = new ArrayList();

    /* renamed from: i */
    private boolean f133853i;

    static {
        Covode.recordClassIndex(69119);
    }

    /* renamed from: com.ss.android.ugc.aweme.liveevent.i$a */
    public static final class C58810a {
        static {
            Covode.recordClassIndex(69120);
        }

        private C58810a() {
        }

        public /* synthetic */ C58810a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Object> getItems() {
        return this.f133852h;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.f133853i;
    }

    /* renamed from: a */
    private final void m108005a() {
        C34608n.m70658a().mo61083a(this.mHandler, CallableC58811b.f133854a, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.liveevent.i$b */
    public static final class CallableC58811b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC58811b f133854a = new CallableC58811b();

        static {
            Covode.recordClassIndex(69121);
        }

        CallableC58811b() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            String curUserId = e.getCurUserId();
            C89219l.m154716b(curUserId, "");
            C89219l.m154721d(curUserId, "");
            C58813k kVar = ((LiveEventApi.RealApi) LiveEventApi.f133797a.mo28858a(LiveEventApi.RealApi.class)).getAnchorSelectionResponse(curUserId, 2, 0, 100).get();
            C89219l.m154716b(kVar, "");
            return kVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m108005a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m108005a();
    }

    public C58809i(int i) {
        this.f133850e = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        C58813k kVar = (C58813k) obj;
        if (kVar != null) {
            this.f133848c = false;
            if (this.mListQueryType == 1) {
                this.f133851g = 1;
                this.f133846a.clear();
                this.f133852h.clear();
                this.f133846a.addAll(kVar.f133864e);
                this.f133853i = false;
            }
            this.f133852h.addAll(this.f133846a);
        }
    }
}
