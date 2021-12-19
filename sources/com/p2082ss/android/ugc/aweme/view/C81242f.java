package com.p2082ss.android.ugc.aweme.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.settings.C68740f;
import com.p2082ss.android.ugc.aweme.util.C80141m;
import com.p2082ss.android.ugc.aweme.util.C80153p;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.f */
public final class C81242f extends FrameLayout {

    /* renamed from: a */
    private String f181540a;

    /* renamed from: b */
    private AbstractC88412b f181541b;

    /* renamed from: c */
    private final AbstractC89244h f181542c;

    /* renamed from: d */
    private final AbstractC89244h f181543d;

    /* renamed from: e */
    private final AbstractC89244h f181544e;

    /* renamed from: com.ss.android.ugc.aweme.view.f$e */
    static final class C81247e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C81247e f181550a = new C81247e();

        static {
            Covode.recordClassIndex(94577);
        }

        C81247e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(94572);
    }

    private final C80153p getMarqueeHelper() {
        return (C80153p) this.f181544e.getValue();
    }

    public final TextSwitcher getTsMarqueeText() {
        return (TextSwitcher) this.f181542c.getValue();
    }

    public final TextView getTvText() {
        return (TextView) this.f181543d.getValue();
    }

    public final AbstractC88412b getD() {
        return this.f181541b;
    }

    public final String getEnterFrom() {
        return this.f181540a;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$h */
    static final class C81252h extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C81242f f181558a;

        static {
            Covode.recordClassIndex(94582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81252h(C81242f fVar) {
            super(0);
            this.f181558a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f181558a.getTsMarqueeText().findViewById(R.id.text);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$b */
    static final class C81244b extends AbstractC89220m implements AbstractC89171a<C80153p> {

        /* renamed from: a */
        final /* synthetic */ C81242f f181547a;

        static {
            Covode.recordClassIndex(94574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81244b(C81242f fVar) {
            super(0);
            this.f181547a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80153p invoke() {
            return new C80153p(this.f181547a.getTvText(), this.f181547a.getTsMarqueeText());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$g */
    static final class C81249g extends AbstractC89220m implements AbstractC89171a<TextSwitcher> {

        /* renamed from: a */
        final /* synthetic */ C81242f f181552a;

        /* renamed from: b */
        final /* synthetic */ Context f181553b;

        static {
            Covode.recordClassIndex(94579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81249g(C81242f fVar, Context context) {
            super(0);
            this.f181552a = fVar;
            this.f181553b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextSwitcher invoke() {
            View findViewById = this.f181552a.findViewById(R.id.eo_);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextSwitcher");
            TextSwitcher textSwitcher = (TextSwitcher) findViewById;
            textSwitcher.setFactory(new C81250a(textSwitcher, this));
            return textSwitcher;
        }

        /* renamed from: com.ss.android.ugc.aweme.view.f$g$a */
        static final class C81250a implements ViewSwitcher.ViewFactory {

            /* renamed from: a */
            final /* synthetic */ TextSwitcher f181554a;

            /* renamed from: b */
            final /* synthetic */ C81249g f181555b;

            static {
                Covode.recordClassIndex(94580);
            }

            C81250a(TextSwitcher textSwitcher, C81249g gVar) {
                this.f181554a = textSwitcher;
                this.f181555b = gVar;
            }

            public final View makeView() {
                View a = C1764a.m5927a(LayoutInflater.from(this.f181555b.f181553b), R.layout.z9, this.f181554a, false);
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.TextView");
                final TextView textView = (TextView) a;
                this.f181554a.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.view.C81242f.C81249g.C81250a.RunnableC812511 */

                    static {
                        Covode.recordClassIndex(94581);
                    }

                    public final void run() {
                        int color;
                        int color2;
                        if (C80471gb.m139482a()) {
                            Context context = textView.getContext();
                            C89219l.m154716b(context, "");
                            color = context.getResources().getColor(R.color.ik);
                        } else {
                            Context context2 = textView.getContext();
                            C89219l.m154716b(context2, "");
                            color = context2.getResources().getColor(R.color.il);
                        }
                        if (C80471gb.m139482a()) {
                            Context context3 = textView.getContext();
                            C89219l.m154716b(context3, "");
                            color2 = context3.getResources().getColor(R.color.il);
                        } else {
                            Context context4 = textView.getContext();
                            C89219l.m154716b(context4, "");
                            color2 = context4.getResources().getColor(R.color.ik);
                        }
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f181554a.getMeasuredWidth()) * 1.0f, 0.0f, color, color2, Shader.TileMode.CLAMP);
                        TextPaint paint = textView.getPaint();
                        C89219l.m154716b(paint, "");
                        paint.setShader(linearGradient);
                        textView.invalidate();
                    }
                });
                return textView;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC88412b bVar = this.f181541b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f181541b = C80141m.m138904a().mo143292d(C81245c.f181548a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(new C81246d(this)).mo143254a(C81247e.f181550a, new C81248f(this));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC88412b bVar = this.f181541b;
        if (bVar != null) {
            bVar.dispose();
        }
        Animation animation = getTvText().getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        getTvText().clearAnimation();
        C80153p marqueeHelper = getMarqueeHelper();
        marqueeHelper.f179587f = 0;
        marqueeHelper.f179586e = null;
        TextView textView = marqueeHelper.f179589h;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        marqueeHelper.mo123604a((List<String>) null);
        marqueeHelper.f179590i.setText(null);
        marqueeHelper.mo123602a().removeCallbacks(marqueeHelper.mo123605b());
        marqueeHelper.f179582a = true;
    }

    public final void setD(AbstractC88412b bVar) {
        this.f181541b = bVar;
    }

    public final void setEnterFrom(String str) {
        this.f181540a = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$f */
    static final class C81248f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C81242f f181551a;

        static {
            Covode.recordClassIndex(94578);
        }

        C81248f(C81242f fVar) {
            this.f181551a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f181551a.mo124730a(C89086z.INSTANCE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$d */
    static final class C81246d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C81242f f181549a;

        static {
            Covode.recordClassIndex(94576);
        }

        C81246d(C81242f fVar) {
            this.f181549a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> list = (List) obj;
            C81242f fVar = this.f181549a;
            C89219l.m154716b(list, "");
            fVar.mo124730a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$a */
    static final class View$OnClickListenerC81243a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81242f f181545a;

        /* renamed from: b */
        final /* synthetic */ Context f181546b;

        static {
            Covode.recordClassIndex(94573);
        }

        View$OnClickListenerC81243a(C81242f fVar, Context context) {
            this.f181545a = fVar;
            this.f181546b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f181546b, C68740f.m121173a(this.f181545a.getEnterFrom(), "click_banner")).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f$c */
    static final class C81245c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C81245c f181548a = new C81245c();

        static {
            Covode.recordClassIndex(94575);
        }

        C81245c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            JSONObject optJSONObject;
            String optString;
            JSONObject jSONObject = (JSONObject) obj;
            C89219l.m154721d(jSONObject, "");
            JSONArray optJSONArray = jSONObject.optJSONArray("questions_list");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (!(jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("question_info")) == null || (optString = optJSONObject.optString("question_text")) == null)) {
                        arrayList.add(optString);
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo124730a(List<String> list) {
        setVisibility(0);
        C80153p marqueeHelper = getMarqueeHelper();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.isEmpty()) {
            arrayList.add(getContext().getString(R.string.bo7));
        }
        marqueeHelper.mo123604a(arrayList);
        getMarqueeHelper().f179584c = 4000;
        C80153p.m138909a(getMarqueeHelper());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81242f(Context context) {
        super(context, null, 0);
        float f;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12291);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.z8, this, true);
        View findViewById = a.findViewById(R.id.bhm);
        C89219l.m154716b(findViewById, "");
        if (C80471gb.m139482a()) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        findViewById.setRotationY(f);
        a.setOnClickListener(new View$OnClickListenerC81243a(this, context));
        setVisibility(8);
        this.f181542c = C89250i.m154773a((AbstractC89171a) new C81249g(this, context));
        this.f181543d = C89250i.m154773a((AbstractC89171a) new C81252h(this));
        this.f181544e = C89250i.m154773a((AbstractC89171a) new C81244b(this));
        MethodCollector.m26664o(12291);
    }

    public /* synthetic */ C81242f(Context context, byte b) {
        this(context);
    }
}
