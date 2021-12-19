package com.p2082ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.property.C65341ak;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72181bo;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72183bq;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72195br;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72233m;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.AbstractC72273b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3860b.C72846a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75925b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C76021e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78884b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78896c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4136b.C78924a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory */
public class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    static {
        Covode.recordClassIndex(82123);
    }

    /* renamed from: a */
    public static IMediaChosenResultProcessFactory m123154a() {
        MethodCollector.m26663i(4217);
        Object a = C81908b.m141854a(IMediaChosenResultProcessFactory.class, false);
        if (a != null) {
            IMediaChosenResultProcessFactory iMediaChosenResultProcessFactory = (IMediaChosenResultProcessFactory) a;
            MethodCollector.m26664o(4217);
            return iMediaChosenResultProcessFactory;
        }
        if (C81908b.f183328dY == null) {
            synchronized (IMediaChosenResultProcessFactory.class) {
                try {
                    if (C81908b.f183328dY == null) {
                        C81908b.f183328dY = new MediaChosenResultProcessFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4217);
                    throw th;
                }
            }
        }
        MediaChosenResultProcessFactory mediaChosenResultProcessFactory = (MediaChosenResultProcessFactory) C81908b.f183328dY;
        MethodCollector.m26664o(4217);
        return mediaChosenResultProcessFactory;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    /* renamed from: a */
    public final AbstractC72273b mo109977a(Activity activity) {
        return new C78924a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory
    /* renamed from: a */
    public final AbstractC72263v mo109976a(ActivityC0945e eVar, int i, long j, long j2) {
        if (i == 1) {
            return new C78884b(eVar);
        }
        if (i != 2) {
            if (i != 7) {
                if (i == 8) {
                    return new C75925b(eVar);
                }
                switch (i) {
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return new C78896c(eVar);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        return new C72183bq(eVar, j, j2);
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        break;
                    default:
                        switch (i) {
                            case 15:
                                return new C72846a(eVar);
                            case 16:
                                return new C72181bo(eVar);
                            case 17:
                                break;
                            default:
                                return new C78884b(eVar);
                        }
                }
            }
            return new C76021e(eVar);
        }
        if (C65341ak.m117027a()) {
            return new C72233m(eVar, j, j2);
        }
        return new C72195br(eVar, j, j2);
    }
}
