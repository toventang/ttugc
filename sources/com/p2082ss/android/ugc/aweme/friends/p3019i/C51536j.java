package com.p2082ss.android.ugc.aweme.friends.p3019i;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.friends.p3014d.C51486a;
import com.p2082ss.android.ugc.aweme.p2315ao.C33517b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.j */
public final class C51536j {

    /* renamed from: a */
    public static final C51536j f118776a = new C51536j();

    private C51536j() {
    }

    static {
        Covode.recordClassIndex(60801);
    }

    /* renamed from: a */
    private static void m96012a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m96011a(Context context, int i) {
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            new C23144b(eVar).mo37640e(i).mo37637b();
        }
    }

    /* renamed from: b */
    private static Intent m96015b(Context context, String str, String str2) {
        int i = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(str))));
        intent.putExtra("sms_body", str2);
        intent.setPackage(Telephony.Sms.getDefaultSmsPackage(context));
        return intent;
    }

    /* renamed from: a */
    public static final boolean m96014a(Context context, String str, String str2, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (str.length() > 0 && str2.length() > 0) {
            Intent b = m96015b(context, str, str2);
            if (C33517b.m68681a(context, b)) {
                m96012a(context, b);
                C51486a.m95902a(str);
                return true;
            }
        }
        m96011a(context, i);
        return false;
    }
}
