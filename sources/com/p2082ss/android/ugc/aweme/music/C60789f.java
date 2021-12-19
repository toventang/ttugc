package com.p2082ss.android.ugc.aweme.music;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60753a;
import com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60756c;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60768e;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60769f;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60770g;
import com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60817g;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60806b;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60811e;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60813f;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.music.service.IMusicService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68758v;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84127b;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.f */
public final class C60789f {

    /* renamed from: c */
    public static final C60790a f138134c = new C60790a((byte) 0);

    /* renamed from: a */
    public int f138135a;

    /* renamed from: b */
    public final C60769f f138136b;

    /* renamed from: d */
    private final Context f138137d;

    /* renamed from: e */
    private AbstractC60817g f138138e;

    /* renamed from: f */
    private C60811e f138139f;

    /* renamed from: g */
    private boolean f138140g;

    /* renamed from: h */
    private boolean f138141h;

    /* renamed from: i */
    private final boolean f138142i;

    /* renamed from: j */
    private String f138143j;

    static {
        Covode.recordClassIndex(71346);
    }

    public C60789f(Context context, boolean z) {
        this(context, z, false, false, null, 28);
    }

    public C60789f(Context context, boolean z, boolean z2) {
        this(context, false, z, false, null, 16);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.f$a */
    public static final class C60790a {
        static {
            Covode.recordClassIndex(71347);
        }

        private C60790a() {
        }

        public /* synthetic */ C60790a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.f$b */
    public static final class C60791b implements AbstractC61065b {

        /* renamed from: a */
        final /* synthetic */ C60789f f138144a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f138145b;

        /* renamed from: c */
        final /* synthetic */ AbstractC61065b f138146c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f138147d;

        /* renamed from: e */
        final /* synthetic */ boolean f138148e;

        static {
            Covode.recordClassIndex(71348);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69324a() {
            this.f138146c.mo69324a();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: b */
        public final void mo69328b() {
            this.f138146c.mo69328b();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69325a(int i) {
            this.f138146c.mo69325a(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69326a(C84125a aVar) {
            C89219l.m154721d(aVar, "");
            this.f138146c.mo69326a(aVar);
            this.f138147d.element.mo98222c();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
            C89219l.m154721d(str, "");
            this.f138146c.mo69327a(str, musicWaveBean);
            this.f138147d.element.mo98223d();
        }

        C60791b(C60789f fVar, MusicModel musicModel, AbstractC61065b bVar, C89233z.C89238e eVar, boolean z) {
            this.f138144a = fVar;
            this.f138145b = musicModel;
            this.f138146c = bVar;
            this.f138147d = eVar;
            this.f138148e = z;
        }
    }

    /* renamed from: a */
    public final void mo98198a() {
        this.f138136b.mo98183a();
        AbstractC60817g gVar = this.f138138e;
        if (gVar != null) {
            gVar.mo98224e();
        }
    }

    /* renamed from: a */
    public final void mo98199a(String str) {
        C89219l.m154721d(str, "");
        C60769f fVar = this.f138136b;
        C89219l.m154721d(str, "");
        AbstractC60753a remove = fVar.f138084a.remove(str);
        if (remove != null) {
            remove.mo98168b();
        }
        AbstractC60753a remove2 = fVar.f138085b.remove(str);
        if (remove2 != null) {
            remove2.mo98168b();
        }
        AbstractC60817g gVar = this.f138138e;
        if (gVar != null) {
            gVar.mo98224e();
        }
    }

    /* renamed from: a */
    public final boolean mo98200a(MusicModel musicModel, AbstractC61065b bVar) {
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(bVar, "");
        return mo98201a(musicModel, bVar, true, false);
    }

    /* renamed from: a */
    private final boolean m110342a(MusicModel musicModel, AbstractC61065b bVar, boolean z) {
        String str;
        String b;
        List c;
        String str2 = this.f138143j;
        String str3 = "";
        C89219l.m154721d(musicModel, str3);
        String musicId = musicModel.getMusicId();
        C89219l.m154716b(musicId, str3);
        String uri = musicModel.getUri();
        if (uri == null || (c = C89361p.m154921c(uri, new String[]{"/"})) == null || (str = (String) C89070n.m154561b(c, 2)) == null) {
            str = str3;
        }
        C60748d dVar = new C60748d(musicId, str, bVar, str2, (byte) 0);
        boolean z2 = false;
        if (!C60826d.m110428a(musicModel, this.f138137d, this.f138140g)) {
            bVar.mo69326a(new C84125a(5, "MusicFetcher music id is invalid : " + musicModel.getId()));
            return false;
        } else if (TextUtils.isEmpty(musicModel.getMusicId())) {
            C12290b.m22060a("aweme_music_download_error_rate", 4, new C33743c().mo59976a("errorDesc", "music id is null").mo59976a("trace", this.f138143j).mo59971a("isHitCache", (Boolean) false).mo59977a());
            StringBuilder sb = new StringBuilder("MusicFetcher music id is empty, name: ");
            String name = musicModel.getName();
            if (name == null) {
                name = str3;
            }
            StringBuilder append = sb.append(name).append(", artist: ");
            String singer = musicModel.getSinger();
            if (singer != null) {
                str3 = singer;
            }
            C73991bj.m130131b(append.append(str3).toString());
            return false;
        } else if (musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.ONLINE) {
            C73991bj.m130131b("MusicFetcher download not online music");
            return false;
        } else {
            if (C68758v.m121190a()) {
                b = C84158e.m144733a().mo128986b(musicModel.getMusicId());
            } else {
                C84158e a = C84158e.m144733a();
                UrlModel url = musicModel.getUrl();
                C89219l.m154716b(url, str3);
                b = a.mo128986b(C60768e.m110303c(url));
            }
            String musicId2 = musicModel.getMusicId();
            String a2 = C60768e.m110299a(musicModel.getUrl());
            String a3 = C60768e.m110299a(musicModel.getStrongBeatUrl());
            C33744d a4 = new C33744d().mo59983a("music_id", musicId2).mo59983a("enter_from", this.f138143j).mo59983a("url", a2);
            IMusicService m = MusicService.m81198m();
            C89219l.m154716b(m, str3);
            C39162r.m79460a("download_music", a4.mo59980a("download_strategy", m.mo69314c()).mo59983a("musicEffectsUrl", a3).f79943a);
            C51423a.m95787a(this.f138143j + ", MusicDownloadStart: musicId=" + musicId2 + ',' + " url=" + a2 + ',');
            CountDownLatch countDownLatch = null;
            if (this.f138141h && musicModel.getStrongBeatUrl() != null) {
                if (!C68758v.m121190a() || z) {
                    countDownLatch = new CountDownLatch(1);
                }
                UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
                C89219l.m154716b(strongBeatUrl, str3);
                C89219l.m154716b(b, str3);
                String musicId3 = musicModel.getMusicId();
                C89219l.m154716b(musicId3, str3);
                C60756c cVar = new C60756c(strongBeatUrl, b, musicId3, countDownLatch);
                cVar.mo98173a(this.f138136b);
                cVar.mo98174c();
            }
            C60770g gVar = new C60770g(this.f138137d, musicModel, new C60741c(dVar), countDownLatch, this.f138142i, this.f138140g, this.f138143j, this.f138135a);
            C60769f fVar = this.f138136b;
            C89219l.m154721d(fVar, str3);
            gVar.f138095j = fVar;
            if (gVar.f138096k.isPlayUrlValid()) {
                gVar.f138097l.mo69328b();
                gVar.f138094i = System.currentTimeMillis();
                C84158e a5 = C84158e.m144733a();
                C89219l.m154716b(a5, str3);
                String c2 = a5.mo128988c();
                if (!C84127b.m144668b(c2)) {
                    C84127b.m144667a(c2);
                }
                if (C68758v.m121190a()) {
                    z2 = C60768e.m110301a(gVar.f138088c, gVar.f138089d, "download");
                } else {
                    Context context = gVar.f138087b;
                    C89219l.m154716b(context, str3);
                    UrlModel url2 = gVar.f138096k.getUrl();
                    C89219l.m154716b(url2, str3);
                    String c3 = C60768e.m110303c(url2);
                    C89219l.m154721d(context, str3);
                    if (!TextUtils.isEmpty(c3)) {
                        C84158e a6 = C84158e.m144733a();
                        C89219l.m154716b(a6, str3);
                        if (Downloader.getInstance(context).getDownloadInfo(c3, a6.mo128988c()) != null) {
                            z2 = true;
                        }
                    }
                }
                gVar.f138093h = z2;
                if (gVar.f138096k.isNeedSetCookie()) {
                    C60768e.m110300a(gVar.f138096k, gVar.f138100o, gVar.f138093h);
                }
                AbstractC60755b bVar2 = gVar.f138092g;
                MusicModel musicModel2 = gVar.f138096k;
                String str4 = gVar.f138090e;
                C89219l.m154716b(str4, str3);
                UrlModel url3 = gVar.f138096k.getUrl();
                C89219l.m154716b(url3, str3);
                List<String> urlList = url3.getUrlList();
                C89219l.m154716b(urlList, str3);
                bVar2.mo98170a(musicModel2, str4, urlList, new C60770g.C60773c(gVar));
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo98201a(MusicModel musicModel, AbstractC61065b bVar, boolean z, boolean z2) {
        C89219l.m154721d(musicModel, "");
        C89219l.m154721d(bVar, "");
        AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_music_download", "MusicFetcher start");
        if (!z) {
            return m110342a(musicModel, bVar, z2);
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new C60813f(this.f138139f);
        this.f138138e = eVar.element;
        T t = eVar.element;
        if (t != null) {
            try {
                t.mo98211a();
            } catch (Throwable th) {
                if (th instanceof C60806b) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        return m110342a(musicModel, new C60791b(this, musicModel, bVar, eVar, z2), z2);
    }

    public C60789f(Context context, boolean z, boolean z2, boolean z3, String str) {
        C89219l.m154721d(context, "");
        this.f138140g = z;
        this.f138141h = z2;
        this.f138142i = z3;
        this.f138143j = str;
        this.f138135a = 6;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        this.f138137d = applicationContext;
        this.f138136b = new C60769f();
        this.f138139f = new C60811e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60789f(Context context, boolean z, boolean z2, boolean z3, String str, int i) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? null : str);
    }
}
