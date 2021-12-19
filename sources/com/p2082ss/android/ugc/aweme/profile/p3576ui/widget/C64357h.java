package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64353g;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.View$OnClickListenerC64377l;
import com.p2082ss.android.ugc.aweme.recommend.users.C66649a;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.h */
public class C64357h extends AbstractC39060f<User> {

    /* renamed from: a */
    public int f145903a;

    /* renamed from: b */
    public AbstractC64362b f145904b;

    /* renamed from: c */
    public AbstractC64361a f145905c;

    /* renamed from: d */
    public AbstractC39097c f145906d;

    /* renamed from: e */
    public String f145907e;

    /* renamed from: f */
    public int f145908f;

    /* renamed from: g */
    public Map<String, Integer> f145909g = new HashMap();

    /* renamed from: h */
    public View$OnClickListenerC64377l.AbstractC64378a f145910h = new View$OnClickListenerC64377l.AbstractC64378a() {
        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.C643603 */

        static {
            Covode.recordClassIndex(75814);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.View$OnClickListenerC64377l.AbstractC64378a
        /* renamed from: a */
        public final void mo103919a(User user, int i) {
            if (i >= 0 && i < C64357h.this.f92236l.size()) {
                C64357h.this.f92236l.remove(i);
                C64357h.this.notifyItemRemoved(i);
                if (C64357h.this.f145904b != null) {
                    C64357h.this.f145904b.mo81340a(user);
                    if (C64357h.this.f92236l.isEmpty()) {
                        C64357h.this.f145904b.mo81339a();
                    }
                }
                if (i != C64357h.this.f92236l.size()) {
                    C64357h hVar = C64357h.this;
                    hVar.notifyItemRangeChanged(i, hVar.f92236l.size() - i);
                }
                if (C64357h.this.f92274v) {
                    if (C64357h.this.f92236l.size() <= 10) {
                        C64357h.this.mo67829d(false);
                    } else {
                        C64357h.this.mo67829d(true);
                    }
                }
            }
        }
    };

    /* renamed from: i */
    public View$OnClickListenerC64377l.AbstractC64379b f145911i;

    /* renamed from: j */
    private boolean f145912j = false;

    /* renamed from: k */
    private Object f145913k = new Object();

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.h$a */
    public interface AbstractC64361a {
        static {
            Covode.recordClassIndex(75815);
        }

        /* renamed from: a */
        void mo103898a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.h$b */
    public interface AbstractC64362b {
        static {
            Covode.recordClassIndex(75816);
        }

        /* renamed from: a */
        void mo81339a();

        /* renamed from: a */
        void mo81340a(User user);

        /* renamed from: b */
        void mo81341b(User user);

        /* renamed from: c */
        void mo81342c(User user);
    }

    static {
        Covode.recordClassIndex(75811);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<User> mo63369e() {
        return this.f92236l;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        if (this.f92236l.get(i) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private User m116233a(int i) {
        if (this.f92236l == null || i < 0 || i >= this.f92236l.size()) {
            return null;
        }
        return (User) this.f92236l.get(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaj, viewGroup, false);
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.View$OnClickListenerC643592 */

            static {
                Covode.recordClassIndex(75813);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C64357h.this.f145905c != null) {
                    C64357h.this.f145905c.mo103898a();
                }
            }
        });
        return new C64348b(a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC39097c cVar;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof View$OnClickListenerC64377l) && (cVar = this.f145906d) != null) {
            cVar.mo67855a(viewHolder);
        } else if ((viewHolder instanceof C64353g) && !this.f145912j) {
            C66649a.f149816a.mo105650a();
            ((C64353g) viewHolder).mo103915a();
            this.f145912j = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<User> list) {
        if (!(list == null || list.size() == 0)) {
            if (this.f92236l == null) {
                this.f92236l = new ArrayList();
            }
            this.f92236l.clear();
            this.f92236l.addAll(list);
            for (int i = 0; i < this.f92236l.size(); i++) {
                User user = (User) this.f92236l.get(i);
                if (!(user instanceof RecommendContact)) {
                    this.f145909g.put(user.getUid(), Integer.valueOf(i));
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C64353g(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aai, viewGroup, false), this.f145908f);
        }
        return new View$OnClickListenerC64377l(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aai, viewGroup, false), this.f145908f, this.f145913k);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof View$OnClickListenerC64377l) {
            View$OnClickListenerC64377l lVar = (View$OnClickListenerC64377l) viewHolder;
            User a = m116233a(i);
            View$OnClickListenerC64377l.AbstractC64378a aVar = this.f145910h;
            View$OnClickListenerC64377l.AbstractC64379b bVar = this.f145911i;
            AbstractC64362b bVar2 = this.f145904b;
            int i2 = this.f145903a;
            String str = this.f145907e;
            if (a != null) {
                lVar.f145968i = bVar2;
                lVar.f145964e = a;
                lVar.f145966g = aVar;
                lVar.f145967h = bVar;
                lVar.f145965f = i;
                lVar.f145960a.setUserData(new UserVerify(a.getAvatarThumb(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), Integer.valueOf(a.getVerificationType())));
                lVar.f145960a.mo61285a();
                lVar.mo103929a(lVar.f145964e);
                TextView textView = lVar.f145962c;
                int i3 = lVar.f145971l;
                User user = lVar.f145964e;
                if (i3 == 0) {
                    textView.setText("@" + user.getUniqueId());
                    textView.setMaxLines(1);
                } else {
                    textView.setText(user.getRecommendReason());
                }
                int followStatus = lVar.f145964e.getFollowStatus();
                lVar.f145964e.getFollowerStatus();
                lVar.mo103928a(followStatus);
                lVar.f145964e.getFollowStatus();
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) lVar.f145969j.getLayoutParams();
                if (i != 0) {
                    i2 = 0;
                }
                jVar.leftMargin = i2;
                lVar.f145969j.setLayoutParams(jVar);
                lVar.f145970k = str;
                C80581io.m139704a(lVar.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), lVar.f145961b);
            }
        } else if (viewHolder instanceof C64353g) {
            C64353g gVar = (C64353g) viewHolder;
            RecommendContact recommendContact = (RecommendContact) m116233a(i);
            C89219l.m154721d(recommendContact, "");
            gVar.f145889b.setPlaceHolder(2131233544);
            gVar.f145890c.setText(R.string.bwt);
            gVar.f145891d.setText(R.string.ox);
            gVar.f145893f.setOnClickListener(new C64353g.View$OnClickListenerC64354a(gVar, recommendContact, i));
            gVar.f145892e.setText("");
            gVar.f145892e.setBackgroundResource(R.drawable.na);
            gVar.f145892e.setTextColor(C0643b.m2378c(gVar.f145888a, R.color.a9));
            gVar.f145892e.setOnClickListener(new C64353g.View$OnClickListenerC64355b(gVar, recommendContact, i));
            gVar.f145894g = new AbstractC89183m<RecommendContact, Integer, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.C643581 */

                static {
                    Covode.recordClassIndex(75812);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(RecommendContact recommendContact, Integer num) {
                    RecommendContact recommendContact2 = recommendContact;
                    Integer num2 = num;
                    if (C64357h.this.f145910h == null) {
                        return null;
                    }
                    C64357h.this.f145910h.mo103919a(recommendContact2, num2.intValue());
                    return null;
                }
            };
        }
    }
}
