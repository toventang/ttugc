package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.ies.xelement.p1364b.AbstractC19000e;
import com.bytedance.ies.xelement.p1364b.AbstractC19003f;
import com.bytedance.ies.xelement.p1364b.AbstractC19006i;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.bytedance.ies.xelement.p1364b.EnumC19005h;
import com.bytedance.ies.xelement.p1364b.EnumC19010k;
import com.bytedance.ies.xelement.p1364b.EnumC19011l;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28725c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxAudio extends UISimpleView<AbstractC19006i> implements AbstractC18997c.AbstractC18998a, AbstractC19000e.AbstractC19001a, AbstractC19006i.AbstractC19008b {

    /* renamed from: b */
    public static final C18912a f44759b = new C18912a((byte) 0);

    /* renamed from: e */
    private static final String f44760e = LynxAudio.class.getSimpleName();

    /* renamed from: a */
    public AbstractC19003f f44761a;

    /* renamed from: c */
    private AbstractC18997c f44762c;

    /* renamed from: d */
    private Long f44763d = 0L;

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c.AbstractC18998a
    /* renamed from: c */
    public final void mo29904c() {
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            switch (nextKey.hashCode()) {
                case -1669980826:
                    if (nextKey.equals("nativecontrol")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSupportNativeControl(z);
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSrc(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3322014:
                    if (nextKey.equals("list")) {
                        setList(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3327652:
                    if (nextKey.equals("loop")) {
                        setLoop(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1197813673:
                    if (nextKey.equals("nativeplugins")) {
                        setNativePlugins(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        isAutoPlay(z);
                        continue;
                    }
                    break;
                case 1629011506:
                    if (nextKey.equals("focusable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSupportFocusable(z);
                        continue;
                    }
                    break;
                case 2095859131:
                    if (nextKey.equals("playerType")) {
                        setPlayerType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.LynxAudio$a */
    public static final class C18912a {
        static {
            Covode.recordClassIndex(21626);
        }

        private C18912a() {
        }

        public /* synthetic */ C18912a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19006i.AbstractC19008b
    /* renamed from: b */
    public final void mo29902b() {
        AbstractC18997c cVar = this.f44762c;
        if (cVar != null) {
            cVar.mo30152b(this);
        }
    }

    static {
        Covode.recordClassIndex(21623);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29896a() {
        C28719c cVar;
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            cVar.mo49834a(new C28725c(getSign(), "listchange"));
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void destroy() {
        AbstractC19000e player;
        super.destroy();
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.mo30166b();
        }
    }

    public LynxAudio(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29901a(String str) {
        C28719c cVar;
        C89219l.m154719c(str, "");
        C19004g.f44970a.mo30155a(f44760e, "onCurrentSrcChanged -> ".concat(String.valueOf(str)));
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), "srcchange");
            cVar2.mo49838a("currentSrcID", str);
            cVar.mo49834a(cVar2);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: b */
    public final void mo29903b(int i) {
        C28719c cVar;
        String str;
        AbstractC19000e player;
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), "seek");
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (str = player.mo30179k()) == null) {
                str = "";
            }
            cVar2.mo49838a("currentSrcID", str);
            cVar2.mo49838a("currentTime", Integer.valueOf(i));
            cVar.mo49834a(cVar2);
        }
    }

    @AbstractC28528p
    public final void currentSrcID(Callback callback) {
        String str;
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Getter method: -> currentSrcID");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                str = null;
            } else {
                str = player.mo30179k();
            }
            javaOnlyMap.put("currentSrcID", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @AbstractC28528p
    public final void currentTime(Callback callback) {
        Integer num;
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Getter method: -> currentTime");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(player.mo30175g());
            }
            javaOnlyMap.put("currentTime", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @AbstractC28528p
    public final void duration(Callback callback) {
        Integer num;
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Getter method: -> duration");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(player.mo30174f());
            }
            javaOnlyMap.put("duration", num);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @AbstractC28525m(mo49059a = "autoplay")
    public final void isAutoPlay(boolean z) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "isAutoPlay -> ".concat(String.valueOf(z)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.mo30165a(z);
        }
    }

    @AbstractC28528p
    public final void pause(Callback callback) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Control method: --> pause()");
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.mo30172d();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @AbstractC28528p
    public final void play(Callback callback) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Control method: --> play()");
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.mo30169c();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @AbstractC28528p
    public final void playBitrate(Callback callback) {
        Long l;
        AbstractC19000e player;
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                l = null;
            } else {
                l = Long.valueOf(player.mo30177i());
            }
            javaOnlyMap.put("playBitrate", l);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @AbstractC28525m(mo49059a = "list")
    public final void setList(String str) {
        AbstractC19000e player;
        if (str != null) {
            System.out.println((Object) (f44760e + "- list -> " + str));
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar != null && (player = iVar.getPlayer()) != null) {
                player.mo30164a(str);
            }
        }
    }

    @AbstractC28525m(mo49059a = "src")
    public final void setSrc(String str) {
        AbstractC19006i iVar;
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "setSrc -> ".concat(String.valueOf(str)));
        if (str != null && str.length() > 0 && (iVar = (AbstractC19006i) this.mView) != null && (player = iVar.getPlayer()) != null) {
            player.mo30167b(str);
        }
    }

    @AbstractC28525m(mo49059a = "focusable")
    public final void setSupportFocusable(boolean z) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "setSupportFocusable -> ".concat(String.valueOf(z)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.mo30171c(z);
        }
    }

    @AbstractC28525m(mo49059a = "nativecontrol")
    public final void setSupportNativeControl(boolean z) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "setSupportNativeControl -> ".concat(String.valueOf(z)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.mo30168b(z);
        }
    }

    @AbstractC28528p
    public final void status(Callback callback) {
        String str;
        AbstractC19000e player;
        EnumC19010k j;
        C19004g.f44970a.mo30155a(f44760e, "Getter method: -> status");
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (j = player.mo30178j()) == null) {
                str = null;
            } else {
                str = j.getDesc();
            }
            javaOnlyMap.put("status", str);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @AbstractC28528p
    public final void stop(Callback callback) {
        AbstractC19000e player;
        C19004g.f44970a.mo30155a(f44760e, "Control method: --> stop()");
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.mo30173e();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @AbstractC28528p
    public final void cacheTime(Callback callback) {
        Long l;
        AbstractC19000e player;
        System.out.println((Object) (f44760e + " Getter method: cacheTime"));
        if (callback != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null) {
                l = null;
            } else {
                l = Long.valueOf(player.mo30176h());
            }
            javaOnlyMap.put("cacheTime", l);
            objArr[1] = javaOnlyMap;
            callback.invoke(objArr);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        AbstractC19006i a = C19292l.f45592c.mo30188a(context);
        AbstractC19000e.AbstractC19002b bVar = C19292l.f45591b;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154709a((Object) applicationContext, "");
        AbstractC28520j jVar = this.mContext;
        C89219l.m154709a((Object) jVar, "");
        AbstractC19000e a2 = bVar.mo30180a(applicationContext, jVar, getSign());
        a2.mo30160a(this);
        AbstractC19003f fVar = this.f44761a;
        if (fVar != null) {
            a2.mo30161a(fVar);
        }
        a.setPlayer(a2);
        a.setLifecycle(this);
        AbstractC19000e eVar = a.f44974a;
        if (eVar == null) {
            return a;
        }
        eVar.mo30158a();
        return a;
    }

    @AbstractC28525m(mo49059a = "loop")
    public final void setLoop(String str) {
        AbstractC19000e player;
        EnumC19005h hVar;
        C89219l.m154719c(str, "");
        C19004g.f44970a.mo30155a(f44760e, "setLoop -> ".concat(String.valueOf(str)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            if (C89219l.m154714a((Object) str, (Object) EnumC19005h.SINGLE.getDesc())) {
                hVar = EnumC19005h.SINGLE;
            } else if (C89219l.m154714a((Object) str, (Object) EnumC19005h.LIST.getDesc())) {
                hVar = EnumC19005h.LIST;
            } else {
                hVar = EnumC19005h.ORDER;
            }
            player.mo30162a(hVar);
        }
    }

    @AbstractC28525m(mo49059a = "nativeplugins")
    public final void setNativePlugins(String str) {
        AbstractC19000e player;
        C89219l.m154719c(str, "");
        C19004g gVar = C19004g.f44970a;
        String str2 = f44760e;
        gVar.mo30155a(str2, "setNativePlugins -> ".concat(String.valueOf(str)));
        System.out.println((Object) (str2 + "- nativeplugins -> " + str));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            player.mo30170c(str);
        }
    }

    @AbstractC28525m(mo49059a = "playerType")
    public final void setPlayerType(String str) {
        AbstractC19000e player;
        EnumC19011l lVar;
        C89219l.m154719c(str, "");
        C19004g.f44970a.mo30155a(f44760e, "setPlayerType -> ".concat(String.valueOf(str)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (iVar != null && (player = iVar.getPlayer()) != null) {
            if (C89219l.m154714a((Object) str, (Object) EnumC19011l.DEFAULT.getDesc()) || (!C89219l.m154714a((Object) str, (Object) EnumC19011l.SHORT.getDesc()) && !C89219l.m154714a((Object) str, (Object) EnumC19011l.LIGHT.getDesc()))) {
                lVar = EnumC19011l.DEFAULT;
            } else {
                lVar = EnumC19011l.LIGHT;
            }
            player.mo30163a(lVar);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29897a(int i) {
        C28719c cVar;
        String str;
        Long l;
        AbstractC19000e player;
        String k;
        AbstractC19000e player2;
        AbstractC19000e player3;
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), "timeupdate");
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            String str2 = "";
            if (iVar == null || (player3 = iVar.getPlayer()) == null || (str = player3.mo30179k()) == null) {
                str = str2;
            }
            cVar2.mo49838a("currentSrcID", str);
            cVar2.mo49838a("currentTime", Integer.valueOf(i));
            cVar.mo49834a(cVar2);
            AbstractC19006i iVar2 = (AbstractC19006i) this.mView;
            if (iVar2 == null || (player2 = iVar2.getPlayer()) == null) {
                l = null;
            } else {
                l = Long.valueOf(player2.mo30176h());
            }
            if (!C89219l.m154714a(l, this.f44763d)) {
                this.f44763d = l;
                C28725c cVar3 = new C28725c(getSign(), "cachetimeupdate");
                AbstractC19006i iVar3 = (AbstractC19006i) this.mView;
                if (!(iVar3 == null || (player = iVar3.getPlayer()) == null || (k = player.mo30179k()) == null)) {
                    str2 = k;
                }
                cVar3.mo49838a("currentSrcID", str2);
                cVar3.mo49838a("cacheTime", l);
                cVar.mo49834a(cVar3);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29899a(EnumC19010k kVar) {
        String str;
        C28719c cVar;
        String str2;
        AbstractC19000e player;
        String k;
        AbstractC19000e player2;
        String str3 = "";
        C89219l.m154719c(kVar, str3);
        C19004g.f44970a.mo30155a(f44760e, "onPlaybackStateChanged -> " + kVar.name());
        switch (C19248e.f45465a[kVar.ordinal()]) {
            case 1:
            case 2:
                str = "play";
                break;
            case 3:
                str = "pause";
                break;
            case 4:
                str = "error";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                str = "stop";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                str = "ended";
                break;
            default:
                throw new C89376n();
        }
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), str);
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player2 = iVar.getPlayer()) == null || (str2 = player2.mo30179k()) == null) {
                str2 = str3;
            }
            cVar2.mo49838a("currentSrcID", str2);
            cVar2.mo49838a("status", kVar.getDesc());
            cVar.mo49834a(cVar2);
            C28725c cVar3 = new C28725c(getSign(), "statuschange");
            AbstractC19006i iVar2 = (AbstractC19006i) this.mView;
            if (!(iVar2 == null || (player = iVar2.getPlayer()) == null || (k = player.mo30179k()) == null)) {
                str3 = k;
            }
            cVar3.mo49838a("currentSrcID", str3);
            cVar3.mo49838a("status", kVar.getDesc());
            cVar.mo49834a(cVar3);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29900a(EnumC19167l lVar) {
        C28719c cVar;
        C89219l.m154719c(lVar, "");
        System.out.println((Object) (f44760e + "- onLoadStateChanged, state:" + lVar));
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), "loadstatechanged");
            cVar2.mo49838a("loadState", lVar.name());
            cVar.mo49834a(cVar2);
        }
    }

    @AbstractC28528p
    public final void seek(ReadableMap readableMap, Callback callback) {
        AbstractC19000e player;
        C89219l.m154719c(readableMap, "");
        int i = readableMap.getInt("currentTime", 0);
        C19004g.f44970a.mo30155a(f44760e, "Control method: --> seek(), param is: ".concat(String.valueOf(i)));
        AbstractC19006i iVar = (AbstractC19006i) this.mView;
        if (!(iVar == null || (player = iVar.getPlayer()) == null)) {
            player.mo30159a(i);
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e.AbstractC19001a
    /* renamed from: a */
    public final void mo29898a(int i, String str) {
        C28719c cVar;
        String str2;
        AbstractC19000e player;
        C19004g.f44970a.mo30157c(f44760e, "onError -> " + i + ", " + str);
        AbstractC28520j jVar = this.mContext;
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(getSign(), "error");
            AbstractC19006i iVar = (AbstractC19006i) this.mView;
            if (iVar == null || (player = iVar.getPlayer()) == null || (str2 = player.mo30179k()) == null) {
                str2 = "";
            }
            cVar2.mo49838a("currentSrcID", str2);
            cVar2.mo49838a("code", Integer.valueOf(i));
            if (str == null) {
                str = "";
            }
            cVar2.mo49838a("msg", str);
            cVar.mo49834a(cVar2);
        }
    }
}
