package com.p2082ss.android.ugc.gamora.editor.cutmusic;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.p2730de.C40983r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.b */
public final class C82105b extends AbstractC23520b<EditMusicCutViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f183698a;

    /* renamed from: b */
    public final int f183699b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f183700c = C89250i.m154773a((AbstractC89171a) new C82106a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditMusicCutViewModel> f183701d = C82107b.f183704a;

    /* renamed from: e */
    private final C21582f f183702e;

    static {
        Covode.recordClassIndex(95933);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditMusicCutViewModel> mo23031b() {
        return this.f183701d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f183698a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183702e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.b$b */
    static final class C82107b extends AbstractC89220m implements AbstractC89171a<EditMusicCutViewModel> {

        /* renamed from: a */
        public static final C82107b f183704a = new C82107b();

        static {
            Covode.recordClassIndex(95935);
        }

        C82107b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditMusicCutViewModel invoke() {
            return new EditMusicCutViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.b$a */
    static final class C82106a extends AbstractC89220m implements AbstractC89171a<View$OnTouchListenerC82108c> {

        /* renamed from: a */
        final /* synthetic */ C82105b f183703a;

        static {
            Covode.recordClassIndex(95934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82106a(C82105b bVar) {
            super(0);
            this.f183703a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnTouchListenerC82108c invoke() {
            View$OnTouchListenerC82108c cVar = new View$OnTouchListenerC82108c(this.f183703a.getDiContainer());
            this.f183703a.f183698a.mo36387a(this.f183703a.f183699b, cVar, "EditMusicCutScene");
            AbstractC82563s sVar = (AbstractC82563s) cVar.getDiContainer().mo35249a((Type) AbstractC82563s.class, (String) null);
            C89219l.m154721d(sVar, "");
            cVar.f183729h = sVar;
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        boolean z;
        View$OnTouchListenerC82108c cVar = (View$OnTouchListenerC82108c) this.f183700c.getValue();
        if (cVar.mo127336a().mMusicPath != null && !cVar.mo127336a().isStickPointMode) {
            cVar.mo127339b().mo114805a((AbstractC72510a) false, false, false);
            if (cVar.mo127336a().hasOriginalSound()) {
                AbstractC72510a b = cVar.mo127339b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                C89219l.m154716b(ofVoice, "");
                b.mo114800a(ofVoice);
            }
            cVar.f183735u = C63253l.f143623a.mo73306b().mo101542b(cVar.mo127336a().mMusicPath);
            TextView textView = cVar.f183726e;
            if (textView == null) {
                C89219l.m154710a("mTextViewTotalTime");
            }
            textView.setText(C40983r.m82524a(cVar.f183735u));
            cVar.f183731j = cVar.mo127336a().mMusicStart;
            cVar.f183732k = cVar.f183731j;
            Boolean bool = cVar.mo127336a().isSoundLoop;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            cVar.f183733l = z;
            cVar.f183734t = cVar.f183733l;
            C22228c.m41830a(cVar, new View$OnTouchListenerC82108c.RunnableC82126q(cVar));
            if (!cVar.f183709C) {
                cVar.mo127338a(true);
            }
            AbstractC31071f value = cVar.mo127339b().mo114778C().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            int a = value.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, cVar.f183707A);
            if (a != 0) {
                C73991bj.m130131b("cutMusic seek error: ".concat(String.valueOf(a)));
            }
            AbstractC84919c cVar2 = cVar.f183738x;
            if (cVar2 != null) {
                cVar2.mo87533b(cVar.f183708B);
            }
        }
    }

    public C82105b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f183702e = fVar;
        this.f183698a = bVar;
    }
}
