package com.bytedance.android.live.p172a.p173a.p175b;

import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.a.a.b.a */
public class C2912a extends C2908a {

    /* renamed from: a */
    private String f8664a;

    /* renamed from: b */
    private String f8665b;

    /* renamed from: c */
    private String f8666c;

    /* renamed from: d */
    private String f8667d;

    /* renamed from: e */
    private Object f8668e;

    static {
        Covode.recordClassIndex(3342);
    }

    public String getAlert() {
        return this.f8666c;
    }

    public Object getData() {
        return this.f8668e;
    }

    public String getErrorMsg() {
        return this.f8664a;
    }

    public String getExtra() {
        return this.f8667d;
    }

    public String getPrompt() {
        return this.f8665b;
    }

    @Override // com.bytedance.android.live.p172a.p173a.C2908a
    public String getMessage() {
        return " TYPE = ApiServerException, errorMsg = " + this.f8664a + " extra = " + this.f8667d + " " + super.getMessage();
    }

    public C2912a(int i) {
        super(i);
    }

    public C2912a setAlert(String str) {
        this.f8666c = str;
        return this;
    }

    public C2912a setData(Object obj) {
        this.f8668e = obj;
        return this;
    }

    public C2912a setErrorMsg(String str) {
        this.f8664a = str;
        return this;
    }

    public C2912a setExtra(String str) {
        this.f8667d = str;
        return this;
    }

    public C2912a setPrompt(String str) {
        this.f8665b = str;
        return this;
    }
}
