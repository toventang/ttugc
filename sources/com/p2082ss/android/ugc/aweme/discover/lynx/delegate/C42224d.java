package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.C42261b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.d */
public final class C42224d extends C42217a {

    /* renamed from: c */
    public static final C42225a f98395c = new C42225a((byte) 0);

    /* renamed from: d */
    private final LifecycleDelegate f98396d;

    static {
        Covode.recordClassIndex(50166);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.d$a */
    public static final class C42225a {
        static {
            Covode.recordClassIndex(50167);
        }

        private C42225a() {
        }

        public /* synthetic */ C42225a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42261b m84515a(Context context) {
            C89219l.m154721d(context, "");
            return new C42261b(context);
        }
    }

    /* renamed from: d */
    public final void mo71434d() {
        LynxView lynxView = this.f98388b.f98322d;
        if (lynxView != null) {
            lynxView.onEnterBackground();
        }
        LifecycleDelegate lifecycleDelegate = this.f98396d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "recycled");
        lifecycleDelegate.mo71421a("pageScroll", jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42224d(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        LifecycleDelegate lifecycleDelegate = new LifecycleDelegate(bVar);
        this.f98396d = lifecycleDelegate;
        mo71430a(new C42246j(bVar));
        mo71430a(lifecycleDelegate);
    }
}
