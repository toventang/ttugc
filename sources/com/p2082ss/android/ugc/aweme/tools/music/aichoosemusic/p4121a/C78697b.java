package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4121a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.a.b */
public final class C78697b implements AbstractC78695a {

    /* renamed from: a */
    public static final C78697b f176839a = new C78697b();

    private C78697b() {
    }

    static {
        Covode.recordClassIndex(91840);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.a.b$a */
    static final class C78698a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f176840a;

        /* renamed from: b */
        final /* synthetic */ String f176841b;

        /* renamed from: c */
        final /* synthetic */ String f176842c;

        /* renamed from: d */
        final /* synthetic */ long f176843d;

        /* renamed from: e */
        final /* synthetic */ int f176844e;

        /* renamed from: f */
        final /* synthetic */ int f176845f;

        static {
            Covode.recordClassIndex(91841);
        }

        C78698a(String str, String str2, String str3, long j, int i, int i2) {
            this.f176840a = str;
            this.f176841b = str2;
            this.f176842c = str3;
            this.f176843d = j;
            this.f176844e = i;
            this.f176845f = i2;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<SuggestMusicList> vVar) {
            C89219l.m154721d(vVar, "");
            if (!C63244g.m114602a().mo73255A().mo93903b() || C63244g.m114602a().mo73255A().mo93901a()) {
                vVar.mo143024a(new IllegalStateException("User state illegal, cancel upload request."));
                return;
            }
            C1731i<SuggestMusicList> a = MusicService.m81198m().mo69291a(this.f176840a, this.f176841b, this.f176842c, this.f176843d, this.f176844e, this.f176845f);
            if (a != null) {
                a.mo5532a(new AbstractC1729g() {
                    /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4121a.C78697b.C78698a.C786991 */

                    static {
                        Covode.recordClassIndex(91842);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        C89219l.m154716b(iVar, "");
                        if (iVar.mo5544c() || !iVar.mo5535a()) {
                            vVar.mo143024a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.mo5545d() != null) {
                            vVar.mo143031a(iVar.mo5545d());
                        } else {
                            vVar.mo143024a((Throwable) new IllegalStateException("Result is null"));
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4121a.AbstractC78695a
    /* renamed from: a */
    public final AbstractC88979t<SuggestMusicList> mo122556a(String str, String str2, String str3, long j, int i, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC88979t<SuggestMusicList> a = AbstractC88979t.m154294a(new C78698a(str, str2, str3, j, i, i2));
        C89219l.m154716b(a, "");
        return a;
    }
}
