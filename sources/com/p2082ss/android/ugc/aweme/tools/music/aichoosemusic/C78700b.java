package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.os.SystemClock;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2432c.C35334a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40898m;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63146a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4121a.C78697b;
import com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b.AbstractC78708a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b */
public final class C78700b {

    /* renamed from: a */
    public List<? extends MusicModel> f176847a;

    /* renamed from: b */
    public long f176848b = System.currentTimeMillis();

    /* renamed from: c */
    AbstractC88412b f176849c;

    /* renamed from: d */
    public C88958b<C63146a> f176850d;

    /* renamed from: e */
    public final C88958b<Boolean> f176851e;

    /* renamed from: f */
    public final List<AbstractC40898m> f176852f;

    /* renamed from: g */
    volatile boolean f176853g;

    /* renamed from: h */
    public volatile boolean f176854h;

    /* renamed from: i */
    public final C35334a f176855i;

    /* renamed from: j */
    final AbstractC78708a f176856j;

    /* renamed from: k */
    private final AbstractC89244h f176857k = C89250i.m154773a((AbstractC89171a) C78707f.f176870a);

    /* renamed from: l */
    private final C88411a f176858l;

    static {
        Covode.recordClassIndex(91843);
    }

    /* renamed from: a */
    public final String mo122557a() {
        return (String) this.f176857k.getValue();
    }

    /* renamed from: c */
    public final void mo122562c() {
        AbstractC78708a aVar = this.f176856j;
        if (aVar != null) {
            aVar.mo122572e();
        }
    }

    /* renamed from: b */
    public final C63146a mo122561b() {
        return this.f176850d.mo143221i();
    }

