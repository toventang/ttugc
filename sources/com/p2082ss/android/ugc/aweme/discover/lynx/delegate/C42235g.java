package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.g */
public final class C42235g extends AbstractC42218b implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    public static final C42236a f98407a = new C42236a((byte) 0);

    /* renamed from: c */
    private EventCenter f98408c;

    static {
        Covode.recordClassIndex(50177);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.g$a */
    public static final class C42236a {
        static {
            Covode.recordClassIndex(50178);
        }

        private C42236a() {
        }

        public /* synthetic */ C42236a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42235g(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        ActivityC0945e eVar = bVar.f98319a;
        if (eVar != null) {
            EventCenter eventCenter = (EventCenter) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(EventCenter.class);
            this.f98408c = eventCenter;
            if (eventCenter != null && !TextUtils.isEmpty("mix_feed_fragment_status")) {
                eventCenter.mo60194b("mix_feed_fragment_status").mo60213a(eVar, this, false);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        Boolean bool;
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && C89219l.m154714a((Object) bVar2.f80277a, (Object) "mix_feed_fragment_status") && (bool = (Boolean) bVar2.mo60212a()) != null) {
            if (bool.booleanValue()) {
                str = "viewAppear";
            } else {
                str = "viewDisappear";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", "mix");
            C89219l.m154721d(str, "");
            C89219l.m154721d(jSONObject, "");
            this.f98388b.mo71386a(str, jSONObject);
        }
    }
}
