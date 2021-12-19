package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43234h;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.draft.e */
public final class C43205e {

    /* renamed from: a */
    private static final String f100698a;

    static {
        Covode.recordClassIndex(51392);
        File b = C84902i.m145895b(C63247i.f143610a);
        C89219l.m154716b(b, "");
        String absolutePath = b.getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        f100698a = C43209h.m86171a(absolutePath);
    }

    /* renamed from: b */
    public static final String m86161b(String str) {
        if (str == null) {
            return null;
        }
        return C89361p.m154869a(str, f100698a, "./", true);
    }

    /* renamed from: a */
    public static final AbstractC43204d m86157a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f100900W.f100842bo != null) {
            return new C43201a(cVar);
        }
        if (cVar.mo73701k()) {
            return new C43240o(cVar);
        }
        if (C43225d.m86339i(cVar) != null) {
            return new C43214l(cVar);
        }
        if (C43225d.m86338h(cVar) != null) {
            return new C43202b(cVar);
        }
        return new C43241p();
    }

    /* renamed from: a */
    public static final DraftCheckResult m86159a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new DraftCheckResult(0, null, null, 0, 14, null);
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m86160a((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((DraftFileCheckResult) obj).isSuc()) {
                arrayList2.add(obj);
            }
        }
        return new DraftCheckResult(list.size(), arrayList2, null, 0, 12, null);
    }

    /* renamed from: a */
    public static final DraftFileCheckResult m86160a(String str) {
        if (str == null || str.length() == 0) {
            return new DraftFileCheckResult(-100, str);
        }
        if (!C43209h.m86175b(str)) {
            return new DraftFileCheckResult(-101, m86161b(str));
        }
        if (C43209h.m86177d(str) <= 0) {
            return new DraftFileCheckResult(-102, m86161b(str));
        }
        return new DraftFileCheckResult(0, null, 2, null);
    }

    /* renamed from: a */
    public static final DraftCheckResult m86158a(C43223c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        DraftCheckResult a = m86157a(cVar).mo73445a();
        String f = cVar.mo73676f();
        C89219l.m154716b(f, "");
        DraftLoadResult draftLoadResult = new DraftLoadResult(f, C43234h.m86346a(cVar), C43212j.m86179a(cVar.f100886I), cVar.f100900W.f100846bs, a, false, 32, null);
        if (z && !C63244g.m114602a().mo73255A().mo93901a()) {
            C63244g.m114602a().mo73275c().mo101847b().mo101854a(draftLoadResult);
            C63244g.m114602a().mo73275c().mo101843a().mo101859a(draftLoadResult);
        }
        return a;
    }
}
