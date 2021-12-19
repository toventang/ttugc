package com.p2082ss.android.ugc.aweme.p2690cr.p2697d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.d.b */
public final class C40346b {

    /* renamed from: a */
    public static final C40346b f94517a = new C40346b();

    private C40346b() {
    }

    static {
        Covode.recordClassIndex(48147);
    }

    /* renamed from: b */
    public static boolean m81527b() {
        C63244g.m114602a().mo73295w();
        return false;
    }

    /* renamed from: a */
    public static Set<String> m81526a() {
        return C63244g.m114602a().mo73279g().mo69469b().mo69462a();
    }

    /* renamed from: a */
    public static final String m81525a(C43223c cVar) {
        String draftDir;
        C89219l.m154721d(cVar, "");
        if (cVar.f100900W.f100757Q) {
            EditPreviewInfo a = C43225d.m86323a(cVar, false);
            if (a == null || (draftDir = a.getDraftDir()) == null) {
                return "";
            }
            return draftDir;
        } else if (cVar.f100903c != null) {
            String str = cVar.f100900W.f100759S;
            if (str == null) {
                return "";
            }
            return str;
        } else {
            String a2 = C69744c.m123269a(cVar.f100900W.f100759S);
            if (a2 == null) {
                return "";
            }
            return a2;
        }
    }
}
