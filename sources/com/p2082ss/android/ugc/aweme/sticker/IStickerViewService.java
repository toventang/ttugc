package com.p2082ss.android.ugc.aweme.sticker;

import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.sticker.p3967n.AbstractC75448a;

/* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService */
public interface IStickerViewService {

    /* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService$a */
    public interface AbstractC75242a {
        static {
            Covode.recordClassIndex(88139);
        }

        /* renamed from: a */
        void mo96113a();

        /* renamed from: a */
        void mo96114a(IStickerService.FaceSticker faceSticker);

        /* renamed from: a */
        void mo96115a(String str);

        /* renamed from: b */
        void mo96116b();

        /* renamed from: b */
        void mo96117b(IStickerService.FaceSticker faceSticker);
    }

    static {
        Covode.recordClassIndex(88138);
    }

    void hideStickerView();

    boolean isShowStickerView();

    void setPixelLoopStickerPresenterSupplier(AbstractC27255q<AbstractC75448a> qVar);

    void showStickerView(ActivityC0218d dVar, AbstractC0952i iVar, String str, FrameLayout frameLayout, AbstractC75242a aVar);
}
