package com.bytedance.android.livesdk.lynx.p570ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.LynxBounceView;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxNestedScrollView;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.ies.xelement.LynxRefreshFooter;
import com.bytedance.ies.xelement.LynxRefreshHeader;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.ies.xelement.LynxVideoManager;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.blockevent.LynxBlockTouchView;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.overlay.LynxOverlayViewProxy;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.pickview.LynxPickView;
import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerLeft;
import com.bytedance.ies.xelement.reveal.LynxRevealInnerRight;
import com.bytedance.ies.xelement.reveal.LynxRevealView;
import com.bytedance.ies.xelement.text.inlineimage.LynxInlineImageShadowNode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.LynxViewPager;
import com.bytedance.ies.xelement.viewpager.childitem.LynxTabbarItem;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.canvas.LynxHeliumCanvas;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.p2062ui.image.FlattenUIImage;
import com.lynx.tasm.p2062ui.image.FrescoInlineImageShadowNode;
import com.lynx.tasm.p2062ui.image.UIFilterImage;
import com.lynx.tasm.p2062ui.image.UIImage;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.b */
public final class C9379b {

    /* renamed from: a */
    public static final C9379b f22878a = new C9379b();

    /* renamed from: b */
    private static final AbstractC89244h f22879b = C89250i.m154773a((AbstractC89171a) C9380a.f22880a);

    /* renamed from: a */
    public static List<C28463a> m17646a() {
        return (List) f22879b.getValue();
    }

    private C9379b() {
    }

    static {
        Covode.recordClassIndex(10887);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.b$a */
    static final class C9380a extends AbstractC89220m implements AbstractC89171a<List<C28463a>> {

        /* renamed from: a */
        public static final C9380a f22880a = new C9380a();

        static {
            Covode.recordClassIndex(10888);
        }

        C9380a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C28463a> invoke() {
            return C89070n.m154524c(new C28463a("filter-image") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C93811 */

                static {
                    Covode.recordClassIndex(10889);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new UIFilterImage(jVar);
                }
            }, new C28463a("inline-image") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938412 */

                static {
                    Covode.recordClassIndex(10892);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new FrescoInlineImageShadowNode();
                }
            }, new C28463a("image") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939723 */

                static {
                    Covode.recordClassIndex(10905);
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
            }, new C28463a("a") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941034 */

                static {
                    Covode.recordClassIndex(10918);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1(jVar, jVar);
                }
            }, new C28463a("x-svg") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942144 */

                static {
                    Covode.recordClassIndex(10929);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new UISvg(jVar);
                }
            }, new C28463a("svg") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942245 */

