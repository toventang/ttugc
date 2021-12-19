package com.p2082ss.android.ugc.aweme.p3070im;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.NotificationManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.g */
public final class C53603g implements AbstractC68342a {

    /* renamed from: a */
    public static final AbstractC89244h f123022a = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C53605b.f123024a);

    /* renamed from: b */
    public static final C53604a f123023b = new C53604a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.g$a */
    public static final class C53604a {
        static {
            Covode.recordClassIndex(63182);
        }

        /* renamed from: a */
        public static C53603g m98850a() {
            return (C53603g) C53603g.f123022a.getValue();
        }

        private C53604a() {
        }

        public /* synthetic */ C53604a(byte b) {
            this();
        }
    }

    private C53603g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.g$b */
    static final class C53605b extends AbstractC89220m implements AbstractC89171a<C53603g> {

        /* renamed from: a */
        public static final C53605b f123024a = new C53605b();

        static {
            Covode.recordClassIndex(63183);
        }

        C53605b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C53603g invoke() {
            return new C53603g((byte) 0);
        }
    }

    /* renamed from: a */
    public static INotificationManagerService m98842a() {
        INotificationManagerService d = NotificationManagerServiceImpl.m101386d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: b */
    public static boolean m98845b() {
        return m98842a().mo90139b();
    }

    static {
        Covode.recordClassIndex(63181);
    }

    public /* synthetic */ C53603g(byte b) {
        this();
    }

    /* renamed from: a */
    public static void m98843a(Integer num) {
        m98842a().mo90138b(num);
    }

    /* renamed from: b */
    public static void m98844b(Integer num) {
        m98842a().mo90143e(num);
    }

    /* renamed from: c */
    public static void m98846c(Integer num) {
        m98842a().mo90134a(num);
    }

    /* renamed from: d */
    public static void m98847d(Integer num) {
        m98842a().mo90142d(num);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        m98842a().mo90133a(fVar);
    }
}
