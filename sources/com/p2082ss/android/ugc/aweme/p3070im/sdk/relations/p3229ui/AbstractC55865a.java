package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui;

import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a */
public abstract class AbstractC55865a implements AppBarLayout.AbstractC26571c {

    /* renamed from: a */
    private EnumC55866a f127339a = EnumC55866a.IDLE;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a$a */
    public enum EnumC55866a {
        EXPANDED,
        COLLAPSED,
        IDLE;

        static {
            Covode.recordClassIndex(65656);
        }
    }

    static {
        Covode.recordClassIndex(65655);
    }

    /* renamed from: a */
    public abstract void mo92713a(EnumC55866a aVar);

    @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
    /* renamed from: a */
    public final void mo15197a(AppBarLayout appBarLayout, int i) {
        EnumC55866a aVar;
        C89219l.m154721d(appBarLayout, "");
        if (i == 0) {
            if (this.f127339a != EnumC55866a.EXPANDED) {
                mo92713a(EnumC55866a.EXPANDED);
            }
            aVar = EnumC55866a.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.f127339a != EnumC55866a.COLLAPSED) {
                mo92713a(EnumC55866a.COLLAPSED);
            }
            aVar = EnumC55866a.COLLAPSED;
        } else {
            if (this.f127339a != EnumC55866a.IDLE) {
                mo92713a(EnumC55866a.IDLE);
            }
            aVar = EnumC55866a.IDLE;
        }
        this.f127339a = aVar;
    }
}
