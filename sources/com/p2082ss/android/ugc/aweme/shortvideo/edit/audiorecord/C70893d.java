package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d */
public final class C70893d extends AbstractC23520b<EditAudioRecordViewModel> implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f158724a = {new C89232y(C70893d.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b */
    private C70899g f158725b;

    /* renamed from: c */
    private final AbstractC89248d f158726c = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d */
    private final AbstractC89171a<EditAudioRecordViewModel> f158727d = C70896b.f158733a;

    /* renamed from: e */
    private final C21582f f158728e;

    /* renamed from: f */
    private final AbstractC22186b f158729f;

    /* renamed from: k */
    private final int f158730k = R.id.c7m;

    static {
        Covode.recordClassIndex(83387);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo112071a() {
        return (VideoPublishEditModel) this.f158726c.mo23374a(this, f158724a[0]);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditAudioRecordViewModel> mo23031b() {
        return this.f158727d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f158729f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158728e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d$b */
    static final class C70896b extends AbstractC89220m implements AbstractC89171a<EditAudioRecordViewModel> {

        /* renamed from: a */
        public static final C70896b f158733a = new C70896b();

        static {
            Covode.recordClassIndex(83390);
        }

        C70896b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditAudioRecordViewModel invoke() {
            return new EditAudioRecordViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        C70899g gVar = this.f158725b;
        if (gVar != null) {
            gVar.mo112086c(false);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        AbstractC88412b unused = selectSubscribe(mo38334j(), C70897e.f158734a, new C20370ah(), new C70894a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == r0.mo56368j()) goto L_0x001b;
     */
    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23032c() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70893d.mo23032c():void");
    }

    public C70893d(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f158728e = fVar;
        this.f158729f = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d$a */
    static final class C70894a extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70893d f158731a;

        static {
            Covode.recordClassIndex(83388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70894a(C70893d dVar) {
            super(2);
            this.f158731a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C20526p pVar) {
            final String str;
            C89219l.m154721d(iVar, "");
            if (pVar != null && this.f158731a.mo112071a().hasRecord()) {
                AudioRecorderParam audioRecorderParam = this.f158731a.mo112071a().veAudioRecorderParam;
                if (audioRecorderParam != null) {
                    str = audioRecorderParam.getAudioUrl();
                } else {
                    str = null;
                }
                this.f158731a.mo112071a().veAudioRecorderParam = null;
                if (!(str == null || str.length() == 0)) {
                    C1731i.m5640b(new Callable() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70893d.C70894a.CallableC708951 */

                        static {
                            Covode.recordClassIndex(83389);
                        }

                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return Boolean.valueOf(C84902i.m145896b(str));
                        }
                    }, C40780g.m82241a());
                }
            }
            return C89391z.f203057a;
        }
    }
}
