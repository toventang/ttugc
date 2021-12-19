package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46974gi;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.an */
public class C50053an {

    /* renamed from: o */
    public static final C50054a f115539o = new C50054a((byte) 0);

    /* renamed from: a */
    public TextView f115540a;

    /* renamed from: b */
    public View f115541b;

    /* renamed from: c */
    public View f115542c;

    /* renamed from: d */
    public TuxTextView f115543d;

    /* renamed from: e */
    public MutualRelationView f115544e;

    /* renamed from: f */
    public Aweme f115545f;

    /* renamed from: g */
    public DataCenter f115546g;

    /* renamed from: h */
    public String f115547h = "";

    /* renamed from: i */
    public String f115548i = "low_interest";

    /* renamed from: j */
    public Aweme f115549j;

    /* renamed from: k */
    public boolean f115550k = true;

    /* renamed from: l */
    public boolean f115551l;

    /* renamed from: m */
    public final Context f115552m;

    /* renamed from: n */
    public final HashMap<String, String> f115553n;

    /* renamed from: p */
    private TextView f115554p;

    /* renamed from: q */
    private List<InteractionTagUserInfo> f115555q = new ArrayList();

    /* renamed from: r */
    private final AbstractC89244h f115556r = C89250i.m154773a((AbstractC89171a) new C50057d(this));

    /* renamed from: s */
    private final AbstractC89244h f115557s = C89250i.m154773a((AbstractC89171a) new C50059f(this));

    /* renamed from: t */
    private final AbstractC89244h f115558t = C89250i.m154773a((AbstractC89171a) new C50058e(this));

