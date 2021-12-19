package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.o */
public final class C37682o implements AbstractC37569a {
    static {
        Covode.recordClassIndex(45115);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final User mo65409a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: b */
    public final boolean mo65415b(String str) {
        C89219l.m154721d(str, "");
        return AVExternalServiceImpl.m113114a().infoService().stickerInfo().idUnlocked(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: c */
    public final boolean mo65416c(String str) {
        C89219l.m154721d(str, "");
        return AVExternalServiceImpl.m113114a().infoService().stickerInfo().isScanUnLockType(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final boolean mo65414a(String str) {
        return C36125t.m73598a(C36125t.m73591a(), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final boolean mo65413a(Context context, String str) {
        C89219l.m154721d(context, "");
        return C38767w.m78643a(context, str, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final void mo65410a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C38767w.m78639a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final void mo65412a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        FestivalService.m126857b().mo101501a(str, textView, viewGroup, textView2, imageView);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_sticker_api.p2529a.AbstractC37569a
    /* renamed from: a */
    public final void mo65411a(Context context, String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str4, "");
        C40584a.m81931a(str4, str5, null);
        if (!C38767w.m78643a(context, str, false)) {
            C38767w.m78639a(context, str2, str3);
        }
    }
}
