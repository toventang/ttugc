package com.p2082ss.android.ugc.aweme.notification.redpoint;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61547c;
import com.p2082ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a */
public final class C62211a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    static NoticeList f141223a;

    /* renamed from: b */
    public static final C62211a f141224b = new C62211a();

    /* renamed from: c */
    private static final AbstractC89244h f141225c = C89250i.m154773a((AbstractC89171a) C62212a.f141227a);

    /* renamed from: d */
    private static Integer f141226d;

    /* renamed from: a */
    private static C88411a m112511a() {
        return (C88411a) f141225c.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(390, new RunnableC90250g(C62211a.class, "onRecordImMsgCountEvent", C61547c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private C62211a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$a */
    static final class C62212a extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C62212a f141227a = new C62212a();

        static {
            Covode.recordClassIndex(72979);
        }

        C62212a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$e */
    public static final class CallableC62216e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC62216e f141231a = new CallableC62216e();

        static {
            Covode.recordClassIndex(72983);
        }

        CallableC62216e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Message obtain = Message.obtain();
            obtain.obj = C62211a.f141223a;
            obtain.what = 0;
            C62232h.m112535b().handleMsg(obtain);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(72978);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (com.p2082ss.android.ugc.aweme.notification.redpoint.C62211a.f141223a != null) goto L_0x003e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m112513b() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.redpoint.C62211a.m112513b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$c */
    public static final class C62214c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62214c f141229a = new C62214c();

        static {
            Covode.recordClassIndex(72981);
        }

        C62214c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            NoticeList noticeList = (NoticeList) obj;
            C62211a aVar = C62211a.f141224b;
            C89219l.m154716b(noticeList, "");
            aVar.mo100225a(noticeList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$b */
    public static final class C62213b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ int f141228a;

        static {
            Covode.recordClassIndex(72980);
        }

        C62213b(int i) {
            this.f141228a = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<NoticeList> vVar) {
            C89219l.m154721d(vVar, "");
            try {
                vVar.mo143031a(NotificationApi.m111631a(this.f141228a));
            } catch (Exception e) {
                vVar.mo143024a(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$d */
    public static final class C62215d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62215d f141230a = new C62215d();

        static {
            Covode.recordClassIndex(72982);
        }

        C62215d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            th.getMessage();
            C61964b.m112089a("ColdStartUnreadOptHelp", "queryUnreadNotifyCount " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo100225a(NoticeList noticeList) {
        C89219l.m154721d(noticeList, "");
        C61964b.m112089a("ColdStartUnreadOptHelp", "multiUserCountPull: ".concat(String.valueOf(noticeList)));
        f141223a = noticeList;
        m112513b();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRecordImMsgCountEvent(C61547c cVar) {
        C89219l.m154721d(cVar, "");
        f141226d = Integer.valueOf(cVar.f139699a);
        m112513b();
    }

    /* renamed from: a */
    public static void m112512a(int i) {
        C61964b.m112089a("ColdStartUnreadOptHelp", "queryUnreadNotifyCount  ".concat(String.valueOf(i)));
        AbstractC88412b a = AbstractC88979t.m154294a(new C62213b(i)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C62214c.f141229a, C62215d.f141230a);
        m112511a().mo142944a();
        m112511a().mo142945a(a);
    }
}
