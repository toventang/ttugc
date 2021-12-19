package com.p2082ss.android.ugc.aweme.editSticker.compile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.editSticker.compile.c */
public abstract class AbstractC45860c {
    static {
        Covode.recordClassIndex(54384);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo77213a(String str, int i);

    /* renamed from: a */
    private static boolean m88483a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* renamed from: a */
    public final C1731i<C45859b> mo77212a(View view, View view2, String str, int i, int i2, int i3, int i4) {
        if (view == null || view2 == null || TextUtils.isEmpty(str)) {
            return C1731i.m5632a((Exception) new NullPointerException("stickerView = " + view + ", stickerLayout = " + view2 + "draftDir = " + str));
        }
        return m88484b(view, view2, str, i, i2, i3, i4);
    }

    /* renamed from: b */
    private C1731i<C45859b> m88484b(View view, View view2, String str, int i, int i2, int i3, int i4) {
        String a = mo77213a(str, ((ViewGroup) view2).indexOfChild(view));
        File file = new File(a);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C84902i.m145899c(a);
                } else {
                    m88483a(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C84902i.m145883a(a, true);
        return C1731i.m5640b(new CallableC45861d(this, i, i2, view2, view, i3, i4), C1731i.f5564c).mo5543c(new C45862e(a, view), C1731i.f5562a);
    }
}
