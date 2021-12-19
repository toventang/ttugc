package com.lynx.tasm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.lynx.devtoolwrapper.AbstractC28330a;
import com.lynx.devtoolwrapper.AbstractC28332c;
import com.lynx.devtoolwrapper.C28333d;
import com.lynx.devtoolwrapper.LynxInspectorManager;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.C28355a;
import com.lynx.jsbridge.C28360e;
import com.lynx.jsbridge.C28361f;
import com.lynx.jsbridge.CallbackImpl;
import com.lynx.jsbridge.HandlerC28362g;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.jsbridge.Promise;
import com.lynx.jsbridge.PromiseImpl;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.AbstractC28371e;
import com.lynx.react.bridge.AbstractRunnableC28370d;
import com.lynx.react.bridge.C28368b;
import com.lynx.react.bridge.C28369c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.AbstractC28457f;
import com.lynx.tasm.base.AbstractC28459h;
import com.lynx.tasm.base.C28454c;
import com.lynx.tasm.base.C28460i;
import com.lynx.tasm.base.CalledByNative;
import com.lynx.tasm.base.SystemMessageHandler;
import com.lynx.tasm.base.SystemThread;
import com.lynx.tasm.behavior.AbstractC28465b;
import com.lynx.tasm.behavior.AbstractC28509e;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28526n;
import com.lynx.tasm.behavior.AbstractC28527o;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.C28477c;
import com.lynx.tasm.behavior.C28501d;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.C28533s;
import com.lynx.tasm.behavior.C28576t;
import com.lynx.tasm.behavior.C28578u;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.C28717w;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.p2050c.AbstractC28493k;
import com.lynx.tasm.behavior.p2050c.p2051a.C28479a;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;
import com.lynx.tasm.behavior.p2052ui.AbstractC28618d;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.behavior.p2052ui.image.AbsUIImage;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.list.C28646i;
import com.lynx.tasm.behavior.p2052ui.list.UIList;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28588a;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28590c;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28591d;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28592e;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28594f;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28597i;
import com.lynx.tasm.behavior.p2052ui.scroll.C28650a;
import com.lynx.tasm.behavior.p2052ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.p2052ui.text.AbstractC28676a;
import com.lynx.tasm.behavior.p2052ui.text.AndroidText;
import com.lynx.tasm.behavior.p2052ui.text.FlattenUIText;
import com.lynx.tasm.behavior.p2052ui.text.UIText;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.p2052ui.utils.C28682a;
import com.lynx.tasm.behavior.p2052ui.utils.C28689d;
import com.lynx.tasm.behavior.p2052ui.utils.C28690e;
import com.lynx.tasm.behavior.p2052ui.utils.C28691f;
import com.lynx.tasm.behavior.p2052ui.utils.C28693h;
import com.lynx.tasm.behavior.p2052ui.utils.C28696j;
import com.lynx.tasm.behavior.p2052ui.utils.EnumC28687c;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.C28699b;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.behavior.p2052ui.view.UIView;
import com.lynx.tasm.behavior.shadow.AbstractC28538c;
import com.lynx.tasm.behavior.shadow.AbstractC28539d;
import com.lynx.tasm.behavior.shadow.C28534a;
import com.lynx.tasm.behavior.shadow.C28536b;
import com.lynx.tasm.behavior.shadow.C28541f;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.C28543h;
import com.lynx.tasm.behavior.shadow.C28545j;
import com.lynx.tasm.behavior.shadow.C28546k;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.C28552b;
import com.lynx.tasm.behavior.shadow.text.C28553c;
import com.lynx.tasm.behavior.shadow.text.C28555e;
import com.lynx.tasm.behavior.shadow.text.C28557g;
import com.lynx.tasm.behavior.shadow.text.C28559i;
import com.lynx.tasm.behavior.shadow.text.C28561k;
import com.lynx.tasm.behavior.shadow.text.C28566n;
import com.lynx.tasm.behavior.shadow.text.C28568o;
import com.lynx.tasm.behavior.shadow.text.C28570p;
import com.lynx.tasm.behavior.shadow.text.C28572q;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.behavior.shadow.text.HandlerThreadC28563m;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.behavior.utils.Settable;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;
import com.lynx.tasm.core.C28745a;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.C28419c;
import com.lynx.tasm.p2043a.p2044a.C28394a;
import com.lynx.tasm.p2043a.p2044a.C28395b;
import com.lynx.tasm.p2043a.p2044a.C28397c;
import com.lynx.tasm.p2043a.p2045b.AbstractC28408a;
import com.lynx.tasm.p2043a.p2045b.AbstractC28409b;
import com.lynx.tasm.p2043a.p2045b.C28410c;
import com.lynx.tasm.p2043a.p2045b.C28413d;
import com.lynx.tasm.p2043a.p2045b.C28414e;
import com.lynx.tasm.p2043a.p2045b.C28416g;
import com.lynx.tasm.p2043a.p2045b.C28418i;
import com.lynx.tasm.p2043a.p2046c.C28422a;
import com.lynx.tasm.p2047b.C28443a;
import com.lynx.tasm.p2047b.C28449c;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2054c.C28726d;
import com.lynx.tasm.p2054c.C28727e;
import com.lynx.tasm.p2054c.C28731i;
import com.lynx.tasm.p2055d.C28754c;
import com.lynx.tasm.p2056e.C28770c;
import com.lynx.tasm.p2057f.p2058a.AbstractC28774a;
import com.lynx.tasm.p2059g.C28782a;
import com.lynx.tasm.provider.AbstractC28842a;
import com.lynx.tasm.provider.AbstractC28843b;
import com.lynx.tasm.provider.AbstractC28853k;
import com.lynx.tasm.provider.AbstractC28854l;
import com.lynx.tasm.utils.C28916c;
import com.lynx.tasm.utils.C28919f;
import com.lynx.tasm.utils.C28920g;
import com.lynx.tasm.utils.C28921h;
import com.lynx.tasm.utils.C28924i;
import com.lynx.tasm.utils.C28926j;
import com.lynx.tasm.utils.C28929m;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.lynx.tasm.utils.ValueUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.lynx.tasm.b */
public class C28438b {

