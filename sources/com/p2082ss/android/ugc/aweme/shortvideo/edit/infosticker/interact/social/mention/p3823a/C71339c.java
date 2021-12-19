package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71367e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71350a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73998bn;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c */
public final class C71339c extends RecyclerView.AbstractC1350a<C17151a<User>> {

    /* renamed from: a */
    public List<? extends User> f159885a;

    /* renamed from: b */
    public List<? extends C67679e> f159886b;

    /* renamed from: c */
    public String f159887c = "";

    /* renamed from: d */
    public AbstractC71340a f159888d;

    /* renamed from: e */
    public User f159889e;

    /* renamed from: f */
    public List<String> f159890f = new ArrayList();

    /* renamed from: g */
    public final Set<String> f159891g = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$a */
    public interface AbstractC71340a {
        static {
            Covode.recordClassIndex(83863);
        }

        /* renamed from: a */
        String mo112825a();
    }

    static {
        Covode.recordClassIndex(83862);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<User> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m126037a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i;
        List<? extends User> list = this.f159885a;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends C67679e> list2 = this.f159886b;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    /* renamed from: a */
    public final List<String> mo112829a() {
        ArrayList arrayList;
        String userId;
        List<? extends User> list = this.f159885a;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                if (uid != null) {
                    arrayList3.add(uid);
                }
            }
            arrayList2 = arrayList3;
        }
        List<? extends C67679e> list2 = this.f159886b;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                C67684i iVar = it2.next().f151672g;
                if (!(iVar == null || (userId = iVar.getUserId()) == null)) {
                    arrayList4.add(userId);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        if (arrayList2 != null) {
            return C89070n.m154572d((Collection) arrayList2, arrayList);
        }
        return C89086z.INSTANCE;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b */
    public final class C71341b extends C17151a<User> {

        /* renamed from: a */
        public View f159892a;

        /* renamed from: b */
        public SmartImageView f159893b;

        /* renamed from: c */
        public TextView f159894c;

        /* renamed from: d */
        public final View f159895d;

        /* renamed from: e */
        public final C71339c f159896e;

        /* renamed from: f */
        final /* synthetic */ C71339c f159897f;

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b$a */
        public static final class View$OnTouchListenerC71342a implements View.OnTouchListener {

            /* renamed from: a */
            public static final View$OnTouchListenerC71342a f159898a = new View$OnTouchListenerC71342a();

            static {
                Covode.recordClassIndex(83865);
            }

            View$OnTouchListenerC71342a() {
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(83864);
        }

        /* renamed from: a */
        private static C34602l m126040a(UrlModel urlModel) {
            if (urlModel == null) {
                return null;
            }
            return new C34602l(urlModel.getUri(), urlModel.getUrlList());
        }

        /* renamed from: a */
        private final void m126042a(boolean z) {
            int color;
            GradientDrawable gradientDrawable;
            TextView textView = this.f159894c;
            Context context = this.f159895d.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            if (z) {
                color = resources.getColor(R.color.bh);
            } else {
                color = resources.getColor(R.color.a_);
            }
            textView.setTextColor(color);
            View view = this.f159892a;
            if (z) {
                C84966b a = C84966b.C84967a.m146038a().mo129752a(1);
                Context context2 = this.f159895d.getContext();
                C89219l.m154716b(context2, "");
                int color2 = context2.getResources().getColor(R.color.bh);
                Context context3 = this.f159892a.getContext();
                C89219l.m154716b(context3, "");
                gradientDrawable = a.mo129753a(color2, (int) C84912r.m145930a(context3, 2.0f)).mo129755b(0).mo129750a();
            } else {
                gradientDrawable = null;
            }
            view.setBackground(gradientDrawable);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b$b */
        public static final class C71343b extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ C71341b f159899a;

            /* renamed from: b */
            final /* synthetic */ User f159900b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f159901c;

            static {
                Covode.recordClassIndex(83866);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                String str;
                C39162r.m79460a("tag_mention_head_click", new C84425b().mo129406a("previous_page", "video_post_page").mo129406a("to_user_id", this.f159900b.getUid()).mo129406a("user_type", (String) this.f159901c.element).mo129406a("search_keyword", this.f159899a.f159897f.f159887c).mo129406a("function", "mention").mo129406a("is_valid", String.valueOf(!this.f159899a.f159897f.f159890f.contains(this.f159900b.getUid()) ? 1 : 0)).mo129406a("click_type", "choose").mo129406a("enter_from", "video_edit_page").f188764a);
                if (this.f159899a.f159897f.f159890f.contains(this.f159900b.getUid())) {
                    new C23144b(this.f159899a.f159895d).mo37640e(R.string.d23).mo37637b();
                    return;
                }
                C84425b a = new C84425b().mo129406a("search_keyword", this.f159899a.f159897f.f159887c);
                C48027ac acVar = C48027ac.C48028a.f111257a;
                AbstractC71340a aVar = this.f159899a.f159897f.f159888d;
                if (aVar != null) {
                    str = aVar.mo112825a();
                } else {
                    str = null;
                }
                C39162r.m79460a("add_video_at", a.mo129406a("log_pb", acVar.mo80055a(str)).mo129406a("to_user_id", this.f159900b.getUid()).mo129403a("relation_tag", this.f159900b.getFollowStatus()).mo129406a("enter_from", "video_edit_page").f188764a);
                AbstractC81915c.m141874a(new C71350a(this.f159900b));
            }

            C71343b(C71341b bVar, User user, C89233z.C89238e eVar) {
                this.f159899a = bVar;
                this.f159900b = user;
                this.f159901c = eVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c$b$c */
        public static final class View$OnAttachStateChangeListenerC71344c implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ C71341b f159902a;

            /* renamed from: b */
            final /* synthetic */ User f159903b;

            /* renamed from: c */
            final /* synthetic */ String f159904c;

            static {
                Covode.recordClassIndex(83867);
            }

            public final void onViewDetachedFromWindow(View view) {
                C89219l.m154721d(view, "");
            }

            public final void onViewAttachedToWindow(View view) {
                C89219l.m154721d(view, "");
                if (!this.f159902a.f159897f.f159891g.contains(this.f159903b.getUid())) {
                    C39162r.m79460a("tag_mention_head_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("previous_page", "video_post_page").mo129406a("to_user_id", this.f159903b.getUid()).mo129406a("user_type", this.f159904c).mo129406a("search_keyword", "").mo129406a("function", "mention").mo129406a("is_valid", String.valueOf(!this.f159902a.f159897f.f159890f.contains(this.f159903b.getUid()) ? 1 : 0)).f188764a);
                    Set<String> set = this.f159902a.f159897f.f159891g;
                    String uid = this.f159903b.getUid();
                    C89219l.m154716b(uid, "");
                    set.add(uid);
                }
            }

            View$OnAttachStateChangeListenerC71344c(C71341b bVar, User user, String str) {
                this.f159902a = bVar;
                this.f159903b = user;
                this.f159904c = str;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo112830a(User user) {
            float f;
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = "all_user";
            List<? extends User> list = this.f159897f.f159885a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C89219l.m154714a((Object) user.getUid(), (Object) it.next().getUid())) {
                        eVar.element = "follow";
                    }
                }
            }
            m126041a(user, eVar.element);
            this.f159894c.setText(C73998bn.m130142a(user));
            String str = null;
            this.f159894c.setBackground(null);
            View view = this.f159895d;
            if (this.f159897f.f159890f.contains(user.getUid())) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            C20766v a = C20761r.m39060a(m126040a(user.getAvatarThumb()));
            C20745e.C20746a aVar = new C20745e.C20746a();
            aVar.f48957a = true;
            a.f49126w = aVar.mo34169a();
            a.f49092E = this.f159893b;
            a.mo34186c();
            String uid = user.getUid();
            User user2 = this.f159897f.f159889e;
            if (user2 != null) {
                str = user2.getUid();
            }
            m126042a(C89219l.m154714a((Object) uid, (Object) str));
            this.f159895d.setOnTouchListener(View$OnTouchListenerC71342a.f159898a);
            this.f159895d.setOnClickListener(new C71343b(this, user, eVar));
        }

        /* renamed from: a */
        private final void m126041a(User user, String str) {
            this.itemView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC71344c(this, user, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71341b(C71339c cVar, View view, C71339c cVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(cVar2, "");
            this.f159897f = cVar;
            this.f159895d = view;
            this.f159896e = cVar2;
            View findViewById = view.findViewById(R.id.bsl);
            C89219l.m154716b(findViewById, "");
            this.f159892a = findViewById;
            View findViewById2 = view.findViewById(R.id.bsm);
            C89219l.m154716b(findViewById2, "");
            this.f159893b = (SmartImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.esb);
            C89219l.m154716b(findViewById3, "");
            this.f159894c = (TextView) findViewById3;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<User> aVar, int i) {
        int i2;
        C17151a<User> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        List<? extends User> list = this.f159885a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<? extends User> list2 = this.f159885a;
            if (list2 != null) {
                if (!(aVar2 instanceof C71341b)) {
                    aVar2 = null;
                }
                C71341b bVar = (C71341b) aVar2;
                if (bVar != null) {
                    User user = (User) list2.get(i);
                    C89219l.m154721d(user, "");
                    bVar.mo112830a(user);
                    return;
                }
                return;
            }
            return;
        }
        List<? extends C67679e> list3 = this.f159886b;
        if (list3 != null) {
            if (!(aVar2 instanceof C71341b)) {
                aVar2 = null;
            }
            C71341b bVar2 = (C71341b) aVar2;
            if (bVar2 != null) {
                C67679e eVar = (C67679e) list3.get(i - i2);
                C89219l.m154721d(eVar, "");
                C67684i iVar = eVar.f151672g;
                if (iVar != null) {
                    bVar2.mo112830a(C71367e.m126079a(iVar));
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m126037a(C71339c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12297);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9e, viewGroup, false);
        C89219l.m154716b(a2, "");
        C71341b bVar = new C71341b(cVar, a2, cVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(12297);
        return bVar;
    }
}
