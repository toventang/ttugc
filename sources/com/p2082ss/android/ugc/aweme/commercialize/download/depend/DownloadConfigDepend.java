package com.p2082ss.android.ugc.aweme.commercialize.download.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2325a.C33731a;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2325a.C33733c;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend */
public final class DownloadConfigDepend implements IDownloadConfigDepend {
    static {
        Covode.recordClassIndex(45131);
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final boolean needAutoRefreshUnSuccessTask() {
        return C33731a.f79895a;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final AbstractC30463j getTTNetDownloadHttpService() {
        return new C33733c();
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        C89219l.m154716b(deviceId, "");
        return deviceId;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getSettingString() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> downloadSdkConfig = inst.getDownloadSdkConfig();
        C89219l.m154716b(downloadSdkConfig, "");
        String c = downloadSdkConfig.mo59941c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadConfigDepend
    public final String getUserId() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        return curUserId;
    }
}
