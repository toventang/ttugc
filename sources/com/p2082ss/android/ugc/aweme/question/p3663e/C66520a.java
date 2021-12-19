package com.p2082ss.android.ugc.aweme.question.p3663e;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.api.C66501b;
import com.p2082ss.android.ugc.aweme.question.api.QuestionApi;
import com.p2082ss.android.ugc.aweme.question.p3659a.C66497a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.e.a */
public final class C66520a extends AbstractC39100a<Aweme, C66501b> {

    /* renamed from: a */
    public String f149568a = "question_video";

    /* renamed from: b */
    public final C66522a f149569b = new C66522a();

    /* renamed from: c */
    private List<Aweme> f149570c;

    /* renamed from: com.ss.android.ugc.aweme.question.e.a$a */
    public static class C66522a {

        /* renamed from: a */
        public int f149576a;

        /* renamed from: b */
        public int f149577b;

        /* renamed from: c */
        public long f149578c;

        /* renamed from: d */
        public C66504c f149579d;

        /* renamed from: e */
        boolean f149580e;

        static {
            Covode.recordClassIndex(78065);
        }
    }

    static {
        Covode.recordClassIndex(78063);
    }

    /* renamed from: a */
    public final List<Aweme> mo105505a() {
        if (this.mData == null) {
            return null;
        }
        return ((C66501b) this.mData).getVideos();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C13603b.m24435a((Collection) this.f149570c)) {
            arrayList.addAll(this.f149570c);
        }
        List<Aweme> a = mo105505a();
        if (!C13603b.m24435a((Collection) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((C66501b) this.mData).isHasMore()) && C13603b.m24435a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C66501b) this.mData).isHasMore()) {
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

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C66501b();
        }
        ((C66501b) this.mData).setHasMore((Integer) 1);
        ((C66501b) this.mData).setVideos(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        int i;
        try {
            long parseLong = Long.parseLong((String) objArr[1]);
            if (isDataEmpty()) {
                i = 0;
            } else {
                i = ((C66501b) this.mData).getCursor().intValue();
            }
            m118272a(parseLong, i, null, false);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        try {
            if (objArr.length >= 6) {
                m118272a(Long.parseLong((String) objArr[1]), 0, (String) objArr[4], ((Boolean) objArr[5]).booleanValue());
            } else {
                m118272a(Long.parseLong((String) objArr[1]), 0, (String) objArr[4], false);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C66501b bVar = (C66501b) obj;
        if (!this.f149569b.f149580e && bVar != null) {
            C66497a.m118248a(this.f149569b, bVar);
        }
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            List<Aweme> videos = bVar.getVideos();
            if (videos != null) {
                int size = videos.size();
                for (int i = 0; i < size; i++) {
                    Aweme a = AwemeService.m70060b().mo60677a(videos.get(i));
                    a.setIsTop(videos.get(i).getIsTop());
                    videos.set(i, a);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = bVar;
            } else if (i2 == 4) {
                if (videos != null) {
                    if (C13603b.m24435a((Collection) ((C66501b) this.mData).getVideos())) {
                        ((C66501b) this.mData).setVideos(videos);
                    } else {
                        List<Aweme> videos2 = ((C66501b) this.mData).getVideos();
                        AbstractC89183m mVar = C66524c.f149583a;
                        C89219l.m154721d(videos2, "");
                        C89219l.m154721d(videos, "");
                        C89219l.m154721d(mVar, "");
                        if (!C13603b.m24435a((Collection) videos)) {
                            for (Aweme aweme : videos) {
                                if (aweme != null) {
                                    Iterator<T> it = videos2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        T next = it.next();
                                        if (((Boolean) mVar.invoke(next, aweme)).booleanValue()) {
                                            if (next != null) {
                                            }
                                        }
                                    }
                                    videos2.add(aweme);
                                }
                            }
                        }
                    }
                }
                ((C66501b) this.mData).setCursor(bVar.getCursor());
                ((C66501b) this.mData).setHasMore(Integer.valueOf(bVar.getHasMore().intValue() & ((C66501b) this.mData).getHasMore().intValue()));
            }
        } else if (this.mData != null) {
            ((C66501b) this.mData).setHasMore((Integer) 0);
        }
    }

    /* renamed from: a */
    private void m118272a(long j, int i, String str, boolean z) {
        boolean z2;
        C66501b a;
        if (z || (a = C66497a.m118246a(j, i, 20, this.f149569b.f149579d)) == null) {
            z2 = true;
        } else {
            Message message = new Message();
            message.obj = a;
            new Handler().post(new RunnableC66523b(this, message));
            z2 = false;
        }
        this.f149569b.f149576a = 20;
        this.f149569b.f149577b = i;
        this.f149569b.f149578c = j;
        this.f149569b.f149580e = true;
        if (z2) {
            C34608n.m70658a().mo61083a(this.mHandler, new Callable(j, i, 20, str) {
                /* class com.p2082ss.android.ugc.aweme.question.p3663e.C66520a.CallableC665211 */

                /* renamed from: a */
                final /* synthetic */ long f149571a;

                /* renamed from: b */
                final /* synthetic */ int f149572b;

                /* renamed from: c */
                final /* synthetic */ int f149573c = 20;

                /* renamed from: d */
                final /* synthetic */ String f149574d;

                static {
                    Covode.recordClassIndex(78064);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C66520a.this.f149569b.f149580e = false;
                    return QuestionApi.m118250a(this.f149571a, this.f149572b, this.f149573c, this.f149574d);
                }

                {
                    this.f149571a = r3;
                    this.f149572b = r5;
                    this.f149574d = r7;
                }
            }, 0);
        }
    }
}
