package com.p2082ss.android.ugc.aweme.music.p3470e;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.music.MusicPreloaderServiceImpl;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60327a;
import com.p2082ss.android.ugc.aweme.music.p3463a.C60329c;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68761y;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.musicprovider.AbstractC84130c;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.musicprovider.C84127b;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.musicprovider.MusicPreloaderService;
import com.toutiao.proxyserver.AbstractC87367p;
import com.toutiao.proxyserver.C87289ad;
import com.toutiao.proxyserver.C87348j;
import com.toutiao.proxyserver.C87369r;
import com.toutiao.proxyserver.C87371t;
import com.toutiao.proxyserver.C87383u;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.p4489a.C87284a;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.e.j */
public final class C60783j implements AbstractC60755b {

    /* renamed from: a */
    public static final C60784a f138124a = new C60784a((byte) 0);

    /* renamed from: e */
    private static boolean f138125e;

    /* renamed from: b */
    private final String f138126b;

    /* renamed from: c */
    private final WeakHashMap<String, C89378p<AbstractC89187q<String, Long, Long, C89391z>, AbstractC84130c>> f138127c;

    /* renamed from: d */
    private final AbstractC89244h f138128d;

    static {
        Covode.recordClassIndex(71340);
    }

    /* renamed from: c */
    private final MusicPreloaderService m110331c() {
        return (MusicPreloaderService) this.f138128d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.j$a */
    public static final class C60784a {
        static {
            Covode.recordClassIndex(71341);
        }

        private C60784a() {
        }

        /* renamed from: a */
        public static C60783j m110337a() {
            return new C60783j((byte) 0);
        }

        public /* synthetic */ C60784a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.j$b */
    public static final class C60785b implements AbstractC87367p {
        static {
            Covode.recordClassIndex(71342);
        }

        C60785b() {
        }

        @Override // com.toutiao.proxyserver.AbstractC87367p
        /* renamed from: a */
        public final void mo98195a(String str, int i) {
            C12290b.m22060a("video_cache_monitor", 0, new C33743c().mo59976a("request_log", str).mo59974a("action_type", Integer.valueOf(i)).mo59977a());
        }

        @Override // com.toutiao.proxyserver.AbstractC87367p
        /* renamed from: a */
        public final void mo98194a(Exception exc, String str, int i) {
            String str2;
            C33743c a = new C33743c().mo59976a("request_log", str);
            if (exc != null) {
                str2 = exc.getMessage();
            } else {
                str2 = "";
            }
            C12290b.m22060a("video_cache_monitor", 1, a.mo59976a("errorDesc", str2).mo59974a("action_type", Integer.valueOf(i)).mo59977a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.j$c */
    static final class C60786c extends AbstractC89220m implements AbstractC89171a<MusicPreloaderService> {

        /* renamed from: a */
        public static final C60786c f138129a = new C60786c();

        static {
            Covode.recordClassIndex(71343);
        }

        C60786c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MusicPreloaderService invoke() {
            return MusicPreloaderServiceImpl.m110025b();
        }
    }

    private C60783j() {
        this.f138126b = "TAG_TTMusicFileLoader";
        this.f138127c = new WeakHashMap<>();
        this.f138128d = C89250i.m154773a((AbstractC89171a) C60786c.f138129a);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: b */
    public final void mo98172b() {
        Set<String> keySet = this.f138127c.keySet();
        C89219l.m154716b(keySet, "");
        for (T t : keySet) {
            C89219l.m154716b(t, "");
            mo98193b(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98169a() {
        m110331c().mo97986a();
        if (!f138125e) {
            f138125e = true;
            C87383u.f198091k = new C60785b();
        }
        if (C87383u.f198083c == null) {
            C84158e a = C84158e.m144733a();
            C89219l.m154716b(a, "");
            String c = a.mo128988c();
            if (!TextUtils.isEmpty(c)) {
                try {
                    C84158e a2 = C84158e.m144733a();
                    C89219l.m154716b(a2, "");
                    String c2 = a2.mo128988c();
                    if (!C84127b.m144668b(c2)) {
                        C84127b.m144667a(c2);
                    }
                    if (C60329c.m110044a()) {
                        C87383u.m151662a(new C60759d(new File(c), C60327a.m110042a(), AVExternalServiceImpl.m113114a().configService().cacheConfig().draftMusicList()), C17867d.m33078a());
                    } else {
                        C87383u.m151662a(new C87369r(new File(c)), C17867d.m33078a());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public /* synthetic */ C60783j(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98171a(String str) {
        C89219l.m154721d(str, "");
        mo98193b(str);
    }

    /* renamed from: b */
    public final void mo98193b(String str) {
        C89378p<AbstractC89187q<String, Long, Long, C89391z>, AbstractC84130c> pVar = this.f138127c.get(str);
        if (pVar != null) {
            C89219l.m154716b(pVar, "");
            this.f138127c.remove(str);
            m110331c().mo97990b(pVar.getFirst());
            m110331c().mo97989b(pVar.getSecond());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.j$d */
    public static final class C60787d implements AbstractC84130c {

        /* renamed from: a */
        final /* synthetic */ C60783j f138130a;

        /* renamed from: b */
        final /* synthetic */ String f138131b;

        /* renamed from: c */
        final /* synthetic */ AbstractC61065b f138132c;

        static {
            Covode.recordClassIndex(71344);
        }

        C60787d(C60783j jVar, String str, AbstractC61065b bVar) {
            this.f138130a = jVar;
            this.f138131b = str;
            this.f138132c = bVar;
        }

        @Override // com.p2082ss.android.ugc.musicprovider.AbstractC84130c
        /* renamed from: a */
        public final void mo98197a(String str, int i, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (i == 1 && TextUtils.equals(this.f138131b, str2)) {
                this.f138132c.mo69327a(str, null);
                this.f138130a.mo98193b(str2);
            }
        }

        @Override // com.p2082ss.android.ugc.musicprovider.AbstractC84130c
        /* renamed from: a */
        public final void mo98196a(C87348j jVar, int i, String str) {
            C89219l.m154721d(jVar, "");
            C89219l.m154721d(str, "");
            if (i == 1 && TextUtils.equals(this.f138131b, str)) {
                String a = C87312c.m151522a(jVar.f197998c);
                AbstractC61065b bVar = this.f138132c;
                int i2 = jVar.f197996a;
                if (a.length() > 1500) {
                    C89219l.m154716b(a, "");
                    Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
                    a = a.substring(0, 1500);
                    C89219l.m154716b(a, "");
                }
                bVar.mo69326a(new C84125a(i2, a));
                this.f138130a.mo98193b(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e.j$e */
    static final class C60788e extends AbstractC89220m implements AbstractC89187q<String, Long, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC61065b f138133a;

        static {
            Covode.recordClassIndex(71345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60788e(AbstractC61065b bVar) {
            super(3);
            this.f138133a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, Long l, Long l2) {
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            C89219l.m154721d(str, "");
            this.f138133a.mo69325a((int) ((longValue2 * 100) / longValue));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3470e.AbstractC60755b
    /* renamed from: a */
    public final void mo98170a(MusicModel musicModel, String str, List<String> list, AbstractC61065b bVar) {
        String str2 = "";
        C89219l.m154721d(musicModel, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(list, str2);
        C89219l.m154721d(bVar, str2);
        mo98169a();
        C87284a.C87285a.f197841a.f197839a.set(2);
        String musicId = musicModel.getMusicId();
        UrlModel url = musicModel.getUrl();
        C89219l.m154716b(url, str2);
        String c = C60768e.m110303c(url);
        C89219l.m154716b(musicId, str2);
        C60788e eVar = new C60788e(bVar);
        C60787d dVar = new C60787d(this, musicId, bVar);
        this.f138127c.put(musicId, new C89378p<>(eVar, dVar));
        m110331c().mo97988a(eVar);
        m110331c().mo97987a(dVar);
        List<C87360c> c2 = C89070n.m154524c(new C87360c("cache_scene", "music"));
        if (musicModel.isNeedSetCookie()) {
            if (TextUtils.isEmpty(c)) {
                StringBuilder append = new StringBuilder().append(this.f138126b).append(" Invalid music, firstUrl is null, id: ");
                String musicId2 = musicModel.getMusicId();
                if (musicId2 == null) {
                    musicId2 = str2;
                }
                StringBuilder append2 = append.append(musicId2).append(", name: ");
                String name = musicModel.getName();
                if (name == null) {
                    name = str2;
                }
                C73991bj.m130131b(append2.append(name).toString());
            }
            String cookie = CookieManager.getInstance().getCookie(c);
            if (TextUtils.isEmpty(cookie)) {
                StringBuilder append3 = new StringBuilder().append(this.f138126b).append(" Invalid music, cookies is null, id: ");
                String musicId3 = musicModel.getMusicId();
                if (musicId3 == null) {
                    musicId3 = str2;
                }
                StringBuilder append4 = append3.append(musicId3).append(", name: ");
                String name2 = musicModel.getName();
                if (name2 != null) {
                    str2 = name2;
                }
                C73991bj.m130131b(append4.append(str2).toString());
            } else {
                c2.add(new C87360c("cookie", cookie));
            }
        }
        bVar.mo69328b();
        int a = C68761y.m121193a();
        C87371t a2 = C87371t.m151640a();
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!TextUtils.isEmpty(musicId) && strArr2 != null && strArr2.length > 0) {
            a2.mo141415a(false, a, musicId, c2, null, new C87289ad(C87328b.m151549a(strArr2)), true);
        }
    }
}
