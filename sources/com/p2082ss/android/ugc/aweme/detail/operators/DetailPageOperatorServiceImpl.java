package com.p2082ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl */
public final class DetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(49132);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$a */
    public static final class C41248a implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49133);
        }

        C41248a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41319x(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$b */
    public static final class C41249b implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49134);
        }

        C41249b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41312q(bVar.getIds());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$c */
    public static final class C41250c implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49135);
        }

        C41250c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41286f(bVar.getIds());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$d */
    public static final class C41251d implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49136);
        }

        C41251d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41320y(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$e */
    public static final class C41252e implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49137);
        }

        C41252e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            AbstractC56190b bVar2 = C50529ae.f116793d;
            Aweme aweme = null;
            if (C50529ae.f116793d == bVar2) {
                C50529ae.f116793d = null;
            }
            if (bVar2 == null) {
                return new C41289i();
            }
            if (!TextUtils.isEmpty(bVar.getChatRoomPlayingRealAid())) {
                aweme = AwemeService.m70060b().mo60684b(bVar.getChatRoomPlayingRealAid());
            }
            return new C41321z(bVar2, aweme, bVar.isFromChatRoomPlaying());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$f */
    public static final class C41253f implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49138);
        }

        C41253f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41269af(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$g */
    public static final class C41254g implements AbstractC41265ab {
        static {
            Covode.recordClassIndex(49139);
        }

        C41254g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab
        /* renamed from: a */
        public final AbstractC41262aa mo62369a(C49812b bVar, AbstractC39100a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C89219l.m154721d(bVar, "");
            return new C41291k();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IDetailPageOperatorService
    /* renamed from: a */
    public final HashMap<String, AbstractC41265ab> mo57213a() {
        HashMap<String, AbstractC41265ab> hashMap = new HashMap<>();
        hashMap.put("from_time_line", new C41248a());
        hashMap.put("from_music_children_mode", new C41249b());
        hashMap.put("from_challenge_children_mode", new C41250c());
        hashMap.put("from_window_following", new C41251d());
        hashMap.put("from_chat", new C41252e());
        hashMap.put("from_no_request", new C41253f());
        hashMap.put("from_commerce_banner", new C41254g());
        return hashMap;
    }
}
