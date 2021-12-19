package com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;

/* renamed from: com.ss.android.ugc.aweme.base.api.a.b.a */
public class C34485a extends C34480a {

    /* renamed from: d */
    private static C27910f f81465d;

    /* renamed from: a */
    protected String f81466a;

    /* renamed from: b */
    protected String f81467b;

    /* renamed from: c */
    protected String f81468c;

    /* renamed from: e */
    private Object f81469e;

    /* renamed from: f */
    private int f81470f;

    static {
        Covode.recordClassIndex(41440);
    }

    public int getBlockCode() {
        return this.f81470f;
    }

    public String getErrorMsg() {
        return this.f81466a;
    }

    public String getPrompt() {
        return this.f81467b;
    }

    public Object getRawResponse() {
        return this.f81469e;
    }

    public String getUrl() {
        return this.f81468c;
    }

    public String getResponse() {
        return convertResponseToString();
    }

    public String convertResponseToString() {
        Object obj = this.f81469e;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (f81465d == null) {
            f81465d = new C27910f();
        }
        String b = f81465d.mo46674b(this.f81469e);
        this.f81469e = b;
        return b;
    }

    public C34485a(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.f81470f = i;
    }

    public C34485a setErrorMsg(String str) {
        this.f81466a = str;
        return this;
    }

    public C34485a setPrompt(String str) {
        this.f81467b = str;
        return this;
    }

    public C34485a setResponse(Object obj) {
        this.f81469e = obj;
        return this;
    }

    public C34485a setUrl(String str) {
        this.f81468c = str;
        return this;
    }

    public C34485a setResponse(String str) {
        this.f81469e = str;
        return this;
    }
}
