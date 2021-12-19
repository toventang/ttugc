package com.p2082ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.b */
public final class C40188b {

    /* renamed from: a */
    public static final C40188b f94361a = new C40188b();

    private C40188b() {
    }

    static {
        Covode.recordClassIndex(47983);
    }

    /* renamed from: a */
    public static final ContentLangDialogContent m81300a() {
        try {
            ContentLangDialogContent contentLangDialogContent = (ContentLangDialogContent) SettingsManager.m29616a().mo25396a("content_lang_dialog", ContentLangDialogContent.class);
            if (contentLangDialogContent != null) {
                return contentLangDialogContent;
            }
            String string = C17867d.m33078a().getString(R.string.ato);
            C89219l.m154716b(string, "");
            String string2 = C17867d.m33078a().getString(R.string.atn);
            C89219l.m154716b(string2, "");
            return new ContentLangDialogContent(string, string2);
        } catch (Throwable unused) {
        }
    }
}
