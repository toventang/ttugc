package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.es */
final /* synthetic */ class C73649es implements OnActivityResultCallback {

    /* renamed from: a */
    private final C73560cj f165479a;

    static {
        Covode.recordClassIndex(86387);
    }

    C73649es(C73560cj cjVar) {
        this.f165479a = cjVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        C73560cj cjVar = this.f165479a;
        if (i2 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
            cjVar.f165268K.tagUserList = (ArrayList) intent.getSerializableExtra("tagged_user_list");
            cjVar.mo116157g();
        }
    }
}
