package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b;

import android.animation.ValueAnimator;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c */
public final class C76248c implements AbstractC1214u<Boolean> {

    /* renamed from: a */
    TabLayout f171290a;

    /* renamed from: b */
    final AbstractC1204m f171291b;

    /* renamed from: c */
    final AbstractC75655o f171292c;

    /* renamed from: d */
    private final AbstractC75361b f171293d;

    /* renamed from: e */
    private final StickerPreferences f171294e;

    static {
        Covode.recordClassIndex(89198);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c$a */
    static final class RunnableC76249a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84984j f171295a;

        static {
            Covode.recordClassIndex(89199);
        }

        RunnableC76249a(C84984j jVar) {
            this.f171295a = jVar;
        }

        public final void run() {
            C84984j jVar = this.f171295a;
            jVar.mo129823b(jVar.getSelectColor());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c$b */
    static final class RunnableC76250b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout.C73104f f171296a;

        /* renamed from: b */
        final /* synthetic */ C84984j f171297b;

        static {
            Covode.recordClassIndex(89200);
        }

        RunnableC76250b(TabLayout.C73104f fVar, C84984j jVar) {
            this.f171296a = fVar;
            this.f171297b = jVar;
        }

        public final void run() {
            if (!this.f171296a.mo115587b()) {
                this.f171296a.f164127h.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76248c.RunnableC76250b.RunnableC762511 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC76250b f171298a;

                    static {
                        Covode.recordClassIndex(89201);
                    }

                    {
                        this.f171298a = r1;
                    }

                    public final void run() {
                        this.f171298a.f171297b.mo129823b(this.f171298a.f171297b.getUnSelectColor());
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c$c */
    static final class C76252c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TabLayout.C73104f f171299a;

        static {
            Covode.recordClassIndex(89202);
        }

        C76252c(TabLayout.C73104f fVar) {
            this.f171299a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.C73108i iVar = this.f171299a.f164127h;
            C89219l.m154716b(iVar, "");
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            iVar.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.c$d */
    static final class C76253d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TabLayout.C73104f f171300a;

        static {
            Covode.recordClassIndex(89203);
        }

        C76253d(TabLayout.C73104f fVar) {
            this.f171300a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.C73108i iVar = this.f171300a.f164127h;
            C89219l.m154716b(iVar, "");
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            iVar.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    @Override // androidx.lifecycle.AbstractC1214u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Boolean r11) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76248c.onChanged(java.lang.Object):void");
    }

    public C76248c(AbstractC1204m mVar, AbstractC75361b bVar, AbstractC75655o oVar, StickerPreferences stickerPreferences) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(stickerPreferences, "");
        this.f171291b = mVar;
        this.f171293d = bVar;
        this.f171292c = oVar;
        this.f171294e = stickerPreferences;
    }
}
