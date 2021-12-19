package com.bytedance.android.live.publicscreen.impl.p396c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11639c;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.live.publicscreen.impl.c.c */
public final class C5910c implements AbstractC11639c {

    /* renamed from: a */
    public C5924f f14788a;

    /* renamed from: b */
    private IMessageManager f14789b;

    /* renamed from: c */
    private final String f14790c;

    /* renamed from: d */
    private final Context f14791d;

    /* renamed from: e */
    private final ViewGroup f14792e;

    /* renamed from: f */
    private final long f14793f;

    static {
        Covode.recordClassIndex(6518);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.c$b */
    public static final class C5912b implements AbstractC11844b {

        /* renamed from: a */
        final /* synthetic */ C5910c f14796a;

        /* renamed from: b */
        final /* synthetic */ int f14797b;

        static {
            Covode.recordClassIndex(6520);
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
        /* renamed from: a */
        public final void mo11776a() {
            C5924f fVar = this.f14796a.f14788a;
            if (fVar != null) {
                fVar.mo11784a(this.f14797b);
            }
            this.f14796a.mo11775b();
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
        /* renamed from: a */
        public final void mo11777a(Room room) {
            C5924f fVar = this.f14796a.f14788a;
            if (fVar != null) {
                fVar.setRoom(room);
            }
            C5924f fVar2 = this.f14796a.f14788a;
            if (fVar2 != null) {
                fVar2.mo11784a(this.f14797b);
            }
            this.f14796a.mo11775b();
        }

        C5912b(C5910c cVar, int i) {
            this.f14796a = cVar;
            this.f14797b = i;
        }
    }

    /* renamed from: b */
    public final void mo11775b() {
        try {
            IMessageManager iMessageManager = this.f14789b;
            if (iMessageManager != null) {
                iMessageManager.startMessage();
            }
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "exception_message", e.toString());
            C3868c.m9492a("feed_follow_live_message_exception", 0, jSONObject);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11639c
    /* renamed from: a */
    public final void mo11773a() {
        MethodCollector.m26663i(3884);
        IMessageManager iMessageManager = this.f14789b;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(true);
        }
        IMessageManager iMessageManager2 = this.f14789b;
        if (iMessageManager2 != null) {
            iMessageManager2.release();
        }
        C5924f fVar = this.f14788a;
        if (fVar != null) {
            AbstractC88412b bVar = fVar.f14832b;
            if (bVar != null) {
                bVar.dispose();
            }
            AbstractC88412b bVar2 = fVar.f14833c;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            AbstractC88412b bVar3 = fVar.f14834d;
            if (bVar3 != null) {
                bVar3.dispose();
            }
            AbstractC88412b bVar4 = fVar.f14835e;
            if (bVar4 != null) {
                bVar4.dispose();
            }
            ValueAnimator valueAnimator = fVar.f14837g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ViewGroup viewGroup = this.f14792e;
        if (viewGroup != null) {
            viewGroup.removeView(this.f14788a);
            MethodCollector.m26664o(3884);
            return;
        }
        MethodCollector.m26664o(3884);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.c$a */
    public static final class C5911a implements AbstractC11844b {

        /* renamed from: a */
        final /* synthetic */ C5910c f14794a;

        /* renamed from: b */
        final /* synthetic */ int f14795b;

        static {
            Covode.recordClassIndex(6519);
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
        /* renamed from: a */
        public final void mo11776a() {
        }

        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
        /* renamed from: a */
        public final void mo11777a(Room room) {
            C5924f fVar = this.f14794a.f14788a;
            if (fVar != null) {
                fVar.setRoom(room);
            }
            C5924f fVar2 = this.f14794a.f14788a;
            if (fVar2 != null) {
                fVar2.mo11784a(this.f14795b);
            }
        }

        C5911a(C5910c cVar, int i) {
            this.f14794a = cVar;
            this.f14795b = i;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11639c
    /* renamed from: a */
    public final void mo11774a(int i) {
        if (i == 1) {
            C7307f.m15215a(this.f14793f, new C5911a(this, i));
        } else if (i == 2) {
            C5924f fVar = this.f14788a;
            if (fVar != null) {
                fVar.mo11784a(i);
            }
            mo11775b();
        } else if (i == 3 || i == 4) {
            C7307f.m15215a(this.f14793f, new C5912b(this, i));
        }
    }

    public C5910c(Context context, ViewGroup viewGroup, long j) {
        MethodCollector.m26663i(3901);
        this.f14791d = context;
        this.f14792e = viewGroup;
        this.f14793f = j;
        String str = EnumC9596a.CHAT.getWsMethod() + "," + EnumC9596a.SCREEN.getWsMethod() + "," + EnumC9596a.MEMBER.getWsMethod();
        this.f14790c = str;
        if (context == null || viewGroup == null) {
            MethodCollector.m26664o(3901);
            return;
        }
        this.f14789b = ((IMessageService) C6193a.m13435a(IMessageService.class)).messageManagerProvider(j, context, str);
        C5924f fVar = new C5924f(context, this.f14789b);
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f14788a = fVar;
        viewGroup.addView(fVar);
        MethodCollector.m26664o(3901);
    }
}
