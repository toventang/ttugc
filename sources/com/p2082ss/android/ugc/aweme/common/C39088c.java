package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;

/* renamed from: com.ss.android.ugc.aweme.common.c */
public class C39088c<T extends AbstractC39085b, K extends AbstractC39144m> implements AbstractC39159o {

    /* renamed from: h */
    public T f92286h;

    /* renamed from: i */
    public K f92287i;

    /* renamed from: j */
    public boolean f92288j = true;

    static {
        Covode.recordClassIndex(46704);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public void mo57526a_(Exception exc) {
    }

    /* renamed from: b */
    public void mo57527b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public void mo57528c() {
    }

    public void ck_() {
        this.f92287i = null;
        mo67840h();
    }

    /* renamed from: i */
    public final boolean mo67841i() {
        if (this.f92287i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo67840h() {
        T t = this.f92286h;
        if (t != null) {
            t.clearNotifyListener(this);
            this.f92286h = null;
        }
    }

    /* renamed from: j */
    public final boolean mo67842j() {
        T t = this.f92286h;
        if (t == null || !t.mIsLoading) {
            return false;
        }
        return true;
    }

    /* renamed from: a_ */
    public void mo67839a_(K k) {
        this.f92287i = k;
    }

    /* renamed from: a */
    public void mo67838a(T t) {
        this.f92286h = t;
        t.addNotifyListener(this);
    }

    /* renamed from: a */
    public boolean mo57616a(Object... objArr) {
        if (this.f92286h == null || ((mo67842j() && this.f92288j) || !this.f92286h.sendRequest(objArr))) {
            return false;
        }
        mo57527b();
        return true;
    }
}
