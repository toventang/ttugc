package com.p2082ss.android.ugc.aweme.emoji.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23160g;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView */
public final class StoryEmojiReactionView extends FrameLayout {

    /* renamed from: c */
    public static final C46659a f108784c = new C46659a((byte) 0);

    /* renamed from: a */
    public AbstractC88982v<C89378p<View, String>> f108785a;

    /* renamed from: b */
    public Aweme f108786b;

    /* renamed from: d */
    private final AbstractC88979t<C89378p<View, String>> f108787d;

    /* renamed from: e */
    private final Random f108788e;

    /* renamed from: f */
    private final DecelerateInterpolator f108789f;

    /* renamed from: g */
    private final AbstractC89244h f108790g;

    /* renamed from: h */
    private AbstractC46662d f108791h;

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$d */
    public interface AbstractC46662d {
        static {
            Covode.recordClassIndex(55255);
        }

        /* renamed from: a */
        void mo64674a(C46661c cVar, Aweme aweme);
    }

    static {
        Covode.recordClassIndex(55247);
    }

    public StoryEmojiReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C23160g getVibrationHelper() {
        return (C23160g) this.f108790g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$a */
    public static final class C46659a {
        static {
            Covode.recordClassIndex(55252);
        }

        /* renamed from: a */
        public static String m90064a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? "" : "😂" : "😍" : "👏";
        }

        private C46659a() {
        }

        public /* synthetic */ C46659a(byte b) {
            this();
        }
    }

