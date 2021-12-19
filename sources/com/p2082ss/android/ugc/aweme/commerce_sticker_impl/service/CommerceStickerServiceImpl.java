package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewStub;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2530b.AbstractC37570a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2531a.C37572a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2532b.C37574a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.view.C37583a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl */
public final class CommerceStickerServiceImpl implements ICommerceStickerService {
    static {
        Covode.recordClassIndex(44978);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final void mo65420a() {
        C37574a.m75787a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: b */
    public final AbstractC37571a mo65425b() {
        return new C37576a();
    }

    /* renamed from: c */
    public static ICommerceStickerService m75788c() {
        Object a = C81908b.m141854a(ICommerceStickerService.class, false);
        if (a != null) {
            return (ICommerceStickerService) a;
        }
        return new CommerceStickerServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final void mo65421a(AbstractC37569a aVar) {
        C89219l.m154721d(aVar, "");
        C37572a.f88791a.mo123715a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final void mo65422a(String str) {
        if (str != null && str.length() != 0) {
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) new C27910f().mo46670a(str, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    C18129a.m33746a("camera_ad", "click", awemeRawAd).mo28900b("refer", "sticker").mo28901b();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: b */
    public final void mo65426b(String str) {
        if (str != null && str.length() != 0) {
            try {
                AwemeRawAd awemeRawAd = (AwemeRawAd) new C27910f().mo46670a(str, AwemeRawAd.class);
                if (awemeRawAd != null) {
                    C18129a.m33746a("camera_ad", "show", awemeRawAd).mo28900b("refer", "sticker").mo28901b();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final AbstractC37570a mo65419a(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4, ViewStub viewStub5) {
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(viewStub2, "");
        C89219l.m154721d(viewStub3, "");
        C89219l.m154721d(viewStub4, "");
        C89219l.m154721d(viewStub5, "");
        return new C37583a(viewStub, viewStub2, viewStub3, viewStub4, viewStub5);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final void mo65424a(boolean z, String str, String str2, String str3, Boolean bool) {
        if (!TextUtils.equals(C37574a.f88795b, str3) && z && TextUtils.equals(str, "challenge") && !(true ^ C89219l.m154714a((Object) bool, (Object) true))) {
            C33743c a = new C33743c().mo59976a("shoot_way", str);
            if (str2 == null) {
                str2 = "";
            }
            C33743c a2 = a.mo59976a("challenge_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            C12290b.m22060a("autoselected_sticker_monitor", 0, a2.mo59976a("sticker_id", str3).mo59977a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService
    /* renamed from: a */
    public final void mo65423a(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        if (!TextUtils.equals(C37574a.f88795b, str)) {
            C37574a.m75787a();
            if (z) {
                C37574a.f88795b = str;
                C37574a.f88794a = new C37574a.C37575a(str2, str4, str, SystemClock.elapsedRealtime());
                if (z2) {
                    C33744d dVar = new C33744d();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = str4;
                    }
                    C39162r.m79460a("commerce_prop_click", dVar.mo59983a("enter_from", str3).mo59983a("prop_id", str).f79943a);
                }
            }
        }
    }
}
