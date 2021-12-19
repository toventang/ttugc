package com.p2082ss.android.ugc.aweme.share.improve.p3758c;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import java.io.File;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.b */
public final class C69124b {
    static {
        Covode.recordClassIndex(81438);
    }

    /* renamed from: a */
    public static final String m122224a(String str) {
        if (str == null || C89361p.m154874b(str, "http://", false) || C89361p.m154874b(str, "https://", false)) {
            return str;
        }
        return "https://".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public static final boolean m122227b(Context context) {
        C89219l.m154721d(context, "");
        if (C0643b.m2367a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final Activity m122223a(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (contextThemeWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextThemeWrapper.getBaseContext();
                Objects.requireNonNull(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return C17873f.m33102j();
    }

    /* renamed from: b */
    public static final String m122226b(String str) {
        if (str == null || str.length() == 0 || C89361p.m154908a((CharSequence) str, (CharSequence) "timestamp=", false)) {
            return str;
        }
        C14758h hVar = new C14758h(str);
        hVar.mo23778a("timestamp", System.currentTimeMillis() / 1000);
        return hVar.mo23776a();
    }

    /* renamed from: a */
    public static final boolean m122225a(File file) {
        if (file.exists() && file.length() <= 104857600) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final String m122228c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            return str;
        }
        C14758h hVar = new C14758h(str);
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        hVar.mo23779a("user_id", g2.getCurUserId());
        IAccountUserService g3 = C31575b.m65865g();
        C89219l.m154716b(g3, "");
        hVar.mo23779a("sec_user_id", g3.getCurSecUserId());
        return hVar.mo23776a();
    }
}
