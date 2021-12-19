package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.AnchorApi;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.resp.C33544b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ah */
public final class C33444ah extends AbstractC39100a<AnchorCell, C33544b> {

    /* renamed from: b */
    public static final C33445a f79490b = new C33445a((byte) 0);

    /* renamed from: a */
    public final int f79491a;

    /* renamed from: c */
    private List<AnchorCell> f79492c = new ArrayList();

    /* renamed from: d */
    private int f79493d;

    /* renamed from: e */
    private boolean f79494e;

    static {
        Covode.recordClassIndex(40301);
    }

    /* renamed from: com.ss.android.ugc.aweme.ah$a */
    public static final class C33445a {
        static {
            Covode.recordClassIndex(40302);
        }

        private C33445a() {
        }

        public /* synthetic */ C33445a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<AnchorCell> getItems() {
        return this.f79492c;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.f79494e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ah$b */
    public static final class CallableC33446b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C33444ah f79495a;

        /* renamed from: b */
        final /* synthetic */ String f79496b;

        /* renamed from: c */
        final /* synthetic */ int f79497c;

        static {
            Covode.recordClassIndex(40303);
        }

        CallableC33446b(C33444ah ahVar, String str, int i) {
            this.f79495a = ahVar;
            this.f79496b = str;
            this.f79497c = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            int i = this.f79495a.f79491a;
            String str = this.f79496b;
            int i2 = this.f79497c;
            C89219l.m154721d(str, "");
            C33544b bVar = ((AnchorApi.RealApi) AnchorApi.f79629a.mo28858a(AnchorApi.RealApi.class)).getAnchorSearchResponse(i, str, i2, 20).get();
            C89219l.m154716b(bVar, "");
            return bVar;
        }
    }

    public C33444ah(int i) {
        this.f79491a = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        int i = this.f79493d;
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        m68555a(i, (String) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        m68555a(0, (String) obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        C33544b bVar = (C33544b) obj;
        if (bVar != null) {
            if (this.mListQueryType == 1) {
                this.f79492c.clear();
            }
            List<AnchorCell> list = bVar.f79670a;
            if (list == null || list.isEmpty()) {
                this.f79494e = false;
                this.f79492c.clear();
                return;
            }
            this.f79494e = bVar.f79671b;
            List<AnchorCell> list2 = this.f79492c;
            List<AnchorCell> list3 = bVar.f79670a;
            if (list3 == null) {
                C89219l.m154715b();
            }
            list2.addAll(list3);
            this.f79493d++;
        }
    }

    /* renamed from: a */
    private final void m68555a(int i, String str) {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC33446b(this, str, i), 0);
    }
}
