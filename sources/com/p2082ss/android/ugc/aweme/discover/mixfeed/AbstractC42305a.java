package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41228c;
import com.p2082ss.android.ugc.aweme.discover.model.IAwemeList;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a */
public abstract class AbstractC42305a<T extends IAwemeList<T>> extends AbstractC41228c<Aweme, T> {
    static {
        Covode.recordClassIndex(50248);
    }

    /* renamed from: b */
    public abstract AbstractC88979t<T> mo70385b();

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean isHasMore() {
        IAwemeList iAwemeList = (IAwemeList) this.mData;
        if (iAwemeList == null || iAwemeList.getIHasMore() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public List<Aweme> getItems() {
        List<Aweme> iAwemeList;
        IAwemeList iAwemeList2 = (IAwemeList) this.mData;
        if (iAwemeList2 == null || (iAwemeList = iAwemeList2.getIAwemeList()) == null) {
            return new ArrayList();
        }
        return iAwemeList;
    }

    /* renamed from: a */
    private final void mo70382a() {
        AbstractC88403ab.m153601a((AbstractC88984x) mo70385b()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C42306a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a$a */
    public static final class C42306a implements AbstractC88406ae<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC42305a f98544a;

        static {
            Covode.recordClassIndex(50249);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42306a(AbstractC42305a aVar) {
            this.f98544a = aVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f98544a.mIsLoading = false;
            if (this.f98544a.mNotifyListeners != null) {
                for (AbstractC39159o oVar : this.f98544a.mNotifyListeners) {
                    oVar.mo57526a_((Exception) th);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.discover.mixfeed.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(Object obj) {
            IAwemeList iAwemeList = (IAwemeList) obj;
            C89219l.m154721d(iAwemeList, "");
            this.f98544a.mIsLoading = false;
            this.f98544a.handleData(iAwemeList);
            if (this.f98544a.mNotifyListeners != null) {
                for (AbstractC39159o oVar : this.f98544a.mNotifyListeners) {
                    oVar.mo57528c();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        mo70382a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        mo70382a();
    }

    /* renamed from: a */
    public void handleData(T t) {
        List<Aweme> list;
        List<Aweme> list2;
        IAwemeList iAwemeList;
        String str;
        C67469ad c;
        if (t != null) {
            list = t.getIAwemeList();
        } else {
            list = null;
        }
        IAwemeList iAwemeList2 = (IAwemeList) this.mData;
        if (iAwemeList2 == null || (list2 = iAwemeList2.getIAwemeList()) == null) {
            list2 = new ArrayList<>();
        }
        if (list == null || list.isEmpty()) {
            if (this.mListQueryType == 1) {
                this.mData = t;
                IAwemeList iAwemeList3 = (IAwemeList) this.mData;
                if (iAwemeList3 != null) {
                    iAwemeList3.setIHasMore(0);
                }
            }
            if (!(this.mListQueryType == 2 || (iAwemeList = (IAwemeList) this.mData) == null)) {
                iAwemeList.setIHasMore(0);
                return;
            }
            return;
        }
        if (this.mListQueryType != 1) {
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                if (list2.indexOf(it.next()) >= 0) {
                    it.remove();
                }
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                List<Aweme> iAwemeList4 = ((IAwemeList) this.mData).getIAwemeList();
                if (iAwemeList4 != null) {
                    iAwemeList4.addAll(list);
                }
                ((IAwemeList) this.mData).updateData(t);
            }
        } else if (this.mData != null) {
            List<Aweme> iAwemeList5 = ((IAwemeList) this.mData).getIAwemeList();
            if (iAwemeList5 != null) {
                iAwemeList5.clear();
                iAwemeList5.addAll(list);
            }
            ((IAwemeList) this.mData).updateData(t);
        } else {
            this.mData = t;
        }
        for (Aweme aweme : list) {
            AbstractC67567q a = C67486am.m119564a();
            if (a == null || (c = a.mo106431c()) == null || (str = c.f151151a) == null) {
                str = "";
            }
            aweme.setRequestId(str);
        }
    }
}