    /* renamed from: d */
    public final AbstractC88979t<Boolean> mo122563d() {
        AbstractC88979t<Boolean> c = this.f176851e.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$f */
    static final class C78707f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C78707f f176870a = new C78707f();

        static {
            Covode.recordClassIndex(91850);
        }

        C78707f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return "taskId:" + SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public final void mo122564e() {
        AbstractC78708a aVar = this.f176856j;
        if (aVar != null) {
            aVar.mo122573f();
        }
        this.f176858l.dispose();
        AbstractC88412b bVar = this.f176849c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f176852f.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$c */
    public static final class C78704c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78700b f176865a;

        static {
            Covode.recordClassIndex(91847);
        }

        C78704c(C78700b bVar) {
            this.f176865a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C78700b.m137350a(this.f176865a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$e */
    public static final class C78706e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78700b f176869a;

        static {
            Covode.recordClassIndex(91849);
        }

        C78706e(C78700b bVar) {
            this.f176869a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C78700b.m137350a(this.f176869a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$a */
    static final class C78702a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78700b f176860a;

        /* renamed from: b */
        final /* synthetic */ int f176861b = 0;

        /* renamed from: c */
        final /* synthetic */ long f176862c;

        /* renamed from: d */
        final /* synthetic */ List f176863d;

        static {
            Covode.recordClassIndex(91845);
        }

        C78702a(C78700b bVar, long j) {
            this.f176860a = bVar;
            this.f176862c = j;
            this.f176863d = null;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f176860a.mo122558a(this.f176861b, this.f176862c, this.f176863d, 10, 20);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$b */
    public static final class C78703b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78700b f176864a;

        static {
            Covode.recordClassIndex(91846);
        }

        C78703b(C78700b bVar) {
            this.f176864a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
            C88958b<C63146a> bVar = this.f176864a.f176850d;
            C89219l.m154716b(suggestMusicList, "");
            bVar.onNext(new C63146a(suggestMusicList.musicList, 0, 3, suggestMusicList.cursor, suggestMusicList.hasMore, null, 32));
        }
    }

    /* renamed from: a */
    public final void mo122559a(AbstractC40898m mVar) {
        C89219l.m154721d(mVar, "");
        this.f176852f.add(mVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m137350a(C78700b bVar) {
        List<MusicModel> h = AIChooseMusicManager.m137319h();
        C63146a aVar = new C63146a(AIChooseMusicManager.m137319h(), System.currentTimeMillis() - bVar.f176848b, 1, 0, false, null, 56);
        if (h != null) {
            C12290b.m22060a("ies_ai_recommend_request_monitor", 1, new C69840ar().mo110187a("time_cost_ms", Integer.valueOf((int) aVar.f143499b)).mo110191a());
        } else {
            C12290b.m22060a("ies_ai_recommend_request_monitor", 2, new C69840ar().mo110191a());
        }
        bVar.f176850d.onNext(aVar);
        bVar.f176851e.onNext(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b$d */
    public static final class C78705d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78700b f176866a;

        /* renamed from: b */
        final /* synthetic */ String f176867b;

        /* renamed from: c */
        final /* synthetic */ List f176868c;

        static {
            Covode.recordClassIndex(91848);
        }

        C78705d(C78700b bVar, String str, List list) {
            this.f176866a = bVar;
            this.f176867b = str;
            this.f176868c = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            int i2;
            Integer num;
            SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
            if (suggestMusicList != null) {
                List<MusicModel> list = suggestMusicList.musicList;
                C89219l.m154716b(list, "");
                for (T t : list) {
                    C89219l.m154716b(t, "");
                    t.setLogPb(suggestMusicList.logPb);
                    t.setComeFromForMod(1);
                }
                this.f176866a.f176847a = suggestMusicList.musicList;
                Integer num2 = suggestMusicList.musicType;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 3;
                }
                List<? extends MusicModel> list2 = this.f176866a.f176847a;
                long currentTimeMillis = System.currentTimeMillis() - this.f176866a.f176848b;
                if (i == 2) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                C63146a aVar = new C63146a(list2, currentTimeMillis, i2, suggestMusicList.cursor, suggestMusicList.hasMore, this.f176867b);
                this.f176866a.f176850d.onNext(aVar);
                this.f176866a.f176851e.onNext(true);
                Integer valueOf = Integer.valueOf((int) aVar.f143499b);
                List list3 = this.f176868c;
                if (list3 != null) {
                    num = Integer.valueOf(list3.size());
                } else {
                    num = null;
                }
                C69840ar a = new C69840ar().mo110187a("time_cost_ms", valueOf);
                if (num != null) {
                    num.intValue();
                    a.mo110187a("photo_to_video_assets_count", num);
                }
                C12290b.m22060a("ies_ai_recommend_request_monitor", 0, a.mo110191a());
                return;
            }
            C78700b.m137350a(this.f176866a);
        }
    }

    /* renamed from: a */
    public final boolean mo122560a(C35334a aVar) {
        C89219l.m154721d(aVar, "");
        return aVar.mo62212a(this.f176855i);
    }

    public C78700b(C35334a aVar, AbstractC78708a aVar2) {
        AbstractC88979t<String> d;
        AbstractC88979t<String> a;
        AbstractC88412b a2;
        C89219l.m154721d(aVar, "");
        this.f176855i = aVar;
        this.f176856j = aVar2;
        C88411a aVar3 = new C88411a();
        this.f176858l = aVar3;
        C88958b<C63146a> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f176850d = bVar;
        C88958b<Boolean> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f176851e = bVar2;
        this.f176852f = new ArrayList();
        if (aVar2 != null && (d = aVar2.mo122571d()) != null && (a = d.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null && (a2 = a.mo143254a(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78700b.C787011 */

            /* renamed from: a */
            final /* synthetic */ C78700b f176859a;

            static {
                Covode.recordClassIndex(91844);
            }

            {
                this.f176859a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                AbstractC88979t<String> d;
                String str = (String) obj;
                this.f176859a.f176854h = true;
                Iterator<T> it = this.f176859a.f176852f.iterator();
                while (it.hasNext()) {
                    C89219l.m154716b(str, "");
                    it.next().mo70095a(str, this.f176859a.f176855i.f83360c);
                }
                C78700b bVar = this.f176859a;
                boolean z = bVar.f176855i.f83363f;
                try {
                    C39162r.m79460a("account_info_before_rec_music_list", new C84425b().mo129406a("login", String.valueOf(C63244g.m114602a().mo73255A().mo93903b())).f188764a);
                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy, "");
                    Boolean aiMusicBackupStrategy = iESSettingsProxy.getAiMusicBackupStrategy();
                    C89219l.m154716b(aiMusicBackupStrategy, "");
                    if (aiMusicBackupStrategy.booleanValue() || z) {
                        long j = bVar.f176855i.f83359b;
                        AbstractC88412b bVar2 = null;
                        if (bVar.f176856j == null || !bVar.f176855i.f83364g) {
                            bVar.mo122558a(0, j, null, 10, 20);
                            return;
                        }
                        AbstractC88412b bVar3 = bVar.f176849c;
                        if (bVar3 != null) {
                            bVar3.dispose();
                        }
                        AbstractC78708a aVar = bVar.f176856j;
                        if (!(aVar == null || (d = aVar.mo122571d()) == null)) {
                            bVar2 = d.mo143254a(new C78702a(bVar, j), C88446a.f200698d);
                        }
                        bVar.f176849c = bVar2;
                    }
                } catch (C16041a unused) {
                }
            }
        }, C88446a.f200698d)) != null) {
            aVar3.mo142945a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122558a(int i, long j, List<String> list, int i2, int i3) {
        AbstractC88412b bVar = this.f176849c;
        String str = null;
        if (bVar != null) {
            bVar.dispose();
            this.f176849c = null;
        }
        AbstractC78708a aVar = this.f176856j;
        if (aVar != null) {
            str = aVar.mo122570c();
        }
        if (str == null || str.length() == 0) {
            this.f176858l.mo142945a(AIChooseMusicManager.m137314a(0, i2, i).mo143254a(new C78703b(this), new C78704c(this)));
        } else {
            this.f176858l.mo142945a(C78697b.f176839a.mo122556a(str, this.f176855i.f83360c, this.f176855i.f83361d, j, i3, 0).mo143254a(new C78705d(this, str, list), new C78706e(this)));
        }
    }
}
