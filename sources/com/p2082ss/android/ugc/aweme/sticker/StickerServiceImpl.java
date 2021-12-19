package com.p2082ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47731q;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* renamed from: com.ss.android.ugc.aweme.sticker.StickerServiceImpl */
public final class StickerServiceImpl implements IStickerService {
    static {
        Covode.recordClassIndex(88146);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerService
    /* renamed from: a */
    public final AbsInteractStickerWidget mo118501a() {
        return new InteractStickerWidget();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerService
    /* renamed from: b */
    public final AbstractC34586a mo118502b() {
        return new C47731q();
    }

    /* renamed from: c */
    public static IStickerService m132027c() {
        MethodCollector.m26663i(7283);
        Object a = C81908b.m141854a(IStickerService.class, false);
        if (a != null) {
            IStickerService iStickerService = (IStickerService) a;
            MethodCollector.m26664o(7283);
            return iStickerService;
        }
        if (C81908b.f183381ek == null) {
            synchronized (IStickerService.class) {
                try {
                    if (C81908b.f183381ek == null) {
                        C81908b.f183381ek = new StickerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7283);
                    throw th;
                }
            }
        }
        StickerServiceImpl stickerServiceImpl = (StickerServiceImpl) C81908b.f183381ek;
        MethodCollector.m26664o(7283);
        return stickerServiceImpl;
    }
}
