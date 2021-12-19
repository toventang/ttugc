package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.p2730de.C40980o;
import com.p2082ss.android.ugc.aweme.p2730de.C40981p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73968au;
import com.p2082ss.android.ugc.aweme.sticker.model.C75441c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76066b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.b */
public final class C76067b implements AbstractC76080m {

    /* renamed from: a */
    ASCameraView f170897a;

    /* renamed from: b */
    public Effect f170898b;

    /* renamed from: c */
    public boolean f170899c;

    /* renamed from: d */
    boolean f170900d;

    /* renamed from: e */
    private AbstractC14177d f170901e;

    /* renamed from: f */
    private AbstractC76065a f170902f;

    /* renamed from: g */
    private AbstractC76082o f170903g;

    /* renamed from: h */
    private ActivityC0218d f170904h;

    /* renamed from: i */
    private int f170905i;

    /* renamed from: j */
    private long f170906j;

    /* renamed from: k */
    private boolean f170907k;

    /* renamed from: l */
    private int f170908l;

    /* renamed from: m */
    private AbstractC76077k f170909m;

    /* renamed from: n */
    private AbstractC76079l f170910n;

    /* renamed from: o */
    private AbstractC84919c f170911o;

    /* renamed from: p */
    private AbstractC84917a f170912p = new C76069c(this);

    /* renamed from: q */
    private Map<String, C75441c> f170913q = new HashMap();

