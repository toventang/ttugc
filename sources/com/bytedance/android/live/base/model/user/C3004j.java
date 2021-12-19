package com.bytedance.android.live.base.model.user;

import com.appsflyer.BuildConfig;
import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.android.livesdk.model.C9546bc;
import com.bytedance.android.livesdk.model.C9547bd;
import com.bytedance.android.livesdk.model.C9548be;
import com.bytedance.android.livesdk.model.C9549bf;
import com.bytedance.android.livesdk.model.C9550bg;
import com.bytedance.android.livesdk.model.C9553bj;
import com.bytedance.android.livesdk.model.C9556bm;
import com.bytedance.android.livesdk.model.C9581ck;
import com.bytedance.android.livesdk.model.C9582cl;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.user.j */
public final class C3004j implements AbstractC2724b<User> {
    static {
        Covode.recordClassIndex(3466);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ User mo7304a(C2730f fVar) {
        return m8316b(fVar);
    }

    /* renamed from: b */
    public static User m8316b(C2730f fVar) {
        User user = new User();
        user.topFans = new ArrayList();
        user.userBadges = new ArrayList();
        user.commerceWebcastConfigIds = new ArrayList();
        user.borders = new ArrayList();
        user.badgeImageList = new ArrayList();
        user.mediaBadgeImageList = new ArrayList();
        user.newUserBadges = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return user;
            } else if (b == 1) {
                user.f8809id = C2731g.m7902b(fVar);
            } else if (b != 3) {
                if (b != 5) {
                    if (b == 52) {
                        user.personalCard = C2977f.m8301b(fVar);
                    } else if (b == 53) {
                        user.authenticationInfo = C9549bf.m17853b(fVar);
                    } else if (b == 1012) {
                        user.avatarJpg = C2977f.m8301b(fVar);
                    } else if (b == 1013) {
                        user.backgroundImgUrl = fVar.mo7312d();
                    } else if (b == 1023) {
                        user.foldStrangerChat = Boolean.valueOf(C2731g.m7901a(fVar));
                    } else if (b != 1024) {
                        switch (b) {
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                break;
                            case 21:
                                user.badgeImageList.add(C2977f.m8301b(fVar));
                                break;
                            case 22:
                                user.followInfo = C2999e.m8306b(fVar);
                                break;
                            case 23:
                                user.userHonor = C9582cl.m17915b(fVar);
                                break;
                            case 24:
                                user.fansClub = C9556bm.m17867b(fVar);
                                break;
                            case 25:
                                user.border = C9553bj.m17861b(fVar);
                                break;
                            case 26:
                                user.specialId = fVar.mo7312d();
                                break;
                            case 27:
                                user.avatarBorder = C2977f.m8301b(fVar);
                                break;
                            case 28:
                                user.medal = C2977f.m8301b(fVar);
                                break;
                            case 29:
                                user.userBadges.add(C2977f.m8301b(fVar));
                                break;
                            case 30:
                                user.newUserBadges.add(C2977f.m8301b(fVar));
                                break;
                            case 31:
                                user.topVipNo = (int) C2731g.m7902b(fVar);
                                break;
                            case 32:
                                user.userAttr = C9581ck.m17913b(fVar);
                                break;
                            case 33:
                                user.ownRoom = C3003i.m8314b(fVar);
                                break;
                            case 34:
                                user.payScore = Long.valueOf(C2731g.m7902b(fVar));
                                break;
                            case 35:
                                user.fanTicketCount = C2731g.m7902b(fVar);
                                break;
                            case 36:
                                user.anchorInfo = C9547bd.m17849b(fVar);
                                break;
                            case 37:
                                user.linkMicStats = fVar.mo7313e();
                                break;
                            case 38:
                                user.displayId = fVar.mo7312d();
                                break;
                            case 39:
                                user.enableShowCommerceSale = C2731g.m7901a(fVar);
                                break;
                            case 40:
                                user.withFusionShopEntry = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 41:
                                user.payScores = C2731g.m7902b(fVar);
                                break;
                            case 42:
                                user.anchorLevel = C9548be.m17851b(fVar);
                                break;
                            case 43:
                                user.verifiedContent = fVar.mo7312d();
                                break;
                            case BuildConfig.VERSION_CODE:
                                user.authorInfo = C9550bg.m17855b(fVar);
                                break;
                            case 45:
                                user.topFans.add(m8316b(fVar));
                                break;
                            case 46:
                                user.secUid = fVar.mo7312d();
                                break;
                            case 47:
                                user.userRole = fVar.mo7313e();
                                break;
                            case 49:
                                user.rewardInfo = C9546bc.m17847b(fVar);
                                break;
                            case 57:
                                user.mediaBadgeImageList.add(C2977f.m8301b(fVar));
                                break;
                            case 1033:
                                user.pushCommentStatus = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1034:
                                user.pushDigg = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1035:
                                user.pushFollow = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1036:
                                user.pushFriendAction = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1037:
                                user.pushIchat = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1038:
                                user.pushStatus = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1039:
                                user.pushVideoPost = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1040:
                                user.pushVideoRecommend = Boolean.valueOf(C2731g.m7901a(fVar));
                                break;
                            case 1043:
                                user.verifiedReason = fVar.mo7312d();
                                break;
                            case 1044:
                                user.enableCarManagementPermission = C2731g.m7901a(fVar);
                                break;
                            default:
                                switch (b) {
                                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                        user.avatarThumb = C2977f.m8301b(fVar);
                                        continue;
                                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                        user.avatarMedium = C2977f.m8301b(fVar);
                                        continue;
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                        user.avatarLarge = C2977f.m8301b(fVar);
                                        continue;
                                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                        user.isVerified = C2731g.m7901a(fVar);
                                        continue;
                                    default:
                                        switch (b) {
                                            case 15:
                                                user.status = fVar.mo7313e();
                                                continue;
                                            case 16:
                                                user.createTime = C2731g.m7902b(fVar);
                                                continue;
                                            case 17:
                                                user.modifyTime = C2731g.m7902b(fVar);
                                                continue;
                                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                                user.secret = fVar.mo7313e();
                                                continue;
                                            case 19:
                                                user.shareQrcodeUri = fVar.mo7312d();
                                                continue;
                                            default:
                                                switch (b) {
                                                    case AudiencePingIntervalSetting.DEFAULT /*{ENCODED_INT: 60}*/:
                                                        user.commerceWebcastConfigIds.add(Long.valueOf(C2731g.m7902b(fVar)));
                                                        continue;
                                                    case 61:
                                                        user.borders.add(C9553bj.m17861b(fVar));
                                                        continue;
                                                    case 62:
                                                        user.comboBadgeInfo = C3002h.m8312b(fVar);
                                                        continue;
                                                    case 63:
                                                        user.subscribeInfo = C3001g.m8310b(fVar);
                                                        continue;
                                                    default:
                                                        switch (b) {
                                                            case 1002:
                                                                user.allowFindByContacts = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1003:
                                                                user.allowOthersDownloadVideo = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1004:
                                                                user.allowOthersDownloadWhenSharingVideo = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1005:
                                                                user.allowShareShowProfile = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1006:
                                                                user.allowShowInGossip = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1007:
                                                                user.allowShowMyAction = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1008:
                                                                user.allowStrangeComment = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1009:
                                                                user.allowUnfollowerComment = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            case 1010:
                                                                user.allowUseLinkmic = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                continue;
                                                            default:
                                                                switch (b) {
                                                                    case 1016:
                                                                        user.blockStatus = Integer.valueOf(fVar.mo7313e());
                                                                        continue;
                                                                    case 1017:
                                                                        user.commentRestrict = Integer.valueOf(fVar.mo7313e());
                                                                        continue;
                                                                    case 1018:
                                                                        user.constellation = fVar.mo7312d();
                                                                        continue;
                                                                    case 1019:
                                                                        user.disableIchat = Integer.valueOf(fVar.mo7313e());
                                                                        continue;
                                                                    case 1020:
                                                                        user.enableIchatImg = Long.valueOf(C2731g.m7902b(fVar));
                                                                        continue;
                                                                    case 1021:
                                                                        user.exp = Integer.valueOf(fVar.mo7313e());
                                                                        continue;
                                                                    default:
                                                                        switch (b) {
                                                                            case 1027:
                                                                                user.ichatRestrictType = Integer.valueOf(fVar.mo7313e());
                                                                                continue;
                                                                            case 1028:
                                                                                user.idStr = fVar.mo7312d();
                                                                                continue;
                                                                            case 1029:
                                                                                user.isFollower = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                                continue;
                                                                            case 1030:
                                                                                user.isFollowing = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                                continue;
                                                                            case 1031:
                                                                                user.needProfileGuide = Boolean.valueOf(C2731g.m7901a(fVar));
                                                                                continue;
                                                                            default:
                                                                                C2731g.m7903c(fVar);
                                                                                continue;
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
                        }
                    } else {
                        user.followStatus = Long.valueOf(C2731g.m7902b(fVar));
                    }
                }
                user.signature = fVar.mo7312d();
            } else {
                user.nickName = fVar.mo7312d();
            }
        }
    }
}
