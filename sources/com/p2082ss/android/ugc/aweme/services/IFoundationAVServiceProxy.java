package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63173ag;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63188an;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63214bc;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63225bj;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63227bk;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63256o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63259q;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63260r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63261s;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63267x;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63268y;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.services.appcontext.IAVAppContextManager;

/* renamed from: com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy */
public interface IFoundationAVServiceProxy {
    static {
        Covode.recordClassIndex(79629);
    }

    AbstractC63256o getABService();

    IAVAppContextManager getAVAppContextManager();

    AbstractC63269z getAccountService();

    AbstractC63259q getApplicationService();

    AbstractC63260r getBridgeService();

    AbstractC63173ag getChallengeService();

    AbstractC63261s getCommerceService();

    AbstractC63214bc getIStickerPropService();

    AbstractC63188an getLocalHashTagService();

    AbstractC63196au getNetworkService();

    AbstractC63267x getRegionService();

    AbstractC63268y getShortVideoPluginService();

    AbstractC63225bj getUiService();

    AbstractC63227bk unlockStickerService();
}
