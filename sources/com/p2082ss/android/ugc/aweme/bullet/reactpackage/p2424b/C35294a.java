package com.p2082ss.android.ugc.aweme.bullet.reactpackage.p2424b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16457c;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e;
import com.bytedance.ies.xelement.AbstractC19055d;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.p2082ss.android.ugc.aweme.components.video.C40162a;
import com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.b.a */
public final class C35294a extends AbstractC16459e<DeclarativeVideoPlayBox> {

    /* renamed from: a */
    public static final C35295a f83313a = new C35295a((byte) 0);

    static {
        Covode.recordClassIndex(42460);
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: a */
    public final String mo26108a() {
        return "x_video_player";
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.b.a$a */
    public static final class C35295a {
        static {
            Covode.recordClassIndex(42461);
        }

        private C35295a() {
        }

        public /* synthetic */ C35295a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: b */
    public final Map<String, Integer> mo26112b() {
        HashMap hashMap = new HashMap();
        hashMap.put("zoom", 4);
        hashMap.put("play", 1);
        hashMap.put("pause", 2);
        hashMap.put("seek", 3);
        return hashMap;
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: a */
    public final /* synthetic */ DeclarativeVideoPlayBox mo26107a(AbstractC16457c cVar) {
        C89219l.m154721d(cVar, "");
        return new DeclarativeVideoPlayBox(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: a */
    public final /* synthetic */ void mo26109a(DeclarativeVideoPlayBox declarativeVideoPlayBox) {
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        C89219l.m154721d(declarativeVideoPlayBox2, "");
        super.mo26109a(declarativeVideoPlayBox2);
        declarativeVideoPlayBox2.mo30341a();
        System.out.println((Object) "BulletXVideoViewManager- onPropsUpdateOnce");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.bullet.kit.rn.core.c, android.view.View] */
    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: a */
    public final /* synthetic */ void mo26111a(AbstractC16457c cVar, DeclarativeVideoPlayBox declarativeVideoPlayBox) {
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(declarativeVideoPlayBox2, "");
        super.mo26111a(cVar, declarativeVideoPlayBox2);
        declarativeVideoPlayBox2.setStateChangeReporter(C35296b.f83314a);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.b.a$b */
    static final class C35296b extends AbstractC89220m implements AbstractC89187q<String, Map<String, ? extends Object>, AbstractC19055d, C89391z> {

        /* renamed from: a */
        public static final C35296b f83314a = new C35296b();

        static {
            Covode.recordClassIndex(42462);
        }

        C35296b() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, Map<String, ? extends Object> map, AbstractC19055d dVar) {
            UIManagerModule uIManagerModule;
            EventDispatcher eventDispatcher;
            String str2 = str;
            Map<String, ? extends Object> map2 = map;
            AbstractC19055d dVar2 = dVar;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map2, "");
            C89219l.m154721d(dVar2, "");
            AbstractC16457c cVar = (AbstractC16457c) dVar2.getContext();
            if (!(cVar == null || (uIManagerModule = (UIManagerModule) cVar.mo26104a(UIManagerModule.class)) == null || (eventDispatcher = uIManagerModule.getEventDispatcher()) == null)) {
                eventDispatcher.dispatchEvent(new C40162a(dVar2.getId(), str2, map2));
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, int, java.util.List] */
    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e
    /* renamed from: a */
    public final /* synthetic */ void mo26110a(DeclarativeVideoPlayBox declarativeVideoPlayBox, int i, List list) {
        Object obj;
        DeclarativeVideoPlayBox declarativeVideoPlayBox2 = declarativeVideoPlayBox;
        C89219l.m154721d(declarativeVideoPlayBox2, "");
        if (i == 1) {
            System.out.println((Object) "BulletXVideoViewManager- play");
            declarativeVideoPlayBox2.mo30343a((AbstractC89171a<C89391z>) null);
        } else if (i == 2) {
            System.out.println((Object) "BulletXVideoViewManager- pause");
            declarativeVideoPlayBox2.mo30344b();
        } else if (i != 3) {
            if (i == 4) {
                System.out.println((Object) "BulletXVideoViewManager- performZoom");
                declarativeVideoPlayBox2.mo30345c();
            }
        } else if (list != null && (!list.isEmpty()) && (obj = list.get(0)) != null && (obj instanceof String)) {
            System.out.println((Object) "BulletXVideoViewManager- seek ".concat(String.valueOf(obj)));
            JSONObject jSONObject = new JSONObject((String) obj);
            declarativeVideoPlayBox2.mo30342a(jSONObject.optInt("seekTime", 0), jSONObject.optBoolean("play", false));
        }
    }
}
