package com.bytedance.android.livesdk.liveroom;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.livesdk.C6561ab;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.p457at.C6883a;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public class RoomStatusController implements ISubController {
    private static final long ROOM_REFRESH_TIME = ((long) (LiveFeedRefreshTimeSetting.INSTANCE.getValue() * 1000));
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    public AbstractC11768h mListProvider;
    private final Runnable mRefreshRoomStatsTimer = new Runnable() {
        /* class com.bytedance.android.livesdk.liveroom.RoomStatusController.RunnableC93121 */

        static {
            Covode.recordClassIndex(10245);
        }

        public final void run() {
            int currentItem;
            if (RoomStatusController.this.mListProvider != null) {
                ArrayList arrayList = new ArrayList(100);
                ArrayList arrayList2 = new ArrayList(RoomStatusController.this.mListProvider.mo14902b());
                if (!C13617h.m24465a(arrayList2)) {
                    try {
                        if (RoomStatusController.this.mListProvider.mo14898a() > 0 && (currentItem = RoomStatusController.this.mViewPager.getCurrentItem() % RoomStatusController.this.mListProvider.mo14898a()) >= 0) {
                            if (currentItem < arrayList2.size()) {
                                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                    } catch (Throwable unused) {
                    }
                }
                RoomStatusController.this.mRoomStatsViewModel.mo15396a(arrayList);
            }
        }
    };
    public RoomStatsViewModel mRoomStatsViewModel;
    LiveVerticalViewPager mViewPager;

    static final /* synthetic */ void lambda$refreshRoomStats$2$RoomStatusController(Throwable th) {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        resetRefreshTimer();
    }

    private void resetRefreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
    }

    public void refreshTimer() {
        resetRefreshTimer();
        this.mHandler.postDelayed(this.mRefreshRoomStatsTimer, ROOM_REFRESH_TIME);
    }

    static {
        Covode.recordClassIndex(10244);
    }

    public void setListProvider(AbstractC11768h hVar) {
        this.mListProvider = hVar;
    }

    public void setViewPager(LiveVerticalViewPager liveVerticalViewPager) {
        this.mViewPager = liveVerticalViewPager;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$refreshRoomStats$1$RoomStatusController(Room room) {
        this.mListProvider.mo14901a(room.getId());
    }

    public RoomStatusController(C6561ab abVar) {
        RoomStatsViewModel roomStatsViewModel = (RoomStatsViewModel) C1181ae.m3879a(abVar, new C6883a()).mo3983a(RoomStatsViewModel.class);
        this.mRoomStatsViewModel = roomStatsViewModel;
        roomStatsViewModel.f22730a.observe(abVar, new C9315a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: refreshRoomStats */
    public void bridge$lambda$0$RoomStatusController(Map<String, C9304c> map) {
        AbstractC11768h hVar = this.mListProvider;
        if (hVar != null && hVar.mo14902b() != null) {
            AbstractC88979t.m154309b((Iterable) new ArrayList(this.mListProvider.mo14902b())).mo143268a(new C9316b(map)).mo143254a(new C9317c(this), C9318d.f22754a);
            refreshTimer();
        }
    }

    static final /* synthetic */ boolean lambda$refreshRoomStats$0$RoomStatusController(Map map, Room room) {
        String valueOf = String.valueOf(room.getId());
        if (!map.containsKey(valueOf) || ((C9304c) map.get(valueOf)).f22742b) {
            return false;
        }
        return true;
    }
}
