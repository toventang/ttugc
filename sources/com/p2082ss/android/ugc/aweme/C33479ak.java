package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.AnchorApi;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.api.resp.C33545c;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ak */
public final class C33479ak extends AbstractC39100a<Object, C33545c> {

    /* renamed from: g */
    public static final C33480a f79544g = new C33480a((byte) 0);

    /* renamed from: a */
    public final List<Object> f79545a = new ArrayList();

    /* renamed from: b */
    public List<C33542a> f79546b = new ArrayList();

    /* renamed from: c */
    public List<Object> f79547c = new ArrayList();

    /* renamed from: d */
    public boolean f79548d;

    /* renamed from: e */
    public String f79549e;

    /* renamed from: f */
    public final int f79550f;

    /* renamed from: h */
    private int f79551h = 1;

    /* renamed from: i */
    private boolean f79552i;

    static {
        Covode.recordClassIndex(40336);
    }

    /* renamed from: com.ss.android.ugc.aweme.ak$a */
    public static final class C33480a {
        static {
            Covode.recordClassIndex(40337);
        }

        private C33480a() {
        }

        public /* synthetic */ C33480a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Object> getItems() {
        return this.f79545a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.f79552i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ak$b */
    public static final class CallableC33481b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C33479ak f79553a;

        /* renamed from: b */
        final /* synthetic */ int f79554b;

        static {
            Covode.recordClassIndex(40338);
        }

        CallableC33481b(C33479ak akVar, int i) {
            this.f79553a = akVar;
            this.f79554b = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C33545c cVar = ((AnchorApi.RealApi) AnchorApi.f79629a.mo28858a(AnchorApi.RealApi.class)).getAnchorSelectionResponse(this.f79553a.f79550f, 0, this.f79554b, 20).get();
            C89219l.m154716b(cVar, "");
            return cVar;
        }
    }

    /* renamed from: a */
    public final int mo59561a() {
        Integer num;
        int i = 0;
        for (Object obj : this.f79545a) {
            if ((obj instanceof C33542a) && (num = ((C33542a) obj).f79665a) != null && num.intValue() == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m68590a(int i) {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC33481b(this, i), 0);
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
        m68590a(this.f79551h);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m68590a(0);
    }

    public C33479ak(int i) {
        this.f79550f = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        if (r0 != null) goto L_0x00c8;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.C33479ak.handleData(java.lang.Object):void");
    }
}
