package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.ttep.C79202ac;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.e */
public final class C73771e {
    static {
        Covode.recordClassIndex(86510);
    }

    /* renamed from: a */
    public static final String[] m129820a(Intent intent) {
        C89219l.m154721d(intent, "");
        boolean a = C46981gn.m90261a();
        boolean a2 = C79202ac.m138055a(intent);
        if (a || a2) {
            return new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        }
        return new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}
