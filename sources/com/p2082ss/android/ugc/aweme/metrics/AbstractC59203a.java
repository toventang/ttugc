package com.p2082ss.android.ugc.aweme.metrics;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59203a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.metrics.a */
public abstract class AbstractC59203a<E extends AbstractC59203a<E>> extends AbstractC59242h<E> {

    /* renamed from: a */
    public String f134744a;

    /* renamed from: b */
    public boolean f134745b;

    /* renamed from: c */
    public String f134746c;

    /* renamed from: d */
    public int f134747d = -1;

    static {
        Covode.recordClassIndex(69566);
    }

    /* renamed from: b */
    public final E mo96742b() {
        this.f134745b = true;
        return this;
    }

    /* renamed from: c */
    public final E mo96744c() {
        this.f134747d = 0;
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h, com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: d */
    public final void mo96745d() {
        super.mo96745d();
        String str = this.f135169h;
        boolean z = this.f134745b;
        String str2 = this.f134746c;
        if (TextUtils.equals("general_search", str) && !z) {
            str2 = "click_search_result_video";
        }
        if (!TextUtils.isEmpty(this.f134744a)) {
            mo96790a("search_keyword", this.f134744a, AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96790a("enter_method", str2, AbstractC59233c.AbstractC59234a.f135177a);
        int i = this.f134747d;
        if (i != -1) {
            mo96790a("is_fullscreen", String.valueOf(i), AbstractC59233c.AbstractC59234a.f135177a);
        }
    }

    /* renamed from: a */
    public final E mo96741a(String str) {
        this.f134746c = str;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC59203a(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }

    /* renamed from: b */
    public final E mo96743b(String str) {
        C89219l.m154721d(str, "");
        this.f135175n = str;
        return this;
    }

    /* renamed from: a */
    public final E mo96740a(Context context) {
        String str;
        if (context == null) {
            return this;
        }
        C49812b a = FeedParamProvider.C49809a.m93270a(context);
        if (a != null) {
            str = a.getSearchKeyword();
        } else {
            str = null;
        }
        this.f134744a = str;
        return this;
    }
}
