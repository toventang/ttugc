package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73057p;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f */
public final class C72935f extends AbstractC72927a {
    static {
        Covode.recordClassIndex(85635);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.f$a */
    static final class RunnableC72936a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72935f f163660a;

        /* renamed from: b */
        final /* synthetic */ View f163661b;

        static {
            Covode.recordClassIndex(85636);
        }

        RunnableC72936a(C72935f fVar, View view) {
            this.f163660a = fVar;
            this.f163661b = view;
        }

        public final void run() {
            this.f163660a.mo115328b(this.f163661b);
        }
    }

    /* renamed from: a */
    public final float[] mo115327a() {
        List<NormalTrackTimeStamp> a = mo115231a(0, this.f163647e);
        if (a == null || C13603b.m24435a((Collection) a) || a.get(0) == null) {
            return null;
        }
        NormalTrackTimeStamp normalTrackTimeStamp = a.get(0);
        if (normalTrackTimeStamp == null) {
            C89219l.m154715b();
        }
        RectF a2 = mo115320a(normalTrackTimeStamp);
        float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
        Matrix matrix = new Matrix();
        NormalTrackTimeStamp normalTrackTimeStamp2 = a.get(0);
        if (normalTrackTimeStamp2 == null) {
            C89219l.m154715b();
        }
        matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    public final void mo115326a(View view) {
        C89219l.m154721d(view, "");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new RunnableC72936a(this, view));
        } else {
            mo115328b(view);
        }
    }

    /* renamed from: b */
    public final void mo115328b(View view) {
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
        C89219l.m154721d(bVar, "");
        AbstractC72946a aVar = this.f163646d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollInteractStickerView");
        C73057p pVar = (C73057p) aVar;
        Context context = pVar.f163695i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        AbstractC23332b a = ((C23319b) new C23319b((Activity) context).mo38030a(-1001L)).mo38011a(new C73057p.C73060c(pVar)).mo38035a(C73057p.C73062d.f163955a);
        a.mo38028a(C0643b.m2378c(pVar.f163695i, R.color.c7));
        a.mo38034a(EnumC23352h.TOP);
        a.mo38029a((int) f, (int) f2);
        pVar.f163690d = a.mo38012d();
        AbstractC23317a aVar2 = pVar.f163690d;
        if (aVar2 != null) {
            aVar2.mo38001a();
        }
        bVar.mo115309a(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72935f(Context context, C73057p pVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, pVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(interactStickerStruct, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        User user;
        C75391j jVar = this.f163648f;
        if (jVar != null) {
            user = jVar.f169448c;
        } else {
            user = null;
        }
        if (!C80580in.m139694g(user)) {
            return false;
        }
        return super.mo115224a(j, i, f, f2);
    }
}
