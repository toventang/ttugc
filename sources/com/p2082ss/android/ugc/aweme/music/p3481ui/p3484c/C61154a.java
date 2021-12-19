package com.p2082ss.android.ugc.aweme.music.p3481ui.p3484c;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c.a */
public final class C61154a extends AbstractC39100a<Music, OriginalMusicList> {
    static {
        Covode.recordClassIndex(71759);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((OriginalMusicList) this.mData).musicList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((OriginalMusicList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m110774a((String) objArr[1], (String) objArr[2], 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m110774a((String) objArr[1], (String) objArr[2], ((OriginalMusicList) this.mData).cursor);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        OriginalMusicList originalMusicList = (OriginalMusicList) obj;
        boolean z2 = false;
        if (originalMusicList == null || C13603b.m24435a((Collection) originalMusicList.musicList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = originalMusicList;
            } else if (i == 4) {
                ((OriginalMusicList) this.mData).musicList.addAll(originalMusicList.musicList);
                ((OriginalMusicList) this.mData).cursor = originalMusicList.cursor;
                OriginalMusicList originalMusicList2 = (OriginalMusicList) this.mData;
                if (originalMusicList.hasMore && ((OriginalMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                originalMusicList2.hasMore = z2;
            }
        } else if (this.mData != null) {
            ((OriginalMusicList) this.mData).hasMore = false;
        }
    }

    /* renamed from: a */
    private void m110774a(final String str, final String str2, final int i) {
        if (!C80580in.m139687c()) {
            C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.p3484c.C61154a.CallableC611551 */

                /* renamed from: d */
                final /* synthetic */ int f138853d = 10;

                static {
                    Covode.recordClassIndex(71760);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MusicAwemeApi.m110046a(str, str2, i, this.f138853d);
                }
            }, 0);
        }
    }
}
