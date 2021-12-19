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
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71350a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71351b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73998bn;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a */
public final class C71332a extends RecyclerView.AbstractC1350a<C17151a<User>> {

    /* renamed from: a */
    public User f159862a;

    /* renamed from: b */
    public List<? extends User> f159863b;

    /* renamed from: c */
    public List<String> f159864c = new ArrayList();

    /* renamed from: d */
    public List<String> f159865d = new ArrayList();

    /* renamed from: e */
    public C71351b.C71352a.C71353a f159866e;

    /* renamed from: f */
    public final Set<String> f159867f = new LinkedHashSet();

    static {
        Covode.recordClassIndex(83855);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C17151a<User> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m126033a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<? extends User> list = this.f159863b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a */
    public final class C71333a extends C17151a<User> {

        /* renamed from: a */
        public View f159868a;

        /* renamed from: b */
        public SmartImageView f159869b;

        /* renamed from: c */
        public TextView f159870c;

        /* renamed from: d */
        public final View f159871d;

        /* renamed from: e */
        public final C71332a f159872e;

        /* renamed from: f */
        final /* synthetic */ C71332a f159873f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$a */
        static final class View$OnTouchListenerC71334a implements View.OnTouchListener {

            /* renamed from: a */
            public static final View$OnTouchListenerC71334a f159874a = new View$OnTouchListenerC71334a();

            static {
                Covode.recordClassIndex(83857);
            }

            View$OnTouchListenerC71334a() {
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(83856);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$b */
        public static final class C71335b extends AbstractView$OnClickListenerC81432d {

            /* renamed from: a */
            final /* synthetic */ C71333a f159875a;

            /* renamed from: b */
            final /* synthetic */ User f159876b;

            /* renamed from: c */
            final /* synthetic */ String f159877c;

            static {
                Covode.recordClassIndex(83858);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C39162r.m79460a("tag_mention_head_click", new C84425b().mo129406a("previous_page", "video_post_page").mo129406a("to_user_id", this.f159876b.getUid()).mo129406a("user_type", this.f159877c).mo129406a("search_keyword", "").mo129406a("function", "mention").mo129406a("is_valid", String.valueOf(!this.f159875a.f159873f.f159864c.contains(this.f159876b.getUid()) ? 1 : 0)).mo129406a("click_type", "choose").mo129406a("enter_from", "video_edit_page").f188764a);
                if (this.f159875a.f159873f.f159864c.contains(this.f159876b.getUid())) {
                    View view2 = this.f159875a.itemView;
                    C89219l.m154716b(view2, "");
                    new C23144b(view2).mo37640e(R.string.d23).mo37637b();
                    return;
                }
                C39162r.m79460a("add_video_at", new C84425b().mo129406a("search_keyword", "").mo129406a("log_pb", C48027ac.C48028a.f111257a.mo80059c(this.f159876b.getUid())).mo129406a("to_user_id", this.f159876b.getUid()).mo129403a("relation_tag", this.f159876b.getFollowStatus()).mo129406a("enter_from", "video_edit_page").f188764a);
                AbstractC81915c.m141874a(new C71350a(this.f159876b));
            }

            C71335b(C71333a aVar, User user, String str) {
                this.f159875a = aVar;
                this.f159876b = user;
                this.f159877c = str;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a$a$c */
        public static final class View$OnAttachStateChangeListenerC71336c implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ C71333a f159878a;

            /* renamed from: b */
            final /* synthetic */ User f159879b;

            /* renamed from: c */
            final /* synthetic */ String f159880c;

            static {
                Covode.recordClassIndex(83859);
            }

            public final void onViewDetachedFromWindow(View view) {
                C89219l.m154721d(view, "");
            }

            public final void onViewAttachedToWindow(View view) {
                C89219l.m154721d(view, "");
                if (!this.f159878a.f159873f.f159867f.contains(this.f159879b.getUid())) {
                    C39162r.m79460a("tag_mention_head_show", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("previous_page", "video_post_page").mo129406a("to_user_id", this.f159879b.getUid()).mo129406a("user_type", this.f159880c).mo129406a("search_keyword", "").mo129406a("function", "mention").mo129406a("is_valid", String.valueOf(!this.f159878a.f159873f.f159864c.contains(this.f159879b.getUid()) ? 1 : 0)).f188764a);
                    Set<String> set = this.f159878a.f159873f.f159867f;
                    String uid = this.f159879b.getUid();
                    C89219l.m154716b(uid, "");
                    set.add(uid);
                }
            }

            View$OnAttachStateChangeListenerC71336c(C71333a aVar, User user, String str) {
                this.f159878a = aVar;
                this.f159879b = user;
                this.f159880c = str;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final /* synthetic */ void mo27052a(User user, int i) {
            String str;
            C34602l lVar;
            String str2;
            int color;
            float f;
            User user2 = user;
            C89219l.m154721d(user2, "");
            if (this.f159873f.f159865d.contains(user2.getUid())) {
                str = "recent";
            } else if (user2.getFollowStatus() == 2) {
                str = "friend";
            } else {
                str = "follow";
            }
            this.itemView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC71336c(this, user2, str));
            this.f159870c.setText(C73998bn.m130142a(user2));
            GradientDrawable gradientDrawable = null;
            this.f159870c.setBackground(null);
            UrlModel avatarThumb = user2.getAvatarThumb();
            if (avatarThumb == null) {
                lVar = null;
            } else {
                lVar = new C34602l(avatarThumb.getUri(), avatarThumb.getUrlList());
            }
            C20766v a = C20761r.m39060a(lVar);
            C20745e.C20746a aVar = new C20745e.C20746a();
            aVar.f48957a = true;
            a.f49126w = aVar.mo34169a();
            a.f49092E = this.f159869b;
            a.mo34186c();
            String uid = user2.getUid();
            User user3 = this.f159873f.f159862a;
            if (user3 != null) {
                str2 = user3.getUid();
            } else {
                str2 = null;
            }
            boolean a2 = C89219l.m154714a((Object) uid, (Object) str2);
            TextView textView = this.f159870c;
            Context context = this.f159871d.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            if (a2) {
                color = resources.getColor(R.color.bh);
            } else {
                color = resources.getColor(R.color.a_);
            }
            textView.setTextColor(color);
            View view = this.f159868a;
            if (a2) {
                C84966b a3 = C84966b.C84967a.m146038a().mo129752a(1);
                Context context2 = this.f159871d.getContext();
                C89219l.m154716b(context2, "");
                int color2 = context2.getResources().getColor(R.color.bh);
                Context context3 = this.f159868a.getContext();
                C89219l.m154716b(context3, "");
                gradientDrawable = a3.mo129753a(color2, (int) C84912r.m145930a(context3, 2.0f)).mo129755b(0).mo129750a();
            }
            view.setBackground(gradientDrawable);
            if (this.f159873f.f159864c.contains(user2.getUid())) {
                this.f159871d.setOnTouchListener(View$OnTouchListenerC71334a.f159874a);
            }
            this.f159871d.setOnClickListener(new C71335b(this, user2, str));
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            if (this.f159873f.f159864c.contains(user2.getUid())) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            view2.setAlpha(f);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71333a(C71332a aVar, View view, C71332a aVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar2, "");
            this.f159873f = aVar;
            this.f159871d = view;
            this.f159872e = aVar2;
            View findViewById = view.findViewById(R.id.bsl);
            C89219l.m154716b(findViewById, "");
            this.f159868a = findViewById;
            View findViewById2 = view.findViewById(R.id.bsm);
            C89219l.m154716b(findViewById2, "");
            this.f159869b = (SmartImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.esb);
            C89219l.m154716b(findViewById3, "");
            this.f159870c = (TextView) findViewById3;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C17151a<User> aVar, int i) {
        C17151a<User> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        List<? extends User> list = this.f159863b;
        if (list == null) {
            C89219l.m154715b();
        }
        aVar2.mo27052a(list.get(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m126033a(C71332a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(12302);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9e, viewGroup, false);
        C89219l.m154716b(a2, "");
        C71333a aVar2 = new C71333a(aVar, a2, aVar);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(12302);
        return aVar2;
    }
}
