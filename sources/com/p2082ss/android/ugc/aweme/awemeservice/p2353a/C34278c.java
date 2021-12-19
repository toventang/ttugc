package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.c */
public final class C34278c implements AbstractC34277b<String> {

    /* renamed from: a */
    private Map<String, Aweme> f81053a = new HashMap();

    static {
        Covode.recordClassIndex(41219);
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: a */
    public final Collection<Aweme> mo60700a() {
        return this.f81053a.values();
    }

    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: b */
    public final void mo60702b() {
        this.f81053a.clear();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: a */
    public final /* synthetic */ Aweme mo60699a(String str) {
        return this.f81053a.get(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: b */
    public final /* synthetic */ boolean mo60703b(String str) {
        return this.f81053a.containsKey(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
    /* renamed from: a */
    public final /* synthetic */ void mo60701a(String str, Aweme aweme) {
        this.f81053a.put(str, aweme);
    }
}
