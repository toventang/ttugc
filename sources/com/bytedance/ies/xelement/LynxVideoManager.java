package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.C19296n;
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

public final class LynxVideoManager extends UISimpleView<AbstractC19055d> {

    /* renamed from: a */
    public static final C18932a f44816a = new C18932a((byte) 0);

    static {
        Covode.recordClassIndex(21670);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i2 = 0;
            boolean z5 = false;
            int i3 = 0;
            boolean z6 = false;
            boolean z7 = false;
            int i4 = 0;
            switch (nextKey.hashCode()) {
                case -1664825047:
                    if (nextKey.equals("singleplayer")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSinglePlayer(z);
                        continue;
                    }
                    break;
                case -1596019157:
                    if (nextKey.equals("videowidth")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setVideoWidth(i4);
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
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setRate(i3);
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
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setInitTime(i2);
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
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1630018914:
                    if (nextKey.equals("videoheight")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setVideoHeight(i);
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

    /* renamed from: com.bytedance.ies.xelement.LynxVideoManager$a */
    public static final class C18932a {
        static {
            Covode.recordClassIndex(21673);
        }

        private C18932a() {
        }

        public /* synthetic */ C18932a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void destroy() {
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void onPropsUpdated() {
        ((AbstractC19055d) this.mView).mo30341a();
        super.onPropsUpdated();
        System.out.println((Object) "LynxVideoManager- onPropsUpdated");
    }

    public LynxVideoManager(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28528p
    public final void getDuration(Callback callback) {
        int duration = ((AbstractC19055d) this.mView).getDuration();
        if (callback != null) {
            callback.invoke(0, Integer.valueOf(duration));
        }
    }

    @AbstractC28525m(mo49059a = "autolifecycle")
    public final void setAutoLifecycle(boolean z) {
        System.out.println((Object) "LynxVideoManager- autolifecycle -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setAutoLifecycle(z);
    }

    @AbstractC28525m(mo49059a = "autoplay")
    public final void setAutoPlay(boolean z) {
        System.out.println((Object) "LynxVideoManager- autoplay -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setAutoPlay(z);
    }

    @AbstractC28525m(mo49059a = "devicechangeaware")
    public final void setDeviceChangeAware(boolean z) {
        System.out.println((Object) "LynxVideoManager- devicechangeaware -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setDeviceChangeAware(z);
    }

    @AbstractC28525m(mo49059a = "inittime")
    public final void setInitTime(int i) {
        System.out.println((Object) "LynxVideoManager- inittime -> ".concat(String.valueOf(i)));
        ((AbstractC19055d) this.mView).setInitTime(i);
    }

    @AbstractC28525m(mo49059a = "loop")
    public final void setLoop(boolean z) {
        System.out.println((Object) "LynxVideoManager- loop -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setLoop(z);
    }

    @AbstractC28525m(mo49059a = "muted")
    public final void setMuted(boolean z) {
        System.out.println((Object) "LynxVideoManager- muted -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setMuted(z);
    }

    @AbstractC28525m(mo49059a = "objectfit")
    public final void setObjectFit(String str) {
        C89219l.m154719c(str, "");
        System.out.println((Object) "LynxVideoManager- objectfit -> ".concat(String.valueOf(str)));
        ((AbstractC19055d) this.mView).setObjectFit(str);
    }

    @AbstractC28525m(mo49059a = "performanceLog")
    public final void setPerformanceLog(String str) {
        System.out.println((Object) "LynxVideoManager- performanceLog -> ".concat(String.valueOf(str)));
        if (str != null) {
            ((AbstractC19055d) this.mView).setPerformanceLog(str);
        }
    }

    @AbstractC28525m(mo49059a = "preload")
    public final void setPreload(boolean z) {
        System.out.println((Object) "LynxVideoManager- preload -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setPreload(z);
    }

    @AbstractC28525m(mo49059a = "rate")
    public final void setRate(int i) {
        System.out.println((Object) "LynxVideoManager- rate -> ".concat(String.valueOf(i)));
        ((AbstractC19055d) this.mView).setRate(i);
    }

    @AbstractC28525m(mo49059a = "singleplayer")
    public final void setSinglePlayer(boolean z) {
        System.out.println((Object) "LynxVideoManager- singleplayer -> ".concat(String.valueOf(z)));
        ((AbstractC19055d) this.mView).setSinglePlayer(z);
    }

    @AbstractC28525m(mo49059a = "videoheight")
    public final void setVideoHeight(int i) {
        System.out.println((Object) "LynxVideoManager- videoheight -> ".concat(String.valueOf(i)));
        ((AbstractC19055d) this.mView).setVideoHeight(i);
    }

    @AbstractC28525m(mo49059a = "videowidth")
    public final void setVideoWidth(int i) {
        System.out.println((Object) "LynxVideoManager- videowidth -> ".concat(String.valueOf(i)));
        ((AbstractC19055d) this.mView).setVideoWidth(i);
    }

    @AbstractC28525m(mo49059a = "volume")
    public final void setVolume(float f) {
        System.out.println((Object) "LynxVideoManager- preload -> ".concat(String.valueOf(f)));
        ((AbstractC19055d) this.mView).setVolume(f);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        C19294m mVar = C19296n.C19297a.m36033a().f45599a;
        if (mVar == null) {
            C89219l.m154710a("localConfig");
        }
        AbstractC89172b<Context, AbstractC19055d> bVar = mVar.f45595a;
        if (bVar == null) {
            C89219l.m154707a();
        }
        if (context == null) {
            C89219l.m154707a();
        }
        AbstractC19055d invoke = bVar.invoke(context);
        invoke.setStateChangeReporter(new C18933b(this));
        return invoke;
    }

    @AbstractC28525m(mo49059a = "log-extra")
    public final void setLogExtra(ReadableMap readableMap) {
        System.out.println((Object) "LynxVideoManager- log-extra -> ".concat(String.valueOf(readableMap)));
        if (readableMap != null) {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            C89219l.m154709a((Object) hashMap, "");
            ((AbstractC19055d) this.mView).setLogExtra(hashMap);
        }
    }

    @AbstractC28525m(mo49059a = "poster")
    public final void setPoster(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null && C19249f.f45467b[h.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManager- poster -> " + aVar.mo48556e()));
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if (e.length() > 0) {
                String e2 = aVar.mo48556e();
                C89219l.m154709a((Object) e2, "");
                ((AbstractC19055d) this.mView).setPoster(e2);
                return;
            }
            return;
        }
        aVar.mo48559h().name();
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null && C19249f.f45466a[h.ordinal()] == 1) {
            System.out.println((Object) ("LynxVideoManager- src -> " + aVar.mo48556e()));
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if (e.length() > 0) {
                String e2 = aVar.mo48556e();
                C89219l.m154709a((Object) e2, "");
                ((AbstractC19055d) this.mView).setSrc(e2);
                return;
            }
            return;
        }
        aVar.mo48559h().name();
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
            int paddingLeft = ((AbstractC19055d) view).getPaddingLeft();
            View view2 = this.mView;
            C89219l.m154709a((Object) view2, "");
            int paddingRight = ((AbstractC19055d) view2).getPaddingRight();
            View view3 = this.mView;
            C89219l.m154709a((Object) view3, "");
            int paddingTop = ((AbstractC19055d) view3).getPaddingTop();
            View view4 = this.mView;
            C89219l.m154709a((Object) view4, "");
            int paddingBottom = ((AbstractC19055d) view4).getPaddingBottom();
            View view5 = this.mView;
            C89219l.m154709a((Object) view5, "");
            float width = (float) (((AbstractC19055d) view5).getWidth() + paddingLeft + paddingRight);
            View view6 = this.mView;
            C89219l.m154709a((Object) view6, "");
            d.mo49768a(width, (float) (((AbstractC19055d) view6).getHeight() + paddingTop + paddingBottom));
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
        ((AbstractC19055d) this.mView).setBorderRadius(fArr);
    }

    @AbstractC28525m(mo49059a = "__control")
    public final void setControl(String str) {
        List<String> b;
        AbstractC19055d dVar;
        JSONObject jSONObject;
        AbstractC19055d dVar2;
        System.out.println((Object) "LynxVideoManager- __control -> ".concat(String.valueOf(str)));
        if (str != null) {
            boolean z = true;
            if (C19250g.m35957a(str) && (b = C89361p.m154915b(str, new String[]{"_*_"})) != null && b.size() == 3 && 1 != 0) {
                List<String> b2 = C89361p.m154915b(str, new String[]{"_*_"});
                String str2 = b2.get(0);
                switch (str2.hashCode()) {
                    case -1879513255:
                        if (str2.equals("exitfullscreen")) {
                            ((AbstractC19055d) this.mView).mo30346d();
                            return;
                        }
                        return;
                    case -619198582:
                        if (str2.equals("requestfullscreen")) {
                            ((AbstractC19055d) this.mView).mo30345c();
                            return;
                        }
                        return;
                    case 3443508:
                        if (str2.equals("play") && (dVar = (AbstractC19055d) this.mView) != null) {
                            dVar.mo30343a(null);
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
                            AbstractC19055d dVar3 = (AbstractC19055d) this.mView;
                            if (dVar3 != null) {
                                int optInt = jSONObject.optInt("position", 0);
                                if (jSONObject.optInt("play") != 1) {
                                    z = false;
                                }
                                dVar3.mo30342a(optInt, z);
                                return;
                            }
                            return;
                        }
                        return;
                    case 106440182:
                        if (str2.equals("pause") && (dVar2 = (AbstractC19055d) this.mView) != null) {
                            dVar2.mo30344b();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxVideoManager$b */
    static final class C18933b extends AbstractC89220m implements AbstractC89187q<String, Map<String, ? extends Object>, AbstractC19055d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxVideoManager f44817a;

        static {
            Covode.recordClassIndex(21674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18933b(LynxVideoManager lynxVideoManager) {
            super(3);
            this.f44817a = lynxVideoManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
            if (r6.equals("onPlayFailed") != false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
            if (r6.equals("onError") != false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
            r7 = r3;
            r1 = "error";
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, com.bytedance.ies.xelement.AbstractC19055d r8) {
            /*
            // Method dump skipped, instructions count: 268
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxVideoManager.C18933b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
