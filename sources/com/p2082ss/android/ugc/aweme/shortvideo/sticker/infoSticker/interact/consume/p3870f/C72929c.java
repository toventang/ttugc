package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72972e;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.c */
public final class C72929c extends AbstractC72927a {
    static {
        Covode.recordClassIndex(85629);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.c$a */
    public static final class RunnableC72930a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72929c f163650a;

        /* renamed from: b */
        final /* synthetic */ View f163651b;

        static {
            Covode.recordClassIndex(85630);
        }

        public RunnableC72930a(C72929c cVar, View view) {
            this.f163650a = cVar;
            this.f163651b = view;
        }

        public final void run() {
            this.f163650a.mo115321a(this.f163651b);
        }
    }

    /* renamed from: a */
    public final void mo115321a(View view) {
        List<NormalTrackTimeStamp> a;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (a = C72890c.m128719a(this.f163647e)) != null && (normalTrackTimeStamp = a.get(0)) != null) {
            RectF a2 = mo115320a(normalTrackTimeStamp);
            view.setPivotX(((float) view.getWidth()) / 2.0f);
            view.setPivotY(((float) view.getHeight()) / 2.0f);
            view.setTranslationX(a2.left + ((a2.width() - ((float) view.getWidth())) / 2.0f));
            view.setTranslationY(a2.top + ((a2.height() - ((float) view.getHeight())) / 2.0f));
            view.setScaleX(a2.width() / ((float) view.getWidth()));
            view.setScaleY(a2.width() / ((float) view.getWidth()));
            view.setRotation(normalTrackTimeStamp.getRotation());
            view.setVisibility(0);
            view.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128719a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        String str;
        C75384i iVar;
        C89219l.m154721d(bVar, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            Activity a = C34470e.m70451a(this.f163645c);
            if (a != null) {
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74960a = a;
                C75391j jVar = this.f163648f;
                if (jVar == null || (iVar = jVar.f169463r) == null) {
                    str = null;
                } else {
                    str = iVar.f169427a;
                }
                dVar.f74961b = str;
                dVar.f74962c = "click";
                C31575b.m65860b().showLoginAndRegisterView(dVar.mo57084a());
                return;
            }
            return;
        }
        AbstractC72946a aVar = this.f163646d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerInteractView");
        ((C72972e) aVar).mo115386c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72929c(Context context, C72972e eVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, eVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(interactStickerStruct, "");
    }
}
