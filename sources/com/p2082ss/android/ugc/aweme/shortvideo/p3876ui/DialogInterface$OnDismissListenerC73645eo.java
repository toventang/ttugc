package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71822c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.eo */
public final /* synthetic */ class DialogInterface$OnDismissListenerC73645eo implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final C73560cj f165474a;

    static {
        Covode.recordClassIndex(86383);
    }

    DialogInterface$OnDismissListenerC73645eo(C73560cj cjVar) {
        this.f165474a = cjVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String str2;
        C73560cj cjVar = this.f165474a;
        AbstractC23219c a = C23226a.C23228b.m43785a(dialogInterface);
        int permission = cjVar.f165339n.f156258b.getPermission();
        String str3 = cjVar.f165303aa;
        C89219l.m154721d(a, "");
        C89219l.m154721d(str3, "");
        if (a instanceof C71822c) {
            str = "click_post";
        } else if (a instanceof AbstractC23219c.C23223d) {
            str = "click_cross";
        } else {
            str = a instanceof AbstractC23219c.C23220a ? "made_choice" : "background";
        }
        C84425b a2 = new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("enter_method", str3).mo129406a("exit_method", str);
        if (permission == 0) {
            str2 = "everyone";
        } else {
            str2 = permission == 2 ? "friends" : permission == 1 ? "private" : "empty";
        }
        C39162r.m79460a("audience_select_bottom_sheet_results", a2.mo129406a("audience_choice", str2).f188764a);
    }
}