    static {
        Covode.recordClassIndex(89012);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: c */
    public final boolean mo119806c() {
        return this.f170907k;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: d */
    public final void mo119807d() {
        this.f170911o.mo87535c(this.f170912p);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: b */
    public final void mo119804b() {
        this.f170899c = false;
        this.f170902f.mo119793b();
    }

    /* renamed from: f */
    private void m133367f() {
        if (this.f170906j > 0) {
            mo119808e().mo110001a(this.f170906j);
            this.f170906j = 0;
        }
    }

    /* renamed from: e */
    public final ShortVideoContext mo119808e() {
        return ((ShortVideoContextViewModel) C1181ae.m3881a(this.f170904h, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class)).f155842a;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: a */
    public final void mo119799a() {
        if (!this.f170897a.mo56984i()) {
            this.f170910n.mo119785b();
            this.f170899c = true;
            if (this.f170906j == 0) {
                this.f170906j = mo119808e().f155817b.f155646b;
            }
            this.f170902f.mo119791a();
            ShortVideoContext e = mo119808e();
            if (!C72847c.m128639e(this.f170898b)) {
                this.f170897a.mo56903a(4097, 0, 0, "");
                if (!e.f155780aN) {
                    e.mo110001a(30000L);
                }
            } else if (!e.f155780aN) {
                e.mo110001a(2147483647L);
            }
            e.mo110027e(1);
            if (e.f155817b.f155666v != null) {
                this.f170897a.mo56903a(4103, (long) e.f155817b.f155666v.gameScore, 0, "");
            }
            this.f170903g.mo119814c();
            this.f170909m.mo119783c();
            this.f170910n.mo119786c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: a */
    public final void mo119800a(Effect effect) {
        m133366b(effect);
        int a = this.f170909m.mo119780a();
        this.f170905i = a;
        if (a != 1) {
            this.f170909m.mo119781a(AbstractC76077k.EnumC76078a.START);
        }
    }

    /* renamed from: b */
    private void m133366b(Effect effect) {
        this.f170898b = effect;
        this.f170902f.mo119792a(effect);
        this.f170907k = true;
        this.f170900d = false;
        ((GameResultViewModel) C1181ae.m3881a(this.f170904h, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class)).f170888a = true;
        this.f170903g.mo119811a();
        m133365a(effect, this.f170903g);
        this.f170897a.mo56929b(false);
        this.f170897a.mo56936e(true);
        this.f170897a.mo56941g(false);
        this.f170897a.mo56918a("", 0L, 0L, false);
        this.f170897a.mo56919a(false);
        if (!this.f170899c) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", effect.getEffectId());
            hashMap.put("shoot_way", mo119808e().f155831p);
            hashMap.put("creation_id", mo119808e().f155830o);
            C63244g.m114602a().mo73263I().mo101634a("enter_prop_game_page", hashMap);
        }
    }

    /* renamed from: b */
    public final void mo119805b(String str) {
        if (this.f170900d) {
            m133367f();
            return;
        }
        this.f170899c = false;
        this.f170910n.mo119789f();
        mo119808e().mo110027e(0);
        if (!C72847c.m128639e(this.f170898b)) {
            this.f170897a.mo56903a(4102, 0, 0, "");
            mo119808e().mo110001a(this.f170906j);
            this.f170903g.mo119813b();
            return;
        }
        int i = this.f170908l;
        if (i == 0) {
            mo119802a(str);
        } else if (i == 1) {
            this.f170902f.mo119795c(this.f170898b);
        }
    }

    /* renamed from: a */
    public final void mo119802a(String str) {
        m133367f();
        if (!this.f170900d) {
            this.f170910n.mo119787d();
            this.f170903g.mo119814c();
            this.f170903g.mo119815d();
            this.f170907k = false;
            ((GameResultViewModel) C1181ae.m3881a(this.f170904h, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class)).f170888a = false;
            this.f170909m.mo119782b();
            mo119808e().mo110027e(0);
            if (mo119808e().f155817b.f155652h.mo110093c() != null) {
                this.f170897a.mo56929b(true);
                this.f170897a.mo56936e(false);
                this.f170897a.mo56941g(false);
                this.f170897a.mo56918a(mo119808e().f155817b.f155652h.mo110093c(), mo119808e().f155817b.mo109895g(), mo119808e().f155775aI, false);
            } else {
                this.f170897a.mo56929b(false);
                this.f170897a.mo56936e(true);
                this.f170897a.mo56941g(false);
            }
            this.f170897a.mo56919a(true);
            if (mo119808e().f155817b.f155666v != null) {
                C73968au.m130096a(str, mo119808e());
                this.f170910n.mo119788e();
            } else {
                this.f170902f.mo119794b(this.f170898b);
                if (!C72847c.m128639e(this.f170898b) && this.f170905i != this.f170909m.mo119780a()) {
                    this.f170909m.mo119781a(AbstractC76077k.EnumC76078a.END);
                }
            }
            this.f170898b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo119803a(int i) {
        if (!this.f170907k || i != 4) {
            return false;
        }
        if (this.f170899c) {
            mo119805b("system_back_button");
            return true;
        }
        mo119802a("system_back_button");
        return true;
    }

    /* renamed from: a */
    private void m133365a(Effect effect, AbstractC76082o oVar) {
        if (C63238c.f143594u.mo93901a() || effect == null || !effect.isBusiness()) {
            return;
        }
        if (!this.f170913q.containsKey(effect.getEffectId()) || this.f170913q.get(effect.getEffectId()) == null || this.f170899c) {
            String effectId = effect.getEffectId();
            C1731i.m5640b(new CallableC76072f(effectId), C1731i.f5562a).mo5534a(new C76073g(this, effect, effectId, oVar), C1731i.f5564c, null);
            return;
        }
        oVar.mo119818a(this.f170913q.get(effect.getEffectId()).getScreenDesc());
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m
    /* renamed from: a */
    public final void mo119801a(Effect effect, String str, int i) {
        this.f170908l = i;
        m133366b(effect);
        if (this.f170898b != null) {
            C40981p a = C40980o.m82513a(this.f170904h, "VideoRecord");
            int a2 = a.mo70159a(this.f170898b.getEffectId());
            this.f170897a.mo56903a(46, 1, (long) a2, str);
            a.mo70162a(this.f170898b.getEffectId(), a2 + 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo119798a(Effect effect, String str, AbstractC76082o oVar, C1731i iVar) {
        if (TextUtils.equals(effect.getEffectId(), str) && !iVar.mo5539b() && !iVar.mo5544c()) {
            try {
                C75441c cVar = ((C75446h) iVar.mo5545d()).mStickers.get(0).commerceSticker;
                this.f170913q.put(str, cVar);
                if (!this.f170899c) {
                    oVar.mo119818a(cVar.getScreenDesc());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public C76067b(ActivityC0218d dVar, AbstractC84919c cVar, AbstractC14177d dVar2, AbstractC76082o oVar, AbstractC76077k kVar, AbstractC76079l lVar, AbstractC76065a aVar) {
        this.f170901e = dVar2;
        this.f170897a = dVar2.mo22747A();
        this.f170902f = aVar;
        this.f170904h = dVar;
        this.f170909m = kVar;
        this.f170910n = lVar;
        this.f170911o = cVar;
        cVar.mo87533b(this.f170912p);
        this.f170903g = oVar;
        oVar.mo119812a(new AbstractC76066b() {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.game.C76067b.C760681 */

            static {
                Covode.recordClassIndex(89013);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76066b
            /* renamed from: b */
            public final void mo119797b() {
                if (C76067b.this.f170899c) {
                    C76067b.this.mo119805b("click_cross");
                } else {
                    C76067b.this.mo119802a("click_cross");
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76066b
            /* renamed from: a */
            public final void mo119796a() {
                String effectId;
                C76067b.this.mo119799a();
                HashMap hashMap = new HashMap();
                if (C76067b.this.f170898b == null) {
                    effectId = "";
                } else {
                    effectId = C76067b.this.f170898b.getEffectId();
                }
                hashMap.put("prop_id", effectId);
                hashMap.put("shoot_way", C76067b.this.mo119808e().f155831p);
                hashMap.put("creation_id", C76067b.this.mo119808e().f155830o);
                C63244g.m114602a().mo73263I().mo101634a("click_game_play_button", hashMap);
            }
        });
        ((GameResultViewModel) C1181ae.m3881a(dVar, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class)).mo119778a().observe(dVar, new C76070d(this, lVar));
        ((GameResultViewModel) C1181ae.m3881a(dVar, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class)).mo119779b().observe(dVar, new C76071e(this, oVar));
    }
}
