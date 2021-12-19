package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89269g;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.f */
public final class C71209f {

    /* renamed from: a */
    private static int f159566a = BuildConfig.VERSION_CODE;

    static {
        Covode.recordClassIndex(83719);
    }

    /* renamed from: a */
    private static Context m125826a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static final void m125828b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            KeyboardUtils.m145809b(editText, m125826a(application));
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: a */
    public static final int m125825a(EditText editText) {
        if (editText == null) {
            return 0;
        }
        int a = C71812ep.m126783a((double) f159566a, C63247i.f143610a);
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            C89219l.m154716b(text, "");
            if (C89361p.m154923c(text, " ")) {
                obj = C89361p.m154898a(editText.getText().toString(), new C89269g(0, editText.getText().toString().length() - 2)) + "-";
            }
            return new StaticLayout(obj, editText.getPaint(), a, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m125827a(EditText editText, int i, int i2) {
        if (editText != null) {
            int i3 = Build.VERSION.SDK_INT;
            editText.setPaddingRelative(i, 0, i2, 0);
        }
    }
}
