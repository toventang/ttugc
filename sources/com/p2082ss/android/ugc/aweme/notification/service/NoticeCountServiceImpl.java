package com.p2082ss.android.ugc.aweme.notification.service;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62211a;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62218c;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62230g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl */
public final class NoticeCountServiceImpl implements NoticeCountService {

    /* renamed from: b */
    private final AbstractC89244h f141264b = C89250i.m154773a((AbstractC89171a) C62237a.f141265a);

    static {
        Covode.recordClassIndex(73004);
    }

    /* renamed from: e */
    private final OldRedPointService m112553e() {
        return (OldRedPointService) this.f141264b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl$a */
    static final class C62237a extends AbstractC89220m implements AbstractC89171a<OldRedPointService> {

        /* renamed from: a */
        public static final C62237a f141265a = new C62237a();

        static {
            Covode.recordClassIndex(73005);
        }

        C62237a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ OldRedPointService invoke() {
            return RedPointServiceImpl.m112583b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: b */
    public final void mo99307b() {
        m112553e().mo99310a();
    }

    /* renamed from: d */
    public static NoticeCountService m112552d() {
        MethodCollector.m26663i(3838);
        Object a = C81908b.m141854a(NoticeCountService.class, false);
        if (a != null) {
            NoticeCountService noticeCountService = (NoticeCountService) a;
            MethodCollector.m26664o(3838);
            return noticeCountService;
        }
        if (C81908b.f183271cU == null) {
            synchronized (NoticeCountService.class) {
                try {
                    if (C81908b.f183271cU == null) {
                        C81908b.f183271cU = new NoticeCountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3838);
                    throw th;
                }
            }
        }
        NoticeCountServiceImpl noticeCountServiceImpl = (NoticeCountServiceImpl) C81908b.f183271cU;
        MethodCollector.m26664o(3838);
        return noticeCountServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99299a() {
        if (C61538b.m111451b()) {
            C80298cg.m139204a(C62211a.f141224b);
            IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: c */
    public final Map<Integer, Integer> mo99308c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Number> g = C89070n.m154585g((Collection) C62221f.m112525b());
        C56297a.m102298a(g);
        for (Number number : g) {
            int intValue = number.intValue();
            int a = C61542b.m111458a(intValue);
            if (a != 0) {
                linkedHashMap.put(Integer.valueOf(intValue), Integer.valueOf(a));
            }
        }
        linkedHashMap.put(99, Integer.valueOf(C62230g.m112534c()));
        return linkedHashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final int mo99297a(int i) {
        return m112553e().mo99309a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: b */
    public final int mo99306b(int i) {
        return m112553e().mo99316b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final int mo99298a(String str) {
        C89219l.m154721d(str, "");
        return C62218c.m112516a().mo100228a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99301a(Message message) {
        C89219l.m154721d(message, "");
        m112553e().mo99313a(message);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99304a(boolean z) {
        m112553e().mo99314a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99300a(int i, int i2) {
        m112553e().mo99311a(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99302a(EnumC61551c cVar, int... iArr) {
        C89219l.m154721d(iArr, "");
        for (int i : iArr) {
            m112553e().mo99312a(i, cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99303a(List<String> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C62218c.m112516a().mo100229a(list, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService
    /* renamed from: a */
    public final void mo99305a(boolean z, int i) {
        m112553e().mo99315a(z, i);
    }
}
