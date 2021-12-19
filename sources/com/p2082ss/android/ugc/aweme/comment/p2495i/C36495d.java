package com.p2082ss.android.ugc.aweme.comment.p2495i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36495d;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.i.d */
public class C36495d<T extends C36495d> implements Serializable {
    private static final long serialVersionUID = 9148864135191458444L;

    /* renamed from: a */
    protected String f86362a;

    /* renamed from: b */
    protected String f86363b;

    /* renamed from: c */
    protected String f86364c;

    static {
        Covode.recordClassIndex(43798);
    }

    public String getAid() {
        return this.f86363b;
    }

    public String getAuthorUid() {
        return this.f86364c;
    }

    public String getCid() {
        return this.f86362a;
    }

    public C36495d setAid(String str) {
        this.f86363b = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.f86364c = str;
        return this;
    }

    public C36495d setCid(String str) {
        this.f86362a = str;
        return this;
    }

    public C36495d(String str) {
        this.f86363b = str;
    }
}
