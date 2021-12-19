package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20724a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.experiment.C46980gm;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.p2359ay.C34363c;
import com.p2082ss.android.ugc.aweme.utils.C80397em;

/* renamed from: com.ss.android.ugc.aweme.common.a.a */
public abstract class AbstractC39054a extends AbstractC39059e<Aweme> {

    /* renamed from: k */
    protected C34363c.AbstractC34364a f92225k;

    /* renamed from: l */
    protected AbstractC20724a f92226l = new AbstractC20724a() {
        /* class com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a.C390551 */

        static {
            Covode.recordClassIndex(46671);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20724a
        /* renamed from: a */
        public final void mo34144a() {
            AbstractC39054a aVar = AbstractC39054a.this;
            if (!aVar.f92234p && C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false)) {
                aVar.f92232n.mo34198c();
            }
        }
    };

    static {
        Covode.recordClassIndex(46670);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int[] mo62380b() {
        return C80397em.m139369a(200);
    }

    public AbstractC39054a(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67788a(UrlModel urlModel, String str) {
        mo67789a(urlModel, str, (Bitmap.Config) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo67790a(Video video, String str) {
        return mo67791a(video, str, (Bitmap.Config) null);
    }

    /* renamed from: a */
    public boolean mo67791a(Video video, String str, Bitmap.Config config) {
        if (!mo67807g() || !C34363c.m70318a(C34363c.f81236a, this.f92232n, video, str, true, this.f92225k, true, config, 256)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67789a(UrlModel urlModel, String str, Bitmap.Config config) {
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        int[] b = mo62380b();
        if (b != null) {
            a.mo34185b(b);
        }
        a.f49092E = this.f92232n;
        C20766v a2 = a.mo34179a(str);
        if (config != null) {
            a2.f49124u = config;
        }
        a2.mo34186c();
        if (this.f92231m != null && ((Aweme) this.f92231m).getVideo() != null && !C46980gm.m90260a()) {
            ((Aweme) this.f92231m).getVideo().setCachedOuterCoverUrl(urlModel);
            ((Aweme) this.f92231m).getVideo().setCachedOuterCoverSize(b);
        }
    }
}
