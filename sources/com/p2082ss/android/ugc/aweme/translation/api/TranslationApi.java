package com.p2082ss.android.ugc.aweme.translation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi */
public final class TranslationApi {

    /* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(92204);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/contents/translation/")
        @AbstractC89721e
        AbstractFutureC27655q<C79027a> getMultiTranslation(@AbstractC89719c(mo144273a = "trg_lang") String str, @AbstractC89719c(mo144273a = "translation_info") String str2, @AbstractC89736t(mo144292a = "scene") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/content/translation/")
        AbstractFutureC27655q<C79030c> getTranslation(@AbstractC89736t(mo144292a = "content") String str, @AbstractC89736t(mo144292a = "src_lang") String str2, @AbstractC89736t(mo144292a = "trg_lang") String str3, @AbstractC89736t(mo144292a = "group_id") String str4, @AbstractC89736t(mo144292a = "scene") int i);
    }

    static {
        Covode.recordClassIndex(92203);
    }

    /* renamed from: a */
    private static RealApi m137862a() {
        return (RealApi) C18097a.m33698a(C29736b.f70924e, RealApi.class);
    }

    /* renamed from: a */
    public static AbstractFutureC27655q<C79027a> m137860a(String str, String str2, int i) {
        return m137862a().getMultiTranslation(str, str2, i);
    }

    /* renamed from: a */
    public static C79030c m137861a(String str, String str2, String str3, String str4, int i) {
        try {
            return m137862a().getTranslation(str, str2, str3, str4, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
