package com.p2082ss.android.ugc.aweme.notification.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.inbox.C56469l;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61536a;
import com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a;
import com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.p2082ss.android.ugc.aweme.notification.C61892c;
import com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.p2082ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.p2082ss.android.ugc.aweme.notification.p3522d.C61929c;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62264h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.notification.utils.C62271n;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl */
public final class NoticeServiceImpl implements INoticeService {
    static {
        Covode.recordClassIndex(73006);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl$a */
    public static final class C62238a implements AbstractC61610a {
        static {
            Covode.recordClassIndex(73007);
        }

        C62238a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a
        /* renamed from: a */
        public final Aweme mo99385a(String str) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str, "");
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a
        /* renamed from: a */
        public final void mo99386a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(aweme, "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: c */
    public final void mo99382c() {
        C61994d.m112123b(C61929c.C61930a.C61931a.f140584a);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: d */
    public final void mo99383d() {
        C61994d.m112120a(C61933a.C61957j.f140639a);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final AbstractC61610a mo99379b() {
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            return b;
        }
        return new C62238a();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final <T extends AbstractC34586a> Class<? extends T> mo99371a() {
        if (C56318b.m102311b()) {
            return C56469l.class;
        }
        if (!C61536a.m111449b() || C56318b.m102310a() != 0) {
            return MusNewNotificationFragment.class;
        }
        return C61892c.class;
    }

    /* renamed from: f */
    public static INoticeService m112566f() {
        MethodCollector.m26663i(217);
        Object a = C81908b.m141854a(INoticeService.class, false);
        if (a != null) {
            INoticeService iNoticeService = (INoticeService) a;
            MethodCollector.m26664o(217);
            return iNoticeService;
        }
        if (C81908b.f183272cV == null) {
            synchronized (INoticeService.class) {
                try {
                    if (C81908b.f183272cV == null) {
                        C81908b.f183272cV = new NoticeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(217);
                    throw th;
                }
            }
        }
        NoticeServiceImpl noticeServiceImpl = (NoticeServiceImpl) C81908b.f183272cV;
        MethodCollector.m26664o(217);
        return noticeServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: e */
    public final int mo99384e() {
        if (!C61536a.m111449b()) {
            return 0;
        }
        if (C61933a.C61949f.m112083a().f140625d) {
            return 4;
        }
        if (C61933a.C61949f.m112083a().f140626e) {
            return 3;
        }
        if (C61933a.C61949f.m112083a().f140627f) {
            return 2;
        }
        if (C61933a.C61949f.m112083a().f140624c) {
            return 1;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final String mo99372a(User user) {
        return C62265i.m112641a(null, user);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99373a(int i) {
        C61994d.m112120a(new C61933a.C61959k(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final boolean mo99381b(BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        if (!(baseResponse instanceof RejectResponse) || ((RejectResponse) baseResponse).reject_status != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0 A[Catch:{ Exception -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99374a(android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl.mo99374a(android.content.Context):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final boolean mo99378a(BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        if (!(baseResponse instanceof ApproveResponse) || ((ApproveResponse) baseResponse).approve_status != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99375a(Bundle bundle, int i) {
        C62271n.m112656a(bundle, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: b */
    public final void mo99380b(Handler handler, String str) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str, "");
        FollowRequestApiManager.m112153a(handler, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final void mo99376a(Handler handler, String str) {
        C89219l.m154721d(handler, "");
        C89219l.m154721d(str, "");
        FollowRequestApiManager.m112154a(handler, str, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.services.INoticeService
    /* renamed from: a */
    public final boolean mo99377a(Context context, User user, String str, String str2, boolean z) {
        return C62264h.m112640a(context, user, str, str2, null, z, 16);
    }
}
