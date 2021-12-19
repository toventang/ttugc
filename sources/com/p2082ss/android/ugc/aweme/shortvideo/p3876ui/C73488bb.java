package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14331b;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75464f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75652l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75654n;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83495b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84014f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bb */
public final class C73488bb implements AbstractC84014f {

    /* renamed from: a */
    final ActivityC0945e f165114a;

    /* renamed from: b */
    public final AbstractC84089j f165115b;

    /* renamed from: c */
    private FaceStickerBean f165116c;

    /* renamed from: d */
    private final ShortVideoContext f165117d;

    static {
        Covode.recordClassIndex(86225);
    }

    /* renamed from: a */
    private static boolean m129628a() {
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && cVar.getMusicPriority() >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo116102a(FaceStickerBean faceStickerBean) {
        int i;
        String forceBindMusicPath;
        if (!this.f165114a.isFinishing() && !this.f165117d.f155817b.mo109889b() && !this.f165117d.f155817b.mo109890c()) {
            C70650dt dtVar = this.f165117d.f155817b.f155650f;
            if ((dtVar == null || dtVar.isEmpty()) && faceStickerBean != null && (!C89219l.m154714a(faceStickerBean, this.f165116c))) {
                if (faceStickerBean.isForceBind() && C13617h.m24466b(faceStickerBean.getMusicIds()) && m129628a()) {
                    if (C73495bc.m129632a(faceStickerBean) == null || (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) == null || forceBindMusicPath.length() == 0) {
                        i = null;
                    } else {
                        i = 1;
                    }
                    AbstractC83490a b = AbstractC83490a.C83491a.m143865b(this.f165114a);
                    if (b != null) {
                        b.showMusicTips(i);
                    }
                }
                this.f165116c = faceStickerBean;
            }
        }
    }

    /* renamed from: a */
    public final void mo116104a(Effect effect, Effect effect2) {
        if (effect != null && C83495b.m143877a(effect)) {
            if (effect2 == null || !C83495b.m143877a(effect2)) {
                this.f165115b.mo23120b(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo116103a(FaceStickerBean faceStickerBean, boolean z) {
        boolean z2;
        String forceBindMusicPath;
        C89378p<Effect, Boolean> stickerMusicCancelState;
        Boolean second;
        C89378p<Effect, Boolean> stickerMusicCancelState2;
        Effect first;
        C69905c cVar;
        C89219l.m154721d(faceStickerBean, "");
        if (!this.f165114a.isFinishing() && !this.f165117d.f155817b.mo109889b() && !this.f165117d.f155817b.mo109890c() && !this.f165117d.mo110022c()) {
            C70650dt dtVar = this.f165117d.f155817b.f155650f;
            if (dtVar == null || dtVar.isEmpty()) {
                C70005cr a = C70005cr.m123611a();
                C89219l.m154716b(a, "");
                a.f156493m = Boolean.valueOf(faceStickerBean.isBusi());
                String str = null;
                if (!C63238c.f143594u.mo93901a() && AVCommerceServiceImpl.m102988h().mo93962a() && ((cVar = C70005cr.m123611a().f156482a) == null || !cVar.isCommerceMusic())) {
                    C70005cr.m123611a().mo70083a((C69905c) null);
                    AbstractC83490a b = AbstractC83490a.C83491a.m143865b(this.f165114a);
                    if (b != null) {
                        b.clearMusic();
                    }
                }
                C69905c a2 = C73495bc.m129632a(faceStickerBean);
                C69905c cVar2 = C70005cr.m123611a().f156482a;
                if (a2 != null ? !(cVar2 != null && a2.getMusicPriority() < cVar2.getMusicPriority()) : !(cVar2 == null || cVar2.getMusicPriority() >= 0)) {
                    String valueOf = String.valueOf(faceStickerBean.getStickerId());
                    AbstractC83490a b2 = AbstractC83490a.C83491a.m143865b(this.f165114a);
                    if (!(b2 == null || (stickerMusicCancelState2 = b2.getStickerMusicCancelState()) == null || (first = stickerMusicCancelState2.getFirst()) == null)) {
                        str = first.getEffectId();
                    }
                    if (C89219l.m154714a((Object) valueOf, (Object) str)) {
                        AbstractC83490a b3 = AbstractC83490a.C83491a.m143865b(this.f165114a);
                        if (!(b3 == null || (stickerMusicCancelState = b3.getStickerMusicCancelState()) == null || (second = stickerMusicCancelState.getSecond()) == null)) {
                            z2 = second.booleanValue();
                        }
                        z2 = false;
                    } else {
                        if (FaceStickerBean.NONE == faceStickerBean || C73495bc.m129632a(faceStickerBean) == null || (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) == null || forceBindMusicPath.length() == 0) {
                            z2 = true;
                        }
                        z2 = false;
                    }
                    AbstractC83490a b4 = AbstractC83490a.C83491a.m143865b(this.f165114a);
                    if (b4 != null) {
                        b4.onChooseMusicDone(z2, "", C73495bc.m129632a(faceStickerBean), faceStickerBean.getForceBindMusicPath());
                    }
                    C40888d dVar = new C40888d(z2, "", C73495bc.m129632a(faceStickerBean), faceStickerBean.getForceBindMusicPath(), !z);
                    C70005cr.m123611a().mo70083a(C73495bc.m129632a(faceStickerBean));
                    AbstractC83490a b5 = AbstractC83490a.C83491a.m143865b(this.f165114a);
                    if (b5 != null) {
                        b5.handleChooseMusic(dVar);
                    }
                }
                if (!z) {
                    mo116102a(faceStickerBean);
                }
            }
        }
    }

    public C73488bb(ActivityC0945e eVar, AbstractC1204m mVar, ShortVideoContext shortVideoContext, AbstractC84089j jVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(jVar, "");
        this.f165114a = eVar;
        this.f165117d = shortVideoContext;
        this.f165115b = jVar;
        jVar.mo23128j().mo6997a(mVar, new AbstractC2565m(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734891 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165118a;

            static {
                Covode.recordClassIndex(86226);
            }

            {
                this.f165118a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Object obj) {
                AbstractC83490a b;
                C73488bb bbVar = this.f165118a;
                FaceStickerBean a = C75464f.m132334a((Effect) obj, "");
                C89219l.m154716b(a, "");
                bbVar.mo116103a(a, C75346e.m132161c(this.f165118a.f165115b));
                C73488bb bbVar2 = this.f165118a;
                AbstractC83490a b2 = AbstractC83490a.C83491a.m143865b(bbVar2.f165114a);
                if (b2 != null) {
                    b2.stopStickerBGM();
                }
                if (C70005cr.m123611a().f156482a != null && (b = AbstractC83490a.C83491a.m143865b(bbVar2.f165114a)) != null) {
                    b.startPreviewMusic(false);
                }
            }
        });
        jVar.mo23167t().mo119302n().mo119323b().observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734902 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165119a;

            static {
                Covode.recordClassIndex(86227);
            }

            {
                this.f165119a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                Effect effect;
                Boolean bool;
                AbstractC83490a b;
                AbstractC83490a b2;
                C89378p<Effect, Boolean> stickerMusicCancelState;
                C89378p<Effect, Boolean> stickerMusicCancelState2;
                Effect effect2 = (Effect) obj;
                FaceStickerBean a = C75464f.m132334a(effect2, "");
                C89219l.m154716b(a, "");
                AbstractC83490a b3 = AbstractC83490a.C83491a.m143865b(this.f165119a.f165114a);
                if (b3 == null || (stickerMusicCancelState2 = b3.getStickerMusicCancelState()) == null) {
                    effect = null;
                } else {
                    effect = stickerMusicCancelState2.getFirst();
                }
                AbstractC83490a b4 = AbstractC83490a.C83491a.m143865b(this.f165119a.f165114a);
                if (b4 == null || (stickerMusicCancelState = b4.getStickerMusicCancelState()) == null) {
                    bool = null;
                } else {
                    bool = stickerMusicCancelState.getSecond();
                }
                if (!(effect2 == null || effect == null || bool == null || !(!C89219l.m154714a((Object) effect.getEffectId(), (Object) String.valueOf(a.getStickerId()))) || (b2 = AbstractC83490a.C83491a.m143865b(this.f165119a.f165114a)) == null)) {
                    b2.setStickerMusicCancelState(null);
                }
                if (((a != null && a.getEffectType() == 1) || C75466g.m132348b(a) || a.isBusi() || !C72847c.m128629a(a.getExtra(), "photosensitive")) && !C72847c.m128635c(a)) {
                    C73488bb bbVar = this.f165119a;
                    bbVar.mo116103a(a, C75346e.m132161c(bbVar.f165115b));
                }
                if (C72847c.m128642h(effect2) && C70005cr.m123611a().f156482a != null && (b = AbstractC83490a.C83491a.m143865b(this.f165119a.f165114a)) != null) {
                    b.changeCancelMusicBtnVisible(false);
                }
            }
        });
        jVar.mo23167t().mo119302n().mo119327d().observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734913 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165120a;

            static {
                Covode.recordClassIndex(86228);
            }

            {
                this.f165120a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                AbstractC83490a b;
                C75654n nVar = (C75654n) obj;
                Effect effect = nVar.f170067a;
                if (effect != null && (!C89219l.m154714a(effect, nVar.f170068b))) {
                    FaceStickerBean a = C75464f.m132334a(effect, "");
                    C89219l.m154716b(a, "");
                    if (a.isForceBind()) {
                        C69905c a2 = C73495bc.m129632a(a);
                        C69905c cVar = C70005cr.m123611a().f156482a;
                        if (!(a2 == null || cVar == null || !C89219l.m154714a((Object) a2.getMusicId(), (Object) cVar.getMusicId()) || (b = AbstractC83490a.C83491a.m143865b(this.f165120a.f165114a)) == null)) {
                            b.clearMusic();
                        }
                    }
                }
                this.f165120a.mo116104a(nVar.f170067a, nVar.f170068b);
            }
        });
        jVar.mo23167t().mo119302n().mo119328e().observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734924 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165121a;

            static {
                Covode.recordClassIndex(86229);
            }

            {
                this.f165121a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C75652l lVar = (C75652l) obj;
                this.f165121a.mo116104a(lVar.f170065a.f170063a, lVar.f170066b.f170063a);
            }
        });
        jVar.mo23119b().mo6997a(mVar, new AbstractC2565m(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734935 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165122a;

            static {
                Covode.recordClassIndex(86230);
            }

            {
                this.f165122a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Object obj) {
                AbstractC14331b bVar = (AbstractC14331b) obj;
                if (bVar instanceof AbstractC14331b.C14332a) {
                    Effect effect = ((AbstractC14331b.C14332a) bVar).f34705a;
                    C73488bb bbVar = this.f165122a;
                    FaceStickerBean a = C75464f.m132334a(effect, "");
                    C89219l.m154716b(a, "");
                    bbVar.mo116103a(a, C75346e.m132161c(this.f165122a.f165115b));
                }
            }
        });
        jVar.mo23122d().mo6997a(mVar, new AbstractC2565m(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73488bb.C734946 */

            /* renamed from: a */
            final /* synthetic */ C73488bb f165123a;

            static {
                Covode.recordClassIndex(86231);
            }

            {
                this.f165123a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    C73488bb bbVar = this.f165123a;
                    bbVar.mo116102a(bbVar.f165115b.mo23127i());
                }
            }
        });
    }
}
