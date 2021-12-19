package com.bytedance.android.livesdk.microom;

import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p253j.C4370c;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.livesdk.microom.a */
public class C9507a implements AbstractC4367a {
    static {
        Covode.recordClassIndex(11021);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget() {
        return MicRoomAnchorTimeControlWidget.class;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget() {
        return MicRoomAudienceEnterWidget.class;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget() {
        return MicRoomAudienceExitWidget.class;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget() {
        return MicRoomBackUpTipsWidget.class;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForAnchorNow() {
        return isMicRoomForAnchor((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class));
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForCurrentRoom() {
        return isMicRoomForAudience((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class));
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicAudience() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoom() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return false;
        }
        try {
            if (room.getOwner() != null) {
                long ownerUserId = room.getOwnerUserId();
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                if (b == null || ownerUserId != b.mo13161c()) {
                    return isMicRoomForAudience(room);
                }
                return isMicRoomForAnchor(room);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicRoomForRoom(Room room) {
        return isMicRoomForAudience(room);
    }

    private final boolean isMicRoomForAudience(Room room) {
        if (room == null || room.roomLayout != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public boolean isMicAudienceForRoom(Room room) {
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r10 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r10.roomLayout != 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isMicRoomForAnchor(com.bytedance.android.livesdkapi.depend.model.live.Room r10) {
        /*
            r9 = this;
            long r7 = com.bytedance.android.livesdk.utils.p653a.C11200a.m19851a()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r0
            r6 = 1
            r5 = 0
            if (r10 == 0) goto L_0x002b
            com.bytedance.android.livesdk.model.ap r2 = r10.officialChannelInfo
            if (r2 == 0) goto L_0x001a
            long r3 = r2.f23138c
            r0 = 10
            long r3 = r3 - r0
            long r1 = r2.f23139d
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
        L_0x001a:
            r2 = 0
            if (r10 == 0) goto L_0x0022
        L_0x001d:
            int r1 = r10.roomLayout
            r0 = 2
            if (r1 == r0) goto L_0x0024
        L_0x0022:
            if (r2 == 0) goto L_0x002b
        L_0x0024:
            return r6
        L_0x0025:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r2 = 1
            goto L_0x001d
        L_0x002b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.C9507a.isMicRoomForAnchor(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    @Override // com.bytedance.android.live.p253j.AbstractC4367a
    public void jumpRoom(long j, boolean z) {
        C6779a.m14563a().mo13053a(new C4370c(j, z));
    }
}
