package com.p2082ss.android.ugc.aweme.out;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.external.C47166i;
import com.p2082ss.android.ugc.aweme.mediachoose.C59156b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.services.IInternalAVService;
import com.p2082ss.android.ugc.aweme.services.ISDKService;
import com.p2082ss.android.ugc.aweme.services.SDKServiceImpl;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.filter.IFilterService;
import com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p2082ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70681h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.aweme.utils.C80583iq;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.IFetchModelListener;

/* renamed from: com.ss.android.ugc.aweme.out.AVServiceImpl */
public class AVServiceImpl implements IInternalAVService {

    /* renamed from: a */
    private IDraftService f142228a;

    /* renamed from: b */
    private IFilterService f142229b = new C47166i();

    /* renamed from: c */
    private ISDKService f142230c;

    /* renamed from: d */
    private IVideoCoverService f142231d;

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IFilterService getFilterService() {
        return this.f142229b;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public String shortVideoDir() {
        return C70637di.f158101d;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public void tryCopyDuetDefaultLayout() {
        C70681h.m124908a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IAVSettingsService avSettingsService() {
        return AVSettingsServiceImpl.getInstance();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IEffectService effectService() {
        return EffectService.getInstance();
    }

    static {
        Covode.recordClassIndex(73568);
        C80583iq.m139715b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IDraftService draftService() {
        if (this.f142228a == null) {
            this.f142228a = new C78397c();
        }
        return this.f142228a;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public ISDKService getSDKService() {
        if (this.f142230c == null) {
            this.f142230c = new SDKServiceImpl();
        }
        return this.f142230c;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IVideoCoverService videoCoverService() {
        if (this.f142231d == null) {
            this.f142231d = new VideoCoverServiceImpl();
        }
        return this.f142231d;
    }

    /* renamed from: a */
    public static IInternalAVService m113116a() {
        MethodCollector.m26663i(6065);
        Object a = C81908b.m141854a(IInternalAVService.class, false);
        if (a != null) {
            IInternalAVService iInternalAVService = (IInternalAVService) a;
            MethodCollector.m26664o(6065);
            return iInternalAVService;
        }
        if (C81908b.f183275cY == null) {
            synchronized (IInternalAVService.class) {
                try {
                    if (C81908b.f183275cY == null) {
                        C81908b.f183275cY = new AVServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6065);
                    throw th;
                }
            }
        }
        AVServiceImpl aVServiceImpl = (AVServiceImpl) C81908b.f183275cY;
        MethodCollector.m26664o(6065);
        return aVServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public VideoExposureData convertToExposureData(Object obj) {
        return VideoPublishEditModel.asExposureData(obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        return new C59156b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IInternalAVService
    public boolean isPublishing(Context context) {
        return C67296h.m119245e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public void loadLibrary(String str, Application application) {
        Librarian.m38963a(str, application);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public void fetchResourcesNeededByRequirements(String[] strArr, final IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        C63238c.m114594d();
        DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(strArr, new IFetchModelListener() {
            /* class com.p2082ss.android.ugc.aweme.out.AVServiceImpl.C627471 */

            static {
                Covode.recordClassIndex(73569);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.IFetchModelListener
            public final void onFailed(Exception exc) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = iFetchResourcesListener;
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onFailed(exc);
                }
            }

            @Override // com.p2082ss.android.ugc.effectmanager.IFetchModelListener
            public final void onSuccess(String[] strArr) {
                IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = iFetchResourcesListener;
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onSuccess(strArr);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService
    public void setLastStickerId(Context context, String str, int i) {
        C80209ad.m139034a(context, str, i);
    }
}