    static {
        Covode.recordClassIndex(59179);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo85180a() {
        return ((Number) this.f115556r.getValue()).floatValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final float mo85188b() {
        return ((Number) this.f115557s.getValue()).floatValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$a */
    public static final class C50054a {
        static {
            Covode.recordClassIndex(59180);
        }

        private C50054a() {
        }

        public /* synthetic */ C50054a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$e */
    static final class C50058e extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C50053an f115567a;

        static {
            Covode.recordClassIndex(59184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50058e(C50053an anVar) {
            super(0);
            this.f115567a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f115567a.f115552m, 4.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$f */
    static final class C50059f extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C50053an f115568a;

        static {
            Covode.recordClassIndex(59185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50059f(C50053an anVar) {
            super(0);
            this.f115568a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f115568a.f115552m, 30.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$d */
    static final class C50057d extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C50053an f115566a;

        static {
            Covode.recordClassIndex(59183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50057d(C50053an anVar) {
            super(0);
            this.f115566a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) C34723i.m70928b(this.f115566a.f115552m)) - C13628n.m24520b(this.f115566a.f115552m, 105.0f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$g */
    public static final class RunnableC50060g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Aweme f115569a;

        /* renamed from: b */
        final /* synthetic */ C50053an f115570b;

        /* renamed from: c */
        final /* synthetic */ Aweme f115571c;

        static {
            Covode.recordClassIndex(59186);
        }

        RunnableC50060g(Aweme aweme, C50053an anVar, Aweme aweme2) {
            this.f115569a = aweme;
            this.f115570b = anVar;
            this.f115571c = aweme2;
        }

        public final void run() {
            C50053an anVar = this.f115570b;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("social_video_tagged_state", this.f115570b.mo85189b(this.f115569a));
            anVar.mo85187a(hashMap, false);
        }
    }

    /* renamed from: d */
    private final void m93985d() {
        TextView textView = this.f115540a;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingTop());
        }
        C34729o.m70955a(this.f115554p, 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo85190c() {
        String str;
        String authorUid;
        Context context = this.f115552m;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (activity != null && (activity instanceof ActivityC0945e) && this.f115545f != null) {
            CommentService e = CommentServiceImpl.m73664e();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC0945e eVar = (ActivityC0945e) activity;
            Aweme aweme = this.f115545f;
            if (aweme == null) {
                C89219l.m154715b();
            }
            e.mo63290a(eVar, aweme, this.f115547h, this.f115548i);
            C33744d a = new C33744d().mo59983a("enter_from", this.f115547h);
            Aweme aweme2 = this.f115545f;
            String str2 = "";
            if (aweme2 == null || (str = aweme2.getAid()) == null) {
                str = str2;
            }
            C33744d a2 = a.mo59983a("group_id", str);
            Aweme aweme3 = this.f115545f;
            if (!(aweme3 == null || (authorUid = aweme3.getAuthorUid()) == null)) {
                str2 = authorUid;
            }
            C39162r.m79460a("tag_anchor_click", a2.mo59983a("author_id", str2).mo59983a("anchor_type", this.f115548i).f79943a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85185a(String str) {
        C89219l.m154721d(str, "");
        this.f115548i = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$b */
    public static final class View$OnClickListenerC50055b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Object f115559a;

        /* renamed from: b */
        final /* synthetic */ View f115560b;

        /* renamed from: c */
        final /* synthetic */ float f115561c;

        /* renamed from: d */
        final /* synthetic */ C50053an f115562d;

        /* renamed from: e */
        final /* synthetic */ HashMap f115563e;

        /* renamed from: f */
        final /* synthetic */ boolean f115564f;

        static {
            Covode.recordClassIndex(59181);
        }

        View$OnClickListenerC50055b(Object obj, View view, float f, C50053an anVar, HashMap hashMap, boolean z) {
            this.f115559a = obj;
            this.f115560b = view;
            this.f115561c = f;
            this.f115562d = anVar;
            this.f115563e = hashMap;
            this.f115564f = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115562d.mo85190c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.an$c */
    public static final class View$OnClickListenerC50056c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50053an f115565a;

        static {
            Covode.recordClassIndex(59182);
        }

        View$OnClickListenerC50056c(C50053an anVar) {
            this.f115565a = anVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DataCenter dataCenter = this.f115565a.f115546g;
            if (dataCenter != null) {
                dataCenter.mo60191a("title_view_click", this.f115565a.f115547h);
            }
        }
    }

    /* renamed from: b */
    private final void m93982b(String str) {
        TextView textView = this.f115540a;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, 0);
        }
        TextView textView2 = this.f115554p;
        if (textView2 != null) {
            textView2.setText(str);
        }
        C34729o.m70955a(this.f115554p, 0);
    }

    /* renamed from: d */
    private final String m93984d(String str) {
        String str2;
        try {
            Context context = this.f115552m;
            Object[] objArr = new Object[1];
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            objArr[0] = str2;
            String string = context.getString(R.string.bv1, objArr);
            C89219l.m154716b(string, "");
            return string;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
            return str;
        }
    }

    /* renamed from: c */
    private final String m93983c(String str) {
        StringBuilder sb = new StringBuilder("· ");
        String string = this.f115552m.getString(R.string.aac);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{str}, 1));
        C89219l.m154716b(a, "");
        return sb.append(a).toString();
    }

    /* renamed from: a */
    public final void mo85182a(C33942b bVar) {
        String str;
        TextView textView;
        if (bVar != null && (str = bVar.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -969411447) {
                if (hashCode == 1104022845 && str.equals("bind_title_touch_listener") && (textView = this.f115540a) != null) {
                    textView.setOnTouchListener((View.OnTouchListener) bVar.mo60212a());
                }
            } else if (str.equals("social_video_tag_info")) {
                Aweme aweme = (Aweme) bVar.mo60212a();
                if (aweme != null) {
                    Aweme aweme2 = this.f115545f;
                    if (aweme2 != null && C89219l.m154714a((Object) aweme.getAid(), (Object) aweme2.getAid())) {
                        aweme2.setInteractionTagInfo(aweme.getInteractionTagInfo());
                        C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50060g(aweme2, this, aweme)));
                        return;
                    }
                    return;
                }
                View view = this.f115542c;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r3 == null) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85183a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50053an.mo85183a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: b */
    public final String mo85189b(Aweme aweme) {
        String a;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        List<InteractionTagUserInfo> list = null;
        if (!(interactionTagInfo == null || (list = interactionTagInfo.getTaggedUsers()) == null)) {
            Iterator<T> it = this.f115555q.iterator();
            while (it.hasNext()) {
                if (!list.contains(it.next())) {
                    new InteractionTagLabelEvent(aweme).post();
                }
            }
            this.f115555q = list;
        }
        if (list == null || !(!list.isEmpty())) {
            return "";
        }
        if (list.size() != 1) {
            String string = this.f115552m.getResources().getString(R.string.g9y);
            C89219l.m154716b(string, "");
            a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(list.size())}, 2));
            C89219l.m154716b(a, "");
        } else if (C58071d.m104909c()) {
            a = list.get(0).getNickname();
        } else {
            a = list.get(0).getUniqueId();
        }
        if (a == null) {
            return "";
        }
        return a;
    }

    /* renamed from: a */
    public void mo85186a(HashMap<String, Object> hashMap) {
        TextView textView;
        C89219l.m154721d(hashMap, "");
        Object obj = hashMap.get("title_text_state");
        if (!(obj == null || (textView = this.f115540a) == null)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            textView.setText((String) obj);
        }
        User user = (User) hashMap.get("author_state");
        if (user != null) {
            TextUtils.equals(this.f115547h, "homepage_hot");
            C80581io.m139704a(this.f115552m, user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f115540a);
        }
        Object obj2 = hashMap.get("no_visible_state");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj2).booleanValue()) {
            TextView textView2 = this.f115540a;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else {
            TextView textView3 = this.f115540a;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        mo85187a(hashMap, true);
        if (C46974gi.m90257a() == 2) {
            int i = Build.VERSION.SDK_INT;
            TextView textView4 = this.f115554p;
            if (textView4 != null) {
                textView4.setTextDirection(2);
            }
            Object obj3 = hashMap.get("post_time_state");
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj3).booleanValue()) {
                Object obj4 = hashMap.get("play_count_state");
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                m93982b(m93983c((String) obj4));
                return;
            }
            m93985d();
            return;
        }
        Object obj5 = hashMap.get("play_time_style_state");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj5).booleanValue()) {
            Object obj6 = hashMap.get("post_time_state");
            Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj6).booleanValue()) {
                Object obj7 = hashMap.get("play_count_state");
                Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
                m93982b((String) obj7);
                return;
            }
            m93985d();
            return;
        }
        C34729o.m70955a(this.f115554p, 8);
    }

    /* renamed from: a */
    public final void mo85181a(DataCenter dataCenter, GenericWidget genericWidget) {
        C89219l.m154721d(genericWidget, "");
        this.f115546g = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("bind_title_touch_listener", (AbstractC1214u<C33942b>) genericWidget);
            dataCenter.mo60189a("social_video_tag_info", (AbstractC1214u<C33942b>) genericWidget);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ed, code lost:
        if (r0 == null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r0.isDelete() != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85184a(com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams r13, java.util.HashMap<java.lang.String, java.lang.Object> r14) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50053an.mo85184a(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.util.HashMap):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85187a(java.util.HashMap<java.lang.String, java.lang.Object> r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50053an.mo85187a(java.util.HashMap, boolean):void");
    }

    public C50053an(View view, View.OnTouchListener onTouchListener, Context context, HashMap<String, String> hashMap) {
        TextView textView;
        TextView textView2;
        View view2;
        TuxTextView tuxTextView;
        MutualRelationView mutualRelationView;
        View findViewById;
        C89219l.m154721d(context, "");
        this.f115552m = context;
        this.f115553n = hashMap;
        View view3 = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.f1e);
        } else {
            textView = null;
        }
        this.f115554p = textView;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.title);
        } else {
            textView2 = null;
        }
        this.f115540a = textView2;
        if (textView2 != null) {
            textView2.setOnTouchListener(onTouchListener);
        }
        if (view != null) {
            view2 = view.findViewById(R.id.dnh);
        } else {
            view2 = null;
        }
        this.f115541b = view2;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.e3y);
        } else {
            tuxTextView = null;
        }
        this.f115543d = tuxTextView;
        if (view == null || (mutualRelationView = (MutualRelationView) view.findViewById(R.id.e3x)) == null) {
            mutualRelationView = null;
        } else {
            mutualRelationView.setSocialVideoTag(true);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            mutualRelationView.mo125021a(a, C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        }
        this.f115544e = mutualRelationView;
        if (!(view == null || (findViewById = view.findViewById(R.id.e3z)) == null)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C13628n.m24520b(context, 2.0f));
            Integer a2 = C23155d.m43641a(context, R.attr.a9);
            if (a2 != null) {
                gradientDrawable.setColor(a2.intValue());
            }
            findViewById.setBackground(gradientDrawable);
            view3 = findViewById;
        }
        this.f115542c = view3;
    }
}
