package com.bytedance.android.livesdk.function;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.util.LongSparseArray;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.livesetting.other.LiveSdkWarningTagDelayEndDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSdkWarningTagDelayStartDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableAnchorLiveLongPressShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableLiveLongPressShareSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdk.watch.chatroom.C11324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.function.m */
public class C8768m implements AbstractC4318a, HandlerC11626a.AbstractC11627a, OnMessageListener {
    public final int MSG_WHAT_FETCH_ROOM = 2;
    private final LongSparseArray<DataChannel> mDataChannels = new LongSparseArray<>();
    private final AbstractC89244h mHandler$delegate = C11831d.m20835a(new C8770b(this));
    private final LongSparseArray<ArrayList<AbstractC4318a.AbstractC4319a>> mOnUserCountVisibilityChangeListeners = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(9645);
    }

    public final HandlerC11626a getMHandler() {
        return (HandlerC11626a) this.mHandler$delegate.getValue();
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget() {
        return LiveRoomNotifyWidget.class;
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public Class<? extends LiveRecyclableWidget> getStreamInfoWidget() {
        return StreamInfoWidget.class;
    }

    /* renamed from: com.bytedance.android.livesdk.function.m$b */
    static final class C8770b extends AbstractC89220m implements AbstractC89171a<HandlerC11626a> {

        /* renamed from: a */
        final /* synthetic */ C8768m f21629a;

        static {
            Covode.recordClassIndex(9647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8770b(C8768m mVar) {
            super(0);
            this.f21629a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC11626a invoke() {
            return new HandlerC11626a(this.f21629a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.function.m$a */
    static final class RunnableC8769a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8768m f21626a;

        /* renamed from: b */
        final /* synthetic */ boolean f21627b;

        /* renamed from: c */
        final /* synthetic */ long f21628c;

        static {
            Covode.recordClassIndex(9646);
        }

        RunnableC8769a(C8768m mVar, boolean z, long j) {
            this.f21626a = mVar;
            this.f21627b = z;
            this.f21628c = j;
        }

        public final void run() {
            C7307f.f18161a.mo13557a(this.f21626a.getMHandler(), this.f21627b, this.f21628c, this.f21626a.MSG_WHAT_FETCH_ROOM);
        }
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public boolean shouldShowUserCount(Room room) {
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || roomAuthStatus.getUserCountDisplayState() != 2) {
            return true;
        }
        return false;
    }

    private final void handleMaskLayer(Room room) {
        if (room != null) {
            if (room.maskLayer == null) {
                ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).showMaskLayer(room.getId(), false);
            } else {
                ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).showMaskLayer(room.getId(), true);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public void handleMsg(Message message) {
        Object obj;
        Object obj2 = null;
        if (message != null) {
            obj = message.obj;
        } else {
            obj = null;
        }
        if (obj instanceof Room) {
            if (message != null) {
                obj2 = message.obj;
            }
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            if (Room.isValid((Room) obj2)) {
                Object obj3 = message.obj;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                handleWarningTag((Room) obj3);
                Object obj4 = message.obj;
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                handleMaskLayer((Room) obj4);
            }
        }
    }

    private final void handleWarningTag(Room room) {
        C9871g currentBottomMessage;
        int i;
        if (room != null) {
            AbstractC5880e eVar = (AbstractC5880e) C6193a.m13435a(AbstractC5880e.class);
            if (room.warningTag != null && room.warningTag.text != null) {
                if (room.warningTag.tagSource == 1) {
                    i = 4;
                } else {
                    i = 3;
                }
                if (eVar != null) {
                    long id = room.getId();
                    C9698b bVar = room.warningTag.text;
                    Long l = room.warningTag.duration;
                    C89219l.m154716b(l, "");
                    eVar.insertBottomMessage(id, "", bVar, l.longValue(), 1, 0, i);
                }
            } else if (eVar != null && (currentBottomMessage = eVar.getCurrentBottomMessage(room.getId())) != null) {
                if (currentBottomMessage.f23849i == 3 || currentBottomMessage.f23849i == 4) {
                    eVar.hideWarningMessage(room.getId());
                }
            }
        }
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
            if (bzVar.f23626a == 32) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setUserCountDisplayState(1);
                }
                ArrayList<AbstractC4318a.AbstractC4319a> arrayList = this.mOnUserCountVisibilityChangeListeners.get(j);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().mo10009a(shouldShowUserCount(room));
                    }
                }
            } else if (bzVar.f23626a == 33) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setUserCountDisplayState(2);
                }
                ArrayList<AbstractC4318a.AbstractC4319a> arrayList2 = this.mOnUserCountVisibilityChangeListeners.get(j);
                if (arrayList2 != null) {
                    Iterator<T> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo10009a(shouldShowUserCount(room));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void addOnUserCountVisibilityChangeListener(long j, AbstractC4318a.AbstractC4319a aVar) {
        C89219l.m154721d(aVar, "");
        ArrayList<AbstractC4318a.AbstractC4319a> arrayList = this.mOnUserCountVisibilityChangeListeners.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mOnUserCountVisibilityChangeListeners.put(j, arrayList);
        }
        arrayList.add(aVar);
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void enter(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) != null) {
            iMessageManager.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void leave(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.remove(room.getId());
            this.mOnUserCountVisibilityChangeListeners.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) != null) {
            iMessageManager.removeMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
    }

    private final void logOnLongPress(boolean z, Room room, C11666c cVar) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = cVar.f27836z;
        C89219l.m154716b(str2, "");
        String str3 = cVar.f27794A;
        String str4 = cVar.f27795B;
        C89219l.m154716b(str4, "");
        C11324b.m20079a(linkedHashMap, room, str2, str3, str4);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        C6501b.C6502a.m13948a("click_trans_layer").mo12639a().mo12652a((Map<String, String>) linkedHashMap).mo12655b();
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public void likeMicStateChange(long j, int i, boolean z) {
        double value = LiveSdkWarningTagDelayStartDurationSetting.INSTANCE.getValue();
        if (i == 1) {
            value = LiveSdkWarningTagDelayEndDurationSetting.INSTANCE.getValue();
        }
        getMHandler().postDelayed(new RunnableC8769a(this, z, j), (long) (value * 1000.0d));
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a
    public DialogInterface onLongPress(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar) {
        ActivityC0945e a;
        C89219l.m154721d(context, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        if (!((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).shareable(room)) {
            if (!z) {
                DialogInterface openLongPressDialog = ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).openLongPressDialog(iHostLongPressCallback, context, room, cVar.f27836z, cVar.f27794A, cVar.f27807N);
                logOnLongPress(z, room, cVar);
                return openLongPressDialog;
            }
        } else if (z) {
            if (EnableAnchorLiveLongPressShareSetting.INSTANCE.getValue() == 0 || (a = C11279p.m20001a(context)) == null) {
                return null;
            }
            Dialog c = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share().mo11991c(a, cVar, bVar);
            if (c != null) {
                c.show();
            }
            logOnLongPress(z, room, cVar);
            return c;
        } else if (EnableLiveLongPressShareSetting.INSTANCE.getValue() == 1) {
            ActivityC0945e a2 = C11279p.m20001a(context);
            if (a2 == null) {
                return null;
            }
            Dialog c2 = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share().mo11991c(a2, cVar, bVar);
            if (c2 != null) {
                c2.show();
            }
            logOnLongPress(z, room, cVar);
            return c2;
        } else {
            DialogInterface openLongPressDialog2 = ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).openLongPressDialog(iHostLongPressCallback, context, room, cVar.f27836z, cVar.f27794A, cVar.f27807N);
            logOnLongPress(z, room, cVar);
            return openLongPressDialog2;
        }
        return null;
    }
}
