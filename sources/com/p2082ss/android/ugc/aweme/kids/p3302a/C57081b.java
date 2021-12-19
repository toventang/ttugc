package com.p2082ss.android.ugc.aweme.kids.p3302a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.AbstractC57088c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.C57089d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.C57092e;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.C57093f;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3305c.C57094g;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.C57114b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.C57116d;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.C57118e;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57145a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57148d;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57154a;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57158b;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.kids.a.b */
public final class C57081b {

    /* renamed from: d */
    public static final C57082a f129950d = new C57082a((byte) 0);

    /* renamed from: a */
    public int f129951a;

    /* renamed from: b */
    public final C57093f f129952b;

    /* renamed from: c */
    public AbstractC57122f f129953c;

    /* renamed from: e */
    private final Context f129954e;

    /* renamed from: f */
    private C57116d f129955f;

    /* renamed from: g */
    private boolean f129956g = true;

    /* renamed from: h */
    private boolean f129957h = true;

    /* renamed from: i */
    private final boolean f129958i = true;

    /* renamed from: j */
    private String f129959j;

    static {
        Covode.recordClassIndex(66975);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.b$a */
    public static final class C57082a {
        static {
            Covode.recordClassIndex(66976);
        }

        private C57082a() {
        }

        public /* synthetic */ C57082a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.b$b */
    public static final class C57083b implements AbstractC57123a {

        /* renamed from: a */
        final /* synthetic */ C57081b f129960a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f129961b;

        /* renamed from: c */
        final /* synthetic */ AbstractC57123a f129962c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f129963d;

        /* renamed from: e */
        final /* synthetic */ boolean f129964e;

        static {
            Covode.recordClassIndex(66977);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94228a() {
            this.f129962c.mo94228a();
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: b */
        public final void mo94232b() {
            this.f129962c.mo94232b();
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94229a(int i) {
            this.f129962c.mo94229a(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94230a(C57154a aVar) {
            C89219l.m154721d(aVar, "");
            this.f129962c.mo94230a(aVar);
            this.f129963d.element.mo94266c();
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3309g.AbstractC57123a
        /* renamed from: a */
        public final void mo94231a(String str, MusicWaveBean musicWaveBean) {
            C89219l.m154721d(str, "");
            this.f129962c.mo94231a(str, musicWaveBean);
            this.f129963d.element.mo94267d();
        }

        C57083b(C57081b bVar, MusicModel musicModel, AbstractC57123a aVar, C89233z.C89238e eVar, boolean z) {
            this.f129960a = bVar;
            this.f129961b = musicModel;
            this.f129962c = aVar;
            this.f129963d = eVar;
            this.f129964e = z;
        }
    }

    public C57081b(Context context, String str) {
        C89219l.m154721d(context, "");
        this.f129959j = str;
        this.f129951a = 6;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        this.f129954e = applicationContext;
        this.f129952b = new C57093f();
        this.f129955f = new C57116d();
    }

    /* renamed from: a */
    public final boolean mo94241a(MusicModel musicModel, AbstractC57123a aVar, boolean z) {
        List<String> list;
        String str = "";
        C89219l.m154721d(musicModel, str);
        C89219l.m154721d(aVar, str);
        AVExternalServiceImpl.m113114a().provideAVPerformance().start("av_music_download", "MusicFetcher start");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new C57118e(this.f129955f);
        this.f129953c = eVar.element;
        T t = eVar.element;
        if (t != null) {
            try {
                t.mo94261a();
            } catch (Throwable th) {
                if (th instanceof C57114b) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        C57083b bVar = new C57083b(this, musicModel, aVar, eVar, z);
        boolean z2 = false;
        if (C57147c.m103544a(musicModel, this.f129954e, this.f129956g)) {
            if (TextUtils.isEmpty(musicModel.getMusicId())) {
                C12290b.m22060a("aweme_music_download_error_rate", 4, new C33743c().mo59976a("errorDesc", "music id is null").mo59976a("trace", this.f129959j).mo59971a("isHitCache", (Boolean) false).mo59977a());
                StringBuilder sb = new StringBuilder("MusicFetcher music id is empty, name: ");
                String name = musicModel.getName();
                if (name == null) {
                    name = str;
                }
                StringBuilder append = sb.append(name).append(", artist: ");
                String singer = musicModel.getSinger();
                if (singer != null) {
                    str = singer;
                }
                C73991bj.m130131b(append.append(str).toString());
            } else if (musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.ONLINE) {
                C73991bj.m130131b("MusicFetcher download not online music");
            } else {
                MusicModel a = C57145a.m103539a(musicModel);
                C57166d a2 = C57166d.m103601a();
                UrlModel url = a.getUrl();
                C89219l.m154716b(url, str);
                String str2 = a2.mo94368b() + C57158b.m103575c(C57092e.m103457b(url));
                String musicId = a.getMusicId();
                String a3 = C57092e.m103455a(a.getUrl());
                C57092e.m103455a(a.getStrongBeatUrl());
                C51423a.m95787a(this.f129959j + ", MusicDownloadStart: musicId=" + musicId + ',' + " url=" + a3 + ',');
                CountDownLatch countDownLatch = null;
                if (this.f129957h && a.getStrongBeatUrl() != null) {
                    if (z) {
                        countDownLatch = new CountDownLatch(1);
                    }
                    UrlModel strongBeatUrl = a.getStrongBeatUrl();
                    C89219l.m154716b(strongBeatUrl, str);
                    C89219l.m154716b(str2, str);
                    String musicId2 = a.getMusicId();
                    C89219l.m154716b(musicId2, str);
                    C57089d dVar = new C57089d(strongBeatUrl, str2, musicId2, countDownLatch);
                    C57093f fVar = this.f129952b;
                    C89219l.m154721d(fVar, str);
                    dVar.f129973f = fVar;
                    UrlModel urlModel = dVar.f129974g;
                    if (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || C13603b.m24435a((Collection) urlModel.getUrlList())) {
                        CountDownLatch countDownLatch2 = dVar.f129976i;
                        if (countDownLatch2 != null) {
                            countDownLatch2.countDown();
                        }
                        C73991bj.m130131b("Download Music Beat illegal beat url: " + C57092e.m103455a(dVar.f129974g));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new HttpHeader("Accept-Encoding", " "));
                        dVar.f129971d = new C57089d.C57091b(dVar);
                        DownloadTask url2 = Downloader.with(C17867d.m33078a()).url(C57092e.m103457b(dVar.f129974g));
                        UrlModel urlModel2 = dVar.f129974g;
                        C89219l.m154721d(urlModel2, str);
                        List<String> urlList = urlModel2.getUrlList();
                        if (urlList != null) {
                            list = C89070n.m154585g((Collection) urlList);
                            list.remove(C57092e.m103457b(urlModel2));
                        } else {
                            list = C89086z.INSTANCE;
                        }
                        dVar.f129970c = url2.backUpUrls(list).savePath(C57148d.f130109a).name(dVar.f129969b).retryCount(3).showNotification(false).subThreadListener(dVar.f129971d).extraHeaders(arrayList).download();
                    }
                }
                C57094g gVar = new C57094g(this.f129954e, a, new C57072a(bVar), countDownLatch, this.f129958i, this.f129956g, this.f129959j, this.f129951a);
                C57093f fVar2 = this.f129952b;
                C89219l.m154721d(fVar2, str);
                gVar.f129990j = fVar2;
                if (!gVar.f129991k.isPlayUrlValid()) {
                    return true;
                }
                gVar.f129992l.mo94228a();
                gVar.f129989i = System.currentTimeMillis();
                C57166d a4 = C57166d.m103601a();
                C89219l.m154716b(a4, str);
                String b = a4.mo94368b();
                if (!C57158b.m103574b(b)) {
                    C57158b.m103573a(b);
                }
                Context context = gVar.f129982b;
                C89219l.m154716b(context, str);
                UrlModel url3 = gVar.f129991k.getUrl();
                C89219l.m154716b(url3, str);
                String b2 = C57092e.m103457b(url3);
                C89219l.m154721d(context, str);
                if (!TextUtils.isEmpty(b2)) {
                    C57166d a5 = C57166d.m103601a();
                    C89219l.m154716b(a5, str);
                    if (Downloader.getInstance(context).getDownloadInfo(b2, a5.mo94368b()) != null) {
                        z2 = true;
                    }
                }
                gVar.f129988h = z2;
                if (gVar.f129991k.isNeedSetCookie()) {
                    C57092e.m103456a(gVar.f129991k, gVar.f129995o, gVar.f129988h);
                }
                AbstractC57088c cVar = gVar.f129987g;
                MusicModel musicModel2 = gVar.f129991k;
                String str3 = gVar.f129985e;
                C89219l.m154716b(str3, str);
                UrlModel url4 = gVar.f129991k.getUrl();
                C89219l.m154716b(url4, str);
                List<String> urlList2 = url4.getUrlList();
                C89219l.m154716b(urlList2, str);
                cVar.mo94245a(musicModel2, str3, urlList2, new C57094g.C57097c(gVar));
                return true;
            }
        }
        return false;
    }
}
