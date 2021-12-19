package com.p2082ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41228c;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48026f;
import com.p2082ss.android.ugc.aweme.follow.api.C51067a;
import com.p2082ss.android.ugc.aweme.follow.api.C51069b;
import com.p2082ss.android.ugc.aweme.follow.api.IFollowFeedApiV1;
import com.p2082ss.android.ugc.aweme.follow.p3000d.C51077b;
import com.p2082ss.android.ugc.aweme.live.p3405b.C58590a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.a */
public final class C51079a extends AbstractC41228c<FollowFeed, FollowFeedList> implements AbstractC41238k, Cloneable {

    /* renamed from: l */
    private static HashMap<String, Aweme> f117817l = new HashMap<>();

    /* renamed from: a */
    public String f117818a = "homepage_follow";

    /* renamed from: b */
    public String f117819b = "extra_follow_type_follow";

    /* renamed from: c */
    public boolean f117820c;

    /* renamed from: d */
    public long f117821d;

    /* renamed from: e */
    public int f117822e = -1;

    /* renamed from: f */
    public String f117823f = "";

    /* renamed from: g */
    public List<FollowFeed> f117824g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public boolean f117825h;

    /* renamed from: i */
    public int f117826i = -1;

    /* renamed from: j */
    public int f117827j = -1;

    /* renamed from: k */
    private int f117828k;

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k
    /* renamed from: a */
    public final List<Aweme> mo70559a() {
        return m95491a(getItems());
    }

