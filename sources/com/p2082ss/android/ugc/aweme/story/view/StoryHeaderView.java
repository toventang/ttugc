package com.p2082ss.android.ugc.aweme.story.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView */
public final class StoryHeaderView extends ConstraintLayout {

    /* renamed from: g */
    public Aweme f174283g;

    /* renamed from: h */
    public String f174284h;

    /* renamed from: i */
    private SparseArray f174285i;

    /* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView$a */
    public static final class View$OnClickListenerC77708a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC77708a f174286a = new View$OnClickListenerC77708a();

        static {
            Covode.recordClassIndex(90758);
        }

        View$OnClickListenerC77708a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView$b */
    public static final class View$OnClickListenerC77709b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC77709b f174287a = new View$OnClickListenerC77709b();

        static {
            Covode.recordClassIndex(90759);
        }

        View$OnClickListenerC77709b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView$d */
    public static final class View$OnClickListenerC77711d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC77711d f174292a = new View$OnClickListenerC77711d();

        static {
            Covode.recordClassIndex(90761);
        }

        View$OnClickListenerC77711d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(90757);
    }

    public StoryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f174285i == null) {
            this.f174285i = new SparseArray();
        }
        View view = (View) this.f174285i.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f174285i.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView$e */
    public static final class View$OnClickListenerC77712e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f174293a;

        static {
            Covode.recordClassIndex(90762);
        }

        public View$OnClickListenerC77712e(AbstractC89171a aVar) {
            this.f174293a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                this.f174293a.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.StoryHeaderView$c */
    public static final class View$OnClickListenerC77710c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryHeaderView f174288a;

        /* renamed from: b */
        final /* synthetic */ String f174289b;

        /* renamed from: c */
        final /* synthetic */ C48238ce f174290c;

        /* renamed from: d */
        final /* synthetic */ Aweme f174291d;

        static {
            Covode.recordClassIndex(90760);
        }

        public View$OnClickListenerC77710c(StoryHeaderView storyHeaderView, String str, C48238ce ceVar, Aweme aweme) {
            this.f174288a = storyHeaderView;
            this.f174289b = str;
            this.f174290c = ceVar;
            this.f174291d = aweme;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                if (this.f174289b.equals("personal_homepage") || this.f174289b.equals("others_homepage")) {
                    ActivityC0945e activity = this.f174290c.f111746c.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                StoryHeaderView storyHeaderView = this.f174288a;
                User author = this.f174291d.getAuthor();
                C89219l.m154716b(author, "");
                C59252q qVar = (C59252q) new C59252q().mo96749g(storyHeaderView.f174283g).mo96825o(storyHeaderView.f174284h).mo96741a("click_head");
                qVar.f135286Z = "main_head";
                Aweme aweme = storyHeaderView.f174283g;
                String str2 = null;
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                qVar.f135222V = C76598h.m134176a(user);
                if (C76706a.m134281g(storyHeaderView.f174283g)) {
                    str = "story";
                } else {
                    str = UGCMonitor.TYPE_POST;
                }
                qVar.f135223W = str;
                Aweme aweme2 = storyHeaderView.f174283g;
                if (aweme2 != null) {
                    str2 = C76706a.m134276b(aweme2);
                }
                qVar.mo96752b_(str2).mo96792f();
                SmartRouter.buildRoute(storyHeaderView.getContext(), "aweme://user/profile/" + author.getUid()).withParam("sec_user_id", author.getSecUid()).open();
            }
        }
    }

    private /* synthetic */ StoryHeaderView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryHeaderView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.b1d, this, true);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43660a((View) this, valueOf, (Integer) 0, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()))), (Integer) 0, false, 16);
        setBackgroundResource(R.drawable.a05);
        this.f174284h = "";
    }
}
