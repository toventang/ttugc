package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66868a;
import com.p2082ss.android.ugc.aweme.relation.recommend.C67017t;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.l */
public final class C66991l extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    final List<C66990k> f150300a;

    /* renamed from: b */
    public final Set<String> f150301b = new LinkedHashSet();

    /* renamed from: c */
    public final int f150302c;

    /* renamed from: d */
    public final C89378p<String, String> f150303d;

    static {
        Covode.recordClassIndex(78568);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m118695a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.l$a */
    public enum EnumC66992a {
        HEADER(0),
        RECOMMEND_FRIEND(1);
        

        /* renamed from: b */
        private final int f150305b;

        public final int getValue() {
            return this.f150305b;
        }

        static {
            Covode.recordClassIndex(78569);
        }

        private EnumC66992a(int i) {
            this.f150305b = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f150300a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f150300a.get(i).f150298c.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.l$b */
    public static final class C66993b extends AbstractC89220m implements AbstractC89172b<User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66991l f150306a;

        static {
            Covode.recordClassIndex(78570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66993b(C66991l lVar) {
            super(1);
            this.f150306a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(User user) {
            User user2 = user;
            C89219l.m154721d(user2, "");
            if (!this.f150306a.f150301b.contains(user2.getUid())) {
                C59256u a = new C59256u().mo96834a("on_boarding");
                a.f135350a = C59256u.EnumC59259c.CARD;
                a.f135352b = C59256u.EnumC59257a.SHOW;
                if (this.f150306a.f150302c == 2) {
                    user2.setRecType("1-2");
                } else {
                    user2.setRecType("1-1");
                }
                a.mo96832a(user2).mo96841s(user2.getRequestId()).mo96792f();
                Set<String> set = this.f150306a.f150301b;
                String uid = user2.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C66932c) {
            C66990k kVar = this.f150300a.get(i);
            Objects.requireNonNull(kVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.HeaderItem");
            C66931b bVar = (C66931b) kVar;
            C66932c cVar = (C66932c) viewHolder;
            String str = bVar.f150224a;
            String str2 = bVar.f150225b;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (TextUtils.isEmpty(str)) {
                TuxTextView tuxTextView = (TuxTextView) cVar.f150227a.findViewById(R.id.title);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) cVar.f150227a.findViewById(R.id.title);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setText(str);
                ((TuxTextView) cVar.f150227a.findViewById(R.id.title)).mo37697a(38.0f);
                TuxTextView tuxTextView3 = (TuxTextView) cVar.f150227a.findViewById(R.id.title);
                C89219l.m154716b(tuxTextView3, "");
                C66868a.m118582a(tuxTextView3);
            }
            if (TextUtils.isEmpty(str2)) {
                TuxTextView tuxTextView4 = (TuxTextView) cVar.f150227a.findViewById(R.id.dtf);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                return;
            }
            TuxTextView tuxTextView5 = (TuxTextView) cVar.f150227a.findViewById(R.id.dtf);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(str2);
            TuxTextView tuxTextView6 = (TuxTextView) cVar.f150227a.findViewById(R.id.dtf);
            C89219l.m154716b(tuxTextView6, "");
            C66868a.m118582a(tuxTextView6);
        } else if (viewHolder instanceof C67017t) {
            C66990k kVar2 = this.f150300a.get(i);
            Objects.requireNonNull(kVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.FriendItem");
            int i2 = i - 1;
            C67017t tVar = (C67017t) viewHolder;
            User user = ((C66930a) kVar2).f150223a;
            if (user != null) {
                tVar.f150347b = user;
                tVar.f150348c = i2;
                tVar.f150350e.mo61444a(user);
                C51086a aVar = tVar.f150346a;
                if (aVar != null) {
                    aVar.mo86508a(user);
                }
                C51086a aVar2 = tVar.f150346a;
                if (aVar2 != null) {
                    aVar2.f117878d = new C67017t.C67020a(tVar, user);
                }
                C51086a aVar3 = tVar.f150346a;
                if (aVar3 != null) {
                    aVar3.f117880f = new C67017t.C67021b(tVar, user);
                }
            }
        }
    }

    public C66991l(int i, C89378p<String, String> pVar, List<? extends User> list) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(list, "");
        this.f150302c = i;
        this.f150303d = pVar;
        ArrayList arrayList = new ArrayList();
        this.f150300a = arrayList;
        arrayList.clear();
        arrayList.add(new C66931b(pVar.getFirst(), pVar.getSecond()));
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            t.setRecType("1-2");
            arrayList2.add(new C66930a(t));
        }
        arrayList.addAll(arrayList2);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m118695a(C66991l lVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(14237);
        C89219l.m154721d(viewGroup, "");
        if (i == EnumC66992a.HEADER.getValue()) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2s, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C66932c(a2);
        } else {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC66614a a3 = b.mo105667a(context, 8);
            a3.getView().setClickable(false);
            a3.getView().setEnabled(false);
            viewHolder = new C67017t(lVar.f150302c, a3, new C66993b(lVar));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(14237);
        return viewHolder;
    }
}
