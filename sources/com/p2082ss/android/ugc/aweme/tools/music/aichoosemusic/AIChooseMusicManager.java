package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2432c.C35334a;
import com.p2082ss.android.ugc.aweme.p2432c.C35335b;
import com.p2082ss.android.ugc.aweme.p2432c.C35336c;
import com.p2082ss.android.ugc.aweme.p2432c.C35337d;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40894i;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40898m;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63146a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65401cn;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.C78723e;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78744a;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78823c;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78825d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager */
public final class AIChooseMusicManager implements AbstractC63154aa.AbstractC63157c {

    /* renamed from: a */
    static final List<AbstractC40894i> f176811a = new ArrayList();

    /* renamed from: b */
    static List<? extends MusicModel> f176812b;

    /* renamed from: c */
    public static final AIChooseMusicManager f176813c = new AIChooseMusicManager();

    /* renamed from: d */
    private static final AbstractC89244h f176814d = C89250i.m154773a((AbstractC89171a) C78685a.f176824a);

    /* renamed from: e */
    private static AbstractC40898m f176815e;

    /* renamed from: f */
    private static AbstractC40898m f176816f;

    /* renamed from: g */
    private static int f176817g;

    /* renamed from: h */
    private static boolean f176818h;

    /* renamed from: i */
    private static boolean f176819i;

    /* renamed from: j */
    private static boolean f176820j;

    /* renamed from: k */
    private static volatile C78700b f176821k;

    /* renamed from: l */
    private static final Map<String, C78700b> f176822l = new LinkedHashMap();

    /* renamed from: m */
    private static AbstractC88412b f176823m;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$RetrofitService */
    public interface RetrofitService {
        static {
            Covode.recordClassIndex(91827);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/upload/authkey/")
        @AbstractC89721e
        AbstractFutureC27655q<C65611c> getUploadAuthKeyConfig(@AbstractC89720d LinkedHashMap<String, String> linkedHashMap);
    }

