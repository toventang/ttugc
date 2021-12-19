package com.p2082ss.android.ugc.trill.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import java.util.HashSet;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl */
public final class TranslatedCaptionCacheServiceImpl implements ITranslatedCaptionService {
    static {
        Covode.recordClassIndex(99145);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: d */
    public final boolean mo108893d() {
        return C85126c.m146389a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: b */
    public final boolean mo108890b() {
        return C85145i.f190498a.getBoolean("hide_caption", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: c */
    public final String mo108891c() {
        String string = C85145i.f190498a.getString("show_original_caption_video_id", "");
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: e */
    public final boolean mo108895e() {
        if (!C85145i.m146400b() || !C85126c.m146389a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: f */
    public final String mo108896f() {
        if (TextUtils.equals(C85145i.m146401c(), "3")) {
            return "3";
        }
        return "2";
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: h */
    public final boolean mo108898h() {
        return C85145i.f190498a.getBoolean("translate_onboard", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: i */
    public final void mo108899i() {
        C85145i.f190498a.storeBoolean("translate_onboard", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: a */
    public final boolean mo108888a() {
        return C85145i.m146399a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: g */
    public final boolean mo108897g() {
        Set<String> stringSet = C85145i.f190498a.getStringSet("non_onboarded_user_edit_translations_exposure_videos", new HashSet());
        C89219l.m154716b(stringSet, "");
        if (stringSet.size() < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static ITranslatedCaptionService m146355j() {
        MethodCollector.m26663i(4927);
        Object a = C81908b.m141854a(ITranslatedCaptionService.class, false);
        if (a != null) {
            ITranslatedCaptionService iTranslatedCaptionService = (ITranslatedCaptionService) a;
            MethodCollector.m26664o(4927);
            return iTranslatedCaptionService;
        }
        if (C81908b.f183368eL == null) {
            synchronized (ITranslatedCaptionService.class) {
                try {
                    if (C81908b.f183368eL == null) {
                        C81908b.f183368eL = new TranslatedCaptionCacheServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4927);
                    throw th;
                }
            }
        }
        TranslatedCaptionCacheServiceImpl translatedCaptionCacheServiceImpl = (TranslatedCaptionCacheServiceImpl) C81908b.f183368eL;
        MethodCollector.m26664o(4927);
        return translatedCaptionCacheServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: a */
    public final void mo108887a(boolean z) {
        C85145i.f190498a.storeBoolean("hide_caption", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: a */
    public final void mo108886a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C85145i.f190498a.storeString("show_original_caption_video_id", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: d */
    public final boolean mo108894d(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        return C85145i.f190499b.contains(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: c */
    public final void mo108892c(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C85145i.f190499b.add(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    /* renamed from: b */
    public final void mo108889b(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        Set<String> stringSet = C85145i.f190498a.getStringSet("non_onboarded_user_edit_translations_exposure_videos", new HashSet());
        if (stringSet != null) {
            stringSet.add(str);
        } else {
            stringSet = C89047am.m154436a(str);
        }
        C85145i.f190498a.storeStringSet("non_onboarded_user_edit_translations_exposure_videos", stringSet);
    }
}
