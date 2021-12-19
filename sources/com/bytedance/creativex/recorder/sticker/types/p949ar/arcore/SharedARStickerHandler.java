package com.bytedance.creativex.recorder.sticker.types.p949ar.arcore;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.sharedar.AbstractC69547b;
import com.p2082ss.android.ugc.aweme.sharedar.C69566e;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.C70629db;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83750d;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.types.ar.arcore.SharedARStickerHandler */
public final class SharedARStickerHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75591e {

    /* renamed from: a */
    public static final C14400a f34857a = new C14400a((byte) 0);

    /* renamed from: b */
    private final AbstractC83490a f34858b;

    /* renamed from: c */
    private final AbstractC83881a f34859c;

    /* renamed from: d */
    private final AbstractC83406b f34860d;

    /* renamed from: e */
    private final AbstractC83869f f34861e;

    /* renamed from: f */
    private final AbstractC83750d f34862f;

    /* renamed from: g */
    private final ActivityC0945e f34863g;

    /* renamed from: h */
    private final AbstractC69547b f34864h;

    /* renamed from: i */
    private final AbstractC14177d f34865i;

    /* renamed from: j */
    private final AbstractC14193m f34866j;

    /* renamed from: k */
    private final AbstractC14210a f34867k;

    /* renamed from: l */
    private final AbstractC14099a f34868l;

    static {
        Covode.recordClassIndex(16476);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.types.ar.arcore.SharedARStickerHandler$a */
    public static final class C14400a {
        static {
            Covode.recordClassIndex(16477);
        }

        private C14400a() {
        }

        public /* synthetic */ C14400a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final ShortVideoContext m26269b() {
        AbstractC1174ac a = C1181ae.m3881a(this.f34863g, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
        C89219l.m154716b(shortVideoContext, "");
        return shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        AbstractC83881a aVar;
        m26269b().mo110013a(false);
        if (C70629db.m124816b() && (aVar = this.f34859c) != null) {
            aVar.mo123011b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C69566e.m122776b(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        boolean z;
        String str;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar.f170024c != EnumC75295a.RECOVER) {
            this.f34864h.mo109785a(aVar.f170022a);
            m26269b().mo110013a(true);
            if (aVar.f170024c == EnumC75295a.MANUAL_SET) {
                z = true;
                SharedARModel sharedARModel = m26269b().f155756Q;
                String str2 = null;
                if (sharedARModel != null) {
                    str = sharedARModel.getSharedARSessionId();
                } else {
                    str = null;
                }
                AbstractC32846a e = C63238c.f143594u.mo93906e();
                if (e != null) {
                    str2 = e.mo58666i();
                }
                if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0)) {
                    this.f34864h.mo109786a(str, str2);
                }
            } else {
                z = false;
                SharedARModel sharedARModel2 = m26269b().f155756Q;
                if (sharedARModel2 != null) {
                    sharedARModel2.setCurrentUserHost(true);
                }
            }
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
                AbstractC83406b bVar2 = this.f34860d;
                if (bVar2 != null) {
                    bVar2.setCurrentTab(C69797ae.f155982c, false);
                }
                AbstractC83750d dVar = this.f34862f;
                if (dVar != null) {
                    dVar.mo128720d(false);
                }
            }
            if (C70629db.m124816b()) {
                AbstractC83881a aVar2 = this.f34859c;
                if (aVar2 != null) {
                    aVar2.mo123005a(C69797ae.f155981b, z);
                }
                if (z) {
                    AbstractC83881a aVar3 = this.f34859c;
                    if (aVar3 != null) {
                        aVar3.mo123006a(false);
                    }
                } else {
                    AbstractC83881a aVar4 = this.f34859c;
                    if (aVar4 != null) {
                        aVar4.mo123011b(false);
                    }
                }
            } else {
                AbstractC83406b bVar3 = this.f34860d;
                if (bVar3 != null) {
                    bVar3.setCurrentTab(C69797ae.f155981b, z);
                }
            }
            this.f34866j.mo22893c(true);
            AbstractC83869f fVar = this.f34861e;
            if (fVar != null) {
                fVar.mo128761b(false);
            }
            this.f34865i.mo22781a(EnumC78601i.NORMAL);
            ShortVideoContext b = m26269b();
            if (b.f155817b.mo109888a()) {
                C70643dn.m124856a(b);
                C70641dm.m124849d(b);
                this.f34866j.mo22875a(new C14190j(b.f155817b.f155646b));
                AbstractC83490a aVar5 = this.f34858b;
                if (aVar5 != null) {
                    aVar5.handleCancelMusicResultEvent();
                }
            }
            AbstractC14210a aVar6 = this.f34867k;
            if (aVar6 != null) {
                aVar6.setFilterDisable(true, "build_in");
            }
            this.f34868l.mo22653c(false);
            this.f34865i.mo22810c().mo115025f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        this.f34864h.mo109784a(i, i2, i3, str);
    }

    public SharedARStickerHandler(ActivityC0945e eVar, AbstractC69547b bVar, AbstractC14177d dVar, AbstractC14193m mVar, AbstractC14210a aVar, AbstractC14099a aVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar2, "");
        this.f34863g = eVar;
        this.f34864h = bVar;
        this.f34865i = dVar;
        this.f34866j = mVar;
        this.f34867k = aVar;
        this.f34868l = aVar2;
        this.f34858b = (AbstractC83490a) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83490a.class);
        this.f34859c = (AbstractC83881a) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83881a.class);
        this.f34860d = (AbstractC83406b) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83406b.class);
        this.f34861e = (AbstractC83869f) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83869f.class);
        this.f34862f = (AbstractC83750d) ApiCenter.C2545a.m7450a(eVar).mo7015b(AbstractC83750d.class);
    }
}
