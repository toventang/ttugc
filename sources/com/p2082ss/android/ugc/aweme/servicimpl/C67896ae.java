package com.p2082ss.android.ugc.aweme.servicimpl;

import android.app.Application;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.C45867a;
import com.p2082ss.android.ugc.aweme.editSticker.text.effect.C46166o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.sticker.text.C75892a;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88257f;
import java.io.File;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.ae */
public final class C67896ae implements AbstractC63223bh {

    /* renamed from: a */
    C46166o f152075a;

    /* renamed from: b */
    private C75892a f152076b = new C75892a();

    static {
        Covode.recordClassIndex(80065);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ae$e */
    static final class C67903e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67896ae f152092a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f152093b;

        static {
            Covode.recordClassIndex(80072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67903e(C67896ae aeVar, AbstractC89171a aVar) {
            super(0);
            this.f152092a = aeVar;
            this.f152093b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f152092a.f152075a = null;
            AbstractC89171a aVar = this.f152093b;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: a */
    public final void mo101702a() {
        C75894b.m133079a();
        C75896c.m133081a();
        C75896c.m133084b();
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ae$d */
    static final class C67902d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67896ae f152089a;

        /* renamed from: b */
        final /* synthetic */ boolean f152090b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f152091c;

        static {
            Covode.recordClassIndex(80071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67902d(C67896ae aeVar, boolean z, AbstractC89171a aVar) {
            super(0);
            this.f152089a = aeVar;
            this.f152090b = z;
            this.f152091c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            if (this.f152090b) {
                this.f152089a.f152075a = null;
            }
            AbstractC89171a aVar = this.f152091c;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ae$b */
    static final class C67900b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67896ae f152085a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f152086b;

        static {
            Covode.recordClassIndex(80069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67900b(C67896ae aeVar, AbstractC89172b bVar) {
            super(1);
            this.f152085a = aeVar;
            this.f152086b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.f152085a.f152075a = null;
            }
            AbstractC89172b bVar = this.f152086b;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ae$c */
    static final class C67901c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67896ae f152087a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f152088b;

        static {
            Covode.recordClassIndex(80070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67901c(C67896ae aeVar, AbstractC89172b bVar) {
            super(1);
            this.f152087a = aeVar;
            this.f152088b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                this.f152087a.f152075a = null;
            }
            AbstractC89172b bVar = this.f152088b;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ae$a */
    static final class C67897a extends AbstractC89220m implements AbstractC89172b<AbstractC89172b<? super Boolean, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f152077a;

        /* renamed from: b */
        final /* synthetic */ String f152078b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout f152079c;

        /* renamed from: d */
        final /* synthetic */ AVETParameter f152080d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f152081e;

        /* renamed from: f */
        final /* synthetic */ ActivityC0218d f152082f;

        static {
            Covode.recordClassIndex(80066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67897a(String str, String str2, FrameLayout frameLayout, AVETParameter aVETParameter, AbstractC89172b bVar, ActivityC0218d dVar) {
            super(1);
            this.f152077a = str;
            this.f152078b = str2;
            this.f152079c = frameLayout;
            this.f152080d = aVETParameter;
            this.f152081e = bVar;
            this.f152082f = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC89172b<? super Boolean, ? extends C89391z> bVar) {
            final AbstractC89172b<? super Boolean, ? extends C89391z> bVar2 = bVar;
            C17197a.C17200a aVar = new C17197a.C17200a(this.f152082f);
            aVar.f41071b = this.f152082f.getResources().getString(R.string.eqh);
            aVar.mo27196b(this.f152082f.getResources().getString(R.string.a7d), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.servicimpl.C67896ae.C67897a.DialogInterface$OnClickListenerC678981 */

                static {
                    Covode.recordClassIndex(80067);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC89172b bVar = bVar2;
                    if (bVar != null) {
                        bVar.invoke(false);
                    }
                }
            }, false).mo27192a(this.f152082f.getResources().getString(R.string.eqi), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.servicimpl.C67896ae.C67897a.DialogInterface$OnClickListenerC678992 */

                static {
                    Covode.recordClassIndex(80068);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC89172b bVar = bVar2;
                    if (bVar != null) {
                        bVar.invoke(true);
                    }
                }
            }, false).mo27193a().mo27185c().show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m120160a(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        String uniqueVideoSessionDir = videoPublishEditModel.uniqueVideoSessionDir(sb.append(application.getFilesDir().toString()).append(File.separator).append("effect").append(File.separator).append("text_stickers").append(File.separator).append(System.currentTimeMillis()).append(File.separator).toString());
        C89219l.m154716b(uniqueVideoSessionDir, "");
        return uniqueVideoSessionDir;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: a */
    public final void mo101706a(boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C67900b bVar2 = new C67900b(this, bVar);
        C46166o oVar = this.f152075a;
        if (oVar == null) {
            bVar2.invoke(true);
        } else if (z || (oVar.f107516e.mo78347t() && oVar.f107516e.mo78348u())) {
            AbstractC89172b<? super AbstractC89172b<? super Boolean, C89391z>, C89391z> bVar3 = oVar.f107518g;
            if (bVar3 != null) {
                bVar3.invoke(new C46166o.C46168b(oVar, bVar2));
            }
        } else {
            oVar.f107516e.mo78344c(false);
            bVar2.invoke(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: b */
    public final void mo101707b(boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C67901c cVar = new C67901c(this, bVar);
        C46166o oVar = this.f152075a;
        if (oVar == null) {
            cVar.invoke(true);
        } else if (z) {
            AbstractC89172b<? super AbstractC89172b<? super Boolean, C89391z>, C89391z> bVar2 = oVar.f107518g;
            if (bVar2 != null) {
                bVar2.invoke(new C46166o.C46169c(oVar, cVar));
            }
        } else {
            oVar.f107516e.mo78344c(false);
            cVar.invoke(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: a */
    public final void mo101705a(BaseShortVideoContext baseShortVideoContext, boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(baseShortVideoContext, "");
        C67903e eVar = new C67903e(this, aVar);
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            int[] b = C88257f.m153369b(videoPublishEditModel);
            C46166o oVar = this.f152075a;
            if (oVar != null) {
                oVar.mo78395a(videoPublishEditModel.getCoverPublishModel().getEffectTextModel(), m120160a(videoPublishEditModel), b[0], b[1], z, eVar);
            }
        }
        if (this.f152075a == null) {
            eVar.invoke();
            this.f152076b.mo77225d(new C45867a(null, null, null, null, null, 0, z ? 1 : 0, 0, 191));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: a */
    public final void mo101704a(BaseShortVideoContext baseShortVideoContext, EffectTextModel effectTextModel, boolean z, boolean z2, AbstractC89171a<C89391z> aVar) {
        String a;
        C89219l.m154721d(baseShortVideoContext, "");
        C89219l.m154721d(effectTextModel, "");
        C67902d dVar = new C67902d(this, z2, aVar);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        int[] b = C88257f.m153369b(videoPublishEditModel);
        C46166o oVar = this.f152075a;
        if (oVar != null) {
            if (SettingsManager.m29616a().mo25400a("tool_effect_text_cover_use_new_dir", true)) {
                a = videoPublishEditModel.uniqueVideoSessionDir(C63244g.m114602a().mo73279g().mo69470c().mo69479e("effect_text") + System.currentTimeMillis() + File.separator);
                C89219l.m154716b(a, "");
            } else {
                a = m120160a(videoPublishEditModel);
            }
            oVar.mo78395a(effectTextModel, a, b[0], b[1], z, dVar);
        }
        if (this.f152075a == null) {
            dVar.invoke();
            this.f152076b.mo77225d(new C45867a(null, null, null, null, null, 0, z ? 1 : 0, 0, 191));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63223bh
    /* renamed from: a */
    public final void mo101703a(ActivityC0218d dVar, String str, String str2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, EffectTextModel effectTextModel, AVETParameter aVETParameter, AbstractC89172b<? super Boolean, C89391z> bVar) {
        MethodCollector.m26663i(5629);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(frameLayout2, "");
        C89219l.m154721d(frameLayout3, "");
        C46166o oVar = new C46166o(dVar, frameLayout, frameLayout2, frameLayout3, effectTextModel);
        boolean b = C13624l.m24486b(frameLayout.getContext());
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC89568bz unused = C89624i.m155555a((AbstractC89516am) oVar.f107520i.getValue(), null, null, new C46166o.C46180k(oVar, str2, b, str, null), 3);
        oVar.f107514c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewParent parent = oVar.f107514c.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(oVar.f107514c);
        }
        oVar.f107523l.addView(oVar.f107514c);
        oVar.f107517f = new C75892a(aVETParameter);
        oVar.f107516e.f107395G = oVar.f107517f;
        oVar.f107519h = bVar;
        oVar.f107518g = new C67897a(str, str2, frameLayout, aVETParameter, bVar, dVar);
        this.f152075a = oVar;
        MethodCollector.m26664o(5629);
    }
}
