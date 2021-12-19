package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p3872a;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p3872a.C72956a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.b */
public final class C72963b extends AbstractC72927a {
    static {
        Covode.recordClassIndex(85666);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.b$a */
    static final class RunnableC72964a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72963b f163724a;

        /* renamed from: b */
        final /* synthetic */ View f163725b;

        static {
            Covode.recordClassIndex(85667);
        }

        RunnableC72964a(C72963b bVar, View view) {
            this.f163724a = bVar;
            this.f163725b = view;
        }

        public final void run() {
            this.f163724a.mo115366b(this.f163725b);
        }
    }

    /* renamed from: a */
    public final void mo115365a(View view) {
        C89219l.m154721d(view, "");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new RunnableC72964a(this, view));
        } else {
            mo115366b(view);
        }
    }

    /* renamed from: b */
    public final void mo115366b(View view) {
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

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128719a(interactStickerStruct);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC72946a aVar = this.f163646d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.DuetInteractStickerView");
        C72956a aVar2 = (C72956a) aVar;
        AbstractC23332b a = ((C23319b) new C23319b(aVar2.f163695i).mo38030a(-1001L)).mo38011a(new C72956a.C72959c(aVar2)).mo38035a(C72956a.C72961d.f163721a);
        a.mo38028a(C0643b.m2378c(aVar2.f163695i, R.color.c7));
        a.mo38034a(EnumC23352h.TOP);
        a.mo38029a((int) f, (int) f2);
        aVar2.f163690d = a.mo38012d();
        AbstractC23317a aVar3 = aVar2.f163690d;
        if (aVar3 != null) {
            aVar3.mo38001a();
        }
        bVar.mo115309a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return super.mo115224a(j, i, f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72963b(Context context, C72956a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, aVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
    }
}
