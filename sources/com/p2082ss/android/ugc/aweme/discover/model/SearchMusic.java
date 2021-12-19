package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusic */
public class SearchMusic implements Serializable {
    @AbstractC27891c(mo46611a = "card_type")
    private int cardType = 1;
    private boolean hasMobShow;
    @AbstractC27891c(mo46611a = "has_more")
    private boolean hasMore;
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "music")
    private Music music;
    @AbstractC27891c(mo46611a = "musics")
    private List<? extends Music> musicList;

    static {
        Covode.recordClassIndex(50503);
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMobShow() {
        return this.hasMobShow;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Music getMusic() {
        return this.music;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.music.model.Music>, java.util.List<com.ss.android.ugc.aweme.music.model.Music> */
    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public int hashCode() {
        if (this.cardType != CardType.TYPE_CLUSTER.getValue()) {
            Music music2 = this.music;
            if (music2 != null) {
                return music2.hashCode();
            }
            return 0;
        }
        List<? extends Music> list = this.musicList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        List<? extends Music> list2 = this.musicList;
        if (list2 == null) {
            C89219l.m154715b();
        }
        return ((Music) list2.get(0)).hashCode();
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMobShow(boolean z) {
        this.hasMobShow = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMusic(Music music2) {
        this.music = music2;
    }

    public final void setMusicList(List<? extends Music> list) {
        this.musicList = list;
    }

    public final void setRequestId(String str) {
        Music music2 = this.music;
        if (music2 != null) {
            music2.setRequestId(str);
        }
        List<? extends Music> list = this.musicList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setRequestId(str);
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMusic)) {
            return false;
        }
        int i = this.cardType;
        SearchMusic searchMusic = (SearchMusic) obj;
        if (i != searchMusic.cardType) {
            return false;
        }
        if (i != CardType.TYPE_CLUSTER.getValue() && this.cardType != CardType.TYPE_MUSICIAN.getValue()) {
            return C89219l.m154714a(this.music, searchMusic.music);
        }
        List<? extends Music> list = this.musicList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List<? extends Music> list2 = searchMusic.musicList;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (!z) {
            List<? extends Music> list3 = this.musicList;
            if (list3 == null) {
                C89219l.m154715b();
            }
            int size = list3.size();
            List<? extends Music> list4 = searchMusic.musicList;
            if (list4 == null) {
                C89219l.m154715b();
            }
            if (size != list4.size()) {
                return false;
            }
            List<? extends Music> list5 = this.musicList;
            if (list5 == null) {
                C89219l.m154715b();
            }
            int size2 = list5.size() - 1;
            if (size2 >= 0) {
                int i2 = 0;
                while (true) {
                    List<? extends Music> list6 = this.musicList;
                    if (list6 == null) {
                        C89219l.m154715b();
                    }
                    Music music2 = (Music) list6.get(i2);
                    List<? extends Music> list7 = searchMusic.musicList;
                    if (list7 == null) {
                        C89219l.m154715b();
                    }
                    if (music2.equals(list7.get(i2))) {
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
