package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41228c;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p2082ss.android.ugc.aweme.discover.p2767c.AbstractC41905f;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.f */
public abstract class AbstractC42081f<T, RESPONSE extends SearchApiResult> extends AbstractC41228c<T, RESPONSE> implements AbstractC41905f {

    /* renamed from: a */
    private final LinkedHashSet<T> f98108a = new LinkedHashSet<>();

    /* renamed from: b */
    private final List<T> f98109b = new ArrayList();

    /* renamed from: c */
    private final boolean f98110c = true;

    /* renamed from: d */
    private String f98111d = "";

    /* renamed from: h */
    public C67437b f98112h;

    /* renamed from: i */
    public C67678d f98113i;

    /* renamed from: j */
    public AbstractC42073a f98114j;

    /* renamed from: k */
    public AbstractC57066a.AbstractC57067a f98115k;

    /* renamed from: l */
    public boolean f98116l;

    /* renamed from: m */
    public boolean f98117m;

    /* renamed from: n */
    public int f98118n;

    /* renamed from: o */
    public String f98119o;

    /* renamed from: p */
    public String f98120p;

    /* renamed from: q */
    public String f98121q;

    static {
        Covode.recordClassIndex(50015);
    }

    /* renamed from: c */
    public abstract int mo71277c();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo71282b() {
        return this.f98110c;
    }

    /* renamed from: e */
    public final String mo71284e() {
        return this.f98111d;
    }

    /* renamed from: m */
    private final boolean m84241m() {
        if (this.mListQueryType == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final String mo71288i() {
        String searchEnterFromPage;
        C67678d dVar = this.f98113i;
        if (dVar == null || (searchEnterFromPage = dVar.getSearchEnterFromPage()) == null) {
            return "";
        }
        return searchEnterFromPage;
    }

    /* renamed from: j */
    public final String mo71289j() {
        C67678d dVar = this.f98113i;
        if (dVar != null) {
            return dVar.getSugUserId();
        }
        return null;
    }

    /* renamed from: k */
    public final String mo71290k() {
        C67678d dVar = this.f98113i;
        if (dVar != null) {
            return dVar.getIsRichSug();
        }
        return null;
    }

    /* renamed from: l */
    private static String m84240l() {
        AbstractC67567q a = C67486am.m119564a();
        if (a != null) {
            return C67458j.m119531b(a.mo106426a());
        }
        return "null";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo71283d() {
        if (mo71282b()) {
            this.f98108a.clear();
        } else {
            this.f98109b.clear();
        }
    }

    /* renamed from: f */
    public final QueryCorrectInfo mo71285f() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        return ((SearchApiResult) obj).queryCorrectInfo;
    }

    /* renamed from: g */
    public final SearchPreventSuicide mo71286g() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        return ((SearchApiResult) obj).suicidePrevent;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public List<T> getItems() {
        if (mo71282b()) {
            return new ArrayList(this.f98108a);
        }
        return this.f98109b;
    }

    /* renamed from: h */
    public final boolean mo71287h() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        GlobalDoodleConfig globalDoodleConfig = ((SearchApiResult) obj).globalDoodleConfig;
        if (globalDoodleConfig == null || globalDoodleConfig.getDisplayFilterBar() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final String mo70559a() {
        C57071b a;
        AbstractC57066a.AbstractC57067a aVar = this.f98115k;
        if (aVar == null || (a = aVar.mo94218a()) == null) {
            return "";
        }
        if (m84241m() || TextUtils.isEmpty(a.f129939b)) {
            return a.f129938a;
        }
        return a.f129939b;
    }

    /* renamed from: b */
    public final void mo71280b(String str) {
        C89219l.m154721d(str, "");
        this.f98111d = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if (!(obj instanceof String)) {
                obj = null;
            }
            if (TextUtils.isEmpty((String) obj)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo71276a_(List<? extends T> list) {
        if (mo71282b()) {
            this.f98108a.clear();
            if (list != null && !list.isEmpty()) {
                this.f98108a.addAll(list);
                return;
            }
            return;
        }
        this.f98109b.clear();
        if (list != null && !list.isEmpty()) {
            this.f98109b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71281b(List<? extends T> list) {
        if (mo71282b()) {
            if (list != null && !list.isEmpty()) {
                this.f98108a.addAll(list);
            }
        } else if (list != null && !list.isEmpty()) {
            this.f98109b.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo71278a(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (!TextUtils.isEmpty(mo70559a())) {
            return mo70559a();
        }
        if (objArr.length > 0 && (objArr[0] instanceof Object[])) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            if (objArr2.length > 1 && (objArr2[1] instanceof String)) {
                Object obj2 = objArr2[1];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                return (String) obj2;
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (((java.lang.Integer) r1).intValue() == 1) goto L_0x002c;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendRequest(java.lang.Object... r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139687c()
            r3 = 0
            if (r0 == 0) goto L_0x001f
            android.os.Message r2 = android.os.Message.obtain()
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Under ChildrenMode"
            r1.<init>(r0)
            r2.obj = r1
            com.bytedance.common.utility.collection.WeakHandler r0 = r4.mHandler
            r0.sendMessage(r2)
            return r3
        L_0x001f:
            boolean r0 = r4.needCheckEmptyForQueryType()
            r2 = 1
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.isDataEmpty()
            if (r0 == 0) goto L_0x003a
        L_0x002c:
            java.lang.String r0 = r4.f98120p
            r4.f98121q = r0
        L_0x0030:
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            boolean r0 = super.sendRequest(r0)
            return r0
        L_0x003a:
            r1 = r5[r3]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 != r2) goto L_0x0030
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f.sendRequest(java.lang.Object[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(RESPONSE r9) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f.handleData(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    /* renamed from: a */
    public final void mo71279a(int i, String str) {
        AbstractC42073a aVar = this.f98114j;
        if (aVar != null) {
            aVar.mo71269a(i, str);
            this.f98114j = null;
            if (this.mIsLoading) {
                this.mIsLoading = false;
            }
        }
    }
}
