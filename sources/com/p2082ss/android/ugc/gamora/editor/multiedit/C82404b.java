package com.p2082ss.android.ugc.gamora.editor.multiedit;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.multiedit.b */
public final class C82404b extends AbstractC23520b<MultiEditViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f184322a;

    /* renamed from: b */
    public final int f184323b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f184324c = C89250i.m154773a((AbstractC89171a) C82405a.f184328a);

    /* renamed from: d */
    private final AbstractC89244h f184325d = C89250i.m154773a((AbstractC89171a) new C82406b(this));

    /* renamed from: e */
    private final AbstractC89171a<MultiEditViewModel> f184326e = new C82407c(this);

    /* renamed from: f */
    private final C21582f f184327f;

    static {
        Covode.recordClassIndex(96242);
    }

    /* renamed from: f */
    private final C82408c m142450f() {
        return (C82408c) this.f184325d.getValue();
    }

    /* renamed from: a */
    public final View$OnClickListenerC71465f mo127500a() {
        return (View$OnClickListenerC71465f) this.f184324c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<MultiEditViewModel> mo23031b() {
        return this.f184326e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184322a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184327f;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.b$a */
    static final class C82405a extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC71465f> {

        /* renamed from: a */
        public static final C82405a f184328a = new C82405a();

        static {
            Covode.recordClassIndex(96243);
        }

        C82405a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC71465f invoke() {
            return new View$OnClickListenerC71465f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.b$c */
    static final class C82407c extends AbstractC89220m implements AbstractC89171a<MultiEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82404b f184330a;

        static {
            Covode.recordClassIndex(96245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82407c(C82404b bVar) {
            super(0);
            this.f184330a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiEditViewModel invoke() {
            return new MultiEditViewModel(this.f184330a.mo127500a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.b$b */
    static final class C82406b extends AbstractC89220m implements AbstractC89171a<C82408c> {

        /* renamed from: a */
        final /* synthetic */ C82404b f184329a;

        static {
            Covode.recordClassIndex(96244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82406b(C82404b bVar) {
            super(0);
            this.f184329a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82408c invoke() {
            C82408c cVar = new C82408c(this.f184329a.getDiContainer(), this.f184329a.mo127500a());
            this.f184329a.f184322a.mo36387a(this.f184329a.f184323b, cVar, "MultiEditVideoScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f184322a.mo36417e(m142450f());
        C82408c f = m142450f();
        AbstractC31071f value = f.mo127501F().mo114778C().getValue();
        if (f.f184333c == null) {
            f.f184333c = value;
            f.f184334d.mo113086a(f.f184333c);
        }
        VideoPublishEditModel E = f.mo62771E();
        if (!(E == null || E.getCurMultiEditVideoRecordData() == null || C84904k.m145909a(E.getCurMultiEditVideoRecordData().segmentDataList))) {
            E.copyMultiEditMusicInfo();
            f.f184334d.mo113087a(E);
        }
        f.f184334d.mo113089b();
    }

    public C82404b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184327f = fVar;
        this.f184322a = bVar;
    }
}