                static {
                    Covode.recordClassIndex(10930);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new UISvg(jVar);
                }
            }, new C28463a("x-lottie") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942346 */

                static {
                    Covode.recordClassIndex(10931);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxBytedLottieView(jVar);
                }
            }, new C28463a("lottie-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942447 */

                static {
                    Covode.recordClassIndex(10932);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxBytedLottieView(jVar);
                }
            }, new C28463a("x-swiper") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942548 */

                static {
                    Covode.recordClassIndex(10933);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxSwiperView(jVar);
                }
            }, new C28463a("swiper") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C93922 */

                static {
                    Covode.recordClassIndex(10900);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxSwiperView(jVar);
                }
            }, new C28463a("x-swiper-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94053 */

                static {
                    Covode.recordClassIndex(10913);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new UIView(jVar);
                }
            }, new C28463a("swiper-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94164 */

                static {
                    Covode.recordClassIndex(10924);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new UIView(jVar);
                }
            }, new C28463a("textarea") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94265 */

                static {
                    Covode.recordClassIndex(10934);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new AutoHeightInputShadowNode();
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTextAreaView(jVar);
                }
            }, new C28463a("x-textarea") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94276 */

                static {
                    Covode.recordClassIndex(10935);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new AutoHeightInputShadowNode();
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTextAreaView(jVar);
                }
            }, new C28463a("input") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94287 */

                static {
                    Covode.recordClassIndex(10936);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxInputView(jVar);
                }
            }, new C28463a("x-refresh-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94298 */

                static {
                    Covode.recordClassIndex(10937);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    return new LynxPullRefreshView(jVar);
                }
            }, new C28463a("x-refresh-header") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C94309 */

                static {
                    Covode.recordClassIndex(10938);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxRefreshHeader(jVar);
                }
            }, new C28463a("x-refresh-footer") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938210 */

                static {
                    Covode.recordClassIndex(10890);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxRefreshFooter(jVar);
                }
            }, new C28463a("x-input") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938311 */

                static {
                    Covode.recordClassIndex(10891);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxInputView(jVar);
                }
            }, new C28463a("x-scroll-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938513 */

                static {
                    Covode.recordClassIndex(10893);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxScrollView(jVar);
                }
            }, new C28463a("x-impression-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938614 */

                static {
                    Covode.recordClassIndex(10894);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxImpressionView(jVar);
                }
            }, new C28463a("x-bounce-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938715 */

                static {
                    Covode.recordClassIndex(10895);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxBounceView(jVar);
                }
            }, new C28463a("x-video") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938816 */

                static {
                    Covode.recordClassIndex(10896);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    return new LynxVideoManager(jVar);
                }
            }, new C28463a("x-text") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C938917 */

                static {
                    Covode.recordClassIndex(10897);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new LynxTextShadowNode();
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    if (jVar == null) {
                        C89219l.m154715b();
                    }
                    return new LynxTextUI(jVar);
                }
            }, new C28463a("x-inline-text") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939018 */

                static {
                    Covode.recordClassIndex(10898);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new LynxInlineTextShadowNode();
                }
            }, new C28463a("x-inline-image") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939119 */

                static {
                    Covode.recordClassIndex(10899);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new LynxInlineImageShadowNode();
                }
            }, new C28463a("x-inline-truncation") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939320 */

                static {
                    Covode.recordClassIndex(10901);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final ShadowNode mo16276a() {
                    return new LynxInlineTruncationShadowNode();
                }
            }, new C28463a("x-overlay") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939421 */

                static {
                    Covode.recordClassIndex(10902);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxOverlayViewProxy(jVar);
                }
            }, new C28463a("x-picker-view-column") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939522 */

                static {
                    Covode.recordClassIndex(10903);
                }

                /* renamed from: com.bytedance.android.livesdk.lynx.ui.b$a$22$a */
                public static final class C9396a implements AbstractC19054a {
                    static {
                        Covode.recordClassIndex(10904);
                    }

                    C9396a() {
                    }

                    @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
                    /* renamed from: a */
                    public final Map<String, String> mo16277a() {
                        return C89041ag.m154421a(C89387v.m154943a("confirm", "confirm"), C89387v.m154943a("cancel", "cancel"), C89387v.m154943a("wheel_text_bound_text", "Week"));
                    }
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxPickerViewColumn(jVar, new C9396a());
                }
            }, new C28463a("picker-view-column") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C939824 */

                static {
                    Covode.recordClassIndex(10906);
                }

                /* renamed from: com.bytedance.android.livesdk.lynx.ui.b$a$24$a */
                public static final class C9399a implements AbstractC19054a {
                    static {
                        Covode.recordClassIndex(10907);
                    }

                    C9399a() {
                    }

                    @Override // com.bytedance.ies.xelement.p1366c.AbstractC19054a
                    /* renamed from: a */
                    public final Map<String, String> mo16277a() {
                        return C89041ag.m154421a(C89387v.m154943a("confirm", "confirm"), C89387v.m154943a("cancel", "cancel"), C89387v.m154943a("wheel_text_bound_text", "Week"));
                    }
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxPickerViewColumn(jVar, new C9399a());
                }
            }, new C28463a("x-picker-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940025 */

                static {
                    Covode.recordClassIndex(10908);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxPickView(jVar);
                }
            }, new C28463a("picker-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940126 */

                static {
                    Covode.recordClassIndex(10909);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxPickView(jVar);
                }
            }, new C28463a("x-block-touch") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940227 */

                static {
                    Covode.recordClassIndex(10910);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxBlockTouchView(jVar);
                }
            }, new C28463a("x-tabbar") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940328 */

                static {
                    Covode.recordClassIndex(10911);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTabBarView(jVar);
                }
            }, new C28463a("x-tabbar-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940429 */

                static {
                    Covode.recordClassIndex(10912);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTabbarItem(jVar);
                }
            }, new C28463a("x-viewpager") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940630 */

                static {
                    Covode.recordClassIndex(10914);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new C28463a("x-viewpager-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940731 */

                static {
                    Covode.recordClassIndex(10915);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new C28463a("x-tabbar") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940832 */

                static {
                    Covode.recordClassIndex(10916);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTabBarView(jVar);
                }
            }, new C28463a("x-tabbar-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C940933 */

                static {
                    Covode.recordClassIndex(10917);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxTabbarItem(jVar);
                }
            }, new C28463a("x-viewpager") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941135 */

                static {
                    Covode.recordClassIndex(10919);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new C28463a("x-viewpager-item") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941236 */

                static {
                    Covode.recordClassIndex(10920);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new C28463a("x-reveal-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941337 */

                static {
                    Covode.recordClassIndex(10921);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxRevealView(jVar);
                }
            }, new C28463a("x-reveal-view-inner-left") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941438 */

                static {
                    Covode.recordClassIndex(10922);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxRevealInnerLeft(jVar);
                }
            }, new C28463a("x-reveal-view-inner-right") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941539 */

                static {
                    Covode.recordClassIndex(10923);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxRevealInnerRight(jVar);
                }
            }, new C28463a("x-viewpager-pro") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941740 */

                static {
                    Covode.recordClassIndex(10925);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewPager(jVar);
                }
            }, new C28463a("x-viewpager-item-pro") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941841 */

                static {
                    Covode.recordClassIndex(10926);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    C89219l.m154721d(jVar, "");
                    return new LynxViewpagerItem(jVar);
                }
            }, new C28463a("x-nested-scroll-view") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C941942 */

                static {
                    Covode.recordClassIndex(10927);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    return new LynxNestedScrollView(jVar);
                }
            }, new C28463a("canvas") {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9379b.C9380a.C942043 */

                static {
                    Covode.recordClassIndex(10928);
                }

                @Override // com.lynx.tasm.behavior.C28463a
                /* renamed from: a */
                public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
                    return new LynxHeliumCanvas(jVar);
                }
            });
        }
    }
}