    public final Aweme getBindAweme() {
        return this.f108786b;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$j */
    static final class C46668j extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ Context f108807a;

        static {
            Covode.recordClassIndex(55261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46668j(Context context) {
            super(0);
            this.f108807a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            return new C23160g(this.f108807a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$i */
    static final class C46667i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C46667i f108806a = new C46667i();

        static {
            Covode.recordClassIndex(55260);
        }

        C46667i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
        }
    }

    public final void setStoryEmojiReactionListener(AbstractC46662d dVar) {
        C89219l.m154721d(dVar, "");
        this.f108791h = dVar;
    }

    /* renamed from: a */
    public final synchronized void mo79274a(Aweme aweme) {
        MethodCollector.m26663i(12656);
        this.f108786b = aweme;
        MethodCollector.m26664o(12656);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$e */
    public static final class C46663e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f108801a;

        static {
            Covode.recordClassIndex(55256);
        }

        C46663e(View view) {
            this.f108801a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
            PointF pointF = (PointF) animatedValue;
            this.f108801a.setX(pointF.x);
            this.f108801a.setY(pointF.y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$f */
    public static final class C46664f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f108802a;

        /* renamed from: b */
        final /* synthetic */ View f108803b;

        static {
            Covode.recordClassIndex(55257);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(12100);
            super.onAnimationEnd(animator);
            this.f108802a.removeView(this.f108803b);
            MethodCollector.m26664o(12100);
        }

        C46664f(ViewGroup viewGroup, View view) {
            this.f108802a = viewGroup;
            this.f108803b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$g */
    static final class C46665g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ List f108804a;

        static {
            Covode.recordClassIndex(55258);
        }

        C46665g(List list) {
            this.f108804a = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((Animator) this.f108804a.get((int) ((Long) obj).longValue())).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$h */
    static final class C46666h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryEmojiReactionView f108805a;

        static {
            Covode.recordClassIndex(55259);
        }

        C46666h(StoryEmojiReactionView storyEmojiReactionView) {
            this.f108805a = storyEmojiReactionView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            MethodCollector.m26663i(12539);
            C89378p pVar = (C89378p) obj;
            if (Build.VERSION.SDK_INT >= 29) {
                C23160g vibrationHelper = this.f108805a.getVibrationHelper();
                if (vibrationHelper != null) {
                    vibrationHelper.mo37653b();
                }
            } else {
                C23160g vibrationHelper2 = this.f108805a.getVibrationHelper();
                if (vibrationHelper2 != null) {
                    vibrationHelper2.mo37652a();
                }
            }
            StoryEmojiReactionView storyEmojiReactionView = this.f108805a;
            View view = (View) pVar.getFirst();
            String str = (String) pVar.getSecond();
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                            Rect rect = new Rect();
                            Rect rect2 = new Rect();
                            view.getGlobalVisibleRect(rect);
                            viewGroup.getGlobalVisibleRect(rect2);
                            int i2 = rect.left;
                            int i3 = rect.top;
                            int i4 = rect.right;
                            int i5 = rect.bottom;
                            int i6 = rect2.left;
                            int i7 = rect2.top;
                            int i8 = rect2.right;
                            int i9 = rect2.bottom;
                            C17234b.m31806a(activity);
                            if (C23163i.m43663a(activity)) {
                                i = (rect2.right - rect.left) - (rect.right - rect.left);
                            } else {
                                i = rect.left;
                            }
                            Point point = new Point(i, rect.top - rect2.top);
                            Point point2 = new Point(rect.left, rect.top - rect2.top);
                            View a = storyEmojiReactionView.mo79272a(point, str);
                            View a2 = storyEmojiReactionView.mo79272a(point, str);
                            View a3 = storyEmojiReactionView.mo79272a(point, str);
                            C89219l.m154716b(viewGroup, "");
                            Animator a4 = storyEmojiReactionView.mo79271a(viewGroup, a, point2, 0.71f);
                            Animator a5 = storyEmojiReactionView.mo79271a(viewGroup, a2, point2, 1.14f);
                            Animator a6 = storyEmojiReactionView.mo79271a(viewGroup, a3, point2, 1.85f);
                            viewGroup.addView(a);
                            viewGroup.addView(a2);
                            viewGroup.addView(a3);
                            ArrayList d = C89070n.m154525d(a4, a5, a6);
                            if (d != null) {
                                AbstractC88979t.m154280a(0, (long) d.size(), 0, 100, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C46665g(d));
                                MethodCollector.m26664o(12539);
                                return;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            MethodCollector.m26664o(12539);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$c */
    public static final class C46661c {

        /* renamed from: a */
        public final int f108799a;

        /* renamed from: b */
        public final String f108800b;

        static {
            Covode.recordClassIndex(55254);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C46661c)) {
                return false;
            }
            C46661c cVar = (C46661c) obj;
            return this.f108799a == cVar.f108799a && C89219l.m154714a(this.f108800b, cVar.f108800b);
        }

        public final int hashCode() {
            int i = this.f108799a * 31;
            String str = this.f108800b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "EmojiReaction(emojiId=" + this.f108799a + ", emojiText=" + this.f108800b + ")";
        }

        public C46661c(int i, String str) {
            C89219l.m154721d(str, "");
            this.f108799a = i;
            this.f108800b = str;
        }
    }

    /* renamed from: a */
    public final void mo79273a(TextView textView, C46661c cVar) {
        AbstractC46662d dVar = this.f108791h;
        if (dVar != null) {
            dVar.mo64674a(cVar, this.f108786b);
        }
        AbstractC88982v<C89378p<View, String>> vVar = this.f108785a;
        if (vVar != null) {
            vVar.mo143031a(new C89378p<>(textView, cVar.f108800b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo79272a(Point point, String str) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(11);
        tuxTextView.setTextColor(-16777216);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setGravity(17);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(a, C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()))));
        tuxTextView.setX((float) point.x);
        tuxTextView.setY((float) point.y);
        return tuxTextView;
    }

    private /* synthetic */ StoryEmojiReactionView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView$b */
    public static final class C46660b implements TypeEvaluator<PointF> {
        static {
            Covode.recordClassIndex(55253);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
            PointF pointF3 = pointF;
            PointF pointF4 = pointF2;
            C89219l.m154721d(pointF3, "");
            C89219l.m154721d(pointF4, "");
            PointF pointF5 = new PointF();
            pointF5.x = ((pointF4.x - pointF3.x) * f) + pointF3.x;
            pointF5.y = ((pointF4.y - pointF3.y) * f) + pointF3.y;
            return pointF5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryEmojiReactionView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12773);
        this.f108788e = new Random();
        this.f108789f = new DecelerateInterpolator();
        this.f108790g = C89250i.m154773a((AbstractC89171a) new C46668j(context));
        AbstractC88979t<C89378p<View, String>> a = AbstractC88979t.m154294a(new AbstractC88983w(this) {
            /* class com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.C466551 */

            /* renamed from: a */
            final /* synthetic */ StoryEmojiReactionView f108792a;

            static {
                Covode.recordClassIndex(55248);
            }

            {
                this.f108792a = r1;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<C89378p<View, String>> vVar) {
                C89219l.m154721d(vVar, "");
                this.f108792a.f108785a = vVar;
            }
        });
        C89219l.m154716b(a, "");
        this.f108787d = a;
        a.mo143301g(300, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C46666h(this), C46667i.f108806a);
        LayoutInflater.from(context).inflate(R.layout.z3, this);
        final TextView textView = (TextView) findViewById(R.id.evp);
        final TextView textView2 = (TextView) findViewById(R.id.eqj);
        final TextView textView3 = (TextView) findViewById(R.id.eqk);
        textView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.View$OnClickListenerC466562 */

            /* renamed from: a */
            final /* synthetic */ StoryEmojiReactionView f108793a;

            static {
                Covode.recordClassIndex(55249);
            }

            {
                this.f108793a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f108793a;
                TextView textView = textView;
                C89219l.m154716b(textView, "");
                storyEmojiReactionView.mo79273a(textView, new C46661c(1, "👏"));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.View$OnClickListenerC466573 */

            /* renamed from: a */
            final /* synthetic */ StoryEmojiReactionView f108795a;

            static {
                Covode.recordClassIndex(55250);
            }

            {
                this.f108795a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f108795a;
                TextView textView = textView2;
                C89219l.m154716b(textView, "");
                storyEmojiReactionView.mo79273a(textView, new C46661c(2, "😍"));
            }
        });
        textView3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.View$OnClickListenerC466584 */

            /* renamed from: a */
            final /* synthetic */ StoryEmojiReactionView f108797a;

            static {
                Covode.recordClassIndex(55251);
            }

            {
                this.f108797a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f108797a;
                TextView textView = textView3;
                C89219l.m154716b(textView, "");
                storyEmojiReactionView.mo79273a(textView, new C46661c(3, "😂"));
            }
        });
        MethodCollector.m26664o(12773);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Animator mo79271a(ViewGroup viewGroup, View view, Point point, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, f);
        PointF pointF = new PointF();
        int i = point.x;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = i - C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system.getDisplayMetrics()));
        int i2 = point.x;
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a2 = i2 + C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics()));
        int i3 = point.y;
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        int a3 = i3 - C89241a.m154730a(TypedValue.applyDimension(1, 180.0f, system3.getDisplayMetrics()));
        int i4 = point.y;
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        int a4 = i4 - C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system4.getDisplayMetrics()));
        pointF.x = (float) (this.f108788e.nextInt((a2 - a) + 1) + a);
        pointF.y = (float) (this.f108788e.nextInt((a4 - a3) + 1) + a3);
        ValueAnimator ofObject = ValueAnimator.ofObject(new C46660b(), new PointF(point), pointF);
        ofObject.addUpdateListener(new C46663e(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofObject);
        animatorSet.setInterpolator(this.f108789f);
        animatorSet.setDuration(1400L);
        animatorSet.setTarget(view);
        animatorSet.addListener(new C46664f(viewGroup, view));
        return animatorSet;
    }
}
