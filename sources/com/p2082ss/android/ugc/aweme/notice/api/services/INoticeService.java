package com.p2082ss.android.ugc.aweme.notice.api.services;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.api.services.INoticeService */
public interface INoticeService {
    static {
        Covode.recordClassIndex(72294);
    }

    /* renamed from: a */
    <T extends AbstractC34586a> Class<? extends T> mo99371a();

    /* renamed from: a */
    String mo99372a(User user);

    /* renamed from: a */
    void mo99373a(int i);

    /* renamed from: a */
    void mo99374a(Context context);

    /* renamed from: a */
    void mo99375a(Bundle bundle, int i);

    /* renamed from: a */
    void mo99376a(Handler handler, String str);

    /* renamed from: a */
    boolean mo99377a(Context context, User user, String str, String str2, boolean z);

    /* renamed from: a */
    boolean mo99378a(BaseResponse baseResponse);

    /* renamed from: b */
    AbstractC61610a mo99379b();

    /* renamed from: b */
    void mo99380b(Handler handler, String str);

    /* renamed from: b */
    boolean mo99381b(BaseResponse baseResponse);

    /* renamed from: c */
    void mo99382c();

    /* renamed from: d */
    void mo99383d();

    /* renamed from: e */
    int mo99384e();

    /* renamed from: com.ss.android.ugc.aweme.notice.api.services.INoticeService$a */
    public static final class C61609a {
        static {
            Covode.recordClassIndex(72295);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m111607a(INoticeService iNoticeService, Context context, User user, String str, String str2, boolean z, int i) {
            if ((i & 4) != 0) {
                str = "notification_page";
            }
            if ((i & 8) != 0) {
                str2 = "button";
            }
            return iNoticeService.mo99377a(context, user, str, str2, z);
        }
    }
}
