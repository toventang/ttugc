package com.p2082ss.android.ugc.aweme.discover.p2775j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41494ad;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42075c;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.discover.j.p */
public final class C42110p extends C39088c<AbstractC39085b<SearchSugResponse>, AbstractC42075c.AbstractC42076a> {

    /* renamed from: f */
    public static final int f98166f = C41494ad.f96805a;

    /* renamed from: a */
    public int f98167a;

    /* renamed from: b */
    public final Handler f98168b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public long f98169c = 0;

    /* renamed from: d */
    public SearchSugApi.C41849a f98170d;

    /* renamed from: e */
    public final Deque<C42114a> f98171e = new LinkedList();

    /* renamed from: g */
    public final Runnable f98172g = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p.RunnableC421132 */

        static {
            Covode.recordClassIndex(50047);
        }

        public final void run() {
            C42110p pVar = C42110p.this;
            pVar.mo57616a(pVar.f98170d);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.discover.j.p$a */
    public static class C42114a {

        /* renamed from: a */
        long f98178a;

        /* renamed from: b */
        AbstractFutureC27655q<SearchSugResponse> f98179b;

        /* renamed from: c */
        boolean f98180c;

        static {
            Covode.recordClassIndex(50048);
        }
    }

    static {
        Covode.recordClassIndex(50044);
    }

    public C42110p() {
        mo67838a(new AbstractC39085b<SearchSugResponse>() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p.C421111 */

            static {
                Covode.recordClassIndex(50045);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                String str;
                if (!(objArr == null || objArr.length == 0)) {
                    Object obj = objArr[0];
                    if (obj instanceof SearchSugApi.C41849a) {
                        str = ((SearchSugApi.C41849a) obj).f97626a;
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                if (!(message.obj instanceof CancellationException)) {
                    if (message.obj instanceof SearchSugResponse) {
                        SearchSugResponse searchSugResponse = (SearchSugResponse) message.obj;
                        C42114a aVar = searchSugResponse.requestTaskWrapper;
                        if (aVar != null && !aVar.f98180c) {
                            while (!C42110p.this.f98171e.isEmpty()) {
                                C42114a pollFirst = C42110p.this.f98171e.pollFirst();
                                if (pollFirst.f98178a < aVar.f98178a) {
                                    pollFirst.f98180c = true;
                                    if (pollFirst.f98179b != null) {
                                        pollFirst.f98179b.cancel(true);
                                    }
                                } else if (pollFirst.f98178a == aVar.f98178a) {
                                    searchSugResponse.requestTaskWrapper = null;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    super.handleMsg(message);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean sendRequest(final Object... objArr) {
                if (C80580in.m139687c() || !super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                C42110p pVar = C42110p.this;
                pVar.f98167a = (pVar.f98167a + 1) % 10;
                C42110p pVar2 = C42110p.this;
                long j = pVar2.f98169c + 1;
                pVar2.f98169c = j;
                final C42114a aVar = new C42114a();
                aVar.f98178a = j;
                C42110p.this.f98171e.addLast(aVar);
                C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p.C421111.CallableC421121 */

                    static {
                        Covode.recordClassIndex(50046);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:124:0x027e  */
                    /* JADX WARNING: Removed duplicated region for block: B:125:0x0283  */
                    /* JADX WARNING: Removed duplicated region for block: B:129:0x0290  */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
                    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
                    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
                    @Override // java.util.concurrent.Callable
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object call() {
                        /*
                        // Method dump skipped, instructions count: 662
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2775j.C42110p.C421111.CallableC421121.call():java.lang.Object");
                    }
                }, 0);
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
            C48027ac.C48028a.f111257a.mo80056a(t.requestId, t.logPb);
            ((AbstractC42075c.AbstractC42076a) this.f92287i).mo71272a(t);
            return;
        }
        ((AbstractC42075c.AbstractC42076a) this.f92287i).be_();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC42075c.AbstractC42076a) this.f92287i).be_();
        }
    }
}
