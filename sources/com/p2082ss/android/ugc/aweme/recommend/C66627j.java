package com.p2082ss.android.ugc.aweme.recommend;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51756y;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51702av;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51704aw;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51712ax;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.recommend.j */
public final class C66627j extends AbstractC39060f<User> {

    /* renamed from: d */
    public static final C66628a f149771d = new C66628a((byte) 0);

    /* renamed from: a */
    final RecommendUserHint f149772a;

    /* renamed from: b */
    public boolean f149773b;

    /* renamed from: c */
    public final String f149774c;

    /* renamed from: e */
    private final HashMap<String, Boolean> f149775e = new HashMap<>();

    /* renamed from: f */
    private final Set<String> f149776f = new HashSet();

    /* renamed from: g */
    private final AbstractC34478k<User> f149777g;

    static {
        Covode.recordClassIndex(78185);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.j$a */
    public static final class C66628a {
        static {
            Covode.recordClassIndex(78186);
        }

        private C66628a() {
        }

        public /* synthetic */ C66628a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        User user = (User) this.f92236l.get(i);
        if (!(user instanceof RecommendUserHint) || ((RecommendUserHint) user).getRecDialogType() != 1) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c4);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        DmtStatusView.C17269a c2 = dmtStatusView.mo27381c();
        c2.f41304g = 0;
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c);
        tuxTextView.setTuxFont(61);
        tuxTextView.setText(R.string.f5i);
        dmtStatusView.setBuilder(c2.mo27406b(tuxTextView));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C51712ax) {
            C51712ax axVar = (C51712ax) viewHolder;
            User data = axVar.f119207a.getData();
            if (data != null && !this.f149776f.contains(data.getUid())) {
                Set<String> set = this.f149776f;
                String uid = data.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
                this.f149777g.mo60910a(103, data, axVar.getAdapterPosition());
                C61504e.C61505a.f139616a.mo99160a(3, data.getUid());
            }
        }
    }

    public C66627j(AbstractC34478k<User> kVar, String str) {
        C89219l.m154721d(kVar, "");
        this.f149777g = kVar;
        this.f149774c = str;
        RecommendUserHint recommendUserHint = new RecommendUserHint();
        recommendUserHint.setRecDialogType(1);
        this.f149772a = recommendUserHint;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i != 1) {
            C51648a aVar = C51648a.f118980a;
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            AbstractC51756y a = aVar.mo87299a(context, this.f149775e, false, false);
            if (a == null) {
                C89219l.m154715b();
            }
            a.setEnterFrom("others_homepage");
            a.setListener(this.f149777g);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.ui.RecommendUserDialogItemView");
            return new C51712ax((C51704aw) a);
        }
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2n, viewGroup, false);
        C89219l.m154716b(a2, "");
        C51702av avVar = new C51702av(a2);
        String str = this.f149774c;
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        avVar.f119184b = str;
        return avVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            return;
        }
        if (viewHolder instanceof C51702av) {
            C51702av avVar = (C51702av) viewHolder;
            avVar.f119183a.setMovementMethod(LinkMovementMethod.getInstance());
            avVar.f119183a.setHighlightColor(C0643b.m2378c(avVar.f119183a.getContext(), R.color.c9));
            Context context = avVar.f119183a.getContext();
            C89219l.m154716b(context, "");
            String string = context.getResources().getString(R.string.cv8);
            C89219l.m154716b(string, "");
            Context context2 = avVar.f119183a.getContext();
            C89219l.m154716b(context2, "");
            String string2 = context2.getResources().getString(R.string.c_e, string);
            C89219l.m154716b(string2, "");
            int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a >= 0) {
                spannableString.setSpan(new C51702av.C51703a(avVar), a, length, 34);
                spannableString.setSpan(new StyleSpan(1), a, length, 34);
            }
            avVar.f119183a.setText(spannableString);
        } else if (viewHolder instanceof C51712ax) {
            C51712ax axVar = (C51712ax) viewHolder;
            Object obj = this.f92236l.get(i);
            C89219l.m154716b(obj, "");
            User user = (User) obj;
            C89219l.m154721d(user, "");
            axVar.f119207a.setData(user);
            axVar.f119207a.setPositionInApiList(i);
        }
    }

    /* renamed from: a */
    public final void mo105638a(User user, int i) {
        C89219l.m154721d(user, "");
        List list = this.f92236l;
        C89219l.m154716b(list, "");
        Iterator it = C89070n.m154518a((Collection<?>) list).iterator();
        while (it.hasNext()) {
            int a = ((AbstractC89040af) it).mo143429a();
            Object obj = this.f92236l.get(a);
            C89219l.m154716b(obj, "");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f92236l.get(a);
                C89219l.m154716b(obj2, "");
                ((User) obj2).setFollowStatus(i);
                notifyItemChanged(a);
            }
        }
    }
}
