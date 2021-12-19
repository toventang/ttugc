package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftVECheckResult;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.o */
public final class C43240o implements AbstractC43204d {

    /* renamed from: a */
    public final C43223c f100960a;

    static {
        Covode.recordClassIndex(51442);
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43204d
    /* renamed from: a */
    public final DraftCheckResult mo73445a() {
        DraftCheckResult draftCheckResult;
        ArrayList<String> arrayList;
        C61288d dVar = this.f100960a.f100900W.f100753M;
        if (dVar != null) {
            DraftFileCheckResult a = C43205e.m86160a(dVar.mvResUnzipPath);
            if (!a.isSuc()) {
                draftCheckResult = new DraftCheckResult(1, C89070n.m154525d(a), null, 0, 12, null);
            } else {
                int checkMVResourceIntegrity = VEUtils.checkMVResourceIntegrity(dVar.mvResUnzipPath);
                if (checkMVResourceIntegrity != 0) {
                    draftCheckResult = new DraftCheckResult(1, C89086z.INSTANCE, C89070n.m154525d(new DraftVECheckResult(checkMVResourceIntegrity - 10000, C43205e.m86161b(dVar.mvResUnzipPath))), 0, 8, null);
                } else {
                    draftCheckResult = new DraftCheckResult(1, null, null, 0, 14, null);
                }
            }
        } else {
            draftCheckResult = new DraftCheckResult(0, null, null, 0, 14, null);
        }
        if (!draftCheckResult.isSuc()) {
            return draftCheckResult;
        }
        C61288d dVar2 = this.f100960a.f100900W.f100753M;
        if (dVar2 != null) {
            arrayList = dVar2.selectMediaList;
        } else {
            arrayList = null;
        }
        return C43205e.m86159a(arrayList);
    }

    public C43240o(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        this.f100960a = cVar;
    }
}
