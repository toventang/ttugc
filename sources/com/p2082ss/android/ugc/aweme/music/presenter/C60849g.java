package com.p2082ss.android.ugc.aweme.music.presenter;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.C18285c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.p3474i.C60808d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.g */
public final class C60849g extends AbstractC39100a<Aweme, MusicAwemeList> {

    /* renamed from: a */
    public boolean f138267a;

    /* renamed from: b */
    private int f138268b;

    /* renamed from: c */
    private boolean f138269c;

    /* renamed from: d */
    private String f138270d;

    /* renamed from: e */
    private long f138271e;

    /* renamed from: f */
    private int f138272f;

    static {
        Covode.recordClassIndex(71437);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicAwemeList) this.mData).items;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) && C13603b.m24435a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return C50545m.m94763a(getItems(), aweme, this.mNotifyListeners);
    }

    /* renamed from: a */
    public final void mo98495a(List<Aweme> list) {
        setItems(new ArrayList(list));
        ((MusicAwemeList) this.mData).cursor = (long) list.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).hasMore = 1;
        ((MusicAwemeList) this.mData).items = list;
    }

    /* renamed from: a */
    private static void m110449a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C34611o.m70668a("music_id_has_space", jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MusicAwemeList) this.mData).cursor;
        }
        m110450a(str, j, ((Integer) objArr[2]).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            m110451a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[5]).booleanValue());
        } else {
            m110450a((String) objArr[1], 0, ((Integer) objArr[2]).intValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
        if (this.f138267a && this.f138269c) {
            long j = this.f138271e;
            if (j == 0) {
                String str = this.f138270d;
                int i = this.f138272f;
                int i2 = this.f138268b;
                C89219l.m154721d(str, "");
                C89219l.m154721d(musicAwemeList, "");
                C60808d.f138188b.mo2092a(str + '&' + j + '&' + i + '&' + i2, new C60808d.C60809a(musicAwemeList, System.currentTimeMillis()));
            }
        }
        C48027ac.C48028a.f111257a.mo80056a(musicAwemeList.getRequestId(), musicAwemeList.logPb);
        if (!C13603b.m24435a((Collection) musicAwemeList.items) || musicAwemeList.isHasMore()) {
            if (musicAwemeList.items != null) {
                int size = musicAwemeList.items.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme a = AwemeService.m70060b().mo60677a(musicAwemeList.items.get(i3));
                    RequestIdService.m70076a().mo60694a(a.getAid() + (this.f138268b + 4000), musicAwemeList.getRequestId(), i3);
                    musicAwemeList.items.set(i3, a);
                }
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = musicAwemeList;
            } else if (i4 == 4) {
                if (musicAwemeList.items != null) {
                    if (C13603b.m24435a((Collection) ((MusicAwemeList) this.mData).items)) {
                        ((MusicAwemeList) this.mData).items = musicAwemeList.items;
                    } else {
                        C60845c.m110445a(((MusicAwemeList) this.mData).items, musicAwemeList.items, C60852i.f138280a);
                    }
                }
                ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
                ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore & ((MusicAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData == null) {
                this.mData = new MusicAwemeList();
            }
            ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
            ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore;
        }
    }

    /* renamed from: a */
    private void m110450a(String str, long j, int i) {
        m110451a(str, j, i, false);
    }

    /* renamed from: a */
    private void m110451a(String str, long j, int i, boolean z) {
        this.f138270d = str;
        this.f138271e = j;
        this.f138272f = 20;
        this.f138268b = i;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            m110449a(str);
        }
        MusicAwemeList musicAwemeList = null;
        if (this.f138267a && j == 0 && !z) {
            musicAwemeList = C60808d.m110395a(str, j, 20, i);
            if (musicAwemeList != null) {
                C18285c.m34004a("md_hit_cache", System.currentTimeMillis() - C60808d.m110397b(str, j, 20, i));
            } else {
                C18285c.m34004a("md_hit_cache", -1);
            }
        }
        if (musicAwemeList != null) {
            this.f138269c = false;
            Message message = new Message();
            message.obj = musicAwemeList;
            new Handler().post(new RunnableC60851h(this, message));
            return;
        }
        if (j == 0) {
            this.f138269c = true;
        }
        C34608n.m70658a().mo61083a(this.mHandler, new Callable(str, j, 20, i) {
            /* class com.p2082ss.android.ugc.aweme.music.presenter.C60849g.CallableC608501 */

            /* renamed from: a */
            final /* synthetic */ String f138273a;

            /* renamed from: b */
            final /* synthetic */ long f138274b;

            /* renamed from: c */
            final /* synthetic */ int f138275c = 20;

            /* renamed from: d */
            final /* synthetic */ int f138276d;

            static {
                Covode.recordClassIndex(71438);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                String str2 = this.f138273a;
                long j = this.f138274b;
                int i = this.f138275c;
                int i2 = this.f138276d;
                if (i2 == 0) {
                    str = MusicAwemeApi.f137507b;
                } else {
                    str = MusicAwemeApi.f137508c;
                }
                MusicAwemeApi.MusicService musicService = MusicAwemeApi.f137506a;
                if (str2 != null) {
                    str2 = str2.trim();
                }
                return musicService.queryMusicAwemeList(str, str2, j, i, i2).get();
            }

            {
                this.f138273a = r3;
                this.f138274b = r4;
                this.f138276d = r7;
            }
        }, 0);
    }
}
