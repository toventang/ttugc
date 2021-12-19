package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.j */
public final class C62797j implements AbstractC62769c {

    /* renamed from: f */
    public static final C62798a f142383f = new C62798a((byte) 0);

    /* renamed from: a */
    public C62772f f142384a;

    /* renamed from: b */
    public boolean f142385b;

    /* renamed from: c */
    public final List<AbstractC62804l> f142386c = new ArrayList();

    /* renamed from: d */
    public boolean f142387d;

    /* renamed from: e */
    public final Object f142388e = new Object();

    /* renamed from: g */
    private String f142389g = "";

    /* renamed from: h */
    private List<String> f142390h = C89086z.INSTANCE;

    /* renamed from: i */
    private String f142391i = "";

    /* renamed from: j */
    private final Keva f142392j = Keva.getRepo("pendant_lottie_keva");

    /* renamed from: k */
    private String f142393k;

    static {
        Covode.recordClassIndex(73620);
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.j$a */
    public static final class C62798a {
        static {
            Covode.recordClassIndex(73621);
        }

        private C62798a() {
        }

        public /* synthetic */ C62798a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.j$b */
    static final class CallableC62799b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C62797j f142394a;

        static {
            Covode.recordClassIndex(73622);
        }

        CallableC62799b(C62797j jVar) {
            this.f142394a = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            C62772f fVar = this.f142394a.f142384a;
            if (fVar != null) {
                z = fVar.mo100757f();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: a */
    public final String mo100740a() {
        if (this.f142385b) {
            C62772f fVar = this.f142384a;
            if (fVar != null) {
                return fVar.mo100755d();
            }
            return null;
        }
        throw new Throwable("HAS NOT inited");
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: b */
    public final void mo100744b() {
        if (this.f142393k == null) {
            this.f142393k = this.f142392j.getString("previous_activity_id", "");
        }
        String str = this.f142393k;
        if (str == null) {
            C89219l.m154715b();
        }
        new C62772f("newpendant", str, this.f142390h, this.f142391i).mo100756e();
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.j$c */
    static final class C62800c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C62797j f142395a;

        /* renamed from: b */
        final /* synthetic */ Context f142396b;

        static {
            Covode.recordClassIndex(73623);
        }

        C62800c(C62797j jVar, Context context) {
            this.f142395a = jVar;
            this.f142396b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.j$c$a */
        public static final class C62801a implements AbstractC62804l {

            /* renamed from: a */
            final /* synthetic */ C62800c f142397a;

            static {
                Covode.recordClassIndex(73624);
            }

            @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
            /* renamed from: a */
            public final void mo100763a() {
                MethodCollector.m26663i(7165);
                this.f142397a.f142395a.f142387d = false;
                synchronized (this.f142397a.f142395a.f142388e) {
                    try {
                        Iterator<T> it = this.f142397a.f142395a.f142386c.iterator();
                        while (it.hasNext()) {
                            it.next().mo100763a();
                        }
                        this.f142397a.f142395a.f142386c.clear();
                    } finally {
                        MethodCollector.m26664o(7165);
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
            /* renamed from: b */
            public final void mo100764b() {
                MethodCollector.m26663i(7167);
                this.f142397a.f142395a.f142387d = false;
                synchronized (this.f142397a.f142395a.f142388e) {
                    try {
                        Iterator<T> it = this.f142397a.f142395a.f142386c.iterator();
                        while (it.hasNext()) {
                            it.next().mo100764b();
                        }
                        this.f142397a.f142395a.f142386c.clear();
                    } finally {
                        MethodCollector.m26664o(7167);
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C62801a(C62800c cVar) {
                this.f142397a = cVar;
            }
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            Object d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            if (((Boolean) d).booleanValue()) {
                this.f142395a.f142387d = false;
                for (AbstractC62804l lVar : this.f142395a.f142386c) {
                    lVar.mo100763a();
                }
                this.f142395a.f142386c.clear();
            } else {
                C62801a aVar = new C62801a(this);
                C62772f fVar = this.f142395a.f142384a;
                if (fVar != null) {
                    fVar.mo100752a(this.f142396b, aVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: a */
    public final InputStream mo100739a(int i) {
        if (this.f142385b) {
            C62772f fVar = this.f142384a;
            if (fVar == null) {
                return null;
            }
            String str = "new_year_normal_button";
            if (i != 0) {
                if (i == 1) {
                    str = "new_year_normal_button_collapsed";
                } else if (i == 2) {
                    str = "campagin_reward_lottie";
                } else if (i == 3) {
                    str = "coin2";
                }
            }
            return fVar.mo100749a(str);
        }
        throw new Throwable("HAS NOT inited");
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: a */
    public final void mo100741a(Context context) {
        C89219l.m154721d(context, "");
        if (!this.f142385b) {
            throw new Throwable("HAS NOT inited");
        } else if (!this.f142387d) {
            this.f142387d = true;
            C1731i.m5640b(new CallableC62799b(this), C1731i.f5562a).mo5534a(new C62800c(this, context), C1731i.f5564c, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: a */
    public final void mo100742a(AbstractC62804l lVar) {
        MethodCollector.m26663i(7179);
        C89219l.m154721d(lVar, "");
        synchronized (this.f142388e) {
            try {
                this.f142386c.add(lVar);
            } finally {
                MethodCollector.m26664o(7179);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62769c
    /* renamed from: a */
    public final void mo100743a(String str, List<String> list, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str2, "");
        if (!this.f142385b) {
            if (TextUtils.isEmpty(str)) {
                str = "default_activity";
            }
            this.f142389g = str;
            this.f142390h = list;
            this.f142391i = str2;
            this.f142385b = true;
            this.f142392j.storeString("previous_activity_id", str);
            this.f142384a = new C62772f("newpendant", this.f142389g, list, str2);
            String string = this.f142392j.getString("previous_activity_id", "");
            this.f142393k = string;
            if (!TextUtils.isEmpty(string) && !TextUtils.equals(str, this.f142393k)) {
                mo100744b();
            }
        }
    }
}
