package com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar */
public final class NewUserFeedProgressBar extends RelativeLayout {

    /* renamed from: k */
    public static final C50408a f116385k = new C50408a((byte) 0);

    /* renamed from: a */
    public RelativeLayout f116386a;

    /* renamed from: b */
    public LinearLayout f116387b;

    /* renamed from: c */
    public TextView f116388c;

    /* renamed from: d */
    public ProgressBar f116389d;

    /* renamed from: e */
    public NewUserProgressModel.ProgressBarInfo f116390e;

    /* renamed from: f */
    public Fragment f116391f;

    /* renamed from: g */
    public AbstractC49691s<C49672ag> f116392g;

    /* renamed from: h */
    public AbstractC50421b f116393h;

    /* renamed from: i */
    public String f116394i;

    /* renamed from: j */
    public int f116395j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$c */
    public static final class View$OnClickListenerC50412c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC50412c f116399a = new View$OnClickListenerC50412c();

        static {
            Covode.recordClassIndex(59545);
        }

        View$OnClickListenerC50412c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$f */
    public static final class View$OnClickListenerC50416f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC50416f f116403a = new View$OnClickListenerC50416f();

        static {
            Covode.recordClassIndex(59549);
        }

        View$OnClickListenerC50416f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(59540);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$a */
    public static final class C50408a {
        static {
            Covode.recordClassIndex(59541);
        }

        private C50408a() {
        }

        public /* synthetic */ C50408a(byte b) {
            this();
        }
    }

    public final RelativeLayout getProgressViewRoot() {
        RelativeLayout relativeLayout = this.f116386a;
        if (relativeLayout == null) {
            C89219l.m154710a("progressViewRoot");
        }
        return relativeLayout;
    }

