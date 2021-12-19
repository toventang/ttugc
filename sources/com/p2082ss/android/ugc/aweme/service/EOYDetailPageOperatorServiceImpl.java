package com.p2082ss.android.ugc.aweme.service;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.util.C80134j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl */
public final class EOYDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(79508);
    }

    /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$c */
    public static final class C67845c extends BaseResponse implements Serializable {
        @AbstractC27891c(mo46611a = "videos")

        /* renamed from: a */
        private List<? extends Aweme> f152045a;
        @AbstractC27891c(mo46611a = "cursor")

        /* renamed from: b */
        private Integer f152046b = 0;
        @AbstractC27891c(mo46611a = "has_more")

        /* renamed from: c */
        private Integer f152047c = 0;

        static {
            Covode.recordClassIndex(79512);
        }

        public final Integer getCursor() {
            return this.f152046b;
        }

        public final Integer getHasMore() {
            return this.f152047c;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
        public final List<Aweme> getVideos() {
            return this.f152045a;
        }

        public final void setCursor(Integer num) {
            this.f152046b = num;
        }

        public final void setHasMore(Integer num) {
            this.f152047c = num;
        }

        public final void setVideos(List<? extends Aweme> list) {
            this.f152045a = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$d */
    public static final class C67846d implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(79513);
        }

        C67846d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C67844b(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$a */
    public static final class C67842a extends AbstractC39100a<Aweme, C67845c> {
        static {
            Covode.recordClassIndex(79509);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
        public final boolean isHasMore() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$a$a */
        public static final class RunnableC67843a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f152041a;

            /* renamed from: b */
            final /* synthetic */ C67842a f152042b;

            /* renamed from: c */
            final /* synthetic */ Aweme f152043c;

            static {
                Covode.recordClassIndex(79510);
            }

            RunnableC67843a(Message message, C67842a aVar, Aweme aweme) {
                this.f152041a = message;
                this.f152042b = aVar;
                this.f152043c = aweme;
            }

            public final void run() {
                this.f152042b.handleMsg(this.f152041a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
        public final List<Aweme> getItems() {
            List<Aweme> videos;
            C67845c cVar = (C67845c) this.mData;
            if (cVar == null || (videos = cVar.getVideos()) == null) {
                return new ArrayList();
            }
            return C89070n.m154585g((Collection) videos);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
        public final void loadMoreList(Object... objArr) {
            C89219l.m154721d(objArr, "");
            refreshList(objArr);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
        public final boolean checkParams(Object... objArr) {
            C89219l.m154721d(objArr, "");
            if (objArr.length != 3 || !(objArr[1] instanceof String)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
        public final void refreshList(Object... objArr) {
            List<? extends Aweme> list;
            C89219l.m154721d(objArr, "");
            Object obj = objArr[1];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            Aweme a = C80134j.m138899a((String) obj);
            Message obtain = Message.obtain();
            C67845c cVar = new C67845c();
            cVar.setHasMore(0);
            cVar.setCursor(1);
            if (a != null) {
                list = C89070n.m154516a(a);
            } else {
                list = C89086z.INSTANCE;
            }
            cVar.setVideos(list);
            obtain.obj = cVar;
            new Handler().post(new RunnableC67843a(obtain, this, a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("eoy_detail", new C67846d());
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl$b */
    public static final class C67844b extends AbstractC41261a<C67842a, C39101b<C67842a>> {

        /* renamed from: a */
        public final AbstractC39100a<?, ?> f152044a;

        static {
            Covode.recordClassIndex(79511);
        }

        public C67844b(AbstractC39100a<?, ?> aVar) {
            this.f152044a = aVar;
            C67842a aVar2 = (C67842a) (!(aVar instanceof C67842a) ? null : aVar);
            this.mModel = aVar2 == null ? new C67842a() : aVar2;
            this.mPresenter = new C39101b();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
        public final void request(int i, C49812b bVar, int i2, boolean z) {
            C89219l.m154721d(bVar, "");
            this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getAid(), Integer.valueOf(bVar.getVideoType()));
        }
    }
}
