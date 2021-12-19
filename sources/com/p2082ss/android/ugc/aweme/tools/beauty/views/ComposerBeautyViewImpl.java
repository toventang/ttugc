package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2740a.C41095a;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4084a.C77818a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77893a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.AbstractC77967m;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77909e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77918f;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.EnumC77907c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78049b;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.tools.view.style.StyleRecyclerView;
import com.p2082ss.android.ugc.tools.view.style.StyleTabLayout;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.style.StyleView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl */
public final class ComposerBeautyViewImpl extends FrameLayout implements AbstractC33974au, AbstractC78056f {

    /* renamed from: A */
    public C77861e f175200A;

    /* renamed from: B */
    private AbstractC78056f.AbstractC78057a f175201B;

    /* renamed from: C */
    private final View f175202C;

    /* renamed from: D */
    private final View f175203D;

    /* renamed from: E */
    private final StyleTextView f175204E;

    /* renamed from: F */
    private final BeautySeekBar f175205F;

    /* renamed from: G */
    private final BeautySeekBar f175206G;

    /* renamed from: H */
    private final LinearLayout f175207H;

    /* renamed from: I */
    private final ViewGroup f175208I;

    /* renamed from: J */
    private final ImageView f175209J;

    /* renamed from: K */
    private final TextView f175210K;

    /* renamed from: L */
    private final TextView f175211L;

    /* renamed from: M */
    private C78092c f175212M;

    /* renamed from: N */
    private ViewGroup f175213N;

    /* renamed from: O */
    private AbstractC78056f.AbstractC78057a f175214O;

    /* renamed from: a */
    AbstractC78049b f175215a;

    /* renamed from: b */
    AbstractC78056f.AbstractC78058b f175216b;

    /* renamed from: c */
    final BeautyStyleFrameLayout f175217c;

    /* renamed from: d */
    public final RelativeLayout f175218d;

    /* renamed from: e */
    final StyleTabLayout f175219e;

    /* renamed from: f */
    final StyleView f175220f;

    /* renamed from: g */
    final StyleRecyclerView f175221g;

    /* renamed from: h */
    public final RelativeLayout f175222h;

    /* renamed from: i */
    final FrameLayout f175223i;

    /* renamed from: j */
    public final TextView f175224j;

    /* renamed from: k */
    final StyleRecyclerView f175225k;

    /* renamed from: l */
    final RelativeLayout f175226l;

    /* renamed from: m */
    public final BeautySwitchView f175227m;

    /* renamed from: n */
    public final C77818a f175228n;

    /* renamed from: o */
    public final C77818a f175229o;

    /* renamed from: p */
    public ComposerBeauty f175230p;

    /* renamed from: q */
    public ComposerBeauty f175231q;

    /* renamed from: r */
    public boolean f175232r;

    /* renamed from: s */
    ComposerBeauty f175233s;

    /* renamed from: t */
    public C77909e f175234t;

    /* renamed from: u */
    public C77918f f175235u;

    /* renamed from: v */
    public Map<BeautyCategory, List<ComposerBeauty>> f175236v;

    /* renamed from: w */
    final AbstractC89183m<ComposerBeauty, Integer, C89391z> f175237w;

    /* renamed from: x */
    final AbstractC89183m<ComposerBeauty, Integer, C89391z> f175238x;

    /* renamed from: y */
    public boolean f175239y;

    /* renamed from: z */
    final AbstractC77967m f175240z;

