package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80256bn;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.g */
final /* synthetic */ class C68587g implements AbstractC88983w {

    /* renamed from: a */
    private final I18nSettingNewVersionActivity f153456a;

    static {
        Covode.recordClassIndex(80843);
    }

    C68587g(I18nSettingNewVersionActivity i18nSettingNewVersionActivity) {
        this.f153456a = i18nSettingNewVersionActivity;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        String str;
        try {
            File[] fileArr = new File[4];
            fileArr[0] = this.f153456a.getCacheDir();
            fileArr[1] = C80720e.m139914a();
            fileArr[2] = new File(AVExternalServiceImpl.m113114a().configService().cacheConfig().stickerDir());
            File file = new File(I18nSettingNewVersionActivity.m120916a(C17867d.m33078a()).getAbsolutePath() + "/aweme_monitor");
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            str = C80256bn.m139105b(fileArr);
        } catch (Exception unused) {
            str = "0.0MB";
        }
        vVar.mo143031a(str);
        vVar.mo143023a();
    }
}
