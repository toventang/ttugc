package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63169ac;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63171ae;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63172af;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63189ao;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63193as;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63197av;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63201ay;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63211ba;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63215bd;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63218be;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63219bf;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63224bi;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63230bn;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63232bp;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63255n;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63262t;
import com.p2082ss.android.ugc.aweme.port.p3561in.IHashTagService;
import com.p2082ss.android.ugc.aweme.port.p3561in.ISchedulerService;
import com.p2082ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* renamed from: com.ss.android.ugc.aweme.services.IAVServiceProxy */
public interface IAVServiceProxy extends IFoundationAVServiceProxy {
    static {
        Covode.recordClassIndex(79618);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63255n getABService();

    AbstractC63262t getAVConverter();

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63167ab getApplicationService();

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63169ac getBridgeService();

    AbstractC63170ad getBusiStickerService();

    AbstractC63171ae getBusinessGoodsService();

    AbstractC63172af getCaptureService();

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63175ai getCommerceService();

    AbstractC63178ak getDmtChallengeService();

    IHashTagService getHashTagService();

    AbstractC63186am getLiveService();

    AbstractC63189ao getMiniAppService();

    AbstractC63193as getMusicService();

    IToolsProfileService getProfileService();

    AbstractC63199ax getPublishService();

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63201ay getRegionService();

    ISchedulerService getSchedulerService();

    AbstractC63211ba getShareService();

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVServiceProxy
    AbstractC63212bb getShortVideoPluginService();

    AbstractC63202az getSpService();

    AbstractC63215bd getStickerShareService();

    AbstractC63218be getStoryService();

    AbstractC63219bf getSummonFriendService();

    AbstractC63220bg getSyncShareService();

    AbstractC63224bi getToolsComponentService();

    AbstractC63230bn getVideoCacheService();

    AbstractC63232bp getWikiService();

    IConnectionEntranceService getXsEntranceService();

    AbstractC63197av openSDKService();

    ISuperEntrancePrivacyService superEntrancePrivacyService();
}
