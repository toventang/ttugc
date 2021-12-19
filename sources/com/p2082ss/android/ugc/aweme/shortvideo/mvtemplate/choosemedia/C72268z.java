package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.z */
public final class C72268z implements AbstractC72262u {

    /* renamed from: a */
    public AVChallenge f162010a;

    static {
        Covode.recordClassIndex(84933);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72262u
    /* renamed from: a */
    public final Bundle mo114484a() {
        if (this.f162010a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key_mv_challenge", this.f162010a);
        return bundle;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.z$a */
    static final class C72269a<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C72268z f162011a;

        static {
            Covode.recordClassIndex(84934);
        }

        C72269a(C72268z zVar) {
            this.f162011a = zVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo2720a(Object obj) {
            this.f162011a.f162010a = (AVChallenge) obj;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72262u
    /* renamed from: a */
    public final void mo114485a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("Key_challenge_id");
        if (string == null) {
            C89219l.m154715b();
        }
        C63238c.f143577d.mo93808a(string, new C72269a(this));
    }
}
