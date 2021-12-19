package com.p2082ss.android.ugc.aweme.find.p2990a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.find.viewholder.C51021c;
import com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder;
import com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsTailViewHolder;
import com.p2082ss.android.ugc.aweme.find.viewholder.RecommendFriendViewHolder;
import com.p2082ss.android.ugc.aweme.find.viewmodel.C51034a;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80275bv;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.find.a.a */
public final class C50939a extends AbstractC39060f<C51034a> {

    /* renamed from: a */
    public String f117549a;

    /* renamed from: b */
    public boolean f117550b;

    /* renamed from: c */
    public final Set<String> f117551c = new LinkedHashSet();

    /* renamed from: d */
    private final C51034a f117552d = new C51034a(-1, 1);

    /* renamed from: e */
    private final C51034a f117553e = new C51034a(-2, 1);

    static {
        Covode.recordClassIndex(60115);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<C51034a> mo63369e() {
        List<C51034a> list = this.f92236l;
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.find.a.a$a */
    static final class C50940a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50939a f117554a;

        static {
            Covode.recordClassIndex(60116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50940a(C50939a aVar) {
            super(0);
            this.f117554a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f117554a.f117550b);
        }
    }

    /* renamed from: m */
    public final void mo86293m() {
        if (mo63369e().contains(this.f117553e)) {
            List g = C89070n.m154585g((Collection) mo63369e());
            g.remove(this.f117553e);
            mo62377b_(g);
        }
    }

    /* renamed from: l */
    public final void mo86292l() {
        List g;
        if (!mo63369e().contains(this.f117553e)) {
            g = C89070n.m154585g((Collection) mo63369e());
            g.add(this.f117553e);
        } else {
            g = C89070n.m154585g((Collection) mo63369e());
            g.remove(this.f117553e);
            g.add(this.f117553e);
        }
        mo62377b_(g);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((C51034a) this.f92236l.get(i)).f117718b;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<C51034a> list) {
        C89219l.m154721d(list, "");
        List e = mo63369e();
        List g = C89070n.m154585g((Collection) list);
        if (!g.contains(this.f117552d)) {
            g.add(0, this.f117552d);
        } else if (!C89219l.m154714a(g.get(0), this.f117552d)) {
            g.remove(this.f117552d);
            g.add(0, this.f117552d);
        }
        this.f92236l = g;
        List list2 = this.f92236l;
        C89219l.m154716b(list2, "");
        C80275bv.m139152a(this, e, list2);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == -2) {
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            return new FindFriendsTailViewHolder(viewGroup);
        } else if (i == -1) {
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            return new FindFriendsHeaderViewHolder(viewGroup);
        } else if (i == 0) {
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            return new C51021c(viewGroup);
        } else if (i != 1) {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            return new RecommendFriendViewHolder(b.mo105667a(context, 6), new C50940a(this), new C50941b(this));
        } else {
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            return new C51021c(viewGroup);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C51021c) {
            int c = mo60936c(i);
            View view = ((C51021c) viewHolder).f117696a;
            if (c == 0) {
                View findViewById = view.findViewById(R.id.dh1);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(view.getResources().getString(R.string.gf6));
                ImageView imageView = (ImageView) view.findViewById(R.id.eia);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(8);
            } else if (c == 1) {
                View findViewById2 = view.findViewById(R.id.dh1);
                C89219l.m154716b(findViewById2, "");
                findViewById2.setVisibility(8);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.eia);
                C89219l.m154716b(imageView2, "");
                imageView2.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.title);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText(view.getResources().getString(R.string.bx4));
            }
        } else if (viewHolder instanceof RecommendFriendViewHolder) {
            RecommendFriendViewHolder recommendFriendViewHolder = (RecommendFriendViewHolder) viewHolder;
            User user = ((C51034a) mo63369e().get(i)).f117717a;
            if (user != null) {
                recommendFriendViewHolder.f117677d = user;
                FindFriendsViewModel findFriendsViewModel = recommendFriendViewHolder.f117639a;
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                C89219l.m154721d(uid, "");
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = "suggest_account";
                findFriendsViewModel.mo33687b_(new FindFriendsViewModel.C51026c(uid, eVar));
                recommendFriendViewHolder.f117679f = eVar.element;
                String uid2 = user.getUid();
                C89219l.m154716b(uid2, "");
                recommendFriendViewHolder.f117678e = 0;
                recommendFriendViewHolder.withState(recommendFriendViewHolder.f117639a, new RecommendFriendViewHolder.C51018d(recommendFriendViewHolder, uid2));
                recommendFriendViewHolder.f117680g.mo61444a(user);
                C51086a aVar = recommendFriendViewHolder.f117676c;
                if (aVar != null) {
                    aVar.mo86508a(user);
                }
                C51086a aVar2 = recommendFriendViewHolder.f117676c;
                if (aVar2 != null) {
                    aVar2.f117878d = new RecommendFriendViewHolder.C51015a(recommendFriendViewHolder, user);
                }
                C51086a aVar3 = recommendFriendViewHolder.f117676c;
                if (aVar3 != null) {
                    aVar3.f117880f = new RecommendFriendViewHolder.C51016b(recommendFriendViewHolder);
                }
                recommendFriendViewHolder.f117680g.setEventListener(new RecommendFriendViewHolder.C51017c(recommendFriendViewHolder, user));
            }
        } else if (viewHolder instanceof FindFriendsHeaderViewHolder) {
            ((FindFriendsHeaderViewHolder) viewHolder).mo86329b();
        } else if (viewHolder instanceof FindFriendsTailViewHolder) {
            FindFriendsTailViewHolder findFriendsTailViewHolder = (FindFriendsTailViewHolder) viewHolder;
            findFriendsTailViewHolder.withState(findFriendsTailViewHolder.f117639a, new FindFriendsTailViewHolder.C51008a(findFriendsTailViewHolder));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.a.a$b */
    static final class C50941b extends AbstractC89220m implements AbstractC89188r<User, Integer, String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C50939a f117555a;

        static {
            Covode.recordClassIndex(60117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50941b(C50939a aVar) {
            super(4);
            this.f117555a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(User user, Integer num, String str, String str2) {
            User user2 = user;
            int intValue = num.intValue();
            String str3 = str;
            String str4 = str2;
            C89219l.m154721d(user2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            if (!this.f117555a.f117551c.contains(user2.getUid())) {
                C51488a.m95911a(user2, intValue, str3, "find_friends");
                C59256u q = new C59256u().mo96839q(str4).mo96834a("find_friends_page").mo96839q(str4);
                q.f135350a = C59256u.EnumC59259c.CARD;
                q.f135352b = C59256u.EnumC59257a.SHOW;
                q.mo96832a(user2).mo96841s(user2.getRequestId()).mo96792f();
                Set<String> set = this.f117555a.f117551c;
                String uid = user2.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
            }
            return C89391z.f203057a;
        }
    }
}
