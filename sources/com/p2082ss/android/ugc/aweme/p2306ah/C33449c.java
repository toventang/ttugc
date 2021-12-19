package com.p2082ss.android.ugc.aweme.p2306ah;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63170ad;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ah.c */
public final class C33449c implements AbstractC75461d {

    /* renamed from: a */
    public static final C33449c f79502a = new C33449c();

    private C33449c() {
    }

    static {
        Covode.recordClassIndex(40306);
    }

    /* renamed from: a */
    public static void m68557a() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getBusiStickerService().mo93798a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d
    /* renamed from: b */
    public final void mo59542b(Effect effect) {
        String str;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63170ad busiStickerService = createIAVServiceProxybyMonsterPlugin.getBusiStickerService();
        if (effect != null) {
            str = effect.getAdRawData();
        } else {
            str = null;
        }
        busiStickerService.mo93802b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d
    /* renamed from: a */
    public final void mo59541a(Effect effect) {
        String str;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63170ad busiStickerService = createIAVServiceProxybyMonsterPlugin.getBusiStickerService();
        if (effect != null) {
            str = effect.getAdRawData();
        } else {
            str = null;
        }
        busiStickerService.mo93800a(str);
    }
}
