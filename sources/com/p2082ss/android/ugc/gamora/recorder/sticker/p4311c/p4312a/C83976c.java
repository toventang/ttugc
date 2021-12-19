package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76087c;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c */
public final class C83976c implements AbstractC84011c {

    /* renamed from: a */
    public final SafeHandler f187456a;

    /* renamed from: b */
    final AbstractC89171a<C83977a> f187457b;

    /* renamed from: c */
    public final ActivityC0218d f187458c;

    /* renamed from: d */
    public final AbstractC84089j f187459d;

    /* renamed from: e */
    public final ShortVideoContext f187460e;

    /* renamed from: f */
    private final C2563k<Effect> f187461f = new C2563k<>();

    /* renamed from: g */
    private final C71922a f187462g;

    static {
        Covode.recordClassIndex(97869);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: a */
    public final C2559g<Effect> mo128841a() {
        return this.f187461f;
    }

    /* renamed from: e */
    private final String m144435e() {
        String str = this.f187457b.invoke().f187464b;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    private final List<String> m144436f() {
        return this.f187457b.invoke().f187466d;
    }

    /* renamed from: d */
    public final String mo128851d() {
        String str = this.f187457b.invoke().f187463a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c */
    public static final class C83979c implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C83976c f187470a;

        /* renamed from: b */
        final /* synthetic */ Map f187471b;

        /* renamed from: c */
        final /* synthetic */ StringBuilder f187472c;

        static {
            Covode.recordClassIndex(97872);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c$a */
        public static final class C83980a implements IFetchEffectListListener {

            /* renamed from: a */
            final /* synthetic */ C83979c f187473a;

            /* renamed from: b */
            final /* synthetic */ EffectListResponse f187474b;

            static {
                Covode.recordClassIndex(97873);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
            }

            /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$c$a$a */
            static final class RunnableC83981a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C83980a f187475a;

                static {
                    Covode.recordClassIndex(97874);
                }

                RunnableC83981a(C83980a aVar) {
                    this.f187475a = aVar;
                }

                public final void run() {
                    this.f187475a.f187473a.f187470a.mo128849a(this.f187475a.f187474b, this.f187475a.f187473a.f187472c);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(List<Effect> list) {
                C89219l.m154721d(list, "");
                if (!this.f187473a.f187470a.f187457b.invoke().f187467e) {
                    this.f187473a.f187470a.f187456a.postDelayed(new RunnableC83981a(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                } else {
                    this.f187473a.f187470a.mo128849a(this.f187474b, this.f187473a.f187472c);
                }
            }

            C83980a(C83979c cVar, EffectListResponse effectListResponse) {
                this.f187473a = cVar;
                this.f187474b = effectListResponse;
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            Exception exception = exceptionResult.getException();
            if (exception != null) {
                exception.printStackTrace();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            String sb;
            String str;
            EffectListResponse effectListResponse2 = effectListResponse;
            C89219l.m154721d(effectListResponse2, "");
            if (this.f187470a.mo128851d().equals("draft")) {
                ShortVideoContext shortVideoContext = this.f187470a.f187460e;
                List<Effect> data = effectListResponse2.getData();
                if (C84904k.m145909a(data)) {
                    sb = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Effect effect : data) {
                        String effectId = effect.getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            if (sb2.length() == 0) {
                                str = "";
                            } else {
                                str = ",";
                            }
                            sb2.append(str).append(effectId);
                        }
                    }
                    sb = sb2.toString();
                    if (sb == null) {
                        sb = "";
                    }
                }
                shortVideoContext.f155834s = sb;
            }
            AbstractC84089j jVar = this.f187470a.f187459d;
            String effectId2 = ((EffectTemplate) C89070n.m154579f((List) effectListResponse2.getData())).getEffectId();
            Map<String, String> map = this.f187471b;
            C83980a aVar = new C83980a(this, effectListResponse2);
            C89219l.m154721d(jVar, "");
            C89219l.m154721d(effectId2, "");
            jVar.mo23167t().mo119286a(C89070n.m154516a(effectId2), map, aVar);
        }

        C83979c(C83976c cVar, Map map, StringBuilder sb) {
            this.f187470a = cVar;
            this.f187471b = map;
            this.f187472c = sb;
        }
    }

    /* renamed from: g */
    private final Map<String, String> m144437g() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene", mo128851d());
        String e = m144435e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("grade_key", e);
        }
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: c */
    public final String mo128847c() {
        List<String> f = m144436f();
        if (f == null || f.isEmpty()) {
            return "";
        }
        Iterator<String> it = f.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: b */
    public final void mo128845b() {
        List<String> f = m144436f();
        if (!(f == null || f.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            sb.append(f.get(0));
            int size = f.size();
            for (int i = 1; i < size; i++) {
                sb.append(",").append(f.get(i));
            }
            Map<String, String> g = m144437g();
            C75346e.m132158a(this.f187459d, f, g, new C83979c(this, g, sb));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$d */
    public static final class C83982d implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C83976c f187476a;

        /* renamed from: b */
        final /* synthetic */ Map f187477b;

        static {
            Covode.recordClassIndex(97875);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$d$a */
        public static final class C83983a implements AbstractC75374c.AbstractC75375a {

            /* renamed from: a */
            final /* synthetic */ C83982d f187478a;

            static {
                Covode.recordClassIndex(97876);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
            /* renamed from: a */
            public final void mo118618a(Effect effect, int i) {
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
            /* renamed from: b */
            public final void mo118620b(Effect effect) {
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
            /* renamed from: c */
            public final void mo118621c(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C83983a(C83982d dVar) {
                this.f187478a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
            /* renamed from: a */
            public final void mo118619a(Effect effect, ExceptionResult exceptionResult) {
                Exception exception;
                if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                    exception.printStackTrace();
                }
                C85041d.m146226b(this.f187478a.f187476a.f187458c, R.string.g41).mo129984b();
                AbstractC14333c cVar = (AbstractC14333c) ApiCenter.C2545a.m7450a(this.f187478a.f187476a.f187458c).mo7015b(AbstractC14333c.class);
                if (cVar != null) {
                    cVar.mo23139a(true);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            int i;
            C89219l.m154721d(exceptionResult, "");
            switch (exceptionResult.getErrorCode()) {
                case 2002:
                case 2004:
                    i = R.string.blg;
                    break;
                case 2003:
                    i = R.string.b6b;
                    break;
                case 2005:
                default:
                    i = R.string.bqd;
                    break;
                case 2006:
                    i = R.string.h2p;
                    break;
            }
            C85041d.m146226b(this.f187476a.f187458c, i).mo129984b();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            C83983a aVar;
            EffectListResponse effectListResponse2 = effectListResponse;
            C89219l.m154721d(effectListResponse2, "");
            this.f187476a.f187459d.mo128895C().mo128856a(effectListResponse2.getUrlPrefix());
            List<Effect> data = effectListResponse2.getData();
            if (!C13617h.m24465a(data)) {
                Effect effect = data.get(0);
                AbstractC84089j jVar = this.f187476a.f187459d;
                boolean z = this.f187476a.f187460e.f155758S;
                if (C75466g.m132345a(effect)) {
                    aVar = null;
                } else {
                    aVar = new C83983a(this);
                }
                C75346e.m132159a(jVar, data, z, true, aVar, 0, null, 480);
                this.f187476a.mo128850b(effect);
            }
        }

        C83982d(C83976c cVar, Map map) {
            this.f187476a = cVar;
            this.f187477b = map;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$b */
    public static final class C83978b implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C83976c f187468a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f187469b;

        static {
            Covode.recordClassIndex(97871);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f187469b.invoke(null);
            Exception exception = exceptionResult.getException();
            if (exception != null) {
                exception.printStackTrace();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            EffectListResponse effectListResponse2 = effectListResponse;
            C89219l.m154721d(effectListResponse2, "");
            this.f187468a.f187459d.mo128895C().mo128856a(effectListResponse2.getUrlPrefix());
            List g = C89070n.m154585g((Collection) effectListResponse2.getData());
            if (!g.isEmpty() && !TextUtils.equals(this.f187468a.mo128851d(), "qrcode") && C72847c.m128636c((Effect) C89070n.m154579f(g)) && !C76086b.m133424a((Effect) C89070n.m154579f(g))) {
                g.remove(0);
            }
            if (g.isEmpty()) {
                this.f187469b.invoke(null);
                return;
            }
            if (C13617h.m24466b(effectListResponse2.getCollection())) {
                C75346e.m132157a(this.f187468a.f187459d, effectListResponse2.getCollection());
            }
            Iterator it = g.iterator();
            HashSet hashSet = new HashSet();
            while (it.hasNext()) {
                String parentId = ((EffectTemplate) it.next()).getParentId();
                if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                    it.remove();
                }
            }
            C75346e.m132159a(this.f187468a.f187459d, g, true, false, null, 0, null, 504);
            Effect effect = (Effect) C89070n.m154583g(g);
            if (effect != null) {
                this.f187468a.mo128850b(effect);
            }
            this.f187469b.invoke(C89070n.m154583g(g));
        }

        C83978b(C83976c cVar, AbstractC89172b bVar) {
            this.f187468a = cVar;
            this.f187469b = bVar;
        }
    }

    /* renamed from: b */
    public final void mo128850b(Effect effect) {
        if (C72847c.m128636c(effect)) {
            C76087c.m133426a().mo119821a(effect);
            this.f187461f.mo6999a(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: a */
    public final void mo128842a(String str) {
        if (str != null && str.length() != 0) {
            ArrayList<String> a = C75466g.m132343a(str);
            C89219l.m154716b(a, "");
            Map<String, String> g = m144437g();
            AbstractC84089j jVar = this.f187459d;
            C71922a aVar = this.f187462g;
            C83982d dVar = new C83982d(this, g);
            C89219l.m154721d(dVar, "");
            C75346e.m132158a(jVar, a, g, new C71922a.C71923a(aVar, dVar));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: b */
    public final boolean mo128846b(String str) {
        ArrayList<String> arrayList;
        if (str == null || str.length() == 0) {
            arrayList = null;
        } else {
            arrayList = C75466g.m132343a(str);
        }
        ArrayList arrayList2 = new ArrayList();
        List<String> f = m144436f();
        if (f != null) {
            arrayList2.addAll(f);
        }
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: a */
    public final boolean mo128844a(Effect effect) {
        C89219l.m154721d(effect, "");
        if (TextUtils.equals(mo128851d(), "qrcode") || !C72847c.m128636c(effect) || C76086b.m133424a(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m144434a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84011c
    /* renamed from: a */
    public final void mo128843a(String str, AbstractC89172b<? super Effect, C89391z> bVar) {
        boolean z;
        C89219l.m154721d(bVar, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<String> a = !z ? C75466g.m132343a(str) : null;
        ArrayList arrayList = new ArrayList();
        List<String> f = m144436f();
        if (f != null) {
            arrayList.addAll(f);
        }
        if (a != null) {
            arrayList.addAll(a);
        }
        if (arrayList.isEmpty()) {
            bVar.invoke(null);
            return;
        }
        arrayList.get(0);
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            arrayList.get(i);
        }
        C75346e.m132158a(this.f187459d, arrayList, m144437g(), new C83978b(this, bVar));
    }

    /* renamed from: a */
    public final void mo128849a(EffectListResponse effectListResponse, StringBuilder sb) {
        String unzipPath;
        AbstractC14333c cVar;
        this.f187459d.mo128895C().mo128856a(effectListResponse.getUrlPrefix());
        Effect effect = this.f187457b.invoke().f187465c;
        List<Effect> g = C89070n.m154585g((Collection) effectListResponse.getData());
        if (!g.isEmpty() && !TextUtils.equals(mo128851d(), "qrcode") && C72847c.m128636c((Effect) C89070n.m154579f((List) g)) && !C76086b.m133424a((Effect) C89070n.m154579f((List) g))) {
            g.remove(0);
        }
        if (g.isEmpty()) {
            effectListResponse.setData(g);
            return;
        }
        if (C13617h.m24466b(effectListResponse.getCollection())) {
            C75346e.m132157a(this.f187459d, effectListResponse.getCollection());
        }
        Iterator<Effect> it = g.iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            String parentId = it.next().getParentId();
            if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                it.remove();
            }
        }
        String sb2 = sb.toString();
        String str = "";
        C89219l.m154716b(sb2, str);
        if (!TextUtils.isEmpty(m144434a(this.f187458c.getIntent(), "event_shoot_event_track"))) {
            C39162r.m79460a("auto_prop_show", new C84425b().mo129406a("prop_id", sb2).mo129406a("creation_id", this.f187460e.f155830o).mo129406a("shoot_way", "direct_shoot").f188764a);
        } else {
            C39162r.m79460a("reuse_prop_release", new C84425b().mo129406a("prop_id", sb2).f188764a);
        }
        Effect effect2 = (Effect) C89070n.m154579f((List) g);
        if (mo128851d().equals("draft")) {
            effect = effect2;
        }
        boolean z = true;
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && this.f187460e.f155817b.mo109889b() && C63244g.m114602a().mo73255A().mo93903b()) {
            this.f187459d.mo23167t().mo119291c().mo119461g().mo119442a(str, g);
            if (!g.isEmpty()) {
                effect = (Effect) C89070n.m154579f((List) g);
                this.f187460e.f155761V = effect.getEffectId();
                FaceStickerBean.sCurPropSource = "duet";
                if (C75466g.m132337A(effect) && (cVar = (AbstractC14333c) ApiCenter.C2545a.m7450a(this.f187458c).mo7015b(AbstractC14333c.class)) != null) {
                    cVar.mo23139a(true);
                }
            } else {
                return;
            }
        }
        Boolean bool = this.f187460e.f155760U;
        C89219l.m154716b(bool, str);
        if (bool.booleanValue()) {
            this.f187459d.mo128909f(true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        AbstractC84089j jVar = this.f187459d;
        if (effect == null) {
            z = false;
        }
        C75346e.m132159a(jVar, g, true, z, null, 0, null, 504);
        effectListResponse.setData(g);
        if (effect2 == null) {
            C89219l.m154715b();
        }
        if (!(effect == null || (unzipPath = effect.getUnzipPath()) == null)) {
            str = unzipPath;
        }
        effect2.setUnzipPath(str);
        mo128850b(effect2);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.c$a */
    public static final class C83977a {

        /* renamed from: a */
        public final String f187463a;

        /* renamed from: b */
        public final String f187464b;

        /* renamed from: c */
        public final Effect f187465c;

        /* renamed from: d */
        public final List<String> f187466d;

        /* renamed from: e */
        public final boolean f187467e;

        static {
            Covode.recordClassIndex(97870);
        }

        public C83977a(String str, String str2, Effect effect, List<String> list, boolean z) {
            this.f187463a = str;
            this.f187464b = str2;
            this.f187465c = effect;
            this.f187466d = list;
            this.f187467e = z;
        }
    }

    public C83976c(AbstractC89171a<C83977a> aVar, ActivityC0218d dVar, AbstractC84089j jVar, ShortVideoContext shortVideoContext, C71922a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(aVar2, "");
        this.f187457b = aVar;
        this.f187458c = dVar;
        this.f187459d = jVar;
        this.f187460e = shortVideoContext;
        this.f187462g = aVar2;
        this.f187456a = new SafeHandler(dVar);
    }
}
