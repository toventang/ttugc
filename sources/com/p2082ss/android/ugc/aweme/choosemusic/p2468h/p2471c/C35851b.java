package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.choosemusic.api.SearchSugApi;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35891ak;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.AbstractC35849a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35856b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.c.b */
public final class C35851b extends C39088c<AbstractC39085b<C35891ak>, AbstractC35849a.AbstractC35850a> {

    /* renamed from: a */
    public int f84623a;

    /* renamed from: b */
    public Handler f84624b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public C35856b f84625c = new C35856b();

    /* renamed from: d */
    public String f84626d;

    /* renamed from: e */
    public String f84627e;

    /* renamed from: f */
    public Runnable f84628f = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.C35851b.RunnableC358542 */

        static {
            Covode.recordClassIndex(43093);
        }

        public final void run() {
            C35851b bVar = C35851b.this;
            bVar.mo57616a(bVar.f84626d, C35851b.this.f84627e);
        }
    };

    static {
        Covode.recordClassIndex(43090);
    }

    public C35851b() {
        mo67838a(new AbstractC39085b<C35891ak>() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.C35851b.C358521 */

            static {
                Covode.recordClassIndex(43091);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length == 0 || TextUtils.isEmpty((String) objArr[0])) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                if (message.what != C35851b.this.f84623a) {
                    this.mHandler.removeMessages(message.what);
                } else {
                    super.handleMsg(message);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                C35851b bVar = C35851b.this;
                bVar.f84623a = (bVar.f84623a + 1) % 10;
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.C35851b.C358521.CallableC358531 */

                    static {
                        Covode.recordClassIndex(43092);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        String str = (String) objArr[0];
                        MusicSearchHistory[] musicSearchHistoryArr = null;
                        String str2 = objArr.length > 1 ? (String) objArr[1] : null;
                        SearchSugApi searchSugApi = SearchSugApi.C35753a.f84345a;
                        C35856b bVar = C35851b.this.f84625c;
                        List<MusicSearchHistory> list = bVar.f84634a;
                        if (list != null) {
                            Object[] array = list.toArray(new MusicSearchHistory[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            musicSearchHistoryArr = (MusicSearchHistory[]) array;
                        }
                        if (!Arrays.equals(musicSearchHistoryArr, bVar.f84635b)) {
                            JSONArray jSONArray = new JSONArray();
                            if (musicSearchHistoryArr != null) {
                                for (MusicSearchHistory musicSearchHistory : musicSearchHistoryArr) {
                                    jSONArray.put(musicSearchHistory.keyword);
                                }
                            }
                            bVar.f84635b = musicSearchHistoryArr;
                            String encode = Uri.encode(jSONArray.toString());
                            C89219l.m154716b(encode, "");
                            bVar.f84636c = encode;
                        }
                        return searchSugApi.getSearchSugList(str, str2, bVar.f84636c).get();
                    }
                }, C35851b.this.f84623a);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        if (this.f92286h != null) {
            t = this.f92286h.mData;
        } else {
            t = null;
        }
        if (this.f92287i == null) {
            return;
        }
        if (t != null) {
            C48027ac.C48028a.f111257a.mo80056a(t.f84706b, t.f84707c);
            ((AbstractC35849a.AbstractC35850a) this.f92287i).mo62893a(t);
            return;
        }
        ((AbstractC35849a.AbstractC35850a) this.f92287i).mo62908p();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC35849a.AbstractC35850a) this.f92287i).mo62908p();
        }
    }
}
