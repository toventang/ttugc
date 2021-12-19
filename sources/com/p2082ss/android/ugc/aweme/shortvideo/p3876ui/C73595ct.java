package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62855a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ct */
public final /* synthetic */ class C73595ct implements AbstractC1214u {

    /* renamed from: a */
    private final C73560cj f165412a;

    static {
        Covode.recordClassIndex(86333);
    }

    C73595ct(C73560cj cjVar) {
        this.f165412a = cjVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C73560cj cjVar = this.f165412a;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (!bool.booleanValue()) {
            cjVar.f165333h.setAlpha(0.4f);
            cjVar.f165333h.mo115830a(0, null, 0);
            cjVar.f165338m.setValue(new C62855a(cjVar.f165339n.f156258b.getPermission(), cjVar.f165339n.f156258b.getExcludeUserList(), cjVar.f165339n.f156258b.getAllowRecommend()));
            cjVar.f165333h.setEnabled(false);
            cjVar.f165328c._enable.setValue(false);
            cjVar.f165328c._checked.setValue(false);
            cjVar.f165328c._alpha.setValue(Float.valueOf(0.4f));
            cjVar.f165329d._enable.setValue(false);
            cjVar.f165329d._checked.setValue(false);
            cjVar.f165329d._alpha.setValue(Float.valueOf(0.4f));
            cjVar.f165266I.mo114934a(true);
            return;
        }
        cjVar.f165333h.setAlpha(1.0f);
        cjVar.f165333h.setEnabled(true);
        cjVar.f165328c._enable.setValue(true);
        cjVar.f165328c._alpha.setValue(Float.valueOf(1.0f));
        cjVar.f165329d._enable.setValue(true);
        cjVar.f165329d._alpha.setValue(Float.valueOf(1.0f));
        cjVar.f165266I.mo114934a(false);
    }
}
