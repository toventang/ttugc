package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.p3726n.C68192a;
import com.p2082ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bm */
public final /* synthetic */ class C68561bm implements AbstractC88983w {

    /* renamed from: a */
    static final AbstractC88983w f153413a = new C68561bm();

    static {
        Covode.recordClassIndex(80814);
    }

    private C68561bm() {
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        try {
            long c = DiskManagerPage.C68272a.m120561c();
            boolean z = true;
            if (C68192a.m120444a(true)) {
                if (c >= DiskManagerPage.C68272a.m120560b()) {
                    if (System.currentTimeMillis() - C68192a.m120443a().getLong("last_show_disk_manager_dot_time", 0) >= 2592000000L) {
                    }
                }
                z = false;
            }
            vVar.mo143031a(Boolean.valueOf(z));
            vVar.mo143023a();
        } catch (Exception e) {
            vVar.mo143024a((Throwable) e);
        }
    }
}
