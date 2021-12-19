package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.g */
final /* synthetic */ class DialogInterface$OnClickListenerC40195g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C40190d f94372a;

    /* renamed from: b */
    private final C68343a f94373b;

    static {
        Covode.recordClassIndex(47990);
    }

    DialogInterface$OnClickListenerC40195g(C40190d dVar, C68343a aVar) {
        this.f94372a = dVar;
        this.f94373b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C40190d dVar = this.f94372a;
        C68343a aVar = this.f94373b;
        if (i == -2) {
            dialogInterface.dismiss();
        } else if (i == -1) {
            dVar.f94364a.remove(aVar);
            ContentPreferenceViewModel contentPreferenceViewModel = dVar.f94366c;
            if (aVar != null) {
                ArrayList<C68343a> value = contentPreferenceViewModel.mo69433c().getValue();
                if (value != null) {
                    value.remove(aVar);
                }
                contentPreferenceViewModel.f94424b = true;
            }
            dVar.f94367d.mo69420a(aVar, 0);
            dVar.notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }
}
