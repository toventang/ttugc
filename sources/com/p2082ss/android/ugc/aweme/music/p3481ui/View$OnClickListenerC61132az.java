package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.az */
public final /* synthetic */ class View$OnClickListenerC61132az implements View.OnClickListener {

    /* renamed from: a */
    private final C61100ah f138810a;

    /* renamed from: b */
    private final ArrayList f138811b;

    static {
        Covode.recordClassIndex(71737);
    }

    View$OnClickListenerC61132az(C61100ah ahVar, ArrayList arrayList) {
        this.f138810a = ahVar;
        this.f138811b = arrayList;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C61100ah ahVar = this.f138810a;
        ArrayList arrayList = this.f138811b;
        if (arrayList.size() != 1) {
            C23226a.C23227a aVar = new C23226a.C23227a();
            boolean z = ahVar.f138718ai;
            String str = ahVar.f138729at;
            String str2 = ahVar.f138717ah;
            String str3 = ahVar.f138723an;
            C89219l.m154721d(arrayList, "");
            C61149c cVar = new C61149c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("music_info_list", arrayList);
            bundle.putBoolean("is_exclusive_resso", z);
            bundle.putString("process_id", str);
            bundle.putString("music_id", str2);
            bundle.putString("group_id", str3);
            cVar.setArguments(bundle);
            aVar.mo37817a(cVar).mo37812a(1).mo37822b(false).mo37819a(true).f55057a.show(ahVar.getFragmentManager(), "ThirdMusic");
        } else if (ahVar.f138732aw != null) {
            ahVar.f138732aw.mo98693a(ahVar.getContext(), (ExternalMusicInfo) arrayList.get(0), false);
        }
        if (ahVar.f138732aw != null) {
            ahVar.f138732aw.mo98695b(ahVar.getContext(), arrayList);
        }
    }
}
