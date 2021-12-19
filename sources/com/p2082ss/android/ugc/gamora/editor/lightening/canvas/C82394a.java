package com.p2082ss.android.ugc.gamora.editor.lightening.canvas;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.canvas.C35394m;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.canvas.a */
public final class C82394a extends AbstractC23520b<EditPhotoCanvasViewModel> implements AbstractC21566a {

    /* renamed from: a */
    private final AbstractC89171a<EditPhotoCanvasViewModel> f184299a;

    /* renamed from: b */
    private boolean f184300b;

    /* renamed from: c */
    private C35394m f184301c;

    /* renamed from: d */
    private final Intent f184302d;

    /* renamed from: e */
    private final C21582f f184303e;

    /* renamed from: f */
    private final AbstractC22186b f184304f;

    /* renamed from: k */
    private final int f184305k = R.id.c7m;

    /* renamed from: l */
    private final AbstractC89171a<AbstractC14552j> f184306l;

    static {
        Covode.recordClassIndex(96230);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditPhotoCanvasViewModel> mo23031b() {
        return this.f184299a;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184304f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184303e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.canvas.a$a */
    static final class C82395a extends AbstractC89220m implements AbstractC89171a<EditPhotoCanvasViewModel> {

        /* renamed from: a */
        public static final C82395a f184307a = new C82395a();

        static {
            Covode.recordClassIndex(96231);
        }

        C82395a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditPhotoCanvasViewModel invoke() {
            return new EditPhotoCanvasViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        Serializable serializableExtra = this.f184302d.getSerializableExtra("photo_canvas_data");
        if (!(serializableExtra instanceof CanvasVideoData)) {
            serializableExtra = null;
        }
        CanvasVideoData canvasVideoData = (CanvasVideoData) serializableExtra;
        if (canvasVideoData != null) {
            this.f184300b = true;
            C35394m mVar = new C35394m(getDiContainer(), this.f184306l);
            this.f184304f.mo36387a(this.f184305k, mVar, "StoryEditCanvasScene");
            this.f184301c = mVar;
            mVar.mo62314a("12345", canvasVideoData);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C82394a(Intent intent, C21582f fVar, AbstractC22186b bVar, AbstractC89171a<? extends AbstractC14552j> aVar) {
        C89219l.m154721d(intent, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f184302d = intent;
        this.f184303e = fVar;
        this.f184304f = bVar;
        this.f184306l = aVar;
        this.f184299a = C82395a.f184307a;
    }
}
