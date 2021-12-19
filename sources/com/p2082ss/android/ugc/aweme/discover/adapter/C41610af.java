package com.p2082ss.android.ugc.aweme.discover.adapter;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.CardType;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.af */
public final class C41610af {

    /* renamed from: a */
    final List<SearchMusic> f97044a = new ArrayList();

    static {
        Covode.recordClassIndex(49523);
    }

    /* renamed from: a */
    public static boolean m83559a(SearchMusic searchMusic) {
        C89219l.m154721d(searchMusic, "");
        return searchMusic instanceof C41720f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo70830b(List<? extends SearchMusic> list) {
        if (list != null) {
            this.f97044a.clear();
            this.f97044a.addAll(list);
        }
    }

    /* renamed from: a */
    public final List<SearchMusic> mo70829a(List<? extends SearchMusic> list) {
        if (C13603b.m24435a((Collection) list)) {
            return new ArrayList();
        }
        mo70830b(list);
        if (list == null) {
            C89219l.m154715b();
        }
        List g = C89070n.m154585g((Collection) list);
        ListIterator listIterator = g.listIterator();
        while (listIterator.hasNext()) {
            SearchMusic searchMusic = (SearchMusic) listIterator.next();
            if (searchMusic.getCardType() == CardType.TYPE_CLUSTER.getValue() && !C13603b.m24435a((Collection) searchMusic.getMusicList())) {
                listIterator.remove();
                SearchMusic searchMusic2 = new SearchMusic();
                searchMusic2.setCardType(CardType.TYPE_NORMAL.getValue());
                List<Music> musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C89219l.m154715b();
                }
                searchMusic2.setMusic((Music) C89070n.m154579f((List) musicList));
                searchMusic2.setLogPb(searchMusic.getLogPb());
                listIterator.add(searchMusic2);
                C41720f fVar = new C41720f(false, null, 3, null);
                List<Music> clusterList = fVar.getClusterList();
                List<Music> musicList2 = searchMusic.getMusicList();
                if (musicList2 == null) {
                    C89219l.m154715b();
                }
                List<Music> musicList3 = searchMusic.getMusicList();
                if (musicList3 == null) {
                    C89219l.m154715b();
                }
                clusterList.addAll(musicList2.subList(1, musicList3.size()));
                listIterator.add(fVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            SearchMusic searchMusic3 = (SearchMusic) obj;
            if (!(searchMusic3 instanceof C41720f) || ((C41720f) searchMusic3).getClusterList().size() > 0) {
                arrayList.add(obj);
            }
        }
        return C89070n.m154585g((Collection) arrayList);
    }
}
