package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71435d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.h */
public final class C71484h {

    /* renamed from: a */
    public AbstractC71496a f160181a;

    /* renamed from: b */
    public AbstractC71435d f160182b;

    /* renamed from: c */
    final C71436a f160183c = new C71436a();

    static {
        Covode.recordClassIndex(84018);
    }

    /* renamed from: a */
    private final void m126259a() {
        AbstractC71496a aVar = this.f160181a;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        aVar.mo113214i();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.h$a */
    public static final class C71485a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C71484h f160184a;

        static {
            Covode.recordClassIndex(84019);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71485a(C71484h hVar) {
            this.f160184a = hVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            C71484h.m126258a(this.f160184a).mo113212g();
            C71484h.m126260b(this.f160184a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC71496a m126258a(C71484h hVar) {
        AbstractC71496a aVar = hVar.f160181a;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC71435d m126260b(C71484h hVar) {
        AbstractC71435d dVar = hVar.f160182b;
        if (dVar == null) {
            C89219l.m154710a("statusChangeListener");
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.h$b */
    public static final class C71486b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C71484h f160185a;

        /* renamed from: b */
        final /* synthetic */ boolean f160186b;

        /* renamed from: c */
        final /* synthetic */ boolean f160187c;

        static {
            Covode.recordClassIndex(84020);
        }

        public final void onAnimationEnd(Animator animator) {
            if (animator != null) {
                super.onAnimationEnd(animator);
            }
            C71484h.m126260b(this.f160185a).mo113052a(this.f160186b, this.f160187c);
            C71484h.m126258a(this.f160185a).mo113213h();
            C71484h.m126260b(this.f160185a).mo113053b();
        }

        C71486b(C71484h hVar, boolean z, boolean z2) {
            this.f160185a = hVar;
            this.f160186b = z;
            this.f160187c = z2;
        }
    }

    /* renamed from: a */
    public final void mo113107a(VideoSegment videoSegment) {
        mo113110b(videoSegment);
        AbstractC71496a aVar = this.f160181a;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        aVar.mo113212g();
        if (this.f160182b == null) {
            C89219l.m154710a("statusChangeListener");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo113110b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            AbstractC71496a aVar = this.f160181a;
            if (aVar == null) {
                C89219l.m154710a("viewManager");
            }
            aVar.mo113215j();
        }
    }

    /* renamed from: a */
    public final void mo113108a(AbstractC71435d dVar) {
        C89219l.m154721d(dVar, "");
        this.f160182b = dVar;
    }

    /* renamed from: a */
    public final void mo113109a(AbstractC71496a aVar) {
        C89219l.m154721d(aVar, "");
        this.f160181a = aVar;
    }

    /* renamed from: a */
    public final void mo113106a(ActivityC0945e eVar, int i, boolean z, boolean z2) {
        m126259a();
        m126261b(eVar, i, z, z2);
    }

    /* renamed from: b */
    private final void m126261b(ActivityC0945e eVar, int i, boolean z, boolean z2) {
        AbstractC71496a aVar = this.f160181a;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        aVar.mo113193a(eVar, i, new C71486b(this, z, z2));
    }
}