    static {
        Covode.recordClassIndex(91164);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    public final void setProgressbarColor(int i) {
    }

    public final void setProgressbarDrawable(Drawable drawable) {
        C89219l.m154721d(drawable, "");
    }

    public final C77818a getAlbumAdapter() {
        return this.f175229o;
    }

    public final AbstractC78049b getBeautyBuried() {
        return this.f175215a;
    }

    public final AbstractC78056f.AbstractC78058b getBeautyOnInteractListener() {
        return this.f175216b;
    }

    public final AbstractC78056f.AbstractC78057a getBeautyViewListener() {
        return this.f175201B;
    }

    public final C77818a getCategoryAdapter() {
        return this.f175228n;
    }

    public final ViewGroup getContainer() {
        return this.f175213N;
    }

    public final ComposerBeauty getCurSelectAlbumBeauty() {
        return this.f175231q;
    }

    public final ComposerBeauty getCurSelectBeauty() {
        return this.f175230p;
    }

    public final AbstractC78056f.AbstractC78057a getOnBeautyViewListener() {
        return this.f175214O;
    }

    public final C77909e getResetHelper() {
        return this.f175234t;
    }

    public final C77918f getSeekBarHelper() {
        return this.f175235u;
    }

    public final AbstractC77967m getSource() {
        return this.f175240z;
    }

    public final BeautySwitchView getSwEnableBeauty() {
        return this.f175227m;
    }

    public final TextView getTvFirstPbTitle() {
        return this.f175210K;
    }

    public final TextView getTvSecondPbTitle() {
        return this.f175211L;
    }

    public final C77861e getViewConfig() {
        return this.f175200A;
    }

    public final BeautySeekBar getPbProgressBar() {
        BeautySeekBar beautySeekBar = this.f175205F;
        C89219l.m154716b(beautySeekBar, "");
        return beautySeekBar;
    }

    public final ImageView getResetIcon() {
        ImageView imageView = this.f175209J;
        C89219l.m154716b(imageView, "");
        return imageView;
    }

    public final RelativeLayout getRlClearContainer() {
        RelativeLayout relativeLayout = this.f175226l;
        C89219l.m154716b(relativeLayout, "");
        return relativeLayout;
    }

    public final BeautySeekBar getSecondPbProgressBar() {
        BeautySeekBar beautySeekBar = this.f175206G;
        C89219l.m154716b(beautySeekBar, "");
        return beautySeekBar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    /* renamed from: c */
    public final void mo121671c() {
        if (this.f175239y) {
            this.f175239y = false;
            C78092c cVar = this.f175212M;
            if (cVar != null) {
                cVar.mo70112b(new C40903b());
            }
            AbstractC78049b bVar = this.f175215a;
            if (bVar != null) {
                bVar.mo121781b(this.f175233s);
            }
            AbstractC78056f.AbstractC78057a aVar = this.f175214O;
            if (aVar != null) {
                aVar.mo22724b();
            }
            AbstractC78056f.AbstractC78057a aVar2 = this.f175201B;
            if (aVar2 != null) {
                aVar2.mo22724b();
            }
        }
    }

    /* renamed from: a */
    public final void mo121909a() {
        C77918f fVar = this.f175235u;
        BeautySeekBar beautySeekBar = this.f175205F;
        C89219l.m154716b(beautySeekBar, "");
        fVar.mo121570a(beautySeekBar);
        C77918f fVar2 = this.f175235u;
        BeautySeekBar beautySeekBar2 = this.f175206G;
        C89219l.m154716b(beautySeekBar2, "");
        fVar2.mo121570a(beautySeekBar2);
        RelativeLayout relativeLayout = this.f175226l;
        C89219l.m154716b(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (C77886a.f174757n) {
            StyleTextView styleTextView = this.f175204E;
            C89219l.m154716b(styleTextView, "");
            styleTextView.setVisibility(0);
            Context context = getContext();
            C89219l.m154716b(context, "");
            layoutParams.width = (int) C84912r.m145930a(context, 76.0f);
        } else {
            StyleTextView styleTextView2 = this.f175204E;
            C89219l.m154716b(styleTextView2, "");
            styleTextView2.setVisibility(8);
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            layoutParams.width = (int) C84912r.m145930a(context2, 52.0f);
        }
        this.f175204E.setTextSize(2, this.f175200A.f174694f.f174697b);
        this.f175209J.setImageResource(this.f175200A.f174694f.f174698c);
        RelativeLayout relativeLayout2 = this.f175226l;
        C89219l.m154716b(relativeLayout2, "");
        relativeLayout2.setLayoutParams(layoutParams);
        this.f175226l.setOnClickListener(new View$OnClickListenerC78077i(this));
        if (this.f175200A.f174735m) {
            this.f175227m.setEnableTouch(false);
            BeautySwitchView beautySwitchView = this.f175227m;
            C89219l.m154716b(beautySwitchView, "");
            beautySwitchView.setChecked(this.f175240z.mo121633q());
            BeautySwitchView beautySwitchView2 = this.f175227m;
            C89219l.m154716b(beautySwitchView2, "");
            mo121913c(beautySwitchView2.f175182b);
            this.f175227m.setOnCheckedChangeListener(new C78078j(this));
            this.f175208I.setOnClickListener(new View$OnClickListenerC78079k(this));
            this.f175219e.requestLayout();
            ViewGroup viewGroup = this.f175208I;
            C89219l.m154716b(viewGroup, "");
            viewGroup.setVisibility(0);
        } else {
            BeautySwitchView beautySwitchView3 = this.f175227m;
            C89219l.m154716b(beautySwitchView3, "");
            beautySwitchView3.setChecked(true);
            ViewGroup viewGroup2 = this.f175208I;
            C89219l.m154716b(viewGroup2, "");
            viewGroup2.setVisibility(8);
        }
        this.f175234t.mo121558a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r1 == null) goto L_0x009e;
     */
    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121670b() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl.mo121670b():void");
    }

    public final void setBeautyBuried(AbstractC78049b bVar) {
        this.f175215a = bVar;
    }

    public final void setBeautyOnInteractListener(AbstractC78056f.AbstractC78058b bVar) {
        this.f175216b = bVar;
    }

    public final void setListener(AbstractC78056f.AbstractC78057a aVar) {
        this.f175214O = aVar;
    }

    public final void setOnBeautyViewListener(AbstractC78056f.AbstractC78057a aVar) {
        this.f175214O = aVar;
    }

    public final void setOnInteractListener(AbstractC78056f.AbstractC78058b bVar) {
        this.f175216b = bVar;
    }

    public final void setShow(boolean z) {
        this.f175239y = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$j */
    public static final class C78078j implements BeautySwitchView.AbstractC78068a {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175257a;

        static {
            Covode.recordClassIndex(91174);
        }

        C78078j(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175257a = composerBeautyViewImpl;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.AbstractC78068a
        /* renamed from: a */
        public final void mo121725a(boolean z) {
            this.f175257a.mo121913c(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$n */
    static final class C78082n extends AbstractC89220m implements AbstractC89172b<ComposerBeauty, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175265a;

        static {
            Covode.recordClassIndex(91178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78082n(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(1);
            this.f175265a = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty) {
            mo121953a(composerBeauty);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo121953a(ComposerBeauty composerBeauty) {
            int[] a;
            int[] a2;
            C89219l.m154721d(composerBeauty, "");
            if (composerBeauty.getExtra().isNone()) {
                AbstractC78056f.AbstractC78057a beautyViewListener = this.f175265a.getBeautyViewListener();
                if (beautyViewListener != null && (a2 = beautyViewListener.mo121552a(composerBeauty.getEffect().getUnzipPath(), "")) != null && a2.length == 2 && a2[0] == 0 && a2[1] == EnumC77907c.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (T t : items) {
                    AbstractC78056f.AbstractC78057a beautyViewListener2 = this.f175265a.getBeautyViewListener();
                    if (beautyViewListener2 != null && (a = beautyViewListener2.mo121552a(composerBeauty.getEffect().getUnzipPath(), t.getTag())) != null && a.length == 2 && a[0] == 0 && a[1] == EnumC77907c.EXCLUDE.getFlag()) {
                        composerBeauty.setEnable(false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo121910a(ComposerBeauty composerBeauty) {
        this.f175240z.mo121628m(composerBeauty);
    }

    public final void setCurSelectAlbumBeauty(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f175231q = composerBeauty;
    }

    public final void setCurSelectBeauty(ComposerBeauty composerBeauty) {
        C89219l.m154721d(composerBeauty, "");
        this.f175230p = composerBeauty;
    }

    public final void setViewConfig(C77861e eVar) {
        C89219l.m154721d(eVar, "");
        this.f175200A = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$f */
    static final class View$OnClickListenerC78074f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175252a;

        static {
            Covode.recordClassIndex(91170);
        }

        View$OnClickListenerC78074f(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175252a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f175252a.mo121671c();
        }
    }

    /* renamed from: b */
    public final void mo121912b(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.f175207H;
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.f175207H;
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo121913c(boolean z) {
        AbstractC78056f.AbstractC78057a aVar = this.f175201B;
        if (aVar != null) {
            aVar.mo121551a(z);
        }
        if (!z) {
            this.f175234t.mo121560a(true);
        } else {
            this.f175234t.mo121560a(false);
        }
        this.f175240z.mo121597a(z);
    }

    public final void setBeautyShowDot(ComposerBeauty composerBeauty) {
        if (this.f175200A.f174735m) {
            BeautySwitchView beautySwitchView = this.f175227m;
            C89219l.m154716b(beautySwitchView, "");
            if (!beautySwitchView.f175182b) {
                return;
            }
        }
        this.f175240z.mo121606c(composerBeauty);
    }

    public final void setBeautyViewListener(AbstractC78056f.AbstractC78057a aVar) {
        this.f175201B = aVar;
        if (aVar != null) {
            BeautySwitchView beautySwitchView = this.f175227m;
            C89219l.m154716b(beautySwitchView, "");
            aVar.mo121551a(beautySwitchView.f175182b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f
    public final void setContainer(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f175213N = viewGroup;
        this.f175212M = new C78092c(this.f175213N, this, this.f175202C);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$g */
    public static final class C78075g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175253a;

        /* renamed from: b */
        final /* synthetic */ boolean f175254b;

        static {
            Covode.recordClassIndex(91171);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f175254b) {
                RelativeLayout relativeLayout = this.f175253a.f175222h;
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f175253a.f175218d;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        }

        C78075g(ComposerBeautyViewImpl composerBeautyViewImpl, boolean z) {
            this.f175253a = composerBeautyViewImpl;
            this.f175254b = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$k */
    public static final class View$OnClickListenerC78079k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175258a;

        static {
            Covode.recordClassIndex(91175);
        }

        View$OnClickListenerC78079k(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175258a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BeautySwitchView swEnableBeauty = this.f175258a.getSwEnableBeauty();
            C89219l.m154716b(swEnableBeauty, "");
            BeautySwitchView swEnableBeauty2 = this.f175258a.getSwEnableBeauty();
            C89219l.m154716b(swEnableBeauty2, "");
            swEnableBeauty.setChecked(!swEnableBeauty2.f175182b);
            AbstractC78049b beautyBuried = this.f175258a.getBeautyBuried();
            if (beautyBuried != null) {
                BeautySwitchView swEnableBeauty3 = this.f175258a.getSwEnableBeauty();
                C89219l.m154716b(swEnableBeauty3, "");
                beautyBuried.mo121779a(swEnableBeauty3.f175182b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$h */
    static final class View$OnClickListenerC78076h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175255a;

        static {
            Covode.recordClassIndex(91172);
        }

        View$OnClickListenerC78076h(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175255a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ComposerBeauty composerBeauty = this.f175255a.f175231q;
            if (composerBeauty != null) {
                this.f175255a.setBeautyShowDot(composerBeauty);
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f175255a;
            RelativeLayout relativeLayout = composerBeautyViewImpl.f175218d;
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(0);
            composerBeautyViewImpl.f175228n.notifyDataSetChanged();
            composerBeautyViewImpl.mo121911a(true);
            composerBeautyViewImpl.f175232r = false;
            ComposerBeautyViewImpl.m136481a(composerBeautyViewImpl, composerBeautyViewImpl.f175230p, false, false, false, null, 22);
            AbstractC78049b bVar = composerBeautyViewImpl.f175215a;
            if (bVar != null) {
                bVar.mo121781b(composerBeautyViewImpl.f175233s);
            }
            composerBeautyViewImpl.f175233s = null;
            this.f175255a.getBeautyOnInteractListener();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$l */
    static final class C78080l implements TabLayout.AbstractC73098b {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175259a;

        /* renamed from: b */
        final /* synthetic */ List f175260b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f175261c;

        static {
            Covode.recordClassIndex(91176);
        }

        C78080l(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f175259a = composerBeautyViewImpl;
            this.f175260b = list;
            this.f175261c = arrayList;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73098b
        /* renamed from: a */
        public final void mo86256a(TabLayout.C73104f fVar) {
            Object obj;
            fVar.mo115586a();
            Iterator it = this.f175260b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ArrayList arrayList = this.f175261c;
                C89219l.m154716b(fVar, "");
                if (C89219l.m154714a(arrayList.get(fVar.f164124e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                AbstractC78049b beautyBuried = this.f175259a.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.mo121777a(beautyCategory);
                }
                AbstractC78056f.AbstractC78058b beautyOnInteractListener = this.f175259a.getBeautyOnInteractListener();
                if (beautyOnInteractListener != null) {
                    beautyOnInteractListener.mo22668a(beautyCategory);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$m */
    public static final class C78081m implements TabLayout.AbstractC73099c {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175262a;

        /* renamed from: b */
        final /* synthetic */ List f175263b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f175264c;

        static {
            Covode.recordClassIndex(91177);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: b */
        public final void mo86254b(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: c */
        public final void mo86255c(TabLayout.C73104f fVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.AbstractC73099c
        /* renamed from: a */
        public final void mo86253a(TabLayout.C73104f fVar) {
            T t;
            Object obj;
            if (fVar != null) {
                Iterator it = this.f175263b.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C89219l.m154714a(this.f175264c.get(fVar.f164124e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    this.f175262a.getSource().mo121591a(beautyCategory.getCategoryResponse().getId());
                    C77818a.m135936a(this.f175262a.f175228n, beautyCategory.getBeautyList());
                    Iterator<T> it2 = this.f175262a.f175228n.f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (next.getSelected()) {
                            t = next;
                            break;
                        }
                    }
                    ComposerBeautyViewImpl.m136481a(this.f175262a, t, false, false, false, null, 30);
                }
            }
        }

        C78081m(ComposerBeautyViewImpl composerBeautyViewImpl, List list, ArrayList arrayList) {
            this.f175262a = composerBeautyViewImpl;
            this.f175263b = list;
            this.f175264c = arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$c */
    static final class C78071c<T> implements AbstractC1214u<C0484a<String, Integer>> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175249a;

        static {
            Covode.recordClassIndex(91167);
        }

        C78071c(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175249a = composerBeautyViewImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C0484a<String, Integer> aVar) {
            T t;
            T t2;
            C0484a<String, Integer> aVar2 = aVar;
            if (aVar2 != null) {
                for (Map.Entry<String, Integer> entry : aVar2.entrySet()) {
                    Iterator<T> it = this.f175249a.f175228n.f174570a.iterator();
                    while (true) {
                        t = null;
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (C89219l.m154714a((Object) entry.getKey(), (Object) t2.getEffect().getEffectId())) {
                            break;
                        }
                    }
                    T t3 = t2;
                    if (t3 != null) {
                        Integer value = entry.getValue();
                        C89219l.m154716b(value, "");
                        t3.setDownloadState(value.intValue());
                        this.f175249a.f175228n.notifyDataSetChanged();
                    }
                    Iterator<T> it2 = this.f175249a.f175229o.f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (C89219l.m154714a((Object) entry.getKey(), (Object) next.getEffect().getEffectId())) {
                            t = next;
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        Integer value2 = entry.getValue();
                        C89219l.m154716b(value2, "");
                        t4.setDownloadState(value2.intValue());
                        this.f175249a.f175229o.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setTabItemAlign(int i) {
        if (i == 1) {
            StyleTabLayout styleTabLayout = this.f175219e;
            C89219l.m154716b(styleTabLayout, "");
            styleTabLayout.setTabMode(1);
            StyleTabLayout styleTabLayout2 = this.f175219e;
            C89219l.m154716b(styleTabLayout2, "");
            ViewGroup.LayoutParams layoutParams = styleTabLayout2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            Context context = getContext();
            C89219l.m154716b(context, "");
            layoutParams2.leftMargin = (int) C84912r.m145930a(context, 76.0f);
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            layoutParams2.setMarginStart((int) C84912r.m145930a(context2, 76.0f));
            StyleTabLayout styleTabLayout3 = this.f175219e;
            C89219l.m154716b(styleTabLayout3, "");
            styleTabLayout3.setLayoutParams(layoutParams2);
            return;
        }
        StyleTabLayout styleTabLayout4 = this.f175219e;
        C89219l.m154716b(styleTabLayout4, "");
        int i3 = 0;
        styleTabLayout4.setTabMode(0);
        StyleTabLayout styleTabLayout5 = this.f175219e;
        C89219l.m154716b(styleTabLayout5, "");
        ViewGroup.LayoutParams layoutParams3 = styleTabLayout5.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (this.f175200A.f174735m) {
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            i3 = (int) C84912r.m145930a(context3, 56.0f);
        }
        layoutParams4.leftMargin = i3;
        int i4 = Build.VERSION.SDK_INT;
        layoutParams4.setMarginStart(i3);
        StyleTabLayout styleTabLayout6 = this.f175219e;
        C89219l.m154716b(styleTabLayout6, "");
        styleTabLayout6.setLayoutParams(layoutParams4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$i */
    public static final class View$OnClickListenerC78077i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175256a;

        static {
            Covode.recordClassIndex(91173);
        }

        View$OnClickListenerC78077i(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175256a = composerBeautyViewImpl;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f175256a.getSource().mo121637u().getUseResetAll()) {
                this.f175256a.getBeautyOnInteractListener();
                C77909e eVar = this.f175256a.f175234t;
                Context context = this.f175256a.getContext();
                C89219l.m154716b(context, "");
                C89219l.m154721d(context, "");
                AbstractC77893a aVar = eVar.f174789b.getViewConfig().f174733k;
                if (aVar != null) {
                    AbstractC77893a.C77894a a = new AbstractC77893a.C77894a().mo121541a(context);
                    String string = context.getString(R.string.a3o);
                    C89219l.m154716b(string, "");
                    AbstractC77893a.C77894a a2 = a.mo121542a(string);
                    String string2 = context.getString(R.string.a3l);
                    C89219l.m154716b(string2, "");
                    AbstractC77893a.C77894a b = a2.mo121543b(string2);
                    String string3 = context.getString(R.string.a3m);
                    C89219l.m154716b(string3, "");
                    AbstractC77893a.C77894a c = b.mo121544c(string3);
                    String string4 = context.getString(R.string.a3n);
                    C89219l.m154716b(string4, "");
                    AbstractC77893a.C77894a d = c.mo121545d(string4);
                    d.f174770f = new C77909e.C77915f(eVar);
                    aVar.mo22726a(d);
                } else {
                    AbstractC77893a.C77894a a3 = new AbstractC77893a.C77894a().mo121541a(context);
                    String string5 = context.getString(R.string.a3o);
                    C89219l.m154716b(string5, "");
                    AbstractC77893a.C77894a a4 = a3.mo121542a(string5);
                    String string6 = context.getString(R.string.a3l);
                    C89219l.m154716b(string6, "");
                    AbstractC77893a.C77894a b2 = a4.mo121543b(string6);
                    String string7 = context.getString(R.string.a3m);
                    C89219l.m154716b(string7, "");
                    AbstractC77893a.C77894a c2 = b2.mo121544c(string7);
                    String string8 = context.getString(R.string.a3n);
                    C89219l.m154716b(string8, "");
                    AbstractC77893a.C77894a d2 = c2.mo121545d(string8);
                    d2.f174770f = new C77909e.C77916g(eVar);
                    C78085a.m136499a(d2);
                }
                AbstractC78049b beautyBuried = eVar.f174789b.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.mo121775a();
                    return;
                }
                return;
            }
            C77909e eVar2 = this.f175256a.f175234t;
            if (eVar2.f174789b.getCurSelectAlbumBeauty() != null || eVar2.f174789b.getCurSelectAlbumBeauty() != null) {
                C77909e.C77914e eVar3 = new C77909e.C77914e(eVar2);
                boolean z = eVar2.f174789b.f175232r;
                T t = null;
                if (z) {
                    Iterator<T> it = eVar2.f174789b.getAlbumAdapter().f174570a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next, (Object) eVar2.f174789b.getCurSelectAlbumBeauty())) {
                            t = next;
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        eVar3.mo121566a(t2);
                        AbstractC78049b beautyBuried2 = eVar2.f174789b.getBeautyBuried();
                        if (beautyBuried2 != null) {
                            beautyBuried2.mo121783c(t2);
                        }
                        eVar2.f174788a.mo121606c(t2);
                    }
                } else if (!z) {
                    Iterator<T> it2 = eVar2.f174789b.getCategoryAdapter().f174570a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (C89219l.m154714a((Object) next2, (Object) eVar2.f174789b.getCurSelectBeauty())) {
                            t = next2;
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        eVar3.mo121566a(t3);
                        AbstractC78049b beautyBuried3 = eVar2.f174789b.getBeautyBuried();
                        if (beautyBuried3 != null) {
                            beautyBuried3.mo121783c(t3);
                        }
                        eVar2.f174788a.mo121606c(t3);
                        int indexOf = eVar2.f174789b.getCategoryAdapter().f174570a.indexOf(t3);
                        if (indexOf >= 0 && indexOf < eVar2.f174789b.getCategoryAdapter().f174570a.size()) {
                            eVar2.f174789b.getCategoryAdapter().mo121443a(t3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$b */
    static final class C78070b<T> implements AbstractC1214u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175248a;

        static {
            Covode.recordClassIndex(91166);
        }

        C78070b(ComposerBeautyViewImpl composerBeautyViewImpl) {
            this.f175248a = composerBeautyViewImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Boolean bool) {
            T t;
            TabLayout.C73104f a;
            for (T t2 : this.f175248a.getSource().mo121584a()) {
                this.f175248a.f175236v.put(t2, t2.getBeautyList());
            }
            ComposerBeautyViewImpl composerBeautyViewImpl = this.f175248a;
            BeautyStyleFrameLayout beautyStyleFrameLayout = composerBeautyViewImpl.f175217c;
            Context context = composerBeautyViewImpl.getContext();
            C89219l.m154716b(context, "");
            beautyStyleFrameLayout.mo121888a(C84912r.m145930a(context, composerBeautyViewImpl.f175200A.f174689a));
            ComposerBeautyViewImpl composerBeautyViewImpl2 = this.f175248a;
            List<BeautyCategory> a2 = composerBeautyViewImpl2.getSource().mo121584a();
            composerBeautyViewImpl2.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.mo4356b(0);
            StyleRecyclerView styleRecyclerView = composerBeautyViewImpl2.f175221g;
            C89219l.m154716b(styleRecyclerView, "");
            styleRecyclerView.setLayoutManager(linearLayoutManager);
            StyleRecyclerView styleRecyclerView2 = composerBeautyViewImpl2.f175221g;
            C89219l.m154716b(styleRecyclerView2, "");
            styleRecyclerView2.setAdapter(composerBeautyViewImpl2.f175228n);
            StyleRecyclerView styleRecyclerView3 = composerBeautyViewImpl2.f175221g;
            C89219l.m154716b(styleRecyclerView3, "");
            RecyclerView.AbstractC1356f itemAnimator = styleRecyclerView3.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f4470l = 0;
            }
            composerBeautyViewImpl2.getContext();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.mo4356b(0);
            StyleRecyclerView styleRecyclerView4 = composerBeautyViewImpl2.f175225k;
            C89219l.m154716b(styleRecyclerView4, "");
            styleRecyclerView4.setLayoutManager(linearLayoutManager2);
            StyleRecyclerView styleRecyclerView5 = composerBeautyViewImpl2.f175225k;
            C89219l.m154716b(styleRecyclerView5, "");
            styleRecyclerView5.setAdapter(composerBeautyViewImpl2.f175229o);
            StyleRecyclerView styleRecyclerView6 = composerBeautyViewImpl2.f175221g;
            C89219l.m154716b(styleRecyclerView6, "");
            RecyclerView.AbstractC1356f itemAnimator2 = styleRecyclerView6.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.f4470l = 0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : a2) {
                arrayList2.add(t3.getCategoryResponse().getId());
                arrayList.add(t3.getCategoryResponse().getName());
            }
            if (arrayList.size() <= 1) {
                composerBeautyViewImpl2.f175219e.setHideIndicatorView(true);
            } else {
                composerBeautyViewImpl2.f175219e.setHideIndicatorView(false);
            }
            if (a2.size() > 4) {
                StyleView styleView = composerBeautyViewImpl2.f175220f;
                C89219l.m154716b(styleView, "");
                styleView.setVisibility(0);
            } else {
                StyleView styleView2 = composerBeautyViewImpl2.f175220f;
                C89219l.m154716b(styleView2, "");
                styleView2.setVisibility(8);
            }
            composerBeautyViewImpl2.setTabItemAlign(a2.size());
            composerBeautyViewImpl2.f175219e.mo115533b();
            for (T t4 : a2) {
                Context context2 = composerBeautyViewImpl2.getContext();
                C89219l.m154716b(context2, "");
                C84984j a3 = C84383b.m145134a(context2);
                if (TextUtils.isEmpty(t4.getCategoryResponse().getIcon_normal_url())) {
                    a3.setText(t4.getCategoryResponse().getName());
                } else {
                    String icon_normal_url = t4.getCategoryResponse().getIcon_normal_url();
                    if (icon_normal_url != null) {
                        a3.setImage(icon_normal_url);
                    }
                }
                TabLayout.C73104f a4 = composerBeautyViewImpl2.f175219e.mo115519a().mo115584a(a3);
                C89219l.m154716b(a4, "");
                TabLayout.C73108i iVar = a4.f164127h;
                if (iVar != null) {
                    iVar.setBackgroundColor(C0643b.m2378c(iVar.getContext(), R.color.ur));
                }
                composerBeautyViewImpl2.f175219e.mo115526a(a4, false);
            }
            composerBeautyViewImpl2.f175219e.setOnTabClickListener(new C78080l(composerBeautyViewImpl2, a2, arrayList2));
            composerBeautyViewImpl2.f175219e.mo115524a(new C78081m(composerBeautyViewImpl2, a2, arrayList2));
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getSelected()) {
                    break;
                }
            }
            T t5 = t;
            if (!(t5 == null || (a = composerBeautyViewImpl2.f175219e.mo115520a(a2.indexOf(t5))) == null)) {
                a.mo115586a();
                AbstractC78056f.AbstractC78058b bVar = composerBeautyViewImpl2.f175216b;
                if (bVar != null) {
                    bVar.mo22668a((BeautyCategory) t5);
                }
            }
            if (composerBeautyViewImpl2.f175240z.mo121637u().getHasTitle()) {
                StyleTabLayout styleTabLayout = composerBeautyViewImpl2.f175219e;
                C89219l.m154716b(styleTabLayout, "");
                styleTabLayout.setVisibility(0);
            } else {
                StyleTabLayout styleTabLayout2 = composerBeautyViewImpl2.f175219e;
                C89219l.m154716b(styleTabLayout2, "");
                styleTabLayout2.setVisibility(4);
            }
            composerBeautyViewImpl2.f175228n.f174571b = composerBeautyViewImpl2.f175237w;
            composerBeautyViewImpl2.f175229o.f174571b = composerBeautyViewImpl2.f175238x;
            if (composerBeautyViewImpl2.f175232r) {
                ComposerBeautyViewImpl.m136481a(composerBeautyViewImpl2, composerBeautyViewImpl2.f175231q, true, false, false, null, 20);
            } else {
                ComposerBeautyViewImpl.m136481a(composerBeautyViewImpl2, composerBeautyViewImpl2.f175230p, false, false, false, null, 22);
            }
            this.f175248a.mo121909a();
            ComposerBeautyViewImpl composerBeautyViewImpl3 = this.f175248a;
            composerBeautyViewImpl3.f175223i.setOnClickListener(new View$OnClickListenerC78076h(composerBeautyViewImpl3));
            ComposerBeautyViewImpl composerBeautyViewImpl4 = this.f175248a;
            if (composerBeautyViewImpl4.f175200A.f174734l) {
                RelativeLayout relativeLayout = composerBeautyViewImpl4.f175226l;
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                return;
            }
            RelativeLayout relativeLayout2 = composerBeautyViewImpl4.f175226l;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo121911a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float d;
        float f5;
        float f6;
        RelativeLayout relativeLayout = this.f175218d;
        float[] fArr = new float[2];
        float f7 = 0.0f;
        if (z) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            f = -C41095a.m82774d(context);
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            f2 = -C41095a.m82774d(context2);
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "translationX", fArr);
        RelativeLayout relativeLayout2 = this.f175218d;
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", fArr2);
        RelativeLayout relativeLayout3 = this.f175222h;
        float[] fArr3 = new float[2];
        if (z) {
            d = 0.0f;
        } else {
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            d = C41095a.m82774d(context3);
        }
        fArr3[0] = d;
        if (z) {
            Context context4 = getContext();
            C89219l.m154716b(context4, "");
            f5 = C41095a.m82774d(context4);
        } else {
            f5 = 0.0f;
        }
        fArr3[1] = f5;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, "translationX", fArr3);
        RelativeLayout relativeLayout4 = this.f175222h;
        float[] fArr4 = new float[2];
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.0f;
        }
        fArr4[0] = f6;
        if (!z) {
            f7 = 1.0f;
        }
        fArr4[1] = f7;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, "alpha", fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new C78075g(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$d */
    static final class C78072d extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175250a;

        static {
            Covode.recordClassIndex(91168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78072d(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(2);
            this.f175250a = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            this.f175250a.mo121910a(composerBeauty2);
            AbstractC78056f.AbstractC78058b beautyOnInteractListener = this.f175250a.getBeautyOnInteractListener();
            if (beautyOnInteractListener != null) {
                beautyOnInteractListener.mo22665a(composerBeauty2);
            }
            ComposerBeautyViewImpl.m136481a(this.f175250a, composerBeauty2, true, true, false, null, 24);
            this.f175250a.getSource().mo121616g(composerBeauty2);
            this.f175250a.setBeautyShowDot(composerBeauty2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$e */
    static final class C78073e extends AbstractC89220m implements AbstractC89183m<ComposerBeauty, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyViewImpl f175251a;

        static {
            Covode.recordClassIndex(91169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78073e(ComposerBeautyViewImpl composerBeautyViewImpl) {
            super(2);
            this.f175251a = composerBeautyViewImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ComposerBeauty composerBeauty, Integer num) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            num.intValue();
            C89219l.m154721d(composerBeauty2, "");
            this.f175251a.mo121910a(composerBeauty2);
            AbstractC78056f.AbstractC78058b beautyOnInteractListener = this.f175251a.getBeautyOnInteractListener();
            if (beautyOnInteractListener != null) {
                beautyOnInteractListener.mo22665a(composerBeauty2);
            }
            T t = null;
            if (composerBeauty2.isCollectionType()) {
                this.f175251a.f175230p = composerBeauty2;
                AbstractC78049b beautyBuried = this.f175251a.getBeautyBuried();
                if (beautyBuried != null) {
                    beautyBuried.mo121776a(composerBeauty2);
                }
                TextView textView = this.f175251a.f175224j;
                C89219l.m154716b(textView, "");
                textView.setText(composerBeauty2.getEffect().getName());
                ComposerBeautyViewImpl composerBeautyViewImpl = this.f175251a;
                RelativeLayout relativeLayout = composerBeautyViewImpl.f175222h;
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(0);
                composerBeautyViewImpl.mo121911a(false);
                composerBeautyViewImpl.f175232r = true;
                AbstractC78049b bVar = composerBeautyViewImpl.f175215a;
                if (bVar != null) {
                    bVar.mo121781b(composerBeautyViewImpl.f175233s);
                }
                composerBeautyViewImpl.f175233s = null;
                AbstractC78056f.AbstractC78058b beautyOnInteractListener2 = this.f175251a.getBeautyOnInteractListener();
                if (beautyOnInteractListener2 != null) {
                    beautyOnInteractListener2.mo22669b(composerBeauty2);
                }
                String h = this.f175251a.getSource().mo121618h(composerBeauty2);
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    C77818a.m135936a(this.f175251a.f175229o, childList);
                    ComposerBeautyViewImpl composerBeautyViewImpl2 = this.f175251a;
                    C0484a<String, Integer> value = composerBeautyViewImpl2.f175240z.mo121617h().getValue();
                    if (value != null) {
                        for (Map.Entry<String, Integer> entry : value.entrySet()) {
                            Iterator<T> it = composerBeautyViewImpl2.f175229o.f174570a.iterator();
                            while (it.hasNext()) {
                                Integer value2 = entry.getValue();
                                C89219l.m154716b(value2, "");
                                it.next().setDownloadState(value2.intValue());
                                composerBeautyViewImpl2.f175229o.notifyDataSetChanged();
                            }
                        }
                    }
                    Iterator<T> it2 = childList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (C89219l.m154714a((Object) next.getEffect().getResourceId(), (Object) h)) {
                            t = next;
                            break;
                        }
                    }
                    ComposerBeautyViewImpl.m136481a(this.f175251a, t, true, false, false, null, 28);
                }
            } else {
                AbstractC78049b beautyBuried2 = this.f175251a.getBeautyBuried();
                if (beautyBuried2 != null) {
                    beautyBuried2.mo121776a(composerBeauty2);
                }
                ComposerBeautyViewImpl.m136481a(this.f175251a, composerBeauty2, false, true, false, null, 26);
                this.f175251a.getSource().mo121614f(composerBeauty2);
                this.f175251a.setBeautyShowDot(composerBeauty2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl$a */
    public static final class C78069a {

        /* renamed from: a */
        public AbstractC78056f.AbstractC78058b f175241a;

        /* renamed from: b */
        public AbstractC78056f.AbstractC78057a f175242b;

        /* renamed from: c */
        public AbstractC78049b f175243c;

        /* renamed from: d */
        public C77861e f175244d = new C77861e();

        /* renamed from: e */
        public final Context f175245e;

        /* renamed from: f */
        public final ViewGroup f175246f;

        /* renamed from: g */
        public final AbstractC77967m f175247g;

        static {
            Covode.recordClassIndex(91165);
        }

        public C78069a(Context context, ViewGroup viewGroup, AbstractC77967m mVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(mVar, "");
            this.f175245e = context;
            this.f175246f = viewGroup;
            this.f175247g = mVar;
        }
    }

    private ComposerBeautyViewImpl(Context context, AbstractC77967m mVar, C77861e eVar) {
        super(context);
        MethodCollector.m26663i(9832);
        this.f175240z = mVar;
        this.f175200A = eVar;
        this.f175216b = eVar.f174736n;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.e1, this, true);
        this.f175202C = a;
        View findViewById = a.findViewById(R.id.fan);
        this.f175203D = findViewById;
        this.f175217c = (BeautyStyleFrameLayout) a.findViewById(R.id.b3w);
        this.f175218d = (RelativeLayout) a.findViewById(R.id.dkz);
        this.f175219e = (StyleTabLayout) a.findViewById(R.id.ejw);
        this.f175220f = (StyleView) a.findViewById(R.id.fam);
        StyleRecyclerView styleRecyclerView = (StyleRecyclerView) a.findViewById(R.id.do3);
        this.f175221g = styleRecyclerView;
        RelativeLayout relativeLayout = (RelativeLayout) a.findViewById(R.id.dkx);
        this.f175222h = relativeLayout;
        this.f175223i = (FrameLayout) a.findViewById(R.id.b3u);
        this.f175224j = (TextView) a.findViewById(R.id.etv);
        StyleRecyclerView styleRecyclerView2 = (StyleRecyclerView) a.findViewById(R.id.do2);
        this.f175225k = styleRecyclerView2;
        this.f175204E = (StyleTextView) a.findViewById(R.id.etx);
        this.f175205F = (BeautySeekBar) a.findViewById(R.id.czz);
        this.f175206G = (BeautySeekBar) a.findViewById(R.id.d00);
        this.f175207H = (LinearLayout) a.findViewById(R.id.dl2);
        this.f175226l = (RelativeLayout) a.findViewById(R.id.dl0);
        this.f175208I = (ViewGroup) a.findViewById(R.id.b3v);
        this.f175227m = (BeautySwitchView) a.findViewById(R.id.b28);
        this.f175209J = (ImageView) a.findViewById(R.id.bub);
        View findViewById2 = a.findViewById(R.id.f3g);
        C89219l.m154716b(findViewById2, "");
        this.f175210K = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.f3h);
        C89219l.m154716b(findViewById3, "");
        this.f175211L = (TextView) findViewById3;
        C77859d dVar = this.f175200A.f174691c;
        C89219l.m154716b(styleRecyclerView, "");
        this.f175228n = new C77818a(dVar, styleRecyclerView);
        C77859d dVar2 = this.f175200A.f174691c;
        C89219l.m154716b(styleRecyclerView2, "");
        this.f175229o = new C77818a(dVar2, styleRecyclerView2);
        this.f175213N = new FrameLayout(context);
        this.f175234t = new C77909e(mVar, this);
        this.f175235u = new C77918f(mVar, this);
        this.f175236v = new LinkedHashMap();
        this.f175237w = new C78073e(this);
        this.f175238x = new C78072d(this);
        if (context instanceof ActivityC0218d) {
            ActivityC0218d dVar3 = (ActivityC0218d) context;
            dVar3.getLifecycle().mo4012a(this);
            mVar.mo121600b().mo70310a(dVar3, new C78070b(this));
            mVar.mo121617h().observe(dVar3, new C78071c(this));
        }
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setAlpha(0.0f);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setTranslationX(C41095a.m82774d(context));
        if (this.f175200A.f174731i) {
            findViewById.setOnClickListener(new View$OnClickListenerC78074f(this));
            MethodCollector.m26664o(9832);
            return;
        }
        C89219l.m154716b(findViewById, "");
        findViewById.setClickable(false);
        MethodCollector.m26664o(9832);
    }

    public /* synthetic */ ComposerBeautyViewImpl(Context context, AbstractC77967m mVar, C77861e eVar, byte b) {
        this(context, mVar, eVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m136481a(ComposerBeautyViewImpl composerBeautyViewImpl, ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2, int i) {
        boolean z4;
        boolean z5;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            composerBeauty2 = composerBeauty;
        }
        if (z3) {
            AbstractC78049b bVar = composerBeautyViewImpl.f175215a;
            if (bVar != null) {
                bVar.mo121781b(composerBeautyViewImpl.f175233s);
            }
            composerBeautyViewImpl.f175233s = composerBeauty2;
        }
        if (composerBeauty == null) {
            composerBeautyViewImpl.mo121912b(false);
            return;
        }
        if (z) {
            for (T t : composerBeautyViewImpl.f175229o.f174570a) {
                if (!C89219l.m154714a((Object) t, (Object) composerBeauty) || !t.getEnable()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                t.setSelected(z5);
            }
        } else {
            for (T t2 : composerBeautyViewImpl.f175228n.f174570a) {
                if (!C89219l.m154714a((Object) t2, (Object) composerBeauty) || !t2.getEnable()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                t2.setSelected(z4);
            }
        }
        if (composerBeauty.isCollectionType()) {
            composerBeautyViewImpl.mo121912b(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            composerBeautyViewImpl.mo121912b(false);
        } else {
            composerBeautyViewImpl.mo121912b(true);
        }
        if (C77878d.m135999b(composerBeauty)) {
            composerBeautyViewImpl.f175231q = composerBeauty;
        } else {
            composerBeautyViewImpl.f175230p = composerBeauty;
        }
        if (composerBeautyViewImpl.f175235u.mo121571a()) {
            BeautySeekBar beautySeekBar = composerBeautyViewImpl.f175206G;
            C89219l.m154716b(beautySeekBar, "");
            beautySeekBar.setVisibility(0);
        } else {
            BeautySeekBar beautySeekBar2 = composerBeautyViewImpl.f175206G;
            C89219l.m154716b(beautySeekBar2, "");
            beautySeekBar2.setVisibility(8);
        }
        composerBeautyViewImpl.f175235u.mo121569a(composerBeauty, z2, true);
        composerBeautyViewImpl.f175234t.mo121558a();
    }
}
