package com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.d */
public final class C83504d {

    /* renamed from: a */
    public final AbstractC63192ar f186486a;

    /* renamed from: b */
    public MusicModel f186487b;

    /* renamed from: c */
    public final ActivityC0945e f186488c;

    /* renamed from: d */
    public final AbstractC89183m<MusicModel, Long, C89391z> f186489d;

    /* renamed from: e */
    public final AbstractC89187q<String, MusicModel, String, C89391z> f186490e;

    /* renamed from: f */
    public final AbstractC89183m<MusicModel, Exception, C89391z> f186491f;

    /* renamed from: g */
    public final AbstractC89171a<C89391z> f186492g;

    static {
        Covode.recordClassIndex(97390);
    }

    /* renamed from: a */
    public final void mo128521a() {
        this.f186486a.mo101644a();
    }

    /* renamed from: a */
    public final void mo128522a(MusicModel musicModel, boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f186486a.mo101647a(musicModel, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.Long, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.q<? super java.lang.String, ? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.shortvideo.model.MusicModel, ? super java.lang.Exception, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C83504d(ActivityC0945e eVar, AbstractC89183m<? super MusicModel, ? super Long, C89391z> mVar, AbstractC89187q<? super String, ? super MusicModel, ? super String, C89391z> qVar, AbstractC89183m<? super MusicModel, ? super Exception, C89391z> mVar2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(eVar, "");
        this.f186488c = eVar;
        this.f186489d = mVar;
        this.f186490e = qVar;
        this.f186491f = mVar2;
        this.f186492g = aVar;
        AbstractC63192ar t = C63244g.m114602a().mo73292t();
        this.f186486a = t;
        t.mo101645a(new AbstractC60820a(this) {
            /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83504d.C835051 */

            /* renamed from: a */
            final /* synthetic */ C83504d f186493a;

            static {
                Covode.recordClassIndex(97391);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: a */
            public final MusicModel mo98228a() {
                return this.f186493a.f186487b;
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: b */
            public final Activity mo98232b() {
                return this.f186493a.f186488c;
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: c */
            public final void mo98233c() {
                AbstractC89171a<C89391z> aVar = this.f186493a.f186492g;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f186493a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: a */
            public final void mo98229a(MusicModel musicModel, long j) {
                AbstractC89183m<MusicModel, Long, C89391z> mVar = this.f186493a.f186489d;
                if (mVar != null) {
                    mVar.invoke(musicModel, Long.valueOf(j));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: a */
            public final void mo98230a(MusicModel musicModel, Exception exc) {
                AbstractC89183m<MusicModel, Exception, C89391z> mVar = this.f186493a.f186491f;
                if (mVar != null) {
                    mVar.invoke(musicModel, exc);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a
            /* renamed from: a */
            public final void mo98231a(String str, MusicModel musicModel, String str2) {
                AbstractC89187q<String, MusicModel, String, C89391z> qVar = this.f186493a.f186490e;
                if (qVar != null) {
                    qVar.invoke(str, musicModel, str2);
                }
            }
        });
    }
}