    /* renamed from: a */
    private static volatile boolean f66897a;

    static {
        Covode.recordClassIndex(34428);
    }

    /* renamed from: a */
    public static void m56840a() {
        if (!f66897a) {
            f66897a = true;
            C28745a.m57564a().execute(new Runnable() {
                /* class com.lynx.tasm.C28438b.RunnableC284402 */

                static {
                    Covode.recordClassIndex(34430);
                }

                public final void run() {
                    SystemClock.uptimeMillis();
                    try {
                        Class.forName(AbstractC28843b.class.getName());
                        Class.forName(PropsHolderAutoRegister.class.getName());
                        Class.forName(C28501d.class.getName());
                        Class.forName(C28463a.class.getName());
                        Class.forName(LynxModuleManager.class.getName());
                        Class.forName(CallbackImpl.class.getName());
                        Class.forName(C28785i.class.getName());
                        Class.forName(C28443a.class.getName());
                        Class.forName(C28361f.class.getName());
                        SystemClock.uptimeMillis();
                    } catch (Throwable unused) {
                    }
                }
            });
            C28745a.m57564a().execute(new Runnable() {
                /* class com.lynx.tasm.C28438b.RunnableC284413 */

                static {
                    Covode.recordClassIndex(34431);
                }

                public final void run() {
                    try {
                        SystemClock.elapsedRealtime();
                        try {
                            Class.forName("com.lynx.devtool.LynxInspectorOwner");
                        } catch (ClassNotFoundException unused) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            Librarian.m38962a("lynx");
                            C58032m.m104852a(uptimeMillis, "lynx");
                            SystemClock.elapsedRealtime();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
            C28745a.m57564a().execute(new Runnable() {
                /* class com.lynx.tasm.C28438b.RunnableC284424 */

                static {
                    Covode.recordClassIndex(34432);
                }

                public final void run() {
                    SystemClock.uptimeMillis();
                    try {
                        Class.forName(C28355a.class.getName());
                        Class.forName(AbstractC28359d.class.getName());
                        Class.forName(C28360e.class.getName());
                        Class.forName(LynxModule.class.getName());
                        Class.forName(LynxModuleWrapper.class.getName());
                        Class.forName(MethodDescriptor.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(Promise.class.getName());
                        Class.forName(HandlerC28362g.AbstractC28363a.class.getName());
                        Class.forName(HandlerC28362g.class.getName());
                        Class.forName(Callback.class.getName());
                        Class.forName(AbstractC28367a.class.getName());
                        Class.forName(AbstractRunnableC28370d.class.getName());
                        Class.forName(AbstractC28371e.class.getName());
                        Class.forName(ReadableArray.class.getName());
                        Class.forName(ReadableMap.class.getName());
                        Class.forName(ReadableMapKeySetIterator.class.getName());
                        Class.forName(ReadableType.class.getName());
                        Class.forName(C28438b.class.getName());
                        Class.forName(C28719c.class.getName());
                        Class.forName(AbstractC28750d.class.getName());
                        Class.forName(AbstractC28773f.class.getName());
                        Class.forName(C28781g.class.getName());
                        Class.forName(LynxEnv.class.getName());
                        Class.forName(C28818l.class.getName());
                        Class.forName(C28820n.class.getName());
                        Class.forName(TemplateData.class.getName());
                        Class.forName(TemplateAssembler.AbstractC28391a.class.getName());
                        Class.forName(EnumC28856r.class.getName());
                        Class.forName(C28454c.class.getName());
                        Class.forName(CalledByNative.class.getName());
                        Class.forName(AbstractC28457f.class.getName());
                        Class.forName(AbstractC28459h.class.getName());
                        Class.forName(SystemMessageHandler.class.getName());
                        Class.forName(SystemThread.class.getName());
                        Class.forName(AbstractC28465b.class.getName());
                        Class.forName(C28477c.class.getName());
                        Class.forName(AbstractC28509e.class.getName());
                        Class.forName(AbstractC28510f.class.getName());
                        Class.forName(AbstractC28408a.class.getName());
                        Class.forName(C28410c.class.getName());
                        Class.forName(LayoutContext.class.getName());
                        Class.forName(C28395b.AbstractC28396a.class.getName());
                        Class.forName(C28395b.class.getName());
                        Class.forName(C28394a.class.getName());
                        Class.forName(C28397c.class.getName());
                        Class.forName(AbstractC28525m.class.getName());
                        Class.forName(AbstractC28526n.class.getName());
                        Class.forName(AbstractC28527o.class.getName());
                        Class.forName(C28529q.class.getName());
                        Class.forName(PaintingContext.class.getName());
                        Class.forName(C28533s.class.getName());
                        Class.forName(C28578u.class.getName());
                        Class.forName(C28716v.class.getName());
                        Class.forName(C28717w.class.getName());
                        Class.forName(AbstractC28493k.class.getName());
                        Class.forName(LayoutNode.class.getName());
                        Class.forName(AbstractC28538c.class.getName());
                        Class.forName(AbstractC28539d.class.getName());
                        Class.forName(EnumC28540e.class.getName());
                        Class.forName(C28541f.class.getName());
                        Class.forName(C28542g.class.getName());
                        Class.forName(C28543h.class.getName());
                        Class.forName(C28545j.class.getName());
                        Class.forName(C28552b.class.getName());
                        Class.forName(C28553c.class.getName());
                        Class.forName(C28555e.class.getName());
                        Class.forName(C28557g.class.getName());
                        Class.forName(C28559i.class.getName());
                        Class.forName(C28561k.class.getName());
                        Class.forName(HandlerThreadC28563m.class.getName());
                        Class.forName(C28566n.class.getName());
                        Class.forName(C28568o.class.getName());
                        Class.forName(C28570p.C28571a.class.getName());
                        Class.forName(C28570p.class.getName());
                        Class.forName(C28572q.class.getName());
                        Class.forName(C28573r.AbstractC28574a.class.getName());
                        Class.forName(C28573r.class.getName());
                        Class.forName(UIComponent.class.getName());
                        Class.forName(C28699b.class.getName());
                        Class.forName(AbstractC28586a.AbstractC28587a.class.getName());
                        Class.forName(AbstractC28586a.class.getName());
                        Class.forName(LynxBaseUI.class.getName());
                        Class.forName(AbstractC28618d.class.getName());
                        Class.forName(C28621a.class.getName());
                        Class.forName(C28650a.AbstractC28654a.class.getName());
                        Class.forName(AbstractC28676a.class.getName());
                        Class.forName(AndroidText.class.getName());
                        Class.forName(BackgroundDrawable.EnumC28679a.class.getName());
                        Class.forName(BackgroundDrawable.class.getName());
                        Class.forName(C28689d.class.getName());
                        Class.forName(C28690e.class.getName());
                        Class.forName(C28691f.class.getName());
                        Class.forName(C28696j.class.getName());
                        Class.forName(PropsUpdater.class.getName());
                        Class.forName(Settable.class.getName());
                        Class.forName(C28449c.class.getName());
                        Class.forName(ResourceLoader.class.getName());
                        Class.forName(C28723a.class.getName());
                        Class.forName(C28726d.class.getName());
                        Class.forName(C28460i.class.getName());
                        Class.forName(AbstractC28842a.class.getName());
                        Class.forName(AbstractC28843b.AbstractC28844a.class.getName());
                        Class.forName(ColorUtils.class.getName());
                        Class.forName(DisplayMetricsHolder.class.getName());
                        Class.forName(C28916c.class.getName());
                        Class.forName(C28919f.class.getName());
                        Class.forName(C28920g.class.getName());
                        Class.forName(C28926j.class.getName());
                        Class.forName(C28929m.class.getName());
                        Class.forName(C28930n.class.getName());
                        Class.forName(ValueUtils.class.getName());
                        Class.forName(C28921h.class.getName());
                        Class.forName(C28770c.class.getName());
                        Class.forName(AbstractC28853k.class.getName());
                        Class.forName(AbstractC28854l.class.getName());
                        Class.forName(C28782a.class.getName());
                        Class.forName(NetworkingModule.class.getName());
                        Class.forName(PromiseImpl.class.getName());
                        Class.forName(C28368b.class.getName());
                        Class.forName(C28369c.class.getName());
                        Class.forName(WritableArray.class.getName());
                        Class.forName(WritableMap.class.getName());
                        Class.forName(LynxTemplateRender.C28385d.class.getName());
                        Class.forName(AbstractC28838o.class.getName());
                        Class.forName(TemplateAssembler.class.getName());
                        Class.forName(AbstractC28774a.class.getName());
                        Class.forName(AbstractC28409b.class.getName());
                        Class.forName(C28416g.class.getName());
                        Class.forName(C28418i.class.getName());
                        Class.forName(AbstractC28520j.class.getName());
                        Class.forName(C28576t.class.getName());
                        Class.forName(C28479a.class.getName());
                        Class.forName(C28534a.class.getName());
                        Class.forName(C28536b.class.getName());
                        Class.forName(ShadowNode.class.getName());
                        Class.forName(C28546k.class.getName());
                        Class.forName(LynxFlattenUI.class.getName());
                        Class.forName(LynxUI.class.getName());
                        Class.forName(UIBody.C28581a.class.getName());
                        Class.forName(C28650a.class.getName());
                        Class.forName(C28682a.class.getName());
                        Class.forName(EnumC28687c.class.getName());
                        Class.forName(C28693h.class.getName());
                        Class.forName(C28698a.class.getName());
                        Class.forName(LynxUISetter.class.getName());
                        Class.forName(ShadowNodeSetter.class.getName());
                        Class.forName(C28924i.class.getName());
                        Class.forName(JSProxy.class.getName());
                        Class.forName(C28724b.class.getName());
                        Class.forName(C28731i.class.getName());
                        Class.forName(JavaOnlyArray.class.getName());
                        Class.forName(JavaOnlyMap.class.getName());
                        Class.forName(C28841p.class.getName());
                        Class.forName(LynxView.class.getName());
                        Class.forName(C28413d.class.getName());
                        Class.forName(C28414e.class.getName());
                        Class.forName(C28422a.class.getName());
                        Class.forName(C28407b.class.getName());
                        Class.forName(C28419c.class.getName());
                        Class.forName(AbsInlineImageShadowNode.class.getName());
                        Class.forName(BaseTextShadowNode.class.getName());
                        Class.forName(RawTextShadowNode.class.getName());
                        Class.forName(UIGroup.class.getName());
                        Class.forName(UIShadowProxy.C28585c.class.getName());
                        Class.forName(AbsUIImage.class.getName());
                        Class.forName(FlattenUIText.class.getName());
                        Class.forName(UIText.class.getName());
                        Class.forName(C28591d.class.getName());
                        Class.forName(AbstractC28590c.class.getName());
                        Class.forName(AbstractC28588a.class.getName());
                        Class.forName(C28592e.class.getName());
                        Class.forName(C28597i.class.getName());
                        Class.forName(C28594f.class.getName());
                        Class.forName(C28754c.class.getName());
                        Class.forName(C28727e.class.getName());
                        Class.forName(InlineTextShadowNode.class.getName());
                        Class.forName(TextShadowNode.class.getName());
                        Class.forName(UIBody.class.getName());
                        Class.forName(UIShadowProxy.class.getName());
                        Class.forName(UISimpleView.class.getName());
                        Class.forName(UIScrollView.class.getName());
                        Class.forName(UIView.class.getName());
                        Class.forName(UIList.class.getName());
                        Class.forName(C28646i.class.getName());
                        Class.forName(AbstractC28330a.class.getName());
                        Class.forName(AbstractC28332c.class.getName());
                        Class.forName(C28333d.class.getName());
                        Class.forName(LynxInspectorManager.class.getName());
                        if (C28919f.f68346a == null) {
                            C28919f.f68346a = new C28919f();
                        }
                        SystemClock.uptimeMillis();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
