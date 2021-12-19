package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46952fr;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a */
public final class C83621a {

    /* renamed from: e */
    public static final C83621a f186689e = new C83621a(null, null);

    /* renamed from: f */
    public static final C83622a f186690f = new C83622a((byte) 0);

    /* renamed from: a */
    public C89378p<? extends MusicModel, Long> f186691a;

    /* renamed from: b */
    public C89378p<? extends MusicModel, Long> f186692b;

    /* renamed from: c */
    public final RecommendMusic f186693c;

    /* renamed from: d */
    public final List<SimpleMusic> f186694d;

    /* renamed from: g */
    private C89378p<? extends MusicModel, Long> f186695g;

    /* renamed from: h */
    private C89378p<? extends MusicModel, Long> f186696h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83621a)) {
            return false;
        }
        C83621a aVar = (C83621a) obj;
        return C89219l.m154714a(this.f186693c, aVar.f186693c) && C89219l.m154714a(this.f186694d, aVar.f186694d);
    }

    public final int hashCode() {
        RecommendMusic recommendMusic = this.f186693c;
        int i = 0;
        int hashCode = (recommendMusic != null ? recommendMusic.hashCode() : 0) * 31;
        List<SimpleMusic> list = this.f186694d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RecommendMusicData(recommendMusic=" + this.f186693c + ", softBindMusic=" + this.f186694d + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a$a */
    public static final class C83622a {
        static {
            Covode.recordClassIndex(97512);
        }

        private C83622a() {
        }

        public /* synthetic */ C83622a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(97511);
    }

    /* renamed from: a */
    public final void mo128633a() {
        this.f186695g = null;
        this.f186696h = null;
        this.f186691a = null;
        this.f186692b = null;
        List<SimpleMusic> list = this.f186694d;
        if (list != null && !list.isEmpty()) {
            m143960a(this.f186694d);
        }
        RecommendMusic recommendMusic = this.f186693c;
        if (recommendMusic != null) {
            m143959a(recommendMusic);
        }
        if (this.f186695g == null) {
            this.f186695g = this.f186691a;
        }
        if (this.f186696h == null) {
            this.f186696h = this.f186692b;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long>, h.p<com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long>, h.p<com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> */
    /* renamed from: a */
    public final C89378p<MusicModel, Long> mo128632a(boolean z) {
        if (z) {
            return this.f186696h;
        }
        return this.f186695g;
    }

    /* renamed from: a */
    private final void m143960a(List<SimpleMusic> list) {
        MusicModel musicModel;
        int duration;
        Music musicModel2 = ((SimpleMusic) C89070n.m154579f((List) list)).getMusicModel();
        if (musicModel2 != null) {
            musicModel = musicModel2.convertToMusicModel();
        } else {
            musicModel = null;
        }
        this.f186695g = C89387v.m154943a(musicModel, 0L);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Music musicModel3 = it.next().getMusicModel();
            if (musicModel3 != null) {
                if (musicModel3.getShootDuration() > 0) {
                    duration = musicModel3.getShootDuration();
                } else {
                    duration = musicModel3.getDuration();
                }
                if (duration > 180) {
                    this.f186696h = C89387v.m154943a(musicModel3.convertToMusicModel(), 0L);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m143959a(RecommendMusic recommendMusic) {
        Object next;
        int duration;
        List<MusicInfoAndEffectUseCount> musicList = recommendMusic.getMusicList();
        if (!(musicList == null || musicList.isEmpty())) {
            List<MusicInfoAndEffectUseCount> musicList2 = recommendMusic.getMusicList();
            if (musicList2 == null) {
                C89219l.m154715b();
            }
            ArrayList arrayList = new ArrayList();
            for (T t : musicList2) {
                if (t.getUseCount() >= ((long) C46952fr.m90238d())) {
                    arrayList.add(t);
                }
            }
            List list = (List) C89070n.m154562b((Iterable) arrayList, (Collection) new ArrayList());
            Object obj = null;
            if (C46952fr.m90239e()) {
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount = (MusicInfoAndEffectUseCount) list.get(AbstractC89255c.Default.nextInt(list.size()));
                this.f186691a = C89387v.m154943a(musicInfoAndEffectUseCount.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount.getUseCount()));
            } else {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        long useCount = ((MusicInfoAndEffectUseCount) next).getUseCount();
                        do {
                            Object next2 = it.next();
                            long useCount2 = ((MusicInfoAndEffectUseCount) next2).getUseCount();
                            if (useCount < useCount2) {
                                next = next2;
                                useCount = useCount2;
                            }
                        } while (it.hasNext());
                    }
                }
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount2 = (MusicInfoAndEffectUseCount) next;
                if (musicInfoAndEffectUseCount2 != null) {
                    this.f186691a = C89387v.m154943a(musicInfoAndEffectUseCount2.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount2.getUseCount()));
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount3 = (MusicInfoAndEffectUseCount) next3;
                if (musicInfoAndEffectUseCount3.getMusicInfo().getShootDuration() > 0) {
                    duration = musicInfoAndEffectUseCount3.getMusicInfo().getShootDuration();
                } else {
                    duration = musicInfoAndEffectUseCount3.getMusicInfo().getDuration();
                }
                if (duration >= 180) {
                    obj = next3;
                    break;
                }
            }
            MusicInfoAndEffectUseCount musicInfoAndEffectUseCount4 = (MusicInfoAndEffectUseCount) obj;
            if (musicInfoAndEffectUseCount4 != null) {
                this.f186692b = C89387v.m154943a(musicInfoAndEffectUseCount4.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount4.getUseCount()));
            }
        }
    }

    public C83621a(RecommendMusic recommendMusic, List<SimpleMusic> list) {
        this.f186693c = recommendMusic;
        this.f186694d = list;
        mo128633a();
    }
}
