package com.bytedance.android.livesdkapi.p691g;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.g.a */
public final class C11760a {
    static {
        Covode.recordClassIndex(13450);
    }

    /* renamed from: a */
    private static void m20719a(EnterRoomConfig enterRoomConfig, Room room) {
        if (room != null && room.getRoomAuthStatus() != null && room.getOwner() != null && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            enterRoomConfig.f28233c.f28310a = C4139e.C4140a.f11575b.mo46674b(room);
        }
    }

    /* renamed from: b */
    public static EnterRoomConfig m20720b(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null) {
            enterRoomConfig.f28233c.f28301R = room.getId();
            enterRoomConfig.f28233c.f28302S = room.getStreamType();
            enterRoomConfig.f28231a.f28375b = room.buildPullUrl();
            enterRoomConfig.f28231a.f28376c = room.getSdkParams();
            enterRoomConfig.f28231a.f28377d = room.getMultiStreamData();
            enterRoomConfig.f28231a.f28379f = room.getMultiStreamDefaultQualitySdkKey();
            C11738s.C11739a aVar = room.getStreamUrlExtraSafely().f28106n;
            if (aVar != null) {
                enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                enterRoomConfig.f28231a.f28382i = aVar.f28116c;
            }
            enterRoomConfig.f28231a.f28383j = room.getStreamType().ordinal();
            enterRoomConfig.f28232b.f28258b = String.valueOf(room.getOwnerUserId());
        }
        return enterRoomConfig;
    }

    /* renamed from: a */
    public static EnterRoomConfig m20717a(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null) {
            enterRoomConfig.f28233c.f28301R = room.getId();
            enterRoomConfig.f28233c.f28302S = room.getStreamType();
            ArrayList<String> arrayList = null;
            if (room.getCover() != null && !C13617h.m24465a(room.getCover().getUrls())) {
                arrayList = new ArrayList<>(room.getCover().getUrls());
            } else if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null || C13617h.m24465a(room.getOwner().getAvatarThumb().getUrls()))) {
                arrayList = new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
            }
            enterRoomConfig.f28233c.f28369y = arrayList;
            enterRoomConfig.f28232b.f28257a = room.getRequestId();
            enterRoomConfig.f28232b.f28263g = room.getLog_pb();
            enterRoomConfig.f28233c.f28323ad = room.getSourceType();
            if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
                enterRoomConfig.f28232b.f28267k = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getUserFrom();
            }
            enterRoomConfig.f28233c.f28370z = room.getLabels();
            enterRoomConfig.f28231a.f28375b = room.buildPullUrl();
            enterRoomConfig.f28231a.f28376c = room.getSdkParams();
            enterRoomConfig.f28231a.f28377d = room.getMultiStreamData();
            enterRoomConfig.f28231a.f28379f = room.getMultiStreamDefaultQualitySdkKey();
            C11738s.C11739a aVar = room.getStreamUrlExtraSafely().f28106n;
            if (aVar != null) {
                enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                enterRoomConfig.f28231a.f28382i = aVar.f28116c;
            }
            enterRoomConfig.f28231a.f28383j = room.getStreamType().ordinal();
            enterRoomConfig.f28232b.f28258b = String.valueOf(room.getOwnerUserId());
        }
        return enterRoomConfig;
    }

    /* renamed from: a */
    public static EnterRoomConfig m20718a(Room room, boolean z) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (room != null) {
            enterRoomConfig.f28233c.f28301R = room.getId();
            enterRoomConfig.f28233c.f28302S = room.getStreamType();
            ArrayList<String> arrayList = null;
            if (room.getCover() != null && !C13617h.m24465a(room.getCover().getUrls())) {
                arrayList = new ArrayList<>(room.getCover().getUrls());
            } else if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null || C13617h.m24465a(room.getOwner().getAvatarThumb().getUrls()))) {
                arrayList = new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
            }
            enterRoomConfig.f28233c.f28369y = arrayList;
            enterRoomConfig.f28232b.f28257a = room.getRequestId();
            enterRoomConfig.f28232b.f28263g = room.getLog_pb();
            enterRoomConfig.f28233c.f28323ad = room.getSourceType();
            if (DataChannelGlobal.f42558d.mo28324b(C9009ac.class) != null) {
                enterRoomConfig.f28232b.f28267k = ((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getUserFrom();
            }
            enterRoomConfig.f28233c.f28370z = room.getLabels();
            enterRoomConfig.f28231a.f28375b = room.buildPullUrl();
            enterRoomConfig.f28231a.f28376c = room.getSdkParams();
            enterRoomConfig.f28231a.f28377d = room.getMultiStreamData();
            enterRoomConfig.f28231a.f28379f = room.getMultiStreamDefaultQualitySdkKey();
            C11738s.C11739a aVar = room.getStreamUrlExtraSafely().f28106n;
            if (aVar != null) {
                enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                enterRoomConfig.f28231a.f28382i = aVar.f28116c;
            }
            enterRoomConfig.f28231a.f28383j = room.getStreamType().ordinal();
            enterRoomConfig.f28232b.f28258b = String.valueOf(room.getOwnerUserId());
            if (z) {
                m20719a(enterRoomConfig, room);
            }
        }
        return enterRoomConfig;
    }
}
