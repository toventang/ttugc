package com.p2082ss.android.ugc.aweme.main;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22777e;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f;
import com.bytedance.tux.icon.TuxIconView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.main.af */
public final /* synthetic */ class C59020af implements AbstractC1214u {

    /* renamed from: a */
    private final C59014ae f134391a;

    static {
        Covode.recordClassIndex(69365);
    }

    C59020af(C59014ae aeVar) {
        this.f134391a = aeVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        TuxIconView tuxIconView;
        C59014ae aeVar = this.f134391a;
        C18017a aVar = (C18017a) obj;
        C17975i.m33461a(aVar.f42891a, aeVar.f134380u);
        C22777e eVar = aeVar.f134378s;
        int i = aVar.f42891a;
        if (eVar.f53791a != null) {
            C17975i.m33461a(i, eVar.f53791a);
        }
        C22778f fVar = aeVar.f134377r;
        int i2 = aVar.f42891a;
        if (fVar.f53795b != null) {
            C17975i.m33461a(i2, fVar.f53795b);
            if (i2 == 4 && (tuxIconView = fVar.f53795b) != null) {
                tuxIconView.setAlpha(1.0f);
            }
        }
    }
}
