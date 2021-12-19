package com.p2082ss.android.ugc.aweme.search.ecom.live;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34105h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.helper.C41995al;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView */
public final class TopLiveProductView extends LinearLayout {

    /* renamed from: k */
    public static final C67417a f151027k = new C67417a((byte) 0);

    /* renamed from: a */
    public C67425b f151028a;

    /* renamed from: b */
    public List<C67394a> f151029b;

    /* renamed from: c */
    public int f151030c;

    /* renamed from: d */
    public final SmartImageView f151031d;

    /* renamed from: e */
    public final TuxTextView f151032e;

    /* renamed from: f */
    public boolean f151033f;

    /* renamed from: g */
    int f151034g;

    /* renamed from: h */
    public C67424a f151035h;

    /* renamed from: i */
    public C67394a f151036i;

    /* renamed from: j */
    public List<String> f151037j;

    /* renamed from: l */
    private final AbstractC89244h f151038l;

    /* renamed from: m */
    private final AbstractC89244h f151039m;

    static {
        Covode.recordClassIndex(79049);
    }

    public TopLiveProductView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final Handler getMHandler() {
        return (Handler) this.f151038l.getValue();
    }

    public final Runnable getShowRunnable() {
        return (Runnable) this.f151039m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$a */
    public static final class C67417a {
        static {
            Covode.recordClassIndex(79051);
        }

        private C67417a() {
        }

        public /* synthetic */ C67417a(byte b) {
            this();
        }
    }

    public final int getDisplayIndex() {
        return this.f151034g;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$f */
    static final class C67422f extends AbstractC89220m implements AbstractC89171a<RunnableC674231> {

        /* renamed from: a */
        final /* synthetic */ TopLiveProductView f151049a;

        static {
            Covode.recordClassIndex(79056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67422f(TopLiveProductView topLiveProductView) {
            super(0);
            this.f151049a = topLiveProductView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC674231 invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.search.ecom.live.TopLiveProductView.C67422f.RunnableC674231 */

                /* renamed from: a */
                final /* synthetic */ C67422f f151050a;

                static {
                    Covode.recordClassIndex(79057);
                }

                public final void run() {
                    C67394a aVar;
                    String str;
                    String str2;
                    if (this.f151050a.f151049a.f151033f) {
                        TopLiveProductView topLiveProductView = this.f151050a.f151049a;
                        topLiveProductView.setDisplayIndex(topLiveProductView.f151034g + 1);
                        if (topLiveProductView.f151034g >= topLiveProductView.f151030c) {
                            topLiveProductView.f151037j.clear();
                        }
                        topLiveProductView.setDisplayIndex(topLiveProductView.f151034g % topLiveProductView.f151030c);
                        List<C67394a> list = topLiveProductView.f151029b;
                        String str3 = null;
                        if (list != null) {
                            aVar = list.get(topLiveProductView.f151034g);
                        } else {
                            aVar = null;
                        }
                        topLiveProductView.f151036i = aVar;
                        C67394a aVar2 = topLiveProductView.f151036i;
                        if (aVar2 != null) {
                            str3 = aVar2.f150987c;
                        }
                        topLiveProductView.setCoverWithAnim(str3);
                        C67394a aVar3 = topLiveProductView.f151036i;
                        if (aVar3 == null || (str = aVar3.f150990f) == null) {
                            str = "";
                        }
                        topLiveProductView.setPriceWithAnim(str);
                        C67394a aVar4 = topLiveProductView.f151036i;
                        if (!(aVar4 == null || (str2 = aVar4.f150985a) == null || topLiveProductView.f151037j.contains(str2))) {
                            C67424a aVar5 = topLiveProductView.f151035h;
                            if (aVar5 != null) {
                                aVar5.mo106336a(topLiveProductView.f151036i);
                            }
                            topLiveProductView.f151037j.add(str2);
                        }
                        this.f151050a.f151049a.getMHandler().removeCallbacks(this.f151050a.f151049a.getShowRunnable());
                        this.f151050a.f151049a.getMHandler().postDelayed(this, 4000);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f151050a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$c */
    static final class C67419c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C67419c f151043a = new C67419c();

        static {
            Covode.recordClassIndex(79053);
        }

        C67419c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void setProductHandler(C67424a aVar) {
        this.f151035h = aVar;
    }

    public final void setShowing(boolean z) {
        this.f151033f = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$d */
    public static final class C67420d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C20766v f151044a;

        /* renamed from: b */
        final /* synthetic */ Animator f151045b;

        static {
            Covode.recordClassIndex(79054);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C20766v vVar = this.f151044a;
            if (vVar != null) {
                vVar.mo34186c();
            }
            this.f151045b.start();
        }

        C67420d(C20766v vVar, Animator animator) {
            this.f151044a = vVar;
            this.f151045b = animator;
        }
    }

    public final void setDisplayIndex(int i) {
        this.f151034g = i;
        C67425b bVar = this.f151028a;
        if (bVar != null) {
            bVar.f151058b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$e */
    public static final class C67421e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TopLiveProductView f151046a;

        /* renamed from: b */
        final /* synthetic */ String f151047b;

        /* renamed from: c */
        final /* synthetic */ Animator f151048c;

        static {
            Covode.recordClassIndex(79055);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f151046a.f151032e.setText(this.f151047b);
            this.f151048c.start();
        }

        C67421e(TopLiveProductView topLiveProductView, String str, Animator animator) {
            this.f151046a = topLiveProductView;
            this.f151047b = str;
            this.f151048c = animator;
        }
    }

    public final void setCover(String str) {
        C89219l.m154721d(str, "");
        C20766v a = C20761r.m39061a(str);
        a.f49092E = this.f151031d;
        a.mo34186c();
    }

    public final void setPriceWithAnim(String str) {
        C89219l.m154721d(str, "");
        Animator a = m119455a(this.f151032e);
        Animator b = m119456b(this.f151032e);
        a.start();
        a.addListener(new C67421e(this, str, b));
    }

    /* renamed from: a */
    private static Animator m119455a(View view) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, LinearLayout.ALPHA, 1.0f, 0.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    /* renamed from: b */
    private static Animator m119456b(View view) {
        C89219l.m154721d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, LinearLayout.ALPHA, 0.0f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final void setCoverWithAnim(String str) {
        C20766v vVar;
        Animator a = m119455a(this.f151031d);
        Animator b = m119456b(this.f151031d);
        a.start();
        if (str != null) {
            vVar = C20761r.m39061a(str);
            vVar.f49116m = 300;
            vVar.f49092E = this.f151031d;
        } else {
            vVar = null;
        }
        a.addListener(new C67420d(vVar, b));
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.live.TopLiveProductView$b */
    public static final class View$OnClickListenerC67418b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C67424a f151041a;

        /* renamed from: b */
        final /* synthetic */ TopLiveProductView f151042b;

        static {
            Covode.recordClassIndex(79052);
        }

        public View$OnClickListenerC67418b(C67424a aVar, TopLiveProductView topLiveProductView) {
            this.f151041a = aVar;
            this.f151042b = topLiveProductView;
        }

        public final void onClick(View view) {
            Aweme aweme;
            String str;
            String str2;
            ClickAgent.onClick(view);
            C67424a aVar = this.f151041a;
            C67394a aVar2 = this.f151042b.f151036i;
            C67425b bVar = aVar.f151051a;
            if (bVar == null || (aweme = bVar.f151057a) == null) {
                aweme = new Aweme();
            }
            C34105h hVar = aVar.f151052b;
            Uri.Builder builder = null;
            C67568r rVar = hVar != null ? hVar.f80638b : null;
            C34105h hVar2 = aVar.f151052b;
            C42410g gVar = hVar2 != null ? hVar2.f80637a : null;
            C89219l.m154721d(aweme, "");
            boolean z = false;
            if (rVar != null) {
                User author = aweme.getAuthor();
                C67542d dVar = (C67542d) C42317b.m84680b(rVar).mo106487g(rVar.f151319n);
                if (gVar == null || (str2 = gVar.f98786b) == null || str2.length() == 0) {
                    str = "live_card";
                } else if (gVar != null) {
                    str = gVar.f98786b;
                } else {
                    str = null;
                }
                ((C67496as) ((C67496as) ((C67542d) ((C67542d) ((C67542d) ((C67542d) dVar.mo106497x(str)).mo106492s(author != null ? author.getRoomTitle() : null)).mo106490d(Integer.valueOf(aVar.f151056f))).mo106491r("live")).mo106495v(String.valueOf(author != null ? Long.valueOf(author.roomId) : null))).mo106440B("click_live").mo106452c("anchor_info", "search_live_merge_entrance")).mo106439A("ec_entrance").mo96792f();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            C34105h hVar3 = aVar.f151052b;
            Map<String, String> b = C67404c.m119441b(aweme, aVar2, hVar3 != null ? hVar3.f80638b : null);
            C89219l.m154721d(b, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(b);
            linkedHashMap.put("source_page_type", "live");
            linkedHashMap.remove("room_id");
            linkedHashMap.remove("is_self");
            linkedHashMap.remove("product_source");
            linkedHashMap.remove("source_from");
            linkedHashMap.remove("source");
            linkedHashMap.remove("is_ad");
            linkedHashMap.remove("request_id");
            linkedHashMap.remove("page_name");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (!(str3.length() == 0 || str4.length() == 0)) {
                    jSONObject.put(str3, str4);
                }
            }
            if (aVar2 != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                Integer num = aVar2.f150994j;
                if (num != null && (num.intValue() == 5 || num.intValue() == 6 || num.intValue() == 100)) {
                    z = true;
                }
                if (z) {
                    String str5 = aVar2.f150992h;
                    if (str5 != null) {
                        builder = Uri.parse(str5).buildUpon();
                        builder.appendQueryParameter("trackParams", jSONObject.toString());
                    }
                    roomsData.f28316aF = String.valueOf(builder);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    if (jSONObject.has("enter_from_merge")) {
                        jSONObject2.put("enter_from", jSONObject.get("enter_from_merge"));
                    }
                    String jSONObject3 = jSONObject2.toString();
                    C89219l.m154716b(jSONObject3, "");
                    String str6 = aVar2.f150993i;
                    if (str6 != null) {
                        builder = Uri.parse("aweme://echybrid").buildUpon();
                        builder.appendQueryParameter("url", str6);
                        builder.appendQueryParameter("should_track_duration_time", "1");
                        builder.appendQueryParameter("track_duration_event", "track_duration_event");
                        builder.appendQueryParameter("track_duration_custom_params", jSONObject3);
                        builder.appendQueryParameter("container_color_auto_dark", "1");
                        builder.appendQueryParameter("container_height", "0.73");
                        builder.appendQueryParameter("hide_nav_bar", "1");
                        builder.appendQueryParameter("should_full_screen", "1");
                        builder.appendQueryParameter("trackParams", jSONObject.toString());
                    }
                    roomsData.f28316aF = String.valueOf(builder);
                }
                builder.appendQueryParameter("fullScreen", "false");
                roomsData.f28316aF = String.valueOf(builder);
            }
            C42813a.f99846a.mo73069a(aweme, aVar.f151052b, aVar.f151053c, enterRoomConfig, aVar.f151055e, aVar.f151054d);
            C39162r.m79460a("livesdk_tiktokec_product_entrance_click", b);
        }
    }

    private /* synthetic */ TopLiveProductView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopLiveProductView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8268);
        this.f151037j = new ArrayList();
        this.f151038l = C89250i.m154773a((AbstractC89171a) C67419c.f151043a);
        this.f151039m = C89250i.m154773a((AbstractC89171a) new C67422f(this));
        View inflate = View.inflate(context, R.layout.avc, this);
        if (inflate != null) {
            C41995al.m84058a((LinearLayout) inflate);
            View findViewById = findViewById(R.id.d74);
            C89219l.m154716b(findViewById, "");
            this.f151031d = (SmartImageView) findViewById;
            View findViewById2 = findViewById(R.id.d6d);
            C89219l.m154716b(findViewById2, "");
            this.f151032e = (TuxTextView) findViewById2;
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
                /* class com.p2082ss.android.ugc.aweme.search.ecom.live.TopLiveProductView.View$OnAttachStateChangeListenerC674161 */

                /* renamed from: a */
                final /* synthetic */ TopLiveProductView f151040a;

                static {
                    Covode.recordClassIndex(79050);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f151040a = r1;
                }

                public final void onViewDetachedFromWindow(View view) {
                    this.f151040a.getMHandler().removeCallbacks(this.f151040a.getShowRunnable());
                }

                public final void onViewAttachedToWindow(View view) {
                    String str;
                    C67394a aVar = this.f151040a.f151036i;
                    if (aVar != null && (str = aVar.f150985a) != null && !this.f151040a.f151037j.contains(str)) {
                        C67424a aVar2 = this.f151040a.f151035h;
                        if (aVar2 != null) {
                            aVar2.mo106336a(this.f151040a.f151036i);
                        }
                        this.f151040a.f151037j.add(str);
                    }
                }
            });
            MethodCollector.m26664o(8268);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        MethodCollector.m26664o(8268);
        throw nullPointerException;
    }
}
