package com.p2082ss.android.ugc.aweme.commercialize.playfun.p2606a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d;
import com.p2082ss.android.ugc.aweme.commercialize.playfun.C38298e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a */
public class C38276a extends AbstractC38297d {

    /* renamed from: c */
    public Animator f90471c;

    static {
        Covode.recordClassIndex(45763);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: a */
    public void mo66869a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: b */
    public void mo66871b() {
        int i = Build.VERSION.SDK_INT;
        Animator animator = this.f90471c;
        if (animator != null) {
            animator.pause();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: c */
    public void mo66872c() {
        int i = Build.VERSION.SDK_INT;
        Animator animator = this.f90471c;
        if (animator != null) {
            animator.resume();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.playfun.AbstractC38297d
    /* renamed from: e */
    public void mo66873e() {
        Animator animator = this.f90471c;
        if (animator != null) {
            animator.cancel();
        }
        mo66870a((Animator) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a$a */
    public static final class C38277a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38276a f90472a;

        static {
            Covode.recordClassIndex(45764);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38277a(C38276a aVar) {
            this.f90472a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f90472a.mo66888g();
        }

        public final void onAnimationCancel(Animator animator) {
            this.f90472a.f90510b.mo66890a(1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38276a(C38298e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66870a(Animator animator) {
        this.f90471c = animator;
        if (animator != null) {
            animator.addListener(new C38277a(this));
        }
    }
}
