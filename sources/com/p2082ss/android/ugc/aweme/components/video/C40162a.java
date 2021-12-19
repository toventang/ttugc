package com.p2082ss.android.ugc.aweme.components.video;

import com.bytedance.covode.number.Covode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.p2082ss.android.ugc.aweme.components.C40161b;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.components.video.a */
public final class C40162a extends Event<C40162a> {

    /* renamed from: a */
    public static final C40163a f94277a = new C40163a((byte) 0);

    /* renamed from: b */
    private final String f94278b;

    /* renamed from: c */
    private final Map<String, Object> f94279c;

    static {
        Covode.recordClassIndex(47948);
    }

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.a$a */
    public static final class C40163a {
        static {
            Covode.recordClassIndex(47949);
        }

        private C40163a() {
        }

        public /* synthetic */ C40163a(byte b) {
            this();
        }
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        C89219l.m154721d(rCTEventEmitter, "");
        int viewTag = getViewTag();
        String eventName = getEventName();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("state", this.f94278b);
        Map<String, Object> map = this.f94279c;
        if (map != null && (!map.isEmpty())) {
            createMap.putMap("data", C40161b.m81241a(this.f94279c));
        }
        C89219l.m154716b(createMap, "");
        rCTEventEmitter.receiveEvent(viewTag, eventName, createMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40162a(int i, String str, Map<String, ? extends Object> map) {
        super(i);
        C89219l.m154721d(str, "");
        this.f94278b = str;
        this.f94279c = map;
    }
}
