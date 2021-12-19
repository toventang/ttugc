package com.p2082ss.android.ugc.aweme.p2436cc.p2437a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2436cc.AbstractC35423a;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import com.p2082ss.android.ugc.aweme.p2436cc.p2437a.C35426c;
import com.p2082ss.android.ugc.aweme.p2436cc.p2438b.C35432a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.cc.a.e */
public final class C35429e implements AbstractC35425b {

    /* renamed from: a */
    private final String f83585a = "unknown";

    /* renamed from: b */
    private AbstractC35423a f83586b = new C35432a();

    /* renamed from: c */
    private C35426c f83587c = new C35426c();

    /* renamed from: d */
    private final AbstractC89244h f83588d = C89250i.m154773a((AbstractC89171a) new C35430a(this));

    /* renamed from: e */
    private String f83589e;

    /* renamed from: f */
    private long f83590f;

    /* renamed from: g */
    private boolean f83591g;

    static {
        Covode.recordClassIndex(42605);
    }

    /* renamed from: a */
    private ConcurrentHashMap<String, String> m72455a() {
        return (ConcurrentHashMap) this.f83588d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.cc.a.e$a */
    static final class C35430a extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ C35429e f83592a;

        static {
            Covode.recordClassIndex(42606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35430a(C35429e eVar) {
            super(0);
            this.f83592a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, String> invoke() {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put("SearchResultActivity", "search_mix");
            return concurrentHashMap;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35425b
    /* renamed from: a */
    public final void mo62329a(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f83589e = activity.getClass().getName();
        this.f83590f = System.currentTimeMillis();
        this.f83591g = true;
    }

    /* renamed from: a */
    private final String m72454a(String str) {
        List<String> split;
        if (TextUtils.isEmpty(str)) {
            return this.f83585a;
        }
        if (str == null || (split = new C89350l("\\.").split(str, 0)) == null || split.isEmpty()) {
            return this.f83585a;
        }
        return split.get(split.size() - 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35425b
    /* renamed from: b */
    public final void mo62331b(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!TextUtils.isEmpty(this.f83589e) && this.f83591g && this.f83590f != 0 && TextUtils.equals(activity.getClass().getName(), this.f83589e)) {
            m72456a(m72454a(this.f83589e), EnumC35431b.CANCEL, 0);
            this.f83591g = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2436cc.p2437a.AbstractC35425b
    /* renamed from: a */
    public final void mo62330a(Activity activity, boolean z) {
        C89219l.m154721d(activity, "");
        if (z && !TextUtils.isEmpty(this.f83589e) && this.f83591g && this.f83590f != 0 && TextUtils.equals(activity.getClass().getName(), this.f83589e)) {
            String a = m72454a(this.f83589e);
            long currentTimeMillis = System.currentTimeMillis() - this.f83590f;
            C35426c cVar = this.f83587c;
            if (cVar != null) {
                C89219l.m154721d(a, "");
                C40780g.m82246c().execute(new C35426c.RunnableC35427a(cVar, a, currentTimeMillis));
            }
            m72456a(a, EnumC35431b.SUCCESS, currentTimeMillis);
            this.f83591g = false;
        }
    }

    /* renamed from: a */
    private final void m72456a(String str, EnumC35431b bVar, long j) {
        String str2;
        AbstractC35423a aVar;
        if (!TextUtils.isEmpty(str) && m72455a().containsKey(str) && (str2 = m72455a().get(str)) != null && (aVar = this.f83586b) != null) {
            C89219l.m154716b(str2, "");
            aVar.mo62327a(str2, bVar, j);
        }
    }
}
