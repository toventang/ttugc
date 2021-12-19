package com.p2082ss.android.ugc.aweme.mediaplayer;

import android.view.Surface;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.j */
public final class C59202j implements AbstractC59193a {

    /* renamed from: a */
    private AbstractC31071f f134736a;

    /* renamed from: b */
    private long f134737b;

    /* renamed from: c */
    private long f134738c;

    /* renamed from: d */
    private double f134739d = 1.0d;

    static {
        Covode.recordClassIndex(69562);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96707a() {
        this.f134736a.mo56390u();
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: d */
    public final void mo96717d() {
        this.f134736a.mo56387s();
    }

    /* renamed from: g */
    private boolean m108730g() {
        if (this.f134736a.mo56356f() == C85581w.EnumC85611j.STARTED) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final void mo96713b() {
        this.f134736a.mo56388t();
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: c */
    public final void mo96716c() {
        this.f134736a.mo56390u();
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: e */
    public final long mo96718e() {
        double j = (double) this.f134736a.mo56368j();
        double d = this.f134739d;
        Double.isNaN(j);
        return (long) (j * d);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: f */
    public final long mo96719f() {
        double k = (double) this.f134736a.mo56370k();
        double d = this.f134739d;
        Double.isNaN(k);
        return (long) (k * d);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final int mo96712b(long j) {
        mo96709a(j, this.f134738c);
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: c */
    public final int mo96715c(long j) {
        mo96709a(this.f134737b, j);
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96708a(double d) {
        this.f134736a.mo56313a(0, 0, (float) d);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final int mo96705a(long j) {
        AbstractC31071f fVar = this.f134736a;
        double d = (double) j;
        double d2 = this.f134739d;
        Double.isNaN(d);
        fVar.mo56265a((int) (d / d2), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing);
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: b */
    public final void mo96714b(double d) {
        this.f134739d = d;
        this.f134736a.mo56252a((float) d);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final int mo96706a(String str) {
        this.f134736a.mo56274a(new C31079j(new String[]{str}));
        this.f134736a.mo56381p();
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96710a(boolean z) {
        this.f134736a.mo56311a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final boolean mo96711a(Surface surface) {
        this.f134736a.mo56388t();
        return true;
    }

    public C59202j(String str, TextureView textureView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(textureView, "");
        this.f134736a = new C31060a(str, textureView);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediaplayer.AbstractC59193a
    /* renamed from: a */
    public final void mo96709a(long j, long j2) {
        boolean g = m108730g();
        this.f134737b = j;
        this.f134738c = j2;
        this.f134736a.mo56323b(((int) j) / 2, ((int) j2) / 2);
        mo96705a(j);
        if (g) {
            mo96713b();
        }
    }
}
