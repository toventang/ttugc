package com.p2082ss.android.ugc.aweme.ttep;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72454b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72458c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73657f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84090k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ttep.aa */
public final /* synthetic */ class RunnableC79167aa implements Runnable {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f177957a;

    static {
        Covode.recordClassIndex(92354);
    }

    RunnableC79167aa(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f177957a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        C70625d a;
        C69905c cVar;
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f177957a;
        C69926ch chVar = tTEPEffectPreviewActivity.f177942s;
        C84911q.m145921a("addFragment onFragmentActivityCreated PlanC");
        C73657f.m129769a(tTEPEffectPreviewActivity.f177945v);
        if (chVar instanceof AbstractC70630dc) {
            tTEPEffectPreviewActivity.f177935l = (FrameLayout) tTEPEffectPreviewActivity.findViewById(R.id.c5m);
            C84911q.m145921a("addFragment onFragmentActivityCreated initFilterModule");
            tTEPEffectPreviewActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.ViewTreeObserver$OnGlobalLayoutListenerC791591 */

                static {
                    Covode.recordClassIndex(92346);
                }

                public final void onGlobalLayout() {
                    AbstractC14099a aVar = (AbstractC14099a) TTEPEffectPreviewActivity.this.f177929f.mo35252b(AbstractC14099a.class, null);
                    if (aVar != null) {
                        aVar.mo22652c();
                    }
                    TTEPEffectPreviewActivity.this.mo122957s().mo110052c();
                    TTEPEffectPreviewActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            AbstractC84089j q = tTEPEffectPreviewActivity.mo122954q();
            q.mo128903K();
            q.mo23132n();
            C73806f.m129872a(new C79262h(tTEPEffectPreviewActivity, q));
            tTEPEffectPreviewActivity.mo122954q().mo128895C().mo128853a();
            if (tTEPEffectPreviewActivity.f177949z == null) {
                tTEPEffectPreviewActivity.f177949z = (AbstractC83566a) tTEPEffectPreviewActivity.f177928e.getValue().mo7013a(AbstractC83566a.class);
            }
            if (tTEPEffectPreviewActivity.getIntent() != null && (((a = C63238c.f143581h.mo101535a(tTEPEffectPreviewActivity.getIntent().getSerializableExtra("music_wave_data"))) != null && C70612k.C70614b.m124761a(a.getMusicWavePointArray())) || ((cVar = C70005cr.m123611a().f156482a) != null && C70612k.C70614b.m124761a(cVar.getMusicWaveData()) && (a = C70612k.m124748b(cVar)) != null && C70612k.C70614b.m124761a(a.getMusicWavePointArray())))) {
                if (tTEPEffectPreviewActivity.f177949z != null) {
                    tTEPEffectPreviewActivity.f177949z.mo128581a(true);
                }
                tTEPEffectPreviewActivity.f177930g.f155811au = C70612k.m124745a(a);
            } else if (tTEPEffectPreviewActivity.f177930g.f155817b.f155669y != null) {
                C70612k.m124747a(tTEPEffectPreviewActivity.f177930g.f155817b.f155669y, new C79263i(tTEPEffectPreviewActivity));
            }
            if (tTEPEffectPreviewActivity.f177930g != null) {
                AbstractC83406b bVar = (AbstractC83406b) ApiCenter.C2545a.m7450a(tTEPEffectPreviewActivity).mo7015b(AbstractC83406b.class);
                if (tTEPEffectPreviewActivity.f177942s == null || bVar == null) {
                    C72458c.m127839a(tTEPEffectPreviewActivity.f177930g.f155831p);
                } else {
                    bVar.isZTLiveSwitch();
                    C72458c.m127839a(tTEPEffectPreviewActivity.f177930g.f155831p);
                }
            }
            C72454b.f162433c.mo114727a(tTEPEffectPreviewActivity.f177930g.f155828m).observe(tTEPEffectPreviewActivity, new C79334z(tTEPEffectPreviewActivity));
            ((AbstractC83406b) ApiCenter.C2545a.m7450a(tTEPEffectPreviewActivity).mo7013a(AbstractC83406b.class)).getBottomTabIndexChangeEvent().mo6997a(tTEPEffectPreviewActivity, new AbstractC2565m<C83408c>() {
                /* class com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.C791602 */

                static {
                    Covode.recordClassIndex(92347);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
                public final /* synthetic */ void onChanged(C83408c cVar) {
                    boolean z;
                    String obj = cVar.f186277c.toString();
                    if (obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f7k)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f7m)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f7l)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f7z))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C84090k.m144600a(TTEPEffectPreviewActivity.this.f177918G, z);
                }
            });
            if (tTEPEffectPreviewActivity.f177930g.f155817b.f155653i) {
                AbstractC83746a aVar = (AbstractC83746a) ApiCenter.C2545a.m7450a(tTEPEffectPreviewActivity).mo7013a(AbstractC83746a.class);
                aVar.mo128713a(tTEPEffectPreviewActivity.f177930g.mo110038n());
                aVar.mo128711a(0);
                tTEPEffectPreviewActivity.f177915D.mo22917x();
            }
            if (tTEPEffectPreviewActivity.f177930g.mo110022c()) {
                AbstractC83490a a2 = AbstractC83490a.C83491a.m143864a(tTEPEffectPreviewActivity);
                if (C72782a.m128364b(tTEPEffectPreviewActivity.f177930g.f155743D.f155846a)) {
                    C70005cr.m123611a().mo70083a(tTEPEffectPreviewActivity.f177930g.f155743D.f155846a.getMusic());
                    a2.handleChooseMusic(new C40888d(false, "", tTEPEffectPreviewActivity.f177930g.f155743D.f155846a.getMusic(), tTEPEffectPreviewActivity.f177930g.f155743D.f155846a.getMusicPath(), true));
                } else {
                    C70005cr.m123611a().mo70083a((C69905c) null);
                }
                a2.initStitch();
            }
            if (tTEPEffectPreviewActivity.f177938o) {
                tTEPEffectPreviewActivity.f177931h.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.RunnableC791613 */

                    static {
                        Covode.recordClassIndex(92348);
                    }

                    public final void run() {
                        if (TTEPEffectPreviewActivity.this.mo122955r() != null) {
                            TTEPEffectPreviewActivity.this.mo122955r().mo23139a(true);
                        }
                    }
                });
            }
            if (tTEPEffectPreviewActivity.getIntent().getBooleanExtra("from_special_plus", false)) {
                new SuperEntranceEvent(3, false).post();
            }
        }
    }
}
