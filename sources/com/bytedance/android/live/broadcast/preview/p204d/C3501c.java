package com.bytedance.android.live.broadcast.preview.p204d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.d.c */
public final class C3501c {

    /* renamed from: a */
    public static final C3501c f9793a = new C3501c();

    private C3501c() {
    }

    static {
        Covode.recordClassIndex(3985);
    }

    /* renamed from: a */
    public static String m8911a() {
        C5809h a = C5809h.m12739a();
        C89219l.m154716b(a, "");
        Map<String, String> b = a.mo11588b();
        if (b == null) {
            b = C89041ag.m154415a();
        }
        String str = b.get("fake_region");
        String str2 = b.get("carrier_region");
        String str3 = b.get("sys_region");
        String str4 = b.get("app_language");
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            } else if (TextUtils.isEmpty(str3)) {
                str = str4;
            } else {
                str = str3;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else if (str == null) {
            C89219l.m154715b();
        }
        Locale locale = Locale.US;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String upperCase = str.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        return upperCase;
    }

    /* renamed from: a */
    public static void m8912a(Context context, String str, String str2, boolean z) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C29844g gVar = new C29844g(str);
        gVar.mo52130a("previous_page", str2);
        if (z) {
            str3 = "popup";
        } else {
            str3 = "page";
        }
        gVar.mo52130a("container_type", str3);
        gVar.mo52130a("priority_region", m8911a());
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, Uri.parse(gVar.mo52126a()));
    }
}
