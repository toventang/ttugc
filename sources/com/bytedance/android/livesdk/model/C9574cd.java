package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.cd */
public final class C9574cd implements AbstractC2724b<RoomAuthStatus> {
    static {
        Covode.recordClassIndex(11113);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RoomAuthStatus mo7304a(C2730f fVar) {
        return m17900b(fVar);
    }

    /* renamed from: b */
    public static RoomAuthStatus m17900b(C2730f fVar) {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return roomAuthStatus;
            } else if (b == 1) {
                roomAuthStatus.enableChat = C2731g.m7901a(fVar);
            } else if (b == 2) {
                roomAuthStatus.enableDanmaku = C2731g.m7901a(fVar);
            } else if (b == 3) {
                roomAuthStatus.enableGift = C2731g.m7901a(fVar);
            } else if (b == 4) {
                roomAuthStatus.enableLuckMoney = C2731g.m7901a(fVar);
            } else if (b == 5) {
                roomAuthStatus.enableDigg = C2731g.m7901a(fVar);
            } else if (b == 7) {
                roomAuthStatus.enableRoomContributor = C2731g.m7901a(fVar);
            } else if (b == 8) {
                roomAuthStatus.enableProps = C2731g.m7901a(fVar);
            } else if (b == 12) {
                roomAuthStatus.bannerState = (int) fVar.mo7314f();
            } else if (b == 15) {
                roomAuthStatus.landscape = (int) fVar.mo7314f();
            } else if (b == 20) {
                roomAuthStatus.donationSticker = (int) fVar.mo7314f();
            } else if (b == 100) {
                roomAuthStatus.roomAuthOffReasons = C9573cc.m17898b(fVar);
            } else if (b == 17) {
                roomAuthStatus.messageType = (int) fVar.mo7314f();
            } else if (b == 18) {
                roomAuthStatus.anchorGiftType = (int) fVar.mo7314f();
            } else if (b == 34) {
                roomAuthStatus.chatSubOnly = C2731g.m7901a(fVar);
            } else if (b != 35) {
                switch (b) {
                    case 25:
                        roomAuthStatus.enableQuestion = C2731g.m7901a(fVar);
                        continue;
                    case 26:
                        roomAuthStatus.enableChatL2 = C2731g.m7901a(fVar);
                        continue;
                    case 27:
                        roomAuthStatus.enableViewers = C2731g.m7901a(fVar);
                        continue;
                    case 28:
                        roomAuthStatus.enableShare = C2731g.m7901a(fVar);
                        continue;
                    case 29:
                        roomAuthStatus.rankingsSwitchStatus = fVar.mo7313e();
                        continue;
                    case 30:
                        roomAuthStatus.enablePromote = C2731g.m7901a(fVar);
                        continue;
                    case 31:
                        roomAuthStatus.userCountDisplayState = (int) fVar.mo7314f();
                        continue;
                    case 32:
                        roomAuthStatus.rankState = (int) fVar.mo7314f();
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                roomAuthStatus.anchorRedEnvelopeType = (int) fVar.mo7314f();
            }
        }
    }
}
