package com.p2082ss.android.ugc.aweme.commercialize.tasks;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.e */
public final class C38518e {

    /* renamed from: a */
    public static final C38518e f91024a = new C38518e();

    private C38518e() {
    }

    static {
        Covode.recordClassIndex(46044);
    }

    /* renamed from: a */
    public static boolean m78109a(String str) {
        C89219l.m154721d(str, "");
        if (!C13627m.m24498a(str)) {
            String lowerCase = str.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            if (C89361p.m154874b(lowerCase, "http://", false)) {
                return true;
            }
            String lowerCase2 = str.toLowerCase();
            C89219l.m154716b(lowerCase2, "");
            if (C89361p.m154874b(lowerCase2, "https://", false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C18148g m78108a(Context context, Intent intent) {
        if (context == null) {
            return new C18148g(false, "context is null");
        }
        if (intent == null) {
            return new C18148g(false, "intent is null");
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return new C18148g(true);
        } catch (SecurityException e) {
            C51423a.m95784a(3, null, "ad start activity failed");
            C51423a.m95790a((Throwable) e);
            return new C18148g(false, "ad start activity failed");
        } catch (ActivityNotFoundException e2) {
            C51423a.m95784a(3, null, "ad start activity failed");
            C51423a.m95790a((Throwable) e2);
            return new C18148g(false, "ad start activity failed");
        }
    }
}
