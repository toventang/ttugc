package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C28020m;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.AbstractC38485b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.AbstractC38487d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.C38486c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.C38482b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.C38484d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.EnumC38481a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.EnumC38483c;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.experiment.C46934fk;
import com.p2082ss.android.ugc.aweme.experiment.C46937fn;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63408v;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63775e;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.b */
public final class C63833b extends AbstractC63853q<Aweme, FeedItemList> implements AbstractC38485b, AbstractC41238k {

    /* renamed from: f */
    public static int f144715f = -1;

    /* renamed from: a */
    protected int f144716a;

    /* renamed from: b */
    public int f144717b;

    /* renamed from: c */
    public String f144718c;

    /* renamed from: d */
    public User f144719d;

    /* renamed from: e */
    public String f144720e = "";

    /* renamed from: g */
    private int f144721g;

    /* renamed from: h */
    private int f144722h;

    /* renamed from: i */
    private String f144723i = "";

    /* renamed from: j */
    private LinkedHashSet<String> f144724j = new LinkedHashSet<>();

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isNewDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q
    /* renamed from: a */
    public final void mo103307a(List<Aweme> list, boolean z) {
        setItems(new ArrayList(list));
        ((FeedItemList) this.mData).cursor = (long) list.size();
        ((FeedItemList) this.mData).maxCursor = (long) list.size();
        ((FeedItemList) this.mData).hasMore = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo103308a(Aweme aweme) {
        int i = 0;
        if (aweme == null || aweme.getAid() == null) {
            return false;
        }
        int i2 = -1;
        List items = getItems();
        if (items == null) {
            items = new ArrayList();
            setItems(items);
        }
        for (int i3 = 0; i3 < items.size(); i3++) {
            Aweme aweme2 = (Aweme) items.get(i3);
            if (aweme2 != null) {
                if (aweme.getAwemeType() == 40) {
                }
                i2 = i3 + 1;
                if (aweme.getAid().equals(aweme2.getAid())) {
                    return false;
                }
            }
        }
        if (i2 >= 0) {
            i = i2;
        }
        items.add(i, aweme);
        for (AbstractC39159o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof AbstractC39105f)) {
                ((AbstractC39105f) oVar).mo59499a(items, i);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo103304a(FeedItemList feedItemList, String str) {
        MethodCollector.m26663i(8120);
        synchronized (this) {
            try {
                File d = m115506d(str);
                if (d != null) {
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(d));
                        outputStreamWriter.write(GsonHolder.m138943c().mo123620b().mo46674b(feedItemList));
                        outputStreamWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    MethodCollector.m26664o(8120);
                }
            } finally {
                MethodCollector.m26664o(8120);
            }
        }
    }

    /* renamed from: a */
    public final void mo103306a(Collection<Aweme> collection, String str) {
        if (!collection.isEmpty()) {
            AbstractC88979t.m154294a(new C63844k(this, str, collection)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
        }
    }

    /* renamed from: c */
    public final boolean mo103312c() {
        if (this.f144722h == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(75257);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k
    /* renamed from: a */
    public final List<Aweme> mo70559a() {
        if (this.f144716a == 1) {
            return getItems();
        }
        return getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo103310b() {
        User user = this.f144719d;
        boolean z = false;
        if (!(user == null || user.getCommerceUserInfo() == null || this.f144719d.getCommerceUserInfo().getAdRevenueRits() == null)) {
            for (Integer num : this.f144719d.getCommerceUserInfo().getAdRevenueRits()) {
                if (num != null && num.intValue() == EnumC38481a.PROFILE_RIT.getTYPE()) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q
    /* renamed from: a */
    public final void mo103305a(String str) {
        this.f144723i = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 5) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        super.setItems(list);
        if (this.mData == null) {
            FeedItemList feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) this.mData).items = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Object obj) {
        ITalentAdRevenueShareService e;
        Aweme aweme = (Aweme) obj;
        boolean a = C50545m.m94763a(getItems(), aweme, this.mNotifyListeners);
        if (!(!a || (e = TalentAdRevenueShareServiceImpl.m77931e()) == null || aweme.getAwemeRawAd() == null)) {
            e.mo67025a(aweme.getAwemeRawAd().getCreativeIdStr());
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        this.mListQueryType = ((Integer) objArr[0]).intValue();
        int i = this.mListQueryType;
        if (i == 1) {
            refreshList(objArr);
        } else if (i == 2) {
            loadLatestList(objArr);
        } else if (i == 4) {
            loadMoreList(objArr);
        }
        return true;
    }

    /* renamed from: a */
    public static void m115501a(Context context) {
        if (f144715f == -1 && context != null) {
            int b = ((int) ((((((float) C13628n.m24521b(context)) / ((float) C13628n.m24504a(context))) - 0.3f) / 0.44444445f) + 0.5f)) * 3;
            f144715f = b;
            if (b < 12) {
                f144715f = 12;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        int i;
        long j;
        long j2;
        this.f144717b = ((Integer) objArr[4]).intValue();
        if (C46937fn.f109393c) {
            i = 18;
        } else {
            i = 10;
        }
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            int intValue = ((Integer) objArr[3]).intValue();
            if (this.mData == null) {
                j2 = 0;
            } else {
                j2 = ((FeedItemList) this.mData).maxCursor;
            }
            m115503a(str, intValue, j2, i, (String) objArr[5], this.f144721g, this.f144722h);
            return;
        }
        String str2 = (String) objArr[2];
        int intValue2 = ((Integer) objArr[3]).intValue();
        if (this.mData == null) {
            j = 0;
        } else {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m115503a(str2, intValue2, j, i, "", this.f144721g, this.f144722h);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        int i;
        this.f144717b = ((Integer) objArr[4]).intValue();
        int i2 = 12;
        if (this.f144716a == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (!C46937fn.f109393c || this.f144716a != 0) {
            i2 = i;
        } else {
            int i3 = f144715f;
            if (i3 > 0) {
                i2 = i3;
            }
        }
        if (objArr.length >= 6) {
            m115504b(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0, i2, (String) objArr[5], 0, 0);
        } else {
            m115504b(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0, i2, "", 0, 0);
        }
    }

    /* renamed from: d */
    private static File m115506d(String str) {
        Context a = C17867d.m33078a();
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = a.getCacheDir();
        }
        File file = C58016d.f132221b;
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(file.getPath() + File.separator + "aweme_publish");
        try {
            if (!file2.exists() && !file2.mkdirs()) {
                return null;
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return new File(file2.getPath() + File.separator + C63873h.f144797a.hexDigest(AwemeApi.f143997a + str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r3 != null) goto L_0x0012;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4560f.p4561a.AbstractC88979t<com.p2082ss.android.ugc.aweme.feed.model.FeedItemList> mo103309b(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.presenter.C63833b.mo103309b(java.lang.String):f.a.t");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final FeedItemList mo103311c(String str) {
        String a;
        MethodCollector.m26663i(8122);
        File d = m115506d(str);
        if (d != null && d.exists()) {
            synchronized (this) {
                try {
                    a = C80313cs.m139226a(d, "UTF-8");
                } catch (Throwable th) {
                    MethodCollector.m26664o(8122);
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    FeedItemList feedItemList = (FeedItemList) GsonHolder.m138943c().mo123620b().mo46670a(a, FeedItemList.class);
                    MethodCollector.m26664o(8122);
                    return feedItemList;
                } catch (C28027t e) {
                    e.printStackTrace();
                } catch (C28020m e2) {
                    e2.printStackTrace();
                } catch (UnsupportedOperationException e3) {
                    C51423a.m95790a((Throwable) e3);
                }
            }
        }
        MethodCollector.m26664o(8122);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        final boolean z;
        final FeedItemList feedItemList = (FeedItemList) obj;
        C48027ac.C48028a.f111257a.mo80056a(feedItemList.getRequestId(), feedItemList.logPb);
        if (feedItemList.fetchType == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean a = C13603b.m24435a((Collection) feedItemList.getItems());
        if (this.f144716a == 1) {
            if (this.mData != null) {
                ((FeedItemList) this.mData).invalidItemCount = feedItemList.invalidItemCount;
                ((FeedItemList) this.mData).invalidItemText = feedItemList.invalidItemText;
                ((FeedItemList) this.mData).hidingInvalidItem = feedItemList.hidingInvalidItem;
                ((FeedItemList) this.mData).isClearInvalidItem = feedItemList.isClearInvalidItem;
            }
            if (!C13603b.m24435a((Collection) feedItemList.invalidItemIdList)) {
                this.f144724j.addAll(feedItemList.invalidItemIdList);
            }
        }
        if (!a) {
            if (C46934fk.f109380d) {
                final int i = this.f144716a;
                final int i2 = this.f144717b;
                if (this.mListQueryType == 1) {
                    C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.profile.presenter.C63833b.RunnableC638352 */

                        static {
                            Covode.recordClassIndex(75259);
                        }

                        public final void run() {
                            C63833b.m115502a(feedItemList, z, i, i2);
                        }
                    }, 1000);
                } else {
                    m115502a(feedItemList, z, this.f144716a, this.f144717b);
                }
            } else {
                m115502a(feedItemList, z, this.f144716a, this.f144717b);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = feedItemList;
                if (TextUtils.equals(this.f144718c, C31575b.m65865g().getCurUserId())) {
                    C63775e.m115332a(this.f144716a, false, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            } else if (i3 == 4) {
                if (this.mData == null) {
                    this.mData = feedItemList;
                } else {
                    if (C13603b.m24435a((Collection) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        List<Aweme> items = ((FeedItemList) this.mData).getItems();
                        List<Aweme> items2 = feedItemList.getItems();
                        List<Aweme> items3 = ((FeedItemList) this.mData).getItems();
                        if (!(items2 == null || items3 == null)) {
                            ArrayList arrayList = new ArrayList();
                            for (Aweme aweme : items2) {
                                arrayList.add(aweme);
                                Iterator<Aweme> it = items3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (TextUtils.equals(aweme.getAid(), it.next().getAid())) {
                                            arrayList.remove(aweme);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            items2 = arrayList;
                        }
                        items.addAll(items2);
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                }
                if (TextUtils.equals(this.f144718c, C31575b.m65865g().getCurUserId()) && ((FeedItemList) this.mData).getItems().size() - feedItemList.getItems().size() <= 10) {
                    C63775e.m115332a(this.f144716a, true, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            }
            if (this.f144716a == 4 && this.mData != null) {
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                ((FeedItemList) this.mData).maxCursor = feedItemList.cursor;
            }
        } else if (this.mData != null) {
            ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
            ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
        } else {
            this.mData = feedItemList;
        }
    }

    /* renamed from: a */
    static Aweme m115500a(Aweme aweme, List<C38482b> list) {
        if (!(aweme == null || list == null || list.isEmpty())) {
            for (C38482b bVar : list) {
                if (!(bVar == null || TextUtils.isEmpty(bVar.f90901a) || !bVar.f90901a.equals(aweme.getAid()))) {
                    return bVar.f90902b;
                }
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.AbstractC38485b
    /* renamed from: a */
    public final void mo67043a(int i, String str) {
        ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
        if (e != null && e.mo67031a(i)) {
            mo103302a(i, str, EnumC38483c.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE);
        }
    }

    /* renamed from: a */
    public final void mo103303a(Aweme aweme, String str) {
        AbstractC88979t.m154294a(new C63845l(this, str, aweme)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
    }

    /* renamed from: a */
    public final void mo103302a(int i, String str, EnumC38483c cVar) {
        ITalentAdRevenueShareService e;
        if (!(this.mData == null || ((FeedItemList) this.mData).getItems() == null || TextUtils.isEmpty(str) || i < 0 || i >= ((FeedItemList) this.mData).getItems().size() || !mo103310b() || (e = TalentAdRevenueShareServiceImpl.m77931e()) == null)) {
            int a = e.mo67023a();
            ArrayList arrayList = new ArrayList();
            List<Aweme> items = ((FeedItemList) this.mData).getItems();
            for (int i2 = i + 1; i2 < items.size(); i2++) {
                Aweme aweme = items.get(i2);
                if (a > 0) {
                    arrayList.add(aweme.getAid());
                    a--;
                }
            }
            e.mo67027a(str, arrayList, i, cVar, new AbstractC38487d() {
                /* class com.p2082ss.android.ugc.aweme.profile.presenter.C63833b.C638341 */

                static {
                    Covode.recordClassIndex(75258);
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.talent.AbstractC38487d
                /* renamed from: a */
                public final void mo67044a(C38484d dVar) {
                    int i;
                    Aweme aweme;
                    if (dVar != null) {
                        C63833b bVar = C63833b.this;
                        List<C38482b> list = dVar.f90906b;
                        if (list != null && !list.isEmpty() && ((FeedItemList) bVar.mData).getItems() != null && !((FeedItemList) bVar.mData).getItems().isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < ((FeedItemList) bVar.mData).getItems().size(); i2++) {
                                Aweme aweme2 = ((FeedItemList) bVar.mData).getItems().get(i2);
                                arrayList.add(aweme2);
                                Aweme a = C63833b.m115500a(aweme2, list);
                                if (a != null && ((i = i2 + 1) >= ((FeedItemList) bVar.mData).getItems().size() || (aweme = ((FeedItemList) bVar.mData).getItems().get(i)) == null || !aweme.isAd())) {
                                    arrayList.add(AwemeService.m70060b().mo60677a(a));
                                }
                            }
                            ((FeedItemList) bVar.mData).items = arrayList;
                        }
                        AbstractC81915c.m141874a(new C38486c(((FeedItemList) C63833b.this.mData).getItems()));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m115502a(FeedItemList feedItemList, boolean z, int i, int i2) {
        int isTop;
        Aweme a;
        if (!(feedItemList == null || feedItemList.getItems() == null)) {
            int size = feedItemList.getItems().size();
            for (int i3 = 0; i3 < size; i3++) {
                Aweme aweme = feedItemList.getItems().get(i3);
                if (aweme == null) {
                    isTop = -1;
                } else {
                    isTop = aweme.getIsTop();
                    if (aweme.isSelfSee() || aweme.isProhibited()) {
                        a = AwemeService.m70060b().mo60678a(aweme, i);
                        if (z && isTop >= 0) {
                            a.setIsTop(isTop);
                        }
                        RequestIdService.m70076a().mo60694a(a.getAid() + (i2 + i), feedItemList.getRequestId(), i3);
                        feedItemList.getItems().set(i3, a);
                    }
                }
                a = AwemeService.m70060b().mo60677a(aweme);
                a.setIsTop(isTop);
                RequestIdService.m70076a().mo60694a(a.getAid() + (i2 + i), feedItemList.getRequestId(), i3);
                feedItemList.getItems().set(i3, a);
            }
        }
    }

    /* renamed from: a */
    private void m115503a(String str, int i, long j, int i2, String str2, int i3, int i4) {
        m115504b(false, str, i, j, i2, str2, i3, i4);
    }

    /* renamed from: b */
    private void m115504b(boolean z, String str, int i, long j, int i2, String str2, int i3, int i4) {
        this.f144716a = i;
        this.f144718c = str;
        if (C63408v.C63411a.m114973a(i, this.f144719d)) {
            m115505c(z, str, i, j, i2, str2, i3, i4);
        } else {
            C34608n.m70658a().mo61083a(this.mHandler, new CallableC63836c(this, z, str, i, j, i2, str2, i3, i4), 0);
        }
    }

    /* renamed from: c */
    private void m115505c(boolean z, String str, int i, long j, int i2, String str2, int i3, int i4) {
        String str3;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        AbstractC88979t<Aweme> a = C77260g.f173332a.mo120157e().mo120172a(str3, false);
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC63837d(this, z, str, i, j, i2, str2, i3, i4));
        C63408v.C63411a aVar = C63408v.f143954f;
        aVar.getClass();
        AbstractC88979t.m154296a(a, c, C63839f.m115522a(aVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C63840g(this), new C63841h(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.feed.model.FeedItemList mo103301a(boolean r20, java.lang.String r21, int r22, long r23, int r25, java.lang.String r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.presenter.C63833b.mo103301a(boolean, java.lang.String, int, long, int, java.lang.String, int, int):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
