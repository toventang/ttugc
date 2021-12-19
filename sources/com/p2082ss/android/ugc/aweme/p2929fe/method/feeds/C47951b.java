package com.p2082ss.android.ugc.aweme.p2929fe.method.feeds;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api.AbstractC47950a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b */
public final class C47951b extends AbstractC39100a<Aweme, C47953a> {

    /* renamed from: a */
    public static final C47952a f111062a = new C47952a((byte) 0);

    /* renamed from: b */
    private int f111063b;

    /* renamed from: c */
    private final String f111064c;

    /* renamed from: d */
    private final AbstractC47950a f111065d;

    static {
        Covode.recordClassIndex(56660);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.b$a */
    public static final class C47952a {
        static {
            Covode.recordClassIndex(56661);
        }

        private C47952a() {
        }

        public /* synthetic */ C47952a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C47951b m90944a(C47953a aVar, String str, AbstractC47950a aVar2) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar2, "");
            return new C47951b(aVar, str, aVar2, (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        return ((C47953a) this.mData).f111066a;
    }

    /* renamed from: a */
    public final void mo79957a() {
        ((C47953a) this.mData).f111066a.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47953a) this.mData).f111067b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m90940b() {
        AbstractC47950a aVar = this.f111065d;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.f111063b + 1);
        jSONObject2.put("react_id", this.f111064c);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        aVar.mo61900b("notification", jSONObject);
    }

    /* renamed from: c */
    private final void m90941c() {
        this.mIsLoading = false;
        List<AbstractC39159o> list = this.mNotifyListeners;
        if (list != null) {
            for (AbstractC39159o oVar : list) {
                if (oVar != null) {
                    oVar.mo57526a_(new Exception());
                }
            }
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
        m90940b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m90940b();
    }

    private C47951b(C47953a aVar, String str, AbstractC47950a aVar2) {
        this.f111064c = str;
        this.f111065d = aVar2;
        this.mData = aVar;
    }

    public /* synthetic */ C47951b(C47953a aVar, String str, AbstractC47950a aVar2, byte b) {
        this(aVar, str, aVar2);
    }

    /* renamed from: a */
    public final void mo79958a(List<? extends Aweme> list, int i, boolean z, boolean z2) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            m90941c();
            return;
        }
        this.f111063b = i;
        T t = this.mData;
        if (t != null) {
            this.mIsNewDataEmpty = t.f111066a.isEmpty();
            ((C47953a) this.mData).f111067b = z;
            if (z2) {
                ((C47953a) this.mData).f111066a.addAll(0, list);
            } else {
                ((C47953a) this.mData).f111066a.addAll(list);
            }
        }
        this.mIsLoading = false;
        List<AbstractC39159o> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (AbstractC39159o oVar : list2) {
                if (oVar != null) {
                    oVar.mo57528c();
                }
            }
        }
    }
}
