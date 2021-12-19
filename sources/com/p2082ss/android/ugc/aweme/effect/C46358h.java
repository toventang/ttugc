package com.p2082ss.android.ugc.aweme.effect;

import android.graphics.Bitmap;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88276k;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import dmt.p4542av.video.C88300w;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.h */
public final class C46358h implements AbstractC46354a {

    /* renamed from: a */
    public final ActivityC0945e f108054a;

    /* renamed from: b */
    private final AbstractC89244h f108055b = C89250i.m154774a(EnumC89331m.NONE, new C46359a(this));

    /* renamed from: c */
    private final C1213t<Boolean> f108056c = new C1213t<>();

    static {
        Covode.recordClassIndex(54935);
    }

    /* renamed from: n */
    private final AbstractC82155c m89429n() {
        return (AbstractC82155c) this.f108055b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: a */
    public final ActivityC0945e mo78849a() {
        return this.f108054a;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: f */
    public final C1213t<Boolean> mo78855f() {
        return this.f108056c;
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.h$a */
    public static final class C46359a extends AbstractC89220m implements AbstractC89171a<AbstractC82155c> {

        /* renamed from: a */
        final /* synthetic */ C46358h f108057a;

        static {
            Covode.recordClassIndex(54936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46359a(C46358h hVar) {
            super(0);
            this.f108057a = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.effect.h r0 = r2.f108057a
                androidx.fragment.app.e r0 = r0.f108054a
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r0 = com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.C46358h.C46359a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: b */
    public final VideoPublishEditModel mo78851b() {
        return m89429n().mo120450Y();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: c */
    public final C1213t<Boolean> mo78852c() {
        return m89429n().mo114819h();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: d */
    public final C1213t<Bitmap> mo78853d() {
        return m89429n().mo114820i();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: e */
    public final LiveData<AbstractC31071f> mo78854e() {
        return m89429n().mo114778C();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: g */
    public final ArrayList<EffectPointModel> mo78856g() {
        return m89429n().mo114829r();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: h */
    public final C88271g<C88292p> mo78857h() {
        return m89429n().mo114827p();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: i */
    public final C1213t<C88296t> mo78858i() {
        return m89429n().mo114833v();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: j */
    public final LiveData<Boolean> mo78859j() {
        return m89429n().mo114830s();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: k */
    public final C1213t<C88297u> mo78860k() {
        return m89429n().mo114780E();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: l */
    public final C88276k<C88300w> mo78861l() {
        return m89429n().mo114828q();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: m */
    public final LiveData<C88300w> mo78862m() {
        return m89429n().mo114831t();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a
    /* renamed from: a */
    public final void mo78850a(VEVolumeChangeOp vEVolumeChangeOp) {
        C89219l.m154721d(vEVolumeChangeOp, "");
        m89429n().mo114800a(vEVolumeChangeOp);
    }

    public C46358h(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f108054a = eVar;
    }
}
