package com.bytedance.android.p126a.p127a;

import android.content.Context;
import com.bytedance.android.p126a.p127a.p128a.AbstractC2612a;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2637a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2638b;
import com.bytedance.android.p126a.p127a.p135h.C2644e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.d */
public abstract class AbstractC2623d implements AbstractC2638b {
    static {
        Covode.recordClassIndex(3011);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7131a(Context context, C2633a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7132a(AbstractC2612a aVar);

    /* renamed from: a */
    public abstract void mo7133a(C2633a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7134a(AbstractC2632f fVar);

    /* renamed from: a */
    public abstract void mo7135a(AbstractC2637a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7136a(ExecutorService executorService);

    /* renamed from: a */
    public abstract boolean mo7137a();

    /* renamed from: b */
    public abstract boolean mo7138b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7139c();

    /* renamed from: com.bytedance.android.a.a.d$a */
    public static class C2624a {

        /* renamed from: a */
        public C2633a f7872a;

        /* renamed from: b */
        public AbstractC2612a f7873b;

        /* renamed from: c */
        public AbstractC2632f f7874c;

        /* renamed from: d */
        private Context f7875d;

        /* renamed from: e */
        private ExecutorService f7876e;

        /* renamed from: f */
        private Map<String, AbstractC2637a> f7877f;

        /* renamed from: g */
        private AbstractC2636g f7878g;

        static {
            Covode.recordClassIndex(3012);
        }

        /* renamed from: a */
        public final void mo7141a() {
            if (!C2628e.m7607d().mo7137a()) {
                C2628e.m7607d().mo7131a(this.f7875d, this.f7872a);
                C2628e.m7607d().mo7132a(this.f7873b);
                C2628e.m7607d().mo7134a(this.f7874c);
                C2628e.m7607d().f7912i = this.f7878g;
                C2628e.m7607d().mo7136a(this.f7876e);
                for (Map.Entry<String, AbstractC2637a> entry : this.f7877f.entrySet()) {
                    C2628e.m7607d().mo7135a(entry.getValue());
                }
                C2644e eVar = C2644e.f7932a;
                Context applicationContext = this.f7875d.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                eVar.mo7161a(applicationContext);
                C2628e.m7607d().mo7139c();
            }
        }

        private C2624a(Context context) {
            this.f7875d = context;
        }

        /* renamed from: a */
        public final C2624a mo7140a(AbstractC2637a aVar) {
            if (aVar != null) {
                if (this.f7877f == null) {
                    this.f7877f = new HashMap();
                }
                this.f7877f.put(aVar.mo7156b(), aVar);
            }
            return this;
        }

        /* synthetic */ C2624a(Context context, byte b) {
            this(context);
        }
    }

    /* renamed from: a */
    public static C2624a m7590a(Context context) {
        return new C2624a(context, (byte) 0);
    }
}