    static {
        Covode.recordClassIndex(60273);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C51079a clone() {
        try {
            C51079a aVar = (C51079a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo86490c() {
        if (this.mNotifyListeners == null) {
            return null;
        }
        try {
            for (AbstractC39159o oVar : this.mNotifyListeners) {
                oVar.mo57528c();
            }
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final List<Aweme> mo86489b() {
        if (this.mData == null) {
            return null;
        }
        this.f117822e = -1;
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            } else if (followFeed.getFeedType() == 65297) {
                this.f117822e = arrayList.size();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo86488a(Message message) {
        handleData((FollowFeedList) message.obj);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C51083d m95489a(Object... objArr) {
        if (objArr.length < 2 || !(objArr[1] instanceof C51083d)) {
            return null;
        }
        return (C51083d) objArr[1];
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<FollowFeed> list) {
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        String str;
        C51083d a = m95489a(objArr);
        if (a != null) {
            String str2 = a.f117854e;
            if (TextUtils.isEmpty(str2)) {
                str = a.f117858i;
            } else {
                str = str2;
            }
            int i = this.f117828k + 1;
            this.f117828k = i;
            m95492a(i, 0, 1, 0, 0, a.f117851b, a.f117852c, a.f117853d, "", a.f117856g, str2, str, 0, a.f117855f.intValue());
            C58590a.f133452a.mo2093a();
        }
    }

    /* renamed from: a */
    public static List<Aweme> m95491a(List<FollowFeed> list) {
        Aweme aweme;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280 && (aweme = followFeed.getAweme()) != null) {
                if (!aweme.isForwardAweme() || aweme.getForwardItem() != null) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            if (this.mNotifyListeners != null) {
                for (AbstractC39159o oVar : this.mNotifyListeners) {
                    oVar.mo57526a_((Exception) message.obj);
                }
            }
            m95493a(this.f117826i, "", ((Exception) message.obj).getMessage(), 0);
            return;
        }
        C1731i.m5640b(new CallableC51081b(this, Message.obtain(message)), C40780g.m82241a()).mo5534a(new C51082c(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        int i;
        long maxCursor;
        C51083d a = m95489a(objArr);
        if (a != null) {
            int i2 = this.f117828k;
            if (this.mData != null) {
                j = ((FollowFeedList) this.mData).getCursor();
            } else {
                j = 0;
            }
            if (this.mData != null) {
                i = ((FollowFeedList) this.mData).getLevel();
            } else {
                i = 1;
            }
            if (C13603b.m24435a((Collection) getItems())) {
                maxCursor = 0;
            } else {
                maxCursor = ((FollowFeedList) this.mData).getMaxCursor();
            }
            m95492a(i2, j, i, maxCursor, -1, a.f117851b, a.f117852c, a.f117853d, a.f117854e, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), 0);
        }
    }

    /* renamed from: a */
    private boolean m95495a(FollowFeed followFeed) {
        if (followFeed == null) {
            return false;
        }
        if (!(followFeed.getFeedType() == 65280 || followFeed.getFeedType() == 65298)) {
            return false;
        }
        if (!((followFeed.getAweme() != null && followFeed.getAweme().isLiveNoDeduplicate() && C48026f.m91035a()) || this.mData == null || ((FollowFeedList) this.mData).getItems().size() == 0)) {
            for (FollowFeed followFeed2 : ((FollowFeedList) this.mData).getItems()) {
                if (followFeed.getFeedType() == 65280 && followFeed2.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    Aweme aweme2 = followFeed2.getAweme();
                    if (!(aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid()))) {
                        return true;
                    }
                } else if (followFeed.getFeedType() == 65298 && followFeed2.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    RoomFeedCellStruct roomStruct2 = followFeed2.getRoomStruct();
                    if (!(roomStruct == null || roomStruct2 == null || roomStruct.getNewLiveRoomData().f114485id != roomStruct2.getNewLiveRoomData().f114485id)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b4, code lost:
        if (r10.getVideo().getHeight() != 0) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02dc, code lost:
        if (r10.getHeight() == 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05cc, code lost:
        if (r15 != null) goto L_0x05b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x054c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeedList r15) {
        /*
        // Method dump skipped, instructions count: 1561
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.follow.presenter.C51079a.handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList):void");
    }

    /* renamed from: a */
    private static String m95490a(List<String> list, String str) {
        if (C13603b.m24435a((Collection) list)) {
            return "";
        }
        StringBuilder sb = null;
        for (String str2 : list) {
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m95493a(int i, String str, String str2, int i2) {
        C33743c cVar = new C33743c();
        cVar.mo59974a("feed_r_type", Integer.valueOf(i)).mo59974a("feed_r_pull_type", Integer.valueOf(this.f117827j)).mo59974a("origin_count", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            cVar.mo59976a("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            cVar.mo59976a("error_desc", str2);
        }
        C33830n.m69192a("aweme_feed_fetch_abnormal_log", "", cVar.mo59977a());
    }

    /* renamed from: a */
    private void m95492a(final int i, final long j, final int i2, final long j2, final long j3, final int i3, final int i4, final String str, final String str2, final String str3, final String str4, final String str5, final int i5, final int i6) {
        final String str6;
        boolean booleanValue = SharePrefCache.inst().getIsContactsUploaded().mo59941c().booleanValue();
        int[] a = C80397em.m139369a(101);
        if (a == null) {
            str6 = "";
        } else {
            str6 = a[0] + "_" + a[1];
        }
        C34608n a2 = C34608n.m70658a();
        WeakHandler weakHandler = this.mHandler;
        final int i7 = booleanValue ? 1 : 0;
        a2.mo61083a(weakHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.follow.presenter.C51079a.CallableC510801 */

            /* renamed from: o */
            final /* synthetic */ int f117843o = 2;

            static {
                Covode.recordClassIndex(60274);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                FollowFeedList a;
                int i2;
                CallableC510801 r0 = this;
                if (C31575b.m65865g().isUidContactPermisioned()) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (TextUtils.equals(C51079a.this.f117819b, "extra_follow_type_friend")) {
                    long j = j2;
                    long j2 = j3;
                    int i3 = i3;
                    int i4 = i4;
                    long j3 = C51079a.this.f117821d;
                    if (C51079a.this.mData != null) {
                        i2 = ((FollowFeedList) C51079a.this.mData).getFetchRecommend();
                    } else {
                        i2 = 1;
                    }
                    String str = str;
                    String str2 = str5;
                    int i5 = i7;
                    int i6 = i5;
                    IFollowFeedApiV1 iFollowFeedApiV1 = C51067a.f117794a;
                    String str3 = C51077b.f117806b;
                    Integer num = C51077b.f117809e.get(3, 0);
                    C89219l.m154716b(num, "");
                    FollowFeedList followFeedList = iFollowFeedApiV1.getFriendList(j, j2, 20, i3, i4, j3, i2, str, i5, i6, str2, i, str3, Integer.valueOf(num.intValue()), Integer.valueOf(C51077b.f117805a), Long.valueOf(C51077b.f117808d), Long.valueOf(C51077b.f117807c)).get();
                    C89219l.m154716b(followFeedList, "");
                    a = followFeedList;
                    r0 = this;
                    C51079a.this.f117826i = 2;
                } else if (TextUtils.equals(C51079a.this.f117818a, "rec_follow")) {
                    FollowFeedList followFeedList2 = C51067a.f117794a.getRecommendList(20, i3, i4, C51079a.this.f117821d, str, str2).get();
                    C89219l.m154716b(followFeedList2, "");
                    a = followFeedList2;
                } else {
                    int i7 = i;
                    long j4 = j;
                    int i8 = i2;
                    int i9 = i3;
                    int i10 = i4;
                    long j5 = C51079a.this.f117821d;
                    if (C51079a.this.mData != null) {
                        ((FollowFeedList) C51079a.this.mData).getFetchRecommend();
                    }
                    a = C51069b.C51070a.m95483a(i7, j4, i8, i9, i10, j5, str3, str4, str5, i, r0.f117843o, i6, str6);
                    C51079a.this.f117826i = 1;
                }
                C51079a.this.f117827j = i3;
                if (a != null) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo96087b(a.getItems());
                    C51079a.this.f117823f = a.getBlankPanelText();
                }
                return a;
            }
        }, 0);
    }
}
