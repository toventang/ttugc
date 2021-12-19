package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.gift.DialogC36454e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ap */
public final /* synthetic */ class RunnableC37024ap implements Runnable {

    /* renamed from: a */
    private final C37157k f87204a;

    /* renamed from: b */
    private final Aweme f87205b;

    /* renamed from: c */
    private final boolean f87206c;

    static {
        Covode.recordClassIndex(44378);
    }

    RunnableC37024ap(C37157k kVar, Aweme aweme, boolean z) {
        this.f87204a = kVar;
        this.f87205b = aweme;
        this.f87206c = z;
    }

    public final void run() {
        C37157k kVar = this.f87204a;
        Aweme aweme = this.f87205b;
        boolean z = this.f87206c;
        ActivityC0945e activity = kVar.getActivity();
        String enterFrom = kVar.f87622b.getEnterFrom();
        C37025aq aqVar = new C37025aq(kVar, z, aweme);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(enterFrom, "");
        C89219l.m154721d(aqVar, "");
        DialogC36454e eVar = new DialogC36454e(activity, aweme, enterFrom, aqVar);
        Window window = eVar.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.flags = attributes.flags | 2 | 32 | 262144;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.drawable.lu);
        }
        eVar.show();
    }
}
