package com.p2082ss.android.ugc.aweme.notice.api.services;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.services.b */
public final class C61611b implements INoticeService {

    /* renamed from: a */
    public static final C61611b f139811a = new C61611b();

    /* renamed from: b */
    private final /* synthetic */ INoticeService f139812b;

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final <T extends AbstractC34586a> Class<? extends T> mo99371a() {
        return this.f139812b.mo99371a();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final String mo99372a(User user) {
        return this.f139812b.mo99372a(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99373a(int i) {
        this.f139812b.mo99373a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99374a(Context context) {
        C89219l.m154721d(context, "");
        this.f139812b.mo99374a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99375a(Bundle bundle, int i) {
        this.f139812b.mo99375a(bundle, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99376a(Handler handler, String str) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str, "");
        this.f139812b.mo99376a(handler, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final boolean mo99377a(Context context, User user, String str, String str2, boolean z) {
        return this.f139812b.mo99377a(context, user, str, str2, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final boolean mo99378a(BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        return this.f139812b.mo99378a(baseResponse);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final AbstractC61610a mo99379b() {
        return this.f139812b.mo99379b();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final void mo99380b(Handler handler, String str) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str, "");
        this.f139812b.mo99380b(handler, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final boolean mo99381b(BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        return this.f139812b.mo99381b(baseResponse);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: c */
    public final void mo99382c() {
        this.f139812b.mo99382c();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: d */
    public final void mo99383d() {
        this.f139812b.mo99383d();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: e */
    public final int mo99384e() {
        return this.f139812b.mo99384e();
    }

    static {
        Covode.recordClassIndex(72297);
    }

    private C61611b() {
        INoticeService f = NoticeServiceImpl.m112566f();
        C89219l.m154716b(f, "");
        this.f139812b = f;
    }
}
