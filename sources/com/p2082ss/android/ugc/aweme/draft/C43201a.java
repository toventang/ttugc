package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.a */
public final class C43201a implements AbstractC43204d {

    /* renamed from: a */
    public final C43223c f100696a;

    static {
        Covode.recordClassIndex(51388);
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43204d
    /* renamed from: a */
    public final DraftCheckResult mo73445a() {
        List<String> list;
        CanvasVideoData canvasVideoData = this.f100696a.f100900W.f100842bo;
        if (canvasVideoData != null) {
            list = canvasVideoData.getSourceInfo();
        } else {
            list = null;
        }
        return C43205e.m86159a(list);
    }

    public C43201a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        this.f100696a = cVar;
    }
}
