package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.net.C39155j;
import com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.b */
public final class C22738b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C22739a f53714a = new C22739a((byte) 0);

    static {
        Covode.recordClassIndex(26631);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(198, new RunnableC90250g(C22738b.class, "onReceivedMsgEvent", C39155j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainactivity.b$a */
    public static final class C22739a {
        static {
            Covode.recordClassIndex(26632);
        }

        private C22739a() {
        }

        public /* synthetic */ C22739a(byte b) {
            this();
        }
    }

    @AbstractC90264r
    public final void onReceivedMsgEvent(C39155j jVar) {
        C89219l.m154721d(jVar, "");
        String.valueOf(jVar.f92369a.f191971e);
        try {
            if ((jVar.f92369a.f191971e == 20216 || jVar.f92369a.f191971e == 20173) && jVar.f92369a.f191970d == 1) {
                byte[] bArr = jVar.f92369a.f191968b;
                C89219l.m154716b(bArr, "");
                JSONObject jSONObject = new JSONObject(new String(bArr, C89338d.f202990a));
                ReplaceMusicServiceImpl.m143543a().showWindow(jSONObject, jSONObject.getBoolean("success"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
