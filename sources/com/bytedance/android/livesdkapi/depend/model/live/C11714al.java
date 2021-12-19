package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.C9567bx;
import com.bytedance.android.livesdk.model.C9568by;
import com.bytedance.android.livesdk.model.C9569bz;
import com.bytedance.android.livesdk.model.C9571ca;
import com.bytedance.android.livesdk.model.C9572cb;
import com.bytedance.android.livesdk.model.C9574cd;
import com.bytedance.android.livesdk.model.C9575ce;
import com.bytedance.android.livesdk.model.C9576cf;
import com.bytedance.android.livesdk.model.C9577cg;
import com.bytedance.android.livesdk.model.C9579ci;
import com.bytedance.android.livesdk.model.C9583cm;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.al */
public final class C11714al implements AbstractC2724b<Room> {
    static {
        Covode.recordClassIndex(13402);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ Room mo7304a(C2730f fVar) {
        return m20674b(fVar);
    }

    /* renamed from: b */
    public static Room m20674b(C2730f fVar) {
        Room room = new Room();
        room.decorationList = new ArrayList();
        room.feedRoomLabelList = new ArrayList();
        room.stickerList = new ArrayList();
        room.topFanTickets = new ArrayList();
        room.shortTouchItems = new ArrayList();
        room.filterRule = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                room.init();
                return room;
            } else if (b == 1) {
                room.f27942id = C2731g.m7902b(fVar);
            } else if (b == 2) {
                room.idStr = fVar.mo7312d();
            } else if (b == 3) {
                room.status = (int) C2731g.m7902b(fVar);
            } else if (b == 4) {
                room.ownerUserId = C2731g.m7902b(fVar);
            } else if (b == 5) {
                room.title = fVar.mo7312d();
            } else if (b != 6) {
                if (b != 7) {
                    if (b == 28) {
                        room.streamUrl = C11717ao.m20680b(fVar);
                    } else if (b == 29) {
                        room.mosaicStatus = (int) C2731g.m7902b(fVar);
                    } else if (b == 42) {
                        room.feedRoomLabel = C2977f.m8301b(fVar);
                    } else if (b == 43) {
                        room.labels = fVar.mo7312d();
                    } else if (b == 83) {
                        room.background = C2977f.m8301b(fVar);
                    } else if (b == 84) {
                        room.layout = C2731g.m7902b(fVar);
                    } else if (b == 90) {
                        room.unusedEffect = C2731g.m7901a(fVar);
                    } else if (b != 91) {
                        switch (b) {
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                room.finishTime = C2731g.m7902b(fVar);
                                break;
                            case 32:
                                room.linkMicInfoGson = C11711ai.m20670b(fVar);
                                break;
                            case 46:
                                room.owner = C3004j.m8316b(fVar);
                                break;
                            case 48:
                                room.hasCommerceGoods = C2731g.m7901a(fVar);
                                break;
                            case 72:
                                room.mRoomAuthStatus = C9574cd.m17900b(fVar);
                                break;
                            case 93:
                                room.finish_url = fVar.mo7312d();
                                break;
                            case 101:
                                room.roomLayout = (int) C2731g.m7902b(fVar);
                                break;
                            case 111:
                                room.likeCount = C2731g.m7902b(fVar);
                                break;
                            case 120:
                                room.anchorTabType = (long) fVar.mo7313e();
                                break;
                            case 122:
                                room.officialChannelInfo = C9572cb.m17896b(fVar);
                                break;
                            case 139:
                                room.mNameMode = (int) C2731g.m7902b(fVar);
                                break;
                            case 145:
                                room.commerceStruct = C11743w.m20701b(fVar);
                                break;
                            case 147:
                                room.streamCover = C2977f.m8301b(fVar);
                                break;
                            case 149:
                                room.questionVersion = fVar.mo7313e();
                                break;
                            case 155:
                                room.answeringQuestion = fVar.mo7312d();
                                break;
                            case 157:
                                room.warningTag = C9583cm.m17917b(fVar);
                                break;
                            case 158:
                                room.maskLayer = C9571ca.m17894b(fVar);
                                break;
                            case 159:
                                room.liveRoomMode = fVar.mo7313e();
                                break;
                            case 163:
                                room.finishUrlLynx = fVar.mo7312d();
                                break;
                            case 165:
                                room.likeInfo = C9568by.m17890b(fVar);
                                break;
                            case 166:
                                room.shortTouchItems.add(C9577cg.m17906b(fVar));
                                break;
                            case 167:
                                room.filterRule.add(C11707ae.m20664b(fVar));
                                break;
                            case 168:
                                room.stickerList.add(C9575ce.m17902b(fVar));
                                break;
                            case 169:
                                room.mBoostCardRoomStatus = C11708af.m20666b(fVar);
                                break;
                            case 170:
                                room.feedRoomLabelList.add(C11745y.m20704b(fVar));
                                break;
                            case 172:
                                room.haveWishList = C2731g.m7901a(fVar);
                                break;
                            default:
                                switch (b) {
                                    case 16:
                                        room.platform = (int) C2731g.m7902b(fVar);
                                        continue;
                                    case 17:
                                        room.clientVersion = String.valueOf(C2731g.m7902b(fVar));
                                        continue;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                                        room.withLinkMic = C2731g.m7901a(fVar);
                                        continue;
                                    default:
                                        switch (b) {
                                            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                                room.cover = C2977f.m8301b(fVar);
                                                continue;
                                            case 21:
                                                room.dynamicCover = C2977f.m8301b(fVar);
                                                continue;
                                            case 22:
                                                room.dynamicCoverLow = C2977f.m8301b(fVar);
                                                continue;
                                            case 23:
                                                room.shareUrl = fVar.mo7312d();
                                                continue;
                                            case 24:
                                                room.anchorShareText = fVar.mo7312d();
                                                continue;
                                            case 25:
                                                room.userShareText = fVar.mo7312d();
                                                continue;
                                            case 26:
                                                room.streamId = C2731g.m7902b(fVar);
                                                continue;
                                            default:
                                                switch (b) {
                                                    case 34:
                                                        room.decorationList.add(C9575ce.m17902b(fVar));
                                                        continue;
                                                    case 35:
                                                        room.topFanTickets.add(C9579ci.m17910b(fVar));
                                                        continue;
                                                    case 36:
                                                        room.stats = C9576cf.m17904b(fVar);
                                                        continue;
                                                    default:
                                                        switch (b) {
                                                            case 51:
                                                                room.liveTypeAudio = C2731g.m7901a(fVar);
                                                                continue;
                                                            case 52:
                                                                room.isThirdParty = C2731g.m7901a(fVar);
                                                                continue;
                                                            case 53:
                                                                room.isScreenshot = C2731g.m7901a(fVar);
                                                                continue;
                                                            default:
                                                                switch (b) {
                                                                    case 151:
                                                                        room.liveEventInfo = C9569bz.m17892b(fVar);
                                                                        continue;
                                                                    case 152:
                                                                        room.hashtag = C9567bx.m17888b(fVar);
                                                                        continue;
                                                                    case 153:
                                                                        room.baLinkStruct = C11740t.m20697b(fVar);
                                                                        continue;
                                                                    default:
                                                                        C2731g.m7903c(fVar);
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                        continue;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        room.giftMessageStyle = (int) C2731g.m7902b(fVar);
                    }
                }
                room.createTime = C2731g.m7902b(fVar);
            } else {
                room.userCount = (int) C2731g.m7902b(fVar);
            }
        }
    }
}
