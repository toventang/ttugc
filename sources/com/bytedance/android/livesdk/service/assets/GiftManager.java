package com.bytedance.android.livesdk.service.assets;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0489d;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7388g;
import com.bytedance.android.livesdk.chatroom.p488c.C7390i;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.assets.AbstractC8785b;
import com.bytedance.android.livesdk.gift.model.C8842g;
import com.bytedance.android.livesdk.gift.model.C8843h;
import com.bytedance.android.livesdk.gift.model.C8846j;
import com.bytedance.android.livesdk.gift.model.C8852p;
import com.bytedance.android.livesdk.gift.model.C8857u;
import com.bytedance.android.livesdk.gift.model.EnumC8850n;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadSetting;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p624b.C10699c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88933j;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.EnumC88388a;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class GiftManager {
    private static GiftManager sInst;
    C27910f gson = C4139e.C4140a.f11575b;
    private final AbstractC8785b mAssetsManager;
    private final SparseArray<C8846j> mGiftsMap = new SparseArray<>();
    private final SparseArray<C0489d<C9904t>> mGiftsMapByFind = new SparseArray<>();
    private final List<C8842g> mGroupCountInfo = new ArrayList();
    public C1213t<Boolean> mHideBottomBar = new C1213t<>();
    private ConcurrentHashMap<Long, Long> mRoomFastGiftIdMap = new ConcurrentHashMap<>(20);
    private ConcurrentHashMap<Long, C8843h> mRoomGiftInfoMap = new ConcurrentHashMap<>(20);

    static {
        Covode.recordClassIndex(12277);
    }

    public void clearGiftIconInfo() {
        this.mRoomFastGiftIdMap.clear();
    }

    public static synchronized GiftManager inst() {
        GiftManager giftManager;
        synchronized (GiftManager.class) {
            MethodCollector.m26663i(7261);
            if (sInst == null) {
                sInst = new GiftManager();
            }
            giftManager = sInst;
            MethodCollector.m26664o(7261);
        }
        return giftManager;
    }

    private void loadLocal() {
        AbstractC88924h.m154134a(new C10685e(this), EnumC88388a.BUFFER).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143190a(new C10686f(this), C10687g.f25741a);
    }

    public List<GiftPage> getGiftPageList() {
        int i;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        C8846j jVar = this.mGiftsMap.get(i);
        if (jVar == null || C13617h.m24465a(jVar.f21729c)) {
            return new ArrayList();
        }
        return new ArrayList(jVar.f21729c);
    }

    public List<C9904t> getStickerGifts() {
        ArrayList arrayList = new ArrayList();
        ArrayList<C9904t> arrayList2 = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            for (GiftPage giftPage : giftPageList) {
                arrayList2.addAll(giftPage.gifts);
            }
        }
        for (C9904t tVar : arrayList2) {
            if (tVar.f24000e == 4) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public boolean hideBottomBar() {
        int i;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        C8846j jVar = this.mGiftsMap.get(i);
        if (jVar != null) {
            return jVar.f21728b.f21754i;
        }
        return false;
    }

    private GiftManager() {
        ((IHostApp) C6193a.m13435a(IHostApp.class)).initImageLib();
        loadLocal();
        try {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).initGiftResourceManager(C3966y.m9669e());
        } catch (Exception unused) {
        }
        this.mAssetsManager = C9462a.C9465b.f23010a;
    }

    /* renamed from: com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo */
    public static boolean m19249xa45e786f(Context context) {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void syncGiftList(int i) {
        syncGiftList(null, 0, i, false);
    }

    /* renamed from: com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1 */
    public static boolean m19250xdb8fe567(Context context) {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = m19249xa45e786f(context);
        C58029j.f132256h = com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
        return com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends C9904t> collection) {
        Iterator<? extends C9904t> it = collection.iterator();
        while (it.hasNext()) {
            if (!((C9904t) it.next()).f24008m) {
                it.remove();
            }
        }
    }

    private C6805b<String> getPropertyByLiveType(int i) {
        return new C6805b<>("gift_list_response_".concat(String.valueOf(i)), "");
    }

    public void clearFastGift(long j) {
        this.mRoomFastGiftIdMap.remove(Long.valueOf(j));
        this.mRoomFastGiftIdMap.remove(0L);
    }

    public static void filterFirstAndCallbackGifts(Collection<? extends C9904t> collection) {
        long i = C8729d.f21542u.mo15013i();
        Iterator<? extends C9904t> it = collection.iterator();
        while (it.hasNext()) {
            C9904t tVar = (C9904t) it.next();
            if (tVar.f23999d == i || tVar.f23999d == 0) {
                it.remove();
            }
        }
    }

    public C9904t findGiftById(long j) {
        int i;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        C0489d<C9904t> dVar = this.mGiftsMapByFind.get(i);
        if (dVar == null) {
            return null;
        }
        return dVar.mo2078a(j, null);
    }

    public C9904t getFastGift(long j) {
        Long l;
        if (this.mRoomFastGiftIdMap.containsKey(Long.valueOf(j))) {
            l = this.mRoomFastGiftIdMap.get(Long.valueOf(j));
        } else {
            l = this.mRoomFastGiftIdMap.get(0L);
        }
        if (l != null) {
            return findGiftById(l.longValue());
        }
        return null;
    }

    public C8843h getGiftIconInfo(long j) {
        if (this.mRoomGiftInfoMap.containsKey(Long.valueOf(j))) {
            return this.mRoomGiftInfoMap.get(Long.valueOf(j));
        }
        return this.mRoomGiftInfoMap.get(0L);
    }

    public int getTabByGiftId(long j) {
        for (GiftPage giftPage : this.mGiftsMap.get(0).f21729c) {
            Iterator<C9904t> it = giftPage.gifts.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f23999d == j) {
                        return giftPage.pageType;
                    }
                }
            }
        }
        return -1;
    }

    public int getTabLocation(int i) {
        int i2 = 0;
        C8846j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f21729c == null)) {
            for (GiftPage giftPage : jVar.f21729c) {
                i2++;
                if (giftPage.pageType == C8374a.C8375a.C8376a.f20718a.f20716j) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public String getTabName(int i) {
        C8846j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f21729c == null)) {
            for (GiftPage giftPage : jVar.f21729c) {
                if (giftPage.pageType == i) {
                    return giftPage.pageName;
                }
            }
        }
        return "Gift";
    }

    public String getTabNameByIndex(int i) {
        C8846j jVar = this.mGiftsMap.get(0);
        if (jVar == null || jVar.f21729c == null || i >= jVar.f21729c.size()) {
            return "Gift";
        }
        return jVar.f21729c.get(i).pageName;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$5$GiftManager(Map map) {
        if (!(map == null || map.isEmpty())) {
            for (Integer num : map.keySet()) {
                C8846j jVar = (C8846j) map.get(num);
                if (jVar != null) {
                    addGiftMap(jVar, num.intValue());
                }
            }
            updateGiftsInfo(this.mGiftsMap.get(0), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC88984x lambda$syncGiftList$1$GiftManager(C5830b bVar) {
        if (bVar == null) {
            return AbstractC88979t.m154302a(new Exception("response is empty"));
        }
        if (bVar.data == null) {
            return AbstractC88979t.m154302a(new Exception("response.data is empty"));
        }
        if (bVar.extra != null) {
            C10639c.f25642b = ((C10699c) bVar.extra).f25758a;
        }
        return AbstractC88979t.m154294a(new C10688h(this, bVar));
    }

    public int getGiftPosition(long j) {
        C8846j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f21729c == null)) {
            for (GiftPage giftPage : jVar.f21729c) {
                if (giftPage.pageType == C8374a.C8375a.C8376a.f20718a.f20716j) {
                    int i = 0;
                    for (C9904t tVar : giftPage.gifts) {
                        i++;
                        if (tVar.f23999d == j) {
                            return i;
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    public EnumC8850n getGiftType(C9904t tVar) {
        if (tVar == null) {
            return EnumC8850n.UNKNOWN;
        }
        if (tVar.f24000e == 10) {
            return EnumC8850n.GOLDEN_BEAN_CELL;
        }
        if (tVar.f24000e == 9) {
            return EnumC8850n.FREE_CELL;
        }
        if (tVar.f24000e == 1) {
            return EnumC8850n.NORMAL_GIFT;
        }
        if (tVar.f24000e == 5) {
            return EnumC8850n.TASK_GIFT;
        }
        if (tVar.f24000e == 4) {
            return EnumC8850n.STICKER_GIFT;
        }
        if (tVar.f24000e == 8) {
            return EnumC8850n.MIDDLE_GIFT;
        }
        if (tVar.f24000e == 2) {
            return EnumC8850n.SPECIAL_GIFT;
        }
        if (tVar.f24000e == 11) {
            return EnumC8850n.GAME;
        }
        return EnumC8850n.UNKNOWN;
    }

    public boolean isDynamicGift(long j) {
        C8846j jVar = this.mGiftsMap.get(0);
        if (jVar != null && jVar.f21729c != null) {
            Iterator<GiftPage> it = jVar.f21729c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterator<C9904t> it2 = it.next().gifts.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C9904t next = it2.next();
                        if (next.f23999d == j) {
                            ImageModel imageModel = next.f24011p;
                            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$4$GiftManager(AbstractC88933j jVar) {
        HashMap hashMap = new HashMap(4);
        for (String str : AbstractC6804a.f16951b.mo13066a()) {
            int intValue = Integer.valueOf(str).intValue();
            String a = getPropertyByLiveType(intValue).mo13066a();
            if (!C13627m.m24498a(a)) {
                hashMap.put(Integer.valueOf(intValue), this.gson.mo46670a(a, C8846j.class));
            }
        }
        jVar.mo143031a(hashMap);
        jVar.mo143023a();
    }

    public static void filterInteractNotSupportGift(Collection<? extends C9904t> collection, boolean z) {
        filterNotSupportGift(collection, z);
        Iterator<? extends C9904t> it = collection.iterator();
        while (it.hasNext()) {
            if (!((C9904t) it.next()).f24004i) {
                it.remove();
            }
        }
    }

    private void updateGiftsInfo(C8846j jVar, long j) {
        if (jVar != null) {
            C8852p pVar = jVar.f21728b;
            if (pVar == null) {
                C6779a.m14563a().mo13053a(C7390i.C7391a.m15283a());
                return;
            }
            notifyFastGiftModule(j, pVar.f21746a);
            notifyGiftIconModule(j, pVar.f21755j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$null$0$GiftManager(C5830b bVar, AbstractC88982v vVar) {
        vVar.mo143031a(new C0692e(bVar.data, this.gson.mo46674b(bVar.data)));
    }

    private void notifyFastGiftModule(long j, long j2) {
        this.mRoomFastGiftIdMap.put(Long.valueOf(j), Long.valueOf(j2));
        this.mRoomFastGiftIdMap.put(0L, Long.valueOf(j2));
        C6779a.m14563a().mo13053a(new C7388g(j, j2));
    }

    private void addGiftMap(C8846j jVar, int i) {
        List<GiftPage> list;
        if (jVar != null) {
            this.mGiftsMap.put(i, jVar);
            C0489d<C9904t> dVar = this.mGiftsMapByFind.get(i);
            if (dVar != null) {
                dVar.mo2086c();
            } else {
                dVar = new C0489d<>();
                this.mGiftsMapByFind.append(i, dVar);
            }
            ArrayList<C9904t> arrayList = new ArrayList();
            if (!C13617h.m24465a(jVar.f21729c) && (list = jVar.f21729c) != null) {
                for (GiftPage giftPage : list) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
            for (C9904t tVar : arrayList) {
                dVar.mo2087c(tVar.f23999d, tVar);
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends C9904t> collection, boolean z) {
        Iterator<? extends C9904t> it = collection.iterator();
        while (it.hasNext()) {
            C9904t tVar = (C9904t) it.next();
            if (tVar.f23999d == 998) {
                it.remove();
            } else if ((tVar.f24000e == 2 || tVar.f24000e == 8 || tVar.f24000e == 11) && !C9462a.m17765b(tVar.f24009n)) {
                it.remove();
            } else if (tVar.f24000e == 4 && z && !C9462a.m17765b(tVar.f24009n)) {
                it.remove();
            }
        }
    }

    public void notifyGiftIconModule(long j, C8843h hVar) {
        this.mRoomGiftInfoMap.put(Long.valueOf(j), hVar);
        this.mRoomGiftInfoMap.put(0L, hVar);
        if (hVar == null) {
            C6779a.m14563a().mo13053a(C7390i.C7391a.m15283a());
        } else if (hVar.f21717c >= System.currentTimeMillis() / 1000 || hVar.f21718d <= System.currentTimeMillis() / 1000) {
            this.mRoomGiftInfoMap.remove(Long.valueOf(j));
            this.mRoomGiftInfoMap.remove(0L);
            C6779a.m14563a().mo13053a(C7390i.C7391a.m15283a());
        } else {
            C6779a.m14563a().mo13053a(new C7390i(j, hVar));
        }
    }

    static final /* synthetic */ void lambda$syncGiftList$3$GiftManager(boolean z, WeakReference weakReference, Throwable th) {
        Exception exc = new Exception(th);
        exc.printStackTrace();
        C3854a.m9453a(6, "GIFT_MANAGER", "syncgiftlist error! " + exc.getMessage());
        if (z) {
            String message = exc.getMessage();
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", message);
            C3868c.m9489a(C6542d.m13984a("ttlive_gift_list_status"), 1, 0, hashMap);
            C3868c.m9491a(C6542d.m13985b("ttlive_gift_list_status"), 1, hashMap);
            C6499a.m13906a();
            C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_gift_list_status", hashMap);
        }
        if (weakReference.get() != null) {
            weakReference.get();
        }
    }

    public void syncGiftList(AbstractC8807b bVar, long j, int i, boolean z) {
        boolean z2;
        if (m19250xdb8fe567(C3966y.m9669e())) {
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
                this.mAssetsManager.mo15074a(i, z, Long.valueOf(j));
            }
            WeakReference weakReference = new WeakReference(bVar);
            if (j != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((GiftRetrofitApi) C5805e.m12718a().mo11572a(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j), i).mo143267a((AbstractC88434g<? super C5830b<C8846j, C10699c>, ? extends AbstractC88984x<? extends R>>) new C10682b(this), false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C10683c(this, i, z, j, bVar, SystemClock.uptimeMillis(), z2), new C10684d(z2, weakReference));
        }
    }

    private void onSyncGiftListSuccess(C8846j jVar, String str, boolean z, long j, AbstractC8807b bVar) {
        int i;
        if (jVar != null) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                i = room.getOrientation();
            } else {
                i = 0;
            }
            addGiftMap(jVar, i);
            List<GiftPage> list = jVar.f21729c;
            C6806c.m14603a(getPropertyByLiveType(i), str);
            Set<String> a = AbstractC6804a.f16951b.mo13066a();
            a.add(String.valueOf(i));
            C6806c.m14603a(AbstractC6804a.f16951b, a);
            updateGiftsInfo(jVar, j);
            if (bVar != null) {
                bVar.mo8520b(list);
            }
        } else if (bVar != null) {
            bVar.mo8519a(new ArrayList());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$syncGiftList$2$GiftManager(int i, boolean z, long j, AbstractC8807b bVar, long j2, boolean z2, C0692e eVar) {
        long j3;
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
            this.mAssetsManager.mo15074a(i, z, Long.valueOf(j));
        }
        this.mHideBottomBar.setValue(Boolean.valueOf(eVar.f2750a.f21728b.f21754i));
        C8852p pVar = eVar.f2750a.f21728b;
        C8729d dVar = C8729d.f21542u;
        dVar.f21547d = pVar;
        C8852p pVar2 = dVar.f21547d;
        if (pVar2 != null) {
            C8857u uVar = pVar2.f21747b;
            if (uVar != null) {
                j3 = uVar.f21777c;
            } else {
                j3 = 0;
            }
            dVar.f21548e = j3;
            if (0 > dVar.f21548e) {
                dVar.f21548e = 0;
            }
        }
        dVar.f21549f = dVar.mo15010e();
        onSyncGiftListSuccess(eVar.f2750a, eVar.f2751b, z, j, bVar);
        long uptimeMillis = SystemClock.uptimeMillis() - j2;
        if (z2) {
            C3868c.m9488a(C6542d.m13984a("ttlive_gift_list_status"), 0, uptimeMillis);
        }
    }
}
