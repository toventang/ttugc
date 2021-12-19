package com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3861c;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.a */
public final class C72848a extends AbstractC72946a {

    /* renamed from: a */
    public final AbstractC72926g f163458a;

    /* renamed from: l */
    private View f163459l;

    /* renamed from: m */
    private final AbstractC89244h f163460m;

    static {
        Covode.recordClassIndex(85539);
    }

    /* renamed from: c */
    private final C72850b m128643c() {
        return (C72850b) this.f163460m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 6;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.a$a */
    static final class C72849a extends AbstractC89220m implements AbstractC89171a<C72850b> {

        /* renamed from: a */
        final /* synthetic */ C72848a f163461a;

        /* renamed from: b */
        final /* synthetic */ Context f163462b;

        /* renamed from: c */
        final /* synthetic */ InteractStickerStruct f163463c;

        /* renamed from: d */
        final /* synthetic */ C75391j f163464d;

        static {
            Covode.recordClassIndex(85540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72849a(C72848a aVar, Context context, InteractStickerStruct interactStickerStruct, C75391j jVar) {
            super(0);
            this.f163461a = aVar;
            this.f163462b = context;
            this.f163463c = interactStickerStruct;
            this.f163464d = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C72850b invoke() {
            Context context = this.f163462b;
            C72848a aVar = this.f163461a;
            return new C72850b(context, aVar, this.f163463c, this.f163464d, aVar.f163458a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(8250);
        View view = new View(this.f163695i);
        MethodCollector.m26664o(8250);
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        MethodCollector.m26663i(8395);
        if (this.f163459l == null) {
            this.f163459l = new FrameLayout(this.f163695i);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View view = this.f163459l;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        View view2 = this.f163459l;
        MethodCollector.m26664o(8395);
        return view2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return m128643c().mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return m128643c().mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72848a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163458a = gVar;
        this.f163460m = C89250i.m154773a((AbstractC89171a) new C72849a(this, context, interactStickerStruct, jVar));
    }
}
