package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler */
public final class SavePhotoStickerHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75591e {

    /* renamed from: d */
    public static final C75600a f169963d = new C75600a((byte) 0);

    /* renamed from: a */
    Effect f169964a;

    /* renamed from: b */
    final AbstractC75627g f169965b;

    /* renamed from: c */
    final AbstractC84903j f169966c;

    /* renamed from: e */
    private SafeHandler f169967e;

    /* renamed from: f */
    private final ActivityC0218d f169968f;

    static {
        Covode.recordClassIndex(88528);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169964a = null;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler$a */
    public static final class C75600a {
        static {
            Covode.recordClassIndex(88529);
        }

        private C75600a() {
        }

        public /* synthetic */ C75600a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler$b */
    static final class RunnableC75601b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SavePhotoStickerHandler f169969a;

        /* renamed from: b */
        final /* synthetic */ int f169970b;

        /* renamed from: c */
        final /* synthetic */ String f169971c;

        static {
            Covode.recordClassIndex(88530);
        }

        RunnableC75601b(SavePhotoStickerHandler savePhotoStickerHandler, int i, String str) {
            this.f169969a = savePhotoStickerHandler;
            this.f169970b = i;
            this.f169971c = str;
        }

        public final void run() {
            String extra;
            if (this.f169970b == 69) {
                SavePhotoStickerHandler savePhotoStickerHandler = this.f169969a;
                savePhotoStickerHandler.f169965b.mo119359a(this.f169971c);
                Effect effect = savePhotoStickerHandler.f169964a;
                if (effect != null && (extra = effect.getExtra()) != null) {
                    try {
                        savePhotoStickerHandler.f169965b.mo119360b(new JSONObject(extra).optString("hint_for_saving_captured_image"));
                    } catch (Exception e) {
                        savePhotoStickerHandler.f169966c.mo123659a(e);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132338B(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        String extra;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        this.f169964a = effect;
        if (effect != null && (extra = effect.getExtra()) != null) {
            try {
                if (!TextUtils.isEmpty(new JSONObject(extra).optString("hint_for_saving_captured_image"))) {
                    this.f169965b.mo119358a(this.f169964a, this.f169968f);
                }
            } catch (Exception e) {
                this.f169966c.mo123659a(e);
            }
        }
    }

    public SavePhotoStickerHandler(ActivityC0218d dVar, AbstractC75627g gVar, AbstractC84903j jVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(jVar, "");
        this.f169968f = dVar;
        this.f169965b = gVar;
        this.f169966c = jVar;
        this.f169967e = new SafeHandler(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (C75466g.m132338B(this.f169964a)) {
            this.f169967e.post(new RunnableC75601b(this, i, str));
        }
    }
}
