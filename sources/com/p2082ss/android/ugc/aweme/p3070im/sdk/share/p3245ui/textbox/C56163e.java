package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e */
public final class C56163e {

    /* renamed from: b */
    public static final C56164a f128107b = new C56164a((byte) 0);

    /* renamed from: a */
    public final ShareTextBoxViewModel f128108a;

    /* renamed from: c */
    private final View f128109c;

    static {
        Covode.recordClassIndex(65964);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.e$a */
    public static final class C56164a {
        static {
            Covode.recordClassIndex(65965);
        }

        private C56164a() {
        }

        public /* synthetic */ C56164a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo93011a() {
        this.f128109c.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo93012b() {
        this.f128109c.setVisibility(8);
        C55232u.f126318a.clear();
    }

    public C56163e(View view, ShareTextBoxViewModel shareTextBoxViewModel, Set<? extends IMContact> set, boolean z, C56147d dVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(shareTextBoxViewModel, "");
        C89219l.m154721d(dVar, "");
        this.f128109c = view;
        this.f128108a = shareTextBoxViewModel;
        if (set == null || set.isEmpty()) {
            mo93012b();
        } else {
            mo93011a();
        }
        dVar.mo93006a(z);
    }
}
