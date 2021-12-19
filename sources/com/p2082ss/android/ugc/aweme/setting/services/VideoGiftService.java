package com.p2082ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.setting.C68029bo;
import com.p2082ss.android.ugc.aweme.setting.C68720y;
import com.p2082ss.android.ugc.aweme.setting.C68721z;
import com.p2082ss.android.ugc.aweme.utils.C80586is;
import java.util.HashSet;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.services.VideoGiftService */
public final class VideoGiftService implements IVideoGiftService {
    static {
        Covode.recordClassIndex(80671);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: a */
    public final String mo108900a() {
        C68720y a = C68721z.m121156a();
        if (a != null) {
            return a.f153731a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: b */
    public final String mo108904b() {
        C68029bo boVar;
        C68720y a = C68721z.m121156a();
        if (a == null || (boVar = a.f153733c) == null) {
            return null;
        }
        return boVar.f152375a;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: d */
    public final boolean mo108906d() {
        if (C80586is.m139725b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C80586is.m139722a("vgv_first_gift_sent"), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: e */
    public final void mo108907e() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C80586is.m139722a("vgv_first_gift_sent"), true);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: f */
    public final boolean mo108908f() {
        if (C80586is.m139725b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C80586is.m139722a("vgv_promotion_dialog_has_shown"), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: g */
    public final void mo108909g() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C80586is.m139722a("vgv_promotion_dialog_has_shown"), true);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: h */
    public final boolean mo108910h() {
        if (C80586is.m139725b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C80586is.m139722a("vgv_promotion_tooltip_has_shown"), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: i */
    public final void mo108911i() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C80586is.m139722a("vgv_promotion_tooltip_has_shown"), true);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: j */
    public final boolean mo108912j() {
        if (C80586is.m139725b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(C80586is.m139722a(C80586is.f180203a), false);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: k */
    public final void mo108913k() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C80586is.m139722a(C80586is.f180203a), true);
    }

    /* renamed from: l */
    public static IVideoGiftService m120814l() {
        MethodCollector.m26663i(5514);
        Object a = C81908b.m141854a(IVideoGiftService.class, false);
        if (a != null) {
            IVideoGiftService iVideoGiftService = (IVideoGiftService) a;
            MethodCollector.m26664o(5514);
            return iVideoGiftService;
        }
        if (C81908b.f183319dP == null) {
            synchronized (IVideoGiftService.class) {
                try {
                    if (C81908b.f183319dP == null) {
                        C81908b.f183319dP = new VideoGiftService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5514);
                    throw th;
                }
            }
        }
        VideoGiftService videoGiftService = (VideoGiftService) C81908b.f183319dP;
        MethodCollector.m26664o(5514);
        return videoGiftService;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: c */
    public final Set<String> mo108905c() {
        if (C80586is.m139725b()) {
            return C89047am.m154438a((Object[]) new String[]{"1", "2", "3"});
        }
        Set<String> stringSet = Keva.getRepo("video_gift_settings_keva_repo").getStringSet(C80586is.m139722a("vgv_video_strip_visibility_counter"), new HashSet());
        C89219l.m154716b(stringSet, "");
        return stringSet;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: a */
    public final void mo108902a(boolean z) {
        C80586is.m139723a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: a */
    public final void mo108901a(Set<String> set) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(set, "");
        Keva.getRepo("video_gift_settings_keva_repo").storeStringSet(C80586is.m139722a("vgv_video_strip_visibility_counter"), set);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService
    /* renamed from: a */
    public final boolean mo108903a(Aweme aweme) {
        C68720y a = C68721z.m121156a();
        if (a != null && a.f153732b) {
            return true;
        }
        if (aweme != null) {
            return aweme.getAllowGift();
        }
        return false;
    }
}
