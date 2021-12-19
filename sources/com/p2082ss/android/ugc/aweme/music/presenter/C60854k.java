package com.p2082ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.music.api.MusicApi;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.k */
public final class C60854k extends AbstractC39100a<Music, CollectedMusicList> {

    /* renamed from: a */
    public int f138281a = 0;

    static {
        Covode.recordClassIndex(71442);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CollectedMusicList) this.mData).items;
    }

    public C60854k() {
        CollectedMusicList collectedMusicList = new CollectedMusicList();
        collectedMusicList.items = new ArrayList();
        collectedMusicList.setHasMore(true);
        this.mData = collectedMusicList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((CollectedMusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m110454a(0, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m110454a(((CollectedMusicList) this.mData).cursor, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        boolean z2 = false;
        if (collectedMusicList == null || C13603b.m24435a((Collection) collectedMusicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = collectedMusicList;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = collectedMusicList;
                    return;
                }
                List<Music> list = ((CollectedMusicList) this.mData).items;
                List<Music> list2 = collectedMusicList.items;
                List<Music> list3 = ((CollectedMusicList) this.mData).items;
                ArrayList arrayList = new ArrayList();
                for (Music music : list2) {
                    arrayList.add(music);
                    for (Music music2 : list3) {
                        if (music.getMid().equals(music2.getMid())) {
                            arrayList.remove(music);
                        }
                    }
                }
                list.addAll(arrayList);
                ((CollectedMusicList) this.mData).cursor = collectedMusicList.cursor;
                CollectedMusicList collectedMusicList2 = (CollectedMusicList) this.mData;
                if (collectedMusicList.isHasMore() && ((CollectedMusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                collectedMusicList2.setHasMore(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                this.mData = collectedMusicList;
            }
            ((CollectedMusicList) this.mData).setHasMore(false);
        }
    }

    /* renamed from: a */
    private void m110454a(final int i, final int i2) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.music.presenter.C60854k.CallableC608551 */

            static {
                Covode.recordClassIndex(71443);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = i;
                int i2 = i2;
                int i3 = C60854k.this.f138281a;
                if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
                    return MusicApi.f137504a.fetchUserCollectedMusicList(i, i2, "commerce", i3).get();
                }
                return MusicApi.f137504a.fetchUserCollectedMusicList(i, i2, "", i3).get();
            }
        }, 0);
    }
}
