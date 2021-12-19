package com.p2082ss.android.ugc.aweme.challenge.service;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.p2447c.AbstractC35499b;
import com.p2082ss.android.ugc.aweme.challenge.p2447c.C35497a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35585l;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35583j;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.EnumC35572d;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b.C37538a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer */
public class ChallengeDetailProvicer implements IChallengeDetailProvider {
    static {
        Covode.recordClassIndex(42759);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    /* renamed from: a */
    public final AbstractC35585l mo62521a() {
        return new AbstractC35585l() {
            /* class com.p2082ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer.C355411 */

            /* renamed from: b */
            private AbstractC37540a f83820b = CommerceChallengeServiceImpl.m75741e().mo65377a();

            static {
                Covode.recordClassIndex(42760);
            }

            @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35585l
            /* renamed from: a */
            public final void mo62523a(float f) {
                this.f83820b.mo65365a(f);
            }

            @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35585l
            /* renamed from: a */
            public final void mo62525a(ChallengeDetail challengeDetail) {
                this.f83820b.mo65370a(challengeDetail.challenge, challengeDetail.slideTitle, challengeDetail.slideList);
            }

            @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35585l
            /* renamed from: a */
            public final void mo62524a(FrameLayout frameLayout, C35583j jVar) {
                int i;
                AbstractC37540a aVar = this.f83820b;
                if (jVar.f83913c == EnumC35572d.TYPE_NORMAL) {
                    i = 0;
                } else {
                    i = 1;
                }
                aVar.mo65368a(frameLayout, new C37538a(i, jVar.f83914d));
                this.f83820b.mo65373c((ViewStub) frameLayout.findViewById(R.id.fhi));
                this.f83820b.mo65367a((ViewStub) frameLayout.findViewById(R.id.fha));
                this.f83820b.mo65374d((ViewStub) frameLayout.findViewById(R.id.fhb));
                this.f83820b.mo65372b((ViewStub) frameLayout.findViewById(R.id.fhc));
                if (jVar.f83913c == EnumC35572d.TYPE_TRANSFORM) {
                    this.f83820b.mo65366a(frameLayout.findViewById(R.id.emz));
                    this.f83820b.mo65371a((CheckableImageView) frameLayout.findViewById(R.id.c0o));
                    this.f83820b.mo65369a((TextView) frameLayout.findViewById(R.id.f6e));
                }
            }
        };
    }

    /* renamed from: b */
    public static IChallengeDetailProvider m72635b() {
        MethodCollector.m26663i(2678);
        Object a = C81908b.m141854a(IChallengeDetailProvider.class, false);
        if (a != null) {
            IChallengeDetailProvider iChallengeDetailProvider = (IChallengeDetailProvider) a;
            MethodCollector.m26664o(2678);
            return iChallengeDetailProvider;
        }
        if (C81908b.f183143Z == null) {
            synchronized (IChallengeDetailProvider.class) {
                try {
                    if (C81908b.f183143Z == null) {
                        C81908b.f183143Z = new ChallengeDetailProvicer();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2678);
                    throw th;
                }
            }
        }
        ChallengeDetailProvicer challengeDetailProvicer = (ChallengeDetailProvicer) C81908b.f183143Z;
        MethodCollector.m26664o(2678);
        return challengeDetailProvicer;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    /* renamed from: a */
    public final void mo62522a(AbstractC35499b bVar) {
        C35497a.f83723a.mo123715a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    /* renamed from: a */
    public final AbstractC35547d mo62520a(View view, Fragment fragment) {
        return ((AbstractC35499b) C35497a.f83723a.mo123714a()).mo62402a(view, fragment);
    }
}
