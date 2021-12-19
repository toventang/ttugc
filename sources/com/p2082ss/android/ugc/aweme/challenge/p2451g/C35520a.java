package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.p2446b.C35493a;
import com.p2082ss.android.ugc.aweme.challenge.p2452h.C35534a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.a */
public final class C35520a extends AbstractC39100a<Aweme, ChallengeAwemeList> {

    /* renamed from: a */
    public static HashMap<String, String> f83761a = new HashMap<>();

    /* renamed from: b */
    public String f83762b;

    /* renamed from: c */
    public String f83763c = "challenge_video";

    /* renamed from: d */
    public final C35522a f83764d = new C35522a();

    /* renamed from: e */
    public long f83765e = 0;

    /* renamed from: f */
    private String f83766f;

    /* renamed from: g */
    private int f83767g;

    /* renamed from: h */
    private List<Aweme> f83768h;

    /* renamed from: com.ss.android.ugc.aweme.challenge.g.a$a */
    public static class C35522a {

        /* renamed from: a */
        public int f83777a;

        /* renamed from: b */
        public int f83778b;

        /* renamed from: c */
        public long f83779c;

        /* renamed from: d */
        public boolean f83780d;

        /* renamed from: e */
        public String f83781e;

        /* renamed from: f */
        public String f83782f;

        /* renamed from: g */
        public String f83783g;

        /* renamed from: h */
        public String f83784h;

        /* renamed from: i */
        boolean f83785i;

        static {
            Covode.recordClassIndex(42718);
        }
    }

    static {
        Covode.recordClassIndex(42716);
    }

    /* renamed from: a */
    public final List<Aweme> mo62416a() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeAwemeList) this.mData).items;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C13603b.m24435a((Collection) this.f83768h)) {
            arrayList.addAll(this.f83768h);
        }
        List<Aweme> a = mo62416a();
        if (!C13603b.m24435a((Collection) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) && C13603b.m24435a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 4) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return C50545m.m94763a(getItems(), aweme, this.mNotifyListeners);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new ChallengeAwemeList();
        }
        ((ChallengeAwemeList) this.mData).hasMore = 1;
        ((ChallengeAwemeList) this.mData).items = list;
    }

    /* renamed from: a */
    public final void mo62417a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f83763c = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        m72616a(str, j, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), this.f83766f, this.f83762b);
    }

    /* renamed from: a */
    public final void mo62418a(List<Aweme> list) {
        if (!C13603b.m24435a((Collection) list)) {
            if (this.f83768h == null) {
                this.f83768h = new ArrayList();
            }
            this.f83768h.clear();
            this.f83768h.addAll(list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            m72617a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, this.f83762b, ((Boolean) objArr[5]).booleanValue());
        } else {
            m72616a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, this.f83762b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) obj;
        if (!this.f83764d.f83785i) {
            C35522a aVar = this.f83764d;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(challengeAwemeList, "");
            String str = aVar.f83783g;
            long j = aVar.f83779c;
            int i = aVar.f83777a;
            int i2 = aVar.f83778b;
            boolean z2 = aVar.f83780d;
            String str2 = aVar.f83784h;
            String str3 = aVar.f83781e;
            String str4 = aVar.f83782f;
            if (j == 0) {
                C35493a.f83717c.mo2092a(str + '&' + j + '&' + i + '&' + i2 + '&' + z2 + '&' + str2 + '&' + str3 + '&' + str4, new C35493a.C35494a(challengeAwemeList, System.currentTimeMillis()));
            }
        }
        if (challengeAwemeList != null && this.mListQueryType == 1) {
            if (challengeAwemeList.logPb == null) {
                this.f83766f = "";
            } else {
                this.f83766f = challengeAwemeList.logPb.getImprId();
            }
        }
        C48027ac.C48028a.f111257a.mo80056a(challengeAwemeList.getRequestId(), challengeAwemeList.logPb);
        List<Aweme> a = C35534a.m72628a(challengeAwemeList);
        challengeAwemeList.items = a;
        if (!C13603b.m24435a((Collection) a) || challengeAwemeList.isHasMore()) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme a2 = AwemeService.m70060b().mo60677a(a.get(i3));
                    a2.setIsTop(a.get(i3).getIsTop());
                    if (a2.getAid() != null) {
                        f83761a.put(a2.getAid(), this.f83766f);
                    }
                    RequestIdService.m70076a().mo60694a(a2.getAid() + (this.f83767g + 3000), challengeAwemeList.getRequestId(), i3);
                    a.set(i3, a2);
                }
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = challengeAwemeList;
            } else if (i4 == 4) {
                if (a != null) {
                    if (C13603b.m24435a((Collection) ((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = a;
                    } else {
                        C35530h.m72624a(((ChallengeAwemeList) this.mData).items, a, C35524c.f83788a);
                    }
                }
                ((ChallengeAwemeList) this.mData).cursor = challengeAwemeList.cursor;
                ((ChallengeAwemeList) this.mData).hasMore = challengeAwemeList.hasMore & ((ChallengeAwemeList) this.mData).hasMore;
            }
        } else if (this.mData != null) {
            ((ChallengeAwemeList) this.mData).hasMore = 0;
        }
    }

    /* renamed from: a */
    private void m72616a(String str, long j, int i, boolean z, String str2, String str3) {
        m72617a(str, j, i, z, str2, str3, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m72617a(java.lang.String r26, long r27, int r29, boolean r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2451g.C35520a.m72617a(java.lang.String, long, int, boolean, java.lang.String, java.lang.String, boolean):void");
    }
}