    /* renamed from: e */
    public static String m137315e() {
        return (String) f176814d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$b */
    public static final class C78686b {

        /* renamed from: a */
        public static final C78686b f176825a = new C78686b();

        private C78686b() {
        }

        static {
            Covode.recordClassIndex(91829);
        }

        /* renamed from: a */
        public static boolean m137339a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$c */
    public static final class C78687c implements AbstractC40890e {
        static {
            Covode.recordClassIndex(91830);
        }

        C78687c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e
        /* renamed from: b */
        public final Integer mo70079b() {
            C63146a f = AIChooseMusicManager.m137317f();
            if (f != null) {
                return Integer.valueOf(f.f143500c);
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e
        /* renamed from: c */
        public final long mo70080c() {
            C63146a f = AIChooseMusicManager.m137317f();
            if (f != null) {
                return f.f143499b;
            }
            return -1;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e
        /* renamed from: d */
        public final void mo70081d() {
            C63146a f = AIChooseMusicManager.m137317f();
            if (f != null) {
                f.f143499b = -1;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e
        /* renamed from: e */
        public final List<C69905c> mo70082e() {
            List<? extends MusicModel> list;
            C63146a f = AIChooseMusicManager.m137317f();
            if (f != null) {
                list = f.f143498a;
            } else {
                list = null;
            }
            return C78821b.C78822a.m137589a(list);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40890e
        /* renamed from: a */
        public final boolean mo70078a() {
            if (AIChooseMusicManager.m137317f() != null) {
                C63146a f = AIChooseMusicManager.m137317f();
                if (f == null) {
                    C89219l.m154715b();
                }
                List<? extends MusicModel> list = f.f143498a;
                if (list == null || list.isEmpty()) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    private AIChooseMusicManager() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101563a(List<String> list, String str, String str2) {
        String str3 = str;
        String str4 = "";
        C89219l.m154721d(list, str4);
        C35336c cVar = new C35336c(list);
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        mo101558a(new C35334a(cVar, 0, str3, str4, false, false, 114));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101564a(List<String> list, String str, boolean z) {
        String str2 = "";
        C89219l.m154721d(list, str2);
        C35336c cVar = new C35336c(list);
        if (str != null) {
            str2 = str;
        }
        mo101558a(new C35334a(cVar, 0, str2, null, z, false, 90));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101565a(boolean z) {
        if (!z || !f176818h || f176820j || !C65401cn.m117101a()) {
            m137320i();
            m137316e(false);
        } else {
            m137316e(true);
        }
        AbstractC88412b bVar = f176823m;
        if (bVar != null) {
            bVar.dispose();
        }
        C39162r.m79460a("ai_music_reset", new C84425b().mo129406a("login", String.valueOf(C63244g.m114602a().mo73255A().mo93903b())).f188764a);
    }

    /* renamed from: i */
    private static void m137320i() {
        f176812b = null;
        f176817g = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final AbstractC40890e mo101555a() {
        return new C78687c();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: b */
    public final void mo101566b() {
        mo101565a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: d */
    public final void mo101571d() {
        f176817g++;
    }

    /* renamed from: f */
    public static C63146a m137317f() {
        C78700b bVar = f176821k;
        if (bVar != null) {
            return bVar.mo122561b();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: c */
    public final MusicModel mo101569c() {
        List<? extends MusicModel> list = f176812b;
        if (list == null || C13603b.m24435a((Collection) list)) {
            return null;
        }
        return (MusicModel) list.get(f176817g % list.size());
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$a */
    static final class C78685a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C78685a f176824a = new C78685a();

        static {
            Covode.recordClassIndex(91828);
        }

        C78685a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            C89219l.m154716b(applicationService, "");
            Application c = applicationService.mo93774c();
            C89219l.m154716b(c, "");
            File filesDir = c.getFilesDir();
            StringBuilder sb = new StringBuilder();
            C89219l.m154716b(filesDir, "");
            return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("ai_choose_music").toString();
        }
    }

    static {
        Covode.recordClassIndex(91826);
    }

    /* renamed from: g */
    public static final void m137318g() {
        List<String> list;
        C78744a aVar = C78744a.f176943a;
        if (aVar != null && (list = aVar.f176946d) != null && !list.isEmpty()) {
            if (C89219l.m154714a((Object) aVar.f176946d.get(0), (Object) C78694a.m137346b())) {
                if (System.currentTimeMillis() - C78694a.m137345a() < 86400000) {
                    return;
                }
            }
            C1731i.m5640b(new CallableC78693g(aVar), C1731i.f5562a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$g */
    public static final class CallableC78693g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78744a f176837a;

        static {
            Covode.recordClassIndex(91836);
        }

        CallableC78693g(C78744a aVar) {
            this.f176837a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = this.f176837a.f176946d.get(0);
            C89219l.m154716b(str, "");
            String str2 = str;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str2, "");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin.getApplicationService(), "");
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = C78686b.m137339a();
            }
            if (C58029j.f132256h) {
                String executeGet = NetworkUtils.executeGet(0, str2);
                C89219l.m154716b(executeGet, "");
                if (!(executeGet == null || executeGet.length() == 0)) {
                    SharedPreferences.Editor edit = C78694a.f176838a.edit();
                    edit.putLong("ai_music_time", System.currentTimeMillis());
                    edit.putString("ai_music_list", executeGet);
                    edit.putString("ai_music_url", this.f176837a.f176946d.get(0));
                    edit.commit();
                }
                return C89391z.f203057a;
            }
            throw new IOException();
        }
    }

    /* renamed from: h */
    public static List<MusicModel> m137319h() {
        boolean z;
        String string = C78694a.f176838a.getString("ai_music_list", "");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            MusicList musicList = (MusicList) C78825d.f177140a.mo46670a(string, MusicList.class);
            if (musicList == null || C13603b.m24435a((Collection) musicList.musicList)) {
                return null;
            }
            return C78823c.C78824a.m137590a(musicList.musicList);
        } catch (Exception unused) {
            SharedPreferences.Editor edit = C78694a.f176838a.edit();
            edit.remove("ai_music_time");
            edit.remove("ai_music_list");
            edit.remove("ai_music_url");
            edit.commit();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: b */
    public final void mo101568b(boolean z) {
        f176818h = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: c */
    public final void mo101570c(boolean z) {
        f176819i = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: d */
    public final void mo101572d(boolean z) {
        f176820j = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: b */
    public final void mo101567b(AbstractC40898m mVar) {
        C78700b bVar = f176821k;
        if (bVar != null) {
            bVar.mo122559a(mVar);
        }
        f176816f = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$d */
    static final class C78688d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ int f176826a = 0;

        /* renamed from: b */
        final /* synthetic */ int f176827b;

        /* renamed from: c */
        final /* synthetic */ boolean f176828c;

        /* renamed from: d */
        final /* synthetic */ int f176829d;

        static {
            Covode.recordClassIndex(91831);
        }

        C78688d(int i) {
            this.f176827b = i;
            this.f176828c = true;
            this.f176829d = 0;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<List<MusicModel>> vVar) {
            C89219l.m154721d(vVar, "");
            C1731i<List<MusicModel>> a = MusicService.m81198m().mo69289a(this.f176826a, this.f176827b, this.f176828c, this.f176829d);
            if (a != null) {
                a.mo5532a(new AbstractC1729g() {
                    /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager.C78688d.C786891 */

                    static {
                        Covode.recordClassIndex(91832);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        C89219l.m154716b(iVar, "");
                        if (iVar.mo5544c() || !iVar.mo5535a()) {
                            vVar.mo143024a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.mo5545d() != null) {
                            AIChooseMusicManager.f176812b = (List) iVar.mo5545d();
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$e */
    public static final class C78690e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ int f176831a;

        /* renamed from: b */
        final /* synthetic */ int f176832b;

        /* renamed from: c */
        final /* synthetic */ boolean f176833c = false;

        /* renamed from: d */
        final /* synthetic */ int f176834d;

        static {
            Covode.recordClassIndex(91833);
        }

        C78690e(int i, int i2, int i3) {
            this.f176831a = i;
            this.f176832b = i2;
            this.f176834d = i3;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<SuggestMusicList> vVar) {
            C89219l.m154721d(vVar, "");
            C1731i<SuggestMusicList> b = MusicService.m81198m().mo69309b(this.f176831a, this.f176832b, this.f176833c, this.f176834d);
            if (b != null) {
                b.mo5532a(new AbstractC1729g() {
                    /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager.C78690e.C786911 */

                    static {
                        Covode.recordClassIndex(91834);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        C89219l.m154716b(iVar, "");
                        if (iVar.mo5544c() || !iVar.mo5535a()) {
                            vVar.mo143024a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.mo5545d() != null) {
                            Object d = iVar.mo5545d();
                            C89219l.m154716b(d, "");
                            AIChooseMusicManager.f176812b = ((SuggestMusicList) d).musicList;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$f */
    public static final class C78692f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C78692f f176836a = new C78692f();

        static {
            Covode.recordClassIndex(91835);
        }

        C78692f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : AIChooseMusicManager.f176811a) {
                if (t != null) {
                    t.mo70091a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final AbstractC88979t<List<MusicModel>> mo101556a(int i) {
        AbstractC88979t<List<MusicModel>> a = AbstractC88979t.m154294a(new C78688d(i));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101559a(AbstractC40894i iVar) {
        if (iVar == null) {
            f176811a.clear();
            return;
        }
        f176811a.add(iVar);
        if (m137317f() != null) {
            iVar.mo70091a();
        }
    }

    /* renamed from: e */
    private static void m137316e(boolean z) {
        boolean z2;
        C78700b bVar;
        C78700b bVar2;
        C35334a aVar;
        C78700b bVar3 = f176821k;
        if (!(((bVar3 == null || (aVar = bVar3.f176855i) == null) ? null : aVar.f83358a) instanceof C35336c) || (bVar2 = f176821k) == null || bVar2.mo122561b() == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        for (T t : f176822l.values()) {
            if (!z || (!C89219l.m154714a((Object) t, (Object) f176821k)) || !z2) {
                t.mo122564e();
            }
        }
        Map<String, C78700b> map = f176822l;
        map.clear();
        if (z2 && (bVar = f176821k) != null) {
            map.put(bVar.mo122557a(), bVar);
        }
        C84902i.m145886a(new File(m137315e()));
        f176821k = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final String mo101558a(C35334a aVar) {
        T t;
        C89219l.m154721d(aVar, "");
        AbstractC78708a b = C78723e.f176911a.mo122574b(aVar.f83358a);
        Iterator<T> it = f176822l.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo122560a(aVar)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            t2 = new C78700b(aVar, b);
            f176822l.put(t2.mo122557a(), t2);
            t2.mo122562c();
        }
        AbstractC40898m mVar = f176815e;
        if (mVar != null) {
            t2.mo122559a(mVar);
        }
        AbstractC40898m mVar2 = f176816f;
        if (mVar2 != null && (aVar.f83358a instanceof C35336c)) {
            t2.mo122559a(mVar2);
        }
        AbstractC88412b bVar = f176823m;
        if (bVar != null) {
            bVar.dispose();
        }
        f176823m = t2.mo122563d().mo143254a(C78692f.f176836a, C88446a.f200698d);
        f176821k = t2;
        return t2.mo122557a();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101560a(AbstractC40898m mVar) {
        C78700b bVar;
        if (mVar == null) {
            AbstractC40898m mVar2 = f176815e;
            if (!(mVar2 == null || (bVar = f176821k) == null)) {
                C89219l.m154721d(mVar2, "");
                bVar.f176852f.remove(mVar2);
            }
        } else {
            C78700b bVar2 = f176821k;
            if (bVar2 != null) {
                bVar2.mo122559a(mVar);
            }
        }
        f176815e = mVar;
    }

    /* renamed from: a */
    public static AbstractC88979t<SuggestMusicList> m137314a(int i, int i2, int i3) {
        AbstractC88979t<SuggestMusicList> a = AbstractC88979t.m154294a(new C78690e(i, i2, i3));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101561a(ExtractFramesModel extractFramesModel, String str, String str2, long j) {
        String str3 = str;
        C35337d dVar = new C35337d(extractFramesModel);
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        mo101558a(new C35334a(dVar, j, str3, str4, false, false, 112));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final void mo101562a(String str, String str2, String str3, long j) {
        String str4 = str2;
        String str5 = "";
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str, str5);
        C35335b bVar = new C35335b(str, 0, j);
        if (str4 == null) {
            str4 = str5;
        }
        if (str3 != null) {
            str5 = str3;
        }
        mo101558a(new C35334a(bVar, 0, str4, str5, false, false, 114));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63157c
    /* renamed from: a */
    public final AbstractC88979t<C63146a> mo101557a(String str, long j, int i, int i2, int i3, boolean z) {
        C78700b bVar;
        if (str == null) {
            bVar = f176821k;
        } else {
            bVar = f176822l.get(str);
            if (bVar == null) {
                bVar = f176821k;
            }
        }
        AbstractC78708a b = C78723e.f176911a.mo122574b(null);
        if (bVar == null) {
            bVar = new C78700b(new C35334a(null, 0, null, null, false, false, 126), b);
        }
        if (z) {
            bVar.f176853g = false;
            C88958b<C63146a> bVar2 = new C88958b<>();
            C89219l.m154716b(bVar2, "");
            bVar.f176850d = bVar2;
        }
        if (!bVar.f176853g) {
            bVar.f176853g = true;
            bVar.mo122558a(i, j, null, i2, i3);
        }
        AbstractC88979t<C63146a> c = bVar.f176850d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }
}
