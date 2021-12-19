package com.p2082ss.android.ugc.aweme.p2685cp.p2687b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.LynxAudio;
import com.bytedance.ies.xelement.LynxBounceView;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.ies.xelement.LynxRefreshFooter;
import com.bytedance.ies.xelement.LynxRefreshHeader;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.ies.xelement.LynxSeekerManager;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.blockevent.LynxBlockTouchView;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.defaultimpl.player.impl.C19204c;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import com.bytedance.ies.xelement.p1364b.AbstractC19000e;
import com.bytedance.ies.xelement.p1364b.AbstractC19006i;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.pickview.LynxPickView;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.ies.xelement.text.inlineimage.LynxInlineImageShadowNode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.p1397a.AbstractC19417b;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.bytedance.ies.xelement.viewpager.LynxFoldView;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.lynx.hybrid.resource.config.C21275a;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.EnumC21280f;
import com.bytedance.xelement.experiment.richtext.ExperimentRichTextUI;
import com.lynx.component.svg.C28319c;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.p2062ui.image.FlattenUIImage;
import com.lynx.tasm.p2062ui.image.FrescoInlineImageShadowNode;
import com.lynx.tasm.p2062ui.image.UIFilterImage;
import com.lynx.tasm.p2062ui.image.UIImage;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import com.p2082ss.android.ugc.aweme.p2685cp.p2687b.p2688a.C40245a;
import com.p2082ss.android.ugc.aweme.p2685cp.p2687b.p2688a.C40250c;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.tiktok.spark_base.R$drawable;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.cp.b.c */
public final class C40253c {

    /* renamed from: a */
    public static final C40253c f94467a = new C40253c();

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ai */
    public static final class C40265ai extends C28463a {
        static {
            Covode.recordClassIndex(48066);
        }

        /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ai$a */
        public static final class C40266a implements AbstractC19054a {
            static {
                Covode.recordClassIndex(48067);
            }

            C40266a() {
            }

            @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
            /* renamed from: a */
            public final Map<String, String> mo16277a() {
                return C89041ag.m154421a(C89387v.m154943a("confirm", "confirm"), C89387v.m154943a("cancel", "cancel"), C89387v.m154943a("wheel_text_bound_text", "Week"));
            }
        }

