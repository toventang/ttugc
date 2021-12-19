package com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.a.a */
public final class C46459a {
    static {
        Covode.recordClassIndex(55042);
    }

    /* renamed from: a */
    private static final String m89687a() {
        Locale b = m89691b();
        if (b == null) {
            return "";
        }
        String language = b.getLanguage();
        C89219l.m154716b(language, "");
        return language;
    }

    /* renamed from: b */
    private static final Locale m89691b() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C17867d.m33078a().getResources().getConfiguration().getLocales().get(0);
        }
        return C17867d.m33078a().getResources().getConfiguration().locale;
    }

    /* renamed from: c */
    public static final boolean m89692c(C46534a aVar) {
        C89219l.m154721d(aVar, "");
        return m89689a(aVar.getAnimateType());
    }

    /* renamed from: d */
    public static final boolean m89693d(C46534a aVar) {
        C89219l.m154721d(aVar, "");
        return m89689a(aVar.getStaticType());
    }

    /* renamed from: a */
    public static final String m89688a(C46534a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.getDisplayNameLangs() != null) {
            return aVar.getDisplayNameLangs().get(Locale.ENGLISH.getLanguage());
        }
        return "";
    }

    /* renamed from: b */
    public static final String m89690b(C46534a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.getStickerType() == 2) {
            return "";
        }
        if (TextUtils.equals(Locale.ENGLISH.getLanguage(), m89687a())) {
            String a = m89688a(aVar);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
        } else if (TextUtils.isEmpty(aVar.getDisplayName())) {
            return m89688a(aVar);
        }
        return aVar.getDisplayName();
    }

    /* renamed from: a */
    private static final boolean m89689a(String str) {
        if (!(str == null || str.length() == 0)) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            if (!C89219l.m154714a((Object) lowerCase, (Object) "gif")) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = str.toLowerCase();
                C89219l.m154716b(lowerCase2, "");
                if (C89219l.m154714a((Object) lowerCase2, (Object) "webp")) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
