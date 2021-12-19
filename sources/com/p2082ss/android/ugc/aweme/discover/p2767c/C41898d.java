package com.p2082ss.android.ugc.aweme.discover.p2767c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41728j;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.c.d */
public final class C41898d implements AbstractC1214u<C89378p<? extends Integer, ? extends Long>> {

    /* renamed from: a */
    public MusicPlayHelper f97750a;

    /* renamed from: b */
    public Animation f97751b;

    /* renamed from: c */
    public String f97752c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f97753d;

    /* renamed from: e */
    public Music f97754e;

    /* renamed from: f */
    public String f97755f;

    /* renamed from: g */
    public String f97756g;

    /* renamed from: h */
    public ImageView f97757h;

    /* renamed from: i */
    public ActivityC0945e f97758i;

    /* renamed from: j */
    public AbstractC41728j f97759j;

    /* renamed from: k */
    public final AbstractC41900a f97760k;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.d$a */
    public interface AbstractC41900a {

        /* renamed from: a */
        public static final C41901a f97762a = C41901a.f97763a;

        static {
            Covode.recordClassIndex(49826);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.c.d$a$a */
        public static final class C41901a {

            /* renamed from: a */
            static final /* synthetic */ C41901a f97763a = new C41901a();

            private C41901a() {
            }

            static {
                Covode.recordClassIndex(49827);
            }
        }
    }

    static {
        Covode.recordClassIndex(49824);
    }

    /* renamed from: a */
    private final void m83937a() {
        long j;
        this.f97757h.clearAnimation();
        MusicPlayHelper musicPlayHelper = this.f97750a;
        Music music = this.f97754e;
        long j2 = -1;
        if (music != null) {
            j = music.getId();
        } else {
            j = -1;
        }
        if (musicPlayHelper.mo71130a(j)) {
            this.f97757h.setImageResource(2131233611);
            this.f97750a.mo71128a(this.f97758i, this);
            return;
        }
        MusicPlayHelper musicPlayHelper2 = this.f97750a;
        Music music2 = this.f97754e;
        if (music2 != null) {
            j2 = music2.getId();
        }
        if (musicPlayHelper2.mo71131b(j2)) {
            this.f97757h.setImageResource(2131233619);
            this.f97757h.startAnimation(this.f97751b);
            return;
        }
        this.f97757h.setImageResource(2131233620);
        this.f97750a.mo71129a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C89378p<? extends Integer, ? extends Long> pVar) {
        m83937a();
    }

    /* renamed from: a */
    public final void mo71057a(Music music) {
        this.f97754e = music;
        m83937a();
    }

    /* renamed from: b */
    public final void mo71059b(String str) {
        C89219l.m154721d(str, "");
        this.f97755f = str;
    }

    /* renamed from: c */
    public final void mo71061c(String str) {
        C89219l.m154721d(str, "");
        this.f97756g = str;
    }

    /* renamed from: a */
    public final void mo71058a(String str) {
        C89219l.m154721d(str, "");
        this.f97752c = str;
    }

    /* renamed from: b */
    public final boolean mo71060b(Music music) {
        long j;
        MusicPlayHelper musicPlayHelper = this.f97750a;
        long j2 = -1;
        if (music != null) {
            j = music.getId();
        } else {
            j = -1;
        }
        if (musicPlayHelper.mo71130a(j)) {
            return true;
        }
        MusicPlayHelper musicPlayHelper2 = this.f97750a;
        if (music != null) {
            j2 = music.getId();
        }
        if (musicPlayHelper2.mo71131b(j2)) {
            return true;
        }
        return false;
    }

    private C41898d(ImageView imageView, ActivityC0945e eVar, AbstractC41728j jVar) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(eVar, "");
        MethodCollector.m26663i(8692);
        this.f97757h = imageView;
        this.f97758i = eVar;
        this.f97759j = jVar;
        this.f97760k = null;
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
        C89219l.m154716b(a, "");
        this.f97750a = (MusicPlayHelper) a;
        this.f97751b = AnimationUtils.loadAnimation(this.f97758i, R.anim.db);
        this.f97752c = "";
        this.f97755f = "";
        this.f97756g = "";
        this.f97757h.setVisibility(0);
        this.f97757h.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2767c.C41898d.View$OnClickListenerC418991 */

            /* renamed from: a */
            final /* synthetic */ C41898d f97761a;

            static {
                Covode.recordClassIndex(49825);
            }

            {
                this.f97761a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r10) {
                /*
                // Method dump skipped, instructions count: 203
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2767c.C41898d.View$OnClickListenerC418991.onClick(android.view.View):void");
            }
        });
        MethodCollector.m26664o(8692);
    }

    private /* synthetic */ C41898d(ImageView imageView, ActivityC0945e eVar, AbstractC41728j jVar, byte b) {
        this(imageView, eVar, jVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C41898d(ImageView imageView, ActivityC0945e eVar, AbstractC41728j jVar, AbstractC89171a<C89391z> aVar) {
        this(imageView, eVar, jVar, (byte) 0);
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f97753d = aVar;
    }
}
