package com.p2082ss.android.ugc.aweme.ftc.components.p3029a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f;
import com.p2082ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.a.a */
public final class C51954a extends AbstractC23520b<MultiEditViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f119687a;

    /* renamed from: b */
    public final int f119688b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f119689c = C89250i.m154773a((AbstractC89171a) C51955a.f119693a);

    /* renamed from: d */
    private final AbstractC89244h f119690d = C89250i.m154773a((AbstractC89171a) new C51956b(this));

    /* renamed from: e */
    private final AbstractC89171a<MultiEditViewModel> f119691e = new C51957c(this);

    /* renamed from: f */
    private final C21582f f119692f;

    static {
        Covode.recordClassIndex(61323);
    }

    /* renamed from: f */
    private final C51958b m96671f() {
        return (C51958b) this.f119690d.getValue();
    }

    /* renamed from: a */
    public final View$OnClickListenerC71465f mo87659a() {
        return (View$OnClickListenerC71465f) this.f119689c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<MultiEditViewModel> mo23031b() {
        return this.f119691e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f119687a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119692f;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a.a$a */
    static final class C51955a extends AbstractC89220m implements AbstractC89171a<View$OnClickListenerC71465f> {

        /* renamed from: a */
        public static final C51955a f119693a = new C51955a();

        static {
            Covode.recordClassIndex(61324);
        }

        C51955a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnClickListenerC71465f invoke() {
            return new View$OnClickListenerC71465f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a.a$c */
    static final class C51957c extends AbstractC89220m implements AbstractC89171a<MultiEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ C51954a f119695a;

        static {
            Covode.recordClassIndex(61326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51957c(C51954a aVar) {
            super(0);
            this.f119695a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MultiEditViewModel invoke() {
            return new MultiEditViewModel(this.f119695a.mo87659a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a.a$b */
    static final class C51956b extends AbstractC89220m implements AbstractC89171a<C51958b> {

        /* renamed from: a */
        final /* synthetic */ C51954a f119694a;

        static {
            Covode.recordClassIndex(61325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51956b(C51954a aVar) {
            super(0);
            this.f119694a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51958b invoke() {
            C51958b bVar = new C51958b(this.f119694a.getDiContainer(), this.f119694a.mo87659a());
            this.f119694a.f119687a.mo36387a(this.f119694a.f119688b, bVar, "FTCMultiEditVideoScene");
            return bVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f119687a.mo36417e(m96671f());
        C51958b f = m96671f();
        AbstractC31071f value = f.mo62771E().mo114778C().getValue();
        if (f.f119698c == null) {
            f.f119698c = value;
            f.f119699d.mo113086a(f.f119698c);
        }
        VideoPublishEditModel F = f.mo87660F();
        if (!(F == null || F.getCurMultiEditVideoRecordData() == null || C84904k.m145909a(F.getCurMultiEditVideoRecordData().segmentDataList))) {
            F.copyMultiEditMusicInfo();
            f.f119699d.mo113087a(F);
        }
        f.f119699d.mo113089b();
    }

    public C51954a(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f119692f = fVar;
        this.f119687a = bVar;
    }
}
