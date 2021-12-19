package com.bytedance.ttnet.diagnosis;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ttnet.diagnosis.a */
public class C22946a implements IDiagnosisRequest {

    /* renamed from: b */
    private static final String f54241b = C22946a.class.getSimpleName();

    /* renamed from: a */
    public IDiagnosisCallback f54242a;

    /* renamed from: c */
    private int f54243c;

    /* renamed from: d */
    private List<String> f54244d;

    /* renamed from: e */
    private int f54245e;

    /* renamed from: f */
    private int f54246f;

    /* renamed from: g */
    private boolean f54247g = false;

    /* renamed from: h */
    private boolean f54248h = false;

    /* renamed from: i */
    private String f54249i;

    /* renamed from: j */
    private AbstractC14644a.AbstractC14645a f54250j = new C22947a();

    /* renamed from: k */
    private AbstractC14644a f54251k;

    static {
        Covode.recordClassIndex(26859);
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void cancel() {
        MethodCollector.m26663i(5800);
        synchronized (this) {
            try {
                if (this.f54247g && !this.f54248h) {
                    this.f54251k.cancel();
                    this.f54248h = true;
                    MethodCollector.m26664o(5800);
                }
            } finally {
                MethodCollector.m26664o(5800);
            }
        }
    }

    /* renamed from: com.bytedance.ttnet.diagnosis.a$a */
    class C22947a implements AbstractC14644a.AbstractC14645a {
        static {
            Covode.recordClassIndex(26860);
        }

        C22947a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.cronet.p985a.AbstractC14644a.AbstractC14645a
        /* renamed from: a */
        public final void mo23613a(String str) {
            if (C22946a.this.f54242a != null) {
                C22946a.this.f54242a.onDiagnosisComplete(str);
            }
        }
    }

    /* renamed from: a */
    private static Class<?> m43248a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void setUserExtraInfo(String str) {
        MethodCollector.m26663i(6243);
        synchronized (this) {
            try {
                this.f54249i = str;
                doExtraCommand("extra_info", str);
            } finally {
                MethodCollector.m26664o(6243);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void start(IDiagnosisCallback iDiagnosisCallback) {
        MethodCollector.m26663i(5798);
        synchronized (this) {
            try {
                if (!this.f54247g) {
                    this.f54242a = iDiagnosisCallback;
                    this.f54251k.start();
                    this.f54247g = true;
                    String str = this.f54249i;
                    if (str != null && !str.isEmpty()) {
                        doExtraCommand("extra_info", this.f54249i);
                    }
                    MethodCollector.m26664o(5798);
                }
            } finally {
                MethodCollector.m26664o(5798);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void doExtraCommand(String str, String str2) {
        MethodCollector.m26663i(6098);
        synchronized (this) {
            try {
                if (this.f54247g) {
                    this.f54251k.doExtraCommand(str, str2);
                    MethodCollector.m26664o(6098);
                }
            } finally {
                MethodCollector.m26664o(6098);
            }
        }
    }

    public C22946a(int i, List<String> list, int i2, int i3) {
        this.f54243c = i;
        this.f54244d = list;
        this.f54245e = i2;
        this.f54246f = i3;
        if (this.f54251k == null) {
            Class<?> a = m43248a("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
            if (a != null) {
                Object newInstance = a.getDeclaredConstructor(AbstractC14644a.AbstractC14645a.class, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE).newInstance(this.f54250j, Integer.valueOf(this.f54243c), this.f54244d, Integer.valueOf(this.f54245e), Integer.valueOf(this.f54246f));
                if (newInstance instanceof AbstractC14644a) {
                    this.f54251k = (AbstractC14644a) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
        }
    }
}