    public final void setProgressViewRoot(RelativeLayout relativeLayout) {
        C89219l.m154721d(relativeLayout, "");
        this.f116386a = relativeLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewUserFeedProgressBar(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ String m94562a(NewUserFeedProgressBar newUserFeedProgressBar) {
        String str = newUserFeedProgressBar.f116394i;
        if (str == null) {
            C89219l.m154710a("currentAwemeGroupId");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC49691s m94563b(NewUserFeedProgressBar newUserFeedProgressBar) {
        AbstractC49691s<C49672ag> sVar = newUserFeedProgressBar.f116392g;
        if (sVar == null) {
            C89219l.m154710a("listener");
        }
        return sVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$b */
    static final class C50409b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserFeedProgressBar f116396a;

        static {
            Covode.recordClassIndex(59542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50409b(NewUserFeedProgressBar newUserFeedProgressBar) {
            super(1);
            this.f116396a = newUserFeedProgressBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.ewy, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.NewUserFeedProgressBar.C50409b.C504101 */

                /* renamed from: a */
                final /* synthetic */ C50409b f116397a;

                static {
                    Covode.recordClassIndex(59543);
                }

                {
                    this.f116397a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    NewUserFeedProgressBar.m94563b(this.f116397a.f116396a).mo63634a(new C49672ag(59));
                    C50418a.C50419a.m94569a(this.f116397a.f116396a.f116395j, NewUserFeedProgressBar.m94562a(this.f116397a.f116396a), false);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.eww, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.NewUserFeedProgressBar.C50409b.C504112 */

                /* renamed from: a */
                final /* synthetic */ C50409b f116398a;

                static {
                    Covode.recordClassIndex(59544);
                }

                {
                    this.f116398a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f116398a.f116396a.mo85598a(true);
                    int i = this.f116398a.f116396a.f116395j;
                    String a = NewUserFeedProgressBar.m94562a(this.f116398a.f116396a);
                    C89219l.m154721d(a, "");
                    C33744d dVar = new C33744d();
                    String str = C50418a.f116405a;
                    if (str == null) {
                        C89219l.m154710a("enterFrom");
                    }
                    C39162r.m79460a("turnoff_nuf_progress_bar_result", dVar.mo59983a("enter_from", str).mo59980a("progress_pct", i).mo59983a("group_id", a).f79943a);
                    C50418a.C50419a.m94569a(this.f116398a.f116396a.f116395j, NewUserFeedProgressBar.m94562a(this.f116398a.f116396a), true);
                    NewUserFeedProgressBar.m94563b(this.f116398a.f116396a).mo63634a(new C49672ag(59));
                    AbstractC50421b bVar = this.f116398a.f116396a.f116393h;
                    if (bVar == null) {
                        C89219l.m154710a("progressBarUpdateListener");
                    }
                    bVar.mo84704aL();
                    if (C50418a.f116406b.contains("progress_dismiss_key")) {
                        C50418a.C50419a.m94570a(new JSONObject(C50418a.f116406b.getString("progress_dismiss_key", "")), C50418a.f116408d);
                    }
                    C50418a.f116408d.put(C50418a.f116413i, true);
                    C50418a.f116406b.storeString("progress_dismiss_key", new JSONObject(C50418a.f116408d).toString());
                    C50418a.f116406b.storeBoolean("progress_dismissed_by_user", true);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$e */
    static final class C50414e extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserFeedProgressBar f116401a;

        static {
            Covode.recordClassIndex(59547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50414e(NewUserFeedProgressBar newUserFeedProgressBar) {
            super(1);
            this.f116401a = newUserFeedProgressBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.bx, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.NewUserFeedProgressBar.C50414e.C504151 */

                /* renamed from: a */
                final /* synthetic */ C50414e f116402a;

                static {
                    Covode.recordClassIndex(59548);
                }

                {
                    this.f116402a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    NewUserFeedProgressBar.m94563b(this.f116402a.f116401a).mo63634a(new C49672ag(59));
                    int i = this.f116402a.f116401a.f116395j;
                    String a = NewUserFeedProgressBar.m94562a(this.f116402a.f116401a);
                    C89219l.m154721d(a, "");
                    C33744d dVar = new C33744d();
                    String str = C50418a.f116405a;
                    if (str == null) {
                        C89219l.m154710a("enterFrom");
                    }
                    C39162r.m79460a("close_nuf_progress_info_popup", dVar.mo59983a("enter_from", str).mo59980a("progress_pct", i).mo59983a("group_id", a).f79943a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo85598a(boolean z) {
        int i;
        RelativeLayout relativeLayout = this.f116386a;
        if (relativeLayout == null) {
            C89219l.m154710a("progressViewRoot");
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        relativeLayout.setVisibility(i);
        if (z) {
            RelativeLayout relativeLayout2 = this.f116386a;
            if (relativeLayout2 == null) {
                C89219l.m154710a("progressViewRoot");
            }
            relativeLayout2.setVisibility(8);
            RelativeLayout relativeLayout3 = this.f116386a;
            if (relativeLayout3 == null) {
                C89219l.m154710a("progressViewRoot");
            }
            relativeLayout3.setOnClickListener(View$OnClickListenerC50412c.f116399a);
            return;
        }
        RelativeLayout relativeLayout4 = this.f116386a;
        if (relativeLayout4 == null) {
            C89219l.m154710a("progressViewRoot");
        }
        relativeLayout4.setOnClickListener(new View$OnClickListenerC50413d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$d */
    public static final class View$OnClickListenerC50413d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewUserFeedProgressBar f116400a;

        static {
            Covode.recordClassIndex(59546);
        }

        View$OnClickListenerC50413d(NewUserFeedProgressBar newUserFeedProgressBar) {
            this.f116400a = newUserFeedProgressBar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f116400a.getProgressViewRoot().setVisibility(0);
            int i = this.f116400a.f116395j;
            String a = NewUserFeedProgressBar.m94562a(this.f116400a);
            C89219l.m154721d(a, "");
            C33744d dVar = new C33744d();
            String str2 = C50418a.f116405a;
            if (str2 == null) {
                C89219l.m154710a("enterFrom");
            }
            C39162r.m79460a("click_nuf_progress_bar", dVar.mo59983a("enter_from", str2).mo59980a("progress_pct", i).mo59983a("group_id", a).f79943a);
            NewUserFeedProgressBar newUserFeedProgressBar = this.f116400a;
            Fragment fragment = newUserFeedProgressBar.f116391f;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            if (fragment.getActivity() != null) {
                Fragment fragment2 = newUserFeedProgressBar.f116391f;
                if (fragment2 == null) {
                    C89219l.m154710a("fragment");
                }
                ActivityC0945e activity = fragment2.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                if (!activity.isFinishing()) {
                    AbstractC49691s<C49672ag> sVar = newUserFeedProgressBar.f116392g;
                    if (sVar == null) {
                        C89219l.m154710a("listener");
                    }
                    sVar.mo63634a(new C49672ag(44));
                    Fragment fragment3 = newUserFeedProgressBar.f116391f;
                    if (fragment3 == null) {
                        C89219l.m154710a("fragment");
                    }
                    ActivityC0945e activity2 = fragment3.getActivity();
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity2, "");
                    C23023b bVar = new C23023b(activity2);
                    NewUserProgressModel.ProgressBarInfo progressBarInfo = newUserFeedProgressBar.f116390e;
                    String str3 = null;
                    if (progressBarInfo != null) {
                        str = progressBarInfo.getTextTapTitle();
                    } else {
                        str = null;
                    }
                    C23023b a2 = bVar.mo37411b(str);
                    NewUserProgressModel.ProgressBarInfo progressBarInfo2 = newUserFeedProgressBar.f116390e;
                    if (progressBarInfo2 != null) {
                        str3 = progressBarInfo2.getTextTapBody();
                    }
                    ((C23023b) C23028c.m43435a(a2.mo37413d(str3), new C50414e(newUserFeedProgressBar)).mo37482a(false)).mo37405a().mo37396b().show();
                    int i2 = newUserFeedProgressBar.f116395j;
                    String str4 = newUserFeedProgressBar.f116394i;
                    if (str4 == null) {
                        C89219l.m154710a("currentAwemeGroupId");
                    }
                    C89219l.m154721d(str4, "");
                    C33744d dVar2 = new C33744d();
                    String str5 = C50418a.f116405a;
                    if (str5 == null) {
                        C89219l.m154710a("enterFrom");
                    }
                    C39162r.m79460a("show_nuf_progress_info_popup", dVar2.mo59983a("enter_from", str5).mo59980a("progress_pct", i2).mo59983a("group_id", str4).f79943a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserFeedProgressBar$g */
    public static final class View$OnClickListenerC50417g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewUserFeedProgressBar f116404a;

        static {
            Covode.recordClassIndex(59550);
        }

        public View$OnClickListenerC50417g(NewUserFeedProgressBar newUserFeedProgressBar) {
            this.f116404a = newUserFeedProgressBar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            int i = this.f116404a.f116395j;
            String a = NewUserFeedProgressBar.m94562a(this.f116404a);
            C89219l.m154721d(a, "");
            C33744d dVar = new C33744d();
            String str2 = C50418a.f116405a;
            if (str2 == null) {
                C89219l.m154710a("enterFrom");
            }
            C39162r.m79460a("turnoff_nuf_progress_bar_request", dVar.mo59983a("enter_from", str2).mo59980a("progress_pct", i).mo59983a("group_id", a).f79943a);
            NewUserFeedProgressBar newUserFeedProgressBar = this.f116404a;
            Fragment fragment = newUserFeedProgressBar.f116391f;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            if (fragment.getActivity() != null) {
                Fragment fragment2 = newUserFeedProgressBar.f116391f;
                if (fragment2 == null) {
                    C89219l.m154710a("fragment");
                }
                ActivityC0945e activity = fragment2.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                if (!activity.isFinishing()) {
                    AbstractC49691s<C49672ag> sVar = newUserFeedProgressBar.f116392g;
                    if (sVar == null) {
                        C89219l.m154710a("listener");
                    }
                    sVar.mo63634a(new C49672ag(44));
                    Fragment fragment3 = newUserFeedProgressBar.f116391f;
                    if (fragment3 == null) {
                        C89219l.m154710a("fragment");
                    }
                    ActivityC0945e activity2 = fragment3.getActivity();
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity2, "");
                    C23023b bVar = new C23023b(activity2);
                    NewUserProgressModel.ProgressBarInfo progressBarInfo = newUserFeedProgressBar.f116390e;
                    String str3 = null;
                    if (progressBarInfo != null) {
                        str = progressBarInfo.getTextRemoveTitle();
                    } else {
                        str = null;
                    }
                    C23023b a2 = bVar.mo37411b(str);
                    NewUserProgressModel.ProgressBarInfo progressBarInfo2 = newUserFeedProgressBar.f116390e;
                    if (progressBarInfo2 != null) {
                        str3 = progressBarInfo2.getTextRemoveBody();
                    }
                    ((C23023b) C23028c.m43435a(a2.mo37413d(str3), new C50409b(newUserFeedProgressBar)).mo37482a(false)).mo37405a().mo37396b().show();
                    int i2 = newUserFeedProgressBar.f116395j;
                    String str4 = newUserFeedProgressBar.f116394i;
                    if (str4 == null) {
                        C89219l.m154710a("currentAwemeGroupId");
                    }
                    C89219l.m154721d(str4, "");
                    C33744d dVar2 = new C33744d();
                    String str5 = C50418a.f116405a;
                    if (str5 == null) {
                        C89219l.m154710a("enterFrom");
                    }
                    C39162r.m79460a("show_nuf_progress_turnoff_popup", dVar2.mo59983a("enter_from", str5).mo59980a("progress_pct", i2).mo59983a("group_id", str4).f79943a);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewUserFeedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6517);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ss, this, true);
        View findViewById = findViewById(R.id.dni);
        C89219l.m154716b(findViewById, "");
        this.f116386a = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(R.id.a10);
        C89219l.m154716b(findViewById2, "");
        this.f116387b = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.d_3);
        C89219l.m154716b(findViewById3, "");
        this.f116388c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.eaa);
        C89219l.m154716b(findViewById4, "");
        this.f116389d = (ProgressBar) findViewById4;
        MethodCollector.m26664o(6517);
    }
}
