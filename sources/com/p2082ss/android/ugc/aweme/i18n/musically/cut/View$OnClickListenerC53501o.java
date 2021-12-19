package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.o */
final /* synthetic */ class View$OnClickListenerC53501o implements View.OnClickListener {

    /* renamed from: a */
    private final C53497n f122819a;

    /* renamed from: b */
    private final C53497n.C53500b f122820b;

    /* renamed from: c */
    private final int f122821c;

    /* renamed from: d */
    private final MediaModel f122822d;

    static {
        Covode.recordClassIndex(63074);
    }

    View$OnClickListenerC53501o(C53497n nVar, C53497n.C53500b bVar, int i, MediaModel mediaModel) {
        this.f122819a = nVar;
        this.f122820b = bVar;
        this.f122821c = i;
        this.f122822d = mediaModel;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C53497n nVar = this.f122819a;
        C53497n.C53500b bVar = this.f122820b;
        int i = this.f122821c;
        MediaModel mediaModel = this.f122822d;
        if (!nVar.f122794a) {
            C39162r.m79460a("choose_upload_content", new C84425b().mo129406a("content_type", "video").mo129406a("upload_type", "mutiple_content").f188764a);
            int indexOf = nVar.f122797d.indexOf(Integer.valueOf(i));
            if (indexOf >= 0) {
                nVar.f122796c.set(i, -1);
                bVar.mo90087a();
                nVar.f122794a = true;
                bVar.f122818f.animate().alpha(0.0f).setDuration(300).withEndAction(new RunnableC53502p(nVar, bVar, i)).start();
                bVar.f122813a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                if (nVar.f122803j != null) {
                    nVar.f122803j.remove(indexOf);
                }
                nVar.f122797d.remove(Integer.valueOf(i));
                int size = nVar.f122797d.size();
                while (indexOf < size) {
                    nVar.f122796c.set(nVar.f122797d.get(indexOf).intValue(), Integer.valueOf(indexOf));
                    if (size != 11) {
                        nVar.notifyItemChanged(nVar.f122797d.get(indexOf).intValue());
                    }
                    indexOf++;
                }
                if (size == 11) {
                    nVar.f122804k.mo90093b();
                    return;
                }
                return;
            }
            nVar.f122805l.mo96649a(mediaModel, 0, -1, new C53503q(nVar, bVar, i, mediaModel), new C53504r(nVar, bVar.itemView.getContext()));
        }
    }
}
