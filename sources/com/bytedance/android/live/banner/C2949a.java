package com.bytedance.android.live.banner;

import android.util.LongSparseArray;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.banner.AbstractC2951c;
import com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.banner.a */
public class C2949a implements AbstractC2951c, OnMessageListener {
    private final LongSparseArray<DataChannel> mDataChannels = new LongSparseArray<>();
    private final LongSparseArray<ArrayList<AbstractC2951c.AbstractC2952a>> mOnBannerVisibilityChangeListeners = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(3390);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget() {
        return ActivityTopRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget() {
        return BottomRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return TopRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public boolean shouldShowBanner(long j) {
        Room room;
        DataChannel dataChannel = this.mDataChannels.get(j);
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        return shouldShowBanner(room);
    }

    public boolean shouldShowBanner(Room room) {
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || roomAuthStatus.getBannerState() != 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        IMessage iMessage2;
        C11778b bVar;
        long j;
        DataChannel dataChannel;
        Room room;
        if (!(iMessage instanceof AbstractC6571a)) {
            iMessage2 = null;
        } else {
            iMessage2 = iMessage;
        }
        AbstractC6571a aVar = (AbstractC6571a) iMessage2;
        if (aVar != null && (bVar = aVar.f28134O) != null && (dataChannel = this.mDataChannels.get((j = bVar.f28137c))) != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null && (iMessage instanceof C9694bz)) {
            C9694bz bzVar = (C9694bz) iMessage;
            if (bzVar.f23626a == 25) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setBannerState(1);
                }
                ArrayList<AbstractC2951c.AbstractC2952a> arrayList = this.mOnBannerVisibilityChangeListeners.get(j);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        shouldShowBanner(room);
                        it.next().mo7729a();
                    }
                }
            } else if (bzVar.f23626a == 24) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setBannerState(2);
                }
                ArrayList<AbstractC2951c.AbstractC2952a> arrayList2 = this.mOnBannerVisibilityChangeListeners.get(j);
                if (arrayList2 != null) {
                    Iterator<T> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        shouldShowBanner(room);
                        it2.next().mo7729a();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void addOnBannerVisibilityChangeListener(long j, AbstractC2951c.AbstractC2952a aVar) {
        C89219l.m154721d(aVar, "");
        ArrayList<AbstractC2951c.AbstractC2952a> arrayList = this.mOnBannerVisibilityChangeListeners.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mOnBannerVisibilityChangeListeners.put(j, arrayList);
        }
        arrayList.add(aVar);
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void enter(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) != null) {
            iMessageManager.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void leave(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.remove(room.getId());
            this.mOnBannerVisibilityChangeListeners.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) != null) {
            iMessageManager.removeMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.AbstractC2951c
    public void fetchBanner(AbstractC1204m mVar, long j, boolean z) {
        AbstractC1196i lifecycle;
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.f8689e;
        InRoomBannerManager.f8685a = mVar;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4012a(inRoomBannerManager);
        }
        InRoomBannerManager.f8686b = j;
        InRoomBannerManager.f8687c = z;
        InRoomBannerManager.m8278a(InRoomBannerManager.f8686b, InRoomBannerManager.f8687c);
    }
}