        C40265ai(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxPickerViewColumn(jVar, new C40266a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$aj */
    public static final class C40267aj extends C28463a {
        static {
            Covode.recordClassIndex(48068);
        }

        /* renamed from: com.ss.android.ugc.aweme.cp.b.c$aj$a */
        public static final class C40268a implements AbstractC19054a {
            static {
                Covode.recordClassIndex(48069);
            }

            C40268a() {
            }

            @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
            /* renamed from: a */
            public final Map<String, String> mo16277a() {
                return C89041ag.m154421a(C89387v.m154943a("confirm", "confirm"), C89387v.m154943a("cancel", "cancel"), C89387v.m154943a("wheel_text_bound_text", "Week"));
            }
        }

        C40267aj(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxPickerViewColumn(jVar, new C40268a());
        }
    }

    private C40253c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$af */
    public static final class C40260af extends C28463a {
        static {
            Covode.recordClassIndex(48061);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new AutoHeightInputShadowNode();
        }

        C40260af(String str) {
            super(str);
        }

        /* renamed from: com.ss.android.ugc.aweme.cp.b.c$af$a */
        static final class C40261a extends AbstractC89220m implements AbstractC89172b<Context, C40254a> {

            /* renamed from: a */
            public static final C40261a f94469a = new C40261a();

            static {
                Covode.recordClassIndex(48062);
            }

            C40261a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C40254a invoke(Context context) {
                Context context2 = context;
                C89219l.m154721d(context2, "");
                return new C40254a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(jVar);
            lynxTextAreaView.mo30664a(C40261a.f94469a);
            return lynxTextAreaView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ag */
    public static final class C40262ag extends C28463a {
        static {
            Covode.recordClassIndex(48063);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new AutoHeightInputShadowNode();
        }

        C40262ag(String str) {
            super(str);
        }

        /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ag$a */
        static final class C40263a extends AbstractC89220m implements AbstractC89172b<Context, C40254a> {

            /* renamed from: a */
            public static final C40263a f94470a = new C40263a();

            static {
                Covode.recordClassIndex(48064);
            }

            C40263a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C40254a invoke(Context context) {
                Context context2 = context;
                C89219l.m154721d(context2, "");
                return new C40254a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(jVar);
            lynxTextAreaView.mo30664a(C40263a.f94470a);
            return lynxTextAreaView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$c */
    public static final class C40288c extends C28463a {
        static {
            Covode.recordClassIndex(48089);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new FrescoInlineImageShadowNode();
        }

        C40288c(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$v */
    public static final class C40308v extends C28463a {
        static {
            Covode.recordClassIndex(48109);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new LynxInlineTextShadowNode();
        }

        C40308v(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$x */
    public static final class C40310x extends C28463a {
        static {
            Covode.recordClassIndex(48111);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new LynxInlineImageShadowNode();
        }

        C40310x(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$y */
    public static final class C40311y extends C28463a {
        static {
            Covode.recordClassIndex(48112);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new LynxInlineTruncationShadowNode();
        }

        C40311y(String str) {
            super(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$u */
    public static final class C40306u extends C28463a {
        static {
            Covode.recordClassIndex(48107);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            LynxTextShadowNode lynxTextShadowNode = new LynxTextShadowNode();
            C40307a aVar = C40307a.f94477a;
            C89219l.m154719c(aVar, "");
            lynxTextShadowNode.f46024a = aVar;
            return lynxTextShadowNode;
        }

        C40306u(String str) {
            super(str);
        }

        /* renamed from: com.ss.android.ugc.aweme.cp.b.c$u$a */
        static final class C40307a extends AbstractC89220m implements AbstractC89172b<Context, C40254a> {

            /* renamed from: a */
            public static final C40307a f94477a = new C40307a();

            static {
                Covode.recordClassIndex(48108);
            }

            C40307a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C40254a invoke(Context context) {
                Context context2 = context;
                C89219l.m154721d(context2, "");
                return new C40254a(context2);
            }
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTextUI(jVar);
        }
    }

    static {
        Covode.recordClassIndex(48054);
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$aa */
    public static final class C40255aa extends C28463a {
        static {
            Covode.recordClassIndex(48056);
        }

        C40255aa(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new LynxPullRefreshView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ab */
    public static final class C40256ab extends C28463a {
        static {
            Covode.recordClassIndex(48057);
        }

        C40256ab(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxRefreshHeader(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ac */
    public static final class C40257ac extends C28463a {
        static {
            Covode.recordClassIndex(48058);
        }

        C40257ac(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxRefreshFooter(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ad */
    public static final class C40258ad extends C28463a {
        static {
            Covode.recordClassIndex(48059);
        }

        C40258ad(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxInputView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ae */
    public static final class C40259ae extends C28463a {
        static {
            Covode.recordClassIndex(48060);
        }

        C40259ae(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxInputView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ah */
    public static final class C40264ah extends C28463a {
        static {
            Covode.recordClassIndex(48065);
        }

        C40264ah(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            if (jVar == null) {
                C89219l.m154715b();
            }
            return new LynxFoldHeader(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ak */
    public static final class C40269ak extends C28463a {
        static {
            Covode.recordClassIndex(48070);
        }

        C40269ak(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxPickView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$al */
    public static final class C40270al extends C28463a {
        static {
            Covode.recordClassIndex(48071);
        }

        C40270al(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxPickView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$am */
    public static final class C40271am extends C28463a {
        static {
            Covode.recordClassIndex(48072);
        }

        C40271am(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxBlockTouchView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$an */
    public static final class C40272an extends C28463a {
        static {
            Covode.recordClassIndex(48073);
        }

        C40272an(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new UISvg(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ao */
    public static final class C40273ao extends C28463a {
        static {
            Covode.recordClassIndex(48074);
        }

        C40273ao(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new ExperimentRichTextUI(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ap */
    public static final class C40274ap extends C28463a {
        static {
            Covode.recordClassIndex(48075);
        }

        C40274ap(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$aq */
    public static final class C40275aq extends C28463a {
        static {
            Covode.recordClassIndex(48076);
        }

        C40275aq(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ar */
    public static final class C40276ar extends C28463a {
        static {
            Covode.recordClassIndex(48077);
        }

        C40276ar(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxViewPager(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$as */
    public static final class C40277as extends C28463a {
        static {
            Covode.recordClassIndex(48078);
        }

        C40277as(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new LynxViewPager(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$at */
    public static final class C40278at extends C28463a {
        static {
            Covode.recordClassIndex(48079);
        }

        C40278at(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxViewpagerItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$au */
    public static final class C40279au extends C28463a {
        static {
            Covode.recordClassIndex(48080);
        }

        C40279au(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$av */
    public static final class C40280av extends C28463a {
        static {
            Covode.recordClassIndex(48081);
        }

        C40280av(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$aw */
    public static final class C40281aw extends C28463a {
        static {
            Covode.recordClassIndex(48082);
        }

        C40281aw(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxViewPager(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ax */
    public static final class C40282ax extends C28463a {
        static {
            Covode.recordClassIndex(48083);
        }

        C40282ax(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxViewpagerItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ay */
    public static final class C40283ay extends C28463a {
        static {
            Covode.recordClassIndex(48084);
        }

        C40283ay(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            if (jVar == null) {
                C89219l.m154715b();
            }
            return new LynxViewpagerItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$az */
    public static final class C40284az extends C28463a {
        static {
            Covode.recordClassIndex(48085);
        }

        C40284az(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabBarView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$b */
    public static final class C40285b extends C28463a {
        static {
            Covode.recordClassIndex(48086);
        }

        C40285b(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new UIFilterImage(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$ba */
    public static final class C40286ba extends C28463a {
        static {
            Covode.recordClassIndex(48087);
        }

        C40286ba(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxTabbarItem(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$d */
    public static final class C40289d extends C28463a {
        static {
            Covode.recordClassIndex(48090);
        }

        C40289d(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxScrollView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$e */
    public static final class C40290e extends C28463a {
        static {
            Covode.recordClassIndex(48091);
        }

        C40290e(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxImpressionView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$f */
    public static final class C40291f extends C28463a {
        static {
            Covode.recordClassIndex(48092);
        }

        C40291f(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxBounceView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$g */
    public static final class C40292g extends C28463a {
        static {
            Covode.recordClassIndex(48093);
        }

        C40292g(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new LynxVideoManager(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$i */
    public static final class C40294i extends C28463a {
        static {
            Covode.recordClassIndex(48095);
        }

        C40294i(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new LynxSeekerManager(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$j */
    public static final class C40295j extends C28463a {
        static {
            Covode.recordClassIndex(48096);
        }

        C40295j(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            AbstractC19000e player;
            LynxAudio lynxAudio = new LynxAudio(jVar);
            C19204c cVar = new C19204c();
            cVar.f45367a = new C40245a();
            cVar.f45368b = new C40250c();
            cVar.f45369c = R$drawable.icon;
            C89219l.m154719c(cVar, "");
            lynxAudio.f44761a = cVar;
            AbstractC19006i iVar = (AbstractC19006i) lynxAudio.mView;
            if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
                player.mo30161a(cVar);
            }
            return lynxAudio;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$k */
    public static final class C40296k extends C28463a {
        static {
            Covode.recordClassIndex(48097);
        }

        C40296k(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return C67446h.f151111a.mo106189a(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$l */
    public static final class C40297l extends C28463a {
        static {
            Covode.recordClassIndex(48098);
        }

        C40297l(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new LynxFoldView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$m */
    public static final class C40298m extends C28463a {
        static {
            Covode.recordClassIndex(48099);
        }

        C40298m(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return C67446h.f151111a.mo106212c(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$n */
    public static final class C40299n extends C28463a {
        static {
            Covode.recordClassIndex(48100);
        }

        C40299n(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return C67446h.f151111a.mo106208b(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$q */
    public static final class C40302q extends C28463a {
        static {
            Covode.recordClassIndex(48103);
        }

        C40302q(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxSwiperView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$r */
    public static final class C40303r extends C28463a {
        static {
            Covode.recordClassIndex(48104);
        }

        C40303r(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxSwiperView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$s */
    public static final class C40304s extends C28463a {
        static {
            Covode.recordClassIndex(48105);
        }

        C40304s(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new UIView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$t */
    public static final class C40305t extends C28463a {
        static {
            Covode.recordClassIndex(48106);
        }

        C40305t(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new UIView(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$w */
    public static final class C40309w extends C28463a {
        static {
            Covode.recordClassIndex(48110);
        }

        C40309w(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            if (jVar == null) {
                C89219l.m154715b();
            }
            return new LynxFoldToolbar(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$z */
    public static final class C40312z extends C28463a {
        static {
            Covode.recordClassIndex(48113);
        }

        C40312z(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            return new LynxOverlayViewProxy(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$bb */
    public static final class C40287bb extends C28463a {
        static {
            Covode.recordClassIndex(48088);
        }

        C40287bb(String str) {
            super(str, true);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new UIImage(jVar);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: b */
        public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
            return new FlattenUIImage(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$a */
    public static final class C40254a implements AbstractC19417b {

        /* renamed from: a */
        public final C46577a f94468a = new C46577a();

        static {
            Covode.recordClassIndex(48055);
        }

        public C40254a(Context context) {
            C89219l.m154721d(context, "");
        }

        @Override // com.bytedance.ies.xelement.text.p1397a.AbstractC19417b
        /* renamed from: a */
        public final Drawable mo30985a(Context context, String str) {
            return this.f94468a.mo79102a(context, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$o */
    public static final class C40300o extends C28463a {

        /* renamed from: a */
        final /* synthetic */ boolean f94473a;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f94474d;

        static {
            Covode.recordClassIndex(48101);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(jVar);
            if (this.f94473a && this.f94474d.element != null) {
                lynxBytedLottieView.mo30270a((AbstractC18943a<C18945c>) this.f94474d.element);
            }
            return lynxBytedLottieView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40300o(boolean z, C89233z.C89238e eVar, String str) {
            super(str);
            this.f94473a = z;
            this.f94474d = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$p */
    public static final class C40301p extends C28463a {

        /* renamed from: a */
        final /* synthetic */ boolean f94475a;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f94476d;

        static {
            Covode.recordClassIndex(48102);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            C89219l.m154721d(jVar, "");
            LynxBytedLottieView lynxBytedLottieView = new LynxBytedLottieView(jVar);
            if (this.f94475a && this.f94476d.element != null) {
                lynxBytedLottieView.mo30270a((AbstractC18943a<C18945c>) this.f94476d.element);
            }
            return lynxBytedLottieView;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40301p(boolean z, C89233z.C89238e eVar, String str) {
            super(str);
            this.f94475a = z;
            this.f94476d = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.c$h */
    public static final class C40293h extends C28463a {

        /* renamed from: a */
        final /* synthetic */ boolean f94471a;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f94472d;

        static {
            Covode.recordClassIndex(48094);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            if (jVar == null) {
                C89219l.m154715b();
            }
            LynxAlphaVideo lynxAlphaVideo = new LynxAlphaVideo(jVar, "");
            if (this.f94471a && this.f94472d.element != null) {
                T t = this.f94472d.element;
                C89219l.m154719c(t, "");
                lynxAlphaVideo.f44851e = t;
            }
            lynxAlphaVideo.f44850d = false;
            return lynxAlphaVideo;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40293h(boolean z, C89233z.C89238e eVar, String str) {
            super(str);
            this.f94471a = z;
            this.f94472d = eVar;
        }
    }

    /* renamed from: a */
    public static final List<C28463a> m81398a(boolean z) {
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        if (z) {
            eVar.element = (T) new C40242a(new C21284j());
            C21284j jVar = new C21284j();
            C21275a aVar = new C21275a(true);
            aVar.mo34878a(C89070n.m154524c(EnumC21280f.GECKO, EnumC21280f.BUILTIN));
            jVar.mo34886a(aVar);
            eVar2.element = (T) new C40242a(jVar);
        }
        return C89070n.m154524c(new C40297l("x-foldview-pro"), new C40309w("x-foldview-toolbar-pro"), new C40264ah("x-foldview-header-pro"), new C40277as("x-viewpager-pro"), new C40283ay("x-viewpager-item-pro"), new C40284az("x-tabbar-pro"), new C40286ba("x-tabbar-item-pro"), new C40287bb("image"), new C40285b("filter-image"), new C40288c("inline-image"), new C40289d("x-scroll-view"), new C40290e("x-impression-view"), new C40291f("x-bounce-view"), new C40292g("x-video"), new C40293h(z, eVar, "x-alpha-video"), new C40294i("x-video-seek"), new C40295j("x-audio"), new C40296k("search-video"), new C40298m("search-live"), new C40299n("search-horizontal"), new C40300o(z, eVar2, "x-lottie"), new C40301p(z, eVar, "lottie-view"), new C40302q("x-swiper"), new C40303r("swiper"), new C40304s("x-swiper-item"), new C40305t("swiper-item"), new C40306u("x-text"), new C40308v("x-inline-text"), new C40310x("x-inline-image"), new C40311y("x-inline-truncation"), new C40312z("x-overlay"), new C40255aa("x-refresh-view"), new C40256ab("x-refresh-header"), new C40257ac("x-refresh-footer"), new C40258ad("x-input"), new C40259ae("input"), new C40260af("x-textarea"), new C40262ag("textarea"), new C40265ai("x-picker-view-column"), new C40267aj("picker-view-column"), new C40269ak("x-picker-view"), new C40270al("picker-view"), new C40271am("x-block-touch"), new C40272an("x-svg"), new C40273ao("experiment-x-rich-text"), new C40274ap("x-tabbar"), new C40275aq("x-tabbar-item"), new C40276ar("x-viewpager"), new C40278at("x-viewpager-item"), new C40279au("x-tabbar"), new C40280av("x-tabbar-item"), new C40281aw("x-viewpager"), new C40282ax("x-viewpager-item"), C28319c.m56633a());
    }
}
