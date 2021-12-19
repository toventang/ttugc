package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.y */
final /* synthetic */ class View$OnClickListenerC40041y implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94067a;

    static {
        Covode.recordClassIndex(47807);
    }

    View$OnClickListenerC40041y(C39986a aVar) {
        this.f94067a = aVar;
    }

    public final void onClick(View view) {
        List<InteractStickerStruct> interactStickerStructs;
        ClickAgent.onClick(view);
        C39986a aVar = this.f94067a;
        if (aVar.f93984c != null && (interactStickerStructs = aVar.f93984c.getInteractStickerStructs()) != null && interactStickerStructs.size() != 0) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getType() == 16) {
                    if (((C34800h) aVar.f93991j.f95762k).f82200c) {
                        C23025b bVar = new C23025b(aVar.getContext());
                        bVar.mo37417a(aVar.getContext().getResources().getString(R.string.be5), new C40017bb(aVar));
                        bVar.mo37419b(aVar.getContext().getResources().getString(R.string.bdo), C40020d.f94043a);
                        ((C23023b) C23035c.m43448a(aVar.getContext()).mo37482a(false).mo37479a(R.string.be6).mo37483b(R.string.be7)).mo37407a(bVar).mo37405a().mo37396b().show();
                        return;
                    }
                }
            }
        }
        aVar.mo69176d();
    }
}
