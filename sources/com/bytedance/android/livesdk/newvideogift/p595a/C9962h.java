package com.bytedance.android.livesdk.newvideogift.p595a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58529d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.ttm.player.AbstractC86253m;
import com.p2082ss.ttm.player.C86277r;

/* renamed from: com.bytedance.android.livesdk.newvideogift.a.h */
public final class C9962h extends C58555a<C9962h> {

    /* renamed from: a */
    private final Context f24145a;

    /* renamed from: h */
    private AbstractC86253m f24146h;

    /* renamed from: i */
    private AbstractC86253m.AbstractC86260g f24147i = new AbstractC86253m.AbstractC86260g() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9962h.C99631 */

        static {
            Covode.recordClassIndex(11515);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86260g
        /* renamed from: a */
        public final void mo16757a(AbstractC86253m mVar) {
            if (C9962h.this.f133390e != null) {
                C9962h.this.f133390e.mo16791a();
            }
        }
    };

    /* renamed from: j */
    private AbstractC86253m.AbstractC86256c f24148j = new AbstractC86253m.AbstractC86256c() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9962h.C99642 */

        static {
            Covode.recordClassIndex(11516);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86256c
        /* renamed from: a */
        public final boolean mo16758a(AbstractC86253m mVar, int i, int i2) {
            if (C9962h.this.f133391f == null) {
                return false;
            }
            C9962h.this.f133391f.mo16792a(i, i2, "TTMediaPlayer on error");
            return false;
        }
    };

    /* renamed from: k */
    private AbstractC86253m.AbstractC86255b f24149k = new AbstractC86253m.AbstractC86255b() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9962h.C99653 */

        static {
            Covode.recordClassIndex(11517);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86255b
        /* renamed from: a */
        public final void mo16759a(AbstractC86253m mVar) {
            if (C9962h.this.f133389d != null) {
                C9962h.this.f133389d.mo16789a();
            }
        }
    };

    /* renamed from: l */
    private AbstractC86253m.AbstractC86258e f24150l = new AbstractC86253m.AbstractC86258e() {
        /* class com.bytedance.android.livesdk.newvideogift.p595a.C9962h.C99664 */

        static {
            Covode.recordClassIndex(11518);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86258e
        /* renamed from: a */
        public final boolean mo16760a(AbstractC86253m mVar, int i, int i2) {
            if (i != 3 || C9962h.this.f133392g == null) {
                return false;
            }
            C9962h.this.f133392g.mo16788a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(11514);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: j */
    public final String mo16744j() {
        return "TTGiftPlayerImpl";
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: i */
    public final int mo16743i() {
        return this.f24146h.mo16723k();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: k */
    public final boolean mo16756k() {
        return this.f24146h.mo16728p();
    }

    /* renamed from: l */
    private AbstractC86253m m18375l() {
        C86277r.m148506a(2, false);
        C86277r.m148506a(1, true);
        C86277r.m148506a(11, true);
        return C9959f.m18299a(this.f24145a);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: h */
    public final C58529d mo16742h() {
        return new C58529d(this.f24146h.mo16725m(), this.f24146h.mo16724l(), this.f24146h.mo16726n());
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16735b() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "prepareAsync() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16712b(false);
        super.mo16735b();
        this.f24146h.mo16722j();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: c */
    public final void mo16737c() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "start() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16718f();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: d */
    public final void mo16738d() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "pause() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16719g();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: e */
    public final void mo16739e() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "stop() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16721i();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: f */
    public final void mo16740f() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "reset() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16720h();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: g */
    public final void mo16741g() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "release() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16716d();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16731a() {
        C3854a.m9453a(3, "Alpha-TTPlayer", "initMediaPlayer() called");
        if (EnumC8917a.Player.isInstalled()) {
            AbstractC86253m l = m18375l();
            if (l != null || ((l = m18375l()) != null && !l.mo16707a())) {
                this.f24146h = l;
                l.mo16687a(36, 1);
                this.f24146h.mo16699a(this.f24147i);
                this.f24146h.mo16696a(this.f24148j);
                this.f24146h.mo16695a(this.f24149k);
                this.f24146h.mo16698a(this.f24150l);
                this.f24146h.mo16687a(59, 1);
                return;
            }
            throw new Exception("create ttplayer failure");
        }
        throw new IllegalStateException("ttm plugin not installed");
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16734a(boolean z) {
        this.f24146h.mo16706a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16736b(boolean z) {
        super.mo16736b(z);
        this.f24146h.mo16729q();
    }

    public C9962h(Context context) {
        super(context);
        this.f24145a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16732a(Surface surface) {
        C3854a.m9453a(3, "Alpha-TTPlayer", "setSurface() called with player : [" + this.f24146h + "]");
        this.f24146h.mo16691a(surface);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16733a(String str) {
        C3854a.m9453a(3, "Alpha-TTPlayer", "setDataSource() called with player : [" + this.f24146h + "]");
        super.mo16733a(str);
        if (this.f24146h.mo16728p()) {
            this.f24146h.mo16721i();
        }
        this.f24146h.mo16720h();
        this.f24146h.mo16689a(this.f24145a, Uri.parse(str));
    }
}
