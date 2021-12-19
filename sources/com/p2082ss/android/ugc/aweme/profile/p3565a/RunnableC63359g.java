package com.p2082ss.android.ugc.aweme.profile.p3565a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.util.List;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.a.g */
public final /* synthetic */ class RunnableC63359g implements Runnable {

    /* renamed from: a */
    private final C63356e f143858a;

    /* renamed from: b */
    private final C43223c f143859b;

    /* renamed from: c */
    private final int f143860c;

    static {
        Covode.recordClassIndex(74650);
    }

    RunnableC63359g(C63356e eVar, C43223c cVar, int i) {
        this.f143858a = eVar;
        this.f143859b = cVar;
        this.f143860c = i;
    }

    public final void run() {
        C63356e eVar = this.f143858a;
        C43223c cVar = this.f143859b;
        if (cVar.mo73701k()) {
            String o = cVar.mo73714o();
            if (C80720e.m139927b(o)) {
                C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMvThemeType: firstBitmap");
                C20766v a = C20761r.m39059a(new File(o));
                a.f49092E = eVar.f143853b;
                a.mo34179a("DraftBoxViewHolder").mo34186c();
            } else {
                C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMvThemeType: firstBitmap does not exist");
            }
        } else if (cVar.mo73713n()) {
            String p = cVar.mo73718p();
            if (C80720e.m139927b(p)) {
                C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMultiEditType: firstBitmap");
                C20766v a2 = C20761r.m39059a(new File(p));
                a2.f49092E = eVar.f143853b;
                a2.mo34179a("DraftBoxViewHolder").mo34186c();
            } else {
                C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isMultiEditType: firstBitmap does not exist");
            }
        } else if (cVar.f100900W.f100842bo != null) {
            List<String> sourceInfo = cVar.f100900W.f100842bo.getSourceInfo();
            if (sourceInfo == null || sourceInfo.isEmpty()) {
                C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isCanvasType: sourceInfo is null or empty || firstBitmap does not exist");
            } else {
                String str = sourceInfo.get(0);
                if (C80720e.m139927b(str)) {
                    C77283a.m135111b("DraftBoxViewHolder", "bindVideoThumbnail -> draft.isCanvasType: firstBitmap");
                    C20766v a3 = C20761r.m39059a(new File(str));
                    a3.f49092E = eVar.f143853b;
                    a3.mo34179a("DraftBoxViewHolder").mo34186c();
                }
            }
        } else {
            AVExternalServiceImpl.m113114a().abilityService().infoService().videoCover(cVar, new C63362j(eVar));
        }
        if (eVar.f143854c != null) {
            C1731i.m5640b(new CallableC63360h(eVar), C1731i.f5562a).mo5534a(new C63361i(eVar), C1731i.f5564c, null);
        }
        if (eVar.f143855d != null) {
            eVar.f143855d.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
    }
}
