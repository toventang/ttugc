package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38274a;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38298e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.g */
public final class C38290g extends AbstractC38297d {

    /* renamed from: c */
    public Animator f90481c;

    /* renamed from: d */
    private Animator f90482d;

    static {
        Covode.recordClassIndex(45777);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: f */
    public final boolean mo66878f() {
        return !C89219l.m154714a((Object) this.f90510b.f90522l, (Object) "popupmask");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: e */
    public final void mo66873e() {
        super.mo66873e();
        Animator animator = this.f90481c;
        if (animator != null) {
            animator.cancel();
        }
        this.f90481c = null;
        Animator animator2 = this.f90482d;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f90482d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: a */
    public final void mo66869a() {
        m77676a("WidgetShowState---handle");
        this.f90510b.mo66893b("badge");
        this.f90510b.f90516f.setVisibility(8);
        if (this.f90510b.f90517g != null) {
            this.f90510b.f90524n.setVisibility(8);
            return;
        }
        PointF c = this.f90510b.mo66895c();
        if (this.f90510b.f90515e.getTranslationY() != c.y) {
            Animator a = C38274a.m77637a(this.f90510b.f90515e, c.y);
            this.f90482d = a;
            if (a != null) {
                a.start();
            }
        }
        this.f90510b.mo66892a("become_widget", new Point((int) this.f90510b.f90515e.getTranslationX(), (int) this.f90510b.f90515e.getTranslationY()), null);
        DataCenter dataCenter = this.f90510b.f90518h;
        if (dataCenter != null) {
            dataCenter.mo60191a("ON_AD_PLAY_FUN_STATE_WIDGET_SHOW", (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38290g(C38298e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }
}
