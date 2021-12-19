package com.p4501vk.api.sdk;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p4501vk.api.sdk.AbstractC87878f;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4507f.C87894h;
import com.p4501vk.api.sdk.p4509ui.VKCaptchaActivity;
import com.p4501vk.api.sdk.p4509ui.VKConfirmationActivity;
import com.p4501vk.api.sdk.p4509ui.VKWebViewAuthActivity;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.g */
public final class C87895g implements AbstractC87878f {

    /* renamed from: a */
    public final Context f199632a;

    static {
        Covode.recordClassIndex(103905);
    }

    public C87895g(Context context) {
        C89219l.m154719c(context, "");
        this.f199632a = context;
    }

    @Override // com.p4501vk.api.sdk.AbstractC87878f
    /* renamed from: a */
    public final void mo142358a(C87854b bVar, C87860d dVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        throw bVar;
    }

    @Override // com.p4501vk.api.sdk.AbstractC87878f
    /* renamed from: a */
    public final void mo142359a(String str, AbstractC87878f.C87879a<String> aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        Context context = this.f199632a;
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        C87912l.m152930a(new VKCaptchaActivity.C87916a.RunnableC87917a(context, str));
        C87894h.m152899a();
        if (VKCaptchaActivity.f199662d != null) {
            String str2 = VKCaptchaActivity.f199662d;
            if (str2 == null) {
                C89219l.m154707a();
            }
            aVar.mo142362a(str2);
            return;
        }
        aVar.f199607b.countDown();
    }

    @Override // com.p4501vk.api.sdk.AbstractC87878f
    /* renamed from: b */
    public final void mo142360b(String str, AbstractC87878f.C87879a<AbstractC87878f.C87880b> aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        VKWebViewAuthActivity.f199683c = null;
        Context context = this.f199632a;
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        Intent putExtra = new Intent(context, VKWebViewAuthActivity.class).putExtra("vk_validation_url", str);
        C89219l.m154709a((Object) putExtra, "");
        C84349a.m145093a(putExtra, context);
        context.startActivity(putExtra);
        C87894h.m152899a();
        AbstractC87878f.C87880b bVar = VKWebViewAuthActivity.f199683c;
        if (bVar != null) {
            aVar.mo142362a(bVar);
        } else {
            aVar.f199607b.countDown();
        }
        VKWebViewAuthActivity.f199683c = null;
    }

    @Override // com.p4501vk.api.sdk.AbstractC87878f
    /* renamed from: c */
    public final void mo142361c(String str, AbstractC87878f.C87879a<Boolean> aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        VKConfirmationActivity.f199676a = false;
        Context context = this.f199632a;
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        C87912l.m152930a(new VKConfirmationActivity.C87923a.RunnableC87924a(context, str));
        C87894h.m152899a();
        aVar.mo142362a(Boolean.valueOf(VKConfirmationActivity.f199676a));
        VKConfirmationActivity.f199676a = false;
    }
}
