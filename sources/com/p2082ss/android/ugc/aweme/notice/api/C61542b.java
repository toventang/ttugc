package com.p2082ss.android.ugc.aweme.notice.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.b */
public final class C61542b {

    /* renamed from: a */
    public static final C61542b f139692a = new C61542b();

    /* renamed from: b */
    private static final AbstractC89244h f139693b = C89250i.m154773a((AbstractC89171a) C61544b.f139696a);

    /* renamed from: c */
    private static final AbstractC89244h f139694c = C89250i.m154773a((AbstractC89171a) C61543a.f139695a);

    /* renamed from: a */
    public static NoticeCountService m111459a() {
        return (NoticeCountService) f139693b.getValue();
    }

    /* renamed from: b */
    public static IMainServiceHelper m111467b() {
        return (IMainServiceHelper) f139694c.getValue();
    }

    private C61542b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.b$a */
    static final class C61543a extends AbstractC89220m implements AbstractC89171a<IMainServiceHelper> {

        /* renamed from: a */
        public static final C61543a f139695a = new C61543a();

        static {
            Covode.recordClassIndex(72213);
        }

        C61543a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IMainServiceHelper invoke() {
            return MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.b$b */
    static final class C61544b extends AbstractC89220m implements AbstractC89171a<NoticeCountService> {

        /* renamed from: a */
        public static final C61544b f139696a = new C61544b();

        static {
            Covode.recordClassIndex(72214);
        }

        C61544b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NoticeCountService invoke() {
            return NoticeCountServiceImpl.m112552d();
        }
    }

    /* renamed from: c */
    public static final void m111468c() {
        m111459a().mo99307b();
    }

    static {
        Covode.recordClassIndex(72212);
    }

    /* renamed from: a */
    private static int m111456a(int i) {
        return m111459a().mo99297a(i);
    }

    /* renamed from: b */
    private static int m111465b(int i) {
        return m111459a().mo99306b(i);
    }

    /* renamed from: d */
    public static final void m111470d(int... iArr) {
        C89219l.m154721d(iArr, "");
        m111459a().mo99302a((EnumC61551c) null, iArr);
    }

    /* renamed from: a */
    public static final int m111457a(String str) {
        C89219l.m154721d(str, "");
        return m111459a().mo99298a(str);
    }

    /* renamed from: a */
    public static final int m111458a(int... iArr) {
        C89219l.m154721d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(m111456a(i)));
        }
        return C89070n.m154599s(arrayList);
    }

    /* renamed from: b */
    public static final int m111466b(int... iArr) {
        C89219l.m154721d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(m111465b(i)));
        }
        return C89070n.m154599s(arrayList);
    }

    /* renamed from: c */
    public static final boolean m111469c(int... iArr) {
        C89219l.m154721d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(m111456a(i)));
        }
        if (C89070n.m154599s(arrayList) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m111463a(boolean z) {
        m111459a().mo99304a(z);
    }

    /* renamed from: a */
    public static final void m111460a(int i, int i2) {
        m111459a().mo99300a(i, i2);
    }

    /* renamed from: a */
    public static final void m111461a(EnumC61551c cVar, int... iArr) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(iArr, "");
        m111459a().mo99302a(cVar, iArr);
    }

    /* renamed from: a */
    public static final void m111462a(List<String> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        m111459a().mo99303a(list, str);
    }

    /* renamed from: a */
    public static final void m111464a(boolean z, int i) {
        m111459a().mo99305a(z, i);
    }
}
