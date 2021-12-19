package com.p2082ss.android.ugc.aweme.publish.p3610a.p3611a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.publish.p3619f.AbstractC65609a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;

/* renamed from: com.ss.android.ugc.aweme.publish.a.a.b */
public final class C65507b {
    static {
        Covode.recordClassIndex(76994);
    }

    /* renamed from: a */
    public static boolean m117236a(int i) {
        return i == 2;
    }

    /* renamed from: a */
    public static AVUploadSaveModel m117235a(AVUploadSaveModel aVUploadSaveModel, int i, boolean z, AbstractC65609a aVar) {
        boolean z2;
        boolean z3;
        if (!C65357b.m117053i()) {
            return null;
        }
        if (aVUploadSaveModel == null) {
            aVUploadSaveModel = new AVUploadSaveModel();
        }
        if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
            aVUploadSaveModel.setLocalTempPath(C70638dj.f158108k + C70638dj.m124844b(".mp4"));
        }
        boolean z4 = false;
        aVUploadSaveModel.setWaterMark(!SettingsManager.m29616a().mo25400a("forbid_local_watermark", false));
        if (z) {
            if (i == 0 && !aVar.mo104614a() && (!aVar.mo104615b() || C65687t.m117580b() <= 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            aVUploadSaveModel.setSaveLocal(z3);
        } else {
            if (i == 0 && C65687t.m117580b() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            aVUploadSaveModel.setSaveLocal(z2);
        }
        aVUploadSaveModel.setSaveType(i);
        if ((aVar.mo104615b() || C71907a.m126982a()) && C65687t.m117580b() == 2) {
            z4 = true;
        }
        aVUploadSaveModel.setSaveWithCaption(z4);
        return aVUploadSaveModel;
    }
}
