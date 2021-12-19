package com.p2082ss.android.ugc.aweme.ftc.components.cutmusic;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c;
import com.p2082ss.android.ugc.aweme.p2730de.C40983r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.b */
public final class C52072b extends AbstractC23520b<FTCEditMusicCutViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f119955a;

    /* renamed from: b */
    public final int f119956b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f119957c = C89250i.m154773a((AbstractC89171a) new C52073a(this));

    /* renamed from: d */
    private final AbstractC89171a<FTCEditMusicCutViewModel> f119958d = C52074b.f119961a;

    /* renamed from: e */
    private final C21582f f119959e;

    static {
        Covode.recordClassIndex(61451);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FTCEditMusicCutViewModel> mo23031b() {
        return this.f119958d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f119955a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119959e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.b$b */
    static final class C52074b extends AbstractC89220m implements AbstractC89171a<FTCEditMusicCutViewModel> {

        /* renamed from: a */
        public static final C52074b f119961a = new C52074b();

        static {
            Covode.recordClassIndex(61453);
        }

        C52074b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FTCEditMusicCutViewModel invoke() {
            return new FTCEditMusicCutViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.b$a */
    static final class C52073a extends AbstractC89220m implements AbstractC89171a<View$OnTouchListenerC52075c> {

        /* renamed from: a */
        final /* synthetic */ C52072b f119960a;

        static {
            Covode.recordClassIndex(61452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52073a(C52072b bVar) {
            super(0);
            this.f119960a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnTouchListenerC52075c invoke() {
            View$OnTouchListenerC52075c cVar = new View$OnTouchListenerC52075c(this.f119960a.getDiContainer());
            AbstractC82563s sVar = (AbstractC82563s) cVar.getDiContainer().mo35249a((Type) AbstractC82563s.class, (String) null);
            C89219l.m154721d(sVar, "");
            cVar.f119983g = sVar;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) cVar.getDiContainer().mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154721d(videoPublishEditModel, "");
            cVar.f119984h = videoPublishEditModel;
            this.f119960a.f119955a.mo36387a(this.f119960a.f119956b, cVar, "FTCEditMusicCutScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        boolean z;
        View$OnTouchListenerC52075c cVar = (View$OnTouchListenerC52075c) this.f119957c.getValue();
        VideoPublishEditModel videoPublishEditModel = cVar.f119984h;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.mMusicPath != null && !videoPublishEditModel.isStickPointMode) {
            cVar.mo87811b().mo114805a((AbstractC72510a) false, false, false);
            if (videoPublishEditModel.hasOriginalSound()) {
                AbstractC72510a b = cVar.mo87811b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                C89219l.m154716b(ofVoice, "");
                b.mo114800a(ofVoice);
            }
            cVar.f119990u = C63253l.f143623a.mo73306b().mo101542b(videoPublishEditModel.mMusicPath);
            TextView textView = cVar.f119980d;
            if (textView == null) {
                C89219l.m154710a("mTextViewTotalTime");
            }
            textView.setText(C40983r.m82524a(cVar.f119990u));
            cVar.f119986j = videoPublishEditModel.mMusicStart;
            cVar.f119987k = cVar.f119986j;
            Boolean bool = videoPublishEditModel.isSoundLoop;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            cVar.f119988l = z;
            cVar.f119989t = cVar.f119988l;
            C22228c.m41830a(cVar, new View$OnTouchListenerC52075c.RunnableC52092p(cVar));
            if (!cVar.f119965C) {
                cVar.mo87810a(true);
            }
            AbstractC31071f value = cVar.mo87811b().mo114778C().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            int a = value.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, cVar.f119963A);
            if (a != 0) {
                C73991bj.m130131b("cutMusic seek error: ".concat(String.valueOf(a)));
            }
            AbstractC84919c cVar2 = cVar.f119993x;
            if (cVar2 != null) {
                cVar2.mo87533b(cVar.f119964B);
            }
        }
    }

    public C52072b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f119959e = fVar;
        this.f119955a = bVar;
    }
}
