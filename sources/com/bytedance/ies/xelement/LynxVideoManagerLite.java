package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1362a.AbstractC18943a;
import com.bytedance.ies.xelement.p1362a.C18945c;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.behavior.p2052ui.utils.C28690e;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class LynxVideoManagerLite extends UISimpleView<DeclarativeVideoPlayBoxViewDelegate> {
    public static final C18934a Companion = new C18934a((byte) 0);

    static {
        Covode.recordClassIndex(21675);
    }

    /* renamed from: com_bytedance_ies_xelement_LynxVideoManagerLite_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m35137x2d0bca9f(String str, String str2) {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i = 0;
            boolean z5 = false;
            int i2 = 0;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            switch (nextKey.hashCode()) {
                case -1699818261:
                    if (nextKey.equals("enableplaylistener")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setEnablePlayListener(z);
                        continue;
                    }
                    break;
                case -1664825047:
                    if (nextKey.equals("singleplayer")) {
                        if (!readableMap.isNull(nextKey)) {
                            z8 = readableMap.getBoolean(nextKey, false);
                        }
                        setSinglePlayer(z8);
                        continue;
                    }
                    break;
                case -1531319052:
                    if (nextKey.equals("performanceLog")) {
                        setPerformanceLog(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1489589134:
                    if (nextKey.equals("objectfit")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -982450867:
                    if (nextKey.equals("poster")) {
                        setPoster(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -894681731:
                    if (nextKey.equals("__control")) {
                        setControl(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -810883302:
                    if (nextKey.equals("volume")) {
                        setVolume(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -318476791:
                    if (nextKey.equals("preload")) {
                        if (!readableMap.isNull(nextKey)) {
                            z7 = readableMap.getBoolean(nextKey, false);
                        }
                        setPreload(z7);
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setLoop(z6);
                        continue;
                    }
                    break;
                case 3493088:
                    if (nextKey.equals("rate")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setRate(i2);
                        continue;
                    }
                    break;
                case 104264043:
                    if (nextKey.equals("muted")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setMuted(z5);
                        continue;
                    }
                    break;
                case 269397981:
                    if (nextKey.equals("inittime")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setInitTime(i);
                        continue;
                    }
                    break;
                case 850708551:
                    if (nextKey.equals("log-extra")) {
                        setLogExtra(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 894041755:
                    if (nextKey.equals("autolifecycle")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoLifecycle(z4);
                        continue;
                    }
                    break;
                case 1331794760:
                    if (nextKey.equals("video-tag")) {
                        setVideoTag(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1933829272:
                    if (nextKey.equals("devicechangeaware")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setDeviceChangeAware(z2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxVideoManagerLite$a */
    public static final class C18934a {
        static {
            Covode.recordClassIndex(21678);
        }

        private C18934a() {
        }

        public /* synthetic */ C18934a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void destroy() {
        super.destroy();
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).onPropsUpdateOnce();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManagerLite- onPropsUpdated");
    }

    public LynxVideoManagerLite(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "video-tag")
    public final void setVideoTag(String str) {
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setVideoTag(str);
    }

    @AbstractC28528p
    public final void getDuration(Callback callback) {
        int duration = ((DeclarativeVideoPlayBoxViewDelegate) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @AbstractC28525m(mo49059a = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- autolifecycle -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setAutoLifecycle(z);
    }

    @AbstractC28525m(mo49059a = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- autoplay -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setAutoPlay(z);
    }

    @AbstractC28525m(mo49059a = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- devicechangeaware -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setDeviceChangeAware(z);
    }

    @AbstractC28525m(mo49059a = "enableplaylistener")
    public final void setEnablePlayListener(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- enableplaylistener -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setEnablePlayListener(z);
    }

    @AbstractC28525m(mo49059a = "inittime")
    public final void setInitTime(int i) {
        System.out.println((Object) "LynxVideoManagerLite- inittime -> ".concat(String.valueOf(i)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setInitTime(i);
    }

    @AbstractC28525m(mo49059a = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- loop -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setLoop(z);
    }

    @AbstractC28525m(mo49059a = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- muted -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setMuted(z);
    }

    @AbstractC28525m(mo49059a = "objectfit")
    public final void setObjectFit(String str) {
        C89219l.m154719c(str, "");
        System.out.println((Object) "LynxVideoManagerLite- objectfit -> ".concat(String.valueOf(str)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setObjectFit(str);
    }

    @AbstractC28525m(mo49059a = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) "LynxVideoManagerLite- performanceLog -> ".concat(String.valueOf(str)));
        if (str != null) {
            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPerformanceLog(str);
        }
    }

    @AbstractC28525m(mo49059a = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- preload -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPreload(z);
    }

    @AbstractC28525m(mo49059a = "rate")
    public final void setRate(int i) {
        System.out.println((Object) "LynxVideoManagerLite- rate -> ".concat(String.valueOf(i)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setRate(i);
    }

    public final void setResourceLoader(AbstractC18943a<C18945c> aVar) {
        C89219l.m154719c(aVar, "");
        System.out.println((Object) "LynxVideoManagerLite- setResourceLoader");
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setResourceLoader(aVar);
    }

    @AbstractC28525m(mo49059a = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) "LynxVideoManagerLite- singleplayer -> ".concat(String.valueOf(z)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setSinglePlayer(z);
    }

    @AbstractC28525m(mo49059a = "volume")
    public final void setVolume(float f) {
        System.out.println((Object) "LynxVideoManagerLite- preload -> ".concat(String.valueOf(f)));
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setVolume(f);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final DeclarativeVideoPlayBoxViewDelegate createView(Context context) {
        AbstractC89172b<Context, DeclarativeVideoPlayBoxViewDelegate> declarativeVideoPlayBoxViewProvider = ((XElementInitializerLite) XElementInitializerLite.instance$delegate.getValue()).getConfig().getDeclarativeVideoPlayBoxViewProvider();
        if (declarativeVideoPlayBoxViewProvider == null) {
            C89219l.m154707a();
        }
        if (context == null) {
            C89219l.m154707a();
        }
        DeclarativeVideoPlayBoxViewDelegate invoke = declarativeVideoPlayBoxViewProvider.invoke(context);
        invoke.setStateChangeReporter(new C18935b(this));
        return invoke;
    }

    @AbstractC28525m(mo49059a = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        System.out.println((Object) "LynxVideoManagerLite- log-extra -> ".concat(String.valueOf(readableMap)));
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            C89219l.m154709a((Object) hashMap, "");
            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setLogExtra(hashMap);
        }
    }

    @AbstractC28525m(mo49059a = "poster")
    public final void setPoster(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null && C19251h.f45469b[h.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManagerLite- poster -> " + aVar.mo48556e()));
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if (e.length() > 0) {
                String e2 = aVar.mo48556e();
                C89219l.m154709a((Object) e2, "");
                ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setPoster(e2);
                return;
            }
            return;
        }
        m35137x2d0bca9f("LynxVideoManagerLite", "Not supported poster type: " + aVar.mo48559h().name());
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null && C19251h.f45468a[h.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManagerLite- src -> " + aVar.mo48556e()));
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if (e.length() > 0) {
                String e2 = aVar.mo48556e();
                C89219l.m154709a((Object) e2, "");
                ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setSrc(e2);
                return;
            }
            return;
        }
        m35137x2d0bca9f("LynxVideoManagerLite", "Not supported src type: " + aVar.mo48559h().name());
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        C28683b d;
        super.onBorderRadiusUpdated(i);
        C28690e eVar = this.mLynxBackground;
        float[] fArr = null;
        if (!(eVar == null || (d = eVar.mo49780d()) == null)) {
            View view = this.mView;
            C89219l.m154709a((Object) view, "");
            int paddingLeft = ((DeclarativeVideoPlayBoxViewDelegate) view).getPaddingLeft();
            View view2 = this.mView;
            C89219l.m154709a((Object) view2, "");
            int paddingRight = ((DeclarativeVideoPlayBoxViewDelegate) view2).getPaddingRight();
            View view3 = this.mView;
            C89219l.m154709a((Object) view3, "");
            int paddingTop = ((DeclarativeVideoPlayBoxViewDelegate) view3).getPaddingTop();
            View view4 = this.mView;
            C89219l.m154709a((Object) view4, "");
            int paddingBottom = ((DeclarativeVideoPlayBoxViewDelegate) view4).getPaddingBottom();
            View view5 = this.mView;
            C89219l.m154709a((Object) view5, "");
            float width = (float) (((DeclarativeVideoPlayBoxViewDelegate) view5).getWidth() + paddingLeft + paddingRight);
            View view6 = this.mView;
            C89219l.m154709a((Object) view6, "");
            d.mo49768a(width, (float) (((DeclarativeVideoPlayBoxViewDelegate) view6).getHeight() + paddingTop + paddingBottom));
            float[] a = d.mo49770a();
            if (a != null) {
                int i2 = 0;
                if (a.length == 8) {
                    float f = (float) paddingLeft;
                    float f2 = (float) paddingTop;
                    float f3 = (float) paddingRight;
                    float f4 = (float) paddingBottom;
                    float[] fArr2 = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        a[i2] = Math.max(0.0f, a[i2] - fArr2[i2]);
                        i2++;
                    } while (i2 < 8);
                    fArr = a;
                }
            }
        }
        ((DeclarativeVideoPlayBoxViewDelegate) this.mView).setBorderRadius(fArr);
    }

    @AbstractC28525m(mo49059a = "__control")
    public final void setControl(String str) {
        List<String> b;
        DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate;
        JSONObject jSONObject;
        DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate2;
        System.out.println((Object) "LynxVideoManagerLite- __control -> ".concat(String.valueOf(str)));
        if (str != null) {
            boolean z = false;
            if (C19250g.m35957a(str) && (b = C89361p.m154915b(str, new String[]{"_*_"})) != null && b.size() == 3 && 1 != 0) {
                List<String> b2 = C89361p.m154915b(str, new String[]{"_*_"});
                String str2 = b2.get(0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (str2.equals("exitfullscreen")) {
                            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).performZoomOut();
                            return;
                        }
                        return;
                    case -619198582:
                        if (str2.equals("requestfullscreen")) {
                            ((DeclarativeVideoPlayBoxViewDelegate) this.mView).performZoom();
                            return;
                        }
                        return;
                    case 3443508:
                        if (str2.equals("play") && (declarativeVideoPlayBoxViewDelegate = (DeclarativeVideoPlayBoxViewDelegate) this.mView) != null) {
                            DeclarativeVideoPlayBoxViewDelegate.playReal$default(declarativeVideoPlayBoxViewDelegate, null, 1, null);
                            return;
                        }
                        return;
                    case 3526264:
                        if (str2.equals("seek")) {
                            try {
                                jSONObject = new JSONObject(b2.get(1));
                            } catch (Exception unused) {
                                jSONObject = new JSONObject();
                            }
                            DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate3 = (DeclarativeVideoPlayBoxViewDelegate) this.mView;
                            if (declarativeVideoPlayBoxViewDelegate3 != null) {
                                int optInt = jSONObject.optInt("position", 0);
                                if (jSONObject.optInt("play") == 1) {
                                    z = true;
                                }
                                declarativeVideoPlayBoxViewDelegate3.seek(optInt, z);
                                return;
                            }
                            return;
                        }
                        return;
                    case 106440182:
                        if (str2.equals("pause") && (declarativeVideoPlayBoxViewDelegate2 = (DeclarativeVideoPlayBoxViewDelegate) this.mView) != null) {
                            declarativeVideoPlayBoxViewDelegate2.pause();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.LynxVideoManagerLite$b */
    public static final class C18935b extends AbstractC89220m implements AbstractC89187q<String, Map<String, ? extends Object>, DeclarativeVideoPlayBoxViewDelegate, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxVideoManagerLite f44818a;

        static {
            Covode.recordClassIndex(21679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18935b(LynxVideoManagerLite lynxVideoManagerLite) {
            super(3);
            this.f44818a = lynxVideoManagerLite;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
            if (r6.equals("onPlayFailed") != false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
            if (r6.equals("onError") != false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
            r7 = r3;
            r1 = "error";
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate r8) {
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxVideoManagerLite.C18935b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
