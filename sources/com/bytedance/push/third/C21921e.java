package com.bytedance.push.third;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1600k.AbstractC21859e;
import com.bytedance.push.third.p1602a.C21916b;

/* renamed from: com.bytedance.push.third.e */
public final class C21921e extends AbstractC21859e<AbstractC21919c> implements AbstractC21919c {

    /* renamed from: a */
    private int f51903a;

    /* renamed from: b */
    private String f51904b;

    /* renamed from: c */
    private boolean f51905c;

    /* renamed from: d */
    private boolean f51906d;

    /* renamed from: e */
    private AbstractC21918b f51907e;

    /* renamed from: f */
    private String f51908f;

    /* renamed from: g */
    private C21916b f51909g;

    static {
        Covode.recordClassIndex(25586);
    }

    @Override // com.bytedance.push.third.AbstractC21919c
    /* renamed from: b */
    public final AbstractC21918b mo35681b() {
        return this.f51907e;
    }

    @Override // com.bytedance.push.third.AbstractC21919c
    /* renamed from: c */
    public final String mo35682c() {
        return this.f51904b;
    }

    @Override // com.bytedance.push.third.AbstractC21919c
    /* renamed from: d */
    public final String mo35683d() {
        return this.f51908f;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public AbstractC21919c mo35536e() {
        if (C13627m.m24498a(this.f51904b)) {
            return this;
        }
        try {
            Object newInstance = Class.forName(this.f51904b).newInstance();
            if (newInstance instanceof AbstractC21918b) {
                this.f51907e = (AbstractC21918b) newInstance;
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    @Override // com.bytedance.push.third.AbstractC21919c
    /* renamed from: a */
    public final boolean mo35680a() {
        if (!this.f51906d) {
            this.f51905c = this.f51909g.mo35679a(this.f51907e, this.f51903a);
            this.f51906d = true;
        }
        return this.f51905c;
    }

    public C21921e(int i, String str, String str2, C21916b bVar) {
        this.f51903a = i;
        this.f51904b = str;
        this.f51908f = str2;
        this.f51909g = bVar;
    }
}
