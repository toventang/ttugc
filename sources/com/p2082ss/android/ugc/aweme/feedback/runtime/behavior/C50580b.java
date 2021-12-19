package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.feedback.reply.C50571a;
import com.p2082ss.android.ugc.aweme.feedback.reply.CallableC50572b;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50585b;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50587c;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50589d;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50590e;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50592f;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50593g;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50595h;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50615j;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50618k;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50621l;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50623m;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50629o;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C50630p;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b */
public final class C50580b implements IRuntimeBehaviorService {

    /* renamed from: a */
    public static C50580b f116886a = C50582b.f116889a;

    /* renamed from: b */
    public static final List<AbstractC50584a> f116887b = C89070n.m154522b(new C50587c(), new C50630p(), new C50629o(), new C50585b(), new C50592f(), new C50595h(), new C50615j(), new C50618k(), new C50621l(), new C50590e(), new C50593g(), new C50589d(), new C50623m());

    /* renamed from: c */
    public static final C50581a f116888c = new C50581a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$a */
    public static final class C50581a {
        static {
            Covode.recordClassIndex(59732);
        }

        private C50581a() {
        }

        public /* synthetic */ C50581a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$b */
    static final class C50582b {

        /* renamed from: a */
        static final C50580b f116889a = new C50580b((byte) 0);

        /* renamed from: b */
        public static final C50582b f116890b = new C50582b();

        private C50582b() {
        }

        static {
            Covode.recordClassIndex(59733);
        }
    }

    private C50580b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$c */
    public static final class CallableC50583c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C50580b f116891a;

        /* renamed from: b */
        final /* synthetic */ String f116892b;

        /* renamed from: c */
        final /* synthetic */ String f116893c;

        /* renamed from: d */
        final /* synthetic */ long f116894d;

        /* renamed from: e */
        final /* synthetic */ AbstractC50584a f116895e;

        static {
            Covode.recordClassIndex(59734);
        }

        CallableC50583c(C50580b bVar, String str, String str2, long j, AbstractC50584a aVar) {
            this.f116891a = bVar;
            this.f116892b = str;
            this.f116893c = str2;
            this.f116894d = j;
            this.f116895e = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C67212c cVar = new C67212c(this.f116892b, this.f116894d, this.f116893c);
            C50577a aVar = C50577a.f116881b;
            C89219l.m154721d(cVar, "");
            aVar.f116883a.mo106099i().mo106101a(cVar);
            String str = this.f116892b;
            C50577a aVar2 = C50577a.f116881b;
            C89219l.m154721d(str, "");
            aVar2.f116883a.mo106099i().mo106102b(str, this.f116894d - this.f116895e.mo85930b());
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: b */
    public final Map<String, String> mo85868b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC50584a aVar : f116887b) {
            String c = aVar.mo85931c();
            if (!TextUtils.isEmpty(c)) {
                linkedHashMap.put(aVar.mo85928a(), c);
            }
        }
        C73991bj.m130128a("RuntimeBehaviorManager loadResultSize:" + linkedHashMap.size());
        return linkedHashMap;
    }

    static {
        Covode.recordClassIndex(59731);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final boolean mo85867a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean feedbackRecordEnable = iESSettingsProxy.getFeedbackRecordEnable();
            C89219l.m154716b(feedbackRecordEnable, "");
            return feedbackRecordEnable.booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    public /* synthetic */ C50580b(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85865a(String str) {
        C89219l.m154721d(str, "");
        mo85866a(str, "");
    }

    /* renamed from: b */
    private static AbstractC50584a m94819b(String str) {
        for (AbstractC50584a aVar : f116887b) {
            if (aVar.mo85929a(str)) {
                return aVar;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85864a(Context context) {
        C89219l.m154721d(context, "");
        C50571a aVar = new C50571a(context);
        if (aVar.f116869a != null) {
            C1731i.m5640b(new CallableC50572b(aVar), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static List<C67212c> m94818a(String str, long j) {
        C89219l.m154721d(str, "");
        C50577a aVar = C50577a.f116881b;
        C89219l.m154721d(str, "");
        return aVar.f116883a.mo106099i().mo106100a(str, j);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    /* renamed from: a */
    public final void mo85866a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (mo85867a()) {
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC50584a b = m94819b(str);
            if (b != null) {
                C1731i.m5640b(new CallableC50583c(this, str, str2, currentTimeMillis, b), C1731i.f5562a);
                return;
            }
            throw new RuntimeException(str + " is not support type,please check your code or call zhaoxuan.li");
        }
    }
}
