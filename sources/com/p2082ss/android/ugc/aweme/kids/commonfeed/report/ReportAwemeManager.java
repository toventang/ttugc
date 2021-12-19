package com.p2082ss.android.ugc.aweme.kids.commonfeed.report;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager */
public final class ReportAwemeManager implements IReportAwemeManager {

    /* renamed from: a */
    public static final C57456a f131018a = new C57456a((byte) 0);

    /* renamed from: b */
    private static final C57457a f131019b = new C57457a();

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager$a */
    public static final class C57456a {
        static {
            Covode.recordClassIndex(67386);
        }

        private C57456a() {
        }

        public /* synthetic */ C57456a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(67385);
    }

    /* renamed from: a */
    public static IReportAwemeManager m104144a() {
        MethodCollector.m26663i(6886);
        Object a = C81908b.m141854a(IReportAwemeManager.class, false);
        if (a != null) {
            IReportAwemeManager iReportAwemeManager = (IReportAwemeManager) a;
            MethodCollector.m26664o(6886);
            return iReportAwemeManager;
        }
        if (C81908b.f183210bM == null) {
            synchronized (IReportAwemeManager.class) {
                try {
                    if (C81908b.f183210bM == null) {
                        C81908b.f183210bM = new ReportAwemeManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6886);
                    throw th;
                }
            }
        }
        ReportAwemeManager reportAwemeManager = (ReportAwemeManager) C81908b.f183210bM;
        MethodCollector.m26664o(6886);
        return reportAwemeManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    /* renamed from: a */
    public final List<Aweme> mo94624a(List<? extends Aweme> list) {
        String[] a;
        Set k;
        C89219l.m154721d(list, "");
        List<Aweme> g = C89070n.m154585g((Collection) list);
        Iterator<Aweme> it = g.iterator();
        while (it.hasNext()) {
            String aid = it.next().getAid();
            C89219l.m154716b(aid, "");
            C57457a aVar = f131019b;
            if (aVar.f131023c != null) {
                a = aVar.f131023c;
            } else {
                a = aVar.mo94732a();
            }
            if (!(a == null || (k = C89064i.m154510k(a)) == null || !k.contains(aid))) {
                it.remove();
            }
        }
        return g;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    /* renamed from: a */
    public final void mo94625a(String str) {
        C89219l.m154721d(str, "");
        C57457a aVar = f131019b;
        C89219l.m154721d(str, "");
        if (aVar.f131022b.getStringArray("report_aweme_list", null) == null) {
            List c = C89070n.m154524c(str);
            Keva keva = aVar.f131022b;
            Object[] array = c.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            keva.storeStringArray("report_aweme_list", (String[]) array);
            return;
        }
        String[] stringArray = aVar.f131022b.getStringArray("report_aweme_list", null);
        C89219l.m154716b(stringArray, "");
        aVar.f131021a = C89064i.m154509j(stringArray);
        List<String> list = aVar.f131021a;
        if (list != null) {
            list.add(str);
            Keva keva2 = aVar.f131022b;
            Object[] array2 = list.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            keva2.storeStringArray("report_aweme_list", (String[]) array2);
        }
    }
}
