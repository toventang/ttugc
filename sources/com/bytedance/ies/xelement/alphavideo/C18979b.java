package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58529d;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a;
import com.p2082ss.ttm.player.AbstractC86253m;
import com.p2082ss.ttm.player.C86277r;

/* renamed from: com.bytedance.ies.xelement.alphavideo.b */
public class C18979b extends C58555a<C18979b> {

    /* renamed from: a */
    public AbstractC86253m f44916a;

    /* renamed from: h */
    private Context f44917h;

    /* renamed from: i */
    private AbstractC86253m.AbstractC86260g f44918i = new AbstractC86253m.AbstractC86260g() {
        /* class com.bytedance.ies.xelement.alphavideo.C18979b.C189801 */

        static {
            Covode.recordClassIndex(21729);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86260g
        /* renamed from: a */
        public final void mo16757a(AbstractC86253m mVar) {
            if (C18979b.this.f133390e != null) {
                LLog.m56856a(4, "x-alpha-video", "Prepare success with player : [" + C18979b.this.f44916a + "]");
                C18979b.this.f133390e.mo16791a();
            }
        }
    };

    /* renamed from: j */
    private AbstractC86253m.AbstractC86256c f44919j = new AbstractC86253m.AbstractC86256c() {
        /* class com.bytedance.ies.xelement.alphavideo.C18979b.C189812 */

        static {
            Covode.recordClassIndex(21730);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86256c
        /* renamed from: a */
        public final boolean mo16758a(AbstractC86253m mVar, int i, int i2) {
            if (C18979b.this.f133391f == null) {
                return false;
            }
            C18979b.this.f133391f.mo16792a(i, i2, "TTMediaPlayer on error");
            return false;
        }
    };

    /* renamed from: k */
    private AbstractC86253m.AbstractC86255b f44920k = new AbstractC86253m.AbstractC86255b() {
        /* class com.bytedance.ies.xelement.alphavideo.C18979b.C189823 */

        static {
            Covode.recordClassIndex(21731);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86255b
        /* renamed from: a */
        public final void mo16759a(AbstractC86253m mVar) {
            if (C18979b.this.f133389d != null) {
                C18979b.this.f133389d.mo16789a();
            }
        }
    };

    /* renamed from: l */
    private AbstractC86253m.AbstractC86258e f44921l = new AbstractC86253m.AbstractC86258e() {
        /* class com.bytedance.ies.xelement.alphavideo.C18979b.C189834 */

        static {
            Covode.recordClassIndex(21732);
        }

        @Override // com.p2082ss.ttm.player.AbstractC86253m.AbstractC86258e
        /* renamed from: a */
        public final boolean mo16760a(AbstractC86253m mVar, int i, int i2) {
            if (i != 3 || C18979b.this.f133392g == null) {
                return false;
            }
            C18979b.this.f133392g.mo16788a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(21728);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: j */
    public final String mo16744j() {
        return C18979b.class.getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: k */
    public final boolean mo16756k() {
        return this.f44916a.mo16728p();
    }

    /* renamed from: l */
    private AbstractC86253m m35191l() {
        C86277r.m148506a(2, true);
        C86277r.m148506a(1, true);
        C86277r.m148506a(11, true);
        return C18986e.m35211a(this.f44917h);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: h */
    public final C58529d mo16742h() {
        return new C58529d(this.f44916a.mo16725m(), this.f44916a.mo16724l(), this.f44916a.mo16726n());
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: i */
    public final int mo16743i() {
        AbstractC86253m mVar = this.f44916a;
        if (mVar != null) {
            return mVar.mo16723k();
        }
        LLog.m56856a(6, "x-alpha-video", "player is null when getCurrentPosition");
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16731a() {
        AbstractC86253m l = m35191l();
        if (l != null || ((l = m35191l()) != null && !l.mo16707a())) {
            this.f44916a = l;
            l.mo16687a(36, 1);
            this.f44916a.mo16699a(this.f44918i);
            this.f44916a.mo16696a(this.f44919j);
            this.f44916a.mo16695a(this.f44920k);
            this.f44916a.mo16698a(this.f44921l);
            return;
        }
        throw new Exception("create ttplayer failure");
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16735b() {
        super.mo16735b();
        LLog.m56856a(4, "x-alpha-video", "prepareAsync() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16722j();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: c */
    public final void mo16737c() {
        LLog.m56856a(4, "x-alpha-video", "start() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16718f();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: d */
    public final void mo16738d() {
        LLog.m56856a(4, "x-alpha-video", "pause() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16719g();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: e */
    public final void mo16739e() {
        LLog.m56856a(4, "x-alpha-video", "stop() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16721i();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: f */
    public final void mo16740f() {
        LLog.m56856a(4, "x-alpha-video", "reset() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16720h();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: g */
    public final void mo16741g() {
        LLog.m56856a(4, "x-alpha-video", "release() called with player : [" + this.f44916a + "]");
        this.f44916a.mo16716d();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16732a(Surface surface) {
        this.f44916a.mo16691a(surface);
    }

    public C18979b(Context context) {
        super(context);
        this.f44917h = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16733a(String str) {
        super.mo16733a(str);
        LLog.m56856a(4, "x-alpha-video", "setDataSource() called with player : [" + this.f44916a + "]");
        if (this.f44916a.mo16728p()) {
            this.f44916a.mo16721i();
        }
        this.f44916a.mo16720h();
        this.f44916a.mo16689a(this.f44917h, Uri.parse(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: b */
    public final void mo16736b(boolean z) {
        super.mo16736b(z);
        LLog.m56856a(4, "x-alpha-video", "setScreenOnWhilePlaying(" + z + ") called with player : [" + this.f44916a + "]");
        this.f44916a.mo16729q();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.AbstractC58561c, com.p2082ss.android.ugc.aweme.live.alphaplayer.p3402d.C58555a
    /* renamed from: a */
    public final void mo16734a(boolean z) {
        LLog.m56856a(4, "x-alpha-video", "setLooping(" + z + ") called with player : [" + this.f44916a + "]");
        this.f44916a.mo16706a(z);
    }
}
