package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler */
public final class GameStickerHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75591e, AbstractC75626f {

    /* renamed from: c */
    public static final C75597a f169949c = new C75597a((byte) 0);

    /* renamed from: a */
    Effect f169950a;

    /* renamed from: b */
    public final AbstractC89244h<AbstractC76080m> f169951b;

    /* renamed from: d */
    private SafeHandler f169952d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f169953e;

    static {
        Covode.recordClassIndex(88522);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169950a = null;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler$a */
    public static final class C75597a {
        static {
            Covode.recordClassIndex(88524);
        }

        private C75597a() {
        }

        public /* synthetic */ C75597a(byte b) {
            this();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f169951b.isInitialized()) {
            this.f169951b.getValue().mo119807d();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    private final void onStop() {
        if (this.f169951b.isInitialized()) {
            this.f169951b.getValue().mo119804b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75626f
    /* renamed from: b */
    public final boolean mo119334b() {
        if (!this.f169951b.isInitialized() || !this.f169951b.getValue().mo119806c()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler$b */
    static final class RunnableC75598b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GameStickerHandler f169955a;

        /* renamed from: b */
        final /* synthetic */ int f169956b;

        /* renamed from: c */
        final /* synthetic */ int f169957c;

        /* renamed from: d */
        final /* synthetic */ int f169958d;

        /* renamed from: e */
        final /* synthetic */ String f169959e;

        static {
            Covode.recordClassIndex(88525);
        }

        RunnableC75598b(GameStickerHandler gameStickerHandler, int i, int i2, int i3, String str) {
            this.f169955a = gameStickerHandler;
            this.f169956b = i;
            this.f169957c = i2;
            this.f169958d = i3;
            this.f169959e = str;
        }

        public final void run() {
            String str;
            int i = this.f169956b;
            if (i != 45) {
                if (i == 48) {
                    this.f169955a.f169951b.getValue().mo119799a();
                }
            } else if (this.f169957c == 2) {
                GameStickerHandler gameStickerHandler = this.f169955a;
                int i2 = this.f169958d;
                String str2 = this.f169959e;
                try {
                    String optString = new JSONObject(str2).optString("effectPath");
                    Effect effect = gameStickerHandler.f169950a;
                    String str3 = null;
                    if (effect != null) {
                        str = effect.getUnzipPath();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C89219l.m154716b(optString, "");
                        Effect effect2 = gameStickerHandler.f169950a;
                        if (effect2 == null || (str3 = effect2.getUnzipPath()) == null) {
                            C89219l.m154715b();
                        }
                        if (C89361p.m154908a((CharSequence) optString, (CharSequence) str3, true)) {
                            gameStickerHandler.f169951b.getValue().mo119801a(gameStickerHandler.f169950a, str2, i2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C72847c.m128639e(aVar.f170022a);
    }

    public /* synthetic */ GameStickerHandler(AbstractC1204m mVar, AbstractC89244h hVar) {
        this(mVar, hVar, C755961.f169954a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f169953e.invoke();
        this.f169950a = aVar.f170022a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.types.game.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public GameStickerHandler(AbstractC1204m mVar, AbstractC89244h<? extends AbstractC76080m> hVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        this.f169951b = hVar;
        this.f169953e = aVar;
        this.f169952d = new SafeHandler(mVar);
        mVar.getLifecycle().mo4012a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (C72847c.m128639e(this.f169950a)) {
            this.f169952d.post(new RunnableC75598b(this, i, i2, i3, str));
        }
    }
}
