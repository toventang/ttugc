package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.a */
public final class C57238a {

    /* renamed from: a */
    public ChooseMusicApi.API f130379a = ChooseMusicApi.f130230a;

    /* renamed from: b */
    DataCenter f130380b;

    /* renamed from: c */
    public boolean f130381c;

    /* renamed from: d */
    Context f130382d;

    /* renamed from: e */
    public boolean f130383e;

    /* renamed from: f */
    public boolean f130384f;

    /* renamed from: g */
    public boolean f130385g;

    static {
        Covode.recordClassIndex(67143);
    }

    /* renamed from: a */
    public final void mo94455a() {
        ChooseMusicApi.m103648b(0).mo5534a(new C57244f(this), C1731i.f5564c, null);
    }

    /* renamed from: b */
    public final void mo94459b() {
        if (!this.f130384f) {
            this.f130384f = true;
            ChooseMusicApi.m103644a(0).mo5534a(new C57249k(this, C27252o.m54253a()), C1731i.f5564c, null);
        }
    }

    /* renamed from: c */
    public final void mo94461c() {
        if (!this.f130385g) {
            this.f130385g = true;
            this.f130379a.getHotMusicList(0, 20, false).mo5534a(new C57251m(this), C1731i.f5564c, null);
        }
    }

    public C57238a(Context context, DataCenter dataCenter) {
        this.f130380b = dataCenter;
        this.f130382d = context;
    }

    /* renamed from: b */
    public final void mo94460b(String str, int i) {
        ChooseMusicApi.m103649b(str, 0, 30, i).mo5534a(new C57248j(this, i), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public final void mo94457a(String str, int i) {
        if (!this.f130383e) {
            this.f130383e = true;
            ChooseMusicApi.m103646a(str, 0, 30, i).mo5534a(new C57246h(this), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public final void mo94458a(boolean z, String str, final Music music) {
        ChooseMusicApi.m103645a((Integer) this.f130380b.mo60195b("radio_cursor", (Object) 0), str).mo5534a(new AbstractC1729g<C57256r, C57256r>() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e.C57238a.C572391 */

            static {
                Covode.recordClassIndex(67144);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C57256r then(C1731i<C57256r> iVar) {
                Music music = music;
                if (music != null) {
                    try {
                        Music music2 = ChooseMusicApi.m103647a(music.getMid()).f130038a;
                        if (music2 != null) {
                            music.setCollectStatus(music2.getCollectStatus());
                        }
                    } catch (Exception unused) {
                    }
                }
                return iVar.mo5545d();
            }
        }, C1731i.f5562a, null).mo5534a(new C57240b(this, z, str, music), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public final void mo94456a(MusicModel musicModel, String str, int i, int i2, int i3) {
        this.f130379a.collectMusic(str, i).mo5534a(new C57243e(this, musicModel, i, i2, i3), C1731i.f5564c, null);
    }
}
