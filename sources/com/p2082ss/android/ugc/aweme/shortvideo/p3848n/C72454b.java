package com.p2082ss.android.ugc.aweme.shortvideo.p3848n;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b */
public final class C72454b {

    /* renamed from: c */
    public static final C72454b f162433c = new C72454b();

    /* renamed from: d */
    public static final C72455a f162434d = new C72455a((byte) 0);

    /* renamed from: a */
    public Effect f162435a;

    /* renamed from: b */
    public int f162436b = -1;

    /* renamed from: e */
    private AbstractC46415f f162437e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b$b */
    public static final class C72456b implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ C72454b f162438a;

        /* renamed from: b */
        final /* synthetic */ C1213t f162439b;

        static {
            Covode.recordClassIndex(85131);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b$b$a */
        public static final class C72457a implements IFetchEffectListener {
            static {
                Covode.recordClassIndex(85132);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
            }

            C72457a() {
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f162439b.setValue(C35324a.m72279a(C35324a.EnumC35325a.ERROR, (Object) null));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            List<Effect> list2 = list;
            if (C14796b.m27161a(list2)) {
                this.f162439b.setValue(C35324a.m72279a(C35324a.EnumC35325a.ERROR, (Object) null));
                return;
            }
            if (list2 == null) {
                C89219l.m154715b();
            }
            boolean z = false;
            if (list2.get(0) == null) {
                this.f162439b.setValue(C35324a.m72279a(C35324a.EnumC35325a.ERROR, (Object) null));
                return;
            }
            this.f162438a.f162435a = list2.get(0);
            this.f162438a.f162436b = 2;
            if (this.f162438a.f162435a != null) {
                z = true;
            }
            this.f162439b.setValue(C35324a.m72279a(C35324a.EnumC35325a.SUCCESS, new C89378p(Boolean.valueOf(z), 2)));
            C72454b.m127835a(this.f162438a).mo78887a(this.f162438a.f162435a, new C72457a());
        }

        C72456b(C72454b bVar, C1213t tVar) {
            this.f162438a = bVar;
            this.f162439b = tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.b$a */
    public static final class C72455a {
        static {
            Covode.recordClassIndex(85130);
        }

        private C72455a() {
        }

        public /* synthetic */ C72455a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114728a() {
        this.f162435a = null;
        this.f162436b = -1;
        AbstractC46415f fVar = this.f162437e;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f162437e = null;
    }

    static {
        Covode.recordClassIndex(85129);
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC46415f m127835a(C72454b bVar) {
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        if (bVar.f162437e == null) {
            bVar.f162437e = C46404c.m89554a(application, null);
        }
        AbstractC46415f fVar = bVar.f162437e;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.IEffectPlatform");
        return fVar;
    }

    /* renamed from: b */
    private static String m127836b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString("live_sticker_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final LiveData<C35324a<C89378p<Boolean, Integer>>> mo114727a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(m127836b(str))) {
            new C1213t().setValue(C35324a.m72279a(C35324a.EnumC35325a.ERROR, (Object) null));
            return new C1213t();
        }
        String b = m127836b(str);
        C1213t tVar = new C1213t();
        if (b == null || b.length() == 0) {
            return tVar;
        }
        m127835a(this).mo78912a(C89070n.m154524c(b), (Map<String, String>) null, false, (IFetchEffectListListener) new C72456b(this, tVar));
        return tVar;
    }
}
