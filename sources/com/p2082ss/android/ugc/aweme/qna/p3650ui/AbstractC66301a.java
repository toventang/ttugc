package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.a */
public abstract class AbstractC66301a implements AppBarLayout.AbstractC26571c {

    /* renamed from: a */
    private EnumC66302a f149080a = EnumC66302a.IDLE;

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.a$a */
    public enum EnumC66302a {
        EXPANDED,
        COLLAPSED,
        IDLE;

        static {
            Covode.recordClassIndex(77813);
        }
    }

    static {
        Covode.recordClassIndex(77812);
    }

    /* renamed from: a */
    public abstract void mo105029a(EnumC66302a aVar);

    @Override // com.google.android.material.appbar.AppBarLayout.AbstractC26569a
    /* renamed from: a */
    public final void mo15197a(AppBarLayout appBarLayout, int i) {
        C89219l.m154721d(appBarLayout, "");
        if (i == 0 && this.f149080a != EnumC66302a.EXPANDED) {
            mo105029a(EnumC66302a.EXPANDED);
            this.f149080a = EnumC66302a.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange() && this.f149080a != EnumC66302a.COLLAPSED) {
            mo105029a(EnumC66302a.COLLAPSED);
            this.f149080a = EnumC66302a.COLLAPSED;
        } else if (i != 0 && this.f149080a != EnumC66302a.IDLE) {
            mo105029a(EnumC66302a.IDLE);
            this.f149080a = EnumC66302a.IDLE;
        }
    }
}
