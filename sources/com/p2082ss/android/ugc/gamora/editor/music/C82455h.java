package com.p2082ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63147a;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.C63151d;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.C63152e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.gamora.editor.music.C82458i;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.music.h */
public class C82455h extends AbstractC23520b<EditMusicViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f184406a;

    /* renamed from: b */
    public final int f184407b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f184408c = C89250i.m154773a((AbstractC89171a) new C82456a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditMusicViewModel> f184409d = C82457b.f184412a;

    /* renamed from: e */
    private final C21582f f184410e;

    static {
        Covode.recordClassIndex(96295);
    }

    /* renamed from: a */
    private final C82458i m142518a() {
        return (C82458i) this.f184408c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditMusicViewModel> mo23031b() {
        return this.f184409d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184406a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f184410e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.h$b */
    static final class C82457b extends AbstractC89220m implements AbstractC89171a<EditMusicViewModel> {

        /* renamed from: a */
        public static final C82457b f184412a = new C82457b();

        static {
            Covode.recordClassIndex(96297);
        }

        C82457b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        AbstractC63147a aVar = m142518a().f184419f;
        if (aVar != null) {
            aVar.mo101505b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.h$a */
    static final class C82456a extends AbstractC89220m implements AbstractC89171a<C82458i> {

        /* renamed from: a */
        final /* synthetic */ C82455h f184411a;

        static {
            Covode.recordClassIndex(96296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82456a(C82455h hVar) {
            super(0);
            this.f184411a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82458i invoke() {
            C82458i iVar = new C82458i(this.f184411a.getDiContainer(), this.f184411a.f184406a);
            this.f184411a.f184406a.mo36387a(this.f184411a.f184407b, iVar, "EditMusicVerticalScene");
            return iVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        int i;
        boolean z;
        boolean z2;
        C82458i a = m142518a();
        if (a.f184419f == null) {
            boolean a2 = C71528a.m126416a(a.mo127552a());
            a.f184419f = C63253l.f143623a.mo73306b().mo101548g();
            List<String> list = null;
            VideoPublishEditModel a3 = a.mo127552a();
            if (a3.isMvThemeVideoType() && !C80285bz.m139187a(a3)) {
                list = a3.mvCreateVideoData.musicIds;
            }
            a.mo127552a();
            VideoPublishEditModel a4 = a.mo127552a();
            Activity t = a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C82466j jVar = new C82466j(a4, (ActivityC0945e) t);
            boolean z3 = a.mo127552a().mIsFromDraft;
            Activity t2 = a.mo36486t();
            Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC0945e eVar = (ActivityC0945e) t2;
            AbstractC31071f value = a.mo127553b().mo114778C().getValue();
            if (value != null) {
                i = value.mo56368j();
            } else {
                i = 0;
            }
            String str = a.mo127552a().creationId;
            if (str == null) {
                str = "";
            }
            boolean z4 = a.mo127552a().isPhotoMvMode;
            C63152e C = a.mo127551C();
            if (a.mo127552a().realHasOriginalSound() || a.mo127552a().isFastImport) {
                z = true;
            } else {
                z = false;
            }
            boolean z5 = a.mo127552a().editMusicSyncMode;
            if (C16048b.m29633a().mo25412a(true, "ai_music_panel_new", 0) != 2 || a.mo127552a().mIsFromDraft) {
                z2 = false;
            } else {
                z2 = true;
            }
            C63151d dVar = new C63151d(list, z3, eVar, i, a2 ? 1 : 0, str, z4, C, z, z5, z2, a.f184422i, jVar);
            AbstractC63147a aVar = a.f184419f;
            if (aVar != null) {
                aVar.mo101503a(dVar);
            }
            a.mo127554d().mo127280g().mo7038b(a, new C82458i.C82465g(a));
        }
        AbstractC63147a aVar2 = a.f184419f;
        if (aVar2 != null) {
            aVar2.mo101504a(a.mo127551C());
        }
        AbstractC63147a aVar3 = a.f184419f;
        if (aVar3 != null) {
            aVar3.mo101502a();
        }
    }

    public C82455h(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184410e = fVar;
        this.f184406a = bVar;
    }
}
