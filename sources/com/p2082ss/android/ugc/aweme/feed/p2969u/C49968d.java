package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1258b.C17935a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37880bd;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.C50479v;
import com.p2082ss.android.ugc.aweme.feed.FeedApiService;
import com.p2082ss.android.ugc.aweme.feed.cache.C49299c;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48026f;
import com.p2082ss.android.ugc.aweme.feed.p2968t.C49935d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3682s.C67269f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.Lock;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.u.d */
public final class C49968d extends AbstractC39100a<Aweme, FeedItemList> {

    /* renamed from: k */
    private static boolean f115241k;

    /* renamed from: l */
    private static boolean f115242l;

    /* renamed from: a */
    public boolean f115243a;

    /* renamed from: b */
    public FeedItemList f115244b;

    /* renamed from: c */
    public boolean f115245c;

    /* renamed from: d */
    public C50479v f115246d;

    /* renamed from: e */
    public boolean f115247e = true;

    /* renamed from: f */
    private int f115248f;

    /* renamed from: g */
    private int f115249g;

    /* renamed from: h */
    private String f115250h;

    /* renamed from: i */
    private long f115251i;

    /* renamed from: j */
    private boolean f115252j;

    static {
        Covode.recordClassIndex(59080);
    }

    /* renamed from: a */
    private static boolean m93819a(int i, int i2, Lock lock, boolean z) {
        if (i != 0 || i2 != 0 || lock == null || !C49907s.m93685a().booleanValue()) {
            return false;
        }
        if (!f115242l && !z) {
            f115242l = true;
            System.currentTimeMillis();
            C49299c.m92352a(lock);
            System.currentTimeMillis();
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m93823a(Lock lock) {
        if (f115242l || lock == null) {
            return false;
        }
        f115242l = true;
        System.currentTimeMillis();
        C49299c.m92352a(lock);
        System.currentTimeMillis();
        return true;
    }

    /* renamed from: a */
    private boolean m93820a(int i, String str, int i2, String str2, Lock lock, Message message) {
        if (i != 0 || i2 != 0 || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || f115241k) {
            return false;
        }
        boolean a = m93823a(lock);
        f115241k = true;
        C1731i.m5640b(new CallableC49971g(this, i, message, lock), C40780g.m82241a());
        return a;
    }

    /* renamed from: a */
    private static boolean m93821a(Message message) {
        return (message == null || message.getData() == null || !message.getData().getBoolean("is_from_feed_cache")) ? false : true;
    }

    /* renamed from: a */
    private void m93818a(String str) {
        if (this.mData != null && ((FeedItemList) this.mData).getItems() != null && !((FeedItemList) this.mData).getItems().isEmpty()) {
            Iterator<Aweme> it = ((FeedItemList) this.mData).getItems().iterator();
            while (it.hasNext()) {
                Aweme next = it.next();
                if (!TextUtils.isEmpty(next.getAid()) && next.getAid().equals(str)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m93822a(Aweme aweme) {
        if (aweme.isLiveNoDeduplicate() && C48026f.m91035a()) {
            return false;
        }
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo85014a(int i, Message message, Lock lock) {
        MethodCollector.m26663i(4447);
        C58945a.C58947b.f134185a.mo96429b("feed_get_cache_to_use_cache", false);
        C58945a.C58947b.f134185a.mo96425a("feed_try_use_cache_duration", false);
        FeedItemList i2 = C49301e.m92378i();
        C58945a.C58947b.f134185a.mo96429b("feed_try_use_cache_duration", false);
        C58945a.C58947b.f134185a.mo96425a("feed_load_cache_completed_to_focus", false);
        C58945a.C58947b.f134185a.mo96425a("feed_use_cache_to_send_msg", false);
        if (i2 == null || C13603b.m24435a((Collection) i2.getItems())) {
            MethodCollector.m26664o(4447);
            return null;
        }
        C49710k.m93123a(i2.getItems(), i2.getRequestId(), i);
        i2.getItems().size();
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = i2;
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_feed_cache", true);
        obtainMessage.setData(bundle);
        if (C67269f.m119191b() && Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        }
        boolean a = C67269f.m119190a();
        if (a) {
            message.copyFrom(obtainMessage);
            message.setTarget(this.mHandler);
        }
        C58945a.C58947b.f134185a.mo96425a("feed_load_cache_try_callback_duration", false);
        System.currentTimeMillis();
        C49299c.m92353b(lock);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_load_cache_try_callback_duration", false);
        C58945a.C58947b.f134185a.mo96429b("feed_use_cache_to_send_msg", false);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_focus_end_to_post_cache_message", false);
        if (!a) {
            this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
        } else {
            Bundle data = message.getData();
            data.hashCode();
            if (C67269f.m119192c() && !data.getBoolean("has_used_feed_cache", false)) {
                synchronized (data) {
                    try {
                        data.putBoolean("has_used_feed_cache", true);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(4447);
                        throw th;
                    }
                }
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
            if (C67269f.m119191b() && !this.mHandler.hasMessages(0, i2)) {
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
        C58945a.C58947b.f134185a.mo96425a("feed_post_cache_message_to_success", false);
        MethodCollector.m26664o(4447);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo85013a(int i, int i2, String str, long j, long j2, int i3, Integer num, String str2, String str3, String str4, boolean z) {
        C49935d.f115106a.mo84986a(4).mo84985c();
        C51423a.m95791b(4, "FeedFetchModel", "start commit to fetchList,type:" + i + ",pullType:" + i2 + ",aids:" + str);
        FeedItemList fetchFeedList = FeedApiService.m91022a().fetchFeedList(i, j, j2, i3, num, str2, i2, 0, str3, str, str4, this.f115251i, null, null, Boolean.valueOf(z));
        if (!C13627m.m24498a(str2) && fetchFeedList != null) {
            fetchFeedList.setLocalExtra("aweme_id", str2);
        }
        if (i == 0 && fetchFeedList != null) {
            fetchFeedList.appendCache = C49301e.m92360a();
        }
        if (fetchFeedList == null || fetchFeedList.getItems() == null || fetchFeedList.getItems().size() <= 0) {
            C1731i.m5640b(CallableC49975k.f115286a, C1731i.f5562a);
        } else {
            try {
                C51423a.m95791b(4, "FeedFetchModel", "end commit to fetchList,type:" + i + ",pullType:" + i2 + ",aids:" + str + ",listSize:" + fetchFeedList.getItems().size());
            } catch (Throwable unused) {
                C51423a.m95791b(6, "FeedFetchModel", "end commit to fetchList log error,should never happen!");
            }
            BusinessComponentServiceUtils.getLiveStateManager().mo96086a(fetchFeedList.getItems());
        }
        return fetchFeedList;
    }

    public C49968d() {
        this.mCount = 6;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93812a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "feed_banned");
            jSONObject.put("scene", "feed");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AppLog.recordMiscLog(C17867d.m33078a(), "app_perf", jSONObject);
        return null;
    }

    /* renamed from: b */
    private static boolean m93824b(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData != null) {
            ((FeedItemList) this.mData).items = list;
        }
    }

    /* renamed from: a */
    private static Integer m93811a(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof Integer)) {
            return null;
        }
        return (Integer) objArr[3];
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        if (objArr.length == 3 || objArr.length == 4 || objArr.length == 5 || objArr.length == 6 || objArr.length == 7 || objArr.length == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m93825c(FeedItemList feedItemList) {
        List<Aweme> items;
        boolean z;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            ListIterator<Aweme> listIterator = items.listIterator();
            try {
                z = C52912c.f121688a.f121689b.getDiscardRefreshTopDsp().booleanValue();
            } catch (C16041a unused) {
                z = true;
            }
            AbstractC38677bd h = C38000g.m77057h();
            int i = 0;
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                if (next == null) {
                    listIterator.remove();
                } else {
                    if (h.mo67249a(next) || h.mo67250b(next)) {
                        if (this.mListQueryType != 1 || i >= 3 || !C38701br.m78512a(next, 3)) {
                            h.mo67248a(next, C1731i.f5562a, false);
                        } else if (z) {
                            listIterator.remove();
                        } else {
                            h.mo67248a(next, null, true);
                            if (C38701br.m78514a(next, false)) {
                                listIterator.remove();
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        String awesomeSplashId;
        Aweme aweme2 = aweme;
        if (!SplashSettingServiceImpl.m33419g().mo28728f() || this.mData != null || aweme2 == null || !aweme2.isAd() || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || (awesomeSplashId = splashInfo.getAwesomeSplashId()) == null || awesomeSplashId.length() == 0 || !C17975i.f42802b) {
            return C50545m.m94763a(getItems(), aweme2, this.mNotifyListeners);
        }
        AbstractC81915c.m141874a(new C17935a(aweme2));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadLatestList(Object... objArr) {
        long j;
        this.f115248f = ((Integer) objArr[1]).intValue();
        this.f115249g = ((Integer) objArr[2]).intValue();
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f115250h = "";
        } else {
            this.f115250h = (String) objArr[4];
        }
        int i = this.f115248f;
        if (C13603b.m24435a((Collection) getItems())) {
            j = 0;
        } else {
            j = -1;
        }
        m93815a(i, j, ((FeedItemList) this.mData).minCursor, this.mCount, m93811a(objArr), null, this.f115249g, this.f115250h, null, null, null, null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r10 != null) goto L_0x0046;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d.handleMsg(android.os.Message):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        boolean z;
        long j;
        if (this.mData != null) {
            this.f115251i = ((FeedItemList) this.mData).cursor;
        }
        this.f115248f = ((Integer) objArr[1]).intValue();
        this.f115249g = ((Integer) objArr[2]).intValue();
        if (objArr.length < 4 || !(objArr[3] instanceof Boolean)) {
            z = false;
        } else {
            z = ((Boolean) objArr[3]).booleanValue();
        }
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f115250h = "";
        } else {
            this.f115250h = (String) objArr[4];
        }
        if (objArr.length < 5 || !(objArr[4] instanceof Boolean)) {
            this.f115245c = false;
        } else {
            this.f115245c = true;
        }
        C51423a.m95791b(4, "FeedFetchModel", "loadMoreList call,type:" + this.f115248f + ",pullType:" + this.f115249g + ",countryCode:" + this.f115250h);
        int i = this.f115248f;
        if (C13603b.m24435a((Collection) getItems())) {
            j = 0;
        } else {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m93815a(i, j, -1, this.mCount, m93811a(objArr), null, this.f115249g, this.f115250h, null, null, null, null, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        String str;
        String str2;
        Lock lock;
        Message message;
        String str3;
        this.f115251i = 0;
        this.f115248f = ((Integer) objArr[1]).intValue();
        this.f115249g = ((Integer) objArr[2]).intValue();
        if (this.f115248f == 0) {
            this.f115247e = false;
        }
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f115250h = "";
        } else {
            this.f115250h = (String) objArr[4];
        }
        Boolean bool = false;
        if (objArr.length >= 4 && (objArr[3] instanceof Boolean)) {
            bool = (Boolean) objArr[3];
        }
        if (bool.booleanValue()) {
            C34608n.m70658a().mo61083a(this.mHandler, new CallableC49969e(this), 0);
            return;
        }
        if (objArr.length < 6 || !(objArr[4] instanceof String)) {
            str = null;
        } else {
            str = (String) objArr[4];
        }
        if (!TextUtils.isEmpty(str) || objArr.length < 6 || !(objArr[5] instanceof String)) {
            str2 = null;
        } else {
            str2 = (String) objArr[5];
        }
        if (objArr.length < 7 || !(objArr[6] instanceof Lock)) {
            lock = null;
        } else {
            lock = (Lock) objArr[6];
        }
        if (objArr.length < 8 || !(objArr[7] instanceof Message)) {
            message = null;
        } else {
            message = (Message) objArr[7];
        }
        int i = this.f115248f;
        int i2 = this.mCount;
        Integer a = m93811a(objArr);
        if (objArr.length < 4 || !(objArr[3] instanceof String)) {
            str3 = null;
        } else {
            str3 = (String) objArr[3];
        }
        m93815a(i, 0, 0, i2, a, str3, this.f115249g, this.f115250h, str, str2, lock, message, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r5 != 1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r5 != 2) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m93813a(java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d.m93813a(java.util.List):java.lang.Object");
    }

    /* renamed from: a */
    private static void m93816a(FeedItemList feedItemList) {
        if (feedItemList != null && !C13603b.m24435a((Collection) feedItemList.getItems())) {
            Iterator<Aweme> it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                Aweme next = it.next();
                if (next != null && next.isLive()) {
                    LiveRoomStruct newLiveRoomData = next.getNewLiveRoomData();
                    if (newLiveRoomData == null || newLiveRoomData.owner == null || TextUtils.isEmpty(newLiveRoomData.owner.getUid()) || TextUtils.isEmpty(newLiveRoomData.owner.getSecUid())) {
                        it.remove();
                    } else {
                        User user = newLiveRoomData.owner;
                        User user2 = new User();
                        user2.setUid(user.getUid());
                        user2.setSecUid(user.getSecUid());
                        user2.setNickname(user.getNickname());
                        user2.setShortId(user.getShortId());
                        user2.setUniqueId(user.getUniqueId());
                        user2.setSignature(user.getSignature());
                        user2.setAvatarThumb(user.getAvatarThumb());
                        user2.setAvatarLarger(user.getAvatarLarger());
                        user2.setAvatarMedium(user.getAvatarMedium());
                        RoomFeedCellStruct roomFeedCellStruct = next.getRoomFeedCellStruct();
                        roomFeedCellStruct.room = newLiveRoomData;
                        next.setRoomFeedCellStruct(roomFeedCellStruct);
                        next.setAuthor(user2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r1 != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d.handleData(java.lang.Object):void");
    }

    /* renamed from: a */
    private static String m93814a(List<String> list, String str) {
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
    private void m93817a(FeedItemList feedItemList, String str) {
        String str2;
        int i;
        int i2;
        Iterator<Aweme> it = feedItemList.getItems().iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i3 = 2;
            if (!it.hasNext()) {
                break;
            }
            Aweme next = it.next();
            if (!TextUtils.equals(next.getAid(), str) && !isDataEmpty() && C50545m.m94760a(((FeedItemList) this.mData).getItems(), next) >= 0) {
                Aweme aweme = ((FeedItemList) this.mData).getItems().get(C50545m.m94764b(((FeedItemList) this.mData).getItems(), next));
                if (aweme != null && TextUtils.equals(next.getAid(), aweme.getAid())) {
                    if (next.isAd()) {
                        AbstractC37880bd a = C38000g.m77050a();
                        Context a2 = C17867d.m33078a();
                        if (aweme.isAd()) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        a.mo65878a(a2, next, i);
                        C18129a.C18130a a3 = C18129a.m33746a("draw_ad", "item_repeat", next.getAwemeRawAd());
                        if (aweme.isAd()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        a3.mo28897a("filter_reason", Integer.valueOf(i2)).mo28902c();
                    }
                    if (m93822a(next)) {
                        if (C37699a.m76268an(next)) {
                            C38000g.m77050a().mo65881a(C17867d.m33078a(), next, C17975i.m33464b("8"));
                            C18129a.C18130a a4 = C18129a.m33746a("draw_ad", "show_failed", next.getAwemeRawAd()).mo28897a("ad_show_fail_type", "8");
                            if (C17975i.f42802b) {
                                str2 = "1";
                            } else {
                                str2 = "2";
                            }
                            a4.mo28897a("awemelaunch", str2).mo28902c();
                        }
                        C33744d dVar = new C33744d();
                        if (aweme.isAd()) {
                            i3 = 1;
                        }
                        C39162r.m79460a("vv_failed", dVar.mo59980a("failed_reason", i3).mo59983a("group_id", aweme.getAid()).f79943a);
                    }
                }
                if (m93822a(next)) {
                    it.remove();
                    arrayList.add(next.getAid());
                }
            }
        }
        if (arrayList.size() > 0) {
            int i4 = this.f115248f;
            if (i4 == 0) {
                C39162r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_hot").setValue(String.valueOf(arrayList.size())));
                String requestId = feedItemList.getRequestId();
                if (!C13603b.m24435a((Collection) arrayList)) {
                    C33830n.m69192a("service_monitor", "aweme_delete_duplicated_items", new C33743c().mo59976a("request_id", requestId).mo59976a("user_id", C31575b.m65865g().getCurUserId()).mo59974a("list_count", Integer.valueOf(arrayList.size())).mo59976a("item_ids_str", m93814a(arrayList, ",")).mo59976a("page_type", "homepage_hot").mo59977a());
                }
            } else if (i4 == 2) {
                C39162r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_fresh").setValue(String.valueOf(arrayList.size())));
            }
        }
    }

    /* renamed from: a */
    private void m93815a(int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, String str4, Lock lock, Message message, boolean z) {
        C51423a.m95791b(4, "FeedFetchModel", "start to fetchList,type:" + i + ",pullType:" + i3 + ",aids:" + str3);
        new RunnableC49970f(this, i, i3, str3, j, j2, i2, num, str, str2, str4, z, m93819a(i, i3, lock, m93820a(i, str, i3, str3, lock, message)), lock).run();
    }
}
